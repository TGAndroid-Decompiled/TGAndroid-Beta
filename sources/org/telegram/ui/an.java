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
public class an extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, qw, ma0, org.telegram.ui.Components.mj, org.telegram.ui.Components.kg, pg.b, org.telegram.ui.Components.b40, te.b {
    public static int f43706id = 22;
    public static float f43707jd = 1.4f;
    public static int f43708kd = 10;
    public static Pattern f43709ld;
    public static Pattern f43710md;
    public static Pattern f43711nd;
    public static final int[] f43712od = {org.telegram.messenger.qs.f25101y, org.telegram.messenger.qs.f25108z, org.telegram.messenger.qs.A, org.telegram.messenger.qs.B, org.telegram.messenger.qs.Z, org.telegram.messenger.qs.C0, org.telegram.messenger.qs.f25068t0, org.telegram.messenger.qs.W0, org.telegram.messenger.qs.f24982e1, org.telegram.messenger.qs.T1, org.telegram.messenger.qs.G, org.telegram.messenger.qs.f25067t, org.telegram.messenger.qs.U, org.telegram.messenger.qs.E0, org.telegram.messenger.qs.F0, org.telegram.messenger.qs.f25113z4, org.telegram.messenger.qs.f24996g3, org.telegram.messenger.qs.f25046p4, org.telegram.messenger.qs.L};
    public static boolean f43713pd = false;
    public static final Rect f43714qd = new Rect();
    public cj A0;
    public int A1;
    public fi.m3 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.ij A5;
    public int A6;
    public boolean A7;
    public String A8;
    public tk A9;
    public TLRPC.TL_channels_sendAsPeers Aa;
    public boolean Ab;
    public y8 Ac;
    public dj B0;
    public org.telegram.ui.Components.cc B1;
    public fi.m3 B2;
    public boolean B3;
    public gh B4;
    public qm B5;
    public int B6;
    public boolean B7;
    public org.telegram.messenger.ij B8;
    public boolean B9;
    public TL_account.resolvedBusinessChatLinks Ba;
    public ArrayList Bb;
    public int Bc;
    public jl C0;
    public ak C1;
    public fi.m3 C2;
    public TLRPC.User C3;
    public final SparseArray C4;
    public boolean C5;
    public boolean C6;
    public boolean C7;
    public org.telegram.messenger.ij C8;
    public float C9;
    public boolean Ca;
    public ValueAnimator Cb;
    public TLRPC.DraftMessage Cc;
    public oi D;
    public vj D0;
    public nj D1;
    public org.telegram.ui.Cells.q1 D2;
    public TLRPC.Chat D3;
    public final ArrayList D4;
    public org.telegram.messenger.ij D5;
    public final ArrayList D6;
    public int D7;
    public int D8;
    public kj D9;
    public boolean Da;
    public boolean Db;
    public boolean Dc;
    public final xe.b E;
    public boolean E0;
    public fi.g1 E1;
    public int E2;
    public ch.o0 E3;
    public int E4;
    public int E5;
    public final SparseArray[] E6;
    public int E7;
    public boolean E8;
    public org.telegram.ui.Cells.q1 E9;
    public float Ea;
    public Boolean Eb;
    public ValueAnimator Ec;
    public final xe.b F;
    public org.telegram.ui.Components.w70 F0;
    public int F1;
    public int F2;
    public boolean F3;
    public boolean F4;
    public org.telegram.messenger.ij F5;
    public final SparseArray F6;
    public boolean F7;
    public boolean F8;
    public org.telegram.ui.Components.jz F9;
    public final vf Fa;
    public boolean Fb;
    public di Fc;
    public final dh.g G;
    public TextView G0;
    public boolean G1;
    public fi.m3 G2;
    public boolean G3;
    public boolean G4;
    public boolean G5;
    public final SparseArray G6;
    public af G7;
    public String G8;
    public boolean G9;
    public final ek Ga;
    public final int[] Gb;
    public boolean Gc;
    public final int H;
    public org.telegram.ui.ActionBar.m2 H0;
    public org.telegram.ui.Components.t20 H1;
    public fi.m3 H2;
    public String H3;
    public int H4;
    public boolean H5;
    public final HashMap H6;
    public String H7;
    public tj H8;
    public boolean H9;
    public int Ha;
    public org.telegram.ui.Cells.q1 Hb;
    public int Hc;
    public final ri.f I;
    public RadialProgressView I0;
    public org.telegram.ui.ActionBar.u1 I1;
    public fi.m3 I2;
    public String I3;
    public final ArrayList I4;
    public boolean I5;
    public final SparseArray I6;
    public boolean I7;
    public org.telegram.ui.Cells.q1 I8;
    public ValueAnimator I9;
    public int Ia;
    public org.telegram.ui.Cells.q1 Ib;
    public int Ic;
    public final ri.f J;
    public final int J0;
    public fi.m3 J1;
    public org.telegram.ui.Components.zo J2;
    public int J3;
    public final HashMap J4;
    public boolean J5;
    public final a0.h J6;
    public boolean J7;
    public j4 J8;
    public ValueAnimator J9;
    public af Ja;
    public int Jb;
    public int Jc;
    public dh.c K;
    public int K0;
    public fi.m3 K1;
    public View K2;
    public int K3;
    public org.telegram.messenger.ij K4;
    public int K5;
    public final ArrayList K6;
    public int K7;
    public TextureView K8;
    public boolean K9;
    public boolean Ka;
    public boolean Kb;
    public int Kc;
    public dh.c L;
    public int L0;
    public fi.m3 L1;
    public nk L2;
    public int L3;
    public int L4;
    public int L5;
    public final SparseArray L6;
    public int L7;
    public boolean L8;
    public float L9;
    public boolean La;
    public int Lb;
    public int Lc;
    public final ri.g M;
    public int M0;
    public fi.m3 M1;
    public fi.p5 M2;
    public UndoView M3;
    public int M4;
    public TLRPC.PhotoSize M5;
    public final a0.h M6;
    public int M7;
    public final af M8;
    public float M9;
    public long Ma;
    public HashMap Mb;
    public boolean Mc;
    public dh.c N;
    public int N0;
    public fi.m3 N1;
    public org.telegram.ui.Components.de0 N2;
    public mk N3;
    public final ArrayList N4;
    public TLRPC.PhotoSize N5;
    public final a0.h N6;
    public int N7;
    public final ri.b N8;
    public int N9;
    public int Na;
    public af Nb;
    public long Nc;
    public org.telegram.ui.ActionBar.u1 O;
    public Drawable O0;
    public fi.m3 O1;
    public boolean O2;
    public org.telegram.ui.Components.cc O3;
    public af O4;
    public TLObject O5;
    public final int[] O6;
    public int O7;
    public dh.c O8;
    public int O9;
    public int Oa;
    public int Ob;
    public TLRPC.TL_messages_discussionMessage Oc;
    public boolean P;
    public Drawable P0;
    public zk P1;
    public final org.telegram.ui.Components.l9[] P2;
    public boolean P3;
    public boolean P4;
    public int P5;
    public final int[] P6;
    public int P7;
    public Bitmap P8;
    public float P9;
    public yj Pa;
    public org.telegram.ui.ActionBar.u1 Pb;
    public TLRPC.messages_Messages Pc;
    public FrameLayout Q;
    public Drawable Q0;
    public float Q1;
    public final zm[] Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public final int[] Q6;
    public boolean Q7;
    public BitmapShader Q8;
    public float Q9;
    public zj Qa;
    public int Qb;
    public boolean Qc;
    public fi.p5 R;
    public boolean R0;
    public TL_stories.TL_premium_boostsStatus R1;
    public final org.telegram.ui.ActionBar.k5[] R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public final int[] R6;
    public int R7;
    public Paint R8;
    public float R9;
    public boolean Ra;
    public int Rb;
    public sm Rc;
    public tj S;
    public int S0;
    public org.telegram.messenger.e3 S1;
    public final pm[] S2;
    public org.telegram.messenger.n6 S3;
    public int S4;
    public TLRPC.PhotoSize S5;
    public final boolean[] S6;
    public int S7;
    public Matrix S8;
    public float S9;
    public float Sa;
    public boolean Sb;
    public lm Sc;
    public jh.f T;
    public final Set T0;
    public boolean T1;
    public NumberTextView T2;
    public boolean T3;
    public ArrayList T4;
    public TLRPC.PhotoSize T5;
    public final boolean[] T6;
    public int T7;
    public Paint T8;
    public float T9;
    public int Ta;
    public int Tb;
    public bi.p7 Tc;
    public View U;
    public final Set U0;
    public ae U1;
    public int U2;
    public org.telegram.messenger.ij U3;
    public int U4;
    public TLObject U5;
    public final boolean[] U6;
    public boolean U7;
    public final Paint U8;
    public TLRPC.Document U9;
    public int Ua;
    public boolean Ub;
    public boolean Uc;
    public FrameLayout V;
    public AnimatorSet V0;
    public ImageView V1;
    public final AnimatorSet[] V2;
    public int V3;
    public HashMap V4;
    public int V5;
    public boolean V6;
    public boolean V7;
    public float V8;
    public boolean V9;
    public h6.m Va;
    public int Vb;
    public boolean Vc;
    public FrameLayout W;
    public boolean W0;
    public jj W1;
    public boolean W2;
    public org.telegram.messenger.ij W3;
    public final SparseArray W4;
    public TLRPC.WebPage W5;
    public boolean W6;
    public boolean W7;
    public boolean W8;
    public boolean W9;
    public ValueAnimator Wa;
    public int Wb;
    public float Wc;
    public final jh.l X;
    public fi.m3 X0;
    public di.u2 X1;
    public ImageView X2;
    public org.telegram.messenger.ij X3;
    public int X4;
    public ArrayList X5;
    public boolean X6;
    public int X7;
    public View X8;
    public long X9;
    public float Xa;
    public int Xb;
    public float Xc;
    public lh.f Y;
    public fi.m3 Y0;
    public org.telegram.ui.ActionBar.l0 Y1;
    public RadialProgressView Y2;
    public bi.e5 Y3;
    public final int[] Y4;
    public String Y5;
    public boolean Y6;
    public boolean Y7;
    public float Y8;
    public int Y9;
    public lk Ya;
    public CharacterStyle Yb;
    public final te.a Yc;
    public qj Z;
    public fi.m3 Z0;
    public TextView Z1;
    public ImageView Z2;
    public bi.q1 Z3;
    public int Z4;
    public m9.u Z5;
    public int Z6;
    public org.telegram.messenger.ij Z7;
    public float Z8;
    public int Z9;
    public final uk Za;
    public String Zb;
    public final te.a Zc;
    public int f43715a;
    public rj f43716a0;
    public org.telegram.ui.Components.lg f43717a1;
    public boolean f43718a2;
    public AnimatorSet f43719a3;
    public jg.m1 f43720a4;
    public boolean f43721a5;
    public TLRPC.ChatInvite f43722a6;
    public int f43723a7;
    public org.telegram.messenger.ij f43724a8;
    public Integer f43725a9;
    public int f43726aa;
    public final bl f43727ab;
    public vf.b f43728ac;
    public final te.a f43729ad;
    public boolean f43730b;
    public bi.e5 f43731b0;
    public boolean f43732b1;
    public TextView f43733b2;
    public FrameLayout f43734b3;
    public jh.e f43735b4;
    public int f43736b5;
    public ae f43737b6;
    public long f43738b7;
    public int f43739b8;
    public int f43740b9;
    public int f43741ba;
    public ArrayList f43742bb;
    public boolean f43743bc;
    public final te.a bd;
    public boolean f43744c;
    public int f43745c0;
    public uj f43746c1;
    public TextView f43747c2;
    public xj f43748c3;
    public int f43749c4;
    public int f43750c5;
    public final LongSparseIntArray f43751c6;
    public boolean f43752c7;
    public boolean f43753c8;
    public boolean f43754c9;
    public boolean f43755ca;
    public final rh f43756cb;
    public ae f43757cc;
    public final te.a f43758cd;
    public boolean d;
    public org.telegram.ui.ActionBar.p0 f43759d0;
    public lh.c f43760d1;
    public bk d2;
    public TextView f43761d3;
    public TL_account.TL_businessChatLink f43762d4;
    public boolean f43763d5;
    public boolean f43764d6;
    public long f43765d7;
    public boolean f43766d8;
    public AnimatorSet f43767d9;
    public boolean f43768da;
    public final wh f43769db;
    public boolean dc;
    public final te.a f43770dd;
    public TLRPC.Chat f43771e;
    public cr f43772e0;
    public FrameLayout f43773e1;
    public TextView f43774e2;
    public TextView f43775e3;
    public String f43776e4;
    public boolean f43777e5;
    public boolean f43778e6;
    public final ArrayList f43779e7;
    public long f43780e8;
    public org.telegram.ui.ActionBar.g1 f43781e9;
    public boolean f43782ea;
    public final ni eb;
    public boolean f43783ec;
    public final te.a f43784ed;
    public TLRPC.User f43785f;
    public org.telegram.ui.ActionBar.x f43786f0;
    public LinearLayout f43787f1;
    public org.telegram.ui.Components.m11 f43788f2;
    public tj f43789f3;
    public int f43790f4;
    public AnimatorSet f43791f5;
    public long f43792f6;
    public final Paint f43793f7;
    public String f43794f8;
    public boolean f43795f9;
    public org.telegram.ui.Components.ci fa;
    public final mm f43796fb;
    public final RectF fc;
    public final m6.n f43797fd;
    public org.telegram.ui.ActionBar.p0 f43798g0;
    public org.telegram.ui.Components.pn f43799g1;
    public kg.e f43800g2;
    public ImageView f43801g3;
    public int f43802g4;
    public final SparseIntArray f43803g5;
    public boolean f43804g6;
    public final Paint f43805g7;
    public Integer f43806g8;
    public org.telegram.ui.ActionBar.z0[] f43807g9;
    public float f43808ga;
    public final xf f43809gb;
    public org.telegram.ui.ActionBar.u1 f43810gc;
    public sh.b f43811gd;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.p0 f43812h0;
    public bi f43813h1;
    public org.telegram.ui.Components.w70 f43814h2;
    public ImageView f43815h3;
    public boolean f43816h4;
    public final SparseIntArray f43817h5;
    public boolean f43818h6;
    public final ColorMatrix h7;
    public byte[] f43819h8;
    public org.telegram.ui.ActionBar.z0 f43820h9;
    public float f43821ha;
    public final xf f43822hb;
    public long f43823hc;
    public final Rect f43824hd;
    public org.telegram.ui.ActionBar.r0 f43825i0;
    public kg.u1 f43826i1;
    public ImageView f43827i2;
    public org.telegram.ui.Components.j6 f43828i3;
    public String f43829i4;
    public boolean f43830i5;
    public boolean f43831i6;
    public final m.c3 i7;
    public int f43832i8;
    public final oj f43833i9;
    public vo f43834ia;
    public boolean f43835ib;
    public final xf f43836ic;
    public org.telegram.ui.ActionBar.r0 f43837j0;
    public kg.z f43838j1;
    public hi.l f43839j2;
    public org.telegram.ui.Components.j6 j3;
    public byte[] f43840j4;
    public boolean f43841j5;
    public long f43842j6;
    public final org.telegram.ui.ActionBar.t4 f43843j7;
    public int f43844j8;
    public kl f43845j9;
    public Animator f43846ja;
    public boolean f43847jb;
    public int f43848jc;
    public org.telegram.ui.ActionBar.r0 f43849k0;
    public jh.k f43850k1;
    public TextView f43851k2;
    public org.telegram.ui.Components.j6 f43852k3;
    public String f43853k4;
    public boolean f43854k5;
    public Long f43855k6;
    public long f43856k7;
    public ae f43857k8;
    public wj f43858k9;
    public boolean f43859ka;
    public long kb;
    public boolean f43860kc;
    public org.telegram.ui.ActionBar.r0 f43861l0;
    public ol l1;
    public lj f43862l2;
    public ij f43863l3;
    public org.telegram.messenger.ij f43864l4;
    public boolean f43865l5;
    public int f43866l6;
    public int f43867l7;
    public String f43868l8;
    public int f43869l9;
    public boolean f43870la;
    public ab.b0 f43871lb;
    public Pattern f43872lc;
    public org.telegram.ui.Components.s01 m0;
    public org.telegram.ui.Components.ln f43873m1;
    public FrameLayout f43874m2;
    public gj f43875m3;
    public org.telegram.messenger.ij f43876m4;
    public boolean f43877m5;
    public final SparseArray[] f43878m6;
    public int f43879m7;
    public org.telegram.messenger.r3 f43880m8;
    public int f43881m9;
    public an ma;
    public boolean mb;
    public org.telegram.messenger.ij f43882mc;
    public boolean f43883n;
    public org.telegram.ui.ActionBar.p0 f43884n0;
    public final ArrayList n1;
    public lj f43885n2;
    public org.telegram.ui.Cells.t0 f43886n3;
    public boolean f43887n4;
    public boolean f43888n5;
    public final SparseArray[] f43889n6;
    public final Matrix f43890n7;
    public boolean f43891n8;
    public int f43892n9;
    public float f43893na;
    public int f43894nb;
    public se f43895nc;
    public org.telegram.ui.ActionBar.r0 f43896o0;
    public ui f43897o1;
    public FrameLayout f43898o2;
    public int f43899o3;
    public ArrayList o4;
    public long f43900o5;
    public final SparseArray[] f43901o6;
    public LinearGradient f43902o7;
    public boolean f43903o8;
    public boolean f43904o9;
    public AnimatorSet f43905oa;
    public int f43906ob;
    public ArrayList f43907oc;
    public org.telegram.ui.ActionBar.x f43908p0;
    public org.telegram.ui.Components.j6 f43909p1;
    public TextView f43910p2;
    public org.telegram.ui.Components.t40 f43911p3;
    public org.telegram.messenger.ij f43912p4;
    public boolean f43913p5;
    public boolean f43914p6;
    public int f43915p7;
    public TLRPC.ChatFull f43916p8;
    public boolean f43917p9;
    public final xj f43918pa;
    public boolean f43919pb;
    public final m4.d0 f43920pc;
    public boolean f43921q0;
    public ug f43922q1;
    public org.telegram.ui.Components.lz f43923q2;
    public View f43924q3;
    public TLRPC.TL_forumTopic f43925q4;
    public boolean f43926q5;
    public int f43927q6;
    public int f43928q7;
    public TLRPC.UserFull f43929q8;
    public pl f43930q9;
    public wh.i f43931qa;
    public boolean f43932qb;
    public final jh.a f43933qc;
    public long f43934r;
    public RadialProgressView f43935r0;
    public org.telegram.ui.Components.ow0 f43936r1;
    public org.telegram.ui.Components.av0 f43937r2;
    public boolean f43938r3;
    public long f43939r4;
    public boolean f43940r5;
    public int f43941r6;
    public final Paint f43942r7;
    public org.telegram.ui.Cells.e6 f43943r8;
    public View f43944r9;
    public ch.r f43945ra;
    public a0.h f43946rb;
    public boolean f43947rc;
    public final HashMap f43948s;
    public org.telegram.ui.ActionBar.p0 f43949s0;
    public org.telegram.ui.ActionBar.p0 f43950s1;
    public fi.m3 f43951s2;
    public boolean f43952s3;
    public int f43953s4;
    public org.telegram.messenger.ij s5;
    public int f43954s6;
    public final Matrix f43955s7;
    public xw0 f43956s8;
    public boolean s9;
    public rz0 f43957sa;
    public a0.h f43958sb;
    public boolean f43959sc;
    public org.telegram.ui.ActionBar.p0 f43960t0;
    public org.telegram.ui.ActionBar.p0 f43961t1;
    public fi.m3 f43962t2;
    public boolean f43963t3;
    public TLRPC.Chat f43964t4;
    public org.telegram.messenger.ij f43965t5;
    public int t6;
    public LinearGradient f43966t7;
    public final a0.h f43967t8;
    public boolean f43968t9;
    public boolean f43969ta;
    public boolean f43970tb;
    public boolean f43971tc;
    public org.telegram.ui.ActionBar.p0 f43972u0;
    public org.telegram.ui.ActionBar.p0 f43973u1;
    public fi.m3 f43974u2;
    public AnimatorSet f43975u3;
    public boolean f43976u4;
    public org.telegram.messenger.dj f43977u5;
    public int f43978u6;
    public boolean f43979u7;
    public String f43980u8;
    public boolean f43981u9;
    public org.telegram.ui.Components.vo f43982ua;
    public boolean f43983ub;
    public long f43984uc;
    public org.telegram.ui.ActionBar.p0 f43985v0;
    public org.telegram.ui.ActionBar.p0 f43986v1;
    public boolean f43987v2;
    public ValueAnimator f43988v3;
    public boolean f43989v4;
    public org.telegram.messenger.mj f43990v5;
    public int f43991v6;
    public boolean f43992v7;
    public long f43993v8;
    public float f43994v9;
    public ym f43995va;
    public Paint f43996vb;
    public boolean f43997vc;
    public final vi f43998w;
    public ClippingImageView f43999w0;
    public org.telegram.ui.Components.yn f44000w1;
    public fi.m3 f44001w2;
    public float f44002w3;
    public boolean f44003w4;
    public org.telegram.messenger.nj f44004w5;
    public int f44005w6;
    public int f44006w7;
    public String f44007w8;
    public float f44008w9;
    public an f44009wa;
    public long f44010wb;
    public boolean wc;
    public oi f44011x;
    public org.telegram.ui.Components.dz0 f44012x0;
    public lh.h f44013x1;
    public boolean f44014x2;
    public boolean f44015x3;
    public boolean f44016x4;
    public org.telegram.messenger.ij f44017x5;
    public final ArrayList f44018x6;
    public boolean f44019x7;
    public boolean f44020x8;
    public VelocityTracker f44021x9;
    public ym f44022xa;
    public hk f44023xb;
    public boolean xc;
    public oi f44024y;
    public jh.g f44025y0;
    public boolean f44026y1;
    public fi.m3 f44027y2;
    public boolean f44028y3;
    public int f44029y4;
    public org.telegram.messenger.dj f44030y5;
    public boolean f44031y6;
    public boolean f44032y7;
    public boolean f44033y8;
    public boolean f44034y9;
    public yh.d ya;
    public boolean f44035yb;
    public boolean f44036yc;
    public aj f44037z0;
    public int f44038z1;
    public fi.m3 f44039z2;
    public boolean f44040z3;
    public int f44041z4;
    public org.telegram.messenger.dj f44042z5;
    public int f44043z6;
    public int f44044z7;
    public String f44045z8;
    public boolean z9;
    public final org.telegram.messenger.i3 f44046za;
    public boolean f44047zb;
    public boolean f44048zc;

    public an(Bundle bundle) {
        super(bundle);
        this.f43715a = 0;
        this.f43744c = false;
        this.d = false;
        this.f43948s = new HashMap();
        this.f43998w = new vi(this, new af(this, 24));
        xe.b bVar = new xe.b();
        this.E = bVar;
        xe.b bVar2 = new xe.b();
        this.F = bVar2;
        this.X = new jh.l();
        this.J0 = org.telegram.ui.ActionBar.k6.Gi;
        this.S0 = -1;
        this.T0 = Collections.newSetFromMap(new WeakHashMap());
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.n1 = new ArrayList();
        this.P2 = new org.telegram.ui.Components.l9[2];
        this.Q2 = new zm[2];
        this.R2 = new org.telegram.ui.ActionBar.k5[2];
        this.S2 = new pm[2];
        this.V2 = new AnimatorSet[2];
        this.W2 = false;
        this.f43899o3 = 500;
        this.f43762d4 = null;
        this.f43802g4 = -1;
        this.f43887n4 = true;
        this.C4 = new SparseArray();
        this.D4 = new ArrayList();
        this.I4 = new ArrayList();
        this.J4 = new HashMap();
        this.L4 = -1;
        this.M4 = 0;
        this.N4 = new ArrayList(10);
        this.T4 = new ArrayList();
        this.V4 = new HashMap();
        this.W4 = new SparseArray();
        this.Y4 = new int[1];
        this.f43803g5 = new SparseIntArray();
        this.f43817h5 = new SparseIntArray();
        this.f43913p5 = true;
        this.f43940r5 = true;
        this.G5 = true;
        this.J5 = true;
        this.f43751c6 = new LongSparseIntArray();
        this.f43866l6 = 1;
        this.f43878m6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43889n6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43901o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44018x6 = new ArrayList();
        this.f44031y6 = true;
        this.A6 = Integer.MIN_VALUE;
        this.D6 = new ArrayList();
        this.E6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.F6 = new SparseArray();
        this.G6 = new SparseArray();
        this.H6 = new HashMap();
        this.I6 = new SparseArray();
        this.J6 = new a0.h();
        this.K6 = new ArrayList();
        this.L6 = new SparseArray();
        this.M6 = new a0.h();
        this.N6 = new a0.h();
        this.O6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.P6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.Q6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.R6 = new int[2];
        this.S6 = new boolean[2];
        this.T6 = new boolean[2];
        this.U6 = new boolean[]{true, true};
        this.W6 = true;
        this.X6 = true;
        this.f43723a7 = 0;
        this.f43779e7 = new ArrayList();
        this.f43793f7 = new Paint(1);
        this.f43805g7 = new Paint(1);
        this.h7 = new ColorMatrix();
        this.i7 = new m.c3();
        this.f43843j7 = new org.telegram.ui.ActionBar.t4(0, false, false, new hj(this, 0));
        this.f43890n7 = new Matrix();
        Paint paint = new Paint(1);
        this.f43942r7 = paint;
        this.f43955s7 = new Matrix();
        this.D7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.N7 = Integer.MAX_VALUE;
        this.O7 = -1;
        this.W7 = true;
        this.f43739b8 = Integer.MAX_VALUE;
        this.f43832i8 = -1;
        this.f43844j8 = -10000;
        this.f43967t8 = new a0.h();
        this.M8 = new af(this, 28);
        ri.b bVar3 = new ri.b();
        this.N8 = bVar3;
        this.O8 = new dh.c(bVar3, bVar3, bVar3);
        this.U8 = new Paint(1);
        this.V8 = 0.0f;
        this.Y8 = 1.0f;
        this.Z8 = 0.0f;
        this.f43795f9 = true;
        this.f43833i9 = new oj(this);
        this.G9 = true;
        this.f43918pa = new xj(this, 0);
        this.f44046za = new org.telegram.messenger.i3(this);
        this.Fa = new vf(this, 0);
        this.Ga = new ek(this);
        this.Ia = -1;
        this.Za = new uk(this);
        this.f43727ab = new bl(this);
        this.f43756cb = new rh(this);
        this.f43769db = new wh(this);
        this.eb = new ni(this);
        this.f43796fb = new mm(this);
        this.f43809gb = new xf(this, 0);
        this.f43822hb = new xf(this, 3);
        this.Gb = new int[2];
        this.fc = new RectF();
        this.f43836ic = new xf(this, 6);
        this.f43920pc = new m4.d0(5);
        this.f43933qc = new Object();
        this.Gc = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.Yc = new te.a(0, this, xqVar, 320L, false);
        this.Zc = new te.a(1, this, xqVar, 520L, false);
        this.f43729ad = new te.a(2, this, xqVar, 520L, false);
        this.bd = new te.a(3, this, xqVar, 320L, false);
        this.f43758cd = new te.a(4, this, xqVar, 320L, false);
        this.f43770dd = new te.a(5, this, xqVar, 320L, false);
        this.f43784ed = new te.a(6, this, xqVar, 320L, false);
        xf xfVar = new xf(this, 9);
        ?? obj = new Object();
        obj.f19918b = new float[32];
        obj.f19917a = 1;
        obj.d = new te.j(obj, se.a.f54912a, 240L);
        obj.f19919c = xfVar;
        this.f43797fd = obj;
        this.f43824hd = new Rect();
        ?? obj2 = new Object();
        this.M = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.G = gVar;
            this.H = Math.max(0, org.telegram.messenger.g0.L(48.0f) - Math.min(org.telegram.messenger.g0.f22539n, org.telegram.messenger.g0.f22538m));
            ri.f fVar = new ri.f(obj2);
            this.J = fVar;
            fVar.d = gVar;
            fVar.f54479e = -3;
            fVar.f54480f = obj2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.L = cVar;
            cVar.f8710k = true;
            if (org.telegram.messenger.rc.e(262144)) {
                ri.f fVar2 = new ri.f(obj2);
                this.I = fVar2;
                fVar2.d = gVar;
                fVar2.f54479e = -2;
                fVar2.f54480f = obj2;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.K = cVar2;
                cVar2.f8710k = true;
            } else {
                this.I = null;
                this.K = this.L;
            }
        } else {
            this.G = null;
            this.H = 0;
            this.I = null;
            this.J = null;
            this.K = new dh.c(obj2, obj2, obj2);
            this.L = new dh.c(obj2, obj2, obj2);
        }
        dh.c cVar3 = new dh.c(obj2, obj2, obj2);
        this.N = cVar3;
        cVar3.f8707g = bVar;
        this.K.f8707g = bVar;
        this.L.f8707g = bVar;
        this.O8.f8707g = new xe.b();
        this.N.f8706f = bVar2;
        this.K.f8706f = bVar2;
        this.L.f8706f = bVar2;
        this.O8.f8706f = bVar2;
    }

    public static void A0(an anVar, org.telegram.ui.Cells.q1 q1Var, boolean z9, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i7;
        org.telegram.ui.Components.k60 I = org.telegram.ui.Components.k60.I(anVar, q1Var);
        org.telegram.ui.Components.jk0 jk0Var = new org.telegram.ui.Components.jk0(anVar.getParentActivity(), anVar.f44022xa);
        I.f35200p = new ge(jk0Var, 0);
        if (z9 && ((org.telegram.messenger.h0) anVar.getMessagesController().f24935x7.f24442j0.f13889b).f22774c) {
            I.c(2131231275, org.telegram.messenger.hd.M0(2131743018, null), new he(anVar, str, 6), false);
        }
        boolean z10 = true;
        I.c(2131232103, org.telegram.messenger.hd.M0(2131743153, null), new ke(anVar, jk0Var, str, 1), false);
        if (z9) {
            I.c(2131232354, org.telegram.messenger.hd.M0(2131742964, null), new he(anVar, str, 7), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i10 = anVar.currentAccount;
                long j3 = user.f27102id;
                qf qfVar = new qf(1, anVar, userArr);
                TLObject e22 = org.telegram.messenger.qp.s1(i10).e2(j3);
                boolean z11 = e22 instanceof TLRPC.User;
                if (!(e22 instanceof TLRPC.Chat) || !org.telegram.messenger.t3.V((TLRPC.Chat) e22)) {
                    z10 = false;
                }
                if (z11) {
                    i7 = 2131743547;
                } else if (z10) {
                    i7 = 2131743561;
                } else {
                    i7 = 2131743554;
                }
                I.n(e22, org.telegram.messenger.hd.M0(i7, null), qfVar);
            } else {
                I.p(13, -1, org.telegram.messenger.hd.M0(2131743199, null));
            }
        }
        jk0Var.e(I);
        jk0Var.f(q1Var, characterStyle, null, false);
        anVar.showDialog(jk0Var);
    }

    public static boolean A1(org.telegram.ui.an r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.A1(org.telegram.ui.an, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void A8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z9, boolean z10, boolean z11, boolean z12) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i7 = 6;
        if (z9) {
            menu.add(2131296496, 2131296502, 6, org.telegram.messenger.hd.M0(2131746439, null));
            i7 = 7;
        }
        if (z12) {
            menu.add(2131296496, 2131296508, i7, org.telegram.messenger.hd.M0(2131745263, null));
            i7++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, i7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131749086, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i7 + 2;
        menu.add(2131296496, 2131296497, i7 + 1, spannableStringBuilder2);
        if (z11) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131748349, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.u31(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296496, 2131296499, i10, spannableStringBuilder3);
            i10 = i7 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131744438, null));
            ?? obj = new Object();
            obj.f38751a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.vy0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(2131296496, 2131296509, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131743890, null));
            ?? obj2 = new Object();
            obj2.f38751a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.vy0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(2131296496, 2131296512, i11, spannableStringBuilder5);
        }
        if (z10) {
            menu.add(2131296496, 2131296498, i10, org.telegram.messenger.hd.M0(2131751745, null));
            i10++;
        }
        if (z9 && encryptedChat == null) {
            menu.add(2131296496, 2131296493, i10, org.telegram.messenger.hd.M0(2131750591, null));
            i10++;
        }
        menu.add(2131296496, 2131296503, i10, org.telegram.messenger.hd.M0(2131746336, null));
    }

    public static void B0(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        String str4;
        if (anVar.f43965t5 != null && i7 < arrayList.size() && anVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.ij ijVar = anVar.f43965t5;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.f23244k;
            }
            org.telegram.ui.Components.k21.T0(anVar.getParentActivity(), anVar, inputPeer, iArr[0], anVar.f43965t5.K2, str, str4, charSequence, z9, efVar, new af(anVar, 22)).f28639o0 = false;
            anVar.O7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + anVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit();
                edit.putInt("dialog_show_translate_count" + anVar.a(), i10 - 1).apply();
                anVar.vd(true);
            }
        }
    }

    public static void B1(long j3, an anVar) {
        if (bi.ea.y(anVar.currentAccount, false).p().amount < j3) {
            new bi.tc(anVar.getParentActivity(), anVar.getResourceProvider(), j3, 13, org.telegram.messenger.m5.t(anVar.a()), new af(anVar, 10), anVar.a()).show();
        } else {
            new bi.uc(anVar.getParentActivity(), anVar.resourceProvider).show();
        }
    }

    public static void C0(an anVar) {
        long j3;
        ArrayList arrayList = anVar.f44018x6;
        arrayList.add(Integer.valueOf(anVar.f43866l6));
        if (anVar.f43790f4 == 7) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(anVar.currentAccount);
            String str = anVar.I3;
            int i7 = anVar.classGuid;
            int i10 = anVar.f43749c4;
            int i11 = anVar.f43866l6;
            anVar.f43866l6 = i11 + 1;
            a10.e(i7, i10, i11, str);
        } else if (anVar.M7 != 0) {
            org.telegram.messenger.qp messagesController = anVar.getMessagesController();
            long j10 = anVar.f43842j6;
            long j11 = anVar.f43738b7;
            int i12 = anVar.M7;
            int i13 = anVar.classGuid;
            int i14 = anVar.f43790f4;
            long j12 = anVar.f43939r4;
            int i15 = anVar.A4;
            int i16 = anVar.f43866l6;
            anVar.f43866l6 = i16 + 1;
            messagesController.Y2(j10, j11, false, 30, 0, i12, true, 0, i13, 4, i14, j12, i15, i16, anVar.f43989v4);
        } else if (anVar.K7 != 0 && (!anVar.da() || anVar.K7 == anVar.f43739b8 || anVar.f43989v4)) {
            int i17 = anVar.f44044z7;
            if (i17 != 0) {
                anVar.f43738b7 = i17;
                org.telegram.messenger.qp messagesController2 = anVar.getMessagesController();
                long j13 = anVar.f43738b7;
                boolean z9 = anVar.f44019x7;
                int i18 = anVar.f44006w7;
                int i19 = anVar.K7;
                int i20 = anVar.classGuid;
                int i21 = anVar.f43790f4;
                long j14 = anVar.f43939r4;
                int i22 = anVar.A4;
                int i23 = anVar.f43866l6;
                anVar.f43866l6 = i23 + 1;
                messagesController2.Y2(j13, 0L, z9, i18, i19, 0, true, 0, i20, 3, i21, j14, i22, i23, anVar.f43989v4);
            } else {
                org.telegram.messenger.qp messagesController3 = anVar.getMessagesController();
                long j15 = anVar.f43842j6;
                long j16 = anVar.f43738b7;
                boolean z10 = anVar.f44019x7;
                int i24 = anVar.f44006w7;
                int i25 = anVar.K7;
                int i26 = anVar.classGuid;
                int i27 = anVar.f43790f4;
                long j17 = anVar.f43939r4;
                int i28 = anVar.A4;
                int i29 = anVar.f43866l6;
                anVar.f43866l6 = i29 + 1;
                messagesController3.Y2(j15, j16, z10, i24, i25, 0, true, 0, i26, 3, i27, j17, i28, i29, anVar.f43989v4);
            }
        } else if (anVar.f44032y7) {
            anVar.f43866l6++;
        } else {
            org.telegram.messenger.qp messagesController4 = anVar.getMessagesController();
            long j18 = anVar.f43842j6;
            long j19 = anVar.f43738b7;
            boolean z11 = anVar.f44019x7;
            int i30 = anVar.f44006w7;
            int i31 = anVar.K7;
            int i32 = anVar.classGuid;
            int i33 = anVar.f43790f4;
            long j20 = anVar.f43939r4;
            int i34 = anVar.A4;
            int i35 = anVar.f43866l6;
            anVar.f43866l6 = i35 + 1;
            messagesController4.Y2(j18, j19, z11, i30, i31, 0, true, 0, i32, 2, i33, j20, i34, i35, anVar.f43989v4);
        }
        int i36 = anVar.f43790f4;
        if (i36 == 0 || (i36 == 3 && anVar.c9() == anVar.getUserConfig().e())) {
            if (anVar.da() && !anVar.f43989v4) {
                return;
            }
            arrayList.add(Integer.valueOf(anVar.f43866l6));
            org.telegram.messenger.qp messagesController5 = anVar.getMessagesController();
            long j21 = anVar.f43842j6;
            long j22 = anVar.f43738b7;
            int i37 = anVar.classGuid;
            if (anVar.f43790f4 == 3) {
                j3 = 0;
            } else {
                j3 = anVar.f43939r4;
            }
            long j23 = j3;
            int i38 = anVar.A4;
            int i39 = anVar.f43866l6;
            anVar.f43866l6 = i39 + 1;
            messagesController5.Y2(j21, j22, false, 1, 0, 0, true, 0, i37, 2, 1, j23, i38, i39, anVar.f43989v4);
        }
    }

    public static void C1(org.telegram.ui.an r7, java.lang.String r8, org.telegram.messenger.ij r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.C1(org.telegram.ui.an, java.lang.String, org.telegram.messenger.ij, boolean):void");
    }

    public static boolean D0(an anVar) {
        org.telegram.messenger.ij ijVar = anVar.f43882mc;
        if (ijVar == null) {
            return false;
        }
        if (org.telegram.messenger.g0.g(ijVar.R0)) {
            new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void D1(an anVar, View view, int i7) {
        org.telegram.ui.Components.r5 r5Var;
        TLRPC.User user;
        char c10;
        tj tjVar;
        tj tjVar2;
        if (i7 != 0) {
            jg.i1 adapter = anVar.W1.getAdapter();
            if (adapter.f16799w0 != null && !adapter.f16781h0) {
                return;
            }
            int i10 = i7 - 1;
            Object J = anVar.W1.getAdapter().J(i10);
            int i11 = anVar.W1.getAdapter().X;
            int i12 = anVar.W1.getAdapter().Y;
            if (anVar.W1.getAdapter().F != null && i10 == 1) {
                anVar.Z.O0(i11, i12, anVar.W1.getAdapter().F + "@" + org.telegram.messenger.t3.K(anVar.f43771e, false) + " ", false);
            } else if (anVar.W1.getAdapter().F != null && i10 == 0) {
                anVar.Z.O0(i11, i12, a8.p0.s(new StringBuilder(), anVar.W1.getAdapter().F, " "), false);
            } else if (J instanceof kg.s1) {
                if (!anVar.getUserConfig().q()) {
                    anVar.showDialog(new ug.w0(anVar, anVar.getParentActivity(), anVar.currentAccount, true, 31, false, null));
                    return;
                }
                kg.s1 s1Var = (kg.s1) J;
                org.telegram.ui.Components.v4.X(anVar.currentAccount, Math.max(1, s1Var.a()), anVar.f43842j6, new org.telegram.messenger.voip.k(9, anVar, s1Var));
            } else {
                org.telegram.messenger.ej ejVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (anVar.f43790f4 != 0 || !anVar.s7(view)) {
                        if (view instanceof org.telegram.ui.Cells.x7) {
                            ejVar = ((org.telegram.ui.Cells.x7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.v4.X(anVar.currentAccount, 1, anVar.a(), new bi.z2(anVar, tL_document, org.telegram.messenger.ij.U(tL_document), anVar.W1.getAdapter().L(i10), ejVar, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (anVar.B3 && (tjVar2 = anVar.f43789f3) != null && tjVar2.getVisibility() == 0) {
                        anVar.zb(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.t3.K(chat, false);
                    if (K != null) {
                        anVar.Z.O0(i11, i12, a8.p0.p("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (anVar.B3 && (tjVar = anVar.f43789f3) != null && tjVar.getVisibility() == 0) {
                        anVar.zb(null, user2);
                    } else if (org.telegram.messenger.t10.n(user2) != null) {
                        anVar.Z.O0(i11, i12, "@" + org.telegram.messenger.t10.n(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(rf.b.q(org.telegram.messenger.t10.j(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.e41("" + user2.f27102id, 3, null), 0, spannableString.length(), 33);
                        anVar.Z.O0(i11, i12, spannableString, false);
                    }
                } else if (J instanceof jg.f1) {
                    if (anVar.W1.getAdapter().J != null && anVar.f43790f4 != 1) {
                        jg.f1 f1Var = (jg.f1) J;
                        org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(f1Var.f16722a, anVar.f43842j6, anVar.D5, anVar.f43864l4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = anVar.W8();
                        b10.X = f1Var.f16723b;
                        b10.R = anVar.h9();
                        b10.T = anVar.f44004w5;
                        anVar.getSendMessagesHelper().r0(b10);
                        anVar.Z.setFieldText("");
                        anVar.B9(false);
                    }
                } else if (J instanceof String) {
                    if (anVar.W1.getAdapter().J != null) {
                        if (anVar.f43790f4 == 1) {
                            org.telegram.ui.Components.v4.J(anVar.getParentActivity(), anVar.f43842j6, new ni.c(10, anVar, (String) J), anVar.f44022xa);
                            return;
                        } else if (!anVar.s7(view)) {
                            org.telegram.ui.Components.v4.X(anVar.currentAccount, 1, anVar.f43842j6, new org.telegram.messenger.voip.k(10, anVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    anVar.Z.O0(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (anVar.Z.getFieldText() != null) {
                        if (anVar.f43790f4 == 1 || !anVar.s7(view)) {
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
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44022xa);
                                    String M0 = org.telegram.messenger.hd.M0(2131745597, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                    u1Var.R = M0;
                                    if (c10 == 1) {
                                        u1Var.T = org.telegram.messenger.hd.M0(2131750474, null);
                                    } else {
                                        u1Var.T = org.telegram.messenger.hd.M0(2131749102, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar.showDialog(u1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(anVar.W1.getAdapter().R);
                                anVar.f43742bb = arrayList;
                                PhotoViewer.p1().H2(null, anVar, anVar.f44022xa);
                                PhotoViewer.p1().e2(arrayList, anVar.W1.getAdapter().M(i10), 3, false, anVar.f43756cb, anVar);
                                return;
                            }
                            org.telegram.ui.Components.v4.X(anVar.currentAccount, 1, anVar.a(), new org.telegram.messenger.voip.k(11, anVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    qf qfVar = new qf(4, anVar, (TLRPC.TL_inlineBotWebView) J);
                    if (anVar.Fb) {
                        qfVar.run();
                    } else {
                        vc1.a(anVar.getParentActivity(), new org.telegram.messenger.voip.k(12, anVar, qfVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    jj jjVar = anVar.W1;
                    if (jjVar != null && (user = jjVar.getAdapter().f16799w0) != null) {
                        anVar.Z.setFieldText("");
                        long j3 = anVar.f43842j6;
                        if (j3 == user.f27102id) {
                            anVar.f43993v8 = j3;
                            anVar.getMessagesController().A4(tL_inlineBotSwitchPM.start_param, anVar.f43785f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f27102id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", anVar.f43842j6);
                        if (anVar.getMessagesController().E(bundle, anVar, null, null)) {
                            anVar.presentFragment(new an(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.qi) {
                    String str = ((org.telegram.messenger.qi) J).f24698a;
                    qj qjVar = anVar.Z;
                    qjVar.Q();
                    qjVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            anVar.Z.O0(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = anVar.Z.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e11 = org.telegram.ui.Components.i5.e(anVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.ij.U(e11));
                            if (e11 != null) {
                                r5Var = new org.telegram.ui.Components.r5(e11, fontMetricsInt);
                            } else {
                                r5Var = new org.telegram.ui.Components.r5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(r5Var, 0, spannableString2.length(), 33);
                            anVar.Z.O0(i11, i12, spannableString2, false);
                            anVar.W1.o(false);
                        }
                    }
                    anVar.Z.O0(i11, i12, str, true);
                    anVar.W1.o(false);
                }
            }
        }
    }

    public static void E0(long j3, an anVar) {
        if (bi.ea.y(anVar.currentAccount, false).p().amount < j3) {
            new bi.tc(anVar.getParentActivity(), anVar.getResourceProvider(), j3, 13, org.telegram.messenger.m5.t(anVar.a()), new af(anVar, 10), anVar.a()).show();
        } else {
            new bi.uc(anVar.getParentActivity(), anVar.resourceProvider).show();
        }
    }

    public static void E1(an anVar, ArrayList arrayList, long j3, org.telegram.ui.Components.jk0 jk0Var, boolean z9, int i7) {
        if (z9) {
            org.telegram.messenger.gz.C(anVar.currentAccount).q0(arrayList, j3, false, false, true, i7, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.g0.i3(new bg.j0(anVar, j3, 4), 400L);
            jk0Var.dismiss();
        }
    }

    public static void F1(an anVar, long j3, long j10) {
        bi.ea.y(anVar.currentAccount, false).C(j3, j10, new bi.o5(anVar, j3, j10, 1));
    }

    public static void G0(an anVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z9, int i7) {
        org.telegram.messenger.gz.C(anVar.currentAccount).v0(tL_document, str, anVar.f43842j6, anVar.D5, anVar.f43864l4, null, anVar.B5, null, z9, i7, 0, false, obj, anVar.W8(), 0L, anVar.h9(), anVar.f44004w5);
    }

    public static void G1(an anVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ef efVar) {
        String str3;
        if (anVar.f43965t5 != null && i7 < arrayList.size() && anVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.ij ijVar = anVar.f43965t5;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.f23244k;
            }
            org.telegram.ui.Components.k21.T0(anVar.getParentActivity(), anVar, inputPeer, iArr[0], anVar.f43965t5.K2, strArr[0], str3, charSequence, z9, efVar, new af(anVar, 29)).f28639o0 = false;
            anVar.O7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + anVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit();
                edit.putInt("dialog_show_translate_count" + anVar.a(), i10 - 1).apply();
                anVar.vd(true);
            }
        }
    }

    public static Integer G8(ArrayList arrayList, int i7, int[] iArr) {
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

    public static void H1(an anVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(anVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f27071id;
        long e10 = anVar.getUserConfig().e();
        long j10 = anVar.f43842j6;
        if (e10 == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        f10.k(org.telegram.messenger.qs.f25087w, arrayList, valueOf, bool, bool);
    }

    public static void I0(an anVar) {
        if (anVar.f43863l3.getAlpha() != 0.0f && !anVar.actionBar.v() && !anVar.W9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(anVar.f43863l3.getCustomDate() * 1000);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i7, i10, i11);
            anVar.fa((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void I1(an anVar) {
        SparseArray[] sparseArrayArr = anVar.f43878m6;
        org.telegram.messenger.ij ijVar = null;
        for (int i7 = 1; i7 >= 0; i7--) {
            if (ijVar == null && sparseArrayArr[i7].size() != 0) {
                ijVar = (org.telegram.messenger.ij) anVar.E6[i7].get(sparseArrayArr[i7].keyAt(0));
            }
            sparseArrayArr[i7].clear();
            anVar.f43889n6[i7].clear();
            anVar.f43901o6[i7].clear();
        }
        if (anVar.getParentActivity() != null && ijVar != null && ((org.telegram.messenger.ij.S4(ijVar.f23244k) || ijVar.i4()) && ijVar.F0() != null)) {
            TLRPC.Document F0 = ijVar.F0();
            org.telegram.messenger.w7.G(anVar.currentAccount);
            File J = org.telegram.messenger.w7.J(F0, null, false, true);
            TLRPC.Message message = ijVar.f23244k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(ijVar.f23244k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.ij.M4(ijVar.f23244k) && !ijVar.i4()) {
                    intent.setType(ijVar.u1());
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
                anVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131745460, null)), 500);
            }
        }
        anVar.z9();
        anVar.cd(0, true);
        anVar.Cd(false);
        anVar.pd();
    }

    public static void J0(an anVar, int i7, org.telegram.messenger.ij ijVar) {
        if (i7 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f26994id = anVar.getMessagesController().q1(anVar.f43785f);
            anVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new de(anVar, 4));
            return;
        }
        org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(anVar.getUserConfig().f(), anVar.f43842j6, ijVar, anVar.f43864l4, null, null, true, 0, 0);
        g10.K = anVar.W8();
        org.telegram.messenger.gz.C(anVar.currentAccount).r0(g10);
        if (anVar.f43790f4 == 0) {
            anVar.oa(false);
        }
        anVar.B9(false);
    }

    public static void K0(an anVar) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        org.telegram.messenger.kj kjVar;
        ArrayList arrayList;
        String a02;
        anVar.f44004w5 = null;
        int i7 = anVar.Ob;
        if (i7 == 2) {
            anVar.B5 = null;
            anVar.D5 = null;
            org.telegram.messenger.mj mjVar = anVar.f43990v5;
            if (mjVar != null) {
                mjVar.f(null, null, anVar.f43842j6, null);
            }
            anVar.z8();
        } else if (i7 == 3) {
            org.telegram.messenger.mj mjVar2 = anVar.f43990v5;
            if (mjVar2 != null && !mjVar2.c() && (kjVar = anVar.f43990v5.f24026b) != null && (arrayList = kjVar.f23696e) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) anVar.f43990v5.f24026b.f23696e.get(i10);
                    if (j3 == 0) {
                        j10 = org.telegram.messenger.ij.B0(ijVar3.f23244k);
                        j3 = ijVar3.Z0();
                    } else if (j3 != ijVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44022xa);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        a02 = org.telegram.messenger.hd.a0("CancelForwardPrivate", null, 2131752583, org.telegram.messenger.hd.G(anVar.f43990v5.f24026b.f23696e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-j10));
                    if (M0 != null) {
                        a02 = org.telegram.messenger.hd.a0("CancelForwardChat", null, 2131752584, org.telegram.messenger.hd.G(anVar.f43990v5.f24026b.f23696e.size(), "MessagesBold", new Object[0]), M0.title);
                    } else {
                        return;
                    }
                }
                u1Var.T = org.telegram.messenger.g0.X2(a02);
                u1Var.R = org.telegram.messenger.hd.G(anVar.f43990v5.f24026b.f23696e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752582, null), new fe(anVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131745344, null), new fe(anVar, 7));
                anVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, anVar.getResourceProvider());
                }
            }
        } else if (i7 == 4) {
            anVar.W5 = null;
            org.telegram.messenger.mj mjVar3 = anVar.f43990v5;
            if (mjVar3 != null) {
                int i11 = anVar.currentAccount;
                org.telegram.messenger.ij ijVar4 = anVar.D5;
                if (ijVar4 == anVar.f43864l4) {
                    ijVar2 = null;
                } else {
                    ijVar2 = ijVar4;
                }
                mjVar3.e(i11, null, null, ijVar2, anVar.B5, anVar.F5);
            }
            qj qjVar = anVar.Z;
            qjVar.X2 = null;
            qjVar.Y2 = false;
            anVar.x8();
            anVar.z8();
        } else {
            if (org.telegram.messenger.t3.c0(anVar.f43771e) && !anVar.f43989v4 && (ijVar = anVar.D5) != null) {
                long c22 = org.telegram.messenger.ij.c2(anVar.currentAccount, ijVar.f23244k, true, false);
                if (c22 != 0) {
                    anVar.getMediaDataController().D(anVar.f43842j6, c22, false);
                }
            }
            anVar.cc(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void L0(an anVar, int i7) {
        org.telegram.ui.ActionBar.q4 q4Var = anVar.parentLayout;
        if (q4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 backgroundFragment = q4Var.getBackgroundFragment();
        if (backgroundFragment instanceof an) {
            an anVar2 = (an) backgroundFragment;
            if (anVar2.a() == anVar.f43842j6) {
                anVar.finishFragment();
                anVar2.l(i7, 0, true, 0, true, 0);
                return;
            }
        }
        anVar.presentFragment(qa(i7, anVar.f43842j6));
    }

    public static void L2(long j3, an anVar) {
        int i7;
        boolean z9;
        org.telegram.messenger.uv uvVar;
        if (j3 != anVar.c9()) {
            anVar.getConnectionsManager().cancelRequestsForGuid(anVar.classGuid);
            anVar.getMessagesStorage().k(anVar.classGuid);
            anVar.classGuid = ConnectionsManager.generateClassGuid();
            anVar.ob();
            anVar.f43990v5 = null;
            anVar.K7 = 0;
            anVar.D7 = -1;
            anVar.A7 = false;
            anVar.B7 = true;
            anVar.f44018x6.clear();
            if (j3 != 0) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            anVar.f43790f4 = i7;
            anVar.f43939r4 = j3;
            if (i7 == 3) {
                org.telegram.messenger.vv G1 = anVar.getMessagesController().G1();
                long b10 = anVar.b();
                ArrayList arrayList = G1.f26212j;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        uvVar = (org.telegram.messenger.uv) arrayList.get(i10);
                        if (uvVar.f25894a == b10) {
                            break;
                        }
                        i10++;
                    } else {
                        uvVar = null;
                        break;
                    }
                }
                if (uvVar != null && !uvVar.f25900i) {
                    G1.f(b10, null);
                }
            }
            anVar.J8();
            anVar.sd(true);
            ui uiVar = anVar.f43897o1;
            if (uiVar != null) {
                uiVar.n(true);
                anVar.f43897o1.b();
            }
            org.telegram.ui.Components.s01 s01Var = anVar.m0;
            if (s01Var != null) {
                s01Var.setCurrentTopic(j3);
                org.telegram.ui.Components.s01 s01Var2 = anVar.m0;
                if (anVar.f43825i0 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                s01Var2.setMenuAvailable(z9);
            }
            anVar.vd(true);
            anVar.Lc(true);
            anVar.C9(true);
            anVar.B9(true);
            qj qjVar = anVar.Z;
            if (qjVar != null) {
                qjVar.k0(false);
                anVar.Z.I1(true);
            }
            anVar.M6(true, true);
            sm smVar = anVar.Rc;
            if (smVar != null && anVar.actionBar.f27677n0) {
                smVar.k(null);
            }
        }
    }

    public static void M0(an anVar, TLRPC.ReactionCount reactionCount) {
        anVar.O7(true);
        org.telegram.ui.Components.ql0.c(anVar.getParentActivity(), anVar.currentAccount, reactionCount.reaction, anVar.f44022xa);
    }

    public static void M2(an anVar, Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.r0 m92 = anVar.m9();
        if (m92 == null) {
            return;
        }
        View view = (View) m92.getParent();
        float x10 = anVar.actionBar.getX();
        org.telegram.ui.Components.s01 s01Var = anVar.m0;
        if (s01Var != null) {
            f10 = s01Var.getProgress() * anVar.m0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        float x11 = (m92.getX() + (view.getX() + (x10 - f10))) - anVar.m0.getX();
        float y10 = (m92.getY() + (view.getY() + anVar.actionBar.getY())) - anVar.m0.getY();
        if (anVar.f43996vb == null) {
            anVar.f43996vb = new Paint(1);
        }
        anVar.f43996vb.setColor(org.telegram.ui.ActionBar.k6.r1(anVar.m0.getProgress(), anVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6)));
        canvas.drawCircle((m92.getWidth() / 2.0f) + x11, (m92.getHeight() / 2.0f) + y10, org.telegram.messenger.g0.L(23.0f), anVar.f43996vb);
        canvas.save();
        canvas.translate(x11, y10);
        m92.draw(canvas);
        canvas.restore();
    }

    public static void N0(an anVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        boolean z10;
        CharSequence charSequence2;
        org.telegram.ui.Components.d41[] d41VarArr;
        if (anVar.V5 != 0) {
            anVar.getConnectionsManager().cancelRequest(anVar.V5, true);
            anVar.V5 = 0;
            z10 = true;
        } else {
            z10 = false;
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
            if ((charSequence instanceof Spannable) && (d41VarArr = (org.telegram.ui.Components.d41[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.d41.class)) != null && d41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.d41 d41Var : d41VarArr) {
                    arrayList.add(d41Var.getURL());
                }
            }
            if (arrayList != null && anVar.X5 != null && arrayList.size() == anVar.X5.size()) {
                boolean z11 = true;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) anVar.X5.get(i7))) {
                        z11 = false;
                    }
                }
                if (z11 && !z10) {
                    return;
                }
            }
            anVar.X5 = arrayList;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                org.telegram.messenger.g0.h3(new xf(anVar, 8));
                return;
            }
        }
        if (arrayList == null) {
            org.telegram.messenger.g0.h3(new xf(anVar, 7));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (anVar.h != null && qpVar.G2 == 2) {
            org.telegram.messenger.g0.h3(new je(anVar, qpVar, charSequence, z9));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = anVar.W5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i10 = anVar.Lb + 1;
            anVar.Lb = i10;
            ag agVar = new ag(anVar, i10, getwebpagepreview, 0);
            if (anVar.Mb == null) {
                anVar.Mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) anVar.Mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                agVar.a(Boolean.TRUE, webPage2);
                return;
            }
            n6 n6Var = new n6(anVar, getwebpagepreview, agVar, 1);
            if (anVar.V5 != 0) {
                anVar.getConnectionsManager().cancelRequest(anVar.V5, true);
            }
            anVar.V5 = anVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.p5(10, anVar, n6Var));
            anVar.getConnectionsManager().bindRequestToGuid(anVar.V5, anVar.classGuid);
        }
    }

    public static void N1(an anVar) {
        int i7;
        if (anVar.a() == anVar.getUserConfig().e() && anVar.getUserConfig().q() && anVar.f44023xb == null) {
            hk hkVar = new hk(anVar, anVar, anVar.getParentActivity(), anVar.currentAccount, anVar.f44022xa);
            anVar.f44023xb = hkVar;
            hkVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
            anVar.f44023xb.setDelegate(new ik(anVar));
            anVar.f44023xb.setTop(true);
            int i10 = 0;
            anVar.f44023xb.setClipChildren(false);
            anVar.f44023xb.setClipToPadding(false);
            anVar.f44023xb.setVisibility(0);
            hk hkVar2 = anVar.f44023xb;
            if (hkVar2.getSelectedReactions().isEmpty()) {
                i7 = 2131745873;
            } else {
                i7 = 2131745872;
            }
            hkVar2.setHint(org.telegram.messenger.hd.M0(i7, null));
            anVar.l1.addView(anVar.f44023xb, c8.ha.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            anVar.f44023xb.p(null, null, true);
            anVar.f44023xb.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
            anVar.f44023xb.setScaleY(0.4f);
            anVar.f44023xb.setScaleX(0.4f);
            anVar.f44023xb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            anVar.pd();
            hk hkVar3 = anVar.f44023xb;
            float f10 = anVar.P9;
            ak akVar = anVar.C1;
            if (akVar != null) {
                i10 = akVar.getCurrentHeight();
            }
            hkVar3.setTranslationY(f10 + i10);
        }
    }

    public static void O0(an anVar, Context context, TLRPC.TL_error tL_error) {
        boolean z9;
        org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit().putLong("dialog_join_requested_time_" + anVar.f43842j6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.t3.T(anVar.f43771e) && !anVar.f43771e.megagroup) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i7 = org.telegram.ui.Components.b70.f32050q1;
            org.telegram.ui.Components.b70.J0(context, anVar, org.telegram.ui.Components.hc.a0(anVar), z9);
        }
        anVar.Yb(false, true);
    }

    public static org.telegram.ui.wq0 O1(org.telegram.ui.an r14, org.telegram.messenger.ij r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.O1(org.telegram.ui.an, org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    public static void P0(an anVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z9, ef efVar) {
        String str4;
        org.telegram.ui.Components.c21 c21Var;
        if (anVar.f43965t5 != null && i7 < arrayList.size() && anVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = anVar.getParentActivity();
            int i10 = iArr[0];
            af afVar = new af(anVar, 19);
            String[] strArr = org.telegram.ui.Components.k21.O1;
            if (parentActivity == null) {
                c21Var = null;
            } else {
                org.telegram.ui.Components.c21 c21Var2 = new org.telegram.ui.Components.c21(parentActivity, str, str4, inputPeer, i10, richMessage, afVar);
                c21Var2.R0(z9);
                c21Var2.J1 = anVar;
                c21Var2.K1 = efVar;
                if (anVar.getParentActivity() != null) {
                    anVar.showDialog(c21Var2);
                }
                c21Var = c21Var2;
            }
            c21Var.f28639o0 = false;
            anVar.O7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + anVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit();
                edit.putInt("dialog_show_translate_count" + anVar.a(), i11 - 1).apply();
                anVar.vd(true);
            }
        }
    }

    public static boolean P9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static TLRPC.TL_message Q7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26974id = message.f26974id;
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

    public static void R0(an anVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, n6 n6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f26974id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.ij(anVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer));
            anVar.getMessagesController().P1().f9971k.d(hVar, new qf(11, hVar, n6Var), anVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void S0(an anVar) {
        anVar.V7(false);
        if (!anVar.fragmentBeginToShow) {
            aj ajVar = anVar.f44037z0;
            ajVar.W1 = false;
            ajVar.X1 = 0;
            ajVar.setEmptyView(anVar.f43773e1);
            aj ajVar2 = anVar.f44037z0;
            ajVar2.W1 = true;
            ajVar2.X1 = 1;
            return;
        }
        anVar.f44037z0.setEmptyView(anVar.f43773e1);
    }

    public static void T0(an anVar, org.telegram.messenger.dj djVar, org.telegram.messenger.ij ijVar, int i7, int i10) {
        if (djVar != null) {
            ArrayList arrayList = djVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.gz.C(anVar.currentAccount).u((org.telegram.messenger.ij) arrayList.get(0), anVar, i7, i10);
                return;
            }
        }
        org.telegram.messenger.gz.C(anVar.currentAccount).u(ijVar, anVar, i7, i10);
    }

    public static void U0(an anVar, Object[] objArr, org.telegram.ui.Components.yv0 yv0Var, boolean z9, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(yv0Var.f28619c, anVar.resourceProvider);
                if (z9) {
                    i7 = 2131744845;
                } else {
                    i7 = 2131744846;
                }
                org.telegram.ui.Components.cc q10 = hcVar.q(document, org.telegram.messenger.hd.a0(null, null, i7, stickerSet.title));
                q10.f32514j = 2750;
                q10.k(true);
            }
        }
    }

    public static void V0(an anVar) {
        if (org.telegram.messenger.g0.g(anVar.f43882mc.V0)) {
            org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.resourceProvider));
        }
    }

    public static CharSequence V8(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, int[] iArr) {
        if (ijVar == null) {
            return null;
        }
        String F1 = org.telegram.messenger.qp.s1(ijVar.I1).F1(ijVar.f23244k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            return F1;
        }
        if (ijVar.U4() && !org.telegram.ui.Components.s11.j(ijVar)) {
            return ijVar.j2();
        }
        CharSequence charSequence = ijVar.f23300z;
        if (charSequence != null) {
            return charSequence;
        }
        if (djVar == null) {
            return null;
        }
        ArrayList arrayList = djVar.d;
        int size = arrayList.size();
        CharSequence charSequence2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7);
            CharSequence charSequence3 = ijVar2.f23300z;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = ijVar2.f1();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void W0(an anVar, String str) {
        if (org.telegram.messenger.qp.s1(anVar.currentAccount).L2(false)) {
            anVar.getParentActivity();
            vf.c.o(str);
            return;
        }
        org.telegram.ui.Components.v4.l0(anVar.getParentActivity(), anVar.f44022xa, str, false, new rf(anVar, str, 0));
    }

    public static ArrayList W7(ArrayList arrayList, boolean z9, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(i7);
            String str = fzVar.f22493c;
            if (str == null) {
                if (fzVar.f22491a != null) {
                    try {
                        File q02 = org.telegram.messenger.g0.q0("", z9);
                        InputStream openInputStream = org.telegram.messenger.t0.f25563b.getContentResolver().openInputStream(fzVar.f22491a);
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
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str2, ((Integer) N0.first).intValue(), fzVar.f22503o, 0, 0);
                gfVar.n(N0);
                if (i7 == arrayList.size() - 1 && charSequence != null) {
                    gfVar.f26823a = charSequence;
                }
                arrayList2.add(gfVar);
            }
        }
        return arrayList2;
    }

    public static void X0(an anVar, long j3, boolean z9) {
        if (!anVar.T4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit();
            edit.putInt("pin_" + anVar.f43842j6, ((Integer) anVar.T4.get(0)).intValue()).commit();
            anVar.T4.clear();
            anVar.V4.clear();
            anVar.X4 = 0;
            anVar.f43736b5 = 0;
            anVar.f43750c5 = 0;
            anVar.cd(0, true);
        }
        if (org.telegram.messenger.t3.p0(anVar.f43771e) && org.telegram.messenger.t3.A(anVar.currentAccount, anVar.f43771e, 24)) {
            if (j3 != 0) {
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f26696a.c(new org.telegram.messenger.vp(1, -anVar.f43771e.f26953id, j3, messagesStorage));
                anVar.getMessagesController().i0(j3, 0, anVar.getMessagesController().j1(-anVar.f43771e.f26953id));
                anVar.getMessagesController().f24870q7.s(anVar.f43771e.f26953id, j3);
            }
        } else {
            anVar.getMessagesController().X(1, anVar.f43842j6, z9);
            org.telegram.messenger.yr messagesStorage2 = anVar.getMessagesStorage();
            long j10 = anVar.f43842j6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.xp(messagesStorage2, j10, 2));
            org.telegram.messenger.k00 k00Var = anVar.getMessagesController().f24870q7;
            k00Var.getClass();
            org.telegram.messenger.g0.h3(new bi.kd((Object) k00Var, -anVar.f43842j6, true, 4));
        }
        anVar.f43751c6.put(j3, 0);
        org.telegram.ui.Components.m11 m11Var = anVar.f43788f2;
        if (m11Var != null) {
            m11Var.setAllTopicsHidden(false);
        }
        if (j3 == anVar.f43939r4) {
            anVar.M7(false, null);
            anVar.C0.O(false);
        }
    }

    public static SpannableStringBuilder X8(long j3, org.telegram.messenger.ij ijVar, boolean z9) {
        TLRPC.Chat M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z9) {
            long Z0 = ijVar.Z0();
            int i7 = ijVar.I1;
            if (j3 != Z0) {
                int i10 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(Z0));
                    if (a22 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                }
            }
        }
        String F1 = org.telegram.messenger.qp.s1(ijVar.I1).F1(ijVar.f23244k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            spannableStringBuilder.append((CharSequence) F1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = ijVar.f23300z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(ijVar.v);
        return spannableStringBuilder;
    }

    public static void Y0(an anVar, int i7) {
        if (anVar.fragmentView != null) {
            org.telegram.ui.Cells.z H8 = anVar.H8(i7, false);
            if (H8 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) H8;
                ch.p0 p0Var = q1Var.N;
                TLRPC.MessagePeerReaction L1 = q1Var.getMessageObject().L1();
                if (L1 != null && (p0Var.H || L1.big)) {
                    ch.k0.d(anVar, null, H8, null, 0.0f, 0.0f, ch.o0.d(L1.reaction), anVar.currentAccount, !L1.big ? 1 : 0);
                    ch.k0.f();
                }
                p0Var.H = false;
                org.telegram.messenger.ij ijVar = q1Var.P5;
                if (ijVar != null) {
                    ijVar.i5();
                }
            } else if (H8 instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) H8;
                ch.p0 p0Var2 = t0Var.E0;
                TLRPC.MessagePeerReaction L12 = t0Var.getMessageObject().L1();
                if (L12 != null && (p0Var2.H || L12.big)) {
                    ch.k0.d(anVar, null, H8, null, 0.0f, 0.0f, ch.o0.d(L12.reaction), anVar.currentAccount, !L12.big ? 1 : 0);
                    ch.k0.f();
                }
                p0Var2.H = false;
                org.telegram.messenger.ij ijVar2 = t0Var.P0;
                if (ijVar2 != null) {
                    ijVar2.i5();
                }
            }
        }
    }

    public static FrameLayout Y7(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f));
        bi.md mdVar = new bi.md(context, 13);
        int i10 = 3;
        mdVar.setMaxLines(3);
        mdVar.setGravity(3);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.E8, f6Var);
        mdVar.setTextSize(1, i7);
        mdVar.setMaxWidth(org.telegram.messenger.g0.L(170.0f));
        mdVar.setText(charSequence);
        if (org.telegram.messenger.hd.f22878a0) {
            i10 = 5;
        }
        frameLayout.addView(mdVar, c8.ha.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static void Z(an anVar) {
        int i7;
        String str;
        int i10;
        Activity parentActivity = anVar.getParentActivity();
        int i11 = anVar.currentAccount;
        long j3 = anVar.f43842j6;
        ym ymVar = anVar.f44022xa;
        int i12 = org.telegram.ui.Components.pn.L;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.f6) ymVar, false);
        v2Var.P(org.telegram.ui.ActionBar.k6.f27922h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624077, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i13, ymVar));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, ymVar);
        linearLayout.addView((View) imageView, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        boolean D3 = org.telegram.messenger.qp.s1(i11).D3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.k6.f27957j5;
        org.telegram.ui.ActionBar.r6.V(textView, i14, ymVar);
        textView.setTextSize(1, 20.0f);
        if (D3) {
            i7 = 2131747035;
        } else {
            i7 = 2131747036;
        }
        textView.setText(org.telegram.messenger.hd.M0(i7, null));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, i14, ymVar);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        if (D3) {
            i10 = 2131747033;
        } else {
            i10 = 2131747034;
        }
        org.telegram.messenger.k5.r(null, null, i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 12, 9, 12, 19));
        if (!D3) {
            ug.p0 p0Var = new ug.p0(parentActivity, ymVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.y2(v2Var, 1));
            p0Var.c(org.telegram.messenger.hd.M0(2131747037, null), false, false);
            linearLayout.addView(p0Var, c8.ha.t(-1, 48, 1, 0, 0, 0, 4));
        }
        v2Var.N = linearLayout;
        v2Var.show();
    }

    public static void Z0(org.telegram.ui.an r12, org.telegram.ui.sj r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Z0(org.telegram.ui.an, org.telegram.ui.sj, boolean[]):void");
    }

    public static org.telegram.messenger.ij Z1(an anVar) {
        View view = anVar.f43944r9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) view).getMessageObject();
        }
        return null;
    }

    public static bi.d3 Z4(an anVar, org.telegram.messenger.ij ijVar) {
        if (ijVar != null && !ijVar.O3() && ijVar.m4() && ijVar.f23244k.ttl == Integer.MAX_VALUE) {
            long V = anVar.getMessagesController().V(ijVar.f1(), anVar.f43842j6);
            ijVar.G0 = true;
            if (ijVar.Q3() || (!ijVar.h4() && !ijVar.T4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar);
                anVar.Xc(arrayList, true);
            }
            return new bi.d3(anVar, V, ijVar, 16);
        }
        return null;
    }

    public static void a0(an anVar, org.telegram.ui.Components.k60 k60Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) k60Var.A;
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(anVar.getParentActivity(), anVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new j2.n(16, anVar, k60Var), anVar.getResourceProvider());
        ynVar.e(anVar.f43842j6, anVar.b(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(ynVar.f40689f);
        k60Var.f35197n0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void a1(an anVar) {
        if (anVar.f43790f4 == 0 && anVar.getMessagesController().N6 > anVar.getConnectionsManager().getCurrentTime() && !b.a(anVar.currentAccount, anVar.f43785f)) {
            b.c(anVar.currentAccount, anVar.getParentActivity(), anVar.getResourceProvider());
        }
    }

    public static void b0(an anVar, int i7) {
        if (i7 != 0) {
            org.telegram.messenger.g0.h3(new qe(anVar, i7, 7));
        } else {
            anVar.actionBar.setSubtitle(org.telegram.messenger.hd.M0(2131748191, null));
        }
    }

    public static void b1(an anVar, int i7) {
        dh.g gVar = anVar.G;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                qi.a e10 = anVar.glassEngine.e();
                float L = org.telegram.messenger.g0.L(48.0f);
                float L2 = org.telegram.messenger.g0.L(48.0f);
                int i10 = 0;
                while (i10 < e10.f54060b) {
                    RectF rectF = (RectF) e10.f54059a.get(i10);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e10.d(i10);
                    } else {
                        i10++;
                    }
                }
                e10.b(anVar.f44037z0.getY(), anVar.f44037z0.getWidth(), anVar.f44037z0.getY() + anVar.f44037z0.getHeight());
                gVar.h(e10);
            }
            ol olVar = anVar.l1;
            gVar.e(olVar.f48434p0, olVar.getWidth(), anVar.l1.getHeight());
        }
    }

    public static void c0(org.telegram.ui.an r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.ij r11, org.telegram.ui.Cells.q1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.c0(org.telegram.ui.an, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.ij, org.telegram.ui.Cells.q1, int, int):void");
    }

    public static void c1(an anVar) {
        anVar.f43982ua = null;
        anVar.f44037z0.setOnInterceptTouchListener(null);
        anVar.Lb(anVar.l1, true);
        org.telegram.messenger.d4.f(anVar.currentAccount).f21956a.clear();
    }

    public static void d0(an anVar) {
        if (anVar.f43877m5) {
            anVar.f43877m5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f21265g1 == anVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void d1(an anVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.m1(anVar.getParentActivity(), anVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, anVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            anVar.presentFragment(new hl0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void d2(an anVar, float f10) {
        View view = anVar.f43944r9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).setSlidingOffset(f10);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setWalletSlidingOffset(f10);
        }
    }

    public static void e0(an anVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.qp.s1(anVar.currentAccount).Y3(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (anVar.j() != null) {
                tLObject2 = anVar.j();
            } else {
                tLObject2 = anVar.f43771e;
            }
            if (!org.telegram.messenger.ui.t(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = anVar.f43785f;
                if (user2 != null && user2.bot && user.f27102id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.p(null, 2131753104, org.telegram.ui.Components.hc.a0(anVar), null);
                } else if (user2 != null && user2.bot && user.f27102id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.p(null, 2131753107, org.telegram.ui.Components.hc.a0(anVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.k5.p(null, 2131753103, org.telegram.ui.Components.hc.a0(anVar), null);
                } else {
                    TLRPC.Chat chat = anVar.f43771e;
                    if (chat != null && !org.telegram.messenger.t3.V(chat)) {
                        org.telegram.messenger.k5.p(null, 2131753105, org.telegram.ui.Components.hc.a0(anVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = anVar.f43771e;
                    if (chat2 != null && org.telegram.messenger.t3.V(chat2)) {
                        org.telegram.messenger.k5.p(null, 2131753106, org.telegram.ui.Components.hc.a0(anVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                anVar.wa(user.f27102id, anVar.A8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(anVar.getParentActivity());
                q6Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27944ia, false));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.L5, q6Var, null);
                q6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(anVar.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.V = q6Var;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("BotRequestAttachPermission", null, 2131752996, org.telegram.messenger.t10.p(user)));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753153, null), new a1.d(anVar, user, atomicBoolean, tL_attachMenuBot, 8));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(5, anVar.getParentActivity(), anVar.getResourceProvider());
                    c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    c2Var.setMultiline(true);
                    c2Var.e(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131747779, org.telegram.messenger.t10.p(user))), "", true, false, false);
                    if (org.telegram.messenger.hd.f22878a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.hd.f22878a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var.setPadding(L, 0, L2, 0);
                    c2Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(12, c2Var, atomicBoolean));
                    u1Var.G = 6;
                    alertDialog$Builder.o(c2Var);
                }
                alertDialog$Builder.p();
            } else {
                vc1.a(anVar.getParentActivity(), new y(anVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void e2(an anVar) {
        long j3;
        vo voVar = anVar.f43834ia;
        if (voVar != null) {
            if (anVar.f43989v4) {
                if (voVar.H != null) {
                    if (anVar.getParentLayout() != null) {
                        org.telegram.ui.Components.d9.a(anVar, anVar.getParentLayout().getFragmentStack().indexOf(anVar), anVar.f43771e, anVar.f43785f, anVar.f43925q4, anVar.f43842j6, anVar.Oa, anVar.Na);
                    }
                    TLRPC.Chat chat = anVar.f43771e;
                    TLRPC.TL_forumTopic tL_forumTopic = anVar.f43834ia.H;
                    long j10 = anVar.f43842j6;
                    int i7 = anVar.Na;
                    int i10 = anVar.Oa;
                    if (anVar.getParentLayout() != null) {
                        org.telegram.ui.Components.d9.a(anVar, anVar.getParentLayout().getFragmentStack().indexOf(anVar), chat, null, tL_forumTopic, j10, i7, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", anVar.f43834ia.f50766a);
                    bundle.putInt("dialog_filter_id", anVar.f43834ia.f50768b);
                    bundle.putBoolean("pulled", true);
                    an g10 = qg.d.g(anVar, -anVar.f43842j6, anVar.f43834ia.H, 0, bundle);
                    g10.f43859ka = true;
                    f43713pd = true;
                    anVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = voVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f26953id;
            }
            if (j3 != 0) {
                anVar.H6();
                vo voVar2 = anVar.f43834ia;
                TLRPC.Chat chat3 = voVar2.G;
                long j12 = voVar2.Z;
                int i11 = voVar2.f50766a;
                int i12 = voVar2.f50768b;
                if (anVar.getParentLayout() != null) {
                    org.telegram.ui.Components.d9.a(anVar, anVar.getParentLayout().getFragmentStack().indexOf(anVar), chat3, null, null, j12, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = anVar.f43834ia.G;
                if (chat4 != null) {
                    j11 = chat4.f26953id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", anVar.f43834ia.f50766a);
                bundle2.putInt("dialog_filter_id", anVar.f43834ia.f50768b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit().remove("diditem" + anVar.f43834ia.Z).apply();
                an anVar2 = new an(bundle2);
                ArrayList arrayList = anVar.Bb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = anVar.Bb;
                    anVar2.Bb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                anVar2.f43859ka = true;
                f43713pd = true;
                anVar.presentFragment(anVar2, true);
            }
        }
    }

    public static void e5(an anVar, org.telegram.ui.Cells.q1 q1Var) {
        uh.a aVar;
        int i7;
        int i10;
        te.a aVar2 = anVar.f43729ad;
        if (anVar.Z != null && !aVar2.f55395f && q1Var.getMessageObject() != null) {
            ol olVar = anVar.l1;
            RectF rectF = org.telegram.messenger.g0.P;
            jh.k.c(q1Var, olVar, rectF);
            Rect rect = org.telegram.messenger.g0.Q;
            org.telegram.ui.Cells.w1 w1Var = q1Var.f30047w2;
            if (w1Var != null && (aVar = w1Var.f30705l) != null && w1Var.f30712s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((anVar.l1.getMeasuredHeight() - anVar.f44037z0.getPaddingBottom()) + anVar.Wc) - org.telegram.messenger.g0.L(2.0f)));
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                if (anVar.f43811gd == null) {
                    anVar.f43811gd = new sh.b(anVar.getParentActivity(), anVar.resourceProvider, anVar);
                    int indexOfChild = anVar.l1.indexOfChild(anVar.f44037z0);
                    if (indexOfChild >= 0) {
                        anVar.l1.addView(anVar.f43811gd, indexOfChild + 1, c8.ha.g());
                    } else {
                        anVar.l1.addView(anVar.f43811gd, c8.ha.g());
                    }
                }
                if (messageObject.Q3()) {
                    if (q1Var.x2()) {
                        i10 = org.telegram.ui.ActionBar.k6.f27818bc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f27910gc;
                    }
                    anVar.S0 = i10;
                } else {
                    if (q1Var.x2()) {
                        i7 = org.telegram.ui.ActionBar.k6.f27839ce;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.f27819be;
                    }
                    anVar.S0 = i7;
                }
                anVar.f43811gd.setColor(anVar.getThemedColor(anVar.S0));
                anVar.f43811gd.setCellToWatch(q1Var);
                ((te.a) anVar.f43811gd.f55191b.f8841b).a(false, false);
                anVar.f43811gd.setAnimatedVisibility(aVar2.f55394e);
                anVar.f43811gd.f55191b.setOnClickListener(new ii.g(new xf(anVar, 1), 22));
                sh.b bVar = anVar.f43811gd;
                bVar.f55197s = new xf(anVar, 2);
                org.telegram.ui.Cells.z5 z5Var = bVar.f55190a;
                z5Var.setOnKeyListener(new zf(anVar, 0));
                z5Var.setOnEditorActionListener(new fa(anVar, 1));
                anVar.Z.X4 = z5Var;
                org.telegram.messenger.g0.i3(new q8(anVar, measuredHeight, z5Var, 2), 100L);
                aVar2.a(true, true);
            }
        }
    }

    public static void f0(an anVar, int i7, int i10, int i11, int i12) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = anVar.Q6;
        int[] iArr4 = anVar.P6;
        boolean[] zArr = anVar.U6;
        int[] iArr5 = anVar.O6;
        int[] iArr6 = anVar.R6;
        boolean[] zArr2 = anVar.T6;
        ArrayList arrayList = anVar.f44018x6;
        if ((i7 - i10) - i11 <= i12 && !anVar.W6) {
            boolean[] zArr3 = anVar.S6;
            if (!zArr3[0]) {
                anVar.W6 = true;
                arrayList.add(Integer.valueOf(anVar.f43866l6));
                if (anVar.H6.size() != 0) {
                    org.telegram.messenger.qp messagesController = anVar.getMessagesController();
                    j3 = 0;
                    long j10 = anVar.f43842j6;
                    c10 = 0;
                    long j11 = anVar.f43738b7;
                    int i13 = iArr5[0];
                    boolean z9 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = anVar.classGuid;
                    int i16 = anVar.f43790f4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = anVar.f43939r4;
                    int i17 = anVar.A4;
                    int i18 = anVar.f43866l6;
                    anVar.f43866l6 = i18 + 1;
                    messagesController.Y2(j10, j11, false, 50, i13, 0, z9, i14, i15, 0, i16, j12, i17, i18, anVar.f43989v4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    org.telegram.messenger.qp messagesController2 = anVar.getMessagesController();
                    long j13 = anVar.f43842j6;
                    long j14 = anVar.f43738b7;
                    boolean z10 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = anVar.classGuid;
                    int i21 = anVar.f43790f4;
                    long j15 = anVar.f43939r4;
                    int i22 = anVar.A4;
                    int i23 = anVar.f43866l6;
                    anVar.f43866l6 = i23 + 1;
                    messagesController2.Y2(j13, j14, false, 50, 0, 0, z10, i19, i20, 0, i21, j15, i22, i23, anVar.f43989v4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (anVar.f43738b7 != 0 && !zArr3[1]) {
                    anVar.W6 = true;
                    arrayList.add(Integer.valueOf(anVar.f43866l6));
                    org.telegram.messenger.qp messagesController3 = anVar.getMessagesController();
                    long j16 = anVar.f43738b7;
                    int i24 = iArr5[1];
                    boolean z11 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = anVar.classGuid;
                    int i27 = anVar.f43790f4;
                    long j17 = anVar.f43939r4;
                    int i28 = anVar.A4;
                    int i29 = anVar.f43866l6;
                    anVar.f43866l6 = i29 + 1;
                    messagesController3.Y2(j16, 0L, false, 50, i24, 0, z11, i25, i26, 0, i27, j17, i28, i29, anVar.f43989v4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i11 > 0 && !anVar.Y7 && i10 <= 10) {
            if (anVar.f43738b7 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(anVar.f43866l6));
                org.telegram.messenger.qp messagesController4 = anVar.getMessagesController();
                long j18 = anVar.f43738b7;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = anVar.classGuid;
                int i33 = anVar.f43790f4;
                long j19 = anVar.f43939r4;
                int i34 = anVar.A4;
                int i35 = anVar.f43866l6;
                anVar.f43866l6 = i35 + 1;
                messagesController4.Y2(j18, 0L, false, 50, i30, 0, true, i31, i32, 1, i33, j19, i34, i35, anVar.f43989v4);
                anVar.Y7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(anVar.f43866l6));
                org.telegram.messenger.qp messagesController5 = anVar.getMessagesController();
                long j20 = anVar.f43842j6;
                long j21 = anVar.f43738b7;
                int i36 = iArr2[c10];
                int i37 = iArr[c10];
                int i38 = anVar.classGuid;
                int i39 = anVar.f43790f4;
                long j22 = anVar.f43939r4;
                int i40 = anVar.A4;
                int i41 = anVar.f43866l6;
                anVar.f43866l6 = i41 + 1;
                messagesController5.Y2(j20, j21, false, 50, i36, 0, true, i37, i38, 1, i39, j22, i40, i41, anVar.f43989v4);
                anVar.Y7 = true;
            }
        }
    }

    public static void f1(an anVar) {
        org.telegram.ui.Components.z20.h.a();
        anVar.showDialog(new zh.h1(anVar.getParentActivity(), anVar.currentAccount, anVar.a(), null, null));
    }

    public static void g0(org.telegram.ui.an r19, final org.telegram.ui.sy0[] r20, final org.telegram.ui.Components.k60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.g0(org.telegram.ui.an, org.telegram.ui.sy0[], org.telegram.ui.Components.k60):void");
    }

    public static void g1(an anVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        an anVar2;
        int i7;
        int i10;
        TLRPC.TL_forumTopic f10;
        jh.a aVar = anVar.f43933qc;
        if (num.intValue() != anVar.b()) {
            anVar.Qc = false;
            se seVar = anVar.f43895nc;
            if (seVar != null) {
                org.telegram.messenger.g0.r(seVar);
                anVar.f43895nc.run();
                anVar.f43895nc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.m11 m11Var = anVar.f43788f2;
            long intValue = num.intValue();
            ArrayList l10 = org.telegram.messenger.qp.s1(m11Var.f35822e).f24870q7.l(-m11Var.f35824f);
            if (l10 != null) {
                int size = l10.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = l10.get(i11);
                    i11++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f27005id == intValue) {
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
            if (message == null && tL_forumTopic != null && (f10 = anVar.getMessagesController().f24870q7.f(-anVar.a(), tL_forumTopic.f27005id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                anVar.f44010wb = SystemClock.uptimeMillis();
                anVar.F7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    anVar.rb(anVar.b());
                } else if (anVar.b() == 0) {
                    anVar.rb(num.intValue());
                } else {
                    anVar.D7 = -1;
                }
                anVar.getConnectionsManager().cancelRequestsForGuid(anVar.classGuid);
                anVar.getMessagesStorage().k(anVar.classGuid);
                anVar.classGuid = ConnectionsManager.generateClassGuid();
                anVar.ob();
                anVar.f43990v5 = null;
                anVar.K7 = 0;
                anVar.A7 = false;
                anVar.B7 = true;
                anVar.W7 = true;
                anVar.X7 = 0;
                anVar.Z7 = null;
                anVar.f44018x6.clear();
                anVar.f43744c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.ij(anVar.getCurrentAccount(), message, false, false));
                    anVar2 = anVar;
                    anVar2.Rb(arrayList, anVar.f43771e, tL_forumTopic2.f27005id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    anVar2 = anVar;
                    anVar2.f43925q4 = null;
                    anVar2.o4 = null;
                    anVar2.f43864l4 = null;
                    anVar2.D5 = null;
                    anVar2.f44029y4 = 0;
                    anVar2.f44041z4 = 0;
                    anVar2.A4 = 0;
                    anVar2.f43939r4 = 0L;
                    anVar2.f43953s4 = 0;
                    anVar2.f43964t4 = null;
                    anVar2.f43989v4 = false;
                    anVar2.f43976u4 = false;
                }
                jl jlVar = anVar2.C0;
                if (jlVar != null) {
                    if (jlVar.I >= 0 && !jlVar.N()) {
                        jl jlVar2 = anVar2.C0;
                        jlVar2.s(jlVar2.I);
                    } else {
                        jl jlVar3 = anVar2.C0;
                        if (jlVar3.I < 0 && jlVar3.N()) {
                            anVar2.C0.i(0);
                        }
                    }
                    anVar2.C0.T();
                }
                anVar2.J8();
                anVar2.sd(true);
                anVar2.f43897o1.n(true);
                if (tL_forumTopic2 != null) {
                    anVar2.yd();
                } else {
                    anVar2.f43897o1.b();
                }
                anVar2.f43788f2.setCurrentTopic(anVar2.b());
                anVar2.vd(true);
                anVar2.Lc(true);
                anVar2.getMessagesController().J4(-anVar2.a(), anVar2.b());
                anVar2.db();
                anVar2.C9(true);
                anVar2.B9(true);
                anVar2.M6(true, true);
                if (anVar2.Z != null) {
                    if (!org.telegram.messenger.t10.u(anVar2.f43785f)) {
                        anVar2.Z.k0(false);
                    }
                    anVar2.Z.I1(true);
                }
                if (tL_forumTopic2 != null) {
                    anVar2.getMessagesController().f24870q7.k(anVar2.f43842j6, tL_forumTopic2.f27005id);
                }
                if (tL_forumTopic2 != null) {
                    i7 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i7 = 0;
                }
                anVar2.f44038z1 = i7;
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i10 = 0;
                }
                anVar2.A1 = i10;
                anVar2.fd(false);
                anVar2.ed(false);
                anVar2.wd();
                sm smVar = anVar2.Rc;
                if (smVar != null && anVar2.actionBar.f27677n0) {
                    smVar.k(null);
                }
                if (org.telegram.messenger.t10.u(anVar2.f43785f)) {
                    anVar2.getMediaDataController().I0(org.telegram.messenger.xr.a(anVar2.f43842j6, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(an anVar, int i7, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        if (anVar.Lb != i7) {
            return;
        }
        if (bool.booleanValue()) {
            anVar.W5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                anVar.W5 = null;
                org.telegram.messenger.mj mjVar = anVar.f43990v5;
                if (mjVar != null) {
                    int i10 = anVar.currentAccount;
                    CharSequence fieldText = anVar.Z.getFieldText();
                    org.telegram.messenger.ij ijVar3 = anVar.D5;
                    if (ijVar3 == anVar.f43864l4) {
                        ijVar2 = null;
                    } else {
                        ijVar2 = ijVar3;
                    }
                    mjVar.e(i10, null, fieldText, ijVar2, anVar.B5, anVar.F5);
                }
                anVar.z8();
                return;
            }
            boolean z9 = webPage instanceof TLRPC.TL_webPagePending;
            if (z9) {
                anVar.Y5 = str;
            }
            if (anVar.h != null && z9) {
                webPage.url = str;
            }
            org.telegram.messenger.mj mjVar2 = anVar.f43990v5;
            if (mjVar2 != null) {
                int i11 = anVar.currentAccount;
                CharSequence fieldText2 = anVar.Z.getFieldText();
                org.telegram.messenger.ij ijVar4 = anVar.D5;
                if (ijVar4 == anVar.f43864l4) {
                    ijVar = null;
                } else {
                    ijVar = ijVar4;
                }
                mjVar2.e(i11, null, fieldText2, ijVar, anVar.B5, anVar.F5);
            }
            anVar.hc(true, anVar.W5, false);
            return;
        }
        anVar.W5 = null;
        anVar.z8();
    }

    public static void h1(an anVar, long j3, long j10, Long l10) {
        int i7;
        String str;
        if (anVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = anVar.getParentActivity();
        String M0 = org.telegram.messenger.hd.M0(2131746290, null);
        if (org.telegram.messenger.t3.p0(anVar.f43771e)) {
            i7 = 2131746294;
        } else {
            i7 = 2131746295;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i7, org.telegram.messenger.m5.t(j3)));
        if (l10.longValue() > 0) {
            str = org.telegram.messenger.hd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.v4.f0(parentActivity, M0, X2, str, org.telegram.messenger.hd.M0(2131751817, null), new rg(anVar, j3, j10, l10, 0), anVar.resourceProvider, true);
    }

    public static void i0(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.ui.b0(anVar.currentAccount).E0(false, true, null);
            anVar.wa(user.f27102id, anVar.A8, false);
        }
    }

    public static void i1(an anVar, TLRPC.TL_game tL_game, org.telegram.messenger.ij ijVar, String str, long j3) {
        anVar.pc(tL_game, ijVar, str, false, j3);
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void j0(an anVar, boolean[] zArr, Context context) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2 = anVar.D5;
        if (ijVar2 == null || !org.telegram.messenger.ij.d3(ijVar2.f23244k)) {
            boolean z9 = zArr[0];
            if (z9) {
                zArr[0] = false;
            }
            int i7 = anVar.Ob;
            if (i7 == 5) {
                int i10 = anVar.currentAccount;
                long j3 = anVar.f43842j6;
                org.telegram.messenger.nj njVar = anVar.f44004w5;
                if (njVar == null) {
                    njVar = org.telegram.messenger.nj.a();
                }
                new bi.e1(context, i10, j3, njVar, anVar, anVar.getResourceProvider(), 0, new ne(anVar, 1)).show();
            } else if (i7 == 1 && (ijVar = anVar.F5) != null) {
                if (ijVar.q5() && !z9) {
                    org.telegram.messenger.nj njVar2 = anVar.f44004w5;
                    if (njVar2 == null) {
                        njVar2 = org.telegram.messenger.nj.a();
                    }
                    anVar.wc(njVar2);
                } else if (anVar.F5.t() && anVar.E5 == 0) {
                    if (anVar.X1 == null) {
                        anVar.T7();
                    }
                    anVar.X1.w1(-1, anVar.F5);
                    anVar.xa();
                } else {
                    anVar.l(anVar.F5.f1(), 0, true, 0, true, 0);
                }
            } else if (anVar.f43990v5 != null) {
                if (i7 == 2) {
                    if (!org.telegram.messenger.m5.C(anVar.f43842j6) && !anVar.f43990v5.f24043u && anVar.f43790f4 != 5) {
                        int i11 = org.telegram.messenger.iz.f23364a;
                        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                        org.telegram.messenger.iz.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        anVar.Ca(0);
                        return;
                    }
                    org.telegram.messenger.ij ijVar3 = anVar.D5;
                    if (ijVar3 != null) {
                        anVar.l(ijVar3.f1(), 0, true, 0, true, 0);
                    }
                } else if (i7 == 3) {
                    int i12 = org.telegram.messenger.iz.f23364a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.P = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    anVar.Ca(1);
                } else if (i7 == 4) {
                    anVar.Ca(2);
                }
            }
        }
    }

    public static void j1(an anVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = anVar.getMessagesController().j1(anVar.f43842j6);
                tL_messages_getHistory.offset_date = anVar.M7 + 86400;
                tL_messages_getHistory.limit = 1;
                anVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ld(1, anVar, tLObject));
                return;
            }
            anVar.actionBar.setSubtitle(org.telegram.messenger.hd.M0(2131748191, null));
        }
    }

    public static void j2(an anVar, View view, boolean z9, float f10, float f11) {
        org.telegram.messenger.ij ijVar;
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            ijVar = q1Var.getMessageObject();
            q1Var.f29846g1 = f10;
            q1Var.f29860h1 = f11;
            org.telegram.ui.Components.i90 i90Var = q1Var.Sa;
            float f12 = q1Var.f29860h1;
            i90Var.h = q1Var.getTranslationX() + f10;
            i90Var.f34560i = f12;
            i90Var.f34563l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ijVar = ((org.telegram.ui.Cells.t0) view).getMessageObject();
        } else {
            ijVar = null;
        }
        int Y8 = anVar.Y8(ijVar);
        if ((ijVar == null || ((i10 = ijVar.D) != 30 && i10 != 18 && i10 != 25)) && Y8 >= 2 && Y8 != 20 && Y8 != 21) {
            if (ijVar == null || ((i7 = ijVar.D) != 27 && i7 != 30)) {
                if (ijVar == null || !ijVar.Y4()) {
                    if (ijVar == null || (!ijVar.s4() && !org.telegram.messenger.ij.d3(ijVar.f23244k))) {
                        anVar.J6(ijVar, z9, true);
                        anVar.Hc();
                        anVar.Cd(false);
                    }
                }
            }
        }
    }

    public static void k0(an anVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        ug.f1 f1Var = new ug.f1(anVar, anVar.currentAccount, user, null, null, anVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            f1Var.f56490v2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(anVar.getParentActivity());
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(160.0f), 4, l9Var, false);
        l9Var.setImageDrawable(g5Var);
        l9Var.addOnAttachStateChangeListener(new e5(g5Var, 1));
        g5Var.j(j3, false);
        f1Var.f56491w2 = true;
        f1Var.f56488t2 = l9Var;
        anVar.showDialog(f1Var);
    }

    public static void k1(an anVar, org.telegram.messenger.ij ijVar, Long l10, Runnable runnable) {
        bi.ea.y(anVar.currentAccount, false).j0(ijVar, l10.longValue(), runnable, false);
    }

    public static void k2(an anVar, int i7) {
        int i10;
        boolean z9;
        ArrayList arrayList = anVar.K6;
        SparseArray[] sparseArrayArr = anVar.f43878m6;
        if (!anVar.f43835ib && (i10 = i7 - anVar.C0.J) >= 0 && i10 < arrayList.size()) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
            if (sparseArrayArr[0].get(ijVar.f1(), null) == null && sparseArrayArr[1].get(ijVar.f1(), null) == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i11), (org.telegram.messenger.ij) sparseArrayArr[0].valueAt(i11));
            }
            for (int i12 = 0; i12 < sparseArrayArr[1].size(); i12++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i12), (org.telegram.messenger.ij) sparseArrayArr[1].valueAt(i12));
            }
            org.telegram.ui.Components.pj0 pj0Var = anVar.f44037z0;
            ?? obj = new Object();
            obj.d = anVar;
            obj.f19073b = z9;
            obj.f19074c = sparseArray;
            if (!pj0Var.f36934b2) {
                pj0Var.f36951k2 = new int[2];
                new HashSet();
                pj0Var.n1(pj0Var, true);
                pj0Var.f36941f2 = obj;
                pj0Var.f36934b2 = true;
                pj0Var.f36939e2 = i7;
                pj0Var.d2 = i7;
            }
        }
    }

    public static void l0(an anVar) {
        org.telegram.ui.Cells.q1 q1Var;
        zk zkVar;
        int i7;
        if (!anVar.f43947rc && anVar.T3 && anVar.f44037z0.G && anVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = anVar.f44037z0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = anVar.f44037z0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f23244k != null && q1Var.getMessageObject().f23244k.video_processing_pending) {
                            if (q1Var.getCurrentPosition() != null) {
                                if (q1Var.getMessageObject() != null && (q1Var.getCurrentPosition().f21451l & 8) != 0) {
                                    int i10 = q1Var.getCurrentPosition().f21451l;
                                    if (q1Var.getMessageObject().Q3()) {
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
                            if (timeY >= org.telegram.messenger.g0.L(240.0f) && timeY <= (org.telegram.messenger.g0.f22544q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f22539n) {
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
                anVar.f43947rc = true;
                zk zkVar2 = new zk(anVar, anVar.getParentActivity());
                zkVar2.r(true);
                zkVar2.K = Layout.Alignment.ALIGN_CENTER;
                zkVar2.d = 3500L;
                zkVar2.T = true;
                zkVar2.f12422e = true;
                zkVar2.h = org.telegram.messenger.g0.L(150.0f);
                zkVar2.s(8.0f);
                anVar.P1 = zkVar2;
                zkVar2.u(org.telegram.messenger.hd.M0(2131743599, null));
                anVar.P1.l(anVar.K);
                anVar.l1.addView(anVar.P1, c8.ha.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                q1Var.getLocationInWindow(iArr);
                anVar.Q1 = q1Var.getTimeY() + iArr[1];
                anVar.P1.setTranslationY(((-zkVar.getTop()) - org.telegram.messenger.g0.L(120.0f)) + anVar.Q1);
                anVar.P1.p(0.0f, (q1Var.z9 / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q1Var.B9);
                anVar.P1.w();
                return;
            }
            org.telegram.messenger.g0.r(new ae(anVar, 2));
            org.telegram.messenger.g0.i3(new ae(anVar, 2), 2000L);
        }
    }

    public static void l1(an anVar, String str) {
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

    public static boolean l2(an anVar, View view, RectF rectF) {
        RectF rectF2 = anVar.fc;
        if (rectF != null && anVar.f44037z0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void m0(an anVar) {
        if (anVar.f43718a2) {
            anVar.getMessagesController().d(0, 0, anVar.f43842j6);
            anVar.f8();
            anVar.M3.j(23, anVar.f43842j6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit();
            edit.putBoolean("dialog_bar_archived" + anVar.f43842j6, false);
            edit.putBoolean("dialog_bar_block" + anVar.f43842j6, false);
            edit.putBoolean("dialog_bar_report" + anVar.f43842j6, false);
            edit.commit();
            anVar.vd(false);
            org.telegram.messenger.dt notificationsController = anVar.getNotificationsController();
            long j3 = anVar.f43842j6;
            long b10 = anVar.b();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().c().edit();
            String v = org.telegram.messenger.dt.v(j3, b10, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + v);
            remove.remove("custom_" + v);
            notificationsController.getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().Q.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j3, b10, true);
        } else if (anVar.Z1.getTag() != null && ((Integer) anVar.Z1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = anVar.f43916p8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i7 = 0; i7 < anVar.f43916p8.participants.participants.size(); i7++) {
                    hVar.k(null, anVar.f43916p8.participants.participants.get(i7).user_id);
                }
                long j10 = anVar.f43916p8.f26954id;
                org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(anVar.getParentActivity(), anVar.currentAccount, hVar, anVar.f43916p8.f26954id, anVar, anVar.f44022xa);
                x50Var.f40193c2 = new fe(anVar, 23);
                x50Var.show();
            }
        } else if (anVar.Z1.getTag() != null) {
            anVar.Ub(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", anVar.f43785f.f27102id);
            bundle.putBoolean("addContact", true);
            nr nrVar = new nr(bundle);
            nrVar.O = new fe(anVar, 24);
            anVar.presentFragment(nrVar);
        }
    }

    public static void m1(an anVar, org.telegram.ui.Components.k60 k60Var) {
        if (anVar.f43882mc == null) {
            return;
        }
        k60Var.u();
        anVar.ja(anVar.f43882mc, false, true);
        vf.c.s(anVar.getParentActivity(), Uri.parse(anVar.f43882mc.R0), true, false, false, null, null, false, org.telegram.messenger.qp.s1(anVar.currentAccount).f24756d6, false, false);
    }

    public static void n0(an anVar, TLRPC.Document document) {
        anVar.J4.put(document, 0);
        org.telegram.messenger.gz.C(anVar.currentAccount).v0(document, null, anVar.f43842j6, null, null, null, anVar.B5, null, true, 0, 0, false, null, anVar.W8(), 0L, anVar.h9(), anVar.f44004w5);
    }

    public static void n1(an anVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(anVar.currentAccount).o1(user.f27102id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new yg(anVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void o0(an anVar, long j3, long j10) {
        org.telegram.messenger.f2.b(anVar.currentAccount).h(j3, j10, false);
        anVar.f43895nc = null;
    }

    public static void o1(an anVar) {
        if (org.telegram.messenger.g0.g(anVar.f43882mc.U0)) {
            org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.resourceProvider));
        }
    }

    public static void o4(an anVar, org.telegram.ui.Cells.f0 f0Var) {
        String charSequence;
        if (org.telegram.messenger.qp.s1(anVar.currentAccount).f24889s7.s()) {
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

    public static void p0(an anVar) {
        TLRPC.ChatFull chatFull = anVar.f43916p8;
        if (chatFull != null && !anVar.G5) {
            TLRPC.Chat chat = anVar.f43771e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && anVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7;
                int i7 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z9 = org.telegram.messenger.r2.f25199a;
                int currentTime = anVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i7) >= 604800 && anVar.visibleDialog == null && anVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = anVar.getParentActivity();
                    fe feVar = new fe(anVar, 15);
                    fe feVar2 = new fe(anVar, 16);
                    Pattern pattern = org.telegram.ui.Components.v4.f38813a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.g0.y2(null, 2131624037);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bg.q0(10));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.sz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(127.17949f), y22)));
                    frameLayout.addView(view, c8.ha.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.V = frameLayout;
                    u1Var.O0 = 0.3974359f;
                    u1Var.R = org.telegram.messenger.hd.M0(2131749563, null);
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749564, null));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749565, null), feVar);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), feVar2);
                    anVar.showDialog(u1Var);
                }
            }
        }
    }

    public static void p1(an anVar, Context context) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.lg lgVar;
        String str;
        SparseArray[] sparseArrayArr = anVar.f43878m6;
        if (anVar.getParentActivity() != null && anVar.f43808ga == 0.0f) {
            if (anVar.f43790f4 == 3) {
                Bundle bundle = new Bundle();
                long c92 = anVar.c9();
                if (c92 >= 0) {
                    bundle.putLong("user_id", c92);
                } else {
                    bundle.putLong("chat_id", -c92);
                }
                anVar.presentFragment(new an(bundle));
                return;
            }
            boolean z11 = false;
            if (anVar.W9()) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < sparseArrayArr[0].size(); i7++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i7)));
                }
                anVar.Yb(true, true);
                byte[] bArr = anVar.f43840j4;
                String str2 = anVar.f43853k4;
                ne neVar = new ne(anVar, 2);
                int i10 = oy0.f48566s1;
                int currentAccount = anVar.getCurrentAccount();
                Activity parentActivity = anVar.getParentActivity();
                long a10 = anVar.a();
                if (parentActivity != null) {
                    oy0.J0(currentAccount, parentActivity, a10, false, false, arrayList, org.telegram.ui.Components.hc.a0(anVar), anVar.getResourceProvider(), bArr, str2, neVar);
                }
            } else if (anVar.f43790f4 == 2) {
                anVar.finishFragment();
                kl klVar = anVar.f43845j9;
                if (anVar.D0.getTag() == null) {
                    z11 = true;
                }
                klVar.Y(true, z11);
            } else {
                TLRPC.User user = anVar.f43785f;
                if (user != null && user.f27102id == 489000) {
                    anVar.Ec(true);
                } else if (user != null && anVar.f43883n) {
                    if (user.bot) {
                        String str3 = anVar.f43980u8;
                        anVar.f43980u8 = null;
                        anVar.getMessagesController().f5(new he(anVar, str3, 3), anVar.f43785f.f27102id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44022xa);
                    String M0 = org.telegram.messenger.hd.M0(2131754065, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.T = M0;
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new fe(anVar, 8));
                    u1Var.R = org.telegram.messenger.hd.M0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    anVar.showDialog(u1Var);
                } else if (org.telegram.messenger.t10.z(user)) {
                    anVar.Ec(true);
                } else {
                    TLRPC.User user2 = anVar.f43785f;
                    if (user2 != null && user2.bot && (str = anVar.f43980u8) != null) {
                        if (str.length() != 0) {
                            anVar.getMessagesController().A4(anVar.f43980u8, anVar.f43785f);
                        } else {
                            anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", anVar.f43842j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        anVar.f43980u8 = null;
                        anVar.Lc(false);
                        return;
                    }
                    if (org.telegram.messenger.t3.T(anVar.f43771e)) {
                        TLRPC.Chat chat = anVar.f43771e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.t3.r0(chat)) {
                                if (anVar.f43771e.join_request) {
                                    anVar.Yb(true, true);
                                    org.telegram.messenger.qp.s1(anVar.currentAccount).m(anVar.f43771e.f26953id, org.telegram.messenger.p10.i(anVar.currentAccount).f(), 0, null, null, true, new ae(anVar, 20), new ni.c(9, anVar, context), null);
                                    return;
                                }
                                ae aeVar = anVar.f43737b6;
                                if (aeVar != null) {
                                    org.telegram.messenger.g0.r(aeVar);
                                    anVar.f43737b6 = null;
                                }
                                anVar.Yb(true, true);
                                anVar.getMessagesController().n(anVar.f43771e.f26953id, anVar.getUserConfig().f(), null, anVar, null);
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
                                org.telegram.ui.ActionBar.l0 l0Var = anVar.Y1;
                                if (l0Var != null && (lgVar = anVar.f43717a1) != null && lgVar.d(l0Var) && anVar.f43733b2.getVisibility() != 8 && anVar.f43733b2.getTag(2131296585) != null) {
                                    org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit().putInt("dialog_bar_vis3" + anVar.f43842j6, 3).commit();
                                    anVar.getNotificationCenter().k(org.telegram.messenger.qs.Q0, Long.valueOf(anVar.f43842j6));
                                    return;
                                }
                                return;
                            }
                            anVar.Ec(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = anVar.f43916p8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    TLRPC.Chat chat2 = anVar.f43771e;
                    TLRPC.User user3 = anVar.f43785f;
                    if (anVar.h != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.v4.r(anVar, false, chat2, user3, z10, true, false, z9, new fe(anVar, 9));
                }
            }
        }
    }

    public static void p2(an anVar, org.telegram.ui.Cells.q1 q1Var, int i7, int i10, int i11) {
        if (!anVar.B2.V || anVar.Ib != q1Var || anVar.Jb != i11) {
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (messageObject != null && (org.telegram.messenger.ij.n1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.ij.n1(messageObject);
                if (org.telegram.messenger.ij.X4(tL_messageMediaPoll) && !org.telegram.messenger.ij.V4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        anVar.B2.u(org.telegram.messenger.hd.M0(2131747158, null));
                        anVar.Ib = q1Var;
                        anVar.Jb = i11;
                        anVar.B2.x(anVar.t9(q1Var, i10), anVar.u9(q1Var, i11), true);
                    }
                }
            }
            if (i7 == -1) {
                anVar.B2.u(org.telegram.messenger.hd.M0(2131747157, null));
                anVar.Ib = q1Var;
                anVar.Jb = i11;
                anVar.B2.x(anVar.t9(q1Var, i10), anVar.u9(q1Var, i11), true);
            }
        }
    }

    public static void p4(an anVar) {
        if (anVar.W3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = anVar.f43790f4;
        if (i7 == 3) {
            tL_message.message = org.telegram.messenger.hd.M0(2131745895, null);
        } else if (i7 == 9) {
            tL_message.message = org.telegram.messenger.hd.M0(2131742894, null);
        } else {
            tL_message.message = org.telegram.messenger.hd.M0(2131752671, null);
        }
        tL_message.f26974id = 0;
        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(anVar.currentAccount, tL_message, false, false);
        anVar.W3 = ijVar;
        ijVar.D = 10;
        ijVar.U = 1;
    }

    public static void q0(an anVar) {
        TLRPC.UserFull userFull;
        boolean z9;
        if (anVar.getParentActivity() != null) {
            TLRPC.Chat chat = anVar.f43771e;
            if (chat != null) {
                if (org.telegram.messenger.t3.j(chat) && !anVar.f43771e.monoforum) {
                    z9 = true;
                }
                z9 = false;
            } else {
                if (anVar.h == null && (userFull = anVar.f43929q8) != null) {
                    z9 = userFull.can_pin_message;
                }
                z9 = false;
            }
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44022xa);
                String M0 = org.telegram.messenger.hd.M0(2131743843, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131743844, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743845, null), new fe(anVar, 21));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                anVar.showDialog(u1Var);
            } else if (!anVar.T4.isEmpty()) {
                org.telegram.messenger.qp.s1(anVar.currentAccount).f24757d7.edit().putInt("pin_" + anVar.f43842j6, ((Integer) anVar.T4.get(0)).intValue()).commit();
                anVar.cd(0, true);
            }
        }
    }

    public static void q1(an anVar, long j3, long j10, Long l10, Boolean bool) {
        boolean z9 = false;
        bi.ea y10 = bi.ea.y(anVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z9 = true;
        }
        y10.g0(j3, j10, z9, true);
    }

    public static void q4(an anVar) {
        if (anVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.M0(2131742895, null);
        tL_message.f26974id = 0;
        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(anVar.currentAccount, tL_message, false, false);
        anVar.X3 = ijVar;
        ijVar.D = 10;
        ijVar.U = 1;
    }

    public static an qa(int i7, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i7);
        return new an(bundle);
    }

    public static org.telegram.ui.Components.wn r0(an anVar, Context context) {
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, anVar.currentAccount, anVar.f43825i0.getPopupLayout().getSwipeBack(), false, new xi(anVar), anVar.getResourceProvider());
        anVar.f44000w1 = ynVar;
        ynVar.e(anVar.f43842j6, anVar.b(), null);
        return anVar.f44000w1.f40689f;
    }

    public static void r1(an anVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = anVar.W1.getAdapter().f16799w0;
        int i7 = anVar.currentAccount;
        TLRPC.User user2 = anVar.f43785f;
        if (user2 != null) {
            j3 = user2.f27102id;
        } else {
            j3 = anVar.f43771e.f26953id;
        }
        hi.q4 b10 = hi.q4.b(i7, j3, user.f27102id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, anVar.h9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
            return;
        }
        String F1 = org.telegram.messenger.qp.s1(anVar.currentAccount).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.qp.s1(anVar.currentAccount);
            org.telegram.messenger.qp.R4(F1, anVar);
            return;
        }
        hi.a3 a3Var = new hi.a3(anVar.getParentActivity(), anVar.getResourceProvider());
        a3Var.B(false);
        a3Var.B0 = true;
        a3Var.f14526l0 = anVar.getParentActivity();
        a3Var.x(anVar, b10);
        a3Var.show();
    }

    public static void r2(an anVar) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij primaryMessageObject;
        TLRPC.Message message;
        if (anVar.N1 != null) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = null;
        for (int childCount = anVar.f44037z0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = anVar.f44037z0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (primaryMessageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f23244k) != null && message.via_business_bot_id != 0) {
                q1Var2 = q1Var;
            }
        }
        anVar.Xb(q1Var2);
    }

    public static an ra(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new an(bundle);
    }

    public static void s0(an anVar) {
        if (org.telegram.messenger.qp.s1(anVar.currentAccount).r2(anVar.f43842j6, anVar.b(), null)) {
            anVar.ud(true);
            org.telegram.messenger.g0.i3(new ae(anVar, 8), 150L);
            anVar.f43825i0.U(null, null);
            if (anVar.getParentActivity() != null) {
                org.telegram.ui.Components.hc.z(anVar, 4, 0, anVar.f44022xa).j();
                return;
            }
            return;
        }
        View view = anVar.f43950s1.f28357j;
        if (view instanceof org.telegram.ui.ActionBar.z0) {
            ((org.telegram.ui.ActionBar.z0) view).b();
        }
    }

    public static void s1(an anVar, int i7) {
        if (anVar.f43790f4 == 7) {
            Object E = anVar.f43720a4.E(i7);
            if (i7 == 0) {
                anVar.f43720a4.getClass();
            }
            if (E instanceof org.telegram.messenger.ij) {
                anVar.Fa((org.telegram.messenger.ij) E);
            }
        } else if (anVar.E3 != null) {
            if (i7 >= 0 && i7 < anVar.getMediaDataController().Y0.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.getMediaDataController().Y0.get(i7);
                anVar.F3 = false;
                anVar.Nb(false, true, false);
                org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
                if (i7 >= 0) {
                    if (i7 < mediaDataController.Y0.size()) {
                        mediaDataController.f25809e1 = i7;
                    }
                } else {
                    mediaDataController.getClass();
                }
                anVar.jd(anVar.getMediaDataController().c0(), anVar.getMediaDataController().f25809e1, anVar.getMediaDataController().j0());
                org.telegram.messenger.g0.h3(new ie(anVar, ijVar, 2));
            }
        } else {
            org.telegram.messenger.ui mediaDataController2 = anVar.getMediaDataController();
            int i10 = anVar.classGuid;
            ArrayList arrayList = mediaDataController2.Y0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                mediaDataController2.f25809e1 = i7;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(i10), Integer.valueOf(ijVar2.f1()), Integer.valueOf(mediaDataController2.c0()), Long.valueOf(org.telegram.messenger.ij.B0(ijVar2.f23244k)), Integer.valueOf(mediaDataController2.f25809e1), Integer.valueOf(mediaDataController2.j0()), Boolean.TRUE);
            }
            anVar.oc(false);
        }
    }

    public static void t0(an anVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.ui.b0(anVar.currentAccount).E0(false, true, null);
            anVar.wa(user.f27102id, anVar.A8, false);
        }
    }

    public static void t1(an anVar, Long l10, Boolean bool) {
        int i7;
        int i10;
        if (l10.longValue() != anVar.b()) {
            anVar.f44010wb = SystemClock.uptimeMillis();
            anVar.F7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                anVar.rb(anVar.b());
            } else if (anVar.b() == 0) {
                anVar.rb(l10.longValue());
            } else {
                anVar.D7 = -1;
            }
            anVar.getConnectionsManager().cancelRequestsForGuid(anVar.classGuid);
            anVar.getMessagesStorage().k(anVar.classGuid);
            anVar.classGuid = ConnectionsManager.generateClassGuid();
            anVar.ob();
            anVar.f43990v5 = null;
            anVar.K7 = 0;
            anVar.A7 = false;
            anVar.B7 = true;
            anVar.W7 = true;
            anVar.X7 = 0;
            anVar.Z7 = null;
            anVar.f44018x6.clear();
            anVar.f43939r4 = l10.longValue();
            TLRPC.TL_forumTopic f10 = anVar.getMessagesController().f24870q7.f(-anVar.a(), l10.longValue());
            if (l10.longValue() != 0 && f10 != null) {
                int i11 = f10.read_inbox_max_id;
                anVar.f44029y4 = i11;
                anVar.f44041z4 = f10.read_outbox_max_id;
                anVar.A4 = Math.max(1, i11);
                anVar.getMessagesController().f24870q7.k(anVar.f43842j6, org.telegram.messenger.m5.o(f10.from_id));
            } else {
                anVar.f43925q4 = null;
                anVar.o4 = null;
                anVar.f43864l4 = null;
                anVar.D5 = null;
                anVar.f44029y4 = 0;
                anVar.f44041z4 = 0;
                anVar.A4 = 0;
                anVar.f43939r4 = 0L;
                anVar.f43953s4 = 0;
                anVar.f43964t4 = null;
                anVar.f43989v4 = false;
                anVar.f43976u4 = false;
            }
            anVar.J8();
            anVar.sd(true);
            anVar.f43897o1.n(true);
            anVar.f43897o1.b();
            anVar.f43788f2.setCurrentTopic(l10.longValue());
            anVar.vd(true);
            anVar.Lc(true);
            anVar.getMessagesController().J4(-anVar.a(), anVar.b());
            anVar.D9(true);
            anVar.B9(true);
            qj qjVar = anVar.Z;
            if (qjVar != null) {
                qjVar.k0(false);
                anVar.Z.I1(true);
            }
            anVar.M6(true, true);
            if (f10 != null) {
                i7 = f10.unread_reactions_count;
            } else {
                i7 = 0;
            }
            anVar.f44038z1 = i7;
            if (f10 != null) {
                i10 = f10.unread_poll_votes_count;
            } else {
                i10 = 0;
            }
            anVar.A1 = i10;
            anVar.fd(false);
            anVar.ed(false);
            anVar.wd();
            sm smVar = anVar.Rc;
            if (smVar != null && anVar.actionBar.f27677n0) {
                smVar.k(null);
            }
        }
    }

    public static void u0(an anVar) {
        if (!anVar.s7(anVar.Z.getSendButton())) {
            if (anVar.getMediaController().I(anVar.f43965t5)) {
                anVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = anVar.getMessagesController().j1(anVar.f43842j6);
            if (anVar.f43977u5 != null) {
                for (int i7 = 0; i7 < anVar.f43977u5.d.size(); i7++) {
                    tL_messages_sendScheduledMessages.f27071id.add(Integer.valueOf(((org.telegram.messenger.ij) anVar.f43977u5.d.get(i7)).f1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f27071id.add(Integer.valueOf(anVar.f43965t5.f1()));
            }
            ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ld(3, anVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void u1(an anVar, long j3, boolean z9, boolean z10) {
        if (!org.telegram.messenger.g0.E1(anVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.ey0.c(anVar.getParentActivity(), anVar.currentAccount, -j3, anVar.getUserConfig().f(), null, z9, z10, anVar.getResourceProvider());
    }

    public static void v0(an anVar, TLRPC.Document document) {
        anVar.J4.put(document, 0);
        org.telegram.messenger.gz.C(anVar.currentAccount).v0(document, null, anVar.f43842j6, null, null, null, anVar.B5, null, true, 0, 0, false, null, anVar.W8(), 0L, anVar.h9(), anVar.f44004w5);
    }

    public static void v1(long j3, an anVar) {
        anVar.getMediaDataController().G0(j3, j3, true, anVar.classGuid, null);
    }

    public static void w0(an anVar, cg.a aVar, Runnable runnable) {
        if (!anVar.isFinished) {
            if (cg.a.m(bi.ea.x(anVar.currentAccount, aVar.f6160a).p()).f6161b < aVar.f6161b) {
                cg.b bVar = aVar.f6160a;
                if (bVar == cg.b.f6162a) {
                    new bi.tc(anVar.getParentActivity(), anVar.getResourceProvider(), aVar.a(), 13, qg.d.h(anVar.currentAccount, anVar.a()), null, anVar.a()).show();
                    return;
                } else if (bVar == cg.b.f6163b) {
                    new gi.e(anVar.getParentActivity(), anVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void w1(an anVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i7, org.telegram.messenger.ij ijVar, int i10, int i11, org.telegram.messenger.ij ijVar2) {
        boolean z9;
        int i12;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i13 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            anVar.Mc = true;
            anVar.f44037z0.g1();
            Bundle bundle = new Bundle();
            final long B0 = org.telegram.messenger.ij.B0(((org.telegram.messenger.ij) arrayList.get(0)).f23244k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            bundle.putBoolean("historyPreloaded", z9);
            an anVar2 = new an(bundle);
            anVar2.Rb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i7 != 0) {
                anVar2.f43739b8 = i7;
            }
            if (ijVar != null && (messageReplies = ijVar.f23244k.replies) != null && (messageReplies2 = anVar2.f43864l4.f23244k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (ijVar != null && (tL_messageReactions = ijVar.f23244k.reactions) != null) {
                anVar2.f43864l4.f23244k.reactions = tL_messageReactions;
            }
            ai.a1 a1Var = new ai.a1(anVar, new boolean[]{false}, i10, anVar2, 17);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f26974id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = anVar2.getClassGuid();
                org.telegram.messenger.qs.f(anVar.currentAccount).b(new fi(anVar, classGuid, a1Var, anVar2), org.telegram.messenger.qs.D);
                final int i15 = i12;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        an anVar3 = an.this;
                        org.telegram.messenger.qp messagesController = anVar3.getMessagesController();
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
                        messagesController.K3(messages_messages2, size2, B0, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i19, true, 0, ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).f1(), 1, false, 0, true, anVar3.f43989v4, null);
                    }
                });
                return;
            }
            a1Var.run();
            return;
        }
        anVar.Lc = 0;
        anVar.Mc = false;
        anVar.f44037z0.g1();
        if (ijVar2 != null) {
            anVar.Ga(ijVar2);
        } else if (anVar.getParentActivity() != null) {
            org.telegram.ui.Components.hc.a0(anVar).t(org.telegram.messenger.hd.M0(2131752330, null), anVar.f44022xa).j();
        }
    }

    public static void x0(an anVar) {
        if (anVar.f43882mc == null) {
            return;
        }
        sy0[] sy0VarArr = {sy0.d1(anVar.getParentActivity(), anVar, true, anVar.resourceProvider, new org.telegram.messenger.voip.k(13, anVar, sy0VarArr))};
    }

    public static void x1(an anVar, String str) {
        if (org.telegram.messenger.qp.s1(anVar.currentAccount).L2(true)) {
            vf.c.n(anVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.v4.l0(anVar.getParentActivity(), anVar.f44022xa, str, true, new rf(anVar, str, 1));
        }
    }

    public static void y0(an anVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.qp.s1(anVar.currentAccount).o1(user.f27102id);
                    ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ld(2, anVar, user));
                }
            }
        }
    }

    public static void y1(an anVar, String str) {
        Uri parse = Uri.parse(str);
        e40.b(anVar.getParentActivity(), anVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void z0(an anVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(anVar.currentAccount).o1(user.f27102id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(anVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new yg(anVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void z1(an anVar) {
        org.telegram.messenger.qp messagesController = anVar.getMessagesController();
        long j3 = anVar.f43842j6;
        long j10 = anVar.f43738b7;
        int i7 = anVar.classGuid;
        int i10 = anVar.f43790f4;
        long j11 = anVar.f43939r4;
        int i11 = anVar.A4;
        int i12 = anVar.f43866l6;
        anVar.f43866l6 = i12 + 1;
        messagesController.Y2(j3, j10, false, 30, 0, 0, true, 0, i7, 0, i10, j11, i11, i12, anVar.f43989v4);
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
        float f10;
        org.telegram.ui.Components.ve veVar;
        float inputBubbleHeight = this.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(15.0f) + r9(org.telegram.ui.Components.i11.f34462c) + this.f43998w.d();
        qj qjVar = this.Z;
        if (qjVar != null && (veVar = qjVar.m0) != null) {
            veVar.setTranslationY(-inputBubbleHeight);
        }
        jj jjVar = this.W1;
        if (jjVar != null) {
            if (jjVar.g()) {
                f10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            jjVar.setTranslationY(f10);
        }
    }

    public final void A9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(this).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
            getMessagesController().o0(true);
            eb(this.f43965t5);
            gb(this.f43965t5);
            return;
        }
        showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 3, true));
    }

    public final void Aa(long j3, final org.telegram.messenger.ij ijVar, int i7, final long j10, final int i10, final int i11, final org.telegram.messenger.ij ijVar2) {
        int i12 = i7;
        final TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.qp.l1(M0);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("getDiscussionMessage chat = " + M0.f26953id + " msg_id = " + i12);
        }
        this.Lc = 0;
        this.Mc = false;
        this.Oc = null;
        this.Pc = null;
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            ajVar.g1();
        }
        if (this.Kc != -1) {
            getConnectionsManager().cancelRequest(this.Kc, false);
        }
        if (this.Jc != -1) {
            getConnectionsManager().cancelRequest(this.Jc, false);
        }
        if (ijVar2 != null) {
            i12 = ijVar2.f1();
        }
        this.Lc = i12;
        this.Mc = false;
        this.Nc = System.currentTimeMillis();
        aj ajVar2 = this.f44037z0;
        if (ajVar2 != null) {
            ajVar2.g1();
        }
        final int i13 = this.Hc + 1;
        this.Hc = i13;
        this.Jc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final an anVar = an.this;
                final int i14 = i13;
                final int i15 = i10;
                final long j11 = j10;
                final int i16 = i11;
                final org.telegram.messenger.ij ijVar3 = ijVar2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = M0;
                final org.telegram.messenger.ij ijVar4 = ijVar;
                org.telegram.messenger.g0.h3(new qf(6, anVar, new Runnable(i14, i15, j11, tLObject, i16, ijVar3, tL_messages_getDiscussionMessage2, chat, ijVar4) {
                    public final int f48821b;
                    public final int f48822c;
                    public final TLObject d;
                    public final int f48823e;
                    public final org.telegram.messenger.ij f48824f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f48825n;
                    public final org.telegram.messenger.ij f48826r;

                    {
                        this.d = tLObject;
                        this.f48823e = i16;
                        this.f48824f = ijVar3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f48825n = chat;
                        this.f48826r = ijVar4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final an anVar2 = an.this;
                        if (this.f48821b != anVar2.Hc) {
                            return;
                        }
                        anVar2.Jc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            anVar2.Oc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            anVar2.getMessagesController().Y3(anVar2.Oc.users, false);
                            anVar2.getMessagesController().S3(anVar2.Oc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = anVar2.Oc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i18 = 0; i18 < anVar2.Oc.messages.size(); i18++) {
                                TLRPC.Message message = anVar2.Oc.messages.get(i18);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i19 = this.f48822c;
                        final int i20 = this.f48823e;
                        final org.telegram.messenger.ij ijVar5 = this.f48824f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.f48825n;
                        final org.telegram.messenger.ij ijVar6 = this.f48826r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = anVar2.getMessagesController().m1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f26974id;
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
                            final int i21 = anVar2.Ic + 1;
                            anVar2.Ic = i21;
                            anVar2.Kc = anVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    org.telegram.messenger.g0.h3(new xg(an.this, i21, tLObject3, tL_error2, i19, ijVar5, tL_messages_getDiscussionMessage3, chat2, i20, ijVar6, 0));
                                }
                            });
                            return;
                        }
                        anVar2.Xa(anVar2.Oc, anVar2.Pc, i19, ijVar5, tL_messages_getDiscussionMessage3, chat2, i20, ijVar6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Jc, this.classGuid);
    }

    public final void Ab(View view, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.ii0 ii0Var, View view2, float f10, float f11, ch.o0 o0Var, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        ch.o0 o0Var2;
        String str;
        TLRPC.Document e10;
        org.telegram.messenger.ij b10;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        bi.p7 p7Var;
        int[] iArr;
        int[] iArr2;
        int i7;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z14;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && ijVar != null) {
            if (getMessagesController().v2()) {
                b.b(this.currentAccount);
                return;
            }
            int i10 = 2;
            if (o0Var != null && o0Var.f6352a) {
                O7(true);
                if (view == null) {
                    zVar = H8(ijVar.f1(), true);
                } else {
                    zVar = view;
                }
                String str2 = "";
                if (z10) {
                    if (zVar != null) {
                        try {
                            zVar.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = ijVar.f23244k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j3 = -bi.x9.b(ijVar).f5042a;
                    TLRPC.ChatFull N0 = getMessagesController().N0(j3);
                    if (N0 != null && !N0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
                        org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(this);
                        if (M0 != null) {
                            str2 = M0.title;
                        }
                        a02.Q(2131624226, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745033, str2))).k(true);
                        return;
                    }
                    bi.ca caVar = bi.ea.y(this.currentAccount, false).B;
                    if (caVar != null) {
                        caVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i11 = this.currentAccount;
                    long j10 = this.f43842j6;
                    if (N0 != null && !N0.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    bi.ce ceVar = new bi.ce(parentActivity, i11, j10, this, ijVar, arrayList, z14, false, 0L, this.f44022xa);
                    ijVar.f1();
                    ceVar.M1 = this;
                    ceVar.N1 = zVar;
                    ceVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -bi.x9.b(ijVar).f5042a;
                TLRPC.ChatFull N02 = getMessagesController().N0(j11);
                if (N02 != null && !N02.paid_reactions_available) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j11));
                    org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(this);
                    if (M02 != null) {
                        str2 = M02.title;
                    }
                    a03.Q(2131624226, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745033, str2))).k(true);
                    return;
                }
                bi.ca b02 = bi.ea.y(this.currentAccount, false).b0(ijVar, this, 1L, true, true, null);
                if (b02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Tc == null) {
                        this.Tc = new bi.p7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        p7Var = null;
                    } else {
                        if (this.Tc.getParent() != layoutContainer) {
                            org.telegram.messenger.g0.E2(this.Tc);
                            layoutContainer.addView(this.Tc, c8.ha.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Tc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Tc.bringToFront();
                        }
                        p7Var = this.Tc;
                    }
                    p7Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    b02.f3599o = p7Var;
                    p7Var.I = false;
                    p7Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    p7Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f10;
                    float f13 = (iArr[1] - iArr2[1]) + f11;
                    if (zVar instanceof org.telegram.ui.Cells.q1) {
                        i7 = ((org.telegram.ui.Cells.q1) zVar).V;
                    } else {
                        i7 = 0;
                    }
                    p7Var.d(f12, f13 + i7, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = ijVar.f23244k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new ug.w0((org.telegram.ui.ActionBar.f2) this, 24, true).show();
            } else {
                if (ijVar.x2() && o0Var != null) {
                    for (int i12 = 0; i12 < ijVar.f23244k.reactions.results.size(); i12++) {
                        TLRPC.ReactionCount reactionCount = ijVar.f23244k.reactions.results.get(i12);
                        if (o0Var.f(reactionCount.reaction)) {
                            z13 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z13 = false;
                if (!z13 && (chat = this.f43771e) != null && !org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.w(26, this.f43771e)) {
                    org.telegram.messenger.k5.o(null, 2131745592, org.telegram.ui.Components.hc.a0(this), 2131624006, 36);
                    return;
                }
                ch.k0.b(false);
                int size = ijVar.y0().size();
                boolean I5 = ijVar.I5(o0Var, z10);
                int f14 = ijVar.f1();
                long d12 = ijVar.d1();
                a0.h hVar = this.N6;
                if (hVar.f(d12) != null && (b10 = ((org.telegram.messenger.dj) hVar.f(ijVar.d1())).b(9)) != null) {
                    f14 = b10.f1();
                }
                int i13 = f14;
                if (I5) {
                    org.telegram.ui.Cells.z H8 = H8(i13, true);
                    if (!org.telegram.messenger.iz.f23426w1 && H8 != null && o0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.iz.C(true);
                        long j12 = o0Var.f6357g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(this.currentAccount).f25833r.get(o0Var.f6356f);
                            if (tL_availableReaction != null) {
                                e10 = tL_availableReaction.center_icon;
                            }
                        } else {
                            e10 = org.telegram.ui.Components.i5.e(this.currentAccount, j12);
                        }
                        if (e10 != null) {
                            org.telegram.ui.Components.cc q10 = org.telegram.ui.Components.hc.a0(this).q(e10, org.telegram.messenger.hd.M0(2131752218, null));
                            q10.f32514j = 5000;
                            q10.j();
                        }
                    }
                    if (!z9) {
                        int i14 = this.currentAccount;
                        if (ii0Var != null) {
                            if (z10) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 1;
                        }
                        ch.k0.d(this, ii0Var, H8, view2, f10, f11, o0Var, i14, i10);
                    }
                }
                if (I5 && o0Var != null && (str = o0Var.f6356f) != null) {
                    org.telegram.messenger.g0.i2(org.telegram.messenger.hd.a0(null, null, 2131754725, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(ijVar.y0());
                org.telegram.messenger.gz sendMessagesHelper = getSendMessagesHelper();
                if (I5) {
                    o0Var2 = o0Var;
                } else {
                    o0Var2 = null;
                }
                di diVar = new di(this, z12, z9, i13, I5, ii0Var, f10, f11, o0Var, ijVar);
                this.Fc = diVar;
                sendMessagesHelper.s0(ijVar, arrayList2, o0Var2, z10, z11, this, diVar);
                if (z9 || z12) {
                    Uc(ijVar, true);
                    this.Fc.run();
                }
                if (!z12) {
                    org.telegram.messenger.g0.i3(this.Fc, 50L);
                }
            }
        }
    }

    public final void Ac(org.telegram.messenger.ij ijVar, boolean z9) {
        TL_iv.RichMessage richMessage;
        if (ijVar != null && getParentActivity() != null) {
            ch.r rVar = this.f43945ra;
            if (rVar != null && rVar.d()) {
                this.f43945ra.setHiddenByScroll(true);
            }
            if (this.f43837j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f27677n0) {
                    kVar.l(true);
                    this.Z.d1();
                }
            }
            TLRPC.Message message = ijVar.f23244k;
            if (message != null && (richMessage = message.rich_message) != null) {
                li.b2 b2Var = new li.b2(richMessage);
                b2Var.J = this;
                b2Var.f18460r = ijVar;
                presentFragment(b2Var);
                return;
            }
            this.W1.getAdapter().f16779f0 = false;
            this.Z.setVisibility(0);
            cc(true, null, ijVar, null, null, true, 0, null, false, 0L, null, true);
            Lc(false);
            if (!z9) {
                b7();
            }
            if (z9) {
                this.f44004w5 = org.telegram.messenger.nj.b(ijVar.f23244k.suggested_post);
            }
            this.Z.U0(false, false, true);
            cd(0, true);
            Cd(false);
            if (!z9 && !ijVar.f23263p1 && !org.telegram.messenger.ij.c4(ijVar.f23244k) && this.f43790f4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().j1(this.f43842j6);
                tL_messages_getMessageEditData.f27047id = ijVar.f1();
                this.E5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new de(this, 3));
                return;
            }
            qj qjVar = this.Z;
            org.telegram.ui.Components.ge geVar = qjVar.F1;
            if (geVar != null) {
                geVar.setEnabled(true);
                qjVar.F1.f(false);
            }
        }
    }

    public final void Ad() {
        int i7;
        org.telegram.ui.ActionBar.p0 p0Var = this.f43884n0;
        if (p0Var == null) {
            return;
        }
        if (getMessagesController().f24889s7.z(a()) && getMessagesController().f24889s7.t(a())) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        p0Var.e(i7);
    }

    public final void B7() {
        float d;
        if (this.f44037z0 != null) {
            if (this.f43835ib && this.f44009wa == null) {
                d = org.telegram.messenger.g0.f22539n;
            } else {
                d = this.f43998w.d() + r9(org.telegram.ui.Components.i11.f34462c) + org.telegram.messenger.g0.L(16.0f) + this.Ua + this.Wc;
            }
            int i7 = (int) this.L9;
            org.telegram.ui.Components.m11 m11Var = this.f43788f2;
            if (m11Var != null) {
                m11Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f44025y0;
            boolean z9 = this.f44037z0.V1;
            RecyclerView recyclerView = gVar.f17046a;
            int i10 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i7 || paddingBottom != i10) {
                int i11 = paddingTop - i7;
                if (!z9 && i11 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i11 >= 0 || canScrollVertically) && (i11 <= 0 || canScrollVertically2)) {
                        org.telegram.messenger.g0.J(recyclerView, new bg.m0(gVar, i11, 11));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
            }
            jh.e eVar = this.f43735b4;
            if (eVar != null) {
                RectF rectF = eVar.f17025b;
                rectF.set(r9(org.telegram.ui.Components.i11.f34461b), i7 - this.H, 0.0f, d - this.Ua);
                eVar.f17026c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void B8(CharSequence charSequence, ArrayList arrayList) {
        if (this.F5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.ij ijVar = this.F5;
                ijVar.f23290w1 = charSequence;
                ijVar.f23294x1 = arrayList;
            } else if (this.F5.G3()) {
                org.telegram.messenger.ij ijVar2 = this.F5;
                ijVar2.f23290w1 = "";
                ijVar2.f23294x1 = new ArrayList();
            } else {
                qj qjVar = this.Z;
                if (qjVar != null) {
                    this.F5.f23290w1 = qjVar.getFieldText();
                    org.telegram.messenger.ij ijVar3 = this.F5;
                    if (ijVar3.f23290w1 == null && !TextUtils.isEmpty(ijVar3.f23244k.message)) {
                        this.F5.f23290w1 = "";
                    }
                }
            }
        }
    }

    public final void B9(boolean z9) {
        bc(false, null, null, null, true, 0, null, false, 0L, z9);
    }

    public final void Ba(boolean z9) {
        String M0;
        if (!U9() && !x9()) {
            int i7 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f43878m6;
                    if (i11 >= sparseArrayArr[i10].size()) {
                        break;
                    }
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i10].valueAt(i11);
                    if (ijVar.E4()) {
                        i7 = 3;
                    } else if (ijVar.U3()) {
                        if (ijVar.a4()) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                        if (i7 == 2) {
                            break;
                        }
                    } else if (ijVar.A3()) {
                        z10 = true;
                    }
                    i11++;
                }
                if (i7 == 2) {
                    break;
                }
            }
            ch.r rVar = this.f43945ra;
            if (rVar != null && rVar.d()) {
                this.f43945ra.setHiddenByScroll(true);
            }
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putInt("messagesCount", this.f43954s6);
            h.putInt("hasPoll", i7);
            h.putBoolean("hasInvoice", z10);
            h.putBoolean("canSelectTopics", true);
            ww wwVar = new ww(h);
            wwVar.C2 = this;
            presentFragment(wwVar);
            return;
        }
        if (U9()) {
            if (a() > 0) {
                M0 = org.telegram.messenger.hd.M0(2131750535, null);
            } else if (org.telegram.messenger.t3.T(this.f43771e) && !this.f43771e.megagroup) {
                M0 = org.telegram.messenger.hd.M0(2131750537, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131750536, null);
            }
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750538, null);
        }
        if (z9) {
            if (this.f44027y2 == null) {
                int indexOfChild = this.l1.indexOfChild(this.T);
                if (indexOfChild != -1) {
                    this.f44027y2 = D6(310.0f, 1, indexOfChild + 1, false);
                } else {
                    return;
                }
            }
            this.f44027y2.u(M0);
            this.f44027y2.y(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.f44039z2 == null) {
            int indexOfChild2 = this.l1.indexOfChild(this.T);
            if (indexOfChild2 == -1) {
                return;
            }
            this.f44039z2 = D6(310.0f, 3, indexOfChild2 + 1, false);
        }
        this.f44039z2.u(M0);
        this.f44039z2.y(this.f43760d1.getForwardButton(), true);
    }

    public final void Bb() {
        h6.m[] mVarArr;
        kh.b bVar;
        kh.a aVar;
        org.telegram.ui.Components.xc[] xcVarArr;
        ym ymVar = this.f44022xa;
        if (ymVar != null) {
            ymVar.t();
        }
        oi oiVar = this.f44024y;
        if (oiVar != null) {
            oiVar.d();
        }
        oi oiVar2 = this.f44011x;
        if (oiVar2 != null) {
            oiVar2.d();
        }
        oi oiVar3 = this.D;
        if (oiVar3 != null) {
            oiVar3.d();
        }
        qj qjVar = this.Z;
        if (qjVar != null) {
            qjVar.updateColors();
        }
        di.u2 u2Var = this.X1;
        if (u2Var != null) {
            u2Var.P0();
        }
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            int childCount = ajVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f44037z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) childAt).B0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f43781e9;
        if (g1Var != null && g1Var.getContentView() != null) {
            View contentView = this.f43781e9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.de0 de0Var = this.N2;
        if (de0Var != null) {
            de0Var.d();
        }
        rj rjVar = this.f43716a0;
        if (rjVar != null && rjVar.getEditView() != null) {
            for (org.telegram.ui.Components.xc xcVar : this.f43716a0.getEditView().f39959a) {
                if (xcVar != null) {
                    xcVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f43825i0;
        if (r0Var != null) {
            r0Var.V();
        }
        lj ljVar = this.f43862l2;
        if (ljVar != null) {
            ljVar.updateColors();
        }
        ui uiVar = this.f43897o1;
        if (uiVar != null) {
            uiVar.updateColors();
        }
        ol olVar = this.l1;
        if (olVar != null) {
            olVar.M();
            bi.ec ecVar = this.l1.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
        org.telegram.ui.Components.lg lgVar = this.f43717a1;
        if (lgVar != null) {
            fh.g gVar = lgVar.f35671s;
            if (gVar != null) {
                gVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false));
            lgVar.invalidate();
        }
        org.telegram.ui.Components.ow0 ow0Var = this.f43936r1;
        if (ow0Var != null) {
            ow0Var.updateColors();
        }
        ui uiVar2 = this.f43897o1;
        if (uiVar2 != null && uiVar2.getTimeItem() != null) {
            this.f43897o1.getTimeItem().invalidate();
        }
        jh.f fVar = this.T;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f44013x1;
        if (hVar != null) {
            for (h6.m mVar : hVar.f18383e) {
                if (mVar != null && (aVar = (bVar = (kh.b) mVar.f14264b).f17596b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        uj ujVar = this.f43746c1;
        if (ujVar != null) {
            ujVar.updateColors();
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        this.l1.invalidate();
        Iterator it2 = this.E.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void Bc() {
        org.telegram.ui.Components.jz jzVar = this.F9;
        if (jzVar != null && !jzVar.f35113c) {
            jzVar.c(false);
            try {
                this.F9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Bd(org.telegram.messenger.d20 d20Var) {
        int i7;
        int i10;
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            if (!this.P4 && this.Z7 != null) {
                int childCount = ajVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.f44037z0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.ij ijVar = this.Z7;
                        if (messageObject == ijVar) {
                            ArrayList arrayList = this.K6;
                            if (arrayList.indexOf(ijVar) >= 0) {
                                i7 = arrayList.indexOf(this.Z7) + this.C0.J;
                                i10 = f9(childAt);
                            }
                        }
                    }
                    i11++;
                }
            }
            i7 = -1;
            i10 = 0;
            int childCount2 = this.f44037z0.getChildCount();
            qj qjVar = this.Z;
            if (qjVar != null) {
                qjVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.f44037z0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                    org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                    if (((Boolean) d20Var.a(messageObject2)).booleanValue()) {
                        messageObject2.K1 = true;
                        q1Var.v3(messageObject2, q1Var.getCurrentMessagesGroup(), q1Var.H2(), q1Var.I2(), q1Var.z2(), q1Var.D2());
                        jl jlVar = this.C0;
                        this.f44037z0.getClass();
                        jlVar.Q(RecyclerView.R(q1Var));
                    }
                }
            }
            if (i7 != -1) {
                this.B0.h1(i7, i10);
            }
        }
    }

    public final void C7() {
        FrameLayout frameLayout = this.f43773e1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.T.getInputBubbleHeight() + this.f43998w.c() + org.telegram.messenger.g0.L(9.0f)) * (-0.5f));
        }
    }

    public final void C8() {
        CharSequence charSequence;
        qj qjVar = this.Z;
        if (qjVar != null) {
            charSequence = qjVar.getFieldText();
        } else {
            charSequence = null;
        }
        B8(charSequence, null);
    }

    public final void C9(boolean z9) {
        if (this.f43863l3.getTag() != null && !this.f43938r3) {
            if (!this.f44015x3 || this.f43963t3) {
                this.f43863l3.setTag(null);
                if (z9) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f43975u3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f43975u3.playTogether(ObjectAnimator.ofFloat(this.f43863l3, View.ALPHA, 0.0f));
                    this.f43975u3.addListener(new ei(this, 5));
                    this.f43975u3.setStartDelay(this.f43899o3);
                    this.f43975u3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f43975u3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f43975u3 = null;
                    }
                    this.f43863l3.setAlpha(0.0f);
                }
                this.f43899o3 = 500;
            }
        }
    }

    public final void Ca(int i7) {
        boolean z9;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.mj mjVar = this.f43990v5;
        if (mjVar != null && this.Ya == null) {
            TLRPC.Peer peer = null;
            if (mjVar.f24027c != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.W5;
                CharSequence fieldText = this.Z.getFieldText();
                org.telegram.messenger.ij ijVar2 = this.D5;
                if (ijVar2 == this.f43864l4) {
                    ijVar = null;
                } else {
                    ijVar = ijVar2;
                }
                mjVar.e(i10, webPage, fieldText, ijVar, this.B5, this.F5);
            }
            if (!this.f43990v5.c()) {
                this.Ab = this.Z.f31159z2;
                Context context = this.l1.getContext();
                dh.c cVar = this.O8;
                org.telegram.messenger.mj mjVar2 = this.f43990v5;
                TLRPC.User user = this.f43785f;
                TLRPC.Chat chat = this.f43771e;
                int i11 = this.currentAccount;
                ym ymVar = this.f44022xa;
                qm qmVar = this.B5;
                if (qmVar != null && qmVar.f49266f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                lk lkVar = new lk(this, context, this, cVar, mjVar2, user, chat, i11, ymVar, i7, z9);
                this.Ya = lkVar;
                this.f43990v5.f24045x = lkVar;
                TLRPC.ChatFull chatFull = this.f43916p8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Aa) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Aa.peers.get(0).peer;
                }
                this.Ya.setSendAsPeer(peer);
                r7();
                this.l1.addView(this.Ya);
                if (this.Ab) {
                    qj qjVar = this.Z;
                    qjVar.T0 = true;
                    org.telegram.ui.Components.mf mfVar = qjVar.U0;
                    if (mfVar != null) {
                        mfVar.u(true);
                    }
                    this.Z.s1();
                    this.R3 = true;
                }
                org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void Cb(TLRPC.Document document) {
        String V;
        if (document == null || (V = org.telegram.messenger.ij.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f26959id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(V, this.f43842j6, this.D5, this.f43864l4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = W8();
        org.telegram.messenger.gz.C(this.currentAccount).r0(b10);
        K6();
    }

    public final void Cc() {
        long j3;
        ae aeVar = this.f43857k8;
        if (aeVar != null) {
            org.telegram.messenger.g0.r(aeVar);
        }
        ae aeVar2 = new ae(this, 18);
        this.f43857k8 = aeVar2;
        if (this.f43794f8 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        org.telegram.messenger.g0.i3(aeVar2, j3);
    }

    public final void Cd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Cd(boolean):void");
    }

    @Override
    public final org.telegram.ui.Components.rt0 D() {
        return this.l1;
    }

    public final fi.m3 D6(float f10, int i7, int i10, boolean z9) {
        long j3;
        fi.m3 m3Var = new fi.m3(getParentActivity(), i7);
        m3Var.r(true);
        m3Var.h = org.telegram.messenger.g0.L(f10);
        if (z9) {
            j3 = -1;
        } else {
            j3 = 2300;
        }
        m3Var.d = j3;
        m3Var.T = true;
        m3Var.f12422e = true;
        m3Var.k(z9);
        m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        m3Var.f12442u0 = org.telegram.messenger.g0.L(4.0f);
        m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m3Var.l(this.K);
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 150, 55);
        if (i10 >= 0) {
            this.l1.addView(m3Var, i10, e10);
            return m3Var;
        }
        this.l1.addView(m3Var, e10);
        return m3Var;
    }

    public final void D7() {
        int i7;
        float f10 = this.f43784ed.f55394e;
        org.telegram.ui.Components.t20 t20Var = this.H1;
        int i10 = 8;
        if (t20Var != null) {
            t20Var.setAlpha(f10);
            org.telegram.ui.Components.t20 t20Var2 = this.H1;
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            t20Var2.setVisibility(i7);
        }
        bi.q1 q1Var = this.Z3;
        if (q1Var != null) {
            float f11 = 1.0f - f10;
            q1Var.setAlpha(f11);
            bi.q1 q1Var2 = this.Z3;
            if (f11 > 0.0f) {
                i10 = 0;
            }
            q1Var2.setVisibility(i10);
        }
    }

    public final void D8(boolean z9) {
        TLRPC.Chat chat = this.f43771e;
        if (chat != null && this.f43916p8 != null && !org.telegram.messenger.t3.r0(chat) && !this.f43771e.creator) {
            TLRPC.ChatFull chatFull = this.f43916p8;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f43934r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f43934r = chatParticipant.inviter_id;
                    return;
                }
                long e10 = getUserConfig().e();
                int size = this.f43916p8.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f43916p8.participants.participants.get(i7);
                    if (chatParticipant2.user_id == e10) {
                        this.f43934r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z9 && this.f43934r == 0) {
                getMessagesController().G(this.f43771e.f26953id, false);
            }
        }
    }

    public final void D9(boolean z9) {
        if (this.f43875m3.getTag() != null && !this.f43952s3) {
            if (!this.f44028y3 || this.f43963t3) {
                this.f43875m3.setTag(null);
                if (z9) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44002w3, 0.0f);
                    this.f43988v3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f43988v3.addUpdateListener(new ce(this, 1));
                    this.f43988v3.addListener(new ei(this, 7));
                    this.f43988v3.setStartDelay(this.f43899o3);
                    this.f43988v3.start();
                } else {
                    ValueAnimator valueAnimator = this.f43988v3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f43988v3 = null;
                    }
                    this.f44002w3 = 0.0f;
                    Pc();
                }
                this.f43899o3 = 500;
            }
        }
    }

    public final void Da(String str, boolean z9) {
        boolean z10;
        nj njVar;
        boolean z11;
        org.telegram.ui.ActionBar.r0 r0Var;
        int i7;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                b8();
                fi.m3 m3Var = this.J1;
                if (m3Var != null && m3Var.V) {
                    m3Var.f(true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                fi.m3 m3Var2 = this.K1;
                if (m3Var2 != null && m3Var2.V) {
                    m3Var2.f(true);
                    z10 = true;
                }
                if (z10) {
                    org.telegram.messenger.g0.i3(new he(this, str, 5), 200L);
                    return;
                }
                this.I3 = str;
                this.H3 = str;
                boolean contains = str.contains("@");
                f7(true);
                if (!this.actionBar.f27677n0) {
                    this.f43770dd.a(true, true);
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.f43825i0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f43786f0;
                    if (xVar != null) {
                        xVar.e(8);
                    }
                    cr crVar = this.f43772e0;
                    if (crVar != null) {
                        crVar.b(false);
                    }
                    if ((this.f43939r4 == 0 || (i7 = this.f43790f4) == 3 || i7 == 8) && (r0Var = this.f43837j0) != null) {
                        r0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = this.f43896o0;
                    if (r0Var3 != null && this.f43768da) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f43908p0;
                    if (xVar2 != null && this.f43782ea) {
                        xVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = this.f43849k0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = this.f43861l0;
                    if (r0Var5 != null) {
                        r0Var5.setVisibility(8);
                    }
                    this.f43921q0 = true;
                    jd(0, 0, -1);
                    Lc(false);
                }
                ak akVar = this.C1;
                if (akVar != null) {
                    if (akVar.E > 0.5f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        akVar.g(false);
                    }
                }
                ImageView imageView = this.f43815h3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z9 && (!org.telegram.messenger.t3.V(this.f43771e) || !org.telegram.messenger.t3.t0(this.f43771e) || this.I3 == null)) {
                    this.F1 = 0;
                } else {
                    this.F1 = 2;
                }
                this.f43830i5 = false;
                if (this.f43749c4 == 3) {
                    org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(this.currentAccount);
                    a10.f24309b.a();
                    a10.f24310c.a();
                }
                fi.g1 g1Var = this.E1;
                if (g1Var != null) {
                    g1Var.h.clear();
                }
                org.telegram.ui.ActionBar.r0 r0Var6 = this.f43837j0;
                if (r0Var6 != null) {
                    this.Gc = true;
                    r0Var6.F(false);
                    this.Gc = false;
                }
                org.telegram.ui.ActionBar.r0 r0Var7 = this.f43837j0;
                if (r0Var7 != null) {
                    r0Var7.setSearchFieldCaption(null);
                    this.f43837j0.P(str, false);
                    this.f43837j0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745764, null));
                }
                getMediaDataController().X1(this.H3, this.f43842j6, this.f43738b7, this.classGuid, 0, this.f43939r4, false, this.C3, this.D3, false, this.E3);
                cd(0, true);
                this.f43937r2.e(true, true);
                oc(true);
                nj njVar2 = this.D1;
                if (njVar2 != null) {
                    njVar2.b(!contains);
                    ld();
                }
                if ((contains || z9) && this.I3 != null && (njVar = this.D1) != null) {
                    int currentPosition = njVar.f32618a.getCurrentPosition();
                    int i10 = this.F1;
                    if (currentPosition != i10) {
                        this.D1.f32618a.d(i10, i10);
                    }
                }
                org.telegram.messenger.oa.a(this.currentAccount).c(this.I3);
                this.H1.f38193f.O(true);
                View currentView = this.E1.getCurrentView();
                if (currentView instanceof cn) {
                    ((cn) currentView).f44857a.nd(this.I3);
                }
            }
        }
    }

    public final void Db(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7, long j3) {
        long j10;
        String str;
        jj jjVar = this.W1;
        if (jjVar == null) {
            return;
        }
        TLRPC.User user = jjVar.getAdapter().f16799w0;
        if (user != null) {
            j10 = user.f27102id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f26951id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.W1.getAdapter().f16799w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j11 = this.f43842j6;
        org.telegram.messenger.ij ijVar = this.D5;
        org.telegram.messenger.ij ijVar2 = this.f43864l4;
        qm qmVar = this.B5;
        org.telegram.messenger.gz.S(i7, j11, j3, h9(), hashMap, accountInstance, ijVar, ijVar2, W8(), botInlineResult, null, this, qmVar, z9);
        this.Z.setFieldText("");
        B9(false);
        getMediaDataController().v0(j10, false);
    }

    public final void Dc() {
        org.telegram.messenger.g0.d0(this.f44037z0, new bi.b9(5, this, O9()));
    }

    @Override
    public final List E() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.t3.T(this.f43771e)) {
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751613, null)));
            int i7 = this.f43715a;
            if (i7 != 1) {
                if (i7 != 2) {
                    M0 = org.telegram.messenger.hd.M0(2131751610, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131751611, null);
                }
            } else {
                M0 = org.telegram.messenger.hd.M0(2131751612, null);
            }
            arrayList.add(new pg.a(org.telegram.messenger.hd.a0(null, null, 2131751609, M0), new xf(this, 17)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751608, null), new xf(this, 18)));
        }
        if (this.f43785f == null) {
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751618, null)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751617, null), 0.0f, 255.0f, new q0("", 1)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.M0(2131751616, null), 1.0f, 10.0f, new org.telegram.ui.Cells.f2(this)));
        }
        return arrayList;
    }

    public final void E6(org.telegram.messenger.ij ijVar, Integer num) {
        org.telegram.messenger.ij ijVar2 = ijVar.C;
        if (ijVar2 != null) {
            int f12 = ijVar2.f1();
            SparseArray sparseArray = this.G6;
            ArrayList arrayList = (ArrayList) sparseArray.get(f12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(f12, arrayList);
            }
            int f13 = ijVar.f1();
            if (!arrayList.contains(Integer.valueOf(f13))) {
                arrayList.add(Integer.valueOf(f13));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void E7() {
        if (this.l1 == null) {
            return;
        }
        this.Wc = P6(false);
        this.Xc = P6(true);
        this.T.setInputBubbleHeight(this.Wc);
        ad();
        Kc();
        A7();
        x7();
        C7();
        B7();
    }

    public final void E8(org.telegram.messenger.ij r76, java.util.ArrayList r77, java.util.ArrayList r78, java.util.ArrayList r79) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.E8(org.telegram.messenger.ij, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void E9(boolean z9) {
        if (!z9) {
            fi.m3 m3Var = this.A2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = this.f43974u2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            fi.m3 m3Var3 = this.f44001w2;
            if (m3Var3 != null) {
                m3Var3.f(true);
            }
        }
        fi.m3 m3Var4 = this.f44039z2;
        if (m3Var4 != null) {
            m3Var4.f(true);
        }
        fi.m3 m3Var5 = this.f44027y2;
        if (m3Var5 != null) {
            m3Var5.f(true);
        }
        fi.m3 m3Var6 = this.H2;
        if (m3Var6 != null) {
            m3Var6.f(true);
        }
        fi.m3 m3Var7 = this.I2;
        if (m3Var7 != null) {
            m3Var7.f(true);
        }
        fi.m3 m3Var8 = this.B2;
        if (m3Var8 != null) {
            m3Var8.f(true);
        }
        fi.m3 m3Var9 = this.C2;
        if (m3Var9 != null) {
            m3Var9.f(true);
        }
        org.telegram.ui.Components.zo zoVar = this.J2;
        if (zoVar != null) {
            zoVar.f(true);
        }
        fi.m3 m3Var10 = this.X0;
        if (m3Var10 != null) {
            m3Var10.f(true);
        }
        fi.m3 m3Var11 = this.Z0;
        if (m3Var11 != null) {
            m3Var11.f(true);
        }
        fi.m3 m3Var12 = this.Y0;
        if (m3Var12 != null) {
            m3Var12.f(true);
        }
    }

    public final boolean Ea(String str, org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, int i7, int i10) {
        hi.j4 j4Var;
        boolean z9;
        Integer num;
        int parseInt;
        int i11;
        Integer num2;
        TLRPC.TL_forumTopic f10;
        if (this.f43771e == null || str == null || this.f43790f4 != 0) {
            return false;
        }
        if (q1Var != null && (characterStyle != null || i10 != 1)) {
            j4Var = new hi.j4(this, i7, i10, characterStyle, q1Var);
        } else {
            j4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.t3.K(this.f43771e, false) != null) {
                try {
                    if (f43709ld == null) {
                        f43709ld = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f43710md = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f43709ld.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z9 = false;
                        try {
                            if (org.telegram.messenger.t3.O(matcher.group(2), this.f43771e)) {
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
                                    if (org.telegram.messenger.t3.c0(this.f43771e) && i11 != b()) {
                                        return false;
                                    }
                                    this.J7 = true;
                                    if (this.f43790f4 == 2) {
                                        this.f43845j9.T0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int V = LaunchActivity.V(parse);
                                    this.O7 = V;
                                    if (V >= 0) {
                                        this.P7 = parseInt;
                                    }
                                    xb(parseInt, i7, true, 0, false, 0, num, g10, j4Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, true);
                            return z9;
                        }
                    } else {
                        z9 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = f43710md.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.t3.O(matcher2.group(2), this.f43771e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f44007w8 = queryParameter2;
                                        c7(true);
                                        return true;
                                    }
                                    return z9;
                                }
                                return z9;
                            }
                            return z9;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return z9;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (org.telegram.messenger.t3.O(lowerCase, this.f43771e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f43790f4 == 2) {
                            this.f43845j9.T0(intValue3);
                            finishFragment();
                            return true;
                        }
                        xb(intValue3, i7, true, 0, false, 0, null, null, j4Var);
                        return true;
                    }
                    return z9;
                } catch (Exception e12) {
                    e = e12;
                    z9 = false;
                }
            } else {
                try {
                    if (f43711nd == null) {
                        f43711nd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f43711nd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f43771e.f26953id || parseInt3 == 0) {
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
                        if (org.telegram.messenger.t3.c0(this.f43771e) && (f10 = getMessagesController().f24870q7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f43925q4;
                            if (tL_forumTopic == null || tL_forumTopic.f27005id != f10.f27005id) {
                                return false;
                            }
                            return true;
                        }
                        this.J7 = true;
                        if (this.f43790f4 == 2) {
                            this.f43845j9.T0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        xb(parseInt3, i7, true, 0, false, 0, num2, g11, j4Var);
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
            long j3 = this.f43771e.f26953id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Aa(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.J7 = true;
            if (this.f43790f4 == 2) {
                this.f43845j9.T0(intValue9);
                finishFragment();
                return true;
            }
            xb(intValue9, i7, true, 0, false, 0, null, null, j4Var);
            return true;
        }
    }

    public final void Eb(ClipData clipData, boolean z9, int i7) {
        int i10 = 0;
        if (this.F5 != null) {
            while (i10 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    Ib(i7, arrayList, z9);
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
        Ib(i7, arrayList2, z9);
    }

    public final void Ec(boolean z9) {
        if (!getMessagesController().r2(this.f43842j6, b(), null)) {
            if (z9) {
                getNotificationsController().G(this.f43842j6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.v2 C = org.telegram.ui.Components.v4.C(this.f43842j6, b(), this, this.f44022xa);
            boolean T9 = T9();
            C.f28632h0 = T9;
            C.f28637n = T9;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.f43842j6, b(), false);
        if (!z9) {
            org.telegram.ui.Components.hc.z(this, 4, 0, this.f44022xa).j();
        }
    }

    @Override
    public final void F(float f10, int i7) {
        if (i7 == 2 && f10 == 0.0f) {
            sh.b bVar = this.f43811gd;
            if (bVar != null) {
                this.l1.removeView(bVar);
                this.f43811gd = null;
            }
            qj qjVar = this.Z;
            if (qjVar != null) {
                qjVar.H0();
            }
        }
    }

    public final void F6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.F6():void");
    }

    public final void F7() {
        int i7;
        an anVar = this.f44009wa;
        if (anVar != null) {
            anVar.F7();
        }
        int L = org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22538m + ((int) q9(org.telegram.messenger.g0.L(7.0f)));
        ak akVar = this.C1;
        if (akVar != null) {
            i7 = org.telegram.messenger.g0.L(akVar.E * 35.0f);
        } else {
            i7 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(T8() * 43.0f) + L + i7;
        int L3 = org.telegram.messenger.g0.L(60.0f) + ((int) this.f43998w.d());
        bi.q1 q1Var = this.Z3;
        if (q1Var != null) {
            q1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.t20 t20Var = this.H1;
        if (t20Var != null) {
            t20Var.f38192e.setPadding(0, L2, 0, L3);
            t20Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        bi.e5 e5Var = this.Y3;
        if (e5Var != null) {
            lh.f fVar = (lh.f) e5Var.f3761b;
            fVar.setFadeZoneTop(L2);
            fVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.lz lzVar = this.f43923q2;
        if (lzVar != null) {
            lzVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.av0 av0Var = this.f43937r2;
        if (av0Var != null) {
            av0Var.f31922a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.g0.L(32.0f));
        }
    }

    public final int F8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.F8():int");
    }

    public final void F9() {
        ValueAnimator valueAnimator = this.Cb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.t0 t0Var = this.f43886n3;
        if (t0Var != null && t0Var.getTag() != null) {
            this.f43886n3.setTag(null);
            org.telegram.ui.Cells.t0 t0Var2 = this.f43886n3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new te(this, t0Var2, 1));
            ofFloat.addListener(new ah.l(16, this, t0Var2));
            ofFloat.setDuration(150L);
            this.Cb = ofFloat;
            ofFloat.start();
        }
    }

    public final void Fa(org.telegram.messenger.ij ijVar) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = ijVar.f23244k.peer_id;
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
        bundle.putInt("message_id", ijVar.M1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new an(bundle));
        }
    }

    public final void Fb(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        long j10;
        if (t7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, this.f43842j6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = W8();
                b10.O = j3;
                b10.L = z10;
                b10.Q = 0L;
                b10.R = h9();
                b10.T = this.f44004w5;
                org.telegram.messenger.gz.C(this.currentAccount).r0(b10);
                j10 = 0;
            } else {
                j10 = j3;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g((TLRPC.User) obj, this.f43842j6, null, null, null, null, z9, i7, 0);
                g10.K = W8();
                g10.O = j10;
                g10.L = z10;
                g10.Q = 0L;
                g10.R = h9();
                g10.T = this.f44004w5;
                getSendMessagesHelper().r0(g10);
                j10 = 0;
            }
            K6();
        }
    }

    public final void Fc(org.telegram.ui.ActionBar.p0 p0Var, boolean z9) {
        Set set;
        if (p0Var != null) {
            if (z9) {
                set = this.U0;
            } else {
                set = this.T0;
            }
            set.add(p0Var);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G6(org.telegram.messenger.ij ijVar, org.telegram.messenger.ij ijVar2) {
        long E1 = ijVar.E1();
        if (E1 != 0) {
            a0.h hVar = this.M6;
            ArrayList arrayList = (ArrayList) hVar.f(E1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.k5.j(hVar, E1);
            }
            arrayList.add(ijVar);
            if (ijVar2 != null) {
                arrayList.remove(ijVar2);
            }
        }
    }

    public final void G7() {
        int i7;
        float f10 = (1.0f - this.f43758cd.f55394e) * (1.0f - this.f43729ad.f55394e);
        this.f44013x1.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(80.0f));
        this.f44013x1.setAlpha(f10);
        lh.h hVar = this.f44013x1;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hVar.setVisibility(i7);
    }

    public final boolean G9(boolean z9) {
        nk nkVar;
        nk nkVar2 = this.L2;
        if (nkVar2 == null || nkVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.lg lgVar = this.f43717a1;
        if (lgVar != null && (nkVar = this.L2) != null) {
            lgVar.i(nkVar, false, z9);
        }
        int i7 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.V2;
            if (i7 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i7] = null;
                }
                i7++;
            } else {
                this.O2 = false;
                this.L2.setTag(1);
                return true;
            }
        }
    }

    public final void Ga(org.telegram.messenger.ij ijVar) {
        if (org.telegram.messenger.t10.B(this.f43785f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23244k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f43785f.f27102id) {
                l(messageFwdHeader.saved_from_msg_id, ijVar.f1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = ijVar.f23244k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", ijVar.f23244k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new an(bundle));
        }
    }

    public final void Gb(int i7, ArrayList arrayList, boolean z9, boolean z10) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                ?? obj2 = new Object();
                if (!gfVar.f26824b && (str2 = gfVar.h) != null) {
                    obj2.f22493c = str2;
                } else {
                    String str3 = gfVar.I;
                    if (str3 != null) {
                        obj2.f22493c = str3;
                    }
                }
                obj2.f22494e = gfVar.f26825c;
                obj2.f22495f = gfVar.f26828g;
                obj2.f22504p = gfVar.d();
                obj2.f22503o = gfVar.f26824b;
                obj2.f22505q = gfVar.j();
                obj2.f22513z = gfVar.f26833m;
                obj2.A = gfVar.P;
                CharSequence charSequence = gfVar.f26823a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f22497i = gfVar.f26834n;
                obj2.f22498j = gfVar.f26838r;
                obj2.h = gfVar.f26843x;
                obj2.f22499k = gfVar.f26839s;
                obj2.f22506r = gfVar.L;
                obj2.f22511x = gfVar.c();
                arrayList2.add(obj2);
                gfVar.e();
            }
            B8(((org.telegram.messenger.fz) arrayList2.get(0)).d, ((org.telegram.messenger.fz) arrayList2.get(0)).f22497i);
            org.telegram.messenger.gz.X(getAccountInstance(), arrayList2, this.f43842j6, this.D5, this.f43864l4, null, this.B5, z10, true, null, null, z9, i7, 0, ((org.telegram.messenger.fz) arrayList2.get(0)).f22508t, null, W8(), 0L, false, 0L, h9(), this.f44004w5, null, false);
            K6();
            qj qjVar = this.Z;
            if (qjVar != null) {
                qjVar.setFieldText("");
            }
        }
        if (i7 != 0) {
            if (this.f43802g4 == -1) {
                this.f43802g4 = 0;
            }
            this.f43802g4 = arrayList.size() + this.f43802g4;
            id(true);
        }
    }

    public final void Gc(org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return;
        }
        org.telegram.ui.Components.cc ccVar = this.O3;
        if (ccVar != null) {
            ccVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f43965t5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ijVar.f1()));
        int i7 = this.f43750c5;
        getNotificationCenter().k(org.telegram.messenger.qs.f25068t0, Long.valueOf(this.f43842j6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f43750c5 - 1), Boolean.valueOf(this.f43777e5));
        this.O3 = org.telegram.ui.Components.hc.B(this, false, new ai.a1(this, arrayList2, arrayList, i7, 16), new ie(this, ijVar, 7), this.f44022xa).j();
    }

    public final void H6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.d9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f43771e, this.f43785f, null, this.f43842j6, this.Oa, this.Na);
    }

    public final void H7() {
        an anVar = this.f44009wa;
        if (anVar != null) {
            anVar.H7();
        }
        float q92 = q9(org.telegram.messenger.g0.L(7.0f)) + this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(1.0f);
        if (this.f43788f2 != null) {
            q92 += r9(org.telegram.ui.Components.i11.f34460a);
        }
        if (this.C1 != null) {
            q92 += org.telegram.messenger.g0.L(35.0f) * this.C1.E;
        }
        this.Y.setFadeZoneTop((int) ((T8() * org.telegram.messenger.g0.L(43.0f)) + q92));
    }

    public final org.telegram.ui.Cells.z H8(int i7, boolean z9) {
        org.telegram.messenger.ij messageObject;
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            int childCount = ajVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f44037z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    messageObject = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.f1() == i7) {
                    if (z9) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.L9 - this.N9) - org.telegram.messenger.g0.L(4.0f) || childAt.getY() > this.f44037z0.getMeasuredHeight() - this.Ua) {
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

    public final void H9() {
        hk hkVar = this.f44023xb;
        if (hkVar == null) {
            return;
        }
        this.f44023xb = null;
        hkVar.e();
        if (hkVar.getReactionsWindow() != null && hkVar.getReactionsWindow().f6183a != null) {
            hkVar.getReactionsWindow().f6183a.animate().alpha(0.0f).setDuration(180L).start();
        }
        hkVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new qf(14, this, hkVar)).setDuration(180L).start();
    }

    public final void Ha(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Cells.q1 q1Var2;
        boolean z9;
        long j3;
        long j10;
        org.telegram.ui.Components.v5 m10;
        Bitmap m11;
        if (q1Var == null) {
            int childCount = this.f44037z0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f44037z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getMessageObject().T(ijVar)) {
                        break;
                    }
                }
            }
        }
        q1Var2 = q1Var;
        if (org.telegram.messenger.ij.M4(ijVar.f23244k)) {
            Hb(ijVar, true);
        }
        if (org.telegram.messenger.ij.M4(ijVar.f23244k) && !ijVar.E2(true) && org.telegram.messenger.iz.B0 && ijVar.B() && !org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.f23244k)) && !ijVar.f23293x0 && !ijVar.f23289w0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            org.telegram.messenger.w7 fileLoader = getFileLoader();
            TLRPC.Document F0 = ijVar.F0();
            fileLoader.getClass();
            org.telegram.messenger.w7.J.c(new org.telegram.messenger.ng(fileLoader, F0, ijVar, 22));
        }
        PhotoViewer.p1().H2(null, this, this.f44022xa);
        org.telegram.messenger.ij ijVar2 = MediaController.B().f21292u0;
        if (q1Var2 != null && ijVar2 != null && org.telegram.messenger.ij.M4(ijVar2.f23244k)) {
            getFileLoader().c0(ijVar2.F0(), false);
            if (ijVar2.T(ijVar) && (m10 = q1Var2.getPhotoImage().m()) != null && this.K8 != null && this.H8.getTag() != null && (m11 = m10.m()) != null) {
                try {
                    Bitmap bitmap = this.K8.getBitmap(m11.getWidth(), m11.getHeight());
                    new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            MediaController.B().q(true, true, false, ijVar2.T(ijVar));
        }
        if (this.f43790f4 == 1 && (org.telegram.messenger.ij.M4(ijVar.f23244k) || ijVar.D == 1)) {
            PhotoViewer.p1().f41436k4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.K6.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.K6.get(i10);
                if (org.telegram.messenger.ij.M4(ijVar3.f23244k) || ijVar3.D == 1) {
                    arrayList.add(0, ijVar3);
                }
            }
            PhotoViewer.p1().Z1(arrayList, arrayList.indexOf(ijVar), this.f43842j6, 0L, b(), this.Za);
        } else {
            PhotoViewer p12 = PhotoViewer.p1();
            int i11 = ijVar.D;
            long j11 = 0;
            if (i11 != 0) {
                j3 = this.f43842j6;
            } else {
                j3 = 0;
            }
            if (i11 != 0) {
                j10 = this.f43738b7;
            } else {
                j10 = 0;
            }
            if (i11 != 0) {
                j11 = b();
            }
            if (!p12.d2(ijVar, this, j3, j10, j11, this.Za) && z9) {
                getFileLoader().f(ijVar.F0());
            }
        }
        E9(false);
        MediaController.B().f21294v0 = null;
    }

    public final ie Hb(org.telegram.messenger.ij ijVar, boolean z9) {
        int i7;
        boolean z10;
        int i10;
        if (ijVar == null || ijVar.O3() || !ijVar.m4()) {
            return null;
        }
        TLRPC.Message message = ijVar.f23244k;
        if (message.destroyTime != 0 || (i7 = message.ttl) <= 0) {
            return null;
        }
        if (z9) {
            if (i7 != Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i7 == Integer.MAX_VALUE) {
                i10 = 0;
            } else {
                i10 = i7;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i10;
            if (this.h != null) {
                getMessagesController().p3(this.f43842j6, i10, ijVar.f23244k.random_id);
                return null;
            }
            getMessagesController().q3(this.f43842j6, ijVar.f1(), null, i10, 0L, z10);
            return null;
        }
        return new ie(this, ijVar, 1);
    }

    public final void Hc() {
        boolean W9 = W9();
        SparseArray[] sparseArrayArr = this.f43878m6;
        if (!W9) {
            if (this.actionBar.v() && this.f43909p1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f43909p1.c(org.telegram.messenger.hd.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.D0.setText(org.telegram.messenger.hd.M0(2131746214, null));
            this.D0.setAlpha(0.5f);
            this.D0.setEnabled(false);
            return;
        }
        this.D0.setText(org.telegram.messenger.hd.a0(null, null, 2131746215, org.telegram.messenger.hd.G(size, "messages", new Object[0])));
        this.D0.setAlpha(1.0f);
        this.D0.setEnabled(true);
    }

    public final void I6(org.telegram.messenger.ij ijVar, boolean z9) {
        J6(ijVar, z9, true);
    }

    public final void I7() {
        if (this.f43717a1 != null) {
            this.f43717a1.setPadding(org.telegram.messenger.g0.L(7.0f) + ((int) ((1.0f - T8()) * (1.0f - this.f43758cd.f55394e) * l9())), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final org.telegram.ui.Cells.t0 I8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f44037z0 != null && this.C0 != null) {
            for (int i7 = 0; i7 < this.f44037z0.getChildCount(); i7++) {
                View childAt = this.f44037z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (org.telegram.ui.Wallet.n0.I(t0Var.getMessageObject(), wallettransaction)) {
                        return t0Var;
                    }
                }
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.n0.I((org.telegram.messenger.ij) arrayList.get(i10), wallettransaction)) {
                    this.f44037z0.C0();
                    this.B0.h1(this.C0.J + i10, 0);
                    return null;
                } else {
                    i10++;
                }
            }
        }
        return null;
    }

    public final void I9() {
        UndoView undoView = this.M3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.cc ccVar = this.O3;
        if (ccVar != null) {
            ccVar.c(0L, false);
        }
        mk mkVar = this.N3;
        if (mkVar != null) {
            mkVar.d(0, true);
        }
    }

    public final void Ia(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        int i7;
        if (getParentActivity() != null && (q4Var = this.parentLayout) != null && q4Var.getLastFragment() == this && !this.T4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f43771e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f26953id);
            } else {
                bundle.putLong("user_id", this.f43785f.f27102id);
            }
            bundle.putInt("chatMode", 2);
            an anVar = new an(bundle);
            anVar.T4 = new ArrayList(this.T4);
            anVar.V4 = new HashMap(this.V4);
            int size = this.T4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.T4.get(i10);
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.V4.get(num);
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.E6[0].get(num.intValue());
                if (ijVar == null) {
                    ijVar = ijVar2;
                } else if (ijVar2 != null) {
                    ijVar.f23293x0 = ijVar2.f23293x0;
                    ijVar.f23289w0 = ijVar2.f23289w0;
                }
                if (ijVar != null) {
                    anVar.V4.put(num, ijVar);
                    anVar.dd();
                }
            }
            anVar.f43736b5 = this.f43736b5;
            if (this.f43989v4) {
                i7 = this.T4.size();
            } else {
                i7 = this.f43750c5;
            }
            anVar.f43750c5 = i7;
            anVar.f43777e5 = this.f43777e5;
            anVar.f43929q8 = this.f43929q8;
            anVar.f43916p8 = this.f43916p8;
            anVar.f43845j9 = new rk(this, anVar);
            if (z9) {
                presentFragmentAsPreview(anVar);
                r7();
                return;
            }
            presentFragment(anVar, false);
        }
    }

    public final void Ib(int i7, ArrayList arrayList, boolean z9) {
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
            if (!org.telegram.messenger.r2.f25200b) {
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
                        Wb();
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
        C8();
        org.telegram.messenger.gz.V(i7, this.f43842j6, 0L, 0L, 0L, null, null, arrayList2, arrayList3, arrayList4, null, null, null, getAccountInstance(), this.D5, this.f43864l4, this.F5, null, W8(), null, this.B5, null, null, z9, false);
        B9(false);
    }

    public final void Ic() {
        Drawable s02;
        ol olVar = this.l1;
        if (olVar != null && this.f43995va == null) {
            if (this.f44022xa.h == null || olVar.getBackgroundImage() == null) {
                if (this.l1.getBackgroundImage() == null || org.telegram.messenger.g0.Q1()) {
                    if (Q9()) {
                        s02 = this.l1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.k6.s0();
                    }
                    ol olVar2 = this.l1;
                    if (!Q9()) {
                        boolean z9 = org.telegram.ui.ActionBar.k6.f27935i0;
                    }
                    olVar2.U(s02);
                }
            }
        }
    }

    @Override
    public final boolean J() {
        return this.f44033y8;
    }

    public final void J6(org.telegram.messenger.ij r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.J6(org.telegram.messenger.ij, boolean, boolean):void");
    }

    public final void J7() {
        float f10 = this.P9;
        ak akVar = this.C1;
        if (akVar != null) {
            akVar.setTranslationY(f10);
            f10 += org.telegram.messenger.g0.L(35.0f) * this.C1.E;
        }
        nj njVar = this.D1;
        if (njVar != null) {
            njVar.setTranslationY(f10);
        }
        float T8 = (T8() * org.telegram.messenger.g0.L(43.0f)) + f10;
        org.telegram.ui.Components.m11 m11Var = this.f43788f2;
        org.telegram.ui.Components.i11 i11Var = org.telegram.ui.Components.i11.f34460a;
        if (m11Var != null) {
            m11Var.setSideMenuBackgroundMarginTop((T8() * q9(org.telegram.messenger.g0.L(7.0f))) + T8);
            float r92 = r9(i11Var);
            float a10 = a8.j7.a(this.f43758cd.f55394e);
            float T82 = T8();
            T8 += a8.j7.a(Math.min(c8.j9.a(a8.j7.a(a10), 0.0f, 1.0f), c8.j9.a(a8.j7.a(T82), 0.0f, 1.0f))) * r92;
        }
        org.telegram.ui.Components.lg lgVar = this.f43717a1;
        if (lgVar != null) {
            lgVar.setTranslationY((T8 - org.telegram.messenger.g0.L(5.0f)) - (T8() * r9(i11Var)));
        }
    }

    public final void J8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.J8():void");
    }

    public final void J9() {
        boolean z9;
        jd(0, 0, -1);
        getMediaDataController().X1(this.H3, this.f43842j6, this.f43738b7, this.classGuid, 0, this.f43939r4, false, this.C3, this.D3, true, this.E3);
        if (TextUtils.isEmpty(this.H3) && this.E3 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.G3 = z9;
        this.f43921q0 = z9;
        Lc(false);
        md();
    }

    public final void Ja(int i7, boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f26961id);
            } else {
                TLRPC.Chat chat = this.f43771e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f26953id);
                } else {
                    bundle.putLong("user_id", this.f43785f.f27102id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z9) {
                bundle.putInt("converting_toast_from", i7);
                bundle.putBoolean("converting_toast", true);
            }
            an anVar = new an(bundle);
            if (this.f43989v4) {
                qg.d.a(anVar, org.telegram.messenger.xr.a(a(), b()));
            }
            anVar.f43845j9 = new wi(this);
            presentFragment(anVar, false);
        }
    }

    public final void Jb(org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, int i7, boolean z9) {
        boolean z10;
        org.telegram.messenger.dj s9 = s9(ijVar);
        boolean z11 = false;
        if (s9 != null) {
            ArrayList arrayList = s9.d;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (this.f43878m6[i7].indexOfKey(((org.telegram.messenger.ij) arrayList.get(i10)).f1()) < 0) {
                        break;
                    }
                    i10++;
                } else {
                    s9 = null;
                    break;
                }
            }
        }
        if (s9 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.setDrawSelectionBackground(z10);
        if (s9 == null) {
            z11 = true;
        }
        q1Var.k3(true, z11, z9);
    }

    public final void Jc() {
        TLRPC.User user;
        boolean z9;
        if (this.f43825i0 != null && (user = this.f43785f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f43967t8;
            boolean z10 = false;
            if (hVar.m() != 0) {
                boolean z11 = false;
                z9 = false;
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i7);
                    for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
                        if (botCommand.command.toLowerCase().equals("help")) {
                            z11 = true;
                        } else if (botCommand.command.toLowerCase().equals("settings")) {
                            z9 = true;
                        }
                        if (!z9 || !z11) {
                        }
                    }
                }
                z10 = z11;
            } else {
                z9 = false;
            }
            if (z10) {
                this.f43825i0.S(30);
            } else {
                this.f43825i0.t(30);
            }
            if (z9) {
                this.f43825i0.S(31);
            } else {
                this.f43825i0.t(31);
            }
        }
    }

    public final void K6() {
        this.f44004w5 = null;
        if (this.f43939r4 == 0 || this.f43989v4) {
            if (this.f43989v4) {
                this.D5 = this.f43864l4;
            } else {
                this.D5 = null;
            }
            this.B5 = null;
            qj qjVar = this.Z;
            if (qjVar != null) {
                qjVar.l1(null, null, null);
            }
        }
        B9(false);
        if (this.f43790f4 == 0) {
            getMediaDataController().D(this.f43842j6, this.f43939r4, true);
        }
    }

    public final void K7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i7;
        org.telegram.messenger.ij ijVar;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.L6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i10 = 0;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.K6;
                if (i11 >= size) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) sparseArray.valueAt(i11);
                if (ijVar2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(ijVar2.f23244k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = ijVar2.C.f23244k.fwd_from) != null && org.telegram.messenger.ij.C1(messageFwdHeader.saved_from_peer) == this.f43842j6 && (i7 = ijVar2.C.f23244k.fwd_from.channel_post) != 0 && (ijVar = (org.telegram.messenger.ij) this.E6[i10].get(i7)) != null && (messageReplies = ijVar.f23244k.replies) != null) {
                        messageReplies.replies++;
                        ijVar.f23237i1 = true;
                        TLRPC.Message message = ijVar2.f23244k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = i10;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (org.telegram.messenger.ij.C1(ijVar.f23244k.replies.recent_repliers.get(i12)) == org.telegram.messenger.ij.C1(peer)) {
                                ijVar.f23244k.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        ijVar.f23244k.replies.recent_repliers.add(i10, peer);
                        if (!ijVar2.O3()) {
                            ijVar.f23244k.replies.max_id = ijVar2.f1();
                        }
                        org.telegram.messenger.yr messagesStorage = getMessagesStorage();
                        long j3 = this.f43771e.f26953id;
                        int f12 = ijVar.f1();
                        TLRPC.MessageReplies messageReplies2 = ijVar.f23244k.replies;
                        messagesStorage.f26696a.c(new org.telegram.messenger.d8(messagesStorage, f12, j3, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (ijVar.A2()) {
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.N6.f(ijVar.d1());
                            if (djVar != null) {
                                ArrayList arrayList4 = djVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(djVar, djVar.f22009a);
                                int size3 = arrayList4.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    ((org.telegram.messenger.ij) arrayList4.get(i13)).f23237i1 = true;
                                }
                            }
                        } else if (this.C0 != null && (indexOf = arrayList.indexOf(ijVar)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.C0.J));
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
            if (this.C0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        org.telegram.messenger.dj djVar2 = (org.telegram.messenger.dj) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((org.telegram.messenger.ij) jg.g.i(1, djVar2.d));
                        if (indexOf2 >= 0) {
                            jl jlVar = this.C0;
                            if (!jlVar.N) {
                                jlVar.k(indexOf2 + jlVar.J, djVar2.d.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.C0.N) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.C0.g(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final boolean K8() {
        boolean z9;
        org.telegram.messenger.dj currentMessagesGroup;
        int childCount = this.f44037z0.getChildCount();
        HashMap hashMap = null;
        int i7 = 0;
        while (true) {
            z9 = true;
            if (i7 >= childCount) {
                break;
            }
            View childAt = this.f44037z0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = ((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f22010b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f22009a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f22009a), currentMessagesGroup);
                    int indexOf = this.K6.indexOf((org.telegram.messenger.ij) jg.g.i(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        jl jlVar = this.C0;
                        jlVar.k(indexOf + jlVar.J, currentMessagesGroup.d.size());
                        this.f44037z0.setItemAnimator(null);
                    }
                }
            }
            i7++;
        }
        if (!org.telegram.messenger.g0.Q1()) {
            return true;
        }
        if (org.telegram.messenger.g0.P1() && org.telegram.messenger.t0.f25563b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && !q4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z9 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(z9));
        return false;
    }

    public final void K9() {
        if (!this.W9) {
            this.W9 = true;
            ol olVar = this.l1;
            if (olVar != null) {
                olVar.invalidate();
            }
            aj ajVar = this.f44037z0;
            if (ajVar != null) {
                ajVar.invalidate();
            }
        }
        UndoView undoView = this.M3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(r9(org.telegram.ui.Components.i11.f34462c) + this.T.getInputBubbleHeight() + this.f43998w.d() + org.telegram.messenger.g0.L(16.0f));
        }
        J7();
    }

    public final void Ka(TLRPC.Chat chat) {
        boolean z9;
        fi.m3 m3Var = this.J1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
            z9 = true;
        } else {
            z9 = false;
        }
        fi.m3 m3Var2 = this.K1;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.f(true);
            z9 = true;
        }
        if (z9) {
            org.telegram.messenger.g0.i3(new qf(8, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f27677n0) {
            this.f43770dd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var = this.f43825i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f43786f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = this.f43772e0;
            if (crVar != null) {
                crVar.b(false);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f43837j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f43896o0;
            if (r0Var3 != null && this.f43768da) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f43908p0;
            if (xVar2 != null && this.f43782ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f43849k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.f43861l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f43921q0 = true;
            jd(0, 0, -1);
            Lc(false);
            ImageView imageView = this.f43801g3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f43815h3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f43837j0;
        if (r0Var6 != null) {
            this.Gc = true;
            this.f43830i5 = false;
            r0Var6.F(false);
            this.Gc = false;
        }
        zb(chat, null);
        cd(0, true);
    }

    public final void Kb(TLRPC.ChatTheme chatTheme) {
        boolean z9;
        boolean z10;
        if (this.f44022xa != null && this.f43995va == null) {
            ig.b c10 = ig.b.c(chatTheme);
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.currentAccount);
            f10.s(this.f43842j6, ig.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f10.p(chatTheme);
                org.telegram.ui.ActionBar.r3 i7 = f10.i(c10);
                if (i7 == null) {
                    i7 = new org.telegram.ui.ActionBar.r3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i7.k();
                    i7.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.r3 r3Var = i7;
                ym ymVar = this.f44022xa;
                TLRPC.WallPaper wallPaper = ymVar.f52271g;
                if (this.f43792f6 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ymVar.r(r3Var, wallPaper, z10, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                fe feVar = new fe(this, 14);
                String str = c10.f15474b;
                if (c10.b()) {
                    feVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.r3 r3Var2 = (org.telegram.ui.ActionBar.r3) f10.f21959e.get(str);
                    if (r3Var2 != null) {
                        r3Var2.k();
                        feVar.onComplete(r3Var2);
                    } else {
                        feVar.onComplete(null);
                    }
                } else {
                    f10.q(new org.telegram.messenger.c4(c10, feVar), false);
                }
            }
            TLRPC.WallPaper d = f10.d(this.f43842j6);
            ym ymVar2 = this.f44022xa;
            org.telegram.ui.ActionBar.r3 r3Var3 = ymVar2.f52270f;
            if (this.f43792f6 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ymVar2.r(r3Var3, d, z9, null, false);
        }
    }

    public final void Kc() {
        if (this.f43788f2 == null) {
            return;
        }
        this.f43788f2.setSideMenuBackgroundMarginBottom(((this.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(5.0f)) + this.f43998w.d());
    }

    @Override
    public final long L() {
        return this.f43738b7;
    }

    public final void L6(org.telegram.messenger.ij ijVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44022xa);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        if (ijVar.D == 3) {
            u1Var.T = org.telegram.messenger.hd.M0(2131748177, null);
        } else {
            u1Var.T = org.telegram.messenger.hd.a0("NoHandleAppInstalled", null, 2131748204, ijVar.F0().mime_type);
        }
        showDialog(u1Var);
    }

    public final void L7(boolean z9) {
        boolean z10;
        this.K6.clear();
        this.H6.clear();
        this.I6.clear();
        this.f44018x6.clear();
        this.N6.b();
        this.f44003w4 = false;
        jl jlVar = this.C0;
        if (jlVar != null) {
            if (jlVar.f46996x < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc(z10);
        }
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            ajVar.setEmptyView(null);
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.E6[i7].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.P6;
            int[] iArr2 = this.O6;
            if (encryptedChat == null) {
                iArr2[i7] = Integer.MAX_VALUE;
                iArr[i7] = Integer.MIN_VALUE;
            } else {
                iArr2[i7] = Integer.MIN_VALUE;
                iArr[i7] = Integer.MAX_VALUE;
            }
            this.Q6[i7] = Integer.MIN_VALUE;
            this.R6[i7] = 0;
            this.S6[i7] = false;
            this.T6[i7] = false;
            this.U6[i7] = true;
        }
        if (z9) {
            this.W7 = true;
            this.X6 = true;
            this.W6 = true;
            this.Y7 = false;
        }
        this.f43841j5 = false;
        this.K7 = 0;
        this.J7 = false;
        this.f43723a7 = 0;
        this.Z7 = null;
        this.T7 = 0;
        this.U7 = false;
        this.Q7 = false;
        jl jlVar2 = this.C0;
        if (jlVar2 != null && !jlVar2.N) {
            jlVar2.O(false);
        }
    }

    public final void L8(ArrayList arrayList, boolean z9, boolean z10, boolean z11, int i7, long j3) {
        boolean z12;
        if (!arrayList.isEmpty() && t7()) {
            boolean z13 = false;
            if (i7 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f43790f4 == 1) {
                z13 = true;
            }
            if (z12 == z13) {
                this.H9 = true;
                jl jlVar = this.C0;
                if (jlVar != null) {
                    jlVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f43842j6, z9, z10, z11, i7, 0, this.f43864l4, -1, j3, h9(), this.f44004w5);
            org.telegram.ui.Components.v4.q0(q02, this, this.f44022xa);
            if (q02 != 0) {
                org.telegram.messenger.g0.h3(new af(this, 25));
            }
        }
    }

    public final void L9() {
        boolean z9;
        Rect rect;
        if (this.l1 != null) {
            if (this.f43894nb <= 0 && this.f43906ob <= 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            vi viVar = this.f43998w;
            float c10 = viVar.c();
            te.k kVar = viVar.f54454b;
            int max = (int) Math.max(0.0f, (c10 * kVar.f55420a) - org.telegram.messenger.g0.L(29.0f));
            ol olVar = this.l1;
            bi.ec ecVar = olVar.L;
            Rect rect2 = this.f43824hd;
            if (ecVar != null) {
                rect2.set(0, 0, olVar.getMeasuredWidth(), this.l1.getMeasuredHeight() - max);
                this.l1.L.setClipBounds(rect2);
            }
            if (this.f44037z0 != null) {
                rect2.set(0, 0, this.l1.getMeasuredWidth(), this.l1.getMeasuredHeight() - max);
                rect2.offset(0, -this.f44037z0.getTop());
                aj ajVar = this.f44037z0;
                if (ajVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                ajVar.setClipBounds(rect);
            }
            if (this.Y != null) {
                rect2.set(0, 0, this.l1.getMeasuredWidth(), this.l1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(viVar.f54461w, viVar.c() * kVar.f55420a) - org.telegram.messenger.g0.L(29.0f))));
                lh.f fVar = this.Y;
                if (z9) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void La(String str) {
        boolean z9;
        boolean z10;
        String str2;
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var;
        int i10;
        fi.m3 m3Var = this.J1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
            z9 = true;
        } else {
            z9 = false;
        }
        fi.m3 m3Var2 = this.K1;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.f(true);
            z9 = true;
        }
        if (z9) {
            org.telegram.messenger.g0.i3(new he(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f27677n0) {
            this.f43770dd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f43825i0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f43786f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = this.f43772e0;
            if (crVar != null) {
                crVar.b(false);
            }
            if ((this.f43939r4 == 0 || (i10 = this.f43790f4) == 3 || i10 == 8) && (r0Var = this.f43837j0) != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f43896o0;
            if (r0Var3 != null && this.f43768da) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f43908p0;
            if (xVar2 != null && this.f43782ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f43849k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.f43861l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f43921q0 = true;
            jd(0, 0, -1);
            Lc(false);
        }
        if ((this.f43939r4 == 0 || this.f43989v4 || (i7 = this.f43790f4) == 3 || i7 == 8) && !org.telegram.messenger.t10.z(this.f43785f)) {
            if (str == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43830i5 = z10;
            org.telegram.ui.ActionBar.r0 r0Var6 = this.f43837j0;
            if (r0Var6 != null) {
                r0Var6.F(z10);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var7 = this.f43837j0;
        if (r0Var7 != null) {
            r0Var7.P(str, false);
        }
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.H3 = str2;
        mediaDataController.X1(str2, this.f43842j6, this.f43738b7, this.classGuid, 0, this.f43939r4, false, this.C3, this.D3, !TextUtils.isEmpty(str), this.E3);
        cd(0, true);
    }

    public final void Lb(View view, boolean z9) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                Lb(viewGroup.getChildAt(i7), z9);
            }
        }
        if (view != this.f44037z0 && view != this.l1) {
            view.setEnabled(z9);
        }
    }

    public final void Lc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Lc(boolean):void");
    }

    public final void M6(boolean z9, boolean z10) {
        long j3;
        TLRPC.DraftMessage R;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        qm qmVar;
        org.telegram.messenger.ij ijVar;
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message2;
        org.telegram.messenger.ij ijVar2;
        qm qmVar2;
        String str;
        int Y;
        qm qmVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        long j11;
        org.telegram.ui.Components.uy0 uy0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.r5 r5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        TLRPC.Message message3;
        Pair pair;
        Long l11;
        TLRPC.DraftMessage draftMessage;
        if (this.Z != null) {
            int i7 = this.f43790f4;
            char c10 = '\b';
            if (i7 == 0 || i7 == 8 || (i7 == 3 && getUserConfig().e() == c9())) {
                long j13 = 0;
                if (this.f43790f4 == 8) {
                    if (org.telegram.messenger.t3.p0(this.f43771e)) {
                        if (this.f43939r4 == 0 && org.telegram.messenger.t3.A(this.currentAccount, this.f43771e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.uy0 uy0Var2 = null;
                ?? r72 = 0;
                if (R9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f25835r1.f(this.f43842j6);
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
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    long j14 = this.f43842j6;
                    if (this.f43790f4 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f43939r4;
                    }
                    R = mediaDataController.R(j14, j3);
                    l10 = null;
                }
                qj qjVar = this.Z;
                if (R != null) {
                    richMessage = R.rich_message;
                } else {
                    richMessage = null;
                }
                qjVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.pi S = org.telegram.messenger.ui.b0(this.currentAccount).S(this.f43842j6, b());
                if (R != null && (inputReplyTo = R.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.ui mediaDataController2 = getMediaDataController();
                    long j15 = this.f43842j6;
                    if (l10 != null) {
                        j12 = l10.longValue();
                    } else {
                        j12 = this.f43939r4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f25838s1.f(j15);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j12);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z10 || R == null) && this.Z.getFieldText() != null && (this.f43790f4 != 0 || getUserConfig().e() != a() || R == null || this.Bc >= R.date)) {
                    if (z9 && R == null) {
                        this.Z.setFieldText("");
                        this.Z.setEffectId(0L);
                        B9(true);
                    }
                } else if (S != null) {
                    this.Z.setVoiceDraft(S);
                } else if (R != null) {
                    this.Bc = R.date;
                    qj qjVar2 = this.Z;
                    qjVar2.X2 = null;
                    qjVar2.Y2 = !R.no_webpage;
                    if (!R.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(R.message);
                        Collections.sort(R.entities, org.telegram.messenger.ui.d2);
                        int i10 = 0;
                        while (i10 < R.entities.size()) {
                            TLRPC.MessageEntity messageEntity = R.entities.get(i10);
                            boolean z11 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j16 = j13;
                            if (!z11 && !(messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj = new Object();
                                        obj.f38751a |= 1;
                                        org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(obj, r72);
                                        int i11 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var, i11, messageEntity.length + i11, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj2 = new Object();
                                        obj2.f38751a |= 2;
                                        org.telegram.ui.Components.vy0 vy0Var2 = new org.telegram.ui.Components.vy0(obj2, r72);
                                        int i12 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var2, i12, messageEntity.length + i12, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj3 = new Object();
                                        obj3.f38751a |= 8;
                                        org.telegram.ui.Components.vy0 vy0Var3 = new org.telegram.ui.Components.vy0(obj3, r72);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var3, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj4 = new Object();
                                        obj4.f38751a |= 16;
                                        org.telegram.ui.Components.vy0 vy0Var4 = new org.telegram.ui.Components.vy0(obj4, r72);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var4, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.d41 d41Var = new org.telegram.ui.Components.d41(messageEntity.url, uy0Var2);
                                        int i15 = messageEntity.offset;
                                        valueOf.setSpan(d41Var, i15, messageEntity.length + i15, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj5 = new Object();
                                        obj5.f38751a |= 256;
                                        org.telegram.ui.Components.vy0 vy0Var5 = new org.telegram.ui.Components.vy0(obj5, r72);
                                        int i16 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var5, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i17 = messageEntity.offset;
                                        org.telegram.ui.Components.ug0.c(valueOf, i17, messageEntity.length + i17, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Z.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r72);
                                            fontMetricsInt = uy0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            r5Var = new org.telegram.ui.Components.r5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                        } else {
                                            r5Var = new org.telegram.ui.Components.r5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(r5Var, i18, messageEntity.length + i18, 33);
                                    }
                                    uy0Var = uy0Var2;
                                } else {
                                    ?? obj6 = new Object();
                                    obj6.f38751a |= 4;
                                    org.telegram.ui.Components.vy0 vy0Var6 = new org.telegram.ui.Components.vy0(obj6, 0);
                                    int i19 = messageEntity.offset;
                                    org.telegram.messenger.ui.f(vy0Var6, i19, messageEntity.length + i19, valueOf, true);
                                }
                                uy0Var = null;
                            } else {
                                if (z11) {
                                    j11 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j11 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                uy0Var = null;
                                org.telegram.ui.Components.e41 e41Var = new org.telegram.ui.Components.e41(a8.p0.o(j11, ""), 3, null);
                                int i20 = messageEntity.offset;
                                valueOf.setSpan(e41Var, i20, messageEntity.length + i20, 33);
                            }
                            i10++;
                            uy0Var2 = uy0Var;
                            c10 = c11;
                            j13 = j16;
                            r72 = 0;
                        }
                        j10 = j13;
                        qmVar = uy0Var2;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        qmVar = null;
                        str2 = R.message;
                    }
                    this.Z.e1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Z.setSelection(R.message.indexOf(10) + 1);
                        org.telegram.messenger.g0.i3(new ae(this, 5), 700L);
                    }
                    this.Z.setEffectId(R.effect);
                    if (R != null && (suggestedPost = R.suggested_post) != null) {
                        org.telegram.messenger.nj b10 = org.telegram.messenger.nj.b(suggestedPost);
                        this.f44004w5 = b10;
                        gc(b10);
                    }
                    ijVar = this.D5;
                    if (ijVar != null || this.f43864l4 == ijVar) {
                        if (message == null && ((ijVar2 = this.f43864l4) == null || ijVar2.f1() != message.f26974id)) {
                            org.telegram.messenger.ij ijVar3 = new org.telegram.messenger.ij(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.D5 = ijVar3;
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
                                            org.telegram.messenger.ij.B0(ijVar3.f23244k);
                                            ?? obj7 = new Object();
                                            obj7.f49262a = ijVar3;
                                            obj7.f49263b = -1;
                                            obj7.f49264c = -1;
                                            obj7.d = -1;
                                            obj7.f49272m = true;
                                            obj7.e(i23, arrayList);
                                            qmVar3 = obj7;
                                        }
                                        this.B5 = qmVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i21 & 16) != 0) {
                                            i22 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = ijVar3.f23244k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.ij.Y(i22, str, str3)) < 0) {
                                            qmVar2 = qmVar;
                                        } else {
                                            org.telegram.messenger.ij.B0(ijVar3.f23244k);
                                            qmVar2 = new qm(Y, str3.length() + Y, ijVar3);
                                        }
                                        this.B5 = qmVar2;
                                    }
                                }
                            }
                            j7(false);
                            qm qmVar4 = this.B5;
                            if (qmVar4 != null) {
                                fc(this.D5, qmVar4);
                            } else {
                                ec(this.D5);
                            }
                            Lc(false);
                            return;
                        } else if (l10 == null && l10.longValue() != j10 && this.f43771e != null && (f10 = getMessagesController().f24870q7.f(this.f43771e.f26953id, l10.longValue())) != null && (message2 = f10.topicStartMessage) != null) {
                            org.telegram.messenger.ij ijVar4 = new org.telegram.messenger.ij(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.D5 = ijVar4;
                            ijVar4.f23232h1 = f10;
                            ec(ijVar4);
                            Lc(false);
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
                    org.telegram.messenger.nj b102 = org.telegram.messenger.nj.b(suggestedPost);
                    this.f44004w5 = b102;
                    gc(b102);
                }
                ijVar = this.D5;
                if (ijVar != null) {
                }
                if (message == null) {
                }
                if (l10 == null) {
                }
            }
        }
    }

    public final void M7(boolean z9, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.P6;
        if (z9) {
            if (org.telegram.messenger.r2.f25199a) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.X6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                jg.g.s(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i7 = dialog.top_message;
            int i10 = iArr[0];
            if (i7 > i10) {
                this.T7 = Math.max(i10 + 1, dialog.read_inbox_max_id);
            }
            this.U6[0] = false;
            this.V6 = false;
            jl jlVar = this.C0;
            if (jlVar != null && jlVar.F < 0) {
                jlVar.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i11 = dialog2.unread_count;
            this.f44043z6 = i11;
            this.B6 = dialog2.unread_mentions_count;
            if (this.A6 != i11) {
                lh.h hVar = this.f44013x1;
                if (hVar != null) {
                    hVar.c(1, i11, this.f43764d6);
                }
                this.A6 = this.f44043z6;
                Zc();
            }
            int i12 = this.B6;
            int i13 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i12 != i13) {
                this.B6 = i13;
                if (i13 <= 0) {
                    this.B6 = 0;
                    this.C6 = true;
                    nc(false);
                } else {
                    lh.h hVar2 = this.f44013x1;
                    if (hVar2 != null) {
                        hVar2.c(2, i13, true);
                    }
                    nc(true);
                }
            }
            o7(false);
            return;
        }
        this.K6.clear();
        this.f44018x6.clear();
        this.H6.clear();
        this.I6.clear();
        this.N6.b();
        this.f44003w4 = false;
        for (int i14 = 1; i14 >= 0; i14--) {
            this.E6[i14].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.O6;
            if (encryptedChat == null) {
                iArr2[i14] = Integer.MAX_VALUE;
                iArr[i14] = Integer.MIN_VALUE;
            } else {
                iArr2[i14] = Integer.MIN_VALUE;
                iArr[i14] = Integer.MAX_VALUE;
            }
            this.Q6[i14] = Integer.MIN_VALUE;
            this.R6[i14] = 0;
            this.f43878m6[i14].clear();
            this.f43889n6[i14].clear();
            this.f43901o6[i14].clear();
        }
        z9();
        cd(0, true);
        if (this.B8 != null) {
            this.B8 = null;
            qj qjVar = this.Z;
            if (qjVar != null) {
                qjVar.Y0(null, true, false);
            }
        }
        if (this.Q != null) {
            sc(false);
            V7(false);
            this.f44037z0.setEmptyView(this.f43773e1);
        }
        jl jlVar2 = this.C0;
        if (jlVar2 != null) {
            jlVar2.O(false);
        }
        if (this.h == null && (user = this.f43785f) != null && user.bot && this.f43980u8 == null) {
            this.f43980u8 = "";
            Lc(false);
        }
    }

    public final int M8() {
        return this.f43790f4;
    }

    public final void M9() {
        this.Ka = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Ma(TLRPC.User user) {
        boolean z9;
        fi.m3 m3Var = this.J1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
            z9 = true;
        } else {
            z9 = false;
        }
        fi.m3 m3Var2 = this.K1;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.f(true);
            z9 = true;
        }
        if (z9) {
            org.telegram.messenger.g0.i3(new yf(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f27677n0) {
            this.f43770dd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var = this.f43825i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f43786f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = this.f43772e0;
            if (crVar != null) {
                crVar.b(false);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f43837j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f43896o0;
            if (r0Var3 != null && this.f43768da) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f43908p0;
            if (xVar2 != null && this.f43782ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f43849k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.f43861l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f43921q0 = true;
            jd(0, 0, -1);
            Lc(false);
            ImageView imageView = this.f43801g3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f43815h3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f43837j0;
        if (r0Var6 != null) {
            this.Gc = true;
            this.f43830i5 = false;
            r0Var6.F(false);
            this.Gc = false;
        }
        zb(null, user);
        cd(0, true);
    }

    public final void Mb(boolean z9) {
        Nb(z9, false, true);
    }

    public final void Mc() {
        Lc(false);
    }

    @Override
    public final boolean N(ww wwVar) {
        return false;
    }

    public final boolean N6() {
        TLRPC.Chat chat = this.f43771e;
        if (chat == null || ((!chat.forum || !chat.forum_sidebar) && !chat.monoforum)) {
            TLRPC.User user = this.f43785f;
            if (!org.telegram.messenger.t10.u(user) || !user.bot_forum_sidebar) {
                if (!org.telegram.messenger.t10.u(this.f43785f) && !org.telegram.messenger.t3.a(this.f43771e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void N7(boolean z9) {
        for (int i7 = 1; i7 >= 0; i7--) {
            this.f43878m6[i7].clear();
            this.f43889n6[i7].clear();
            this.f43901o6[i7].clear();
        }
        z9();
        cd(0, true);
        Cd(z9);
        pd();
    }

    public final r0.k1 N8(r0.k1 k1Var) {
        di.u2 u2Var;
        r0.a1 w0Var;
        if (k1Var != null && (u2Var = this.X1) != null) {
            if ((u2Var.isShowing() && !this.X1.I) || this.X1.f32969o2) {
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
                w0Var.c(8, i0.b.f15116e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void N9() {
        TLRPC.User user;
        boolean z9;
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f43785f) != null && user.contact_require_premium) {
            boolean isEmpty = this.K6.isEmpty();
            if (getMessagesController().J2(a()) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (isEmpty != z9) {
                getMessagesController().n2(this.classGuid, a());
            }
        }
    }

    public final void Na(long j3) {
        int i7 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f43897o1.e(true, false);
            } else if (getMessagesController().p2(j3)) {
                showDialog(new ii.d0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().E(bundle, this, null, null)) {
                    presentFragment(new an(bundle));
                }
            }
        } else if (j3 != getUserConfig().e()) {
            if (j3 == a()) {
                this.f43897o1.e(true, false);
                return;
            }
            Bundle j10 = a8.p0.j(j3, "user_id");
            if (this.h != null && j3 == this.f43785f.f27102id) {
                j10.putLong("dialog_id", this.f43842j6);
            }
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            TLRPC.User user = this.f43785f;
            if (user != null && user.f27102id == j3) {
                i7 = 1;
            }
            profileActivity.g5(i7);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j3);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void Nb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Nb(boolean, boolean, boolean):void");
    }

    public final void Nc() {
        int i7;
        org.telegram.ui.Components.gb gbVar;
        bk bkVar;
        qj qjVar;
        if (this.W9 && this.f44037z0 != null) {
            float f10 = 0.0f;
            if (this.Ia <= 0 || this.Xa != 0.0f) {
                float q92 = q9(org.telegram.messenger.g0.L(7.0f));
                ak akVar = this.C1;
                if (akVar != null) {
                    i7 = org.telegram.messenger.g0.L(akVar.E * 35.0f);
                } else {
                    i7 = 0;
                }
                float T8 = (T8() * org.telegram.messenger.g0.L(43.0f)) + q92 + i7;
                float f11 = this.L9;
                this.M9 = T8;
                this.L9 = r9(org.telegram.ui.Components.i11.f34460a) + org.telegram.messenger.g0.L(4.0f) + this.O9 + T8;
                if (this.actionBar.getVisibility() == 0 || this.f44009wa != null) {
                    this.L9 += this.actionBar.getMeasuredHeight();
                }
                this.N9 = 0;
                this.L9 = this.L9 + this.Ta + this.P9;
                if (this.Xa != 0.0f && (qjVar = this.Z) != null && qjVar.getVisibility() == 0) {
                    float f12 = this.L9;
                    float measuredHeight = this.Xa * (this.Z.getMeasuredHeight() - org.telegram.messenger.g0.L(44.0f));
                    this.L9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.t0 t0Var = this.f43886n3;
                if (t0Var != null) {
                    t0Var.setTranslationY(((this.f44037z0.getTranslationY() + this.L9) + this.T9) - org.telegram.messenger.g0.L(30.0f));
                    float f13 = this.L9;
                    float f14 = this.T9;
                    this.L9 = f13 + f14;
                    this.N9 = (int) (this.N9 + f14);
                }
                ij ijVar = this.f43863l3;
                if (ijVar != null) {
                    ijVar.setTranslationY((((this.f44037z0.getTranslationY() - f10) + this.L9) + this.R9) - org.telegram.messenger.g0.L(4.0f));
                }
                Pc();
                aj ajVar = this.f44037z0;
                if (ajVar != null && this.B0 != null && this.C0 != null) {
                    int paddingTop = ajVar.getPaddingTop();
                    int paddingBottom = this.f44037z0.getPaddingBottom();
                    B7();
                    if (this.f44037z0.getPaddingTop() != paddingTop || this.f44037z0.getPaddingBottom() != paddingBottom) {
                        M9();
                    }
                    this.f44037z0.setTopGlowOffset((int) ((this.L9 - this.N9) - org.telegram.messenger.g0.L(4.0f)));
                    if (f11 != this.L9) {
                        int childCount = this.f44037z0.getChildCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            }
                            View childAt = this.f44037z0.getChildAt(i10);
                            this.f44037z0.getClass();
                            if (RecyclerView.R(childAt) == this.C0.b() - 1) {
                                float f15 = this.L9;
                                if (childAt.getTop() > f15) {
                                    this.f44037z0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!da() && !this.P4 && this.Z7 != null && this.f44037z0 != null && ((bkVar = this.d2) == null || bkVar.getVisibility() != 0)) {
                        this.f44037z0.scrollBy(0, (int) (f11 - this.L9));
                    }
                }
                this.W9 = false;
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32506w;
                if (ccVar != null && (gbVar = ccVar.f32510e) != null) {
                    gbVar.updatePosition();
                }
                B7();
            }
        }
    }

    public final int O6(int i7) {
        org.telegram.messenger.ij messageObject;
        int i10;
        int height = this.f44037z0.getHeight();
        int i11 = 0;
        long j3 = 0;
        while (true) {
            View T0 = this.f44037z0.T0(i7);
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
                long d12 = messageObject.d1();
                boolean O3 = messageObject.O3();
                if (j3 != 0 && j3 != d12) {
                    break;
                }
                height = Math.min(height, T0.getTop());
                i11 = Math.max(i11, T0.getBottom() - i10);
                if (!O3) {
                    continue;
                } else if (d12 == 0) {
                    break;
                } else {
                    j3 = d12;
                }
            } else {
                continue;
            }
            i7++;
        }
        return Math.max(0, i11 - height);
    }

    public final void O7(boolean z9) {
        this.f43795f9 = z9;
        org.telegram.ui.ActionBar.g1 g1Var = this.f43781e9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
        if (!z9) {
            ValueAnimator valueAnimator = this.Ec;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Ec.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Ec = ofFloat;
            ofFloat.addUpdateListener(new ce(this, 0));
            this.Ec.setDuration(150L);
            this.Ec.start();
        }
    }

    public final TLRPC.ChatFull O8() {
        return this.f43916p8;
    }

    public final boolean O9() {
        if (this.f43788f2 != null && this.f43939r4 == 0) {
            return true;
        }
        return false;
    }

    public final void Oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r10 = org.telegram.messenger.gz.r(1, str);
            PhotoViewer.p1().H2(null, this, this.f44022xa);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str, 0, true, 0, 0);
            gfVar.f26823a = charSequence;
            arrayList.add(gfVar);
            if (PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, false);
            }
            PhotoViewer.p1().e2(arrayList, 0, 0, false, new vk(this, r10, arrayList), this);
            return;
        }
        B8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j3 = this.f43842j6;
        org.telegram.messenger.ij ijVar = this.D5;
        org.telegram.messenger.ij ijVar2 = this.f43864l4;
        qm qmVar = this.B5;
        org.telegram.messenger.gz.b0(0, 0, 0, j3, 0L, 0L, h9(), null, str, null, null, accountInstance, ijVar, ijVar2, this.F5, this.f44004w5, W8(), null, null, null, qmVar, true, false, false);
        K6();
    }

    public final void Ob(int i7, int i10, String str) {
        this.f43739b8 = i7;
        this.f43766d8 = true;
        this.f43780e8 = 0L;
        this.f43794f8 = str;
        this.f43832i8 = i10;
        this.f43753c8 = true;
    }

    public final void Oc(boolean z9) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        org.telegram.messenger.dj djVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.ij ijVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).Y0);
        if (this.f43958sb == null) {
            this.f43958sb = new a0.h();
        }
        a0.h hVar2 = this.f43946rb;
        if (hVar2 == null) {
            this.f43946rb = new a0.h();
        } else {
            hVar2.b();
        }
        this.C0.P.clear();
        this.f43958sb.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.N6;
            arrayList = this.K6;
            z10 = true;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                    if (org.telegram.messenger.ij.B0(ijVar.f23244k) == org.telegram.messenger.ij.B0(ijVar2.f23244k) && ijVar.f1() == ijVar2.f1()) {
                        break;
                    }
                    i10++;
                } else {
                    ijVar = null;
                    break;
                }
            }
            if (ijVar2.f23246k1 == 0) {
                if (ijVar == null) {
                    ijVar2.K(true);
                } else {
                    ijVar2.f23293x0 = ijVar.f23293x0;
                    ijVar2.f23289w0 = ijVar.f23289w0;
                }
            }
            if (ijVar != null) {
                ijVar2.f23250l2 = ijVar.f23250l2;
                if (this.C0.N && ijVar2.f23246k1 != 0) {
                    ijVar.N(ijVar2);
                } else {
                    ijVar2.N(ijVar);
                }
            } else if (ijVar2.f23246k1 == 0) {
                int i11 = f43708kd;
                f43708kd = i11 + 1;
                ijVar2.f23246k1 = i11;
            }
            ijVar2.U2 = null;
            TLRPC.Message message2 = ijVar2.f23244k;
            if (message2 != null) {
                message2.out = true;
            }
            ijVar2.Q3();
            if (ijVar2.A2()) {
                org.telegram.messenger.dj djVar2 = (org.telegram.messenger.dj) hVar.f(ijVar2.e1());
                if (djVar2 == null) {
                    djVar2 = new org.telegram.messenger.dj();
                    djVar2.f22020n = this.f43847jb;
                    long d12 = ijVar2.d1();
                    djVar2.f22009a = d12;
                    hVar.k(djVar2, d12);
                } else if (hVar3 == null || hVar3.h(ijVar2.d1()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(djVar2, ijVar2.d1());
                }
                ArrayList arrayList3 = djVar2.d;
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(djVar2, djVar2.f22009a);
                if (djVar2.d(ijVar2) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList3.size()) {
                            if (((org.telegram.messenger.ij) arrayList3.get(i12)).f1() == ijVar2.f1()) {
                                break;
                            }
                            i12++;
                        } else {
                            arrayList3.add(ijVar2);
                            break;
                        }
                    }
                }
            } else if (ijVar2.e1() != 0) {
                ijVar2.f23244k.grouped_id = 0L;
                ijVar2.f23216e = 0L;
            }
            this.C0.P.add(ijVar2);
            this.f43958sb.k(ijVar2, ijVar2.f1());
            i7++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                org.telegram.messenger.dj djVar3 = (org.telegram.messenger.dj) hVar3.n(i13);
                Collections.sort(djVar3.d, new oe(0));
                djVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.E3 != null && TextUtils.isEmpty(this.H3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i14);
                if (ijVar3 != null && (message = ijVar3.f23244k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= ijVar3.f23244k.reactions.results.size()) {
                            break;
                        } else if (this.E3.f(ijVar3.f23244k.reactions.results.get(i15).reaction)) {
                            arrayList4.add(ijVar3);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
            org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList4.get(i16);
            if (!this.f43958sb.d(ijVar4.f1())) {
                ijVar4.U2 = null;
                TLRPC.Message message3 = ijVar4.f23244k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.C0.P.add(ijVar4);
                this.f43958sb.k(ijVar4, ijVar4.f1());
            }
        }
        int i17 = 0;
        while (i17 < this.C0.P.size()) {
            org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) this.C0.P.get(i17);
            if (ijVar5.A2() && (djVar = (org.telegram.messenger.dj) hVar.f(ijVar5.d1())) != null) {
                ArrayList arrayList5 = djVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) arrayList5.get(size2);
                    if (ijVar6 != ijVar5 && !this.f43958sb.d(ijVar6.f1())) {
                        this.C0.P.add(i17, ijVar6);
                        this.f43958sb.k(ijVar6, ijVar6.f1());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.C0.P, new oe(1));
        org.telegram.messenger.ij ijVar7 = null;
        int i18 = 0;
        while (i18 < this.C0.P.size()) {
            org.telegram.messenger.ij ijVar8 = (org.telegram.messenger.ij) this.C0.P.get(i18);
            if (this.f43847jb && ijVar8 != null && i18 == 0) {
                cb(i18, ijVar8);
                i18++;
            }
            if (!this.f43847jb && ijVar7 != null && ijVar8.X != ijVar7.X) {
                cb(i18, ijVar7);
                i18++;
            }
            a0.h hVar5 = this.f43946rb;
            int i19 = ijVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i19);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.k5.j(this.f43946rb, i19);
            }
            arrayList6.add(ijVar8);
            if (this.f43847jb && ijVar7 != null && i19 != ijVar7.X) {
                cb(i18, ijVar8);
                i18++;
            }
            if (!this.f43847jb && i18 >= this.C0.P.size() - 1) {
                cb(this.C0.P.size(), ijVar8);
                i18++;
            }
            i18++;
            ijVar7 = ijVar8;
        }
        this.C0.O = org.telegram.messenger.ui.b0(this.currentAccount).W1();
        if (z9) {
            this.C0.T();
            this.C0.O(true);
            if (this.C0.N ? getMediaDataController().L0 == 0 || !this.C0.P.isEmpty() : !this.W6 || !arrayList.isEmpty() || this.C0.f46996x >= 0) {
                z10 = false;
            }
            sc(z10);
            if (this.f44037z0 != null) {
                V7(false);
                if (this.C0.N ? !(getMediaDataController().L0 == 0 && this.C0.P.isEmpty()) : !(!this.W6 && arrayList.isEmpty() && this.C0.f46996x < 0)) {
                    this.f43773e1.setVisibility(8);
                    this.f44037z0.setEmptyView(null);
                    return;
                }
                this.f44037z0.setEmptyView(this.f43773e1);
                aj ajVar = this.f44037z0;
                ajVar.K0(ajVar.w1());
            }
        }
    }

    public final float P6(boolean z9) {
        float f10;
        float f11;
        float f12;
        qj qjVar = this.Z;
        float f13 = 0.0f;
        if (qjVar != null) {
            if (z9) {
                f10 = qjVar.f31098o5;
            } else {
                f10 = qjVar.f31093n5;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, org.telegram.messenger.g0.L(44.0f));
        float L = org.telegram.messenger.g0.L(44.0f);
        te.a aVar = this.f43729ad;
        m6.n nVar = this.f43797fd;
        if (z9) {
            if (31 - Integer.numberOfLeadingZeros(nVar.f19917a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(nVar.f19917a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f55395f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) nVar.f19918b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f55394e;
            f12 = f14;
        }
        if (!this.f43835ib && !isInPreviewMode()) {
            return org.telegram.messenger.g0.T1(Math.max(org.telegram.messenger.g0.T1(L, max, f12) * f11, org.telegram.messenger.g0.L(44.0f)), -org.telegram.messenger.g0.L(7.0f), f13);
        }
        return org.telegram.messenger.g0.T1(L, max, f12) * f11;
    }

    public final long P7(org.telegram.messenger.ij ijVar) {
        if (this.f43790f4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.t3.c0(this.f43771e) && !this.f43989v4 && ijVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.f23232h1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f27005id;
            }
            return org.telegram.messenger.ij.c2(this.currentAccount, ijVar.f23244k, org.telegram.messenger.t3.c0(this.f43771e), false);
        }
        return this.f43939r4;
    }

    public final TLRPC.UserFull P8() {
        return this.f43929q8;
    }

    public final void Pa() {
        this.f43778e6 = true;
        this.fragmentBeginToShow = true;
        this.f43905oa = null;
        this.l1.invalidate();
        this.l1.setSkipBackgroundDrawing(false);
        this.f43870la = false;
        this.fragmentView.setAlpha(1.0f);
        this.f43897o1.setTranslationY(0.0f);
        this.f43897o1.getAvatarImageView().setScaleX(1.0f);
        this.f43897o1.getAvatarImageView().setScaleY(1.0f);
        this.f43897o1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Pb(long j3) {
        this.f43939r4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26974id = (int) j3;
        new org.telegram.messenger.ij(this.currentAccount, tL_message, false, false);
    }

    public final void Pc() {
        int i7;
        gj gjVar = this.f43875m3;
        if (gjVar == null) {
            return;
        }
        gjVar.setTranslationX(l9() / 2.0f);
        this.f43875m3.setTranslationY((((this.f44037z0.getTranslationY() + this.L9) + this.S9) - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(28.0f));
        float i10 = Utilities.i(org.telegram.messenger.g0.z1(this.S9, -this.f43875m3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f43875m3.setAlpha(this.f44002w3 * i10);
        gj gjVar2 = this.f43875m3;
        if (this.f44002w3 * i10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        gjVar2.setVisibility(i7);
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i10);
        this.f43875m3.setScaleX(T1);
        this.f43875m3.setScaleY(T1);
    }

    public final boolean Q6(org.telegram.messenger.ij ijVar) {
        if (!U9()) {
            TLRPC.Message message = ijVar.f23244k;
            if ((message == null || !message.noforwards) && !ijVar.h4() && !ijVar.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ArrayList Q8() {
        jl jlVar = this.C0;
        if (jlVar != null) {
            return jlVar.P;
        }
        return null;
    }

    public final boolean Q9() {
        if (!org.telegram.messenger.iz.H0 && !this.f43970tb) {
            return false;
        }
        return true;
    }

    public final void Qa(long j3, boolean z9) {
        if (this.f43788f2 != null && org.telegram.messenger.t10.u(this.f43785f)) {
            this.f43788f2.setAllTopicsHidden(true);
        }
        this.f43751c6.put(j3, 1);
        f8();
        UndoView undoView = this.M3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f43842j6, 0, new lg(this, j3, z9), new bg.j0(this, j3, 3));
        this.C0.O(false);
    }

    public final void Qb(View view) {
        View view2 = this.X8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.t0)) {
                ((org.telegram.ui.Cells.t0) view2).setInvalidateWithParent(null);
            }
            this.X8 = view;
            if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Qc() {
        boolean z9;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f43929q8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f43929q8.send_paid_messages_stars <= 0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f43787f1 != null) {
            if (z9 && this.f43813h1 == null) {
                bi biVar = new bi(getParentActivity(), getResourceProvider(), this);
                this.f43813h1 = biVar;
                c8.ka.b(biVar, 0.02f, 1.2f);
                this.f43813h1.setOnClickListener(new le(this, 12));
            }
            bi biVar2 = this.f43813h1;
            if (biVar2 != null) {
                if (!z9) {
                    biVar2.setVisibility(8);
                    return;
                }
                biVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f43929q8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f43929q8.business_intro.title)) {
                    i7 = 2131749500;
                } else {
                    i7 = 2131749501;
                }
                String a02 = org.telegram.messenger.hd.a0(null, null, i7, org.telegram.messenger.t10.j(this.f43785f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        uw0 uw0Var = new uw0(a02.substring(indexOf, indexOf2));
                        if (uw0Var.f50513c != -1) {
                            uw0Var.f50513c = -1;
                            uw0Var.invalidateSelf();
                        }
                        uw0Var.a(503316480);
                        uw0Var.setBounds(0, 0, uw0Var.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(uw0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f43813h1.setCustomText(spannableStringBuilder);
                this.f43813h1.setOverrideTextMaxWidth(fi.m3.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f43813h1.getParent() != null && (!z9 || this.f43813h1.getParent() != this.f43787f1)) {
                    ((ViewGroup) this.f43813h1.getParent()).removeView(this.f43813h1);
                }
                if (z9) {
                    ViewParent parent = this.f43813h1.getParent();
                    LinearLayout linearLayout = this.f43787f1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f43813h1, c8.ha.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final boolean R6() {
        if (!V9() && !getMessagesController().y2(a())) {
            if ((!getMessagesController().t2(a()) || this.f43989v4) && getMessagesController().N1(a()) <= 0 && this.h == null) {
                uj ujVar = this.f43746c1;
                if (ujVar == null || ujVar.getVisibility() != 0) {
                    if (!da() || this.f43989v4) {
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

    public final void R7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.R7():void");
    }

    public final oi.q R8() {
        an anVar = this.f44009wa;
        if (anVar != null) {
            return anVar.R8();
        }
        return this.glassEngine;
    }

    public final boolean R9() {
        if (!org.telegram.messenger.t3.c0(this.f43771e) || this.f43989v4) {
            if (org.telegram.messenger.t3.p0(this.f43771e) && b() == 0 && !this.f43816h4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean Ra() {
        if (this.T4.size() != 1 || this.f43876m4 == null || ((Integer) this.T4.get(0)).intValue() != this.f43876m4.f1()) {
            return false;
        }
        return true;
    }

    public final void Rb(ArrayList arrayList, TLRPC.Chat chat, int i7, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z9;
        boolean z10;
        this.f43925q4 = tL_forumTopic;
        this.o4 = arrayList;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
        this.f43864l4 = ijVar;
        this.D5 = ijVar;
        this.f44029y4 = i10;
        this.f44041z4 = i11;
        this.A4 = Math.max(1, i10);
        this.f43939r4 = this.f43864l4.f1();
        this.f43953s4 = i7;
        this.f43964t4 = chat;
        if (tL_forumTopic != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f43989v4 = z9;
        org.telegram.messenger.ij ijVar2 = this.D5;
        TLRPC.MessageFwdHeader messageFwdHeader = ijVar2.f23244k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43976u4 = z10;
        if (z9) {
            ijVar2.f23261p = true;
        }
        dd();
        vd(false);
        Lc(false);
    }

    public final void Rc() {
        final long j3;
        int i7;
        boolean z9;
        int i10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a02;
        if (this.f43799g1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.t3.p0(this.f43771e)) {
            if (this.f43771e != null) {
                chat = getMessagesController().v1(this.f43771e.f26953id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f43771e) != null && !org.telegram.messenger.t3.A(this.currentAccount, chat2, 24)) {
                final long j10 = this.f43771e.send_paid_messages_stars;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 > 0) {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131744350, org.telegram.messenger.m5.t(-chat.f26953id), org.telegram.messenger.hd.E(j10, ','));
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131744333, org.telegram.messenger.m5.t(-chat.f26953id));
                }
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(bi.dd.U0(a02, 1.0f, null));
                if (i11 > 0) {
                    str = org.telegram.messenger.hd.M0(2131748471, null);
                }
                this.f43799g1.c(true, true, V2, str, new View.OnClickListener(this) {
                    public final an f48038b;

                    {
                        this.f48038b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                an.E0(j10, this.f48038b);
                                return;
                            default:
                                an.B1(j10, this.f48038b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f43799g1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f43929q8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.pn pnVar = this.f43799g1;
                boolean z10 = !getUserConfig().q();
                if (getMessagesController().D3()) {
                    i10 = 2131748580;
                } else {
                    i10 = 2131748581;
                }
                pnVar.c(z10, false, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i10, org.telegram.messenger.m5.t(this.f43842j6))), org.telegram.messenger.hd.M0(2131748537, null), new bi.l1(8));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.pn pnVar2 = this.f43799g1;
                if (i7 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                pnVar2.c(z9, false, org.telegram.messenger.g0.V2(bi.dd.U0(org.telegram.messenger.hd.a0(null, null, 2131748579, org.telegram.messenger.m5.t(this.f43842j6), org.telegram.messenger.hd.E(this.f43929q8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.hd.M0(2131748471, null), new View.OnClickListener(this) {
                    public final an f48038b;

                    {
                        this.f48038b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                an.E0(j3, this.f48038b);
                                return;
                            default:
                                an.B1(j3, this.f48038b);
                                return;
                        }
                    }
                });
            } else {
                this.f43799g1.c(false, false, null, null, null);
            }
        } else {
            this.f43799g1.c(false, false, null, null, null);
        }
    }

    public final boolean S6() {
        if (this.h == null) {
            uj ujVar = this.f43746c1;
            if (ujVar == null || ujVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void S7() {
        if (this.f43774e2 == null && getParentActivity() != null) {
            d8();
            if (this.f43717a1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f43774e2 = textView;
                textView.setGravity(17);
                this.f43774e2.setTextSize(1, 14.0f);
                this.f43774e2.setTypeface(org.telegram.messenger.g0.o());
                TextView textView2 = this.f43774e2;
                int i7 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.ActionBar.r6.V(textView2, i7, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232477, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131745517, null));
                this.f43774e2.setText(spannableStringBuilder);
                TextView textView3 = this.f43774e2;
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i7));
                int L = org.telegram.messenger.g0.L(3.0f);
                org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(15.0f), r12, L, L, L, L), null, org.telegram.ui.ActionBar.r6.L(0.1f, i7), getResourceProvider());
                this.f43774e2.setOnClickListener(new le(this, 20));
                c8.ka.b(this.f43774e2, 0.04f, 1.5f);
                this.f43717a1.addView(this.f43774e2, c8.ha.r(-1, 36, 83));
                this.f43717a1.h(12, this.f43774e2);
                this.f43717a1.g(this.f43774e2);
            }
        }
    }

    public final org.telegram.messenger.dj S8(long j3) {
        return (org.telegram.messenger.dj) this.N6.f(j3);
    }

    public final boolean S9() {
        return org.telegram.messenger.t10.u(this.f43785f);
    }

    public final void Sa() {
        org.telegram.ui.Cells.q1 q1Var;
        this.f43729ad.a(false, true);
        sh.b bVar = this.f43811gd;
        if (bVar != null && (q1Var = bVar.f55195n) != null && q1Var.getDelegate() != null) {
            bVar.f55195n.getDelegate().s1(bVar.f55195n, false);
        }
        qj qjVar = this.Z;
        if (qjVar != null) {
            qjVar.U0(true, true, false);
            this.Z.X4 = null;
        }
    }

    public final void Sb(ol olVar) {
        if (this.f43825i0 != null && !this.inPreviewMode && !this.f43835ib && this.f44009wa == null && (this.fragmentView instanceof FrameLayout)) {
            ri.f fVar = this.J;
            if (fVar != null) {
                ri.f fVar2 = this.I;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                ri.d dVar = new ri.d(fVar2, fVar);
                dh.c cVar = new dh.c(dVar, dVar, dVar);
                cVar.f8710k = true;
                cVar.f8709j = R8();
                cVar.h = this.f43850k1;
                cVar.f8708i = olVar;
                cVar.f8707g = this.E;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                kVar.W0 = cVar;
                kVar.X0 = dVar;
            }
            this.actionBar.setMenuRise(org.telegram.messenger.g0.L(8.0f));
            this.f43825i0.setSubMenuOverlayProvider(new pe(0, this));
        }
    }

    public final void Sc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Sc(boolean):void");
    }

    public final boolean T6(org.telegram.messenger.ij ijVar) {
        if (this.f43790f4 != 8) {
            if (ijVar != null && org.telegram.messenger.t3.c0(this.f43771e)) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f24870q7.f(this.f43771e.f26953id, org.telegram.messenger.ij.c2(this.currentAccount, ijVar.f23244k, true, false));
                if (this.f43790f4 == 8 || (f10 != null && (!f10.closed || org.telegram.messenger.t3.i(this.currentAccount, this.f43771e, f10)))) {
                    return true;
                }
                return false;
            } else if (ijVar == null || !org.telegram.messenger.t3.p0(this.f43771e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f43771e, 24) || org.telegram.messenger.ij.v1(ijVar.f23244k) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void T7() {
        if (getParentActivity() != null && getParentActivity() != null && this.X1 == null) {
            di.u2 u2Var = new di.u2(this, getParentActivity(), this, this.f44022xa, 2);
            this.X1 = u2Var;
            u2Var.Q1 = a();
            di.u2 u2Var2 = this.X1;
            u2Var2.Z1 = true;
            u2Var2.T3 = new sk(this);
        }
    }

    public final float T8() {
        an anVar = this.f44009wa;
        if (anVar == null) {
            anVar = this;
        }
        nj njVar = anVar.D1;
        if (njVar == null) {
            return 0.0f;
        }
        return njVar.f32619b;
    }

    public boolean T9() {
        if (this.l1.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ta(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar;
        if (this.f43729ad.f55395f && (bVar = this.f43811gd) != null && bVar.f55195n == q1Var) {
            Editable text = bVar.f55190a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.j0) getMessagesController().f24935x7.I.f13555b).f23439c) {
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(this.currentAccount);
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                sh.c attachedMedia = this.f43811gd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(messageObject);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.ij.B0(messageObject.f23244k);
                        messageObject.f1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) n1).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = C.getMediaDataController().W(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof th.d) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((th.d) attachedMedia).f55959c);
                            org.telegram.messenger.gz.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof th.h) {
                            th.h hVar = (th.h) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f55970b, null, null, null, false, false, hVar.f55971c);
                        } else if (attachedMedia instanceof th.f) {
                            tL_inputPollAnswer.input_media = cg.d.h(((th.f) attachedMedia).f55967b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof th.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((th.e) attachedMedia).f55960b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Sa();
                return;
            }
            org.telegram.messenger.g0.F3(this.f43811gd.f55190a);
        }
    }

    public final void Tb() {
        org.telegram.messenger.g0.G3(5.0f, this.f44037z0, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        qj qjVar = this.Z;
        for (int i7 = 0; i7 < qjVar.getChildCount(); i7++) {
            org.telegram.messenger.g0.G3(5.0f, qjVar.getChildAt(i7), null);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
        }
    }

    public final void Tc() {
        org.telegram.messenger.ij ijVar;
        if (this.f43785f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                aj ajVar = this.f44037z0;
                if (ajVar != null) {
                    int childCount = ajVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = this.f44037z0.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            ijVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        } else {
                            ijVar = null;
                        }
                        if (ijVar != null && ijVar.f1() < 0) {
                            long j3 = ijVar.f23244k.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.ij ijVar2 = SecretMediaViewer.f().f41908f0;
            if (ijVar2 != null && !ijVar2.O3()) {
                MediaController.B();
                ijVar2.f1();
            }
        }
    }

    public final void U6(boolean z9) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z10;
        final boolean z11;
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
        boolean z12 = true;
        int i11 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f43771e != null && (this.f43790f4 != 0 || this.f43939r4 != 0 || (chatFull = this.f43916p8) == null || chatFull.ttl_period == 0)) || ((user = this.f43785f) != null && (org.telegram.messenger.t10.x(user) || (this.h == null && ((userFull = this.f43929q8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.p0 p0Var = this.f43759d0;
            if (p0Var != null) {
                p0Var.e(8);
            }
            ui uiVar = this.f43897o1;
            if (uiVar != null) {
                uiVar.f35334a.a(false, z9);
            }
        } else {
            org.telegram.ui.ActionBar.p0 p0Var2 = this.f43759d0;
            if (p0Var2 != null) {
                p0Var2.e(0);
            }
            ui uiVar2 = this.f43897o1;
            if (uiVar2 != null) {
                uiVar2.f35334a.a(true, z9);
            }
        }
        org.telegram.ui.ActionBar.p0 p0Var3 = this.f43972u0;
        if (p0Var3 != null) {
            TLRPC.Chat chat = this.f43771e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p0Var3.e(i10);
        }
        ui uiVar3 = this.f43897o1;
        if (uiVar3 != null) {
            TLRPC.Chat chat2 = this.f43771e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f43785f) != null && user2.linked_community_id != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            uiVar3.setCommunityItemVisible(z10);
            final ui uiVar4 = this.f43897o1;
            TLRPC.Chat chat3 = this.f43771e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ImageView imageView = uiVar4.E;
            ImageView imageView2 = uiVar4.D;
            if (imageView2 != null && imageView != null) {
                uiVar4.m0 = z11;
                float f18 = 1.1f;
                float f19 = 1.0f;
                if (!z9) {
                    int i12 = 4;
                    if (z11) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    imageView2.setVisibility(i7);
                    if (z11) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    imageView2.setAlpha(f14);
                    if (z11) {
                        f15 = 1.1f;
                    } else {
                        f15 = 0.0f;
                    }
                    imageView2.setScaleX(f15);
                    if (!z11) {
                        f18 = 0.0f;
                    }
                    imageView2.setScaleY(f18);
                    if (z11) {
                        i12 = 0;
                    }
                    imageView.setVisibility(i12);
                    if (z11) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    imageView.setAlpha(f16);
                    if (z11) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    imageView.setScaleX(f17);
                    if (!z11) {
                        f19 = 0.0f;
                    }
                    imageView.setScaleY(f19);
                } else {
                    if (z11) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = 1.1f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z11) {
                        f18 = 0.0f;
                    }
                    scaleX.scaleY(f18).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z13 = z11;
                                    kn knVar = uiVar4;
                                    if (!z13) {
                                        knVar.D.setVisibility(4);
                                        return;
                                    } else {
                                        knVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z14 = z11;
                                    kn knVar2 = uiVar4;
                                    if (!z14) {
                                        knVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        knVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                    ViewPropertyAnimator animate2 = imageView.animate();
                    if (z11) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                    if (z11) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                    if (!z11) {
                        f19 = 0.0f;
                    }
                    scaleX2.scaleY(f19).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z13 = z11;
                                    kn knVar = uiVar4;
                                    if (!z13) {
                                        knVar.D.setVisibility(4);
                                        return;
                                    } else {
                                        knVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z14 = z11;
                                    kn knVar2 = uiVar4;
                                    if (!z14) {
                                        knVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        knVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f43897o1.g(encryptedChat2.ttl, z9);
            } else {
                TLRPC.UserFull userFull2 = this.f43929q8;
                if (userFull2 != null) {
                    this.f43897o1.g(userFull2.ttl_period, z9);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f43916p8;
                    if (chatFull3 != null) {
                        this.f43897o1.g(chatFull3.ttl_period, z9);
                    }
                }
            }
        }
        if (this.f43960t0 != null && (chatFull2 = this.f43916p8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.t3.T(this.f43771e)) {
                TLRPC.Chat chat4 = this.f43771e;
                if (!chat4.megagroup || org.telegram.messenger.t3.t0(chat4)) {
                    z12 = false;
                }
            }
            org.telegram.ui.ActionBar.p0 p0Var4 = this.f43960t0;
            if (z12) {
                i11 = 0;
            }
            p0Var4.e(i11);
        }
        s();
    }

    public final void U7(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, boolean z9) {
        xf xfVar;
        if (ijVar == null) {
            SparseArray[] sparseArrayArr = this.f43878m6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f43785f;
        TLRPC.Chat chat = this.f43771e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f43916p8;
        long j3 = this.f43738b7;
        int b10 = (int) b();
        int i7 = this.f43790f4;
        xf xfVar2 = new xf(this, 4);
        if (z9) {
            xfVar = new xf(this, 5);
        } else {
            xfVar = null;
        }
        xf xfVar3 = xfVar;
        org.telegram.ui.Components.v4.y(this, user, chat, encryptedChat, chatFull, j3, ijVar, this.f43878m6, djVar, b10, i7, null, xfVar2, xfVar3, this.f44022xa);
    }

    public final int U8(org.telegram.messenger.ij ijVar, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.E9 == null) {
            this.E9 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount, true, this.Va, this.f44022xa);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E9;
        if (this.f43771e == null && !org.telegram.messenger.t10.B(this.f43785f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        q1Var.f29825e6 = z10;
        org.telegram.ui.Cells.q1 q1Var2 = this.E9;
        int i7 = this.f43790f4;
        if (i7 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var2.f29851g6 = z11;
        if (i7 == 3 && this.f43835ib) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var2.f29865h6 = z12;
        TLRPC.User user = this.f43785f;
        if (user != null && user.bot) {
            z13 = true;
        } else {
            z13 = false;
        }
        q1Var2.f29877i6 = z13;
        if (org.telegram.messenger.t3.T(this.f43771e) && this.f43771e.megagroup) {
            z14 = true;
        }
        q1Var2.f29888j6 = z14;
        this.E9.V6 = O9();
        this.E9.W6 = Z9();
        this.E9.X6 = Y9();
        return this.E9.q0(ijVar, (org.telegram.messenger.dj) this.N6.f(ijVar.d1()), z9);
    }

    public final boolean U9() {
        if (this.f43771e != null) {
            return getMessagesController().o2(this.f43771e);
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f43929q8;
        messagesController.getClass();
        return org.telegram.messenger.qp.K2(userFull);
    }

    public final void Ua(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f10, float f11) {
        org.telegram.messenger.ij messageObject;
        boolean z9;
        boolean z10;
        TLRPC.Message message;
        ch.o0 d = ch.o0.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.t0) {
            messageObject = ((org.telegram.ui.Cells.t0) zVar).getMessageObject();
        } else {
            return;
        }
        org.telegram.messenger.ij ijVar = messageObject;
        Ab(zVar, ijVar, null, null, f10, f11, d, false, false, false, false);
        if (ijVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (ijVar.f23244k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 & z10) {
            boolean z11 = this.C0.N;
            if (z11) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.E6[0].get(ijVar.f1());
                if (ijVar2 != null && (message = ijVar2.f23244k) != null) {
                    message.reactions = ijVar.f23244k.reactions;
                }
            } else if (!z11 && this.E3 != null) {
                Oc(false);
            }
        }
        if (this.C0.N && !ijVar.w2(this.E3)) {
            org.telegram.messenger.dj s9 = s9(ijVar);
            if (s9 != null) {
                ArrayList arrayList = s9.d;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getMediaDataController().M1(((org.telegram.messenger.ij) arrayList.get(i7)).f1());
                }
            } else {
                getMediaDataController().M1(ijVar.f1());
            }
            jg.m1 m1Var = this.f43720a4;
            if (m1Var != null) {
                m1Var.f();
            }
            Oc(true);
        }
    }

    public final void Ub(int i7, org.telegram.messenger.ij ijVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44022xa);
        String M0 = org.telegram.messenger.hd.M0(2131745421, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        TLRPC.User user = this.f43785f;
        if (user != null) {
            if (user.bot) {
                u1Var.T = org.telegram.messenger.hd.M0(2131754069, null);
            } else {
                String i10 = org.telegram.messenger.k5.i(new StringBuilder("+"), getUserConfig().f().phone, pf.b.c());
                TLRPC.User user2 = this.f43785f;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureShareMyContactInfoUser", null, 2131754067, i10, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            u1Var.T = org.telegram.messenger.hd.M0(2131754070, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131745462, null), new jg.a2(this, i7, ijVar, 5));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
    }

    public final void Uc(org.telegram.messenger.ij ijVar, boolean z9) {
        if (this.C0 == null) {
            return;
        }
        getNotificationCenter().d(new bi.u7(this, ijVar, z9, 14));
    }

    public final void V6() {
        if (this.f43835ib) {
            return;
        }
        if (W9()) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final void V7(boolean z9) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        Paint paint;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f43773e1 == null || z9) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f43773e1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f43773e1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.l1.addView(this.f43773e1, 3, c8.ha.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f43773e1.setTranslationX(l9() / 2.0f);
            int i10 = 1;
            String str = null;
            if (this.C0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f43910p2 = textView;
                textView.setText(org.telegram.messenger.hd.M0(2131748209, null));
                this.f43910p2.setTextSize(1, 14.0f);
                this.f43910p2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(this.f43910p2, org.telegram.ui.ActionBar.k6.Wc, getResourceProvider());
                this.f43910p2.setBackground(new org.telegram.ui.ActionBar.w5(this.f43910p2, this.l1, org.telegram.messenger.g0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f43910p2.setTypeface(org.telegram.messenger.g0.o());
                this.f43910p2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(3.0f));
                this.f43773e1.addView(this.f43910p2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (V9()) {
                kg.u1 u1Var = new kg.u1(getParentActivity(), this.f43790f4, this.f43939r4, this.f43776e4, getResourceProvider());
                this.f43826i1 = u1Var;
                int L = org.telegram.messenger.g0.L(24.0f);
                kg.u1 u1Var2 = this.f43826i1;
                ol olVar = this.l1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.k6.f27785a;
                u1Var.setBackground(new org.telegram.ui.ActionBar.w5(u1Var2, olVar, L, themedPaint));
                this.f43773e1.addView(this.f43826i1, c8.ha.e(-2, -2, 17));
                this.f43850k1.d(this.f43826i1, this.l1, new org.telegram.messenger.ch(21), false);
            } else if (this.f43790f4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f43762d4;
                org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.k6.Wc;
                org.telegram.ui.ActionBar.k6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.k6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, c8.ha.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752702, null)));
                linearLayout.addView(textView2, c8.ha.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                kg.y[] yVarArr = kg.y.f17580e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.k6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                textView3.setOnClickListener(new bi.r(19, tL_businessChatLink, this));
                linearLayout.addView(textView3, c8.ha.t(-2, -2, 49, 17, 0, 17, 17));
                this.f43838j1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.f43838j1, this.l1, org.telegram.messenger.g0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f43773e1.addView(this.f43838j1, c8.ha.e(-2, -2, 17));
            } else if ((this.U9 != null && this.f43785f != null && !this.f43883n) || (this.f43929q8 != null && a() != getUserConfig().e() && ((this.f43929q8.contact_require_premium && !getUserConfig().q()) || this.f43929q8.send_paid_messages_stars > bi.ea.y(this.currentAccount, false).p().amount))) {
                this.f43799g1 = new zh(this, getParentActivity(), this.currentAccount, this.U9, this.f44022xa);
                Rc();
                this.f43799g1.setListener(new fe(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f43787f1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f43787f1.setGravity(17);
                this.f43787f1.addView(this.f43799g1, c8.ha.e(-2, -2, 17));
                this.f43773e1.addView(this.f43787f1, c8.ha.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f43929q8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f43799g1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f43799g1.setSticker(this.f43929q8.business_intro.sticker);
                }
                Qc();
            } else if (this.h == null) {
                if (this.f43989v4 && this.f43790f4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    ol olVar2 = this.l1;
                    ym ymVar = this.f44022xa;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.g0.L(18.0f);
                    if (ymVar != null) {
                        paint = ymVar.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.k6.f27785a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.w5(linearLayout3, olVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity2);
                    if (org.telegram.ui.ActionBar.k6.i1(ymVar)) {
                        i7 = org.telegram.ui.ActionBar.k6.Ja;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.Wc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.camera.q.m(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.r6.V(textView4, i7, ymVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
                    textView4.setText(org.telegram.messenger.hd.M0(2131754272, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView5, i7, ymVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
                    textView5.setText(org.telegram.messenger.hd.M0(2131744020, null));
                    linearLayout3.addView(l9Var, c8.ha.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, c8.ha.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, c8.ha.r(-2, -2, 1));
                    TLRPC.Document T = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24467s0).T("🥳");
                    if (T != null) {
                        org.telegram.messenger.rz d = org.telegram.messenger.t5.d(T.thumbs, org.telegram.ui.ActionBar.k6.f27832c7, 0.2f, false);
                        if (d != null) {
                            d.f25386e = 512;
                            d.f25387f = 512;
                        }
                        l9Var.k(org.telegram.messenger.hc.b(T), null, "tgs", d, null);
                    }
                    this.f43773e1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!da() && this.f43790f4 == 0 && (((user2 = this.f43785f) != null && user2.self) || ((chat = this.f43771e) != null && chat.creator && !org.telegram.messenger.t3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    ol olVar3 = this.l1;
                    if (this.f43771e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.ln lnVar = new org.telegram.ui.Components.ln(parentActivity3, olVar3, i10, this.f44022xa);
                    this.f43873m1 = lnVar;
                    this.f43773e1.addView(lnVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f43771e != null) {
                        this.f43873m1.setStatusText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749437, null)));
                    }
                } else {
                    if (da() && this.f43790f4 == 0) {
                        str = this.f43976u4 ? org.telegram.messenger.hd.M0(2131748225, null) : org.telegram.messenger.hd.M0(2131748167, null);
                    } else if (this.f43790f4 == 1) {
                        str = org.telegram.messenger.hd.M0(2131748160, null);
                    } else {
                        TLRPC.User user3 = this.f43785f;
                        if (user3 != null) {
                            long j3 = user3.f27102id;
                            if (j3 != 777000 && j3 != 429000 && j3 != 4244000 && org.telegram.messenger.qp.F2(user3)) {
                                str = org.telegram.messenger.hd.M0(2131749531, null);
                            }
                        }
                        if (this.f43790f4 != 8 && ((user = this.f43785f) == null || user.self || user.deleted || this.f43883n)) {
                            str = org.telegram.messenger.hd.M0(2131748192, null);
                        }
                    }
                    if (str == null) {
                        this.f43799g1 = new ai(this, getParentActivity(), this.currentAccount, this.U9, this.f44022xa);
                        Rc();
                        this.f43799g1.setListener(new fe(this, 5));
                        TLRPC.UserFull userFull2 = this.f43929q8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f43799g1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f43799g1.setSticker(this.f43929q8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f43787f1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f43787f1.setGravity(17);
                        this.f43787f1.addView(this.f43799g1, c8.ha.e(-2, -2, 17));
                        this.f43773e1.addView(this.f43787f1, c8.ha.e(-1, -2, 17));
                        Qc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f43910p2 = textView6;
                    textView6.setText(str);
                    this.f43910p2.setTextSize(1, 14.0f);
                    this.f43910p2.setGravity(17);
                    org.telegram.ui.ActionBar.r6.V(this.f43910p2, org.telegram.ui.ActionBar.k6.Wc, getResourceProvider());
                    this.f43910p2.setBackground(new org.telegram.ui.ActionBar.w5(this.f43910p2, this.l1, org.telegram.messenger.g0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f43910p2.setTypeface(org.telegram.messenger.g0.o());
                    this.f43910p2.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(3.0f));
                    this.f43773e1.addView(this.f43910p2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f43873m1 = new org.telegram.ui.Components.ln(getParentActivity(), this.l1, 0, this.f44022xa);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.f43873m1.setStatusText(org.telegram.messenger.hd.a0(null, null, 2131751134, org.telegram.messenger.t10.j(this.f43785f, true)));
                } else {
                    this.f43873m1.setStatusText(org.telegram.messenger.hd.a0(null, null, 2131751135, org.telegram.messenger.t10.j(this.f43785f, true)));
                }
                this.f43773e1.addView(this.f43873m1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final boolean V9() {
        int i7 = this.f43790f4;
        if (i7 != 5 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final void Va(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Va(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final boolean Vb() {
        if (R9() && this.D5 == null && this.F5 == null) {
            if (this.f43790f4 != 8 && R9() && this.f43771e != null) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f24870q7.f(this.f43771e.f26953id, 1L);
                if (this.f43790f4 != 8) {
                    if (f10 != null) {
                        if (f10.closed && !org.telegram.messenger.t3.i(this.currentAccount, this.f43771e, f10)) {
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

    public final void Vc(org.telegram.messenger.ij ijVar, boolean z9) {
        org.telegram.messenger.ij ijVar2;
        if (this.C0 != null && this.fragmentView != null) {
            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.N6.f(ijVar.d1());
            if (djVar != null) {
                ArrayList arrayList = djVar.d;
                cj cjVar = this.A0;
                if (cjVar != null) {
                    cjVar.V(djVar);
                }
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.messenger.ij) arrayList.get(i7)).K1 = true;
                    if (z9) {
                        ((org.telegram.messenger.ij) arrayList.get(i7)).H = true;
                    }
                }
                this.C0.O(true);
                return;
            }
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.E6[0].get(ijVar.f1());
            if (z9) {
                ijVar.K1 = true;
                ijVar.H = true;
            }
            if (this.C0.N) {
                a0.h hVar = this.f43958sb;
                if (hVar != null) {
                    ijVar2 = (org.telegram.messenger.ij) hVar.f(ijVar.f1());
                } else {
                    ijVar2 = null;
                }
                int indexOf = this.C0.P.indexOf(ijVar2);
                if (ijVar2 != null && z9) {
                    ijVar2.K1 = true;
                    ijVar2.H = true;
                }
                if (indexOf >= 0) {
                    jl jlVar = this.C0;
                    jlVar.g(jlVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.K6.indexOf(ijVar3);
            if (indexOf2 >= 0) {
                jl jlVar2 = this.C0;
                jlVar2.g(jlVar2.J + indexOf2);
            }
        }
    }

    public final void W6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.W6():void");
    }

    public final org.telegram.messenger.hw W8() {
        ?? obj = new Object();
        int i7 = this.f43790f4;
        if (i7 == 9) {
            obj.f19033b = this.Ma;
        }
        if (i7 == 5) {
            String str = this.f43776e4;
            int b92 = b9();
            obj.f19034c = str;
            obj.f19032a = b92;
        }
        return new org.telegram.messenger.hw(obj);
    }

    public final boolean W9() {
        return !TextUtils.isEmpty(this.f43829i4);
    }

    public final void Wa(int i7, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        boolean z10;
        org.telegram.ui.Components.uy0 uy0Var;
        String K0;
        boolean z11;
        boolean z12 = false;
        try {
            K0 = org.telegram.messenger.g0.K0(str, false);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.h != null) {
            if (getMessagesController().G2 == 1) {
            }
            if (z9 && !org.telegram.messenger.g0.J3(str)) {
                if (i7 == 0) {
                    vf.c.r(getParentActivity(), Uri.parse(str), true, true, ka(q1Var, characterStyle));
                    return;
                } else if (i7 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f43993v8 == 0) {
                        z12 = true;
                    }
                    vf.c.r(parentActivity, parse, z12, true, ka(q1Var, characterStyle));
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f43993v8 == 0) {
                        z12 = true;
                    }
                    vf.c.r(parentActivity2, parse2, z12, true, ka(q1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i7 == 0 && i7 != 2) {
                if (i7 == 1) {
                    org.telegram.ui.Components.v4.o0(this, str, true, true, false, false, ka(q1Var, characterStyle), null, this.f44022xa);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.d41) && (uy0Var = ((org.telegram.ui.Components.d41) characterStyle).f32778a) != null && (uy0Var.f38751a & 1024) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.v4.o0(this, str, true, true, true, z10, ka(q1Var, characterStyle), null, this.f44022xa);
            }
        }
        if (getMessagesController().f24764e4.contains(K0)) {
            org.telegram.messenger.gz sendMessagesHelper = getSendMessagesHelper();
            if (i7 != 0 && i7 != 2) {
                z11 = false;
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new org.telegram.messenger.q4(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z11), 2);
                return;
            }
            z11 = true;
            sendMessagesHelper.getClass();
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth2.url = str;
            tL_messages_requestUrlAuth2.flags |= 4;
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth2, new org.telegram.messenger.q4(sendMessagesHelper, tL_messages_requestUrlAuth2, this, str, z11), 2);
            return;
        }
        if (z9) {
        }
        if (i7 == 0) {
        }
        if (!(characterStyle instanceof org.telegram.ui.Components.d41)) {
        }
        z10 = false;
        org.telegram.ui.Components.v4.o0(this, str, true, true, true, z10, ka(q1Var, characterStyle), null, this.f44022xa);
    }

    public final void Wb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.hc.a0(this).t(org.telegram.messenger.hd.M0(2131743834, null), this.f44022xa).j();
    }

    public final void Wc() {
        org.telegram.ui.ActionBar.g1 g1Var;
        int i7;
        if (this.h != null) {
            return;
        }
        aj ajVar = this.f44037z0;
        jj jjVar = this.W1;
        if ((jjVar != null && jjVar.I) || ((g1Var = this.f43781e9) != null && g1Var.isShowing())) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        ajVar.setImportantForAccessibility(i7);
    }

    public final void X6(int i7, View view, boolean z9) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f43729ad.f55394e) * (1.0f - this.Yc.f55394e) * ((float[]) this.f43797fd.f19918b)[i7];
            view.setAlpha(f10);
            if (z9) {
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

    public final boolean X7(android.view.View r97, boolean r98, boolean r99, float r100, float r101, boolean r102, boolean r103, boolean r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.X7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final boolean X9() {
        int i7 = this.f43790f4;
        if (((i7 == 0 && this.f43939r4 == 0) || i7 == 3) && this.f43842j6 == getUserConfig().e() && !W9()) {
            return true;
        }
        return false;
    }

    public final void Xa(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.ij r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.ij r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Xa(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.ij):void");
    }

    public final void Xb(org.telegram.ui.Cells.q1 q1Var) {
        if (getParentActivity() != null && q1Var != null && q1Var.f30080y9 != null && q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().f23244k != null && q1Var.getPrimaryMessageObject().f23244k.via_business_bot_id != 0 && !getMessagesController().f24767e7.getBoolean("bizbothint", false)) {
            getMessagesController().f24767e7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f43932qb) {
                this.f43932qb = true;
                if (this.N1 != null) {
                    return;
                }
                fi.m3 m3Var = new fi.m3(getParentActivity(), 3);
                m3Var.r(true);
                m3Var.K = Layout.Alignment.ALIGN_NORMAL;
                m3Var.d = -1L;
                m3Var.T = true;
                m3Var.f12422e = true;
                m3Var.k(true);
                m3Var.s(8.0f);
                this.N1 = m3Var;
                m3Var.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748597, null)));
                this.N1.l(this.K);
                fi.m3 m3Var2 = this.N1;
                m3Var2.h = fi.m3.a(m3Var2.getText(), this.N1.getTextPaint());
                this.l1.addView(this.N1, c8.ha.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.l1.post(new qf(2, this, q1Var));
            }
        }
    }

    public final void Xc(ArrayList arrayList, boolean z9) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.C0.R((org.telegram.messenger.ij) arrayList.get(i7), false, z9);
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        boolean z9;
        int i10;
        int i11;
        if (i7 == 0) {
            sa();
            return;
        }
        boolean z10 = true;
        int i12 = 4;
        int i13 = 0;
        if (i7 == 1) {
            View view = this.U;
            if (view != null) {
                view.setAlpha(f10);
                View view2 = this.U;
                if (f10 > 0.0f) {
                    i12 = 0;
                }
                view2.setVisibility(i12);
            }
        } else if (i7 == 2) {
            sa();
            G7();
            sh.b bVar = this.f43811gd;
            if (bVar != null) {
                bVar.setAnimatedVisibility(this.f43729ad.f55394e);
            }
        } else {
            int i14 = 8;
            if (i7 == 3) {
                te.a aVar = this.bd;
                float f12 = 1.0f - aVar.f55394e;
                this.f43717a1.setAlpha(f12);
                org.telegram.ui.Components.lg lgVar = this.f43717a1;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                lgVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f55394e;
                org.telegram.ui.Components.m11 m11Var = this.f43788f2;
                if (m11Var != null) {
                    m11Var.setAlpha(f13);
                    org.telegram.ui.Components.m11 m11Var2 = this.f43788f2;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    m11Var2.setVisibility(i13);
                }
            } else if (i7 == 4) {
                bi.e5 e5Var = this.Y3;
                te.a aVar2 = this.f43758cd;
                if (e5Var != null) {
                    float f14 = aVar2.f55394e;
                    e5Var.setAlpha(f14);
                    bi.e5 e5Var2 = this.Y3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    e5Var2.setVisibility(i14);
                }
                if (aVar2.f55394e < 1.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                lh.f fVar = this.Y;
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                fVar.setVisibility(i10);
                z7();
                if (aVar2.f55394e >= 1.0f) {
                    z10 = false;
                }
                aj ajVar = this.f44037z0;
                if (z10) {
                    i12 = 0;
                }
                ajVar.setVisibility(i12);
                G7();
                J7();
                I7();
                this.glassEngine.g();
            } else if (i7 == 5) {
                y7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f10);
                }
            } else if (i7 == 6) {
                D7();
            }
        }
    }

    public final boolean Y6() {
        boolean z9;
        TLRPC.ChatFull chatFull = this.f43916p8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
            ug.i0.w1(this, this.R1, this.S1, this.f43842j6, false);
        }
        return z9;
    }

    public final int Y8(org.telegram.messenger.ij r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Y8(org.telegram.messenger.ij):int");
    }

    public final boolean Y9() {
        org.telegram.ui.Components.m11 m11Var = this.f43788f2;
        if (m11Var != null && m11Var.T && m11Var.f35815a.f55395f) {
            return true;
        }
        return false;
    }

    public final void Ya(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Ya(java.util.ArrayList, boolean):void");
    }

    public final void Yb(boolean z9, boolean z10) {
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
        if (!z9 || this.I0.getTag() == null) {
            if (!z9 && this.I0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.V0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            RadialProgressView radialProgressView = this.I0;
            if (z9) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f17 = 0.1f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V0 = animatorSet2;
                if (z9) {
                    this.I0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.V0;
                    vj vjVar = this.D0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vjVar, property, 0.1f);
                    vj vjVar2 = this.D0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vjVar2, property2, 0.1f);
                    vj vjVar3 = this.D0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vjVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.I0, property, 1.0f), ObjectAnimator.ofFloat(this.I0, property2, 1.0f), ObjectAnimator.ofFloat(this.I0, property3, 1.0f));
                    this.V0.setStartDelay(200L);
                } else {
                    if (this.E0) {
                        obj = this.F0;
                    } else {
                        obj = this.D0;
                    }
                    RadialProgressView radialProgressView2 = this.I0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.I0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.I0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.V0.addListener(new ch.y(28, this, z9));
                this.V0.setDuration(150L);
                this.V0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.I0;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            radialProgressView5.setVisibility(i7);
            RadialProgressView radialProgressView6 = this.I0;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView6.setScaleX(f10);
            RadialProgressView radialProgressView7 = this.I0;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            radialProgressView7.setScaleY(f11);
            this.I0.setAlpha(1.0f);
            vj vjVar4 = this.D0;
            if (!z9 && !this.E0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            vjVar4.setVisibility(i10);
            org.telegram.ui.Components.w70 w70Var = this.F0;
            if (!z9 && this.E0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            w70Var.setVisibility(i11);
            vj vjVar5 = this.D0;
            if (!z9 && !this.E0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            vjVar5.setScaleX(f12);
            org.telegram.ui.Components.w70 w70Var2 = this.F0;
            if (!z9 && this.E0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            w70Var2.setScaleX(f13);
            vj vjVar6 = this.D0;
            if (!z9 && !this.E0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            vjVar6.setScaleY(f14);
            org.telegram.ui.Components.w70 w70Var3 = this.F0;
            if (!z9 && this.E0) {
                f17 = 1.0f;
            }
            w70Var3.setScaleY(f17);
            vj vjVar7 = this.D0;
            if (!z9 && !this.E0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            vjVar7.setAlpha(f15);
            org.telegram.ui.Components.w70 w70Var4 = this.F0;
            if (!z9 && this.E0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            w70Var4.setAlpha(f16);
        }
    }

    public final void Yc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.Yc():void");
    }

    public final void Z6(boolean z9) {
        if (this.f43765d7 == 0) {
            if (z9 && !this.f43779e7.isEmpty()) {
                this.f43765d7 = System.currentTimeMillis();
            } else {
                this.f43765d7 = 1L;
            }
            ba();
            aj ajVar = this.f44037z0;
            if (ajVar != null) {
                ajVar.invalidate();
            }
        }
    }

    public final void Z7() {
        if (this.h == null && this.L2 == null && getParentActivity() != null) {
            nk nkVar = new nk(this, getParentActivity());
            this.L2 = nkVar;
            nkVar.setTag(1);
            this.f43717a1.addView(this.L2, c8.ha.o(-1, 48));
            this.f43717a1.h(1, this.L2);
            this.f43717a1.g(this.L2);
            this.L2.setOnClickListener(new le(this, 17));
            this.L2.setEnabled(!isInPreviewMode());
            this.L2.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            org.telegram.ui.Components.de0 de0Var = new org.telegram.ui.Components.de0(getParentActivity(), this.f44022xa);
            this.N2 = de0Var;
            this.L2.addView(de0Var, c8.ha.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.L2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.T2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.T2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Te));
            this.T2.setTypeface(org.telegram.messenger.g0.o());
            this.L2.addView(this.T2, c8.ha.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i7 = 0; i7 < 2; i7++) {
                zm zmVar = new zm(this, getParentActivity());
                zm[] zmVarArr = this.Q2;
                zmVarArr[i7] = zmVar;
                zmVar.setTextSize(14);
                org.telegram.ui.ActionBar.r6.Y(zmVarArr[i7], org.telegram.ui.ActionBar.k6.Te, getResourceProvider());
                zmVarArr[i7].setTypeface(org.telegram.messenger.g0.o());
                this.L2.addView(zmVarArr[i7], c8.ha.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                ok okVar = new ok(0, getParentActivity(), this);
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.R2;
                k5VarArr[i7] = okVar;
                okVar.setTextSize(14);
                org.telegram.ui.ActionBar.r6.Y(k5VarArr[i7], org.telegram.ui.ActionBar.k6.Ue, getResourceProvider());
                this.L2.addView(k5VarArr[i7], c8.ha.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                pm pmVar = new pm(this, getParentActivity());
                pm[] pmVarArr = this.S2;
                pmVarArr[i7] = pmVar;
                this.L2.addView(pmVar, c8.ha.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                pk pkVar = new pk(getParentActivity());
                pkVar.I = new xh.f();
                pkVar.H = new Path();
                pkVar.J = new float[8];
                org.telegram.ui.Components.l9[] l9VarArr = this.P2;
                l9VarArr[i7] = pkVar;
                pkVar.setBlurAllowed(true);
                l9VarArr[i7].setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                this.L2.addView(l9VarArr[i7], c8.ha.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i7 == 1) {
                    zmVarArr[i7].setVisibility(4);
                    pmVarArr[i7].setVisibility(4);
                    k5VarArr[i7].setVisibility(4);
                    l9VarArr[i7].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.Z2 = imageView;
            imageView.setImageResource(2131232297);
            ImageView imageView2 = this.Z2;
            int i10 = org.telegram.ui.ActionBar.k6.Re;
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView2, i10, resourceProvider, mode);
            ImageView imageView3 = this.Z2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.Z2.setContentDescription(org.telegram.messenger.hd.M0(2131754723, null));
            this.Z2.setVisibility(4);
            this.Z2.setAlpha(0.0f);
            this.Z2.setScaleX(0.4f);
            this.Z2.setScaleY(0.4f);
            ImageView imageView4 = this.Z2;
            int i11 = org.telegram.ui.ActionBar.k6.f28223x7;
            org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.r6.h(i11, 25), getResourceProvider());
            this.L2.addView(this.Z2, c8.ha.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.Z2.setOnClickListener(new le(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.X2 = imageView5;
            imageView5.setImageResource(2131231983);
            org.telegram.ui.ActionBar.r6.t(this.X2, i10, getResourceProvider(), mode);
            this.X2.setScaleType(scaleType);
            this.X2.setVisibility(8);
            this.X2.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f44022xa);
            this.Y2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Y2.setSize(org.telegram.messenger.g0.L(16.0f));
            this.Y2.setStrokeWidth(2.0f);
            this.Y2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Se));
            this.L2.addView(this.Y2, c8.ha.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.R(this.X2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)), null, org.telegram.ui.ActionBar.r6.h(i11, 25), getResourceProvider());
            this.L2.addView(this.X2, c8.ha.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.X2.setOnClickListener(new le(this, 19));
            bd(false);
        }
    }

    public final int Z8() {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        int i7 = 0;
        if (q4Var == null || q4Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i7 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(i7);
                if (f2Var != this && (f2Var instanceof an) && ((an) f2Var).f43842j6 == this.f43842j6) {
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

    public final boolean Z9() {
        org.telegram.ui.Components.m11 m11Var = this.f43788f2;
        if (m11Var != null) {
            return m11Var.f35819c;
        }
        if (org.telegram.messenger.t3.c0(this.f43771e) && N6()) {
            return true;
        }
        return false;
    }

    public final void Za(int i7) {
        boolean z9;
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10 = false;
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
                    this.f43868l8 = q02.getAbsolutePath();
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
                if (org.telegram.messenger.t3.T(this.f43771e) && (tL_chatBannedRights = this.f43771e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                mm0 mm0Var = new mm0(0, z9, true, this);
                if (this.f43790f4 == 9) {
                    mm0Var.G = 1;
                    mm0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.f43771e;
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f43771e.slowmode_enabled) {
                        mm0Var.G = 10;
                        mm0Var.H = true;
                    } else {
                        org.telegram.messenger.ij ijVar = this.F5;
                        if (ijVar != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (ijVar == null) {
                            z10 = true;
                        }
                        mm0Var.G = i10;
                        mm0Var.H = z10;
                    }
                }
                mm0Var.V = new wi(this);
                presentFragment(mm0Var);
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
                        this.f43868l8 = s02.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Zb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131752713, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752714, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751407, null), new ve(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, getResourceProvider());
        }
    }

    public final void Zc() {
        boolean z9;
        boolean z10;
        if (this.f44013x1 == null) {
            return;
        }
        if (this.z9 && !y9() && !this.Z.v0() && !this.f43835ib && (!this.G3 || getMediaDataController().Y0.isEmpty())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (this.f43792f6 != 0 && SystemClock.elapsedRealtime() >= this.f43792f6 + 150) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44026y1 = false;
        } else {
            this.R7 = 0;
            this.f44043z6 = 0;
            z10 = true;
        }
        this.f44013x1.e(1, z9, z10);
    }

    public long a() {
        return this.f43842j6;
    }

    public final void a7(CharSequence charSequence) {
        boolean z9;
        TLRPC.WebPage webPage;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.ij ijVar2 = this.F5;
        if (ijVar2 != null && (message = ijVar2.f23244k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f43990v5 != null && ijVar2 != null) {
            int i7 = ijVar2.D;
            if ((i7 == 0 || i7 == 19) && (webPage = this.W5) != null) {
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
                            if (org.telegram.messenger.mj.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                if (z9) {
                    this.W5 = null;
                    qj qjVar = this.Z;
                    if (qjVar != null) {
                        qjVar.X2 = null;
                        qjVar.Y2 = true;
                    }
                    org.telegram.messenger.mj mjVar = this.f43990v5;
                    if (mjVar != null) {
                        int i10 = this.currentAccount;
                        CharSequence fieldText = qjVar.getFieldText();
                        org.telegram.messenger.ij ijVar3 = this.D5;
                        if (ijVar3 == this.f43864l4) {
                            ijVar = null;
                        } else {
                            ijVar = ijVar3;
                        }
                        mjVar.e(i10, null, fieldText, ijVar, this.B5, this.F5);
                    }
                    x8();
                    z8();
                }
            }
        }
    }

    public final void a8() {
        int i7;
        int i10;
        if (this.f43789f3 == null && getParentActivity() != null) {
            tj tjVar = new tj(this, getParentActivity(), 1);
            this.f43789f3 = tjVar;
            tjVar.setClickable(false);
            this.f43789f3.setWillNotDraw(false);
            this.f43797fd.h(4, false, false);
            this.f43789f3.setClipToPadding(false);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), true, true, true);
            this.f43828i3 = j6Var;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            j6Var.b(0.25f, 280L, xqVar);
            this.f43828i3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f43828i3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(this.f43828i3, org.telegram.ui.ActionBar.k6.f28039nf, getResourceProvider());
            this.f43828i3.setGravity(3);
            this.f43789f3.addView(this.f43828i3, c8.ha.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.V.addView(this.f43789f3, c8.ha.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(getParentActivity(), true, false, true);
            this.j3 = j6Var2;
            j6Var2.b(0.0f, 420L, xqVar);
            this.j3.setScaleProperty(0.7f);
            this.j3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.j3.setGravity(5);
            this.j3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(this.j3, org.telegram.ui.ActionBar.k6.f28049o6, getResourceProvider());
            org.telegram.ui.Components.j6 j6Var3 = this.j3;
            if (this.f43758cd.f55395f) {
                i7 = 2131745819;
            } else {
                i7 = 2131745818;
            }
            j6Var3.setText(org.telegram.messenger.hd.M0(i7, null));
            org.telegram.ui.Components.j6 j6Var4 = this.j3;
            j6Var4.f34901n = false;
            j6Var4.setPadding(org.telegram.messenger.g0.L(15.33f), 0, org.telegram.messenger.g0.L(15.33f), 0);
            this.j3.setOnClickListener(new le(this, 2));
            this.j3.setAlpha(0.5f);
            this.j3.setClickable(false);
            this.f43789f3.addView(this.j3, c8.ha.e(-2, -1, 117));
            org.telegram.ui.Components.j6 j6Var5 = new org.telegram.ui.Components.j6(getParentActivity(), true, true, true);
            this.f43852k3 = j6Var5;
            j6Var5.setGravity(17);
            this.f43852k3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(this.f43852k3, org.telegram.ui.ActionBar.k6.f28078pf, getResourceProvider());
            this.f43852k3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            org.telegram.ui.Components.j6 j6Var6 = this.f43852k3;
            int i11 = org.telegram.ui.ActionBar.k6.f27849d6;
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f27941i6;
            org.telegram.ui.ActionBar.r6.R(j6Var6, org.telegram.ui.ActionBar.k6.i0(themedColor, org.telegram.ui.ActionBar.k6.w(themedColor2, getThemedColor(i12))), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.q(i11, i12), getResourceProvider());
            org.telegram.ui.Components.j6 j6Var7 = this.f43852k3;
            if (this.C0.N) {
                i10 = 2131745884;
            } else {
                i10 = 2131745867;
            }
            j6Var7.setText(org.telegram.messenger.hd.M0(i10, null));
            this.f43852k3.setOnClickListener(new le(this, 3));
            this.f43852k3.setVisibility(8);
            this.f43852k3.setAlpha(0.0f);
            this.f43789f3.addView(this.f43852k3, c8.ha.e(-1, -1, 119));
            TLRPC.Chat chat = this.f43771e;
            if (chat != null && ((!org.telegram.messenger.t3.T(chat) || this.f43771e.megagroup) && this.f43790f4 != 7 && !org.telegram.messenger.t3.p0(this.f43771e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f43815h3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f43815h3.setImageResource(2131232417);
                org.telegram.ui.ActionBar.r6.t(this.f43815h3, org.telegram.ui.ActionBar.k6.f28021mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f43815h3;
                int i13 = org.telegram.ui.ActionBar.k6.f28261z8;
                org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i13), getResourceProvider());
                this.f43789f3.addView(this.f43815h3, c8.ha.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f43815h3.setOnClickListener(new le(this, 4));
                this.f43815h3.setContentDescription(org.telegram.messenger.hd.M0(2131754780, null));
            }
            if (this.f43790f4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f43801g3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f43801g3.setImageResource(2131232076);
                org.telegram.ui.ActionBar.r6.t(this.f43801g3, org.telegram.ui.ActionBar.k6.f28021mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f43801g3;
                int i14 = org.telegram.ui.ActionBar.k6.f28261z8;
                org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i14), getResourceProvider());
                this.f43789f3.addView(this.f43801g3, c8.ha.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f43801g3.setOnClickListener(new le(this, 5));
                this.f43801g3.setContentDescription(org.telegram.messenger.hd.M0(2131749064, null));
            }
        }
    }

    public final int a9() {
        return Math.max(this.f43736b5, this.f43750c5);
    }

    public final boolean aa() {
        if (this.f43861l0 != null && ea()) {
            return true;
        }
        return false;
    }

    public final void ab(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.ab(int):void");
    }

    public final void ac() {
        TLRPC.Chat chat = this.f43771e;
        if (chat != null) {
            if (org.telegram.messenger.t3.n0(chat)) {
                if (org.telegram.messenger.t3.N(this.f43771e)) {
                    j40 j40Var = new j40(a());
                    j40Var.f49462l0 = this;
                    presentFragment(j40Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.t3.w(1, this.f43771e)) {
                rc rcVar = new rc(a());
                rcVar.f49462l0 = this;
                presentFragment(rcVar);
                return;
            } else {
                return;
            }
        }
        this.f43982ua = new org.telegram.ui.Components.vo(this, this.f44022xa);
        this.f44037z0.setOnInterceptTouchListener(new org.telegram.messenger.ch(22));
        Lb(this.l1, false);
        showDialog(this.f43982ua, new ee(this, 1));
    }

    public final void ad() {
        lh.h hVar = this.f44013x1;
        vi viVar = this.f43998w;
        if (hVar != null) {
            this.f44013x1.setTranslationY((((-viVar.d()) - this.T.getInputBubbleHeight()) - r9(org.telegram.ui.Components.i11.f34462c)) - org.telegram.messenger.g0.L(13.0f));
        }
        if (this.f43936r1 != null) {
            this.f43936r1.setTranslationY((-viVar.d()) - org.telegram.messenger.g0.L(16.0f));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28005lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28088q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28053oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28035na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28000la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27982ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27962ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27858dg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28192vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28117rf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28154tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28135sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27986kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28204w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28211wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28187v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28168u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28092q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28072p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28052o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27981k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28017m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27943i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27961j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27795a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28003ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28247yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27926ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27908ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27872ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27876ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27913gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27893ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27947id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28266ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28248ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28264zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28229xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28246yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28210we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28173ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28190vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28153te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28171uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28134se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28151tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28116re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28097qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28114rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28077pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28095qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28057oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28075pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28055oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28020me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28037nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27966je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27985ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27948ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27964jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27930he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27946ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27912ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27928hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27798ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27875ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27856de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27818bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27837cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27800ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27839ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27819be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27873ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27984kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28265zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28228xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28209wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28191vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28172ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28152td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28093qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28109r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28208wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28133sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28115rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28096qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28076pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28056od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28038nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28019md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27929hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27911gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28263zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28245yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28227xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27799ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28074pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28054ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28051o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28033n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28016m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27998l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27980k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27960j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27942i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27855dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27838cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
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
        if (!this.f43989v4 && (i7 = this.f43790f4) != 3 && i7 != 5 && i7 != 8) {
            return 0L;
        }
        return this.f43939r4;
    }

    public final void b7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.b7():void");
    }

    public final void b8() {
        if (this.f43937r2 == null && this.H1 == null) {
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(getParentActivity(), this.f44022xa);
            this.f43923q2 = lzVar;
            lzVar.setViewType(7);
            org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(getParentActivity(), this.f43923q2, 1, null);
            this.f43937r2 = av0Var;
            av0Var.setClickable(true);
            this.f43937r2.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
            this.f43937r2.setVisibility(8);
            this.f43937r2.addView(this.f43923q2, 0);
            this.f43937r2.e(true, false);
            this.Y3.addView(this.f43937r2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.H1 = t20Var;
            t20Var.setOnHashtagClickListener(new ne(this, 3));
            this.H1.setOnScrollListener(new g3(this, 6));
            this.H1.setVisibility(8);
            this.Y3.addView(this.H1, -1, -1);
            F7();
            D7();
        }
    }

    public final int b9() {
        if (this.f43790f4 == 5) {
            return (int) this.f43939r4;
        }
        return 0;
    }

    public final boolean ba() {
        boolean z9;
        boolean z10;
        float f10;
        FrameLayout frameLayout;
        if (!this.f43744c && !this.d && this.f43785f == null && this.f44037z0 != null && org.telegram.messenger.iz.c()) {
            if (this.Eb == null) {
                this.Eb = Boolean.valueOf(org.telegram.messenger.rc.e(360928));
            }
            if (this.Eb.booleanValue()) {
                int i7 = Integer.MAX_VALUE;
                int i10 = 0;
                for (int i11 = 0; i11 < this.f44037z0.getChildCount(); i11++) {
                    i10 += this.f44037z0.getChildAt(i11).getHeight();
                    int top = this.f44037z0.getChildAt(i11).getTop();
                    if (top < i7) {
                        i7 = top;
                    }
                }
                float f11 = i7;
                if (f11 <= this.L9) {
                    Z6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.S6;
                boolean z11 = zArr[0];
                ArrayList arrayList = this.K6;
                if ((!z11 || ((this.f43738b7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.W6 && f11 > this.L9 && (!arrayList.isEmpty() ? i10 != 0 : this.Db)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 || !this.inTransitionAnimation || (frameLayout = this.f43773e1) == null || frameLayout.getVisibility() != 0 || this.f43773e1.getChildCount() <= 0) {
                    if (!z9 && this.f43765d7 == 0) {
                        Z6(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.iz.o() != 0 && !this.f43859ka && this.fragmentBeginToShow) {
                        if (z9 && this.f43765d7 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Drawable m10 = this.f44022xa.m();
                        ol olVar = this.l1;
                        if (olVar != null) {
                            m10 = olVar.getBackgroundImage();
                        }
                        if (m10 instanceof org.telegram.ui.Components.qa0) {
                            org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) m10;
                            if (qa0Var.N != z10) {
                                if (!z10) {
                                    qa0Var.c();
                                }
                                float f12 = 1.0f;
                                if (!z10 && qa0Var.N) {
                                    qa0Var.h = 1.0f - ((qa0Var.h - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
                                    qa0Var.d = true;
                                }
                                qa0Var.N = z10;
                                if (z10) {
                                    f12 = 1.5f;
                                }
                                qa0Var.M = f12;
                                qa0Var.y();
                            } else if (z10) {
                                qa0Var.y();
                            }
                        }
                    }
                    if (z9 || (this.f43765d7 != 0 && System.currentTimeMillis() - this.f43765d7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean bb(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f43993v8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f43785f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f43993v8 == this.f43842j6) {
            this.f43993v8 = 0L;
            this.Z.setFieldText(str);
            return true;
        }
        getMediaDataController().Q1(this.f43993v8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((f2Var instanceof an) && ((an) f2Var).f43842j6 == this.f43993v8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.m5.C(this.f43993v8)) {
                bundle.putInt("enc_id", (int) (this.f43993v8 & 4294967295L));
            } else if (org.telegram.messenger.m5.E(this.f43993v8)) {
                bundle.putLong("user_id", this.f43993v8);
            } else {
                bundle.putLong("chat_id", -this.f43993v8);
            }
            H6();
            presentFragment(new an(bundle), true);
        }
        return true;
    }

    public final void bc(boolean z9, org.telegram.messenger.ij ijVar, ArrayList arrayList, TLRPC.WebPage webPage, boolean z10, int i7, qm qmVar, boolean z11, long j3, boolean z12) {
        cc(z9, ijVar, null, arrayList, webPage, z10, i7, qmVar, z11, j3, null, z12);
    }

    public final void bd(boolean z9) {
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Integer num;
        boolean z16;
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
        if ((!da() || this.f43989v4) && this.Z2 != null) {
            if (!this.f43778e6) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (this.T4.size() > 1 && !this.W2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.Z2.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.Y2.getTag() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.X2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (objArr == null && !this.f43743bc && !this.W2) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr != null && !this.f43743bc && !this.W2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.f43743bc && !this.W2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (objArr2 == objArr && z11 == z15 && z12 == z13) {
                z16 = false;
            } else {
                AnimatorSet animatorSet = this.f43719a3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f43719a3 = null;
                }
                if (z10) {
                    if (objArr != null) {
                        this.Z2.setVisibility(0);
                    } else if (z13) {
                        this.X2.setVisibility(0);
                    }
                    if (z15) {
                        this.Y2.setVisibility(0);
                        this.Y2.setAlpha(0.0f);
                        this.Y2.setScaleX(0.4f);
                        this.Y2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.f43719a3 = animatorSet2;
                    ImageView imageView = this.Z2;
                    Property property = View.ALPHA;
                    if (z14) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.Z2;
                    Property property2 = View.SCALE_X;
                    if (z14) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.Z2;
                    Property property3 = View.SCALE_Y;
                    if (z14) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.4f;
                    }
                    z16 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f21);
                    ImageView imageView4 = this.X2;
                    if (z13) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f22);
                    ImageView imageView5 = this.X2;
                    if (z13) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f23);
                    ImageView imageView6 = this.X2;
                    if (z13) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f24);
                    RadialProgressView radialProgressView = this.Y2;
                    if (!z15) {
                        f25 = 0.0f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f25);
                    RadialProgressView radialProgressView2 = this.Y2;
                    if (!z15) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f26);
                    RadialProgressView radialProgressView3 = this.Y2;
                    if (!z15) {
                        f27 = 0.4f;
                    } else {
                        f27 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f27));
                    this.f43719a3.setInterpolator(org.telegram.ui.Components.xq.h);
                    this.f43719a3.setDuration(360L);
                    this.f43719a3.addListener(new al(this, z13, z14, z15));
                    this.f43719a3.start();
                } else {
                    num = 1;
                    z16 = false;
                    ImageView imageView7 = this.X2;
                    if (z13) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView7.setAlpha(f10);
                    ImageView imageView8 = this.X2;
                    if (z13) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView8.setScaleX(f11);
                    ImageView imageView9 = this.X2;
                    if (z13) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.4f;
                    }
                    imageView9.setScaleY(f12);
                    ImageView imageView10 = this.X2;
                    if (z13) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    imageView10.setVisibility(i7);
                    ImageView imageView11 = this.Z2;
                    if (z14) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.Z2;
                    if (z14) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.Z2;
                    if (z14) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.Z2;
                    if (z14) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView14.setVisibility(i10);
                    RadialProgressView radialProgressView4 = this.Y2;
                    if (z15) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f16);
                    RadialProgressView radialProgressView5 = this.Y2;
                    if (z15) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f17);
                    RadialProgressView radialProgressView6 = this.Y2;
                    if (z15) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f18);
                    RadialProgressView radialProgressView7 = this.Y2;
                    if (z15) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    radialProgressView7.setVisibility(i11);
                }
                ImageView imageView15 = this.X2;
                if (z13) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.Z2;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.Y2;
                if (z15) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.N2 != null) {
                if (da() && !this.f43989v4) {
                    boolean z17 = z16;
                    this.N2.c(z17 ? 1 : 0, 1, z17);
                    return;
                }
                this.N2.c((this.T4.size() - 1) - Collections.binarySearch(this.T4, Integer.valueOf(this.X4), Comparator$CC.reverseOrder()), this.T4.size(), z10);
            }
        }
    }

    @Override
    public final boolean c() {
        if (this.f43790f4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z9) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.r3 r3Var = this.f43880m8;
        if (r3Var != null && (((str = this.f44007w8) != null || this.f44020x8) && this.f43764d6)) {
            org.telegram.ui.Components.voip.y1.l(this.f43771e, str, this.f43903o8, Boolean.valueOf(!r3Var.f25209b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f44007w8 = null;
            this.f44020x8 = false;
            return;
        }
        if (this.f44007w8 != null && z9 && (chatFull = this.f43916p8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.o(null, 2131748912, org.telegram.ui.Components.hc.a0(this), 2131624079, 36);
            this.f44007w8 = null;
        }
        this.f43891n8 = !this.f43764d6;
    }

    public final TextureView c8(boolean z9) {
        if (this.parentLayout == null) {
            return null;
        }
        org.telegram.messenger.g0.r(this.M8);
        if (this.H8 == null) {
            tj tjVar = new tj(this, getParentActivity(), 2);
            this.H8 = tjVar;
            tjVar.setOutlineProvider(new fh.a(this, 1));
            this.H8.setClipToOutline(true);
            this.H8.setWillNotDraw(false);
            j4 j4Var = new j4(getParentActivity());
            this.J8 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z9) {
                this.H8.addView(this.J8, c8.ha.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.K8 = textureView;
            textureView.setOpaque(false);
            this.J8.addView(this.K8, c8.ha.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.H8.getParent();
        if (viewGroup != null && viewGroup != this.l1) {
            viewGroup.removeView(this.H8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.l1.addView(this.H8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.g0.g3(Z9(), Q9()), org.telegram.messenger.g0.g3(Z9(), Q9())));
        }
        this.H8.setTag(null);
        this.J8.setDrawingReady(false);
        return this.K8;
    }

    public final long c9() {
        if (this.f43790f4 == 3) {
            return this.f43939r4;
        }
        return 0L;
    }

    public final boolean ca() {
        if (getUserConfig().e() == a() && !getMessagesController().G1().f26206b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.s01 s01Var;
        wh.i iVar;
        org.telegram.ui.Components.ud udVar;
        if ((this.f43790f4 != 5 || (!this.K6.isEmpty() && this.f43939r4 != 0)) && (((s01Var = this.m0) == null || (s01Var.f37835y <= 0.0f && !s01Var.U)) && !this.f43981u9 && !this.f43758cd.f55395f && this.G9)) {
            qj qjVar = this.Z;
            if (!qjVar.F2 && ((!qjVar.f31025c1 || (udVar = qjVar.f31037e1) == null || udVar.getVisibility() != 0) && ((!qjVar.g0() || !qjVar.f31078l0.f15041w) && !org.telegram.ui.ActionBar.f2.hasSheets(qjVar.P2) && this.f43808ga == 0.0f && ((iVar = this.f43931qa) == null || !iVar.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(int i7, org.telegram.messenger.ij ijVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.u(ijVar.f23244k.date, false);
        tL_message.f26974id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ijVar.f23244k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.currentAccount, tL_message, false, false);
        ijVar2.D = 10;
        ijVar2.U = 1;
        ijVar2.f23241j0 = true;
        ijVar2.f23246k1 = o9(ijVar.X);
        this.C0.P.add(i7, ijVar2);
    }

    public final void cc(boolean r32, org.telegram.messenger.ij r33, org.telegram.messenger.ij r34, java.util.ArrayList r35, org.telegram.tgnet.TLRPC.WebPage r36, boolean r37, int r38, org.telegram.ui.qm r39, boolean r40, long r41, org.telegram.messenger.nj r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.cc(boolean, org.telegram.messenger.ij, org.telegram.messenger.ij, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.qm, boolean, long, org.telegram.messenger.nj, boolean):void");
    }

    public final void cd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.cd(int, boolean):void");
    }

    @Override
    public final android.view.View createView(android.content.Context r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        org.telegram.messenger.ez d = org.telegram.messenger.ez.d(messageMedia, this.f43842j6, this.D5, this.f43864l4, null, null, z9, i10);
        d.K = W8();
        d.Q = j3;
        d.R = h9();
        d.T = this.f44004w5;
        getSendMessagesHelper().r0(d);
        if (this.f43790f4 == 0) {
            oa(false);
        }
        if (i7 == 0 || i7 == 1) {
            K6();
        }
        if (this.G5) {
            this.f43804g6 = true;
        }
    }

    public final void d7() {
        TLRPC.ChatFull N0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        if (this.M1 == null && org.telegram.messenger.t3.n0(this.f43771e) && (N0 = getMessagesController().N0(this.f43771e.f26953id)) != null && this.Z != null && getParentActivity() != null && (stickerSet = N0.emojiset) != null) {
            uj ujVar = this.f43746c1;
            if (ujVar == null || ujVar.getVisibility() != 0) {
                org.telegram.ui.Components.z20 z20Var = org.telegram.ui.Components.z20.f40846n;
                if (z20Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (Y = getMediaDataController().Y(stickerSet)) != null && !Y.documents.isEmpty()) {
                        j3 = Y.documents.get(0).f26959id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        z20Var.b();
                        fi.m3 m3Var = new fi.m3(getParentActivity(), 3);
                        this.M1 = m3Var;
                        m3Var.k(true);
                        this.M1.r(true);
                        fi.m3 m3Var2 = this.M1;
                        m3Var2.K = Layout.Alignment.ALIGN_CENTER;
                        m3Var2.s(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(j3, this.M1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.M1.u(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131749441, null), spannableStringBuilder, "%s"));
                        fi.m3 m3Var3 = this.M1;
                        m3Var3.h = fi.m3.a(m3Var3.getText(), this.M1.getTextPaint());
                        fi.m3 m3Var4 = this.M1;
                        m3Var4.d = -1L;
                        m3Var4.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        this.M1.l(this.K);
                        org.telegram.messenger.g0.i3(new xf(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void d8() {
        if (this.l1 != null && this.Y1 == null && getParentActivity() != null) {
            this.Y1 = new org.telegram.ui.ActionBar.l0(1, getParentActivity(), this);
            K9();
            this.Y1.setClickable(true);
            this.f43717a1.addView(this.Y1, c8.ha.o(-1, 44));
            this.f43717a1.h(2, this.Y1);
            this.f43717a1.g(this.Y1);
            TextView textView = new TextView(getParentActivity());
            this.f43733b2 = textView;
            int i7 = org.telegram.ui.ActionBar.k6.f28090q7;
            org.telegram.ui.ActionBar.r6.V(textView, i7, getResourceProvider());
            TextView textView2 = this.f43733b2;
            float L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.Y(L, getThemedColor(i7) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.r6.h(i7, 25), getResourceProvider());
            this.f43733b2.setTag(Integer.valueOf(i7));
            this.f43733b2.setTextSize(1, 14.0f);
            this.f43733b2.setTypeface(org.telegram.messenger.g0.o());
            this.f43733b2.setSingleLine(true);
            this.f43733b2.setMaxLines(1);
            this.f43733b2.setGravity(17);
            this.Y1.addView(this.f43733b2, c8.ha.e(-1, -1, 51));
            this.f43733b2.setOnClickListener(new le(this, 13));
            org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(getParentActivity(), this.f44022xa);
            this.f43814h2 = w70Var;
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.Ue, getResourceProvider());
            this.f43814h2.setTextSize(1, 13.3f);
            this.f43814h2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.r6.H(this.f43814h2, org.telegram.ui.ActionBar.k6.Wl, getResourceProvider());
            this.f43814h2.setGravity(17);
            this.f43814h2.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            this.f43717a1.addView(this.f43814h2, c8.ha.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f43717a1.h(8, this.f43814h2);
            this.f43717a1.g(this.f43814h2);
            TextView textView3 = new TextView(getParentActivity());
            this.Z1 = textView3;
            int i10 = org.telegram.ui.ActionBar.k6.Ve;
            org.telegram.ui.ActionBar.r6.V(textView3, i10, getResourceProvider());
            this.Z1.setVisibility(8);
            this.Z1.setTextSize(1, 14.0f);
            this.Z1.setTypeface(org.telegram.messenger.g0.o());
            this.Z1.setSingleLine(true);
            this.Z1.setMaxLines(1);
            this.Z1.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.Z1.setGravity(17);
            TextView textView4 = this.Z1;
            int themedColor = getThemedColor(i10) & 436207615;
            int L3 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.r6.R(textView4, org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.r6.h(i10, 25), getResourceProvider());
            this.Y1.addView(this.Z1, c8.ha.e(-1, -1, 51));
            this.Z1.setOnClickListener(new le(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.f43747c2 = textView5;
            org.telegram.ui.ActionBar.r6.V(textView5, i10, getResourceProvider());
            this.f43747c2.setVisibility(8);
            this.f43747c2.setTextSize(1, 14.0f);
            this.f43747c2.setTypeface(org.telegram.messenger.g0.o());
            this.f43747c2.setSingleLine(true);
            this.f43747c2.setMaxLines(1);
            this.f43747c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f43747c2.setGravity(17);
            this.f43747c2.setText(org.telegram.messenger.hd.M0(2131746085, null));
            org.telegram.ui.ActionBar.r6.R(this.f43747c2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i10) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.r6.h(i10, 25), getResourceProvider());
            this.f43717a1.addView(this.f43747c2, c8.ha.o(-1, 48));
            this.f43717a1.h(4, this.f43747c2);
            this.f43717a1.g(this.f43747c2);
            this.f43747c2.setOnClickListener(new le(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f43827i2 = imageView;
            imageView.setImageResource(2131231983);
            this.f43827i2.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
            ImageView imageView2 = this.f43827i2;
            int i11 = org.telegram.ui.ActionBar.k6.f27941i6;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.O(getThemedColor(i11), 0, 0), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
            org.telegram.ui.ActionBar.r6.t(this.f43827i2, org.telegram.ui.ActionBar.k6.Re, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f43827i2.setScaleType(ImageView.ScaleType.CENTER);
            this.Y1.addView(this.f43827i2, c8.ha.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f43827i2.setOnClickListener(new le(this, 16));
        }
    }

    public final int d9(int i7) {
        return (int) Math.max(-org.telegram.messenger.g0.L(2.0f), (((((this.f44037z0.getMeasuredHeight() - this.Ua) - this.L9) - this.f43998w.e()) - org.telegram.messenger.g0.L(53.0f)) - i7) / 2.0f);
    }

    public final boolean da() {
        if (this.f43864l4 != null) {
            return true;
        }
        return false;
    }

    public final void db() {
        int i7;
        this.T4.clear();
        this.V4.clear();
        this.X4 = 0;
        this.f43736b5 = 0;
        this.f43750c5 = 0;
        cd(0, true);
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        long a10 = a();
        TLRPC.ChatFull chatFull = this.f43916p8;
        if (chatFull == null) {
            i7 = 0;
        } else {
            i7 = chatFull.pinned_msg_id;
        }
        mediaDataController.Q0(0, i7, a10);
        this.f43763d5 = true;
        dd();
    }

    public final void dc(ArrayList arrayList) {
        bc(true, null, arrayList, null, true, 0, null, false, 0L, true);
    }

    public final void dd() {
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f43989v4 && !this.V4.isEmpty() && this.T4.size() == 1 && ((Integer) this.T4.get(0)).intValue() == b() + 1) {
            ijVar = (org.telegram.messenger.ij) this.V4.get(this.T4.get(0));
        } else {
            ijVar = null;
        }
        this.f43876m4 = ijVar;
        if (this.f43989v4 && ijVar != null && (message = ijVar.f23244k) != null && (tL_forumTopic = this.f43925q4) != null && !org.telegram.messenger.ij.w5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.f43771e;
            TLRPC.Peer peer = this.f43876m4.f23244k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f26953id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f26953id == peer.chat_id) {
                        return;
                    }
                }
                this.f43876m4 = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, final Object... objArr) {
        long j3;
        org.telegram.messenger.ij ijVar;
        TLRPC.MessageReplies messageReplies;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.ActionBar.q4 q4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull b22;
        TLRPC.User a22;
        boolean z9;
        TLRPC.User a23;
        ui uiVar;
        qj qjVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.ys editField;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yv0 yv0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        qj qjVar2;
        an anVar = this;
        if (i7 == org.telegram.messenger.qs.D) {
            anVar.r8(objArr);
            return;
        }
        if (i7 == org.telegram.messenger.qs.f25014j4) {
            aj ajVar = anVar.f44037z0;
            if (ajVar != null) {
                ajVar.g1();
            }
            org.telegram.ui.Components.ci ciVar = anVar.fa;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z12 = false;
            r2 = false;
            boolean z13 = false;
            int i12 = 0;
            if (i7 == org.telegram.messenger.qs.I) {
                if (((Integer) objArr[0]).intValue() == anVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        anVar.finishFragment();
                        b.b(anVar.currentAccount);
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25065s3) {
                if (objArr.length > 0) {
                    z10 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z10 = false;
                }
                di.u2 u2Var = anVar.X1;
                if (u2Var != null && u2Var.isShowing()) {
                    anVar.X1.a(true);
                }
                if (z10 && (qjVar2 = anVar.Z) != null && qjVar2.s0()) {
                    anVar.Z.k0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f26973id = stickerSet2.f26980id;
                        if (objArr.length > 4) {
                            z11 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z11 = false;
                        }
                        Dialog dialog = anVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.yv0) && (tL_messages_stickerSet = (yv0Var = (org.telegram.ui.Components.yv0) dialog).J1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f26980id == stickerSet2.f26980id) {
                            yv0Var.J1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (yv0Var.f40763k1 != null) {
                                yv0Var.a1();
                                yv0Var.Z0();
                                yv0Var.f40763k1.f();
                            }
                            yv0Var.Y0();
                            org.telegram.messenger.ui.b0(yv0Var.f28613a).q1(yv0Var.J1);
                            yv0Var.J0();
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
                                    org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(yv0Var.f28619c, anVar.resourceProvider);
                                    if (z11) {
                                        i11 = 2131744845;
                                    } else {
                                        i11 = 2131744846;
                                    }
                                    org.telegram.ui.Components.cc q10 = hcVar.q(document, org.telegram.messenger.hd.a0(null, null, i11, stickerSet2.title));
                                    q10.f32514j = 2750;
                                    q10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.yv0 yv0Var2 = new org.telegram.ui.Components.yv0(anVar.getParentActivity(), anVar, tL_inputStickerSetID, null, anVar.Z, anVar.f44022xa);
                            final boolean z14 = z11;
                            anVar = this;
                            yv0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    an.U0(an.this, objArr, yv0Var2, z14, stickerSet2);
                                }
                            });
                            anVar.showDialog(yv0Var2);
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25009i4) {
                aj ajVar2 = anVar.f44037z0;
                if (ajVar2 != null) {
                    ajVar2.g1();
                }
                TextView textView = anVar.f43775e3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.k5 k5Var = anVar.R2[i13];
                    if (k5Var != null) {
                        k5Var.invalidate();
                    }
                }
                jj jjVar = anVar.W1;
                if (jjVar != null) {
                    jjVar.getListView().g1();
                }
                bi.q1 q1Var = anVar.Z3;
                if (q1Var != null) {
                    q1Var.g1();
                }
                UndoView undoView = anVar.M3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                qj qjVar3 = anVar.Z;
                if (qjVar3 != null && (editField = qjVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                pm[] pmVarArr = anVar.S2;
                pm pmVar = pmVarArr[0];
                if (pmVar != null) {
                    pmVar.invalidate();
                }
                pm pmVar2 = pmVarArr[1];
                if (pmVar2 != null) {
                    pmVar2.invalidate();
                }
            } else if (i7 == org.telegram.messenger.qs.T1) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i7 == org.telegram.messenger.qs.f24994g1) {
                Long l10 = (Long) objArr[0];
                if (anVar.f43916p8 != null && (chat = anVar.f43771e) != null && chat.f26953id == l10.longValue()) {
                    anVar.f43916p8.online_count = ((Integer) objArr[1]).intValue();
                    ui uiVar2 = anVar.f43897o1;
                    if (uiVar2 != null) {
                        uiVar2.m();
                        anVar.f43897o1.n(false);
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.G) {
                if (((Long) objArr[0]).longValue() == anVar.f43842j6 && (qjVar = anVar.Z) != null) {
                    qjVar.S1(false, true);
                }
            } else if (i7 == org.telegram.messenger.qs.f25008i3) {
                qj qjVar4 = anVar.Z;
                if (qjVar4 != null) {
                    qjVar4.T1();
                }
            } else if (i7 == org.telegram.messenger.qs.f25054r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i14 = org.telegram.messenger.qp.C8;
                int i15 = intValue & 1;
                if (i15 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (anVar.f43771e != null) {
                        TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(anVar.f43771e.f26953id));
                        if (M0 != null) {
                            anVar.f43771e = M0;
                        }
                    } else if (anVar.f43785f != null && (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.f43785f.f27102id))) != null) {
                        anVar.f43785f = a22;
                    }
                    anVar.sd(true);
                }
                if (!anVar.da() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (anVar.f43771e != null && (uiVar = anVar.f43897o1) != null) {
                        uiVar.m();
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i15 != 0) {
                    anVar.s();
                    anVar.Cd(false);
                }
                if ((intValue & 64) != 0) {
                    z9 = true;
                }
                if ((intValue & 8192) != 0 && anVar.f43771e != null) {
                    anVar.U9();
                    TLRPC.Chat M02 = anVar.getMessagesController().M0(Long.valueOf(anVar.f43771e.f26953id));
                    if (M02 != null) {
                        anVar.f43771e = M02;
                        anVar.U9();
                        z9 = !anVar.da();
                        anVar.Lc(false);
                        qj qjVar5 = anVar.Z;
                        if (qjVar5 != null) {
                            qjVar5.a1(anVar.currentAccount, anVar.f43842j6);
                        }
                        org.telegram.messenger.n6 n6Var = anVar.S3;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                }
                TLRPC.User user = anVar.f43785f;
                if (user != null && org.telegram.messenger.t10.u(user) && (a23 = anVar.getMessagesController().a2(Long.valueOf(anVar.f43785f.f27102id))) != null) {
                    anVar.f43785f = a23;
                }
                if (anVar.f43788f2 != null) {
                    boolean N6 = anVar.N6();
                    org.telegram.ui.Components.m11 m11Var = anVar.f43788f2;
                    if (m11Var.f35819c != N6) {
                        m11Var.setTabsEnabled(N6);
                        if (anVar.m0 != null && !anVar.ea()) {
                            anVar.m0.d();
                        }
                        anVar.zd();
                    }
                }
                ui uiVar3 = anVar.f43897o1;
                if (uiVar3 != null && z9) {
                    uiVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    anVar.vd(true);
                }
                org.telegram.ui.ActionBar.r0 r0Var = anVar.f43825i0;
                if (r0Var != null) {
                    if (org.telegram.messenger.t3.T(anVar.f43771e) && !org.telegram.messenger.t3.p0(anVar.f43771e)) {
                        long j10 = anVar.f43771e.linked_monoforum_id;
                        if (j10 != 0 && org.telegram.messenger.t3.z(anVar.currentAccount, 24, -j10)) {
                            z12 = true;
                        }
                    }
                    r0Var.Q(70, z12);
                }
            } else if (i7 == 1) {
                org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!anVar.f43835ib) {
                    if (longValue == anVar.f43842j6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i16 = anVar.f43790f4;
                        if (intValue2 != i16 && i16 != 3 && i16 != 8) {
                            if (i16 != 1 && intValue2 == 1 && !anVar.isPaused && LaunchActivity.T() == anVar && anVar.f43990v5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.ij) arrayList.get(0)).f1() < 0) {
                                int f12 = ((org.telegram.messenger.ij) arrayList.get(0)).f1();
                                if (((org.telegram.messenger.ij) arrayList.get(0)).f23244k != null && ((org.telegram.messenger.ij) arrayList.get(0)).f23244k.video_processing_pending) {
                                    z13 = true;
                                }
                                anVar.Ja(f12, z13);
                            }
                            org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !anVar.Uc && anVar.f43785f != null && anVar.a() != anVar.getUserConfig().e() && (b22 = anVar.getMessagesController().b2(anVar.f43785f.f27102id)) != null && b22.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i12);
                                    if (ijVar3.f1() > 0 && !ijVar3.O3() && !ijVar3.s4()) {
                                        anVar.Uc = true;
                                        anVar.getMessagesController().W2(anVar.f43785f, anVar.classGuid, true, null);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            anVar.Ya(arrayList, true);
                        }
                    } else if (org.telegram.messenger.t3.T(anVar.f43771e) && !anVar.f43771e.megagroup && (chatFull = anVar.f43916p8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList.get(i17);
                            if (ijVar4.f4()) {
                                anVar.L6.put(ijVar4.f1(), ijVar4);
                            }
                        }
                        anVar.K7();
                    }
                    org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i7 == org.telegram.messenger.qs.F) {
                anVar.ia(true);
            } else if (i7 == org.telegram.messenger.qs.E) {
                anVar.F6();
            } else if (i7 == org.telegram.messenger.qs.f25067t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == anVar.f43842j6) {
                        anVar.finishFragment();
                    }
                } else if (org.telegram.messenger.g0.Q1() && (q4Var = anVar.parentLayout) != null && q4Var.getFragmentStack().size() > 1) {
                    anVar.finishFragment();
                } else {
                    anVar.removeSelfFromStack(true);
                }
            } else if (i7 == org.telegram.messenger.qs.f25074u) {
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
                int i18 = org.telegram.messenger.qs.B;
                SparseArray[] sparseArrayArr = anVar.E6;
                if (i7 == i18) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = anVar.f43771e;
                    if (chat2 != null && chat2.f26953id == longValue3 && (ijVar2 = (org.telegram.messenger.ij) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && ijVar2.y2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (anVar.G5) {
                            gh ghVar = anVar.B4;
                            if (ghVar != null) {
                                org.telegram.messenger.g0.r(ghVar);
                                anVar.B4 = null;
                            }
                            ijVar2.f23244k.replies.read_max_id = intValue3;
                        } else {
                            gh ghVar2 = new gh(anVar, ijVar2, intValue3);
                            anVar.B4 = ghVar2;
                            org.telegram.messenger.g0.i3(ghVar2, 500L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = anVar.f43771e;
                    if (chat3 != null && chat3.f26953id == longValue4 && (ijVar = (org.telegram.messenger.ij) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = ijVar.f23244k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer z15 = anVar.getMessagesController().z1(org.telegram.messenger.t3.M(anVar.f43771e, anVar.getMessagesController().N0(anVar.f43771e.f26953id), false));
                            int size3 = ijVar.f23244k.replies.recent_repliers.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.ij.C1(ijVar.f23244k.replies.recent_repliers.get(i19)) == org.telegram.messenger.ij.C1(z15)) {
                                    ijVar.f23244k.replies.recent_repliers.remove(i19);
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            ijVar.f23244k.replies.recent_repliers.add(0, z15);
                        }
                        TLRPC.MessageReplies messageReplies2 = ijVar.f23244k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i20 = org.telegram.messenger.qs.A;
                    int i21 = org.telegram.messenger.qs.f25108z;
                    if ((i7 == i21 || i7 == i20) && anVar.f43842j6 == ((Long) objArr[0]).longValue()) {
                        if (i7 == i21) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i7 == i20) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = anVar.f43939r4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i22 = anVar.f44029y4;
                            ArrayList arrayList2 = anVar.K6;
                            if (intValue4 > i22) {
                                anVar.f44029y4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i23 = 0; i23 < size4; i23++) {
                                    org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) arrayList2.get(i23);
                                    int f13 = ijVar5.f1();
                                    if (!ijVar5.O3() && f13 > 0 && f13 <= anVar.f44029y4) {
                                        if (!ijVar5.G4()) {
                                            break;
                                        }
                                        ijVar5.J5();
                                        jl jlVar = anVar.C0;
                                        if (jlVar != null) {
                                            jlVar.M(ijVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > anVar.f44041z4) {
                                anVar.f44041z4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) arrayList2.get(i24);
                                    int f14 = ijVar6.f1();
                                    if (ijVar6.O3() && f14 > 0 && f14 <= anVar.f44041z4) {
                                        if (!ijVar6.G4()) {
                                            break;
                                        }
                                        ijVar6.J5();
                                        jl jlVar2 = anVar.C0;
                                        if (jlVar2 != null) {
                                            jlVar2.R(ijVar6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        anVar.m8(i7, objArr);
        anVar.n8(i7, objArr);
        anVar.o8(i7, objArr);
        anVar.p8(i7, objArr);
        anVar.q8(i7, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        di.u2 u2Var = this.X1;
        if (u2Var != null && this.visibleDialog == u2Var) {
            u2Var.f32924a2.d0(false);
            this.X1.K();
            this.X1.f32924a2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.X1 && dialog != this.f43982ua && !(dialog instanceof hi.a3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7() {
        ArrayList arrayList;
        int i7;
        if (this.f43847jb) {
            int i10 = -1;
            int i11 = 0;
            long j3 = 0;
            while (true) {
                arrayList = this.K6;
                if (i11 >= arrayList.size()) {
                    break;
                }
                long e12 = ((org.telegram.messenger.ij) arrayList.get(i11)).e1();
                if (j3 != e12) {
                    if (i10 >= 0 && j3 != 0 && (i7 = i11 - i10) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < i7; i12++) {
                            arrayList2.add((org.telegram.messenger.ij) arrayList.remove(i10));
                        }
                        Collections.sort(arrayList2, new oe(3));
                        arrayList.addAll(i10, arrayList2);
                    }
                    i10 = i11;
                    j3 = e12;
                }
                i11++;
            }
            if (i10 >= 0 && j3 != 0 && arrayList.size() - i10 > 1) {
                int size = arrayList.size() - i10;
                ArrayList arrayList3 = new ArrayList();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList3.add((org.telegram.messenger.ij) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void e8() {
        int i7;
        if (this.f43788f2 == null && getParentActivity() != null) {
            if (this.L2 == null) {
                Z7();
            }
            org.telegram.ui.Components.m11 m11Var = new org.telegram.ui.Components.m11(getParentActivity(), this, this.currentAccount, a(), N6(), getResourceProvider());
            this.f43788f2 = m11Var;
            m11Var.R = new ae(this, 6);
            m11Var.setSideMenuBackgroundDrawable(this.K.c(m11Var, c8.g0.p(this.f44022xa), false));
            org.telegram.ui.Components.m11 m11Var2 = this.f43788f2;
            m11Var2.setTopMenuBackgroundDrawable(this.K.c(m11Var2, c8.g0.p(this.f44022xa), false));
            this.f43788f2.setCurrentTopic(b());
            this.f43788f2.setOnNewTopicSelected(new ae(this, 7));
            this.f43788f2.setOnTopicSelected(new me(this, 0));
            this.f43788f2.setOnDialogSelected(new me(this, 1));
            int indexOfChild = this.l1.indexOfChild(this.Y);
            if (indexOfChild >= 0) {
                i7 = indexOfChild + 1;
            } else {
                i7 = 8;
            }
            this.l1.addView(this.f43788f2, i7, c8.ha.f(-1.0f, -1, 51, 0, -org.telegram.messenger.g0.L(5.0f), 0, 0));
            this.f43788f2.p();
            zd();
            jj jjVar = this.W1;
            if (jjVar != null) {
                jjVar.bringToFront();
            }
        }
    }

    public final int e9(org.telegram.messenger.ij ijVar) {
        return d9(U8(ijVar, !TextUtils.isEmpty(this.f43794f8))) - ub(ijVar);
    }

    public final boolean ea() {
        if (X9()) {
            return getMessagesController().G1().e();
        }
        org.telegram.ui.Components.m11 m11Var = this.f43788f2;
        if (m11Var != null && m11Var.f35815a.f55395f) {
            TLRPC.Chat chat = this.f43771e;
            if (chat == null || ((!chat.forum || !chat.forum_sidebar) && !chat.monoforum)) {
                TLRPC.User user = this.f43785f;
                if (org.telegram.messenger.t10.u(user) && user.bot_forum_sidebar) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void eb(org.telegram.messenger.ij ijVar) {
        if (ijVar == this.f43882mc) {
            this.f43882mc = null;
            vd(true);
            return;
        }
        org.telegram.messenger.mp O1 = getMessagesController().O1(this.f43842j6);
        if (O1 != null) {
            O1.f24065a.remove(ijVar);
        }
    }

    public final void ec(org.telegram.messenger.ij ijVar) {
        bc(true, ijVar, null, null, true, 0, null, false, 0L, true);
    }

    public final void ed(boolean z9) {
        boolean z10;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i7 = this.f43790f4) == 0 || i7 == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44013x1.e(4, z10, z9);
        this.f44013x1.c(4, this.A1, z9);
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z9) {
        jg.m1 m1Var;
        if (this.f43749c4 == 2 && (m1Var = this.f43720a4) != null) {
            String str = this.I3;
            fi.h9 h9Var = m1Var.E;
            if (!TextUtils.equals(m1Var.f16846y, str)) {
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
                org.telegram.messenger.g0.r(h9Var);
                di.k6 k6Var = m1Var.D;
                if (k6Var != null && k6Var.I != 0) {
                    ConnectionsManager.getInstance(k6Var.f9639c).cancelRequest(k6Var.I, true);
                    k6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    m1Var.f16846y = str;
                    m1Var.D = new di.k6(m1Var.f16842r, str2, trim);
                    if (z9) {
                        h9Var.run();
                    } else {
                        org.telegram.messenger.g0.i3(h9Var, 1000L);
                    }
                }
                di.k6 k6Var2 = m1Var.D;
                if (k6Var2 != null && k6Var2.J > 0) {
                    m1Var.f();
                }
            }
        }
    }

    public final void f8() {
        if (this.M3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f44022xa);
            this.M3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.l1.addView(this.M3, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int f9(View view) {
        org.telegram.messenger.a8.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.f44037z0.getMeasuredHeight() - view.getBottom()) - this.f44037z0.getPaddingBottom()) + "} chatHeight=" + this.f44037z0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f44037z0.getPaddingBottom());
        return (this.f44037z0.getMeasuredHeight() - view.getBottom()) - this.f44037z0.getPaddingBottom();
    }

    public final void fa(int i7) {
        int i10;
        TLRPC.Message message;
        int i11;
        ArrayList arrayList = this.K6;
        if (!arrayList.isEmpty()) {
            int i12 = 1;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
            if ((((org.telegram.messenger.ij) arrayList.get(0)).f23244k.date >= i7 && ijVar.f23244k.date <= i7) || (ijVar.f23244k.date >= i7 && this.S6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(size);
                    if (ijVar2.f23244k.date >= i7 && ijVar2.f1() != 0) {
                        int f12 = ijVar2.f1();
                        if (org.telegram.messenger.ij.B0(ijVar2.f23244k) != this.f43738b7) {
                            i12 = 0;
                        }
                        l(f12, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.m5.C(this.f43842j6)) {
                int N0 = this.B0.N0();
                int L0 = this.B0.L0();
                while (true) {
                    if (L0 <= N0) {
                        jl jlVar = this.C0;
                        int i13 = jlVar.J;
                        if (L0 >= i13 && L0 < jlVar.K && (message = ((org.telegram.messenger.ij) arrayList.get(L0 - i13)).f23244k) != null) {
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
                this.f43858k9.f(i10);
                org.telegram.ui.ActionBar.u1 u1Var = this.Pb;
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                bd(false);
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), this.f44022xa);
                this.Pb = u1Var2;
                u1Var2.setOnCancelListener(this.Fa);
                this.Pb.r(1000L);
                int i14 = this.f43866l6;
                this.f43881m9 = i14;
                this.f43904o9 = false;
                this.f44018x6.add(Integer.valueOf(i14));
                this.f43892n9 = 0;
                this.f43917p9 = false;
                org.telegram.messenger.qp messagesController = getMessagesController();
                long j3 = this.f43842j6;
                long j10 = this.f43738b7;
                int i15 = this.classGuid;
                int i16 = this.f43790f4;
                long j11 = this.f43939r4;
                int i17 = this.A4;
                int i18 = this.f43866l6;
                this.f43866l6 = i18 + 1;
                messagesController.Y2(j3, j10, false, 30, 0, i7, true, 0, i15, 4, i16, j11, i17, i18, this.f43989v4);
                this.f43863l3.setAlpha(0.0f);
                this.f43863l3.setTag(null);
                this.f44002w3 = 0.0f;
                Pc();
                this.f43875m3.setTag(null);
            }
        }
    }

    public final void fb(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(ijVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jl jlVar = this.C0;
            if (jlVar != null && !jlVar.N) {
                jlVar.s(jlVar.J + indexOf);
            }
        }
    }

    public final void fc(org.telegram.messenger.ij ijVar, qm qmVar) {
        bc(true, ijVar, null, null, true, 0, qmVar, false, 0L, true);
    }

    public final void fd(boolean z9) {
        boolean z10;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f44038z1 > 0 && ((i7 = this.f43790f4) == 0 || i7 == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44013x1.e(3, z10, z9);
        this.f44013x1.c(3, this.f44038z1, z9);
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.g1 g1Var = this.f43781e9;
        if (g1Var != null) {
            g1Var.f27482e = false;
            O7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f43771e;
    }

    public final void g7() {
        this.T.d();
        ad();
        Kc();
        A7();
        x7();
        C7();
        B7();
        F7();
        L9();
        boolean z9 = true;
        if (this.f43998w.f54460s == 1) {
            z9 = false;
        }
        if (this.f43919pb != z9) {
            this.f43919pb = z9;
            checkSystemBarColors();
        }
    }

    public final ArrayList g8(org.telegram.messenger.ij ijVar, boolean z9) {
        ArrayList k10 = org.telegram.messenger.k5.k(ijVar);
        int f12 = ijVar.f1();
        ijVar.A0();
        if (f12 != 0) {
            ArrayList arrayList = this.K6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(size);
                if ((org.telegram.messenger.ij.B0(ijVar2.f23244k) != this.f43738b7 || org.telegram.messenger.ij.B0(ijVar.f23244k) == this.f43738b7) && (((this.h == null && ijVar2.f1() > f12) || (this.h != null && ijVar2.f1() < f12)) && ((org.telegram.messenger.ij.S4(ijVar2.f23244k) || ijVar2.i4()) && !ijVar2.T4() && !ijVar2.h4() && (!z9 || (ijVar2.f23244k.media_unread && !ijVar2.O3()))))) {
                    k10.add(ijVar2);
                }
            }
        }
        return k10;
    }

    public final sm g9() {
        if (this.Rc == null) {
            this.Rc = new sm(this);
        }
        return this.Rc;
    }

    public final void ga(ArrayList arrayList) {
        org.telegram.ui.Components.m11 m11Var;
        if (arrayList != null && (m11Var = this.f43788f2) != null && m11Var.T) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                if (ijVar != null && ijVar.D == 36) {
                    TLRPC.MessageMedia o12 = org.telegram.messenger.ij.o1(ijVar.f23244k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52874a;
                    if (o12 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!ijVar.S2) {
                            ijVar.S2 = true;
                            ijVar.n0(null);
                        }
                    }
                }
                if (ijVar != null && ijVar.Q2() && !ijVar.Q3() && ijVar.d1() != 0 && !ijVar.S2) {
                    ijVar.S2 = true;
                    ijVar.n0(null);
                }
            }
        }
    }

    public final void gb(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(ijVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jl jlVar = this.C0;
            if (jlVar != null && !jlVar.N) {
                jlVar.P(jlVar.J + indexOf, true);
            }
        }
    }

    public final void gc(org.telegram.messenger.nj njVar) {
        cc(true, null, null, null, null, true, 0, null, false, 0L, njVar, true);
    }

    public final void gd(boolean z9) {
        String M0;
        if (this.f43790f4 != 3 && !org.telegram.messenger.t10.u(this.f43785f)) {
            ui uiVar = this.f43897o1;
            if (uiVar != null && this.f43939r4 != 0) {
                if (this.f43989v4) {
                    xd();
                } else if (this.f43976u4) {
                    org.telegram.messenger.ij ijVar = this.f43864l4;
                    if (ijVar != null && ijVar.y2()) {
                        this.f43897o1.setTitle(org.telegram.messenger.hd.G(this.f43864l4.N1(), "Comments", new Object[0]));
                    } else {
                        this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131751996, null));
                    }
                } else {
                    org.telegram.messenger.ij ijVar2 = this.f43864l4;
                    if (ijVar2 != null) {
                        uiVar.setTitle(org.telegram.messenger.hd.G(ijVar2.N1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f43912p4 != null) {
                if (this.f43864l4.N1() == 0) {
                    if (this.f43976u4) {
                        M0 = org.telegram.messenger.hd.M0(2131748225, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131748167, null);
                    }
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131751376, null);
                }
                org.telegram.messenger.ij ijVar3 = this.f43912p4;
                ijVar3.f23244k.message = M0;
                ijVar3.v = M0;
                if (z9) {
                    this.C0.R(ijVar3, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.m4 getBackButtonState() {
        return org.telegram.ui.ActionBar.m4.f28303a;
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.f28338c;
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var;
        if (this.f43790f4 == 0 && (r3Var = this.f43880m8) != null && (r3Var.f25209b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f43790f4 == 2) {
            ArrayList arrayList = this.K6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(80.0f) + U8((org.telegram.messenger.ij) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f44022xa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.k5 k5Var2;
        View view;
        org.telegram.ui.Components.gy gyVar;
        org.telegram.ui.Components.gy gyVar2;
        org.telegram.ui.Components.gy gyVar3;
        org.telegram.ui.Components.gy gyVar4;
        org.telegram.ui.Components.gy gyVar5;
        org.telegram.ui.Components.gy gyVar6;
        org.telegram.ui.Components.gy gyVar7;
        org.telegram.ui.Components.gy gyVar8;
        org.telegram.ui.Components.gy gyVar9;
        org.telegram.ui.Components.gy gyVar10;
        org.telegram.ui.Components.gy gyVar11;
        View view2;
        org.telegram.ui.Components.gy gyVar12 = null;
        if (this.f43979u7) {
            return null;
        }
        int i7 = 0;
        if (this.f43969ta) {
            this.f43969ta = false;
            return null;
        }
        f6 f6Var = new f6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.De));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ee));
        W9();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.F8));
        ui uiVar = this.f43897o1;
        if (uiVar != null) {
            k5Var = uiVar.getTitleTextView();
        } else {
            k5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(k5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        ui uiVar2 = this.f43897o1;
        if (uiVar2 != null) {
            k5Var2 = uiVar2.getTitleTextView();
        } else {
            k5Var2 = null;
        }
        int i10 = org.telegram.ui.ActionBar.k6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(k5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        ui uiVar3 = this.f43897o1;
        if (uiVar3 != null) {
            view = uiVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(i10, view));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28224x8));
        org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.t4 t4Var3 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.t4 t4Var4 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.t4 t4Var5 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.t4 t4Var6 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.t4 t4Var7 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.t4 t4Var8 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOutMediaSelected");
        if (t4Var != null) {
            Drawable[] drawableArr = t4Var.A;
            int i12 = org.telegram.ui.ActionBar.k6.f28149ta;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, t4Var2.A, (org.telegram.ui.ActionBar.s6) null, i12));
            Drawable[] drawableArr2 = t4Var5.A;
            int i13 = org.telegram.ui.ActionBar.k6.f28094qb;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.s6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, t4Var6.A, (org.telegram.ui.ActionBar.s6) null, i13));
        }
        if (!this.f44022xa.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var5, t4Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28113rb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var5, t4Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28131sb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var5, t4Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28150tb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var7, t4Var8}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27874ed));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27892fd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27983kc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28018mc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28002lc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27857df));
        this.f44022xa.getClass();
        tj tjVar = this.f43789f3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i14 = org.telegram.ui.ActionBar.k6.Ge;
        arrayList.add(new org.telegram.ui.ActionBar.t6(tjVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ll));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ne));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oe));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27821bg));
        qj qjVar = this.Z;
        int i15 = org.telegram.ui.ActionBar.k6.f27802ag;
        arrayList.add(new org.telegram.ui.ActionBar.t6(qjVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27841cg));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Uf));
        qj qjVar2 = this.Z;
        if (qjVar2 != null) {
            gyVar = qjVar2.getEmojiView();
        } else {
            gyVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28267zf));
        qj qjVar3 = this.Z;
        if (qjVar3 != null) {
            gyVar2 = qjVar3.getEmojiView();
        } else {
            gyVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar2, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Af));
        qj qjVar4 = this.Z;
        if (qjVar4 != null) {
            gyVar3 = qjVar4.getEmojiView();
        } else {
            gyVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar3, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Bf));
        qj qjVar5 = this.Z;
        if (qjVar5 != null) {
            gyVar4 = qjVar5.getEmojiView();
        } else {
            gyVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar4, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Df));
        qj qjVar6 = this.Z;
        if (qjVar6 != null) {
            gyVar5 = qjVar6.getEmojiView();
        } else {
            gyVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar5, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Ef));
        qj qjVar7 = this.Z;
        if (qjVar7 != null) {
            gyVar6 = qjVar7.getEmojiView();
        } else {
            gyVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar6, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Gf));
        qj qjVar8 = this.Z;
        if (qjVar8 != null) {
            gyVar7 = qjVar8.getEmojiView();
        } else {
            gyVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar7, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Hf));
        qj qjVar9 = this.Z;
        if (qjVar9 != null) {
            gyVar8 = qjVar9.getEmojiView();
        } else {
            gyVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar8, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Lf));
        qj qjVar10 = this.Z;
        if (qjVar10 != null) {
            gyVar9 = qjVar10.getEmojiView();
        } else {
            gyVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar9, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Cf));
        qj qjVar11 = this.Z;
        if (qjVar11 != null) {
            gyVar10 = qjVar11.getEmojiView();
        } else {
            gyVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar10, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28249yf));
        qj qjVar12 = this.Z;
        if (qjVar12 != null) {
            gyVar11 = qjVar12.getEmojiView();
        } else {
            gyVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar11, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Jf));
        qj qjVar13 = this.Z;
        if (qjVar13 != null) {
            gyVar12 = qjVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar12, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Ff));
        qj qjVar14 = this.Z;
        if (qjVar14 != null) {
            org.telegram.ui.Components.e31 trendingStickersAlert = qjVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.U());
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.Z.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kl));
        }
        for (int i16 = 0; i16 < 2; i16++) {
            if (i16 == 0) {
                view2 = this.M3;
            } else {
                view2 = this.N3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Of));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28185v7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28166u7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28242y7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f27849d6));
        NumberTextView numberTextView = this.T2;
        int i17 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.t6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
        ImageView imageView = this.f43801g3;
        int i18 = org.telegram.ui.ActionBar.k6.f28261z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43815h3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43873m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44037z0, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28174uf));
        fi.p5 p5Var = this.R;
        int i19 = org.telegram.ui.ActionBar.k6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(p5Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43910p2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43873m1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27949ig));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27968jg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27793a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.qk));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.sk));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.rk));
        int i20 = org.telegram.ui.ActionBar.k6.tk;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        yh.d dVar = this.ya;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(dVar.f59415g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.t6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Re));
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.t6) obj).f28543n = this.f44022xa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f44022xa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f44022xa.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final void h7() {
        TLRPC.Chat M0;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                La("");
                ImageView imageView = this.f43815h3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                zb(null, a22);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (M0 = getMessagesController().M0(Long.valueOf(j10))) != null) {
            La("");
            ImageView imageView2 = this.f43815h3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            zb(M0, null);
        }
    }

    public final void h8(final int i7, final int i10, final boolean z9) {
        this.C0.M.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.K6;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
            int i12 = ijVar.f23244k.date;
            if (i12 <= i7 || i12 >= i10) {
                this.C0.M.add(ijVar);
            }
            i11++;
        }
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            ajVar.setEmptyView(null);
        }
        if (this.C0.M.isEmpty()) {
            sc(true);
        }
        jl jlVar = this.C0;
        jlVar.L = true;
        jlVar.O(true);
        f8();
        UndoView undoView = this.M3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f43842j6, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                an anVar = an.this;
                org.telegram.messenger.qp messagesController = anVar.getMessagesController();
                long j10 = anVar.f43842j6;
                if (org.telegram.messenger.t3.T(anVar.f43771e)) {
                    j3 = anVar.f43842j6;
                } else {
                    j3 = 0;
                }
                messagesController.d0(j10, j3, i7, i10, z9, new xf(anVar, 20));
            }
        }, new xf(this, 19));
    }

    public final long h9() {
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        org.telegram.messenger.ij ijVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.t3.p0(this.f43771e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f43771e, 24)) {
            return 0L;
        }
        long j3 = this.f43939r4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && (ijVar2 = this.F5) != null && (message2 = ijVar2.f23244k) != null) {
            return org.telegram.messenger.m5.o(message2.saved_peer_id);
        }
        if (i7 == 0 && (ijVar = this.D5) != null && (message = ijVar.f23244k) != null) {
            return org.telegram.messenger.m5.o(message.saved_peer_id);
        }
        return j3;
    }

    public final void ha() {
        this.P4 = true;
        if (this.C6) {
            org.telegram.messenger.yr messagesStorage = getMessagesStorage();
            messagesStorage.f26696a.c(new org.telegram.messenger.t8(messagesStorage, b(), this.f43842j6, new fg(this, 1), 5));
            return;
        }
        org.telegram.messenger.yr messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().j1(this.f43842j6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f43989v4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f43939r4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.B6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ld(4, this, messagesStorage2));
    }

    public final void hb() {
        if (this.f43794f8 == null && this.f43806g8 == null && this.f43819h8 == null) {
            ae aeVar = this.f43857k8;
            if (aeVar != null) {
                org.telegram.messenger.g0.r(aeVar);
                this.f43857k8 = null;
            }
            this.f43739b8 = Integer.MAX_VALUE;
            this.f43766d8 = false;
            this.f43780e8 = 0L;
            this.f43794f8 = null;
            this.f43806g8 = null;
            this.f43819h8 = null;
        }
    }

    public final void hc(boolean z9, TLRPC.WebPage webPage, boolean z10) {
        bc(z9, null, null, webPage, true, 0, null, z10, 0L, true);
    }

    public final void hd(int i7, org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.ij ijVar2;
        SparseArray sparseArray = this.G6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i7);
        if (arrayList == null) {
            return;
        }
        if (ijVar == null) {
            ijVar2 = new org.telegram.messenger.ij(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            ijVar2 = null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.E6[0].get(((Integer) arrayList.get(i10)).intValue());
            if (ijVar3 != null) {
                if (ijVar == null) {
                    ijVar3.C = ijVar2;
                } else {
                    ijVar3.C = ijVar;
                }
                jl jlVar = this.C0;
                if (jlVar != null) {
                    jlVar.R(ijVar3, true, false);
                }
            }
        }
        if (ijVar == null) {
            sparseArray.remove(i7);
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.ij ijVar = this.f43864l4;
        if (ijVar != null && ijVar.N1() == 0 && org.telegram.messenger.t3.n(this.f43771e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i7() {
        org.telegram.messenger.ij ijVar;
        if (!this.P4 && (ijVar = this.Z7) != null) {
            if (this.K6.indexOf(ijVar) >= 0) {
                this.Q4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.O4 != null) {
        } else {
            af afVar = new af(this, 21);
            this.O4 = afVar;
            org.telegram.messenger.g0.h3(afVar);
        }
    }

    public final void i8(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar, CharacterStyle characterStyle, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.q1 q1Var2;
        CharacterStyle characterStyle2;
        int i7;
        org.telegram.messenger.ij ijVar2;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.k60 I = org.telegram.ui.Components.k60.I(this, q1Var);
        org.telegram.ui.Components.jk0 jk0Var = new org.telegram.ui.Components.jk0(getParentActivity(), this.f44022xa);
        I.f35200p = new ge(jk0Var, 0);
        if (!str.startsWith("video?") && !vf.c.g(Uri.parse(str), false, null)) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean N2 = getMessagesController().N2(str);
        if (N2 && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!str.startsWith("#") && !str.startsWith("$")) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean startsWith = str.startsWith("mailto:");
        if (!startsWith) {
            if (z10 && !z11) {
                i11 = 2131231925;
            } else {
                i11 = 2131232265;
            }
            if (z10 && !z11) {
                i12 = 2131747790;
            } else {
                i12 = 2131747816;
            }
            String M0 = org.telegram.messenger.hd.M0(i12, null);
            z14 = z9;
            i7 = 2131232265;
            bi.m2 m2Var = new bi.m2(this, str, characterStyle, ijVar, q1Var, z10, z11);
            z13 = z11;
            characterStyle2 = characterStyle;
            z12 = z10;
            q1Var2 = q1Var;
            I.c(i11, M0, m2Var, false);
        } else {
            z12 = z10;
            z13 = z11;
            z14 = z9;
            q1Var2 = q1Var;
            characterStyle2 = characterStyle;
            i7 = 2131232265;
        }
        if ((z12 && !z13) || startsWith) {
            I.c(i7, org.telegram.messenger.hd.M0(2131747792, null), new he(this, str, 0), false);
        } else if (!startsWith && !z13 && !z12 && z14 && !N2) {
            I.c(2131231925, org.telegram.messenger.hd.M0(2131747790, null), new he(this, str, 1), false);
        }
        TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(ijVar);
        if ((n1 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = n1.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            ijVar2 = ijVar;
            I.c(2131231834, org.telegram.messenger.hd.M0(2131747789, null), new ie(this, ijVar2, 0), false);
        } else {
            ijVar2 = ijVar;
        }
        if (z13) {
            i10 = 2131751763;
        } else if (startsWith) {
            i10 = 2131751761;
        } else {
            i10 = 2131751762;
        }
        I.c(2131232103, org.telegram.messenger.hd.M0(i10, null), new aa.d0(this, str, ijVar2, startsWith, 26), false);
        if (N2 && !z13 && !startsWith && !str.startsWith("tg:")) {
            I.c(2131232504, org.telegram.messenger.hd.M0(2131742942, null), new he(this, str, 2), false);
        }
        jk0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            jk0Var.f(q1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.d41) {
            String d = vf.c.d(((org.telegram.ui.Components.d41) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            jk0Var.f(q1Var2, characterStyle2, spannableString2, false);
        } else {
            jk0Var.f(q1Var2, characterStyle2, null, false);
        }
        showDialog(jk0Var);
    }

    public final int i9() {
        return this.l1.getBackgroundSizeY();
    }

    public final void ia(boolean z9) {
        TLRPC.Chat chat;
        if (this.Aa == null && (chat = this.f43771e) != null && org.telegram.messenger.t3.k(chat) && this.Z != null && !org.telegram.messenger.t3.p0(this.f43771e)) {
            TLRPC.TL_channels_sendAsPeers M1 = getMessagesController().M1(this.f43842j6, false);
            this.Aa = M1;
            if (M1 != null) {
                this.Z.S1(false, z9);
            }
        }
    }

    public final void ib(boolean z9) {
        org.telegram.messenger.ij ijVar = this.Z7;
        if (ijVar != null) {
            if (z9) {
                boolean[] zArr = this.U6;
                zArr[1] = true;
                zArr[0] = true;
                this.X7 = 0;
                this.f43723a7 = 0;
            }
            this.T7 = 0;
            this.U7 = false;
            fb(ijVar);
            this.Z7 = null;
        }
    }

    public final void ic(boolean z9) {
        if (this.f43863l3 != null && !V9()) {
            if (this.f43863l3.getTag() == null) {
                AnimatorSet animatorSet = this.f43975u3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f43863l3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f43975u3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f43975u3.playTogether(ObjectAnimator.ofFloat(this.f43863l3, View.ALPHA, 1.0f));
                this.f43975u3.addListener(new ei(this, 4));
                this.f43975u3.start();
            }
            if (!z9) {
                M9();
                this.f43899o3 = 1000;
            }
        }
    }

    public final void id(boolean z9) {
        qj qjVar = this.Z;
        if (qjVar != null) {
            qjVar.Q1(z9);
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z9;
        int x02;
        if (W9()) {
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.f(org.telegram.ui.ActionBar.k6.f28205w8);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28205w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z9 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            z9 = this.dc;
        }
        return !z9;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.s01 s01Var;
        lk lkVar;
        wh.i iVar;
        if ((this.f43790f4 == 5 && (this.K6.isEmpty() || this.f43939r4 == 0)) || (((s01Var = this.m0) != null && (s01Var.f37835y > 0.0f || s01Var.U)) || this.f43981u9 || this.f43758cd.f55395f || !this.G9 || (((lkVar = this.Ya) != null && lkVar.f34575s) || ((iVar = this.f43931qa) != null && iVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f43785f;
    }

    public final void j7(boolean z9) {
        if (this.D5 != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                    if (ijVar != null && ijVar.f1() == this.D5.f1() && org.telegram.messenger.ij.B0(ijVar.f23244k) == org.telegram.messenger.ij.B0(this.D5.f23244k)) {
                        this.D5 = ijVar;
                        qm qmVar = this.B5;
                        if (qmVar != null) {
                            qmVar.a(ijVar);
                        }
                        if (z9) {
                            org.telegram.messenger.mj mjVar = this.f43990v5;
                            if (mjVar != null) {
                                org.telegram.messenger.ij ijVar2 = this.D5;
                                org.telegram.messenger.dj djVar = this.f44042z5;
                                if (djVar == null) {
                                    djVar = S8(ijVar2.d1());
                                }
                                mjVar.f(ijVar2, djVar, this.f43842j6, this.B5);
                            }
                            z8();
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

    public final void j8(CharacterStyle characterStyle, boolean z9, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var) {
        Object[] objArr;
        int i7;
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        org.telegram.messenger.ij ijVar2;
        org.telegram.messenger.ij ijVar3;
        org.telegram.messenger.ij ijVar4;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.ij ijVar5;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.ij messageObject;
        ArrayList arrayList;
        org.telegram.messenger.dj djVar;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z11 = true;
            boolean z12 = true;
            char c10 = 1;
            char c11 = 1;
            if (!U9() && (ijVar == null || (message = ijVar.f23244k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.q1 q1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.a41) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.a41 a41Var = (org.telegram.ui.Components.a41) characterStyle;
                    org.telegram.messenger.g0.g(a41Var.f31691a.subSequence(a41Var.f31692b, a41Var.f31693c).toString());
                    f8();
                    UndoView undoView = this.M3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z9 && q1Var != null) {
                    q1Var.e3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.e41) {
                TLRPC.User a22 = getMessagesController().a2(Utilities.A(((org.telegram.ui.Components.e41) characterStyle).getURL()));
                if (a22 != null) {
                    org.telegram.messenger.qp.s1(this.currentAccount).z3(a22, null, this, 0);
                }
                if (z9 && q1Var != null) {
                    q1Var.e3(-1);
                }
                ja(ijVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.zz) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.zz) characterStyle).f41162b;
                if (tL_messageEntityFormattedDate == null || (messageObject = q1Var.getMessageObject()) == null) {
                    q1Var2 = q1Var;
                } else {
                    if (messageObject.d1() != 0 && (djVar = (org.telegram.messenger.dj) this.N6.f(messageObject.d1())) != null) {
                        arrayList = djVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.k(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e10 = getUserConfig().e();
                    String A = org.telegram.messenger.hd.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.k60 I = org.telegram.ui.Components.k60.I(this, q1Var);
                    org.telegram.ui.Components.jk0 jk0Var = new org.telegram.ui.Components.jk0(getParentActivity(), this.f44022xa);
                    I.f35200p = new ge(jk0Var, 0);
                    I.c(2131232103, org.telegram.messenger.hd.M0(2131746331, null), new ke(this, jk0Var, A, 0), false);
                    q1Var2 = q1Var;
                    I.c(2131232077, org.telegram.messenger.hd.M0(2131746332, null), new bi.r7((org.telegram.messenger.ls) this, (Object) I, (Object) messageObject, (Object) q1Var, A, (Object) tL_messageEntityFormattedDate, (Object) jk0Var, 4), false);
                    I.c(2131232262, org.telegram.messenger.hd.M0(2131746330, null), new bi.m3(this, I, e10, tL_messageEntityFormattedDate, arrayList2, jk0Var, 6), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    jk0Var.e(I);
                    jk0Var.f(q1Var2, characterStyle, spannableString, false);
                    showDialog(jk0Var);
                }
                if (q1Var2 != null) {
                    q1Var2.e3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.b41) {
                String url = ((org.telegram.ui.Components.b41) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    k8(q1Var, characterStyle, url.substring(4));
                    if (z9 && q1Var != null) {
                        q1Var.e3(-1);
                    }
                } else if (ijVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.y31.h) {
                        qj qjVar = this.Z;
                        TLRPC.Chat chat = this.f43771e;
                        if (chat == null || !chat.megagroup) {
                            z12 = false;
                        }
                        qjVar.Z0(ijVar, url, z9, z12);
                        if (!z9 && this.Z.getFieldText() == null) {
                            B9(false);
                        }
                    }
                    if (z9 && q1Var != null) {
                        q1Var.e3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.E6;
                    if (ijVar != null && url.startsWith("video") && !z9) {
                        int intValue = Utilities.z(url).intValue();
                        if (ijVar.f5()) {
                            webPage2 = ijVar.f23244k.media.webpage;
                            ijVar4 = ijVar;
                        } else {
                            org.telegram.messenger.ij ijVar6 = ijVar.C;
                            if (ijVar6 != null && ijVar6.f5()) {
                                ijVar4 = ijVar.C;
                                webPage2 = ijVar4.f23244k.media.webpage;
                            } else {
                                ijVar4 = ijVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.vt.N0(this, ijVar4, this.Za, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, T9());
                            return;
                        }
                        if (!org.telegram.messenger.ij.M4(ijVar4.f23244k) && (ijVar5 = ijVar4.C) != null) {
                            if (org.telegram.messenger.ij.B0(ijVar5.f23244k) == this.f43842j6) {
                                c10 = 0;
                            }
                            org.telegram.messenger.ij ijVar7 = (org.telegram.messenger.ij) sparseArrayArr[c10].get(ijVar4.C.f1());
                            if (ijVar7 == null) {
                                ijVar4 = ijVar4.C;
                            } else {
                                ijVar4 = ijVar7;
                            }
                        } else {
                            q1Var3 = q1Var;
                        }
                        ijVar4.f23209c0 = intValue / ((float) ijVar4.L0());
                        Ha(q1Var3, ijVar4);
                    } else if (ijVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!ijVar.J3() && (ijVar3 = ijVar.C) != null) {
                            if (org.telegram.messenger.ij.B0(ijVar3.f23244k) == this.f43842j6) {
                                c11 = 0;
                            }
                            ijVar2 = (org.telegram.messenger.ij) sparseArrayArr[c11].get(ijVar.C.f1());
                        } else {
                            ijVar2 = ijVar;
                        }
                        if (ijVar2 != null) {
                            float f10 = intValue2;
                            float L0 = f10 / ((float) ijVar2.L0());
                            MediaController mediaController = getMediaController();
                            if (mediaController.I(ijVar2)) {
                                ijVar2.f23204b0 = L0;
                                mediaController.i0(ijVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(ijVar2);
                                }
                            } else {
                                ijVar2.f23209c0 = f10 / ((float) ijVar2.L0());
                                mediaController.S(ijVar2);
                            }
                            if (z9 && q1Var != null) {
                                q1Var.e3(-1);
                            }
                            if (!org.telegram.messenger.ij.S4(ijVar2.f23244k)) {
                                showDialog(new org.telegram.ui.Components.b8(getParentActivity(), this.f44022xa));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        bi.l4 l4Var = new bi.l4(this, q1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            gi ka2 = ka(q1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (ka2 != null) {
                                ka2.f57231b = new gq0(zArr, 23);
                                ka2.d();
                            }
                            x10.Z(new bi.t3(this, zArr, ka2, userArr, l4Var, 1), substring);
                        } else {
                            l4Var.run();
                        }
                        if (q1Var != null) {
                            q1Var.e3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        gi ka3 = ka(q1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        ka3.f57231b = new qe(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new bi.r8(this, ka3, q1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().N3, 1, true), 2);
                        ka3.d();
                        q1Var.e3(-1);
                    } else {
                        za(characterStyle, url, z9, q1Var, ijVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    k8(q1Var, characterStyle, url2.substring(4));
                } else if (z9) {
                    i8(q1Var, ijVar, characterStyle, url2);
                    if (q1Var != null) {
                        q1Var.e3(-1);
                    }
                } else {
                    ja(ijVar, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        vf.c.t(parentActivity, url2);
                        return;
                    }
                    boolean z13 = characterStyle instanceof org.telegram.ui.Components.d41;
                    if ((z13 && (url2 == null || !url2.startsWith("mailto:"))) || org.telegram.messenger.g0.J3(url2)) {
                        if (ijVar != null) {
                            i10 = ijVar.f1();
                        } else {
                            i10 = 0;
                        }
                        if (Ea(url2, q1Var, characterStyle, i10, 1)) {
                            return;
                        }
                    } else {
                        if (ijVar != null) {
                            TLRPC.MessageMedia messageMedia = ijVar.f23244k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = ijVar.f23244k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                                        createArticleViewer(false).L(ijVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (ijVar != null) {
                            i7 = ijVar.f1();
                        } else {
                            i7 = 0;
                        }
                        if (!Ea(url2, q1Var, characterStyle, i7, 1)) {
                            z11 = z13;
                        } else {
                            return;
                        }
                    }
                    if (vf.c.z(url2)) {
                        z10 = false;
                    } else {
                        z10 = z11;
                    }
                    Wa(2, url2, characterStyle, q1Var, z10);
                }
            }
        }
    }

    public final float j9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.l1.getBackgroundTranslationY()) - ((1.0f - this.Q9) * this.L9);
    }

    public final void ja(org.telegram.messenger.ij ijVar, boolean z9, boolean z10) {
        if (ijVar != null && ijVar.s4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = ijVar.P0;
            tL_messages_clickSponsoredMessage.media = z9;
            tL_messages_clickSponsoredMessage.fullscreen = z10;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void jb(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.jb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void jc(boolean z9) {
        if (this.f43875m3 != null && !V9()) {
            if (this.f43875m3.getTag() == null) {
                ValueAnimator valueAnimator = this.f43988v3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f43875m3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44002w3, 1.0f);
                this.f43988v3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f43988v3.addUpdateListener(new ce(this, 2));
                this.f43988v3.addListener(new ei(this, 6));
                this.f43988v3.start();
            }
            if (!z9) {
                M9();
                this.f43899o3 = 1000;
            }
        }
    }

    public final void jd(int i7, int i10, int i11) {
        float f10;
        int i12;
        boolean z9;
        boolean z10;
        lh.h hVar = this.f44013x1;
        boolean z11 = false;
        if (hVar != null) {
            int i13 = 2;
            if (this.f43847jb) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if ((i12 & i7) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            hVar.b(6).f3277c = z9;
            h6.m mVar = hVar.f18383e[6];
            if (mVar != null) {
                ((kh.b) mVar.f14264b).b(z9, true);
            }
            lh.h hVar2 = this.f44013x1;
            if (this.f43847jb) {
                i13 = 1;
            }
            if ((i7 & i13) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar2.b(5).f3277c = z10;
            h6.m mVar2 = hVar2.f18383e[5];
            if (mVar2 != null) {
                ((kh.b) mVar2.f14264b).b(z10, true);
            }
        }
        this.K3 = i11;
        this.L3 = i10;
        kd();
        org.telegram.ui.Components.j6 j6Var = this.j3;
        if (j6Var != null) {
            if (i11 > 0) {
                z11 = true;
            }
            j6Var.setClickable(z11);
            ViewPropertyAnimator animate = this.j3.animate();
            if (i11 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
        }
    }

    public final void k7() {
        uj ujVar;
        tj tjVar;
        tj tjVar2;
        qj qjVar = this.Z;
        if (qjVar != null && qjVar.f31160z3) {
            MediaController.B().N = false;
            return;
        }
        TLRPC.Chat chat = this.f43771e;
        if (chat != null && !org.telegram.messenger.t3.v(chat)) {
            MediaController.B().N = false;
        } else if (!org.telegram.messenger.t0.f25571x && (((ujVar = this.f43746c1) == null || ujVar.getVisibility() != 0) && (((tjVar = this.S) == null || tjVar.getVisibility() != 0) && ((tjVar2 = this.f43789f3) == null || tjVar2.getVisibility() != 0)))) {
            MediaController.B().N = true;
        } else {
            MediaController.B().N = false;
        }
    }

    public final void k8(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, String str) {
        gi ka2 = ka(q1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f22596k0.get(pf.b.d(str, false));
        bi.z2 z2Var = new bi.z2(this, q1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                z2Var.a(a22);
                return;
            } else {
                getMessagesStorage().f26696a.c(new o1(this, tL_contact, z2Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        ka2.f57231b = new qe(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new z9(this, ka2, z2Var, 3)), 0);
        ka2.d();
    }

    public final float k9() {
        org.telegram.ui.Components.m11 m11Var = this.f43788f2;
        if (m11Var != null) {
            return m11Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final gi ka(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle) {
        vf.b bVar = this.f43728ac;
        if (bVar != null) {
            bVar.a(true);
            this.f43728ac = null;
        }
        if (characterStyle != null && q1Var != null && q1Var.getMessageObject() != null) {
            gi giVar = new gi(this, q1Var.getMessageObject().f1(), characterStyle, q1Var, 0);
            this.f43728ac = giVar;
            return giVar;
        }
        this.f43728ac = null;
        return null;
    }

    public final void kb() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.K7 = 0;
        this.A7 = false;
        this.B7 = true;
        this.f44018x6.clear();
    }

    public final boolean kc() {
        qj qjVar = this.Z;
        if (qjVar != null && qjVar.getVisibility() == 0) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("gifhint", false)) {
                e12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f43951s2 == null) {
                    if (!this.f43940r5) {
                        qj qjVar2 = this.Z;
                        if (qjVar2 != null) {
                            qjVar2.Q();
                            org.telegram.messenger.ui.b0(qjVar2.Q).V0(0, true, true, false);
                            org.telegram.ui.Components.mf mfVar = qjVar2.U0;
                            mfVar.L(false, false);
                            mfVar.Q(false, false);
                            mfVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        ol olVar = this.l1;
                        int indexOfChild = olVar.indexOfChild(this.T);
                        if (indexOfChild != -1) {
                            qj qjVar3 = this.Z;
                            qjVar3.Q();
                            org.telegram.messenger.ui.b0(qjVar3.Q).V0(0, true, true, false);
                            org.telegram.ui.Components.mf mfVar2 = qjVar3.U0;
                            mfVar2.L(false, false);
                            mfVar2.Q(false, false);
                            mfVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.K2 = view;
                            view.setBackgroundResource(2131232674);
                            int i7 = indexOfChild + 1;
                            olVar.addView(this.K2, i7, c8.ha.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            fi.m3 D6 = D6(310.0f, 3, i7, false);
                            this.f43951s2 = D6;
                            D6.d = 2300L;
                            D6.u(org.telegram.messenger.hd.M0(2131744269, null));
                            this.K2.setAlpha(0.0f);
                            this.K2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.Z.getEmojiButton();
                            if (emojiButton != null) {
                                this.f43951s2.y(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void kd() {
        org.telegram.ui.Components.j6 j6Var = this.f43828i3;
        if (j6Var != null) {
            boolean z9 = !org.telegram.messenger.hd.f22878a0;
            int i7 = this.K3;
            if (i7 < 0) {
                j6Var.c("", z9, true);
            } else if (i7 == 0) {
                j6Var.c(org.telegram.messenger.hd.M0(2131748166, null), z9, true);
            } else if (this.F3) {
                j6Var.c(org.telegram.messenger.hd.G(i7, "TaggedMessages", new Object[0]), z9, true);
            } else if (this.f43790f4 != 7 && !this.f43758cd.f55395f) {
                j6Var.c(org.telegram.messenger.hd.a0(null, null, 2131747828, Integer.valueOf(this.L3 + 1), Integer.valueOf(this.K3)), z9, true);
            } else {
                j6Var.c(org.telegram.messenger.hd.G(i7, "SearchMessagesResultCount", org.telegram.messenger.hd.E(i7, ' ')), z9, true);
            }
        }
    }

    @Override
    public final void l(int i7, int i10, boolean z9, int i11, boolean z10, int i12) {
        xb(i7, i10, z9, i11, z10, i12, null, null, null);
    }

    public final boolean l7(boolean z9, boolean z10) {
        qj qjVar = this.Z;
        if (qjVar == null || !qjVar.u0()) {
            return false;
        }
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44022xa);
            boolean z11 = this.Z.f31025c1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            if (z11) {
                u1Var.R = org.telegram.messenger.hd.M0(2131751396, null);
                u1Var.T = org.telegram.messenger.hd.M0(2131751397, null);
            } else {
                u1Var.R = org.telegram.messenger.hd.M0(2131751393, null);
                u1Var.T = org.telegram.messenger.hd.M0(2131751394, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751395, null), new ab.y(5, this, z10));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751771, null), null);
            showDialog(u1Var);
            return true;
        }
        return true;
    }

    public final void l8(org.telegram.ui.Cells.z r31, final org.telegram.tgnet.TLRPC.ReactionCount r32, boolean r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.l8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int l9() {
        return (int) (k9() * org.telegram.messenger.g0.L(71.0f));
    }

    public final void la(org.telegram.messenger.ij ijVar) {
        if (ijVar != null && ijVar.s4() && !ijVar.f23274s0) {
            ijVar.f23274s0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = ijVar.P0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void lb() {
        this.Yb = null;
        this.Wb = 0;
        this.Xb = -1;
        this.Zb = null;
        this.f43728ac = null;
        this.f44013x1.d(false);
    }

    public final void lc() {
        TLRPC.ChatFull chatFull = this.f43916p8;
        if (chatFull != null && !this.G5) {
            TLRPC.Chat chat = this.f43771e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.g0.i3(new ae(this, 17), 1000L);
            }
        }
    }

    public final void ld() {
        b8();
        String str = this.I3;
        if (str != null) {
            this.f43937r2.f31925e.setText(org.telegram.messenger.hd.a0(null, null, 2131749353, str));
            this.Z3.setEmptyView(this.f43937r2);
            return;
        }
        this.Z3.setEmptyView(null);
        this.f43937r2.setVisibility(8);
    }

    public final void m7() {
        if (!this.f43959sc) {
            this.f43959sc = true;
            if (!this.f43971tc && this.f43790f4 == 0 && !getMessagesController().G1().f26206b && getMessagesController().G1().c() > 2) {
                if (this.J1 != null && org.telegram.messenger.qp.e1().getInt("savedhint", 0) < 1) {
                    this.J1.w();
                    this.f43971tc = true;
                    org.telegram.messenger.qp.e1().edit().putInt("savedhint", org.telegram.messenger.qp.e1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.qp.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.K1 != null && org.telegram.messenger.qp.e1().getInt("savedsearchhint", 0) < 1) {
                    this.K1.w();
                    this.f43971tc = true;
                    org.telegram.messenger.qp.e1().edit().putInt("savedsearchhint", org.telegram.messenger.qp.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    n7();
                }
            }
        }
    }

    public final void m8(int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.m8(int, java.lang.Object[]):void");
    }

    public final org.telegram.ui.ActionBar.r0 m9() {
        org.telegram.ui.ActionBar.r0 r0Var = this.f43861l0;
        if (r0Var != null && r0Var.getVisibility() == 0 && this.f43861l0.getWidth() != 0 && this.actionBar != null && (this.f43861l0.getParent() instanceof View)) {
            return this.f43861l0;
        }
        return null;
    }

    public final boolean ma() {
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.Components.v5 v5Var;
        org.telegram.messenger.ij ijVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.v5 m10;
        boolean z9;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        if (this.f44037z0 != null && ((ijVar = MediaController.B().f21292u0) == null || org.telegram.messenger.ij.M4(ijVar.f23244k))) {
            fi.m3 m3Var = this.H2;
            ArrayList arrayList = null;
            if (m3Var != null && m3Var.V && (q1Var = this.Hb) != null) {
                ImageReceiver photoImage2 = q1Var.getPhotoImage();
                v5Var = photoImage2.m();
                if (v5Var != null) {
                    ijVar2 = q1Var.getMessageObject();
                    if (photoImage2.A() + q1Var.getTop() > this.f44037z0.getMeasuredHeight()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.L8 = z10;
                } else {
                    ijVar2 = null;
                }
            } else {
                v5Var = null;
                ijVar2 = null;
            }
            if (ijVar2 == null) {
                int childCount = this.f44037z0.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = this.f44037z0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.ij messageObject = q1Var2.getMessageObject();
                        boolean i42 = messageObject.i4();
                        if (!messageObject.h4() && !messageObject.T4() && ((org.telegram.messenger.ij.M4(messageObject.f23244k) || i42) && messageObject.f23262p0 == null && (m10 = (photoImage = q1Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.L0;
                            float f10 = photoImage.N0 + top;
                            if (f10 >= 0.0f && top <= this.f44037z0.getMeasuredHeight()) {
                                if (ijVar2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f10 <= this.f44037z0.getMeasuredHeight()) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                this.L8 = z9;
                                if (top >= 0.0f && f10 <= this.f44037z0.getMeasuredHeight()) {
                                    ijVar2 = messageObject;
                                    v5Var = m10;
                                    break;
                                }
                                ijVar2 = messageObject;
                                v5Var = m10;
                            }
                        }
                    }
                    i7++;
                }
            }
            if (ijVar2 != null && !MediaController.B().I(ijVar2)) {
                E9(true);
                if (ijVar2.i4()) {
                    boolean S = MediaController.B().S(ijVar2);
                    MediaController B = MediaController.B();
                    if (S) {
                        arrayList = g8(ijVar2, false);
                    }
                    B.r0(arrayList, false);
                    return S;
                }
                org.telegram.messenger.iz.D(true);
                ijVar2.f23204b0 = v5Var.n();
                ijVar2.f23213d0 = v5Var.o();
                v5Var.stop();
                if (PhotoViewer.J1(ijVar2)) {
                    PhotoViewer.f41340f9.J0();
                }
                return MediaController.B().S(ijVar2);
            }
        }
        return false;
    }

    public final void mb(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.mb(org.telegram.ui.Cells.q1):void");
    }

    public final void mc(org.telegram.messenger.ij ijVar, CharSequence charSequence, int i7) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.cc G = org.telegram.ui.Components.hc.a0(this).G(2131623981, 9999, charSequence);
        G.f32514j = max;
        G.v = new qe(this, i7, 3);
        G.k(true);
        this.U3 = ijVar;
        this.V3 = i7;
    }

    public final void md() {
        boolean z9;
        if (this.f44013x1 == null) {
            return;
        }
        if ((!getMediaDataController().Y0.isEmpty() && this.G3 && !this.F3) || (this.f43790f4 == 7 && this.f43749c4 == 2 && !this.K6.isEmpty())) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f44013x1.e(6, z9, true);
        this.f44013x1.e(5, z9, true);
        if (z9) {
            this.f44013x1.e(1, false, true);
        }
        if (!z9) {
            this.R7 = 0;
        }
        this.l1.invalidate();
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        boolean z11;
        String str2 = null;
        B8(str, null);
        if (t7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, this.f43842j6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = W8();
                z11 = z10;
                b10.L = z11;
                b10.Q = j10;
                b10.R = h9();
                b10.T = this.f44004w5;
                org.telegram.messenger.gz.C(this.currentAccount).r0(b10);
            } else {
                z11 = z10;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f43842j6, false, false, true, 0, 0, null, -1, j10, h9(), this.f44004w5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j11 = this.f43842j6;
            org.telegram.messenger.ij ijVar = this.D5;
            org.telegram.messenger.ij ijVar2 = this.f43864l4;
            qm qmVar = this.B5;
            String str3 = str2;
            org.telegram.messenger.gz.V(i7, j11, j3, j10, h9(), str3, null, arrayList, arrayList, null, arrayList2, null, null, accountInstance, ijVar, ijVar2, this.F5, this.f44004w5, W8(), null, qmVar, null, null, z9, z11);
            K6();
        }
    }

    public final void n7() {
        org.telegram.ui.Cells.q1 q1Var;
        fi.m3 m3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z9;
        fi.m3 m3Var2 = this.L1;
        if (m3Var2 != null && !m3Var2.V && !this.f43997vc && this.f43959sc && !this.f43758cd.f55395f && System.currentTimeMillis() - this.f43984uc > 1800 && org.telegram.messenger.qp.e1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f44037z0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f44037z0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        ch.p0 p0Var = q1Var.N;
                        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f23244k) == null || (tL_messageReactions = message.reactions) == null) {
                            z9 = false;
                        } else {
                            z9 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z9 && !p0Var.f6376s.isEmpty()) {
                            q1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + p0Var.f6362c;
                            if (f10 >= org.telegram.messenger.g0.L(240.0f) && f10 <= (org.telegram.messenger.g0.f22544q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f22539n) {
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
                ch.p0 p0Var2 = q1Var.N;
                this.f43997vc = true;
                q1Var.getLocationInWindow(iArr);
                this.L1.setTranslationY(((iArr[1] - m3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)) + p0Var2.f6362c);
                this.L1.p(0.0f, (((ch.m0) p0Var2.f6376s.get(0)).f6337z / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + p0Var2.f6361b);
                this.L1.w();
                org.telegram.messenger.qp.e1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.g0.r(new ae(this, 22));
            org.telegram.messenger.g0.i3(new ae(this, 22), 2000L);
        }
    }

    public final void n8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.n8(int, java.lang.Object[]):void");
    }

    public final int n9(int i7) {
        SparseIntArray sparseIntArray = this.f43817h5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f43708kd;
            f43708kd = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final void na(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null) {
            return;
        }
        long j3 = ijVar.f23244k.action.channel_id;
        if (q4Var.getFragmentStack().size() > 0) {
            f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            f2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
        if (indexOf > 0 && !(f2Var instanceof an) && !(f2Var instanceof ProfileActivity) && this.f43771e.creator) {
            int size = q4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) q4Var2.getFragmentStack().get(indexOf);
                if (f2Var2 instanceof an) {
                    ((ActionBarLayout) q4Var2).c(indexOf, new an(a8.p0.j(j3, "chat_id")));
                    f2Var2.removeSelfFromStack();
                } else if (f2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) q4Var2).c(indexOf, new ProfileActivity(a8.p0.j(j3, "chat_id"), null));
                    f2Var2.removeSelfFromStack();
                } else if (f2Var2 instanceof pn) {
                    ((ActionBarLayout) q4Var2).c(indexOf, new pn(a8.p0.j(j3, "chat_id")));
                    f2Var2.removeSelfFromStack();
                } else if (f2Var2 instanceof oq) {
                    if (((oq) f2Var2).f48478d1 == 0) {
                        Bundle arguments = f2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) q4Var2).c(indexOf, new oq(arguments));
                    }
                    f2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.g0.h3(new m6(this, f2Var, ijVar, q4Var2, 4));
        }
        org.telegram.messenger.g0.i3(new bg.j0(this, j3, 2), 1000L);
    }

    public final void nb() {
        org.telegram.ui.Components.qa0 k10;
        ym ymVar = this.f44022xa;
        if (ymVar != null) {
            Drawable m10 = ymVar.m();
            if (this.fragmentView != null) {
                m10 = this.l1.getBackgroundImage();
            }
            if (m10 instanceof dn) {
                m10 = ((dn) m10).c(true);
            }
            if (m10 instanceof org.telegram.ui.Components.qa0) {
                ((org.telegram.ui.Components.qa0) m10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.t4) && (k10 = ((org.telegram.ui.ActionBar.t4) themedDrawable).k()) != null) {
                k10.w(false);
            }
        }
    }

    public final void nc(boolean z9) {
        boolean z10;
        lh.h hVar = this.f44013x1;
        if (hVar != null) {
            if (z9 && !org.telegram.messenger.t3.p0(this.f43771e)) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.e(2, z10, true);
            if (!z9) {
                this.R7 = 0;
            }
        }
    }

    public final void nd(String str) {
        if (this.f43790f4 == 7 && !TextUtils.equals(this.I3, str)) {
            b8();
            oc(true);
            this.I3 = str;
            this.H3 = str;
            f7(false);
            L7(true);
            this.f43765d7 = 0L;
            this.A7 = false;
            org.telegram.messenger.oa.a(this.currentAccount).b(this.f43749c4).a();
            this.f43720a4.f();
            this.Z3.requestLayout();
            if (this.Z3.getLayoutManager() != null) {
                this.Z3.getLayoutManager().n0(0);
            }
            ld();
            this.f43937r2.e(true, true);
            J8();
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f43790f4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((f2Var instanceof an) && ((an) f2Var).T9()) {
                return false;
            }
        }
        return this.X6;
    }

    public final void o7(boolean z9) {
        int i7;
        if (this.B0 != null && !this.G5 && !this.C0.L && !this.f43992v7) {
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < this.f44037z0.getChildCount(); i13++) {
                int R = RecyclerView.R(this.f44037z0.getChildAt(i13));
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
            jl jlVar = this.C0;
            if (jlVar.N) {
                int i14 = jlVar.E;
                if (i14 >= 0 && i12 >= 0 && i14 >= i12 && i14 <= i11) {
                    getMediaDataController().O0();
                    return;
                }
                return;
            }
            int b10 = jlVar.b();
            if (z9) {
                i7 = 25;
            } else {
                i7 = 5;
            }
            int i15 = i7;
            if (this.f43790f4 == 7) {
                if ((b10 - i12) - i10 <= i15 && !this.W6 && !this.S6[0]) {
                    this.W6 = true;
                    this.f44018x6.add(Integer.valueOf(this.f43866l6));
                    org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(this.currentAccount);
                    String str = this.I3;
                    int i16 = this.classGuid;
                    int i17 = this.f43749c4;
                    int i18 = this.f43866l6;
                    this.f43866l6 = i18 + 1;
                    a10.e(i16, i17, i18, str);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(new org.telegram.messenger.jr(this, b10, i12, i10, i15, 1));
        }
    }

    public final void o8(int r34, final java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.o8(int, java.lang.Object[]):void");
    }

    public final int o9(int i7) {
        SparseIntArray sparseIntArray = this.f43803g5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f43708kd;
            f43708kd = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final void oa(boolean z9) {
        int i7;
        if (this.f44037z0 != null) {
            ArrayList arrayList = this.K6;
            if (!arrayList.isEmpty() && !this.Pa.f45710n) {
                if (z9) {
                    i7 = 0;
                    while (i7 < arrayList.size() && ((org.telegram.messenger.ij) arrayList.get(i7)).s4()) {
                        i7++;
                    }
                } else {
                    i7 = 0;
                }
                this.B0.h1(i7, 0);
                this.f44037z0.C0();
            }
        }
    }

    public final void ob() {
        boolean z9;
        org.telegram.messenger.ij ijVar;
        CharSequence charSequence;
        boolean z10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        uj ujVar;
        qj qjVar = this.Z;
        if (qjVar != null && qjVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f43854k5 && qjVar != null && (ujVar = this.f43746c1) != null && ujVar.getVisibility() != 0) {
            ijVar = this.D5;
            charSequence = org.telegram.messenger.g0.n1(this.Z.getDraftMessage());
            z9 = this.Z.Y2;
        } else {
            z9 = true;
            ijVar = null;
            charSequence = null;
        }
        if (this.C5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList W = mediaDataController.W(charSequenceArr, z10, false);
        long P7 = P7(ijVar);
        TLRPC.DraftMessage R = getMediaDataController().R(this.f43842j6, P7);
        if (R != null) {
            richMessage = R.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.ui mediaDataController2 = getMediaDataController();
        long j10 = this.f43842j6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (ijVar != null && !ijVar.f23261p && ijVar.f23232h1 == null && !this.C5) {
            message = ijVar.f23244k;
        } else {
            message = null;
        }
        qm qmVar = this.B5;
        org.telegram.messenger.nj njVar = this.f44004w5;
        if (njVar != null) {
            suggestedPost = njVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        qj qjVar2 = this.Z;
        if (qjVar2 != null) {
            j3 = qjVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.Q1(j10, P7, charSequence2, W, message, qmVar, suggestedPost2, j3, !z9, false, richMessage);
    }

    public final void oc(boolean z9) {
        int i7;
        if (this.Y3 != null) {
            te.a aVar = this.f43758cd;
            if (aVar.f55395f != z9) {
                aVar.a(z9, true);
                if (!z9 && this.f43790f4 == 7) {
                    v4.b0 b0Var = (v4.b0) this.Z3.getLayoutManager();
                    Object E = this.f43720a4.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.f43720a4.E(b0Var.L0());
                    Object E3 = this.f43720a4.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.C0.L();
                        int L0 = this.B0.L0();
                        int N0 = this.B0.N0();
                        int i10 = ((org.telegram.messenger.ij) E).f23244k.f26974id;
                        int i11 = ((org.telegram.messenger.ij) E2).f23244k.f26974id;
                        int i12 = ((org.telegram.messenger.ij) E3).f23244k.f26974id;
                        int i13 = -1;
                        boolean z10 = false;
                        boolean z11 = false;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((org.telegram.messenger.ij) L.get(i14)).f23244k.f26974id == i11) {
                                int i15 = this.C0.J + i14;
                                if (L0 <= i15 && N0 >= i15) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.ij) L.get(i14)).f23244k.f26974id == i12) {
                                int i16 = this.C0.J + i14;
                                if (L0 <= i16 && N0 >= i16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.ij) L.get(i14)).f23244k.f26974id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z10 && !z11 && i13 != -1) {
                            this.B0.h1(this.C0.J + i13, (this.f44037z0.getHeight() - U8((org.telegram.messenger.ij) L.get(i13), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.j6 j6Var = this.j3;
                if (j6Var != null) {
                    if (aVar.f55395f) {
                        i7 = 2131745819;
                    } else {
                        i7 = 2131745818;
                    }
                    j6Var.c(org.telegram.messenger.hd.M0(i7, null), !org.telegram.messenger.hd.f22878a0, true);
                }
                fi.m3 m3Var = this.L1;
                if (m3Var != null && m3Var.V) {
                    m3Var.f(true);
                }
                zk zkVar = this.P1;
                if (zkVar != null && zkVar.V) {
                    zkVar.f(true);
                }
                qj qjVar = this.Z;
                if (qjVar != null) {
                    qjVar.i0();
                }
                kd();
            }
        }
    }

    public final void od() {
        qj qjVar;
        if (this.S != null) {
            this.G0.setBackground(null);
            this.G0.setOnClickListener(null);
            boolean z9 = true;
            if (this.f43790f4 == 3 && c9() == 2666000) {
                this.G0.setText(org.telegram.messenger.hd.M0(2131753882, null));
                this.S.setVisibility(0);
                this.W1.setVisibility(8);
                this.W1.setTag(null);
                Wc();
                org.telegram.ui.Components.ow0 ow0Var = this.f43936r1;
                if (ow0Var != null) {
                    ow0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f43771e;
                if (chat != null && !org.telegram.messenger.t3.n(chat)) {
                    TLRPC.Chat chat2 = this.f43771e;
                    if (!org.telegram.messenger.t3.p(chat2) && !org.telegram.messenger.t3.u(chat2) && !org.telegram.messenger.t3.s(chat2) && !org.telegram.messenger.t3.v(chat2) && !org.telegram.messenger.t3.l(chat2) && !org.telegram.messenger.t3.o(chat2) && !org.telegram.messenger.t3.t(chat2)) {
                        TLRPC.Chat chat3 = this.f43771e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.t3.T(chat3) || this.f43771e.megagroup)) {
                            TLRPC.Chat chat4 = this.f43771e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.t3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i7 = org.telegram.ui.ActionBar.k6.Ci;
                                    mutate.setTint(getThemedColor(i7));
                                    this.P0 = mutate;
                                    this.M0 = getThemedColor(i7);
                                    mutate.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
                                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(null, mutate, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(-6.0f));
                                    int L = org.telegram.messenger.g0.L(14.0f);
                                    int L2 = org.telegram.messenger.g0.L(14.0f);
                                    xpVar.f40334e = L;
                                    xpVar.f40335f = L2;
                                    int L3 = org.telegram.messenger.g0.L(14.0f);
                                    int L4 = org.telegram.messenger.g0.L(14.0f);
                                    xpVar.h = L3;
                                    xpVar.f40336n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131753581, null, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(i7, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(xpVar, 1), 0, 1, 33);
                                    TextView textView = this.G0;
                                    int i10 = org.telegram.ui.ActionBar.k6.f27941i6;
                                    org.telegram.ui.ActionBar.r6.R(textView, org.telegram.ui.ActionBar.k6.i0(0, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), null, org.telegram.ui.ActionBar.r6.N(i10), null);
                                    this.G0.setText(spannableStringBuilder);
                                    this.G0.setOnClickListener(new le(this, 0));
                                } else {
                                    this.G0.setText(org.telegram.messenger.hd.M0(2131749533, null));
                                }
                            } else if (org.telegram.messenger.g0.D1(chat4.banned_rights)) {
                                this.G0.setText(org.telegram.messenger.hd.M0(2131745598, null));
                            } else {
                                this.G0.setText(org.telegram.messenger.hd.a0("SendMessageRestricted", null, 2131745599, org.telegram.messenger.hd.v(this.f43771e.banned_rights.until_date)));
                            }
                            this.S.setVisibility(0);
                            this.W1.setVisibility(8);
                            this.W1.setTag(null);
                            Wc();
                            org.telegram.ui.Components.ow0 ow0Var2 = this.f43936r1;
                            if (ow0Var2 != null) {
                                ow0Var2.f();
                            }
                        }
                    }
                }
                V7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f43873m1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.G0.setText(org.telegram.messenger.hd.M0(2131751130, null));
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.k5.r("AwaitingEncryption", null, 2131753757, new Object[]{a8.p0.s(new StringBuilder("<b>"), this.f43785f.first_name, "</b>")}, this.G0);
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.G0.setText(org.telegram.messenger.hd.M0(2131751129, null));
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                        this.Z.setFieldText("");
                        getMediaDataController().D(this.f43842j6, this.f43939r4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.S.setVisibility(4);
                            if (!this.inPreviewMode && !this.f43835ib && this.f43790f4 != 3) {
                                this.Z.setVisibility(0);
                            }
                        }
                        z9 = false;
                    }
                    k7();
                    U6(false);
                } else {
                    this.S.setVisibility(4);
                    if (this.f43936r1 != null && (qjVar = this.Z) != null && qjVar.h0()) {
                        this.f43936r1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.S.setVisibility(4);
            }
            if (z9) {
                this.Z.k0(false);
                if (getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.t40 t40Var;
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.Components.xe xeVar;
        org.telegram.ui.ActionBar.u1 u1Var2;
        org.telegram.ui.Components.ve veVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        pl plVar;
        ch.q qVar;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getOpenMenuOverlay() != null) {
            if (z9 && (i5Var = this.actionBar.Z0) != null) {
                i5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.s01 s01Var = this.m0;
            if (s01Var != null && s01Var.f37835y > 0.0f) {
                if (z9) {
                    s01Var.d();
                    return false;
                }
            } else {
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32506w;
                if (ccVar != null) {
                    org.telegram.ui.Components.gb gbVar = ccVar.f32510e;
                    if (gbVar instanceof org.telegram.ui.Components.nb) {
                        if (z9) {
                            ((org.telegram.ui.Components.nb) gbVar).f();
                            ccVar.b();
                            return false;
                        }
                    }
                }
                rz0 rz0Var = this.f43957sa;
                if (rz0Var != null && !rz0Var.f49594b0) {
                    if (z9) {
                        rz0Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z9) {
                        closeSheet();
                        return false;
                    }
                } else {
                    ch.r rVar = this.f43945ra;
                    if (rVar != null && (qVar = rVar.f6385b) != null && qVar.getReactionsWindow() != null) {
                        if (z9) {
                            rVar.f6385b.e();
                            return false;
                        }
                    } else if (ks.p().E) {
                        if (z9) {
                            ks.p().n();
                            return false;
                        }
                    } else {
                        lk lkVar = this.Ya;
                        if (lkVar != null && lkVar.f34575s) {
                            if (z9) {
                                lkVar.a(true);
                                return false;
                            }
                        } else if (this.f43758cd.f55395f) {
                            if (z9) {
                                oc(false);
                                return false;
                            }
                        } else if (this.f43781e9 != null) {
                            if (z9) {
                                O7(true);
                                return false;
                            }
                        } else if (!l7(z9, false)) {
                            if (y9()) {
                                if (z9 && (plVar = this.f43930q9) != null && plVar.x()) {
                                    this.f43930q9.f(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                if (kVar2 != null && kVar2.v()) {
                                    if (z9) {
                                        N7(false);
                                        return false;
                                    }
                                } else {
                                    qj qjVar = this.Z;
                                    if (qjVar != null && qjVar.s0() && (qjVar.f31045f2 != 1 || (tL_replyKeyboardMarkup = qjVar.f31090n2) == null || !tL_replyKeyboardMarkup.is_persistent || qjVar.f31084m2 == null)) {
                                        if (z9) {
                                            this.Z.k0(true);
                                            return false;
                                        }
                                    } else {
                                        qj qjVar2 = this.Z;
                                        if (qjVar2 != null && qjVar2.s()) {
                                            if (z9) {
                                                qj qjVar3 = this.Z;
                                                hi.y yVar = qjVar3.f31078l0;
                                                if (yVar != null) {
                                                    yVar.setOpened(false);
                                                }
                                                if (!qjVar3.g0() && (veVar = qjVar3.m0) != null) {
                                                    veVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            qj qjVar4 = this.Z;
                                            if (qjVar4 != null && (xeVar = qjVar4.E0) != null && (u1Var2 = xeVar.V1) != null && u1Var2.isShowing()) {
                                                if (z9) {
                                                    xeVar.V1.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f43790f4 == 6 && (u1Var = kg.v.f17557e) != null && u1Var.isShowing()) {
                                                if (z9) {
                                                    kg.v.f17557e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.t3.p0(this.f43771e) && !this.f43816h4 && this.f43788f2 != null && b() != 0) {
                                                if (z9) {
                                                    this.f43788f2.n(0L, this.F7);
                                                    return false;
                                                }
                                            } else if (this.f43790f4 == 5 && !"hello".equalsIgnoreCase(this.f43776e4) && !"away".equalsIgnoreCase(this.f43776e4) && (this.K6.isEmpty() || this.f43939r4 == 0)) {
                                                if (z9) {
                                                    tc();
                                                    return false;
                                                }
                                            } else if (this.f43790f4 == 6 && this.Z.t()) {
                                                if (z9) {
                                                    Zb(new af(this, 18));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                                                if (kVar3 != null && kVar3.f27677n0) {
                                                    if (z9) {
                                                        kVar3.l(true);
                                                        return false;
                                                    }
                                                } else if (this.f43729ad.f55395f) {
                                                    if (z9) {
                                                        Sa();
                                                    }
                                                } else {
                                                    if (z9 && (t40Var = this.f43911p3) != null) {
                                                        t40Var.a(false);
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
        H9();
        if (!getMessagesController().D3() && getMessagesController().f24887s4 <= 0 && getMessagesController().i7 < 2 && !getUserConfig().q() && (arrayList = this.K6) != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                if (ijVar != null && !ijVar.Q3() && ((org.telegram.messenger.ij.S4(ijVar.f23244k) || ijVar.i4()) && !ijVar.G4() && (ijVar.f23244k.media_unread || org.telegram.messenger.t3.V(this.f43771e)))) {
                    org.telegram.ui.Components.s11.r(ijVar, false);
                }
            }
        }
        this.T3 = false;
        I9();
        ArrayList arrayList2 = org.telegram.ui.Components.s11.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        vf.b bVar = this.f43728ac;
        if (bVar != null) {
            bVar.a(false);
            this.f43728ac = null;
        }
        this.S3.e();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.T3 = true;
        super.onBecomeFullyVisible();
        if (this.P) {
            showDialog(this.O);
        }
        if (this.Ab) {
            qj qjVar = this.Z;
            if (qjVar != null) {
                qjVar.I0();
                qj qjVar2 = this.Z;
                qjVar2.T0 = false;
                org.telegram.ui.Components.mf mfVar = qjVar2.U0;
                if (mfVar != null) {
                    mfVar.u(false);
                }
            }
            this.Ab = false;
        }
        if (this.J1 != null) {
            org.telegram.messenger.g0.i3(new ae(this, 1), 600L);
        }
        if (this.F4 && !this.G4) {
            this.G4 = true;
            org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(this).I(2131623992, org.telegram.messenger.hd.M0(2131743598, null), org.telegram.messenger.hd.M0(2131743600, null));
            I.f32514j = 5000;
            I.v = new ae(this, 2);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ch.r rVar = this.f43945ra;
        if (rVar != null && rVar.d()) {
            this.f43945ra.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.ij ijVar;
        long j3;
        long j10;
        ui uiVar = this.f43897o1;
        if (uiVar != null) {
            ViewTreeObserver viewTreeObserver = uiVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new lh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        O7(true);
        if (!org.telegram.messenger.g0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.A1() || !PhotoViewer.p1().P1()) && (ijVar = MediaController.B().f21292u0) != null && org.telegram.messenger.ij.M4(ijVar.f23244k)) {
                    PhotoViewer.p1().H2(null, this, this.f44022xa);
                    getFileLoader().c0(ijVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i7 = ijVar.D;
                    long j11 = 0;
                    if (i7 != 0) {
                        j3 = this.f43842j6;
                    } else {
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        j10 = this.f43738b7;
                    } else {
                        j10 = 0;
                    }
                    if (i7 != 0) {
                        j11 = b();
                    }
                    if (p12.c2(ijVar, null, null, null, null, null, null, 0, this.Za, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.p1().f41436k4 = this;
                    }
                    E9(false);
                    MediaController.B().f21294v0 = null;
                }
            } else if (PhotoViewer.A1() && PhotoViewer.p1().f41442l2) {
                PhotoViewer p13 = PhotoViewer.p1();
                if (p13.F2.d0()) {
                    if (p13.Y2) {
                        p13.F2.s0(false);
                    }
                    MediaController B = MediaController.B();
                    org.telegram.ui.Components.t51 t51Var = p13.F2;
                    org.telegram.messenger.ij ijVar2 = p13.S4;
                    if (t51Var != null && ijVar2 != null) {
                        int i10 = ijVar2.I1;
                        org.telegram.messenger.w7.G(i10).c0(ijVar2.F0(), true);
                        B.F0 = false;
                        B.r();
                        B.E0 = t51Var;
                        B.f21292u0 = ijVar2;
                        int i11 = B.m0 + 1;
                        B.m0 = i11;
                        t51Var.J = new org.telegram.messenger.le(B, i11, ijVar2, 1);
                        B.P0 = false;
                        TextureView textureView = B.G0;
                        if (textureView != null) {
                            t51Var.A0(textureView);
                        }
                        B.j(ijVar2);
                        B.n0();
                        B.f21264g0 = false;
                        org.telegram.messenger.ij ijVar3 = B.f21292u0;
                        B.f21292u0 = ijVar2;
                        if (!org.telegram.messenger.iz.k(true)) {
                            B.w0(B.f21287s);
                        }
                        B.v0(B.f21292u0);
                        org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.f25001h2, ijVar2, ijVar3);
                    }
                    p13.F2 = null;
                }
                PhotoViewer.p1().z0(false, true);
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        ValueAnimator ofFloat;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int measuredHeight4;
        xj xjVar = this.f43918pa;
        float f10 = 0.0f;
        if (z9 && this.f43859ka && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (f2Var instanceof an) {
                this.P4 = true;
                an anVar = (an) f2Var;
                anVar.ma = this;
                this.fragmentView.setAlpha(0.0f);
                this.l1.setSkipBackgroundDrawing(true);
                this.f43897o1.setTranslationY(org.telegram.messenger.g0.L(8.0f));
                this.f43897o1.getAvatarImageView().setAlpha(0.0f);
                this.f43897o1.getAvatarImageView().setTranslationY(-org.telegram.messenger.g0.L(8.0f));
                this.f43870la = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                qj qjVar = this.Z;
                if (qjVar != null) {
                    qjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22544q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                tj tjVar = this.S;
                if (tjVar != null) {
                    tjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22544q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                qj qjVar2 = this.Z;
                if (qjVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = qjVar2.getMeasuredHeight();
                }
                tj tjVar2 = this.S;
                if (tjVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = tjVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                qj qjVar3 = anVar.Z;
                if (qjVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = qjVar3.getMeasuredHeight();
                }
                tj tjVar3 = this.S;
                if (tjVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = tjVar3.getMeasuredHeight();
                }
                this.f43821ha = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new bi.de(10, this, anVar));
                Nc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f43905oa = animatorSet;
                animatorSet.addListener(new fi.b5(this, anVar, runnable));
                this.f43905oa.setDuration(300L);
                this.f43905oa.setInterpolator(org.telegram.ui.Components.xq.f40345f);
                this.f43905oa.playTogether(ofFloat2);
                org.telegram.messenger.g0.i3(xjVar, 200L);
                return this.f43905oa;
            }
        }
        if (this.Ca && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (f2Var2 instanceof v91) {
                float[] fArr = {1.0f, 0.0f};
                if (z9) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                f2Var2.getFragmentView().getWidth();
                if (!z9) {
                    f10 = 1.0f;
                }
                this.Ea = f10;
                ofFloat.addUpdateListener(new ii(0, this));
                this.Da = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                ol olVar = this.l1;
                if (olVar != null) {
                    olVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f43905oa = animatorSet2;
                animatorSet2.addListener(new ji(this, z9, runnable));
                this.f43905oa.setDuration(150L);
                this.f43905oa.playTogether(ofFloat);
                if (z9) {
                    org.telegram.messenger.g0.i3(xjVar, 200L);
                } else {
                    this.f43905oa.start();
                }
                return this.f43905oa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.u1 u1Var = this.O;
        if (u1Var != null && dialog == u1Var) {
            getMessagesController().X(0, this.f43842j6, false);
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && !q4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
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
        boolean z9;
        org.telegram.ui.Components.ps0 ps0Var;
        super.onFragmentDestroy();
        jh.e eVar = this.f43735b4;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f17033x;
            int size = longSparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i7);
                if (dVar.f17019i) {
                    eVar.f17032w.add(dVar.a());
                }
            }
            if (org.telegram.messenger.r2.f25199a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        qj qjVar = this.Z;
        if (qjVar != null) {
            qjVar.B0();
        }
        ui uiVar = this.f43897o1;
        if (uiVar != null && (ps0Var = uiVar.f35339c0) != null) {
            ps0Var.b(uiVar.G);
        }
        jj jjVar = this.W1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            this.W1.getAdapter().P();
        }
        di.u2 u2Var = this.X1;
        if (u2Var != null) {
            u2Var.K();
        }
        ks p10 = ks.p();
        if (p10.f47281l == this.D9) {
            p10.W = null;
            p10.f47268a0 = null;
            p10.Y = null;
            p10.f47281l = null;
            p10.f47272c0 = null;
            p10.t();
        }
        getNotificationCenter().j(this.Y9);
        org.telegram.messenger.qs.e().j(this.Z9);
        getNotificationCenter().j(this.f43726aa);
        getNotificationCenter().j(this.f43741ba);
        I9();
        ae aeVar = this.f43737b6;
        if (aeVar != null) {
            org.telegram.messenger.g0.r(aeVar);
            this.f43737b6 = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        ek ekVar = this.Ga;
        notificationCenter.getClass();
        boolean z10 = org.telegram.messenger.r2.f25199a;
        if (Thread.currentThread() == org.telegram.messenger.t0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(ekVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.f43842j6;
            if (this.f43790f4 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            messagesController.K4(j3, z9, false);
            ab.b0 b0Var = this.f43871lb;
            if (b0Var != null) {
                b0Var.b();
                this.f43871lb = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25067t);
            if (this.f43790f4 == 0 && org.telegram.messenger.g0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.qs.f24999h0, Long.valueOf(this.f43842j6), Long.valueOf(b()), Boolean.TRUE);
            }
            if (this.f43785f != null) {
                MediaController B = MediaController.B();
                if (B.S1 == null) {
                    B.S1 = new androidx.emoji2.text.j(B);
                }
                B.S1.f2306b = 0;
                org.telegram.messenger.t0.d.postDelayed(B.S1, 5000L);
            }
            org.telegram.messenger.n6 n6Var = this.S3;
            if (n6Var != null) {
                n6Var.e();
            }
            if (this.f43785f != null) {
                getMessagesController().f24864q1.remove(Long.valueOf(this.f43785f.f27102id));
            }
            org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
            di.u2 u2Var2 = this.X1;
            if (u2Var2 != null) {
                u2Var2.j1();
                this.X1 = null;
            }
            org.telegram.messenger.g0.Q3(getParentActivity());
            if (org.telegram.messenger.t3.T(this.f43771e)) {
                getMessagesController().V4(this.f43771e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f43916p8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().V4(getMessagesController().M0(Long.valueOf(this.f43916p8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            pl plVar = this.f43930q9;
            if (plVar != null) {
                plVar.f(false);
            }
            cj cjVar = this.A0;
            if (cjVar != null) {
                cjVar.N();
            }
            yj yjVar = this.Pa;
            if (yjVar != null) {
                yjVar.b();
            }
            this.f43982ua = null;
            org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f43713pd ? 1 : 0);
                org.telegram.ui.ActionBar.q4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i10 = 0;
                    while (i10 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.c9) parentLayout2.getPulledDialogs().get(i10)).f32464b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                }
            }
            f43713pd = false;
            vf.b bVar = this.f43728ac;
            if (bVar != null) {
                bVar.a(false);
                this.f43728ac = null;
            }
            org.telegram.messenger.i3 i3Var = this.f44046za;
            an anVar = i3Var.f23045a;
            ArrayList arrayList = i3Var.f23049f;
            ArrayList arrayList2 = i3Var.f23048e;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                anVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i11)).intValue(), false);
            }
            arrayList2.clear();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                anVar.getConnectionsManager().cancelRequest(((Integer) arrayList.get(i12)).intValue(), false);
            }
            arrayList.clear();
            xw0 xw0Var = this.f43956s8;
            if (xw0Var != null) {
                xw0Var.b(true);
                this.f43956s8 = null;
            }
            bi.p7 p7Var = this.Tc;
            if (p7Var != null) {
                p7Var.setMessageCell(null);
                org.telegram.messenger.g0.E2(this.Tc);
                this.Tc = null;
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
        this.Kb = true;
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null && org.telegram.messenger.ij.M4(ijVar.f23244k)) {
            MediaController.B().q(true, true, false, false);
        } else {
            MediaController.B().p0(this.K8, null, null, false);
        }
        bi.p7 p7Var = this.Tc;
        if (p7Var != null) {
            p7Var.setMessageCell(null);
            org.telegram.messenger.g0.E2(this.Tc);
            this.Tc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        di.u2 u2Var;
        di.u2 u2Var2;
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.di diVar;
        qj qjVar = this.Z;
        boolean z11 = false;
        if (qjVar != null && i7 == 2 && qjVar.j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.gz.C(qjVar.Q).o0(qjVar.f31064i3, qjVar.j3);
            }
            qjVar.j3 = null;
            qjVar.f31064i3 = null;
        }
        jj jjVar = this.W1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            jg.i1 adapter = this.W1.getAdapter();
            if (i7 == 2) {
                TLRPC.User user = adapter.f16799w0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.I0.o();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i7 == 4) {
            di.u2 u2Var3 = this.X1;
            if (u2Var3 != null) {
                u2Var3.f32924a2.b0();
            }
            org.telegram.ui.Components.vo voVar = this.f43982ua;
            if (voVar != null && (diVar = voVar.O1) != null) {
                diVar.f32924a2.b0();
            }
        } else if ((i7 == 5 || i7 == 30) && (u2Var = this.X1) != null) {
            if (i7 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                u2Var.q1();
            }
        } else if ((i7 == 17 || i7 == 18) && (u2Var2 = this.X1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var2.f32924a2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z11 = true;
            }
            chatAttachAlertPhotoLayout.W(z11);
            this.X1.f32924a2.b0();
        } else if (i7 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44022xa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131747311, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747299, null), new dh(this));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                alertDialog$Builder.p();
            }
        } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Za(0);
        } else if (i7 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Za(2);
        } else if (((i7 != 101 && i7 != 102) || this.f43785f == null) && (i7 != 103 || this.f43771e == null)) {
        } else {
            int i10 = 0;
            while (true) {
                if (i10 < iArr.length) {
                    if (iArr[i10] != 0) {
                        z9 = false;
                        break;
                    }
                    i10++;
                } else {
                    z9 = true;
                    break;
                }
            }
            if (iArr.length > 0 && z9) {
                if (i7 == 103) {
                    org.telegram.ui.Components.voip.y1.l(this.f43771e, null, this.f43903o8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f43785f;
                if (i7 == 102) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.UserFull userFull = this.f43929q8;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.y1.m(user2, z10, z11, getParentActivity(), getMessagesController().b2(this.f43785f.f27102id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
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
            ri.f fVar = this.I;
            if (fVar != null) {
                Iterator it = fVar.f54484w.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11535f0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            ri.f fVar2 = this.J;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f54484w.iterator();
                while (it2.hasNext()) {
                    fh.e eVar2 = ((fh.g) it2.next()).f11535f0;
                    if (eVar2 != null) {
                        eVar2.h = true;
                    }
                }
            }
            Paint paint = this.U8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28129s8));
            }
            RadialProgressView radialProgressView = this.f43935r0;
            if (radialProgressView != null) {
                if (Q9()) {
                    i10 = org.telegram.ui.ActionBar.k6.Ka;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Wc;
                }
                radialProgressView.setProgressColor(getThemedColor(i10));
            }
            uj ujVar = this.f43746c1;
            if (ujVar != null) {
                ujVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.H0;
            if (m2Var != null && m2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.K0 || this.f44047zb != org.telegram.ui.ActionBar.k6.I.q())) {
                this.K0 = themedColor4;
                this.f44047zb = org.telegram.ui.ActionBar.k6.I.q();
                Drawable background = this.H0.getBackground();
                org.telegram.ui.ActionBar.k6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.k6.H1(background, org.telegram.ui.ActionBar.z5.b(themedColor4), true);
            }
            Bb();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Set<org.telegram.ui.ActionBar.p0> set = this.U0;
        Set<org.telegram.ui.ActionBar.p0> set2 = this.T0;
        try {
            RadialProgressView radialProgressView2 = this.I0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.J0));
            }
            NumberTextView numberTextView = this.T2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Te));
            }
            RadialProgressView radialProgressView3 = this.Y2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Se));
            }
            org.telegram.ui.Components.w70 w70Var = this.f43814h2;
            if (w70Var != null && this.R0) {
                w70Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ue));
            }
            if (this.O0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.f28241y6)) != this.L0) {
                this.L0 = themedColor3;
                this.O0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.P0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.M0) {
                this.M0 = themedColor2;
                this.P0.setTint(themedColor2);
            }
            if (this.Q0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.H6)) != this.N0) {
                this.N0 = themedColor;
                this.Q0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            sh.b bVar = this.f43811gd;
            if (bVar != null && (i7 = this.S0) >= 0) {
                bVar.setColor(getThemedColor(i7));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.k6.f28070p7);
                for (org.telegram.ui.ActionBar.p0 p0Var : set2) {
                    if (p0Var != null) {
                        p0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28070p7, false);
                for (org.telegram.ui.ActionBar.p0 p0Var2 : set) {
                    if (p0Var2 != null) {
                        p0Var2.a(x02, x02);
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
    public void onTransitionAnimationStart(boolean z9, boolean z10) {
        int[] iArr;
        org.telegram.ui.Components.ad adVar;
        super.onTransitionAnimationStart(z9, z10);
        System.currentTimeMillis();
        int i7 = org.telegram.messenger.qs.K2;
        int i10 = org.telegram.messenger.qs.G0;
        int i11 = org.telegram.messenger.qs.f25067t;
        int i12 = org.telegram.messenger.qs.f25061s;
        if (z9) {
            if (!this.f43778e6) {
                this.f43778e6 = true;
                Yc();
            }
            iArr = this.Y9 == 0 ? new int[]{i12, i11, i10, i7, org.telegram.messenger.qs.D} : new int[]{i12, i11, i10, i7};
            this.f43764d6 = false;
            if (!z10) {
                this.f43792f6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.t10.B(this.f43785f) ? new int[]{i12, i11, i10, i7, org.telegram.messenger.qs.V} : null;
            qj qjVar = this.Z;
            if (qjVar != null && (adVar = qjVar.S1) != null) {
                org.telegram.messenger.g0.r(adVar);
                qjVar.S1 = null;
            }
        }
        r7();
        this.Y9 = getNotificationCenter().q(iArr, this.Y9, true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        B8(((org.telegram.messenger.fz) arrayList.get(0)).d, ((org.telegram.messenger.fz) arrayList.get(0)).f22497i);
        org.telegram.messenger.gz.X(getAccountInstance(), arrayList, this.f43842j6, this.D5, this.f43864l4, null, this.B5, true, false, this.F5, null, z9, i7, 0, ((org.telegram.messenger.fz) arrayList.get(0)).f22508t, null, W8(), 0L, false, j3, h9(), this.f44004w5, null, false);
        K6();
        if (i7 != 0) {
            if (this.f43802g4 == -1) {
                this.f43802g4 = 0;
            }
            this.f43802g4 = arrayList.size() + this.f43802g4;
            id(true);
        }
    }

    public final void p7(org.telegram.messenger.ij ijVar) {
        if (ijVar.D == 4 && !this.F8) {
            int i7 = org.telegram.messenger.iz.f23364a;
            if (!org.telegram.messenger.qp.e1().contains("mapPreviewType")) {
                this.F8 = true;
                org.telegram.ui.Components.v4.p0(getParentActivity(), this.currentAccount, new ae(this, 12), true, this.f44022xa);
            }
        }
    }

    public final void p8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.p8(int, java.lang.Object[]):void");
    }

    public final long p9() {
        return this.f43939r4;
    }

    public final boolean pa() {
        qj qjVar = this.Z;
        boolean z9 = qjVar.f31159z2;
        if (z9) {
            qjVar.s1();
            this.R3 = true;
        }
        org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z9;
    }

    public final void pb() {
        org.telegram.ui.Cells.q1 q1Var = null;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= this.f44037z0.getChildCount()) {
                break;
            }
            View childAt = this.f44037z0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.z1) && childAt.getBottom() > 0 && childAt.getTop() < this.f44037z0.getHeight()) {
                q1Var = childAt;
                break;
            }
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int min = Math.min(q1Var2.getBottom(), this.f44037z0.getHeight()) - Math.max(0, q1Var2.getTop());
                if (min > i10) {
                    q1Var = q1Var2;
                    i10 = min;
                }
            }
            i7++;
        }
        if (q1Var != null) {
            dj djVar = this.B0;
            this.f44037z0.getClass();
            djVar.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) this.L9), false);
        }
    }

    public final void pc(TLRPC.TL_game tL_game, org.telegram.messenger.ij ijVar, String str, boolean z9, long j3) {
        String str2;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        String str3 = "";
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44022xa);
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            if (a22 != null) {
                str3 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            }
            u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131753015, str3);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new bi.n4(this, tL_game, ijVar, str, j3));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            showDialog(u1Var);
            return;
        }
        String n10 = org.telegram.messenger.t10.n(a22);
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
                    presentFragment(new yc1(str, str2, tL_game.title, tL_game.short_name, ijVar));
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
        yc1.a0(str, ijVar, parentActivity, str6, str3);
    }

    public final void pd() {
        boolean z9;
        int i7;
        int i10;
        org.telegram.messenger.aj ajVar;
        int i11 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f43878m6;
        if (i11 == 0) {
            ArrayList<org.telegram.messenger.ij> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i12].valueAt(i13);
                    if (ijVar.A2()) {
                        org.telegram.messenger.dj s9 = s9(ijVar);
                        if (s9 != null) {
                            ajVar = s9.d(ijVar);
                        } else {
                            ajVar = null;
                        }
                        if (ajVar != null) {
                            if (!ajVar.h) {
                            }
                        }
                    }
                    arrayList.add(ijVar);
                }
            }
            hk hkVar = this.f44023xb;
            if (hkVar != null) {
                hkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f44023xb.getSelectedReactions().isEmpty();
                z9 = !isEmpty;
                hk hkVar2 = this.f44023xb;
                if (isEmpty) {
                    i10 = 2131745873;
                } else {
                    i10 = 2131745872;
                }
                hkVar2.setHint(org.telegram.messenger.hd.M0(i10, null));
                org.telegram.messenger.g0.i3(new ae(this, 14), 120L);
            } else {
                z9 = !org.telegram.ui.Components.ii0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.r0 j3 = this.actionBar.n(null).j(28);
            if (j3 != null) {
                if (z9) {
                    i7 = 2131231898;
                } else {
                    i7 = 2131231900;
                }
                org.telegram.ui.Components.ch0 ch0Var = j3.f28452y;
                if (ch0Var != null && j3.D != i7) {
                    j3.D = i7;
                    org.telegram.messenger.g0.R3(ch0Var, i7);
                }
            }
        }
        if (this.f43945ra != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((org.telegram.messenger.ij) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((org.telegram.messenger.ij) sparseArray2.valueAt(i15));
            }
            this.f43945ra.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final boolean q() {
        return this.K9;
    }

    public final void q7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.q7(boolean):void");
    }

    public final void q8(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.q8(int, java.lang.Object[]):void");
    }

    public final float q9(float f10) {
        an anVar = this.f44009wa;
        if (anVar == null) {
            anVar = this;
        }
        org.telegram.ui.Components.lg lgVar = anVar.f43717a1;
        if (lgVar == null) {
            return 0.0f;
        }
        return lgVar.c(f10);
    }

    public final void qb(org.telegram.messenger.ij r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.qb(org.telegram.messenger.ij):void");
    }

    public final void qc(boolean z9) {
        if (z9) {
            if (this.f43757cc == null) {
                ae aeVar = new ae(this, 13);
                this.f43757cc = aeVar;
                org.telegram.messenger.g0.i3(aeVar, 100L);
                return;
            }
            return;
        }
        ae aeVar2 = this.f43757cc;
        if (aeVar2 != null) {
            org.telegram.messenger.g0.r(aeVar2);
        }
        this.f43757cc = null;
        this.f43743bc = false;
        bd(true);
    }

    public final void qd() {
        lh.h hVar;
        org.telegram.ui.ActionBar.x xVar;
        qj qjVar = this.Z;
        if (qjVar != null) {
            if (this.f43790f4 != 1 && !this.f43976u4 && !aa()) {
                hVar = null;
            } else {
                hVar = this.f44013x1;
            }
            qjVar.setSideButtonsForAttach(hVar);
            boolean aa2 = aa();
            if (this.f43983ub != aa2) {
                this.f43983ub = aa2;
                org.telegram.ui.ActionBar.r0 r0Var = this.f43825i0;
                if ((r0Var != null && r0Var.getVisibility() == 0) || ((xVar = this.f43786f0) != null && xVar.f28729l == 0)) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!kVar.f27677n0 && !kVar.v()) {
                        if (this.Z.h0() && TextUtils.isEmpty(this.Z.getSlowModeTimer()) && !aa()) {
                            org.telegram.ui.ActionBar.x xVar2 = this.f43786f0;
                            if (xVar2 != null) {
                                xVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var2 = this.f43825i0;
                            if (r0Var2 != null) {
                                r0Var2.setVisibility(8);
                            }
                            cr crVar = this.f43772e0;
                            if (crVar != null) {
                                crVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.x xVar3 = this.f43786f0;
                            if (xVar3 != null) {
                                xVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var3 = this.f43825i0;
                            if (r0Var3 != null) {
                                r0Var3.setVisibility(0);
                            }
                            cr crVar2 = this.f43772e0;
                            if (crVar2 != null) {
                                crVar2.b(false);
                            }
                        }
                        ui uiVar = this.f43897o1;
                        if (uiVar != null) {
                            uiVar.f35349k0 = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.kn r() {
        return this.f43897o1;
    }

    public final void r7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.r7():void");
    }

    public final void r8(java.lang.Object... r82) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.r8(java.lang.Object[]):void");
    }

    public final float r9(org.telegram.ui.Components.i11 i11Var) {
        float f10;
        org.telegram.ui.Components.m11 m11Var = this.f43788f2;
        if (m11Var != null) {
            float L = org.telegram.messenger.g0.L(7.0f);
            float k10 = m11Var.k(i11Var);
            if (i11Var == org.telegram.ui.Components.i11.f34461b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (org.telegram.messenger.g0.L(f10) + L) * k10;
        }
        return 0.0f;
    }

    public final void rb(long j3) {
        dj djVar;
        org.telegram.messenger.ij messageObject;
        int f92;
        int abs;
        int i7 = -1;
        if (this.f44037z0 != null && (djVar = this.B0) != null && djVar.f56929y < 0) {
            int i10 = 0;
            if (this.U6[0] && djVar.L0() == 0) {
                this.D7 = -1;
                return;
            }
            int i11 = Integer.MAX_VALUE;
            for (int childCount = this.f44037z0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44037z0.getChildAt(childCount);
                this.f44037z0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.Z1() == j3 && (abs = Math.abs((f92 = f9(childAt)))) < i11) {
                    i7 = messageObject.f1();
                    i10 = f92;
                    i11 = abs;
                }
            }
            this.D7 = i7;
            this.E7 = i10;
            return;
        }
        this.D7 = -1;
    }

    public final void rc(boolean z9) {
        float f10;
        int i7;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.qp.s1(this.currentAccount).E5 * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!org.telegram.messenger.p10.i(this.currentAccount).q() && !org.telegram.messenger.qp.s1(this.currentAccount).D3()) {
                if (z9) {
                    f10 = org.telegram.messenger.qp.s1(this.currentAccount).C5;
                } else {
                    f10 = org.telegram.messenger.qp.s1(this.currentAccount).D5;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(this);
                    if (z9) {
                        i7 = 2131743803;
                    } else {
                        i7 = 2131751349;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i7, null);
                    if (z9) {
                        i10 = 2131743802;
                    } else {
                        i10 = 2131751348;
                    }
                    org.telegram.ui.Components.cc I = a02.I(2131624210, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(i10, null), new ue(this, z9, 0)), spannableString, "%d"));
                    I.f32514j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void rd(boolean z9, boolean z10) {
        boolean z11;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.Wallet.b4 b4Var;
        if (this.fragmentView != null && !this.G5) {
            int childCount = this.f44037z0.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 < childCount) {
                    View childAt = this.f44037z0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
                        if (this.f43739b8 != Integer.MAX_VALUE && messageObject != null && messageObject.f1() == this.f43739b8 && t0Var.S()) {
                            org.telegram.ui.Wallet.d4 d4Var = t0Var.I0;
                            if (!d4Var.f42350h0 && (d4Var.f42345e0 == 0 || (b4Var = d4Var.f42343d0) == null || b4Var.c())) {
                                d4Var.e();
                                org.telegram.ui.Wallet.b4 b4Var2 = d4Var.f42343d0;
                                b4Var2.getClass();
                                b4Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.b4 b4Var3 = d4Var.f42343d0;
                                b4Var3.f31723b = -1L;
                                b4Var3.f31724c = -1L;
                                d4Var.f42345e0 = SystemClock.elapsedRealtime();
                                d4Var.f42347f0 = false;
                                d4Var.f42337a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                        if (this.H8 != null && ((messageObject2.i4() || org.telegram.messenger.ij.M4(messageObject2.f23244k)) && !messageObject2.U4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = q1Var.getPhotoImage();
                            this.H8.setTranslationX(q1Var.getX() + photoImage.K0);
                            this.H8.setTranslationY((this.f44037z0.getY() + ((q1Var.getY() + q1Var.getPaddingTop()) + photoImage.L0)) - this.H8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H8.getLayoutParams();
                            if (messageObject2.i4()) {
                                this.H8.setTag(2131296591, null);
                                if (layoutParams.width != org.telegram.messenger.g0.g3(Z9(), Q9()) || layoutParams.height != org.telegram.messenger.g0.g3(Z9(), Q9())) {
                                    int g32 = org.telegram.messenger.g0.g3(Z9(), Q9());
                                    layoutParams.height = g32;
                                    layoutParams.width = g32;
                                    this.J8.setResizeMode(0);
                                    this.H8.setLayoutParams(layoutParams);
                                }
                                float g33 = ((org.telegram.messenger.g0.f22550x * 2) + org.telegram.messenger.g0.g3(Z9(), Q9())) / org.telegram.messenger.g0.g3(Z9(), Q9());
                                float g34 = q1Var.getPhotoImage().M0 / org.telegram.messenger.g0.g3(Z9(), Q9());
                                if (this.H8.getScaleX() != g34) {
                                    this.H8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.H8.setPivotX(0.0f);
                                this.H8.setPivotY(0.0f);
                                this.H8.setScaleX(g34);
                                this.H8.setScaleY(g34);
                                this.K8.setScaleX(g33);
                                this.K8.setScaleY(g33);
                            } else {
                                this.H8.setTag(2131296591, photoImage);
                                if (layoutParams.width != photoImage.M0 || layoutParams.height != photoImage.N0) {
                                    this.J8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.M0;
                                    layoutParams.height = (int) photoImage.N0;
                                    this.H8.setLayoutParams(layoutParams);
                                }
                                this.K8.setScaleX(1.0f);
                                this.K8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.H8.invalidate();
                            z11 = true;
                        }
                    }
                    i7++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z9 && this.H8 != null && (ijVar = MediaController.B().f21292u0) != null && ijVar.T == 0) {
                if (!z11) {
                    if (this.A3 && org.telegram.messenger.ij.M4(ijVar.f23244k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.H8.setTranslationY((-org.telegram.messenger.g0.g3(Z9(), Q9())) - 100);
                    this.fragmentView.invalidate();
                    if (ijVar.i4() || org.telegram.messenger.ij.M4(ijVar.f23244k)) {
                        if (!this.A3 && PipRoundVideoView.F == null) {
                            if (z10) {
                                l(ijVar.f1(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.B().k0(false);
                        }
                    }
                } else {
                    MediaController.B().k0(true);
                    if (!ijVar.i4() && !this.L8) {
                        this.f44037z0.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f43868l8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.f43989v4) {
            if (this.f43785f != null) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43785f.f27102id));
                if (a22 != null) {
                    this.f43785f = a22;
                } else {
                    return;
                }
            } else if (this.f43771e != null) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f43771e.f26953id));
                if (M0 != null) {
                    this.f43771e = M0;
                } else {
                    return;
                }
            }
            ui uiVar = this.f43897o1;
            if (uiVar != null) {
                uiVar.b();
            }
        }
    }

    public final boolean s7(View view) {
        CharSequence slowModeTimer = this.Z.getSlowModeTimer();
        if (slowModeTimer != null) {
            vc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void s8(int i7, ArrayList arrayList, boolean z9) {
        ArrayList arrayList2;
        an anVar;
        int i10;
        an anVar2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && anVar2.t7()) {
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList3.size()) {
                    org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList3.get(i11);
                    if (fzVar.f22501m == null && fzVar.f22499k == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.fz) arrayList3.get(0)).d)) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(((org.telegram.messenger.fz) arrayList3.get(0)).d, anVar2.f43842j6, anVar2.D5, anVar2.f43864l4, null, false, ((org.telegram.messenger.fz) arrayList3.get(0)).f22497i, null, null, z9, i7, 0, null, false);
                    b10.K = anVar2.W8();
                    org.telegram.messenger.gz.C(anVar2.currentAccount).r0(b10);
                }
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                org.telegram.messenger.fz fzVar2 = (org.telegram.messenger.fz) arrayList3.get(i12);
                if (fzVar2.f22501m != null && fzVar2.f22499k == null) {
                    org.telegram.messenger.c accountInstance = anVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = fzVar2.f22501m;
                    HashMap hashMap = fzVar2.f22502n;
                    int i13 = i12;
                    org.telegram.messenger.gz.S(i7, anVar2.f43842j6, 0L, anVar2.h9(), hashMap, accountInstance, anVar2.D5, anVar2.f43864l4, anVar2.W8(), botInlineResult, null, anVar2, anVar2.B5, z9);
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
                z10 = false;
            }
            ArrayList arrayList4 = arrayList3;
            an anVar3 = anVar2;
            if (!arrayList4.isEmpty()) {
                anVar3.B8(((org.telegram.messenger.fz) arrayList4.get(0)).d, ((org.telegram.messenger.fz) arrayList4.get(0)).f22497i);
                org.telegram.messenger.gz.X(anVar3.getAccountInstance(), arrayList4, anVar3.f43842j6, anVar3.D5, anVar3.f43864l4, null, anVar3.B5, false, true, anVar3.F5, null, z9, i7, 0, ((org.telegram.messenger.fz) arrayList4.get(0)).f22508t, null, anVar3.W8(), 0L, false, 0L, anVar3.h9(), anVar3.f44004w5, null, false);
                K6();
                if (i7 != 0) {
                    if (this.f43802g4 == -1) {
                        this.f43802g4 = 0;
                    }
                    this.f43802g4 = arrayList.size() + this.f43802g4;
                    id(true);
                }
            }
        }
    }

    public final org.telegram.messenger.dj s9(org.telegram.messenger.ij ijVar) {
        if (ijVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.N6.f(ijVar.d1());
        if (djVar != null && (djVar.d.size() <= 1 || djVar.d(ijVar) == null)) {
            return null;
        }
        return djVar;
    }

    public final void sa() {
        X6(5, this.f43760d1, true);
        X6(1, this.Z, false);
        X6(4, this.f43789f3, true);
        X6(3, this.f43746c1, false);
        X6(2, this.S, false);
        float f10 = this.f43729ad.f55394e;
        m6.n nVar = this.f43797fd;
        float v = com.google.android.recaptcha.internal.a.v(1.0f, f10, 1.0f - ((float[]) nVar.f19918b)[5], 1.0f);
        lh.c cVar = this.f43760d1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(v);
        }
        qj qjVar = this.Z;
        if (qjVar != null) {
            qjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        tj tjVar = this.f43789f3;
        if (tjVar != null) {
            tjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        uj ujVar = this.f43746c1;
        if (ujVar != null) {
            ujVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        tj tjVar2 = this.S;
        if (tjVar2 != null) {
            tjVar2.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        jh.f fVar = this.T;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - v) * 255.0f));
            this.T.setInputBubbleTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        uj ujVar2 = this.f43746c1;
        te.a aVar = this.Yc;
        if (ujVar2 != null) {
            ujVar2.setTotalVisibilityFactor((1.0f - aVar.f55394e) * ((float[]) nVar.f19918b)[3]);
        }
        vo voVar = this.f43834ia;
        if (voVar != null) {
            float f11 = aVar.f55394e;
            if (voVar.S != f11) {
                voVar.S = f11;
                this.fragmentView.invalidate();
            }
        }
        E7();
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        af afVar = this.Ja;
        if (afVar != null) {
            org.telegram.messenger.g0.r(afVar);
        }
        qj qjVar = this.Z;
        if (qjVar != null && this.l1 != null && qjVar.getAdjustPanLayoutHelper() != null && !this.Z.getAdjustPanLayoutHelper().f27546f) {
            this.Ia = this.l1.getKeyboardHeight();
        } else {
            this.Ia = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f43868l8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb() {
        int i7;
        int i10;
        aj ajVar = this.f44037z0;
        if (ajVar != null && this.B0 != null) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44037z0.getChildAt(childCount);
                this.f44037z0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i7 = f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i7 = f9(childAt);
                        break;
                    }
                }
            }
        }
        i7 = 0;
        i10 = -1;
        if (i10 >= 0) {
            this.B0.h1(i10, i7);
        }
    }

    public final void sc(boolean z9) {
        if (this.Q != null) {
            if (!org.telegram.messenger.g0.Q1() && !this.f43976u4 && this.f43785f == null) {
                if (this.Eb == null) {
                    this.Eb = Boolean.valueOf(org.telegram.messenger.rc.e(360928));
                }
                if (this.Eb.booleanValue()) {
                    this.Db = z9;
                    return;
                }
            }
            int i7 = 0;
            if (this.f43778e6 && org.telegram.messenger.iz.c()) {
                if (z9 == this.Db) {
                    return;
                }
                this.Db = z9;
                if (z9) {
                    if (this.Q.getVisibility() != 0) {
                        this.Q.setVisibility(0);
                        this.Q.setAlpha(0.0f);
                        this.Q.setScaleX(0.3f);
                        this.Q.setScaleY(0.3f);
                    }
                    this.Q.animate().setListener(null).cancel();
                    this.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.Q.animate().setListener(null).cancel();
                this.Q.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new ei(this, 3)).start();
                return;
            }
            this.Db = z9;
            FrameLayout frameLayout = this.Q;
            if (!z9) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
        }
    }

    public final void sd(boolean z9) {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.Chat chat;
        ui uiVar = this.f43897o1;
        if (uiVar == null) {
            return;
        }
        int i7 = this.f43790f4;
        if (i7 == 8 && (chat = this.f43771e) != null) {
            if (this.f43816h4) {
                String i10 = qg.d.i(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.f43771e;
                uiVar.h(i10, chat2.scam, chat2.fake, chat2.verified, false, null, z9);
            } else if (org.telegram.messenger.t3.p0(chat)) {
                int i11 = (this.f43939r4 > 0L ? 1 : (this.f43939r4 == 0L ? 0 : -1));
                if (i11 == 0) {
                    TLRPC.Chat chat3 = this.f43771e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f43771e.linked_monoforum_id));
                        if (M02 == null) {
                            M02 = this.f43771e;
                        }
                        this.f43897o1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M02.title)), M02.scam, M02.fake, M02.verified, false, M02.emoji_status, z9);
                    } else {
                        ui uiVar2 = this.f43897o1;
                        String F2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.f43771e;
                        uiVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z9);
                    }
                } else if (i11 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f43939r4));
                    this.f43897o1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(a22))), a22.scam, a22.fake, a22.verified, a22.premium, a22.emoji_status, z9);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-this.f43939r4));
                    if (M03 == null) {
                        M03 = this.f43771e;
                    }
                    this.f43897o1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M03.title)), M03.scam, M03.fake, M03.verified, false, M03.emoji_status, z9);
                }
            } else {
                ui uiVar3 = this.f43897o1;
                String F22 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.f43771e.title));
                TLRPC.Chat chat5 = this.f43771e;
                uiVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z9);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i7 == 9) {
                uiVar.setTitle(org.telegram.messenger.hd.M0(2131742899, null));
            } else if (i7 == 5) {
                if ("hello".equalsIgnoreCase(this.f43776e4)) {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131752775, null));
                } else if ("away".equalsIgnoreCase(this.f43776e4)) {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131752838, null));
                } else {
                    this.f43897o1.setTitle(this.f43776e4);
                }
            } else if (i7 == 6) {
                if (!TextUtils.isEmpty(this.f43762d4.title)) {
                    this.f43897o1.setTitle(this.f43762d4.title);
                } else {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131752716, null));
                }
            } else if (i7 == 3) {
                long j3 = this.f43939r4;
                if (j3 > 0) {
                    user = getMessagesController().a2(Long.valueOf(j3));
                    M0 = null;
                } else {
                    M0 = getMessagesController().M0(Long.valueOf(-j3));
                    user = null;
                }
                if (org.telegram.messenger.t10.z(user)) {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131746265, null));
                } else if (org.telegram.messenger.t10.s(user)) {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
                } else if (org.telegram.messenger.t10.B(user)) {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131748302, null));
                } else if (user != null) {
                    this.f43897o1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(user))));
                } else if (M0 != null) {
                    this.f43897o1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M0.title)));
                } else {
                    this.f43897o1.setTitle("");
                }
            } else if (da() && !org.telegram.messenger.t10.u(this.f43785f)) {
                if (this.f43989v4) {
                    xd();
                } else if (this.f43976u4) {
                    if (this.f43864l4.y2()) {
                        this.f43897o1.setTitle(org.telegram.messenger.hd.G(this.f43864l4.N1(), "Comments", new Object[0]));
                    } else {
                        this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131751996, null));
                    }
                } else {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.G(this.f43864l4.N1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.t10.z(this.f43785f)) {
                this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131746265, null));
            } else if (org.telegram.messenger.t10.s(this.f43785f)) {
                this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
            } else {
                int i12 = this.f43790f4;
                if (i12 == 1) {
                    if (org.telegram.messenger.t10.B(this.f43785f)) {
                        this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131746321, null));
                    } else {
                        this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131745849, null));
                    }
                } else if (i12 == 2) {
                    this.f43897o1.setTitle(org.telegram.messenger.hd.G(a9(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.f43771e;
                    if (chat6 != null) {
                        ui uiVar4 = this.f43897o1;
                        String F23 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.f43771e;
                        uiVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z9);
                    } else {
                        TLRPC.User user2 = this.f43785f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f43897o1.setTitle(org.telegram.messenger.hd.M0(2131745902, null));
                            } else if (!org.telegram.messenger.qp.F2(user2) && getContactsController().f22591f0.get(Long.valueOf(this.f43785f.f27102id)) == null && (getContactsController().f22591f0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f43785f.phone)) {
                                    ui uiVar5 = this.f43897o1;
                                    String i13 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.f43785f.phone, pf.b.c());
                                    TLRPC.User user3 = this.f43785f;
                                    boolean z10 = user3.scam;
                                    boolean z11 = user3.fake;
                                    boolean z12 = user3.verified;
                                    org.telegram.messenger.qp messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f43785f;
                                    messagesController.getClass();
                                    uiVar5.h(i13, z10, z11, z12, org.telegram.messenger.qp.B2(user4), this.f43785f.emoji_status, z9);
                                } else {
                                    ui uiVar6 = this.f43897o1;
                                    String F24 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(this.f43785f)));
                                    TLRPC.User user5 = this.f43785f;
                                    boolean z13 = user5.scam;
                                    boolean z14 = user5.fake;
                                    boolean z15 = user5.verified;
                                    org.telegram.messenger.qp messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f43785f;
                                    messagesController2.getClass();
                                    uiVar6.h(F24, z13, z14, z15, org.telegram.messenger.qp.B2(user6), this.f43785f.emoji_status, z9);
                                }
                            } else {
                                ui uiVar7 = this.f43897o1;
                                String F25 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(this.f43785f)));
                                TLRPC.User user7 = this.f43785f;
                                boolean z16 = user7.scam;
                                boolean z17 = user7.fake;
                                boolean z18 = user7.verified;
                                org.telegram.messenger.qp messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f43785f;
                                messagesController3.getClass();
                                boolean B2 = org.telegram.messenger.qp.B2(user8);
                                if (!org.telegram.messenger.qp.F2(this.f43785f)) {
                                    emojiStatus = this.f43785f.emoji_status;
                                }
                                uiVar7.h(F25, z16, z17, z18, B2, emojiStatus, z9);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f43897o1.getTitleTextView().getText());
        ud(false);
    }

    @Override
    public final void setInMenuMode(boolean z9) {
        int i7;
        super.setInMenuMode(z9);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.y q10 = kVar.q();
            if (this.inMenuMode) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            q10.setVisibility(i7);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z9) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.y1 y1Var;
        float f10;
        float f11;
        qj qjVar;
        int i7;
        float f12;
        super.setInPreviewMode(z9);
        int i10 = 8;
        boolean z12 = true;
        if (this.f43785f != null && this.f43908p0 != null) {
            TLRPC.UserFull b22 = getMessagesController().b2(this.f43785f.f27102id);
            if (b22 != null && b22.phone_calls_available) {
                this.f43782ea = !this.inPreviewMode;
                this.f43908p0.e(0);
            } else {
                this.f43782ea = false;
                this.f43908p0.e(8);
            }
        }
        ui uiVar = this.f43897o1;
        float f13 = 0.0f;
        if (uiVar != null) {
            uiVar.setOccupyStatusBar(!z9);
            ui uiVar2 = this.f43897o1;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            uiVar2.setLayoutParams(c8.ha.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        qj qjVar2 = this.Z;
        if (qjVar2 != null) {
            if (!z9) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            qjVar2.setVisibility(i7);
        }
        org.telegram.ui.Components.ow0 ow0Var = this.f43936r1;
        if (ow0Var != null) {
            if (this.f43913p5 && !z9 && ((qjVar = this.Z) == null || !qjVar.f31160z3)) {
                i10 = 0;
            }
            ow0Var.setVisibility(i10);
        }
        jj jjVar = this.W1;
        if (jjVar != null) {
            ViewPropertyAnimator animate = jjVar.animate();
            if (!this.Z.f31160z3 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.xq.f40345f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z9) {
                y1Var = new org.telegram.ui.ActionBar.y1(false);
            } else {
                y1Var = null;
            }
            kVar.setBackButtonDrawable(y1Var);
            org.telegram.ui.ActionBar.r0 r0Var = this.f43825i0;
            if (r0Var != null) {
                if (!z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.x xVar = this.f43786f0;
            if (xVar != null) {
                if (!z9) {
                    f13 = 1.0f;
                }
                xVar.f28726i = f13;
                org.telegram.ui.ActionBar.r0 r0Var2 = xVar.f28730m;
                if (r0Var2 != null) {
                    r0Var2.setAlpha(f13);
                }
            }
        }
        aj ajVar = this.f44037z0;
        if (ajVar != null) {
            int childCount = ajVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f44037z0.getChildAt(i11);
                boolean z13 = childAt instanceof org.telegram.ui.Cells.q1;
                if (z13) {
                    ijVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ijVar = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    ijVar = null;
                }
                if (ijVar != null && (message = ijVar.f23244k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.ij.S4(message) && !ijVar.i4()) {
                        int i12 = this.B6 - 1;
                        this.B6 = i12;
                        if (i12 <= 0) {
                            this.B6 = 0;
                            this.C6 = true;
                            nc(false);
                        } else {
                            this.f44013x1.c(2, i12, true);
                        }
                        org.telegram.messenger.qp messagesController = getMessagesController();
                        int f14 = ijVar.f1();
                        if (org.telegram.messenger.t3.T(this.f43771e)) {
                            j3 = this.f43771e.f26953id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.n3(j3, f14, this.f43842j6);
                        ijVar.f23244k.media_unread = false;
                    }
                    if (z13) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        q1Var.setHighlighted(false);
                        q1Var.n3();
                    }
                }
            }
            this.f44037z0.setItemAnimator(null);
        }
        Lc(false);
        od();
        lj ljVar = this.f43862l2;
        if (ljVar != null) {
            if (!z9 && !this.f43835ib) {
                z11 = true;
            } else {
                z11 = false;
            }
            ljVar.setEnabled(z11);
        }
        lj ljVar2 = this.f43885n2;
        if (ljVar2 != null) {
            if (!z9 && !this.f43835ib) {
                z10 = true;
            } else {
                z10 = false;
            }
            ljVar2.setEnabled(z10);
        }
        nk nkVar = this.L2;
        if (nkVar != null) {
            nkVar.setEnabled(!isInPreviewMode());
        }
        ol olVar = this.l1;
        if (olVar != null) {
            olVar.setOccupyStatusBar((this.inBubbleMode || this.f43835ib || this.inPreviewMode) ? false : false);
        }
    }

    public final boolean t7() {
        CharSequence slowModeTimer = this.Z.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131745311, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("SlowModeHint", null, 2131745312, slowModeTimer));
        jg.g.C(null, 2131747830, alertDialog$Builder, null);
        return false;
    }

    public final void t8(View view) {
        u8(view, false);
    }

    public final float t9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Gb;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[0];
        this.l1.getLocationInWindow(iArr);
        return (i7 - iArr[0]) + f10;
    }

    public final void ta(boolean z9, boolean z10) {
        if (this.R3) {
            org.telegram.messenger.g0.i3(new ae(this, 23), 200L);
            if (z10) {
                this.R3 = false;
            }
        }
        if (z9 && !this.f43835ib) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final boolean tb() {
        qj qjVar = this.Z;
        if (qjVar != null && qjVar.v0() && !this.Z.f31025c1 && !MediaController.B().K()) {
            this.f43877m5 = true;
            qj qjVar2 = this.Z;
            this.f43888n5 = qjVar2.O;
            this.f43900o5 = qjVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void tc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131752657, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752658, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new fe(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
    }

    public final void td() {
        ud(false);
    }

    @Override
    public final void u(final org.telegram.messenger.gf gfVar, final org.telegram.messenger.j20 j20Var, final boolean z9, final int i7, final int i10, final boolean z10, long j3) {
        if (gfVar == null) {
            return;
        }
        this.Zc.a(false, true);
        org.telegram.messenger.ij ijVar = this.F5;
        if (ijVar != null && ijVar.q5() && !org.telegram.messenger.t3.z(this.currentAccount, 24, org.telegram.messenger.ij.B0(this.F5.f23244k))) {
            org.telegram.messenger.nj njVar = this.f44004w5;
            if (njVar == null) {
                njVar = org.telegram.messenger.nj.b(this.F5.f23244k.suggested_post);
            }
            if (!bi.ea.T(this.currentAccount, njVar.f24196a)) {
                wc(njVar);
                return;
            }
        }
        if (j20Var != null && j20Var.f23468s) {
            af afVar = new af(this, 26);
            this.G7 = afVar;
            org.telegram.messenger.g0.i3(afVar, 3000L);
        }
        B8(gfVar.f26823a, gfVar.f26834n);
        org.telegram.ui.Components.v4.Y(this.currentAccount, a(), 1, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                Long l10 = (Long) obj;
                an anVar = an.this;
                org.telegram.messenger.ij ijVar2 = anVar.F5;
                org.telegram.messenger.gf gfVar2 = gfVar;
                org.telegram.messenger.j20 j20Var2 = j20Var;
                boolean z11 = z9;
                int i11 = i7;
                int i12 = i10;
                boolean z12 = z10;
                if (ijVar2 != null && ijVar2.q5()) {
                    org.telegram.messenger.nj njVar2 = anVar.f44004w5;
                    if (njVar2 == null) {
                        njVar2 = org.telegram.messenger.nj.b(anVar.F5.f23244k.suggested_post);
                    }
                    org.telegram.messenger.nj njVar3 = njVar2;
                    if (gfVar2.f26824b) {
                        org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                        String str = gfVar2.I;
                        String str2 = gfVar2.f26828g;
                        TLRPC.Photo photo = gfVar2.f26826e;
                        long j10 = anVar.f43842j6;
                        org.telegram.messenger.ij ijVar3 = anVar.F5;
                        org.telegram.messenger.ij ijVar4 = anVar.f43864l4;
                        qm qmVar = anVar.B5;
                        ArrayList arrayList = gfVar2.f26834n;
                        int i13 = gfVar2.f26843x;
                        boolean z13 = gfVar2.M;
                        org.telegram.messenger.gz.b0(i13, i11, i12, j10, gfVar2.f26844y, l10.longValue(), anVar.h9(), gfVar2.f26823a, str, str2, arrayList, accountInstance, ijVar3, ijVar4, null, njVar3, anVar.W8(), j20Var2, photo, null, qmVar, z11, z12, z13);
                    } else if (gfVar2.h != null) {
                        org.telegram.messenger.gz.Z(anVar.getAccountInstance(), gfVar2.h, gfVar2.f26825c, null, anVar.f43842j6, anVar.F5, anVar.f43864l4, anVar.B5, gfVar2.f26834n, gfVar2.f26838r, null, gfVar2.f26843x, null, j20Var2, z11, i11, z12, gfVar2.f26823a, anVar.W8(), gfVar2.f26844y, l10.longValue(), anVar.h9(), njVar3);
                    } else if (gfVar2.I != null) {
                        org.telegram.messenger.gz.Z(anVar.getAccountInstance(), gfVar2.I, gfVar2.f26825c, null, anVar.f43842j6, anVar.F5, anVar.f43864l4, anVar.B5, gfVar2.f26834n, gfVar2.f26838r, null, gfVar2.f26843x, null, j20Var2, z11, i11, z12, gfVar2.f26823a, anVar.W8(), gfVar2.f26844y, l10.longValue(), anVar.h9(), njVar3);
                    }
                } else if (gfVar2.f26824b) {
                    org.telegram.messenger.c accountInstance2 = anVar.getAccountInstance();
                    String str3 = gfVar2.I;
                    String str4 = gfVar2.f26828g;
                    TLRPC.Photo photo2 = gfVar2.f26826e;
                    long j11 = anVar.f43842j6;
                    org.telegram.messenger.ij ijVar5 = anVar.D5;
                    org.telegram.messenger.ij ijVar6 = anVar.f43864l4;
                    qm qmVar2 = anVar.B5;
                    ArrayList arrayList2 = gfVar2.f26834n;
                    int i14 = gfVar2.f26843x;
                    org.telegram.messenger.ij ijVar7 = anVar.F5;
                    boolean z14 = gfVar2.M;
                    org.telegram.messenger.gz.b0(i14, i11, i12, j11, gfVar2.f26844y, l10.longValue(), anVar.h9(), gfVar2.f26823a, str3, str4, arrayList2, accountInstance2, ijVar5, ijVar6, ijVar7, anVar.f44004w5, anVar.W8(), j20Var2, photo2, null, qmVar2, z11, z12, z14);
                } else if (gfVar2.h != null) {
                    org.telegram.messenger.gz.Z(anVar.getAccountInstance(), gfVar2.h, gfVar2.f26825c, null, anVar.f43842j6, anVar.D5, anVar.f43864l4, anVar.B5, gfVar2.f26834n, gfVar2.f26838r, null, gfVar2.f26843x, anVar.F5, j20Var2, z11, i11, z12, gfVar2.f26823a, anVar.W8(), gfVar2.f26844y, l10.longValue(), anVar.h9(), anVar.f44004w5);
                } else if (gfVar2.I != null) {
                    org.telegram.messenger.gz.Z(anVar.getAccountInstance(), gfVar2.I, gfVar2.f26825c, null, anVar.f43842j6, anVar.D5, anVar.f43864l4, anVar.B5, gfVar2.f26834n, gfVar2.f26838r, null, gfVar2.f26843x, anVar.F5, j20Var2, z11, i11, z12, gfVar2.f26823a, anVar.W8(), gfVar2.f26844y, l10.longValue(), anVar.h9(), anVar.f44004w5);
                }
                anVar.K6();
            }
        }, j3);
    }

    public final void u7(Runnable runnable, cg.a aVar, boolean z9) {
        if (aVar != null && z9) {
            o1 o1Var = new o1(this, aVar, runnable, 20);
            bi.ea x10 = bi.ea.x(this.currentAccount, aVar.f6160a);
            if (!x10.f3810e) {
                x10.q(o1Var, true, true);
                return;
            } else {
                o1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void u8(View view, boolean z9) {
        boolean z10;
        Qb(view);
        if (view != this.f44013x1) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8(z9, z10, 0.2f);
    }

    public final float u9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Gb;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[1];
        this.l1.getLocationInWindow(iArr);
        return (i7 - iArr[1]) + f10;
    }

    public final void ua() {
        this.P4 = true;
        pl plVar = this.f43930q9;
        org.telegram.messenger.g0.r(plVar.f30654f0);
        plVar.f30680z = false;
        ae aeVar = new ae(this, 9);
        int i7 = this.T7;
        if (i7 != 0) {
            xb(i7, 0, false, this.S7, true, 0, null, null, aeVar);
            return;
        }
        int i10 = this.R7;
        if (i10 > 0) {
            xb(i10, 0, true, this.S7, true, 0, null, null, aeVar);
            return;
        }
        wb(!this.f44035yb, aeVar);
        this.f44035yb = false;
        if (!this.T4.isEmpty()) {
            this.f43721a5 = true;
            this.Z4 = ((Integer) this.T4.get(0)).intValue();
        }
    }

    public final int ub(org.telegram.messenger.ij r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.ub(org.telegram.messenger.ij):int");
    }

    public final void uc() {
        String str;
        if (this.f43810gc != null) {
            return;
        }
        if (this.D5 != null) {
            str = getMessagesController().c1(this.D5.S1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131743812, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743813, str));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751336, null), new fe(this, 18));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new fe(this, 19));
        u1Var.setOnDismissListener(new ee(this, 8));
        this.f43810gc = alertDialog$Builder.p();
    }

    public final void ud(boolean z9) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.p0 p0Var;
        if (this.f43897o1 != null) {
            int i7 = this.f43790f4;
            if (i7 == 0 || i7 == 8) {
                boolean r22 = getMessagesController().r2(this.f43842j6, b(), null);
                if (z9) {
                    r22 = !r22;
                }
                this.Q0 = null;
                if (!org.telegram.messenger.t3.e0(this.currentAccount, this.f43771e) && !org.telegram.messenger.t3.f0(this.currentAccount, this.f43785f)) {
                    if (!org.telegram.messenger.t10.z(this.f43785f) && ((!da() || this.f43989v4) && r22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231942).mutate();
                    int i10 = org.telegram.ui.ActionBar.k6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
                    this.Q0 = mutate;
                    this.N0 = getThemedColor(i10);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f43771e;
                    if (chat != null) {
                        drawable = this.f43897o1.c(org.telegram.messenger.m5.c(chat));
                    } else {
                        TLRPC.User user = this.f43785f;
                        if (user != null && !org.telegram.messenger.t10.B(user)) {
                            drawable = this.f43897o1.c(org.telegram.messenger.m5.c(this.f43785f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f43897o1.j(drawable, mutate);
                if (!z9 && (p0Var = this.f43950s1) != null) {
                    if (r22) {
                        if (p0Var.f28360m != 8) {
                            p0Var.f28360m = 8;
                            View view = p0Var.f28357j;
                            if (view instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view).getRightIcon().setVisibility(p0Var.f28360m);
                            }
                        }
                        this.f43950s1.d(org.telegram.messenger.hd.M0(2131743850, null));
                        this.f43950s1.b(2131232256);
                    } else {
                        if (p0Var.f28360m != 0) {
                            p0Var.f28360m = 0;
                            View view2 = p0Var.f28357j;
                            if (view2 instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view2).getRightIcon().setVisibility(p0Var.f28360m);
                            }
                        }
                        if (getMessagesController().s2(this.f43842j6, b())) {
                            this.f43950s1.d(org.telegram.messenger.hd.M0(2131748313, null));
                            this.f43950s1.b(2131232412);
                        } else {
                            this.f43950s1.d(org.telegram.messenger.hd.M0(2131748313, null));
                            this.f43950s1.b(2131232366);
                        }
                    }
                }
                org.telegram.ui.Components.yn ynVar = this.f44000w1;
                if (ynVar != null) {
                    ynVar.e(this.f43842j6, b(), null);
                }
            }
        }
    }

    public final void v7() {
        if (this.N3 != null) {
            return;
        }
        mk mkVar = new mk(this, getParentActivity(), this, this.f44022xa);
        this.N3 = mkVar;
        this.l1.addView(mkVar, 17, c8.ha.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void v8(boolean z9, boolean z10, float f10) {
        boolean z11;
        ValueAnimator ofFloat;
        lh.h hVar;
        org.telegram.ui.Cells.q1 q1Var;
        if (f10 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        View view = this.X8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            q1Var2.setInvalidatesParent(z11);
            if (z11) {
                mb(q1Var2);
            }
        }
        this.l1.invalidate();
        this.f44037z0.invalidate();
        AnimatorSet animatorSet = this.f43767d9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f43767d9.cancel();
        }
        this.f43767d9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.V8, f10);
        float f11 = 1.0f;
        if (z11) {
            this.Y8 = 1.0f;
            this.Z8 = 0.0f;
            ValueAnimator valueAnimator = this.Ec;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z9) {
                org.telegram.ui.Components.jk0.d(new me(this, 3));
            }
        } else {
            float f12 = this.V8;
            this.Z8 = f12 / max;
            this.W8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new sf(this, max, 0));
        if ((!z11 || z10) && (hVar = this.f44013x1) != null) {
            Property property = View.ALPHA;
            if (z11) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f11));
        }
        this.f43767d9.playTogether(arrayList);
        this.f43767d9.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f43767d9.setDuration(320L);
        View view2 = this.X8;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view2;
        } else {
            q1Var = null;
        }
        this.f43767d9.addListener(new ai.g0(this, z11, q1Var, 6));
        if (this.X8 != null && this.Y8 <= 0.0f) {
            Qb(null);
        }
        this.f43767d9.start();
    }

    public final void v9(boolean z9) {
        int i7;
        int i10;
        if (this.f43790f4 == 7) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.J3;
            if (z9) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            org.telegram.messenger.na b10 = a10.b(this.f43749c4);
            if (i13 >= 0 && i13 < b10.f24153a.size()) {
                b10.f24162l = i13;
                org.telegram.messenger.qs.f(a10.f24308a).k(org.telegram.messenger.qs.I0, Integer.valueOf(i11), Integer.valueOf(b10.f24163m), Boolean.valueOf(b10.f24164n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f24162l), Integer.valueOf(((org.telegram.messenger.ij) b10.f24153a.get(i13)).f23244k.f26974id));
                return;
            }
            return;
        }
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        long j3 = this.f43842j6;
        long j10 = this.f43738b7;
        int i14 = this.classGuid;
        boolean z10 = this.f43847jb;
        if (!z9 ? !z10 : z10) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        mediaDataController.X1(null, j3, j10, i14, i7, this.f43939r4, false, this.C3, this.D3, true, this.E3);
        oc(false);
    }

    public final void vb() {
        wb(false, null);
    }

    public final void vc(View view, CharSequence charSequence, boolean z9) {
        fi.m3 m3Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z9 || ((m3Var = this.A2) != null && m3Var.V)) {
                this.A2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("SlowModeHint", null, 2131745312, charSequence)));
                if (z9) {
                    this.A2.y(view, true);
                }
            }
        }
    }

    public final void vd(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.vd(boolean):void");
    }

    public final void w7(boolean z9) {
        long j3;
        if (System.currentTimeMillis() - this.f43823hc > 1000) {
            z9 = true;
        }
        xf xfVar = this.f43836ic;
        org.telegram.messenger.g0.r(xfVar);
        if (z9) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        org.telegram.messenger.g0.i3(xfVar, j3);
    }

    public final void w8(Runnable runnable) {
        org.telegram.messenger.qs.f(this.currentAccount).d(runnable);
    }

    public final void w9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.w9():void");
    }

    public final void wa(long j3, String str, boolean z9) {
        xa();
        di.u2 u2Var = this.X1;
        if (u2Var != null) {
            u2Var.C1(j3, str, z9, false);
        }
    }

    public final void wb(boolean z9, ae aeVar) {
        ArrayList arrayList;
        int i7;
        if (this.f44037z0.V1) {
            return;
        }
        this.Z4 = 0;
        this.Qb = 0;
        this.f43721a5 = false;
        this.f43858k9.f(0);
        if (this.U6[0] && this.X7 == 0 && this.K7 == 0) {
            this.f44013x1.d(false);
            if (this.B0.I0() == 0) {
                this.z9 = false;
                Zc();
                hb();
                Cd(false);
                return;
            }
            this.C0.T();
            mm mmVar = this.f43796fb;
            mmVar.f47828a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.K6;
                if (i10 >= arrayList.size() || !((org.telegram.messenger.ij) arrayList.get(i10)).s4()) {
                    break;
                }
                i10++;
                z9 = false;
            }
            if (z9 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i10) != null) {
                long d12 = ((org.telegram.messenger.ij) arrayList.get(i10)).d1();
                while (d12 != 0 && (i7 = i10 + 1) < arrayList.size() && d12 == ((org.telegram.messenger.ij) arrayList.get(i7)).d1()) {
                    i10 = i7;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 = Math.min(i10, arrayList.size() - 1);
            }
            wj wjVar = this.f43858k9;
            mmVar.f47829b = i10;
            mmVar.d = 0;
            boolean z10 = !z9;
            mmVar.f47830c = z10;
            wjVar.d(i10, 0, z10, true);
            this.z9 = false;
            Zc();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.Pb;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        bd(false);
        if (aeVar != null) {
            aeVar.run();
        } else {
            lb();
            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), this.f44022xa);
            this.Pb = u1Var2;
            u1Var2.setOnCancelListener(this.Fa);
            this.Pb.r(1000L);
        }
        this.f43881m9 = this.f43866l6;
        this.f43904o9 = false;
        this.f43892n9 = 0;
        this.f43917p9 = false;
        ArrayList arrayList2 = this.f44018x6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f43866l6));
        org.telegram.messenger.g0.i3(new af(this, 14), 0L);
    }

    public final void wc(org.telegram.messenger.nj njVar) {
        if (this.F5 == null) {
            return;
        }
        new bi.e1(getParentActivity(), this.currentAccount, this.f43842j6, njVar, this, getResourceProvider(), 0, new ne(this, 0)).show();
    }

    public final void wd() {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.p0 p0Var = this.f43985v0;
        if (p0Var != null) {
            TLRPC.Chat chat = this.f43771e;
            if (chat != null && org.telegram.messenger.t3.i(this.currentAccount, chat, this.f43925q4) && (tL_forumTopic = this.f43925q4) != null && !tL_forumTopic.closed) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            p0Var.e(i7);
        }
    }

    public final void x7() {
        int r92 = (int) (r9(org.telegram.ui.Components.i11.f34462c) + this.T.getInputBubbleHeight() + this.f43998w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        this.Y.setFadeZoneBottom(r92);
        int b10 = c8.j9.b(org.telegram.messenger.g0.L(36.0f) + (this.l1.getMeasuredHeight() - r92), 0, this.l1.getMeasuredHeight());
        int measuredWidth = this.l1.getMeasuredWidth();
        Rect rect = f43714qd;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Ta, this.f44037z0.getMeasuredWidth(), org.telegram.messenger.g0.L(36.0f) + ((this.f44037z0.getMeasuredHeight() - this.Ua) - r92));
    }

    public final void x8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        org.telegram.messenger.ij ijVar = this.F5;
        if (ijVar != null && (message = ijVar.f23244k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean x9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f43878m6;
        for (int i7 = 0; i7 < sparseArrayArr.length; i7++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i7].size(); i10++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].valueAt(i10);
                    if (ijVar != null && (message = ijVar.f23244k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void xa() {
        boolean z9;
        boolean z10;
        if (getParentActivity() != null) {
            qj qjVar = this.Z;
            if (qjVar == null || TextUtils.isEmpty(qjVar.getSlowModeTimer())) {
                qj qjVar2 = this.Z;
                if (qjVar2 != null && qjVar2.f31087m5.f55395f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                T7();
                di.u2 u2Var = this.X1;
                if (!z9 && this.f43790f4 != 9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u2Var.L3 = z10;
                u2Var.f32924a2.i0();
                TLRPC.Chat chat = this.f43771e;
                if ((chat == null || this.f44004w5 == null) && !z9 && this.f43790f4 != 9) {
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f43771e.slowmode_enabled) {
                        this.X1.y1(10, true);
                    } else {
                        this.X1.y1(-1, true);
                    }
                } else {
                    this.X1.y1(1, true);
                }
                di.u2 u2Var2 = this.X1;
                u2Var2.M2 = true;
                u2Var2.f32981r3.setVisibility(0);
                u2Var2.K2 = 0;
                u2Var2.f32999w1 = false;
                u2Var2.f33003x1 = false;
                u2Var2.Z1 = true;
                u2Var2.A1 = null;
                org.telegram.ui.ActionBar.r0 r0Var = u2Var2.f32936e3;
                if (r0Var != null) {
                    u2Var2.f32933d3.setTranslationY(0.0f);
                    r0Var.setVisibility(8);
                }
                this.X1.e1();
                this.X1.a1().setText(this.Z.getFieldText());
                di.u2 u2Var3 = this.X1;
                u2Var3.f32971p1 = this.f44022xa;
                showDialog(u2Var3);
            }
        }
    }

    public final void xb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.xb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void xc(org.telegram.messenger.ij ijVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().A2(org.telegram.messenger.ij.B0(ijVar.f23244k))) {
            TLRPC.Message message = ijVar.f23244k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = ijVar.f23303z2;
                boolean z9 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = ijVar.v;
                    if (ijVar.f23303z2.size() > 1) {
                        z9 = true;
                    }
                } else {
                    charSequence = ijVar.f23300z;
                }
                if (!z9 && charSequence != null) {
                    z9 = true;
                }
                if (z9 && org.telegram.messenger.iz.J <= 2 && !this.B9 && this.C9 <= this.Z.getTop() - org.telegram.messenger.g0.L(60.0f)) {
                    this.B9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i7 = org.telegram.messenger.iz.J + 1;
                    org.telegram.messenger.iz.J = i7;
                    edit.putInt("textSelectionHintShows", i7);
                    edit.apply();
                    if (this.A9 == null) {
                        tk tkVar = new tk(getParentActivity(), this.f44022xa, this);
                        this.A9 = tkVar;
                        this.l1.addView(tkVar, c8.ha.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.A9.c();
                }
            }
        }
    }

    public final void xd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        ui uiVar = this.f43897o1;
        if (uiVar != null && (tL_forumTopic = this.f43925q4) != null) {
            uiVar.setTitle(tL_forumTopic.title);
        }
        yd();
    }

    @Override
    public final boolean y(final org.telegram.ui.ww r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.v91 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.y(org.telegram.ui.ww, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.v91):boolean");
    }

    public final void y7() {
        int i7;
        if (this.f43897o1 != null) {
            float actionModeFactor = (1.0f - this.f43770dd.f55394e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, actionModeFactor);
            this.f43897o1.setScaleX(T1);
            this.f43897o1.setScaleY(T1);
            this.f43897o1.setAlpha(actionModeFactor);
            ui uiVar = this.f43897o1;
            if (actionModeFactor > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            uiVar.setVisibility(i7);
        }
    }

    public final org.telegram.ui.Components.s01 y8() {
        long b10;
        boolean z9;
        if (this.m0 == null && getParentActivity() != null && this.l1 != null) {
            org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01(getParentActivity(), this.currentAccount, a(), this.f44022xa, new dk(this));
            this.m0 = s01Var;
            this.l1.addView(s01Var, c8.ha.c(-1.0f, -1));
        }
        org.telegram.ui.Components.s01 s01Var2 = this.m0;
        if (s01Var2 != null) {
            if (X9()) {
                b10 = c9();
            } else {
                b10 = b();
            }
            s01Var2.setCurrentTopic(b10);
            org.telegram.ui.Components.s01 s01Var3 = this.m0;
            if (this.f43825i0 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            s01Var3.setMenuAvailable(z9);
        }
        return this.m0;
    }

    public final boolean y9() {
        pl plVar = this.f43930q9;
        if (plVar != null && plVar.x()) {
            return true;
        }
        return false;
    }

    public final void ya() {
        ks.p().T = null;
        if (getParentActivity() == null) {
            return;
        }
        T7();
        this.X1.f32924a2.i0();
        this.X1.y1(1, false);
        di.u2 u2Var = this.X1;
        u2Var.O3 = true;
        u2Var.W0(null);
        this.X1.e1();
        di.u2 u2Var2 = this.X1;
        u2Var2.f32971p1 = this.f44022xa;
        if (this.visibleDialog != null) {
            u2Var2.show();
        } else {
            showDialog(u2Var2);
        }
    }

    public final void yb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.yb(java.lang.CharSequence, boolean):void");
    }

    public final void yc(boolean z9, boolean z10) {
        qj qjVar;
        int i7;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z9 || this.G2 != null) && this.f43790f4 == 0 && (qjVar = this.Z) != null && qjVar.getAudioVideoButtonContainer() != null && this.Z.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.G2 == null) {
                    int indexOfChild = this.l1.indexOfChild(this.T);
                    if (indexOfChild != -1) {
                        this.G2 = D6(310.0f, 3, indexOfChild + 1, false);
                    } else {
                        return;
                    }
                }
                if (z9) {
                    this.G2.f(true);
                    return;
                }
                if (this.Z.f31038e2) {
                    fi.m3 m3Var = this.G2;
                    if (z10) {
                        i7 = 2131749289;
                    } else {
                        i7 = 2131749291;
                    }
                    m3Var.u(org.telegram.messenger.hd.M0(i7, null));
                } else {
                    this.G2.u(org.telegram.messenger.hd.M0(2131749290, null));
                }
                this.G2.y(this.Z.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void yd() {
        ui uiVar;
        ui uiVar2;
        if (org.telegram.messenger.t10.u(this.f43785f) && (uiVar2 = this.f43897o1) != null) {
            uiVar2.getAvatarImageView().setVisibility(0);
            this.f43897o1.b();
        } else if (this.f43925q4 != null && (uiVar = this.f43897o1) != null) {
            uiVar.getAvatarImageView().setVisibility(0);
            qg.d.p(this.f43897o1.getAvatarImageView(), this.f43925q4, true, true, this.f44022xa);
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
        boolean z9;
        fi.g1 g1Var;
        if (this.f44009wa != null) {
            return;
        }
        int i7 = 0;
        if (this.f43758cd.f55394e >= 1.0f && ((g1Var = this.E1) == null || g1Var.getPositionAnimated() <= 0.0f)) {
            z9 = false;
        } else {
            z9 = true;
        }
        bi.ec ecVar = this.l1.L;
        if (!z9) {
            i7 = 4;
        }
        ecVar.setVisibility(i7);
    }

    public final void z8() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.nj njVar = this.f44004w5;
        if (njVar != null) {
            gc(njVar);
            return;
        }
        TLRPC.WebPage webPage = this.W5;
        if (webPage != null) {
            hc(true, webPage, false);
            return;
        }
        qm qmVar = this.B5;
        if (qmVar != null) {
            fc(this.D5, qmVar);
            return;
        }
        org.telegram.messenger.ij ijVar = this.D5;
        if (ijVar != null && ijVar != this.f43864l4) {
            ec(ijVar);
            return;
        }
        org.telegram.messenger.mj mjVar = this.f43990v5;
        if (mjVar != null && (kjVar = mjVar.f24026b) != null) {
            dc(kjVar.f23696e);
            return;
        }
        org.telegram.messenger.ij ijVar2 = this.F5;
        if (ijVar2 != null) {
            cc(true, null, ijVar2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            hc(false, null, true);
        }
    }

    public final void z9() {
        org.telegram.ui.Components.ys editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.v()) {
                this.f43797fd.h(5, false, true);
                this.actionBar.u();
            } else {
                return;
            }
        }
        this.f43927q6 = 0;
        this.t6 = 0;
        this.f43941r6 = 0;
        this.f43991v6 = 0;
        this.f44005w6 = 0;
        this.f43978u6 = 0;
        qj qjVar = this.Z;
        if (qjVar != null && (editField = qjVar.getEditField()) != null) {
            if (this.Z.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        pl plVar = this.f43930q9;
        if (plVar != null) {
            plVar.f(true);
            SparseArray sparseArray = this.f43930q9.f29374p0;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            }
            sparseArray.clear();
        }
        tk tkVar = this.A9;
        if (tkVar != null) {
            org.telegram.messenger.g0.r(tkVar.H);
            tkVar.a();
        }
        qj qjVar2 = this.Z;
        if (qjVar2 != null) {
            qjVar2.f31010a0 = false;
        }
        this.B9 = false;
        if (this.f44023xb != null) {
            H9();
        }
    }

    public final void za(final CharacterStyle characterStyle, final String str, boolean z9, final org.telegram.ui.Cells.q1 q1Var, final org.telegram.messenger.ij ijVar) {
        TLRPC.Message message;
        if (z9) {
            int i7 = -1;
            if (str.startsWith("@")) {
                if (q1Var != null) {
                    q1Var.e3(-1);
                }
                String substring = str.substring(1);
                gi ka2 = ka(q1Var, characterStyle);
                TLObject f22 = getMessagesController().f2(substring);
                bi.t3 t3Var = new bi.t3(this, ka2, q1Var, substring, characterStyle, 2);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                ka2.f57231b = new qe(this, getConnectionsManager().sendRequest(checkusername, new bi.r8(this, f22, t3Var, substring, ka2, 4)), 5);
                ka2.d();
                return;
            } else if (characterStyle == null) {
                org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.f6) this.f44022xa, false);
                v2Var.N();
                if (str.startsWith("video?")) {
                    i7 = Utilities.z(str).intValue();
                }
                final int i10 = i7;
                if (i10 >= 0) {
                    v2Var.O = org.telegram.messenger.g0.g0(i10, false, false);
                    v2Var.P = false;
                } else {
                    v2Var.O = vf.c.d(str, true);
                    v2Var.P = false;
                    v2Var.Q = true;
                }
                CharSequence[] charSequenceArr = (U9() || !(ijVar == null || (message = ijVar.f23244k) == null || !message.noforwards)) ? new CharSequence[]{org.telegram.messenger.hd.M0(2131747816, null)} : new CharSequence[]{org.telegram.messenger.hd.M0(2131747816, null), org.telegram.messenger.hd.M0(2131751767, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        an.c0(an.this, str, characterStyle, ijVar, q1Var, i10, i11);
                    }
                };
                v2Var.L = charSequenceArr;
                v2Var.K = onClickListener;
                v2Var.H0 = new q5(q1Var, 3);
                showDialog(v2Var);
                return;
            } else {
                if (q1Var != null) {
                    q1Var.e3(-1);
                }
                i8(q1Var, ijVar, characterStyle, str);
                return;
            }
        }
        ja(ijVar, false, false);
        String c10 = vf.c.c(str);
        if (c10 != null) {
            String lowerCase = c10.toLowerCase();
            if (!org.telegram.messenger.t3.O(lowerCase, this.f43771e) && !org.telegram.messenger.t10.r(lowerCase, this.f43785f)) {
                if (str.startsWith("@")) {
                    getMessagesController().y3(lowerCase, this, 0, ka(q1Var, characterStyle));
                    return;
                } else {
                    Wa(0, str, characterStyle, q1Var, false);
                    return;
                }
            }
            ui uiVar = this.f43897o1;
            if (uiVar != null) {
                uiVar.e(false, false);
            } else {
                Tb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Wa(0, str, characterStyle, q1Var, false);
        } else {
            int i11 = this.f43790f4;
            if (i11 != 1 && i11 != 2 && i11 != 7) {
                if (str.contains("@")) {
                    presentFragment(new org.telegram.ui.Components.r20(str, this.resourceProvider));
                    return;
                } else {
                    Da(str, false);
                    return;
                }
            }
            this.f43845j9.w0(str);
            if (this.f43790f4 != 7) {
                finishFragment();
            }
        }
    }

    public final void zb(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.C3 = user;
        this.D3 = chat;
        if (this.f43837j0 != null && this.W1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.C3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.B3 = false;
                    String M0 = org.telegram.messenger.hd.M0(2131745767, null);
                    SpannableString spannableString = new SpannableString(a8.p0.D(M0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.B8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                    this.f43837j0.setSearchFieldCaption(spannableString);
                    this.W1.getAdapter().U(null, 0, null, false, true);
                    this.f43837j0.setSearchFieldHint(null);
                    this.f43837j0.n();
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    this.H3 = "";
                    mediaDataController.X1("", this.f43842j6, this.f43738b7, this.classGuid, 0, this.f43939r4, false, this.C3, this.D3, true, this.E3);
                }
            }
        }
    }

    public final boolean zc(org.telegram.messenger.ij ijVar) {
        if (this.f43790f4 == 0 && ijVar != null && ijVar.c5()) {
            return true;
        }
        return false;
    }

    public final void zd() {
        boolean z9;
        int i7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        if (this.f43861l0 == null) {
            return;
        }
        int i10 = 0;
        if (ea() && !this.f43921q0 && ((kVar = this.actionBar) == null || !kVar.v())) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f43861l0;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        r0Var.setVisibility(i7);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f43825i0;
        if (r0Var2 != null && (r0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f43825i0.getLayoutParams();
            if (!z9) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            }
            if (layoutParams.width != i10) {
                layoutParams.width = i10;
                this.f43825i0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f43825i0;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            r0Var3.setAlpha(f10);
            this.f43825i0.setClickable(!z9);
        }
        qd();
    }

    public void va(boolean z9) {
    }

    @Override
    public final void S() {
    }
}
