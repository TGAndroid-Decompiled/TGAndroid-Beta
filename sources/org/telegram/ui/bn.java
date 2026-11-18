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
public class bn extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, ww, ma0, org.telegram.ui.Components.ak, org.telegram.ui.Components.zg, pg.b, org.telegram.ui.Components.m40, te.b {
    public static int f45922md = 22;
    public static float f45923nd = 1.4f;
    public static int f45924od = 10;
    public static Pattern f45925pd;
    public static Pattern f45926qd;
    public static Pattern f45927rd;
    public static final int[] f45928sd = {org.telegram.messenger.ks.f25226y, org.telegram.messenger.ks.f25233z, org.telegram.messenger.ks.A, org.telegram.messenger.ks.B, org.telegram.messenger.ks.Z, org.telegram.messenger.ks.C0, org.telegram.messenger.ks.f25193t0, org.telegram.messenger.ks.W0, org.telegram.messenger.ks.f25107e1, org.telegram.messenger.ks.T1, org.telegram.messenger.ks.G, org.telegram.messenger.ks.f25192t, org.telegram.messenger.ks.U, org.telegram.messenger.ks.E0, org.telegram.messenger.ks.F0, org.telegram.messenger.ks.B4, org.telegram.messenger.ks.f25133i3, org.telegram.messenger.ks.f25184r4, org.telegram.messenger.ks.L};
    public static boolean f45929td = false;
    public static final Rect f45930ud = new Rect();
    public bj A0;
    public int A1;
    public hi.m3 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.aj A5;
    public boolean A6;
    public boolean A7;
    public boolean A8;
    public float A9;
    public bn Aa;
    public long Ab;
    public boolean Ac;
    public dj B0;
    public int B1;
    public hi.m3 B2;
    public boolean B3;
    public int B4;
    public org.telegram.messenger.aj B5;
    public int B6;
    public int B7;
    public String B8;
    public VelocityTracker B9;
    public zm Ba;
    public ik Bb;
    public boolean Bc;
    public ej C0;
    public org.telegram.ui.Components.gc C1;
    public hi.m3 C2;
    public boolean C3;
    public int C4;
    public org.telegram.messenger.fj C5;
    public int C6;
    public boolean C7;
    public String C8;
    public boolean C9;
    public zh.d Ca;
    public boolean Cb;
    public boolean Cc;
    public kl D0;
    public bk D1;
    public hi.m3 D2;
    public TLRPC.User D3;
    public gh D4;
    public rm D5;
    public int D6;
    public boolean D7;
    public org.telegram.messenger.fj D8;
    public boolean D9;
    public final org.telegram.messenger.k3 Da;
    public boolean Db;
    public boolean Dc;
    public pi E;
    public wj E0;
    public oj E1;
    public org.telegram.ui.Cells.q1 E2;
    public TLRPC.Chat E3;
    public final SparseArray E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public org.telegram.messenger.fj E8;
    public uk E9;
    public TLRPC.TL_channels_sendAsPeers Ea;
    public boolean Eb;
    public y8 Ec;
    public final xe.b F;
    public boolean F0;
    public hi.i1 F1;
    public int F2;
    public ch.p0 F3;
    public final ArrayList F4;
    public org.telegram.messenger.fj F5;
    public final ArrayList F6;
    public int F7;
    public int F8;
    public boolean F9;
    public TL_account.resolvedBusinessChatLinks Fa;
    public ArrayList Fb;
    public int Fc;
    public final xe.b G;
    public org.telegram.ui.Components.k80 G0;
    public int G1;
    public int G2;
    public boolean G3;
    public int G4;
    public int G5;
    public final SparseArray[] G6;
    public int G7;
    public boolean G8;
    public float G9;
    public boolean Ga;
    public ValueAnimator Gb;
    public TLRPC.DraftMessage Gc;
    public final dh.g H;
    public TextView H0;
    public boolean H1;
    public hi.m3 H2;
    public boolean H3;
    public boolean H4;
    public org.telegram.messenger.fj H5;
    public final SparseArray H6;
    public boolean H7;
    public boolean H8;
    public lj H9;
    public boolean Ha;
    public boolean Hb;
    public boolean Hc;
    public final int I;
    public org.telegram.ui.ActionBar.o2 I0;
    public org.telegram.ui.Components.e30 I1;
    public hi.m3 I2;
    public String I3;
    public boolean I4;
    public boolean I5;
    public final SparseArray I6;
    public af I7;
    public String I8;
    public org.telegram.ui.Cells.q1 I9;
    public float Ia;
    public Boolean Ib;
    public ValueAnimator Ic;
    public final ui.f J;
    public RadialProgressView J0;
    public org.telegram.ui.ActionBar.u1 J1;
    public hi.m3 J2;
    public String J3;
    public int J4;
    public boolean J5;
    public final HashMap J6;
    public String J7;
    public uj J8;
    public org.telegram.ui.Components.uz J9;
    public final wf Ja;
    public boolean Jb;
    public di Jc;
    public final ui.f K;
    public final int K0;
    public hi.m3 K1;
    public org.telegram.ui.Components.pp K2;
    public int K3;
    public final ArrayList K4;
    public boolean K5;
    public final SparseArray K6;
    public boolean K7;
    public org.telegram.ui.Cells.q1 K8;
    public boolean K9;
    public final fk Ka;
    public final int[] Kb;
    public boolean Kc;
    public dh.c L;
    public int L0;
    public hi.m3 L1;
    public View L2;
    public int L3;
    public final HashMap L4;
    public boolean L5;
    public final a0.h L6;
    public boolean L7;
    public j4 L8;
    public boolean L9;
    public int La;
    public org.telegram.ui.Cells.q1 Lb;
    public int Lc;
    public dh.c M;
    public int M0;
    public hi.m3 M1;
    public ok M2;
    public int M3;
    public org.telegram.messenger.fj M4;
    public int M5;
    public final ArrayList M6;
    public int M7;
    public TextureView M8;
    public ValueAnimator M9;
    public int Ma;
    public org.telegram.ui.Cells.q1 Mb;
    public int Mc;
    public final ui.g N;
    public int N0;
    public hi.m3 N1;
    public hi.m5 N2;
    public UndoView N3;
    public int N4;
    public int N5;
    public final SparseArray N6;
    public int N7;
    public boolean N8;
    public ValueAnimator N9;
    public af Na;
    public int Nb;
    public int Nc;
    public dh.c O;
    public int O0;
    public hi.m3 O1;
    public org.telegram.ui.Components.qe0 O2;
    public nk O3;
    public int O4;
    public TLRPC.PhotoSize O5;
    public final a0.h O6;
    public int O7;
    public final af O8;
    public boolean O9;
    public boolean Oa;
    public boolean Ob;
    public int Oc;
    public org.telegram.ui.ActionBar.u1 P;
    public Drawable P0;
    public hi.m3 P1;
    public boolean P2;
    public org.telegram.ui.Components.gc P3;
    public final ArrayList P4;
    public TLRPC.PhotoSize P5;
    public final a0.h P6;
    public int P7;
    public final ui.b P8;
    public float P9;
    public boolean Pa;
    public int Pb;
    public int Pc;
    public boolean Q;
    public Drawable Q0;
    public al Q1;
    public final org.telegram.ui.Components.q9[] Q2;
    public boolean Q3;
    public af Q4;
    public TLObject Q5;
    public final int[] Q6;
    public int Q7;
    public dh.c Q8;
    public float Q9;
    public long Qa;
    public HashMap Qb;
    public boolean Qc;
    public FrameLayout R;
    public Drawable R0;
    public float R1;
    public final an[] R2;
    public int R3;
    public boolean R4;
    public int R5;
    public final int[] R6;
    public int R7;
    public Bitmap R8;
    public int R9;
    public int Ra;
    public af Rb;
    public long Rc;
    public hi.m5 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final org.telegram.ui.ActionBar.n5[] S2;
    public boolean S3;
    public boolean S4;
    public int S5;
    public final int[] S6;
    public boolean S7;
    public BitmapShader S8;
    public int S9;
    public int Sa;
    public int Sb;
    public TLRPC.TL_messages_discussionMessage Sc;
    public uj T;
    public int T0;
    public org.telegram.messenger.g3 T1;
    public final qm[] T2;
    public org.telegram.messenger.n6 T3;
    public boolean T4;
    public boolean T5;
    public final int[] T6;
    public int T7;
    public Paint T8;
    public float T9;
    public zj Ta;
    public org.telegram.ui.ActionBar.u1 Tb;
    public TLRPC.messages_Messages Tc;
    public jh.f U;
    public final Set U0;
    public boolean U1;
    public NumberTextView U2;
    public boolean U3;
    public int U4;
    public TLRPC.PhotoSize U5;
    public final boolean[] U6;
    public int U7;
    public Matrix U8;
    public float U9;
    public ak Ua;
    public int Ub;
    public boolean Uc;
    public View V;
    public final Set V0;
    public zd V1;
    public int V2;
    public org.telegram.messenger.fj V3;
    public ArrayList V4;
    public TLRPC.PhotoSize V5;
    public final boolean[] V6;
    public int V7;
    public Paint V8;
    public float V9;
    public boolean Va;
    public int Vb;
    public tm Vc;
    public FrameLayout W;
    public AnimatorSet W0;
    public ImageView W1;
    public final AnimatorSet[] W2;
    public int W3;
    public int W4;
    public TLObject W5;
    public final boolean[] W6;
    public boolean W7;
    public final Paint W8;
    public float W9;
    public float Wa;
    public boolean Wb;
    public mm Wc;
    public FrameLayout X;
    public boolean X0;
    public kj X1;
    public boolean X2;
    public org.telegram.messenger.fj X3;
    public HashMap X4;
    public int X5;
    public boolean X6;
    public boolean X7;
    public float X8;
    public float X9;
    public int Xa;
    public int Xb;
    public di.k6 Xc;
    public final jh.l Y;
    public hi.m3 Y0;
    public fi.n2 Y1;
    public ImageView Y2;
    public org.telegram.messenger.fj Y3;
    public final SparseArray Y4;
    public TLRPC.WebPage Y5;
    public boolean Y6;
    public boolean Y7;
    public boolean Y8;
    public TLRPC.Document Y9;
    public int Ya;
    public boolean Yb;
    public boolean Yc;
    public lh.f Z;
    public hi.m3 Z0;
    public ai.l0 Z1;
    public RadialProgressView Z2;
    public bi.a3 Z3;
    public int Z4;
    public ArrayList Z5;
    public boolean Z6;
    public int Z7;
    public View Z8;
    public boolean Z9;
    public h6.m Za;
    public int Zb;
    public boolean Zc;
    public int f45931a;
    public rj f45932a0;
    public hi.m3 f45933a1;
    public TextView f45934a2;
    public ImageView f45935a3;
    public di.b1 f45936a4;
    public final int[] f45937a5;
    public String f45938a6;
    public boolean f45939a7;
    public boolean f45940a8;
    public float f45941a9;
    public boolean f45942aa;
    public ValueAnimator f45943ab;
    public int f45944ac;
    public float f45945ad;
    public boolean f45946b;
    public sj f45947b0;
    public org.telegram.ui.Components.ah f45948b1;
    public boolean f45949b2;
    public AnimatorSet f45950b3;
    public jg.l1 f45951b4;
    public int f45952b5;
    public m9.u f45953b6;
    public int f45954b7;
    public org.telegram.messenger.fj f45955b8;
    public float f45956b9;
    public long f45957ba;
    public float f45958bb;
    public int f45959bc;
    public float bd;
    public boolean f45960c;
    public bi.a3 f45961c0;
    public boolean f45962c1;
    public TextView f45963c2;
    public FrameLayout f45964c3;
    public jh.e f45965c4;
    public boolean f45966c5;
    public TLRPC.ChatInvite f45967c6;
    public int f45968c7;
    public org.telegram.messenger.fj f45969c8;
    public Integer f45970c9;
    public int f45971ca;
    public mk f45972cb;
    public CharacterStyle f45973cc;
    public final te.a f45974cd;
    public boolean d;
    public int f45975d0;
    public vj f45976d1;
    public TextView d2;
    public yj f45977d3;
    public int f45978d4;
    public int f45979d5;
    public zd f45980d6;
    public long f45981d7;
    public int f45982d8;
    public int f45983d9;
    public int f45984da;
    public final vk f45985db;
    public String dc;
    public final te.a f45986dd;
    public TLRPC.Chat f45987e;
    public org.telegram.ui.ActionBar.p0 f45988e0;
    public lh.c f45989e1;
    public ck f45990e2;
    public TextView f45991e3;
    public TL_account.TL_businessChatLink f45992e4;
    public int f45993e5;
    public final LongSparseIntArray f45994e6;
    public boolean f45995e7;
    public boolean f45996e8;
    public boolean f45997e9;
    public int f45998ea;
    public final cl eb;
    public vf.b f45999ec;
    public final te.a f46000ed;
    public TLRPC.User f46001f;
    public fr f46002f0;
    public FrameLayout f46003f1;
    public TextView f46004f2;
    public TextView f46005f3;
    public String f46006f4;
    public boolean f46007f5;
    public boolean f46008f6;
    public long f46009f7;
    public boolean f46010f8;
    public AnimatorSet f46011f9;
    public int fa;
    public ArrayList f46012fb;
    public boolean fc;
    public final te.a f46013fd;
    public org.telegram.ui.ActionBar.y f46014g0;
    public LinearLayout f46015g1;
    public org.telegram.ui.Components.z11 f46016g2;
    public uj f46017g3;
    public int f46018g4;
    public boolean f46019g5;
    public boolean f46020g6;
    public final ArrayList f46021g7;
    public long f46022g8;
    public org.telegram.ui.ActionBar.h1 f46023g9;
    public boolean f46024ga;
    public final qh f46025gb;
    public zd f46026gc;
    public final te.a f46027gd;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.p0 f46028h0;
    public org.telegram.ui.Components.go f46029h1;
    public kg.e f46030h2;
    public ImageView f46031h3;
    public int f46032h4;
    public AnimatorSet f46033h5;
    public long f46034h6;
    public final Paint h7;
    public String f46035h8;
    public boolean f46036h9;
    public boolean f46037ha;
    public final vh f46038hb;
    public boolean f46039hc;
    public final te.a f46040hd;
    public org.telegram.ui.ActionBar.p0 f46041i0;
    public ai f46042i1;
    public org.telegram.ui.Components.k80 f46043i2;
    public ImageView f46044i3;
    public boolean f46045i4;
    public final SparseIntArray f46046i5;
    public boolean f46047i6;
    public final Paint i7;
    public Integer f46048i8;
    public int f46049i9;
    public boolean f46050ia;
    public final oi f46051ib;
    public boolean f46052ic;
    public final te.a f46053id;
    public org.telegram.ui.ActionBar.r0 f46054j0;
    public kg.x1 f46055j1;
    public ImageView f46056j2;
    public org.telegram.ui.Components.n6 j3;
    public String f46057j4;
    public final SparseIntArray f46058j5;
    public boolean f46059j6;
    public final ColorMatrix f46060j7;
    public byte[] f46061j8;
    public int f46062j9;
    public org.telegram.ui.Components.ri f46063ja;
    public final nm f46064jb;
    public final RectF f46065jc;
    public final m6.n f46066jd;
    public org.telegram.ui.ActionBar.r0 f46067k0;
    public kg.z f46068k1;
    public ki.m f46069k2;
    public org.telegram.ui.Components.n6 f46070k3;
    public byte[] f46071k4;
    public boolean f46072k5;
    public boolean f46073k6;
    public final m.b3 f46074k7;
    public int f46075k8;
    public org.telegram.ui.ActionBar.z0[] f46076k9;
    public float f46077ka;
    public final vf kb;
    public org.telegram.ui.ActionBar.u1 f46078kc;
    public sh.c f46079kd;
    public org.telegram.ui.ActionBar.r0 f46080l0;
    public jh.k l1;
    public TextView f46081l2;
    public org.telegram.ui.Components.n6 f46082l3;
    public String f46083l4;
    public boolean f46084l5;
    public long f46085l6;
    public final org.telegram.ui.ActionBar.v4 f46086l7;
    public int f46087l8;
    public org.telegram.ui.ActionBar.z0 f46088l9;
    public float f46089la;
    public final vf f46090lb;
    public long f46091lc;
    public final Rect f46092ld;
    public org.telegram.ui.ActionBar.r0 m0;
    public pl f46093m1;
    public mj f46094m2;
    public jj f46095m3;
    public org.telegram.messenger.fj f46096m4;
    public boolean f46097m5;
    public Long f46098m6;
    public long f46099m7;
    public zd f46100m8;
    public final pj f46101m9;
    public yo ma;
    public boolean mb;
    public final vf f46102mc;
    public boolean f46103n;
    public org.telegram.ui.Components.f11 f46104n0;
    public org.telegram.ui.Components.bo n1;
    public FrameLayout f46105n2;
    public hj f46106n3;
    public org.telegram.messenger.fj f46107n4;
    public boolean f46108n5;
    public int f46109n6;
    public int f46110n7;
    public String f46111n8;
    public ll f46112n9;
    public Animator f46113na;
    public boolean f46114nb;
    public int f46115nc;
    public org.telegram.ui.ActionBar.p0 f46116o0;
    public final ArrayList f46117o1;
    public mj f46118o2;
    public org.telegram.ui.Cells.u0 f46119o3;
    public boolean o4;
    public boolean f46120o5;
    public final SparseArray[] f46121o6;
    public int f46122o7;
    public org.telegram.messenger.t3 f46123o8;
    public xj f46124o9;
    public boolean f46125oa;
    public long f46126ob;
    public boolean f46127oc;
    public org.telegram.ui.ActionBar.r0 f46128p0;
    public vi f46129p1;
    public FrameLayout f46130p2;
    public int f46131p3;
    public ArrayList f46132p4;
    public boolean f46133p5;
    public final SparseArray[] f46134p6;
    public final Matrix f46135p7;
    public boolean f46136p8;
    public int f46137p9;
    public boolean f46138pa;
    public xi.e f46139pb;
    public Pattern f46140pc;
    public org.telegram.ui.ActionBar.y f46141q0;
    public org.telegram.ui.Components.n6 f46142q1;
    public TextView f46143q2;
    public org.telegram.ui.Components.e50 f46144q3;
    public org.telegram.messenger.fj f46145q4;
    public long f46146q5;
    public final SparseArray[] f46147q6;
    public LinearGradient f46148q7;
    public boolean f46149q8;
    public int f46150q9;
    public bn f46151qa;
    public boolean f46152qb;
    public org.telegram.messenger.fj f46153qc;
    public long f46154r;
    public boolean f46155r0;
    public ug f46156r1;
    public org.telegram.ui.Components.wz f46157r2;
    public View f46158r3;
    public TLRPC.TL_forumTopic f46159r4;
    public boolean f46160r5;
    public boolean f46161r6;
    public int f46162r7;
    public TLRPC.ChatFull f46163r8;
    public int f46164r9;
    public float f46165ra;
    public int f46166rb;
    public te f46167rc;
    public final HashMap f46168s;
    public RadialProgressView f46169s0;
    public org.telegram.ui.Components.yw0 f46170s1;
    public org.telegram.ui.Components.kv0 f46171s2;
    public boolean f46172s3;
    public long f46173s4;
    public boolean s5;
    public int f46174s6;
    public int f46175s7;
    public TLRPC.UserFull f46176s8;
    public boolean s9;
    public AnimatorSet f46177sa;
    public int f46178sb;
    public ArrayList f46179sc;
    public org.telegram.ui.ActionBar.p0 f46180t0;
    public org.telegram.ui.ActionBar.p0 f46181t1;
    public hi.m3 f46182t2;
    public boolean f46183t3;
    public int f46184t4;
    public boolean f46185t5;
    public int t6;
    public final Paint f46186t7;
    public org.telegram.ui.Cells.e6 f46187t8;
    public boolean f46188t9;
    public final yj f46189ta;
    public boolean f46190tb;
    public final k8.a f46191tc;
    public org.telegram.ui.ActionBar.p0 f46192u0;
    public org.telegram.ui.ActionBar.p0 f46193u1;
    public hi.m3 f46194u2;
    public boolean f46195u3;
    public TLRPC.Chat f46196u4;
    public org.telegram.messenger.fj f46197u5;
    public int f46198u6;
    public final Matrix f46199u7;
    public ax0 f46200u8;
    public ql f46201u9;
    public wh.i f46202ua;
    public boolean f46203ub;
    public final jh.a f46204uc;
    public org.telegram.ui.ActionBar.p0 f46205v0;
    public org.telegram.ui.ActionBar.p0 f46206v1;
    public hi.m3 f46207v2;
    public AnimatorSet f46208v3;
    public boolean f46209v4;
    public org.telegram.messenger.fj f46210v5;
    public int f46211v6;
    public LinearGradient f46212v7;
    public final a0.h f46213v8;
    public View f46214v9;
    public ch.s f46215va;
    public a0.h f46216vb;
    public boolean f46217vc;
    public final wi f46218w;
    public org.telegram.ui.ActionBar.p0 f46219w0;
    public org.telegram.ui.ActionBar.p0 f46220w1;
    public boolean f46221w2;
    public ValueAnimator f46222w3;
    public boolean f46223w4;
    public org.telegram.messenger.aj f46224w5;
    public int f46225w6;
    public boolean f46226w7;
    public String f46227w8;
    public boolean f46228w9;
    public tz0 f46229wa;
    public a0.h f46230wb;
    public boolean wc;
    public pi f46231x;
    public ClippingImageView f46232x0;
    public org.telegram.ui.Components.po f46233x1;
    public hi.m3 f46234x2;
    public float f46235x3;
    public boolean f46236x4;
    public org.telegram.messenger.jj f46237x5;
    public int f46238x6;
    public boolean f46239x7;
    public long f46240x8;
    public boolean f46241x9;
    public boolean f46242xa;
    public boolean f46243xb;
    public boolean xc;
    public pi f46244y;
    public org.telegram.ui.Components.mz0 f46245y0;
    public lh.h f46246y1;
    public boolean f46247y2;
    public boolean f46248y3;
    public boolean f46249y4;
    public org.telegram.messenger.kj f46250y5;
    public int f46251y6;
    public int f46252y7;
    public String f46253y8;
    public boolean f46254y9;
    public org.telegram.ui.Components.lp ya;
    public boolean f46255yb;
    public long f46256yc;
    public jh.g f46257z0;
    public boolean f46258z1;
    public hi.m3 f46259z2;
    public boolean f46260z3;
    public boolean f46261z4;
    public org.telegram.messenger.fj f46262z5;
    public final ArrayList f46263z6;
    public boolean f46264z7;
    public boolean f46265z8;
    public float f46266z9;
    public zm f46267za;
    public Paint f46268zb;
    public boolean f46269zc;

    public bn(Bundle bundle) {
        super(bundle);
        this.f45931a = 0;
        this.f45960c = false;
        this.d = false;
        this.f46168s = new HashMap();
        this.f46218w = new wi(this, new af(this, 25));
        xe.b bVar = new xe.b();
        this.F = bVar;
        xe.b bVar2 = new xe.b();
        this.G = bVar2;
        this.Y = new jh.l();
        this.K0 = org.telegram.ui.ActionBar.n6.Ji;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.f46117o1 = new ArrayList();
        this.Q2 = new org.telegram.ui.Components.q9[2];
        this.R2 = new an[2];
        this.S2 = new org.telegram.ui.ActionBar.n5[2];
        this.T2 = new qm[2];
        this.W2 = new AnimatorSet[2];
        this.X2 = false;
        this.f46131p3 = 500;
        this.f45992e4 = null;
        this.f46032h4 = -1;
        this.o4 = true;
        this.E4 = new SparseArray();
        this.F4 = new ArrayList();
        this.K4 = new ArrayList();
        this.L4 = new HashMap();
        this.N4 = -1;
        this.O4 = 0;
        this.P4 = new ArrayList(10);
        this.V4 = new ArrayList();
        this.X4 = new HashMap();
        this.Y4 = new SparseArray();
        this.f45937a5 = new int[1];
        this.f46046i5 = new SparseIntArray();
        this.f46058j5 = new SparseIntArray();
        this.f46160r5 = true;
        this.f46185t5 = true;
        this.I5 = true;
        this.L5 = true;
        this.f45994e6 = new LongSparseIntArray();
        this.f46109n6 = 1;
        this.f46121o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f46134p6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f46147q6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f46263z6 = new ArrayList();
        this.A6 = true;
        this.C6 = Integer.MIN_VALUE;
        this.F6 = new ArrayList();
        this.G6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.H6 = new SparseArray();
        this.I6 = new SparseArray();
        this.J6 = new HashMap();
        this.K6 = new SparseArray();
        this.L6 = new a0.h();
        this.M6 = new ArrayList();
        this.N6 = new SparseArray();
        this.O6 = new a0.h();
        this.P6 = new a0.h();
        this.Q6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.R6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.S6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.T6 = new int[2];
        this.U6 = new boolean[2];
        this.V6 = new boolean[2];
        this.W6 = new boolean[]{true, true};
        this.Y6 = true;
        this.Z6 = true;
        this.f45968c7 = 0;
        this.f46021g7 = new ArrayList();
        this.h7 = new Paint(1);
        this.i7 = new Paint(1);
        this.f46060j7 = new ColorMatrix();
        this.f46074k7 = new m.b3();
        this.f46086l7 = new org.telegram.ui.ActionBar.v4(0, false, false, new ij(this, 0));
        this.f46135p7 = new Matrix();
        Paint paint = new Paint(1);
        this.f46186t7 = paint;
        this.f46199u7 = new Matrix();
        this.F7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.P7 = Integer.MAX_VALUE;
        this.Q7 = -1;
        this.Y7 = true;
        this.f45982d8 = Integer.MAX_VALUE;
        this.f46075k8 = -1;
        this.f46087l8 = -10000;
        this.f46213v8 = new a0.h();
        this.O8 = new af(this, 28);
        ui.b bVar3 = new ui.b();
        this.P8 = bVar3;
        this.Q8 = new dh.c(bVar3, bVar3, bVar3);
        this.W8 = new Paint(1);
        this.X8 = 0.0f;
        this.f45941a9 = 1.0f;
        this.f45956b9 = 0.0f;
        this.f46036h9 = true;
        this.f46101m9 = new pj(this);
        this.K9 = true;
        this.f46189ta = new yj(this, 0);
        this.Da = new org.telegram.messenger.k3(this);
        this.Ja = new wf(this, 0);
        this.Ka = new fk(this);
        this.Ma = -1;
        this.f45985db = new vk(this);
        this.eb = new cl(this);
        this.f46025gb = new qh(this);
        this.f46038hb = new vh(this);
        this.f46051ib = new oi(this);
        this.f46064jb = new nm(this);
        this.kb = new vf(this, 5);
        this.f46090lb = new vf(this, 7);
        this.Kb = new int[2];
        this.f46065jc = new RectF();
        this.f46102mc = new vf(this, 9);
        this.f46191tc = new k8.a(9);
        this.f46204uc = new Object();
        this.Kc = false;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        this.f45974cd = new te.a(0, this, lrVar, 320L, false);
        this.f45986dd = new te.a(1, this, lrVar, 520L, false);
        this.f46000ed = new te.a(2, this, lrVar, 520L, false);
        this.f46013fd = new te.a(3, this, lrVar, 320L, false);
        this.f46027gd = new te.a(4, this, lrVar, 320L, false);
        this.f46040hd = new te.a(5, this, lrVar, 320L, false);
        this.f46053id = new te.a(6, this, lrVar, 320L, false);
        vf vfVar = new vf(this, 12);
        ?? obj = new Object();
        obj.f20882b = new float[32];
        obj.f20881a = 1;
        obj.d = new te.j(obj, se.a.f57146a, 240L);
        obj.f20883c = vfVar;
        this.f46066jd = obj;
        this.f46092ld = new Rect();
        ?? obj2 = new Object();
        this.N = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f()) {
            dh.g gVar = new dh.g(false);
            this.H = gVar;
            this.I = Math.max(0, org.telegram.messenger.g0.L(48.0f) - Math.min(org.telegram.messenger.g0.f24116n, org.telegram.messenger.g0.f24115m));
            ui.f fVar = new ui.f(obj2);
            this.K = fVar;
            fVar.d = gVar;
            fVar.f59006e = -3;
            fVar.f59007f = obj2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.M = cVar;
            cVar.f8382k = true;
            if (org.telegram.messenger.pc.e(262144)) {
                ui.f fVar2 = new ui.f(obj2);
                this.J = fVar2;
                fVar2.d = gVar;
                fVar2.f59006e = -2;
                fVar2.f59007f = obj2;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.L = cVar2;
                cVar2.f8382k = true;
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
        cVar3.f8379g = bVar;
        this.L.f8379g = bVar;
        this.M.f8379g = bVar;
        this.Q8.f8379g = new xe.b();
        this.O.f8378f = bVar2;
        this.L.f8378f = bVar2;
        this.M.f8378f = bVar2;
        this.Q8.f8378f = bVar2;
    }

    public static void A0(bn bnVar) {
        if (bnVar.f46153qc == null) {
            return;
        }
        uy0[] uy0VarArr = {uy0.e1(bnVar.getParentActivity(), bnVar, true, bnVar.resourceProvider, new li.d(17, bnVar, uy0VarArr))};
    }

    public static void A1(bn bnVar, ArrayList arrayList, long j3, org.telegram.ui.Components.wk0 wk0Var, boolean z10, int i7) {
        if (z10) {
            org.telegram.messenger.zy.C(bnVar.currentAccount).q0(arrayList, j3, false, false, true, i7, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.g0.h3(new bg.k0(bnVar, j3, 4), 400L);
            wk0Var.dismiss();
        }
    }

    public static void B0(bn bnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.mp.u1(bnVar.currentAccount).q1(user.f28554id);
                    ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new u7(4, bnVar, user));
                }
            }
        }
    }

    public static void B1(bn bnVar, String str) {
        if (org.telegram.messenger.mp.u1(bnVar.currentAccount).R2(false)) {
            bnVar.getParentActivity();
            vf.c.o(str);
            return;
        }
        org.telegram.ui.Components.b5.l0(bnVar.getParentActivity(), bnVar.Ba, str, false, new qf(bnVar, str, 0));
    }

    public static void C0(bn bnVar, org.telegram.messenger.aj ajVar, org.telegram.messenger.fj fjVar, int i7, int i10) {
        if (ajVar != null) {
            ArrayList arrayList = ajVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.zy.C(bnVar.currentAccount).u((org.telegram.messenger.fj) arrayList.get(0), bnVar, i7, i10);
                return;
            }
        }
        org.telegram.messenger.zy.C(bnVar.currentAccount).u(fjVar, bnVar, i7, i10);
    }

    public static void C1(bn bnVar, String str) {
        Uri parse = Uri.parse(str);
        h40.b(bnVar.getParentActivity(), bnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void C8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i7 = 6;
        if (z10) {
            menu.add(2131296496, 2131296502, 6, org.telegram.messenger.gd.M0(2131746245, null));
            i7 = 7;
        }
        if (z13) {
            menu.add(2131296496, 2131296508, i7, org.telegram.messenger.gd.M0(2131745027, null));
            i7++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131753669, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, i7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i7 + 2;
        menu.add(2131296496, 2131296497, i7 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131748158, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296496, 2131296499, i10, spannableStringBuilder3);
            i10 = i7 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131744202, null));
            ?? obj = new Object();
            obj.f34537a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.ez0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(2131296496, 2131296509, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131743652, null));
            ?? obj2 = new Object();
            obj2.f34537a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.ez0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(2131296496, 2131296512, i11, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(2131296496, 2131296498, i10, org.telegram.messenger.gd.M0(2131751733, null));
            i10++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(2131296496, 2131296493, i10, org.telegram.messenger.gd.M0(2131750574, null));
            i10++;
        }
        menu.add(2131296496, 2131296503, i10, org.telegram.messenger.gd.M0(2131746142, null));
    }

    public static void D0(bn bnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(bnVar.currentAccount).q1(user.f28554id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new xg(bnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void D1(bn bnVar) {
        org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
        long j3 = bnVar.f46085l6;
        long j10 = bnVar.f45981d7;
        int i7 = bnVar.classGuid;
        int i10 = bnVar.f46018g4;
        long j11 = bnVar.f46173s4;
        int i11 = bnVar.C4;
        int i12 = bnVar.f46109n6;
        bnVar.f46109n6 = i12 + 1;
        messagesController.e3(j3, j10, false, 30, 0, 0, true, 0, i7, 0, i10, j11, i11, i12, bnVar.f46236x4);
    }

    public static void E0(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        String str4;
        if (bnVar.f46210v5 != null && i7 < arrayList.size() && bnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.fj fjVar = bnVar.f46210v5;
            if (fjVar != null) {
                TLRPC.Message message = fjVar.f23968k;
            }
            org.telegram.ui.Components.y21.V0(bnVar.getParentActivity(), bnVar, inputPeer, iArr[0], bnVar.f46210v5.M2, str, str4, charSequence, z10, efVar, new vf(bnVar, 10)).f30220p0 = false;
            bnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + bnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit();
                edit.putInt("dialog_show_translate_count" + bnVar.a(), i10 - 1).apply();
                bnVar.zd(true);
            }
        }
    }

    public static boolean E1(org.telegram.ui.bn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.E1(org.telegram.ui.bn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void F0(org.telegram.ui.bn r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.fj r11, org.telegram.ui.Cells.q1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.F0(org.telegram.ui.bn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.fj, org.telegram.ui.Cells.q1, int, int):void");
    }

    public static void F1(bn bnVar, View view, int i7) {
        org.telegram.ui.Components.x5 x5Var;
        TLRPC.User user;
        char c10;
        uj ujVar;
        uj ujVar2;
        if (i7 != 0) {
            jg.h1 adapter = bnVar.X1.getAdapter();
            if (adapter.f17533x0 != null && !adapter.f17514i0) {
                return;
            }
            int i10 = i7 - 1;
            Object J = bnVar.X1.getAdapter().J(i10);
            int i11 = bnVar.X1.getAdapter().Y;
            int i12 = bnVar.X1.getAdapter().Z;
            if (bnVar.X1.getAdapter().G != null && i10 == 1) {
                bnVar.f45932a0.l1(i11, i12, bnVar.X1.getAdapter().G + "@" + org.telegram.messenger.v3.K(bnVar.f45987e, false) + " ", false);
            } else if (bnVar.X1.getAdapter().G != null && i10 == 0) {
                bnVar.f45932a0.l1(i11, i12, a8.p0.s(new StringBuilder(), bnVar.X1.getAdapter().G, " "), false);
            } else if (J instanceof kg.v1) {
                if (!bnVar.getUserConfig().q()) {
                    bnVar.showDialog(new ug.z0(bnVar, bnVar.getParentActivity(), bnVar.currentAccount, true, 31, false, null));
                    return;
                }
                kg.v1 v1Var = (kg.v1) J;
                org.telegram.ui.Components.b5.X(bnVar.currentAccount, Math.max(1, v1Var.a()), bnVar.f46085l6, new li.d(13, bnVar, v1Var));
            } else {
                org.telegram.messenger.bj bjVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (bnVar.f46018g4 != 0 || !bnVar.t7(view)) {
                        if (view instanceof org.telegram.ui.Cells.x7) {
                            bjVar = ((org.telegram.ui.Cells.x7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.b5.X(bnVar.currentAccount, 1, bnVar.a(), new di.m2(bnVar, tL_document, org.telegram.messenger.fj.U(tL_document), bnVar.X1.getAdapter().L(i10), bjVar, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (bnVar.C3 && (ujVar2 = bnVar.f46017g3) != null && ujVar2.getVisibility() == 0) {
                        bnVar.Db(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.v3.K(chat, false);
                    if (K != null) {
                        bnVar.f45932a0.l1(i11, i12, a8.p0.p("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (bnVar.C3 && (ujVar = bnVar.f46017g3) != null && ujVar.getVisibility() == 0) {
                        bnVar.Db(null, user2);
                    } else if (org.telegram.messenger.o10.o(user2) != null) {
                        bnVar.f45932a0.l1(i11, i12, "@" + org.telegram.messenger.o10.o(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(p5.c.v(org.telegram.messenger.o10.k(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.s41("" + user2.f28554id, 3, null), 0, spannableString.length(), 33);
                        bnVar.f45932a0.l1(i11, i12, spannableString, false);
                    }
                } else if (J instanceof jg.e1) {
                    if (bnVar.X1.getAdapter().K != null && bnVar.f46018g4 != 1) {
                        jg.e1 e1Var = (jg.e1) J;
                        org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(e1Var.f17452a, bnVar.f46085l6, bnVar.F5, bnVar.f46096m4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = bnVar.Y8();
                        b10.X = e1Var.f17453b;
                        b10.R = bnVar.j9();
                        b10.T = bnVar.f46250y5;
                        bnVar.getSendMessagesHelper().r0(b10);
                        bnVar.f45932a0.setFieldText("");
                        bnVar.D9(false);
                    }
                } else if (J instanceof String) {
                    if (bnVar.X1.getAdapter().K != null) {
                        if (bnVar.f46018g4 == 1) {
                            org.telegram.ui.Components.b5.J(bnVar.getParentActivity(), bnVar.f46085l6, new oi.e0(12, bnVar, (String) J), bnVar.Ba);
                            return;
                        } else if (!bnVar.t7(view)) {
                            org.telegram.ui.Components.b5.X(bnVar.currentAccount, 1, bnVar.f46085l6, new li.d(14, bnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    bnVar.f45932a0.l1(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (bnVar.f45932a0.getFieldText() != null) {
                        if (bnVar.f46018g4 == 1 || !bnVar.t7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (bnVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                                    String M0 = org.telegram.messenger.gd.M0(2131745401, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                    u1Var.S = M0;
                                    if (c10 == 1) {
                                        u1Var.U = org.telegram.messenger.gd.M0(2131750459, null);
                                    } else {
                                        u1Var.U = org.telegram.messenger.gd.M0(2131748911, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                                    bnVar.showDialog(u1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(bnVar.X1.getAdapter().S);
                                bnVar.f46012fb = arrayList;
                                PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                                PhotoViewer.p1().f2(arrayList, bnVar.X1.getAdapter().M(i10), 3, false, bnVar.f46025gb, bnVar);
                                return;
                            }
                            org.telegram.ui.Components.b5.X(bnVar.currentAccount, 1, bnVar.a(), new li.d(15, bnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    k9 k9Var = new k9(19, bnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (bnVar.Jb) {
                        k9Var.run();
                    } else {
                        zc1.a(bnVar.getParentActivity(), new li.d(16, bnVar, k9Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    kj kjVar = bnVar.X1;
                    if (kjVar != null && (user = kjVar.getAdapter().f17533x0) != null) {
                        bnVar.f45932a0.setFieldText("");
                        long j3 = bnVar.f46085l6;
                        if (j3 == user.f28554id) {
                            bnVar.f46240x8 = j3;
                            bnVar.getMessagesController().K4(tL_inlineBotSwitchPM.start_param, bnVar.f46001f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f28554id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", bnVar.f46085l6);
                        if (bnVar.getMessagesController().E(bundle, bnVar, null, null)) {
                            bnVar.presentFragment(new bn(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.ni) {
                    String str = ((org.telegram.messenger.ni) J).f25929a;
                    rj rjVar = bnVar.f45932a0;
                    rjVar.Z();
                    rjVar.V0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            bnVar.f45932a0.l1(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = bnVar.f45932a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e11 = org.telegram.ui.Components.o5.e(bnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.fj.U(e11));
                            if (e11 != null) {
                                x5Var = new org.telegram.ui.Components.x5(e11, fontMetricsInt);
                            } else {
                                x5Var = new org.telegram.ui.Components.x5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(x5Var, 0, spannableString2.length(), 33);
                            bnVar.f45932a0.l1(i11, i12, spannableString2, false);
                            bnVar.X1.o(false);
                        }
                    }
                    bnVar.f45932a0.l1(i11, i12, str, true);
                    bnVar.X1.o(false);
                }
            }
        }
    }

    public static void G0(bn bnVar) {
        long j3;
        ArrayList arrayList = bnVar.f46263z6;
        arrayList.add(Integer.valueOf(bnVar.f46109n6));
        if (bnVar.f46018g4 == 7) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(bnVar.currentAccount);
            String str = bnVar.J3;
            int i7 = bnVar.classGuid;
            int i10 = bnVar.f45978d4;
            int i11 = bnVar.f46109n6;
            bnVar.f46109n6 = i11 + 1;
            a10.e(i7, i10, i11, str);
        } else if (bnVar.O7 != 0) {
            org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
            long j10 = bnVar.f46085l6;
            long j11 = bnVar.f45981d7;
            int i12 = bnVar.O7;
            int i13 = bnVar.classGuid;
            int i14 = bnVar.f46018g4;
            long j12 = bnVar.f46173s4;
            int i15 = bnVar.C4;
            int i16 = bnVar.f46109n6;
            bnVar.f46109n6 = i16 + 1;
            messagesController.e3(j10, j11, false, 30, 0, i12, true, 0, i13, 4, i14, j12, i15, i16, bnVar.f46236x4);
        } else if (bnVar.M7 != 0 && (!bnVar.fa() || bnVar.M7 == bnVar.f45982d8 || bnVar.f46236x4)) {
            int i17 = bnVar.B7;
            if (i17 != 0) {
                bnVar.f45981d7 = i17;
                org.telegram.messenger.mp messagesController2 = bnVar.getMessagesController();
                long j13 = bnVar.f45981d7;
                boolean z10 = bnVar.f46264z7;
                int i18 = bnVar.f46252y7;
                int i19 = bnVar.M7;
                int i20 = bnVar.classGuid;
                int i21 = bnVar.f46018g4;
                long j14 = bnVar.f46173s4;
                int i22 = bnVar.C4;
                int i23 = bnVar.f46109n6;
                bnVar.f46109n6 = i23 + 1;
                messagesController2.e3(j13, 0L, z10, i18, i19, 0, true, 0, i20, 3, i21, j14, i22, i23, bnVar.f46236x4);
            } else {
                org.telegram.messenger.mp messagesController3 = bnVar.getMessagesController();
                long j15 = bnVar.f46085l6;
                long j16 = bnVar.f45981d7;
                boolean z11 = bnVar.f46264z7;
                int i24 = bnVar.f46252y7;
                int i25 = bnVar.M7;
                int i26 = bnVar.classGuid;
                int i27 = bnVar.f46018g4;
                long j17 = bnVar.f46173s4;
                int i28 = bnVar.C4;
                int i29 = bnVar.f46109n6;
                bnVar.f46109n6 = i29 + 1;
                messagesController3.e3(j15, j16, z11, i24, i25, 0, true, 0, i26, 3, i27, j17, i28, i29, bnVar.f46236x4);
            }
        } else if (bnVar.A7) {
            bnVar.f46109n6++;
        } else {
            org.telegram.messenger.mp messagesController4 = bnVar.getMessagesController();
            long j18 = bnVar.f46085l6;
            long j19 = bnVar.f45981d7;
            boolean z12 = bnVar.f46264z7;
            int i30 = bnVar.f46252y7;
            int i31 = bnVar.M7;
            int i32 = bnVar.classGuid;
            int i33 = bnVar.f46018g4;
            long j20 = bnVar.f46173s4;
            int i34 = bnVar.C4;
            int i35 = bnVar.f46109n6;
            bnVar.f46109n6 = i35 + 1;
            messagesController4.e3(j18, j19, z12, i30, i31, 0, true, 0, i32, 2, i33, j20, i34, i35, bnVar.f46236x4);
        }
        int i36 = bnVar.f46018g4;
        if (i36 == 0 || (i36 == 3 && bnVar.e9() == bnVar.getUserConfig().e())) {
            if (bnVar.fa() && !bnVar.f46236x4) {
                return;
            }
            arrayList.add(Integer.valueOf(bnVar.f46109n6));
            org.telegram.messenger.mp messagesController5 = bnVar.getMessagesController();
            long j21 = bnVar.f46085l6;
            long j22 = bnVar.f45981d7;
            int i37 = bnVar.classGuid;
            if (bnVar.f46018g4 == 3) {
                j3 = 0;
            } else {
                j3 = bnVar.f46173s4;
            }
            long j23 = j3;
            int i38 = bnVar.C4;
            int i39 = bnVar.f46109n6;
            bnVar.f46109n6 = i39 + 1;
            messagesController5.e3(j21, j22, false, 1, 0, 0, true, 0, i37, 2, 1, j23, i38, i39, bnVar.f46236x4);
        }
    }

    public static void G1(bn bnVar, long j3, long j10) {
        di.x8.y(bnVar.currentAccount, false).C(j3, j10, new di.p4(bnVar, j3, j10, 1));
    }

    public static boolean H0(bn bnVar) {
        org.telegram.messenger.fj fjVar = bnVar.f46153qc;
        if (fjVar == null) {
            return false;
        }
        if (org.telegram.messenger.g0.g(fjVar.T0)) {
            new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void H1(bn bnVar, TLRPC.Document document) {
        bnVar.L4.put(document, 0);
        org.telegram.messenger.zy.C(bnVar.currentAccount).v0(document, null, bnVar.f46085l6, null, null, null, bnVar.D5, null, true, 0, 0, false, null, bnVar.Y8(), 0L, bnVar.j9(), bnVar.f46250y5);
    }

    public static void I1(bn bnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i7, org.telegram.messenger.fj fjVar, int i10, int i11, org.telegram.messenger.fj fjVar2) {
        boolean z10;
        int i12;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i13 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            bnVar.Qc = true;
            bnVar.A0.g1();
            Bundle bundle = new Bundle();
            final long B0 = org.telegram.messenger.fj.B0(((org.telegram.messenger.fj) arrayList.get(0)).f23968k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("historyPreloaded", z10);
            bn bnVar2 = new bn(bundle);
            bnVar2.Vb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i7 != 0) {
                bnVar2.f45982d8 = i7;
            }
            if (fjVar != null && (messageReplies = fjVar.f23968k.replies) != null && (messageReplies2 = bnVar2.f46096m4.f23968k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (fjVar != null && (tL_messageReactions = fjVar.f23968k.reactions) != null) {
                bnVar2.f46096m4.f23968k.reactions = tL_messageReactions;
            }
            bi.u4 u4Var = new bi.u4(bnVar, new boolean[]{false}, i10, bnVar2, 19);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f28426id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = bnVar2.getClassGuid();
                org.telegram.messenger.ks.f(bnVar.currentAccount).b(new fi(bnVar, classGuid, u4Var, bnVar2), org.telegram.messenger.ks.D);
                final int i15 = i12;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        bn bnVar3 = bn.this;
                        org.telegram.messenger.mp messagesController = bnVar3.getMessagesController();
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
                        messagesController.R3(messages_messages2, size2, B0, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i19, true, 0, ((org.telegram.messenger.fj) i5.c.h(1, arrayList)).e1(), 1, false, 0, true, bnVar3.f46236x4, null);
                    }
                });
                return;
            }
            u4Var.run();
            return;
        }
        bnVar.Pc = 0;
        bnVar.Qc = false;
        bnVar.A0.g1();
        if (fjVar2 != null) {
            bnVar.Ja(fjVar2);
        } else if (bnVar.getParentActivity() != null) {
            org.telegram.ui.Components.lc.b0(bnVar).t(org.telegram.messenger.gd.M0(2131752319, null), bnVar.Ba).j();
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

    public static void J0(bn bnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i7) {
        org.telegram.messenger.zy.C(bnVar.currentAccount).v0(tL_document, str, bnVar.f46085l6, bnVar.F5, bnVar.f46096m4, null, bnVar.D5, null, z10, i7, 0, false, obj, bnVar.Y8(), 0L, bnVar.j9(), bnVar.f46250y5);
    }

    public static void J1(bn bnVar) {
        SparseArray[] sparseArrayArr = bnVar.f46121o6;
        org.telegram.messenger.fj fjVar = null;
        for (int i7 = 1; i7 >= 0; i7--) {
            if (fjVar == null && sparseArrayArr[i7].size() != 0) {
                fjVar = (org.telegram.messenger.fj) bnVar.G6[i7].get(sparseArrayArr[i7].keyAt(0));
            }
            sparseArrayArr[i7].clear();
            bnVar.f46134p6[i7].clear();
            bnVar.f46147q6[i7].clear();
        }
        if (bnVar.getParentActivity() != null && fjVar != null && ((org.telegram.messenger.fj.R4(fjVar.f23968k) || fjVar.h4()) && fjVar.F0() != null)) {
            TLRPC.Document F0 = fjVar.F0();
            org.telegram.messenger.w7.G(bnVar.currentAccount);
            File J = org.telegram.messenger.w7.J(F0, null, false, true);
            TLRPC.Message message = fjVar.f23968k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(fjVar.f23968k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.fj.L4(fjVar.f23968k) && !fjVar.h4()) {
                    intent.setType(fjVar.t1());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = bnVar.getParentActivity();
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
                bnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.M0(2131745264, null)), 500);
            }
        }
        bnVar.B9();
        bnVar.gd(0, true);
        bnVar.Gd(false);
        bnVar.td();
    }

    public static void K0(bn bnVar, TLRPC.Document document) {
        bnVar.L4.put(document, 0);
        org.telegram.messenger.zy.C(bnVar.currentAccount).v0(document, null, bnVar.f46085l6, null, null, null, bnVar.D5, null, true, 0, 0, false, null, bnVar.Y8(), 0L, bnVar.j9(), bnVar.f46250y5);
    }

    public static void L0(bn bnVar) {
        if (bnVar.f46095m3.getAlpha() != 0.0f && !bnVar.actionBar.y() && !bnVar.Y9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(bnVar.f46095m3.getCustomDate() * 1000);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i7, i10, i11);
            bnVar.ha((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void M0(bn bnVar, int i7, org.telegram.messenger.fj fjVar) {
        if (i7 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f28446id = bnVar.getMessagesController().s1(bnVar.f46001f);
            bnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new ce(bnVar, 4));
            return;
        }
        org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g(bnVar.getUserConfig().f(), bnVar.f46085l6, fjVar, bnVar.f46096m4, null, null, true, 0, 0);
        g10.K = bnVar.Y8();
        org.telegram.messenger.zy.C(bnVar.currentAccount).r0(g10);
        if (bnVar.f46018g4 == 0) {
            bnVar.ra(false);
        }
        bnVar.D9(false);
    }

    public static void M2(long j3, bn bnVar) {
        int i7;
        boolean z10;
        org.telegram.messenger.ov ovVar;
        if (j3 != bnVar.e9()) {
            bnVar.getConnectionsManager().cancelRequestsForGuid(bnVar.classGuid);
            bnVar.getMessagesStorage().k(bnVar.classGuid);
            bnVar.classGuid = ConnectionsManager.generateClassGuid();
            bnVar.sb();
            bnVar.f46237x5 = null;
            bnVar.M7 = 0;
            bnVar.F7 = -1;
            bnVar.C7 = false;
            bnVar.D7 = true;
            bnVar.f46263z6.clear();
            if (j3 != 0) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            bnVar.f46018g4 = i7;
            bnVar.f46173s4 = j3;
            if (i7 == 3) {
                org.telegram.messenger.pv I1 = bnVar.getMessagesController().I1();
                long d = bnVar.d();
                ArrayList arrayList = I1.f26302j;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        ovVar = (org.telegram.messenger.ov) arrayList.get(i10);
                        if (ovVar.f26106a == d) {
                            break;
                        }
                        i10++;
                    } else {
                        ovVar = null;
                        break;
                    }
                }
                if (ovVar != null && !ovVar.f26112i) {
                    I1.f(d, null);
                }
            }
            bnVar.L8();
            bnVar.wd(true);
            vi viVar = bnVar.f46129p1;
            if (viVar != null) {
                viVar.n(true);
                bnVar.f46129p1.b();
            }
            org.telegram.ui.Components.f11 f11Var = bnVar.f46104n0;
            if (f11Var != null) {
                f11Var.setCurrentTopic(j3);
                org.telegram.ui.Components.f11 f11Var2 = bnVar.f46104n0;
                if (bnVar.f46054j0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f11Var2.setMenuAvailable(z10);
            }
            bnVar.zd(true);
            bnVar.Pc(true);
            bnVar.E9(true);
            bnVar.D9(true);
            rj rjVar = bnVar.f45932a0;
            if (rjVar != null) {
                rjVar.G0(false);
                bnVar.f45932a0.j2(true);
            }
            bnVar.N6(true, true);
            tm tmVar = bnVar.Vc;
            if (tmVar != null && bnVar.actionBar.f29088o0) {
                tmVar.k(null);
            }
        }
    }

    public static void N0(bn bnVar) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        org.telegram.messenger.hj hjVar;
        ArrayList arrayList;
        String a02;
        bnVar.f46250y5 = null;
        int i7 = bnVar.Sb;
        if (i7 == 2) {
            bnVar.D5 = null;
            bnVar.F5 = null;
            org.telegram.messenger.jj jjVar = bnVar.f46237x5;
            if (jjVar != null) {
                jjVar.f(null, null, bnVar.f46085l6, null);
            }
            bnVar.B8();
        } else if (i7 == 3) {
            org.telegram.messenger.jj jjVar2 = bnVar.f46237x5;
            if (jjVar2 != null && !jjVar2.c() && (hjVar = bnVar.f46237x5.f24868b) != null && (arrayList = hjVar.f24458e) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) bnVar.f46237x5.f24868b.f24458e.get(i10);
                    if (j3 == 0) {
                        j10 = org.telegram.messenger.fj.B0(fjVar3.f23968k);
                        j3 = fjVar3.Z0();
                    } else if (j3 != fjVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.J0 = true;
                if (j10 > 0) {
                    TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(j10));
                    if (c22 != null) {
                        a02 = org.telegram.messenger.gd.a0("CancelForwardPrivate", null, 2131752572, org.telegram.messenger.gd.G(bnVar.f46237x5.f24868b.f24458e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-j10));
                    if (O0 != null) {
                        a02 = org.telegram.messenger.gd.a0("CancelForwardChat", null, 2131752573, org.telegram.messenger.gd.G(bnVar.f46237x5.f24868b.f24458e.size(), "MessagesBold", new Object[0]), O0.title);
                    } else {
                        return;
                    }
                }
                u1Var.U = org.telegram.messenger.g0.W2(a02);
                u1Var.S = org.telegram.messenger.gd.G(bnVar.f46237x5.f24868b.f24458e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752571, null), new ee(bnVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131745148, null), new ee(bnVar, 7));
                bnVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, bnVar.getResourceProvider());
                }
            }
        } else if (i7 == 4) {
            bnVar.Y5 = null;
            org.telegram.messenger.jj jjVar3 = bnVar.f46237x5;
            if (jjVar3 != null) {
                int i11 = bnVar.currentAccount;
                org.telegram.messenger.fj fjVar4 = bnVar.F5;
                if (fjVar4 == bnVar.f46096m4) {
                    fjVar2 = null;
                } else {
                    fjVar2 = fjVar4;
                }
                jjVar3.e(i11, null, null, fjVar2, bnVar.D5, bnVar.H5);
            }
            rj rjVar = bnVar.f45932a0;
            rjVar.L3 = null;
            rjVar.M3 = false;
            bnVar.z8();
            bnVar.B8();
        } else {
            if (org.telegram.messenger.v3.c0(bnVar.f45987e) && !bnVar.f46236x4 && (fjVar = bnVar.F5) != null) {
                long b22 = org.telegram.messenger.fj.b2(bnVar.currentAccount, fjVar.f23968k, true, false);
                if (b22 != 0) {
                    bnVar.getMediaDataController().F(bnVar.f46085l6, b22, false);
                }
            }
            bnVar.gc(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void N2(bn bnVar, Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.r0 o92 = bnVar.o9();
        if (o92 == null) {
            return;
        }
        View view = (View) o92.getParent();
        float x10 = bnVar.actionBar.getX();
        org.telegram.ui.Components.f11 f11Var = bnVar.f46104n0;
        if (f11Var != null) {
            f10 = f11Var.getProgress() * bnVar.f46104n0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        float x11 = (o92.getX() + (view.getX() + (x10 - f10))) - bnVar.f46104n0.getX();
        float y10 = (o92.getY() + (view.getY() + bnVar.actionBar.getY())) - bnVar.f46104n0.getY();
        if (bnVar.f46268zb == null) {
            bnVar.f46268zb = new Paint(1);
        }
        bnVar.f46268zb.setColor(org.telegram.ui.ActionBar.n6.r1(bnVar.f46104n0.getProgress(), bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6)));
        canvas.drawCircle((o92.getWidth() / 2.0f) + x11, (o92.getHeight() / 2.0f) + y10, org.telegram.messenger.g0.L(23.0f), bnVar.f46268zb);
        canvas.save();
        canvas.translate(x11, y10);
        o92.draw(canvas);
        canvas.restore();
    }

    public static void O0(bn bnVar, int i7) {
        org.telegram.ui.ActionBar.s4 s4Var = bnVar.parentLayout;
        if (s4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.h2 backgroundFragment = s4Var.getBackgroundFragment();
        if (backgroundFragment instanceof bn) {
            bn bnVar2 = (bn) backgroundFragment;
            if (bnVar2.a() == bnVar.f46085l6) {
                bnVar.finishFragment();
                bnVar2.l(i7, 0, true, 0, true, 0);
                return;
            }
        }
        bnVar.presentFragment(ta(i7, bnVar.f46085l6));
    }

    public static void O1(bn bnVar) {
        int i7;
        if (bnVar.a() == bnVar.getUserConfig().e() && bnVar.getUserConfig().q() && bnVar.Bb == null) {
            ik ikVar = new ik(bnVar, bnVar, bnVar.getParentActivity(), bnVar.currentAccount, bnVar.Ba);
            bnVar.Bb = ikVar;
            ikVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
            bnVar.Bb.setDelegate(new jk(bnVar));
            bnVar.Bb.setTop(true);
            int i10 = 0;
            bnVar.Bb.setClipChildren(false);
            bnVar.Bb.setClipToPadding(false);
            bnVar.Bb.setVisibility(0);
            ik ikVar2 = bnVar.Bb;
            if (ikVar2.getSelectedReactions().isEmpty()) {
                i7 = 2131745677;
            } else {
                i7 = 2131745676;
            }
            ikVar2.setHint(org.telegram.messenger.gd.M0(i7, null));
            bnVar.f46093m1.addView(bnVar.Bb, c8.ma.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            bnVar.Bb.p(null, null, true);
            bnVar.Bb.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
            bnVar.Bb.setScaleY(0.4f);
            bnVar.Bb.setScaleX(0.4f);
            bnVar.Bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).start();
            bnVar.td();
            ik ikVar3 = bnVar.Bb;
            float f10 = bnVar.T9;
            bk bkVar = bnVar.D1;
            if (bkVar != null) {
                i10 = bkVar.getCurrentHeight();
            }
            ikVar3.setTranslationY(f10 + i10);
        }
    }

    public static void P0(bn bnVar, CharSequence charSequence, org.telegram.messenger.mp mpVar, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.r41[] r41VarArr;
        if (bnVar.X5 != 0) {
            bnVar.getConnectionsManager().cancelRequest(bnVar.X5, true);
            bnVar.X5 = 0;
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
            if ((charSequence instanceof Spannable) && (r41VarArr = (org.telegram.ui.Components.r41[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.r41.class)) != null && r41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.r41 r41Var : r41VarArr) {
                    arrayList.add(r41Var.getURL());
                }
            }
            if (arrayList != null && bnVar.Z5 != null && arrayList.size() == bnVar.Z5.size()) {
                boolean z12 = true;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) bnVar.Z5.get(i7))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            bnVar.Z5 = arrayList;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                org.telegram.messenger.g0.g3(new vf(bnVar, 3));
                return;
            }
        }
        if (arrayList == null) {
            org.telegram.messenger.g0.g3(new vf(bnVar, 2));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (bnVar.h != null && mpVar.J2 == 2) {
            org.telegram.messenger.g0.g3(new ie(bnVar, mpVar, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = bnVar.Y5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i10 = bnVar.Pb + 1;
            bnVar.Pb = i10;
            xf xfVar = new xf(bnVar, i10, getwebpagepreview, 0);
            if (bnVar.Qb == null) {
                bnVar.Qb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) bnVar.Qb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                xfVar.a(Boolean.TRUE, webPage2);
                return;
            }
            m6 m6Var = new m6(bnVar, getwebpagepreview, xfVar, 1);
            if (bnVar.X5 != 0) {
                bnVar.getConnectionsManager().cancelRequest(bnVar.X5, true);
            }
            bnVar.X5 = bnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.m6(14, bnVar, m6Var));
            bnVar.getConnectionsManager().bindRequestToGuid(bnVar.X5, bnVar.classGuid);
        }
    }

    public static org.telegram.ui.wq0 P1(org.telegram.ui.bn r14, org.telegram.messenger.fj r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.P1(org.telegram.ui.bn, org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    public static void Q0(bn bnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit().putLong("dialog_join_requested_time_" + bnVar.f46085l6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.v3.T(bnVar.f45987e) && !bnVar.f45987e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i7 = org.telegram.ui.Components.p70.f38303u1;
            org.telegram.ui.Components.p70.K0(context, bnVar, org.telegram.ui.Components.lc.b0(bnVar), z10);
        }
        bnVar.cc(false, true);
    }

    public static TLRPC.TL_message R7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28426id = message.f28426id;
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

    public static void S0(org.telegram.ui.bn r7, java.lang.String r8, org.telegram.messenger.fj r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.S0(org.telegram.ui.bn, java.lang.String, org.telegram.messenger.fj, boolean):void");
    }

    public static void T0(bn bnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, m6 m6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f28426id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.fj(bnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.n5.o(tL_webPageAttributeStory.peer));
            bnVar.getMessagesController().R1().f12393k.d(hVar, new k9(26, hVar, m6Var), bnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void U0(bn bnVar) {
        bnVar.W7(false);
        if (!bnVar.fragmentBeginToShow) {
            bj bjVar = bnVar.A0;
            bjVar.X1 = false;
            bjVar.Y1 = 0;
            bjVar.setEmptyView(bnVar.f46003f1);
            bj bjVar2 = bnVar.A0;
            bjVar2.X1 = true;
            bjVar2.Y1 = 1;
            return;
        }
        bnVar.A0.setEmptyView(bnVar.f46003f1);
    }

    public static void V0(bn bnVar, TLRPC.ReactionCount reactionCount) {
        bnVar.P7(true);
        org.telegram.ui.Components.cm0.c(bnVar.getParentActivity(), bnVar.currentAccount, reactionCount.reaction, bnVar.Ba);
    }

    public static void W0(bn bnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(bnVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f28523id;
        long e10 = bnVar.getUserConfig().e();
        long j10 = bnVar.f46085l6;
        if (e10 == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        f10.k(org.telegram.messenger.ks.f25212w, arrayList, valueOf, bool, bool);
    }

    public static void X0(bn bnVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i7;
        org.telegram.ui.Components.y60 J = org.telegram.ui.Components.y60.J(bnVar, q1Var);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(bnVar.getParentActivity(), bnVar.Ba);
        J.f42369p = new fe(wk0Var, 0);
        if (z10 && ((org.telegram.messenger.h0) bnVar.getMessagesController().A7.f26161p0.f14001b).f24339c) {
            J.c(2131231275, org.telegram.messenger.gd.M0(2131742759, null), new ge(bnVar, str, 5), false);
        }
        boolean z11 = true;
        J.c(2131232105, org.telegram.messenger.gd.M0(2131742914, null), new je(bnVar, wk0Var, str, 1), false);
        if (z10) {
            J.c(2131232356, org.telegram.messenger.gd.M0(2131742705, null), new ge(bnVar, str, 6), false);
            J.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i10 = bnVar.currentAccount;
                long j3 = user.f28554id;
                k9 k9Var = new k9(16, bnVar, userArr);
                TLObject g22 = org.telegram.messenger.mp.u1(i10).g2(j3);
                boolean z12 = g22 instanceof TLRPC.User;
                if (!(g22 instanceof TLRPC.Chat) || !org.telegram.messenger.v3.V((TLRPC.Chat) g22)) {
                    z11 = false;
                }
                if (z12) {
                    i7 = 2131743309;
                } else if (z11) {
                    i7 = 2131743323;
                } else {
                    i7 = 2131743316;
                }
                J.n(g22, org.telegram.messenger.gd.M0(i7, null), k9Var);
            } else {
                J.p(13, -1, org.telegram.messenger.gd.M0(2131742960, null));
            }
        }
        wk0Var.e(J);
        wk0Var.f(q1Var, characterStyle, null, false);
        bnVar.showDialog(wk0Var);
    }

    public static ArrayList X7(ArrayList arrayList, boolean z10, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList.get(i7);
            String str = yyVar.f28213c;
            if (str == null) {
                if (yyVar.f28211a != null) {
                    try {
                        File q02 = org.telegram.messenger.g0.q0("", z10);
                        InputStream openInputStream = org.telegram.messenger.t0.f26915b.getContentResolver().openInputStream(yyVar.f28211a);
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
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str2, ((Integer) N0.first).intValue(), yyVar.f28223o, 0, 0);
                efVar.n(N0);
                if (i7 == arrayList.size() - 1 && charSequence != null) {
                    efVar.f27848a = charSequence;
                }
                arrayList2.add(efVar);
            }
        }
        return arrayList2;
    }

    public static CharSequence X8(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, int[] iArr) {
        if (fjVar == null) {
            return null;
        }
        String H1 = org.telegram.messenger.mp.u1(fjVar.K1).H1(fjVar.f23968k.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            return H1;
        }
        if (fjVar.T4() && !org.telegram.ui.Components.g21.k(fjVar)) {
            return fjVar.i2();
        }
        CharSequence charSequence = fjVar.f24026z;
        if (charSequence != null) {
            return charSequence;
        }
        if (ajVar == null) {
            return null;
        }
        ArrayList arrayList = ajVar.d;
        int size = arrayList.size();
        CharSequence charSequence2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7);
            CharSequence charSequence3 = fjVar2.f24026z;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = fjVar2.e1();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void Y0(bn bnVar, Object[] objArr, org.telegram.ui.Components.iw0 iw0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(iw0Var.f30195c, bnVar.resourceProvider);
                if (z10) {
                    i7 = 2131744609;
                } else {
                    i7 = 2131744610;
                }
                org.telegram.ui.Components.gc q10 = lcVar.q(document, org.telegram.messenger.gd.a0(null, null, i7, stickerSet.title));
                q10.f35461j = 2750;
                q10.k(true);
            }
        }
    }

    public static void Z(bn bnVar) {
        int i7;
        String str;
        int i10;
        Activity parentActivity = bnVar.getParentActivity();
        int i11 = bnVar.currentAccount;
        long j3 = bnVar.f46085l6;
        zm zmVar = bnVar.Ba;
        int i12 = org.telegram.ui.Components.go.M;
        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.i6) zmVar, false);
        x2Var.Q(org.telegram.ui.ActionBar.n6.f29469h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624078, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i13, zmVar));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, zmVar);
        linearLayout.addView((View) imageView, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        boolean K3 = org.telegram.messenger.mp.u1(i11).K3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.u6.U(textView, i14, zmVar);
        textView.setTextSize(1, 20.0f);
        if (K3) {
            i7 = 2131746843;
        } else {
            i7 = 2131746844;
        }
        textView.setText(org.telegram.messenger.gd.M0(i7, null));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView2, i14, zmVar);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.o10.k(org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        if (K3) {
            i10 = 2131746841;
        } else {
            i10 = 2131746842;
        }
        org.telegram.messenger.f3.q(null, null, i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 1, 12, 9, 12, 19));
        if (!K3) {
            ug.s0 s0Var = new ug.s0(parentActivity, zmVar, true);
            s0Var.setOnClickListener(new org.telegram.ui.Components.e3(x2Var, 1));
            s0Var.c(org.telegram.messenger.gd.M0(2131746845, null), false, false);
            linearLayout.addView(s0Var, c8.ma.t(-1, 48, 1, 0, 0, 0, 4));
        }
        x2Var.O = linearLayout;
        x2Var.show();
    }

    public static void Z0(bn bnVar) {
        if (org.telegram.messenger.g0.g(bnVar.f46153qc.X0)) {
            org.telegram.messenger.n10.t(null, 2131743959, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.resourceProvider));
        }
    }

    public static FrameLayout Z7(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f));
        di.xb xbVar = new di.xb(context, 13);
        int i10 = 3;
        xbVar.setMaxLines(3);
        xbVar.setGravity(3);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.E8, i6Var);
        xbVar.setTextSize(1, i7);
        xbVar.setMaxWidth(org.telegram.messenger.g0.L(170.0f));
        xbVar.setText(charSequence);
        if (org.telegram.messenger.gd.f24216a0) {
            i10 = 5;
        }
        frameLayout.addView(xbVar, c8.ma.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static SpannableStringBuilder Z8(long j3, org.telegram.messenger.fj fjVar, boolean z10) {
        TLRPC.Chat O0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long Z0 = fjVar.Z0();
            int i7 = fjVar.K1;
            if (j3 != Z0) {
                int i10 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(Z0));
                    if (c22 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) O0.title).append((CharSequence) ":\n");
                }
            }
        }
        String H1 = org.telegram.messenger.mp.u1(fjVar.K1).H1(fjVar.f23968k.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            spannableStringBuilder.append((CharSequence) H1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = fjVar.f24026z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(fjVar.v);
        return spannableStringBuilder;
    }

    public static void a0(bn bnVar, String str) {
        if (bnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(bnVar.currentAccount).s(1));
            bnVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void a1(bn bnVar) {
        if (!bnVar.t7(bnVar.f45932a0.getSendButton())) {
            if (bnVar.getMediaController().I(bnVar.f46210v5)) {
                bnVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = bnVar.getMessagesController().l1(bnVar.f46085l6);
            if (bnVar.f46224w5 != null) {
                for (int i7 = 0; i7 < bnVar.f46224w5.d.size(); i7++) {
                    tL_messages_sendScheduledMessages.f28523id.add(Integer.valueOf(((org.telegram.messenger.fj) bnVar.f46224w5.d.get(i7)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f28523id.add(Integer.valueOf(bnVar.f46210v5.e1()));
            }
            ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new u7(6, bnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static org.telegram.messenger.fj a2(bn bnVar) {
        View view = bnVar.f46214v9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.u0) {
            return ((org.telegram.ui.Cells.u0) view).getMessageObject();
        }
        return null;
    }

    public static bi.m2 a5(bn bnVar, org.telegram.messenger.fj fjVar) {
        if (fjVar != null && !fjVar.N3() && fjVar.l4() && fjVar.f23968k.ttl == Integer.MAX_VALUE) {
            long V = bnVar.getMessagesController().V(fjVar.e1(), bnVar.f46085l6);
            fjVar.I0 = true;
            if (fjVar.P3() || (!fjVar.g4() && !fjVar.S4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar);
                bnVar.bd(arrayList, true);
            }
            return new bi.m2(bnVar, V, fjVar, 17);
        }
        return null;
    }

    public static void b0(bn bnVar, org.telegram.ui.Components.y60 y60Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) y60Var.A;
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(bnVar.getParentActivity(), bnVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new ji.j(bnVar, y60Var, false, 14), bnVar.getResourceProvider());
        poVar.e(bnVar.f46085l6, bnVar.d(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(poVar.f38508f);
        y60Var.f42372q0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void c0(bn bnVar, int i7) {
        if (i7 != 0) {
            org.telegram.messenger.g0.g3(new re(bnVar, i7, 7));
        } else {
            bnVar.actionBar.setSubtitle(org.telegram.messenger.gd.M0(2131748000, null));
        }
    }

    public static void c1(bn bnVar, long j3, boolean z10) {
        if (!bnVar.V4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit();
            edit.putInt("pin_" + bnVar.f46085l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
            bnVar.V4.clear();
            bnVar.X4.clear();
            bnVar.Z4 = 0;
            bnVar.f45979d5 = 0;
            bnVar.f45993e5 = 0;
            bnVar.gd(0, true);
        }
        if (org.telegram.messenger.v3.p0(bnVar.f45987e) && org.telegram.messenger.v3.A(bnVar.currentAccount, bnVar.f45987e, 24)) {
            if (j3 != 0) {
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27054a.c(new org.telegram.messenger.np(1, -bnVar.f45987e.f28405id, j3, messagesStorage));
                bnVar.getMessagesController().i0(j3, 0, bnVar.getMessagesController().l1(-bnVar.f45987e.f28405id));
                bnVar.getMessagesController().f25771t7.s(bnVar.f45987e.f28405id, j3);
            }
        } else {
            bnVar.getMessagesController().X(1, bnVar.f46085l6, z10);
            org.telegram.messenger.tr messagesStorage2 = bnVar.getMessagesStorage();
            long j10 = bnVar.f46085l6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.pp(messagesStorage2, j10, 2));
            org.telegram.messenger.e00 e00Var = bnVar.getMessagesController().f25771t7;
            e00Var.getClass();
            org.telegram.messenger.g0.g3(new di.vb((Object) e00Var, -bnVar.f46085l6, true, 4));
        }
        bnVar.f45994e6.put(j3, 0);
        org.telegram.ui.Components.z11 z11Var = bnVar.f46016g2;
        if (z11Var != null) {
            z11Var.setAllTopicsHidden(false);
        }
        if (j3 == bnVar.f46173s4) {
            bnVar.N7(false, null);
            bnVar.D0.O(false);
        }
    }

    public static void d0(long j3, bn bnVar) {
        if (di.x8.y(bnVar.currentAccount, false).p().amount < j3) {
            new di.fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), j3, 13, org.telegram.messenger.n5.t(bnVar.a()), new af(bnVar, 21), bnVar.a()).show();
        } else {
            new di.gb(bnVar.getParentActivity(), bnVar.resourceProvider).show();
        }
    }

    public static void d1(bn bnVar, int i7) {
        if (bnVar.fragmentView != null) {
            org.telegram.ui.Cells.z J8 = bnVar.J8(i7, false);
            if (J8 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) J8;
                ch.q0 q0Var = q1Var.O;
                TLRPC.MessagePeerReaction K1 = q1Var.getMessageObject().K1();
                if (K1 != null && (q0Var.H || K1.big)) {
                    ch.l0.d(bnVar, null, J8, null, 0.0f, 0.0f, ch.p0.d(K1.reaction), bnVar.currentAccount, !K1.big ? 1 : 0);
                    ch.l0.f();
                }
                q0Var.H = false;
                org.telegram.messenger.fj fjVar = q1Var.Q5;
                if (fjVar != null) {
                    fjVar.h5();
                }
            } else if (J8 instanceof org.telegram.ui.Cells.u0) {
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) J8;
                ch.q0 q0Var2 = u0Var.F0;
                TLRPC.MessagePeerReaction K12 = u0Var.getMessageObject().K1();
                if (K12 != null && (q0Var2.H || K12.big)) {
                    ch.l0.d(bnVar, null, J8, null, 0.0f, 0.0f, ch.p0.d(K12.reaction), bnVar.currentAccount, !K12.big ? 1 : 0);
                    ch.l0.f();
                }
                q0Var2.H = false;
                org.telegram.messenger.fj fjVar2 = u0Var.Q0;
                if (fjVar2 != null) {
                    fjVar2.h5();
                }
            }
        }
    }

    public static void e0(bn bnVar) {
        if (bnVar.f46120o5) {
            bnVar.f46120o5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f22716h1 == bnVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void e1(bn bnVar, org.telegram.messenger.fj fjVar, Long l10, Runnable runnable) {
        di.x8.y(bnVar.currentAccount, false).j0(fjVar, l10.longValue(), runnable, false);
    }

    public static void e2(bn bnVar, float f10) {
        View view = bnVar.f46214v9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).setSlidingOffset(f10);
        } else if (view instanceof org.telegram.ui.Cells.u0) {
            ((org.telegram.ui.Cells.u0) view).setWalletSlidingOffset(f10);
        }
    }

    public static void f0(bn bnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.mp.u1(bnVar.currentAccount).f4(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (bnVar.j() != null) {
                tLObject2 = bnVar.j();
            } else {
                tLObject2 = bnVar.f45987e;
            }
            if (!org.telegram.messenger.ri.v(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = bnVar.f46001f;
                if (user2 != null && user2.bot && user.f28554id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.f3.o(null, 2131753102, org.telegram.ui.Components.lc.b0(bnVar), null);
                } else if (user2 != null && user2.bot && user.f28554id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.f3.o(null, 2131753105, org.telegram.ui.Components.lc.b0(bnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.f3.o(null, 2131753101, org.telegram.ui.Components.lc.b0(bnVar), null);
                } else {
                    TLRPC.Chat chat = bnVar.f45987e;
                    if (chat != null && !org.telegram.messenger.v3.V(chat)) {
                        org.telegram.messenger.f3.o(null, 2131753103, org.telegram.ui.Components.lc.b0(bnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = bnVar.f45987e;
                    if (chat2 != null && org.telegram.messenger.v3.V(chat2)) {
                        org.telegram.messenger.f3.o(null, 2131753104, org.telegram.ui.Components.lc.b0(bnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                bnVar.za(user.f28554id, bnVar.C8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(bnVar.getParentActivity());
                u6Var.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29491ia, false));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.L5, u6Var, null);
                u6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bnVar.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.W = u6Var;
                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("BotRequestAttachPermission", null, 2131752985, org.telegram.messenger.o10.q(user)));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753151, null), new a1.d(bnVar, user, atomicBoolean, tL_attachMenuBot, 8));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(5, bnVar.getParentActivity(), bnVar.getResourceProvider());
                    c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    c2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                    c2Var.setMultiline(true);
                    c2Var.e(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131747587, org.telegram.messenger.o10.q(user))), "", true, false, false);
                    if (org.telegram.messenger.gd.f24216a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.gd.f24216a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var.setPadding(L, 0, L2, 0);
                    c2Var.setOnClickListener(new ni.b(15, c2Var, atomicBoolean));
                    u1Var.H = 6;
                    alertDialog$Builder.o(c2Var);
                }
                alertDialog$Builder.p();
            } else {
                zc1.a(bnVar.getParentActivity(), new x(bnVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void f1(bn bnVar, TLRPC.TL_game tL_game, org.telegram.messenger.fj fjVar, String str, long j3) {
        bnVar.tc(tL_game, fjVar, str, false, j3);
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void f2(bn bnVar) {
        long j3;
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            if (bnVar.f46236x4) {
                if (yoVar.I != null) {
                    if (bnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.i9.a(bnVar, bnVar.getParentLayout().getFragmentStack().indexOf(bnVar), bnVar.f45987e, bnVar.f46001f, bnVar.f46159r4, bnVar.f46085l6, bnVar.Sa, bnVar.Ra);
                    }
                    TLRPC.Chat chat = bnVar.f45987e;
                    TLRPC.TL_forumTopic tL_forumTopic = bnVar.ma.I;
                    long j10 = bnVar.f46085l6;
                    int i7 = bnVar.Ra;
                    int i10 = bnVar.Sa;
                    if (bnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.i9.a(bnVar, bnVar.getParentLayout().getFragmentStack().indexOf(bnVar), chat, null, tL_forumTopic, j10, i7, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", bnVar.ma.f54238a);
                    bundle.putInt("dialog_filter_id", bnVar.ma.f54240b);
                    bundle.putBoolean("pulled", true);
                    bn h = qg.c.h(bnVar, -bnVar.f46085l6, bnVar.ma.I, 0, bundle);
                    h.f46125oa = true;
                    f45929td = true;
                    bnVar.presentFragment(h, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = yoVar.H;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f28405id;
            }
            if (j3 != 0) {
                bnVar.I6();
                yo yoVar2 = bnVar.ma;
                TLRPC.Chat chat3 = yoVar2.H;
                long j12 = yoVar2.f54239a0;
                int i11 = yoVar2.f54238a;
                int i12 = yoVar2.f54240b;
                if (bnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.i9.a(bnVar, bnVar.getParentLayout().getFragmentStack().indexOf(bnVar), chat3, null, null, j12, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = bnVar.ma.H;
                if (chat4 != null) {
                    j11 = chat4.f28405id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", bnVar.ma.f54238a);
                bundle2.putInt("dialog_filter_id", bnVar.ma.f54240b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit().remove("diditem" + bnVar.ma.f54239a0).apply();
                bn bnVar2 = new bn(bundle2);
                ArrayList arrayList = bnVar.Fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = bnVar.Fb;
                    bnVar2.Fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                bnVar2.f46125oa = true;
                f45929td = true;
                bnVar.presentFragment(bnVar2, true);
            }
        }
    }

    public static void f5(bn bnVar, org.telegram.ui.Cells.q1 q1Var) {
        uh.a aVar;
        int i7;
        int i10;
        te.a aVar2 = bnVar.f46000ed;
        if (bnVar.f45932a0 != null && !aVar2.f57658f && q1Var.getMessageObject() != null) {
            pl plVar = bnVar.f46093m1;
            RectF rectF = org.telegram.messenger.g0.P;
            jh.k.c(q1Var, plVar, rectF);
            Rect rect = org.telegram.messenger.g0.Q;
            org.telegram.ui.Cells.w1 w1Var = q1Var.f31583x2;
            if (w1Var != null && (aVar = w1Var.f32240l) != null && w1Var.f32247s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((bnVar.f46093m1.getMeasuredHeight() - bnVar.A0.getPaddingBottom()) + bnVar.f45945ad) - org.telegram.messenger.g0.L(2.0f)));
                org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
                if (bnVar.f46079kd == null) {
                    bnVar.f46079kd = new sh.c(bnVar.getParentActivity(), bnVar.resourceProvider, bnVar);
                    int indexOfChild = bnVar.f46093m1.indexOfChild(bnVar.A0);
                    if (indexOfChild >= 0) {
                        bnVar.f46093m1.addView(bnVar.f46079kd, indexOfChild + 1, c8.ma.g());
                    } else {
                        bnVar.f46093m1.addView(bnVar.f46079kd, c8.ma.g());
                    }
                }
                if (messageObject.P3()) {
                    if (q1Var.A2()) {
                        i10 = org.telegram.ui.ActionBar.n6.f29420ec;
                    } else {
                        i10 = org.telegram.ui.ActionBar.n6.f29511jc;
                    }
                    bnVar.T0 = i10;
                } else {
                    if (q1Var.A2()) {
                        i7 = org.telegram.ui.ActionBar.n6.fe;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.f29422ee;
                    }
                    bnVar.T0 = i7;
                }
                bnVar.f46079kd.setColor(bnVar.getThemedColor(bnVar.T0));
                bnVar.f46079kd.setCellToWatch(q1Var);
                ((te.a) bnVar.f46079kd.f57423b.f12614b).a(false, false);
                bnVar.f46079kd.setAnimatedVisibility(aVar2.f57657e);
                bnVar.f46079kd.f57423b.setOnClickListener(new sh.b(new af(bnVar, 26), 0));
                sh.c cVar = bnVar.f46079kd;
                cVar.f57429s = new af(bnVar, 27);
                bi.u uVar = cVar.f57422a;
                uVar.setOnKeyListener(new uf(bnVar, 0));
                uVar.setOnEditorActionListener(new fa(bnVar, 1));
                bnVar.f45932a0.S6 = uVar;
                org.telegram.messenger.g0.h3(new b0(bnVar, measuredHeight, uVar, 6), 100L);
                aVar2.a(true, true);
            }
        }
    }

    public static void g0(bn bnVar, int i7, int i10, int i11, int i12) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = bnVar.S6;
        int[] iArr4 = bnVar.R6;
        boolean[] zArr = bnVar.W6;
        int[] iArr5 = bnVar.Q6;
        int[] iArr6 = bnVar.T6;
        boolean[] zArr2 = bnVar.V6;
        ArrayList arrayList = bnVar.f46263z6;
        if ((i7 - i10) - i11 <= i12 && !bnVar.Y6) {
            boolean[] zArr3 = bnVar.U6;
            if (!zArr3[0]) {
                bnVar.Y6 = true;
                arrayList.add(Integer.valueOf(bnVar.f46109n6));
                if (bnVar.J6.size() != 0) {
                    org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
                    j3 = 0;
                    long j10 = bnVar.f46085l6;
                    c10 = 0;
                    long j11 = bnVar.f45981d7;
                    int i13 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = bnVar.classGuid;
                    int i16 = bnVar.f46018g4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = bnVar.f46173s4;
                    int i17 = bnVar.C4;
                    int i18 = bnVar.f46109n6;
                    bnVar.f46109n6 = i18 + 1;
                    messagesController.e3(j10, j11, false, 50, i13, 0, z10, i14, i15, 0, i16, j12, i17, i18, bnVar.f46236x4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    org.telegram.messenger.mp messagesController2 = bnVar.getMessagesController();
                    long j13 = bnVar.f46085l6;
                    long j14 = bnVar.f45981d7;
                    boolean z11 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = bnVar.classGuid;
                    int i21 = bnVar.f46018g4;
                    long j15 = bnVar.f46173s4;
                    int i22 = bnVar.C4;
                    int i23 = bnVar.f46109n6;
                    bnVar.f46109n6 = i23 + 1;
                    messagesController2.e3(j13, j14, false, 50, 0, 0, z11, i19, i20, 0, i21, j15, i22, i23, bnVar.f46236x4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (bnVar.f45981d7 != 0 && !zArr3[1]) {
                    bnVar.Y6 = true;
                    arrayList.add(Integer.valueOf(bnVar.f46109n6));
                    org.telegram.messenger.mp messagesController3 = bnVar.getMessagesController();
                    long j16 = bnVar.f45981d7;
                    int i24 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = bnVar.classGuid;
                    int i27 = bnVar.f46018g4;
                    long j17 = bnVar.f46173s4;
                    int i28 = bnVar.C4;
                    int i29 = bnVar.f46109n6;
                    bnVar.f46109n6 = i29 + 1;
                    messagesController3.e3(j16, 0L, false, 50, i24, 0, z12, i25, i26, 0, i27, j17, i28, i29, bnVar.f46236x4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i11 > 0 && !bnVar.f45940a8 && i10 <= 10) {
            if (bnVar.f45981d7 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(bnVar.f46109n6));
                org.telegram.messenger.mp messagesController4 = bnVar.getMessagesController();
                long j18 = bnVar.f45981d7;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = bnVar.classGuid;
                int i33 = bnVar.f46018g4;
                long j19 = bnVar.f46173s4;
                int i34 = bnVar.C4;
                int i35 = bnVar.f46109n6;
                bnVar.f46109n6 = i35 + 1;
                messagesController4.e3(j18, 0L, false, 50, i30, 0, true, i31, i32, 1, i33, j19, i34, i35, bnVar.f46236x4);
                bnVar.f45940a8 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(bnVar.f46109n6));
                org.telegram.messenger.mp messagesController5 = bnVar.getMessagesController();
                long j20 = bnVar.f46085l6;
                long j21 = bnVar.f45981d7;
                int i36 = iArr2[c10];
                int i37 = iArr[c10];
                int i38 = bnVar.classGuid;
                int i39 = bnVar.f46018g4;
                long j22 = bnVar.f46173s4;
                int i40 = bnVar.C4;
                int i41 = bnVar.f46109n6;
                bnVar.f46109n6 = i41 + 1;
                messagesController5.e3(j20, j21, false, 50, i36, 0, true, i37, i38, 1, i39, j22, i40, i41, bnVar.f46236x4);
                bnVar.f45940a8 = true;
            }
        }
    }

    public static void g1(org.telegram.ui.bn r12, org.telegram.ui.tj r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.g1(org.telegram.ui.bn, org.telegram.ui.tj, boolean[]):void");
    }

    public static void h0(org.telegram.ui.bn r19, final org.telegram.ui.uy0[] r20, final org.telegram.ui.Components.y60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.h0(org.telegram.ui.bn, org.telegram.ui.uy0[], org.telegram.ui.Components.y60):void");
    }

    public static void h1(bn bnVar) {
        if (bnVar.f46018g4 == 0 && bnVar.getMessagesController().Q6 > bnVar.getConnectionsManager().getCurrentTime() && !b.a(bnVar.currentAccount, bnVar.f46001f)) {
            b.c(bnVar.currentAccount, bnVar.getParentActivity(), bnVar.getResourceProvider());
        }
    }

    public static void i0(bn bnVar, int i7, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        if (bnVar.Pb != i7) {
            return;
        }
        if (bool.booleanValue()) {
            bnVar.Y5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                bnVar.Y5 = null;
                org.telegram.messenger.jj jjVar = bnVar.f46237x5;
                if (jjVar != null) {
                    int i10 = bnVar.currentAccount;
                    CharSequence fieldText = bnVar.f45932a0.getFieldText();
                    org.telegram.messenger.fj fjVar3 = bnVar.F5;
                    if (fjVar3 == bnVar.f46096m4) {
                        fjVar2 = null;
                    } else {
                        fjVar2 = fjVar3;
                    }
                    jjVar.e(i10, null, fieldText, fjVar2, bnVar.D5, bnVar.H5);
                }
                bnVar.B8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                bnVar.f45938a6 = str;
            }
            if (bnVar.h != null && z10) {
                webPage.url = str;
            }
            org.telegram.messenger.jj jjVar2 = bnVar.f46237x5;
            if (jjVar2 != null) {
                int i11 = bnVar.currentAccount;
                CharSequence fieldText2 = bnVar.f45932a0.getFieldText();
                org.telegram.messenger.fj fjVar4 = bnVar.F5;
                if (fjVar4 == bnVar.f46096m4) {
                    fjVar = null;
                } else {
                    fjVar = fjVar4;
                }
                jjVar2.e(i11, null, fieldText2, fjVar, bnVar.D5, bnVar.H5);
            }
            bnVar.lc(true, bnVar.Y5, false);
            return;
        }
        bnVar.Y5 = null;
        bnVar.B8();
    }

    public static void i1(bn bnVar, int i7) {
        dh.g gVar = bnVar.H;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.dd.a(i7, 4)) {
                ti.a e10 = bnVar.glassEngine.e();
                float L = org.telegram.messenger.g0.L(48.0f);
                float L2 = org.telegram.messenger.g0.L(48.0f);
                int i10 = 0;
                while (i10 < e10.f58229b) {
                    RectF rectF = (RectF) e10.f58228a.get(i10);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e10.d(i10);
                    } else {
                        i10++;
                    }
                }
                e10.b(bnVar.A0.getY(), bnVar.A0.getWidth(), bnVar.A0.getY() + bnVar.A0.getHeight());
                gVar.h(e10);
            }
            pl plVar = bnVar.f46093m1;
            gVar.e(plVar.f50935q0, plVar.getWidth(), bnVar.f46093m1.getHeight());
        }
    }

    public static void j0(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.ri.d0(bnVar.currentAccount).H0(false, true, null);
            bnVar.za(user.f28554id, bnVar.C8, false);
        }
    }

    public static void j1(bn bnVar) {
        bnVar.ya = null;
        bnVar.A0.setOnInterceptTouchListener(null);
        bnVar.Pb(bnVar.f46093m1, true);
        org.telegram.messenger.f4.f(bnVar.currentAccount).f23833a.clear();
    }

    public static void k0(bn bnVar, boolean[] zArr, Context context) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2 = bnVar.F5;
        if (fjVar2 == null || !org.telegram.messenger.fj.c3(fjVar2.f23968k)) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i7 = bnVar.Sb;
            if (i7 == 5) {
                int i10 = bnVar.currentAccount;
                long j3 = bnVar.f46085l6;
                org.telegram.messenger.kj kjVar = bnVar.f46250y5;
                if (kjVar == null) {
                    kjVar = org.telegram.messenger.kj.a();
                }
                new di.r0(context, i10, j3, kjVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
            } else if (i7 == 1 && (fjVar = bnVar.H5) != null) {
                if (fjVar.p5() && !z10) {
                    org.telegram.messenger.kj kjVar2 = bnVar.f46250y5;
                    if (kjVar2 == null) {
                        kjVar2 = org.telegram.messenger.kj.a();
                    }
                    bnVar.Ac(kjVar2);
                } else if (bnVar.H5.t() && bnVar.G5 == 0) {
                    if (bnVar.Y1 == null) {
                        bnVar.U7();
                    }
                    bnVar.Y1.x1(-1, bnVar.H5);
                    bnVar.Aa();
                } else {
                    bnVar.l(bnVar.H5.e1(), 0, true, 0, true, 0);
                }
            } else if (bnVar.f46237x5 != null) {
                if (i7 == 2) {
                    if (!org.telegram.messenger.n5.C(bnVar.f46085l6) && !bnVar.f46237x5.f24885u && bnVar.f46018g4 != 5) {
                        int i11 = org.telegram.messenger.bz.f23148a;
                        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                        org.telegram.messenger.bz.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        bnVar.Fa(0);
                        return;
                    }
                    org.telegram.messenger.fj fjVar3 = bnVar.F5;
                    if (fjVar3 != null) {
                        bnVar.l(fjVar3.e1(), 0, true, 0, true, 0);
                    }
                } else if (i7 == 3) {
                    int i12 = org.telegram.messenger.bz.f23148a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                    org.telegram.messenger.bz.P = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    bnVar.Fa(1);
                } else if (i7 == 4) {
                    bnVar.Fa(2);
                }
            }
        }
    }

    public static void k1(bn bnVar) {
        org.telegram.ui.Components.k30.h.a();
        bnVar.showDialog(new bi.j3(bnVar.getParentActivity(), bnVar.currentAccount, bnVar.a(), null, null));
    }

    public static void k2(bn bnVar, View view, boolean z10, float f10, float f11) {
        org.telegram.messenger.fj fjVar;
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            fjVar = q1Var.getMessageObject();
            q1Var.f31368h1 = f10;
            q1Var.f31381i1 = f11;
            org.telegram.ui.Components.v90 v90Var = q1Var.Ta;
            float f12 = q1Var.f31381i1;
            v90Var.h = q1Var.getTranslationX() + f10;
            v90Var.f40554i = f12;
            v90Var.f40557l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.u0) {
            fjVar = ((org.telegram.ui.Cells.u0) view).getMessageObject();
        } else {
            fjVar = null;
        }
        int a92 = bnVar.a9(fjVar);
        if ((fjVar == null || ((i10 = fjVar.D) != 30 && i10 != 18 && i10 != 25)) && a92 >= 2 && a92 != 20 && a92 != 21) {
            if (fjVar == null || ((i7 = fjVar.D) != 27 && i7 != 30)) {
                if (fjVar == null || !fjVar.X4()) {
                    if (fjVar == null || (!fjVar.r4() && !org.telegram.messenger.fj.c3(fjVar.f23968k))) {
                        bnVar.K6(fjVar, z10, true);
                        bnVar.Lc();
                        bnVar.Gd(false);
                    }
                }
            }
        }
    }

    public static void l0(bn bnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        ug.i1 i1Var = new ug.i1(bnVar, bnVar.currentAccount, user, null, null, bnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            i1Var.f58701z2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(bnVar.getParentActivity());
        org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(160.0f), 4, q9Var, false);
        q9Var.setImageDrawable(m5Var);
        q9Var.addOnAttachStateChangeListener(new e5(m5Var, 1));
        m5Var.j(j3, false);
        i1Var.A2 = true;
        i1Var.f58699x2 = q9Var;
        bnVar.showDialog(i1Var);
    }

    public static void l1(bn bnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        bn bnVar2;
        int i7;
        int i10;
        TLRPC.TL_forumTopic f10;
        jh.a aVar = bnVar.f46204uc;
        if (num.intValue() != bnVar.d()) {
            bnVar.Uc = false;
            te teVar = bnVar.f46167rc;
            if (teVar != null) {
                org.telegram.messenger.g0.r(teVar);
                bnVar.f46167rc.run();
                bnVar.f46167rc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.z11 z11Var = bnVar.f46016g2;
            long intValue = num.intValue();
            ArrayList l10 = org.telegram.messenger.mp.u1(z11Var.f42735e).f25771t7.l(-z11Var.f42737f);
            if (l10 != null) {
                int size = l10.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = l10.get(i11);
                    i11++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f28457id == intValue) {
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
            if (message == null && tL_forumTopic != null && (f10 = bnVar.getMessagesController().f25771t7.f(-bnVar.a(), tL_forumTopic.f28457id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                bnVar.Ab = SystemClock.uptimeMillis();
                bnVar.H7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    bnVar.vb(bnVar.d());
                } else if (bnVar.d() == 0) {
                    bnVar.vb(num.intValue());
                } else {
                    bnVar.F7 = -1;
                }
                bnVar.getConnectionsManager().cancelRequestsForGuid(bnVar.classGuid);
                bnVar.getMessagesStorage().k(bnVar.classGuid);
                bnVar.classGuid = ConnectionsManager.generateClassGuid();
                bnVar.sb();
                bnVar.f46237x5 = null;
                bnVar.M7 = 0;
                bnVar.C7 = false;
                bnVar.D7 = true;
                bnVar.Y7 = true;
                bnVar.Z7 = 0;
                bnVar.f45955b8 = null;
                bnVar.f46263z6.clear();
                bnVar.f45960c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.fj(bnVar.getCurrentAccount(), message, false, false));
                    bnVar2 = bnVar;
                    bnVar2.Vb(arrayList, bnVar.f45987e, tL_forumTopic2.f28457id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    bnVar2 = bnVar;
                    bnVar2.f46159r4 = null;
                    bnVar2.f46132p4 = null;
                    bnVar2.f46096m4 = null;
                    bnVar2.F5 = null;
                    bnVar2.A4 = 0;
                    bnVar2.B4 = 0;
                    bnVar2.C4 = 0;
                    bnVar2.f46173s4 = 0L;
                    bnVar2.f46184t4 = 0;
                    bnVar2.f46196u4 = null;
                    bnVar2.f46236x4 = false;
                    bnVar2.f46209v4 = false;
                }
                kl klVar = bnVar2.D0;
                if (klVar != null) {
                    if (klVar.J >= 0 && !klVar.N()) {
                        kl klVar2 = bnVar2.D0;
                        klVar2.s(klVar2.J);
                    } else {
                        kl klVar3 = bnVar2.D0;
                        if (klVar3.J < 0 && klVar3.N()) {
                            bnVar2.D0.i(0);
                        }
                    }
                    bnVar2.D0.T();
                }
                bnVar2.L8();
                bnVar2.wd(true);
                bnVar2.f46129p1.n(true);
                if (tL_forumTopic2 != null) {
                    bnVar2.Cd();
                } else {
                    bnVar2.f46129p1.b();
                }
                bnVar2.f46016g2.setCurrentTopic(bnVar2.d());
                bnVar2.zd(true);
                bnVar2.Pc(true);
                bnVar2.getMessagesController().V4(-bnVar2.a(), bnVar2.d());
                bnVar2.hb();
                bnVar2.E9(true);
                bnVar2.D9(true);
                bnVar2.N6(true, true);
                if (bnVar2.f45932a0 != null) {
                    if (!org.telegram.messenger.o10.v(bnVar2.f46001f)) {
                        bnVar2.f45932a0.G0(false);
                    }
                    bnVar2.f45932a0.j2(true);
                }
                if (tL_forumTopic2 != null) {
                    bnVar2.getMessagesController().f25771t7.k(bnVar2.f46085l6, tL_forumTopic2.f28457id);
                }
                if (tL_forumTopic2 != null) {
                    i7 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i7 = 0;
                }
                bnVar2.A1 = i7;
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i10 = 0;
                }
                bnVar2.B1 = i10;
                bnVar2.jd(false);
                bnVar2.id(false);
                bnVar2.Ad();
                tm tmVar = bnVar2.Vc;
                if (tmVar != null && bnVar2.actionBar.f29088o0) {
                    tmVar.k(null);
                }
                if (org.telegram.messenger.o10.v(bnVar2.f46001f)) {
                    bnVar2.getMediaDataController().L0(org.telegram.messenger.sr.a(bnVar2.f46085l6, num.intValue()), true);
                }
            }
        }
    }

    public static void l2(bn bnVar, int i7) {
        int i10;
        boolean z10;
        ArrayList arrayList = bnVar.M6;
        SparseArray[] sparseArrayArr = bnVar.f46121o6;
        if (!bnVar.mb && (i10 = i7 - bnVar.D0.K) >= 0 && i10 < arrayList.size()) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
            if (sparseArrayArr[0].get(fjVar.e1(), null) == null && sparseArrayArr[1].get(fjVar.e1(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i11), (org.telegram.messenger.fj) sparseArrayArr[0].valueAt(i11));
            }
            for (int i12 = 0; i12 < sparseArrayArr[1].size(); i12++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i12), (org.telegram.messenger.fj) sparseArrayArr[1].valueAt(i12));
            }
            org.telegram.ui.Components.ck0 ck0Var = bnVar.A0;
            ?? obj = new Object();
            obj.d = bnVar;
            obj.f20025b = z10;
            obj.f20026c = sparseArray;
            if (!ck0Var.f34053c2) {
                ck0Var.f34069l2 = new int[2];
                new HashSet();
                ck0Var.n1(ck0Var, true);
                ck0Var.f34060g2 = obj;
                ck0Var.f34053c2 = true;
                ck0Var.f34058f2 = i7;
                ck0Var.f34056e2 = i7;
            }
        }
    }

    public static void m0(bn bnVar) {
        org.telegram.ui.Cells.q1 q1Var;
        al alVar;
        int i7;
        if (!bnVar.f46217vc && bnVar.U3 && bnVar.A0.H && bnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = bnVar.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = bnVar.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f23968k != null && q1Var.getMessageObject().f23968k.video_processing_pending) {
                            if (q1Var.getCurrentPosition() != null) {
                                if (q1Var.getMessageObject() != null && (q1Var.getCurrentPosition().f27891l & 8) != 0) {
                                    int i10 = q1Var.getCurrentPosition().f27891l;
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
                            if (timeY >= org.telegram.messenger.g0.L(240.0f) && timeY <= (org.telegram.messenger.g0.f24121q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f24116n) {
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
                bnVar.f46217vc = true;
                al alVar2 = new al(bnVar, bnVar.getParentActivity());
                alVar2.r(true);
                alVar2.L = Layout.Alignment.ALIGN_CENTER;
                alVar2.d = 3500L;
                alVar2.U = true;
                alVar2.f14998e = true;
                alVar2.h = org.telegram.messenger.g0.L(150.0f);
                alVar2.s(8.0f);
                bnVar.Q1 = alVar2;
                alVar2.v(org.telegram.messenger.gd.M0(2131743361, null));
                bnVar.Q1.l(bnVar.L);
                bnVar.f46093m1.addView(bnVar.Q1, c8.ma.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                q1Var.getLocationInWindow(iArr);
                bnVar.R1 = q1Var.getTimeY() + iArr[1];
                bnVar.Q1.setTranslationY(((-alVar.getTop()) - org.telegram.messenger.g0.L(120.0f)) + bnVar.R1);
                bnVar.Q1.p(0.0f, (q1Var.A9 / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q1Var.C9);
                bnVar.Q1.x();
                return;
            }
            org.telegram.messenger.g0.r(new zd(bnVar, 2));
            org.telegram.messenger.g0.h3(new zd(bnVar, 2), 2000L);
        }
    }

    public static void m1(bn bnVar, long j3, long j10, Long l10) {
        int i7;
        String str;
        if (bnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = bnVar.getParentActivity();
        String M0 = org.telegram.messenger.gd.M0(2131746096, null);
        if (org.telegram.messenger.v3.p0(bnVar.f45987e)) {
            i7 = 2131746100;
        } else {
            i7 = 2131746101;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i7, org.telegram.messenger.n5.t(j3)));
        if (l10.longValue() > 0) {
            str = org.telegram.messenger.gd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.b5.f0(parentActivity, M0, W2, str, org.telegram.messenger.gd.M0(2131751806, null), new rg(bnVar, j3, j10, l10, 0), bnVar.resourceProvider, true);
    }

    public static boolean m2(bn bnVar, View view, RectF rectF) {
        RectF rectF2 = bnVar.f46065jc;
        if (rectF != null && bnVar.A0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void n0(bn bnVar) {
        if (bnVar.f45949b2) {
            bnVar.getMessagesController().d(0, 0, bnVar.f46085l6);
            bnVar.h8();
            bnVar.N3.j(23, bnVar.f46085l6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit();
            edit.putBoolean("dialog_bar_archived" + bnVar.f46085l6, false);
            edit.putBoolean("dialog_bar_block" + bnVar.f46085l6, false);
            edit.putBoolean("dialog_bar_report" + bnVar.f46085l6, false);
            edit.commit();
            bnVar.zd(false);
            org.telegram.messenger.xs notificationsController = bnVar.getNotificationsController();
            long j3 = bnVar.f46085l6;
            long d = bnVar.d();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().d().edit();
            String v = org.telegram.messenger.xs.v(j3, d, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + v);
            remove.remove("custom_" + v);
            notificationsController.getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().R.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j3, d, true);
        } else if (bnVar.f45934a2.getTag() != null && ((Integer) bnVar.f45934a2.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = bnVar.f46163r8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i7 = 0; i7 < bnVar.f46163r8.participants.participants.size(); i7++) {
                    hVar.k(null, bnVar.f46163r8.participants.participants.get(i7).user_id);
                }
                long j10 = bnVar.f46163r8.f28406id;
                org.telegram.ui.Components.j60 j60Var = new org.telegram.ui.Components.j60(bnVar.getParentActivity(), bnVar.currentAccount, hVar, bnVar.f46163r8.f28406id, bnVar, bnVar.Ba);
                j60Var.f36357g2 = new ee(bnVar, 24);
                j60Var.show();
            }
        } else if (bnVar.f45934a2.getTag() != null) {
            bnVar.Yb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", bnVar.f46001f.f28554id);
            bundle.putBoolean("addContact", true);
            qr qrVar = new qr(bundle);
            qrVar.P = new ee(bnVar, 25);
            bnVar.presentFragment(qrVar);
        }
    }

    public static void n1(bn bnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = bnVar.getMessagesController().l1(bnVar.f46085l6);
                tL_messages_getHistory.offset_date = bnVar.O7 + 86400;
                tL_messages_getHistory.limit = 1;
                bnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new u7(3, bnVar, tLObject));
                return;
            }
            bnVar.actionBar.setSubtitle(org.telegram.messenger.gd.M0(2131748000, null));
        }
    }

    public static void o1(bn bnVar, cg.a aVar, Runnable runnable) {
        if (!bnVar.isFinished) {
            if (cg.a.n(di.x8.x(bnVar.currentAccount, aVar.f5274a).p()).f5275b < aVar.f5275b) {
                cg.b bVar = aVar.f5274a;
                if (bVar == cg.b.f5276a) {
                    new di.fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), aVar.a(), 13, qg.c.i(bnVar.currentAccount, bnVar.a()), null, bnVar.a()).show();
                    return;
                } else if (bVar == cg.b.f5277b) {
                    new ii.s(bnVar.getParentActivity(), bnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void p0(bn bnVar, long j3, long j10) {
        org.telegram.messenger.f2.b(bnVar.currentAccount).h(j3, j10, false);
        bnVar.f46167rc = null;
    }

    public static void p1(bn bnVar, org.telegram.ui.Components.y60 y60Var) {
        if (bnVar.f46153qc == null) {
            return;
        }
        y60Var.v();
        bnVar.ma(bnVar.f46153qc, false, true);
        vf.c.s(bnVar.getParentActivity(), Uri.parse(bnVar.f46153qc.T0), true, false, false, null, null, false, org.telegram.messenger.mp.u1(bnVar.currentAccount).f25659g6, false, false);
    }

    public static void p4(bn bnVar, org.telegram.ui.Cells.g0 g0Var) {
        String charSequence;
        if (org.telegram.messenger.mp.u1(bnVar.currentAccount).f25789v7.s()) {
            CharSequence text = g0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            org.telegram.messenger.c6.d(charSequence, new z6(bnVar, g0Var, text, 3), new w0(g0Var, 16), false);
            return;
        }
        g0Var.setClickable(false);
    }

    public static void q0(bn bnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            di.pb.n1(bnVar.getParentActivity(), bnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, bnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            bnVar.presentFragment(new ml0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void q1(bn bnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(bnVar.currentAccount).q1(user.f28554id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new xg(bnVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void q2(bn bnVar, org.telegram.ui.Cells.q1 q1Var, int i7, int i10, int i11) {
        if (!bnVar.C2.W || bnVar.Mb != q1Var || bnVar.Nb != i11) {
            org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
            if (messageObject != null && (org.telegram.messenger.fj.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.fj.m1(messageObject);
                if (org.telegram.messenger.fj.W4(tL_messageMediaPoll) && !org.telegram.messenger.fj.U4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        bnVar.C2.v(org.telegram.messenger.gd.M0(2131746966, null));
                        bnVar.Mb = q1Var;
                        bnVar.Nb = i11;
                        bnVar.C2.y(bnVar.v9(q1Var, i10), bnVar.w9(q1Var, i11), true);
                    }
                }
            }
            if (i7 == -1) {
                bnVar.C2.v(org.telegram.messenger.gd.M0(2131746965, null));
                bnVar.Mb = q1Var;
                bnVar.Nb = i11;
                bnVar.C2.y(bnVar.v9(q1Var, i10), bnVar.w9(q1Var, i11), true);
            }
        }
    }

    public static void q4(bn bnVar) {
        if (bnVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = bnVar.f46018g4;
        if (i7 == 3) {
            tL_message.message = org.telegram.messenger.gd.M0(2131745699, null);
        } else if (i7 == 9) {
            tL_message.message = org.telegram.messenger.gd.M0(2131742635, null);
        } else {
            tL_message.message = org.telegram.messenger.gd.M0(2131752660, null);
        }
        tL_message.f28426id = 0;
        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(bnVar.currentAccount, tL_message, false, false);
        bnVar.X3 = fjVar;
        fjVar.D = 10;
        fjVar.U = 1;
    }

    public static void r0(bn bnVar) {
        TLRPC.ChatFull chatFull = bnVar.f46163r8;
        if (chatFull != null && !bnVar.I5) {
            TLRPC.Chat chat = bnVar.f45987e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && bnVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7;
                int i7 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z10 = org.telegram.messenger.s2.f26723a;
                int currentTime = bnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i7) >= 604800 && bnVar.visibleDialog == null && bnVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = bnVar.getParentActivity();
                    ee eeVar = new ee(bnVar, 15);
                    ee eeVar2 = new ee(bnVar, 16);
                    Pattern pattern = org.telegram.ui.Components.b5.f33529a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.g0.y2(null, 2131624038);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bg.q0(10));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.mz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(127.17949f), y22)));
                    frameLayout.addView(view, c8.ma.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.W = frameLayout;
                    u1Var.P0 = 0.3974359f;
                    u1Var.S = org.telegram.messenger.gd.M0(2131749389, null);
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749390, null));
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749391, null), eeVar);
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), eeVar2);
                    bnVar.showDialog(u1Var);
                }
            }
        }
    }

    public static void r1(bn bnVar) {
        if (org.telegram.messenger.g0.g(bnVar.f46153qc.W0)) {
            org.telegram.messenger.n10.t(null, 2131743959, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.resourceProvider));
        }
    }

    public static void r4(bn bnVar) {
        if (bnVar.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.gd.M0(2131742636, null);
        tL_message.f28426id = 0;
        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(bnVar.currentAccount, tL_message, false, false);
        bnVar.Y3 = fjVar;
        fjVar.D = 10;
        fjVar.U = 1;
    }

    public static void s0(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, ef efVar) {
        String str4;
        org.telegram.ui.Components.q21 q21Var;
        if (bnVar.f46210v5 != null && i7 < arrayList.size() && bnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = bnVar.getParentActivity();
            int i10 = iArr[0];
            vf vfVar = new vf(bnVar, 13);
            String[] strArr = org.telegram.ui.Components.y21.S1;
            if (parentActivity == null) {
                q21Var = null;
            } else {
                org.telegram.ui.Components.q21 q21Var2 = new org.telegram.ui.Components.q21(parentActivity, str, str4, inputPeer, i10, richMessage, vfVar);
                q21Var2.T0(z10);
                q21Var2.N1 = bnVar;
                q21Var2.O1 = efVar;
                if (bnVar.getParentActivity() != null) {
                    bnVar.showDialog(q21Var2);
                }
                q21Var = q21Var2;
            }
            q21Var.f30220p0 = false;
            bnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + bnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit();
                edit.putInt("dialog_show_translate_count" + bnVar.a(), i11 - 1).apply();
                bnVar.zd(true);
            }
        }
    }

    public static void s1(bn bnVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ah ahVar;
        String str;
        SparseArray[] sparseArrayArr = bnVar.f46121o6;
        if (bnVar.getParentActivity() != null && bnVar.f46077ka == 0.0f) {
            if (bnVar.f46018g4 == 3) {
                Bundle bundle = new Bundle();
                long e92 = bnVar.e9();
                if (e92 >= 0) {
                    bundle.putLong("user_id", e92);
                } else {
                    bundle.putLong("chat_id", -e92);
                }
                bnVar.presentFragment(new bn(bundle));
                return;
            }
            boolean z12 = false;
            if (bnVar.Y9()) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < sparseArrayArr[0].size(); i7++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i7)));
                }
                bnVar.cc(true, true);
                byte[] bArr = bnVar.f46071k4;
                String str2 = bnVar.f46083l4;
                me meVar = new me(bnVar, 2);
                int i10 = qy0.f51376w1;
                int currentAccount = bnVar.getCurrentAccount();
                Activity parentActivity = bnVar.getParentActivity();
                long a10 = bnVar.a();
                if (parentActivity != null) {
                    qy0.K0(currentAccount, parentActivity, a10, false, false, arrayList, org.telegram.ui.Components.lc.b0(bnVar), bnVar.getResourceProvider(), bArr, str2, meVar);
                }
            } else if (bnVar.f46018g4 == 2) {
                bnVar.finishFragment();
                ll llVar = bnVar.f46112n9;
                if (bnVar.E0.getTag() == null) {
                    z12 = true;
                }
                llVar.V(true, z12);
            } else {
                TLRPC.User user = bnVar.f46001f;
                if (user != null && user.f28554id == 489000) {
                    bnVar.Ic(true);
                } else if (user != null && bnVar.f46103n) {
                    if (user.bot) {
                        String str3 = bnVar.f46227w8;
                        bnVar.f46227w8 = null;
                        bnVar.getMessagesController().r5(new ge(bnVar, str3, 3), bnVar.f46001f.f28554id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                    String M0 = org.telegram.messenger.gd.M0(2131754063, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.U = M0;
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new ee(bnVar, 8));
                    u1Var.S = org.telegram.messenger.gd.M0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    bnVar.showDialog(u1Var);
                } else if (org.telegram.messenger.o10.A(user)) {
                    bnVar.Ic(true);
                } else {
                    TLRPC.User user2 = bnVar.f46001f;
                    if (user2 != null && user2.bot && (str = bnVar.f46227w8) != null) {
                        if (str.length() != 0) {
                            bnVar.getMessagesController().K4(bnVar.f46227w8, bnVar.f46001f);
                        } else {
                            bnVar.getSendMessagesHelper().r0(org.telegram.messenger.xy.b("/start", bnVar.f46085l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        bnVar.f46227w8 = null;
                        bnVar.Pc(false);
                        return;
                    }
                    if (org.telegram.messenger.v3.T(bnVar.f45987e)) {
                        TLRPC.Chat chat = bnVar.f45987e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.v3.r0(chat)) {
                                if (bnVar.f45987e.join_request) {
                                    bnVar.cc(true, true);
                                    org.telegram.messenger.mp.u1(bnVar.currentAccount).m(bnVar.f45987e.f28405id, org.telegram.messenger.j10.i(bnVar.currentAccount).f(), 0, null, null, true, new zd(bnVar, 19), new oi.e0(11, bnVar, context), null);
                                    return;
                                }
                                zd zdVar = bnVar.f45980d6;
                                if (zdVar != null) {
                                    org.telegram.messenger.g0.r(zdVar);
                                    bnVar.f45980d6 = null;
                                }
                                bnVar.cc(true, true);
                                bnVar.getMessagesController().n(bnVar.f45987e.f28405id, bnVar.getUserConfig().f(), null, bnVar, null);
                                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.K4, new Object[0]);
                                ai.l0 l0Var = bnVar.Z1;
                                if (l0Var != null && (ahVar = bnVar.f45948b1) != null && ahVar.e(l0Var) && bnVar.f45963c2.getVisibility() != 8 && bnVar.f45963c2.getTag(2131296585) != null) {
                                    org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit().putInt("dialog_bar_vis3" + bnVar.f46085l6, 3).commit();
                                    bnVar.getNotificationCenter().k(org.telegram.messenger.ks.Q0, Long.valueOf(bnVar.f46085l6));
                                    return;
                                }
                                return;
                            }
                            bnVar.Ic(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = bnVar.f46163r8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = bnVar.f45987e;
                    TLRPC.User user3 = bnVar.f46001f;
                    if (bnVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.b5.r(bnVar, false, chat2, user3, z11, true, false, z10, new ee(bnVar, 9));
                }
            }
        }
    }

    public static void s2(bn bnVar) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj primaryMessageObject;
        TLRPC.Message message;
        if (bnVar.O1 != null) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = null;
        for (int childCount = bnVar.A0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = bnVar.A0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (primaryMessageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f23968k) != null && message.via_business_bot_id != 0) {
                q1Var2 = q1Var;
            }
        }
        bnVar.bc(q1Var2);
    }

    public static void t0(bn bnVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (bnVar.getParentActivity() != null) {
            TLRPC.Chat chat = bnVar.f45987e;
            if (chat != null) {
                if (org.telegram.messenger.v3.j(chat) && !bnVar.f45987e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (bnVar.h == null && (userFull = bnVar.f46176s8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String M0 = org.telegram.messenger.gd.M0(2131743605, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131743606, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131743607, null), new ee(bnVar, 21));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                bnVar.showDialog(u1Var);
            } else if (!bnVar.V4.isEmpty()) {
                org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit().putInt("pin_" + bnVar.f46085l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
                bnVar.gd(0, true);
            }
        }
    }

    public static void t1(bn bnVar, String str) {
        if (org.telegram.messenger.mp.u1(bnVar.currentAccount).R2(true)) {
            vf.c.n(bnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.b5.l0(bnVar.getParentActivity(), bnVar.Ba, str, true, new qf(bnVar, str, 1));
        }
    }

    public static bn ta(int i7, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i7);
        return new bn(bundle);
    }

    public static org.telegram.ui.Components.no u0(bn bnVar, Context context) {
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, bnVar.currentAccount, bnVar.f46054j0.getPopupLayout().getSwipeBack(), false, new yi(bnVar), bnVar.getResourceProvider());
        bnVar.f46233x1 = poVar;
        poVar.e(bnVar.f46085l6, bnVar.d(), null);
        return bnVar.f46233x1.f38508f;
    }

    public static void u1(bn bnVar, long j3, long j10, Long l10, Boolean bool) {
        boolean z10 = false;
        di.x8 y10 = di.x8.y(bnVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y10.g0(j3, j10, z10, true);
    }

    public static bn ua(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new bn(bundle);
    }

    public static void v0(bn bnVar) {
        if (org.telegram.messenger.mp.u1(bnVar.currentAccount).u2(bnVar.f46085l6, bnVar.d(), null)) {
            bnVar.yd(true);
            org.telegram.messenger.g0.h3(new zd(bnVar, 8), 150L);
            bnVar.f46054j0.V(null, null);
            if (bnVar.getParentActivity() != null) {
                org.telegram.ui.Components.lc.z(bnVar, 4, 0, bnVar.Ba).j();
                return;
            }
            return;
        }
        View view = bnVar.f46181t1.f29854j;
        if (view instanceof org.telegram.ui.ActionBar.z0) {
            ((org.telegram.ui.ActionBar.z0) view).b();
        }
    }

    public static void v1(bn bnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = bnVar.X1.getAdapter().f17533x0;
        int i7 = bnVar.currentAccount;
        TLRPC.User user2 = bnVar.f46001f;
        if (user2 != null) {
            j3 = user2.f28554id;
        } else {
            j3 = bnVar.f45987e.f28405id;
        }
        ki.f4 b10 = ki.f4.b(i7, j3, user.f28554id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, bnVar.j9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
            return;
        }
        String H1 = org.telegram.messenger.mp.u1(bnVar.currentAccount).H1(user.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            org.telegram.messenger.mp.u1(bnVar.currentAccount);
            org.telegram.messenger.mp.d5(H1, bnVar);
            return;
        }
        ki.t2 t2Var = new ki.t2(bnVar.getParentActivity(), bnVar.getResourceProvider());
        t2Var.B(false);
        t2Var.C0 = true;
        t2Var.m0 = bnVar.getParentActivity();
        t2Var.x(bnVar, b10);
        t2Var.show();
    }

    public static void w0(bn bnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.h1 h1Var, View view2) {
        int i7;
        int i10;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            i7 = 0;
        } else {
            i7 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        }
        if (i7 > 0 && !zArr[0] && h1Var == bnVar.f46023g9 && h1Var.isShowing() && view2.isLaidOut()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = (view2.getHeight() + iArr[1]) - (view.getHeight() - i7);
            int i11 = org.telegram.messenger.g0.f24115m;
            int i12 = bnVar.f46062j9;
            if (height > 0) {
                i10 = org.telegram.messenger.g0.L(8.0f) + height;
            } else {
                i10 = 0;
            }
            int max = Math.max(i11, i12 - i10);
            if (max != bnVar.f46062j9) {
                zArr[0] = true;
                int i13 = bnVar.f46049i9;
                bnVar.f46062j9 = max;
                h1Var.update(i13, max, -1, -1);
            }
        }
    }

    public static void w1(bn bnVar, int i7) {
        if (bnVar.f46018g4 == 7) {
            Object E = bnVar.f45951b4.E(i7);
            if (i7 == 0) {
                bnVar.f45951b4.getClass();
            }
            if (E instanceof org.telegram.messenger.fj) {
                bnVar.Ia((org.telegram.messenger.fj) E);
            }
        } else if (bnVar.F3 != null) {
            if (i7 >= 0 && i7 < bnVar.getMediaDataController().Z0.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.getMediaDataController().Z0.get(i7);
                bnVar.G3 = false;
                bnVar.Rb(false, true, false);
                org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
                if (i7 >= 0) {
                    if (i7 < mediaDataController.Z0.size()) {
                        mediaDataController.f26614f1 = i7;
                    }
                } else {
                    mediaDataController.getClass();
                }
                bnVar.nd(bnVar.getMediaDataController().e0(), bnVar.getMediaDataController().f26614f1, bnVar.getMediaDataController().l0());
                org.telegram.messenger.g0.g3(new he(bnVar, fjVar, 2));
            }
        } else {
            org.telegram.messenger.ri mediaDataController2 = bnVar.getMediaDataController();
            int i10 = bnVar.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                mediaDataController2.f26614f1 = i7;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.ks.H0, Integer.valueOf(i10), Integer.valueOf(fjVar2.e1()), Integer.valueOf(mediaDataController2.e0()), Long.valueOf(org.telegram.messenger.fj.B0(fjVar2.f23968k)), Integer.valueOf(mediaDataController2.f26614f1), Integer.valueOf(mediaDataController2.l0()), Boolean.TRUE);
            }
            bnVar.sc(false);
        }
    }

    public static void x0(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.ri.d0(bnVar.currentAccount).H0(false, true, null);
            bnVar.za(user.f28554id, bnVar.C8, false);
        }
    }

    public static void x1(bn bnVar, Long l10, Boolean bool) {
        int i7;
        int i10;
        if (l10.longValue() != bnVar.d()) {
            bnVar.Ab = SystemClock.uptimeMillis();
            bnVar.H7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                bnVar.vb(bnVar.d());
            } else if (bnVar.d() == 0) {
                bnVar.vb(l10.longValue());
            } else {
                bnVar.F7 = -1;
            }
            bnVar.getConnectionsManager().cancelRequestsForGuid(bnVar.classGuid);
            bnVar.getMessagesStorage().k(bnVar.classGuid);
            bnVar.classGuid = ConnectionsManager.generateClassGuid();
            bnVar.sb();
            bnVar.f46237x5 = null;
            bnVar.M7 = 0;
            bnVar.C7 = false;
            bnVar.D7 = true;
            bnVar.Y7 = true;
            bnVar.Z7 = 0;
            bnVar.f45955b8 = null;
            bnVar.f46263z6.clear();
            bnVar.f46173s4 = l10.longValue();
            TLRPC.TL_forumTopic f10 = bnVar.getMessagesController().f25771t7.f(-bnVar.a(), l10.longValue());
            if (l10.longValue() != 0 && f10 != null) {
                int i11 = f10.read_inbox_max_id;
                bnVar.A4 = i11;
                bnVar.B4 = f10.read_outbox_max_id;
                bnVar.C4 = Math.max(1, i11);
                bnVar.getMessagesController().f25771t7.k(bnVar.f46085l6, org.telegram.messenger.n5.o(f10.from_id));
            } else {
                bnVar.f46159r4 = null;
                bnVar.f46132p4 = null;
                bnVar.f46096m4 = null;
                bnVar.F5 = null;
                bnVar.A4 = 0;
                bnVar.B4 = 0;
                bnVar.C4 = 0;
                bnVar.f46173s4 = 0L;
                bnVar.f46184t4 = 0;
                bnVar.f46196u4 = null;
                bnVar.f46236x4 = false;
                bnVar.f46209v4 = false;
            }
            bnVar.L8();
            bnVar.wd(true);
            bnVar.f46129p1.n(true);
            bnVar.f46129p1.b();
            bnVar.f46016g2.setCurrentTopic(l10.longValue());
            bnVar.zd(true);
            bnVar.Pc(true);
            bnVar.getMessagesController().V4(-bnVar.a(), bnVar.d());
            bnVar.F9(true);
            bnVar.D9(true);
            rj rjVar = bnVar.f45932a0;
            if (rjVar != null) {
                rjVar.G0(false);
                bnVar.f45932a0.j2(true);
            }
            bnVar.N6(true, true);
            if (f10 != null) {
                i7 = f10.unread_reactions_count;
            } else {
                i7 = 0;
            }
            bnVar.A1 = i7;
            if (f10 != null) {
                i10 = f10.unread_poll_votes_count;
            } else {
                i10 = 0;
            }
            bnVar.B1 = i10;
            bnVar.jd(false);
            bnVar.id(false);
            bnVar.Ad();
            tm tmVar = bnVar.Vc;
            if (tmVar != null && bnVar.actionBar.f29088o0) {
                tmVar.k(null);
            }
        }
    }

    public static void y0(long j3, bn bnVar) {
        if (di.x8.y(bnVar.currentAccount, false).p().amount < j3) {
            new di.fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), j3, 13, org.telegram.messenger.n5.t(bnVar.a()), new af(bnVar, 21), bnVar.a()).show();
        } else {
            new di.gb(bnVar.getParentActivity(), bnVar.resourceProvider).show();
        }
    }

    public static void y1(bn bnVar, long j3, boolean z10, boolean z11) {
        if (!org.telegram.messenger.g0.E1(bnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.ny0.c(bnVar.getParentActivity(), bnVar.currentAccount, -j3, bnVar.getUserConfig().f(), null, z10, z11, bnVar.getResourceProvider());
    }

    public static void z0(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        String str3;
        if (bnVar.f46210v5 != null && i7 < arrayList.size() && bnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.fj fjVar = bnVar.f46210v5;
            if (fjVar != null) {
                TLRPC.Message message = fjVar.f23968k;
            }
            org.telegram.ui.Components.y21.V0(bnVar.getParentActivity(), bnVar, inputPeer, iArr[0], bnVar.f46210v5.M2, strArr[0], str3, charSequence, z10, efVar, new af(bnVar, 15)).f30220p0 = false;
            bnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + bnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(bnVar.currentAccount).f25660g7.edit();
                edit.putInt("dialog_show_translate_count" + bnVar.a(), i10 - 1).apply();
                bnVar.zd(true);
            }
        }
    }

    public static void z1(long j3, bn bnVar) {
        bnVar.getMediaDataController().J0(j3, j3, true, bnVar.classGuid, null);
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
        if (this.Aa != null) {
            return;
        }
        int i7 = 0;
        if (this.f46027gd.f57657e >= 1.0f && ((i1Var = this.F1) == null || i1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bi.i3 i3Var = this.f46093m1.M;
        if (!z10) {
            i7 = 4;
        }
        i3Var.setVisibility(i7);
    }

    public final org.telegram.ui.Components.f11 A8() {
        long d;
        boolean z10;
        if (this.f46104n0 == null && getParentActivity() != null && this.f46093m1 != null) {
            org.telegram.ui.Components.f11 f11Var = new org.telegram.ui.Components.f11(getParentActivity(), this.currentAccount, a(), this.Ba, new ek(this));
            this.f46104n0 = f11Var;
            this.f46093m1.addView(f11Var, c8.ma.c(-1.0f, -1));
        }
        org.telegram.ui.Components.f11 f11Var2 = this.f46104n0;
        if (f11Var2 != null) {
            if (Z9()) {
                d = e9();
            } else {
                d = d();
            }
            f11Var2.setCurrentTopic(d);
            org.telegram.ui.Components.f11 f11Var3 = this.f46104n0;
            if (this.f46054j0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            f11Var3.setMenuAvailable(z10);
        }
        return this.f46104n0;
    }

    public final boolean A9() {
        ql qlVar = this.f46201u9;
        if (qlVar != null && qlVar.x()) {
            return true;
        }
        return false;
    }

    public final void Aa() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            rj rjVar = this.f45932a0;
            if (rjVar == null || TextUtils.isEmpty(rjVar.getSlowModeTimer())) {
                rj rjVar2 = this.f45932a0;
                if (rjVar2 != null && rjVar2.h7.f57658f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                U7();
                fi.n2 n2Var = this.Y1;
                if (!z10 && this.f46018g4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                n2Var.P3 = z11;
                n2Var.f39670e2.i0();
                TLRPC.Chat chat = this.f45987e;
                if ((chat == null || this.f46250y5 == null) && !z10 && this.f46018g4 != 9) {
                    if (chat != null && !org.telegram.messenger.v3.N(chat) && this.f45987e.slowmode_enabled) {
                        this.Y1.z1(10, true);
                    } else {
                        this.Y1.z1(-1, true);
                    }
                } else {
                    this.Y1.z1(1, true);
                }
                fi.n2 n2Var2 = this.Y1;
                n2Var2.Q2 = true;
                n2Var2.f39729v3.setVisibility(0);
                n2Var2.O2 = 0;
                n2Var2.A1 = false;
                n2Var2.B1 = false;
                n2Var2.d2 = true;
                n2Var2.E1 = null;
                org.telegram.ui.ActionBar.r0 r0Var = n2Var2.f39683i3;
                if (r0Var != null) {
                    n2Var2.f39680h3.setTranslationY(0.0f);
                    r0Var.setVisibility(8);
                }
                this.Y1.f1();
                this.Y1.b1().setText(this.f45932a0.getFieldText());
                fi.n2 n2Var3 = this.Y1;
                n2Var3.f39719t1 = this.Ba;
                showDialog(n2Var3);
            }
        }
    }

    public final void Ab(boolean z10, zd zdVar) {
        ArrayList arrayList;
        int i7;
        if (this.A0.W1) {
            return;
        }
        this.f45952b5 = 0;
        this.Ub = 0;
        this.f45966c5 = false;
        this.f46124o9.m(0);
        if (this.W6[0] && this.Z7 == 0 && this.M7 == 0) {
            this.f46246y1.d(false);
            if (this.C0.I0() == 0) {
                this.D9 = false;
                dd();
                lb();
                Gd(false);
                return;
            }
            this.D0.T();
            nm nmVar = this.f46064jb;
            nmVar.f50220a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.M6;
                if (i10 >= arrayList.size() || !((org.telegram.messenger.fj) arrayList.get(i10)).r4()) {
                    break;
                }
                i10++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i10) != null) {
                long c12 = ((org.telegram.messenger.fj) arrayList.get(i10)).c1();
                while (c12 != 0 && (i7 = i10 + 1) < arrayList.size() && c12 == ((org.telegram.messenger.fj) arrayList.get(i7)).c1()) {
                    i10 = i7;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 = Math.min(i10, arrayList.size() - 1);
            }
            xj xjVar = this.f46124o9;
            nmVar.f50221b = i10;
            nmVar.d = 0;
            boolean z11 = !z10;
            nmVar.f50222c = z11;
            xjVar.k(i10, 0, z11, true);
            this.D9 = false;
            dd();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.Tb;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        fd(false);
        if (zdVar != null) {
            zdVar.run();
        } else {
            pb();
            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), this.Ba);
            this.Tb = u1Var2;
            u1Var2.setOnCancelListener(this.Ja);
            this.Tb.r(1000L);
        }
        this.f46150q9 = this.f46109n6;
        this.s9 = false;
        this.f46164r9 = 0;
        this.f46188t9 = false;
        ArrayList arrayList2 = this.f46263z6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f46109n6));
        org.telegram.messenger.g0.h3(new af(this, 14), 0L);
    }

    public final void Ac(org.telegram.messenger.kj kjVar) {
        if (this.H5 == null) {
            return;
        }
        new di.r0(getParentActivity(), this.currentAccount, this.f46085l6, kjVar, this, getResourceProvider(), 0, new me(this, 0)).show();
    }

    public final void Ad() {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.p0 p0Var = this.f46219w0;
        if (p0Var != null) {
            TLRPC.Chat chat = this.f45987e;
            if (chat != null && org.telegram.messenger.v3.i(this.currentAccount, chat, this.f46159r4) && (tL_forumTopic = this.f46159r4) != null && !tL_forumTopic.closed) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            p0Var.e(i7);
        }
    }

    public final void B7() {
        float f10;
        org.telegram.ui.Components.ef efVar;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(15.0f) + t9(org.telegram.ui.Components.v11.f40477c) + this.f46218w.d();
        rj rjVar = this.f45932a0;
        if (rjVar != null && (efVar = rjVar.f32643n0) != null) {
            efVar.setTranslationY(-inputBubbleHeight);
        }
        kj kjVar = this.X1;
        if (kjVar != null) {
            if (kjVar.g()) {
                f10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            kjVar.setTranslationY(f10);
        }
    }

    public final void B8() {
        org.telegram.messenger.hj hjVar;
        org.telegram.messenger.kj kjVar = this.f46250y5;
        if (kjVar != null) {
            kc(kjVar);
            return;
        }
        TLRPC.WebPage webPage = this.Y5;
        if (webPage != null) {
            lc(true, webPage, false);
            return;
        }
        rm rmVar = this.D5;
        if (rmVar != null) {
            jc(this.F5, rmVar);
            return;
        }
        org.telegram.messenger.fj fjVar = this.F5;
        if (fjVar != null && fjVar != this.f46096m4) {
            ic(fjVar);
            return;
        }
        org.telegram.messenger.jj jjVar = this.f46237x5;
        if (jjVar != null && (hjVar = jjVar.f24868b) != null) {
            hc(hjVar.f24458e);
            return;
        }
        org.telegram.messenger.fj fjVar2 = this.H5;
        if (fjVar2 != null) {
            gc(true, null, fjVar2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            lc(false, null, true);
        }
    }

    public final void B9() {
        org.telegram.ui.Components.mt editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.y()) {
                this.f46066jd.h(5, false, true);
                this.actionBar.x();
            } else {
                return;
            }
        }
        this.f46174s6 = 0;
        this.f46211v6 = 0;
        this.t6 = 0;
        this.f46238x6 = 0;
        this.f46251y6 = 0;
        this.f46225w6 = 0;
        rj rjVar = this.f45932a0;
        if (rjVar != null && (editField = rjVar.getEditField()) != null) {
            if (this.f45932a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        ql qlVar = this.f46201u9;
        if (qlVar != null) {
            qlVar.f(true);
            SparseArray sparseArray = this.f46201u9.f30885p0;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            }
            sparseArray.clear();
        }
        uk ukVar = this.E9;
        if (ukVar != null) {
            org.telegram.messenger.g0.r(ukVar.I);
            ukVar.a();
        }
        rj rjVar2 = this.f45932a0;
        if (rjVar2 != null) {
            rjVar2.f32549b0 = false;
        }
        this.F9 = false;
        if (this.Bb != null) {
            J9();
        }
    }

    public final void Ba() {
        ns.p().T = null;
        if (getParentActivity() == null) {
            return;
        }
        U7();
        this.Y1.f39670e2.i0();
        this.Y1.z1(1, false);
        fi.n2 n2Var = this.Y1;
        n2Var.S3 = true;
        n2Var.X0(null);
        this.Y1.f1();
        fi.n2 n2Var2 = this.Y1;
        n2Var2.f39719t1 = this.Ba;
        if (this.visibleDialog != null) {
            n2Var2.show();
        } else {
            showDialog(n2Var2);
        }
    }

    public final void Bb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Bc(org.telegram.messenger.fj fjVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().G2(org.telegram.messenger.fj.B0(fjVar.f23968k))) {
            TLRPC.Message message = fjVar.f23968k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = fjVar.B2;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = fjVar.v;
                    if (fjVar.B2.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = fjVar.f24026z;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && org.telegram.messenger.bz.J <= 2 && !this.F9 && this.G9 <= this.f45932a0.getTop() - org.telegram.messenger.g0.L(60.0f)) {
                    this.F9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    int i7 = org.telegram.messenger.bz.J + 1;
                    org.telegram.messenger.bz.J = i7;
                    edit.putInt("textSelectionHintShows", i7);
                    edit.apply();
                    if (this.E9 == null) {
                        uk ukVar = new uk(getParentActivity(), this.Ba, this);
                        this.E9 = ukVar;
                        this.f46093m1.addView(ukVar, c8.ma.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.E9.c();
                }
            }
        }
    }

    public final void Bd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        vi viVar = this.f46129p1;
        if (viVar != null && (tL_forumTopic = this.f46159r4) != null) {
            viVar.setTitle(tL_forumTopic.title);
        }
        Cd();
    }

    public final void C7() {
        float d;
        if (this.A0 != null) {
            if (this.mb && this.Aa == null) {
                d = org.telegram.messenger.g0.f24116n;
            } else {
                d = this.f46218w.d() + t9(org.telegram.ui.Components.v11.f40477c) + org.telegram.messenger.g0.L(16.0f) + this.Ya + this.f45945ad;
            }
            int i7 = (int) this.P9;
            org.telegram.ui.Components.z11 z11Var = this.f46016g2;
            if (z11Var != null) {
                z11Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f46257z0;
            boolean z10 = this.A0.W1;
            RecyclerView recyclerView = gVar.f17787a;
            int i10 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i7 || paddingBottom != i10) {
                int i11 = paddingTop - i7;
                if (!z10 && i11 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i11 >= 0 || canScrollVertically) && (i11 <= 0 || canScrollVertically2)) {
                        org.telegram.messenger.g0.J(recyclerView, new ai.w0(gVar, i11, 14));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
            }
            jh.e eVar = this.f45965c4;
            if (eVar != null) {
                RectF rectF = eVar.f17766b;
                rectF.set(t9(org.telegram.ui.Components.v11.f40476b), i7 - this.I, 0.0f, d - this.Ya);
                eVar.f17767c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void C9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(this).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
            getMessagesController().p0(true);
            ib(this.f46210v5);
            kb(this.f46210v5);
            return;
        }
        showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) this, 3, true));
    }

    public final void Ca(final CharacterStyle characterStyle, final String str, boolean z10, final org.telegram.ui.Cells.q1 q1Var, final org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        if (z10) {
            int i7 = -1;
            if (str.startsWith("@")) {
                if (q1Var != null) {
                    q1Var.h3(-1);
                }
                String substring = str.substring(1);
                gi na2 = na(q1Var, characterStyle);
                TLObject h22 = getMessagesController().h2(substring);
                ne neVar = new ne(this, na2, q1Var, substring, characterStyle);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                na2.f59374b = new re(this, getConnectionsManager().sendRequest(checkusername, new di.m7(this, h22, neVar, substring, na2, 4)), 5);
                na2.d();
                return;
            } else if (characterStyle == null) {
                org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.i6) this.Ba, false);
                x2Var.O();
                if (str.startsWith("video?")) {
                    i7 = Utilities.z(str).intValue();
                }
                final int i10 = i7;
                if (i10 >= 0) {
                    x2Var.P = org.telegram.messenger.g0.g0(i10, false, false);
                    x2Var.Q = false;
                } else {
                    x2Var.P = vf.c.d(str, true);
                    x2Var.Q = false;
                    x2Var.R = true;
                }
                CharSequence[] charSequenceArr = (W9() || !(fjVar == null || (message = fjVar.f23968k) == null || !message.noforwards)) ? new CharSequence[]{org.telegram.messenger.gd.M0(2131747624, null)} : new CharSequence[]{org.telegram.messenger.gd.M0(2131747624, null), org.telegram.messenger.gd.M0(2131751756, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        bn.F0(bn.this, str, characterStyle, fjVar, q1Var, i10, i11);
                    }
                };
                x2Var.M = charSequenceArr;
                x2Var.L = onClickListener;
                x2Var.I0 = new q5(q1Var, 3);
                showDialog(x2Var);
                return;
            } else {
                if (q1Var != null) {
                    q1Var.h3(-1);
                }
                k8(q1Var, fjVar, characterStyle, str);
                return;
            }
        }
        ma(fjVar, false, false);
        String c10 = vf.c.c(str);
        if (c10 != null) {
            String lowerCase = c10.toLowerCase();
            if (!org.telegram.messenger.v3.O(lowerCase, this.f45987e) && !org.telegram.messenger.o10.s(lowerCase, this.f46001f)) {
                if (str.startsWith("@")) {
                    getMessagesController().F3(lowerCase, this, 0, na(q1Var, characterStyle));
                    return;
                } else {
                    Za(0, str, characterStyle, q1Var, false);
                    return;
                }
            }
            vi viVar = this.f46129p1;
            if (viVar != null) {
                viVar.e(false, false);
            } else {
                Xb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Za(0, str, characterStyle, q1Var, false);
        } else {
            int i11 = this.f46018g4;
            if (i11 != 1 && i11 != 2 && i11 != 7) {
                if (str.contains("@")) {
                    presentFragment(new org.telegram.ui.Components.c30(str, this.resourceProvider));
                    return;
                } else {
                    Ga(str, false);
                    return;
                }
            }
            this.f46112n9.x0(str);
            if (this.f46018g4 != 7) {
                finishFragment();
            }
        }
    }

    public final void Cb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Cb(java.lang.CharSequence, boolean):void");
    }

    public final void Cc(boolean z10, boolean z11) {
        rj rjVar;
        int i7;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.H2 != null) && this.f46018g4 == 0 && (rjVar = this.f45932a0) != null && rjVar.getAudioVideoButtonContainer() != null && this.f45932a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.H2 == null) {
                    int indexOfChild = this.f46093m1.indexOfChild(this.U);
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
                if (this.f45932a0.S2) {
                    hi.m3 m3Var = this.H2;
                    if (z11) {
                        i7 = 2131749098;
                    } else {
                        i7 = 2131749100;
                    }
                    m3Var.v(org.telegram.messenger.gd.M0(i7, null));
                } else {
                    this.H2.v(org.telegram.messenger.gd.M0(2131749099, null));
                }
                this.H2.z(this.f45932a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Cd() {
        vi viVar;
        vi viVar2;
        if (org.telegram.messenger.o10.v(this.f46001f) && (viVar2 = this.f46129p1) != null) {
            viVar2.getAvatarImageView().setVisibility(0);
            this.f46129p1.b();
        } else if (this.f46159r4 != null && (viVar = this.f46129p1) != null) {
            viVar.getAvatarImageView().setVisibility(0);
            qg.c.q(this.f46129p1.getAvatarImageView(), this.f46159r4, true, true, this.Ba);
        }
    }

    @Override
    public final void D(float f10, int i7) {
        if (i7 == 2 && f10 == 0.0f) {
            sh.c cVar = this.f46079kd;
            if (cVar != null) {
                this.f46093m1.removeView(cVar);
                this.f46079kd = null;
            }
            rj rjVar = this.f45932a0;
            if (rjVar != null) {
                rjVar.e1();
            }
        }
    }

    public final void D7() {
        FrameLayout frameLayout = this.f46003f1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + this.f46218w.c() + org.telegram.messenger.g0.L(9.0f)) * (-0.5f));
        }
    }

    public final void D8(CharSequence charSequence, ArrayList arrayList) {
        if (this.H5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.fj fjVar = this.H5;
                fjVar.f24024y1 = charSequence;
                fjVar.f24028z1 = arrayList;
            } else if (this.H5.F3()) {
                org.telegram.messenger.fj fjVar2 = this.H5;
                fjVar2.f24024y1 = "";
                fjVar2.f24028z1 = new ArrayList();
            } else {
                rj rjVar = this.f45932a0;
                if (rjVar != null) {
                    this.H5.f24024y1 = rjVar.getFieldText();
                    org.telegram.messenger.fj fjVar3 = this.H5;
                    if (fjVar3.f24024y1 == null && !TextUtils.isEmpty(fjVar3.f23968k.message)) {
                        this.H5.f24024y1 = "";
                    }
                }
            }
        }
    }

    public final void D9(boolean z10) {
        fc(false, null, null, null, true, 0, null, false, 0L, z10);
    }

    public final void Da(long j3, final org.telegram.messenger.fj fjVar, int i7, final long j10, final int i10, final int i11, final org.telegram.messenger.fj fjVar2) {
        int i12 = i7;
        final TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.mp.n1(O0);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("getDiscussionMessage chat = " + O0.f28405id + " msg_id = " + i12);
        }
        this.Pc = 0;
        this.Qc = false;
        this.Sc = null;
        this.Tc = null;
        bj bjVar = this.A0;
        if (bjVar != null) {
            bjVar.g1();
        }
        if (this.Oc != -1) {
            getConnectionsManager().cancelRequest(this.Oc, false);
        }
        if (this.Nc != -1) {
            getConnectionsManager().cancelRequest(this.Nc, false);
        }
        if (fjVar2 != null) {
            i12 = fjVar2.e1();
        }
        this.Pc = i12;
        this.Qc = false;
        this.Rc = System.currentTimeMillis();
        bj bjVar2 = this.A0;
        if (bjVar2 != null) {
            bjVar2.g1();
        }
        final int i13 = this.Lc + 1;
        this.Lc = i13;
        this.Nc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final bn bnVar = bn.this;
                final int i14 = i13;
                final int i15 = i10;
                final long j11 = j10;
                final int i16 = i11;
                final org.telegram.messenger.fj fjVar3 = fjVar2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = O0;
                final org.telegram.messenger.fj fjVar4 = fjVar;
                org.telegram.messenger.g0.g3(new k9(21, bnVar, new Runnable(i14, i15, j11, tLObject, i16, fjVar3, tL_messages_getDiscussionMessage2, chat, fjVar4) {
                    public final int f48720b;
                    public final int f48721c;
                    public final TLObject d;
                    public final int f48722e;
                    public final org.telegram.messenger.fj f48723f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f48724n;
                    public final org.telegram.messenger.fj f48725r;

                    {
                        this.d = tLObject;
                        this.f48722e = i16;
                        this.f48723f = fjVar3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f48724n = chat;
                        this.f48725r = fjVar4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final bn bnVar2 = bn.this;
                        if (this.f48720b != bnVar2.Lc) {
                            return;
                        }
                        bnVar2.Nc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            bnVar2.Sc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            bnVar2.getMessagesController().f4(bnVar2.Sc.users, false);
                            bnVar2.getMessagesController().Z3(bnVar2.Sc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = bnVar2.Sc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i18 = 0; i18 < bnVar2.Sc.messages.size(); i18++) {
                                TLRPC.Message message = bnVar2.Sc.messages.get(i18);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i19 = this.f48721c;
                        final int i20 = this.f48722e;
                        final org.telegram.messenger.fj fjVar5 = this.f48723f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.f48724n;
                        final org.telegram.messenger.fj fjVar6 = this.f48725r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = bnVar2.getMessagesController().o1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f28426id;
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
                            final int i21 = bnVar2.Mc + 1;
                            bnVar2.Mc = i21;
                            bnVar2.Oc = bnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    org.telegram.messenger.g0.g3(new yg(bn.this, i21, tLObject3, tL_error2, i19, fjVar5, tL_messages_getDiscussionMessage3, chat2, i20, fjVar6, 0));
                                }
                            });
                            return;
                        }
                        bnVar2.ab(bnVar2.Sc, bnVar2.Tc, i19, fjVar5, tL_messages_getDiscussionMessage3, chat2, i20, fjVar6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Nc, this.classGuid);
    }

    public final void Db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.D3 = user;
        this.E3 = chat;
        if (this.f46067k0 != null && this.X1 != null) {
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
                    String M0 = org.telegram.messenger.gd.M0(2131745571, null);
                    SpannableString spannableString = new SpannableString(a8.p0.E(M0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.B8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                    this.f46067k0.setSearchFieldCaption(spannableString);
                    this.X1.getAdapter().U(null, 0, null, false, true);
                    this.f46067k0.setSearchFieldHint(null);
                    this.f46067k0.o();
                    org.telegram.messenger.ri mediaDataController = getMediaDataController();
                    this.I3 = "";
                    mediaDataController.c2("", this.f46085l6, this.f45981d7, this.classGuid, 0, this.f46173s4, false, this.D3, this.E3, true, this.F3);
                }
            }
        }
    }

    public final boolean Dc(org.telegram.messenger.fj fjVar) {
        if (this.f46018g4 == 0 && fjVar != null && fjVar.b5()) {
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
        if (ga() && !this.f46155r0 && ((kVar = this.actionBar) == null || !kVar.y())) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        r0Var.setVisibility(i7);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f46054j0;
        if (r0Var2 != null && (r0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f46054j0.getLayoutParams();
            if (!z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            }
            if (layoutParams.width != i10) {
                layoutParams.width = i10;
                this.f46054j0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f46054j0;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            r0Var3.setAlpha(f10);
            this.f46054j0.setClickable(!z10);
        }
        ud();
    }

    @Override
    public final org.telegram.ui.Components.au0 E() {
        return this.f46093m1;
    }

    public final hi.m3 E6(float f10, int i7, int i10, boolean z10) {
        long j3;
        hi.m3 m3Var = new hi.m3(getParentActivity(), i7);
        m3Var.r(true);
        m3Var.h = org.telegram.messenger.g0.L(f10);
        if (z10) {
            j3 = -1;
        } else {
            j3 = 2300;
        }
        m3Var.d = j3;
        m3Var.U = true;
        m3Var.f14998e = true;
        m3Var.k(z10);
        m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        m3Var.f15019v0 = org.telegram.messenger.g0.L(4.0f);
        m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m3Var.l(this.L);
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, 150, 55);
        if (i10 >= 0) {
            this.f46093m1.addView(m3Var, i10, e10);
            return m3Var;
        }
        this.f46093m1.addView(m3Var, e10);
        return m3Var;
    }

    public final void E7() {
        int i7;
        float f10 = this.f46053id.f57657e;
        org.telegram.ui.Components.e30 e30Var = this.I1;
        int i10 = 8;
        if (e30Var != null) {
            e30Var.setAlpha(f10);
            org.telegram.ui.Components.e30 e30Var2 = this.I1;
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            e30Var2.setVisibility(i7);
        }
        di.b1 b1Var = this.f45936a4;
        if (b1Var != null) {
            float f11 = 1.0f - f10;
            b1Var.setAlpha(f11);
            di.b1 b1Var2 = this.f45936a4;
            if (f11 > 0.0f) {
                i10 = 0;
            }
            b1Var2.setVisibility(i10);
        }
    }

    public final void E8() {
        CharSequence charSequence;
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            charSequence = rjVar.getFieldText();
        } else {
            charSequence = null;
        }
        D8(charSequence, null);
    }

    public final void E9(boolean z10) {
        if (this.f46095m3.getTag() != null && !this.f46172s3) {
            if (!this.f46248y3 || this.f46195u3) {
                this.f46095m3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f46208v3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f46208v3.playTogether(ObjectAnimator.ofFloat(this.f46095m3, View.ALPHA, 0.0f));
                    this.f46208v3.addListener(new ei(this, 5));
                    this.f46208v3.setStartDelay(this.f46131p3);
                    this.f46208v3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f46208v3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f46208v3 = null;
                    }
                    this.f46095m3.setAlpha(0.0f);
                }
                this.f46131p3 = 500;
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
                    SparseArray[] sparseArrayArr = this.f46121o6;
                    if (i11 >= sparseArrayArr[i10].size()) {
                        break;
                    }
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i10].valueAt(i11);
                    if (fjVar.D4()) {
                        i7 = 3;
                    } else if (fjVar.T3()) {
                        if (fjVar.Z3()) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                        if (i7 == 2) {
                            break;
                        }
                    } else if (fjVar.z3()) {
                        z11 = true;
                    }
                    i11++;
                }
                if (i7 == 2) {
                    break;
                }
            }
            ch.s sVar = this.f46215va;
            if (sVar != null && sVar.d()) {
                this.f46215va.setHiddenByScroll(true);
            }
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putInt("messagesCount", this.f46198u6);
            l10.putInt("hasPoll", i7);
            l10.putBoolean("hasInvoice", z11);
            l10.putBoolean("canSelectTopics", true);
            cx cxVar = new cx(l10);
            cxVar.E2 = this;
            presentFragment(cxVar);
            return;
        }
        if (W9()) {
            if (a() > 0) {
                M0 = org.telegram.messenger.gd.M0(2131750518, null);
            } else if (org.telegram.messenger.v3.T(this.f45987e) && !this.f45987e.megagroup) {
                M0 = org.telegram.messenger.gd.M0(2131750520, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131750519, null);
            }
        } else {
            M0 = org.telegram.messenger.gd.M0(2131750521, null);
        }
        if (z10) {
            if (this.f46259z2 == null) {
                int indexOfChild = this.f46093m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    this.f46259z2 = E6(310.0f, 1, indexOfChild + 1, false);
                } else {
                    return;
                }
            }
            this.f46259z2.v(M0);
            this.f46259z2.z(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.A2 == null) {
            int indexOfChild2 = this.f46093m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            this.A2 = E6(310.0f, 3, indexOfChild2 + 1, false);
        }
        this.A2.v(M0);
        this.A2.z(this.f45989e1.getForwardButton(), true);
    }

    public final void Eb(View view, org.telegram.messenger.fj fjVar, org.telegram.ui.Components.vi0 vi0Var, View view2, float f10, float f11, ch.p0 p0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        ch.p0 p0Var2;
        String str;
        TLRPC.Document e10;
        org.telegram.messenger.fj b10;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        di.k6 k6Var;
        int[] iArr;
        int[] iArr2;
        int i7;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z15;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && fjVar != null) {
            if (getMessagesController().A2()) {
                b.b(this.currentAccount);
                return;
            }
            int i10 = 2;
            if (p0Var != null && p0Var.f5474a) {
                P7(true);
                if (view == null) {
                    zVar = J8(fjVar.e1(), true);
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
                    TLRPC.Message message2 = fjVar.f23968k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j3 = -di.q8.b(fjVar).f9599a;
                    TLRPC.ChatFull P0 = getMessagesController().P0(j3);
                    if (P0 != null && !P0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
                        org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(this);
                        if (O0 != null) {
                            str2 = O0.title;
                        }
                        b02.Q(2131624227, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744797, str2))).k(true);
                        return;
                    }
                    di.v8 v8Var = di.x8.y(this.currentAccount, false).B;
                    if (v8Var != null) {
                        v8Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i11 = this.currentAccount;
                    long j10 = this.f46085l6;
                    if (P0 != null && !P0.paid_reactions_available) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    di.mc mcVar = new di.mc(parentActivity, i11, j10, this, fjVar, arrayList, z15, false, 0L, this.Ba);
                    fjVar.e1();
                    mcVar.Q1 = this;
                    mcVar.R1 = zVar;
                    mcVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -di.q8.b(fjVar).f9599a;
                TLRPC.ChatFull P02 = getMessagesController().P0(j11);
                if (P02 != null && !P02.paid_reactions_available) {
                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(j11));
                    org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(this);
                    if (O02 != null) {
                        str2 = O02.title;
                    }
                    b03.Q(2131624227, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744797, str2))).k(true);
                    return;
                }
                di.v8 b04 = di.x8.y(this.currentAccount, false).b0(fjVar, this, 1L, true, true, null);
                if (b04 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Xc == null) {
                        this.Xc = new di.k6(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        k6Var = null;
                    } else {
                        if (this.Xc.getParent() != layoutContainer) {
                            org.telegram.messenger.g0.E2(this.Xc);
                            layoutContainer.addView(this.Xc, c8.ma.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Xc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Xc.bringToFront();
                        }
                        k6Var = this.Xc;
                    }
                    k6Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    b04.f9946o = k6Var;
                    k6Var.J = false;
                    k6Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    k6Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f10;
                    float f13 = (iArr[1] - iArr2[1]) + f11;
                    if (zVar instanceof org.telegram.ui.Cells.q1) {
                        i7 = ((org.telegram.ui.Cells.q1) zVar).W;
                    } else {
                        i7 = 0;
                    }
                    k6Var.d(f12, f13 + i7, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = fjVar.f23968k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new ug.z0((org.telegram.ui.ActionBar.h2) this, 24, true).show();
            } else {
                if (fjVar.w2() && p0Var != null) {
                    for (int i12 = 0; i12 < fjVar.f23968k.reactions.results.size(); i12++) {
                        TLRPC.ReactionCount reactionCount = fjVar.f23968k.reactions.results.get(i12);
                        if (p0Var.f(reactionCount.reaction)) {
                            z14 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z14 = false;
                if (!z14 && (chat = this.f45987e) != null && !org.telegram.messenger.v3.V(chat) && !org.telegram.messenger.v3.w(26, this.f45987e)) {
                    org.telegram.messenger.f3.n(null, 2131745396, org.telegram.ui.Components.lc.b0(this), 2131624007, 36);
                    return;
                }
                ch.l0.b(false);
                int size = fjVar.y0().size();
                boolean H5 = fjVar.H5(p0Var, z11);
                int e12 = fjVar.e1();
                long c12 = fjVar.c1();
                a0.h hVar = this.P6;
                if (hVar.f(c12) != null && (b10 = ((org.telegram.messenger.aj) hVar.f(fjVar.c1())).b(9)) != null) {
                    e12 = b10.e1();
                }
                int i13 = e12;
                if (H5) {
                    org.telegram.ui.Cells.z J8 = J8(i13, true);
                    if (!org.telegram.messenger.bz.f23210w1 && J8 != null && p0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.bz.C(true);
                        long j12 = p0Var.f5479g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(this.currentAccount).f26635r.get(p0Var.f5478f);
                            if (tL_availableReaction != null) {
                                e10 = tL_availableReaction.center_icon;
                            }
                        } else {
                            e10 = org.telegram.ui.Components.o5.e(this.currentAccount, j12);
                        }
                        if (e10 != null) {
                            org.telegram.ui.Components.gc q10 = org.telegram.ui.Components.lc.b0(this).q(e10, org.telegram.messenger.gd.M0(2131752207, null));
                            q10.f35461j = 5000;
                            q10.j();
                        }
                    }
                    if (!z10) {
                        int i14 = this.currentAccount;
                        if (vi0Var != null) {
                            if (z11) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 1;
                        }
                        ch.l0.d(this, vi0Var, J8, view2, f10, f11, p0Var, i14, i10);
                    }
                }
                if (H5 && p0Var != null && (str = p0Var.f5478f) != null) {
                    org.telegram.messenger.g0.i2(org.telegram.messenger.gd.a0(null, null, 2131754725, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(fjVar.y0());
                org.telegram.messenger.zy sendMessagesHelper = getSendMessagesHelper();
                if (H5) {
                    p0Var2 = p0Var;
                } else {
                    p0Var2 = null;
                }
                di diVar = new di(this, z13, z10, i13, H5, vi0Var, f10, f11, p0Var, fjVar);
                this.Jc = diVar;
                sendMessagesHelper.s0(fjVar, arrayList2, p0Var2, z11, z12, this, diVar);
                if (z10 || z13) {
                    Yc(fjVar, true);
                    this.Jc.run();
                }
                if (!z13) {
                    org.telegram.messenger.g0.h3(this.Jc, 50L);
                }
            }
        }
    }

    public final void Ec(org.telegram.messenger.fj fjVar, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (fjVar != null && getParentActivity() != null) {
            ch.s sVar = this.f46215va;
            if (sVar != null && sVar.d()) {
                this.f46215va.setHiddenByScroll(true);
            }
            if (this.f46067k0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f29088o0) {
                    kVar.o(true);
                    this.f45932a0.C1();
                }
            }
            TLRPC.Message message = fjVar.f23968k;
            if (message != null && (richMessage = message.rich_message) != null) {
                oi.z1 z1Var = new oi.z1(richMessage);
                z1Var.K = this;
                z1Var.f22537r = fjVar;
                presentFragment(z1Var);
                return;
            }
            this.X1.getAdapter().f17512g0 = false;
            this.f45932a0.setVisibility(0);
            gc(true, null, fjVar, null, null, true, 0, null, false, 0L, null, true);
            Pc(false);
            if (!z10) {
                c7();
            }
            if (z10) {
                this.f46250y5 = org.telegram.messenger.kj.b(fjVar.f23968k.suggested_post);
            }
            this.f45932a0.t1(false, false, true);
            gd(0, true);
            Gd(false);
            if (!z10 && !fjVar.f23997r1 && !org.telegram.messenger.fj.b4(fjVar.f23968k) && this.f46018g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().l1(this.f46085l6);
                tL_messages_getMessageEditData.f28499id = fjVar.e1();
                this.G5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new ce(this, 3));
                return;
            }
            rj rjVar = this.f45932a0;
            org.telegram.ui.Components.re reVar = rjVar.f32686t2;
            if (reVar != null) {
                reVar.setEnabled(true);
                rjVar.f32686t2.g(false);
            }
        }
    }

    public final void Ed() {
        int i7;
        org.telegram.ui.ActionBar.p0 p0Var = this.f46116o0;
        if (p0Var == null) {
            return;
        }
        if (getMessagesController().f25789v7.z(a()) && getMessagesController().f25789v7.t(a())) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        p0Var.e(i7);
    }

    @Override
    public final List F() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.v3.T(this.f45987e)) {
            arrayList.add(new pg.a(org.telegram.messenger.gd.M0(2131751601, null)));
            int i7 = this.f45931a;
            if (i7 != 1) {
                if (i7 != 2) {
                    M0 = org.telegram.messenger.gd.M0(2131751598, null);
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131751599, null);
                }
            } else {
                M0 = org.telegram.messenger.gd.M0(2131751600, null);
            }
            arrayList.add(new pg.a(org.telegram.messenger.gd.a0(null, null, 2131751597, M0), new vf(this, 16)));
            arrayList.add(new pg.a(org.telegram.messenger.gd.M0(2131751596, null), new vf(this, 17)));
        }
        if (this.f46001f == null) {
            arrayList.add(new pg.a(org.telegram.messenger.gd.M0(2131751606, null)));
            arrayList.add(new pg.a(org.telegram.messenger.gd.M0(2131751605, null), 0.0f, 255.0f, new q0("", 1)));
            arrayList.add(new pg.a(org.telegram.messenger.gd.M0(2131751604, null), 1.0f, 10.0f, new org.telegram.ui.Cells.f2(this)));
        }
        return arrayList;
    }

    public final void F6(org.telegram.messenger.fj fjVar, Integer num) {
        org.telegram.messenger.fj fjVar2 = fjVar.C;
        if (fjVar2 != null) {
            int e12 = fjVar2.e1();
            SparseArray sparseArray = this.I6;
            ArrayList arrayList = (ArrayList) sparseArray.get(e12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(e12, arrayList);
            }
            int e13 = fjVar.e1();
            if (!arrayList.contains(Integer.valueOf(e13))) {
                arrayList.add(Integer.valueOf(e13));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void F7() {
        if (this.f46093m1 == null) {
            return;
        }
        this.f45945ad = Q6(false);
        this.bd = Q6(true);
        this.U.setInputBubbleHeight(this.f45945ad);
        ed();
        Oc();
        B7();
        y7();
        D7();
        C7();
    }

    public final void F8(boolean z10) {
        TLRPC.Chat chat = this.f45987e;
        if (chat != null && this.f46163r8 != null && !org.telegram.messenger.v3.r0(chat) && !this.f45987e.creator) {
            TLRPC.ChatFull chatFull = this.f46163r8;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f46154r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f46154r = chatParticipant.inviter_id;
                    return;
                }
                long e10 = getUserConfig().e();
                int size = this.f46163r8.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f46163r8.participants.participants.get(i7);
                    if (chatParticipant2.user_id == e10) {
                        this.f46154r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f46154r == 0) {
                getMessagesController().G(this.f45987e.f28405id, false);
            }
        }
    }

    public final void F9(boolean z10) {
        if (this.f46106n3.getTag() != null && !this.f46183t3) {
            if (!this.f46260z3 || this.f46195u3) {
                this.f46106n3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46235x3, 0.0f);
                    this.f46222w3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f46222w3.addUpdateListener(new be(this, 1));
                    this.f46222w3.addListener(new ei(this, 7));
                    this.f46222w3.setStartDelay(this.f46131p3);
                    this.f46222w3.start();
                } else {
                    ValueAnimator valueAnimator = this.f46222w3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f46222w3 = null;
                    }
                    this.f46235x3 = 0.0f;
                    Tc();
                }
                this.f46131p3 = 500;
            }
        }
    }

    public final void Fa(int i7) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.jj jjVar = this.f46237x5;
        if (jjVar != null && this.f45972cb == null) {
            TLRPC.Peer peer = null;
            if (jjVar.f24869c != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.Y5;
                CharSequence fieldText = this.f45932a0.getFieldText();
                org.telegram.messenger.fj fjVar2 = this.F5;
                if (fjVar2 == this.f46096m4) {
                    fjVar = null;
                } else {
                    fjVar = fjVar2;
                }
                jjVar.e(i10, webPage, fieldText, fjVar, this.D5, this.H5);
            }
            if (!this.f46237x5.c()) {
                this.Eb = this.f45932a0.f32645n3;
                Context context = this.f46093m1.getContext();
                dh.c cVar = this.Q8;
                org.telegram.messenger.jj jjVar2 = this.f46237x5;
                TLRPC.User user = this.f46001f;
                TLRPC.Chat chat = this.f45987e;
                int i11 = this.currentAccount;
                zm zmVar = this.Ba;
                rm rmVar = this.D5;
                if (rmVar != null && rmVar.f51655f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mk mkVar = new mk(this, context, this, cVar, jjVar2, user, chat, i11, zmVar, i7, z10);
                this.f45972cb = mkVar;
                this.f46237x5.f24887x = mkVar;
                TLRPC.ChatFull chatFull = this.f46163r8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ea) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ea.peers.get(0).peer;
                }
                this.f45972cb.setSendAsPeer(peer);
                s7();
                this.f46093m1.addView(this.f45972cb);
                if (this.Eb) {
                    rj rjVar = this.f45932a0;
                    rjVar.U0 = true;
                    org.telegram.ui.Components.cg cgVar = rjVar.V0;
                    if (cgVar != null) {
                        cgVar.u(true);
                    }
                    this.f45932a0.S1();
                    this.S3 = true;
                }
                org.telegram.messenger.g0.k3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void Fb() {
        h6.m[] mVarArr;
        kh.b bVar;
        kh.a aVar;
        org.telegram.ui.Components.bd[] bdVarArr;
        zm zmVar = this.Ba;
        if (zmVar != null) {
            zmVar.t();
        }
        pi piVar = this.f46244y;
        if (piVar != null) {
            piVar.d();
        }
        pi piVar2 = this.f46231x;
        if (piVar2 != null) {
            piVar2.d();
        }
        pi piVar3 = this.E;
        if (piVar3 != null) {
            piVar3.d();
        }
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            rjVar.updateColors();
        }
        fi.n2 n2Var = this.Y1;
        if (n2Var != null) {
            n2Var.Q0();
        }
        bj bjVar = this.A0;
        if (bjVar != null) {
            int childCount = bjVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) childAt).A0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                    ((org.telegram.ui.Cells.u0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.h1 h1Var = this.f46023g9;
        if (h1Var != null && h1Var.getContentView() != null) {
            View contentView = this.f46023g9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.qe0 qe0Var = this.O2;
        if (qe0Var != null) {
            qe0Var.d();
        }
        sj sjVar = this.f45947b0;
        if (sjVar != null && sjVar.getEditView() != null) {
            for (org.telegram.ui.Components.bd bdVar : this.f45947b0.getEditView().f33331a) {
                if (bdVar != null) {
                    bdVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f46054j0;
        if (r0Var != null) {
            r0Var.W();
        }
        mj mjVar = this.f46094m2;
        if (mjVar != null) {
            mjVar.updateColors();
        }
        vi viVar = this.f46129p1;
        if (viVar != null) {
            viVar.updateColors();
        }
        pl plVar = this.f46093m1;
        if (plVar != null) {
            plVar.M();
            bi.i3 i3Var = this.f46093m1.M;
            if (i3Var != null) {
                i3Var.invalidate();
            }
        }
        org.telegram.ui.Components.ah ahVar = this.f45948b1;
        if (ahVar != null) {
            fh.g gVar = ahVar.f33345s;
            if (gVar != null) {
                gVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
            ahVar.invalidate();
        }
        org.telegram.ui.Components.yw0 yw0Var = this.f46170s1;
        if (yw0Var != null) {
            yw0Var.updateColors();
        }
        vi viVar2 = this.f46129p1;
        if (viVar2 != null && viVar2.getTimeItem() != null) {
            this.f46129p1.getTimeItem().invalidate();
        }
        jh.f fVar = this.U;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f46246y1;
        if (hVar != null) {
            for (h6.m mVar : hVar.f19886e) {
                if (mVar != null && (aVar = (bVar = (kh.b) mVar.f13939b).f18564b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        vj vjVar = this.f45976d1;
        if (vjVar != null) {
            vjVar.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        this.f46093m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void Fc() {
        org.telegram.ui.Components.uz uzVar = this.J9;
        if (uzVar != null && !uzVar.f40447c) {
            uzVar.c(false);
            try {
                this.J9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Fd(org.telegram.messenger.y10 y10Var) {
        int i7;
        int i10;
        bj bjVar = this.A0;
        if (bjVar != null) {
            if (!this.R4 && this.f45955b8 != null) {
                int childCount = bjVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.fj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.fj fjVar = this.f45955b8;
                        if (messageObject == fjVar) {
                            ArrayList arrayList = this.M6;
                            if (arrayList.indexOf(fjVar) >= 0) {
                                i7 = arrayList.indexOf(this.f45955b8) + this.D0.K;
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
            rj rjVar = this.f45932a0;
            if (rjVar != null) {
                rjVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.A0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                    org.telegram.messenger.fj messageObject2 = q1Var.getMessageObject();
                    if (((Boolean) y10Var.a(messageObject2)).booleanValue()) {
                        messageObject2.M1 = true;
                        q1Var.y3(messageObject2, q1Var.getCurrentMessagesGroup(), q1Var.K2(), q1Var.L2(), q1Var.C2(), q1Var.G2());
                        kl klVar = this.D0;
                        this.A0.getClass();
                        klVar.Q(RecyclerView.R(q1Var));
                    }
                }
            }
            if (i7 != -1) {
                this.C0.h1(i7, i10);
            }
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.G6():void");
    }

    public final void G7() {
        int i7;
        bn bnVar = this.Aa;
        if (bnVar != null) {
            bnVar.G7();
        }
        int L = org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m + ((int) s9(org.telegram.messenger.g0.L(7.0f)));
        bk bkVar = this.D1;
        if (bkVar != null) {
            i7 = org.telegram.messenger.g0.L(bkVar.F * 35.0f);
        } else {
            i7 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(V8() * 43.0f) + L + i7;
        int L3 = org.telegram.messenger.g0.L(60.0f) + ((int) this.f46218w.d());
        di.b1 b1Var = this.f45936a4;
        if (b1Var != null) {
            b1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.e30 e30Var = this.I1;
        if (e30Var != null) {
            e30Var.f34593e.setPadding(0, L2, 0, L3);
            e30Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        bi.a3 a3Var = this.Z3;
        if (a3Var != null) {
            lh.f fVar = (lh.f) a3Var.f3399b;
            fVar.setFadeZoneTop(L2);
            fVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.wz wzVar = this.f46157r2;
        if (wzVar != null) {
            wzVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.kv0 kv0Var = this.f46171s2;
        if (kv0Var != null) {
            kv0Var.f36893a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.g0.L(32.0f));
        }
    }

    public final void G8(org.telegram.messenger.fj r75, java.util.ArrayList r76, java.util.ArrayList r77, java.util.ArrayList r78) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.G8(org.telegram.messenger.fj, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void G9(boolean z10) {
        if (!z10) {
            hi.m3 m3Var = this.B2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            hi.m3 m3Var2 = this.f46207v2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            hi.m3 m3Var3 = this.f46234x2;
            if (m3Var3 != null) {
                m3Var3.f(true);
            }
        }
        hi.m3 m3Var4 = this.A2;
        if (m3Var4 != null) {
            m3Var4.f(true);
        }
        hi.m3 m3Var5 = this.f46259z2;
        if (m3Var5 != null) {
            m3Var5.f(true);
        }
        hi.m3 m3Var6 = this.I2;
        if (m3Var6 != null) {
            m3Var6.f(true);
        }
        hi.m3 m3Var7 = this.J2;
        if (m3Var7 != null) {
            m3Var7.f(true);
        }
        hi.m3 m3Var8 = this.C2;
        if (m3Var8 != null) {
            m3Var8.f(true);
        }
        hi.m3 m3Var9 = this.D2;
        if (m3Var9 != null) {
            m3Var9.f(true);
        }
        org.telegram.ui.Components.pp ppVar = this.K2;
        if (ppVar != null) {
            ppVar.f(true);
        }
        hi.m3 m3Var10 = this.Y0;
        if (m3Var10 != null) {
            m3Var10.f(true);
        }
        hi.m3 m3Var11 = this.f45933a1;
        if (m3Var11 != null) {
            m3Var11.f(true);
        }
        hi.m3 m3Var12 = this.Z0;
        if (m3Var12 != null) {
            m3Var12.f(true);
        }
    }

    public final void Ga(String str, boolean z10) {
        boolean z11;
        oj ojVar;
        boolean z12;
        org.telegram.ui.ActionBar.r0 r0Var;
        int i7;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                d8();
                hi.m3 m3Var = this.K1;
                if (m3Var != null && m3Var.W) {
                    m3Var.f(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                hi.m3 m3Var2 = this.L1;
                if (m3Var2 != null && m3Var2.W) {
                    m3Var2.f(true);
                    z11 = true;
                }
                if (z11) {
                    org.telegram.messenger.g0.h3(new ge(this, str, 7), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                g7(true);
                if (!this.actionBar.f29088o0) {
                    this.f46040hd.a(true, true);
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.f46054j0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f46014g0;
                    if (yVar != null) {
                        yVar.e(8);
                    }
                    fr frVar = this.f46002f0;
                    if (frVar != null) {
                        frVar.b(false);
                    }
                    if ((this.f46173s4 == 0 || (i7 = this.f46018g4) == 3 || i7 == 8) && (r0Var = this.f46067k0) != null) {
                        r0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = this.f46128p0;
                    if (r0Var3 != null && this.f46037ha) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f46141q0;
                    if (yVar2 != null && this.f46050ia) {
                        yVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = this.f46080l0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = this.m0;
                    if (r0Var5 != null) {
                        r0Var5.setVisibility(8);
                    }
                    this.f46155r0 = true;
                    nd(0, 0, -1);
                    Pc(false);
                }
                bk bkVar = this.D1;
                if (bkVar != null) {
                    if (bkVar.F > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        bkVar.g(false);
                    }
                }
                ImageView imageView = this.f46044i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!org.telegram.messenger.v3.V(this.f45987e) || !org.telegram.messenger.v3.t0(this.f45987e) || this.J3 == null)) {
                    this.G1 = 0;
                } else {
                    this.G1 = 2;
                }
                this.f46072k5 = false;
                if (this.f45978d4 == 3) {
                    org.telegram.messenger.ma.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(this.currentAccount);
                    a10.f25551b.a();
                    a10.f25552c.a();
                }
                hi.i1 i1Var = this.F1;
                if (i1Var != null) {
                    i1Var.h.clear();
                }
                org.telegram.ui.ActionBar.r0 r0Var6 = this.f46067k0;
                if (r0Var6 != null) {
                    this.Kc = true;
                    r0Var6.G(false);
                    this.Kc = false;
                }
                org.telegram.ui.ActionBar.r0 r0Var7 = this.f46067k0;
                if (r0Var7 != null) {
                    r0Var7.setSearchFieldCaption(null);
                    this.f46067k0.Q(str, false);
                    this.f46067k0.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745568, null));
                }
                getMediaDataController().c2(this.I3, this.f46085l6, this.f45981d7, this.classGuid, 0, this.f46173s4, false, this.D3, this.E3, false, this.F3);
                gd(0, true);
                this.f46171s2.e(true, true);
                sc(true);
                oj ojVar2 = this.E1;
                if (ojVar2 != null) {
                    ojVar2.b(!contains);
                    pd();
                }
                if ((contains || z10) && this.J3 != null && (ojVar = this.E1) != null) {
                    int currentPosition = ojVar.f40061a.getCurrentPosition();
                    int i10 = this.G1;
                    if (currentPosition != i10) {
                        this.E1.f40061a.e(i10, i10);
                    }
                }
                org.telegram.messenger.ma.a(this.currentAccount).c(this.J3);
                this.I1.f34594f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof dn) {
                    ((dn) currentView).f47021a.rd(this.J3);
                }
            }
        }
    }

    public final void Gb(TLRPC.Document document) {
        String V;
        if (document == null || (V = org.telegram.messenger.fj.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f28411id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(V, this.f46085l6, this.F5, this.f46096m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = Y8();
        org.telegram.messenger.zy.C(this.currentAccount).r0(b10);
        L6();
    }

    public final void Gc() {
        long j3;
        zd zdVar = this.f46100m8;
        if (zdVar != null) {
            org.telegram.messenger.g0.r(zdVar);
        }
        zd zdVar2 = new zd(this, 17);
        this.f46100m8 = zdVar2;
        if (this.f46035h8 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        org.telegram.messenger.g0.h3(zdVar2, j3);
    }

    public final void Gd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Gd(boolean):void");
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
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
            sh.c cVar2 = this.f46079kd;
            if (cVar2 != null) {
                cVar2.setAnimatedVisibility(this.f46000ed.f57657e);
            }
        } else {
            int i14 = 8;
            if (i7 == 3) {
                te.a aVar = this.f46013fd;
                float f12 = 1.0f - aVar.f57657e;
                this.f45948b1.setAlpha(f12);
                org.telegram.ui.Components.ah ahVar = this.f45948b1;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                ahVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f57657e;
                org.telegram.ui.Components.z11 z11Var = this.f46016g2;
                if (z11Var != null) {
                    z11Var.setAlpha(f13);
                    org.telegram.ui.Components.z11 z11Var2 = this.f46016g2;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    z11Var2.setVisibility(i13);
                }
            } else if (i7 == 4) {
                bi.a3 a3Var = this.Z3;
                te.a aVar2 = this.f46027gd;
                if (a3Var != null) {
                    float f14 = aVar2.f57657e;
                    a3Var.setAlpha(f14);
                    bi.a3 a3Var2 = this.Z3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    a3Var2.setVisibility(i14);
                }
                if (aVar2.f57657e < 1.0f) {
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
                if (aVar2.f57657e >= 1.0f) {
                    z11 = false;
                }
                bj bjVar = this.A0;
                if (z11) {
                    i12 = 0;
                }
                bjVar.setVisibility(i12);
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

    public final void H6(org.telegram.messenger.fj fjVar, org.telegram.messenger.fj fjVar2) {
        long D1 = fjVar.D1();
        if (D1 != 0) {
            a0.h hVar = this.O6;
            ArrayList arrayList = (ArrayList) hVar.f(D1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.f3.h(hVar, D1);
            }
            arrayList.add(fjVar);
            if (fjVar2 != null) {
                arrayList.remove(fjVar2);
            }
        }
    }

    public final void H7() {
        int i7;
        float f10 = (1.0f - this.f46027gd.f57657e) * (1.0f - this.f46000ed.f57657e);
        this.f46246y1.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(80.0f));
        this.f46246y1.setAlpha(f10);
        lh.h hVar = this.f46246y1;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hVar.setVisibility(i7);
    }

    public final int H8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.H8():int");
    }

    public final void H9() {
        ValueAnimator valueAnimator = this.Gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.u0 u0Var = this.f46119o3;
        if (u0Var != null && u0Var.getTag() != null) {
            this.f46119o3.setTag(null);
            org.telegram.ui.Cells.u0 u0Var2 = this.f46119o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ue(this, u0Var2, 1));
            ofFloat.addListener(new ah.l(16, this, u0Var2));
            ofFloat.setDuration(150L);
            this.Gb = ofFloat;
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
        if (this.f45987e == null || str == null || this.f46018g4 != 0) {
            return false;
        }
        if (q1Var != null && (characterStyle != null || i10 != 1)) {
            o1Var = new jg.o1(this, i7, i10, characterStyle, q1Var);
        } else {
            o1Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.v3.K(this.f45987e, false) != null) {
                try {
                    if (f45925pd == null) {
                        f45925pd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f45926qd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f45925pd.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (org.telegram.messenger.v3.O(matcher.group(2), this.f45987e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = sh.e.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i11 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i11 = 0;
                                    }
                                    if (org.telegram.messenger.v3.c0(this.f45987e) && i11 != d()) {
                                        return false;
                                    }
                                    this.L7 = true;
                                    if (this.f46018g4 == 2) {
                                        this.f46112n9.K0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int V = LaunchActivity.V(parse);
                                    this.Q7 = V;
                                    if (V >= 0) {
                                        this.R7 = parseInt;
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
                        Matcher matcher2 = f45926qd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.v3.O(matcher2.group(2), this.f45987e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f46253y8 = queryParameter2;
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
                    if (org.telegram.messenger.v3.O(lowerCase, this.f45987e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f46018g4 == 2) {
                            this.f46112n9.K0(intValue3);
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
                    if (f45927rd == null) {
                        f45927rd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f45927rd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f45987e.f28405id || parseInt3 == 0) {
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
                    byte[] g11 = sh.e.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (org.telegram.messenger.v3.c0(this.f45987e) && (f10 = getMessagesController().f25771t7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f46159r4;
                            if (tL_forumTopic == null || tL_forumTopic.f28457id != f10.f28457id) {
                                return false;
                            }
                            return true;
                        }
                        this.L7 = true;
                        if (this.f46018g4 == 2) {
                            this.f46112n9.K0(parseInt3);
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
            long j3 = this.f45987e.f28405id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Da(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.L7 = true;
            if (this.f46018g4 == 2) {
                this.f46112n9.K0(intValue9);
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
        kj kjVar = this.X1;
        if (kjVar == null) {
            return;
        }
        TLRPC.User user = kjVar.getAdapter().f17533x0;
        if (user != null) {
            j10 = user.f28554id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f28403id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.X1.getAdapter().f17533x0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j11 = this.f46085l6;
        org.telegram.messenger.fj fjVar = this.F5;
        org.telegram.messenger.fj fjVar2 = this.f46096m4;
        rm rmVar = this.D5;
        org.telegram.messenger.zy.S(i7, j11, j3, j9(), hashMap, accountInstance, fjVar, fjVar2, Y8(), botInlineResult, null, this, rmVar, z10);
        this.f45932a0.setFieldText("");
        D9(false);
        getMediaDataController().x0(j10, false);
    }

    public final void Hc() {
        org.telegram.messenger.g0.d0(this.A0, new ai.u2(6, this, Q9()));
    }

    public final void I6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.i9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f45987e, this.f46001f, null, this.f46085l6, this.Sa, this.Ra);
    }

    public final void I7() {
        bn bnVar = this.Aa;
        if (bnVar != null) {
            bnVar.I7();
        }
        float f10 = 0.0f;
        if (!this.mb) {
            f10 = org.telegram.messenger.g0.L(1.0f) + this.actionBar.getMeasuredHeight() + 0.0f;
        }
        float s9 = s9(org.telegram.messenger.g0.L(7.0f)) + f10;
        if (this.f46016g2 != null) {
            s9 += t9(org.telegram.ui.Components.v11.f40475a);
        }
        if (this.D1 != null) {
            s9 += org.telegram.messenger.g0.L(35.0f) * this.D1.F;
        }
        this.Z.setFadeZoneTop((int) ((V8() * org.telegram.messenger.g0.L(43.0f)) + s9));
    }

    public final boolean I9(boolean z10) {
        ok okVar;
        ok okVar2 = this.M2;
        if (okVar2 == null || okVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.ah ahVar = this.f45948b1;
        if (ahVar != null && (okVar = this.M2) != null) {
            ahVar.j(okVar, false, z10);
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

    public final void Ia(org.telegram.messenger.fj fjVar) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = fjVar.f23968k.peer_id;
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
        bundle.putInt("message_id", fjVar.L1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new bn(bundle));
        }
    }

    public final void Ib(ClipData clipData, boolean z10, int i7) {
        int i10 = 0;
        if (this.H5 != null) {
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
        if (!getMessagesController().u2(this.f46085l6, d(), null)) {
            if (z10) {
                getNotificationsController().G(this.f46085l6, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.x2 C = org.telegram.ui.Components.b5.C(this.f46085l6, d(), this, this.Ba);
            boolean V9 = V9();
            C.f30210i0 = V9;
            C.f30217n = V9;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.f46085l6, d(), false);
        if (!z10) {
            org.telegram.ui.Components.lc.z(this, 4, 0, this.Ba).j();
        }
    }

    public final void J6(org.telegram.messenger.fj fjVar, boolean z10) {
        K6(fjVar, z10, true);
    }

    public final void J7() {
        if (this.f45948b1 != null) {
            this.f45948b1.setPadding(org.telegram.messenger.g0.L(7.0f) + ((int) ((1.0f - V8()) * (1.0f - this.f46027gd.f57657e) * n9())), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final org.telegram.ui.Cells.z J8(int i7, boolean z10) {
        org.telegram.messenger.fj messageObject;
        bj bjVar = this.A0;
        if (bjVar != null) {
            int childCount = bjVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.A0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                    messageObject = ((org.telegram.ui.Cells.u0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.e1() == i7) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.P9 - this.R9) - org.telegram.messenger.g0.L(4.0f) || childAt.getY() > this.A0.getMeasuredHeight() - this.Ya) {
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
        ik ikVar = this.Bb;
        if (ikVar == null) {
            return;
        }
        this.Bb = null;
        ikVar.e();
        if (ikVar.getReactionsWindow() != null && ikVar.getReactionsWindow().f5297a != null) {
            ikVar.getReactionsWindow().f5297a.animate().alpha(0.0f).setDuration(180L).start();
        }
        ikVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new k9(29, this, ikVar)).setDuration(180L).start();
    }

    public final void Ja(org.telegram.messenger.fj fjVar) {
        if (org.telegram.messenger.o10.C(this.f46001f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = fjVar.f23968k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f46001f.f28554id) {
                l(messageFwdHeader.saved_from_msg_id, fjVar.e1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = fjVar.f23968k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", fjVar.f23968k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new bn(bundle));
        }
    }

    public final void Jb(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        long j10;
        if (u7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(str, this.f46085l6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = Y8();
                b10.O = j3;
                b10.L = z11;
                b10.Q = 0L;
                b10.R = j9();
                b10.T = this.f46250y5;
                org.telegram.messenger.zy.C(this.currentAccount).r0(b10);
                j10 = 0;
            } else {
                j10 = j3;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g((TLRPC.User) obj, this.f46085l6, null, null, null, null, z10, i7, 0);
                g10.K = Y8();
                g10.O = j10;
                g10.L = z11;
                g10.Q = 0L;
                g10.R = j9();
                g10.T = this.f46250y5;
                getSendMessagesHelper().r0(g10);
                j10 = 0;
            }
            L6();
        }
    }

    public final void Jc(org.telegram.ui.ActionBar.p0 p0Var, boolean z10) {
        Set set;
        if (p0Var != null) {
            if (z10) {
                set = this.V0;
            } else {
                set = this.U0;
            }
            set.add(p0Var);
        }
    }

    @Override
    public final boolean K() {
        return this.A8;
    }

    public final void K6(org.telegram.messenger.fj r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.K6(org.telegram.messenger.fj, boolean, boolean):void");
    }

    public final void K7() {
        float f10 = this.T9;
        bk bkVar = this.D1;
        if (bkVar != null) {
            bkVar.setTranslationY(f10);
            f10 += org.telegram.messenger.g0.L(35.0f) * this.D1.F;
        }
        oj ojVar = this.E1;
        if (ojVar != null) {
            ojVar.setTranslationY(f10);
        }
        float V8 = (V8() * org.telegram.messenger.g0.L(43.0f)) + f10;
        org.telegram.ui.Components.z11 z11Var = this.f46016g2;
        org.telegram.ui.Components.v11 v11Var = org.telegram.ui.Components.v11.f40475a;
        if (z11Var != null) {
            z11Var.setSideMenuBackgroundMarginTop((V8() * s9(org.telegram.messenger.g0.L(7.0f))) + V8);
            float t92 = t9(v11Var);
            float a10 = a8.m7.a(this.f46027gd.f57657e);
            float V82 = V8();
            V8 += a8.m7.a(Math.min(c8.l9.a(a8.m7.a(a10), 0.0f, 1.0f), c8.l9.a(a8.m7.a(V82), 0.0f, 1.0f))) * t92;
        }
        org.telegram.ui.Components.ah ahVar = this.f45948b1;
        if (ahVar != null) {
            ahVar.setTranslationY((V8 - org.telegram.messenger.g0.L(5.0f)) - (V8() * t9(v11Var)));
        }
    }

    public final org.telegram.ui.Cells.u0 K8(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i7 = 0; i7 < this.A0.getChildCount(); i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.u0) {
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) childAt;
                    if (org.telegram.ui.Wallet.u0.Q(u0Var.getMessageObject(), wallettransaction)) {
                        return u0Var;
                    }
                }
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.u0.Q((org.telegram.messenger.fj) arrayList.get(i10), wallettransaction)) {
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
        org.telegram.ui.Components.gc gcVar = this.P3;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
        nk nkVar = this.O3;
        if (nkVar != null) {
            nkVar.d(0, true);
        }
    }

    public final void Ka(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.fj fjVar) {
        org.telegram.ui.Cells.q1 q1Var2;
        boolean z10;
        long j3;
        long j10;
        org.telegram.ui.Components.b6 m10;
        Bitmap m11;
        if (q1Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getMessageObject().T(fjVar)) {
                        break;
                    }
                }
            }
        }
        q1Var2 = q1Var;
        if (org.telegram.messenger.fj.L4(fjVar.f23968k)) {
            Lb(fjVar, true);
        }
        if (org.telegram.messenger.fj.L4(fjVar.f23968k) && !fjVar.D2(true) && org.telegram.messenger.bz.B0 && fjVar.B() && !org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.f23968k)) && !fjVar.f24027z0 && !fjVar.f24023y0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.w7 fileLoader = getFileLoader();
            TLRPC.Document F0 = fjVar.F0();
            fileLoader.getClass();
            org.telegram.messenger.w7.K.c(new org.telegram.messenger.yf(fileLoader, F0, fjVar, 22));
        }
        PhotoViewer.p1().I2(null, this, this.Ba);
        org.telegram.messenger.fj fjVar2 = MediaController.B().f22743v0;
        if (q1Var2 != null && fjVar2 != null && org.telegram.messenger.fj.L4(fjVar2.f23968k)) {
            getFileLoader().c0(fjVar2.F0(), false);
            if (fjVar2.T(fjVar) && (m10 = q1Var2.getPhotoImage().m()) != null && this.M8 != null && this.J8.getTag() != null && (m11 = m10.m()) != null) {
                try {
                    Bitmap bitmap = this.M8.getBitmap(m11.getWidth(), m11.getHeight());
                    new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            MediaController.B().q(true, true, false, fjVar2.T(fjVar));
        }
        if (this.f46018g4 == 1 && (org.telegram.messenger.fj.L4(fjVar.f23968k) || fjVar.D == 1)) {
            PhotoViewer.p1().f43262l4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.M6.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) this.M6.get(i10);
                if (org.telegram.messenger.fj.L4(fjVar3.f23968k) || fjVar3.D == 1) {
                    arrayList.add(0, fjVar3);
                }
            }
            PhotoViewer.p1().a2(arrayList, arrayList.indexOf(fjVar), this.f46085l6, 0L, d(), this.f45985db);
        } else {
            PhotoViewer p12 = PhotoViewer.p1();
            int i11 = fjVar.D;
            long j11 = 0;
            if (i11 != 0) {
                j3 = this.f46085l6;
            } else {
                j3 = 0;
            }
            if (i11 != 0) {
                j10 = this.f45981d7;
            } else {
                j10 = 0;
            }
            if (i11 != 0) {
                j11 = d();
            }
            if (!p12.e2(fjVar, this, j3, j10, j11, this.f45985db) && z10) {
                getFileLoader().f(fjVar.F0());
            }
        }
        G9(false);
        MediaController.B().f22746w0 = null;
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
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                ?? obj2 = new Object();
                if (!efVar.f27849b && (str2 = efVar.h) != null) {
                    obj2.f28213c = str2;
                } else {
                    String str3 = efVar.I;
                    if (str3 != null) {
                        obj2.f28213c = str3;
                    }
                }
                obj2.f28214e = efVar.f27850c;
                obj2.f28215f = efVar.f27853g;
                obj2.f28224p = efVar.d();
                obj2.f28223o = efVar.f27849b;
                obj2.f28225q = efVar.j();
                obj2.f28233z = efVar.f27858m;
                obj2.A = efVar.P;
                CharSequence charSequence = efVar.f27848a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f28217i = efVar.f27859n;
                obj2.f28218j = efVar.f27863r;
                obj2.h = efVar.f27868x;
                obj2.f28219k = efVar.f27864s;
                obj2.f28226r = efVar.L;
                obj2.f28231x = efVar.c();
                arrayList2.add(obj2);
                efVar.e();
            }
            D8(((org.telegram.messenger.yy) arrayList2.get(0)).d, ((org.telegram.messenger.yy) arrayList2.get(0)).f28217i);
            org.telegram.messenger.zy.X(getAccountInstance(), arrayList2, this.f46085l6, this.F5, this.f46096m4, null, this.D5, z11, true, null, null, z10, i7, 0, ((org.telegram.messenger.yy) arrayList2.get(0)).f28228t, null, Y8(), 0L, false, 0L, j9(), this.f46250y5, null, false);
            L6();
            rj rjVar = this.f45932a0;
            if (rjVar != null) {
                rjVar.setFieldText("");
            }
        }
        if (i7 != 0) {
            if (this.f46032h4 == -1) {
                this.f46032h4 = 0;
            }
            this.f46032h4 = arrayList.size() + this.f46032h4;
            md(true);
        }
    }

    public final void Kc(org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return;
        }
        org.telegram.ui.Components.gc gcVar = this.P3;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46210v5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(fjVar.e1()));
        int i7 = this.f45993e5;
        getNotificationCenter().k(org.telegram.messenger.ks.f25193t0, Long.valueOf(this.f46085l6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f45993e5 - 1), Boolean.valueOf(this.f46019g5));
        this.P3 = org.telegram.ui.Components.lc.B(this, false, new bi.u4(this, arrayList2, arrayList, i7, 18), new he(this, fjVar, 6), this.Ba).j();
    }

    public final void L6() {
        this.f46250y5 = null;
        if (this.f46173s4 == 0 || this.f46236x4) {
            if (this.f46236x4) {
                this.F5 = this.f46096m4;
            } else {
                this.F5 = null;
            }
            this.D5 = null;
            rj rjVar = this.f45932a0;
            if (rjVar != null) {
                rjVar.K1(null, null, null);
            }
        }
        D9(false);
        if (this.f46018g4 == 0) {
            getMediaDataController().F(this.f46085l6, this.f46173s4, true);
        }
    }

    public final void L7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i7;
        org.telegram.messenger.fj fjVar;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.N6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i10 = 0;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.M6;
                if (i11 >= size) {
                    break;
                }
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) sparseArray.valueAt(i11);
                if (fjVar2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(fjVar2.f23968k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = fjVar2.C.f23968k.fwd_from) != null && org.telegram.messenger.fj.B1(messageFwdHeader.saved_from_peer) == this.f46085l6 && (i7 = fjVar2.C.f23968k.fwd_from.channel_post) != 0 && (fjVar = (org.telegram.messenger.fj) this.G6[i10].get(i7)) != null && (messageReplies = fjVar.f23968k.replies) != null) {
                        messageReplies.replies++;
                        fjVar.f23970k1 = true;
                        TLRPC.Message message = fjVar2.f23968k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = i10;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (org.telegram.messenger.fj.B1(fjVar.f23968k.replies.recent_repliers.get(i12)) == org.telegram.messenger.fj.B1(peer)) {
                                fjVar.f23968k.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        fjVar.f23968k.replies.recent_repliers.add(i10, peer);
                        if (!fjVar2.N3()) {
                            fjVar.f23968k.replies.max_id = fjVar2.e1();
                        }
                        org.telegram.messenger.tr messagesStorage = getMessagesStorage();
                        long j3 = this.f45987e.f28405id;
                        int e12 = fjVar.e1();
                        TLRPC.MessageReplies messageReplies2 = fjVar.f23968k.replies;
                        messagesStorage.f27054a.c(new org.telegram.messenger.d8(messagesStorage, e12, j3, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (fjVar.z2()) {
                            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.P6.f(fjVar.c1());
                            if (ajVar != null) {
                                ArrayList arrayList4 = ajVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(ajVar, ajVar.f22898a);
                                int size3 = arrayList4.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    ((org.telegram.messenger.fj) arrayList4.get(i13)).f23970k1 = true;
                                }
                            }
                        } else if (this.D0 != null && (indexOf = arrayList.indexOf(fjVar)) >= 0) {
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
                        org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((org.telegram.messenger.fj) i5.c.h(1, ajVar2.d));
                        if (indexOf2 >= 0) {
                            kl klVar = this.D0;
                            if (!klVar.O) {
                                klVar.k(indexOf2 + klVar.K, ajVar2.d.size());
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.L8():void");
    }

    public final void L9() {
        boolean z10;
        nd(0, 0, -1);
        getMediaDataController().c2(this.I3, this.f46085l6, this.f45981d7, this.classGuid, 0, this.f46173s4, false, this.D3, this.E3, true, this.F3);
        if (TextUtils.isEmpty(this.I3) && this.F3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.H3 = z10;
        this.f46155r0 = z10;
        Pc(false);
        qd();
    }

    public final void La(boolean z10) {
        org.telegram.ui.ActionBar.s4 s4Var;
        int i7;
        if (getParentActivity() != null && (s4Var = this.parentLayout) != null && s4Var.getLastFragment() == this && !this.V4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f45987e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f28405id);
            } else {
                bundle.putLong("user_id", this.f46001f.f28554id);
            }
            bundle.putInt("chatMode", 2);
            bn bnVar = new bn(bundle);
            bnVar.V4 = new ArrayList(this.V4);
            bnVar.X4 = new HashMap(this.X4);
            int size = this.V4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.V4.get(i10);
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.X4.get(num);
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.G6[0].get(num.intValue());
                if (fjVar == null) {
                    fjVar = fjVar2;
                } else if (fjVar2 != null) {
                    fjVar.f24027z0 = fjVar2.f24027z0;
                    fjVar.f24023y0 = fjVar2.f24023y0;
                }
                if (fjVar != null) {
                    bnVar.X4.put(num, fjVar);
                    bnVar.hd();
                }
            }
            bnVar.f45979d5 = this.f45979d5;
            if (this.f46236x4) {
                i7 = this.V4.size();
            } else {
                i7 = this.f45993e5;
            }
            bnVar.f45993e5 = i7;
            bnVar.f46019g5 = this.f46019g5;
            bnVar.f46176s8 = this.f46176s8;
            bnVar.f46163r8 = this.f46163r8;
            bnVar.f46112n9 = new sk(this, bnVar);
            if (z10) {
                presentFragmentAsPreview(bnVar);
                s7();
                return;
            }
            presentFragment(bnVar, false);
        }
    }

    public final he Lb(org.telegram.messenger.fj fjVar, boolean z10) {
        int i7;
        boolean z11;
        int i10;
        if (fjVar == null || fjVar.N3() || !fjVar.l4()) {
            return null;
        }
        TLRPC.Message message = fjVar.f23968k;
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
                getMessagesController().w3(this.f46085l6, i10, fjVar.f23968k.random_id);
                return null;
            }
            getMessagesController().x3(this.f46085l6, fjVar.e1(), null, i10, 0L, z11);
            return null;
        }
        return new he(this, fjVar, 1);
    }

    public final void Lc() {
        boolean Y9 = Y9();
        SparseArray[] sparseArrayArr = this.f46121o6;
        if (!Y9) {
            if (this.actionBar.y() && this.f46142q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f46142q1.c(org.telegram.messenger.gd.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.E0.setText(org.telegram.messenger.gd.M0(2131746018, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        this.E0.setText(org.telegram.messenger.gd.a0(null, null, 2131746019, org.telegram.messenger.gd.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    @Override
    public final long M() {
        return this.f45981d7;
    }

    public final void M6(org.telegram.messenger.fj fjVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
        String M0 = org.telegram.messenger.gd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
        if (fjVar.D == 3) {
            u1Var.U = org.telegram.messenger.gd.M0(2131747986, null);
        } else {
            u1Var.U = org.telegram.messenger.gd.a0("NoHandleAppInstalled", null, 2131748013, fjVar.F0().mime_type);
        }
        showDialog(u1Var);
    }

    public final void M7(boolean z10) {
        boolean z11;
        this.M6.clear();
        this.J6.clear();
        this.K6.clear();
        this.f46263z6.clear();
        this.P6.b();
        this.f46249y4 = false;
        kl klVar = this.D0;
        if (klVar != null) {
            if (klVar.f49299x < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            wc(z11);
        }
        bj bjVar = this.A0;
        if (bjVar != null) {
            bjVar.setEmptyView(null);
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.G6[i7].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.R6;
            int[] iArr2 = this.Q6;
            if (encryptedChat == null) {
                iArr2[i7] = Integer.MAX_VALUE;
                iArr[i7] = Integer.MIN_VALUE;
            } else {
                iArr2[i7] = Integer.MIN_VALUE;
                iArr[i7] = Integer.MAX_VALUE;
            }
            this.S6[i7] = Integer.MIN_VALUE;
            this.T6[i7] = 0;
            this.U6[i7] = false;
            this.V6[i7] = false;
            this.W6[i7] = true;
        }
        if (z10) {
            this.Y7 = true;
            this.Z6 = true;
            this.Y6 = true;
            this.f45940a8 = false;
        }
        this.f46084l5 = false;
        this.M7 = 0;
        this.L7 = false;
        this.f45968c7 = 0;
        this.f45955b8 = null;
        this.V7 = 0;
        this.W7 = false;
        this.S7 = false;
        kl klVar2 = this.D0;
        if (klVar2 != null && !klVar2.O) {
            klVar2.O(false);
        }
    }

    public final boolean M8() {
        boolean z10;
        org.telegram.messenger.aj currentMessagesGroup;
        int childCount = this.A0.getChildCount();
        HashMap hashMap = null;
        int i7 = 0;
        while (true) {
            z10 = true;
            if (i7 >= childCount) {
                break;
            }
            View childAt = this.A0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = ((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f22899b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f22898a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f22898a), currentMessagesGroup);
                    int indexOf = this.M6.indexOf((org.telegram.messenger.fj) i5.c.h(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        kl klVar = this.D0;
                        klVar.k(indexOf + klVar.K, currentMessagesGroup.d.size());
                        this.A0.setItemAnimator(null);
                    }
                }
            }
            i7++;
        }
        if (!org.telegram.messenger.g0.Q1()) {
            return true;
        }
        if (org.telegram.messenger.g0.P1() && org.telegram.messenger.t0.f26915b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && !s4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(z10));
        return false;
    }

    public final void M9() {
        if (!this.f45942aa) {
            this.f45942aa = true;
            pl plVar = this.f46093m1;
            if (plVar != null) {
                plVar.invalidate();
            }
            bj bjVar = this.A0;
            if (bjVar != null) {
                bjVar.invalidate();
            }
        }
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(t9(org.telegram.ui.Components.v11.f40477c) + this.U.getInputBubbleHeight() + this.f46218w.d() + org.telegram.messenger.g0.L(16.0f));
        }
        K7();
    }

    public final void Ma(int i7, boolean z10) {
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && s4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f28413id);
            } else {
                TLRPC.Chat chat = this.f45987e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f28405id);
                } else {
                    bundle.putLong("user_id", this.f46001f.f28554id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i7);
                bundle.putBoolean("converting_toast", true);
            }
            bn bnVar = new bn(bundle);
            if (this.f46236x4) {
                qg.c.a(bnVar, org.telegram.messenger.sr.a(a(), d()));
            }
            bnVar.f46112n9 = new xi(this);
            presentFragment(bnVar, false);
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
            if (!org.telegram.messenger.s2.f26724b) {
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
        org.telegram.messenger.zy.V(i7, this.f46085l6, 0L, 0L, 0L, null, null, arrayList2, arrayList3, arrayList4, null, null, null, getAccountInstance(), this.F5, this.f46096m4, this.H5, null, Y8(), null, this.D5, null, null, z10, false);
        D9(false);
    }

    public final void Mc() {
        Drawable s02;
        pl plVar = this.f46093m1;
        if (plVar != null && this.f46267za == null) {
            if (this.Ba.h == null || plVar.getBackgroundImage() == null) {
                if (this.f46093m1.getBackgroundImage() == null || org.telegram.messenger.g0.Q1()) {
                    if (S9()) {
                        s02 = this.f46093m1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.n6.s0();
                    }
                    pl plVar2 = this.f46093m1;
                    if (!S9()) {
                        boolean z10 = org.telegram.ui.ActionBar.n6.f29482i0;
                    }
                    plVar2.U(s02);
                }
            }
        }
    }

    public final void N6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage T;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        Long l11;
        long j10;
        rm rmVar;
        org.telegram.messenger.fj fjVar;
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message2;
        org.telegram.messenger.fj fjVar2;
        rm rmVar2;
        String str;
        int Y;
        rm rmVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        Long l12;
        long j11;
        org.telegram.ui.Components.dz0 dz0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.x5 x5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        TLRPC.Message message3;
        Pair pair;
        Long l13;
        TLRPC.DraftMessage draftMessage;
        if (this.f45932a0 != null) {
            int i7 = this.f46018g4;
            char c10 = '\b';
            if (i7 == 0 || i7 == 8 || (i7 == 3 && getUserConfig().e() == e9())) {
                long j13 = 0;
                if (this.f46018g4 == 8) {
                    if (org.telegram.messenger.v3.p0(this.f45987e)) {
                        if (this.f46173s4 == 0 && org.telegram.messenger.v3.A(this.currentAccount, this.f45987e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.dz0 dz0Var2 = null;
                if (T9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f26644u1.f(this.f46085l6);
                    if (hVar != null && hVar.m() > 0) {
                        pair = new Pair(Long.valueOf(hVar.j(0)), hVar.n(0));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        l13 = (Long) pair.first;
                        draftMessage = (TLRPC.DraftMessage) pair.second;
                    } else {
                        l13 = null;
                        draftMessage = null;
                    }
                    T = draftMessage;
                    l10 = l13;
                } else {
                    org.telegram.messenger.ri mediaDataController = getMediaDataController();
                    long j14 = this.f46085l6;
                    if (this.f46018g4 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f46173s4;
                    }
                    T = mediaDataController.T(j14, j3);
                    l10 = null;
                }
                rj rjVar = this.f45932a0;
                if (T != null) {
                    richMessage = T.rich_message;
                } else {
                    richMessage = null;
                }
                rjVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.mi U = org.telegram.messenger.ri.d0(this.currentAccount).U(this.f46085l6, d());
                if (T != null && (inputReplyTo = T.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.ri mediaDataController2 = getMediaDataController();
                    long j15 = this.f46085l6;
                    if (l10 != null) {
                        j12 = l10.longValue();
                    } else {
                        j12 = this.f46173s4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f26646v1.f(j15);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j12);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z11 || T == null) && this.f45932a0.getFieldText() != null && (this.f46018g4 != 0 || getUserConfig().e() != a() || T == null || this.Fc >= T.date)) {
                    if (z10 && T == null) {
                        this.f45932a0.setFieldText("");
                        this.f45932a0.setEffectId(0L);
                        D9(true);
                    }
                } else if (U != null) {
                    this.f45932a0.setVoiceDraft(U);
                } else if (T != null) {
                    this.Fc = T.date;
                    rj rjVar2 = this.f45932a0;
                    rjVar2.L3 = null;
                    rjVar2.M3 = !T.no_webpage;
                    if (!T.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(T.message);
                        Collections.sort(T.entities, org.telegram.messenger.ri.f26596g2);
                        int i10 = 0;
                        while (i10 < T.entities.size()) {
                            TLRPC.MessageEntity messageEntity = T.entities.get(i10);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j16 = j13;
                            if (z12 || (messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                l12 = l10;
                                if (z12) {
                                    j11 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j11 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                dz0Var = null;
                                org.telegram.ui.Components.s41 s41Var = new org.telegram.ui.Components.s41(a8.p0.o(j11, ""), 3, null);
                                int i11 = messageEntity.offset;
                                valueOf.setSpan(s41Var, i11, messageEntity.length + i11, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    l12 = l10;
                                    ?? obj = new Object();
                                    obj.f34537a |= 4;
                                    org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0(obj, 0);
                                    int i12 = messageEntity.offset;
                                    org.telegram.messenger.ri.f(ez0Var, i12, messageEntity.length + i12, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f34537a |= 1;
                                        org.telegram.ui.Components.ez0 ez0Var2 = new org.telegram.ui.Components.ez0(obj2, 0);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.ri.f(ez0Var2, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f34537a |= 2;
                                        org.telegram.ui.Components.ez0 ez0Var3 = new org.telegram.ui.Components.ez0(obj3, 0);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.ri.f(ez0Var3, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f34537a |= 8;
                                        org.telegram.ui.Components.ez0 ez0Var4 = new org.telegram.ui.Components.ez0(obj4, 0);
                                        int i15 = messageEntity.offset;
                                        org.telegram.messenger.ri.f(ez0Var4, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f34537a |= 16;
                                        org.telegram.ui.Components.ez0 ez0Var5 = new org.telegram.ui.Components.ez0(obj5, 0);
                                        int i16 = messageEntity.offset;
                                        org.telegram.messenger.ri.f(ez0Var5, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(messageEntity.url, dz0Var2);
                                        int i17 = messageEntity.offset;
                                        valueOf.setSpan(r41Var, i17, messageEntity.length + i17, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f34537a |= 256;
                                        org.telegram.ui.Components.ez0 ez0Var6 = new org.telegram.ui.Components.ez0(obj6, 0);
                                        int i18 = messageEntity.offset;
                                        org.telegram.messenger.ri.f(ez0Var6, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i19 = messageEntity.offset;
                                        org.telegram.ui.Components.hh0.c(valueOf, i19, messageEntity.length + i19, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.f45932a0.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, false);
                                            fontMetricsInt = dz0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            x5Var = new org.telegram.ui.Components.x5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            l12 = l10;
                                        } else {
                                            l12 = l10;
                                            x5Var = new org.telegram.ui.Components.x5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i20 = messageEntity.offset;
                                        valueOf.setSpan(x5Var, i20, messageEntity.length + i20, 33);
                                    } else {
                                        l12 = l10;
                                        dz0Var = dz0Var2;
                                    }
                                    dz0Var = dz0Var2;
                                    l12 = l10;
                                }
                                dz0Var = null;
                            }
                            i10++;
                            dz0Var2 = dz0Var;
                            c10 = c11;
                            j13 = j16;
                            l10 = l12;
                        }
                        j10 = j13;
                        rmVar = dz0Var2;
                        l11 = l10;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        rmVar = null;
                        l11 = l10;
                        str2 = T.message;
                    }
                    this.f45932a0.D1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.f45932a0.setSelection(T.message.indexOf(10) + 1);
                        org.telegram.messenger.g0.h3(new zd(this, 5), 700L);
                    }
                    this.f45932a0.setEffectId(T.effect);
                    if (T != null && (suggestedPost = T.suggested_post) != null) {
                        org.telegram.messenger.kj b10 = org.telegram.messenger.kj.b(suggestedPost);
                        this.f46250y5 = b10;
                        kc(b10);
                    }
                    fjVar = this.F5;
                    if (fjVar != null || this.f46096m4 == fjVar) {
                        if (message == null && ((fjVar2 = this.f46096m4) == null || fjVar2.e1() != message.f28426id)) {
                            org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = fjVar3;
                            TLRPC.InputReplyTo inputReplyTo2 = T.reply_to;
                            if (inputReplyTo2 != null) {
                                int i21 = inputReplyTo2.flags;
                                if ((i21 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i22 = -1;
                                    if (arrayList != null) {
                                        int i23 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            rmVar3 = rmVar;
                                        } else {
                                            org.telegram.messenger.fj.B0(fjVar3.f23968k);
                                            ?? obj7 = new Object();
                                            obj7.f51651a = fjVar3;
                                            obj7.f51652b = -1;
                                            obj7.f51653c = -1;
                                            obj7.d = -1;
                                            obj7.f51661m = true;
                                            obj7.e(i23, arrayList);
                                            rmVar3 = obj7;
                                        }
                                        this.D5 = rmVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i21 & 16) != 0) {
                                            i22 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = fjVar3.f23968k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.fj.Y(i22, str, str3)) < 0) {
                                            rmVar2 = rmVar;
                                        } else {
                                            org.telegram.messenger.fj.B0(fjVar3.f23968k);
                                            rmVar2 = new rm(Y, str3.length() + Y, fjVar3);
                                        }
                                        this.D5 = rmVar2;
                                    }
                                }
                            }
                            k7(false);
                            rm rmVar4 = this.D5;
                            if (rmVar4 != null) {
                                jc(this.F5, rmVar4);
                            } else {
                                ic(this.F5);
                            }
                            Pc(false);
                            return;
                        } else if (l11 == null && l11.longValue() != j10 && this.f45987e != null && (f10 = getMessagesController().f25771t7.f(this.f45987e.f28405id, l11.longValue())) != null && (message2 = f10.topicStartMessage) != null) {
                            org.telegram.messenger.fj fjVar4 = new org.telegram.messenger.fj(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = fjVar4;
                            fjVar4.f23966j1 = f10;
                            ic(fjVar4);
                            Pc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j10 = 0;
                rmVar = null;
                l11 = l10;
                if (T != null) {
                    org.telegram.messenger.kj b102 = org.telegram.messenger.kj.b(suggestedPost);
                    this.f46250y5 = b102;
                    kc(b102);
                }
                fjVar = this.F5;
                if (fjVar != null) {
                }
                if (message == null) {
                }
                if (l11 == null) {
                }
            }
        }
    }

    public final void N7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.R6;
        if (z10) {
            if (org.telegram.messenger.s2.f26723a) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.Z6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                i5.c.t(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i7 = dialog.top_message;
            int i10 = iArr[0];
            if (i7 > i10) {
                this.V7 = Math.max(i10 + 1, dialog.read_inbox_max_id);
            }
            this.W6[0] = false;
            this.X6 = false;
            kl klVar = this.D0;
            if (klVar != null && klVar.G < 0) {
                klVar.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i11 = dialog2.unread_count;
            this.B6 = i11;
            this.D6 = dialog2.unread_mentions_count;
            if (this.C6 != i11) {
                lh.h hVar = this.f46246y1;
                if (hVar != null) {
                    hVar.c(1, i11, this.f46008f6);
                }
                this.C6 = this.B6;
                dd();
            }
            int i12 = this.D6;
            int i13 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i12 != i13) {
                this.D6 = i13;
                if (i13 <= 0) {
                    this.D6 = 0;
                    this.E6 = true;
                    rc(false);
                } else {
                    lh.h hVar2 = this.f46246y1;
                    if (hVar2 != null) {
                        hVar2.c(2, i13, true);
                    }
                    rc(true);
                }
            }
            p7(false);
            return;
        }
        this.M6.clear();
        this.f46263z6.clear();
        this.J6.clear();
        this.K6.clear();
        this.P6.b();
        this.f46249y4 = false;
        for (int i14 = 1; i14 >= 0; i14--) {
            this.G6[i14].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.Q6;
            if (encryptedChat == null) {
                iArr2[i14] = Integer.MAX_VALUE;
                iArr[i14] = Integer.MIN_VALUE;
            } else {
                iArr2[i14] = Integer.MIN_VALUE;
                iArr[i14] = Integer.MAX_VALUE;
            }
            this.S6[i14] = Integer.MIN_VALUE;
            this.T6[i14] = 0;
            this.f46121o6[i14].clear();
            this.f46134p6[i14].clear();
            this.f46147q6[i14].clear();
        }
        B9();
        gd(0, true);
        if (this.D8 != null) {
            this.D8 = null;
            rj rjVar = this.f45932a0;
            if (rjVar != null) {
                rjVar.x1(null, true, false);
            }
        }
        if (this.R != null) {
            wc(false);
            W7(false);
            this.A0.setEmptyView(this.f46003f1);
        }
        kl klVar2 = this.D0;
        if (klVar2 != null) {
            klVar2.O(false);
        }
        if (this.h == null && (user = this.f46001f) != null && user.bot && this.f46227w8 == null) {
            this.f46227w8 = "";
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
            if (this.f46018g4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.L9 = true;
                kl klVar = this.D0;
                if (klVar != null) {
                    klVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f46085l6, z10, z11, z12, i7, 0, this.f46096m4, -1, j3, j9(), this.f46250y5);
            org.telegram.ui.Components.b5.q0(q02, this, this.Ba);
            if (q02 != 0) {
                org.telegram.messenger.g0.g3(new af(this, 23));
            }
        }
    }

    public final void N9() {
        boolean z10;
        Rect rect;
        if (this.f46093m1 != null) {
            if (this.f46166rb <= 0 && this.f46178sb <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            wi wiVar = this.f46218w;
            float c10 = wiVar.c();
            te.k kVar = wiVar.f56604b;
            int max = (int) Math.max(0.0f, (c10 * kVar.f57683a) - org.telegram.messenger.g0.L(29.0f));
            pl plVar = this.f46093m1;
            bi.i3 i3Var = plVar.M;
            Rect rect2 = this.f46092ld;
            if (i3Var != null) {
                rect2.set(0, 0, plVar.getMeasuredWidth(), this.f46093m1.getMeasuredHeight() - max);
                this.f46093m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.f46093m1.getMeasuredWidth(), this.f46093m1.getMeasuredHeight() - max);
                rect2.offset(0, -this.A0.getTop());
                bj bjVar = this.A0;
                if (bjVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                bjVar.setClipBounds(rect);
            }
            if (this.Z != null) {
                rect2.set(0, 0, this.f46093m1.getMeasuredWidth(), this.f46093m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(wiVar.f56611w, wiVar.c() * kVar.f57683a) - org.telegram.messenger.g0.L(29.0f))));
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
        hi.m3 m3Var = this.K1;
        if (m3Var != null && m3Var.W) {
            m3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        hi.m3 m3Var2 = this.L1;
        if (m3Var2 != null && m3Var2.W) {
            m3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new k9(23, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f29088o0) {
            this.f46040hd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var = this.f46054j0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f46014g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = this.f46002f0;
            if (frVar != null) {
                frVar.b(false);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f46067k0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f46128p0;
            if (r0Var3 != null && this.f46037ha) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f46141q0;
            if (yVar2 != null && this.f46050ia) {
                yVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f46080l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.m0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f46155r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.f46031h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f46044i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f46067k0;
        if (r0Var6 != null) {
            this.Kc = true;
            this.f46072k5 = false;
            r0Var6.G(false);
            this.Kc = false;
        }
        Db(chat, null);
        gd(0, true);
    }

    public final void Nb(org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.q1 q1Var, int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.aj u92 = u9(fjVar);
        boolean z12 = false;
        if (u92 != null) {
            ArrayList arrayList = u92.d;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (this.f46121o6[i7].indexOfKey(((org.telegram.messenger.fj) arrayList.get(i10)).e1()) < 0) {
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
        q1Var.n3(true, z12, z10);
    }

    public final void Nc() {
        TLRPC.User user;
        boolean z10;
        if (this.f46054j0 != null && (user = this.f46001f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f46213v8;
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
                this.f46054j0.T(30);
            } else {
                this.f46054j0.u(30);
            }
            if (z10) {
                this.f46054j0.T(31);
            } else {
                this.f46054j0.u(31);
            }
        }
    }

    public final boolean O6() {
        if (!org.telegram.messenger.v3.u0(this.f45987e)) {
            TLRPC.User user = this.f46001f;
            if (!org.telegram.messenger.o10.v(user) || !user.bot_forum_sidebar) {
                if (!org.telegram.messenger.o10.v(this.f46001f) && !org.telegram.messenger.v3.a(this.f45987e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void O7(boolean z10) {
        for (int i7 = 1; i7 >= 0; i7--) {
            this.f46121o6[i7].clear();
            this.f46134p6[i7].clear();
            this.f46147q6[i7].clear();
        }
        B9();
        gd(0, true);
        Gd(z10);
        td();
    }

    public final int O8() {
        return this.f46018g4;
    }

    public final void O9() {
        this.Oa = true;
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
        org.telegram.ui.ActionBar.r0 r0Var;
        int i10;
        hi.m3 m3Var = this.K1;
        if (m3Var != null && m3Var.W) {
            m3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        hi.m3 m3Var2 = this.L1;
        if (m3Var2 != null && m3Var2.W) {
            m3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new ge(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f29088o0) {
            this.f46040hd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f46054j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f46014g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = this.f46002f0;
            if (frVar != null) {
                frVar.b(false);
            }
            if ((this.f46173s4 == 0 || (i10 = this.f46018g4) == 3 || i10 == 8) && (r0Var = this.f46067k0) != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f46128p0;
            if (r0Var3 != null && this.f46037ha) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f46141q0;
            if (yVar2 != null && this.f46050ia) {
                yVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f46080l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.m0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f46155r0 = true;
            nd(0, 0, -1);
            Pc(false);
        }
        if ((this.f46173s4 == 0 || this.f46236x4 || (i7 = this.f46018g4) == 3 || i7 == 8) && !org.telegram.messenger.o10.A(this.f46001f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f46072k5 = z11;
            org.telegram.ui.ActionBar.r0 r0Var6 = this.f46067k0;
            if (r0Var6 != null) {
                r0Var6.G(z11);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var7 = this.f46067k0;
        if (r0Var7 != null) {
            r0Var7.Q(str, false);
        }
        org.telegram.messenger.ri mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.I3 = str2;
        mediaDataController.c2(str2, this.f46085l6, this.f45981d7, this.classGuid, 0, this.f46173s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        gd(0, true);
    }

    public final void Ob(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.Ba != null && this.f46267za == null) {
            ig.b c10 = ig.b.c(chatTheme);
            org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.currentAccount);
            f10.s(this.f46085l6, ig.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f10.p(chatTheme);
                org.telegram.ui.ActionBar.t3 i7 = f10.i(c10);
                if (i7 == null) {
                    i7 = new org.telegram.ui.ActionBar.t3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i7.k();
                    i7.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.t3 t3Var = i7;
                zm zmVar = this.Ba;
                TLRPC.WallPaper wallPaper = zmVar.f54538g;
                if (this.f46034h6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zmVar.r(t3Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                ee eeVar = new ee(this, 14);
                String str = c10.f16250b;
                if (c10.b()) {
                    eeVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.t3 t3Var2 = (org.telegram.ui.ActionBar.t3) f10.f23836e.get(str);
                    if (t3Var2 != null) {
                        t3Var2.k();
                        eeVar.onComplete(t3Var2);
                    } else {
                        eeVar.onComplete(null);
                    }
                } else {
                    f10.q(new org.telegram.messenger.e4(c10, eeVar), false);
                }
            }
            TLRPC.WallPaper d = f10.d(this.f46085l6);
            zm zmVar2 = this.Ba;
            org.telegram.ui.ActionBar.t3 t3Var3 = zmVar2.f54537f;
            if (this.f46034h6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zmVar2.r(t3Var3, d, z10, null, false);
        }
    }

    public final void Oc() {
        if (this.f46016g2 == null) {
            return;
        }
        this.f46016g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(5.0f)) + this.f46218w.d());
    }

    @Override
    public final boolean P(cx cxVar) {
        return false;
    }

    public final int P6(int i7) {
        org.telegram.messenger.fj messageObject;
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
            } else if (T0 instanceof org.telegram.ui.Cells.u0) {
                messageObject = ((org.telegram.ui.Cells.u0) T0).getMessageObject();
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
        this.f46036h9 = z10;
        org.telegram.ui.ActionBar.h1 h1Var = this.f46023g9;
        if (h1Var != null) {
            h1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.Ic;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Ic.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Ic = ofFloat;
            ofFloat.addUpdateListener(new be(this, 0));
            this.Ic.setDuration(150L);
            this.Ic.start();
        }
    }

    public final r0.l1 P8(r0.l1 l1Var) {
        fi.n2 n2Var;
        r0.a1 w0Var;
        if (l1Var != null && (n2Var = this.Y1) != null) {
            if ((n2Var.isShowing() && !this.Y1.J) || this.Y1.f39716s2) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    w0Var = new r0.z0(l1Var);
                } else if (i7 >= 30) {
                    w0Var = new r0.y0(l1Var);
                } else if (i7 >= 29) {
                    w0Var = new r0.x0(l1Var);
                } else {
                    w0Var = new r0.w0(l1Var);
                }
                w0Var.c(8, i0.b.f15891e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return l1Var;
        }
        return l1Var;
    }

    public final void P9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f46001f) != null && user.contact_require_premium) {
            boolean isEmpty = this.M6.isEmpty();
            if (getMessagesController().P2(a()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty != z10) {
                getMessagesController().p2(this.classGuid, a());
            }
        }
    }

    public final void Pa(TLRPC.User user) {
        boolean z10;
        hi.m3 m3Var = this.K1;
        if (m3Var != null && m3Var.W) {
            m3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        hi.m3 m3Var2 = this.L1;
        if (m3Var2 != null && m3Var2.W) {
            m3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new gg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f29088o0) {
            this.f46040hd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var = this.f46054j0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f46014g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = this.f46002f0;
            if (frVar != null) {
                frVar.b(false);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f46067k0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f46128p0;
            if (r0Var3 != null && this.f46037ha) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f46141q0;
            if (yVar2 != null && this.f46050ia) {
                yVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f46080l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.m0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f46155r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.f46031h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f46044i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f46067k0;
        if (r0Var6 != null) {
            this.Kc = true;
            this.f46072k5 = false;
            r0Var6.G(false);
            this.Kc = false;
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
        if (view != this.A0 && view != this.f46093m1) {
            view.setEnabled(z10);
        }
    }

    public final void Pc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Pc(boolean):void");
    }

    public final float Q6(boolean z10) {
        float f10;
        float f11;
        float f12;
        rj rjVar = this.f45932a0;
        float f13 = 0.0f;
        if (rjVar != null) {
            if (z10) {
                f10 = rjVar.f32619j7;
            } else {
                f10 = rjVar.i7;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, org.telegram.messenger.g0.L(44.0f));
        float L = org.telegram.messenger.g0.L(44.0f);
        te.a aVar = this.f46000ed;
        m6.n nVar = this.f46066jd;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(nVar.f20881a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(nVar.f20881a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f57658f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) nVar.f20882b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f57657e;
            f12 = f14;
        }
        if (!this.mb && !isInPreviewMode()) {
            return org.telegram.messenger.g0.T1(Math.max(org.telegram.messenger.g0.T1(L, max, f12) * f11, org.telegram.messenger.g0.L(44.0f)), -org.telegram.messenger.g0.L(7.0f), f13);
        }
        return org.telegram.messenger.g0.T1(L, max, f12) * f11;
    }

    public final long Q7(org.telegram.messenger.fj fjVar) {
        if (this.f46018g4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.v3.c0(this.f45987e) && !this.f46236x4 && fjVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = fjVar.f23966j1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f28457id;
            }
            return org.telegram.messenger.fj.b2(this.currentAccount, fjVar.f23968k, org.telegram.messenger.v3.c0(this.f45987e), false);
        }
        return this.f46173s4;
    }

    public final TLRPC.ChatFull Q8() {
        return this.f46163r8;
    }

    public final boolean Q9() {
        if (this.f46016g2 != null && this.f46173s4 == 0) {
            return true;
        }
        return false;
    }

    public final void Qa(long j3) {
        int i7 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f46129p1.e(true, false);
            } else if (getMessagesController().s2(j3)) {
                showDialog(new li.d0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().E(bundle, this, null, null)) {
                    presentFragment(new bn(bundle));
                }
            }
        } else if (j3 != getUserConfig().e()) {
            if (j3 == a()) {
                this.f46129p1.e(true, false);
                return;
            }
            Bundle j10 = a8.p0.j(j3, "user_id");
            if (this.h != null && j3 == this.f46001f.f28554id) {
                j10.putLong("dialog_id", this.f46085l6);
            }
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            TLRPC.User user = this.f46001f;
            if (user != null && user.f28554id == j3) {
                i7 = 1;
            }
            profileActivity.j5(i7);
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

    public final boolean R6(org.telegram.messenger.fj fjVar) {
        if (!W9()) {
            TLRPC.Message message = fjVar.f23968k;
            if ((message == null || !message.noforwards) && !fjVar.g4() && !fjVar.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TLRPC.UserFull R8() {
        return this.f46176s8;
    }

    public final void Ra(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r10 = org.telegram.messenger.zy.r(1, str);
            PhotoViewer.p1().I2(null, this, this.Ba);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, 0, true, 0, 0);
            efVar.f27848a = charSequence;
            arrayList.add(efVar);
            if (PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, false);
            }
            PhotoViewer.p1().f2(arrayList, 0, 0, false, new wk(this, r10, arrayList), this);
            return;
        }
        D8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j3 = this.f46085l6;
        org.telegram.messenger.fj fjVar = this.F5;
        org.telegram.messenger.fj fjVar2 = this.f46096m4;
        rm rmVar = this.D5;
        org.telegram.messenger.zy.b0(0, 0, 0, j3, 0L, 0L, j9(), null, str, null, null, accountInstance, fjVar, fjVar2, this.H5, this.f46250y5, Y8(), null, null, null, rmVar, true, false, false);
        L6();
    }

    public final void Rb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Rb(boolean, boolean, boolean):void");
    }

    public final void Rc() {
        int i7;
        org.telegram.ui.Components.lb lbVar;
        ck ckVar;
        rj rjVar;
        if (this.f45942aa && this.A0 != null) {
            float f10 = 0.0f;
            if (this.Ma <= 0 || this.f45958bb != 0.0f) {
                float s9 = s9(org.telegram.messenger.g0.L(7.0f));
                bk bkVar = this.D1;
                if (bkVar != null) {
                    i7 = org.telegram.messenger.g0.L(bkVar.F * 35.0f);
                } else {
                    i7 = 0;
                }
                float V8 = (V8() * org.telegram.messenger.g0.L(43.0f)) + s9 + i7;
                float f11 = this.P9;
                this.Q9 = V8;
                this.P9 = t9(org.telegram.ui.Components.v11.f40475a) + org.telegram.messenger.g0.L(4.0f) + this.S9 + V8;
                if (this.actionBar.getVisibility() == 0 || this.Aa != null) {
                    this.P9 += this.actionBar.getMeasuredHeight();
                }
                this.R9 = 0;
                this.P9 = this.P9 + this.Xa + this.T9;
                if (this.f45958bb != 0.0f && (rjVar = this.f45932a0) != null && rjVar.getVisibility() == 0) {
                    float f12 = this.P9;
                    float measuredHeight = this.f45958bb * (this.f45932a0.getMeasuredHeight() - org.telegram.messenger.g0.L(44.0f));
                    this.P9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.u0 u0Var = this.f46119o3;
                if (u0Var != null) {
                    u0Var.setTranslationY(((this.A0.getTranslationY() + this.P9) + this.X9) - org.telegram.messenger.g0.L(30.0f));
                    float f13 = this.P9;
                    float f14 = this.X9;
                    this.P9 = f13 + f14;
                    this.R9 = (int) (this.R9 + f14);
                }
                jj jjVar = this.f46095m3;
                if (jjVar != null) {
                    jjVar.setTranslationY((((this.A0.getTranslationY() - f10) + this.P9) + this.V9) - org.telegram.messenger.g0.L(4.0f));
                }
                Tc();
                bj bjVar = this.A0;
                if (bjVar != null && this.C0 != null && this.D0 != null) {
                    int paddingTop = bjVar.getPaddingTop();
                    int paddingBottom = this.A0.getPaddingBottom();
                    C7();
                    if (this.A0.getPaddingTop() != paddingTop || this.A0.getPaddingBottom() != paddingBottom) {
                        O9();
                    }
                    this.A0.setTopGlowOffset((int) ((this.P9 - this.R9) - org.telegram.messenger.g0.L(4.0f)));
                    if (f11 != this.P9) {
                        int childCount = this.A0.getChildCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            }
                            View childAt = this.A0.getChildAt(i10);
                            this.A0.getClass();
                            if (RecyclerView.R(childAt) == this.D0.b() - 1) {
                                float f15 = this.P9;
                                if (childAt.getTop() > f15) {
                                    this.A0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!fa() && !this.R4 && this.f45955b8 != null && this.A0 != null && ((ckVar = this.f45990e2) == null || ckVar.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f11 - this.P9));
                    }
                }
                this.f45942aa = false;
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
                if (gcVar != null && (lbVar = gcVar.f35457e) != null) {
                    lbVar.updatePosition();
                }
                C7();
            }
        }
    }

    public final boolean S6() {
        if (!X9() && !getMessagesController().E2(a())) {
            if ((!getMessagesController().y2(a()) || this.f46236x4) && getMessagesController().P1(a()) <= 0 && this.h == null) {
                vj vjVar = this.f45976d1;
                if (vjVar == null || vjVar.getVisibility() != 0) {
                    if (!fa() || this.f46236x4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.S7():void");
    }

    public final ArrayList S8() {
        kl klVar = this.D0;
        if (klVar != null) {
            return klVar.Q;
        }
        return null;
    }

    public final boolean S9() {
        if (!org.telegram.messenger.bz.H0 && !this.f46243xb) {
            return false;
        }
        return true;
    }

    public final void Sa() {
        this.f46020g6 = true;
        this.fragmentBeginToShow = true;
        this.f46177sa = null;
        this.f46093m1.invalidate();
        this.f46093m1.setSkipBackgroundDrawing(false);
        this.f46138pa = false;
        this.fragmentView.setAlpha(1.0f);
        this.f46129p1.setTranslationY(0.0f);
        this.f46129p1.getAvatarImageView().setScaleX(1.0f);
        this.f46129p1.getAvatarImageView().setScaleY(1.0f);
        this.f46129p1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Sb(int i7, int i10, String str) {
        this.f45982d8 = i7;
        this.f46010f8 = true;
        this.f46022g8 = 0L;
        this.f46035h8 = str;
        this.f46075k8 = i10;
        this.f45996e8 = true;
    }

    public final void Sc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        org.telegram.messenger.aj ajVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.fj fjVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.ri.d0(this.currentAccount).Z0);
        if (this.f46230wb == null) {
            this.f46230wb = new a0.h();
        }
        a0.h hVar2 = this.f46216vb;
        if (hVar2 == null) {
            this.f46216vb = new a0.h();
        } else {
            hVar2.b();
        }
        this.D0.Q.clear();
        this.f46230wb.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i7 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.P6;
            arrayList = this.M6;
            z11 = true;
            if (i7 >= size) {
                break;
            }
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                    if (org.telegram.messenger.fj.B0(fjVar.f23968k) == org.telegram.messenger.fj.B0(fjVar2.f23968k) && fjVar.e1() == fjVar2.e1()) {
                        break;
                    }
                    i10++;
                } else {
                    fjVar = null;
                    break;
                }
            }
            if (fjVar2.f23978m1 == 0) {
                if (fjVar == null) {
                    fjVar2.K(true);
                } else {
                    fjVar2.f24027z0 = fjVar.f24027z0;
                    fjVar2.f24023y0 = fjVar.f24023y0;
                }
            }
            if (fjVar != null) {
                fjVar2.f23982n2 = fjVar.f23982n2;
                if (this.D0.O && fjVar2.f23978m1 != 0) {
                    fjVar.N(fjVar2);
                } else {
                    fjVar2.N(fjVar);
                }
            } else if (fjVar2.f23978m1 == 0) {
                int i11 = f45924od;
                f45924od = i11 + 1;
                fjVar2.f23978m1 = i11;
            }
            fjVar2.W2 = null;
            TLRPC.Message message2 = fjVar2.f23968k;
            if (message2 != null) {
                message2.out = true;
            }
            fjVar2.P3();
            if (fjVar2.z2()) {
                org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) hVar.f(fjVar2.d1());
                if (ajVar2 == null) {
                    ajVar2 = new org.telegram.messenger.aj();
                    ajVar2.f22909n = this.f46114nb;
                    long c12 = fjVar2.c1();
                    ajVar2.f22898a = c12;
                    hVar.k(ajVar2, c12);
                } else if (hVar3 == null || hVar3.h(fjVar2.c1()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(ajVar2, fjVar2.c1());
                }
                ArrayList arrayList3 = ajVar2.d;
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(ajVar2, ajVar2.f22898a);
                if (ajVar2.d(fjVar2) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList3.size()) {
                            if (((org.telegram.messenger.fj) arrayList3.get(i12)).e1() == fjVar2.e1()) {
                                break;
                            }
                            i12++;
                        } else {
                            arrayList3.add(fjVar2);
                            break;
                        }
                    }
                }
            } else if (fjVar2.d1() != 0) {
                fjVar2.f23968k.grouped_id = 0L;
                fjVar2.f23940e = 0L;
            }
            this.D0.Q.add(fjVar2);
            this.f46230wb.k(fjVar2, fjVar2.e1());
            i7++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                org.telegram.messenger.aj ajVar3 = (org.telegram.messenger.aj) hVar3.n(i13);
                Collections.sort(ajVar3.d, new org.telegram.messenger.dl(29));
                ajVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i14);
                if (fjVar3 != null && (message = fjVar3.f23968k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= fjVar3.f23968k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(fjVar3.f23968k.reactions.results.get(i15).reaction)) {
                            arrayList4.add(fjVar3);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
            org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) arrayList4.get(i16);
            if (!this.f46230wb.d(fjVar4.e1())) {
                fjVar4.W2 = null;
                TLRPC.Message message3 = fjVar4.f23968k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(fjVar4);
                this.f46230wb.k(fjVar4, fjVar4.e1());
            }
        }
        int i17 = 0;
        while (i17 < this.D0.Q.size()) {
            org.telegram.messenger.fj fjVar5 = (org.telegram.messenger.fj) this.D0.Q.get(i17);
            if (fjVar5.z2() && (ajVar = (org.telegram.messenger.aj) hVar.f(fjVar5.c1())) != null) {
                ArrayList arrayList5 = ajVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.fj fjVar6 = (org.telegram.messenger.fj) arrayList5.get(size2);
                    if (fjVar6 != fjVar5 && !this.f46230wb.d(fjVar6.e1())) {
                        this.D0.Q.add(i17, fjVar6);
                        this.f46230wb.k(fjVar6, fjVar6.e1());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.D0.Q, new pe(0));
        org.telegram.messenger.fj fjVar7 = null;
        int i18 = 0;
        while (i18 < this.D0.Q.size()) {
            org.telegram.messenger.fj fjVar8 = (org.telegram.messenger.fj) this.D0.Q.get(i18);
            if (this.f46114nb && fjVar8 != null && i18 == 0) {
                fb(i18, fjVar8);
                i18++;
            }
            if (!this.f46114nb && fjVar7 != null && fjVar8.X != fjVar7.X) {
                fb(i18, fjVar7);
                i18++;
            }
            a0.h hVar5 = this.f46216vb;
            int i19 = fjVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i19);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.f3.h(this.f46216vb, i19);
            }
            arrayList6.add(fjVar8);
            if (this.f46114nb && fjVar7 != null && i19 != fjVar7.X) {
                fb(i18, fjVar8);
                i18++;
            }
            if (!this.f46114nb && i18 >= this.D0.Q.size() - 1) {
                fb(this.D0.Q.size(), fjVar8);
                i18++;
            }
            i18++;
            fjVar7 = fjVar8;
        }
        this.D0.P = org.telegram.messenger.ri.d0(this.currentAccount).b2();
        if (z10) {
            this.D0.T();
            this.D0.O(true);
            if (this.D0.O ? getMediaDataController().M0 == 0 || !this.D0.Q.isEmpty() : !this.Y6 || !arrayList.isEmpty() || this.D0.f49299x >= 0) {
                z11 = false;
            }
            wc(z11);
            if (this.A0 != null) {
                W7(false);
                if (this.D0.O ? !(getMediaDataController().M0 == 0 && this.D0.Q.isEmpty()) : !(!this.Y6 && arrayList.isEmpty() && this.D0.f49299x < 0)) {
                    this.f46003f1.setVisibility(8);
                    this.A0.setEmptyView(null);
                    return;
                }
                this.A0.setEmptyView(this.f46003f1);
                bj bjVar = this.A0;
                bjVar.K0(bjVar.w1());
            }
        }
    }

    public final boolean T6() {
        if (this.h == null) {
            vj vjVar = this.f45976d1;
            if (vjVar == null || vjVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T7() {
        if (this.f46004f2 == null && getParentActivity() != null) {
            f8();
            if (this.f45948b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f46004f2 = textView;
                textView.setGravity(17);
                this.f46004f2.setTextSize(1, 14.0f);
                this.f46004f2.setTypeface(org.telegram.messenger.g0.o());
                TextView textView2 = this.f46004f2;
                int i7 = org.telegram.ui.ActionBar.n6.Fi;
                org.telegram.ui.ActionBar.u6.U(textView2, i7, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(2131232479, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131745321, null));
                this.f46004f2.setText(spannableStringBuilder);
                TextView textView3 = this.f46004f2;
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i7));
                int L = org.telegram.messenger.g0.L(3.0f);
                org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(15.0f), r12, L, L, L, L), null, org.telegram.ui.ActionBar.u6.K(0.1f, i7), getResourceProvider());
                this.f46004f2.setOnClickListener(new oe(this, 20));
                c8.ra.b(this.f46004f2, 0.04f, 1.5f);
                this.f45948b1.addView(this.f46004f2, c8.ma.r(-1, 36, 83));
                this.f45948b1.i(12, this.f46004f2);
                this.f45948b1.h(this.f46004f2);
            }
        }
    }

    public final ri.q T8() {
        bn bnVar = this.Aa;
        if (bnVar != null) {
            return bnVar.T8();
        }
        return this.glassEngine;
    }

    public final boolean T9() {
        if (!org.telegram.messenger.v3.c0(this.f45987e) || this.f46236x4) {
            if (org.telegram.messenger.v3.p0(this.f45987e) && d() == 0 && !this.f46045i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Ta(long j3, boolean z10) {
        if (this.f46016g2 != null && org.telegram.messenger.o10.v(this.f46001f)) {
            this.f46016g2.setAllTopicsHidden(true);
        }
        this.f45994e6.put(j3, 1);
        h8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f46085l6, 0, new og(this, j3, z10), new bg.k0(this, j3, 3));
        this.D0.O(false);
    }

    public final void Tb(long j3) {
        this.f46173s4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28426id = (int) j3;
        new org.telegram.messenger.fj(this.currentAccount, tL_message, false, false);
    }

    public final void Tc() {
        int i7;
        hj hjVar = this.f46106n3;
        if (hjVar == null) {
            return;
        }
        hjVar.setTranslationX(n9() / 2.0f);
        this.f46106n3.setTranslationY((((this.A0.getTranslationY() + this.P9) + this.W9) - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(28.0f));
        float i10 = Utilities.i(org.telegram.messenger.g0.z1(this.W9, -this.f46106n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f46106n3.setAlpha(this.f46235x3 * i10);
        hj hjVar2 = this.f46106n3;
        if (this.f46235x3 * i10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        hjVar2.setVisibility(i7);
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i10);
        this.f46106n3.setScaleX(T1);
        this.f46106n3.setScaleY(T1);
    }

    public final boolean U6(org.telegram.messenger.fj fjVar) {
        if (this.f46018g4 != 8) {
            if (fjVar != null && org.telegram.messenger.v3.c0(this.f45987e)) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25771t7.f(this.f45987e.f28405id, org.telegram.messenger.fj.b2(this.currentAccount, fjVar.f23968k, true, false));
                if (this.f46018g4 == 8 || (f10 != null && (!f10.closed || org.telegram.messenger.v3.i(this.currentAccount, this.f45987e, f10)))) {
                    return true;
                }
                return false;
            } else if (fjVar == null || !org.telegram.messenger.v3.p0(this.f45987e) || !org.telegram.messenger.v3.A(this.currentAccount, this.f45987e, 24) || org.telegram.messenger.fj.u1(fjVar.f23968k) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void U7() {
        if (getParentActivity() != null && getParentActivity() != null && this.Y1 == null) {
            fi.n2 n2Var = new fi.n2(this, getParentActivity(), this, this.Ba, 2);
            this.Y1 = n2Var;
            n2Var.U1 = a();
            fi.n2 n2Var2 = this.Y1;
            n2Var2.d2 = true;
            n2Var2.X3 = new tk(this);
        }
    }

    public final org.telegram.messenger.aj U8(long j3) {
        return (org.telegram.messenger.aj) this.P6.f(j3);
    }

    public final boolean U9() {
        return org.telegram.messenger.o10.v(this.f46001f);
    }

    public final boolean Ua() {
        if (this.V4.size() != 1 || this.f46107n4 == null || ((Integer) this.V4.get(0)).intValue() != this.f46107n4.e1()) {
            return false;
        }
        return true;
    }

    public final void Ub(View view) {
        View view2 = this.Z8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.u0)) {
                ((org.telegram.ui.Cells.u0) view2).setInvalidateWithParent(null);
            }
            this.Z8 = view;
            if (view instanceof org.telegram.ui.Cells.u0) {
                ((org.telegram.ui.Cells.u0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Uc() {
        boolean z10;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f46176s8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f46176s8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46015g1 != null) {
            if (z10 && this.f46042i1 == null) {
                ai aiVar = new ai(getParentActivity(), getResourceProvider(), this);
                this.f46042i1 = aiVar;
                c8.ra.b(aiVar, 0.02f, 1.2f);
                this.f46042i1.setOnClickListener(new oe(this, 11));
            }
            ai aiVar2 = this.f46042i1;
            if (aiVar2 != null) {
                if (!z10) {
                    aiVar2.setVisibility(8);
                    return;
                }
                aiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f46176s8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f46176s8.business_intro.title)) {
                    i7 = 2131749309;
                } else {
                    i7 = 2131749310;
                }
                String a02 = org.telegram.messenger.gd.a0(null, null, i7, org.telegram.messenger.o10.k(this.f46001f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        xw0 xw0Var = new xw0(a02.substring(indexOf, indexOf2));
                        if (xw0Var.f53959c != -1) {
                            xw0Var.f53959c = -1;
                            xw0Var.invalidateSelf();
                        }
                        xw0Var.a(503316480);
                        xw0Var.setBounds(0, 0, xw0Var.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(xw0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f46042i1.setCustomText(spannableStringBuilder);
                this.f46042i1.setOverrideTextMaxWidth(hi.m3.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f46042i1.getParent() != null && (!z10 || this.f46042i1.getParent() != this.f46015g1)) {
                    ((ViewGroup) this.f46042i1.getParent()).removeView(this.f46042i1);
                }
                if (z10) {
                    ViewParent parent = this.f46042i1.getParent();
                    LinearLayout linearLayout = this.f46015g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f46042i1, c8.ma.t(-1, -2, 80, 0, 10, 0, 0));
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f45987e != null && (this.f46018g4 != 0 || this.f46173s4 != 0 || (chatFull = this.f46163r8) == null || chatFull.ttl_period == 0)) || ((user = this.f46001f) != null && (org.telegram.messenger.o10.y(user) || (this.h == null && ((userFull = this.f46176s8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.p0 p0Var = this.f45988e0;
            if (p0Var != null) {
                p0Var.e(8);
            }
            vi viVar = this.f46129p1;
            if (viVar != null) {
                viVar.f33374a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.p0 p0Var2 = this.f45988e0;
            if (p0Var2 != null) {
                p0Var2.e(0);
            }
            vi viVar2 = this.f46129p1;
            if (viVar2 != null) {
                viVar2.f33374a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.p0 p0Var3 = this.f46205v0;
        if (p0Var3 != null) {
            TLRPC.Chat chat = this.f45987e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p0Var3.e(i10);
        }
        vi viVar3 = this.f46129p1;
        if (viVar3 != null) {
            TLRPC.Chat chat2 = this.f45987e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f46001f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            viVar3.setCommunityItemVisible(z11);
            final vi viVar4 = this.f46129p1;
            TLRPC.Chat chat3 = this.f45987e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = viVar4.F;
            ImageView imageView2 = viVar4.E;
            if (imageView2 != null && imageView != null) {
                viVar4.f33392n0 = z12;
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
                                    ao aoVar = viVar4;
                                    if (!z14) {
                                        aoVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    ao aoVar2 = viVar4;
                                    if (!z15) {
                                        aoVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar2.getClass();
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
                                    ao aoVar = viVar4;
                                    if (!z14) {
                                        aoVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    ao aoVar2 = viVar4;
                                    if (!z15) {
                                        aoVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f46129p1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f46176s8;
                if (userFull2 != null) {
                    this.f46129p1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f46163r8;
                    if (chatFull3 != null) {
                        this.f46129p1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f46192u0 != null && (chatFull2 = this.f46163r8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.v3.T(this.f45987e)) {
                TLRPC.Chat chat4 = this.f45987e;
                if (!chat4.megagroup || org.telegram.messenger.v3.t0(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.p0 p0Var4 = this.f46192u0;
            if (z13) {
                i11 = 0;
            }
            p0Var4.e(i11);
        }
        s();
    }

    public final void V7(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, boolean z10) {
        vf vfVar;
        if (fjVar == null) {
            SparseArray[] sparseArrayArr = this.f46121o6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f46001f;
        TLRPC.Chat chat = this.f45987e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f46163r8;
        long j3 = this.f45981d7;
        int d = (int) d();
        int i7 = this.f46018g4;
        af afVar = new af(this, 29);
        if (z10) {
            vfVar = new vf(this, 0);
        } else {
            vfVar = null;
        }
        vf vfVar2 = vfVar;
        org.telegram.ui.Components.b5.y(this, user, chat, encryptedChat, chatFull, j3, fjVar, this.f46121o6, ajVar, d, i7, null, afVar, vfVar2, this.Ba);
    }

    public final float V8() {
        bn bnVar = this.Aa;
        if (bnVar == null) {
            bnVar = this;
        }
        oj ojVar = bnVar.E1;
        if (ojVar == null) {
            return 0.0f;
        }
        return ojVar.f40062b;
    }

    public boolean V9() {
        if (this.f46093m1.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Va() {
        org.telegram.ui.Cells.q1 q1Var;
        this.f46000ed.a(false, true);
        sh.c cVar = this.f46079kd;
        if (cVar != null && (q1Var = cVar.f57427n) != null && q1Var.getDelegate() != null) {
            cVar.f57427n.getDelegate().F1(cVar.f57427n, false);
        }
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            rjVar.t1(true, true, false);
            this.f45932a0.S6 = null;
        }
    }

    public final void Vb(ArrayList arrayList, TLRPC.Chat chat, int i7, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f46159r4 = tL_forumTopic;
        this.f46132p4 = arrayList;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
        this.f46096m4 = fjVar;
        this.F5 = fjVar;
        this.A4 = i10;
        this.B4 = i11;
        this.C4 = Math.max(1, i10);
        this.f46173s4 = this.f46096m4.e1();
        this.f46184t4 = i7;
        this.f46196u4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46236x4 = z10;
        org.telegram.messenger.fj fjVar2 = this.F5;
        TLRPC.MessageFwdHeader messageFwdHeader = fjVar2.f23968k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46209v4 = z11;
        if (z10) {
            fjVar2.f23987p = true;
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
        if (this.f46029h1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.v3.p0(this.f45987e)) {
            if (this.f45987e != null) {
                chat = getMessagesController().x1(this.f45987e.f28405id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f45987e) != null && !org.telegram.messenger.v3.A(this.currentAccount, chat2, 24)) {
                final long j10 = this.f45987e.send_paid_messages_stars;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 > 0) {
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131744114, org.telegram.messenger.n5.t(-chat.f28405id), org.telegram.messenger.gd.E(j10, ','));
                } else {
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131744097, org.telegram.messenger.n5.t(-chat.f28405id));
                }
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(di.pb.U0(a02, 1.0f, null));
                if (i11 > 0) {
                    str = org.telegram.messenger.gd.M0(2131748280, null);
                }
                this.f46029h1.c(true, true, U2, str, new View.OnClickListener(this) {
                    public final bn f50170b;

                    {
                        this.f50170b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                bn.d0(j10, this.f50170b);
                                return;
                            default:
                                bn.y0(j10, this.f50170b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f46029h1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f46176s8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.go goVar = this.f46029h1;
                boolean z11 = !getUserConfig().q();
                if (getMessagesController().K3()) {
                    i10 = 2131748389;
                } else {
                    i10 = 2131748390;
                }
                goVar.c(z11, false, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i10, org.telegram.messenger.n5.t(this.f46085l6))), org.telegram.messenger.gd.M0(2131748346, null), new bi.o(13));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.go goVar2 = this.f46029h1;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                goVar2.c(z10, false, org.telegram.messenger.g0.U2(di.pb.U0(org.telegram.messenger.gd.a0(null, null, 2131748388, org.telegram.messenger.n5.t(this.f46085l6), org.telegram.messenger.gd.E(this.f46176s8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.gd.M0(2131748280, null), new View.OnClickListener(this) {
                    public final bn f50170b;

                    {
                        this.f50170b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                bn.d0(j3, this.f50170b);
                                return;
                            default:
                                bn.y0(j3, this.f50170b);
                                return;
                        }
                    }
                });
            } else {
                this.f46029h1.c(false, false, null, null, null);
            }
        } else {
            this.f46029h1.c(false, false, null, null, null);
        }
    }

    public final void W6() {
        if (this.mb) {
            return;
        }
        if (Y9()) {
            org.telegram.messenger.g0.Y2(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
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
        if ((this.f46003f1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f46003f1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f46003f1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.f46093m1.addView(this.f46003f1, 3, c8.ma.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f46003f1.setTranslationX(n9() / 2.0f);
            int i10 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.f46143q2 = textView;
                textView.setText(org.telegram.messenger.gd.M0(2131748018, null));
                this.f46143q2.setTextSize(1, 14.0f);
                this.f46143q2.setGravity(17);
                org.telegram.ui.ActionBar.u6.U(this.f46143q2, org.telegram.ui.ActionBar.n6.Zc, getResourceProvider());
                this.f46143q2.setBackground(new org.telegram.ui.ActionBar.y5(this.f46143q2, this.f46093m1, org.telegram.messenger.g0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f46143q2.setTypeface(org.telegram.messenger.g0.o());
                this.f46143q2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(3.0f));
                this.f46003f1.addView(this.f46143q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (X9()) {
                kg.x1 x1Var = new kg.x1(getParentActivity(), this.f46018g4, this.f46173s4, this.f46006f4, getResourceProvider());
                this.f46055j1 = x1Var;
                int L = org.telegram.messenger.g0.L(24.0f);
                kg.x1 x1Var2 = this.f46055j1;
                pl plVar = this.f46093m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.n6.f29331a;
                x1Var.setBackground(new org.telegram.ui.ActionBar.y5(x1Var2, plVar, L, themedPaint));
                this.f46003f1.addView(this.f46055j1, c8.ma.e(-2, -2, 17));
                this.l1.d(this.f46055j1, this.f46093m1, new org.telegram.messenger.ed(26), false);
            } else if (this.f46018g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f45992e4;
                org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.n6.Zc;
                org.telegram.ui.ActionBar.n6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.n6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, c8.ma.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131752691, null)));
                linearLayout.addView(textView2, c8.ma.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.u6.U(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                kg.y[] yVarArr = kg.y.f18536e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.n6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                textView3.setOnClickListener(new ai.v2(25, tL_businessChatLink, this));
                linearLayout.addView(textView3, c8.ma.t(-2, -2, 49, 17, 0, 17, 17));
                this.f46068k1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.y5(this.f46068k1, this.f46093m1, org.telegram.messenger.g0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f46003f1.addView(this.f46068k1, c8.ma.e(-2, -2, 17));
            } else if ((this.Y9 != null && this.f46001f != null && !this.f46103n) || (this.f46176s8 != null && a() != getUserConfig().e() && ((this.f46176s8.contact_require_premium && !getUserConfig().q()) || this.f46176s8.send_paid_messages_stars > di.x8.y(this.currentAccount, false).p().amount))) {
                this.f46029h1 = new yh(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                Vc();
                this.f46029h1.setListener(new ee(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f46015g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f46015g1.setGravity(17);
                this.f46015g1.addView(this.f46029h1, c8.ma.e(-2, -2, 17));
                this.f46003f1.addView(this.f46015g1, c8.ma.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f46176s8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f46029h1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f46029h1.setSticker(this.f46176s8.business_intro.sticker);
                }
                Uc();
            } else if (this.h == null) {
                if (this.f46236x4 && this.f46018g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    pl plVar2 = this.f46093m1;
                    zm zmVar = this.Ba;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.g0.L(18.0f);
                    if (zmVar != null) {
                        paint = zmVar.g("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.n6.f29331a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.y5(linearLayout3, plVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity2);
                    if (org.telegram.ui.ActionBar.n6.i1(zmVar)) {
                        i7 = org.telegram.ui.ActionBar.n6.Ja;
                    } else {
                        i7 = org.telegram.ui.ActionBar.n6.Zc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.n10.p(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.u6.U(textView4, i7, zmVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
                    textView4.setText(org.telegram.messenger.gd.M0(2131754270, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.u6.U(textView5, i7, zmVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
                    textView5.setText(org.telegram.messenger.gd.M0(2131743784, null));
                    linearLayout3.addView(q9Var, c8.ma.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, c8.ma.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, c8.ma.r(-2, -2, 1));
                    TLRPC.Document V = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).V("🥳");
                    if (V != null) {
                        org.telegram.messenger.lz d = org.telegram.messenger.u5.d(V.thumbs, org.telegram.ui.ActionBar.n6.f29379c7, 0.2f, false);
                        if (d != null) {
                            d.f25488e = 512;
                            d.f25489f = 512;
                        }
                        q9Var.k(org.telegram.messenger.fc.b(V), null, "tgs", d, null);
                    }
                    this.f46003f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!fa() && this.f46018g4 == 0 && (((user2 = this.f46001f) != null && user2.self) || ((chat = this.f45987e) != null && chat.creator && !org.telegram.messenger.v3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    pl plVar3 = this.f46093m1;
                    if (this.f45987e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(parentActivity3, plVar3, i10, this.Ba);
                    this.n1 = boVar;
                    this.f46003f1.addView(boVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f45987e != null) {
                        this.n1.setStatusText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749246, null)));
                    }
                } else {
                    if (fa() && this.f46018g4 == 0) {
                        str = this.f46209v4 ? org.telegram.messenger.gd.M0(2131748034, null) : org.telegram.messenger.gd.M0(2131747976, null);
                    } else if (this.f46018g4 == 1) {
                        str = org.telegram.messenger.gd.M0(2131747969, null);
                    } else {
                        TLRPC.User user3 = this.f46001f;
                        if (user3 != null) {
                            long j3 = user3.f28554id;
                            if (j3 != 777000 && j3 != 429000 && j3 != 4244000 && org.telegram.messenger.mp.L2(user3)) {
                                str = org.telegram.messenger.gd.M0(2131749357, null);
                            }
                        }
                        if (this.f46018g4 != 8 && ((user = this.f46001f) == null || user.self || user.deleted || this.f46103n)) {
                            str = org.telegram.messenger.gd.M0(2131748001, null);
                        }
                    }
                    if (str == null) {
                        this.f46029h1 = new zh(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                        Vc();
                        this.f46029h1.setListener(new ee(this, 5));
                        TLRPC.UserFull userFull2 = this.f46176s8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f46029h1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f46029h1.setSticker(this.f46176s8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f46015g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f46015g1.setGravity(17);
                        this.f46015g1.addView(this.f46029h1, c8.ma.e(-2, -2, 17));
                        this.f46003f1.addView(this.f46015g1, c8.ma.e(-1, -2, 17));
                        Uc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f46143q2 = textView6;
                    textView6.setText(str);
                    this.f46143q2.setTextSize(1, 14.0f);
                    this.f46143q2.setGravity(17);
                    org.telegram.ui.ActionBar.u6.U(this.f46143q2, org.telegram.ui.ActionBar.n6.Zc, getResourceProvider());
                    this.f46143q2.setBackground(new org.telegram.ui.ActionBar.y5(this.f46143q2, this.f46093m1, org.telegram.messenger.g0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f46143q2.setTypeface(org.telegram.messenger.g0.o());
                    this.f46143q2.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(3.0f));
                    this.f46003f1.addView(this.f46143q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.n1 = new org.telegram.ui.Components.bo(getParentActivity(), this.f46093m1, 0, this.Ba);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.n1.setStatusText(org.telegram.messenger.gd.a0(null, null, 2131751122, org.telegram.messenger.o10.k(this.f46001f, true)));
                } else {
                    this.n1.setStatusText(org.telegram.messenger.gd.a0(null, null, 2131751123, org.telegram.messenger.o10.k(this.f46001f, true)));
                }
                this.f46003f1.addView(this.n1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final int W8(org.telegram.messenger.fj fjVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.I9 == null) {
            this.I9 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount, true, this.Za, this.Ba);
        }
        org.telegram.ui.Cells.q1 q1Var = this.I9;
        if (this.f45987e == null && !org.telegram.messenger.o10.C(this.f46001f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        q1Var.f31347f6 = z11;
        org.telegram.ui.Cells.q1 q1Var2 = this.I9;
        int i7 = this.f46018g4;
        if (i7 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var2.f31373h6 = z12;
        if (i7 == 3 && this.mb) {
            z13 = true;
        } else {
            z13 = false;
        }
        q1Var2.f31386i6 = z13;
        TLRPC.User user = this.f46001f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        q1Var2.f31398j6 = z14;
        if (org.telegram.messenger.v3.T(this.f45987e) && this.f45987e.megagroup) {
            z15 = true;
        }
        q1Var2.f31412k6 = z15;
        this.I9.W6 = Q9();
        this.I9.X6 = ba();
        this.I9.Y6 = aa();
        return this.I9.q0(fjVar, (org.telegram.messenger.aj) this.P6.f(fjVar.c1()), z10);
    }

    public final boolean W9() {
        if (this.f45987e != null) {
            return getMessagesController().r2(this.f45987e);
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f46176s8;
        messagesController.getClass();
        return org.telegram.messenger.mp.Q2(userFull);
    }

    public final void Wa(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar;
        if (this.f46000ed.f57658f && (cVar = this.f46079kd) != null && cVar.f57427n == q1Var) {
            Editable text = cVar.f57422a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.j0) getMessagesController().A7.N.f15539b).f24767c) {
                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(this.currentAccount);
                org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
                sh.d attachedMedia = this.f46079kd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(messageObject);
                    if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.fj.B0(messageObject.f23968k);
                        messageObject.e1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) m12).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = C.getMediaDataController().Y(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof th.d) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((th.d) attachedMedia).f58215c);
                            org.telegram.messenger.zy.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof th.h) {
                            th.h hVar = (th.h) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f58226b, null, null, null, false, false, hVar.f58227c);
                        } else if (attachedMedia instanceof th.f) {
                            tL_inputPollAnswer.input_media = cg.d.h(((th.f) attachedMedia).f58223b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof th.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((th.e) attachedMedia).f58216b;
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
            org.telegram.messenger.g0.D3(this.f46079kd.f57422a);
        }
    }

    public final void Wb(pl plVar) {
        if (this.f46054j0 != null && !this.inPreviewMode && !this.mb && this.Aa == null && (this.fragmentView instanceof FrameLayout)) {
            ui.f fVar = this.K;
            if (fVar != null) {
                ui.f fVar2 = this.J;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                ui.d dVar = new ui.d(fVar2, fVar);
                dh.c cVar = new dh.c(dVar, dVar, dVar);
                cVar.f8382k = true;
                cVar.f8381j = T8();
                cVar.h = this.l1;
                cVar.f8380i = plVar;
                cVar.f8379g = this.F;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                kVar.X0 = cVar;
                kVar.Y0 = dVar;
            }
            this.actionBar.setMenuRise(org.telegram.messenger.g0.L(8.0f));
            this.f46054j0.setSubMenuOverlayProvider(new qe(0, this));
        }
    }

    public final void Wc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Wc(boolean):void");
    }

    public final void X6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.X6():void");
    }

    public final boolean X9() {
        int i7 = this.f46018g4;
        if (i7 != 5 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final void Xa(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f10, float f11) {
        org.telegram.messenger.fj messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        ch.p0 d = ch.p0.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.u0) {
            messageObject = ((org.telegram.ui.Cells.u0) zVar).getMessageObject();
        } else {
            return;
        }
        org.telegram.messenger.fj fjVar = messageObject;
        Eb(zVar, fjVar, null, null, f10, f11, d, false, false, false, false);
        if (fjVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fjVar.f23968k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.D0.O;
            if (z12) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.G6[0].get(fjVar.e1());
                if (fjVar2 != null && (message = fjVar2.f23968k) != null) {
                    message.reactions = fjVar.f23968k.reactions;
                }
            } else if (!z12 && this.F3 != null) {
                Sc(false);
            }
        }
        if (this.D0.O && !fjVar.v2(this.F3)) {
            org.telegram.messenger.aj u92 = u9(fjVar);
            if (u92 != null) {
                ArrayList arrayList = u92.d;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getMediaDataController().R1(((org.telegram.messenger.fj) arrayList.get(i7)).e1());
                }
            } else {
                getMediaDataController().R1(fjVar.e1());
            }
            jg.l1 l1Var = this.f45951b4;
            if (l1Var != null) {
                l1Var.f();
            }
            Sc(true);
        }
    }

    public final void Xb() {
        org.telegram.messenger.g0.E3(5.0f, this.A0, null);
        org.telegram.messenger.q2.APP_ERROR.a();
        rj rjVar = this.f45932a0;
        for (int i7 = 0; i7 < rjVar.getChildCount(); i7++) {
            org.telegram.messenger.g0.E3(5.0f, rjVar.getChildAt(i7), null);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            org.telegram.messenger.g0.E3(5.0f, actionBar.getChildAt(i10), null);
        }
    }

    public final void Xc() {
        org.telegram.messenger.fj fjVar;
        if (this.f46001f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                bj bjVar = this.A0;
                if (bjVar != null) {
                    int childCount = bjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = this.A0.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            fjVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        } else {
                            fjVar = null;
                        }
                        if (fjVar != null && fjVar.e1() < 0) {
                            long j3 = fjVar.f23968k.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.fj fjVar2 = SecretMediaViewer.f().f43731g0;
            if (fjVar2 != null && !fjVar2.N3()) {
                MediaController.B();
                fjVar2.e1();
            }
        }
    }

    public final void Y6(int i7, View view, boolean z10) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f46000ed.f57657e) * (1.0f - this.f45974cd.f57657e) * ((float[]) this.f46066jd.f20882b)[i7];
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

    public final boolean Y7(android.view.View r94, boolean r95, boolean r96, float r97, float r98, boolean r99, boolean r100, boolean r101) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Y7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final org.telegram.messenger.bw Y8() {
        ?? obj = new Object();
        int i7 = this.f46018g4;
        if (i7 == 9) {
            obj.f20834a = this.Qa;
        }
        if (i7 == 5) {
            String str = this.f46006f4;
            int d92 = d9();
            obj.f20836c = str;
            obj.f20835b = d92;
        }
        return new org.telegram.messenger.bw(obj);
    }

    public final boolean Y9() {
        return !TextUtils.isEmpty(this.f46057j4);
    }

    public final void Ya(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Ya(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Yb(int i7, org.telegram.messenger.fj fjVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
        String M0 = org.telegram.messenger.gd.M0(2131745225, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        TLRPC.User user = this.f46001f;
        if (user != null) {
            if (user.bot) {
                u1Var.U = org.telegram.messenger.gd.M0(2131754067, null);
            } else {
                String h = org.telegram.messenger.n10.h(new StringBuilder("+"), getUserConfig().f().phone, pf.b.c());
                TLRPC.User user2 = this.f46001f;
                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureShareMyContactInfoUser", null, 2131754065, h, org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            u1Var.U = org.telegram.messenger.gd.M0(2131754068, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745266, null), new ai.r1(this, i7, fjVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        showDialog(u1Var);
    }

    public final void Yc(org.telegram.messenger.fj fjVar, boolean z10) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new di.p6(this, fjVar, z10, 14));
    }

    public final boolean Z6() {
        boolean z10;
        TLRPC.ChatFull chatFull = this.f46163r8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
            ug.l0.x1(this, this.S1, this.T1, this.f46085l6, false);
        }
        return z10;
    }

    public final boolean Z9() {
        int i7 = this.f46018g4;
        if (((i7 == 0 && this.f46173s4 == 0) || i7 == 3) && this.f46085l6 == getUserConfig().e() && !Y9()) {
            return true;
        }
        return false;
    }

    public final void Za(int i7, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.dz0 dz0Var;
        String K0;
        boolean z12;
        boolean z13 = false;
        try {
            K0 = org.telegram.messenger.g0.K0(str, false);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.h != null) {
            if (getMessagesController().J2 == 1) {
            }
            if (z10 && !org.telegram.messenger.g0.H3(str)) {
                if (i7 == 0) {
                    vf.c.r(getParentActivity(), Uri.parse(str), true, true, na(q1Var, characterStyle));
                    return;
                } else if (i7 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f46240x8 == 0) {
                        z13 = true;
                    }
                    vf.c.r(parentActivity, parse, z13, true, na(q1Var, characterStyle));
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f46240x8 == 0) {
                        z13 = true;
                    }
                    vf.c.r(parentActivity2, parse2, z13, true, na(q1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i7 == 0 && i7 != 2) {
                if (i7 == 1) {
                    org.telegram.ui.Components.b5.o0(this, str, true, true, false, false, na(q1Var, characterStyle), null, this.Ba);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.r41) && (dz0Var = ((org.telegram.ui.Components.r41) characterStyle).f39038a) != null && (dz0Var.f34537a & 1024) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.b5.o0(this, str, true, true, true, z11, na(q1Var, characterStyle), null, this.Ba);
            }
        }
        if (getMessagesController().f25666h4.contains(K0)) {
            org.telegram.messenger.zy sendMessagesHelper = getSendMessagesHelper();
            if (i7 != 0 && i7 != 2) {
                z12 = false;
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new org.telegram.messenger.r4(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z12), 2);
                return;
            }
            z12 = true;
            sendMessagesHelper.getClass();
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth2.url = str;
            tL_messages_requestUrlAuth2.flags |= 4;
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth2, new org.telegram.messenger.r4(sendMessagesHelper, tL_messages_requestUrlAuth2, this, str, z12), 2);
            return;
        }
        if (z10) {
        }
        if (i7 == 0) {
        }
        if (!(characterStyle instanceof org.telegram.ui.Components.r41)) {
        }
        z11 = false;
        org.telegram.ui.Components.b5.o0(this, str, true, true, true, z11, na(q1Var, characterStyle), null, this.Ba);
    }

    public final boolean Zb() {
        if (T9() && this.F5 == null && this.H5 == null) {
            if (this.f46018g4 != 8 && T9() && this.f45987e != null) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25771t7.f(this.f45987e.f28405id, 1L);
                if (this.f46018g4 != 8) {
                    if (f10 != null) {
                        if (f10.closed && !org.telegram.messenger.v3.i(this.currentAccount, this.f45987e, f10)) {
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

    public final void Zc(org.telegram.messenger.fj fjVar, boolean z10) {
        org.telegram.messenger.fj fjVar2;
        if (this.D0 != null && this.fragmentView != null) {
            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.P6.f(fjVar.c1());
            if (ajVar != null) {
                ArrayList arrayList = ajVar.d;
                dj djVar = this.B0;
                if (djVar != null) {
                    djVar.V(ajVar);
                }
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.messenger.fj) arrayList.get(i7)).M1 = true;
                    if (z10) {
                        ((org.telegram.messenger.fj) arrayList.get(i7)).H = true;
                    }
                }
                this.D0.O(true);
                return;
            }
            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) this.G6[0].get(fjVar.e1());
            if (z10) {
                fjVar.M1 = true;
                fjVar.H = true;
            }
            if (this.D0.O) {
                a0.h hVar = this.f46230wb;
                if (hVar != null) {
                    fjVar2 = (org.telegram.messenger.fj) hVar.f(fjVar.e1());
                } else {
                    fjVar2 = null;
                }
                int indexOf = this.D0.Q.indexOf(fjVar2);
                if (fjVar2 != null && z10) {
                    fjVar2.M1 = true;
                    fjVar2.H = true;
                }
                if (indexOf >= 0) {
                    kl klVar = this.D0;
                    klVar.g(klVar.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.M6.indexOf(fjVar3);
            if (indexOf2 >= 0) {
                kl klVar2 = this.D0;
                klVar2.g(klVar2.K + indexOf2);
            }
        }
    }

    public long a() {
        return this.f46085l6;
    }

    public final void a7(boolean z10) {
        if (this.f46009f7 == 0) {
            if (z10 && !this.f46021g7.isEmpty()) {
                this.f46009f7 = System.currentTimeMillis();
            } else {
                this.f46009f7 = 1L;
            }
            da();
            bj bjVar = this.A0;
            if (bjVar != null) {
                bjVar.invalidate();
            }
        }
    }

    public final org.telegram.ui.Components.ne0 a8(View view, org.telegram.ui.Components.me0 me0Var) {
        dh.c cVar;
        ui.d dVar;
        gh.a l10;
        pl plVar;
        org.telegram.ui.ActionBar.k5 simpleMenuOverlay = getSimpleMenuOverlay();
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
            cVar.f8382k = true;
            cVar.f8381j = T8();
            jh.k kVar = this.l1;
            bn bnVar = this.Aa;
            if (bnVar != null) {
                plVar = bnVar.f46093m1;
            } else {
                plVar = this.f46093m1;
            }
            cVar.h = kVar;
            cVar.f8380i = plVar;
            cVar.f8379g = this.F;
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
            l10 = this.actionBar.getMenuGlassColorProvider();
        } else {
            l10 = c8.i0.l(this.Ba);
        }
        return new org.telegram.ui.Components.ne0(getParentActivity(), view, me0Var, simpleMenuOverlay, cVar2, dVar, l10, this.f46231x, this.Ba);
    }

    public final int a9(org.telegram.messenger.fj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.a9(org.telegram.messenger.fj):int");
    }

    public final boolean aa() {
        org.telegram.ui.Components.z11 z11Var = this.f46016g2;
        if (z11Var != null && z11Var.U && z11Var.f42728a.f57658f) {
            return true;
        }
        return false;
    }

    public final void ab(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.fj r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.fj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.ab(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.fj):void");
    }

    public final void ac() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.lc.b0(this).t(org.telegram.messenger.gd.M0(2131743596, null), this.Ba).j();
    }

    public final void ad() {
        org.telegram.ui.ActionBar.h1 h1Var;
        int i7;
        if (this.h != null) {
            return;
        }
        bj bjVar = this.A0;
        kj kjVar = this.X1;
        if ((kjVar != null && kjVar.J) || ((h1Var = this.f46023g9) != null && h1Var.isShowing())) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        bjVar.setImportantForAccessibility(i7);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29606og));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29635q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29487i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29469h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29400da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29600oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29491ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29582na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29547la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29529ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29509ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29385cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29461gg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29346ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29796yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29721uf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29758wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29739vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29534kg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ol));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29586nf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29693t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29751w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29816zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29348ag));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29734v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29715u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29639q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29619p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29599o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29528k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29564m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29490i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29508j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29341a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29603od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29473ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29455ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29419ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29478hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29533kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29514jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29566md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29347af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29550ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29815ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29795ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29813zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29776xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29793yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29757we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29720ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29737vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29700te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29718uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29681se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29698tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29663re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29679sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29644qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29661rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29624pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29642qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29567me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29604oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29565mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29532ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29549lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29513je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29530kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29495ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29384cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29477he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29459ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29420ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29457gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29403de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29386ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29511jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29422ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29366be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29493ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29475hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29585nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29814zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29794yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29775xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29756wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29640qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29656r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29812zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29738vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29719ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29699td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29680sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29662rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29643qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29623pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29531kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29512jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29402dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29345ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29678sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29660rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29659ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29598o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29580n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29563m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29545l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29527k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29507j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29489i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29458gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29439fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29620pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        org.telegram.messenger.xy d = org.telegram.messenger.xy.d(messageMedia, this.f46085l6, this.F5, this.f46096m4, null, null, z10, i10);
        d.K = Y8();
        d.Q = j3;
        d.R = j9();
        d.T = this.f46250y5;
        getSendMessagesHelper().r0(d);
        if (this.f46018g4 == 0) {
            ra(false);
        }
        if (i7 == 0 || i7 == 1) {
            L6();
        }
        if (this.I5) {
            this.f46047i6 = true;
        }
    }

    public final void b7(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.fj fjVar2 = this.H5;
        if (fjVar2 != null && (message = fjVar2.f23968k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46237x5 != null && fjVar2 != null) {
            int i7 = fjVar2.D;
            if ((i7 == 0 || i7 == 19) && (webPage = this.Y5) != null) {
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
                            if (org.telegram.messenger.jj.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                if (z10) {
                    this.Y5 = null;
                    rj rjVar = this.f45932a0;
                    if (rjVar != null) {
                        rjVar.L3 = null;
                        rjVar.M3 = true;
                    }
                    org.telegram.messenger.jj jjVar = this.f46237x5;
                    if (jjVar != null) {
                        int i10 = this.currentAccount;
                        CharSequence fieldText = rjVar.getFieldText();
                        org.telegram.messenger.fj fjVar3 = this.F5;
                        if (fjVar3 == this.f46096m4) {
                            fjVar = null;
                        } else {
                            fjVar = fjVar3;
                        }
                        jjVar.e(i10, null, fieldText, fjVar, this.D5, this.H5);
                    }
                    z8();
                    B8();
                }
            }
        }
    }

    public final void b8() {
        if (this.h == null && this.M2 == null && getParentActivity() != null) {
            ok okVar = new ok(this, getParentActivity());
            this.M2 = okVar;
            okVar.setTag(1);
            this.f45948b1.addView(this.M2, c8.ma.o(-1, 48));
            this.f45948b1.i(1, this.M2);
            this.f45948b1.h(this.M2);
            this.M2.setOnClickListener(new oe(this, 17));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
            org.telegram.ui.Components.qe0 qe0Var = new org.telegram.ui.Components.qe0(getParentActivity(), this.Ba);
            this.O2 = qe0Var;
            this.M2.addView(qe0Var, c8.ma.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.We));
            this.U2.setTypeface(org.telegram.messenger.g0.o());
            this.M2.addView(this.U2, c8.ma.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i7 = 0; i7 < 2; i7++) {
                an anVar = new an(this, getParentActivity());
                an[] anVarArr = this.R2;
                anVarArr[i7] = anVar;
                anVar.setTextSize(14);
                org.telegram.ui.ActionBar.u6.X(anVarArr[i7], org.telegram.ui.ActionBar.n6.We, getResourceProvider());
                anVarArr[i7].setTypeface(org.telegram.messenger.g0.o());
                this.M2.addView(anVarArr[i7], c8.ma.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                pk pkVar = new pk(0, getParentActivity(), this);
                org.telegram.ui.ActionBar.n5[] n5VarArr = this.S2;
                n5VarArr[i7] = pkVar;
                pkVar.setTextSize(14);
                org.telegram.ui.ActionBar.u6.X(n5VarArr[i7], org.telegram.ui.ActionBar.n6.Xe, getResourceProvider());
                this.M2.addView(n5VarArr[i7], c8.ma.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                qm qmVar = new qm(this, getParentActivity());
                qm[] qmVarArr = this.T2;
                qmVarArr[i7] = qmVar;
                this.M2.addView(qmVar, c8.ma.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                qk qkVar = new qk(getParentActivity());
                qkVar.J = new xh.f();
                qkVar.I = new Path();
                qkVar.K = new float[8];
                org.telegram.ui.Components.q9[] q9VarArr = this.Q2;
                q9VarArr[i7] = qkVar;
                qkVar.setBlurAllowed(true);
                q9VarArr[i7].setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                this.M2.addView(q9VarArr[i7], c8.ma.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i7 == 1) {
                    anVarArr[i7].setVisibility(4);
                    qmVarArr[i7].setVisibility(4);
                    n5VarArr[i7].setVisibility(4);
                    q9VarArr[i7].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.f45935a3 = imageView;
            imageView.setImageResource(2131232299);
            ImageView imageView2 = this.f45935a3;
            int i10 = org.telegram.ui.ActionBar.n6.Ue;
            org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.s(imageView2, i10, resourceProvider, mode);
            ImageView imageView3 = this.f45935a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.f45935a3.setContentDescription(org.telegram.messenger.gd.M0(2131754723, null));
            this.f45935a3.setVisibility(4);
            this.f45935a3.setAlpha(0.0f);
            this.f45935a3.setScaleX(0.4f);
            this.f45935a3.setScaleY(0.4f);
            ImageView imageView4 = this.f45935a3;
            int i11 = org.telegram.ui.ActionBar.n6.f29770x7;
            org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.u6.g(i11, 25), getResourceProvider());
            this.M2.addView(this.f45935a3, c8.ma.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.f45935a3.setOnClickListener(new oe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231984);
            org.telegram.ui.ActionBar.u6.s(this.Y2, i10, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(org.telegram.messenger.gd.M0(2131752030, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.Ba);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(org.telegram.messenger.g0.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ve));
            this.M2.addView(this.Z2, c8.ma.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.u6.Q(this.Y2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)), null, org.telegram.ui.ActionBar.u6.g(i11, 25), getResourceProvider());
            this.M2.addView(this.Y2, c8.ma.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new oe(this, 19));
            fd(false);
        }
    }

    public final int b9() {
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        int i7 = 0;
        if (s4Var == null || s4Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i7 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.parentLayout.getFragmentStack().get(i7);
                if (h2Var != this && (h2Var instanceof bn) && ((bn) h2Var).f46085l6 == this.f46085l6) {
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
        org.telegram.ui.Components.z11 z11Var = this.f46016g2;
        if (z11Var != null) {
            return z11Var.f42732c;
        }
        if (org.telegram.messenger.v3.c0(this.f45987e) && O6()) {
            return true;
        }
        return false;
    }

    public final void bb(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.bb(java.util.ArrayList, boolean):void");
    }

    public final void bc(org.telegram.ui.Cells.q1 q1Var) {
        if (getParentActivity() != null && q1Var != null && q1Var.f31615z9 != null && q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().f23968k != null && q1Var.getPrimaryMessageObject().f23968k.via_business_bot_id != 0 && !getMessagesController().h7.getBoolean("bizbothint", false)) {
            getMessagesController().h7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f46203ub) {
                this.f46203ub = true;
                if (this.O1 != null) {
                    return;
                }
                hi.m3 m3Var = new hi.m3(getParentActivity(), 3);
                m3Var.r(true);
                m3Var.L = Layout.Alignment.ALIGN_NORMAL;
                m3Var.d = -1L;
                m3Var.U = true;
                m3Var.f14998e = true;
                m3Var.k(true);
                m3Var.s(8.0f);
                this.O1 = m3Var;
                m3Var.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748406, null)));
                this.O1.l(this.L);
                hi.m3 m3Var2 = this.O1;
                m3Var2.h = hi.m3.a(m3Var2.getText(), this.O1.getTextPaint());
                this.f46093m1.addView(this.O1, c8.ma.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f46093m1.post(new k9(18, this, q1Var));
            }
        }
    }

    public final void bd(ArrayList arrayList, boolean z10) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.D0.R((org.telegram.messenger.fj) arrayList.get(i7), false, z10);
        }
    }

    @Override
    public final boolean c() {
        if (this.f46018g4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.c7():void");
    }

    public final void c8() {
        int i7;
        int i10;
        if (this.f46017g3 == null && getParentActivity() != null) {
            uj ujVar = new uj(this, getParentActivity(), 1);
            this.f46017g3 = ujVar;
            ujVar.setClickable(false);
            this.f46017g3.setWillNotDraw(false);
            this.f46066jd.h(4, false, false);
            this.f46017g3.setClipToPadding(false);
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), true, true, true);
            this.j3 = n6Var;
            org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
            n6Var.b(0.25f, 280L, lrVar);
            this.j3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.j3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.Y(this.j3, org.telegram.ui.ActionBar.n6.qf, getResourceProvider());
            this.j3.setGravity(3);
            this.f46017g3.addView(this.j3, c8.ma.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.f46017g3, c8.ma.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(getParentActivity(), true, false, true);
            this.f46070k3 = n6Var2;
            n6Var2.b(0.0f, 420L, lrVar);
            this.f46070k3.setScaleProperty(0.7f);
            this.f46070k3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f46070k3.setGravity(5);
            this.f46070k3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.Y(this.f46070k3, org.telegram.ui.ActionBar.n6.f29596o6, getResourceProvider());
            org.telegram.ui.Components.n6 n6Var3 = this.f46070k3;
            if (this.f46027gd.f57658f) {
                i7 = 2131745623;
            } else {
                i7 = 2131745622;
            }
            n6Var3.setText(org.telegram.messenger.gd.M0(i7, null));
            org.telegram.ui.Components.n6 n6Var4 = this.f46070k3;
            n6Var4.f37740n = false;
            n6Var4.setPadding(org.telegram.messenger.g0.L(15.33f), 0, org.telegram.messenger.g0.L(15.33f), 0);
            this.f46070k3.setOnClickListener(new oe(this, 2));
            this.f46070k3.setAlpha(0.5f);
            this.f46070k3.setClickable(false);
            this.f46017g3.addView(this.f46070k3, c8.ma.e(-2, -1, 117));
            org.telegram.ui.Components.n6 n6Var5 = new org.telegram.ui.Components.n6(getParentActivity(), true, true, true);
            this.f46082l3 = n6Var5;
            n6Var5.setGravity(17);
            this.f46082l3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.Y(this.f46082l3, org.telegram.ui.ActionBar.n6.f29682sf, getResourceProvider());
            this.f46082l3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            org.telegram.ui.Components.n6 n6Var6 = this.f46082l3;
            int i11 = org.telegram.ui.ActionBar.n6.f29396d6;
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.ActionBar.u6.Q(n6Var6, org.telegram.ui.ActionBar.n6.i0(themedColor, org.telegram.ui.ActionBar.n6.w(themedColor2, getThemedColor(i12))), org.telegram.ui.ActionBar.u6.M(i11), org.telegram.ui.ActionBar.u6.p(i11, i12), getResourceProvider());
            org.telegram.ui.Components.n6 n6Var7 = this.f46082l3;
            if (this.D0.O) {
                i10 = 2131745688;
            } else {
                i10 = 2131745671;
            }
            n6Var7.setText(org.telegram.messenger.gd.M0(i10, null));
            this.f46082l3.setOnClickListener(new oe(this, 3));
            this.f46082l3.setVisibility(8);
            this.f46082l3.setAlpha(0.0f);
            this.f46017g3.addView(this.f46082l3, c8.ma.e(-1, -1, 119));
            TLRPC.Chat chat = this.f45987e;
            if (chat != null && ((!org.telegram.messenger.v3.T(chat) || this.f45987e.megagroup) && this.f46018g4 != 7 && !org.telegram.messenger.v3.p0(this.f45987e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f46044i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f46044i3.setImageResource(2131232419);
                org.telegram.ui.ActionBar.u6.s(this.f46044i3, org.telegram.ui.ActionBar.n6.f29625pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f46044i3;
                int i13 = org.telegram.ui.ActionBar.n6.f29809z8;
                org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i13), getResourceProvider());
                this.f46017g3.addView(this.f46044i3, c8.ma.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f46044i3.setOnClickListener(new oe(this, 4));
                this.f46044i3.setContentDescription(org.telegram.messenger.gd.M0(2131754780, null));
            }
            if (this.f46018g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f46031h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f46031h3.setImageResource(2131232078);
                org.telegram.ui.ActionBar.u6.s(this.f46031h3, org.telegram.ui.ActionBar.n6.f29625pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f46031h3;
                int i14 = org.telegram.ui.ActionBar.n6.f29809z8;
                org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i14), getResourceProvider());
                this.f46017g3.addView(this.f46031h3, c8.ma.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f46031h3.setOnClickListener(new oe(this, 5));
                this.f46031h3.setContentDescription(org.telegram.messenger.gd.M0(2131748873, null));
            }
        }
    }

    public final int c9() {
        return Math.max(this.f45979d5, this.f45993e5);
    }

    public final boolean ca() {
        if (this.m0 != null && ga()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.f11 f11Var;
        wh.i iVar;
        org.telegram.ui.Components.de deVar;
        if ((this.f46018g4 != 5 || (!this.M6.isEmpty() && this.f46173s4 != 0)) && (((f11Var = this.f46104n0) == null || (f11Var.f34899y <= 0.0f && !f11Var.f34878c0)) && !this.f46254y9 && !this.f46027gd.f57658f && this.K9)) {
            rj rjVar = this.f45932a0;
            if (!rjVar.f32687t3 && ((!rjVar.f32567d1 || (deVar = rjVar.f32584f1) == null || deVar.getVisibility() != 0) && ((!rjVar.D0() || !rjVar.m0.f19090w) && !org.telegram.ui.ActionBar.h2.hasSheets(rjVar.D3) && this.f46077ka == 0.0f && ((iVar = this.f46202ua) == null || !iVar.a())))) {
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
                    this.f46111n8 = q02.getAbsolutePath();
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
                if (org.telegram.messenger.v3.T(this.f45987e) && (tL_chatBannedRights = this.f45987e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                qm0 qm0Var = new qm0(0, z10, true, this);
                if (this.f46018g4 == 9) {
                    qm0Var.H = 1;
                    qm0Var.I = true;
                } else {
                    TLRPC.Chat chat = this.f45987e;
                    if (chat != null && !org.telegram.messenger.v3.N(chat) && this.f45987e.slowmode_enabled) {
                        qm0Var.H = 10;
                        qm0Var.I = true;
                    } else {
                        org.telegram.messenger.fj fjVar = this.H5;
                        if (fjVar != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (fjVar == null) {
                            z11 = true;
                        }
                        qm0Var.H = i10;
                        qm0Var.I = z11;
                    }
                }
                qm0Var.W = new xi(this);
                presentFragment(qm0Var);
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
                        this.f46111n8 = s02.getAbsolutePath();
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
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        View view;
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
            int i11 = 0;
            float f17 = 0.1f;
            if (z11) {
                this.W0 = new AnimatorSet();
                if (z10) {
                    this.J0.setVisibility(0);
                    AnimatorSet animatorSet2 = this.W0;
                    wj wjVar = this.E0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wjVar, property, 0.1f);
                    wj wjVar2 = this.E0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wjVar2, property2, 0.1f);
                    wj wjVar3 = this.E0;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wjVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.J0, property, 1.0f), ObjectAnimator.ofFloat(this.J0, property2, 1.0f), ObjectAnimator.ofFloat(this.J0, property3, 1.0f));
                    this.W0.setStartDelay(200L);
                } else {
                    if (this.F0) {
                        view = this.G0;
                    } else {
                        view = this.E0;
                    }
                    view.setVisibility(0);
                    AnimatorSet animatorSet3 = this.W0;
                    RadialProgressView radialProgressView2 = this.J0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.J0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.J0;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(view, property4, 1.0f), ObjectAnimator.ofFloat(view, property5, 1.0f), ObjectAnimator.ofFloat(view, property6, 1.0f));
                }
                this.W0.addListener(new bi.e7(29, this, z10));
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
            wj wjVar4 = this.E0;
            if (!z10 && !this.F0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wjVar4.setVisibility(i10);
            org.telegram.ui.Components.k80 k80Var = this.G0;
            if (z10 || !this.F0) {
                i11 = 4;
            }
            k80Var.setVisibility(i11);
            wj wjVar5 = this.E0;
            if (!z10 && !this.F0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            wjVar5.setScaleX(f12);
            org.telegram.ui.Components.k80 k80Var2 = this.G0;
            if (!z10 && this.F0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            k80Var2.setScaleX(f13);
            wj wjVar6 = this.E0;
            if (!z10 && !this.F0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            wjVar6.setScaleY(f14);
            org.telegram.ui.Components.k80 k80Var3 = this.G0;
            if (!z10 && this.F0) {
                f17 = 1.0f;
            }
            k80Var3.setScaleY(f17);
            wj wjVar7 = this.E0;
            if (!z10 && !this.F0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            wjVar7.setAlpha(f15);
            org.telegram.ui.Components.k80 k80Var4 = this.G0;
            if (!z10 && this.F0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            k80Var4.setAlpha(f16);
        }
    }

    public final void cd() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.cd():void");
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i7;
        if (!this.f46236x4 && (i7 = this.f46018g4) != 3 && i7 != 5 && i7 != 8) {
            return 0L;
        }
        return this.f46173s4;
    }

    public final void d7(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.t3 t3Var = this.f46123o8;
        if (t3Var != null && (((str = this.f46253y8) != null || this.f46265z8) && this.f46008f6)) {
            org.telegram.ui.Components.voip.b2.l(this.f45987e, str, this.f46149q8, Boolean.valueOf(!t3Var.f26937b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f46253y8 = null;
            this.f46265z8 = false;
            return;
        }
        if (this.f46253y8 != null && z10 && (chatFull = this.f46163r8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.f3.n(null, 2131748721, org.telegram.ui.Components.lc.b0(this), 2131624080, 36);
            this.f46253y8 = null;
        }
        this.f46136p8 = !this.f46008f6;
    }

    public final void d8() {
        if (this.f46171s2 == null && this.I1 == null) {
            org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(getParentActivity(), this.Ba);
            this.f46157r2 = wzVar;
            wzVar.setViewType(7);
            org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(getParentActivity(), this.f46157r2, 1, null);
            this.f46171s2 = kv0Var;
            kv0Var.setClickable(true);
            this.f46171s2.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
            this.f46171s2.setVisibility(8);
            this.f46171s2.addView(this.f46157r2, 0);
            this.f46171s2.e(true, false);
            this.Z3.addView(this.f46171s2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.e30 e30Var = new org.telegram.ui.Components.e30(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.I1 = e30Var;
            e30Var.setOnHashtagClickListener(new me(this, 3));
            this.I1.setOnScrollListener(new g3(this, 6));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            G7();
            E7();
        }
    }

    public final int d9() {
        if (this.f46018g4 == 5) {
            return (int) this.f46173s4;
        }
        return 0;
    }

    public final boolean da() {
        boolean z10;
        boolean z11;
        float f10;
        FrameLayout frameLayout;
        if (!this.f45960c && !this.d && this.f46001f == null && this.A0 != null && org.telegram.messenger.bz.c()) {
            if (this.Ib == null) {
                this.Ib = Boolean.valueOf(org.telegram.messenger.pc.e(360928));
            }
            if (this.Ib.booleanValue()) {
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
                if (f11 <= this.P9) {
                    a7(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.U6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.M6;
                if ((!z12 || ((this.f45981d7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.Y6 && f11 > this.P9 && (!arrayList.isEmpty() ? i10 != 0 : this.Hb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f46003f1) == null || frameLayout.getVisibility() != 0 || this.f46003f1.getChildCount() <= 0) {
                    if (!z10 && this.f46009f7 == 0) {
                        a7(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.bz.o() != 0 && !this.f46125oa && this.fragmentBeginToShow) {
                        if (z10 && this.f46009f7 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable c10 = this.Ba.c();
                        pl plVar = this.f46093m1;
                        if (plVar != null) {
                            c10 = plVar.getBackgroundImage();
                        }
                        if (c10 instanceof org.telegram.ui.Components.bb0) {
                            org.telegram.ui.Components.bb0 bb0Var = (org.telegram.ui.Components.bb0) c10;
                            if (bb0Var.N != z11) {
                                if (!z11) {
                                    bb0Var.c();
                                }
                                float f12 = 1.0f;
                                if (!z11 && bb0Var.N) {
                                    bb0Var.h = 1.0f - ((bb0Var.h - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
                                    bb0Var.d = true;
                                }
                                bb0Var.N = z11;
                                if (z11) {
                                    f12 = 1.5f;
                                }
                                bb0Var.M = f12;
                                bb0Var.y();
                            } else if (z11) {
                                bb0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.f46009f7 != 0 && System.currentTimeMillis() - this.f46009f7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void db(int r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.db(int):void");
    }

    public final void dc(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.gd.M0(2131752702, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752703, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751395, null), new ve(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, getResourceProvider());
        }
    }

    public final void dd() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f46246y1 == null) {
            return;
        }
        boolean z13 = false;
        if (this.D9 && !A9() && !this.f45932a0.R0() && !this.mb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f46034h6 != 0 && SystemClock.elapsedRealtime() >= this.f46034h6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f46258z1 = false;
        } else {
            this.T7 = 0;
            this.B6 = 0;
            z11 = true;
        }
        rj rjVar = this.f45932a0;
        if (rjVar != null && rjVar.a()) {
            z12 = true;
        } else {
            z12 = false;
        }
        lh.h hVar = this.f46246y1;
        if (z10 && !z12) {
            z13 = true;
        }
        hVar.e(1, z13, z11);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, final Object... objArr) {
        long j3;
        org.telegram.messenger.fj fjVar;
        TLRPC.MessageReplies messageReplies;
        org.telegram.messenger.fj fjVar2;
        org.telegram.ui.ActionBar.s4 s4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull d2;
        TLRPC.User c22;
        boolean z10;
        TLRPC.User c23;
        vi viVar;
        rj rjVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.mt editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.iw0 iw0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        rj rjVar2;
        bn bnVar = this;
        if (i7 == org.telegram.messenger.ks.D) {
            bnVar.t8(objArr);
            return;
        }
        if (i7 == org.telegram.messenger.ks.f25150l4) {
            bj bjVar = bnVar.A0;
            if (bjVar != null) {
                bjVar.g1();
            }
            org.telegram.ui.Components.ri riVar = bnVar.f46063ja;
            if (riVar != null) {
                riVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            int i12 = 0;
            if (i7 == org.telegram.messenger.ks.I) {
                if (((Integer) objArr[0]).intValue() == bnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        bnVar.finishFragment();
                        b.b(bnVar.currentAccount);
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.f25203u3) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null && n2Var.isShowing()) {
                    bnVar.Y1.a(true);
                }
                if (z11 && (rjVar2 = bnVar.f45932a0) != null && rjVar2.O0()) {
                    bnVar.f45932a0.G0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f28425id = stickerSet2.f28432id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = bnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.iw0) && (tL_messages_stickerSet = (iw0Var = (org.telegram.ui.Components.iw0) dialog).N1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f28432id == stickerSet2.f28432id) {
                            iw0Var.N1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (iw0Var.f36247o1 != null) {
                                iw0Var.b1();
                                iw0Var.a1();
                                iw0Var.f36247o1.f();
                            }
                            iw0Var.Z0();
                            org.telegram.messenger.ri.d0(iw0Var.f30189a).t1(iw0Var.N1);
                            iw0Var.K0();
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
                                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(iw0Var.f30195c, bnVar.resourceProvider);
                                    if (z12) {
                                        i11 = 2131744609;
                                    } else {
                                        i11 = 2131744610;
                                    }
                                    org.telegram.ui.Components.gc q10 = lcVar.q(document, org.telegram.messenger.gd.a0(null, null, i11, stickerSet2.title));
                                    q10.f35461j = 2750;
                                    q10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.iw0 iw0Var2 = new org.telegram.ui.Components.iw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.f45932a0, bnVar.Ba);
                            final boolean z15 = z12;
                            bnVar = this;
                            iw0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    bn.Y0(bn.this, objArr, iw0Var2, z15, stickerSet2);
                                }
                            });
                            bnVar.showDialog(iw0Var2);
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.f25145k4) {
                bj bjVar2 = bnVar.A0;
                if (bjVar2 != null) {
                    bjVar2.g1();
                }
                TextView textView = bnVar.f46005f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.n5 n5Var = bnVar.S2[i13];
                    if (n5Var != null) {
                        n5Var.invalidate();
                    }
                }
                kj kjVar = bnVar.X1;
                if (kjVar != null) {
                    kjVar.getListView().g1();
                }
                di.b1 b1Var = bnVar.f45936a4;
                if (b1Var != null) {
                    b1Var.g1();
                }
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                rj rjVar3 = bnVar.f45932a0;
                if (rjVar3 != null && (editField = rjVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                qm[] qmVarArr = bnVar.T2;
                qm qmVar = qmVarArr[0];
                if (qmVar != null) {
                    qmVar.invalidate();
                }
                qm qmVar2 = qmVarArr[1];
                if (qmVar2 != null) {
                    qmVar2.invalidate();
                }
            } else if (i7 == org.telegram.messenger.ks.T1) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i7 == org.telegram.messenger.ks.f25119g1) {
                Long l10 = (Long) objArr[0];
                if (bnVar.f46163r8 != null && (chat = bnVar.f45987e) != null && chat.f28405id == l10.longValue()) {
                    bnVar.f46163r8.online_count = ((Integer) objArr[1]).intValue();
                    vi viVar2 = bnVar.f46129p1;
                    if (viVar2 != null) {
                        viVar2.m();
                        bnVar.f46129p1.n(false);
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.G) {
                if (((Long) objArr[0]).longValue() == bnVar.f46085l6 && (rjVar = bnVar.f45932a0) != null) {
                    rjVar.u2(false, true);
                }
            } else if (i7 == org.telegram.messenger.ks.f25144k3) {
                rj rjVar4 = bnVar.f45932a0;
                if (rjVar4 != null) {
                    rjVar4.v2();
                }
            } else if (i7 == org.telegram.messenger.ks.f25179r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i14 = org.telegram.messenger.mp.I8;
                int i15 = intValue & 1;
                if (i15 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (bnVar.f45987e != null) {
                        TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(bnVar.f45987e.f28405id));
                        if (O0 != null) {
                            bnVar.f45987e = O0;
                        }
                    } else if (bnVar.f46001f != null && (c22 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46001f.f28554id))) != null) {
                        bnVar.f46001f = c22;
                    }
                    bnVar.wd(true);
                }
                if (!bnVar.fa() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (bnVar.f45987e != null && (viVar = bnVar.f46129p1) != null) {
                        viVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i15 != 0) {
                    bnVar.s();
                    bnVar.Gd(false);
                }
                if ((intValue & 64) != 0) {
                    z10 = true;
                }
                if ((intValue & 8192) != 0 && bnVar.f45987e != null) {
                    bnVar.W9();
                    TLRPC.Chat O02 = bnVar.getMessagesController().O0(Long.valueOf(bnVar.f45987e.f28405id));
                    if (O02 != null) {
                        bnVar.f45987e = O02;
                        bnVar.W9();
                        z10 = !bnVar.fa();
                        bnVar.Pc(false);
                        rj rjVar5 = bnVar.f45932a0;
                        if (rjVar5 != null) {
                            rjVar5.z1(bnVar.currentAccount, bnVar.f46085l6);
                        }
                        org.telegram.messenger.n6 n6Var = bnVar.T3;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                }
                TLRPC.User user = bnVar.f46001f;
                if (user != null && org.telegram.messenger.o10.v(user) && (c23 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46001f.f28554id))) != null) {
                    bnVar.f46001f = c23;
                }
                if (bnVar.f46016g2 != null) {
                    boolean O6 = bnVar.O6();
                    org.telegram.ui.Components.z11 z11Var = bnVar.f46016g2;
                    if (z11Var.f42732c != O6) {
                        z11Var.setTabsEnabled(O6);
                        if (bnVar.f46104n0 != null && !bnVar.ga()) {
                            bnVar.f46104n0.e();
                        }
                        bnVar.Dd();
                    }
                }
                vi viVar3 = bnVar.f46129p1;
                if (viVar3 != null && z10) {
                    viVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    bnVar.zd(true);
                }
                org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46054j0;
                if (r0Var != null) {
                    if (org.telegram.messenger.v3.T(bnVar.f45987e) && !org.telegram.messenger.v3.p0(bnVar.f45987e)) {
                        long j10 = bnVar.f45987e.linked_monoforum_id;
                        if (j10 != 0 && org.telegram.messenger.v3.z(bnVar.currentAccount, 24, -j10)) {
                            z13 = true;
                        }
                    }
                    r0Var.R(70, z13);
                }
            } else if (i7 == 1) {
                org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!bnVar.mb) {
                    if (longValue == bnVar.f46085l6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i16 = bnVar.f46018g4;
                        if (intValue2 != i16 && i16 != 3 && i16 != 8) {
                            if (i16 != 1 && intValue2 == 1 && !bnVar.isPaused && LaunchActivity.T() == bnVar && bnVar.f46237x5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.fj) arrayList.get(0)).e1() < 0) {
                                int e12 = ((org.telegram.messenger.fj) arrayList.get(0)).e1();
                                if (((org.telegram.messenger.fj) arrayList.get(0)).f23968k != null && ((org.telegram.messenger.fj) arrayList.get(0)).f23968k.video_processing_pending) {
                                    z14 = true;
                                }
                                bnVar.Ma(e12, z14);
                            }
                            org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !bnVar.Yc && bnVar.f46001f != null && bnVar.a() != bnVar.getUserConfig().e() && (d2 = bnVar.getMessagesController().d2(bnVar.f46001f.f28554id)) != null && d2.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i12);
                                    if (fjVar3.e1() > 0 && !fjVar3.N3() && !fjVar3.r4()) {
                                        bnVar.Yc = true;
                                        bnVar.getMessagesController().c3(bnVar.f46001f, bnVar.classGuid, true, null);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            bnVar.bb(arrayList, true);
                        }
                    } else if (org.telegram.messenger.v3.T(bnVar.f45987e) && !bnVar.f45987e.megagroup && (chatFull = bnVar.f46163r8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) arrayList.get(i17);
                            if (fjVar4.e4()) {
                                bnVar.N6.put(fjVar4.e1(), fjVar4);
                            }
                        }
                        bnVar.L7();
                    }
                    org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i7 == org.telegram.messenger.ks.F) {
                bnVar.la(true);
            } else if (i7 == org.telegram.messenger.ks.E) {
                bnVar.G6();
            } else if (i7 == org.telegram.messenger.ks.f25192t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == bnVar.f46085l6) {
                        bnVar.finishFragment();
                    }
                } else if (org.telegram.messenger.g0.Q1() && (s4Var = bnVar.parentLayout) != null && s4Var.getFragmentStack().size() > 1) {
                    bnVar.finishFragment();
                } else {
                    bnVar.removeSelfFromStack(true);
                }
            } else if (i7 == org.telegram.messenger.ks.f25199u) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == bnVar.a() && (booleanValue2 || bnVar.parentLayout.getLastFragment() != bnVar)) {
                    if (bnVar.parentLayout.getLastFragment() == bnVar) {
                        bnVar.finishFragment();
                    } else {
                        bnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i18 = org.telegram.messenger.ks.B;
                SparseArray[] sparseArrayArr = bnVar.G6;
                if (i7 == i18) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = bnVar.f45987e;
                    if (chat2 != null && chat2.f28405id == longValue3 && (fjVar2 = (org.telegram.messenger.fj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && fjVar2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (bnVar.I5) {
                            gh ghVar = bnVar.D4;
                            if (ghVar != null) {
                                org.telegram.messenger.g0.r(ghVar);
                                bnVar.D4 = null;
                            }
                            fjVar2.f23968k.replies.read_max_id = intValue3;
                        } else {
                            gh ghVar2 = new gh(bnVar, fjVar2, intValue3);
                            bnVar.D4 = ghVar2;
                            org.telegram.messenger.g0.h3(ghVar2, 500L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = bnVar.f45987e;
                    if (chat3 != null && chat3.f28405id == longValue4 && (fjVar = (org.telegram.messenger.fj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = fjVar.f23968k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer B1 = bnVar.getMessagesController().B1(org.telegram.messenger.v3.M(bnVar.f45987e, bnVar.getMessagesController().P0(bnVar.f45987e.f28405id), false));
                            int size3 = fjVar.f23968k.replies.recent_repliers.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.fj.B1(fjVar.f23968k.replies.recent_repliers.get(i19)) == org.telegram.messenger.fj.B1(B1)) {
                                    fjVar.f23968k.replies.recent_repliers.remove(i19);
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            fjVar.f23968k.replies.recent_repliers.add(0, B1);
                        }
                        TLRPC.MessageReplies messageReplies2 = fjVar.f23968k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i20 = org.telegram.messenger.ks.A;
                    int i21 = org.telegram.messenger.ks.f25233z;
                    if ((i7 == i21 || i7 == i20) && bnVar.f46085l6 == ((Long) objArr[0]).longValue()) {
                        if (i7 == i21) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i7 == i20) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = bnVar.f46173s4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i22 = bnVar.A4;
                            ArrayList arrayList2 = bnVar.M6;
                            if (intValue4 > i22) {
                                bnVar.A4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i23 = 0; i23 < size4; i23++) {
                                    org.telegram.messenger.fj fjVar5 = (org.telegram.messenger.fj) arrayList2.get(i23);
                                    int e13 = fjVar5.e1();
                                    if (!fjVar5.N3() && e13 > 0 && e13 <= bnVar.A4) {
                                        if (!fjVar5.F4()) {
                                            break;
                                        }
                                        fjVar5.I5();
                                        kl klVar = bnVar.D0;
                                        if (klVar != null) {
                                            klVar.M(fjVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > bnVar.B4) {
                                bnVar.B4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    org.telegram.messenger.fj fjVar6 = (org.telegram.messenger.fj) arrayList2.get(i24);
                                    int e14 = fjVar6.e1();
                                    if (fjVar6.N3() && e14 > 0 && e14 <= bnVar.B4) {
                                        if (!fjVar6.F4()) {
                                            break;
                                        }
                                        fjVar6.I5();
                                        kl klVar2 = bnVar.D0;
                                        if (klVar2 != null) {
                                            klVar2.R(fjVar6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bnVar.o8(i7, objArr);
        bnVar.p8(i7, objArr);
        bnVar.q8(i7, objArr);
        bnVar.r8(i7, objArr);
        bnVar.s8(i7, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        fi.n2 n2Var = this.Y1;
        if (n2Var != null && this.visibleDialog == n2Var) {
            n2Var.f39670e2.d0(false);
            this.Y1.L();
            this.Y1.f39670e2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.ya && !(dialog instanceof ki.t2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7() {
        TLRPC.ChatFull P0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a02;
        if (this.N1 == null && org.telegram.messenger.v3.n0(this.f45987e) && (P0 = getMessagesController().P0(this.f45987e.f28405id)) != null && this.f45932a0 != null && getParentActivity() != null && (stickerSet = P0.emojiset) != null) {
            vj vjVar = this.f45976d1;
            if (vjVar == null || vjVar.getVisibility() != 0) {
                org.telegram.ui.Components.k30 k30Var = org.telegram.ui.Components.k30.f36656n;
                if (k30Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (a02 = getMediaDataController().a0(stickerSet)) != null && !a02.documents.isEmpty()) {
                        j3 = a02.documents.get(0).f28411id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        k30Var.b();
                        hi.m3 m3Var = new hi.m3(getParentActivity(), 3);
                        this.N1 = m3Var;
                        m3Var.k(true);
                        this.N1.r(true);
                        hi.m3 m3Var2 = this.N1;
                        m3Var2.L = Layout.Alignment.ALIGN_CENTER;
                        m3Var2.s(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(j3, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.v(org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(2131749250, null), spannableStringBuilder, "%s"));
                        hi.m3 m3Var3 = this.N1;
                        m3Var3.h = hi.m3.a(m3Var3.getText(), this.N1.getTextPaint());
                        hi.m3 m3Var4 = this.N1;
                        m3Var4.d = -1L;
                        m3Var4.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        this.N1.l(this.L);
                        org.telegram.messenger.g0.h3(new zd(this, 4), 300L);
                    }
                }
            }
        }
    }

    public final TextureView e8(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        org.telegram.messenger.g0.r(this.O8);
        if (this.J8 == null) {
            uj ujVar = new uj(this, getParentActivity(), 2);
            this.J8 = ujVar;
            ujVar.setOutlineProvider(new fh.a(this, 1));
            this.J8.setClipToOutline(true);
            this.J8.setWillNotDraw(false);
            j4 j4Var = new j4(getParentActivity());
            this.L8 = j4Var;
            j4Var.setBackgroundColor(0);
            if (z10) {
                this.J8.addView(this.L8, c8.ma.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.M8 = textureView;
            textureView.setOpaque(false);
            this.L8.addView(this.M8, c8.ma.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.J8.getParent();
        if (viewGroup != null && viewGroup != this.f46093m1) {
            viewGroup.removeView(this.J8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.f46093m1.addView(this.J8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.g0.f3(ba(), S9()), org.telegram.messenger.g0.f3(ba(), S9())));
        }
        this.J8.setTag(null);
        this.L8.setDrawingReady(false);
        return this.M8;
    }

    public final long e9() {
        if (this.f46018g4 == 3) {
            return this.f46173s4;
        }
        return 0L;
    }

    public final boolean ea() {
        if (getUserConfig().e() == a() && !getMessagesController().I1().f26296b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final boolean eb(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f46240x8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f46001f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f46240x8 == this.f46085l6) {
            this.f46240x8 = 0L;
            this.f45932a0.setFieldText(str);
            return true;
        }
        getMediaDataController().V1(this.f46240x8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((h2Var instanceof bn) && ((bn) h2Var).f46085l6 == this.f46240x8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.n5.C(this.f46240x8)) {
                bundle.putInt("enc_id", (int) (this.f46240x8 & 4294967295L));
            } else if (org.telegram.messenger.n5.E(this.f46240x8)) {
                bundle.putLong("user_id", this.f46240x8);
            } else {
                bundle.putLong("chat_id", -this.f46240x8);
            }
            I6();
            presentFragment(new bn(bundle), true);
        }
        return true;
    }

    public final void ec() {
        TLRPC.Chat chat = this.f45987e;
        if (chat != null) {
            if (org.telegram.messenger.v3.n0(chat)) {
                if (org.telegram.messenger.v3.N(this.f45987e)) {
                    m40 m40Var = new m40(a());
                    m40Var.m0 = this;
                    presentFragment(m40Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.v3.w(1, this.f45987e)) {
                qc qcVar = new qc(a());
                qcVar.m0 = this;
                presentFragment(qcVar);
                return;
            } else {
                return;
            }
        }
        this.ya = new org.telegram.ui.Components.lp(this, this.Ba);
        this.A0.setOnInterceptTouchListener(new org.telegram.messenger.ed(27));
        Pb(this.f46093m1, false);
        showDialog(this.ya, new ke(this, 1));
    }

    public final void ed() {
        lh.h hVar = this.f46246y1;
        wi wiVar = this.f46218w;
        if (hVar != null) {
            this.f46246y1.setTranslationY((((-wiVar.d()) - this.U.getInputBubbleHeight()) - t9(org.telegram.ui.Components.v11.f40477c)) - org.telegram.messenger.g0.L(13.0f));
        }
        if (this.f46170s1 != null) {
            this.f46170s1.setTranslationY((-wiVar.d()) - org.telegram.messenger.g0.L(16.0f));
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7() {
        ArrayList arrayList;
        int i7;
        if (this.f46114nb) {
            int i10 = -1;
            int i11 = 0;
            long j3 = 0;
            while (true) {
                arrayList = this.M6;
                if (i11 >= arrayList.size()) {
                    break;
                }
                long d12 = ((org.telegram.messenger.fj) arrayList.get(i11)).d1();
                if (j3 != d12) {
                    if (i10 >= 0 && j3 != 0 && (i7 = i11 - i10) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < i7; i12++) {
                            arrayList2.add((org.telegram.messenger.fj) arrayList.remove(i10));
                        }
                        Collections.sort(arrayList2, new pe(1));
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
                    arrayList3.add((org.telegram.messenger.fj) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void f8() {
        if (this.f46093m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new ai.l0(2, getParentActivity(), this);
            M9();
            this.Z1.setClickable(true);
            this.f45948b1.addView(this.Z1, c8.ma.o(-1, 44));
            this.f45948b1.i(2, this.Z1);
            this.f45948b1.h(this.Z1);
            TextView textView = new TextView(getParentActivity());
            this.f45963c2 = textView;
            int i7 = org.telegram.ui.ActionBar.n6.f29637q7;
            org.telegram.ui.ActionBar.u6.U(textView, i7, getResourceProvider());
            TextView textView2 = this.f45963c2;
            float L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.u6.Q(textView2, org.telegram.ui.ActionBar.n6.Y(L, getThemedColor(i7) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.u6.g(i7, 25), getResourceProvider());
            this.f45963c2.setTag(Integer.valueOf(i7));
            this.f45963c2.setTextSize(1, 14.0f);
            this.f45963c2.setTypeface(org.telegram.messenger.g0.o());
            this.f45963c2.setSingleLine(true);
            this.f45963c2.setMaxLines(1);
            this.f45963c2.setGravity(17);
            this.Z1.addView(this.f45963c2, c8.ma.e(-1, -1, 51));
            this.f45963c2.setOnClickListener(new oe(this, 13));
            org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(getParentActivity(), this.Ba);
            this.f46043i2 = k80Var;
            org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.Xe, getResourceProvider());
            this.f46043i2.setTextSize(1, 13.3f);
            this.f46043i2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.u6.G(this.f46043i2, org.telegram.ui.ActionBar.n6.Zl, getResourceProvider());
            this.f46043i2.setGravity(17);
            this.f46043i2.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            this.f45948b1.addView(this.f46043i2, c8.ma.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f45948b1.i(8, this.f46043i2);
            this.f45948b1.h(this.f46043i2);
            TextView textView3 = new TextView(getParentActivity());
            this.f45934a2 = textView3;
            int i10 = org.telegram.ui.ActionBar.n6.Ye;
            org.telegram.ui.ActionBar.u6.U(textView3, i10, getResourceProvider());
            this.f45934a2.setVisibility(8);
            this.f45934a2.setTextSize(1, 14.0f);
            this.f45934a2.setTypeface(org.telegram.messenger.g0.o());
            this.f45934a2.setSingleLine(true);
            this.f45934a2.setMaxLines(1);
            this.f45934a2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f45934a2.setGravity(17);
            TextView textView4 = this.f45934a2;
            int themedColor = getThemedColor(i10) & 436207615;
            int L3 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.u6.Q(textView4, org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.u6.g(i10, 25), getResourceProvider());
            this.Z1.addView(this.f45934a2, c8.ma.e(-1, -1, 51));
            this.f45934a2.setOnClickListener(new oe(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.d2 = textView5;
            org.telegram.ui.ActionBar.u6.U(textView5, i10, getResourceProvider());
            this.d2.setVisibility(8);
            this.d2.setTextSize(1, 14.0f);
            this.d2.setTypeface(org.telegram.messenger.g0.o());
            this.d2.setSingleLine(true);
            this.d2.setMaxLines(1);
            this.d2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.d2.setGravity(17);
            this.d2.setText(org.telegram.messenger.gd.M0(2131745889, null));
            org.telegram.ui.ActionBar.u6.Q(this.d2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i10) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.u6.g(i10, 25), getResourceProvider());
            this.f45948b1.addView(this.d2, c8.ma.o(-1, 48));
            this.f45948b1.i(4, this.d2);
            this.f45948b1.h(this.d2);
            this.d2.setOnClickListener(new oe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f46056j2 = imageView;
            imageView.setImageResource(2131231984);
            this.f46056j2.setContentDescription(org.telegram.messenger.gd.M0(2131752030, null));
            ImageView imageView2 = this.f46056j2;
            int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.O(getThemedColor(i11), 0, 0), null, org.telegram.ui.ActionBar.u6.M(i11), getResourceProvider());
            org.telegram.ui.ActionBar.u6.s(this.f46056j2, org.telegram.ui.ActionBar.n6.Ue, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f46056j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.f46056j2, c8.ma.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f46056j2.setOnClickListener(new oe(this, 16));
        }
    }

    public final int f9(int i7) {
        return (int) org.telegram.ui.Cells.c0.x((((this.A0.getMeasuredHeight() - this.Ya) - this.P9) - this.f46218w.e()) - org.telegram.messenger.g0.L(53.0f), i7, 2.0f, -org.telegram.messenger.g0.L(2.0f));
    }

    public final boolean fa() {
        if (this.f46096m4 != null) {
            return true;
        }
        return false;
    }

    public final void fb(int i7, org.telegram.messenger.fj fjVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.gd.u(fjVar.f23968k.date, false);
        tL_message.f28426id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fjVar.f23968k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(this.currentAccount, tL_message, false, false);
        fjVar2.D = 10;
        fjVar2.U = 1;
        fjVar2.f23974l0 = true;
        fjVar2.f23978m1 = q9(fjVar.X);
        this.D0.Q.add(i7, fjVar2);
    }

    public final void fc(boolean z10, org.telegram.messenger.fj fjVar, ArrayList arrayList, TLRPC.WebPage webPage, boolean z11, int i7, rm rmVar, boolean z12, long j3, boolean z13) {
        gc(z10, fjVar, null, arrayList, webPage, z11, i7, rmVar, z12, j3, null, z13);
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
        if ((!fa() || this.f46236x4) && this.f45935a3 != null) {
            if (!this.f46020g6) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.V4.size() > 1 && !this.X2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.f45935a3.getTag() != null) {
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
            if (objArr == null && !this.fc && !this.X2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.fc && !this.X2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.fc && !this.X2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.f45950b3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f45950b3 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.f45935a3.setVisibility(0);
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
                    this.f45950b3 = animatorSet2;
                    ImageView imageView = this.f45935a3;
                    Property property = View.ALPHA;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.f45935a3;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.f45935a3;
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
                    this.f45950b3.setInterpolator(org.telegram.ui.Components.lr.h);
                    this.f45950b3.setDuration(360L);
                    this.f45950b3.addListener(new bl(this, z14, z15, z16));
                    this.f45950b3.start();
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
                    ImageView imageView11 = this.f45935a3;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.f45935a3;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.f45935a3;
                    if (z15) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.f45935a3;
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
                ImageView imageView16 = this.f45935a3;
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
                if (fa() && !this.f46236x4) {
                    boolean z18 = z17;
                    this.O2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.O2.c((this.V4.size() - 1) - Collections.binarySearch(this.V4, Integer.valueOf(this.Z4), Comparator$CC.reverseOrder()), this.V4.size(), z11);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.h1 h1Var = this.f46023g9;
        if (h1Var != null) {
            h1Var.f28993e = false;
            P7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f45987e;
    }

    public final void g7(boolean z10) {
        jg.l1 l1Var;
        if (this.f45978d4 == 2 && (l1Var = this.f45951b4) != null) {
            String str = this.J3;
            hi.k kVar = l1Var.F;
            if (!TextUtils.equals(l1Var.f17575y, str)) {
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
                org.telegram.messenger.g0.r(kVar);
                fi.b6 b6Var = l1Var.E;
                if (b6Var != null && b6Var.I != 0) {
                    ConnectionsManager.getInstance(b6Var.f12044c).cancelRequest(b6Var.I, true);
                    b6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    l1Var.f17575y = str;
                    l1Var.E = new fi.b6(l1Var.f17571r, str2, trim);
                    if (z10) {
                        kVar.run();
                    } else {
                        org.telegram.messenger.g0.h3(kVar, 1000L);
                    }
                }
                fi.b6 b6Var2 = l1Var.E;
                if (b6Var2 != null && b6Var2.J > 0) {
                    l1Var.f();
                }
            }
        }
    }

    public final void g8() {
        int i7;
        if (this.f46016g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                b8();
            }
            org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(getParentActivity(), this, this.currentAccount, a(), O6(), getResourceProvider());
            this.f46016g2 = z11Var;
            z11Var.S = new zd(this, 6);
            z11Var.setSideMenuBackgroundDrawable(this.L.c(z11Var, c8.i0.p(this.Ba), false));
            org.telegram.ui.Components.z11 z11Var2 = this.f46016g2;
            z11Var2.setTopMenuBackgroundDrawable(this.L.c(z11Var2, c8.i0.p(this.Ba), false));
            this.f46016g2.setCurrentTopic(d());
            this.f46016g2.setOnNewTopicSelected(new zd(this, 7));
            this.f46016g2.setOnTopicSelected(new le(this, 0));
            this.f46016g2.setOnDialogSelected(new le(this, 1));
            int indexOfChild = this.f46093m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i7 = indexOfChild + 1;
            } else {
                i7 = 8;
            }
            this.f46093m1.addView(this.f46016g2, i7, c8.ma.f(-1.0f, -1, 51, 0, -org.telegram.messenger.g0.L(5.0f), 0, 0));
            this.f46016g2.p();
            Dd();
            kj kjVar = this.X1;
            if (kjVar != null) {
                kjVar.bringToFront();
            }
        }
    }

    public final int g9(org.telegram.messenger.fj fjVar) {
        return f9(W8(fjVar, !TextUtils.isEmpty(this.f46035h8))) - yb(fjVar);
    }

    public final boolean ga() {
        if (Z9()) {
            return getMessagesController().I1().e();
        }
        org.telegram.ui.Components.z11 z11Var = this.f46016g2;
        if (z11Var == null || !z11Var.f42728a.f57658f) {
            return false;
        }
        if (!org.telegram.messenger.v3.u0(this.f45987e)) {
            TLRPC.User user = this.f46001f;
            if (!org.telegram.messenger.o10.v(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void gb(Bundle bundle, org.telegram.messenger.fj fjVar) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.f45987e;
        if (chat != null && org.telegram.messenger.v3.V(chat) && !org.telegram.messenger.v3.p0(this.f45987e)) {
            TLRPC.Chat chat2 = this.f45987e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().O0(Long.valueOf(this.f45987e.linked_monoforum_id)) != null && !org.telegram.messenger.v3.z(this.currentAccount, 24, -this.f45987e.linked_monoforum_id)) {
                org.telegram.messenger.mp messagesController = getMessagesController();
                TLRPC.Chat chat3 = this.f45987e;
                long j3 = chat3.f28405id;
                long j10 = chat3.linked_monoforum_id;
                ConcurrentHashMap concurrentHashMap = messagesController.f25643f;
                concurrentHashMap.put(Long.valueOf(j3), Long.valueOf(j10));
                concurrentHashMap.put(Long.valueOf(j10), Long.valueOf(j3));
                bundle.putLong("reply_to_channel_direct", -this.f45987e.linked_monoforum_id);
                return;
            }
        }
        TLRPC.Message message = fjVar.f23968k;
        if (message != null) {
            peer = message.from_id;
        } else {
            peer = null;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        if (i7 != 0 && o4 != a() && o4 != getUserConfig().e() && i7 > 0) {
            bundle.putLong("reply_to_author", o4);
        }
    }

    public final void gc(boolean r34, org.telegram.messenger.fj r35, org.telegram.messenger.fj r36, java.util.ArrayList r37, org.telegram.tgnet.TLRPC.WebPage r38, boolean r39, int r40, org.telegram.ui.rm r41, boolean r42, long r43, org.telegram.messenger.kj r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.gc(boolean, org.telegram.messenger.fj, org.telegram.messenger.fj, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.rm, boolean, long, org.telegram.messenger.kj, boolean):void");
    }

    public final void gd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.gd(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.o4 getBackButtonState() {
        return org.telegram.ui.ActionBar.o4.f29826a;
    }

    @Override
    public final org.telegram.ui.ActionBar.q3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.q3.f29902c;
    }

    @Override
    public final org.telegram.messenger.t3 getGroupCall() {
        org.telegram.messenger.t3 t3Var;
        if (this.f46018g4 == 0 && (t3Var = this.f46123o8) != null && (t3Var.f26937b instanceof TLRPC.TL_groupCall)) {
            return t3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f46018g4 == 2) {
            ArrayList arrayList = this.M6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(80.0f) + W8((org.telegram.messenger.fj) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.Ba;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.n5 n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2;
        View view;
        org.telegram.ui.Components.ry ryVar;
        org.telegram.ui.Components.ry ryVar2;
        org.telegram.ui.Components.ry ryVar3;
        org.telegram.ui.Components.ry ryVar4;
        org.telegram.ui.Components.ry ryVar5;
        org.telegram.ui.Components.ry ryVar6;
        org.telegram.ui.Components.ry ryVar7;
        org.telegram.ui.Components.ry ryVar8;
        org.telegram.ui.Components.ry ryVar9;
        org.telegram.ui.Components.ry ryVar10;
        org.telegram.ui.Components.ry ryVar11;
        View view2;
        org.telegram.ui.Components.ry ryVar12 = null;
        if (this.f46226w7) {
            return null;
        }
        int i7 = 0;
        if (this.f46242xa) {
            this.f46242xa = false;
            return null;
        }
        f6 f6Var = new f6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ge));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.He));
        Y9();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.F8));
        vi viVar = this.f46129p1;
        if (viVar != null) {
            n5Var = viVar.getTitleTextView();
        } else {
            n5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(n5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A8));
        vi viVar2 = this.f46129p1;
        if (viVar2 != null) {
            n5Var2 = viVar2.getTitleTextView();
        } else {
            n5Var2 = null;
        }
        int i10 = org.telegram.ui.ActionBar.n6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(n5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        vi viVar3 = this.f46129p1;
        if (viVar3 != null) {
            view = viVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(i10, view));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.n6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29771x8));
        org.telegram.ui.ActionBar.v4 v4Var = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.v4 v4Var2 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.v4 v4Var3 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.v4 v4Var4 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.v4 v4Var5 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.v4 v4Var6 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.v4 v4Var7 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.v4 v4Var8 = (org.telegram.ui.ActionBar.v4) getThemedDrawable("drawableMsgOutMediaSelected");
        if (v4Var != null) {
            Drawable[] drawableArr = v4Var.A;
            int i12 = org.telegram.ui.ActionBar.n6.f29696ta;
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, v4Var2.A, (org.telegram.ui.ActionBar.v6) null, i12));
            Drawable[] drawableArr2 = v4Var5.A;
            int i13 = org.telegram.ui.ActionBar.n6.f29697tb;
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.v6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, v4Var6.A, (org.telegram.ui.ActionBar.v6) null, i13));
        }
        if (!this.Ba.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{v4Var5, v4Var6}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29717ub));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{v4Var5, v4Var6}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29736vb));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{v4Var5, v4Var6}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29755wb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{v4Var7, v4Var8}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29476hd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29494id));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29344ac));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29365bc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29584nc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29622pc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29602oc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29460gf));
        this.Ba.getClass();
        uj ujVar = this.f46017g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i14 = org.telegram.ui.ActionBar.n6.Je;
        arrayList.add(new org.telegram.ui.ActionBar.w6(ujVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ol));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Qe));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Re));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29368bg));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29424eg));
        rj rjVar = this.f45932a0;
        int i15 = org.telegram.ui.ActionBar.n6.f29405dg;
        arrayList.add(new org.telegram.ui.ActionBar.w6(rjVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29441fg));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Uf));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45932a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Xf));
        rj rjVar2 = this.f45932a0;
        if (rjVar2 != null) {
            ryVar = rjVar2.getEmojiView();
        } else {
            ryVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Cf));
        rj rjVar3 = this.f45932a0;
        if (rjVar3 != null) {
            ryVar2 = rjVar3.getEmojiView();
        } else {
            ryVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar2, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Df));
        rj rjVar4 = this.f45932a0;
        if (rjVar4 != null) {
            ryVar3 = rjVar4.getEmojiView();
        } else {
            ryVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar3, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Ef));
        rj rjVar5 = this.f45932a0;
        if (rjVar5 != null) {
            ryVar4 = rjVar5.getEmojiView();
        } else {
            ryVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar4, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Gf));
        rj rjVar6 = this.f45932a0;
        if (rjVar6 != null) {
            ryVar5 = rjVar6.getEmojiView();
        } else {
            ryVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar5, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Hf));
        rj rjVar7 = this.f45932a0;
        if (rjVar7 != null) {
            ryVar6 = rjVar7.getEmojiView();
        } else {
            ryVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar6, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Jf));
        rj rjVar8 = this.f45932a0;
        if (rjVar8 != null) {
            ryVar7 = rjVar8.getEmojiView();
        } else {
            ryVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar7, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Kf));
        rj rjVar9 = this.f45932a0;
        if (rjVar9 != null) {
            ryVar8 = rjVar9.getEmojiView();
        } else {
            ryVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar8, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Of));
        rj rjVar10 = this.f45932a0;
        if (rjVar10 != null) {
            ryVar9 = rjVar10.getEmojiView();
        } else {
            ryVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar9, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Ff));
        rj rjVar11 = this.f45932a0;
        if (rjVar11 != null) {
            ryVar10 = rjVar11.getEmojiView();
        } else {
            ryVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar10, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Bf));
        rj rjVar12 = this.f45932a0;
        if (rjVar12 != null) {
            ryVar11 = rjVar12.getEmojiView();
        } else {
            ryVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar11, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Mf));
        rj rjVar13 = this.f45932a0;
        if (rjVar13 != null) {
            ryVar12 = rjVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(ryVar12, 0, new Class[]{org.telegram.ui.Components.ry.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.If));
        rj rjVar14 = this.f45932a0;
        if (rjVar14 != null) {
            org.telegram.ui.Components.t31 trendingStickersAlert = rjVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.V());
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.f45932a0.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nl));
        }
        for (int i16 = 0; i16 < 2; i16++) {
            if (i16 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.wj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Pf));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Qf));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29732v7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29713u7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29789y7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29396d6));
        NumberTextView numberTextView = this.U2;
        int i17 = org.telegram.ui.ActionBar.n6.We;
        arrayList.add(new org.telegram.ui.ActionBar.w6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i17));
        ImageView imageView = this.f46031h3;
        int i18 = org.telegram.ui.ActionBar.n6.f29809z8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f46044i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.A0, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29777xf));
        hi.m5 m5Var = this.S;
        int i19 = org.telegram.ui.ActionBar.n6.f29385cd;
        arrayList.add(new org.telegram.ui.ActionBar.w6(m5Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f46143q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29552lg));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29569mg));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Zh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29350ai));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29370bi));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29339a7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.tk));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.vk));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.uk));
        int i20 = org.telegram.ui.ActionBar.n6.wk;
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i20));
        zh.d dVar = this.Ca;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(dVar.f61981g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.w6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ue));
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.w6) obj).f30165n = this.Ba;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.Ba.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint g10 = this.Ba.g(str);
        if (g10 != null) {
            return g10;
        }
        return org.telegram.ui.ActionBar.n6.V0(str);
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
        if (this.f46218w.f56610s == 1) {
            z10 = false;
        }
        if (this.f46190tb != z10) {
            this.f46190tb = z10;
            checkSystemBarColors();
        }
    }

    public final void h8() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.Ba);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.f46093m1.addView(this.N3, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        ArrayList arrayList = this.M6;
        if (!arrayList.isEmpty()) {
            int i12 = 1;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
            if ((((org.telegram.messenger.fj) arrayList.get(0)).f23968k.date >= i7 && fjVar.f23968k.date <= i7) || (fjVar.f23968k.date >= i7 && this.U6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(size);
                    if (fjVar2.f23968k.date >= i7 && fjVar2.e1() != 0) {
                        int e12 = fjVar2.e1();
                        if (org.telegram.messenger.fj.B0(fjVar2.f23968k) != this.f45981d7) {
                            i12 = 0;
                        }
                        l(e12, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.n5.C(this.f46085l6)) {
                int N0 = this.C0.N0();
                int L0 = this.C0.L0();
                while (true) {
                    if (L0 <= N0) {
                        kl klVar = this.D0;
                        int i13 = klVar.K;
                        if (L0 >= i13 && L0 < klVar.L && (message = ((org.telegram.messenger.fj) arrayList.get(L0 - i13)).f23968k) != null) {
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
                this.f46124o9.m(i10);
                org.telegram.ui.ActionBar.u1 u1Var = this.Tb;
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                fd(false);
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), this.Ba);
                this.Tb = u1Var2;
                u1Var2.setOnCancelListener(this.Ja);
                this.Tb.r(1000L);
                int i14 = this.f46109n6;
                this.f46150q9 = i14;
                this.s9 = false;
                this.f46263z6.add(Integer.valueOf(i14));
                this.f46164r9 = 0;
                this.f46188t9 = false;
                org.telegram.messenger.mp messagesController = getMessagesController();
                long j3 = this.f46085l6;
                long j10 = this.f45981d7;
                int i15 = this.classGuid;
                int i16 = this.f46018g4;
                long j11 = this.f46173s4;
                int i17 = this.C4;
                int i18 = this.f46109n6;
                this.f46109n6 = i18 + 1;
                messagesController.e3(j3, j10, false, 30, 0, i7, true, 0, i15, 4, i16, j11, i17, i18, this.f46236x4);
                this.f46095m3.setAlpha(0.0f);
                this.f46095m3.setTag(null);
                this.f46235x3 = 0.0f;
                Tc();
                this.f46106n3.setTag(null);
            }
        }
    }

    public final void hb() {
        int i7;
        this.V4.clear();
        this.X4.clear();
        this.Z4 = 0;
        this.f45979d5 = 0;
        this.f45993e5 = 0;
        gd(0, true);
        org.telegram.messenger.ri mediaDataController = getMediaDataController();
        long a10 = a();
        TLRPC.ChatFull chatFull = this.f46163r8;
        if (chatFull == null) {
            i7 = 0;
        } else {
            i7 = chatFull.pinned_msg_id;
        }
        mediaDataController.T0(0, i7, a10);
        this.f46007f5 = true;
        hd();
    }

    public final void hc(ArrayList arrayList) {
        fc(true, null, arrayList, null, true, 0, null, false, 0L, true);
    }

    public final void hd() {
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f46236x4 && !this.X4.isEmpty() && this.V4.size() == 1 && ((Integer) this.V4.get(0)).intValue() == d() + 1) {
            fjVar = (org.telegram.messenger.fj) this.X4.get(this.V4.get(0));
        } else {
            fjVar = null;
        }
        this.f46107n4 = fjVar;
        if (this.f46236x4 && fjVar != null && (message = fjVar.f23968k) != null && (tL_forumTopic = this.f46159r4) != null && !org.telegram.messenger.fj.v5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.f45987e;
            TLRPC.Peer peer = this.f46107n4.f23968k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.v3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f28405id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.v3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f28405id == peer.chat_id) {
                        return;
                    }
                }
                this.f46107n4 = null;
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.fj fjVar = this.f46096m4;
        if (fjVar != null && fjVar.M1() == 0 && org.telegram.messenger.v3.n(this.f45987e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i7() {
        TLRPC.Chat O0;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                Oa("");
                ImageView imageView = this.f46044i3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                Db(null, c22);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (O0 = getMessagesController().O0(Long.valueOf(j10))) != null) {
            Oa("");
            ImageView imageView2 = this.f46044i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Db(O0, null);
        }
    }

    public final ArrayList i8(org.telegram.messenger.fj fjVar, boolean z10) {
        ArrayList i7 = org.telegram.messenger.f3.i(fjVar);
        int e12 = fjVar.e1();
        fjVar.A0();
        if (e12 != 0) {
            ArrayList arrayList = this.M6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(size);
                if ((org.telegram.messenger.fj.B0(fjVar2.f23968k) != this.f45981d7 || org.telegram.messenger.fj.B0(fjVar.f23968k) == this.f45981d7) && (((this.h == null && fjVar2.e1() > e12) || (this.h != null && fjVar2.e1() < e12)) && ((org.telegram.messenger.fj.R4(fjVar2.f23968k) || fjVar2.h4()) && !fjVar2.S4() && !fjVar2.g4() && (!z10 || (fjVar2.f23968k.media_unread && !fjVar2.N3()))))) {
                    i7.add(fjVar2);
                }
            }
        }
        return i7;
    }

    public final tm i9() {
        if (this.Vc == null) {
            this.Vc = new tm(this);
        }
        return this.Vc;
    }

    public final void ia(org.telegram.ui.ActionBar.h1 h1Var) {
        if (Build.VERSION.SDK_INT >= 30 && h1Var != null && h1Var.isShowing()) {
            View contentView = h1Var.getContentView();
            View rootView = contentView.getRootView();
            final boolean[] zArr = new boolean[1];
            final ai.b bVar = new ai.b(this, rootView, zArr, h1Var, contentView);
            rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zArr[0] = false;
                    view.post(bVar);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
            rootView.addOnLayoutChangeListener(new ng(bVar, 0));
            rootView.requestApplyInsets();
        }
    }

    public final void ib(org.telegram.messenger.fj fjVar) {
        if (fjVar == this.f46153qc) {
            this.f46153qc = null;
            zd(true);
            return;
        }
        org.telegram.messenger.ip Q1 = getMessagesController().Q1(this.f46085l6);
        if (Q1 != null) {
            Q1.f24700a.remove(fjVar);
        }
    }

    public final void ic(org.telegram.messenger.fj fjVar) {
        fc(true, fjVar, null, null, true, 0, null, false, 0L, true);
    }

    public final void id(boolean z10) {
        boolean z11;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.B1 > 0 && ((i7 = this.f46018g4) == 0 || i7 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46246y1.e(4, z11, z10);
        this.f46246y1.c(4, this.B1, z10);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (Y9()) {
            org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.i(org.telegram.ui.ActionBar.n6.f29752w8);
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29752w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.n6.I.q();
        } else {
            z10 = this.f46039hc;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.f11 f11Var;
        mk mkVar;
        wh.i iVar;
        if ((this.f46018g4 == 5 && (this.M6.isEmpty() || this.f46173s4 == 0)) || (((f11Var = this.f46104n0) != null && (f11Var.f34899y > 0.0f || f11Var.f34878c0)) || this.f46254y9 || this.f46027gd.f57658f || !this.K9 || (((mkVar = this.f45972cb) != null && mkVar.f40284s) || ((iVar = this.f46202ua) != null && iVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f46001f;
    }

    public final void j7() {
        org.telegram.messenger.fj fjVar;
        if (!this.R4 && (fjVar = this.f45955b8) != null) {
            if (this.M6.indexOf(fjVar) >= 0) {
                this.S4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.Q4 != null) {
        } else {
            af afVar = new af(this, 19);
            this.Q4 = afVar;
            org.telegram.messenger.g0.g3(afVar);
        }
    }

    public final void j8(int i7, int i10, boolean z10) {
        this.D0.N.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.M6;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
            int i12 = fjVar.f23968k.date;
            if (i12 <= i7 || i12 >= i10) {
                this.D0.N.add(fjVar);
            }
            i11++;
        }
        bj bjVar = this.A0;
        if (bjVar != null) {
            bjVar.setEmptyView(null);
        }
        if (this.D0.N.isEmpty()) {
            wc(true);
        }
        kl klVar = this.D0;
        klVar.M = true;
        klVar.O(true);
        h8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f46085l6, 81, new bi.n4(this, i7, i10, z10), new vf(this, 18));
    }

    public final long j9() {
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        org.telegram.messenger.fj fjVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.v3.p0(this.f45987e) || !org.telegram.messenger.v3.A(this.currentAccount, this.f45987e, 24)) {
            return 0L;
        }
        long j3 = this.f46173s4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && (fjVar2 = this.H5) != null && (message2 = fjVar2.f23968k) != null) {
            return org.telegram.messenger.n5.o(message2.saved_peer_id);
        }
        if (i7 == 0 && (fjVar = this.F5) != null && (message = fjVar.f23968k) != null) {
            return org.telegram.messenger.n5.o(message.saved_peer_id);
        }
        return j3;
    }

    public final void ja(ArrayList arrayList) {
        org.telegram.ui.Components.z11 z11Var;
        if (arrayList != null && (z11Var = this.f46016g2) != null && z11Var.U) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
                if (fjVar != null && fjVar.D == 36) {
                    TLRPC.MessageMedia n1 = org.telegram.messenger.fj.n1(fjVar.f23968k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54845a;
                    if (n1 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!fjVar.U2) {
                            fjVar.U2 = true;
                            fjVar.n0(null);
                        }
                    }
                }
                if (fjVar != null && fjVar.P2() && !fjVar.P3() && fjVar.c1() != 0 && !fjVar.U2) {
                    fjVar.U2 = true;
                    fjVar.n0(null);
                }
            }
        }
    }

    public final void jb(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(fjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            kl klVar = this.D0;
            if (klVar != null && !klVar.O) {
                klVar.s(klVar.K + indexOf);
            }
        }
    }

    public final void jc(org.telegram.messenger.fj fjVar, rm rmVar) {
        fc(true, fjVar, null, null, true, 0, rmVar, false, 0L, true);
    }

    public final void jd(boolean z10) {
        boolean z11;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i7 = this.f46018g4) == 0 || i7 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46246y1.e(3, z11, z10);
        this.f46246y1.c(3, this.A1, z10);
    }

    public final void k7(boolean z10) {
        if (this.F5 != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
                    if (fjVar != null && fjVar.e1() == this.F5.e1() && org.telegram.messenger.fj.B0(fjVar.f23968k) == org.telegram.messenger.fj.B0(this.F5.f23968k)) {
                        this.F5 = fjVar;
                        rm rmVar = this.D5;
                        if (rmVar != null) {
                            rmVar.a(fjVar);
                        }
                        if (z10) {
                            org.telegram.messenger.jj jjVar = this.f46237x5;
                            if (jjVar != null) {
                                org.telegram.messenger.fj fjVar2 = this.F5;
                                org.telegram.messenger.aj ajVar = this.B5;
                                if (ajVar == null) {
                                    ajVar = U8(fjVar2.c1());
                                }
                                jjVar.f(fjVar2, ajVar, this.f46085l6, this.D5);
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

    public final void k8(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.fj fjVar, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.q1 q1Var2;
        CharacterStyle characterStyle2;
        int i7;
        org.telegram.messenger.fj fjVar2;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.y60 J = org.telegram.ui.Components.y60.J(this, q1Var);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(getParentActivity(), this.Ba);
        J.f42369p = new fe(wk0Var, 0);
        if (!str.startsWith("video?") && !vf.c.g(Uri.parse(str), false, null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean T2 = getMessagesController().T2(str);
        if (T2 && z10) {
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
                i11 = 2131231926;
            } else {
                i11 = 2131232267;
            }
            if (z11 && !z12) {
                i12 = 2131747598;
            } else {
                i12 = 2131747624;
            }
            String M0 = org.telegram.messenger.gd.M0(i12, null);
            z15 = z10;
            i7 = 2131232267;
            di.z1 z1Var = new di.z1(this, str, characterStyle, fjVar, q1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            q1Var2 = q1Var;
            J.c(i11, M0, z1Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            q1Var2 = q1Var;
            characterStyle2 = characterStyle;
            i7 = 2131232267;
        }
        if ((z13 && !z14) || startsWith) {
            J.c(i7, org.telegram.messenger.gd.M0(2131747600, null), new ge(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !T2) {
            J.c(2131231926, org.telegram.messenger.gd.M0(2131747598, null), new ge(this, str, 1), false);
        }
        TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(fjVar);
        if ((m12 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m12.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            fjVar2 = fjVar;
            J.c(2131231835, org.telegram.messenger.gd.M0(2131747597, null), new he(this, fjVar2, 0), false);
        } else {
            fjVar2 = fjVar;
        }
        if (z14) {
            i10 = 2131751752;
        } else if (startsWith) {
            i10 = 2131751750;
        } else {
            i10 = 2131751751;
        }
        J.c(2131232105, org.telegram.messenger.gd.M0(i10, null), new aa.c0(this, str, fjVar2, startsWith, 26), false);
        if (T2 && !z14 && !startsWith && !str.startsWith("tg:")) {
            J.c(2131232506, org.telegram.messenger.gd.M0(2131742683, null), new ge(this, str, 2), false);
        }
        wk0Var.e(J);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            wk0Var.f(q1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.r41) {
            String d = vf.c.d(((org.telegram.ui.Components.r41) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            wk0Var.f(q1Var2, characterStyle2, spannableString2, false);
        } else {
            wk0Var.f(q1Var2, characterStyle2, null, false);
        }
        showDialog(wk0Var);
    }

    public final int k9() {
        return this.f46093m1.getBackgroundSizeY();
    }

    public final void ka() {
        this.R4 = true;
        if (this.E6) {
            org.telegram.messenger.tr messagesStorage = getMessagesStorage();
            messagesStorage.f27054a.c(new org.telegram.messenger.t8(messagesStorage, d(), this.f46085l6, new cg(this, 1), 5));
            return;
        }
        org.telegram.messenger.tr messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().l1(this.f46085l6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f46236x4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f46173s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.D6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new u7(5, this, messagesStorage2));
    }

    public final void kb(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(fjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            kl klVar = this.D0;
            if (klVar != null && !klVar.O) {
                klVar.P(klVar.K + indexOf, true);
            }
        }
    }

    public final void kc(org.telegram.messenger.kj kjVar) {
        gc(true, null, null, null, null, true, 0, null, false, 0L, kjVar, true);
    }

    public final void kd(boolean z10) {
        String M0;
        if (this.f46018g4 != 3 && !org.telegram.messenger.o10.v(this.f46001f)) {
            vi viVar = this.f46129p1;
            if (viVar != null && this.f46173s4 != 0) {
                if (this.f46236x4) {
                    Bd();
                } else if (this.f46209v4) {
                    org.telegram.messenger.fj fjVar = this.f46096m4;
                    if (fjVar != null && fjVar.x2()) {
                        this.f46129p1.setTitle(org.telegram.messenger.gd.G(this.f46096m4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131751985, null));
                    }
                } else {
                    org.telegram.messenger.fj fjVar2 = this.f46096m4;
                    if (fjVar2 != null) {
                        viVar.setTitle(org.telegram.messenger.gd.G(fjVar2.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f46145q4 != null) {
                if (this.f46096m4.M1() == 0) {
                    if (this.f46209v4) {
                        M0 = org.telegram.messenger.gd.M0(2131748034, null);
                    } else {
                        M0 = org.telegram.messenger.gd.M0(2131747976, null);
                    }
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131751364, null);
                }
                org.telegram.messenger.fj fjVar3 = this.f46145q4;
                fjVar3.f23968k.message = M0;
                fjVar3.v = M0;
                if (z10) {
                    this.D0.R(fjVar3, true, false);
                }
            }
        }
    }

    @Override
    public final void l(int i7, int i10, boolean z10, int i11, boolean z11, int i12) {
        Bb(i7, i10, z10, i11, z11, i12, null, null, null);
    }

    public final void l7() {
        vj vjVar;
        uj ujVar;
        uj ujVar2;
        rj rjVar = this.f45932a0;
        if (rjVar != null && rjVar.f32646n4) {
            MediaController.B().O = false;
            return;
        }
        TLRPC.Chat chat = this.f45987e;
        if (chat != null && !org.telegram.messenger.v3.v(chat)) {
            MediaController.B().O = false;
        } else if (!org.telegram.messenger.t0.f26923x && (((vjVar = this.f45976d1) == null || vjVar.getVisibility() != 0) && (((ujVar = this.T) == null || ujVar.getVisibility() != 0) && ((ujVar2 = this.f46017g3) == null || ujVar2.getVisibility() != 0)))) {
            MediaController.B().O = true;
        } else {
            MediaController.B().O = false;
        }
    }

    public final void l8(CharacterStyle characterStyle, boolean z10, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.q1 q1Var) {
        Object[] objArr;
        int i7;
        TLRPC.WebPage webPage;
        boolean z11;
        int i10;
        org.telegram.messenger.fj fjVar2;
        org.telegram.messenger.fj fjVar3;
        org.telegram.messenger.fj fjVar4;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.fj fjVar5;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.fj messageObject;
        ArrayList arrayList;
        org.telegram.messenger.aj ajVar;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z12 = true;
            boolean z13 = true;
            char c10 = 1;
            char c11 = 1;
            if (!W9() && (fjVar == null || (message = fjVar.f23968k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.q1 q1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.o41) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.o41 o41Var = (org.telegram.ui.Components.o41) characterStyle;
                    org.telegram.messenger.g0.g(o41Var.f37958a.subSequence(o41Var.f37959b, o41Var.f37960c).toString());
                    h8();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z10 && q1Var != null) {
                    q1Var.h3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.s41) {
                TLRPC.User c22 = getMessagesController().c2(Utilities.A(((org.telegram.ui.Components.s41) characterStyle).getURL()));
                if (c22 != null) {
                    org.telegram.messenger.mp.u1(this.currentAccount).G3(c22, null, this, 0);
                }
                if (z10 && q1Var != null) {
                    q1Var.h3(-1);
                }
                ma(fjVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.k00) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.k00) characterStyle).f36597b;
                if (tL_messageEntityFormattedDate == null || (messageObject = q1Var.getMessageObject()) == null) {
                    q1Var2 = q1Var;
                } else {
                    if (messageObject.c1() != 0 && (ajVar = (org.telegram.messenger.aj) this.P6.f(messageObject.c1())) != null) {
                        arrayList = ajVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.f3.i(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e10 = getUserConfig().e();
                    String A = org.telegram.messenger.gd.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.y60 J = org.telegram.ui.Components.y60.J(this, q1Var);
                    org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(getParentActivity(), this.Ba);
                    J.f42369p = new fe(wk0Var, 0);
                    J.c(2131232105, org.telegram.messenger.gd.M0(2131746137, null), new je(this, wk0Var, A, 0), false);
                    q1Var2 = q1Var;
                    J.c(2131232079, org.telegram.messenger.gd.M0(2131746138, null), new di.m6((org.telegram.messenger.fs) this, (Object) J, (Object) messageObject, (Object) q1Var, A, (Object) tL_messageEntityFormattedDate, (Object) wk0Var, 4), false);
                    J.c(2131232264, org.telegram.messenger.gd.M0(2131746136, null), new di.a3(this, J, e10, tL_messageEntityFormattedDate, arrayList2, wk0Var, 5), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    wk0Var.e(J);
                    wk0Var.f(q1Var2, characterStyle, spannableString, false);
                    showDialog(wk0Var);
                }
                if (q1Var2 != null) {
                    q1Var2.h3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.p41) {
                String url = ((org.telegram.ui.Components.p41) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    m8(q1Var, characterStyle, url.substring(4));
                    if (z10 && q1Var != null) {
                        q1Var.h3(-1);
                    }
                } else if (fjVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.m41.h) {
                        rj rjVar = this.f45932a0;
                        TLRPC.Chat chat = this.f45987e;
                        if (chat == null || !chat.megagroup) {
                            z13 = false;
                        }
                        rjVar.y1(fjVar, url, z10, z13);
                        if (!z10 && this.f45932a0.getFieldText() == null) {
                            D9(false);
                        }
                    }
                    if (z10 && q1Var != null) {
                        q1Var.h3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.G6;
                    if (fjVar != null && url.startsWith("video") && !z10) {
                        int intValue = Utilities.z(url).intValue();
                        if (fjVar.e5()) {
                            webPage2 = fjVar.f23968k.media.webpage;
                            fjVar4 = fjVar;
                        } else {
                            org.telegram.messenger.fj fjVar6 = fjVar.C;
                            if (fjVar6 != null && fjVar6.e5()) {
                                fjVar4 = fjVar.C;
                                webPage2 = fjVar4.f23968k.media.webpage;
                            } else {
                                fjVar4 = fjVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.gu.O0(this, fjVar4, this.f45985db, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, V9());
                            return;
                        }
                        if (!org.telegram.messenger.fj.L4(fjVar4.f23968k) && (fjVar5 = fjVar4.C) != null) {
                            if (org.telegram.messenger.fj.B0(fjVar5.f23968k) == this.f46085l6) {
                                c10 = 0;
                            }
                            org.telegram.messenger.fj fjVar7 = (org.telegram.messenger.fj) sparseArrayArr[c10].get(fjVar4.C.e1());
                            if (fjVar7 == null) {
                                fjVar4 = fjVar4.C;
                            } else {
                                fjVar4 = fjVar7;
                            }
                        } else {
                            q1Var3 = q1Var;
                        }
                        fjVar4.f23933c0 = intValue / ((float) fjVar4.L0());
                        Ka(q1Var3, fjVar4);
                    } else if (fjVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!fjVar.I3() && (fjVar3 = fjVar.C) != null) {
                            if (org.telegram.messenger.fj.B0(fjVar3.f23968k) == this.f46085l6) {
                                c11 = 0;
                            }
                            fjVar2 = (org.telegram.messenger.fj) sparseArrayArr[c11].get(fjVar.C.e1());
                        } else {
                            fjVar2 = fjVar;
                        }
                        if (fjVar2 != null) {
                            float f10 = intValue2;
                            float L0 = f10 / ((float) fjVar2.L0());
                            MediaController mediaController = getMediaController();
                            if (mediaController.I(fjVar2)) {
                                fjVar2.f23928b0 = L0;
                                mediaController.i0(fjVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(fjVar2);
                                }
                            } else {
                                fjVar2.f23933c0 = f10 / ((float) fjVar2.L0());
                                mediaController.S(fjVar2);
                            }
                            if (z10 && q1Var != null) {
                                q1Var.h3(-1);
                            }
                            if (!org.telegram.messenger.fj.R4(fjVar2.f23968k)) {
                                showDialog(new org.telegram.ui.Components.g8(getParentActivity(), this.Ba));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        di.o3 o3Var = new di.o3(this, q1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            gi na2 = na(q1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (na2 != null) {
                                na2.f59374b = new hq0(zArr, 23);
                                na2.d();
                            }
                            D.i0(new ne(this, zArr, na2, userArr, o3Var, 0), substring);
                        } else {
                            o3Var.run();
                        }
                        if (q1Var != null) {
                            q1Var.h3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        gi na3 = na(q1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        na3.f59374b = new re(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new di.m7(this, na3, q1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().Q3, 1, true), 2);
                        na3.d();
                        q1Var.h3(-1);
                    } else {
                        Ca(characterStyle, url, z10, q1Var, fjVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    m8(q1Var, characterStyle, url2.substring(4));
                } else if (z10) {
                    k8(q1Var, fjVar, characterStyle, url2);
                    if (q1Var != null) {
                        q1Var.h3(-1);
                    }
                } else {
                    ma(fjVar, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        vf.c.t(parentActivity, url2);
                        return;
                    }
                    boolean z14 = characterStyle instanceof org.telegram.ui.Components.r41;
                    if ((z14 && (url2 == null || !url2.startsWith("mailto:"))) || org.telegram.messenger.g0.H3(url2)) {
                        if (fjVar != null) {
                            i10 = fjVar.e1();
                        } else {
                            i10 = 0;
                        }
                        if (Ha(url2, q1Var, characterStyle, i10, 1)) {
                            return;
                        }
                    } else {
                        if (fjVar != null) {
                            TLRPC.MessageMedia messageMedia = fjVar.f23968k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = fjVar.f23968k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(fjVar) == null) {
                                        createArticleViewer(false).L(fjVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (fjVar != null) {
                            i7 = fjVar.e1();
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
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.f46093m1.getBackgroundTranslationY()) - ((1.0f - this.U9) * this.P9);
    }

    public final void la(boolean z10) {
        TLRPC.Chat chat;
        if (this.Ea == null && (chat = this.f45987e) != null && org.telegram.messenger.v3.k(chat) && this.f45932a0 != null && !org.telegram.messenger.v3.p0(this.f45987e)) {
            TLRPC.TL_channels_sendAsPeers O1 = getMessagesController().O1(this.f46085l6, false);
            this.Ea = O1;
            if (O1 != null) {
                this.f45932a0.u2(false, z10);
            }
        }
    }

    public final void lb() {
        if (this.f46035h8 == null && this.f46048i8 == null && this.f46061j8 == null) {
            zd zdVar = this.f46100m8;
            if (zdVar != null) {
                org.telegram.messenger.g0.r(zdVar);
                this.f46100m8 = null;
            }
            this.f45982d8 = Integer.MAX_VALUE;
            this.f46010f8 = false;
            this.f46022g8 = 0L;
            this.f46035h8 = null;
            this.f46048i8 = null;
            this.f46061j8 = null;
        }
    }

    public final void lc(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        fc(z10, null, null, webPage, true, 0, null, z11, 0L, true);
    }

    public final void ld(int i7, org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.fj fjVar2;
        SparseArray sparseArray = this.I6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i7);
        if (arrayList == null) {
            return;
        }
        if (fjVar == null) {
            fjVar2 = new org.telegram.messenger.fj(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            fjVar2 = null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) this.G6[0].get(((Integer) arrayList.get(i10)).intValue());
            if (fjVar3 != null) {
                if (fjVar == null) {
                    fjVar3.C = fjVar2;
                } else {
                    fjVar3.C = fjVar;
                }
                kl klVar = this.D0;
                if (klVar != null) {
                    klVar.R(fjVar3, true, false);
                }
            }
        }
        if (fjVar == null) {
            sparseArray.remove(i7);
        }
    }

    public final boolean m7(boolean z10, boolean z11) {
        rj rjVar = this.f45932a0;
        if (rjVar == null || !rjVar.Q0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
            boolean z12 = this.f45932a0.f32567d1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            if (z12) {
                u1Var.S = org.telegram.messenger.gd.M0(2131751384, null);
                u1Var.U = org.telegram.messenger.gd.M0(2131751385, null);
            } else {
                u1Var.S = org.telegram.messenger.gd.M0(2131751381, null);
                u1Var.U = org.telegram.messenger.gd.M0(2131751382, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751383, null), new ab.z(5, this, z11));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751760, null), null);
            showDialog(u1Var);
            return true;
        }
        return true;
    }

    public final void m8(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, String str) {
        gi na2 = na(q1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f24576l0.get(pf.b.d(str, false));
        di.m2 m2Var = new di.m2(this, q1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(tL_contact.user_id));
            if (c22 != null) {
                m2Var.a(c22);
                return;
            } else {
                getMessagesStorage().f27054a.c(new o1(this, tL_contact, m2Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        na2.f59374b = new re(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new z9(this, na2, m2Var, 3)), 0);
        na2.d();
    }

    public final float m9() {
        org.telegram.ui.Components.z11 z11Var = this.f46016g2;
        if (z11Var != null) {
            return z11Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void ma(org.telegram.messenger.fj fjVar, boolean z10, boolean z11) {
        if (fjVar != null && fjVar.r4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = fjVar.R0;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void mb(boolean z10) {
        org.telegram.messenger.fj fjVar = this.f45955b8;
        if (fjVar != null) {
            if (z10) {
                boolean[] zArr = this.W6;
                zArr[1] = true;
                zArr[0] = true;
                this.Z7 = 0;
                this.f45968c7 = 0;
            }
            this.V7 = 0;
            this.W7 = false;
            jb(fjVar);
            this.f45955b8 = null;
        }
    }

    public final void mc(boolean z10) {
        if (this.f46095m3 != null && !X9()) {
            if (this.f46095m3.getTag() == null) {
                AnimatorSet animatorSet = this.f46208v3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f46095m3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f46208v3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f46208v3.playTogether(ObjectAnimator.ofFloat(this.f46095m3, View.ALPHA, 1.0f));
                this.f46208v3.addListener(new ei(this, 4));
                this.f46208v3.start();
            }
            if (!z10) {
                O9();
                this.f46131p3 = 1000;
            }
        }
    }

    public final void md(boolean z10) {
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            rjVar.r2(z10);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        boolean z12;
        String str2 = null;
        D8(str, null);
        if (u7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(str, this.f46085l6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = Y8();
                z12 = z11;
                b10.L = z12;
                b10.Q = j10;
                b10.R = j9();
                b10.T = this.f46250y5;
                org.telegram.messenger.zy.C(this.currentAccount).r0(b10);
            } else {
                z12 = z11;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f46085l6, false, false, true, 0, 0, null, -1, j10, j9(), this.f46250y5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j11 = this.f46085l6;
            org.telegram.messenger.fj fjVar = this.F5;
            org.telegram.messenger.fj fjVar2 = this.f46096m4;
            rm rmVar = this.D5;
            String str3 = str2;
            org.telegram.messenger.zy.V(i7, j11, j3, j10, j9(), str3, null, arrayList, arrayList, null, arrayList2, null, null, accountInstance, fjVar, fjVar2, this.H5, this.f46250y5, Y8(), null, rmVar, null, null, z10, z12);
            L6();
        }
    }

    public final void n7() {
        if (!this.wc) {
            this.wc = true;
            if (!this.xc && this.f46018g4 == 0 && !getMessagesController().I1().f26296b && getMessagesController().I1().c() > 2) {
                if (this.K1 != null && org.telegram.messenger.mp.g1().getInt("savedhint", 0) < 1) {
                    this.K1.x();
                    this.xc = true;
                    org.telegram.messenger.mp.g1().edit().putInt("savedhint", org.telegram.messenger.mp.g1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.mp.g1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && org.telegram.messenger.mp.g1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.x();
                    this.xc = true;
                    org.telegram.messenger.mp.g1().edit().putInt("savedsearchhint", org.telegram.messenger.mp.g1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    o7();
                }
            }
        }
    }

    public final void n8(org.telegram.ui.Cells.z r31, final org.telegram.tgnet.TLRPC.ReactionCount r32, boolean r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.n8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int n9() {
        return (int) (m9() * org.telegram.messenger.g0.L(71.0f));
    }

    public final gi na(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle) {
        vf.b bVar = this.f45999ec;
        if (bVar != null) {
            bVar.a(true);
            this.f45999ec = null;
        }
        if (characterStyle != null && q1Var != null && q1Var.getMessageObject() != null) {
            gi giVar = new gi(this, q1Var.getMessageObject().e1(), characterStyle, q1Var, 0);
            this.f45999ec = giVar;
            return giVar;
        }
        this.f45999ec = null;
        return null;
    }

    public final void nb(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.nb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void nc(boolean z10) {
        if (this.f46106n3 != null && !X9()) {
            if (this.f46106n3.getTag() == null) {
                ValueAnimator valueAnimator = this.f46222w3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f46106n3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46235x3, 1.0f);
                this.f46222w3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f46222w3.addUpdateListener(new be(this, 2));
                this.f46222w3.addListener(new ei(this, 6));
                this.f46222w3.start();
            }
            if (!z10) {
                O9();
                this.f46131p3 = 1000;
            }
        }
    }

    public final void nd(int i7, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        boolean z11;
        lh.h hVar = this.f46246y1;
        boolean z12 = false;
        if (hVar != null) {
            int i13 = 2;
            if (this.f46114nb) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if ((i12 & i7) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f3227c = z10;
            h6.m mVar = hVar.f19886e[6];
            if (mVar != null) {
                ((kh.b) mVar.f13939b).b(z10, true);
            }
            lh.h hVar2 = this.f46246y1;
            if (this.f46114nb) {
                i13 = 1;
            }
            if ((i7 & i13) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3227c = z11;
            h6.m mVar2 = hVar2.f19886e[5];
            if (mVar2 != null) {
                ((kh.b) mVar2.f13939b).b(z11, true);
            }
        }
        this.L3 = i11;
        this.M3 = i10;
        od();
        org.telegram.ui.Components.n6 n6Var = this.f46070k3;
        if (n6Var != null) {
            if (i11 > 0) {
                z12 = true;
            }
            n6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f46070k3.animate();
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
        if (this.f46018g4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((h2Var instanceof bn) && ((bn) h2Var).V9()) {
                return false;
            }
        }
        return this.Z6;
    }

    public final void o7() {
        org.telegram.ui.Cells.q1 q1Var;
        hi.m3 m3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        hi.m3 m3Var2 = this.M1;
        if (m3Var2 != null && !m3Var2.W && !this.f46269zc && this.wc && !this.f46027gd.f57658f && System.currentTimeMillis() - this.f46256yc > 1800 && org.telegram.messenger.mp.g1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        ch.q0 q0Var = q1Var.O;
                        org.telegram.messenger.fj primaryMessageObject = q1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f23968k) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !q0Var.f5498s.isEmpty()) {
                            q1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + q0Var.f5484c;
                            if (f10 >= org.telegram.messenger.g0.L(240.0f) && f10 <= (org.telegram.messenger.g0.f24121q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f24116n) {
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
                this.f46269zc = true;
                q1Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - m3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)) + q0Var2.f5484c);
                this.M1.p(0.0f, (((ch.n0) q0Var2.f5498s.get(0)).f5458z / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q0Var2.f5483b);
                this.M1.x();
                org.telegram.messenger.mp.g1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.g0.r(new zd(this, 22));
            org.telegram.messenger.g0.h3(new zd(this, 22), 2000L);
        }
    }

    public final void o8(int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.o8(int, java.lang.Object[]):void");
    }

    public final org.telegram.ui.ActionBar.r0 o9() {
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (r0Var != null && r0Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final void oa(org.telegram.messenger.fj fjVar) {
        if (fjVar != null && fjVar.r4() && !fjVar.f24008u0) {
            fjVar.f24008u0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = fjVar.R0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void ob() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.M7 = 0;
        this.C7 = false;
        this.D7 = true;
        this.f46263z6.clear();
    }

    public final boolean oc() {
        rj rjVar = this.f45932a0;
        if (rjVar != null && rjVar.getVisibility() == 0) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("gifhint", false)) {
                g12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f46182t2 == null) {
                    if (!this.f46185t5) {
                        rj rjVar2 = this.f45932a0;
                        if (rjVar2 != null) {
                            rjVar2.Z();
                            org.telegram.messenger.ri.d0(rjVar2.R).Y0(0, true, true, false);
                            org.telegram.ui.Components.cg cgVar = rjVar2.V0;
                            cgVar.M(false, false);
                            cgVar.R(false, false);
                            cgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        pl plVar = this.f46093m1;
                        int indexOfChild = plVar.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            rj rjVar3 = this.f45932a0;
                            rjVar3.Z();
                            org.telegram.messenger.ri.d0(rjVar3.R).Y0(0, true, true, false);
                            org.telegram.ui.Components.cg cgVar2 = rjVar3.V0;
                            cgVar2.M(false, false);
                            cgVar2.R(false, false);
                            cgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232676);
                            int i7 = indexOfChild + 1;
                            plVar.addView(this.L2, i7, c8.ma.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            hi.m3 E6 = E6(310.0f, 3, i7, false);
                            this.f46182t2 = E6;
                            E6.d = 2300L;
                            E6.v(org.telegram.messenger.gd.M0(2131744033, null));
                            this.L2.setAlpha(0.0f);
                            this.L2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.f45932a0.getEmojiButton();
                            if (emojiButton != null) {
                                this.f46182t2.z(emojiButton, true);
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
        org.telegram.ui.Components.n6 n6Var = this.j3;
        if (n6Var != null) {
            boolean z10 = !org.telegram.messenger.gd.f24216a0;
            int i7 = this.L3;
            if (i7 < 0) {
                n6Var.c("", z10, true);
            } else if (i7 == 0) {
                n6Var.c(org.telegram.messenger.gd.M0(2131747975, null), z10, true);
            } else if (this.G3) {
                n6Var.c(org.telegram.messenger.gd.G(i7, "TaggedMessages", new Object[0]), z10, true);
            } else if (this.f46018g4 != 7 && !this.f46027gd.f57658f) {
                n6Var.c(org.telegram.messenger.gd.a0(null, null, 2131747636, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z10, true);
            } else {
                n6Var.c(org.telegram.messenger.gd.G(i7, "SearchMessagesResultCount", org.telegram.messenger.gd.E(i7, ' ')), z10, true);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.e50 e50Var;
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.Components.gf gfVar;
        org.telegram.ui.ActionBar.u1 u1Var2;
        org.telegram.ui.Components.ef efVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        ql qlVar;
        ch.r rVar;
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getOpenMenuOverlay() != null) {
            if (z10 && (k5Var = this.actionBar.f29059a1) != null) {
                k5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.f11 f11Var = this.f46104n0;
            if (f11Var != null && f11Var.f34899y > 0.0f) {
                if (z10) {
                    f11Var.e();
                    return false;
                }
            } else {
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
                if (gcVar != null) {
                    org.telegram.ui.Components.lb lbVar = gcVar.f35457e;
                    if (lbVar instanceof org.telegram.ui.Components.rb) {
                        if (z10) {
                            ((org.telegram.ui.Components.rb) lbVar).f();
                            gcVar.b();
                            return false;
                        }
                    }
                }
                tz0 tz0Var = this.f46229wa;
                if (tz0Var != null && !tz0Var.f52387c0) {
                    if (z10) {
                        tz0Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z10) {
                        closeSheet();
                        return false;
                    }
                } else {
                    ch.s sVar = this.f46215va;
                    if (sVar != null && (rVar = sVar.f5510b) != null && rVar.getReactionsWindow() != null) {
                        if (z10) {
                            sVar.f5510b.e();
                            return false;
                        }
                    } else if (ns.p().E) {
                        if (z10) {
                            ns.p().n();
                            return false;
                        }
                    } else {
                        mk mkVar = this.f45972cb;
                        if (mkVar != null && mkVar.f40284s) {
                            if (z10) {
                                mkVar.a(true);
                                return false;
                            }
                        } else if (this.f46027gd.f57658f) {
                            if (z10) {
                                sc(false);
                                return false;
                            }
                        } else if (this.f46023g9 != null) {
                            if (z10) {
                                P7(true);
                                return false;
                            }
                        } else if (!m7(z10, false)) {
                            if (A9()) {
                                if (z10 && (qlVar = this.f46201u9) != null && qlVar.x()) {
                                    this.f46201u9.f(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                if (kVar2 != null && kVar2.y()) {
                                    if (z10) {
                                        O7(false);
                                        return false;
                                    }
                                } else {
                                    rj rjVar = this.f45932a0;
                                    if (rjVar != null && rjVar.O0() && (rjVar.T2 != 1 || (tL_replyKeyboardMarkup = rjVar.f32552b3) == null || !tL_replyKeyboardMarkup.is_persistent || rjVar.f32543a3 == null)) {
                                        if (z10) {
                                            this.f45932a0.G0(true);
                                            return false;
                                        }
                                    } else {
                                        rj rjVar2 = this.f45932a0;
                                        if (rjVar2 != null && rjVar2.A()) {
                                            if (z10) {
                                                rj rjVar3 = this.f45932a0;
                                                ki.z zVar = rjVar3.m0;
                                                if (zVar != null) {
                                                    zVar.setOpened(false);
                                                }
                                                if (!rjVar3.D0() && (efVar = rjVar3.f32643n0) != null) {
                                                    efVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            rj rjVar4 = this.f45932a0;
                                            if (rjVar4 != null && (gfVar = rjVar4.F0) != null && (u1Var2 = gfVar.f37625b2) != null && u1Var2.isShowing()) {
                                                if (z10) {
                                                    gfVar.f37625b2.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f46018g4 == 6 && (u1Var = kg.v.f18499e) != null && u1Var.isShowing()) {
                                                if (z10) {
                                                    kg.v.f18499e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.v3.p0(this.f45987e) && !this.f46045i4 && this.f46016g2 != null && d() != 0) {
                                                if (z10) {
                                                    this.f46016g2.n(0L, this.H7);
                                                    return false;
                                                }
                                            } else if (this.f46018g4 == 5 && !"hello".equalsIgnoreCase(this.f46006f4) && !"away".equalsIgnoreCase(this.f46006f4) && (this.M6.isEmpty() || this.f46173s4 == 0)) {
                                                if (z10) {
                                                    xc();
                                                    return false;
                                                }
                                            } else if (this.f46018g4 == 6 && this.f45932a0.B()) {
                                                if (z10) {
                                                    dc(new vf(this, 20));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                                                if (kVar3 != null && kVar3.f29088o0) {
                                                    if (z10) {
                                                        kVar3.o(true);
                                                        return false;
                                                    }
                                                } else if (this.f46000ed.f57658f) {
                                                    if (z10) {
                                                        Va();
                                                    }
                                                } else {
                                                    if (z10 && (e50Var = this.f46144q3) != null) {
                                                        e50Var.a(false);
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
        if (!getMessagesController().K3() && getMessagesController().f25786v4 <= 0 && getMessagesController().f25701l7 < 2 && !getUserConfig().q() && (arrayList = this.M6) != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
                if (fjVar != null && !fjVar.P3() && ((org.telegram.messenger.fj.R4(fjVar.f23968k) || fjVar.h4()) && !fjVar.F4() && (fjVar.f23968k.media_unread || org.telegram.messenger.v3.V(this.f45987e)))) {
                    org.telegram.ui.Components.g21.t(fjVar, false);
                }
            }
        }
        this.U3 = false;
        K9();
        ArrayList arrayList2 = org.telegram.ui.Components.g21.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        vf.b bVar = this.f45999ec;
        if (bVar != null) {
            bVar.a(false);
            this.f45999ec = null;
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
        if (this.Eb) {
            rj rjVar = this.f45932a0;
            if (rjVar != null) {
                rjVar.f1();
                rj rjVar2 = this.f45932a0;
                rjVar2.U0 = false;
                org.telegram.ui.Components.cg cgVar = rjVar2.V0;
                if (cgVar != null) {
                    cgVar.u(false);
                }
            }
            this.Eb = false;
        }
        if (this.K1 != null) {
            org.telegram.messenger.g0.h3(new zd(this, 1), 600L);
        }
        if (this.H4 && !this.I4) {
            this.I4 = true;
            org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(this).I(2131623993, org.telegram.messenger.gd.M0(2131743360, null), org.telegram.messenger.gd.M0(2131743362, null));
            I.f35461j = 5000;
            I.v = new zd(this, 2);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ch.s sVar = this.f46215va;
        if (sVar != null && sVar.d()) {
            this.f46215va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.fj fjVar;
        long j3;
        long j10;
        vi viVar = this.f46129p1;
        if (viVar != null) {
            ViewTreeObserver viewTreeObserver = viVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new kh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        P7(true);
        if (!org.telegram.messenger.g0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.A1() || !PhotoViewer.p1().P1()) && (fjVar = MediaController.B().f22743v0) != null && org.telegram.messenger.fj.L4(fjVar.f23968k)) {
                    PhotoViewer.p1().I2(null, this, this.Ba);
                    getFileLoader().c0(fjVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i7 = fjVar.D;
                    long j11 = 0;
                    if (i7 != 0) {
                        j3 = this.f46085l6;
                    } else {
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        j10 = this.f45981d7;
                    } else {
                        j10 = 0;
                    }
                    if (i7 != 0) {
                        j11 = d();
                    }
                    if (p12.d2(fjVar, null, null, null, null, null, null, 0, this.f45985db, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.p1().f43262l4 = this;
                    }
                    G9(false);
                    MediaController.B().f22746w0 = null;
                }
            } else if (PhotoViewer.A1() && PhotoViewer.p1().f43268m2) {
                PhotoViewer p13 = PhotoViewer.p1();
                if (p13.G2.d0()) {
                    if (p13.Z2) {
                        p13.G2.s0(false);
                    }
                    MediaController B = MediaController.B();
                    org.telegram.ui.Components.f61 f61Var = p13.G2;
                    org.telegram.messenger.fj fjVar2 = p13.T4;
                    if (f61Var != null && fjVar2 != null) {
                        int i10 = fjVar2.K1;
                        org.telegram.messenger.w7.G(i10).c0(fjVar2.F0(), true);
                        B.G0 = false;
                        B.r();
                        B.F0 = f61Var;
                        B.f22743v0 = fjVar2;
                        int i11 = B.f22726n0 + 1;
                        B.f22726n0 = i11;
                        f61Var.K = new org.telegram.messenger.je(B, i11, fjVar2, 1);
                        B.Q0 = false;
                        TextureView textureView = B.H0;
                        if (textureView != null) {
                            f61Var.A0(textureView);
                        }
                        B.j(fjVar2);
                        B.n0();
                        B.f22715h0 = false;
                        org.telegram.messenger.fj fjVar3 = B.f22743v0;
                        B.f22743v0 = fjVar2;
                        if (!org.telegram.messenger.bz.k(true)) {
                            B.w0(B.f22736s);
                        }
                        B.v0(B.f22743v0);
                        org.telegram.messenger.ks.f(i10).k(org.telegram.messenger.ks.f25126h2, fjVar2, fjVar3);
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
        yj yjVar = this.f46189ta;
        float f10 = 0.0f;
        if (z10 && this.f46125oa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (h2Var instanceof bn) {
                this.R4 = true;
                bn bnVar = (bn) h2Var;
                bnVar.f46151qa = this;
                this.fragmentView.setAlpha(0.0f);
                this.f46093m1.setSkipBackgroundDrawing(true);
                this.f46129p1.setTranslationY(org.telegram.messenger.g0.L(8.0f));
                this.f46129p1.getAvatarImageView().setAlpha(0.0f);
                this.f46129p1.getAvatarImageView().setTranslationY(-org.telegram.messenger.g0.L(8.0f));
                this.f46138pa = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                rj rjVar = this.f45932a0;
                if (rjVar != null) {
                    rjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24121q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                uj ujVar = this.T;
                if (ujVar != null) {
                    ujVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24121q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                rj rjVar2 = this.f45932a0;
                if (rjVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = rjVar2.getMeasuredHeight();
                }
                uj ujVar2 = this.T;
                if (ujVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = ujVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                rj rjVar3 = bnVar.f45932a0;
                if (rjVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = rjVar3.getMeasuredHeight();
                }
                uj ujVar3 = this.T;
                if (ujVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = ujVar3.getMeasuredHeight();
                }
                this.f46089la = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ch.w(9, this, bnVar));
                Rc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f46177sa = animatorSet;
                animatorSet.addListener(new hi.y4(this, bnVar, runnable));
                this.f46177sa.setDuration(300L);
                this.f46177sa.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                this.f46177sa.playTogether(ofFloat2);
                org.telegram.messenger.g0.h3(yjVar, 200L);
                return this.f46177sa;
            }
        }
        if (this.Ga && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (h2Var2 instanceof y91) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                h2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f10 = 1.0f;
                }
                this.Ia = f10;
                ofFloat.addUpdateListener(new ji(0, this));
                this.Ha = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                pl plVar = this.f46093m1;
                if (plVar != null) {
                    plVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f46177sa = animatorSet2;
                animatorSet2.addListener(new ki(this, z10, runnable));
                this.f46177sa.setDuration(150L);
                this.f46177sa.playTogether(ofFloat);
                if (z10) {
                    org.telegram.messenger.g0.h3(yjVar, 200L);
                } else {
                    this.f46177sa.start();
                }
                return this.f46177sa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.u1 u1Var = this.P;
        if (u1Var != null && dialog == u1Var) {
            getMessagesController().X(0, this.f46085l6, false);
            org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
            if (s4Var != null && !s4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.h2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.ys0 ys0Var;
        long j3 = this.f46085l6;
        int[] iArr = org.telegram.ui.Components.g21.N;
        ArrayList arrayList = new ArrayList(org.telegram.ui.Components.g21.R.values());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
            if (org.telegram.messenger.fj.B0(fjVar.f23968k) == j3) {
                org.telegram.ui.Components.g21.v(fjVar);
            }
        }
        super.onFragmentDestroy();
        jh.e eVar = this.f45965c4;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f17774x;
            int size2 = longSparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i10);
                if (dVar.f17760i) {
                    eVar.f17773w.add(dVar.a());
                }
            }
            if (org.telegram.messenger.s2.f26723a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            rjVar.Y0();
        }
        vi viVar = this.f46129p1;
        if (viVar != null && (ys0Var = viVar.f33380d0) != null) {
            ys0Var.b(viVar.H);
        }
        kj kjVar = this.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        fi.n2 n2Var = this.Y1;
        if (n2Var != null) {
            n2Var.L();
        }
        org.telegram.ui.Components.e50 e50Var = this.f46144q3;
        if (e50Var != null) {
            e50Var.c(true);
        }
        ns p10 = ns.p();
        if (p10.f50303l == this.H9) {
            p10.W = null;
            p10.f50290a0 = null;
            p10.Y = null;
            p10.f50303l = null;
            p10.f50294c0 = null;
            p10.t();
        }
        getNotificationCenter().j(this.f45971ca);
        org.telegram.messenger.ks.e().j(this.f45984da);
        getNotificationCenter().j(this.f45998ea);
        getNotificationCenter().j(this.fa);
        K9();
        zd zdVar = this.f45980d6;
        if (zdVar != null) {
            org.telegram.messenger.g0.r(zdVar);
            this.f45980d6 = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        fk fkVar = this.Ka;
        notificationCenter.getClass();
        boolean z11 = org.telegram.messenger.s2.f26723a;
        if (Thread.currentThread() == org.telegram.messenger.t0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(fkVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j10 = this.f46085l6;
            if (this.f46018g4 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            messagesController.W4(j10, z10, false);
            if (this.f46223w4) {
                this.f46223w4 = false;
                getMessagesController().h4(this.f46085l6);
            }
            xi.e eVar2 = this.f46139pb;
            if (eVar2 != null) {
                eVar2.b();
                this.f46139pb = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.ks.f25192t);
            if (this.f46018g4 == 0 && org.telegram.messenger.g0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.ks.f25124h0, Long.valueOf(this.f46085l6), Long.valueOf(d()), Boolean.TRUE);
            }
            if (this.f46001f != null) {
                MediaController B = MediaController.B();
                if (B.T1 == null) {
                    B.T1 = new androidx.emoji2.text.j(B);
                }
                B.T1.f2248b = 0;
                org.telegram.messenger.t0.d.postDelayed(B.T1, 5000L);
            }
            org.telegram.messenger.n6 n6Var = this.T3;
            if (n6Var != null) {
                n6Var.e();
            }
            if (this.f46001f != null) {
                getMessagesController().f25748r1.remove(Long.valueOf(this.f46001f.f28554id));
            }
            org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
            fi.n2 n2Var2 = this.Y1;
            if (n2Var2 != null) {
                n2Var2.k1();
                this.Y1 = null;
            }
            org.telegram.messenger.g0.O3(getParentActivity());
            if (org.telegram.messenger.v3.T(this.f45987e)) {
                getMessagesController().h5(this.f45987e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f46163r8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().h5(getMessagesController().O0(Long.valueOf(this.f46163r8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            ql qlVar = this.f46201u9;
            if (qlVar != null) {
                qlVar.f(false);
            }
            dj djVar = this.B0;
            if (djVar != null) {
                djVar.N();
            }
            zj zjVar = this.Ta;
            if (zjVar != null) {
                zjVar.b();
            }
            this.ya = null;
            org.telegram.ui.ActionBar.s4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f45929td ? 1 : 0);
                org.telegram.ui.ActionBar.s4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i11 = 0;
                    while (i11 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.h9) parentLayout2.getPulledDialogs().get(i11)).f35820b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                }
            }
            f45929td = false;
            vf.b bVar = this.f45999ec;
            if (bVar != null) {
                bVar.a(false);
                this.f45999ec = null;
            }
            org.telegram.messenger.k3 k3Var = this.Da;
            bn bnVar = k3Var.f24974a;
            ArrayList arrayList2 = k3Var.f24978f;
            ArrayList arrayList3 = k3Var.f24977e;
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList3.get(i12)).intValue(), false);
            }
            arrayList3.clear();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i13)).intValue(), false);
            }
            arrayList2.clear();
            ax0 ax0Var = this.f46200u8;
            if (ax0Var != null) {
                ax0Var.b(true);
                this.f46200u8 = null;
            }
            di.k6 k6Var = this.Xc;
            if (k6Var != null) {
                k6Var.setMessageCell(null);
                org.telegram.messenger.g0.E2(this.Xc);
                this.Xc = null;
                return;
            }
            return;
        }
        throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Ob = true;
        org.telegram.messenger.fj fjVar = MediaController.B().f22743v0;
        if (fjVar != null && org.telegram.messenger.fj.L4(fjVar.f23968k)) {
            MediaController.B().q(true, true, false, false);
        } else {
            MediaController.B().p0(this.M8, null, null, false);
        }
        di.k6 k6Var = this.Xc;
        if (k6Var != null) {
            k6Var.setMessageCell(null);
            org.telegram.messenger.g0.E2(this.Xc);
            this.Xc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        fi.n2 n2Var;
        fi.n2 n2Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.si siVar;
        rj rjVar = this.f45932a0;
        boolean z12 = false;
        if (rjVar != null && i7 == 2 && rjVar.X3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.zy.C(rjVar.R).o0(rjVar.W3, rjVar.X3);
            }
            rjVar.X3 = null;
            rjVar.W3 = null;
        }
        kj kjVar = this.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            jg.h1 adapter = this.X1.getAdapter();
            if (i7 == 2) {
                TLRPC.User user = adapter.f17533x0;
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
            fi.n2 n2Var3 = this.Y1;
            if (n2Var3 != null) {
                n2Var3.f39670e2.b0();
            }
            org.telegram.ui.Components.lp lpVar = this.ya;
            if (lpVar != null && (siVar = lpVar.S1) != null) {
                siVar.f39670e2.b0();
            }
        } else if ((i7 == 5 || i7 == 30) && (n2Var = this.Y1) != null) {
            if (i7 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                n2Var.r1();
            }
        } else if ((i7 == 17 || i7 == 18) && (n2Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var2.f39670e2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.X(z12);
            this.Y1.f39670e2.b0();
        } else if (i7 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
                String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131747119, null);
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747107, null), new dh(this));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                alertDialog$Builder.p();
            }
        } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            cb(0);
        } else if (i7 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            cb(2);
        } else if (((i7 != 101 && i7 != 102) || this.f46001f == null) && (i7 != 103 || this.f45987e == null)) {
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
                    org.telegram.ui.Components.voip.b2.l(this.f45987e, null, this.f46149q8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f46001f;
                if (i7 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f46176s8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.b2.m(user2, z11, z12, getParentActivity(), getMessagesController().d2(this.f46001f.f28554id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onResume():void");
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
                Iterator it = fVar.f59011w.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11670g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            ui.f fVar2 = this.K;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f59011w.iterator();
                while (it2.hasNext()) {
                    fh.e eVar2 = ((fh.g) it2.next()).f11670g0;
                    if (eVar2 != null) {
                        eVar2.h = true;
                    }
                }
            }
            Paint paint = this.W8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29676s8));
            }
            RadialProgressView radialProgressView = this.f46169s0;
            if (radialProgressView != null) {
                if (S9()) {
                    i10 = org.telegram.ui.ActionBar.n6.Ka;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.Zc;
                }
                radialProgressView.setProgressColor(getThemedColor(i10));
            }
            vj vjVar = this.f45976d1;
            if (vjVar != null) {
                vjVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.I0;
            if (o2Var != null && o2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.n6.Fi)) != this.L0 || this.Db != org.telegram.ui.ActionBar.n6.I.q())) {
                this.L0 = themedColor4;
                this.Db = org.telegram.ui.ActionBar.n6.I.q();
                Drawable background = this.I0.getBackground();
                org.telegram.ui.ActionBar.n6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.n6.H1(background, org.telegram.ui.ActionBar.b6.b(themedColor4), true);
            }
            Fb();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Set<org.telegram.ui.ActionBar.p0> set = this.V0;
        Set<org.telegram.ui.ActionBar.p0> set2 = this.U0;
        try {
            RadialProgressView radialProgressView2 = this.J0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.K0));
            }
            NumberTextView numberTextView = this.U2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.We));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ve));
            }
            org.telegram.ui.Components.k80 k80Var = this.f46043i2;
            if (k80Var != null && this.S0) {
                k80Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.n6.Xe));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.n6.f29788y6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.Fi)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.H6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            sh.c cVar = this.f46079kd;
            if (cVar != null && (i7 = this.T0) >= 0) {
                cVar.setColor(getThemedColor(i7));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.n6.f29617p7);
                for (org.telegram.ui.ActionBar.p0 p0Var : set2) {
                    if (p0Var != null) {
                        p0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29617p7, false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.dd ddVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        int i7 = org.telegram.messenger.ks.K2;
        int i10 = org.telegram.messenger.ks.G0;
        int i11 = org.telegram.messenger.ks.f25192t;
        int i12 = org.telegram.messenger.ks.f25186s;
        if (z10) {
            if (!this.f46020g6) {
                this.f46020g6 = true;
                cd();
            }
            iArr = this.f45971ca == 0 ? new int[]{i12, i11, i10, i7, org.telegram.messenger.ks.D} : new int[]{i12, i11, i10, i7};
            this.f46008f6 = false;
            if (!z11) {
                this.f46034h6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.o10.C(this.f46001f) ? new int[]{i12, i11, i10, i7, org.telegram.messenger.ks.V} : null;
            rj rjVar = this.f45932a0;
            if (rjVar != null && (ddVar = rjVar.G2) != null) {
                org.telegram.messenger.g0.r(ddVar);
                rjVar.G2 = null;
            }
        }
        s7();
        this.f45971ca = getNotificationCenter().q(iArr, this.f45971ca, true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        D8(((org.telegram.messenger.yy) arrayList.get(0)).d, ((org.telegram.messenger.yy) arrayList.get(0)).f28217i);
        org.telegram.messenger.zy.X(getAccountInstance(), arrayList, this.f46085l6, this.F5, this.f46096m4, null, this.D5, true, false, this.H5, null, z10, i7, 0, ((org.telegram.messenger.yy) arrayList.get(0)).f28228t, null, Y8(), 0L, false, j3, j9(), this.f46250y5, null, false);
        L6();
        if (i7 != 0) {
            if (this.f46032h4 == -1) {
                this.f46032h4 = 0;
            }
            this.f46032h4 = arrayList.size() + this.f46032h4;
            md(true);
        }
    }

    public final void p7(boolean z10) {
        int i7;
        if (this.C0 != null && !this.I5 && !this.D0.M && !this.f46239x7) {
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
            kl klVar = this.D0;
            if (klVar.O) {
                int i14 = klVar.F;
                if (i14 >= 0 && i12 >= 0 && i14 >= i12 && i14 <= i11) {
                    getMediaDataController().R0();
                    return;
                }
                return;
            }
            int b10 = klVar.b();
            if (z10) {
                i7 = 25;
            } else {
                i7 = 5;
            }
            int i15 = i7;
            if (this.f46018g4 == 7) {
                if ((b10 - i12) - i10 <= i15 && !this.Y6 && !this.U6[0]) {
                    this.Y6 = true;
                    this.f46263z6.add(Integer.valueOf(this.f46109n6));
                    org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(this.currentAccount);
                    String str = this.J3;
                    int i16 = this.classGuid;
                    int i17 = this.f45978d4;
                    int i18 = this.f46109n6;
                    this.f46109n6 = i18 + 1;
                    a10.e(i16, i17, i18, str);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.g3(new org.telegram.messenger.er(this, b10, i12, i10, i15, 1));
        }
    }

    public final void p8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.p8(int, java.lang.Object[]):void");
    }

    public final int p9(int i7) {
        SparseIntArray sparseIntArray = this.f46058j5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f45924od;
            f45924od = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final boolean pa() {
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.Components.b6 b6Var;
        org.telegram.messenger.fj fjVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.b6 m10;
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z11;
        if (this.A0 != null && ((fjVar = MediaController.B().f22743v0) == null || org.telegram.messenger.fj.L4(fjVar.f23968k))) {
            hi.m3 m3Var = this.I2;
            ArrayList arrayList = null;
            if (m3Var != null && m3Var.W && (q1Var = this.Lb) != null) {
                ImageReceiver photoImage2 = q1Var.getPhotoImage();
                b6Var = photoImage2.m();
                if (b6Var != null) {
                    fjVar2 = q1Var.getMessageObject();
                    if (photoImage2.A() + q1Var.getTop() > this.A0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.N8 = z11;
                } else {
                    fjVar2 = null;
                }
            } else {
                b6Var = null;
                fjVar2 = null;
            }
            if (fjVar2 == null) {
                int childCount = this.A0.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.fj messageObject = q1Var2.getMessageObject();
                        boolean h42 = messageObject.h4();
                        if (!messageObject.g4() && !messageObject.S4() && ((org.telegram.messenger.fj.L4(messageObject.f23968k) || h42) && messageObject.f23996r0 == null && (m10 = (photoImage = q1Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.M0;
                            float f10 = photoImage.O0 + top;
                            if (f10 >= 0.0f && top <= this.A0.getMeasuredHeight()) {
                                if (fjVar2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.N8 = z10;
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    fjVar2 = messageObject;
                                    b6Var = m10;
                                    break;
                                }
                                fjVar2 = messageObject;
                                b6Var = m10;
                            }
                        }
                    }
                    i7++;
                }
            }
            if (fjVar2 != null && !MediaController.B().I(fjVar2)) {
                G9(true);
                if (fjVar2.h4()) {
                    boolean S = MediaController.B().S(fjVar2);
                    MediaController B = MediaController.B();
                    if (S) {
                        arrayList = i8(fjVar2, false);
                    }
                    B.r0(arrayList, false);
                    return S;
                }
                org.telegram.messenger.bz.D(true);
                fjVar2.f23928b0 = b6Var.n();
                fjVar2.f23937d0 = b6Var.o();
                b6Var.stop();
                if (PhotoViewer.J1(fjVar2)) {
                    PhotoViewer.f43158g9.J0();
                }
                return MediaController.B().S(fjVar2);
            }
        }
        return false;
    }

    public final void pb() {
        this.f45973cc = null;
        this.f45944ac = 0;
        this.f45959bc = -1;
        this.dc = null;
        this.f45999ec = null;
        this.f46246y1.d(false);
    }

    public final void pc() {
        TLRPC.ChatFull chatFull = this.f46163r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.f45987e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.g0.h3(new zd(this, 16), 1000L);
            }
        }
    }

    public final void pd() {
        d8();
        String str = this.J3;
        if (str != null) {
            this.f46171s2.f36896e.setText(org.telegram.messenger.gd.a0(null, null, 2131749162, str));
            this.f45936a4.setEmptyView(this.f46171s2);
            return;
        }
        this.f45936a4.setEmptyView(null);
        this.f46171s2.setVisibility(8);
    }

    @Override
    public final boolean q() {
        return this.O9;
    }

    public final void q7(org.telegram.messenger.fj fjVar) {
        if (fjVar.D == 4 && !this.H8) {
            int i7 = org.telegram.messenger.bz.f23148a;
            if (!org.telegram.messenger.mp.g1().contains("mapPreviewType")) {
                this.H8 = true;
                org.telegram.ui.Components.b5.p0(getParentActivity(), this.currentAccount, new zd(this, 12), true, this.Ba);
            }
        }
    }

    public final void q8(int r35, final java.lang.Object... r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.q8(int, java.lang.Object[]):void");
    }

    public final int q9(int i7) {
        SparseIntArray sparseIntArray = this.f46046i5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f45924od;
            f45924od = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final void qa(org.telegram.messenger.fj fjVar) {
        org.telegram.ui.ActionBar.h2 h2Var;
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var == null) {
            return;
        }
        long j3 = fjVar.f23968k.action.channel_id;
        if (s4Var.getFragmentStack().size() > 0) {
            h2Var = (org.telegram.ui.ActionBar.h2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            h2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.s4 s4Var2 = this.parentLayout;
        if (indexOf > 0 && !(h2Var instanceof bn) && !(h2Var instanceof ProfileActivity) && this.f45987e.creator) {
            int size = s4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) s4Var2.getFragmentStack().get(indexOf);
                if (h2Var2 instanceof bn) {
                    ((ActionBarLayout) s4Var2).c(indexOf, new bn(a8.p0.j(j3, "chat_id")));
                    h2Var2.removeSelfFromStack();
                } else if (h2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) s4Var2).c(indexOf, new ProfileActivity(a8.p0.j(j3, "chat_id"), null));
                    h2Var2.removeSelfFromStack();
                } else if (h2Var2 instanceof rn) {
                    ((ActionBarLayout) s4Var2).c(indexOf, new rn(a8.p0.j(j3, "chat_id")));
                    h2Var2.removeSelfFromStack();
                } else if (h2Var2 instanceof rq) {
                    if (((rq) h2Var2).f51740e1 == 0) {
                        Bundle arguments = h2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) s4Var2).c(indexOf, new rq(arguments));
                    }
                    h2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i(this, h2Var, fjVar, s4Var2, 9));
        }
        org.telegram.messenger.g0.h3(new bg.k0(this, j3, 2), 1000L);
    }

    public final void qb(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.qb(org.telegram.ui.Cells.q1):void");
    }

    public final void qc(org.telegram.messenger.fj fjVar, CharSequence charSequence, int i7) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.lc.b0(this).G(2131623982, 9999, charSequence);
        G.f35461j = max;
        G.v = new re(this, i7, 3);
        G.k(true);
        this.V3 = fjVar;
        this.W3 = i7;
    }

    public final void qd() {
        boolean z10;
        if (this.f46246y1 == null) {
            return;
        }
        if ((!getMediaDataController().Z0.isEmpty() && this.H3 && !this.G3) || (this.f46018g4 == 7 && this.f45978d4 == 2 && !this.M6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46246y1.e(6, z10, true);
        this.f46246y1.e(5, z10, true);
        if (z10) {
            this.f46246y1.e(1, false, true);
        }
        if (!z10) {
            this.T7 = 0;
        }
        this.f46093m1.invalidate();
    }

    @Override
    public final org.telegram.ui.Components.ao r() {
        return this.f46129p1;
    }

    public final void r7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.r7(boolean):void");
    }

    public final void r8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.r8(int, java.lang.Object[]):void");
    }

    public final long r9() {
        return this.f46173s4;
    }

    public final void ra(boolean z10) {
        int i7;
        if (this.A0 != null) {
            ArrayList arrayList = this.M6;
            if (!arrayList.isEmpty() && !this.Ta.f47797n) {
                if (z10) {
                    i7 = 0;
                    while (i7 < arrayList.size() && ((org.telegram.messenger.fj) arrayList.get(i7)).r4()) {
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
        org.telegram.ui.Components.bb0 j3;
        zm zmVar = this.Ba;
        if (zmVar != null) {
            Drawable c10 = zmVar.c();
            if (this.fragmentView != null) {
                c10 = this.f46093m1.getBackgroundImage();
            }
            if (c10 instanceof en) {
                c10 = ((en) c10).c(true);
            }
            if (c10 instanceof org.telegram.ui.Components.bb0) {
                ((org.telegram.ui.Components.bb0) c10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.v4) && (j3 = ((org.telegram.ui.ActionBar.v4) themedDrawable).j()) != null) {
                j3.w(false);
            }
        }
    }

    public final void rc(boolean z10) {
        boolean z11;
        lh.h hVar = this.f46246y1;
        if (hVar != null) {
            if (z10 && !org.telegram.messenger.v3.p0(this.f45987e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.T7 = 0;
            }
        }
    }

    public final void rd(String str) {
        if (this.f46018g4 == 7 && !TextUtils.equals(this.J3, str)) {
            d8();
            sc(true);
            this.J3 = str;
            this.I3 = str;
            g7(false);
            M7(true);
            this.f46009f7 = 0L;
            this.C7 = false;
            org.telegram.messenger.ma.a(this.currentAccount).b(this.f45978d4).a();
            this.f45951b4.f();
            this.f45936a4.requestLayout();
            if (this.f45936a4.getLayoutManager() != null) {
                this.f45936a4.getLayoutManager().n0(0);
            }
            pd();
            this.f46171s2.e(true, true);
            L8();
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f46111n8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.f46236x4) {
            if (this.f46001f != null) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f46001f.f28554id));
                if (c22 != null) {
                    this.f46001f = c22;
                } else {
                    return;
                }
            } else if (this.f45987e != null) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f45987e.f28405id));
                if (O0 != null) {
                    this.f45987e = O0;
                } else {
                    return;
                }
            }
            vi viVar = this.f46129p1;
            if (viVar != null) {
                viVar.b();
            }
        }
    }

    public final void s7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.s7():void");
    }

    public final void s8(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.s8(int, java.lang.Object[]):void");
    }

    public final float s9(float f10) {
        bn bnVar = this.Aa;
        if (bnVar == null) {
            bnVar = this;
        }
        org.telegram.ui.Components.ah ahVar = bnVar.f45948b1;
        if (ahVar == null) {
            return 0.0f;
        }
        return ahVar.d(f10);
    }

    public final boolean sa() {
        rj rjVar = this.f45932a0;
        boolean z10 = rjVar.f32645n3;
        if (z10) {
            rjVar.S1();
            this.S3 = true;
        }
        org.telegram.messenger.g0.k3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        af afVar = this.Na;
        if (afVar != null) {
            org.telegram.messenger.g0.r(afVar);
        }
        rj rjVar = this.f45932a0;
        if (rjVar != null && this.f46093m1 != null && rjVar.getAdjustPanLayoutHelper() != null && !this.f45932a0.getAdjustPanLayoutHelper().f29024f) {
            this.Ma = this.f46093m1.getKeyboardHeight();
        } else {
            this.Ma = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f46111n8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb() {
        boolean z10;
        org.telegram.messenger.fj fjVar;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        vj vjVar;
        rj rjVar = this.f45932a0;
        if (rjVar != null && rjVar.f32672r2) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f46097m5 && rjVar != null && (vjVar = this.f45976d1) != null && vjVar.getVisibility() != 0) {
            fjVar = this.F5;
            charSequence = org.telegram.messenger.g0.n1(this.f45932a0.getDraftMessage());
            z10 = this.f45932a0.M3;
        } else {
            z10 = true;
            fjVar = null;
            charSequence = null;
        }
        if (this.E5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        org.telegram.messenger.ri mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            z11 = false;
        } else {
            z11 = true;
        }
        ArrayList Y = mediaDataController.Y(charSequenceArr, z11, false);
        long Q7 = Q7(fjVar);
        TLRPC.DraftMessage T = getMediaDataController().T(this.f46085l6, Q7);
        if (T != null) {
            richMessage = T.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.ri mediaDataController2 = getMediaDataController();
        long j10 = this.f46085l6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (fjVar != null && !fjVar.f23987p && fjVar.f23966j1 == null && !this.E5) {
            message = fjVar.f23968k;
        } else {
            message = null;
        }
        rm rmVar = this.D5;
        org.telegram.messenger.kj kjVar = this.f46250y5;
        if (kjVar != null) {
            suggestedPost = kjVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        rj rjVar2 = this.f45932a0;
        if (rjVar2 != null) {
            j3 = rjVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.V1(j10, Q7, charSequence2, Y, message, rmVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void sc(boolean z10) {
        int i7;
        if (this.Z3 != null) {
            te.a aVar = this.f46027gd;
            if (aVar.f57658f != z10) {
                aVar.a(z10, true);
                if (!z10 && this.f46018g4 == 7) {
                    v4.c0 c0Var = (v4.c0) this.f45936a4.getLayoutManager();
                    Object E = this.f45951b4.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.f45951b4.E(c0Var.L0());
                    Object E3 = this.f45951b4.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.D0.L();
                        int L0 = this.C0.L0();
                        int N0 = this.C0.N0();
                        int i10 = ((org.telegram.messenger.fj) E).f23968k.f28426id;
                        int i11 = ((org.telegram.messenger.fj) E2).f23968k.f28426id;
                        int i12 = ((org.telegram.messenger.fj) E3).f23968k.f28426id;
                        int i13 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((org.telegram.messenger.fj) L.get(i14)).f23968k.f28426id == i11) {
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
                            if (((org.telegram.messenger.fj) L.get(i14)).f23968k.f28426id == i12) {
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
                            if (((org.telegram.messenger.fj) L.get(i14)).f23968k.f28426id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z11 && !z12 && i13 != -1) {
                            this.C0.h1(this.D0.K + i13, (this.A0.getHeight() - W8((org.telegram.messenger.fj) L.get(i13), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.n6 n6Var = this.f46070k3;
                if (n6Var != null) {
                    if (aVar.f57658f) {
                        i7 = 2131745623;
                    } else {
                        i7 = 2131745622;
                    }
                    n6Var.c(org.telegram.messenger.gd.M0(i7, null), !org.telegram.messenger.gd.f24216a0, true);
                }
                hi.m3 m3Var = this.M1;
                if (m3Var != null && m3Var.W) {
                    m3Var.f(true);
                }
                al alVar = this.Q1;
                if (alVar != null && alVar.W) {
                    alVar.f(true);
                }
                rj rjVar = this.f45932a0;
                if (rjVar != null) {
                    rjVar.F0();
                }
                od();
            }
        }
    }

    public final void sd() {
        rj rjVar;
        if (this.T != null) {
            this.H0.setBackground(null);
            this.H0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f46018g4 == 3 && e9() == 2666000) {
                this.H0.setText(org.telegram.messenger.gd.M0(2131753880, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                ad();
                org.telegram.ui.Components.yw0 yw0Var = this.f46170s1;
                if (yw0Var != null) {
                    yw0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f45987e;
                if (chat != null && !org.telegram.messenger.v3.n(chat)) {
                    TLRPC.Chat chat2 = this.f45987e;
                    if (!org.telegram.messenger.v3.p(chat2) && !org.telegram.messenger.v3.u(chat2) && !org.telegram.messenger.v3.s(chat2) && !org.telegram.messenger.v3.v(chat2) && !org.telegram.messenger.v3.l(chat2) && !org.telegram.messenger.v3.o(chat2) && !org.telegram.messenger.v3.t(chat2)) {
                        TLRPC.Chat chat3 = this.f45987e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.v3.T(chat3) || this.f45987e.megagroup)) {
                            TLRPC.Chat chat4 = this.f45987e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.v3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i7 = org.telegram.ui.ActionBar.n6.Fi;
                                    mutate.setTint(getThemedColor(i7));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i7);
                                    mutate.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
                                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(null, mutate, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(-6.0f));
                                    int L = org.telegram.messenger.g0.L(14.0f);
                                    int L2 = org.telegram.messenger.g0.L(14.0f);
                                    mqVar.f37610e = L;
                                    mqVar.f37611f = L2;
                                    int L3 = org.telegram.messenger.g0.L(14.0f);
                                    int L4 = org.telegram.messenger.g0.L(14.0f);
                                    mqVar.h = L3;
                                    mqVar.f37612n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131753579, null, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(i7, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(mqVar, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
                                    org.telegram.ui.ActionBar.u6.Q(textView, org.telegram.ui.ActionBar.n6.i0(0, org.telegram.ui.ActionBar.n6.x0(null, i10, false)), null, org.telegram.ui.ActionBar.u6.M(i10), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new oe(this, 0));
                                } else {
                                    this.H0.setText(org.telegram.messenger.gd.M0(2131749359, null));
                                }
                            } else if (org.telegram.messenger.g0.D1(chat4.banned_rights)) {
                                this.H0.setText(org.telegram.messenger.gd.M0(2131745402, null));
                            } else {
                                this.H0.setText(org.telegram.messenger.gd.a0("SendMessageRestricted", null, 2131745403, org.telegram.messenger.gd.v(this.f45987e.banned_rights.until_date)));
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            ad();
                            org.telegram.ui.Components.yw0 yw0Var2 = this.f46170s1;
                            if (yw0Var2 != null) {
                                yw0Var2.f();
                            }
                        }
                    }
                }
                W7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(org.telegram.messenger.gd.M0(2131751118, null));
                        this.T.setVisibility(0);
                        this.f45932a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.f3.q("AwaitingEncryption", null, 2131753755, new Object[]{a8.p0.s(new StringBuilder("<b>"), this.f46001f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.f45932a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(org.telegram.messenger.gd.M0(2131751117, null));
                        this.T.setVisibility(0);
                        this.f45932a0.setVisibility(4);
                        this.f45932a0.setFieldText("");
                        getMediaDataController().F(this.f46085l6, this.f46173s4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.T.setVisibility(4);
                            if (!this.inPreviewMode && !this.mb && this.f46018g4 != 3) {
                                this.f45932a0.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    l7();
                    V6(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.f46170s1 != null && (rjVar = this.f45932a0) != null && rjVar.E0()) {
                        this.f46170s1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.T.setVisibility(4);
            }
            if (z10) {
                this.f45932a0.G0(false);
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
            org.telegram.ui.ActionBar.z t6 = kVar.t();
            if (this.inMenuMode) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            t6.setVisibility(i7);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.y1 y1Var;
        float f10;
        float f11;
        rj rjVar;
        int i7;
        float f12;
        super.setInPreviewMode(z10);
        int i10 = 8;
        boolean z13 = true;
        if (this.f46001f != null && this.f46141q0 != null) {
            TLRPC.UserFull d2 = getMessagesController().d2(this.f46001f.f28554id);
            if (d2 != null && d2.phone_calls_available) {
                this.f46050ia = !this.inPreviewMode;
                this.f46141q0.e(0);
            } else {
                this.f46050ia = false;
                this.f46141q0.e(8);
            }
        }
        vi viVar = this.f46129p1;
        float f13 = 0.0f;
        if (viVar != null) {
            viVar.setOccupyStatusBar(!z10);
            vi viVar2 = this.f46129p1;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            viVar2.setLayoutParams(c8.ma.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        rj rjVar2 = this.f45932a0;
        if (rjVar2 != null) {
            if (!z10) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            rjVar2.setVisibility(i7);
        }
        org.telegram.ui.Components.yw0 yw0Var = this.f46170s1;
        if (yw0Var != null) {
            if (this.f46160r5 && !z10 && ((rjVar = this.f45932a0) == null || !rjVar.f32646n4)) {
                i10 = 0;
            }
            yw0Var.setVisibility(i10);
        }
        kj kjVar = this.X1;
        if (kjVar != null) {
            ViewPropertyAnimator animate = kjVar.animate();
            if (!this.f45932a0.f32646n4 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.lr.f37208f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                y1Var = new org.telegram.ui.ActionBar.y1(false);
            } else {
                y1Var = null;
            }
            kVar.setBackButtonDrawable(y1Var);
            org.telegram.ui.ActionBar.r0 r0Var = this.f46054j0;
            if (r0Var != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.y yVar = this.f46014g0;
            if (yVar != null) {
                if (!z10) {
                    f13 = 1.0f;
                }
                yVar.f30253i = f13;
                org.telegram.ui.ActionBar.r0 r0Var2 = yVar.f30257m;
                if (r0Var2 != null) {
                    r0Var2.setAlpha(f13);
                }
            }
        }
        bj bjVar = this.A0;
        if (bjVar != null) {
            int childCount = bjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.A0.getChildAt(i11);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.q1;
                if (z14) {
                    fjVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                    fjVar = ((org.telegram.ui.Cells.u0) childAt).getMessageObject();
                } else {
                    fjVar = null;
                }
                if (fjVar != null && (message = fjVar.f23968k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.fj.R4(message) && !fjVar.h4()) {
                        int i12 = this.D6 - 1;
                        this.D6 = i12;
                        if (i12 <= 0) {
                            this.D6 = 0;
                            this.E6 = true;
                            rc(false);
                        } else {
                            this.f46246y1.c(2, i12, true);
                        }
                        org.telegram.messenger.mp messagesController = getMessagesController();
                        int e12 = fjVar.e1();
                        if (org.telegram.messenger.v3.T(this.f45987e)) {
                            j3 = this.f45987e.f28405id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.u3(j3, e12, this.f46085l6);
                        fjVar.f23968k.media_unread = false;
                    }
                    if (z14) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        q1Var.setHighlighted(false);
                        q1Var.q3();
                    }
                }
            }
            this.A0.setItemAnimator(null);
        }
        Pc(false);
        sd();
        mj mjVar = this.f46094m2;
        if (mjVar != null) {
            if (!z10 && !this.mb) {
                z12 = true;
            } else {
                z12 = false;
            }
            mjVar.setEnabled(z12);
        }
        mj mjVar2 = this.f46118o2;
        if (mjVar2 != null) {
            if (!z10 && !this.mb) {
                z11 = true;
            } else {
                z11 = false;
            }
            mjVar2.setEnabled(z11);
        }
        ok okVar = this.M2;
        if (okVar != null) {
            okVar.setEnabled(!isInPreviewMode());
        }
        pl plVar = this.f46093m1;
        if (plVar != null) {
            plVar.setOccupyStatusBar((this.inBubbleMode || this.mb || this.inPreviewMode) ? false : false);
        }
    }

    public final boolean t7(View view) {
        CharSequence slowModeTimer = this.f45932a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            zc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void t8(java.lang.Object... r89) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.t8(java.lang.Object[]):void");
    }

    public final float t9(org.telegram.ui.Components.v11 v11Var) {
        float f10;
        org.telegram.ui.Components.z11 z11Var = this.f46016g2;
        if (z11Var != null) {
            float L = org.telegram.messenger.g0.L(7.0f);
            float k10 = z11Var.k(v11Var);
            if (v11Var == org.telegram.ui.Components.v11.f40476b) {
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
            ej ejVar = this.C0;
            this.A0.getClass();
            ejVar.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) this.P9), false);
        }
    }

    public final void tc(TLRPC.TL_game tL_game, org.telegram.messenger.fj fjVar, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            if (c22 != null) {
                str3 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
            }
            u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131753004, str3);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new di.t1(this, tL_game, fjVar, str, j3));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            showDialog(u1Var);
            return;
        }
        String o4 = org.telegram.messenger.o10.o(c22);
        if (!org.telegram.messenger.g0.Q1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (c22 == null || TextUtils.isEmpty(o4)) {
                        str2 = "";
                    } else {
                        str2 = o4;
                    }
                    presentFragment(new cd1(str, str2, tL_game.title, tL_game.short_name, fjVar));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (c22 != null && o4 != null) {
            str3 = o4;
        }
        cd1.a0(str, fjVar, parentActivity, str6, str3);
    }

    public final void td() {
        boolean z10;
        int i7;
        int i10;
        org.telegram.messenger.xi xiVar;
        int i11 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f46121o6;
        if (i11 == 0) {
            ArrayList<org.telegram.messenger.fj> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i12].valueAt(i13);
                    if (fjVar.z2()) {
                        org.telegram.messenger.aj u92 = u9(fjVar);
                        if (u92 != null) {
                            xiVar = u92.d(fjVar);
                        } else {
                            xiVar = null;
                        }
                        if (xiVar != null) {
                            if (!xiVar.h) {
                            }
                        }
                    }
                    arrayList.add(fjVar);
                }
            }
            ik ikVar = this.Bb;
            if (ikVar != null) {
                ikVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                ik ikVar2 = this.Bb;
                if (isEmpty) {
                    i10 = 2131745677;
                } else {
                    i10 = 2131745676;
                }
                ikVar2.setHint(org.telegram.messenger.gd.M0(i10, null));
                org.telegram.messenger.g0.h3(new zd(this, 14), 120L);
            } else {
                z10 = !org.telegram.ui.Components.vi0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.r0 j3 = this.actionBar.q(null).j(28);
            if (j3 != null) {
                if (z10) {
                    i7 = 2131231899;
                } else {
                    i7 = 2131231901;
                }
                org.telegram.ui.Components.ph0 ph0Var = j3.f29949y;
                if (ph0Var != null && j3.E != i7) {
                    j3.E = i7;
                    org.telegram.messenger.g0.P3(ph0Var, i7);
                }
            }
        }
        if (this.f46215va != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((org.telegram.messenger.fj) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((org.telegram.messenger.fj) sparseArray2.valueAt(i15));
            }
            this.f46215va.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final void u(final org.telegram.messenger.ef efVar, final org.telegram.messenger.e20 e20Var, final boolean z10, final int i7, final int i10, final boolean z11, long j3) {
        if (efVar == null) {
            return;
        }
        this.f45986dd.a(false, true);
        org.telegram.messenger.fj fjVar = this.H5;
        if (fjVar != null && fjVar.p5() && !org.telegram.messenger.v3.z(this.currentAccount, 24, org.telegram.messenger.fj.B0(this.H5.f23968k))) {
            org.telegram.messenger.kj kjVar = this.f46250y5;
            if (kjVar == null) {
                kjVar = org.telegram.messenger.kj.b(this.H5.f23968k.suggested_post);
            }
            if (!di.x8.S(this.currentAccount, kjVar.f25043a)) {
                Ac(kjVar);
                return;
            }
        }
        if (e20Var != null && e20Var.f23655s) {
            af afVar = new af(this, 24);
            this.I7 = afVar;
            org.telegram.messenger.g0.h3(afVar, 3000L);
        }
        D8(efVar.f27848a, efVar.f27859n);
        org.telegram.ui.Components.b5.Y(this.currentAccount, a(), 1, new org.telegram.messenger.x10() {
            @Override
            public final void a(Object obj) {
                Long l10 = (Long) obj;
                bn bnVar = bn.this;
                org.telegram.messenger.fj fjVar2 = bnVar.H5;
                org.telegram.messenger.ef efVar2 = efVar;
                org.telegram.messenger.e20 e20Var2 = e20Var;
                boolean z12 = z10;
                int i11 = i7;
                int i12 = i10;
                boolean z13 = z11;
                if (fjVar2 != null && fjVar2.p5()) {
                    org.telegram.messenger.kj kjVar2 = bnVar.f46250y5;
                    if (kjVar2 == null) {
                        kjVar2 = org.telegram.messenger.kj.b(bnVar.H5.f23968k.suggested_post);
                    }
                    org.telegram.messenger.kj kjVar3 = kjVar2;
                    if (efVar2.f27849b) {
                        org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                        String str = efVar2.I;
                        String str2 = efVar2.f27853g;
                        TLRPC.Photo photo = efVar2.f27851e;
                        long j10 = bnVar.f46085l6;
                        org.telegram.messenger.fj fjVar3 = bnVar.H5;
                        org.telegram.messenger.fj fjVar4 = bnVar.f46096m4;
                        rm rmVar = bnVar.D5;
                        ArrayList arrayList = efVar2.f27859n;
                        int i13 = efVar2.f27868x;
                        boolean z14 = efVar2.M;
                        org.telegram.messenger.zy.b0(i13, i11, i12, j10, efVar2.f27869y, l10.longValue(), bnVar.j9(), efVar2.f27848a, str, str2, arrayList, accountInstance, fjVar3, fjVar4, null, kjVar3, bnVar.Y8(), e20Var2, photo, null, rmVar, z12, z13, z14);
                    } else if (efVar2.h != null) {
                        org.telegram.messenger.zy.Z(bnVar.getAccountInstance(), efVar2.h, efVar2.f27850c, null, bnVar.f46085l6, bnVar.H5, bnVar.f46096m4, bnVar.D5, efVar2.f27859n, efVar2.f27863r, null, efVar2.f27868x, null, e20Var2, z12, i11, z13, efVar2.f27848a, bnVar.Y8(), efVar2.f27869y, l10.longValue(), bnVar.j9(), kjVar3);
                    } else if (efVar2.I != null) {
                        org.telegram.messenger.zy.Z(bnVar.getAccountInstance(), efVar2.I, efVar2.f27850c, null, bnVar.f46085l6, bnVar.H5, bnVar.f46096m4, bnVar.D5, efVar2.f27859n, efVar2.f27863r, null, efVar2.f27868x, null, e20Var2, z12, i11, z13, efVar2.f27848a, bnVar.Y8(), efVar2.f27869y, l10.longValue(), bnVar.j9(), kjVar3);
                    }
                } else if (efVar2.f27849b) {
                    org.telegram.messenger.c accountInstance2 = bnVar.getAccountInstance();
                    String str3 = efVar2.I;
                    String str4 = efVar2.f27853g;
                    TLRPC.Photo photo2 = efVar2.f27851e;
                    long j11 = bnVar.f46085l6;
                    org.telegram.messenger.fj fjVar5 = bnVar.F5;
                    org.telegram.messenger.fj fjVar6 = bnVar.f46096m4;
                    rm rmVar2 = bnVar.D5;
                    ArrayList arrayList2 = efVar2.f27859n;
                    int i14 = efVar2.f27868x;
                    org.telegram.messenger.fj fjVar7 = bnVar.H5;
                    boolean z15 = efVar2.M;
                    org.telegram.messenger.zy.b0(i14, i11, i12, j11, efVar2.f27869y, l10.longValue(), bnVar.j9(), efVar2.f27848a, str3, str4, arrayList2, accountInstance2, fjVar5, fjVar6, fjVar7, bnVar.f46250y5, bnVar.Y8(), e20Var2, photo2, null, rmVar2, z12, z13, z15);
                } else if (efVar2.h != null) {
                    org.telegram.messenger.zy.Z(bnVar.getAccountInstance(), efVar2.h, efVar2.f27850c, null, bnVar.f46085l6, bnVar.F5, bnVar.f46096m4, bnVar.D5, efVar2.f27859n, efVar2.f27863r, null, efVar2.f27868x, bnVar.H5, e20Var2, z12, i11, z13, efVar2.f27848a, bnVar.Y8(), efVar2.f27869y, l10.longValue(), bnVar.j9(), bnVar.f46250y5);
                } else if (efVar2.I != null) {
                    org.telegram.messenger.zy.Z(bnVar.getAccountInstance(), efVar2.I, efVar2.f27850c, null, bnVar.f46085l6, bnVar.F5, bnVar.f46096m4, bnVar.D5, efVar2.f27859n, efVar2.f27863r, null, efVar2.f27868x, bnVar.H5, e20Var2, z12, i11, z13, efVar2.f27848a, bnVar.Y8(), efVar2.f27869y, l10.longValue(), bnVar.j9(), bnVar.f46250y5);
                }
                bnVar.L6();
            }
        }, j3);
    }

    public final boolean u7() {
        CharSequence slowModeTimer = this.f45932a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131745115, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SlowModeHint", null, 2131745116, slowModeTimer));
        org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
        return false;
    }

    public final void u8(int i7, ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        bn bnVar;
        int i10;
        bn bnVar2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && bnVar2.u7()) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList3.size()) {
                    org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList3.get(i11);
                    if (yyVar.f28221m == null && yyVar.f28219k == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.yy) arrayList3.get(0)).d)) {
                    org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(((org.telegram.messenger.yy) arrayList3.get(0)).d, bnVar2.f46085l6, bnVar2.F5, bnVar2.f46096m4, null, false, ((org.telegram.messenger.yy) arrayList3.get(0)).f28217i, null, null, z10, i7, 0, null, false);
                    b10.K = bnVar2.Y8();
                    org.telegram.messenger.zy.C(bnVar2.currentAccount).r0(b10);
                }
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                org.telegram.messenger.yy yyVar2 = (org.telegram.messenger.yy) arrayList3.get(i12);
                if (yyVar2.f28221m != null && yyVar2.f28219k == null) {
                    org.telegram.messenger.c accountInstance = bnVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = yyVar2.f28221m;
                    HashMap hashMap = yyVar2.f28222n;
                    int i13 = i12;
                    org.telegram.messenger.zy.S(i7, bnVar2.f46085l6, 0L, bnVar2.j9(), hashMap, accountInstance, bnVar2.F5, bnVar2.f46096m4, bnVar2.Y8(), botInlineResult, null, bnVar2, bnVar2.D5, z10);
                    arrayList2 = arrayList;
                    bnVar = bnVar2;
                    arrayList2.remove(i13);
                    i10 = i13 - 1;
                } else {
                    arrayList2 = arrayList3;
                    bnVar = bnVar2;
                    i10 = i12;
                }
                i12 = i10 + 1;
                bnVar2 = bnVar;
                arrayList3 = arrayList2;
                z11 = false;
            }
            ArrayList arrayList4 = arrayList3;
            bn bnVar3 = bnVar2;
            if (!arrayList4.isEmpty()) {
                bnVar3.D8(((org.telegram.messenger.yy) arrayList4.get(0)).d, ((org.telegram.messenger.yy) arrayList4.get(0)).f28217i);
                org.telegram.messenger.zy.X(bnVar3.getAccountInstance(), arrayList4, bnVar3.f46085l6, bnVar3.F5, bnVar3.f46096m4, null, bnVar3.D5, false, true, bnVar3.H5, null, z10, i7, 0, ((org.telegram.messenger.yy) arrayList4.get(0)).f28228t, null, bnVar3.Y8(), 0L, false, 0L, bnVar3.j9(), bnVar3.f46250y5, null, false);
                L6();
                if (i7 != 0) {
                    if (this.f46032h4 == -1) {
                        this.f46032h4 = 0;
                    }
                    this.f46032h4 = arrayList.size() + this.f46032h4;
                    md(true);
                }
            }
        }
    }

    public final org.telegram.messenger.aj u9(org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.P6.f(fjVar.c1());
        if (ajVar != null && (ajVar.d.size() <= 1 || ajVar.d(fjVar) == null)) {
            return null;
        }
        return ajVar;
    }

    public final void ub(org.telegram.messenger.fj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.ub(org.telegram.messenger.fj):void");
    }

    public final void uc(boolean z10) {
        if (z10) {
            if (this.f46026gc == null) {
                zd zdVar = new zd(this, 13);
                this.f46026gc = zdVar;
                org.telegram.messenger.g0.h3(zdVar, 100L);
                return;
            }
            return;
        }
        zd zdVar2 = this.f46026gc;
        if (zdVar2 != null) {
            org.telegram.messenger.g0.r(zdVar2);
        }
        this.f46026gc = null;
        this.fc = false;
        fd(true);
    }

    public final void ud() {
        lh.h hVar;
        org.telegram.ui.ActionBar.y yVar;
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            if (this.f46018g4 != 1 && !this.f46209v4 && !ca()) {
                hVar = null;
            } else {
                hVar = this.f46246y1;
            }
            rjVar.setSideButtonsForAttach(hVar);
            boolean ca2 = ca();
            if (this.f46255yb != ca2) {
                this.f46255yb = ca2;
                org.telegram.ui.ActionBar.r0 r0Var = this.f46054j0;
                if ((r0Var != null && r0Var.getVisibility() == 0) || ((yVar = this.f46014g0) != null && yVar.f30256l == 0)) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!kVar.f29088o0 && !kVar.y()) {
                        if (this.f45932a0.E0() && TextUtils.isEmpty(this.f45932a0.getSlowModeTimer()) && !ca()) {
                            org.telegram.ui.ActionBar.y yVar2 = this.f46014g0;
                            if (yVar2 != null) {
                                yVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var2 = this.f46054j0;
                            if (r0Var2 != null) {
                                r0Var2.setVisibility(8);
                            }
                            fr frVar = this.f46002f0;
                            if (frVar != null) {
                                frVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.y yVar3 = this.f46014g0;
                            if (yVar3 != null) {
                                yVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var3 = this.f46054j0;
                            if (r0Var3 != null) {
                                r0Var3.setVisibility(0);
                            }
                            fr frVar2 = this.f46002f0;
                            if (frVar2 != null) {
                                frVar2.b(false);
                            }
                        }
                        vi viVar = this.f46129p1;
                        if (viVar != null) {
                            viVar.f33390l0 = false;
                        }
                    }
                }
            }
        }
    }

    public final void v7(Runnable runnable, cg.a aVar, boolean z10) {
        if (aVar != null && z10) {
            o1 o1Var = new o1(this, aVar, runnable, 20);
            di.x8 x10 = di.x8.x(this.currentAccount, aVar.f5274a);
            if (!x10.f10021e) {
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
        int[] iArr = this.Kb;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[0];
        this.f46093m1.getLocationInWindow(iArr);
        return (i7 - iArr[0]) + f10;
    }

    public final void va() {
        Y6(5, this.f45989e1, true);
        Y6(1, this.f45932a0, false);
        Y6(4, this.f46017g3, true);
        Y6(3, this.f45976d1, false);
        Y6(2, this.T, false);
        float f10 = this.f46000ed.f57657e;
        m6.n nVar = this.f46066jd;
        float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 1.0f - ((float[]) nVar.f20882b)[5], 1.0f);
        lh.c cVar = this.f45989e1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(t6);
        }
        rj rjVar = this.f45932a0;
        if (rjVar != null) {
            rjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        uj ujVar = this.f46017g3;
        if (ujVar != null) {
            ujVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        vj vjVar = this.f45976d1;
        if (vjVar != null) {
            vjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        uj ujVar2 = this.T;
        if (ujVar2 != null) {
            ujVar2.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        jh.f fVar = this.U;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - t6) * 255.0f));
            this.U.setInputBubbleTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        vj vjVar2 = this.f45976d1;
        te.a aVar = this.f45974cd;
        if (vjVar2 != null) {
            vjVar2.setTotalVisibilityFactor((1.0f - aVar.f57657e) * ((float[]) nVar.f20882b)[3]);
        }
        yo yoVar = this.ma;
        if (yoVar != null) {
            float f11 = aVar.f57657e;
            if (yoVar.T != f11) {
                yoVar.T = f11;
                this.fragmentView.invalidate();
            }
        }
        F7();
    }

    public final void vb(long j3) {
        ej ejVar;
        org.telegram.messenger.fj messageObject;
        int h92;
        int abs;
        int i7 = -1;
        if (this.A0 != null && (ejVar = this.C0) != null && ejVar.f59083y < 0) {
            int i10 = 0;
            if (this.W6[0] && ejVar.L0() == 0) {
                this.F7 = -1;
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
            this.F7 = i7;
            this.G7 = i10;
            return;
        }
        this.F7 = -1;
    }

    public final void vc(boolean z10) {
        float f10;
        int i7;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.mp.u1(this.currentAccount).H5 * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!org.telegram.messenger.j10.i(this.currentAccount).q() && !org.telegram.messenger.mp.u1(this.currentAccount).K3()) {
                if (z10) {
                    f10 = org.telegram.messenger.mp.u1(this.currentAccount).F5;
                } else {
                    f10 = org.telegram.messenger.mp.u1(this.currentAccount).G5;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(this);
                    if (z10) {
                        i7 = 2131743565;
                    } else {
                        i7 = 2131751337;
                    }
                    String M0 = org.telegram.messenger.gd.M0(i7, null);
                    if (z10) {
                        i10 = 2131743564;
                    } else {
                        i10 = 2131751336;
                    }
                    org.telegram.ui.Components.gc I = b02.I(2131624211, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(i10, null), new de(this, z10, 1)), spannableString, "%d"));
                    I.f35461j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void vd(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.Wallet.k4 k4Var;
        if (this.fragmentView != null && !this.I5) {
            int childCount = this.A0.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 < childCount) {
                    View childAt = this.A0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.u0) {
                        org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) childAt;
                        org.telegram.messenger.fj messageObject = u0Var.getMessageObject();
                        if (this.f45982d8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.f45982d8 && u0Var.W()) {
                            org.telegram.ui.Wallet.m4 m4Var = u0Var.J0;
                            if (!m4Var.f44528h0 && (m4Var.f44523e0 == 0 || (k4Var = m4Var.f44521d0) == null || k4Var.c())) {
                                m4Var.e();
                                org.telegram.ui.Wallet.k4 k4Var2 = m4Var.f44521d0;
                                k4Var2.getClass();
                                k4Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.k4 k4Var3 = m4Var.f44521d0;
                                k4Var3.f38013b = -1L;
                                k4Var3.f38014c = -1L;
                                m4Var.f44523e0 = SystemClock.elapsedRealtime();
                                m4Var.f44525f0 = false;
                                m4Var.f44515a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.fj messageObject2 = q1Var.getMessageObject();
                        if (this.J8 != null && ((messageObject2.h4() || org.telegram.messenger.fj.L4(messageObject2.f23968k)) && !messageObject2.T4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = q1Var.getPhotoImage();
                            this.J8.setTranslationX(q1Var.getX() + photoImage.L0);
                            this.J8.setTranslationY((this.A0.getY() + ((q1Var.getY() + q1Var.getPaddingTop()) + photoImage.M0)) - this.J8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J8.getLayoutParams();
                            if (messageObject2.h4()) {
                                this.J8.setTag(2131296591, null);
                                if (layoutParams.width != org.telegram.messenger.g0.f3(ba(), S9()) || layoutParams.height != org.telegram.messenger.g0.f3(ba(), S9())) {
                                    int f32 = org.telegram.messenger.g0.f3(ba(), S9());
                                    layoutParams.height = f32;
                                    layoutParams.width = f32;
                                    this.L8.setResizeMode(0);
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                float f33 = ((org.telegram.messenger.g0.f24127x * 2) + org.telegram.messenger.g0.f3(ba(), S9())) / org.telegram.messenger.g0.f3(ba(), S9());
                                float f34 = q1Var.getPhotoImage().N0 / org.telegram.messenger.g0.f3(ba(), S9());
                                if (this.J8.getScaleX() != f34) {
                                    this.J8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.J8.setPivotX(0.0f);
                                this.J8.setPivotY(0.0f);
                                this.J8.setScaleX(f34);
                                this.J8.setScaleY(f34);
                                this.M8.setScaleX(f33);
                                this.M8.setScaleY(f33);
                            } else {
                                this.J8.setTag(2131296591, photoImage);
                                if (layoutParams.width != photoImage.N0 || layoutParams.height != photoImage.O0) {
                                    this.L8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.N0;
                                    layoutParams.height = (int) photoImage.O0;
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                this.M8.setScaleX(1.0f);
                                this.M8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.J8.invalidate();
                            z12 = true;
                        }
                    }
                    i7++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.J8 != null && (fjVar = MediaController.B().f22743v0) != null && fjVar.T == 0) {
                if (!z12) {
                    if (this.B3 && org.telegram.messenger.fj.L4(fjVar.f23968k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.J8.setTranslationY((-org.telegram.messenger.g0.f3(ba(), S9())) - 100);
                    this.fragmentView.invalidate();
                    if (fjVar.h4() || org.telegram.messenger.fj.L4(fjVar.f23968k)) {
                        if (!this.B3 && PipRoundVideoView.G == null) {
                            if (z11) {
                                l(fjVar.e1(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.B().k0(false);
                        }
                    }
                } else {
                    MediaController.B().k0(true);
                    if (!fjVar.h4() && !this.N8) {
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
        nk nkVar = new nk(this, getParentActivity(), this, this.Ba);
        this.O3 = nkVar;
        this.f46093m1.addView(nkVar, 17, c8.ma.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void w8(View view, boolean z10) {
        boolean z11;
        Ub(view);
        if (view != this.f46246y1) {
            z11 = true;
        } else {
            z11 = false;
        }
        x8(z10, z11, 0.2f);
    }

    public final float w9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Kb;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[1];
        this.f46093m1.getLocationInWindow(iArr);
        return (i7 - iArr[1]) + f10;
    }

    public final void wa(boolean z10, boolean z11) {
        if (this.S3) {
            org.telegram.messenger.g0.h3(new zd(this, 23), 200L);
            if (z11) {
                this.S3 = false;
            }
        }
        if (z10 && !this.mb) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        }
    }

    public final void wb() {
        int i7;
        int i10;
        bj bjVar = this.A0;
        if (bjVar != null && this.C0 != null) {
            for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i7 = h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.u0) {
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
            if (!org.telegram.messenger.g0.Q1() && !this.f46209v4 && this.f46001f == null) {
                if (this.Ib == null) {
                    this.Ib = Boolean.valueOf(org.telegram.messenger.pc.e(360928));
                }
                if (this.Ib.booleanValue()) {
                    this.Hb = z10;
                    return;
                }
            }
            int i7 = 0;
            if (this.f46020g6 && org.telegram.messenger.bz.c()) {
                if (z10 == this.Hb) {
                    return;
                }
                this.Hb = z10;
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
            this.Hb = z10;
            FrameLayout frameLayout = this.R;
            if (!z10) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
        }
    }

    public final void wd(boolean z10) {
        TLRPC.Chat O0;
        TLRPC.User user;
        TLRPC.Chat chat;
        vi viVar = this.f46129p1;
        if (viVar == null) {
            return;
        }
        int i7 = this.f46018g4;
        if (i7 == 8 && (chat = this.f45987e) != null) {
            if (this.f46045i4) {
                String j3 = qg.c.j(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.f45987e;
                viVar.h(j3, chat2.scam, chat2.fake, chat2.verified, false, null, z10);
            } else if (org.telegram.messenger.v3.p0(chat)) {
                int i10 = (this.f46173s4 > 0L ? 1 : (this.f46173s4 == 0L ? 0 : -1));
                if (i10 == 0) {
                    TLRPC.Chat chat3 = this.f45987e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f45987e.linked_monoforum_id));
                        if (O02 == null) {
                            O02 = this.f45987e;
                        }
                        this.f46129p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(O02.title)), O02.scam, O02.fake, O02.verified, false, O02.emoji_status, z10);
                    } else {
                        vi viVar2 = this.f46129p1;
                        String F2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.f45987e;
                        viVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z10);
                    }
                } else if (i10 > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f46173s4));
                    this.f46129p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.o10.q(c22))), c22.scam, c22.fake, c22.verified, c22.premium, c22.emoji_status, z10);
                } else {
                    TLRPC.Chat O03 = getMessagesController().O0(Long.valueOf(-this.f46173s4));
                    if (O03 == null) {
                        O03 = this.f45987e;
                    }
                    this.f46129p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(O03.title)), O03.scam, O03.fake, O03.verified, false, O03.emoji_status, z10);
                }
            } else {
                vi viVar3 = this.f46129p1;
                String F22 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.f45987e.title));
                TLRPC.Chat chat5 = this.f45987e;
                viVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i7 == 9) {
                viVar.setTitle(org.telegram.messenger.gd.M0(2131742640, null));
            } else if (i7 == 5) {
                if ("hello".equalsIgnoreCase(this.f46006f4)) {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131752764, null));
                } else if ("away".equalsIgnoreCase(this.f46006f4)) {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131752827, null));
                } else {
                    this.f46129p1.setTitle(this.f46006f4);
                }
            } else if (i7 == 6) {
                if (!TextUtils.isEmpty(this.f45992e4.title)) {
                    this.f46129p1.setTitle(this.f45992e4.title);
                } else {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131752705, null));
                }
            } else if (i7 == 3) {
                long j10 = this.f46173s4;
                if (j10 > 0) {
                    user = getMessagesController().c2(Long.valueOf(j10));
                    O0 = null;
                } else {
                    O0 = getMessagesController().O0(Long.valueOf(-j10));
                    user = null;
                }
                if (org.telegram.messenger.o10.A(user)) {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131746071, null));
                } else if (org.telegram.messenger.o10.t(user)) {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131754250, null));
                } else if (org.telegram.messenger.o10.C(user)) {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131748111, null));
                } else if (user != null) {
                    this.f46129p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.o10.q(user))));
                } else if (O0 != null) {
                    this.f46129p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(O0.title)));
                } else {
                    this.f46129p1.setTitle("");
                }
            } else if (fa() && !org.telegram.messenger.o10.v(this.f46001f)) {
                if (this.f46236x4) {
                    Bd();
                } else if (this.f46209v4) {
                    if (this.f46096m4.x2()) {
                        this.f46129p1.setTitle(org.telegram.messenger.gd.G(this.f46096m4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131751985, null));
                    }
                } else {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.G(this.f46096m4.M1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.o10.A(this.f46001f)) {
                this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131746071, null));
            } else if (org.telegram.messenger.o10.t(this.f46001f)) {
                this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131754250, null));
            } else {
                int i11 = this.f46018g4;
                if (i11 == 1) {
                    if (org.telegram.messenger.o10.C(this.f46001f)) {
                        this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131746127, null));
                    } else {
                        this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131745653, null));
                    }
                } else if (i11 == 2) {
                    this.f46129p1.setTitle(org.telegram.messenger.gd.G(c9(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.f45987e;
                    if (chat6 != null) {
                        vi viVar4 = this.f46129p1;
                        String F23 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.f45987e;
                        viVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                    } else {
                        TLRPC.User user2 = this.f46001f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f46129p1.setTitle(org.telegram.messenger.gd.M0(2131745706, null));
                            } else if (!org.telegram.messenger.mp.L2(user2) && getContactsController().f24571g0.get(Long.valueOf(this.f46001f.f28554id)) == null && (getContactsController().f24571g0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f46001f.phone)) {
                                    vi viVar5 = this.f46129p1;
                                    String h = org.telegram.messenger.n10.h(new StringBuilder("+"), this.f46001f.phone, pf.b.c());
                                    TLRPC.User user3 = this.f46001f;
                                    boolean z11 = user3.scam;
                                    boolean z12 = user3.fake;
                                    boolean z13 = user3.verified;
                                    org.telegram.messenger.mp messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f46001f;
                                    messagesController.getClass();
                                    viVar5.h(h, z11, z12, z13, org.telegram.messenger.mp.H2(user4), this.f46001f.emoji_status, z10);
                                } else {
                                    vi viVar6 = this.f46129p1;
                                    String F24 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.o10.q(this.f46001f)));
                                    TLRPC.User user5 = this.f46001f;
                                    boolean z14 = user5.scam;
                                    boolean z15 = user5.fake;
                                    boolean z16 = user5.verified;
                                    org.telegram.messenger.mp messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f46001f;
                                    messagesController2.getClass();
                                    viVar6.h(F24, z14, z15, z16, org.telegram.messenger.mp.H2(user6), this.f46001f.emoji_status, z10);
                                }
                            } else {
                                vi viVar7 = this.f46129p1;
                                String F25 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.o10.q(this.f46001f)));
                                TLRPC.User user7 = this.f46001f;
                                boolean z17 = user7.scam;
                                boolean z18 = user7.fake;
                                boolean z19 = user7.verified;
                                org.telegram.messenger.mp messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f46001f;
                                messagesController3.getClass();
                                boolean H2 = org.telegram.messenger.mp.H2(user8);
                                if (!org.telegram.messenger.mp.L2(this.f46001f)) {
                                    emojiStatus = this.f46001f.emoji_status;
                                }
                                viVar7.h(F25, z17, z18, z19, H2, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f46129p1.getTitleTextView().getText());
        yd(false);
    }

    public final void x7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.f46091lc > 1000) {
            z10 = true;
        }
        vf vfVar = this.f46102mc;
        org.telegram.messenger.g0.r(vfVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        org.telegram.messenger.g0.h3(vfVar, j3);
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
        View view = this.Z8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            q1Var2.setInvalidatesParent(z12);
            if (z12) {
                qb(q1Var2);
            }
        }
        this.f46093m1.invalidate();
        this.A0.invalidate();
        AnimatorSet animatorSet = this.f46011f9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f46011f9.cancel();
        }
        this.f46011f9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.X8, f10);
        float f11 = 1.0f;
        if (z12) {
            this.f45941a9 = 1.0f;
            this.f45956b9 = 0.0f;
            ValueAnimator valueAnimator = this.Ic;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.Y8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.wk0.d(new le(this, 3));
            }
        } else {
            float f12 = this.X8;
            this.f45956b9 = f12 / max;
            this.Y8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new rf(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f46246y1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f11));
        }
        this.f46011f9.playTogether(arrayList);
        this.f46011f9.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f46011f9.setDuration(320L);
        View view2 = this.Z8;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view2;
        } else {
            q1Var = null;
        }
        this.f46011f9.addListener(new androidx.fragment.app.g(this, z12, q1Var, 6));
        if (this.Z8 != null && this.f45941a9 <= 0.0f) {
            Ub(null);
        }
        this.f46011f9.start();
    }

    public final void x9(boolean z10) {
        int i7;
        int i10;
        if (this.f46018g4 == 7) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.K3;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            org.telegram.messenger.la b10 = a10.b(this.f45978d4);
            if (i13 >= 0 && i13 < b10.f25341a.size()) {
                b10.f25350l = i13;
                org.telegram.messenger.ks.f(a10.f25550a).k(org.telegram.messenger.ks.I0, Integer.valueOf(i11), Integer.valueOf(b10.f25351m), Boolean.valueOf(b10.f25352n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f25350l), Integer.valueOf(((org.telegram.messenger.fj) b10.f25341a.get(i13)).f23968k.f28426id));
                return;
            }
            return;
        }
        org.telegram.messenger.ri mediaDataController = getMediaDataController();
        long j3 = this.f46085l6;
        long j10 = this.f45981d7;
        int i14 = this.classGuid;
        boolean z11 = this.f46114nb;
        if (!z10 ? !z11 : z11) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        mediaDataController.c2(null, j3, j10, i14, i7, this.f46173s4, false, this.D3, this.E3, true, this.F3);
        sc(false);
    }

    public final void xa() {
        this.R4 = true;
        ql qlVar = this.f46201u9;
        org.telegram.messenger.g0.r(qlVar.f32189f0);
        qlVar.f32215z = false;
        zd zdVar = new zd(this, 9);
        int i7 = this.V7;
        if (i7 != 0) {
            Bb(i7, 0, false, this.U7, true, 0, null, null, zdVar);
            return;
        }
        int i10 = this.T7;
        if (i10 > 0) {
            Bb(i10, 0, true, this.U7, true, 0, null, null, zdVar);
            return;
        }
        Ab(!this.Cb, zdVar);
        this.Cb = false;
        if (!this.V4.isEmpty()) {
            this.f45966c5 = true;
            this.f45952b5 = ((Integer) this.V4.get(0)).intValue();
        }
    }

    public final boolean xb() {
        rj rjVar = this.f45932a0;
        if (rjVar != null && rjVar.R0() && !this.f45932a0.f32567d1 && !MediaController.B().K()) {
            this.f46120o5 = true;
            rj rjVar2 = this.f45932a0;
            this.f46133p5 = rjVar2.P;
            this.f46146q5 = rjVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void xc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.gd.M0(2131752646, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752647, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131746126, null), new ee(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        showDialog(u1Var);
    }

    public final void xd() {
        yd(false);
    }

    @Override
    public final boolean y(final org.telegram.ui.cx r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.y91 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.y(org.telegram.ui.cx, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.y91):boolean");
    }

    public final void y7() {
        int t92 = (int) (t9(org.telegram.ui.Components.v11.f40477c) + this.U.getInputBubbleHeight() + this.f46218w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        this.Z.setFadeZoneBottom(t92);
        int b10 = c8.l9.b(org.telegram.messenger.g0.L(36.0f) + (this.f46093m1.getMeasuredHeight() - t92), 0, this.f46093m1.getMeasuredHeight());
        int measuredWidth = this.f46093m1.getMeasuredWidth();
        Rect rect = f45930ud;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Xa, this.A0.getMeasuredWidth(), org.telegram.messenger.g0.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Ya) - t92));
    }

    public final void y8(Runnable runnable) {
        org.telegram.messenger.ks.f(this.currentAccount).d(runnable);
    }

    public final void y9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.y9():void");
    }

    public final int yb(org.telegram.messenger.fj r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.yb(org.telegram.messenger.fj):int");
    }

    public final void yc() {
        String str;
        if (this.f46078kc != null) {
            return;
        }
        if (this.F5 != null) {
            str = getMessagesController().e1(this.F5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.gd.M0(2131743574, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743575, str));
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751324, null), new ee(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new ee(this, 20));
        u1Var.setOnDismissListener(new ke(this, 8));
        this.f46078kc = alertDialog$Builder.p();
    }

    public final void yd(boolean z10) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.p0 p0Var;
        if (this.f46129p1 != null) {
            int i7 = this.f46018g4;
            if (i7 == 0 || i7 == 8) {
                boolean u22 = getMessagesController().u2(this.f46085l6, d(), null);
                if (z10) {
                    u22 = !u22;
                }
                this.R0 = null;
                if (!org.telegram.messenger.v3.e0(this.currentAccount, this.f45987e) && !org.telegram.messenger.v3.f0(this.currentAccount, this.f46001f)) {
                    if (!org.telegram.messenger.o10.A(this.f46001f) && ((!fa() || this.f46236x4) && u22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231943).mutate();
                    int i10 = org.telegram.ui.ActionBar.n6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i10);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f45987e;
                    if (chat != null) {
                        drawable = this.f46129p1.c(org.telegram.messenger.n5.c(chat));
                    } else {
                        TLRPC.User user = this.f46001f;
                        if (user != null && !org.telegram.messenger.o10.C(user)) {
                            drawable = this.f46129p1.c(org.telegram.messenger.n5.c(this.f46001f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f46129p1.j(drawable, mutate);
                if (!z10 && (p0Var = this.f46181t1) != null) {
                    if (u22) {
                        if (p0Var.f29857m != 8) {
                            p0Var.f29857m = 8;
                            View view = p0Var.f29854j;
                            if (view instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view).getRightIcon().setVisibility(p0Var.f29857m);
                            }
                        }
                        this.f46181t1.d(org.telegram.messenger.gd.M0(2131743612, null));
                        this.f46181t1.b(2131232258);
                    } else {
                        if (p0Var.f29857m != 0) {
                            p0Var.f29857m = 0;
                            View view2 = p0Var.f29854j;
                            if (view2 instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view2).getRightIcon().setVisibility(p0Var.f29857m);
                            }
                        }
                        if (getMessagesController().v2(this.f46085l6, d())) {
                            this.f46181t1.d(org.telegram.messenger.gd.M0(2131748122, null));
                            this.f46181t1.b(2131232414);
                        } else {
                            this.f46181t1.d(org.telegram.messenger.gd.M0(2131748122, null));
                            this.f46181t1.b(2131232368);
                        }
                    }
                }
                org.telegram.ui.Components.po poVar = this.f46233x1;
                if (poVar != null) {
                    poVar.e(this.f46085l6, d(), null);
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
        if (this.f46129p1 != null) {
            float actionModeFactor = (1.0f - this.f46040hd.f57657e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, actionModeFactor);
            this.f46129p1.setScaleX(T1);
            this.f46129p1.setScaleY(T1);
            this.f46129p1.setAlpha(actionModeFactor);
            vi viVar = this.f46129p1;
            if (actionModeFactor > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            viVar.setVisibility(i7);
        }
    }

    public final void z8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        org.telegram.messenger.fj fjVar = this.H5;
        if (fjVar != null && (message = fjVar.f23968k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean z9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f46121o6;
        for (int i7 = 0; i7 < sparseArrayArr.length; i7++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i7].size(); i10++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].valueAt(i10);
                    if (fjVar != null && (message = fjVar.f23968k) != null && message.noforwards) {
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
        fi.n2 n2Var = this.Y1;
        if (n2Var != null) {
            n2Var.D1(j3, str, z10, false);
        }
    }

    public final void zb() {
        Ab(false, null);
    }

    public final void zc(View view, CharSequence charSequence, boolean z10) {
        hi.m3 m3Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((m3Var = this.B2) != null && m3Var.W)) {
                this.B2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SlowModeHint", null, 2131745116, charSequence)));
                if (z10) {
                    this.B2.z(view, true);
                }
            }
        }
    }

    public final void zd(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.zd(boolean):void");
    }

    public void ya(boolean z10) {
    }

    @Override
    public final void T() {
    }
}
