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
public class bn extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, ww, na0, org.telegram.ui.Components.ck, org.telegram.ui.Components.bh, pg.b, org.telegram.ui.Components.p40, te.b {
    public static int f45940md = 22;
    public static float f45941nd = 1.4f;
    public static int f45942od = 10;
    public static Pattern f45943pd;
    public static Pattern f45944qd;
    public static Pattern f45945rd;
    public static final int[] f45946sd = {org.telegram.messenger.ls.f25418y, org.telegram.messenger.ls.f25425z, org.telegram.messenger.ls.A, org.telegram.messenger.ls.B, org.telegram.messenger.ls.Z, org.telegram.messenger.ls.C0, org.telegram.messenger.ls.f25385t0, org.telegram.messenger.ls.W0, org.telegram.messenger.ls.f25299e1, org.telegram.messenger.ls.T1, org.telegram.messenger.ls.G, org.telegram.messenger.ls.f25384t, org.telegram.messenger.ls.U, org.telegram.messenger.ls.E0, org.telegram.messenger.ls.F0, org.telegram.messenger.ls.C4, org.telegram.messenger.ls.f25325i3, org.telegram.messenger.ls.f25383s4, org.telegram.messenger.ls.L};
    public static boolean f45947td = false;
    public static final Rect f45948ud = new Rect();
    public bj A0;
    public int A1;
    public hi.l3 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.bj A5;
    public boolean A6;
    public boolean A7;
    public boolean A8;
    public float A9;
    public bn Aa;
    public long Ab;
    public boolean Ac;
    public dj B0;
    public int B1;
    public hi.l3 B2;
    public boolean B3;
    public int B4;
    public org.telegram.messenger.bj B5;
    public int B6;
    public int B7;
    public String B8;
    public VelocityTracker B9;
    public zm Ba;
    public ik Bb;
    public boolean Bc;
    public ej C0;
    public org.telegram.ui.Components.gc C1;
    public hi.l3 C2;
    public boolean C3;
    public int C4;
    public org.telegram.messenger.gj C5;
    public int C6;
    public boolean C7;
    public String C8;
    public boolean C9;
    public zh.d Ca;
    public boolean Cb;
    public boolean Cc;
    public kl D0;
    public bk D1;
    public hi.l3 D2;
    public TLRPC.User D3;
    public hh D4;
    public rm D5;
    public int D6;
    public boolean D7;
    public org.telegram.messenger.gj D8;
    public boolean D9;
    public final org.telegram.messenger.k3 Da;
    public boolean Db;
    public boolean Dc;
    public pi E;
    public wj E0;
    public oj E1;
    public org.telegram.ui.Cells.r1 E2;
    public TLRPC.Chat E3;
    public final SparseArray E4;
    public boolean E5;
    public boolean E6;
    public boolean E7;
    public org.telegram.messenger.gj E8;
    public uk E9;
    public TLRPC.TL_channels_sendAsPeers Ea;
    public boolean Eb;
    public z8 Ec;
    public final xe.b F;
    public boolean F0;
    public hi.i1 F1;
    public int F2;
    public ch.p0 F3;
    public final ArrayList F4;
    public org.telegram.messenger.gj F5;
    public final ArrayList F6;
    public int F7;
    public int F8;
    public boolean F9;
    public TL_account.resolvedBusinessChatLinks Fa;
    public ArrayList Fb;
    public int Fc;
    public final xe.b G;
    public org.telegram.ui.Components.m80 G0;
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
    public hi.l3 H2;
    public boolean H3;
    public boolean H4;
    public org.telegram.messenger.gj H5;
    public final SparseArray H6;
    public boolean H7;
    public boolean H8;
    public lj H9;
    public boolean Ha;
    public boolean Hb;
    public boolean Hc;
    public final int I;
    public org.telegram.ui.ActionBar.n2 I0;
    public org.telegram.ui.Components.h30 I1;
    public hi.l3 I2;
    public String I3;
    public boolean I4;
    public boolean I5;
    public final SparseArray I6;
    public af I7;
    public String I8;
    public org.telegram.ui.Cells.r1 I9;
    public float Ia;
    public Boolean Ib;
    public ValueAnimator Ic;
    public final ui.f J;
    public RadialProgressView J0;
    public org.telegram.ui.ActionBar.t1 J1;
    public hi.l3 J2;
    public String J3;
    public int J4;
    public boolean J5;
    public final HashMap J6;
    public String J7;
    public uj J8;
    public org.telegram.ui.Components.wz J9;
    public final wf Ja;
    public boolean Jb;
    public di Jc;
    public final ui.f K;
    public final int K0;
    public hi.l3 K1;
    public org.telegram.ui.Components.rp K2;
    public int K3;
    public final ArrayList K4;
    public boolean K5;
    public final SparseArray K6;
    public boolean K7;
    public org.telegram.ui.Cells.r1 K8;
    public boolean K9;
    public final fk Ka;
    public final int[] Kb;
    public boolean Kc;
    public dh.c L;
    public int L0;
    public hi.l3 L1;
    public View L2;
    public int L3;
    public final HashMap L4;
    public boolean L5;
    public final a0.h L6;
    public boolean L7;
    public j4 L8;
    public boolean L9;
    public int La;
    public org.telegram.ui.Cells.r1 Lb;
    public int Lc;
    public dh.c M;
    public int M0;
    public hi.l3 M1;
    public ok M2;
    public int M3;
    public org.telegram.messenger.gj M4;
    public int M5;
    public final ArrayList M6;
    public int M7;
    public TextureView M8;
    public ValueAnimator M9;
    public int Ma;
    public org.telegram.ui.Cells.r1 Mb;
    public int Mc;
    public final ui.g N;
    public int N0;
    public hi.l3 N1;
    public hi.l5 N2;
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
    public hi.l3 O1;
    public org.telegram.ui.Components.se0 O2;
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
    public org.telegram.ui.ActionBar.t1 P;
    public Drawable P0;
    public hi.l3 P1;
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
    public hi.l5 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final org.telegram.ui.ActionBar.m5[] S2;
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
    public org.telegram.ui.ActionBar.t1 Tb;
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
    public org.telegram.messenger.gj V3;
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
    public org.telegram.messenger.gj X3;
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
    public hi.l3 Y0;
    public fi.n2 Y1;
    public ImageView Y2;
    public org.telegram.messenger.gj Y3;
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
    public hi.l3 Z0;
    public ai.m0 Z1;
    public RadialProgressView Z2;
    public bi.e3 Z3;
    public int Z4;
    public ArrayList Z5;
    public boolean Z6;
    public int Z7;
    public View Z8;
    public boolean Z9;
    public h6.m Za;
    public int Zb;
    public boolean Zc;
    public int f45949a;
    public rj f45950a0;
    public hi.l3 f45951a1;
    public TextView f45952a2;
    public ImageView f45953a3;
    public di.b1 f45954a4;
    public final int[] f45955a5;
    public String f45956a6;
    public boolean f45957a7;
    public boolean f45958a8;
    public float f45959a9;
    public boolean f45960aa;
    public ValueAnimator f45961ab;
    public int f45962ac;
    public float f45963ad;
    public boolean f45964b;
    public sj f45965b0;
    public org.telegram.ui.Components.ch f45966b1;
    public boolean f45967b2;
    public AnimatorSet f45968b3;
    public jg.l1 f45969b4;
    public int f45970b5;
    public m9.u f45971b6;
    public int f45972b7;
    public org.telegram.messenger.gj f45973b8;
    public float f45974b9;
    public long f45975ba;
    public float f45976bb;
    public int f45977bc;
    public float bd;
    public boolean f45978c;
    public bi.e3 f45979c0;
    public boolean f45980c1;
    public TextView f45981c2;
    public FrameLayout f45982c3;
    public jh.e f45983c4;
    public boolean f45984c5;
    public TLRPC.ChatInvite f45985c6;
    public int f45986c7;
    public org.telegram.messenger.gj f45987c8;
    public Integer f45988c9;
    public int f45989ca;
    public mk f45990cb;
    public CharacterStyle f45991cc;
    public final te.a f45992cd;
    public boolean d;
    public int f45993d0;
    public vj f45994d1;
    public TextView d2;
    public yj f45995d3;
    public int f45996d4;
    public int f45997d5;
    public zd f45998d6;
    public long f45999d7;
    public int f46000d8;
    public int f46001d9;
    public int f46002da;
    public final vk f46003db;
    public String dc;
    public final te.a f46004dd;
    public TLRPC.Chat f46005e;
    public org.telegram.ui.ActionBar.o0 f46006e0;
    public lh.c f46007e1;
    public ck f46008e2;
    public TextView f46009e3;
    public TL_account.TL_businessChatLink f46010e4;
    public int f46011e5;
    public final LongSparseIntArray f46012e6;
    public boolean f46013e7;
    public boolean f46014e8;
    public boolean f46015e9;
    public int f46016ea;
    public final cl eb;
    public vf.b f46017ec;
    public final te.a f46018ed;
    public TLRPC.User f46019f;
    public fr f46020f0;
    public FrameLayout f46021f1;
    public TextView f46022f2;
    public TextView f46023f3;
    public String f46024f4;
    public boolean f46025f5;
    public boolean f46026f6;
    public long f46027f7;
    public boolean f46028f8;
    public AnimatorSet f46029f9;
    public int fa;
    public ArrayList f46030fb;
    public boolean fc;
    public final te.a f46031fd;
    public org.telegram.ui.ActionBar.x f46032g0;
    public LinearLayout f46033g1;
    public org.telegram.ui.Components.a21 f46034g2;
    public uj f46035g3;
    public int f46036g4;
    public boolean f46037g5;
    public boolean f46038g6;
    public final ArrayList f46039g7;
    public long f46040g8;
    public org.telegram.ui.ActionBar.g1 f46041g9;
    public boolean f46042ga;
    public final rh f46043gb;
    public zd f46044gc;
    public final te.a f46045gd;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.o0 f46046h0;
    public org.telegram.ui.Components.io f46047h1;
    public kg.e f46048h2;
    public ImageView f46049h3;
    public int f46050h4;
    public AnimatorSet f46051h5;
    public long f46052h6;
    public final Paint h7;
    public String f46053h8;
    public boolean f46054h9;
    public boolean f46055ha;
    public final wh f46056hb;
    public boolean f46057hc;
    public final te.a f46058hd;
    public org.telegram.ui.ActionBar.o0 f46059i0;
    public bi f46060i1;
    public org.telegram.ui.Components.m80 f46061i2;
    public ImageView f46062i3;
    public boolean f46063i4;
    public final SparseIntArray f46064i5;
    public boolean f46065i6;
    public final Paint i7;
    public Integer f46066i8;
    public int f46067i9;
    public boolean f46068ia;
    public final oi f46069ib;
    public boolean f46070ic;
    public final te.a f46071id;
    public org.telegram.ui.ActionBar.q0 f46072j0;
    public kg.w1 f46073j1;
    public ImageView f46074j2;
    public org.telegram.ui.Components.o6 j3;
    public String f46075j4;
    public final SparseIntArray f46076j5;
    public boolean f46077j6;
    public final ColorMatrix f46078j7;
    public byte[] f46079j8;
    public int f46080j9;
    public org.telegram.ui.Components.ti f46081ja;
    public final nm f46082jb;
    public final RectF f46083jc;
    public final m6.n f46084jd;
    public org.telegram.ui.ActionBar.q0 f46085k0;
    public kg.a0 f46086k1;
    public ki.l f46087k2;
    public org.telegram.ui.Components.o6 f46088k3;
    public byte[] f46089k4;
    public boolean f46090k5;
    public boolean f46091k6;
    public final m.b3 f46092k7;
    public int f46093k8;
    public org.telegram.ui.ActionBar.y0[] f46094k9;
    public float f46095ka;
    public final vf kb;
    public org.telegram.ui.ActionBar.t1 f46096kc;
    public sh.b f46097kd;
    public org.telegram.ui.ActionBar.q0 f46098l0;
    public jh.k l1;
    public TextView f46099l2;
    public org.telegram.ui.Components.o6 f46100l3;
    public String f46101l4;
    public boolean f46102l5;
    public long f46103l6;
    public final org.telegram.ui.ActionBar.u4 f46104l7;
    public int f46105l8;
    public org.telegram.ui.ActionBar.y0 f46106l9;
    public float f46107la;
    public final vf f46108lb;
    public long f46109lc;
    public final Rect f46110ld;
    public org.telegram.ui.ActionBar.q0 m0;
    public pl f46111m1;
    public mj f46112m2;
    public jj f46113m3;
    public org.telegram.messenger.gj f46114m4;
    public boolean f46115m5;
    public Long f46116m6;
    public long f46117m7;
    public zd f46118m8;
    public final pj f46119m9;
    public yo ma;
    public boolean mb;
    public final vf f46120mc;
    public boolean f46121n;
    public org.telegram.ui.Components.g11 f46122n0;
    public org.telegram.ui.Components.eo n1;
    public FrameLayout f46123n2;
    public hj f46124n3;
    public org.telegram.messenger.gj f46125n4;
    public boolean f46126n5;
    public int f46127n6;
    public int f46128n7;
    public String f46129n8;
    public ll f46130n9;
    public Animator f46131na;
    public boolean f46132nb;
    public int f46133nc;
    public org.telegram.ui.ActionBar.o0 f46134o0;
    public final ArrayList f46135o1;
    public mj f46136o2;
    public org.telegram.ui.Cells.v0 f46137o3;
    public boolean o4;
    public boolean f46138o5;
    public final SparseArray[] f46139o6;
    public int f46140o7;
    public org.telegram.messenger.t3 f46141o8;
    public xj f46142o9;
    public boolean f46143oa;
    public long f46144ob;
    public boolean f46145oc;
    public org.telegram.ui.ActionBar.q0 f46146p0;
    public vi f46147p1;
    public FrameLayout f46148p2;
    public int f46149p3;
    public ArrayList f46150p4;
    public boolean f46151p5;
    public final SparseArray[] f46152p6;
    public final Matrix f46153p7;
    public boolean f46154p8;
    public int f46155p9;
    public boolean f46156pa;
    public xi.e f46157pb;
    public Pattern f46158pc;
    public org.telegram.ui.ActionBar.x f46159q0;
    public org.telegram.ui.Components.o6 f46160q1;
    public TextView f46161q2;
    public org.telegram.ui.Components.h50 f46162q3;
    public org.telegram.messenger.gj f46163q4;
    public long f46164q5;
    public final SparseArray[] f46165q6;
    public LinearGradient f46166q7;
    public boolean f46167q8;
    public int f46168q9;
    public bn f46169qa;
    public boolean f46170qb;
    public org.telegram.messenger.gj f46171qc;
    public long f46172r;
    public boolean f46173r0;
    public ug f46174r1;
    public org.telegram.ui.Components.yz f46175r2;
    public View f46176r3;
    public TLRPC.TL_forumTopic f46177r4;
    public boolean f46178r5;
    public boolean f46179r6;
    public int f46180r7;
    public TLRPC.ChatFull f46181r8;
    public int f46182r9;
    public float f46183ra;
    public int f46184rb;
    public te f46185rc;
    public final HashMap f46186s;
    public RadialProgressView f46187s0;
    public org.telegram.ui.Components.ax0 f46188s1;
    public org.telegram.ui.Components.nv0 f46189s2;
    public boolean f46190s3;
    public long f46191s4;
    public boolean s5;
    public int f46192s6;
    public int f46193s7;
    public TLRPC.UserFull f46194s8;
    public boolean s9;
    public AnimatorSet f46195sa;
    public int f46196sb;
    public ArrayList f46197sc;
    public org.telegram.ui.ActionBar.o0 f46198t0;
    public org.telegram.ui.ActionBar.o0 f46199t1;
    public hi.l3 f46200t2;
    public boolean f46201t3;
    public int f46202t4;
    public boolean f46203t5;
    public int t6;
    public final Paint f46204t7;
    public org.telegram.ui.Cells.f6 f46205t8;
    public boolean f46206t9;
    public final yj f46207ta;
    public boolean f46208tb;
    public final k8.a f46209tc;
    public org.telegram.ui.ActionBar.o0 f46210u0;
    public org.telegram.ui.ActionBar.o0 f46211u1;
    public hi.l3 f46212u2;
    public boolean f46213u3;
    public TLRPC.Chat f46214u4;
    public org.telegram.messenger.gj f46215u5;
    public int f46216u6;
    public final Matrix f46217u7;
    public ax0 f46218u8;
    public ql f46219u9;
    public wh.i f46220ua;
    public boolean f46221ub;
    public final jh.a f46222uc;
    public org.telegram.ui.ActionBar.o0 f46223v0;
    public org.telegram.ui.ActionBar.o0 f46224v1;
    public hi.l3 f46225v2;
    public AnimatorSet f46226v3;
    public boolean f46227v4;
    public org.telegram.messenger.gj f46228v5;
    public int f46229v6;
    public LinearGradient f46230v7;
    public final a0.h f46231v8;
    public View f46232v9;
    public ch.s f46233va;
    public a0.h f46234vb;
    public boolean f46235vc;
    public final wi f46236w;
    public org.telegram.ui.ActionBar.o0 f46237w0;
    public org.telegram.ui.ActionBar.o0 f46238w1;
    public boolean f46239w2;
    public ValueAnimator f46240w3;
    public boolean f46241w4;
    public org.telegram.messenger.bj f46242w5;
    public int f46243w6;
    public boolean f46244w7;
    public String f46245w8;
    public boolean f46246w9;
    public uz0 f46247wa;
    public a0.h f46248wb;
    public boolean wc;
    public pi f46249x;
    public ClippingImageView f46250x0;
    public org.telegram.ui.Components.ro f46251x1;
    public hi.l3 f46252x2;
    public float f46253x3;
    public boolean f46254x4;
    public org.telegram.messenger.kj f46255x5;
    public int f46256x6;
    public boolean f46257x7;
    public long f46258x8;
    public boolean f46259x9;
    public boolean f46260xa;
    public boolean f46261xb;
    public boolean xc;
    public pi f46262y;
    public org.telegram.ui.Components.oz0 f46263y0;
    public lh.h f46264y1;
    public boolean f46265y2;
    public boolean f46266y3;
    public boolean f46267y4;
    public org.telegram.messenger.lj f46268y5;
    public int f46269y6;
    public int f46270y7;
    public String f46271y8;
    public boolean f46272y9;
    public org.telegram.ui.Components.np ya;
    public boolean f46273yb;
    public long f46274yc;
    public jh.g f46275z0;
    public boolean f46276z1;
    public hi.l3 f46277z2;
    public boolean f46278z3;
    public boolean f46279z4;
    public org.telegram.messenger.gj f46280z5;
    public final ArrayList f46281z6;
    public boolean f46282z7;
    public boolean f46283z8;
    public float f46284z9;
    public zm f46285za;
    public Paint f46286zb;
    public boolean f46287zc;

    public bn(Bundle bundle) {
        super(bundle);
        this.f45949a = 0;
        this.f45978c = false;
        this.d = false;
        this.f46186s = new HashMap();
        this.f46236w = new wi(this, new af(this, 25));
        xe.b bVar = new xe.b();
        this.F = bVar;
        xe.b bVar2 = new xe.b();
        this.G = bVar2;
        this.Y = new jh.l();
        this.K0 = org.telegram.ui.ActionBar.m6.Ji;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.f46135o1 = new ArrayList();
        this.Q2 = new org.telegram.ui.Components.q9[2];
        this.R2 = new an[2];
        this.S2 = new org.telegram.ui.ActionBar.m5[2];
        this.T2 = new qm[2];
        this.W2 = new AnimatorSet[2];
        this.X2 = false;
        this.f46149p3 = 500;
        this.f46010e4 = null;
        this.f46050h4 = -1;
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
        this.f45955a5 = new int[1];
        this.f46064i5 = new SparseIntArray();
        this.f46076j5 = new SparseIntArray();
        this.f46178r5 = true;
        this.f46203t5 = true;
        this.I5 = true;
        this.L5 = true;
        this.f46012e6 = new LongSparseIntArray();
        this.f46127n6 = 1;
        this.f46139o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f46152p6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f46165q6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f46281z6 = new ArrayList();
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
        this.f45986c7 = 0;
        this.f46039g7 = new ArrayList();
        this.h7 = new Paint(1);
        this.i7 = new Paint(1);
        this.f46078j7 = new ColorMatrix();
        this.f46092k7 = new m.b3();
        this.f46104l7 = new org.telegram.ui.ActionBar.u4(0, false, false, new ij(this, 0));
        this.f46153p7 = new Matrix();
        Paint paint = new Paint(1);
        this.f46204t7 = paint;
        this.f46217u7 = new Matrix();
        this.F7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.P7 = Integer.MAX_VALUE;
        this.Q7 = -1;
        this.Y7 = true;
        this.f46000d8 = Integer.MAX_VALUE;
        this.f46093k8 = -1;
        this.f46105l8 = -10000;
        this.f46231v8 = new a0.h();
        this.O8 = new af(this, 28);
        ui.b bVar3 = new ui.b();
        this.P8 = bVar3;
        this.Q8 = new dh.c(bVar3, bVar3, bVar3);
        this.W8 = new Paint(1);
        this.X8 = 0.0f;
        this.f45959a9 = 1.0f;
        this.f45974b9 = 0.0f;
        this.f46054h9 = true;
        this.f46119m9 = new pj(this);
        this.K9 = true;
        this.f46207ta = new yj(this, 0);
        this.Da = new org.telegram.messenger.k3(this);
        this.Ja = new wf(this, 0);
        this.Ka = new fk(this);
        this.Ma = -1;
        this.f46003db = new vk(this);
        this.eb = new cl(this);
        this.f46043gb = new rh(this);
        this.f46056hb = new wh(this);
        this.f46069ib = new oi(this);
        this.f46082jb = new nm(this);
        this.kb = new vf(this, 5);
        this.f46108lb = new vf(this, 7);
        this.Kb = new int[2];
        this.f46083jc = new RectF();
        this.f46120mc = new vf(this, 9);
        this.f46209tc = new k8.a(9);
        this.f46222uc = new Object();
        this.Kc = false;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.f45992cd = new te.a(0, this, nrVar, 320L, false);
        this.f46004dd = new te.a(1, this, nrVar, 520L, false);
        this.f46018ed = new te.a(2, this, nrVar, 520L, false);
        this.f46031fd = new te.a(3, this, nrVar, 320L, false);
        this.f46045gd = new te.a(4, this, nrVar, 320L, false);
        this.f46058hd = new te.a(5, this, nrVar, 320L, false);
        this.f46071id = new te.a(6, this, nrVar, 320L, false);
        vf vfVar = new vf(this, 12);
        ?? obj = new Object();
        obj.f20910b = new float[32];
        obj.f20909a = 1;
        obj.d = new te.j(obj, se.a.f57191a, 240L);
        obj.f20911c = vfVar;
        this.f46084jd = obj;
        this.f46110ld = new Rect();
        ?? obj2 = new Object();
        this.N = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.cz.f()) {
            dh.g gVar = new dh.g(false);
            this.H = gVar;
            this.I = Math.max(0, org.telegram.messenger.g0.L(48.0f) - Math.min(org.telegram.messenger.g0.f24041n, org.telegram.messenger.g0.f24040m));
            ui.f fVar = new ui.f(obj2);
            this.K = fVar;
            fVar.d = gVar;
            fVar.f59049e = -3;
            fVar.f59050f = obj2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.M = cVar;
            cVar.f8411k = true;
            if (org.telegram.messenger.qc.e(262144)) {
                ui.f fVar2 = new ui.f(obj2);
                this.J = fVar2;
                fVar2.d = gVar;
                fVar2.f59049e = -2;
                fVar2.f59050f = obj2;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.L = cVar2;
                cVar2.f8411k = true;
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
        cVar3.f8408g = bVar;
        this.L.f8408g = bVar;
        this.M.f8408g = bVar;
        this.Q8.f8408g = new xe.b();
        this.O.f8407f = bVar2;
        this.L.f8407f = bVar2;
        this.M.f8407f = bVar2;
        this.Q8.f8407f = bVar2;
    }

    public static void A0(bn bnVar) {
        if (bnVar.f46171qc == null) {
            return;
        }
        uy0[] uy0VarArr = {uy0.e1(bnVar.getParentActivity(), bnVar, true, bnVar.resourceProvider, new li.d(17, bnVar, uy0VarArr))};
    }

    public static void A1(bn bnVar, ArrayList arrayList, long j3, org.telegram.ui.Components.yk0 yk0Var, boolean z10, int i7) {
        if (z10) {
            org.telegram.messenger.az.C(bnVar.currentAccount).q0(arrayList, j3, false, false, true, i7, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.g0.h3(new bg.k0(bnVar, j3, 4), 400L);
            yk0Var.dismiss();
        }
    }

    public static void B0(bn bnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.np.u1(bnVar.currentAccount).q1(user.f28583id);
                    ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new u7(4, bnVar, user));
                }
            }
        }
    }

    public static void B1(bn bnVar, String str) {
        if (org.telegram.messenger.np.u1(bnVar.currentAccount).R2(false)) {
            bnVar.getParentActivity();
            vf.c.o(str);
            return;
        }
        org.telegram.ui.Components.c5.l0(bnVar.getParentActivity(), bnVar.Ba, str, false, new qf(bnVar, str, 0));
    }

    public static void C0(bn bnVar, org.telegram.messenger.bj bjVar, org.telegram.messenger.gj gjVar, int i7, int i10) {
        if (bjVar != null) {
            ArrayList arrayList = bjVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.az.C(bnVar.currentAccount).u((org.telegram.messenger.gj) arrayList.get(0), bnVar, i7, i10);
                return;
            }
        }
        org.telegram.messenger.az.C(bnVar.currentAccount).u(gjVar, bnVar, i7, i10);
    }

    public static void C1(bn bnVar, String str) {
        Uri parse = Uri.parse(str);
        h40.b(bnVar.getParentActivity(), bnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void C8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i7 = 6;
        if (z10) {
            menu.add(2131296498, 2131296504, 6, org.telegram.messenger.hd.N0(2131746244, null));
            i7 = 7;
        }
        if (z13) {
            menu.add(2131296498, 2131296510, i7, org.telegram.messenger.hd.N0(2131745019, null));
            i7++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, i7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i7 + 2;
        menu.add(2131296498, 2131296499, i7 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131748157, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.l41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296498, 2131296501, i10, spannableStringBuilder3);
            i10 = i7 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131744194, null));
            ?? obj = new Object();
            obj.f35337a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.gz0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(2131296498, 2131296511, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131743644, null));
            ?? obj2 = new Object();
            obj2.f35337a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.gz0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(2131296498, 2131296514, i11, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(2131296498, 2131296500, i10, org.telegram.messenger.hd.N0(2131751732, null));
            i10++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(2131296498, 2131296495, i10, org.telegram.messenger.hd.N0(2131750573, null));
            i10++;
        }
        menu.add(2131296498, 2131296505, i10, org.telegram.messenger.hd.N0(2131746141, null));
    }

    public static void D0(bn bnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.u1(bnVar.currentAccount).q1(user.f28583id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new xg(bnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void D1(bn bnVar) {
        org.telegram.messenger.np messagesController = bnVar.getMessagesController();
        long j3 = bnVar.f46103l6;
        long j10 = bnVar.f45999d7;
        int i7 = bnVar.classGuid;
        int i10 = bnVar.f46036g4;
        long j11 = bnVar.f46191s4;
        int i11 = bnVar.C4;
        int i12 = bnVar.f46127n6;
        bnVar.f46127n6 = i12 + 1;
        messagesController.e3(j3, j10, false, 30, 0, 0, true, 0, i7, 0, i10, j11, i11, i12, bnVar.f46254x4);
    }

    public static void E0(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        String str4;
        if (bnVar.f46228v5 != null && i7 < arrayList.size() && bnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.gj gjVar = bnVar.f46228v5;
            if (gjVar != null) {
                TLRPC.Message message = gjVar.f24213k;
            }
            org.telegram.ui.Components.b31.V0(bnVar.getParentActivity(), bnVar, inputPeer, iArr[0], bnVar.f46228v5.M2, str, str4, charSequence, z10, efVar, new vf(bnVar, 10)).f30204p0 = false;
            bnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + bnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit();
                edit.putInt("dialog_show_translate_count" + bnVar.a(), i10 - 1).apply();
                bnVar.zd(true);
            }
        }
    }

    public static boolean E1(org.telegram.ui.bn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.E1(org.telegram.ui.bn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void F0(org.telegram.ui.bn r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.gj r11, org.telegram.ui.Cells.r1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.F0(org.telegram.ui.bn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.gj, org.telegram.ui.Cells.r1, int, int):void");
    }

    public static void F1(bn bnVar, View view, int i7) {
        org.telegram.ui.Components.y5 y5Var;
        TLRPC.User user;
        char c10;
        uj ujVar;
        uj ujVar2;
        if (i7 != 0) {
            jg.h1 adapter = bnVar.X1.getAdapter();
            if (adapter.f17558x0 != null && !adapter.f17539i0) {
                return;
            }
            int i10 = i7 - 1;
            Object J = bnVar.X1.getAdapter().J(i10);
            int i11 = bnVar.X1.getAdapter().Y;
            int i12 = bnVar.X1.getAdapter().Z;
            if (bnVar.X1.getAdapter().G != null && i10 == 1) {
                bnVar.f45950a0.p1(i11, i12, bnVar.X1.getAdapter().G + "@" + org.telegram.messenger.v3.K(bnVar.f46005e, false) + " ", false);
            } else if (bnVar.X1.getAdapter().G != null && i10 == 0) {
                bnVar.f45950a0.p1(i11, i12, a8.p0.s(new StringBuilder(), bnVar.X1.getAdapter().G, " "), false);
            } else if (J instanceof kg.u1) {
                if (!bnVar.getUserConfig().q()) {
                    bnVar.showDialog(new ug.y0(bnVar, bnVar.getParentActivity(), bnVar.currentAccount, true, 31, false, null));
                    return;
                }
                kg.u1 u1Var = (kg.u1) J;
                org.telegram.ui.Components.c5.X(bnVar.currentAccount, Math.max(1, u1Var.a()), bnVar.f46103l6, new li.d(13, bnVar, u1Var));
            } else {
                org.telegram.messenger.cj cjVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (bnVar.f46036g4 != 0 || !bnVar.t7(view)) {
                        if (view instanceof org.telegram.ui.Cells.y7) {
                            cjVar = ((org.telegram.ui.Cells.y7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.c5.X(bnVar.currentAccount, 1, bnVar.a(), new di.n2(bnVar, tL_document, org.telegram.messenger.gj.U(tL_document), bnVar.X1.getAdapter().L(i10), cjVar, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (bnVar.C3 && (ujVar2 = bnVar.f46035g3) != null && ujVar2.getVisibility() == 0) {
                        bnVar.Db(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.v3.K(chat, false);
                    if (K != null) {
                        bnVar.f45950a0.p1(i11, i12, a8.p0.p("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (bnVar.C3 && (ujVar = bnVar.f46035g3) != null && ujVar.getVisibility() == 0) {
                        bnVar.Db(null, user2);
                    } else if (org.telegram.messenger.p10.o(user2) != null) {
                        bnVar.f45950a0.p1(i11, i12, "@" + org.telegram.messenger.p10.o(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(p5.c.v(org.telegram.messenger.p10.k(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.v41("" + user2.f28583id, 3, null), 0, spannableString.length(), 33);
                        bnVar.f45950a0.p1(i11, i12, spannableString, false);
                    }
                } else if (J instanceof jg.e1) {
                    if (bnVar.X1.getAdapter().K != null && bnVar.f46036g4 != 1) {
                        jg.e1 e1Var = (jg.e1) J;
                        org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(e1Var.f17477a, bnVar.f46103l6, bnVar.F5, bnVar.f46114m4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = bnVar.Y8();
                        b10.X = e1Var.f17478b;
                        b10.R = bnVar.j9();
                        b10.T = bnVar.f46268y5;
                        bnVar.getSendMessagesHelper().r0(b10);
                        bnVar.f45950a0.setFieldText("");
                        bnVar.D9(false);
                    }
                } else if (J instanceof String) {
                    if (bnVar.X1.getAdapter().K != null) {
                        if (bnVar.f46036g4 == 1) {
                            org.telegram.ui.Components.c5.J(bnVar.getParentActivity(), bnVar.f46103l6, new oi.f0(12, bnVar, (String) J), bnVar.Ba);
                            return;
                        } else if (!bnVar.t7(view)) {
                            org.telegram.ui.Components.c5.X(bnVar.currentAccount, 1, bnVar.f46103l6, new li.d(14, bnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    bnVar.f45950a0.p1(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (bnVar.f45950a0.getFieldText() != null) {
                        if (bnVar.f46036g4 == 1 || !bnVar.t7(view)) {
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
                                    String N0 = org.telegram.messenger.hd.N0(2131745400, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                    t1Var.S = N0;
                                    if (c10 == 1) {
                                        t1Var.U = org.telegram.messenger.hd.N0(2131750458, null);
                                    } else {
                                        t1Var.U = org.telegram.messenger.hd.N0(2131748910, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar.showDialog(t1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(bnVar.X1.getAdapter().S);
                                bnVar.f46030fb = arrayList;
                                PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                                PhotoViewer.p1().f2(arrayList, bnVar.X1.getAdapter().M(i10), 3, false, bnVar.f46043gb, bnVar);
                                return;
                            }
                            org.telegram.ui.Components.c5.X(bnVar.currentAccount, 1, bnVar.a(), new li.d(15, bnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    u8 u8Var = new u8(21, bnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (bnVar.Jb) {
                        u8Var.run();
                    } else {
                        zc1.a(bnVar.getParentActivity(), new li.d(16, bnVar, u8Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    kj kjVar = bnVar.X1;
                    if (kjVar != null && (user = kjVar.getAdapter().f17558x0) != null) {
                        bnVar.f45950a0.setFieldText("");
                        long j3 = bnVar.f46103l6;
                        if (j3 == user.f28583id) {
                            bnVar.f46258x8 = j3;
                            bnVar.getMessagesController().K4(tL_inlineBotSwitchPM.start_param, bnVar.f46019f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f28583id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", bnVar.f46103l6);
                        if (bnVar.getMessagesController().E(bundle, bnVar, null, null)) {
                            bnVar.presentFragment(new bn(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.oi) {
                    String str = ((org.telegram.messenger.oi) J).f26126a;
                    rj rjVar = bnVar.f45950a0;
                    rjVar.Z();
                    rjVar.V0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            bnVar.f45950a0.p1(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = bnVar.f45950a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e11 = org.telegram.ui.Components.p5.e(bnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.gj.U(e11));
                            if (e11 != null) {
                                y5Var = new org.telegram.ui.Components.y5(e11, fontMetricsInt);
                            } else {
                                y5Var = new org.telegram.ui.Components.y5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(y5Var, 0, spannableString2.length(), 33);
                            bnVar.f45950a0.p1(i11, i12, spannableString2, false);
                            bnVar.X1.o(false);
                        }
                    }
                    bnVar.f45950a0.p1(i11, i12, str, true);
                    bnVar.X1.o(false);
                }
            }
        }
    }

    public static void G0(bn bnVar) {
        long j3;
        ArrayList arrayList = bnVar.f46281z6;
        arrayList.add(Integer.valueOf(bnVar.f46127n6));
        if (bnVar.f46036g4 == 7) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(bnVar.currentAccount);
            String str = bnVar.J3;
            int i7 = bnVar.classGuid;
            int i10 = bnVar.f45996d4;
            int i11 = bnVar.f46127n6;
            bnVar.f46127n6 = i11 + 1;
            a10.e(i7, i10, i11, str);
        } else if (bnVar.O7 != 0) {
            org.telegram.messenger.np messagesController = bnVar.getMessagesController();
            long j10 = bnVar.f46103l6;
            long j11 = bnVar.f45999d7;
            int i12 = bnVar.O7;
            int i13 = bnVar.classGuid;
            int i14 = bnVar.f46036g4;
            long j12 = bnVar.f46191s4;
            int i15 = bnVar.C4;
            int i16 = bnVar.f46127n6;
            bnVar.f46127n6 = i16 + 1;
            messagesController.e3(j10, j11, false, 30, 0, i12, true, 0, i13, 4, i14, j12, i15, i16, bnVar.f46254x4);
        } else if (bnVar.M7 != 0 && (!bnVar.fa() || bnVar.M7 == bnVar.f46000d8 || bnVar.f46254x4)) {
            int i17 = bnVar.B7;
            if (i17 != 0) {
                bnVar.f45999d7 = i17;
                org.telegram.messenger.np messagesController2 = bnVar.getMessagesController();
                long j13 = bnVar.f45999d7;
                boolean z10 = bnVar.f46282z7;
                int i18 = bnVar.f46270y7;
                int i19 = bnVar.M7;
                int i20 = bnVar.classGuid;
                int i21 = bnVar.f46036g4;
                long j14 = bnVar.f46191s4;
                int i22 = bnVar.C4;
                int i23 = bnVar.f46127n6;
                bnVar.f46127n6 = i23 + 1;
                messagesController2.e3(j13, 0L, z10, i18, i19, 0, true, 0, i20, 3, i21, j14, i22, i23, bnVar.f46254x4);
            } else {
                org.telegram.messenger.np messagesController3 = bnVar.getMessagesController();
                long j15 = bnVar.f46103l6;
                long j16 = bnVar.f45999d7;
                boolean z11 = bnVar.f46282z7;
                int i24 = bnVar.f46270y7;
                int i25 = bnVar.M7;
                int i26 = bnVar.classGuid;
                int i27 = bnVar.f46036g4;
                long j17 = bnVar.f46191s4;
                int i28 = bnVar.C4;
                int i29 = bnVar.f46127n6;
                bnVar.f46127n6 = i29 + 1;
                messagesController3.e3(j15, j16, z11, i24, i25, 0, true, 0, i26, 3, i27, j17, i28, i29, bnVar.f46254x4);
            }
        } else if (bnVar.A7) {
            bnVar.f46127n6++;
        } else {
            org.telegram.messenger.np messagesController4 = bnVar.getMessagesController();
            long j18 = bnVar.f46103l6;
            long j19 = bnVar.f45999d7;
            boolean z12 = bnVar.f46282z7;
            int i30 = bnVar.f46270y7;
            int i31 = bnVar.M7;
            int i32 = bnVar.classGuid;
            int i33 = bnVar.f46036g4;
            long j20 = bnVar.f46191s4;
            int i34 = bnVar.C4;
            int i35 = bnVar.f46127n6;
            bnVar.f46127n6 = i35 + 1;
            messagesController4.e3(j18, j19, z12, i30, i31, 0, true, 0, i32, 2, i33, j20, i34, i35, bnVar.f46254x4);
        }
        int i36 = bnVar.f46036g4;
        if (i36 == 0 || (i36 == 3 && bnVar.e9() == bnVar.getUserConfig().e())) {
            if (bnVar.fa() && !bnVar.f46254x4) {
                return;
            }
            arrayList.add(Integer.valueOf(bnVar.f46127n6));
            org.telegram.messenger.np messagesController5 = bnVar.getMessagesController();
            long j21 = bnVar.f46103l6;
            long j22 = bnVar.f45999d7;
            int i37 = bnVar.classGuid;
            if (bnVar.f46036g4 == 3) {
                j3 = 0;
            } else {
                j3 = bnVar.f46191s4;
            }
            long j23 = j3;
            int i38 = bnVar.C4;
            int i39 = bnVar.f46127n6;
            bnVar.f46127n6 = i39 + 1;
            messagesController5.e3(j21, j22, false, 1, 0, 0, true, 0, i37, 2, 1, j23, i38, i39, bnVar.f46254x4);
        }
    }

    public static void G1(bn bnVar, long j3, long j10) {
        di.y8.y(bnVar.currentAccount, false).C(j3, j10, new di.p4(bnVar, j3, j10, 1));
    }

    public static boolean H0(bn bnVar) {
        org.telegram.messenger.gj gjVar = bnVar.f46171qc;
        if (gjVar == null) {
            return false;
        }
        if (org.telegram.messenger.g0.g(gjVar.T0)) {
            new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void H1(bn bnVar, TLRPC.Document document) {
        bnVar.L4.put(document, 0);
        org.telegram.messenger.az.C(bnVar.currentAccount).v0(document, null, bnVar.f46103l6, null, null, null, bnVar.D5, null, true, 0, 0, false, null, bnVar.Y8(), 0L, bnVar.j9(), bnVar.f46268y5);
    }

    public static void I1(bn bnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i7, org.telegram.messenger.gj gjVar, int i10, int i11, org.telegram.messenger.gj gjVar2) {
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
            final long B0 = org.telegram.messenger.gj.B0(((org.telegram.messenger.gj) arrayList.get(0)).f24213k);
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
                bnVar2.f46000d8 = i7;
            }
            if (gjVar != null && (messageReplies = gjVar.f24213k.replies) != null && (messageReplies2 = bnVar2.f46114m4.f24213k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (gjVar != null && (tL_messageReactions = gjVar.f24213k.reactions) != null) {
                bnVar2.f46114m4.f24213k.reactions = tL_messageReactions;
            }
            ai.b1 b1Var = new ai.b1(bnVar, new boolean[]{false}, i10, bnVar2, 20);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f28455id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = bnVar2.getClassGuid();
                org.telegram.messenger.ls.f(bnVar.currentAccount).b(new fi(bnVar, classGuid, b1Var, bnVar2), org.telegram.messenger.ls.D);
                final int i15 = i12;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        bn bnVar3 = bn.this;
                        org.telegram.messenger.np messagesController = bnVar3.getMessagesController();
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
                        messagesController.R3(messages_messages2, size2, B0, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i19, true, 0, ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1(), 1, false, 0, true, bnVar3.f46254x4, null);
                    }
                });
                return;
            }
            b1Var.run();
            return;
        }
        bnVar.Pc = 0;
        bnVar.Qc = false;
        bnVar.A0.g1();
        if (gjVar2 != null) {
            bnVar.Ja(gjVar2);
        } else if (bnVar.getParentActivity() != null) {
            org.telegram.ui.Components.lc.b0(bnVar).t(org.telegram.messenger.hd.N0(2131752318, null), bnVar.Ba).j();
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
        org.telegram.messenger.az.C(bnVar.currentAccount).v0(tL_document, str, bnVar.f46103l6, bnVar.F5, bnVar.f46114m4, null, bnVar.D5, null, z10, i7, 0, false, obj, bnVar.Y8(), 0L, bnVar.j9(), bnVar.f46268y5);
    }

    public static void J1(bn bnVar) {
        SparseArray[] sparseArrayArr = bnVar.f46139o6;
        org.telegram.messenger.gj gjVar = null;
        for (int i7 = 1; i7 >= 0; i7--) {
            if (gjVar == null && sparseArrayArr[i7].size() != 0) {
                gjVar = (org.telegram.messenger.gj) bnVar.G6[i7].get(sparseArrayArr[i7].keyAt(0));
            }
            sparseArrayArr[i7].clear();
            bnVar.f46152p6[i7].clear();
            bnVar.f46165q6[i7].clear();
        }
        if (bnVar.getParentActivity() != null && gjVar != null && ((org.telegram.messenger.gj.R4(gjVar.f24213k) || gjVar.h4()) && gjVar.F0() != null)) {
            TLRPC.Document F0 = gjVar.F0();
            org.telegram.messenger.w7.G(bnVar.currentAccount);
            File J = org.telegram.messenger.w7.J(F0, null, false, true);
            TLRPC.Message message = gjVar.f24213k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(gjVar.f24213k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.gj.L4(gjVar.f24213k) && !gjVar.h4()) {
                    intent.setType(gjVar.t1());
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
                bnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131745263, null)), 500);
            }
        }
        bnVar.B9();
        bnVar.gd(0, true);
        bnVar.Gd(false);
        bnVar.td();
    }

    public static void K0(bn bnVar, TLRPC.Document document) {
        bnVar.L4.put(document, 0);
        org.telegram.messenger.az.C(bnVar.currentAccount).v0(document, null, bnVar.f46103l6, null, null, null, bnVar.D5, null, true, 0, 0, false, null, bnVar.Y8(), 0L, bnVar.j9(), bnVar.f46268y5);
    }

    public static void L0(bn bnVar) {
        if (bnVar.f46113m3.getAlpha() != 0.0f && !bnVar.actionBar.x() && !bnVar.Y9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(bnVar.f46113m3.getCustomDate() * 1000);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i7, i10, i11);
            bnVar.ha((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void M0(bn bnVar, int i7, org.telegram.messenger.gj gjVar) {
        if (i7 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f28475id = bnVar.getMessagesController().s1(bnVar.f46019f);
            bnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new ce(bnVar, 4));
            return;
        }
        org.telegram.messenger.yy g10 = org.telegram.messenger.yy.g(bnVar.getUserConfig().f(), bnVar.f46103l6, gjVar, bnVar.f46114m4, null, null, true, 0, 0);
        g10.K = bnVar.Y8();
        org.telegram.messenger.az.C(bnVar.currentAccount).r0(g10);
        if (bnVar.f46036g4 == 0) {
            bnVar.ra(false);
        }
        bnVar.D9(false);
    }

    public static void M2(long j3, bn bnVar) {
        int i7;
        boolean z10;
        org.telegram.messenger.pv pvVar;
        if (j3 != bnVar.e9()) {
            bnVar.getConnectionsManager().cancelRequestsForGuid(bnVar.classGuid);
            bnVar.getMessagesStorage().k(bnVar.classGuid);
            bnVar.classGuid = ConnectionsManager.generateClassGuid();
            bnVar.sb();
            bnVar.f46255x5 = null;
            bnVar.M7 = 0;
            bnVar.F7 = -1;
            bnVar.C7 = false;
            bnVar.D7 = true;
            bnVar.f46281z6.clear();
            if (j3 != 0) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            bnVar.f46036g4 = i7;
            bnVar.f46191s4 = j3;
            if (i7 == 3) {
                org.telegram.messenger.qv I1 = bnVar.getMessagesController().I1();
                long d = bnVar.d();
                ArrayList arrayList = I1.f26509j;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        pvVar = (org.telegram.messenger.pv) arrayList.get(i10);
                        if (pvVar.f26350a == d) {
                            break;
                        }
                        i10++;
                    } else {
                        pvVar = null;
                        break;
                    }
                }
                if (pvVar != null && !pvVar.f26356i) {
                    I1.f(d, null);
                }
            }
            bnVar.L8();
            bnVar.wd(true);
            vi viVar = bnVar.f46147p1;
            if (viVar != null) {
                viVar.n(true);
                bnVar.f46147p1.b();
            }
            org.telegram.ui.Components.g11 g11Var = bnVar.f46122n0;
            if (g11Var != null) {
                g11Var.setCurrentTopic(j3);
                org.telegram.ui.Components.g11 g11Var2 = bnVar.f46122n0;
                if (bnVar.f46072j0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g11Var2.setMenuAvailable(z10);
            }
            bnVar.zd(true);
            bnVar.Pc(true);
            bnVar.E9(true);
            bnVar.D9(true);
            rj rjVar = bnVar.f45950a0;
            if (rjVar != null) {
                rjVar.K0(false);
                bnVar.f45950a0.n2(true);
            }
            bnVar.N6(true, true);
            tm tmVar = bnVar.Vc;
            if (tmVar != null && bnVar.actionBar.f29150o0) {
                tmVar.k(null);
            }
        }
    }

    public static void N0(bn bnVar) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        org.telegram.messenger.ij ijVar;
        ArrayList arrayList;
        String a02;
        bnVar.f46268y5 = null;
        int i7 = bnVar.Sb;
        if (i7 == 2) {
            bnVar.D5 = null;
            bnVar.F5 = null;
            org.telegram.messenger.kj kjVar = bnVar.f46255x5;
            if (kjVar != null) {
                kjVar.f(null, null, bnVar.f46103l6, null);
            }
            bnVar.B8();
        } else if (i7 == 3) {
            org.telegram.messenger.kj kjVar2 = bnVar.f46255x5;
            if (kjVar2 != null && !kjVar2.c() && (ijVar = bnVar.f46255x5.f25080b) != null && (arrayList = ijVar.f24736e) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) bnVar.f46255x5.f25080b.f24736e.get(i10);
                    if (j3 == 0) {
                        j10 = org.telegram.messenger.gj.B0(gjVar3.f24213k);
                        j3 = gjVar3.Z0();
                    } else if (j3 != gjVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.J0 = true;
                if (j10 > 0) {
                    TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(j10));
                    if (c22 != null) {
                        a02 = org.telegram.messenger.hd.a0("CancelForwardPrivate", null, 2131752571, org.telegram.messenger.hd.G(bnVar.f46255x5.f25080b.f24736e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-j10));
                    if (O0 != null) {
                        a02 = org.telegram.messenger.hd.a0("CancelForwardChat", null, 2131752572, org.telegram.messenger.hd.G(bnVar.f46255x5.f25080b.f24736e.size(), "MessagesBold", new Object[0]), O0.title);
                    } else {
                        return;
                    }
                }
                t1Var.U = org.telegram.messenger.g0.W2(a02);
                t1Var.S = org.telegram.messenger.hd.G(bnVar.f46255x5.f25080b.f24736e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752570, null), new ee(bnVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131745147, null), new ee(bnVar, 7));
                bnVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, bnVar.getResourceProvider());
                }
            }
        } else if (i7 == 4) {
            bnVar.Y5 = null;
            org.telegram.messenger.kj kjVar3 = bnVar.f46255x5;
            if (kjVar3 != null) {
                int i11 = bnVar.currentAccount;
                org.telegram.messenger.gj gjVar4 = bnVar.F5;
                if (gjVar4 == bnVar.f46114m4) {
                    gjVar2 = null;
                } else {
                    gjVar2 = gjVar4;
                }
                kjVar3.e(i11, null, null, gjVar2, bnVar.D5, bnVar.H5);
            }
            rj rjVar = bnVar.f45950a0;
            rjVar.N3 = null;
            rjVar.O3 = false;
            bnVar.z8();
            bnVar.B8();
        } else {
            if (org.telegram.messenger.v3.c0(bnVar.f46005e) && !bnVar.f46254x4 && (gjVar = bnVar.F5) != null) {
                long b22 = org.telegram.messenger.gj.b2(bnVar.currentAccount, gjVar.f24213k, true, false);
                if (b22 != 0) {
                    bnVar.getMediaDataController().F(bnVar.f46103l6, b22, false);
                }
            }
            bnVar.gc(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void N2(bn bnVar, Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.q0 o92 = bnVar.o9();
        if (o92 == null) {
            return;
        }
        View view = (View) o92.getParent();
        float x10 = bnVar.actionBar.getX();
        org.telegram.ui.Components.g11 g11Var = bnVar.f46122n0;
        if (g11Var != null) {
            f10 = g11Var.getProgress() * bnVar.f46122n0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        float x11 = (o92.getX() + (view.getX() + (x10 - f10))) - bnVar.f46122n0.getX();
        float y10 = (o92.getY() + (view.getY() + bnVar.actionBar.getY())) - bnVar.f46122n0.getY();
        if (bnVar.f46286zb == null) {
            bnVar.f46286zb = new Paint(1);
        }
        bnVar.f46286zb.setColor(org.telegram.ui.ActionBar.m6.r1(bnVar.f46122n0.getProgress(), bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6)));
        canvas.drawCircle((o92.getWidth() / 2.0f) + x11, (o92.getHeight() / 2.0f) + y10, org.telegram.messenger.g0.L(23.0f), bnVar.f46286zb);
        canvas.save();
        canvas.translate(x11, y10);
        o92.draw(canvas);
        canvas.restore();
    }

    public static void O0(bn bnVar, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var = bnVar.parentLayout;
        if (r4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.g2 backgroundFragment = r4Var.getBackgroundFragment();
        if (backgroundFragment instanceof bn) {
            bn bnVar2 = (bn) backgroundFragment;
            if (bnVar2.a() == bnVar.f46103l6) {
                bnVar.finishFragment();
                bnVar2.l(i7, 0, true, 0, true, 0);
                return;
            }
        }
        bnVar.presentFragment(ta(i7, bnVar.f46103l6));
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
                i7 = 2131745676;
            } else {
                i7 = 2131745675;
            }
            ikVar2.setHint(org.telegram.messenger.hd.N0(i7, null));
            bnVar.f46111m1.addView(bnVar.Bb, c8.ma.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            bnVar.Bb.p(null, null, true);
            bnVar.Bb.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
            bnVar.Bb.setScaleY(0.4f);
            bnVar.Bb.setScaleX(0.4f);
            bnVar.Bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
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

    public static void P0(bn bnVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.u41[] u41VarArr;
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
            if ((charSequence instanceof Spannable) && (u41VarArr = (org.telegram.ui.Components.u41[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.u41.class)) != null && u41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.u41 u41Var : u41VarArr) {
                    arrayList.add(u41Var.getURL());
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
        if (bnVar.h != null && npVar.J2 == 2) {
            org.telegram.messenger.g0.g3(new ie(bnVar, npVar, charSequence, z10));
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
            bnVar.X5 = bnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.o6(14, bnVar, m6Var));
            bnVar.getConnectionsManager().bindRequestToGuid(bnVar.X5, bnVar.classGuid);
        }
    }

    public static org.telegram.ui.wq0 P1(org.telegram.ui.bn r14, org.telegram.messenger.gj r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.P1(org.telegram.ui.bn, org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    public static void Q0(bn bnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit().putLong("dialog_join_requested_time_" + bnVar.f46103l6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.v3.T(bnVar.f46005e) && !bnVar.f46005e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i7 = org.telegram.ui.Components.r70.f39104u1;
            org.telegram.ui.Components.r70.K0(context, bnVar, org.telegram.ui.Components.lc.b0(bnVar), z10);
        }
        bnVar.cc(false, true);
    }

    public static TLRPC.TL_message R7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28455id = message.f28455id;
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

    public static void S0(org.telegram.ui.bn r7, java.lang.String r8, org.telegram.messenger.gj r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.S0(org.telegram.ui.bn, java.lang.String, org.telegram.messenger.gj, boolean):void");
    }

    public static void T0(bn bnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, m6 m6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f28455id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.gj(bnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.n5.o(tL_webPageAttributeStory.peer));
            bnVar.getMessagesController().R1().f12433k.d(hVar, new u8(28, hVar, m6Var), bnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void U0(bn bnVar) {
        bnVar.W7(false);
        if (!bnVar.fragmentBeginToShow) {
            bj bjVar = bnVar.A0;
            bjVar.X1 = false;
            bjVar.Y1 = 0;
            bjVar.setEmptyView(bnVar.f46021f1);
            bj bjVar2 = bnVar.A0;
            bjVar2.X1 = true;
            bjVar2.Y1 = 1;
            return;
        }
        bnVar.A0.setEmptyView(bnVar.f46021f1);
    }

    public static void V0(bn bnVar, TLRPC.ReactionCount reactionCount) {
        bnVar.P7(true);
        org.telegram.ui.Components.em0.c(bnVar.getParentActivity(), bnVar.currentAccount, reactionCount.reaction, bnVar.Ba);
    }

    public static void W0(bn bnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(bnVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f28552id;
        long e10 = bnVar.getUserConfig().e();
        long j10 = bnVar.f46103l6;
        if (e10 == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        f10.k(org.telegram.messenger.ls.f25404w, arrayList, valueOf, bool, bool);
    }

    public static void X0(bn bnVar, org.telegram.ui.Cells.r1 r1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i7;
        org.telegram.ui.Components.a70 J = org.telegram.ui.Components.a70.J(bnVar, r1Var);
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(bnVar.getParentActivity(), bnVar.Ba);
        J.f33391p = new fe(yk0Var, 0);
        if (z10 && ((org.telegram.messenger.h0) bnVar.getMessagesController().A7.f26239p0.f14030b).f24341c) {
            J.c(2131231275, org.telegram.messenger.hd.N0(2131742751, null), new ge(bnVar, str, 5), false);
        }
        boolean z11 = true;
        J.c(2131232105, org.telegram.messenger.hd.N0(2131742906, null), new je(bnVar, yk0Var, str, 1), false);
        if (z10) {
            J.c(2131232356, org.telegram.messenger.hd.N0(2131742697, null), new ge(bnVar, str, 6), false);
            J.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i10 = bnVar.currentAccount;
                long j3 = user.f28583id;
                u8 u8Var = new u8(18, bnVar, userArr);
                TLObject g22 = org.telegram.messenger.np.u1(i10).g2(j3);
                boolean z12 = g22 instanceof TLRPC.User;
                if (!(g22 instanceof TLRPC.Chat) || !org.telegram.messenger.v3.V((TLRPC.Chat) g22)) {
                    z11 = false;
                }
                if (z12) {
                    i7 = 2131743301;
                } else if (z11) {
                    i7 = 2131743315;
                } else {
                    i7 = 2131743308;
                }
                J.n(g22, org.telegram.messenger.hd.N0(i7, null), u8Var);
            } else {
                J.p(13, -1, org.telegram.messenger.hd.N0(2131742952, null));
            }
        }
        yk0Var.e(J);
        yk0Var.f(r1Var, characterStyle, null, false);
        bnVar.showDialog(yk0Var);
    }

    public static ArrayList X7(ArrayList arrayList, boolean z10, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList.get(i7);
            String str = zyVar.f28407c;
            if (str == null) {
                if (zyVar.f28405a != null) {
                    try {
                        File q02 = org.telegram.messenger.g0.q0("", z10);
                        InputStream openInputStream = org.telegram.messenger.t0.f26931b.getContentResolver().openInputStream(zyVar.f28405a);
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
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str2, ((Integer) N0.first).intValue(), zyVar.f28417o, 0, 0);
                ffVar.n(N0);
                if (i7 == arrayList.size() - 1 && charSequence != null) {
                    ffVar.f28058a = charSequence;
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
        String H1 = org.telegram.messenger.np.u1(gjVar.K1).H1(gjVar.f24213k.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            return H1;
        }
        if (gjVar.T4() && !org.telegram.ui.Components.j21.l(gjVar)) {
            return gjVar.i2();
        }
        CharSequence charSequence = gjVar.f24271z;
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
            CharSequence charSequence3 = gjVar2.f24271z;
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

    public static void Y0(bn bnVar, Object[] objArr, org.telegram.ui.Components.kw0 kw0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(kw0Var.f30179c, bnVar.resourceProvider);
                if (z10) {
                    i7 = 2131744601;
                } else {
                    i7 = 2131744602;
                }
                org.telegram.ui.Components.gc q10 = lcVar.q(document, org.telegram.messenger.hd.a0(null, null, i7, stickerSet.title));
                q10.f35527j = 2750;
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
        long j3 = bnVar.f46103l6;
        zm zmVar = bnVar.Ba;
        int i12 = org.telegram.ui.Components.io.M;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.h6) zmVar, false);
        w2Var.Q(org.telegram.ui.ActionBar.m6.f29454h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624078, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i13, zmVar));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, zmVar);
        linearLayout.addView((View) imageView, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        boolean K3 = org.telegram.messenger.np.u1(i11).K3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.m6.f29489j5;
        org.telegram.ui.ActionBar.t6.U(textView, i14, zmVar);
        textView.setTextSize(1, 20.0f);
        if (K3) {
            i7 = 2131746842;
        } else {
            i7 = 2131746843;
        }
        textView.setText(org.telegram.messenger.hd.N0(i7, null));
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView2, i14, zmVar);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.p10.k(org.telegram.messenger.np.u1(i11).c2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        if (K3) {
            i10 = 2131746840;
        } else {
            i10 = 2131746841;
        }
        org.telegram.messenger.f3.q(null, null, i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 1, 12, 9, 12, 19));
        if (!K3) {
            ug.r0 r0Var = new ug.r0(parentActivity, zmVar, true);
            r0Var.setOnClickListener(new org.telegram.ui.Components.f3(w2Var, 1));
            r0Var.c(org.telegram.messenger.hd.N0(2131746844, null), false, false);
            linearLayout.addView(r0Var, c8.ma.t(-1, 48, 1, 0, 0, 0, 4));
        }
        w2Var.O = linearLayout;
        w2Var.show();
    }

    public static void Z0(bn bnVar) {
        if (org.telegram.messenger.g0.g(bnVar.f46171qc.X0)) {
            org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.resourceProvider));
        }
    }

    public static FrameLayout Z7(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f));
        di.xb xbVar = new di.xb(context, 13);
        int i10 = 3;
        xbVar.setMaxLines(3);
        xbVar.setGravity(3);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.E8, h6Var);
        xbVar.setTextSize(1, i7);
        xbVar.setMaxWidth(org.telegram.messenger.g0.L(170.0f));
        xbVar.setText(charSequence);
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        }
        frameLayout.addView(xbVar, c8.ma.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static SpannableStringBuilder Z8(long j3, org.telegram.messenger.gj gjVar, boolean z10) {
        TLRPC.Chat O0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long Z0 = gjVar.Z0();
            int i7 = gjVar.K1;
            if (j3 != Z0) {
                int i10 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(Z0));
                    if (c22 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) O0.title).append((CharSequence) ":\n");
                }
            }
        }
        String H1 = org.telegram.messenger.np.u1(gjVar.K1).H1(gjVar.f24213k.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            spannableStringBuilder.append((CharSequence) H1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = gjVar.f24271z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(gjVar.v);
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
        if (!bnVar.t7(bnVar.f45950a0.getSendButton())) {
            if (bnVar.getMediaController().I(bnVar.f46228v5)) {
                bnVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = bnVar.getMessagesController().l1(bnVar.f46103l6);
            if (bnVar.f46242w5 != null) {
                for (int i7 = 0; i7 < bnVar.f46242w5.d.size(); i7++) {
                    tL_messages_sendScheduledMessages.f28552id.add(Integer.valueOf(((org.telegram.messenger.gj) bnVar.f46242w5.d.get(i7)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f28552id.add(Integer.valueOf(bnVar.f46228v5.e1()));
            }
            ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new u7(6, bnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static org.telegram.messenger.gj a2(bn bnVar) {
        View view = bnVar.f46232v9;
        if (view instanceof org.telegram.ui.Cells.r1) {
            return ((org.telegram.ui.Cells.r1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) view).getMessageObject();
        }
        return null;
    }

    public static bi.q2 a5(bn bnVar, org.telegram.messenger.gj gjVar) {
        if (gjVar != null && !gjVar.N3() && gjVar.l4() && gjVar.f24213k.ttl == Integer.MAX_VALUE) {
            long V = bnVar.getMessagesController().V(gjVar.e1(), bnVar.f46103l6);
            gjVar.I0 = true;
            if (gjVar.P3() || (!gjVar.g4() && !gjVar.S4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar);
                bnVar.bd(arrayList, true);
            }
            return new bi.q2(bnVar, V, gjVar, 17);
        }
        return null;
    }

    public static void b0(bn bnVar, org.telegram.ui.Components.a70 a70Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) a70Var.A;
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(bnVar.getParentActivity(), bnVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new ji.l(bnVar, a70Var, false, 14), bnVar.getResourceProvider());
        roVar.e(bnVar.f46103l6, bnVar.d(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(roVar.f39300f);
        a70Var.f33394q0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void c0(bn bnVar, int i7) {
        if (i7 != 0) {
            org.telegram.messenger.g0.g3(new re(bnVar, i7, 7));
        } else {
            bnVar.actionBar.setSubtitle(org.telegram.messenger.hd.N0(2131747999, null));
        }
    }

    public static void c1(bn bnVar, long j3, boolean z10) {
        if (!bnVar.V4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit();
            edit.putInt("pin_" + bnVar.f46103l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
            bnVar.V4.clear();
            bnVar.X4.clear();
            bnVar.Z4 = 0;
            bnVar.f45997d5 = 0;
            bnVar.f46011e5 = 0;
            bnVar.gd(0, true);
        }
        if (org.telegram.messenger.v3.p0(bnVar.f46005e) && org.telegram.messenger.v3.A(bnVar.currentAccount, bnVar.f46005e, 24)) {
            if (j3 != 0) {
                org.telegram.messenger.ur messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27250a.c(new org.telegram.messenger.op(1, -bnVar.f46005e.f28434id, j3, messagesStorage));
                bnVar.getMessagesController().i0(j3, 0, bnVar.getMessagesController().l1(-bnVar.f46005e.f28434id));
                bnVar.getMessagesController().f25968t7.s(bnVar.f46005e.f28434id, j3);
            }
        } else {
            bnVar.getMessagesController().X(1, bnVar.f46103l6, z10);
            org.telegram.messenger.ur messagesStorage2 = bnVar.getMessagesStorage();
            long j10 = bnVar.f46103l6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.qp(messagesStorage2, j10, 2));
            org.telegram.messenger.f00 f00Var = bnVar.getMessagesController().f25968t7;
            f00Var.getClass();
            org.telegram.messenger.g0.g3(new di.vb((Object) f00Var, -bnVar.f46103l6, true, 4));
        }
        bnVar.f46012e6.put(j3, 0);
        org.telegram.ui.Components.a21 a21Var = bnVar.f46034g2;
        if (a21Var != null) {
            a21Var.setAllTopicsHidden(false);
        }
        if (j3 == bnVar.f46191s4) {
            bnVar.N7(false, null);
            bnVar.D0.O(false);
        }
    }

    public static void d0(long j3, bn bnVar) {
        if (di.y8.y(bnVar.currentAccount, false).p().amount < j3) {
            new di.fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), j3, 13, org.telegram.messenger.n5.t(bnVar.a()), new af(bnVar, 21), bnVar.a()).show();
        } else {
            new di.gb(bnVar.getParentActivity(), bnVar.resourceProvider).show();
        }
    }

    public static void d1(bn bnVar, int i7) {
        if (bnVar.fragmentView != null) {
            org.telegram.ui.Cells.z J8 = bnVar.J8(i7, false);
            if (J8 instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) J8;
                ch.q0 q0Var = r1Var.O;
                TLRPC.MessagePeerReaction K1 = r1Var.getMessageObject().K1();
                if (K1 != null && (q0Var.H || K1.big)) {
                    ch.l0.d(bnVar, null, J8, null, 0.0f, 0.0f, ch.p0.d(K1.reaction), bnVar.currentAccount, !K1.big ? 1 : 0);
                    ch.l0.f();
                }
                q0Var.H = false;
                org.telegram.messenger.gj gjVar = r1Var.Q5;
                if (gjVar != null) {
                    gjVar.h5();
                }
            } else if (J8 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) J8;
                ch.q0 q0Var2 = v0Var.F0;
                TLRPC.MessagePeerReaction K12 = v0Var.getMessageObject().K1();
                if (K12 != null && (q0Var2.H || K12.big)) {
                    ch.l0.d(bnVar, null, J8, null, 0.0f, 0.0f, ch.p0.d(K12.reaction), bnVar.currentAccount, !K12.big ? 1 : 0);
                    ch.l0.f();
                }
                q0Var2.H = false;
                org.telegram.messenger.gj gjVar2 = v0Var.Q0;
                if (gjVar2 != null) {
                    gjVar2.h5();
                }
            }
        }
    }

    public static void e0(bn bnVar) {
        if (bnVar.f46138o5) {
            bnVar.f46138o5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f22744h1 == bnVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void e1(bn bnVar, org.telegram.messenger.gj gjVar, Long l10, Runnable runnable) {
        di.y8.y(bnVar.currentAccount, false).j0(gjVar, l10.longValue(), runnable, false);
    }

    public static void e2(bn bnVar, float f10) {
        View view = bnVar.f46232v9;
        if (view instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view).setSlidingOffset(f10);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setWalletSlidingOffset(f10);
        }
    }

    public static void f0(bn bnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.np.u1(bnVar.currentAccount).f4(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (bnVar.j() != null) {
                tLObject2 = bnVar.j();
            } else {
                tLObject2 = bnVar.f46005e;
            }
            if (!org.telegram.messenger.si.v(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = bnVar.f46019f;
                if (user2 != null && user2.bot && user.f28583id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.f3.o(null, 2131753101, org.telegram.ui.Components.lc.b0(bnVar), null);
                } else if (user2 != null && user2.bot && user.f28583id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.f3.o(null, 2131753104, org.telegram.ui.Components.lc.b0(bnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.f3.o(null, 2131753100, org.telegram.ui.Components.lc.b0(bnVar), null);
                } else {
                    TLRPC.Chat chat = bnVar.f46005e;
                    if (chat != null && !org.telegram.messenger.v3.V(chat)) {
                        org.telegram.messenger.f3.o(null, 2131753102, org.telegram.ui.Components.lc.b0(bnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = bnVar.f46005e;
                    if (chat2 != null && org.telegram.messenger.v3.V(chat2)) {
                        org.telegram.messenger.f3.o(null, 2131753103, org.telegram.ui.Components.lc.b0(bnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                bnVar.za(user.f28583id, bnVar.C8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(bnVar.getParentActivity());
                v6Var.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29476ia, false));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.L5, v6Var, null);
                v6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bnVar.getParentActivity());
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.W = v6Var;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("BotRequestAttachPermission", null, 2131752984, org.telegram.messenger.p10.q(user)));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753150, null), new a1.d(bnVar, user, atomicBoolean, tL_attachMenuBot, 8));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(5, bnVar.getParentActivity(), bnVar.getResourceProvider());
                    d2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                    d2Var.setMultiline(true);
                    d2Var.e(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131747586, org.telegram.messenger.p10.q(user))), "", true, false, false);
                    if (org.telegram.messenger.hd.f24444a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.hd.f24444a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    d2Var.setPadding(L, 0, L2, 0);
                    d2Var.setOnClickListener(new oi.i1(14, d2Var, atomicBoolean));
                    t1Var.H = 6;
                    alertDialog$Builder.o(d2Var);
                }
                alertDialog$Builder.p();
            } else {
                zc1.a(bnVar.getParentActivity(), new x(bnVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void f1(bn bnVar, TLRPC.TL_game tL_game, org.telegram.messenger.gj gjVar, String str, long j3) {
        bnVar.tc(tL_game, gjVar, str, false, j3);
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void f2(bn bnVar) {
        long j3;
        yo yoVar = bnVar.ma;
        if (yoVar != null) {
            if (bnVar.f46254x4) {
                if (yoVar.I != null) {
                    if (bnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.i9.a(bnVar, bnVar.getParentLayout().getFragmentStack().indexOf(bnVar), bnVar.f46005e, bnVar.f46019f, bnVar.f46177r4, bnVar.f46103l6, bnVar.Sa, bnVar.Ra);
                    }
                    TLRPC.Chat chat = bnVar.f46005e;
                    TLRPC.TL_forumTopic tL_forumTopic = bnVar.ma.I;
                    long j10 = bnVar.f46103l6;
                    int i7 = bnVar.Ra;
                    int i10 = bnVar.Sa;
                    if (bnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.i9.a(bnVar, bnVar.getParentLayout().getFragmentStack().indexOf(bnVar), chat, null, tL_forumTopic, j10, i7, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", bnVar.ma.f54243a);
                    bundle.putInt("dialog_filter_id", bnVar.ma.f54245b);
                    bundle.putBoolean("pulled", true);
                    bn h = qg.c.h(bnVar, -bnVar.f46103l6, bnVar.ma.I, 0, bundle);
                    h.f46143oa = true;
                    f45947td = true;
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
                j3 = chat2.f28434id;
            }
            if (j3 != 0) {
                bnVar.I6();
                yo yoVar2 = bnVar.ma;
                TLRPC.Chat chat3 = yoVar2.H;
                long j12 = yoVar2.f54244a0;
                int i11 = yoVar2.f54243a;
                int i12 = yoVar2.f54245b;
                if (bnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.i9.a(bnVar, bnVar.getParentLayout().getFragmentStack().indexOf(bnVar), chat3, null, null, j12, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = bnVar.ma.H;
                if (chat4 != null) {
                    j11 = chat4.f28434id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", bnVar.ma.f54243a);
                bundle2.putInt("dialog_filter_id", bnVar.ma.f54245b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit().remove("diditem" + bnVar.ma.f54244a0).apply();
                bn bnVar2 = new bn(bundle2);
                ArrayList arrayList = bnVar.Fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = bnVar.Fb;
                    bnVar2.Fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                bnVar2.f46143oa = true;
                f45947td = true;
                bnVar.presentFragment(bnVar2, true);
            }
        }
    }

    public static void f5(bn bnVar, org.telegram.ui.Cells.r1 r1Var) {
        uh.a aVar;
        int i7;
        int i10;
        te.a aVar2 = bnVar.f46018ed;
        if (bnVar.f45950a0 != null && !aVar2.f57701f && r1Var.getMessageObject() != null) {
            pl plVar = bnVar.f46111m1;
            RectF rectF = org.telegram.messenger.g0.P;
            jh.k.c(r1Var, plVar, rectF);
            Rect rect = org.telegram.messenger.g0.Q;
            org.telegram.ui.Cells.x1 x1Var = r1Var.f31664x2;
            if (x1Var != null && (aVar = x1Var.f32324l) != null && x1Var.f32331s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((bnVar.f46111m1.getMeasuredHeight() - bnVar.A0.getPaddingBottom()) + bnVar.f45963ad) - org.telegram.messenger.g0.L(2.0f)));
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                if (bnVar.f46097kd == null) {
                    bnVar.f46097kd = new sh.b(bnVar.getParentActivity(), bnVar.resourceProvider, bnVar);
                    int indexOfChild = bnVar.f46111m1.indexOfChild(bnVar.A0);
                    if (indexOfChild >= 0) {
                        bnVar.f46111m1.addView(bnVar.f46097kd, indexOfChild + 1, c8.ma.g());
                    } else {
                        bnVar.f46111m1.addView(bnVar.f46097kd, c8.ma.g());
                    }
                }
                if (messageObject.P3()) {
                    if (r1Var.A2()) {
                        i10 = org.telegram.ui.ActionBar.m6.f29405ec;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f29496jc;
                    }
                    bnVar.T0 = i10;
                } else {
                    if (r1Var.A2()) {
                        i7 = org.telegram.ui.ActionBar.m6.fe;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f29407ee;
                    }
                    bnVar.T0 = i7;
                }
                bnVar.f46097kd.setColor(bnVar.getThemedColor(bnVar.T0));
                bnVar.f46097kd.setCellToWatch(r1Var);
                ((te.a) bnVar.f46097kd.f57466b.f12653b).a(false, false);
                bnVar.f46097kd.setAnimatedVisibility(aVar2.f57700e);
                bnVar.f46097kd.f57466b.setOnClickListener(new hi.o4(new af(bnVar, 26), 29));
                sh.b bVar = bnVar.f46097kd;
                bVar.f57472s = new af(bnVar, 27);
                bi.u uVar = bVar.f57465a;
                uVar.setOnKeyListener(new uf(bnVar, 0));
                uVar.setOnEditorActionListener(new fa(bnVar, 1));
                bnVar.f45950a0.U6 = uVar;
                org.telegram.messenger.g0.h3(new f0(bnVar, measuredHeight, uVar, 5), 100L);
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
        ArrayList arrayList = bnVar.f46281z6;
        if ((i7 - i10) - i11 <= i12 && !bnVar.Y6) {
            boolean[] zArr3 = bnVar.U6;
            if (!zArr3[0]) {
                bnVar.Y6 = true;
                arrayList.add(Integer.valueOf(bnVar.f46127n6));
                if (bnVar.J6.size() != 0) {
                    org.telegram.messenger.np messagesController = bnVar.getMessagesController();
                    j3 = 0;
                    long j10 = bnVar.f46103l6;
                    c10 = 0;
                    long j11 = bnVar.f45999d7;
                    int i13 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = bnVar.classGuid;
                    int i16 = bnVar.f46036g4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = bnVar.f46191s4;
                    int i17 = bnVar.C4;
                    int i18 = bnVar.f46127n6;
                    bnVar.f46127n6 = i18 + 1;
                    messagesController.e3(j10, j11, false, 50, i13, 0, z10, i14, i15, 0, i16, j12, i17, i18, bnVar.f46254x4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    org.telegram.messenger.np messagesController2 = bnVar.getMessagesController();
                    long j13 = bnVar.f46103l6;
                    long j14 = bnVar.f45999d7;
                    boolean z11 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = bnVar.classGuid;
                    int i21 = bnVar.f46036g4;
                    long j15 = bnVar.f46191s4;
                    int i22 = bnVar.C4;
                    int i23 = bnVar.f46127n6;
                    bnVar.f46127n6 = i23 + 1;
                    messagesController2.e3(j13, j14, false, 50, 0, 0, z11, i19, i20, 0, i21, j15, i22, i23, bnVar.f46254x4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (bnVar.f45999d7 != 0 && !zArr3[1]) {
                    bnVar.Y6 = true;
                    arrayList.add(Integer.valueOf(bnVar.f46127n6));
                    org.telegram.messenger.np messagesController3 = bnVar.getMessagesController();
                    long j16 = bnVar.f45999d7;
                    int i24 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = bnVar.classGuid;
                    int i27 = bnVar.f46036g4;
                    long j17 = bnVar.f46191s4;
                    int i28 = bnVar.C4;
                    int i29 = bnVar.f46127n6;
                    bnVar.f46127n6 = i29 + 1;
                    messagesController3.e3(j16, 0L, false, 50, i24, 0, z12, i25, i26, 0, i27, j17, i28, i29, bnVar.f46254x4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i11 > 0 && !bnVar.f45958a8 && i10 <= 10) {
            if (bnVar.f45999d7 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(bnVar.f46127n6));
                org.telegram.messenger.np messagesController4 = bnVar.getMessagesController();
                long j18 = bnVar.f45999d7;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = bnVar.classGuid;
                int i33 = bnVar.f46036g4;
                long j19 = bnVar.f46191s4;
                int i34 = bnVar.C4;
                int i35 = bnVar.f46127n6;
                bnVar.f46127n6 = i35 + 1;
                messagesController4.e3(j18, 0L, false, 50, i30, 0, true, i31, i32, 1, i33, j19, i34, i35, bnVar.f46254x4);
                bnVar.f45958a8 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(bnVar.f46127n6));
                org.telegram.messenger.np messagesController5 = bnVar.getMessagesController();
                long j20 = bnVar.f46103l6;
                long j21 = bnVar.f45999d7;
                int i36 = iArr2[c10];
                int i37 = iArr[c10];
                int i38 = bnVar.classGuid;
                int i39 = bnVar.f46036g4;
                long j22 = bnVar.f46191s4;
                int i40 = bnVar.C4;
                int i41 = bnVar.f46127n6;
                bnVar.f46127n6 = i41 + 1;
                messagesController5.e3(j20, j21, false, 50, i36, 0, true, i37, i38, 1, i39, j22, i40, i41, bnVar.f46254x4);
                bnVar.f45958a8 = true;
            }
        }
    }

    public static void g1(org.telegram.ui.bn r12, org.telegram.ui.tj r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.g1(org.telegram.ui.bn, org.telegram.ui.tj, boolean[]):void");
    }

    public static void h0(org.telegram.ui.bn r19, final org.telegram.ui.uy0[] r20, final org.telegram.ui.Components.a70 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.h0(org.telegram.ui.bn, org.telegram.ui.uy0[], org.telegram.ui.Components.a70):void");
    }

    public static void h1(bn bnVar) {
        if (bnVar.f46036g4 == 0 && bnVar.getMessagesController().Q6 > bnVar.getConnectionsManager().getCurrentTime() && !b.a(bnVar.currentAccount, bnVar.f46019f)) {
            b.c(bnVar.currentAccount, bnVar.getParentActivity(), bnVar.getResourceProvider());
        }
    }

    public static void i0(bn bnVar, int i7, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        if (bnVar.Pb != i7) {
            return;
        }
        if (bool.booleanValue()) {
            bnVar.Y5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                bnVar.Y5 = null;
                org.telegram.messenger.kj kjVar = bnVar.f46255x5;
                if (kjVar != null) {
                    int i10 = bnVar.currentAccount;
                    CharSequence fieldText = bnVar.f45950a0.getFieldText();
                    org.telegram.messenger.gj gjVar3 = bnVar.F5;
                    if (gjVar3 == bnVar.f46114m4) {
                        gjVar2 = null;
                    } else {
                        gjVar2 = gjVar3;
                    }
                    kjVar.e(i10, null, fieldText, gjVar2, bnVar.D5, bnVar.H5);
                }
                bnVar.B8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                bnVar.f45956a6 = str;
            }
            if (bnVar.h != null && z10) {
                webPage.url = str;
            }
            org.telegram.messenger.kj kjVar2 = bnVar.f46255x5;
            if (kjVar2 != null) {
                int i11 = bnVar.currentAccount;
                CharSequence fieldText2 = bnVar.f45950a0.getFieldText();
                org.telegram.messenger.gj gjVar4 = bnVar.F5;
                if (gjVar4 == bnVar.f46114m4) {
                    gjVar = null;
                } else {
                    gjVar = gjVar4;
                }
                kjVar2.e(i11, null, fieldText2, gjVar, bnVar.D5, bnVar.H5);
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
                while (i10 < e10.f58275b) {
                    RectF rectF = (RectF) e10.f58274a.get(i10);
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
            pl plVar = bnVar.f46111m1;
            gVar.e(plVar.f50905q0, plVar.getWidth(), bnVar.f46111m1.getHeight());
        }
    }

    public static void j0(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.si.d0(bnVar.currentAccount).H0(false, true, null);
            bnVar.za(user.f28583id, bnVar.C8, false);
        }
    }

    public static void j1(bn bnVar) {
        bnVar.ya = null;
        bnVar.A0.setOnInterceptTouchListener(null);
        bnVar.Pb(bnVar.f46111m1, true);
        org.telegram.messenger.f4.f(bnVar.currentAccount).f23853a.clear();
    }

    public static void k0(bn bnVar, boolean[] zArr, Context context) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2 = bnVar.F5;
        if (gjVar2 == null || !org.telegram.messenger.gj.c3(gjVar2.f24213k)) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i7 = bnVar.Sb;
            if (i7 == 5) {
                int i10 = bnVar.currentAccount;
                long j3 = bnVar.f46103l6;
                org.telegram.messenger.lj ljVar = bnVar.f46268y5;
                if (ljVar == null) {
                    ljVar = org.telegram.messenger.lj.a();
                }
                new di.r0(context, i10, j3, ljVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
            } else if (i7 == 1 && (gjVar = bnVar.H5) != null) {
                if (gjVar.p5() && !z10) {
                    org.telegram.messenger.lj ljVar2 = bnVar.f46268y5;
                    if (ljVar2 == null) {
                        ljVar2 = org.telegram.messenger.lj.a();
                    }
                    bnVar.Ac(ljVar2);
                } else if (bnVar.H5.t() && bnVar.G5 == 0) {
                    if (bnVar.Y1 == null) {
                        bnVar.U7();
                    }
                    bnVar.Y1.x1(-1, bnVar.H5);
                    bnVar.Aa();
                } else {
                    bnVar.l(bnVar.H5.e1(), 0, true, 0, true, 0);
                }
            } else if (bnVar.f46255x5 != null) {
                if (i7 == 2) {
                    if (!org.telegram.messenger.n5.C(bnVar.f46103l6) && !bnVar.f46255x5.f25097u && bnVar.f46036g4 != 5) {
                        int i11 = org.telegram.messenger.cz.f23390a;
                        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                        org.telegram.messenger.cz.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        bnVar.Fa(0);
                        return;
                    }
                    org.telegram.messenger.gj gjVar3 = bnVar.F5;
                    if (gjVar3 != null) {
                        bnVar.l(gjVar3.e1(), 0, true, 0, true, 0);
                    }
                } else if (i7 == 3) {
                    int i12 = org.telegram.messenger.cz.f23390a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.np.g1().edit();
                    org.telegram.messenger.cz.P = true;
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
        org.telegram.ui.Components.n30.h.a();
        bnVar.showDialog(new bi.n3(bnVar.getParentActivity(), bnVar.currentAccount, bnVar.a(), null, null));
    }

    public static void k2(bn bnVar, View view, boolean z10, float f10, float f11) {
        org.telegram.messenger.gj gjVar;
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            gjVar = r1Var.getMessageObject();
            r1Var.f31449h1 = f10;
            r1Var.f31462i1 = f11;
            org.telegram.ui.Components.x90 x90Var = r1Var.Ta;
            float f12 = r1Var.f31462i1;
            x90Var.h = r1Var.getTranslationX() + f10;
            x90Var.f42020i = f12;
            x90Var.f42023l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            gjVar = ((org.telegram.ui.Cells.v0) view).getMessageObject();
        } else {
            gjVar = null;
        }
        int a92 = bnVar.a9(gjVar);
        if ((gjVar == null || ((i10 = gjVar.D) != 30 && i10 != 18 && i10 != 25)) && a92 >= 2 && a92 != 20 && a92 != 21) {
            if (gjVar == null || ((i7 = gjVar.D) != 27 && i7 != 30)) {
                if (gjVar == null || !gjVar.X4()) {
                    if (gjVar == null || (!gjVar.r4() && !org.telegram.messenger.gj.c3(gjVar.f24213k))) {
                        bnVar.K6(gjVar, z10, true);
                        bnVar.Lc();
                        bnVar.Gd(false);
                    }
                }
            }
        }
    }

    public static void l0(bn bnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        ug.h1 h1Var = new ug.h1(bnVar, bnVar.currentAccount, user, null, null, bnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            h1Var.f58740z2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(bnVar.getParentActivity());
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(160.0f), 4, q9Var, false);
        q9Var.setImageDrawable(n5Var);
        q9Var.addOnAttachStateChangeListener(new e5(n5Var, 1));
        n5Var.j(j3, false);
        h1Var.A2 = true;
        h1Var.f58738x2 = q9Var;
        bnVar.showDialog(h1Var);
    }

    public static void l1(bn bnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        bn bnVar2;
        int i7;
        int i10;
        TLRPC.TL_forumTopic f10;
        jh.a aVar = bnVar.f46222uc;
        if (num.intValue() != bnVar.d()) {
            bnVar.Uc = false;
            te teVar = bnVar.f46185rc;
            if (teVar != null) {
                org.telegram.messenger.g0.r(teVar);
                bnVar.f46185rc.run();
                bnVar.f46185rc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.a21 a21Var = bnVar.f46034g2;
            long intValue = num.intValue();
            ArrayList l10 = org.telegram.messenger.np.u1(a21Var.f33287e).f25968t7.l(-a21Var.f33289f);
            if (l10 != null) {
                int size = l10.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = l10.get(i11);
                    i11++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f28486id == intValue) {
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
            if (message == null && tL_forumTopic != null && (f10 = bnVar.getMessagesController().f25968t7.f(-bnVar.a(), tL_forumTopic.f28486id)) != null) {
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
                bnVar.f46255x5 = null;
                bnVar.M7 = 0;
                bnVar.C7 = false;
                bnVar.D7 = true;
                bnVar.Y7 = true;
                bnVar.Z7 = 0;
                bnVar.f45973b8 = null;
                bnVar.f46281z6.clear();
                bnVar.f45978c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.gj(bnVar.getCurrentAccount(), message, false, false));
                    bnVar2 = bnVar;
                    bnVar2.Vb(arrayList, bnVar.f46005e, tL_forumTopic2.f28486id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    bnVar2 = bnVar;
                    bnVar2.f46177r4 = null;
                    bnVar2.f46150p4 = null;
                    bnVar2.f46114m4 = null;
                    bnVar2.F5 = null;
                    bnVar2.A4 = 0;
                    bnVar2.B4 = 0;
                    bnVar2.C4 = 0;
                    bnVar2.f46191s4 = 0L;
                    bnVar2.f46202t4 = 0;
                    bnVar2.f46214u4 = null;
                    bnVar2.f46254x4 = false;
                    bnVar2.f46227v4 = false;
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
                bnVar2.f46147p1.n(true);
                if (tL_forumTopic2 != null) {
                    bnVar2.Cd();
                } else {
                    bnVar2.f46147p1.b();
                }
                bnVar2.f46034g2.setCurrentTopic(bnVar2.d());
                bnVar2.zd(true);
                bnVar2.Pc(true);
                bnVar2.getMessagesController().V4(-bnVar2.a(), bnVar2.d());
                bnVar2.hb();
                bnVar2.E9(true);
                bnVar2.D9(true);
                bnVar2.N6(true, true);
                if (bnVar2.f45950a0 != null) {
                    if (!org.telegram.messenger.p10.v(bnVar2.f46019f)) {
                        bnVar2.f45950a0.K0(false);
                    }
                    bnVar2.f45950a0.n2(true);
                }
                if (tL_forumTopic2 != null) {
                    bnVar2.getMessagesController().f25968t7.k(bnVar2.f46103l6, tL_forumTopic2.f28486id);
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
                if (tmVar != null && bnVar2.actionBar.f29150o0) {
                    tmVar.k(null);
                }
                if (org.telegram.messenger.p10.v(bnVar2.f46019f)) {
                    bnVar2.getMediaDataController().L0(org.telegram.messenger.tr.a(bnVar2.f46103l6, num.intValue()), true);
                }
            }
        }
    }

    public static void l2(bn bnVar, int i7) {
        int i10;
        boolean z10;
        ArrayList arrayList = bnVar.M6;
        SparseArray[] sparseArrayArr = bnVar.f46139o6;
        if (!bnVar.mb && (i10 = i7 - bnVar.D0.K) >= 0 && i10 < arrayList.size()) {
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
            org.telegram.ui.Components.ek0 ek0Var = bnVar.A0;
            ?? obj = new Object();
            obj.d = bnVar;
            obj.f20053b = z10;
            obj.f20054c = sparseArray;
            if (!ek0Var.f34852c2) {
                ek0Var.f34868l2 = new int[2];
                new HashSet();
                ek0Var.n1(ek0Var, true);
                ek0Var.f34859g2 = obj;
                ek0Var.f34852c2 = true;
                ek0Var.f34857f2 = i7;
                ek0Var.f34855e2 = i7;
            }
        }
    }

    public static void m0(bn bnVar) {
        org.telegram.ui.Cells.r1 r1Var;
        al alVar;
        int i7;
        if (!bnVar.f46235vc && bnVar.U3 && bnVar.A0.H && bnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = bnVar.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = bnVar.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        r1Var = (org.telegram.ui.Cells.r1) childAt;
                        if (r1Var.getMessageObject() != null && r1Var.getMessageObject().f24213k != null && r1Var.getMessageObject().f24213k.video_processing_pending) {
                            if (r1Var.getCurrentPosition() != null) {
                                if (r1Var.getMessageObject() != null && (r1Var.getCurrentPosition().f28101l & 8) != 0) {
                                    int i10 = r1Var.getCurrentPosition().f28101l;
                                    if (r1Var.getMessageObject().P3()) {
                                        i7 = 1;
                                    } else {
                                        i7 = 2;
                                    }
                                    if ((i10 & i7) == 0) {
                                        continue;
                                    }
                                }
                            }
                            r1Var.getLocationInWindow(iArr);
                            float timeY = r1Var.getTimeY() + iArr[1];
                            if (timeY >= org.telegram.messenger.g0.L(240.0f) && timeY <= (org.telegram.messenger.g0.f24046q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f24041n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    r1Var = null;
                    break;
                }
            }
            if (r1Var != null) {
                bnVar.f46235vc = true;
                al alVar2 = new al(bnVar, bnVar.getParentActivity());
                alVar2.r(true);
                alVar2.L = Layout.Alignment.ALIGN_CENTER;
                alVar2.d = 3500L;
                alVar2.U = true;
                alVar2.f14972e = true;
                alVar2.h = org.telegram.messenger.g0.L(150.0f);
                alVar2.s(8.0f);
                bnVar.Q1 = alVar2;
                alVar2.v(org.telegram.messenger.hd.N0(2131743353, null));
                bnVar.Q1.l(bnVar.L);
                bnVar.f46111m1.addView(bnVar.Q1, c8.ma.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                r1Var.getLocationInWindow(iArr);
                bnVar.R1 = r1Var.getTimeY() + iArr[1];
                bnVar.Q1.setTranslationY(((-alVar.getTop()) - org.telegram.messenger.g0.L(120.0f)) + bnVar.R1);
                bnVar.Q1.p(0.0f, (r1Var.A9 / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + r1Var.C9);
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
        String N0 = org.telegram.messenger.hd.N0(2131746095, null);
        if (org.telegram.messenger.v3.p0(bnVar.f46005e)) {
            i7 = 2131746099;
        } else {
            i7 = 2131746100;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i7, org.telegram.messenger.n5.t(j3)));
        if (l10.longValue() > 0) {
            str = org.telegram.messenger.hd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.c5.f0(parentActivity, N0, W2, str, org.telegram.messenger.hd.N0(2131751805, null), new rg(bnVar, j3, j10, l10, 0), bnVar.resourceProvider, true);
    }

    public static boolean m2(bn bnVar, View view, RectF rectF) {
        RectF rectF2 = bnVar.f46083jc;
        if (rectF != null && bnVar.A0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void n0(bn bnVar) {
        if (bnVar.f45967b2) {
            bnVar.getMessagesController().d(0, 0, bnVar.f46103l6);
            bnVar.h8();
            bnVar.N3.j(23, bnVar.f46103l6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit();
            edit.putBoolean("dialog_bar_archived" + bnVar.f46103l6, false);
            edit.putBoolean("dialog_bar_block" + bnVar.f46103l6, false);
            edit.putBoolean("dialog_bar_report" + bnVar.f46103l6, false);
            edit.commit();
            bnVar.zd(false);
            org.telegram.messenger.ys notificationsController = bnVar.getNotificationsController();
            long j3 = bnVar.f46103l6;
            long d = bnVar.d();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().d().edit();
            String v = org.telegram.messenger.ys.v(j3, d, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + v);
            remove.remove("custom_" + v);
            notificationsController.getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().R.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j3, d, true);
        } else if (bnVar.f45952a2.getTag() != null && ((Integer) bnVar.f45952a2.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = bnVar.f46181r8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i7 = 0; i7 < bnVar.f46181r8.participants.participants.size(); i7++) {
                    hVar.k(null, bnVar.f46181r8.participants.participants.get(i7).user_id);
                }
                long j10 = bnVar.f46181r8.f28435id;
                org.telegram.ui.Components.l60 l60Var = new org.telegram.ui.Components.l60(bnVar.getParentActivity(), bnVar.currentAccount, hVar, bnVar.f46181r8.f28435id, bnVar, bnVar.Ba);
                l60Var.f37124g2 = new ee(bnVar, 24);
                l60Var.show();
            }
        } else if (bnVar.f45952a2.getTag() != null) {
            bnVar.Yb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", bnVar.f46019f.f28583id);
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
                tL_messages_getHistory.peer = bnVar.getMessagesController().l1(bnVar.f46103l6);
                tL_messages_getHistory.offset_date = bnVar.O7 + 86400;
                tL_messages_getHistory.limit = 1;
                bnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new u7(3, bnVar, tLObject));
                return;
            }
            bnVar.actionBar.setSubtitle(org.telegram.messenger.hd.N0(2131747999, null));
        }
    }

    public static void o1(bn bnVar, cg.a aVar, Runnable runnable) {
        if (!bnVar.isFinished) {
            if (cg.a.n(di.y8.x(bnVar.currentAccount, aVar.f5303a).p()).f5304b < aVar.f5304b) {
                cg.b bVar = aVar.f5303a;
                if (bVar == cg.b.f5305a) {
                    new di.fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), aVar.a(), 13, qg.c.i(bnVar.currentAccount, bnVar.a()), null, bnVar.a()).show();
                    return;
                } else if (bVar == cg.b.f5306b) {
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
        bnVar.f46185rc = null;
    }

    public static void p1(bn bnVar, org.telegram.ui.Components.a70 a70Var) {
        if (bnVar.f46171qc == null) {
            return;
        }
        a70Var.v();
        bnVar.ma(bnVar.f46171qc, false, true);
        vf.c.s(bnVar.getParentActivity(), Uri.parse(bnVar.f46171qc.T0), true, false, false, null, null, false, org.telegram.messenger.np.u1(bnVar.currentAccount).f25856g6, false, false);
    }

    public static void p4(bn bnVar, org.telegram.ui.Cells.g0 g0Var) {
        String charSequence;
        if (org.telegram.messenger.np.u1(bnVar.currentAccount).f25986v7.s()) {
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
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.u1(bnVar.currentAccount).q1(user.f28583id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(bnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new xg(bnVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void q2(bn bnVar, org.telegram.ui.Cells.r1 r1Var, int i7, int i10, int i11) {
        if (!bnVar.C2.W || bnVar.Mb != r1Var || bnVar.Nb != i11) {
            org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
            if (messageObject != null && (org.telegram.messenger.gj.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.gj.m1(messageObject);
                if (org.telegram.messenger.gj.W4(tL_messageMediaPoll) && !org.telegram.messenger.gj.U4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        bnVar.C2.v(org.telegram.messenger.hd.N0(2131746965, null));
                        bnVar.Mb = r1Var;
                        bnVar.Nb = i11;
                        bnVar.C2.y(bnVar.v9(r1Var, i10), bnVar.w9(r1Var, i11), true);
                    }
                }
            }
            if (i7 == -1) {
                bnVar.C2.v(org.telegram.messenger.hd.N0(2131746964, null));
                bnVar.Mb = r1Var;
                bnVar.Nb = i11;
                bnVar.C2.y(bnVar.v9(r1Var, i10), bnVar.w9(r1Var, i11), true);
            }
        }
    }

    public static void q4(bn bnVar) {
        if (bnVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = bnVar.f46036g4;
        if (i7 == 3) {
            tL_message.message = org.telegram.messenger.hd.N0(2131745698, null);
        } else if (i7 == 9) {
            tL_message.message = org.telegram.messenger.hd.N0(2131742627, null);
        } else {
            tL_message.message = org.telegram.messenger.hd.N0(2131752659, null);
        }
        tL_message.f28455id = 0;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(bnVar.currentAccount, tL_message, false, false);
        bnVar.X3 = gjVar;
        gjVar.D = 10;
        gjVar.U = 1;
    }

    public static void r0(bn bnVar) {
        TLRPC.ChatFull chatFull = bnVar.f46181r8;
        if (chatFull != null && !bnVar.I5) {
            TLRPC.Chat chat = bnVar.f46005e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && bnVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7;
                int i7 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z10 = org.telegram.messenger.s2.f26730a;
                int currentTime = bnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i7) >= 604800 && bnVar.visibleDialog == null && bnVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = bnVar.getParentActivity();
                    ee eeVar = new ee(bnVar, 15);
                    ee eeVar2 = new ee(bnVar, 16);
                    Pattern pattern = org.telegram.ui.Components.c5.f34013a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.g0.y2(null, 2131624038);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bg.q0(10));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.nz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(127.17949f), y22)));
                    frameLayout.addView(view, c8.ma.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.W = frameLayout;
                    t1Var.P0 = 0.3974359f;
                    t1Var.S = org.telegram.messenger.hd.N0(2131749388, null);
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131749389, null));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131749390, null), eeVar);
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), eeVar2);
                    bnVar.showDialog(t1Var);
                }
            }
        }
    }

    public static void r1(bn bnVar) {
        if (org.telegram.messenger.g0.g(bnVar.f46171qc.W0)) {
            org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.resourceProvider));
        }
    }

    public static void r4(bn bnVar) {
        if (bnVar.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.N0(2131742628, null);
        tL_message.f28455id = 0;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(bnVar.currentAccount, tL_message, false, false);
        bnVar.Y3 = gjVar;
        gjVar.D = 10;
        gjVar.U = 1;
    }

    public static void s0(bn bnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, ef efVar) {
        String str4;
        org.telegram.ui.Components.t21 t21Var;
        if (bnVar.f46228v5 != null && i7 < arrayList.size() && bnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = bnVar.getParentActivity();
            int i10 = iArr[0];
            vf vfVar = new vf(bnVar, 13);
            String[] strArr = org.telegram.ui.Components.b31.S1;
            if (parentActivity == null) {
                t21Var = null;
            } else {
                org.telegram.ui.Components.t21 t21Var2 = new org.telegram.ui.Components.t21(parentActivity, str, str4, inputPeer, i10, richMessage, vfVar);
                t21Var2.T0(z10);
                t21Var2.N1 = bnVar;
                t21Var2.O1 = efVar;
                if (bnVar.getParentActivity() != null) {
                    bnVar.showDialog(t21Var2);
                }
                t21Var = t21Var2;
            }
            t21Var.f30204p0 = false;
            bnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + bnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit();
                edit.putInt("dialog_show_translate_count" + bnVar.a(), i11 - 1).apply();
                bnVar.zd(true);
            }
        }
    }

    public static void s1(bn bnVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ch chVar;
        String str;
        SparseArray[] sparseArrayArr = bnVar.f46139o6;
        if (bnVar.getParentActivity() != null && bnVar.f46095ka == 0.0f) {
            if (bnVar.f46036g4 == 3) {
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
                byte[] bArr = bnVar.f46089k4;
                String str2 = bnVar.f46101l4;
                me meVar = new me(bnVar, 2);
                int i10 = qy0.f51394w1;
                int currentAccount = bnVar.getCurrentAccount();
                Activity parentActivity = bnVar.getParentActivity();
                long a10 = bnVar.a();
                if (parentActivity != null) {
                    qy0.K0(currentAccount, parentActivity, a10, false, false, arrayList, org.telegram.ui.Components.lc.b0(bnVar), bnVar.getResourceProvider(), bArr, str2, meVar);
                }
            } else if (bnVar.f46036g4 == 2) {
                bnVar.finishFragment();
                ll llVar = bnVar.f46130n9;
                if (bnVar.E0.getTag() == null) {
                    z12 = true;
                }
                llVar.V(true, z12);
            } else {
                TLRPC.User user = bnVar.f46019f;
                if (user != null && user.f28583id == 489000) {
                    bnVar.Ic(true);
                } else if (user != null && bnVar.f46121n) {
                    if (user.bot) {
                        String str3 = bnVar.f46245w8;
                        bnVar.f46245w8 = null;
                        bnVar.getMessagesController().r5(new ge(bnVar, str3, 3), bnVar.f46019f.f28583id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                    String N0 = org.telegram.messenger.hd.N0(2131754062, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.U = N0;
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new ee(bnVar, 8));
                    t1Var.S = org.telegram.messenger.hd.N0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    bnVar.showDialog(t1Var);
                } else if (org.telegram.messenger.p10.A(user)) {
                    bnVar.Ic(true);
                } else {
                    TLRPC.User user2 = bnVar.f46019f;
                    if (user2 != null && user2.bot && (str = bnVar.f46245w8) != null) {
                        if (str.length() != 0) {
                            bnVar.getMessagesController().K4(bnVar.f46245w8, bnVar.f46019f);
                        } else {
                            bnVar.getSendMessagesHelper().r0(org.telegram.messenger.yy.b("/start", bnVar.f46103l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        bnVar.f46245w8 = null;
                        bnVar.Pc(false);
                        return;
                    }
                    if (org.telegram.messenger.v3.T(bnVar.f46005e)) {
                        TLRPC.Chat chat = bnVar.f46005e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.v3.r0(chat)) {
                                if (bnVar.f46005e.join_request) {
                                    bnVar.cc(true, true);
                                    org.telegram.messenger.np.u1(bnVar.currentAccount).m(bnVar.f46005e.f28434id, org.telegram.messenger.k10.i(bnVar.currentAccount).f(), 0, null, null, true, new zd(bnVar, 19), new oi.f0(11, bnVar, context), null);
                                    return;
                                }
                                zd zdVar = bnVar.f45998d6;
                                if (zdVar != null) {
                                    org.telegram.messenger.g0.r(zdVar);
                                    bnVar.f45998d6 = null;
                                }
                                bnVar.cc(true, true);
                                bnVar.getMessagesController().n(bnVar.f46005e.f28434id, bnVar.getUserConfig().f(), null, bnVar, null);
                                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.L4, new Object[0]);
                                ai.m0 m0Var = bnVar.Z1;
                                if (m0Var != null && (chVar = bnVar.f45966b1) != null && chVar.e(m0Var) && bnVar.f45981c2.getVisibility() != 8 && bnVar.f45981c2.getTag(2131296587) != null) {
                                    org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit().putInt("dialog_bar_vis3" + bnVar.f46103l6, 3).commit();
                                    bnVar.getNotificationCenter().k(org.telegram.messenger.ls.Q0, Long.valueOf(bnVar.f46103l6));
                                    return;
                                }
                                return;
                            }
                            bnVar.Ic(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = bnVar.f46181r8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = bnVar.f46005e;
                    TLRPC.User user3 = bnVar.f46019f;
                    if (bnVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.c5.r(bnVar, false, chat2, user3, z11, true, false, z10, new ee(bnVar, 9));
                }
            }
        }
    }

    public static void s2(bn bnVar) {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj primaryMessageObject;
        TLRPC.Message message;
        if (bnVar.O1 != null) {
            return;
        }
        org.telegram.ui.Cells.r1 r1Var2 = null;
        for (int childCount = bnVar.A0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = bnVar.A0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.r1) && (primaryMessageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f24213k) != null && message.via_business_bot_id != 0) {
                r1Var2 = r1Var;
            }
        }
        bnVar.bc(r1Var2);
    }

    public static void t0(bn bnVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (bnVar.getParentActivity() != null) {
            TLRPC.Chat chat = bnVar.f46005e;
            if (chat != null) {
                if (org.telegram.messenger.v3.j(chat) && !bnVar.f46005e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (bnVar.h == null && (userFull = bnVar.f46194s8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String N0 = org.telegram.messenger.hd.N0(2131743597, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131743598, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131743599, null), new ee(bnVar, 21));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                bnVar.showDialog(t1Var);
            } else if (!bnVar.V4.isEmpty()) {
                org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit().putInt("pin_" + bnVar.f46103l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
                bnVar.gd(0, true);
            }
        }
    }

    public static void t1(bn bnVar, String str) {
        if (org.telegram.messenger.np.u1(bnVar.currentAccount).R2(true)) {
            vf.c.n(bnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.c5.l0(bnVar.getParentActivity(), bnVar.Ba, str, true, new qf(bnVar, str, 1));
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

    public static org.telegram.ui.Components.po u0(bn bnVar, Context context) {
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(context, bnVar.currentAccount, bnVar.f46072j0.getPopupLayout().getSwipeBack(), false, new yi(bnVar), bnVar.getResourceProvider());
        bnVar.f46251x1 = roVar;
        roVar.e(bnVar.f46103l6, bnVar.d(), null);
        return bnVar.f46251x1.f39300f;
    }

    public static void u1(bn bnVar, long j3, long j10, Long l10, Boolean bool) {
        boolean z10 = false;
        di.y8 y10 = di.y8.y(bnVar.currentAccount, false);
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
        if (org.telegram.messenger.np.u1(bnVar.currentAccount).u2(bnVar.f46103l6, bnVar.d(), null)) {
            bnVar.yd(true);
            org.telegram.messenger.g0.h3(new zd(bnVar, 8), 150L);
            bnVar.f46072j0.V(null, null);
            if (bnVar.getParentActivity() != null) {
                org.telegram.ui.Components.lc.z(bnVar, 4, 0, bnVar.Ba).j();
                return;
            }
            return;
        }
        View view = bnVar.f46199t1.f29838j;
        if (view instanceof org.telegram.ui.ActionBar.y0) {
            ((org.telegram.ui.ActionBar.y0) view).b();
        }
    }

    public static void v1(bn bnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = bnVar.X1.getAdapter().f17558x0;
        int i7 = bnVar.currentAccount;
        TLRPC.User user2 = bnVar.f46019f;
        if (user2 != null) {
            j3 = user2.f28583id;
        } else {
            j3 = bnVar.f46005e.f28434id;
        }
        ki.e4 b10 = ki.e4.b(i7, j3, user.f28583id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, bnVar.j9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
            return;
        }
        String H1 = org.telegram.messenger.np.u1(bnVar.currentAccount).H1(user.restriction_reason);
        if (!TextUtils.isEmpty(H1)) {
            org.telegram.messenger.np.u1(bnVar.currentAccount);
            org.telegram.messenger.np.d5(H1, bnVar);
            return;
        }
        ki.s2 s2Var = new ki.s2(bnVar.getParentActivity(), bnVar.getResourceProvider());
        s2Var.B(false);
        s2Var.C0 = true;
        s2Var.m0 = bnVar.getParentActivity();
        s2Var.x(bnVar, b10);
        s2Var.show();
    }

    public static void w0(bn bnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        int i7;
        int i10;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            i7 = 0;
        } else {
            i7 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        }
        if (i7 > 0 && !zArr[0] && g1Var == bnVar.f46041g9 && g1Var.isShowing() && view2.isLaidOut()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = (view2.getHeight() + iArr[1]) - (view.getHeight() - i7);
            int i11 = org.telegram.messenger.g0.f24040m;
            int i12 = bnVar.f46080j9;
            if (height > 0) {
                i10 = org.telegram.messenger.g0.L(8.0f) + height;
            } else {
                i10 = 0;
            }
            int max = Math.max(i11, i12 - i10);
            if (max != bnVar.f46080j9) {
                zArr[0] = true;
                int i13 = bnVar.f46067i9;
                bnVar.f46080j9 = max;
                g1Var.update(i13, max, -1, -1);
            }
        }
    }

    public static void w1(bn bnVar, int i7) {
        if (bnVar.f46036g4 == 7) {
            Object E = bnVar.f45969b4.E(i7);
            if (i7 == 0) {
                bnVar.f45969b4.getClass();
            }
            if (E instanceof org.telegram.messenger.gj) {
                bnVar.Ia((org.telegram.messenger.gj) E);
            }
        } else if (bnVar.F3 != null) {
            if (i7 >= 0 && i7 < bnVar.getMediaDataController().Z0.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) bnVar.getMediaDataController().Z0.get(i7);
                bnVar.G3 = false;
                bnVar.Rb(false, true, false);
                org.telegram.messenger.si mediaDataController = bnVar.getMediaDataController();
                if (i7 >= 0) {
                    if (i7 < mediaDataController.Z0.size()) {
                        mediaDataController.f26826f1 = i7;
                    }
                } else {
                    mediaDataController.getClass();
                }
                bnVar.nd(bnVar.getMediaDataController().e0(), bnVar.getMediaDataController().f26826f1, bnVar.getMediaDataController().l0());
                org.telegram.messenger.g0.g3(new he(bnVar, gjVar, 2));
            }
        } else {
            org.telegram.messenger.si mediaDataController2 = bnVar.getMediaDataController();
            int i10 = bnVar.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                mediaDataController2.f26826f1 = i7;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.ls.H0, Integer.valueOf(i10), Integer.valueOf(gjVar2.e1()), Integer.valueOf(mediaDataController2.e0()), Long.valueOf(org.telegram.messenger.gj.B0(gjVar2.f24213k)), Integer.valueOf(mediaDataController2.f26826f1), Integer.valueOf(mediaDataController2.l0()), Boolean.TRUE);
            }
            bnVar.sc(false);
        }
    }

    public static void x0(bn bnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.si.d0(bnVar.currentAccount).H0(false, true, null);
            bnVar.za(user.f28583id, bnVar.C8, false);
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
            bnVar.f46255x5 = null;
            bnVar.M7 = 0;
            bnVar.C7 = false;
            bnVar.D7 = true;
            bnVar.Y7 = true;
            bnVar.Z7 = 0;
            bnVar.f45973b8 = null;
            bnVar.f46281z6.clear();
            bnVar.f46191s4 = l10.longValue();
            TLRPC.TL_forumTopic f10 = bnVar.getMessagesController().f25968t7.f(-bnVar.a(), l10.longValue());
            if (l10.longValue() != 0 && f10 != null) {
                int i11 = f10.read_inbox_max_id;
                bnVar.A4 = i11;
                bnVar.B4 = f10.read_outbox_max_id;
                bnVar.C4 = Math.max(1, i11);
                bnVar.getMessagesController().f25968t7.k(bnVar.f46103l6, org.telegram.messenger.n5.o(f10.from_id));
            } else {
                bnVar.f46177r4 = null;
                bnVar.f46150p4 = null;
                bnVar.f46114m4 = null;
                bnVar.F5 = null;
                bnVar.A4 = 0;
                bnVar.B4 = 0;
                bnVar.C4 = 0;
                bnVar.f46191s4 = 0L;
                bnVar.f46202t4 = 0;
                bnVar.f46214u4 = null;
                bnVar.f46254x4 = false;
                bnVar.f46227v4 = false;
            }
            bnVar.L8();
            bnVar.wd(true);
            bnVar.f46147p1.n(true);
            bnVar.f46147p1.b();
            bnVar.f46034g2.setCurrentTopic(l10.longValue());
            bnVar.zd(true);
            bnVar.Pc(true);
            bnVar.getMessagesController().V4(-bnVar.a(), bnVar.d());
            bnVar.F9(true);
            bnVar.D9(true);
            rj rjVar = bnVar.f45950a0;
            if (rjVar != null) {
                rjVar.K0(false);
                bnVar.f45950a0.n2(true);
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
            if (tmVar != null && bnVar.actionBar.f29150o0) {
                tmVar.k(null);
            }
        }
    }

    public static void y0(long j3, bn bnVar) {
        if (di.y8.y(bnVar.currentAccount, false).p().amount < j3) {
            new di.fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), j3, 13, org.telegram.messenger.n5.t(bnVar.a()), new af(bnVar, 21), bnVar.a()).show();
        } else {
            new di.gb(bnVar.getParentActivity(), bnVar.resourceProvider).show();
        }
    }

    public static void y1(bn bnVar, long j3, boolean z10, boolean z11) {
        if (!org.telegram.messenger.g0.E1(bnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.py0.c(bnVar.getParentActivity(), bnVar.currentAccount, -j3, bnVar.getUserConfig().f(), null, z10, z11, bnVar.getResourceProvider());
    }

    public static void z0(bn bnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ef efVar) {
        String str3;
        if (bnVar.f46228v5 != null && i7 < arrayList.size() && bnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.gj gjVar = bnVar.f46228v5;
            if (gjVar != null) {
                TLRPC.Message message = gjVar.f24213k;
            }
            org.telegram.ui.Components.b31.V0(bnVar.getParentActivity(), bnVar, inputPeer, iArr[0], bnVar.f46228v5.M2, strArr[0], str3, charSequence, z10, efVar, new af(bnVar, 15)).f30204p0 = false;
            bnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + bnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(bnVar.currentAccount).f25857g7.edit();
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
        if (this.f46045gd.f57700e >= 1.0f && ((i1Var = this.F1) == null || i1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bi.m3 m3Var = this.f46111m1.M;
        if (!z10) {
            i7 = 4;
        }
        m3Var.setVisibility(i7);
    }

    public final org.telegram.ui.Components.g11 A8() {
        long d;
        boolean z10;
        if (this.f46122n0 == null && getParentActivity() != null && this.f46111m1 != null) {
            org.telegram.ui.Components.g11 g11Var = new org.telegram.ui.Components.g11(getParentActivity(), this.currentAccount, a(), this.Ba, new ek(this));
            this.f46122n0 = g11Var;
            this.f46111m1.addView(g11Var, c8.ma.c(-1.0f, -1));
        }
        org.telegram.ui.Components.g11 g11Var2 = this.f46122n0;
        if (g11Var2 != null) {
            if (Z9()) {
                d = e9();
            } else {
                d = d();
            }
            g11Var2.setCurrentTopic(d);
            org.telegram.ui.Components.g11 g11Var3 = this.f46122n0;
            if (this.f46072j0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g11Var3.setMenuAvailable(z10);
        }
        return this.f46122n0;
    }

    public final boolean A9() {
        ql qlVar = this.f46219u9;
        if (qlVar != null && qlVar.x()) {
            return true;
        }
        return false;
    }

    public final void Aa() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            rj rjVar = this.f45950a0;
            if (rjVar == null || TextUtils.isEmpty(rjVar.getSlowModeTimer())) {
                rj rjVar2 = this.f45950a0;
                if (rjVar2 != null && rjVar2.f32650j7.f57701f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                U7();
                fi.n2 n2Var = this.Y1;
                if (!z10 && this.f46036g4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                n2Var.P3 = z11;
                n2Var.f40378e2.i0();
                TLRPC.Chat chat = this.f46005e;
                if ((chat == null || this.f46268y5 == null) && !z10 && this.f46036g4 != 9) {
                    if (chat != null && !org.telegram.messenger.v3.N(chat) && this.f46005e.slowmode_enabled) {
                        this.Y1.z1(10, true);
                    } else {
                        this.Y1.z1(-1, true);
                    }
                } else {
                    this.Y1.z1(1, true);
                }
                fi.n2 n2Var2 = this.Y1;
                n2Var2.Q2 = true;
                n2Var2.f40437v3.setVisibility(0);
                n2Var2.O2 = 0;
                n2Var2.A1 = false;
                n2Var2.B1 = false;
                n2Var2.d2 = true;
                n2Var2.E1 = null;
                org.telegram.ui.ActionBar.q0 q0Var = n2Var2.f40391i3;
                if (q0Var != null) {
                    n2Var2.f40388h3.setTranslationY(0.0f);
                    q0Var.setVisibility(8);
                }
                this.Y1.f1();
                this.Y1.b1().setText(this.f45950a0.getFieldText());
                fi.n2 n2Var3 = this.Y1;
                n2Var3.f40427t1 = this.Ba;
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
        this.f45970b5 = 0;
        this.Ub = 0;
        this.f45984c5 = false;
        this.f46142o9.m(0);
        if (this.W6[0] && this.Z7 == 0 && this.M7 == 0) {
            this.f46264y1.d(false);
            if (this.C0.I0() == 0) {
                this.D9 = false;
                dd();
                lb();
                Gd(false);
                return;
            }
            this.D0.T();
            nm nmVar = this.f46082jb;
            nmVar.f50215a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.M6;
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
            xj xjVar = this.f46142o9;
            nmVar.f50216b = i10;
            nmVar.d = 0;
            boolean z11 = !z10;
            nmVar.f50217c = z11;
            xjVar.k(i10, 0, z11, true);
            this.D9 = false;
            dd();
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.Tb;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        fd(false);
        if (zdVar != null) {
            zdVar.run();
        } else {
            pb();
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), this.Ba);
            this.Tb = t1Var2;
            t1Var2.setOnCancelListener(this.Ja);
            this.Tb.r(1000L);
        }
        this.f46168q9 = this.f46127n6;
        this.s9 = false;
        this.f46182r9 = 0;
        this.f46206t9 = false;
        ArrayList arrayList2 = this.f46281z6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f46127n6));
        org.telegram.messenger.g0.h3(new af(this, 14), 0L);
    }

    public final void Ac(org.telegram.messenger.lj ljVar) {
        if (this.H5 == null) {
            return;
        }
        new di.r0(getParentActivity(), this.currentAccount, this.f46103l6, ljVar, this, getResourceProvider(), 0, new me(this, 0)).show();
    }

    public final void Ad() {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.o0 o0Var = this.f46237w0;
        if (o0Var != null) {
            TLRPC.Chat chat = this.f46005e;
            if (chat != null && org.telegram.messenger.v3.i(this.currentAccount, chat, this.f46177r4) && (tL_forumTopic = this.f46177r4) != null && !tL_forumTopic.closed) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            o0Var.e(i7);
        }
    }

    public final void B7() {
        float f10;
        org.telegram.ui.Components.ef efVar;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(15.0f) + t9(org.telegram.ui.Components.w11.f41626c) + this.f46236w.d();
        rj rjVar = this.f45950a0;
        if (rjVar != null && (efVar = rjVar.f32674n0) != null) {
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
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.lj ljVar = this.f46268y5;
        if (ljVar != null) {
            kc(ljVar);
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
        org.telegram.messenger.gj gjVar = this.F5;
        if (gjVar != null && gjVar != this.f46114m4) {
            ic(gjVar);
            return;
        }
        org.telegram.messenger.kj kjVar = this.f46255x5;
        if (kjVar != null && (ijVar = kjVar.f25080b) != null) {
            hc(ijVar.f24736e);
            return;
        }
        org.telegram.messenger.gj gjVar2 = this.H5;
        if (gjVar2 != null) {
            fc(true, null, gjVar2, null, null, true, 0, null, false, 0L);
        } else {
            lc(false, null, true);
        }
    }

    public final void B9() {
        org.telegram.ui.Components.ot editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.x()) {
                this.f46084jd.h(5, false, true);
                this.actionBar.w();
            } else {
                return;
            }
        }
        this.f46192s6 = 0;
        this.f46229v6 = 0;
        this.t6 = 0;
        this.f46256x6 = 0;
        this.f46269y6 = 0;
        this.f46243w6 = 0;
        rj rjVar = this.f45950a0;
        if (rjVar != null && (editField = rjVar.getEditField()) != null) {
            if (this.f45950a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        ql qlVar = this.f46219u9;
        if (qlVar != null) {
            qlVar.f(true);
            SparseArray sparseArray = this.f46219u9.f30968p0;
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
        rj rjVar2 = this.f45950a0;
        if (rjVar2 != null) {
            rjVar2.f32580b0 = false;
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
        this.Y1.f40378e2.i0();
        this.Y1.z1(1, false);
        fi.n2 n2Var = this.Y1;
        n2Var.S3 = true;
        n2Var.X0(null);
        this.Y1.f1();
        fi.n2 n2Var2 = this.Y1;
        n2Var2.f40427t1 = this.Ba;
        if (this.visibleDialog != null) {
            n2Var2.show();
        } else {
            showDialog(n2Var2);
        }
    }

    public final void Bb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Bc(org.telegram.messenger.gj gjVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().G2(org.telegram.messenger.gj.B0(gjVar.f24213k))) {
            TLRPC.Message message = gjVar.f24213k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = gjVar.B2;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = gjVar.v;
                    if (gjVar.B2.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = gjVar.f24271z;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && org.telegram.messenger.cz.J <= 2 && !this.F9 && this.G9 <= this.f45950a0.getTop() - org.telegram.messenger.g0.L(60.0f)) {
                    this.F9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    int i7 = org.telegram.messenger.cz.J + 1;
                    org.telegram.messenger.cz.J = i7;
                    edit.putInt("textSelectionHintShows", i7);
                    edit.apply();
                    if (this.E9 == null) {
                        uk ukVar = new uk(getParentActivity(), this.Ba, this);
                        this.E9 = ukVar;
                        this.f46111m1.addView(ukVar, c8.ma.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.E9.c();
                }
            }
        }
    }

    public final void Bd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        vi viVar = this.f46147p1;
        if (viVar != null && (tL_forumTopic = this.f46177r4) != null) {
            viVar.setTitle(tL_forumTopic.title);
        }
        Cd();
    }

    public final void C7() {
        float d;
        if (this.A0 != null) {
            if (this.mb && this.Aa == null) {
                d = org.telegram.messenger.g0.f24041n;
            } else {
                d = this.f46236w.d() + t9(org.telegram.ui.Components.w11.f41626c) + org.telegram.messenger.g0.L(16.0f) + this.Ya + this.f45963ad;
            }
            int i7 = (int) this.P9;
            org.telegram.ui.Components.a21 a21Var = this.f46034g2;
            if (a21Var != null) {
                a21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f46275z0;
            boolean z10 = this.A0.W1;
            RecyclerView recyclerView = gVar.f17812a;
            int i10 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i7 || paddingBottom != i10) {
                int i11 = paddingTop - i7;
                if (!z10 && i11 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i11 >= 0 || canScrollVertically) && (i11 <= 0 || canScrollVertically2)) {
                        org.telegram.messenger.g0.J(recyclerView, new ai.c1(gVar, i11, 14));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i7, recyclerView.getPaddingRight(), i10);
            }
            jh.e eVar = this.f45983c4;
            if (eVar != null) {
                RectF rectF = eVar.f17791b;
                rectF.set(t9(org.telegram.ui.Components.w11.f41625b), i7 - this.I, 0.0f, d - this.Ya);
                eVar.f17792c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void C9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(this).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
            getMessagesController().p0(true);
            ib(this.f46228v5);
            kb(this.f46228v5);
            return;
        }
        showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) this, 3, true));
    }

    public final void Ca(final CharacterStyle characterStyle, final String str, boolean z10, final org.telegram.ui.Cells.r1 r1Var, final org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        if (z10) {
            int i7 = -1;
            if (str.startsWith("@")) {
                if (r1Var != null) {
                    r1Var.h3(-1);
                }
                String substring = str.substring(1);
                gi na2 = na(r1Var, characterStyle);
                TLObject h22 = getMessagesController().h2(substring);
                ne neVar = new ne(this, na2, r1Var, substring, characterStyle);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                na2.f59417b = new re(this, getConnectionsManager().sendRequest(checkusername, new di.m7(this, h22, neVar, substring, na2, 4)), 5);
                na2.d();
                return;
            } else if (characterStyle == null) {
                org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.h6) this.Ba, false);
                w2Var.O();
                if (str.startsWith("video?")) {
                    i7 = Utilities.z(str).intValue();
                }
                final int i10 = i7;
                if (i10 >= 0) {
                    w2Var.P = org.telegram.messenger.g0.g0(i10, false, false);
                    w2Var.Q = false;
                } else {
                    w2Var.P = vf.c.d(str, true);
                    w2Var.Q = false;
                    w2Var.R = true;
                }
                CharSequence[] charSequenceArr = (W9() || !(gjVar == null || (message = gjVar.f24213k) == null || !message.noforwards)) ? new CharSequence[]{org.telegram.messenger.hd.N0(2131747623, null)} : new CharSequence[]{org.telegram.messenger.hd.N0(2131747623, null), org.telegram.messenger.hd.N0(2131751755, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        bn.F0(bn.this, str, characterStyle, gjVar, r1Var, i10, i11);
                    }
                };
                w2Var.M = charSequenceArr;
                w2Var.L = onClickListener;
                w2Var.I0 = new q5(r1Var, 3);
                showDialog(w2Var);
                return;
            } else {
                if (r1Var != null) {
                    r1Var.h3(-1);
                }
                k8(r1Var, gjVar, characterStyle, str);
                return;
            }
        }
        ma(gjVar, false, false);
        String c10 = vf.c.c(str);
        if (c10 != null) {
            String lowerCase = c10.toLowerCase();
            if (!org.telegram.messenger.v3.O(lowerCase, this.f46005e) && !org.telegram.messenger.p10.s(lowerCase, this.f46019f)) {
                if (str.startsWith("@")) {
                    getMessagesController().F3(lowerCase, this, 0, na(r1Var, characterStyle));
                    return;
                } else {
                    Za(0, str, characterStyle, r1Var, false);
                    return;
                }
            }
            vi viVar = this.f46147p1;
            if (viVar != null) {
                viVar.e(false, false);
            } else {
                Xb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Za(0, str, characterStyle, r1Var, false);
        } else {
            int i11 = this.f46036g4;
            if (i11 != 1 && i11 != 2 && i11 != 7) {
                if (str.contains("@")) {
                    presentFragment(new org.telegram.ui.Components.f30(str, this.resourceProvider));
                    return;
                } else {
                    Ga(str, false);
                    return;
                }
            }
            this.f46130n9.x0(str);
            if (this.f46036g4 != 7) {
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
            if ((!z10 || this.H2 != null) && this.f46036g4 == 0 && (rjVar = this.f45950a0) != null && rjVar.getAudioVideoButtonContainer() != null && this.f45950a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.H2 == null) {
                    int indexOfChild = this.f46111m1.indexOfChild(this.U);
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
                if (this.f45950a0.U2) {
                    hi.l3 l3Var = this.H2;
                    if (z11) {
                        i7 = 2131749097;
                    } else {
                        i7 = 2131749099;
                    }
                    l3Var.v(org.telegram.messenger.hd.N0(i7, null));
                } else {
                    this.H2.v(org.telegram.messenger.hd.N0(2131749098, null));
                }
                this.H2.z(this.f45950a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Cd() {
        vi viVar;
        vi viVar2;
        if (org.telegram.messenger.p10.v(this.f46019f) && (viVar2 = this.f46147p1) != null) {
            viVar2.getAvatarImageView().setVisibility(0);
            this.f46147p1.b();
        } else if (this.f46177r4 != null && (viVar = this.f46147p1) != null) {
            viVar.getAvatarImageView().setVisibility(0);
            qg.c.q(this.f46147p1.getAvatarImageView(), this.f46177r4, true, true, this.Ba);
        }
    }

    @Override
    public final void D(float f10, int i7) {
        if (i7 == 2 && f10 == 0.0f) {
            sh.b bVar = this.f46097kd;
            if (bVar != null) {
                this.f46111m1.removeView(bVar);
                this.f46097kd = null;
            }
            rj rjVar = this.f45950a0;
            if (rjVar != null) {
                rjVar.i1();
            }
        }
    }

    public final void D7() {
        FrameLayout frameLayout = this.f46021f1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + this.f46236w.c() + org.telegram.messenger.g0.L(9.0f)) * (-0.5f));
        }
    }

    public final void D8(CharSequence charSequence, ArrayList arrayList) {
        if (this.H5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.gj gjVar = this.H5;
                gjVar.f24269y1 = charSequence;
                gjVar.f24273z1 = arrayList;
            } else if (this.H5.F3()) {
                org.telegram.messenger.gj gjVar2 = this.H5;
                gjVar2.f24269y1 = "";
                gjVar2.f24273z1 = new ArrayList();
            } else {
                rj rjVar = this.f45950a0;
                if (rjVar != null) {
                    this.H5.f24269y1 = rjVar.getFieldText();
                    org.telegram.messenger.gj gjVar3 = this.H5;
                    if (gjVar3.f24269y1 == null && !TextUtils.isEmpty(gjVar3.f24213k.message)) {
                        this.H5.f24269y1 = "";
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
        final TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.np.n1(O0);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("getDiscussionMessage chat = " + O0.f28434id + " msg_id = " + i12);
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
        if (gjVar2 != null) {
            i12 = gjVar2.e1();
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
                final org.telegram.messenger.gj gjVar3 = gjVar2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = O0;
                final org.telegram.messenger.gj gjVar4 = gjVar;
                org.telegram.messenger.g0.g3(new u8(23, bnVar, new Runnable(i14, i15, j11, tLObject, i16, gjVar3, tL_messages_getDiscussionMessage2, chat, gjVar4) {
                    public final int f48751b;
                    public final int f48752c;
                    public final TLObject d;
                    public final int f48753e;
                    public final org.telegram.messenger.gj f48754f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f48755n;
                    public final org.telegram.messenger.gj f48756r;

                    {
                        this.d = tLObject;
                        this.f48753e = i16;
                        this.f48754f = gjVar3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f48755n = chat;
                        this.f48756r = gjVar4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final bn bnVar2 = bn.this;
                        if (this.f48751b != bnVar2.Lc) {
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
                        final int i19 = this.f48752c;
                        final int i20 = this.f48753e;
                        final org.telegram.messenger.gj gjVar5 = this.f48754f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.f48755n;
                        final org.telegram.messenger.gj gjVar6 = this.f48756r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = bnVar2.getMessagesController().o1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f28455id;
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
                                    org.telegram.messenger.g0.g3(new yg(bn.this, i21, tLObject3, tL_error2, i19, gjVar5, tL_messages_getDiscussionMessage3, chat2, i20, gjVar6, 0));
                                }
                            });
                            return;
                        }
                        bnVar2.ab(bnVar2.Sc, bnVar2.Tc, i19, gjVar5, tL_messages_getDiscussionMessage3, chat2, i20, gjVar6);
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
        if (this.f46085k0 != null && this.X1 != null) {
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
                    String N0 = org.telegram.messenger.hd.N0(2131745570, null);
                    SpannableString spannableString = new SpannableString(a8.p0.E(N0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.B8, getResourceProvider()), N0.length() + 1, spannableString.length(), 33);
                    this.f46085k0.setSearchFieldCaption(spannableString);
                    this.X1.getAdapter().U(null, 0, null, false, true);
                    this.f46085k0.setSearchFieldHint(null);
                    this.f46085k0.o();
                    org.telegram.messenger.si mediaDataController = getMediaDataController();
                    this.I3 = "";
                    mediaDataController.c2("", this.f46103l6, this.f45999d7, this.classGuid, 0, this.f46191s4, false, this.D3, this.E3, true, this.F3);
                }
            }
        }
    }

    public final boolean Dc(org.telegram.messenger.gj gjVar) {
        if (this.f46036g4 == 0 && gjVar != null && gjVar.b5()) {
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
        if (ga() && !this.f46173r0 && ((kVar = this.actionBar) == null || !kVar.x())) {
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
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f46072j0;
        if (q0Var2 != null && (q0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f46072j0.getLayoutParams();
            if (!z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            }
            if (layoutParams.width != i10) {
                layoutParams.width = i10;
                this.f46072j0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f46072j0;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            q0Var3.setAlpha(f10);
            this.f46072j0.setClickable(!z10);
        }
        ud();
    }

    @Override
    public final org.telegram.ui.Components.du0 E() {
        return this.f46111m1;
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
        l3Var.f14972e = true;
        l3Var.k(z10);
        l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        l3Var.f14993v0 = org.telegram.messenger.g0.L(4.0f);
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        l3Var.l(this.L);
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, 150, 55);
        if (i10 >= 0) {
            this.f46111m1.addView(l3Var, i10, e10);
            return l3Var;
        }
        this.f46111m1.addView(l3Var, e10);
        return l3Var;
    }

    public final void E7() {
        int i7;
        float f10 = this.f46071id.f57700e;
        org.telegram.ui.Components.h30 h30Var = this.I1;
        int i10 = 8;
        if (h30Var != null) {
            h30Var.setAlpha(f10);
            org.telegram.ui.Components.h30 h30Var2 = this.I1;
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            h30Var2.setVisibility(i7);
        }
        di.b1 b1Var = this.f45954a4;
        if (b1Var != null) {
            float f11 = 1.0f - f10;
            b1Var.setAlpha(f11);
            di.b1 b1Var2 = this.f45954a4;
            if (f11 > 0.0f) {
                i10 = 0;
            }
            b1Var2.setVisibility(i10);
        }
    }

    public final void E8() {
        CharSequence charSequence;
        rj rjVar = this.f45950a0;
        if (rjVar != null) {
            charSequence = rjVar.getFieldText();
        } else {
            charSequence = null;
        }
        D8(charSequence, null);
    }

    public final void E9(boolean z10) {
        if (this.f46113m3.getTag() != null && !this.f46190s3) {
            if (!this.f46266y3 || this.f46213u3) {
                this.f46113m3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f46226v3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f46226v3.playTogether(ObjectAnimator.ofFloat(this.f46113m3, View.ALPHA, 0.0f));
                    this.f46226v3.addListener(new ei(this, 5));
                    this.f46226v3.setStartDelay(this.f46149p3);
                    this.f46226v3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f46226v3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f46226v3 = null;
                    }
                    this.f46113m3.setAlpha(0.0f);
                }
                this.f46149p3 = 500;
            }
        }
    }

    public final void Ea(boolean z10) {
        String N0;
        if (!W9() && !z9()) {
            int i7 = 0;
            boolean z11 = false;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f46139o6;
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
            ch.s sVar = this.f46233va;
            if (sVar != null && sVar.d()) {
                this.f46233va.setHiddenByScroll(true);
            }
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putInt("messagesCount", this.f46216u6);
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
                N0 = org.telegram.messenger.hd.N0(2131750517, null);
            } else if (org.telegram.messenger.v3.T(this.f46005e) && !this.f46005e.megagroup) {
                N0 = org.telegram.messenger.hd.N0(2131750519, null);
            } else {
                N0 = org.telegram.messenger.hd.N0(2131750518, null);
            }
        } else {
            N0 = org.telegram.messenger.hd.N0(2131750520, null);
        }
        if (z10) {
            if (this.f46277z2 == null) {
                int indexOfChild = this.f46111m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    this.f46277z2 = E6(310.0f, 1, indexOfChild + 1, false);
                } else {
                    return;
                }
            }
            this.f46277z2.v(N0);
            this.f46277z2.z(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.A2 == null) {
            int indexOfChild2 = this.f46111m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            this.A2 = E6(310.0f, 3, indexOfChild2 + 1, false);
        }
        this.A2.v(N0);
        this.A2.z(this.f46007e1.getForwardButton(), true);
    }

    public final void Eb(View view, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.xi0 xi0Var, View view2, float f10, float f11, ch.p0 p0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        ch.p0 p0Var2;
        String str;
        TLRPC.Document e10;
        org.telegram.messenger.gj b10;
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
        if (!c() && gjVar != null) {
            if (getMessagesController().A2()) {
                b.b(this.currentAccount);
                return;
            }
            int i10 = 2;
            if (p0Var != null && p0Var.f5503a) {
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
                    TLRPC.Message message2 = gjVar.f24213k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j3 = -di.r8.b(gjVar).f9699a;
                    TLRPC.ChatFull P0 = getMessagesController().P0(j3);
                    if (P0 != null && !P0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
                        org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(this);
                        if (O0 != null) {
                            str2 = O0.title;
                        }
                        b02.Q(2131624227, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744789, str2))).k(true);
                        return;
                    }
                    di.w8 w8Var = di.y8.y(this.currentAccount, false).B;
                    if (w8Var != null) {
                        w8Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i11 = this.currentAccount;
                    long j10 = this.f46103l6;
                    if (P0 != null && !P0.paid_reactions_available) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    di.mc mcVar = new di.mc(parentActivity, i11, j10, this, gjVar, arrayList, z15, false, 0L, this.Ba);
                    gjVar.e1();
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
                long j11 = -di.r8.b(gjVar).f9699a;
                TLRPC.ChatFull P02 = getMessagesController().P0(j11);
                if (P02 != null && !P02.paid_reactions_available) {
                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(j11));
                    org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(this);
                    if (O02 != null) {
                        str2 = O02.title;
                    }
                    b03.Q(2131624227, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744789, str2))).k(true);
                    return;
                }
                di.w8 b04 = di.y8.y(this.currentAccount, false).b0(gjVar, this, 1L, true, true, null);
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
                    b04.f10008o = k6Var;
                    k6Var.J = false;
                    k6Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    k6Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f10;
                    float f13 = (iArr[1] - iArr2[1]) + f11;
                    if (zVar instanceof org.telegram.ui.Cells.r1) {
                        i7 = ((org.telegram.ui.Cells.r1) zVar).W;
                    } else {
                        i7 = 0;
                    }
                    k6Var.d(f12, f13 + i7, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = gjVar.f24213k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new ug.y0((org.telegram.ui.ActionBar.g2) this, 24, true).show();
            } else {
                if (gjVar.w2() && p0Var != null) {
                    for (int i12 = 0; i12 < gjVar.f24213k.reactions.results.size(); i12++) {
                        TLRPC.ReactionCount reactionCount = gjVar.f24213k.reactions.results.get(i12);
                        if (p0Var.f(reactionCount.reaction)) {
                            z14 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z14 = false;
                if (!z14 && (chat = this.f46005e) != null && !org.telegram.messenger.v3.V(chat) && !org.telegram.messenger.v3.w(26, this.f46005e)) {
                    org.telegram.messenger.f3.n(null, 2131745395, org.telegram.ui.Components.lc.b0(this), 2131624007, 36);
                    return;
                }
                ch.l0.b(false);
                int size = gjVar.y0().size();
                boolean H5 = gjVar.H5(p0Var, z11);
                int e12 = gjVar.e1();
                long c12 = gjVar.c1();
                a0.h hVar = this.P6;
                if (hVar.f(c12) != null && (b10 = ((org.telegram.messenger.bj) hVar.f(gjVar.c1())).b(9)) != null) {
                    e12 = b10.e1();
                }
                int i13 = e12;
                if (H5) {
                    org.telegram.ui.Cells.z J8 = J8(i13, true);
                    if (!org.telegram.messenger.cz.f23452w1 && J8 != null && p0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.cz.C(true);
                        long j12 = p0Var.f5508g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(this.currentAccount).f26847r.get(p0Var.f5507f);
                            if (tL_availableReaction != null) {
                                e10 = tL_availableReaction.center_icon;
                            }
                        } else {
                            e10 = org.telegram.ui.Components.p5.e(this.currentAccount, j12);
                        }
                        if (e10 != null) {
                            org.telegram.ui.Components.gc q10 = org.telegram.ui.Components.lc.b0(this).q(e10, org.telegram.messenger.hd.N0(2131752206, null));
                            q10.f35527j = 5000;
                            q10.j();
                        }
                    }
                    if (!z10) {
                        int i14 = this.currentAccount;
                        if (xi0Var != null) {
                            if (z11) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 1;
                        }
                        ch.l0.d(this, xi0Var, J8, view2, f10, f11, p0Var, i14, i10);
                    }
                }
                if (H5 && p0Var != null && (str = p0Var.f5507f) != null) {
                    org.telegram.messenger.g0.i2(org.telegram.messenger.hd.a0(null, null, 2131754724, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(gjVar.y0());
                org.telegram.messenger.az sendMessagesHelper = getSendMessagesHelper();
                if (H5) {
                    p0Var2 = p0Var;
                } else {
                    p0Var2 = null;
                }
                di diVar = new di(this, z13, z10, i13, H5, xi0Var, f10, f11, p0Var, gjVar);
                this.Jc = diVar;
                sendMessagesHelper.s0(gjVar, arrayList2, p0Var2, z11, z12, this, diVar);
                if (z10 || z13) {
                    Yc(gjVar, true);
                    this.Jc.run();
                }
                if (!z13) {
                    org.telegram.messenger.g0.h3(this.Jc, 50L);
                }
            }
        }
    }

    public final void Ec(org.telegram.messenger.gj gjVar, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (gjVar != null && getParentActivity() != null) {
            ch.s sVar = this.f46233va;
            if (sVar != null && sVar.d()) {
                this.f46233va.setHiddenByScroll(true);
            }
            if (this.f46085k0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f29150o0) {
                    kVar.n(true);
                    this.f45950a0.G1();
                }
            }
            TLRPC.Message message = gjVar.f24213k;
            if (message != null && (richMessage = message.rich_message) != null) {
                oi.b2 b2Var = new oi.b2(richMessage);
                b2Var.K = this;
                b2Var.f22010r = gjVar;
                presentFragment(b2Var);
                return;
            }
            this.X1.getAdapter().f17537g0 = false;
            this.f45950a0.setVisibility(0);
            fc(true, null, gjVar, null, null, true, 0, null, false, 0L);
            Pc(false);
            if (!z10) {
                c7();
            }
            if (z10) {
                this.f46268y5 = org.telegram.messenger.lj.b(gjVar.f24213k.suggested_post);
            }
            this.f45950a0.x1(false, false, true);
            gd(0, true);
            Gd(false);
            if (!z10 && !gjVar.f24242r1 && !org.telegram.messenger.gj.b4(gjVar.f24213k) && this.f46036g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().l1(this.f46103l6);
                tL_messages_getMessageEditData.f28528id = gjVar.e1();
                this.G5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new ce(this, 3));
                return;
            }
            rj rjVar = this.f45950a0;
            org.telegram.ui.Components.re reVar = rjVar.f32735v2;
            if (reVar != null) {
                reVar.setEnabled(true);
                rjVar.f32735v2.g(false);
            }
        }
    }

    public final void Ed() {
        int i7;
        org.telegram.ui.ActionBar.o0 o0Var = this.f46134o0;
        if (o0Var == null) {
            return;
        }
        if (getMessagesController().f25986v7.z(a()) && getMessagesController().f25986v7.t(a())) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        o0Var.e(i7);
    }

    @Override
    public final List F() {
        String N0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.v3.T(this.f46005e)) {
            arrayList.add(new pg.a(org.telegram.messenger.hd.N0(2131751600, null)));
            int i7 = this.f45949a;
            if (i7 != 1) {
                if (i7 != 2) {
                    N0 = org.telegram.messenger.hd.N0(2131751597, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131751598, null);
                }
            } else {
                N0 = org.telegram.messenger.hd.N0(2131751599, null);
            }
            arrayList.add(new pg.a(org.telegram.messenger.hd.a0(null, null, 2131751596, N0), new vf(this, 16)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.N0(2131751595, null), new vf(this, 17)));
        }
        if (this.f46019f == null) {
            arrayList.add(new pg.a(org.telegram.messenger.hd.N0(2131751605, null)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.N0(2131751604, null), 0.0f, 255.0f, new q0("", 1)));
            arrayList.add(new pg.a(org.telegram.messenger.hd.N0(2131751603, null), 1.0f, 10.0f, new org.telegram.ui.Cells.g2(this)));
        }
        return arrayList;
    }

    public final void F6(org.telegram.messenger.gj gjVar, Integer num) {
        org.telegram.messenger.gj gjVar2 = gjVar.C;
        if (gjVar2 != null) {
            int e12 = gjVar2.e1();
            SparseArray sparseArray = this.I6;
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
        if (this.f46111m1 == null) {
            return;
        }
        this.f45963ad = Q6(false);
        this.bd = Q6(true);
        this.U.setInputBubbleHeight(this.f45963ad);
        ed();
        Oc();
        B7();
        y7();
        D7();
        C7();
    }

    public final void F8(boolean z10) {
        TLRPC.Chat chat = this.f46005e;
        if (chat != null && this.f46181r8 != null && !org.telegram.messenger.v3.r0(chat) && !this.f46005e.creator) {
            TLRPC.ChatFull chatFull = this.f46181r8;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f46172r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f46172r = chatParticipant.inviter_id;
                    return;
                }
                long e10 = getUserConfig().e();
                int size = this.f46181r8.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f46181r8.participants.participants.get(i7);
                    if (chatParticipant2.user_id == e10) {
                        this.f46172r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f46172r == 0) {
                getMessagesController().G(this.f46005e.f28434id, false);
            }
        }
    }

    public final void F9(boolean z10) {
        if (this.f46124n3.getTag() != null && !this.f46201t3) {
            if (!this.f46278z3 || this.f46213u3) {
                this.f46124n3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46253x3, 0.0f);
                    this.f46240w3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f46240w3.addUpdateListener(new be(this, 1));
                    this.f46240w3.addListener(new ei(this, 7));
                    this.f46240w3.setStartDelay(this.f46149p3);
                    this.f46240w3.start();
                } else {
                    ValueAnimator valueAnimator = this.f46240w3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f46240w3 = null;
                    }
                    this.f46253x3 = 0.0f;
                    Tc();
                }
                this.f46149p3 = 500;
            }
        }
    }

    public final void Fa(int i7) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.kj kjVar = this.f46255x5;
        if (kjVar != null && this.f45990cb == null) {
            TLRPC.Peer peer = null;
            if (kjVar.f25081c != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.Y5;
                CharSequence fieldText = this.f45950a0.getFieldText();
                org.telegram.messenger.gj gjVar2 = this.F5;
                if (gjVar2 == this.f46114m4) {
                    gjVar = null;
                } else {
                    gjVar = gjVar2;
                }
                kjVar.e(i10, webPage, fieldText, gjVar, this.D5, this.H5);
            }
            if (!this.f46255x5.c()) {
                this.Eb = this.f45950a0.f32691p3;
                Context context = this.f46111m1.getContext();
                dh.c cVar = this.Q8;
                org.telegram.messenger.kj kjVar2 = this.f46255x5;
                TLRPC.User user = this.f46019f;
                TLRPC.Chat chat = this.f46005e;
                int i11 = this.currentAccount;
                zm zmVar = this.Ba;
                rm rmVar = this.D5;
                if (rmVar != null && rmVar.f51623f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mk mkVar = new mk(this, context, this, cVar, kjVar2, user, chat, i11, zmVar, i7, z10);
                this.f45990cb = mkVar;
                this.f46255x5.f25099x = mkVar;
                TLRPC.ChatFull chatFull = this.f46181r8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ea) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ea.peers.get(0).peer;
                }
                this.f45990cb.setSendAsPeer(peer);
                s7();
                this.f46111m1.addView(this.f45990cb);
                if (this.Eb) {
                    rj rjVar = this.f45950a0;
                    rjVar.U0 = true;
                    org.telegram.ui.Components.fg fgVar = rjVar.V0;
                    if (fgVar != null) {
                        fgVar.u(true);
                    }
                    this.f45950a0.W1();
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
        pi piVar = this.f46262y;
        if (piVar != null) {
            piVar.d();
        }
        pi piVar2 = this.f46249x;
        if (piVar2 != null) {
            piVar2.d();
        }
        pi piVar3 = this.E;
        if (piVar3 != null) {
            piVar3.d();
        }
        rj rjVar = this.f45950a0;
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
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) childAt).A0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f46041g9;
        if (g1Var != null && g1Var.getContentView() != null) {
            View contentView = this.f46041g9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.se0 se0Var = this.O2;
        if (se0Var != null) {
            se0Var.d();
        }
        sj sjVar = this.f45965b0;
        if (sjVar != null && sjVar.getEditView() != null) {
            for (org.telegram.ui.Components.bd bdVar : this.f45965b0.getEditView().f33499a) {
                if (bdVar != null) {
                    bdVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f46072j0;
        if (q0Var != null) {
            q0Var.W();
        }
        mj mjVar = this.f46112m2;
        if (mjVar != null) {
            mjVar.updateColors();
        }
        vi viVar = this.f46147p1;
        if (viVar != null) {
            viVar.updateColors();
        }
        pl plVar = this.f46111m1;
        if (plVar != null) {
            plVar.M();
            bi.m3 m3Var = this.f46111m1.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
        org.telegram.ui.Components.ch chVar = this.f45966b1;
        if (chVar != null) {
            fh.g gVar = chVar.f34198s;
            if (gVar != null) {
                gVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false));
            chVar.invalidate();
        }
        org.telegram.ui.Components.ax0 ax0Var = this.f46188s1;
        if (ax0Var != null) {
            ax0Var.updateColors();
        }
        vi viVar2 = this.f46147p1;
        if (viVar2 != null && viVar2.getTimeItem() != null) {
            this.f46147p1.getTimeItem().invalidate();
        }
        jh.f fVar = this.U;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f46264y1;
        if (hVar != null) {
            for (h6.m mVar : hVar.f19914e) {
                if (mVar != null && (aVar = (bVar = (kh.b) mVar.f13968b).f18594b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        vj vjVar = this.f45994d1;
        if (vjVar != null) {
            vjVar.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        this.f46111m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void Fc() {
        org.telegram.ui.Components.wz wzVar = this.J9;
        if (wzVar != null && !wzVar.f41924c) {
            wzVar.c(false);
            try {
                this.J9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Fd(org.telegram.messenger.z10 z10Var) {
        int i7;
        int i10;
        bj bjVar = this.A0;
        if (bjVar != null) {
            if (!this.R4 && this.f45973b8 != null) {
                int childCount = bjVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                        org.telegram.messenger.gj gjVar = this.f45973b8;
                        if (messageObject == gjVar) {
                            ArrayList arrayList = this.M6;
                            if (arrayList.indexOf(gjVar) >= 0) {
                                i7 = arrayList.indexOf(this.f45973b8) + this.D0.K;
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
            rj rjVar = this.f45950a0;
            if (rjVar != null) {
                rjVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.A0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt2;
                    org.telegram.messenger.gj messageObject2 = r1Var.getMessageObject();
                    if (((Boolean) z10Var.a(messageObject2)).booleanValue()) {
                        messageObject2.M1 = true;
                        r1Var.y3(messageObject2, r1Var.getCurrentMessagesGroup(), r1Var.K2(), r1Var.L2(), r1Var.C2(), r1Var.G2());
                        kl klVar = this.D0;
                        this.A0.getClass();
                        klVar.Q(RecyclerView.R(r1Var));
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
        int L = org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m + ((int) s9(org.telegram.messenger.g0.L(7.0f)));
        bk bkVar = this.D1;
        if (bkVar != null) {
            i7 = org.telegram.messenger.g0.L(bkVar.F * 35.0f);
        } else {
            i7 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(V8() * 43.0f) + L + i7;
        int L3 = org.telegram.messenger.g0.L(60.0f) + ((int) this.f46236w.d());
        di.b1 b1Var = this.f45954a4;
        if (b1Var != null) {
            b1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.h30 h30Var = this.I1;
        if (h30Var != null) {
            h30Var.f35769e.setPadding(0, L2, 0, L3);
            h30Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        bi.e3 e3Var = this.Z3;
        if (e3Var != null) {
            lh.f fVar = (lh.f) e3Var.f3595b;
            fVar.setFadeZoneTop(L2);
            fVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.yz yzVar = this.f46175r2;
        if (yzVar != null) {
            yzVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.nv0 nv0Var = this.f46189s2;
        if (nv0Var != null) {
            nv0Var.f37992a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.g0.L(32.0f));
        }
    }

    public final void G8(org.telegram.messenger.gj r75, java.util.ArrayList r76, java.util.ArrayList r77, java.util.ArrayList r78) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.G8(org.telegram.messenger.gj, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void G9(boolean z10) {
        if (!z10) {
            hi.l3 l3Var = this.B2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = this.f46225v2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            hi.l3 l3Var3 = this.f46252x2;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
        }
        hi.l3 l3Var4 = this.A2;
        if (l3Var4 != null) {
            l3Var4.f(true);
        }
        hi.l3 l3Var5 = this.f46277z2;
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
        org.telegram.ui.Components.rp rpVar = this.K2;
        if (rpVar != null) {
            rpVar.f(true);
        }
        hi.l3 l3Var10 = this.Y0;
        if (l3Var10 != null) {
            l3Var10.f(true);
        }
        hi.l3 l3Var11 = this.f45951a1;
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
        oj ojVar;
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
                    org.telegram.messenger.g0.h3(new ge(this, str, 7), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                g7(true);
                if (!this.actionBar.f29150o0) {
                    this.f46058hd.a(true, true);
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.f46072j0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f46032g0;
                    if (xVar != null) {
                        xVar.e(8);
                    }
                    fr frVar = this.f46020f0;
                    if (frVar != null) {
                        frVar.b(false);
                    }
                    if ((this.f46191s4 == 0 || (i7 = this.f46036g4) == 3 || i7 == 8) && (q0Var = this.f46085k0) != null) {
                        q0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = this.f46146p0;
                    if (q0Var3 != null && this.f46055ha) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f46159q0;
                    if (xVar2 != null && this.f46068ia) {
                        xVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = this.f46098l0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
                    if (q0Var5 != null) {
                        q0Var5.setVisibility(8);
                    }
                    this.f46173r0 = true;
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
                ImageView imageView = this.f46062i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!org.telegram.messenger.v3.V(this.f46005e) || !org.telegram.messenger.v3.t0(this.f46005e) || this.J3 == null)) {
                    this.G1 = 0;
                } else {
                    this.G1 = 2;
                }
                this.f46090k5 = false;
                if (this.f45996d4 == 3) {
                    org.telegram.messenger.na.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.na a10 = org.telegram.messenger.na.a(this.currentAccount);
                    a10.f25748b.a();
                    a10.f25749c.a();
                }
                hi.i1 i1Var = this.F1;
                if (i1Var != null) {
                    i1Var.h.clear();
                }
                org.telegram.ui.ActionBar.q0 q0Var6 = this.f46085k0;
                if (q0Var6 != null) {
                    this.Kc = true;
                    q0Var6.G(false);
                    this.Kc = false;
                }
                org.telegram.ui.ActionBar.q0 q0Var7 = this.f46085k0;
                if (q0Var7 != null) {
                    q0Var7.setSearchFieldCaption(null);
                    this.f46085k0.Q(str, false);
                    this.f46085k0.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745567, null));
                }
                getMediaDataController().c2(this.I3, this.f46103l6, this.f45999d7, this.classGuid, 0, this.f46191s4, false, this.D3, this.E3, false, this.F3);
                gd(0, true);
                this.f46189s2.e(true, true);
                sc(true);
                oj ojVar2 = this.E1;
                if (ojVar2 != null) {
                    ojVar2.b(!contains);
                    pd();
                }
                if ((contains || z10) && this.J3 != null && (ojVar = this.E1) != null) {
                    int currentPosition = ojVar.f40877a.getCurrentPosition();
                    int i10 = this.G1;
                    if (currentPosition != i10) {
                        this.E1.f40877a.e(i10, i10);
                    }
                }
                org.telegram.messenger.na.a(this.currentAccount).c(this.J3);
                this.I1.f35770f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof dn) {
                    ((dn) currentView).f47013a.rd(this.J3);
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
        tL_messageEntityCustomEmoji.document_id = document.f28440id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(V, this.f46103l6, this.F5, this.f46114m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = Y8();
        org.telegram.messenger.az.C(this.currentAccount).r0(b10);
        L6();
    }

    public final void Gc() {
        long j3;
        zd zdVar = this.f46118m8;
        if (zdVar != null) {
            org.telegram.messenger.g0.r(zdVar);
        }
        zd zdVar2 = new zd(this, 17);
        this.f46118m8 = zdVar2;
        if (this.f46053h8 != null) {
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
            sh.b bVar = this.f46097kd;
            if (bVar != null) {
                bVar.setAnimatedVisibility(this.f46018ed.f57700e);
            }
        } else {
            int i14 = 8;
            if (i7 == 3) {
                te.a aVar = this.f46031fd;
                float f12 = 1.0f - aVar.f57700e;
                this.f45966b1.setAlpha(f12);
                org.telegram.ui.Components.ch chVar = this.f45966b1;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                chVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f57700e;
                org.telegram.ui.Components.a21 a21Var = this.f46034g2;
                if (a21Var != null) {
                    a21Var.setAlpha(f13);
                    org.telegram.ui.Components.a21 a21Var2 = this.f46034g2;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    a21Var2.setVisibility(i13);
                }
            } else if (i7 == 4) {
                bi.e3 e3Var = this.Z3;
                te.a aVar2 = this.f46045gd;
                if (e3Var != null) {
                    float f14 = aVar2.f57700e;
                    e3Var.setAlpha(f14);
                    bi.e3 e3Var2 = this.Z3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    e3Var2.setVisibility(i14);
                }
                if (aVar2.f57700e < 1.0f) {
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
                if (aVar2.f57700e >= 1.0f) {
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

    public final void H6(org.telegram.messenger.gj gjVar, org.telegram.messenger.gj gjVar2) {
        long D1 = gjVar.D1();
        if (D1 != 0) {
            a0.h hVar = this.O6;
            ArrayList arrayList = (ArrayList) hVar.f(D1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.f3.h(hVar, D1);
            }
            arrayList.add(gjVar);
            if (gjVar2 != null) {
                arrayList.remove(gjVar2);
            }
        }
    }

    public final void H7() {
        int i7;
        float f10 = (1.0f - this.f46045gd.f57700e) * (1.0f - this.f46018ed.f57700e);
        this.f46264y1.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(80.0f));
        this.f46264y1.setAlpha(f10);
        lh.h hVar = this.f46264y1;
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
        org.telegram.ui.Cells.v0 v0Var = this.f46137o3;
        if (v0Var != null && v0Var.getTag() != null) {
            this.f46137o3.setTag(null);
            org.telegram.ui.Cells.v0 v0Var2 = this.f46137o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ue(this, v0Var2, 1));
            ofFloat.addListener(new ah.l(16, this, v0Var2));
            ofFloat.setDuration(150L);
            this.Gb = ofFloat;
            ofFloat.start();
        }
    }

    public final boolean Ha(String str, org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, int i7, int i10) {
        jg.o1 o1Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i11;
        Integer num2;
        TLRPC.TL_forumTopic f10;
        if (this.f46005e == null || str == null || this.f46036g4 != 0) {
            return false;
        }
        if (r1Var != null && (characterStyle != null || i10 != 1)) {
            o1Var = new jg.o1(this, i7, i10, characterStyle, r1Var);
        } else {
            o1Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.v3.K(this.f46005e, false) != null) {
                try {
                    if (f45943pd == null) {
                        f45943pd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f45944qd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f45943pd.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (org.telegram.messenger.v3.O(matcher.group(2), this.f46005e)) {
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
                                    if (org.telegram.messenger.v3.c0(this.f46005e) && i11 != d()) {
                                        return false;
                                    }
                                    this.L7 = true;
                                    if (this.f46036g4 == 2) {
                                        this.f46130n9.K0(parseInt);
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
                        Matcher matcher2 = f45944qd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.v3.O(matcher2.group(2), this.f46005e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f46271y8 = queryParameter2;
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
                    if (org.telegram.messenger.v3.O(lowerCase, this.f46005e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f46036g4 == 2) {
                            this.f46130n9.K0(intValue3);
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
                    if (f45945rd == null) {
                        f45945rd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f45945rd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f46005e.f28434id || parseInt3 == 0) {
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
                        if (org.telegram.messenger.v3.c0(this.f46005e) && (f10 = getMessagesController().f25968t7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f46177r4;
                            if (tL_forumTopic == null || tL_forumTopic.f28486id != f10.f28486id) {
                                return false;
                            }
                            return true;
                        }
                        this.L7 = true;
                        if (this.f46036g4 == 2) {
                            this.f46130n9.K0(parseInt3);
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
            long j3 = this.f46005e.f28434id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Da(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.L7 = true;
            if (this.f46036g4 == 2) {
                this.f46130n9.K0(intValue9);
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
        TLRPC.User user = kjVar.getAdapter().f17558x0;
        if (user != null) {
            j10 = user.f28583id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f28432id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.X1.getAdapter().f17558x0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j11 = this.f46103l6;
        org.telegram.messenger.gj gjVar = this.F5;
        org.telegram.messenger.gj gjVar2 = this.f46114m4;
        rm rmVar = this.D5;
        org.telegram.messenger.az.S(i7, j11, j3, j9(), hashMap, accountInstance, gjVar, gjVar2, Y8(), botInlineResult, null, this, rmVar, z10);
        this.f45950a0.setFieldText("");
        D9(false);
        getMediaDataController().x0(j10, false);
    }

    public final void Hc() {
        org.telegram.messenger.g0.d0(this.A0, new ai.x2(6, this, Q9()));
    }

    public final void I6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.i9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f46005e, this.f46019f, null, this.f46103l6, this.Sa, this.Ra);
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
        if (this.f46034g2 != null) {
            s9 += t9(org.telegram.ui.Components.w11.f41624a);
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
        org.telegram.ui.Components.ch chVar = this.f45966b1;
        if (chVar != null && (okVar = this.M2) != null) {
            chVar.j(okVar, false, z10);
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
        TLRPC.Peer peer = gjVar.f24213k.peer_id;
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
        if (!getMessagesController().u2(this.f46103l6, d(), null)) {
            if (z10) {
                getNotificationsController().G(this.f46103l6, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.w2 C = org.telegram.ui.Components.c5.C(this.f46103l6, d(), this, this.Ba);
            boolean V9 = V9();
            C.f30194i0 = V9;
            C.f30201n = V9;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.f46103l6, d(), false);
        if (!z10) {
            org.telegram.ui.Components.lc.z(this, 4, 0, this.Ba).j();
        }
    }

    public final void J6(org.telegram.messenger.gj gjVar, boolean z10) {
        K6(gjVar, z10, true);
    }

    public final void J7() {
        if (this.f45966b1 != null) {
            this.f45966b1.setPadding(org.telegram.messenger.g0.L(7.0f) + ((int) ((1.0f - V8()) * (1.0f - this.f46045gd.f57700e) * n9())), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final org.telegram.ui.Cells.z J8(int i7, boolean z10) {
        org.telegram.messenger.gj messageObject;
        bj bjVar = this.A0;
        if (bjVar != null) {
            int childCount = bjVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.A0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    messageObject = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
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
        if (ikVar.getReactionsWindow() != null && ikVar.getReactionsWindow().f5326a != null) {
            ikVar.getReactionsWindow().f5326a.animate().alpha(0.0f).setDuration(180L).start();
        }
        ikVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new eh(1, this, ikVar)).setDuration(180L).start();
    }

    public final void Ja(org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.p10.C(this.f46019f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f24213k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f46019f.f28583id) {
                l(messageFwdHeader.saved_from_msg_id, gjVar.e1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = gjVar.f24213k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", gjVar.f24213k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new bn(bundle));
        }
    }

    public final void Jb(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        long j10;
        if (u7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(str, this.f46103l6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = Y8();
                b10.O = j3;
                b10.L = z11;
                b10.Q = 0L;
                b10.R = j9();
                b10.T = this.f46268y5;
                org.telegram.messenger.az.C(this.currentAccount).r0(b10);
                j10 = 0;
            } else {
                j10 = j3;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.yy g10 = org.telegram.messenger.yy.g((TLRPC.User) obj, this.f46103l6, null, null, null, null, z10, i7, 0);
                g10.K = Y8();
                g10.O = j10;
                g10.L = z11;
                g10.Q = 0L;
                g10.R = j9();
                g10.T = this.f46268y5;
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
        return this.A8;
    }

    public final void K6(org.telegram.messenger.gj r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.K6(org.telegram.messenger.gj, boolean, boolean):void");
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
        org.telegram.ui.Components.a21 a21Var = this.f46034g2;
        org.telegram.ui.Components.w11 w11Var = org.telegram.ui.Components.w11.f41624a;
        if (a21Var != null) {
            a21Var.setSideMenuBackgroundMarginTop((V8() * s9(org.telegram.messenger.g0.L(7.0f))) + V8);
            float t92 = t9(w11Var);
            float a10 = a8.m7.a(this.f46045gd.f57700e);
            float V82 = V8();
            V8 += a8.m7.a(Math.min(c8.l9.a(a8.m7.a(a10), 0.0f, 1.0f), c8.l9.a(a8.m7.a(V82), 0.0f, 1.0f))) * t92;
        }
        org.telegram.ui.Components.ch chVar = this.f45966b1;
        if (chVar != null) {
            chVar.setTranslationY((V8 - org.telegram.messenger.g0.L(5.0f)) - (V8() * t9(w11Var)));
        }
    }

    public final org.telegram.ui.Cells.v0 K8(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i7 = 0; i7 < this.A0.getChildCount(); i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (org.telegram.ui.Wallet.u0.Q(v0Var.getMessageObject(), wallettransaction)) {
                        return v0Var;
                    }
                }
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.u0.Q((org.telegram.messenger.gj) arrayList.get(i10), wallettransaction)) {
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

    public final void Ka(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Cells.r1 r1Var2;
        boolean z10;
        long j3;
        long j10;
        org.telegram.ui.Components.c6 m10;
        Bitmap m11;
        if (r1Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var2.getMessageObject().T(gjVar)) {
                        break;
                    }
                }
            }
        }
        r1Var2 = r1Var;
        if (org.telegram.messenger.gj.L4(gjVar.f24213k)) {
            Lb(gjVar, true);
        }
        if (org.telegram.messenger.gj.L4(gjVar.f24213k) && !gjVar.D2(true) && org.telegram.messenger.cz.B0 && gjVar.B() && !org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.f24213k)) && !gjVar.f24272z0 && !gjVar.f24268y0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.w7 fileLoader = getFileLoader();
            TLRPC.Document F0 = gjVar.F0();
            fileLoader.getClass();
            org.telegram.messenger.w7.K.c(new org.telegram.messenger.zf(fileLoader, F0, gjVar, 22));
        }
        PhotoViewer.p1().I2(null, this, this.Ba);
        org.telegram.messenger.gj gjVar2 = MediaController.B().f22771v0;
        if (r1Var2 != null && gjVar2 != null && org.telegram.messenger.gj.L4(gjVar2.f24213k)) {
            getFileLoader().c0(gjVar2.F0(), false);
            if (gjVar2.T(gjVar) && (m10 = r1Var2.getPhotoImage().m()) != null && this.M8 != null && this.J8.getTag() != null && (m11 = m10.m()) != null) {
                try {
                    Bitmap bitmap = this.M8.getBitmap(m11.getWidth(), m11.getHeight());
                    new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            MediaController.B().q(true, true, false, gjVar2.T(gjVar));
        }
        if (this.f46036g4 == 1 && (org.telegram.messenger.gj.L4(gjVar.f24213k) || gjVar.D == 1)) {
            PhotoViewer.p1().f43307l4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.M6.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.M6.get(i10);
                if (org.telegram.messenger.gj.L4(gjVar3.f24213k) || gjVar3.D == 1) {
                    arrayList.add(0, gjVar3);
                }
            }
            PhotoViewer.p1().a2(arrayList, arrayList.indexOf(gjVar), this.f46103l6, 0L, d(), this.f46003db);
        } else {
            PhotoViewer p12 = PhotoViewer.p1();
            int i11 = gjVar.D;
            long j11 = 0;
            if (i11 != 0) {
                j3 = this.f46103l6;
            } else {
                j3 = 0;
            }
            if (i11 != 0) {
                j10 = this.f45999d7;
            } else {
                j10 = 0;
            }
            if (i11 != 0) {
                j11 = d();
            }
            if (!p12.e2(gjVar, this, j3, j10, j11, this.f46003db) && z10) {
                getFileLoader().f(gjVar.F0());
            }
        }
        G9(false);
        MediaController.B().f22774w0 = null;
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
                if (!ffVar.f28059b && (str2 = ffVar.h) != null) {
                    obj2.f28407c = str2;
                } else {
                    String str3 = ffVar.I;
                    if (str3 != null) {
                        obj2.f28407c = str3;
                    }
                }
                obj2.f28408e = ffVar.f28060c;
                obj2.f28409f = ffVar.f28063g;
                obj2.f28418p = ffVar.d();
                obj2.f28417o = ffVar.f28059b;
                obj2.f28419q = ffVar.j();
                obj2.f28427z = ffVar.f28068m;
                obj2.A = ffVar.P;
                CharSequence charSequence = ffVar.f28058a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f28411i = ffVar.f28069n;
                obj2.f28412j = ffVar.f28073r;
                obj2.h = ffVar.f28078x;
                obj2.f28413k = ffVar.f28074s;
                obj2.f28420r = ffVar.L;
                obj2.f28425x = ffVar.c();
                arrayList2.add(obj2);
                ffVar.e();
            }
            D8(((org.telegram.messenger.zy) arrayList2.get(0)).d, ((org.telegram.messenger.zy) arrayList2.get(0)).f28411i);
            org.telegram.messenger.az.X(getAccountInstance(), arrayList2, this.f46103l6, this.F5, this.f46114m4, null, this.D5, z11, true, null, null, z10, i7, 0, ((org.telegram.messenger.zy) arrayList2.get(0)).f28422t, null, Y8(), 0L, false, 0L, j9(), this.f46268y5, null, false);
            L6();
            rj rjVar = this.f45950a0;
            if (rjVar != null) {
                rjVar.setFieldText("");
            }
        }
        if (i7 != 0) {
            if (this.f46050h4 == -1) {
                this.f46050h4 = 0;
            }
            this.f46050h4 = arrayList.size() + this.f46050h4;
            md(true);
        }
    }

    public final void Kc(org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return;
        }
        org.telegram.ui.Components.gc gcVar = this.P3;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f46228v5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(gjVar.e1()));
        int i7 = this.f46011e5;
        getNotificationCenter().k(org.telegram.messenger.ls.f25385t0, Long.valueOf(this.f46103l6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f46011e5 - 1), Boolean.valueOf(this.f46037g5));
        this.P3 = org.telegram.ui.Components.lc.B(this, false, new ai.b1(this, arrayList2, arrayList, i7, 19), new he(this, gjVar, 6), this.Ba).j();
    }

    public final void L6() {
        this.f46268y5 = null;
        if (this.f46191s4 == 0 || this.f46254x4) {
            if (this.f46254x4) {
                this.F5 = this.f46114m4;
            } else {
                this.F5 = null;
            }
            this.D5 = null;
            rj rjVar = this.f45950a0;
            if (rjVar != null) {
                rjVar.O1(null, null, null);
            }
        }
        D9(false);
        if (this.f46036g4 == 0) {
            getMediaDataController().F(this.f46103l6, this.f46191s4, true);
        }
    }

    public final void L7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i7;
        org.telegram.messenger.gj gjVar;
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
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) sparseArray.valueAt(i11);
                if (gjVar2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(gjVar2.f24213k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = gjVar2.C.f24213k.fwd_from) != null && org.telegram.messenger.gj.B1(messageFwdHeader.saved_from_peer) == this.f46103l6 && (i7 = gjVar2.C.f24213k.fwd_from.channel_post) != 0 && (gjVar = (org.telegram.messenger.gj) this.G6[i10].get(i7)) != null && (messageReplies = gjVar.f24213k.replies) != null) {
                        messageReplies.replies++;
                        gjVar.f24215k1 = true;
                        TLRPC.Message message = gjVar2.f24213k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = i10;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (org.telegram.messenger.gj.B1(gjVar.f24213k.replies.recent_repliers.get(i12)) == org.telegram.messenger.gj.B1(peer)) {
                                gjVar.f24213k.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        gjVar.f24213k.replies.recent_repliers.add(i10, peer);
                        if (!gjVar2.N3()) {
                            gjVar.f24213k.replies.max_id = gjVar2.e1();
                        }
                        org.telegram.messenger.ur messagesStorage = getMessagesStorage();
                        long j3 = this.f46005e.f28434id;
                        int e12 = gjVar.e1();
                        TLRPC.MessageReplies messageReplies2 = gjVar.f24213k.replies;
                        messagesStorage.f27250a.c(new org.telegram.messenger.d8(messagesStorage, e12, j3, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (gjVar.z2()) {
                            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.P6.f(gjVar.c1());
                            if (bjVar != null) {
                                ArrayList arrayList4 = bjVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(bjVar, bjVar.f23110a);
                                int size3 = arrayList4.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    ((org.telegram.messenger.gj) arrayList4.get(i13)).f24215k1 = true;
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
                            kl klVar = this.D0;
                            if (!klVar.O) {
                                klVar.k(indexOf2 + klVar.K, bjVar2.d.size());
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
        getMediaDataController().c2(this.I3, this.f46103l6, this.f45999d7, this.classGuid, 0, this.f46191s4, false, this.D3, this.E3, true, this.F3);
        if (TextUtils.isEmpty(this.I3) && this.F3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.H3 = z10;
        this.f46173r0 = z10;
        Pc(false);
        qd();
    }

    public final void La(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        int i7;
        if (getParentActivity() != null && (r4Var = this.parentLayout) != null && r4Var.getLastFragment() == this && !this.V4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f46005e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f28434id);
            } else {
                bundle.putLong("user_id", this.f46019f.f28583id);
            }
            bundle.putInt("chatMode", 2);
            bn bnVar = new bn(bundle);
            bnVar.V4 = new ArrayList(this.V4);
            bnVar.X4 = new HashMap(this.X4);
            int size = this.V4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.V4.get(i10);
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.X4.get(num);
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.G6[0].get(num.intValue());
                if (gjVar == null) {
                    gjVar = gjVar2;
                } else if (gjVar2 != null) {
                    gjVar.f24272z0 = gjVar2.f24272z0;
                    gjVar.f24268y0 = gjVar2.f24268y0;
                }
                if (gjVar != null) {
                    bnVar.X4.put(num, gjVar);
                    bnVar.hd();
                }
            }
            bnVar.f45997d5 = this.f45997d5;
            if (this.f46254x4) {
                i7 = this.V4.size();
            } else {
                i7 = this.f46011e5;
            }
            bnVar.f46011e5 = i7;
            bnVar.f46037g5 = this.f46037g5;
            bnVar.f46194s8 = this.f46194s8;
            bnVar.f46181r8 = this.f46181r8;
            bnVar.f46130n9 = new sk(this, bnVar);
            if (z10) {
                presentFragmentAsPreview(bnVar);
                s7();
                return;
            }
            presentFragment(bnVar, false);
        }
    }

    public final he Lb(org.telegram.messenger.gj gjVar, boolean z10) {
        int i7;
        boolean z11;
        int i10;
        if (gjVar == null || gjVar.N3() || !gjVar.l4()) {
            return null;
        }
        TLRPC.Message message = gjVar.f24213k;
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
                getMessagesController().w3(this.f46103l6, i10, gjVar.f24213k.random_id);
                return null;
            }
            getMessagesController().x3(this.f46103l6, gjVar.e1(), null, i10, 0L, z11);
            return null;
        }
        return new he(this, gjVar, 1);
    }

    public final void Lc() {
        boolean Y9 = Y9();
        SparseArray[] sparseArrayArr = this.f46139o6;
        if (!Y9) {
            if (this.actionBar.x() && this.f46160q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f46160q1.c(org.telegram.messenger.hd.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.E0.setText(org.telegram.messenger.hd.N0(2131746017, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        this.E0.setText(org.telegram.messenger.hd.a0(null, null, 2131746018, org.telegram.messenger.hd.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    @Override
    public final long M() {
        return this.f45999d7;
    }

    public final void M6(org.telegram.messenger.gj gjVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
        String N0 = org.telegram.messenger.hd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
        if (gjVar.D == 3) {
            t1Var.U = org.telegram.messenger.hd.N0(2131747985, null);
        } else {
            t1Var.U = org.telegram.messenger.hd.a0("NoHandleAppInstalled", null, 2131748012, gjVar.F0().mime_type);
        }
        showDialog(t1Var);
    }

    public final void M7(boolean z10) {
        boolean z11;
        this.M6.clear();
        this.J6.clear();
        this.K6.clear();
        this.f46281z6.clear();
        this.P6.b();
        this.f46267y4 = false;
        kl klVar = this.D0;
        if (klVar != null) {
            if (klVar.f49350x < 0) {
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
            this.f45958a8 = false;
        }
        this.f46102l5 = false;
        this.M7 = 0;
        this.L7 = false;
        this.f45986c7 = 0;
        this.f45973b8 = null;
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
            if ((childAt instanceof org.telegram.ui.Cells.r1) && (currentMessagesGroup = ((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f23111b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f23110a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f23110a), currentMessagesGroup);
                    int indexOf = this.M6.indexOf((org.telegram.messenger.gj) i5.c.h(1, currentMessagesGroup.d));
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
        if (org.telegram.messenger.g0.P1() && org.telegram.messenger.t0.f26931b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && !r4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(z10));
        return false;
    }

    public final void M9() {
        if (!this.f45960aa) {
            this.f45960aa = true;
            pl plVar = this.f46111m1;
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
            undoView.setAdditionalTranslationY(t9(org.telegram.ui.Components.w11.f41626c) + this.U.getInputBubbleHeight() + this.f46236w.d() + org.telegram.messenger.g0.L(16.0f));
        }
        K7();
    }

    public final void Ma(int i7, boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f28442id);
            } else {
                TLRPC.Chat chat = this.f46005e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f28434id);
                } else {
                    bundle.putLong("user_id", this.f46019f.f28583id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i7);
                bundle.putBoolean("converting_toast", true);
            }
            bn bnVar = new bn(bundle);
            if (this.f46254x4) {
                qg.c.a(bnVar, org.telegram.messenger.tr.a(a(), d()));
            }
            bnVar.f46130n9 = new xi(this);
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
            if (!org.telegram.messenger.s2.f26731b) {
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
        org.telegram.messenger.az.V(i7, this.f46103l6, 0L, 0L, 0L, null, null, arrayList2, arrayList3, arrayList4, null, null, null, getAccountInstance(), this.F5, this.f46114m4, this.H5, null, Y8(), null, this.D5, null, null, z10, false);
        D9(false);
    }

    public final void Mc() {
        Drawable s02;
        pl plVar = this.f46111m1;
        if (plVar != null && this.f46285za == null) {
            if (this.Ba.h == null || plVar.getBackgroundImage() == null) {
                if (this.f46111m1.getBackgroundImage() == null || org.telegram.messenger.g0.Q1()) {
                    if (S9()) {
                        s02 = this.f46111m1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.m6.s0();
                    }
                    pl plVar2 = this.f46111m1;
                    if (!S9()) {
                        boolean z10 = org.telegram.ui.ActionBar.m6.f29467i0;
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
        long j10;
        rm rmVar;
        org.telegram.messenger.gj gjVar;
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message2;
        org.telegram.messenger.gj gjVar2;
        rm rmVar2;
        String str;
        int Y;
        rm rmVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        long j11;
        org.telegram.ui.Components.fz0 fz0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.y5 y5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        TLRPC.Message message3;
        Pair pair;
        Long l11;
        TLRPC.DraftMessage draftMessage;
        if (this.f45950a0 != null) {
            int i7 = this.f46036g4;
            char c10 = '\b';
            if (i7 == 0 || i7 == 8 || (i7 == 3 && getUserConfig().e() == e9())) {
                long j13 = 0;
                if (this.f46036g4 == 8) {
                    if (org.telegram.messenger.v3.p0(this.f46005e)) {
                        if (this.f46191s4 == 0 && org.telegram.messenger.v3.A(this.currentAccount, this.f46005e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.fz0 fz0Var2 = null;
                ?? r72 = 0;
                if (T9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f26856u1.f(this.f46103l6);
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
                    T = draftMessage;
                    l10 = l11;
                } else {
                    org.telegram.messenger.si mediaDataController = getMediaDataController();
                    long j14 = this.f46103l6;
                    if (this.f46036g4 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f46191s4;
                    }
                    T = mediaDataController.T(j14, j3);
                    l10 = null;
                }
                rj rjVar = this.f45950a0;
                if (T != null) {
                    richMessage = T.rich_message;
                } else {
                    richMessage = null;
                }
                rjVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.ni U = org.telegram.messenger.si.d0(this.currentAccount).U(this.f46103l6, d());
                if (T != null && (inputReplyTo = T.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.si mediaDataController2 = getMediaDataController();
                    long j15 = this.f46103l6;
                    if (l10 != null) {
                        j12 = l10.longValue();
                    } else {
                        j12 = this.f46191s4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f26858v1.f(j15);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j12);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z11 || T == null) && this.f45950a0.getFieldText() != null && (this.f46036g4 != 0 || getUserConfig().e() != a() || T == null || this.Fc >= T.date)) {
                    if (z10 && T == null) {
                        this.f45950a0.setFieldText("");
                        this.f45950a0.setEffectId(0L);
                        D9(true);
                    }
                } else if (U != null) {
                    this.f45950a0.setVoiceDraft(U);
                } else if (T != null) {
                    this.Fc = T.date;
                    rj rjVar2 = this.f45950a0;
                    rjVar2.N3 = null;
                    rjVar2.O3 = !T.no_webpage;
                    if (!T.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(T.message);
                        Collections.sort(T.entities, org.telegram.messenger.si.f26808g2);
                        int i10 = 0;
                        while (i10 < T.entities.size()) {
                            TLRPC.MessageEntity messageEntity = T.entities.get(i10);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j16 = j13;
                            if (!z12 && !(messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj = new Object();
                                        obj.f35337a |= 1;
                                        org.telegram.ui.Components.gz0 gz0Var = new org.telegram.ui.Components.gz0(obj, r72);
                                        int i11 = messageEntity.offset;
                                        org.telegram.messenger.si.f(gz0Var, i11, messageEntity.length + i11, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj2 = new Object();
                                        obj2.f35337a |= 2;
                                        org.telegram.ui.Components.gz0 gz0Var2 = new org.telegram.ui.Components.gz0(obj2, r72);
                                        int i12 = messageEntity.offset;
                                        org.telegram.messenger.si.f(gz0Var2, i12, messageEntity.length + i12, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj3 = new Object();
                                        obj3.f35337a |= 8;
                                        org.telegram.ui.Components.gz0 gz0Var3 = new org.telegram.ui.Components.gz0(obj3, r72);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.si.f(gz0Var3, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj4 = new Object();
                                        obj4.f35337a |= 16;
                                        org.telegram.ui.Components.gz0 gz0Var4 = new org.telegram.ui.Components.gz0(obj4, r72);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.si.f(gz0Var4, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(messageEntity.url, fz0Var2);
                                        int i15 = messageEntity.offset;
                                        valueOf.setSpan(u41Var, i15, messageEntity.length + i15, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj5 = new Object();
                                        obj5.f35337a |= 256;
                                        org.telegram.ui.Components.gz0 gz0Var5 = new org.telegram.ui.Components.gz0(obj5, r72);
                                        int i16 = messageEntity.offset;
                                        org.telegram.messenger.si.f(gz0Var5, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i17 = messageEntity.offset;
                                        org.telegram.ui.Components.jh0.c(valueOf, i17, messageEntity.length + i17, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.f45950a0.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r72);
                                            fontMetricsInt = fz0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                        } else {
                                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(y5Var, i18, messageEntity.length + i18, 33);
                                    }
                                    fz0Var = fz0Var2;
                                } else {
                                    ?? obj6 = new Object();
                                    obj6.f35337a |= 4;
                                    org.telegram.ui.Components.gz0 gz0Var6 = new org.telegram.ui.Components.gz0(obj6, 0);
                                    int i19 = messageEntity.offset;
                                    org.telegram.messenger.si.f(gz0Var6, i19, messageEntity.length + i19, valueOf, true);
                                }
                                fz0Var = null;
                            } else {
                                if (z12) {
                                    j11 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j11 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                fz0Var = null;
                                org.telegram.ui.Components.v41 v41Var = new org.telegram.ui.Components.v41(a8.p0.o(j11, ""), 3, null);
                                int i20 = messageEntity.offset;
                                valueOf.setSpan(v41Var, i20, messageEntity.length + i20, 33);
                            }
                            i10++;
                            fz0Var2 = fz0Var;
                            c10 = c11;
                            j13 = j16;
                            r72 = 0;
                        }
                        j10 = j13;
                        rmVar = fz0Var2;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        rmVar = null;
                        str2 = T.message;
                    }
                    this.f45950a0.H1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.f45950a0.setSelection(T.message.indexOf(10) + 1);
                        org.telegram.messenger.g0.h3(new zd(this, 5), 700L);
                    }
                    this.f45950a0.setEffectId(T.effect);
                    if (T != null && (suggestedPost = T.suggested_post) != null) {
                        org.telegram.messenger.lj b10 = org.telegram.messenger.lj.b(suggestedPost);
                        this.f46268y5 = b10;
                        kc(b10);
                    }
                    gjVar = this.F5;
                    if (gjVar != null || this.f46114m4 == gjVar) {
                        if (message == null && ((gjVar2 = this.f46114m4) == null || gjVar2.e1() != message.f28455id)) {
                            org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = gjVar3;
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
                                            org.telegram.messenger.gj.B0(gjVar3.f24213k);
                                            ?? obj7 = new Object();
                                            obj7.f51619a = gjVar3;
                                            obj7.f51620b = -1;
                                            obj7.f51621c = -1;
                                            obj7.d = -1;
                                            obj7.f51629m = true;
                                            obj7.e(i23, arrayList);
                                            rmVar3 = obj7;
                                        }
                                        this.D5 = rmVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i21 & 16) != 0) {
                                            i22 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = gjVar3.f24213k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.gj.Y(i22, str, str3)) < 0) {
                                            rmVar2 = rmVar;
                                        } else {
                                            org.telegram.messenger.gj.B0(gjVar3.f24213k);
                                            rmVar2 = new rm(Y, str3.length() + Y, gjVar3);
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
                        } else if (l10 == null && l10.longValue() != j10 && this.f46005e != null && (f10 = getMessagesController().f25968t7.f(this.f46005e.f28434id, l10.longValue())) != null && (message2 = f10.topicStartMessage) != null) {
                            org.telegram.messenger.gj gjVar4 = new org.telegram.messenger.gj(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.F5 = gjVar4;
                            gjVar4.f24211j1 = f10;
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
                rmVar = null;
                if (T != null) {
                    org.telegram.messenger.lj b102 = org.telegram.messenger.lj.b(suggestedPost);
                    this.f46268y5 = b102;
                    kc(b102);
                }
                gjVar = this.F5;
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
        int[] iArr = this.R6;
        if (z10) {
            if (org.telegram.messenger.s2.f26730a) {
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
                lh.h hVar = this.f46264y1;
                if (hVar != null) {
                    hVar.c(1, i11, this.f46026f6);
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
                    lh.h hVar2 = this.f46264y1;
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
        this.f46281z6.clear();
        this.J6.clear();
        this.K6.clear();
        this.P6.b();
        this.f46267y4 = false;
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
            this.f46139o6[i14].clear();
            this.f46152p6[i14].clear();
            this.f46165q6[i14].clear();
        }
        B9();
        gd(0, true);
        if (this.D8 != null) {
            this.D8 = null;
            rj rjVar = this.f45950a0;
            if (rjVar != null) {
                rjVar.B1(null, true, false);
            }
        }
        if (this.R != null) {
            wc(false);
            W7(false);
            this.A0.setEmptyView(this.f46021f1);
        }
        kl klVar2 = this.D0;
        if (klVar2 != null) {
            klVar2.O(false);
        }
        if (this.h == null && (user = this.f46019f) != null && user.bot && this.f46245w8 == null) {
            this.f46245w8 = "";
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
            if (this.f46036g4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.L9 = true;
                kl klVar = this.D0;
                if (klVar != null) {
                    klVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f46103l6, z10, z11, z12, i7, 0, this.f46114m4, -1, j3, j9(), this.f46268y5);
            org.telegram.ui.Components.c5.q0(q02, this, this.Ba);
            if (q02 != 0) {
                org.telegram.messenger.g0.g3(new af(this, 23));
            }
        }
    }

    public final void N9() {
        boolean z10;
        Rect rect;
        if (this.f46111m1 != null) {
            if (this.f46184rb <= 0 && this.f46196sb <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            wi wiVar = this.f46236w;
            float c10 = wiVar.c();
            te.k kVar = wiVar.f56649b;
            int max = (int) Math.max(0.0f, (c10 * kVar.f57726a) - org.telegram.messenger.g0.L(29.0f));
            pl plVar = this.f46111m1;
            bi.m3 m3Var = plVar.M;
            Rect rect2 = this.f46110ld;
            if (m3Var != null) {
                rect2.set(0, 0, plVar.getMeasuredWidth(), this.f46111m1.getMeasuredHeight() - max);
                this.f46111m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.f46111m1.getMeasuredWidth(), this.f46111m1.getMeasuredHeight() - max);
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
                rect2.set(0, 0, this.f46111m1.getMeasuredWidth(), this.f46111m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(wiVar.f56656w, wiVar.c() * kVar.f57726a) - org.telegram.messenger.g0.L(29.0f))));
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
            org.telegram.messenger.g0.h3(new u8(25, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f29150o0) {
            this.f46058hd.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var = this.f46072j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f46032g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = this.f46020f0;
            if (frVar != null) {
                frVar.b(false);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f46085k0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f46146p0;
            if (q0Var3 != null && this.f46055ha) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f46159q0;
            if (xVar2 != null && this.f46068ia) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f46098l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f46173r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.f46049h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f46062i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f46085k0;
        if (q0Var6 != null) {
            this.Kc = true;
            this.f46090k5 = false;
            q0Var6.G(false);
            this.Kc = false;
        }
        Db(chat, null);
        gd(0, true);
    }

    public final void Nb(org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.r1 r1Var, int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.bj u92 = u9(gjVar);
        boolean z12 = false;
        if (u92 != null) {
            ArrayList arrayList = u92.d;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (this.f46139o6[i7].indexOfKey(((org.telegram.messenger.gj) arrayList.get(i10)).e1()) < 0) {
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
        r1Var.setDrawSelectionBackground(z11);
        if (u92 == null) {
            z12 = true;
        }
        r1Var.n3(true, z12, z10);
    }

    public final void Nc() {
        TLRPC.User user;
        boolean z10;
        if (this.f46072j0 != null && (user = this.f46019f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f46231v8;
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
                this.f46072j0.T(30);
            } else {
                this.f46072j0.u(30);
            }
            if (z10) {
                this.f46072j0.T(31);
            } else {
                this.f46072j0.u(31);
            }
        }
    }

    public final boolean O6() {
        if (!org.telegram.messenger.v3.u0(this.f46005e)) {
            TLRPC.User user = this.f46019f;
            if (!org.telegram.messenger.p10.v(user) || !user.bot_forum_sidebar) {
                if (!org.telegram.messenger.p10.v(this.f46019f) && !org.telegram.messenger.v3.a(this.f46005e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void O7(boolean z10) {
        for (int i7 = 1; i7 >= 0; i7--) {
            this.f46139o6[i7].clear();
            this.f46152p6[i7].clear();
            this.f46165q6[i7].clear();
        }
        B9();
        gd(0, true);
        Gd(z10);
        td();
    }

    public final int O8() {
        return this.f46036g4;
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
            org.telegram.messenger.g0.h3(new ge(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f29150o0) {
            this.f46058hd.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f46072j0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f46032g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = this.f46020f0;
            if (frVar != null) {
                frVar.b(false);
            }
            if ((this.f46191s4 == 0 || (i10 = this.f46036g4) == 3 || i10 == 8) && (q0Var = this.f46085k0) != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f46146p0;
            if (q0Var3 != null && this.f46055ha) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f46159q0;
            if (xVar2 != null && this.f46068ia) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f46098l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f46173r0 = true;
            nd(0, 0, -1);
            Pc(false);
        }
        if ((this.f46191s4 == 0 || this.f46254x4 || (i7 = this.f46036g4) == 3 || i7 == 8) && !org.telegram.messenger.p10.A(this.f46019f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f46090k5 = z11;
            org.telegram.ui.ActionBar.q0 q0Var6 = this.f46085k0;
            if (q0Var6 != null) {
                q0Var6.G(z11);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var7 = this.f46085k0;
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
        mediaDataController.c2(str2, this.f46103l6, this.f45999d7, this.classGuid, 0, this.f46191s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        gd(0, true);
    }

    public final void Ob(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.Ba != null && this.f46285za == null) {
            ig.b c10 = ig.b.c(chatTheme);
            org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.currentAccount);
            f10.s(this.f46103l6, ig.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f10.p(chatTheme);
                org.telegram.ui.ActionBar.s3 i7 = f10.i(c10);
                if (i7 == null) {
                    i7 = new org.telegram.ui.ActionBar.s3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i7.k();
                    i7.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.s3 s3Var = i7;
                zm zmVar = this.Ba;
                TLRPC.WallPaper wallPaper = zmVar.f54590g;
                if (this.f46052h6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zmVar.r(s3Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                ee eeVar = new ee(this, 14);
                String str = c10.f16275b;
                if (c10.b()) {
                    eeVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.s3 s3Var2 = (org.telegram.ui.ActionBar.s3) f10.f23856e.get(str);
                    if (s3Var2 != null) {
                        s3Var2.k();
                        eeVar.onComplete(s3Var2);
                    } else {
                        eeVar.onComplete(null);
                    }
                } else {
                    f10.q(new org.telegram.messenger.e4(c10, eeVar), false);
                }
            }
            TLRPC.WallPaper d = f10.d(this.f46103l6);
            zm zmVar2 = this.Ba;
            org.telegram.ui.ActionBar.s3 s3Var3 = zmVar2.f54589f;
            if (this.f46052h6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zmVar2.r(s3Var3, d, z10, null, false);
        }
    }

    public final void Oc() {
        if (this.f46034g2 == null) {
            return;
        }
        this.f46034g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(5.0f)) + this.f46236w.d());
    }

    @Override
    public final boolean P(cx cxVar) {
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
            if (T0 instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) T0;
                messageObject = r1Var.getMessageObject();
                i10 = r1Var.getAdditionalPaddingHeight();
            } else if (T0 instanceof org.telegram.ui.Cells.v0) {
                messageObject = ((org.telegram.ui.Cells.v0) T0).getMessageObject();
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
        this.f46054h9 = z10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f46041g9;
        if (g1Var != null) {
            g1Var.dismiss();
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
            if ((n2Var.isShowing() && !this.Y1.J) || this.Y1.f40424s2) {
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
                w0Var.c(8, i0.b.f15916e);
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
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f46019f) != null && user.contact_require_premium) {
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
            org.telegram.messenger.g0.h3(new gg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f29150o0) {
            this.f46058hd.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var = this.f46072j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f46032g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = this.f46020f0;
            if (frVar != null) {
                frVar.b(false);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f46085k0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f46146p0;
            if (q0Var3 != null && this.f46055ha) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f46159q0;
            if (xVar2 != null && this.f46068ia) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f46098l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f46173r0 = true;
            nd(0, 0, -1);
            Pc(false);
            ImageView imageView = this.f46049h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f46062i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f46085k0;
        if (q0Var6 != null) {
            this.Kc = true;
            this.f46090k5 = false;
            q0Var6.G(false);
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
        if (view != this.A0 && view != this.f46111m1) {
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
        rj rjVar = this.f45950a0;
        float f13 = 0.0f;
        if (rjVar != null) {
            if (z10) {
                f10 = rjVar.f32665l7;
            } else {
                f10 = rjVar.f32658k7;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, org.telegram.messenger.g0.L(44.0f));
        float L = org.telegram.messenger.g0.L(44.0f);
        te.a aVar = this.f46018ed;
        m6.n nVar = this.f46084jd;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(nVar.f20909a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(nVar.f20909a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f57701f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) nVar.f20910b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f57700e;
            f12 = f14;
        }
        if (!this.mb && !isInPreviewMode()) {
            return org.telegram.messenger.g0.T1(Math.max(org.telegram.messenger.g0.T1(L, max, f12) * f11, org.telegram.messenger.g0.L(44.0f)), -org.telegram.messenger.g0.L(7.0f), f13);
        }
        return org.telegram.messenger.g0.T1(L, max, f12) * f11;
    }

    public final long Q7(org.telegram.messenger.gj gjVar) {
        if (this.f46036g4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.v3.c0(this.f46005e) && !this.f46254x4 && gjVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = gjVar.f24211j1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f28486id;
            }
            return org.telegram.messenger.gj.b2(this.currentAccount, gjVar.f24213k, org.telegram.messenger.v3.c0(this.f46005e), false);
        }
        return this.f46191s4;
    }

    public final TLRPC.ChatFull Q8() {
        return this.f46181r8;
    }

    public final boolean Q9() {
        if (this.f46034g2 != null && this.f46191s4 == 0) {
            return true;
        }
        return false;
    }

    public final void Qa(long j3) {
        int i7 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f46147p1.e(true, false);
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
                this.f46147p1.e(true, false);
                return;
            }
            Bundle j10 = a8.p0.j(j3, "user_id");
            if (this.h != null && j3 == this.f46019f.f28583id) {
                j10.putLong("dialog_id", this.f46103l6);
            }
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            TLRPC.User user = this.f46019f;
            if (user != null && user.f28583id == j3) {
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

    public final boolean R6(org.telegram.messenger.gj gjVar) {
        if (!W9()) {
            TLRPC.Message message = gjVar.f24213k;
            if ((message == null || !message.noforwards) && !gjVar.g4() && !gjVar.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TLRPC.UserFull R8() {
        return this.f46194s8;
    }

    public final void Ra(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r10 = org.telegram.messenger.az.r(1, str);
            PhotoViewer.p1().I2(null, this, this.Ba);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str, 0, true, 0, 0);
            ffVar.f28058a = charSequence;
            arrayList.add(ffVar);
            if (PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, false);
            }
            PhotoViewer.p1().f2(arrayList, 0, 0, false, new wk(this, r10, arrayList), this);
            return;
        }
        D8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j3 = this.f46103l6;
        org.telegram.messenger.gj gjVar = this.F5;
        org.telegram.messenger.gj gjVar2 = this.f46114m4;
        rm rmVar = this.D5;
        org.telegram.messenger.az.b0(0, 0, 0, j3, 0L, 0L, j9(), null, str, null, null, accountInstance, gjVar, gjVar2, this.H5, this.f46268y5, Y8(), null, null, null, rmVar, true, false, false);
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
        if (this.f45960aa && this.A0 != null) {
            float f10 = 0.0f;
            if (this.Ma <= 0 || this.f45976bb != 0.0f) {
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
                this.P9 = t9(org.telegram.ui.Components.w11.f41624a) + org.telegram.messenger.g0.L(4.0f) + this.S9 + V8;
                if (this.actionBar.getVisibility() == 0 || this.Aa != null) {
                    this.P9 += this.actionBar.getMeasuredHeight();
                }
                this.R9 = 0;
                this.P9 = this.P9 + this.Xa + this.T9;
                if (this.f45976bb != 0.0f && (rjVar = this.f45950a0) != null && rjVar.getVisibility() == 0) {
                    float f12 = this.P9;
                    float measuredHeight = this.f45976bb * (this.f45950a0.getMeasuredHeight() - org.telegram.messenger.g0.L(44.0f));
                    this.P9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.v0 v0Var = this.f46137o3;
                if (v0Var != null) {
                    v0Var.setTranslationY(((this.A0.getTranslationY() + this.P9) + this.X9) - org.telegram.messenger.g0.L(30.0f));
                    float f13 = this.P9;
                    float f14 = this.X9;
                    this.P9 = f13 + f14;
                    this.R9 = (int) (this.R9 + f14);
                }
                jj jjVar = this.f46113m3;
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
                    if (!fa() && !this.R4 && this.f45973b8 != null && this.A0 != null && ((ckVar = this.f46008e2) == null || ckVar.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f11 - this.P9));
                    }
                }
                this.f45960aa = false;
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35519w;
                if (gcVar != null && (lbVar = gcVar.f35523e) != null) {
                    lbVar.updatePosition();
                }
                C7();
            }
        }
    }

    public final boolean S6() {
        if (!X9() && !getMessagesController().E2(a())) {
            if ((!getMessagesController().y2(a()) || this.f46254x4) && getMessagesController().P1(a()) <= 0 && this.h == null) {
                vj vjVar = this.f45994d1;
                if (vjVar == null || vjVar.getVisibility() != 0) {
                    if (!fa() || this.f46254x4) {
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
        if (!org.telegram.messenger.cz.H0 && !this.f46261xb) {
            return false;
        }
        return true;
    }

    public final void Sa() {
        this.f46038g6 = true;
        this.fragmentBeginToShow = true;
        this.f46195sa = null;
        this.f46111m1.invalidate();
        this.f46111m1.setSkipBackgroundDrawing(false);
        this.f46156pa = false;
        this.fragmentView.setAlpha(1.0f);
        this.f46147p1.setTranslationY(0.0f);
        this.f46147p1.getAvatarImageView().setScaleX(1.0f);
        this.f46147p1.getAvatarImageView().setScaleY(1.0f);
        this.f46147p1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Sb(int i7, int i10, String str) {
        this.f46000d8 = i7;
        this.f46028f8 = true;
        this.f46040g8 = 0L;
        this.f46053h8 = str;
        this.f46093k8 = i10;
        this.f46014e8 = true;
    }

    public final void Sc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        org.telegram.messenger.bj bjVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.gj gjVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.si.d0(this.currentAccount).Z0);
        if (this.f46248wb == null) {
            this.f46248wb = new a0.h();
        }
        a0.h hVar2 = this.f46234vb;
        if (hVar2 == null) {
            this.f46234vb = new a0.h();
        } else {
            hVar2.b();
        }
        this.D0.Q.clear();
        this.f46248wb.b();
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
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                    if (org.telegram.messenger.gj.B0(gjVar.f24213k) == org.telegram.messenger.gj.B0(gjVar2.f24213k) && gjVar.e1() == gjVar2.e1()) {
                        break;
                    }
                    i10++;
                } else {
                    gjVar = null;
                    break;
                }
            }
            if (gjVar2.f24223m1 == 0) {
                if (gjVar == null) {
                    gjVar2.K(true);
                } else {
                    gjVar2.f24272z0 = gjVar.f24272z0;
                    gjVar2.f24268y0 = gjVar.f24268y0;
                }
            }
            if (gjVar != null) {
                gjVar2.f24227n2 = gjVar.f24227n2;
                if (this.D0.O && gjVar2.f24223m1 != 0) {
                    gjVar.N(gjVar2);
                } else {
                    gjVar2.N(gjVar);
                }
            } else if (gjVar2.f24223m1 == 0) {
                int i11 = f45942od;
                f45942od = i11 + 1;
                gjVar2.f24223m1 = i11;
            }
            gjVar2.W2 = null;
            TLRPC.Message message2 = gjVar2.f24213k;
            if (message2 != null) {
                message2.out = true;
            }
            gjVar2.P3();
            if (gjVar2.z2()) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) hVar.f(gjVar2.d1());
                if (bjVar2 == null) {
                    bjVar2 = new org.telegram.messenger.bj();
                    bjVar2.f23121n = this.f46132nb;
                    long c12 = gjVar2.c1();
                    bjVar2.f23110a = c12;
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
                hVar3.k(bjVar2, bjVar2.f23110a);
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
                gjVar2.f24213k.grouped_id = 0L;
                gjVar2.f24185e = 0L;
            }
            this.D0.Q.add(gjVar2);
            this.f46248wb.k(gjVar2, gjVar2.e1());
            i7++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) hVar3.n(i13);
                Collections.sort(bjVar3.d, new org.telegram.messenger.el(29));
                bjVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i14);
                if (gjVar3 != null && (message = gjVar3.f24213k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= gjVar3.f24213k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(gjVar3.f24213k.reactions.results.get(i15).reaction)) {
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
            if (!this.f46248wb.d(gjVar4.e1())) {
                gjVar4.W2 = null;
                TLRPC.Message message3 = gjVar4.f24213k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(gjVar4);
                this.f46248wb.k(gjVar4, gjVar4.e1());
            }
        }
        int i17 = 0;
        while (i17 < this.D0.Q.size()) {
            org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) this.D0.Q.get(i17);
            if (gjVar5.z2() && (bjVar = (org.telegram.messenger.bj) hVar.f(gjVar5.c1())) != null) {
                ArrayList arrayList5 = bjVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) arrayList5.get(size2);
                    if (gjVar6 != gjVar5 && !this.f46248wb.d(gjVar6.e1())) {
                        this.D0.Q.add(i17, gjVar6);
                        this.f46248wb.k(gjVar6, gjVar6.e1());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.D0.Q, new pe(0));
        org.telegram.messenger.gj gjVar7 = null;
        int i18 = 0;
        while (i18 < this.D0.Q.size()) {
            org.telegram.messenger.gj gjVar8 = (org.telegram.messenger.gj) this.D0.Q.get(i18);
            if (this.f46132nb && gjVar8 != null && i18 == 0) {
                fb(i18, gjVar8);
                i18++;
            }
            if (!this.f46132nb && gjVar7 != null && gjVar8.X != gjVar7.X) {
                fb(i18, gjVar7);
                i18++;
            }
            a0.h hVar5 = this.f46234vb;
            int i19 = gjVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i19);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.f3.h(this.f46234vb, i19);
            }
            arrayList6.add(gjVar8);
            if (this.f46132nb && gjVar7 != null && i19 != gjVar7.X) {
                fb(i18, gjVar8);
                i18++;
            }
            if (!this.f46132nb && i18 >= this.D0.Q.size() - 1) {
                fb(this.D0.Q.size(), gjVar8);
                i18++;
            }
            i18++;
            gjVar7 = gjVar8;
        }
        this.D0.P = org.telegram.messenger.si.d0(this.currentAccount).b2();
        if (z10) {
            this.D0.T();
            this.D0.O(true);
            if (this.D0.O ? getMediaDataController().M0 == 0 || !this.D0.Q.isEmpty() : !this.Y6 || !arrayList.isEmpty() || this.D0.f49350x >= 0) {
                z11 = false;
            }
            wc(z11);
            if (this.A0 != null) {
                W7(false);
                if (this.D0.O ? !(getMediaDataController().M0 == 0 && this.D0.Q.isEmpty()) : !(!this.Y6 && arrayList.isEmpty() && this.D0.f49350x < 0)) {
                    this.f46021f1.setVisibility(8);
                    this.A0.setEmptyView(null);
                    return;
                }
                this.A0.setEmptyView(this.f46021f1);
                bj bjVar4 = this.A0;
                bjVar4.K0(bjVar4.w1());
            }
        }
    }

    public final boolean T6() {
        if (this.h == null) {
            vj vjVar = this.f45994d1;
            if (vjVar == null || vjVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T7() {
        if (this.f46022f2 == null && getParentActivity() != null) {
            f8();
            if (this.f45966b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f46022f2 = textView;
                textView.setGravity(17);
                this.f46022f2.setTextSize(1, 14.0f);
                this.f46022f2.setTypeface(org.telegram.messenger.g0.o());
                TextView textView2 = this.f46022f2;
                int i7 = org.telegram.ui.ActionBar.m6.Fi;
                org.telegram.ui.ActionBar.t6.U(textView2, i7, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(2131232479, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131745320, null));
                this.f46022f2.setText(spannableStringBuilder);
                TextView textView3 = this.f46022f2;
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
                int L = org.telegram.messenger.g0.L(3.0f);
                org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(15.0f), r12, L, L, L, L), null, org.telegram.ui.ActionBar.t6.K(0.1f, i7), getResourceProvider());
                this.f46022f2.setOnClickListener(new oe(this, 20));
                c8.ra.b(this.f46022f2, 0.04f, 1.5f);
                this.f45966b1.addView(this.f46022f2, c8.ma.r(-1, 36, 83));
                this.f45966b1.i(12, this.f46022f2);
                this.f45966b1.h(this.f46022f2);
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
        if (!org.telegram.messenger.v3.c0(this.f46005e) || this.f46254x4) {
            if (org.telegram.messenger.v3.p0(this.f46005e) && d() == 0 && !this.f46063i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Ta(long j3, boolean z10) {
        if (this.f46034g2 != null && org.telegram.messenger.p10.v(this.f46019f)) {
            this.f46034g2.setAllTopicsHidden(true);
        }
        this.f46012e6.put(j3, 1);
        h8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f46103l6, 0, new og(this, j3, z10), new bg.k0(this, j3, 3));
        this.D0.O(false);
    }

    public final void Tb(long j3) {
        this.f46191s4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28455id = (int) j3;
        new org.telegram.messenger.gj(this.currentAccount, tL_message, false, false);
    }

    public final void Tc() {
        int i7;
        hj hjVar = this.f46124n3;
        if (hjVar == null) {
            return;
        }
        hjVar.setTranslationX(n9() / 2.0f);
        this.f46124n3.setTranslationY((((this.A0.getTranslationY() + this.P9) + this.W9) - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(28.0f));
        float i10 = Utilities.i(org.telegram.messenger.g0.z1(this.W9, -this.f46124n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f46124n3.setAlpha(this.f46253x3 * i10);
        hj hjVar2 = this.f46124n3;
        if (this.f46253x3 * i10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        hjVar2.setVisibility(i7);
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i10);
        this.f46124n3.setScaleX(T1);
        this.f46124n3.setScaleY(T1);
    }

    public final boolean U6(org.telegram.messenger.gj gjVar) {
        if (this.f46036g4 != 8) {
            if (gjVar != null && org.telegram.messenger.v3.c0(this.f46005e)) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25968t7.f(this.f46005e.f28434id, org.telegram.messenger.gj.b2(this.currentAccount, gjVar.f24213k, true, false));
                if (this.f46036g4 == 8 || (f10 != null && (!f10.closed || org.telegram.messenger.v3.i(this.currentAccount, this.f46005e, f10)))) {
                    return true;
                }
                return false;
            } else if (gjVar == null || !org.telegram.messenger.v3.p0(this.f46005e) || !org.telegram.messenger.v3.A(this.currentAccount, this.f46005e, 24) || org.telegram.messenger.gj.u1(gjVar.f24213k) == 0) {
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

    public final org.telegram.messenger.bj U8(long j3) {
        return (org.telegram.messenger.bj) this.P6.f(j3);
    }

    public final boolean U9() {
        return org.telegram.messenger.p10.v(this.f46019f);
    }

    public final boolean Ua() {
        if (this.V4.size() != 1 || this.f46125n4 == null || ((Integer) this.V4.get(0)).intValue() != this.f46125n4.e1()) {
            return false;
        }
        return true;
    }

    public final void Ub(View view) {
        View view2 = this.Z8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.v0)) {
                ((org.telegram.ui.Cells.v0) view2).setInvalidateWithParent(null);
            }
            this.Z8 = view;
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Uc() {
        boolean z10;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f46194s8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f46194s8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46033g1 != null) {
            if (z10 && this.f46060i1 == null) {
                bi biVar = new bi(getParentActivity(), getResourceProvider(), this);
                this.f46060i1 = biVar;
                c8.ra.b(biVar, 0.02f, 1.2f);
                this.f46060i1.setOnClickListener(new oe(this, 11));
            }
            bi biVar2 = this.f46060i1;
            if (biVar2 != null) {
                if (!z10) {
                    biVar2.setVisibility(8);
                    return;
                }
                biVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f46194s8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f46194s8.business_intro.title)) {
                    i7 = 2131749308;
                } else {
                    i7 = 2131749309;
                }
                String a02 = org.telegram.messenger.hd.a0(null, null, i7, org.telegram.messenger.p10.k(this.f46019f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        xw0 xw0Var = new xw0(a02.substring(indexOf, indexOf2));
                        if (xw0Var.f53980c != -1) {
                            xw0Var.f53980c = -1;
                            xw0Var.invalidateSelf();
                        }
                        xw0Var.a(503316480);
                        xw0Var.setBounds(0, 0, xw0Var.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(xw0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f46060i1.setCustomText(spannableStringBuilder);
                this.f46060i1.setOverrideTextMaxWidth(hi.l3.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f46060i1.getParent() != null && (!z10 || this.f46060i1.getParent() != this.f46033g1)) {
                    ((ViewGroup) this.f46060i1.getParent()).removeView(this.f46060i1);
                }
                if (z10) {
                    ViewParent parent = this.f46060i1.getParent();
                    LinearLayout linearLayout = this.f46033g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f46060i1, c8.ma.t(-1, -2, 80, 0, 10, 0, 0));
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f46005e != null && (this.f46036g4 != 0 || this.f46191s4 != 0 || (chatFull = this.f46181r8) == null || chatFull.ttl_period == 0)) || ((user = this.f46019f) != null && (org.telegram.messenger.p10.y(user) || (this.h == null && ((userFull = this.f46194s8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.o0 o0Var = this.f46006e0;
            if (o0Var != null) {
                o0Var.e(8);
            }
            vi viVar = this.f46147p1;
            if (viVar != null) {
                viVar.f34227a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.o0 o0Var2 = this.f46006e0;
            if (o0Var2 != null) {
                o0Var2.e(0);
            }
            vi viVar2 = this.f46147p1;
            if (viVar2 != null) {
                viVar2.f34227a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.o0 o0Var3 = this.f46223v0;
        if (o0Var3 != null) {
            TLRPC.Chat chat = this.f46005e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o0Var3.e(i10);
        }
        vi viVar3 = this.f46147p1;
        if (viVar3 != null) {
            TLRPC.Chat chat2 = this.f46005e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f46019f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            viVar3.setCommunityItemVisible(z11);
            final vi viVar4 = this.f46147p1;
            TLRPC.Chat chat3 = this.f46005e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = viVar4.F;
            ImageView imageView2 = viVar4.E;
            if (imageView2 != null && imageView != null) {
                viVar4.f34245n0 = z12;
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
                                    co coVar = viVar4;
                                    if (!z14) {
                                        coVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        coVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    co coVar2 = viVar4;
                                    if (!z15) {
                                        coVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        coVar2.getClass();
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
                                    co coVar = viVar4;
                                    if (!z14) {
                                        coVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        coVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    co coVar2 = viVar4;
                                    if (!z15) {
                                        coVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        coVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f46147p1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f46194s8;
                if (userFull2 != null) {
                    this.f46147p1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f46181r8;
                    if (chatFull3 != null) {
                        this.f46147p1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f46210u0 != null && (chatFull2 = this.f46181r8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.v3.T(this.f46005e)) {
                TLRPC.Chat chat4 = this.f46005e;
                if (!chat4.megagroup || org.telegram.messenger.v3.t0(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.o0 o0Var4 = this.f46210u0;
            if (z13) {
                i11 = 0;
            }
            o0Var4.e(i11);
        }
        s();
    }

    public final void V7(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10) {
        vf vfVar;
        if (gjVar == null) {
            SparseArray[] sparseArrayArr = this.f46139o6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f46019f;
        TLRPC.Chat chat = this.f46005e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f46181r8;
        long j3 = this.f45999d7;
        int d = (int) d();
        int i7 = this.f46036g4;
        af afVar = new af(this, 29);
        if (z10) {
            vfVar = new vf(this, 0);
        } else {
            vfVar = null;
        }
        vf vfVar2 = vfVar;
        org.telegram.ui.Components.c5.y(this, user, chat, encryptedChat, chatFull, j3, gjVar, this.f46139o6, bjVar, d, i7, null, afVar, vfVar2, this.Ba);
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
        return ojVar.f40878b;
    }

    public boolean V9() {
        if (this.f46111m1.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Va() {
        org.telegram.ui.Cells.r1 r1Var;
        this.f46018ed.a(false, true);
        sh.b bVar = this.f46097kd;
        if (bVar != null && (r1Var = bVar.f57470n) != null && r1Var.getDelegate() != null) {
            bVar.f57470n.getDelegate().F1(bVar.f57470n, false);
        }
        rj rjVar = this.f45950a0;
        if (rjVar != null) {
            rjVar.x1(true, true, false);
            this.f45950a0.U6 = null;
        }
    }

    public final void Vb(ArrayList arrayList, TLRPC.Chat chat, int i7, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f46177r4 = tL_forumTopic;
        this.f46150p4 = arrayList;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
        this.f46114m4 = gjVar;
        this.F5 = gjVar;
        this.A4 = i10;
        this.B4 = i11;
        this.C4 = Math.max(1, i10);
        this.f46191s4 = this.f46114m4.e1();
        this.f46202t4 = i7;
        this.f46214u4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46254x4 = z10;
        org.telegram.messenger.gj gjVar2 = this.F5;
        TLRPC.MessageFwdHeader messageFwdHeader = gjVar2.f24213k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46227v4 = z11;
        if (z10) {
            gjVar2.f24232p = true;
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
        if (this.f46047h1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.v3.p0(this.f46005e)) {
            if (this.f46005e != null) {
                chat = getMessagesController().x1(this.f46005e.f28434id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f46005e) != null && !org.telegram.messenger.v3.A(this.currentAccount, chat2, 24)) {
                final long j10 = this.f46005e.send_paid_messages_stars;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 > 0) {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131744106, org.telegram.messenger.n5.t(-chat.f28434id), org.telegram.messenger.hd.E(j10, ','));
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131744089, org.telegram.messenger.n5.t(-chat.f28434id));
                }
                SpannableStringBuilder U2 = org.telegram.messenger.g0.U2(di.pb.U0(a02, 1.0f, null));
                if (i11 > 0) {
                    str = org.telegram.messenger.hd.N0(2131748279, null);
                }
                this.f46047h1.c(true, true, U2, str, new View.OnClickListener(this) {
                    public final bn f50186b;

                    {
                        this.f50186b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                bn.d0(j10, this.f50186b);
                                return;
                            default:
                                bn.y0(j10, this.f50186b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f46047h1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f46194s8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.io ioVar = this.f46047h1;
                boolean z11 = !getUserConfig().q();
                if (getMessagesController().K3()) {
                    i10 = 2131748388;
                } else {
                    i10 = 2131748389;
                }
                ioVar.c(z11, false, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i10, org.telegram.messenger.n5.t(this.f46103l6))), org.telegram.messenger.hd.N0(2131748345, null), new bi.o(13));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.io ioVar2 = this.f46047h1;
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ioVar2.c(z10, false, org.telegram.messenger.g0.U2(di.pb.U0(org.telegram.messenger.hd.a0(null, null, 2131748387, org.telegram.messenger.n5.t(this.f46103l6), org.telegram.messenger.hd.E(this.f46194s8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.hd.N0(2131748279, null), new View.OnClickListener(this) {
                    public final bn f50186b;

                    {
                        this.f50186b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                bn.d0(j3, this.f50186b);
                                return;
                            default:
                                bn.y0(j3, this.f50186b);
                                return;
                        }
                    }
                });
            } else {
                this.f46047h1.c(false, false, null, null, null);
            }
        } else {
            this.f46047h1.c(false, false, null, null, null);
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
        if ((this.f46021f1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f46021f1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f46021f1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.f46111m1.addView(this.f46021f1, 3, c8.ma.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f46021f1.setTranslationX(n9() / 2.0f);
            int i10 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.f46161q2 = textView;
                textView.setText(org.telegram.messenger.hd.N0(2131748017, null));
                this.f46161q2.setTextSize(1, 14.0f);
                this.f46161q2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(this.f46161q2, org.telegram.ui.ActionBar.m6.Zc, getResourceProvider());
                this.f46161q2.setBackground(new org.telegram.ui.ActionBar.x5(this.f46161q2, this.f46111m1, org.telegram.messenger.g0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f46161q2.setTypeface(org.telegram.messenger.g0.o());
                this.f46161q2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(3.0f));
                this.f46021f1.addView(this.f46161q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (X9()) {
                kg.w1 w1Var = new kg.w1(getParentActivity(), this.f46036g4, this.f46191s4, this.f46024f4, getResourceProvider());
                this.f46073j1 = w1Var;
                int L = org.telegram.messenger.g0.L(24.0f);
                kg.w1 w1Var2 = this.f46073j1;
                pl plVar = this.f46111m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.m6.f29316a;
                w1Var.setBackground(new org.telegram.ui.ActionBar.x5(w1Var2, plVar, L, themedPaint));
                this.f46021f1.addView(this.f46073j1, c8.ma.e(-2, -2, 17));
                this.l1.d(this.f46073j1, this.f46111m1, new org.telegram.messenger.fd(26), false);
            } else if (this.f46036g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f46010e4;
                org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.m6.Zc;
                org.telegram.ui.ActionBar.m6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.m6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, c8.ma.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131752690, null)));
                linearLayout.addView(textView2, c8.ma.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                kg.z[] zVarArr = kg.z.f18576e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.m6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                textView3.setOnClickListener(new ai.y2(24, tL_businessChatLink, this));
                linearLayout.addView(textView3, c8.ma.t(-2, -2, 49, 17, 0, 17, 17));
                this.f46086k1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.x5(this.f46086k1, this.f46111m1, org.telegram.messenger.g0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f46021f1.addView(this.f46086k1, c8.ma.e(-2, -2, 17));
            } else if ((this.Y9 != null && this.f46019f != null && !this.f46121n) || (this.f46194s8 != null && a() != getUserConfig().e() && ((this.f46194s8.contact_require_premium && !getUserConfig().q()) || this.f46194s8.send_paid_messages_stars > di.y8.y(this.currentAccount, false).p().amount))) {
                this.f46047h1 = new zh(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                Vc();
                this.f46047h1.setListener(new ee(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f46033g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f46033g1.setGravity(17);
                this.f46033g1.addView(this.f46047h1, c8.ma.e(-2, -2, 17));
                this.f46021f1.addView(this.f46033g1, c8.ma.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f46194s8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f46047h1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f46047h1.setSticker(this.f46194s8.business_intro.sticker);
                }
                Uc();
            } else if (this.h == null) {
                if (this.f46254x4 && this.f46036g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    pl plVar2 = this.f46111m1;
                    zm zmVar = this.Ba;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.g0.L(18.0f);
                    if (zmVar != null) {
                        paint = zmVar.g("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.m6.f29316a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.x5(linearLayout3, plVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity2);
                    if (org.telegram.ui.ActionBar.m6.i1(zmVar)) {
                        i7 = org.telegram.ui.ActionBar.m6.Ja;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.Zc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.o10.p(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.t6.U(textView4, i7, zmVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
                    textView4.setText(org.telegram.messenger.hd.N0(2131754269, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.t6.U(textView5, i7, zmVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
                    textView5.setText(org.telegram.messenger.hd.N0(2131743776, null));
                    linearLayout3.addView(q9Var, c8.ma.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, c8.ma.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, c8.ma.r(-2, -2, 1));
                    TLRPC.Document V = org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).V("🥳");
                    if (V != null) {
                        org.telegram.messenger.mz d = org.telegram.messenger.u5.d(V.thumbs, org.telegram.ui.ActionBar.m6.f29364c7, 0.2f, false);
                        if (d != null) {
                            d.f25692e = 512;
                            d.f25693f = 512;
                        }
                        q9Var.k(org.telegram.messenger.gc.b(V), null, "tgs", d, null);
                    }
                    this.f46021f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!fa() && this.f46036g4 == 0 && (((user2 = this.f46019f) != null && user2.self) || ((chat = this.f46005e) != null && chat.creator && !org.telegram.messenger.v3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    pl plVar3 = this.f46111m1;
                    if (this.f46005e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(parentActivity3, plVar3, i10, this.Ba);
                    this.n1 = eoVar;
                    this.f46021f1.addView(eoVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f46005e != null) {
                        this.n1.setStatusText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131749245, null)));
                    }
                } else {
                    if (fa() && this.f46036g4 == 0) {
                        str = this.f46227v4 ? org.telegram.messenger.hd.N0(2131748033, null) : org.telegram.messenger.hd.N0(2131747975, null);
                    } else if (this.f46036g4 == 1) {
                        str = org.telegram.messenger.hd.N0(2131747968, null);
                    } else {
                        TLRPC.User user3 = this.f46019f;
                        if (user3 != null) {
                            long j3 = user3.f28583id;
                            if (j3 != 777000 && j3 != 429000 && j3 != 4244000 && org.telegram.messenger.np.L2(user3)) {
                                str = org.telegram.messenger.hd.N0(2131749356, null);
                            }
                        }
                        if (this.f46036g4 != 8 && ((user = this.f46019f) == null || user.self || user.deleted || this.f46121n)) {
                            str = org.telegram.messenger.hd.N0(2131748000, null);
                        }
                    }
                    if (str == null) {
                        this.f46047h1 = new ai(this, getParentActivity(), this.currentAccount, this.Y9, this.Ba);
                        Vc();
                        this.f46047h1.setListener(new ee(this, 5));
                        TLRPC.UserFull userFull2 = this.f46194s8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f46047h1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f46047h1.setSticker(this.f46194s8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f46033g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f46033g1.setGravity(17);
                        this.f46033g1.addView(this.f46047h1, c8.ma.e(-2, -2, 17));
                        this.f46021f1.addView(this.f46033g1, c8.ma.e(-1, -2, 17));
                        Uc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f46161q2 = textView6;
                    textView6.setText(str);
                    this.f46161q2.setTextSize(1, 14.0f);
                    this.f46161q2.setGravity(17);
                    org.telegram.ui.ActionBar.t6.U(this.f46161q2, org.telegram.ui.ActionBar.m6.Zc, getResourceProvider());
                    this.f46161q2.setBackground(new org.telegram.ui.ActionBar.x5(this.f46161q2, this.f46111m1, org.telegram.messenger.g0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f46161q2.setTypeface(org.telegram.messenger.g0.o());
                    this.f46161q2.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(3.0f));
                    this.f46021f1.addView(this.f46161q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.n1 = new org.telegram.ui.Components.eo(getParentActivity(), this.f46111m1, 0, this.Ba);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.n1.setStatusText(org.telegram.messenger.hd.a0(null, null, 2131751121, org.telegram.messenger.p10.k(this.f46019f, true)));
                } else {
                    this.n1.setStatusText(org.telegram.messenger.hd.a0(null, null, 2131751122, org.telegram.messenger.p10.k(this.f46019f, true)));
                }
                this.f46021f1.addView(this.n1, new FrameLayout.LayoutParams(-2, -2, 17));
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
        if (this.I9 == null) {
            this.I9 = new org.telegram.ui.Cells.r1(getParentActivity(), this.currentAccount, true, this.Za, this.Ba);
        }
        org.telegram.ui.Cells.r1 r1Var = this.I9;
        if (this.f46005e == null && !org.telegram.messenger.p10.C(this.f46019f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        r1Var.f31428f6 = z11;
        org.telegram.ui.Cells.r1 r1Var2 = this.I9;
        int i7 = this.f46036g4;
        if (i7 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        r1Var2.f31454h6 = z12;
        if (i7 == 3 && this.mb) {
            z13 = true;
        } else {
            z13 = false;
        }
        r1Var2.f31467i6 = z13;
        TLRPC.User user = this.f46019f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        r1Var2.f31479j6 = z14;
        if (org.telegram.messenger.v3.T(this.f46005e) && this.f46005e.megagroup) {
            z15 = true;
        }
        r1Var2.f31493k6 = z15;
        this.I9.W6 = Q9();
        this.I9.X6 = ba();
        this.I9.Y6 = aa();
        return this.I9.q0(gjVar, (org.telegram.messenger.bj) this.P6.f(gjVar.c1()), z10);
    }

    public final boolean W9() {
        if (this.f46005e != null) {
            return getMessagesController().r2(this.f46005e);
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f46194s8;
        messagesController.getClass();
        return org.telegram.messenger.np.Q2(userFull);
    }

    public final void Wa(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar;
        if (this.f46018ed.f57701f && (bVar = this.f46097kd) != null && bVar.f57470n == r1Var) {
            Editable text = bVar.f57465a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.j0) getMessagesController().A7.N.f15508b).f24812c) {
                org.telegram.messenger.az C = org.telegram.messenger.az.C(this.currentAccount);
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                sh.c attachedMedia = this.f46097kd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
                    if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.gj.B0(messageObject.f24213k);
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
                            arrayList.add(((th.d) attachedMedia).f58261c);
                            org.telegram.messenger.az.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof th.h) {
                            th.h hVar = (th.h) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f58272b, null, null, null, false, false, hVar.f58273c);
                        } else if (attachedMedia instanceof th.f) {
                            tL_inputPollAnswer.input_media = cg.d.h(((th.f) attachedMedia).f58269b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof th.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((th.e) attachedMedia).f58262b;
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
            org.telegram.messenger.g0.D3(this.f46097kd.f57465a);
        }
    }

    public final void Wb(pl plVar) {
        if (this.f46072j0 != null && !this.inPreviewMode && !this.mb && this.Aa == null && (this.fragmentView instanceof FrameLayout)) {
            ui.f fVar = this.K;
            if (fVar != null) {
                ui.f fVar2 = this.J;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                ui.d dVar = new ui.d(fVar2, fVar);
                dh.c cVar = new dh.c(dVar, dVar, dVar);
                cVar.f8411k = true;
                cVar.f8410j = T8();
                cVar.h = this.l1;
                cVar.f8409i = plVar;
                cVar.f8408g = this.F;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                kVar.X0 = cVar;
                kVar.Y0 = dVar;
            }
            this.actionBar.setMenuRise(org.telegram.messenger.g0.L(8.0f));
            this.f46072j0.setSubMenuOverlayProvider(new qe(0, this));
        }
    }

    public final void Wc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Wc(boolean):void");
    }

    public final void X6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.X6():void");
    }

    public final boolean X9() {
        int i7 = this.f46036g4;
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
        if (zVar instanceof org.telegram.ui.Cells.r1) {
            messageObject = ((org.telegram.ui.Cells.r1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) zVar).getMessageObject();
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
        if (gjVar.f24213k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.D0.O;
            if (z12) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.G6[0].get(gjVar.e1());
                if (gjVar2 != null && (message = gjVar2.f24213k) != null) {
                    message.reactions = gjVar.f24213k.reactions;
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
                    getMediaDataController().R1(((org.telegram.messenger.gj) arrayList.get(i7)).e1());
                }
            } else {
                getMediaDataController().R1(gjVar.e1());
            }
            jg.l1 l1Var = this.f45969b4;
            if (l1Var != null) {
                l1Var.f();
            }
            Sc(true);
        }
    }

    public final void Xb() {
        org.telegram.messenger.g0.E3(5.0f, this.A0, null);
        org.telegram.messenger.q2.APP_ERROR.a();
        rj rjVar = this.f45950a0;
        for (int i7 = 0; i7 < rjVar.getChildCount(); i7++) {
            org.telegram.messenger.g0.E3(5.0f, rjVar.getChildAt(i7), null);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            org.telegram.messenger.g0.E3(5.0f, actionBar.getChildAt(i10), null);
        }
    }

    public final void Xc() {
        org.telegram.messenger.gj gjVar;
        if (this.f46019f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                bj bjVar = this.A0;
                if (bjVar != null) {
                    int childCount = bjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = this.A0.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            gjVar = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                        } else {
                            gjVar = null;
                        }
                        if (gjVar != null && gjVar.e1() < 0) {
                            long j3 = gjVar.f24213k.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.gj gjVar2 = SecretMediaViewer.f().f43776g0;
            if (gjVar2 != null && !gjVar2.N3()) {
                MediaController.B();
                gjVar2.e1();
            }
        }
    }

    public final void Y6(int i7, View view, boolean z10) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f46018ed.f57700e) * (1.0f - this.f45992cd.f57700e) * ((float[]) this.f46084jd.f20910b)[i7];
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

    public final org.telegram.messenger.cw Y8() {
        ?? obj = new Object();
        int i7 = this.f46036g4;
        if (i7 == 9) {
            obj.f20862a = this.Qa;
        }
        if (i7 == 5) {
            String str = this.f46024f4;
            int d92 = d9();
            obj.f20864c = str;
            obj.f20863b = d92;
        }
        return new org.telegram.messenger.cw(obj);
    }

    public final boolean Y9() {
        return !TextUtils.isEmpty(this.f46075j4);
    }

    public final void Ya(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.Ya(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Yb(int i7, org.telegram.messenger.gj gjVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
        String N0 = org.telegram.messenger.hd.N0(2131745224, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        TLRPC.User user = this.f46019f;
        if (user != null) {
            if (user.bot) {
                t1Var.U = org.telegram.messenger.hd.N0(2131754066, null);
            } else {
                String h = org.telegram.messenger.o10.h(new StringBuilder("+"), getUserConfig().f().phone, pf.b.c());
                TLRPC.User user2 = this.f46019f;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureShareMyContactInfoUser", null, 2131754064, h, org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            t1Var.U = org.telegram.messenger.hd.N0(2131754067, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745265, null), new ai.u1(this, i7, gjVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        showDialog(t1Var);
    }

    public final void Yc(org.telegram.messenger.gj gjVar, boolean z10) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new di.p6(this, gjVar, z10, 14));
    }

    public final boolean Z6() {
        boolean z10;
        TLRPC.ChatFull chatFull = this.f46181r8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
            ug.k0.x1(this, this.S1, this.T1, this.f46103l6, false);
        }
        return z10;
    }

    public final boolean Z9() {
        int i7 = this.f46036g4;
        if (((i7 == 0 && this.f46191s4 == 0) || i7 == 3) && this.f46103l6 == getUserConfig().e() && !Y9()) {
            return true;
        }
        return false;
    }

    public final void Za(int i7, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.fz0 fz0Var;
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
                    vf.c.r(getParentActivity(), Uri.parse(str), true, true, na(r1Var, characterStyle));
                    return;
                } else if (i7 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f46258x8 == 0) {
                        z13 = true;
                    }
                    vf.c.r(parentActivity, parse, z13, true, na(r1Var, characterStyle));
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f46258x8 == 0) {
                        z13 = true;
                    }
                    vf.c.r(parentActivity2, parse2, z13, true, na(r1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i7 == 0 && i7 != 2) {
                if (i7 == 1) {
                    org.telegram.ui.Components.c5.o0(this, str, true, true, false, false, na(r1Var, characterStyle), null, this.Ba);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.u41) && (fz0Var = ((org.telegram.ui.Components.u41) characterStyle).f40259a) != null && (fz0Var.f35337a & 1024) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.c5.o0(this, str, true, true, true, z11, na(r1Var, characterStyle), null, this.Ba);
            }
        }
        if (getMessagesController().f25863h4.contains(K0)) {
            org.telegram.messenger.az sendMessagesHelper = getSendMessagesHelper();
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
        if (!(characterStyle instanceof org.telegram.ui.Components.u41)) {
        }
        z11 = false;
        org.telegram.ui.Components.c5.o0(this, str, true, true, true, z11, na(r1Var, characterStyle), null, this.Ba);
    }

    public final boolean Zb() {
        if (T9() && this.F5 == null && this.H5 == null) {
            if (this.f46036g4 != 8 && T9() && this.f46005e != null) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25968t7.f(this.f46005e.f28434id, 1L);
                if (this.f46036g4 != 8) {
                    if (f10 != null) {
                        if (f10.closed && !org.telegram.messenger.v3.i(this.currentAccount, this.f46005e, f10)) {
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
            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.P6.f(gjVar.c1());
            if (bjVar != null) {
                ArrayList arrayList = bjVar.d;
                dj djVar = this.B0;
                if (djVar != null) {
                    djVar.V(bjVar);
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
            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.G6[0].get(gjVar.e1());
            if (z10) {
                gjVar.M1 = true;
                gjVar.H = true;
            }
            if (this.D0.O) {
                a0.h hVar = this.f46248wb;
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
                    kl klVar = this.D0;
                    klVar.g(klVar.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.M6.indexOf(gjVar3);
            if (indexOf2 >= 0) {
                kl klVar2 = this.D0;
                klVar2.g(klVar2.K + indexOf2);
            }
        }
    }

    public long a() {
        return this.f46103l6;
    }

    public final void a7(boolean z10) {
        if (this.f46027f7 == 0) {
            if (z10 && !this.f46039g7.isEmpty()) {
                this.f46027f7 = System.currentTimeMillis();
            } else {
                this.f46027f7 = 1L;
            }
            da();
            bj bjVar = this.A0;
            if (bjVar != null) {
                bjVar.invalidate();
            }
        }
    }

    public final org.telegram.ui.Components.pe0 a8(View view, org.telegram.ui.Components.oe0 oe0Var) {
        dh.c cVar;
        ui.d dVar;
        gh.a l10;
        pl plVar;
        org.telegram.ui.ActionBar.j5 simpleMenuOverlay = getSimpleMenuOverlay();
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
            cVar.f8411k = true;
            cVar.f8410j = T8();
            jh.k kVar = this.l1;
            bn bnVar = this.Aa;
            if (bnVar != null) {
                plVar = bnVar.f46111m1;
            } else {
                plVar = this.f46111m1;
            }
            cVar.h = kVar;
            cVar.f8409i = plVar;
            cVar.f8408g = this.F;
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
        return new org.telegram.ui.Components.pe0(getParentActivity(), view, oe0Var, simpleMenuOverlay, cVar2, dVar, l10, this.f46249x, this.Ba);
    }

    public final int a9(org.telegram.messenger.gj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.a9(org.telegram.messenger.gj):int");
    }

    public final boolean aa() {
        org.telegram.ui.Components.a21 a21Var = this.f46034g2;
        if (a21Var != null && a21Var.U && a21Var.f33280a.f57701f) {
            return true;
        }
        return false;
    }

    public final void ab(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.gj r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.gj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.ab(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.gj):void");
    }

    public final void ac() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.lc.b0(this).t(org.telegram.messenger.hd.N0(2131743588, null), this.Ba).j();
    }

    public final void ad() {
        org.telegram.ui.ActionBar.g1 g1Var;
        int i7;
        if (this.h != null) {
            return;
        }
        bj bjVar = this.A0;
        kj kjVar = this.X1;
        if ((kjVar != null && kjVar.J) || ((g1Var = this.f46041g9) != null && g1Var.isShowing())) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        bjVar.setImportantForAccessibility(i7);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29591og));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29620q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29472i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29454h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29385da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29585oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29476ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29567na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29532la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29514ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29494ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29370cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29446gg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29331ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29781yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29706uf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29743wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29724vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29519kg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ol));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29571nf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29678t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29736w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29801zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29333ag));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29719v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29700u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29624q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29604p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29584o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29513k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29549m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29475i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29493j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29326a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29588od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29458ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29440ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29404ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29463hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29518kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29499jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29551md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29332af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29535ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29800ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29780ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29798zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29761xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29778yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29742we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29705ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29722vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29685te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29703uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29666se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29683tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29648re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29664sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29629qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29646rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29609pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29552me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29589oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29550mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29517ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29534lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29498je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29515kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29480ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29369cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29462he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29444ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29405ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29442gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29388de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29371ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29496jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29407ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29351be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29478ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29460hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29570nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29799zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29779yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29760xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29741wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29625qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29641r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29797zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29723vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29704ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29665sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29647rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29628qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29608pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29516kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29497jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29387dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29330ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29663sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29644ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29583o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29565n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29548m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29530l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29512k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29492j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29474i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29443gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29424fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29605pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
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
        org.telegram.messenger.yy d = org.telegram.messenger.yy.d(messageMedia, this.f46103l6, this.F5, this.f46114m4, null, null, z10, i10);
        d.K = Y8();
        d.Q = j3;
        d.R = j9();
        d.T = this.f46268y5;
        getSendMessagesHelper().r0(d);
        if (this.f46036g4 == 0) {
            ra(false);
        }
        if (i7 == 0 || i7 == 1) {
            L6();
        }
        if (this.I5) {
            this.f46065i6 = true;
        }
    }

    public final void b7(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.gj gjVar2 = this.H5;
        if (gjVar2 != null && (message = gjVar2.f24213k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46255x5 != null && gjVar2 != null) {
            int i7 = gjVar2.D;
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
                            if (org.telegram.messenger.kj.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                if (z10) {
                    this.Y5 = null;
                    rj rjVar = this.f45950a0;
                    if (rjVar != null) {
                        rjVar.N3 = null;
                        rjVar.O3 = true;
                    }
                    org.telegram.messenger.kj kjVar = this.f46255x5;
                    if (kjVar != null) {
                        int i10 = this.currentAccount;
                        CharSequence fieldText = rjVar.getFieldText();
                        org.telegram.messenger.gj gjVar3 = this.F5;
                        if (gjVar3 == this.f46114m4) {
                            gjVar = null;
                        } else {
                            gjVar = gjVar3;
                        }
                        kjVar.e(i10, null, fieldText, gjVar, this.D5, this.H5);
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
            this.f45966b1.addView(this.M2, c8.ma.o(-1, 48));
            this.f45966b1.i(1, this.M2);
            this.f45966b1.h(this.M2);
            this.M2.setOnClickListener(new oe(this, 17));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            org.telegram.ui.Components.se0 se0Var = new org.telegram.ui.Components.se0(getParentActivity(), this.Ba);
            this.O2 = se0Var;
            this.M2.addView(se0Var, c8.ma.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.We));
            this.U2.setTypeface(org.telegram.messenger.g0.o());
            this.M2.addView(this.U2, c8.ma.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i7 = 0; i7 < 2; i7++) {
                an anVar = new an(this, getParentActivity());
                an[] anVarArr = this.R2;
                anVarArr[i7] = anVar;
                anVar.setTextSize(14);
                org.telegram.ui.ActionBar.t6.X(anVarArr[i7], org.telegram.ui.ActionBar.m6.We, getResourceProvider());
                anVarArr[i7].setTypeface(org.telegram.messenger.g0.o());
                this.M2.addView(anVarArr[i7], c8.ma.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                pk pkVar = new pk(0, getParentActivity(), this);
                org.telegram.ui.ActionBar.m5[] m5VarArr = this.S2;
                m5VarArr[i7] = pkVar;
                pkVar.setTextSize(14);
                org.telegram.ui.ActionBar.t6.X(m5VarArr[i7], org.telegram.ui.ActionBar.m6.Xe, getResourceProvider());
                this.M2.addView(m5VarArr[i7], c8.ma.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
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
                    m5VarArr[i7].setVisibility(4);
                    q9VarArr[i7].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.f45953a3 = imageView;
            imageView.setImageResource(2131232299);
            ImageView imageView2 = this.f45953a3;
            int i10 = org.telegram.ui.ActionBar.m6.Ue;
            org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.s(imageView2, i10, resourceProvider, mode);
            ImageView imageView3 = this.f45953a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.f45953a3.setContentDescription(org.telegram.messenger.hd.N0(2131754722, null));
            this.f45953a3.setVisibility(4);
            this.f45953a3.setAlpha(0.0f);
            this.f45953a3.setScaleX(0.4f);
            this.f45953a3.setScaleY(0.4f);
            ImageView imageView4 = this.f45953a3;
            int i11 = org.telegram.ui.ActionBar.m6.f29755x7;
            org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i11) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.t6.g(i11, 25), getResourceProvider());
            this.M2.addView(this.f45953a3, c8.ma.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.f45953a3.setOnClickListener(new oe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231984);
            org.telegram.ui.ActionBar.t6.s(this.Y2, i10, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(org.telegram.messenger.hd.N0(2131752029, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.Ba);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(org.telegram.messenger.g0.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ve));
            this.M2.addView(this.Z2, c8.ma.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.t6.Q(this.Y2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i11) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)), null, org.telegram.ui.ActionBar.t6.g(i11, 25), getResourceProvider());
            this.M2.addView(this.Y2, c8.ma.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new oe(this, 19));
            fd(false);
        }
    }

    public final int b9() {
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        int i7 = 0;
        if (r4Var == null || r4Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i7 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(i7);
                if (g2Var != this && (g2Var instanceof bn) && ((bn) g2Var).f46103l6 == this.f46103l6) {
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
        org.telegram.ui.Components.a21 a21Var = this.f46034g2;
        if (a21Var != null) {
            return a21Var.f33284c;
        }
        if (org.telegram.messenger.v3.c0(this.f46005e) && O6()) {
            return true;
        }
        return false;
    }

    public final void bb(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.bb(java.util.ArrayList, boolean):void");
    }

    public final void bc(org.telegram.ui.Cells.r1 r1Var) {
        if (getParentActivity() != null && r1Var != null && r1Var.f31696z9 != null && r1Var.getPrimaryMessageObject() != null && r1Var.getPrimaryMessageObject().f24213k != null && r1Var.getPrimaryMessageObject().f24213k.via_business_bot_id != 0 && !getMessagesController().h7.getBoolean("bizbothint", false)) {
            getMessagesController().h7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f46221ub) {
                this.f46221ub = true;
                if (this.O1 != null) {
                    return;
                }
                hi.l3 l3Var = new hi.l3(getParentActivity(), 3);
                l3Var.r(true);
                l3Var.L = Layout.Alignment.ALIGN_NORMAL;
                l3Var.d = -1L;
                l3Var.U = true;
                l3Var.f14972e = true;
                l3Var.k(true);
                l3Var.s(8.0f);
                this.O1 = l3Var;
                l3Var.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748405, null)));
                this.O1.l(this.L);
                hi.l3 l3Var2 = this.O1;
                l3Var2.h = hi.l3.a(l3Var2.getText(), this.O1.getTextPaint());
                this.f46111m1.addView(this.O1, c8.ma.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f46111m1.post(new u8(20, this, r1Var));
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
        if (this.f46036g4 == 1) {
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
        if (this.f46035g3 == null && getParentActivity() != null) {
            uj ujVar = new uj(this, getParentActivity(), 1);
            this.f46035g3 = ujVar;
            ujVar.setClickable(false);
            this.f46035g3.setWillNotDraw(false);
            this.f46084jd.h(4, false, false);
            this.f46035g3.setClipToPadding(false);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), true, true, true);
            this.j3 = o6Var;
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
            o6Var.b(0.25f, 280L, nrVar);
            this.j3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.j3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(this.j3, org.telegram.ui.ActionBar.m6.qf, getResourceProvider());
            this.j3.setGravity(3);
            this.f46035g3.addView(this.j3, c8.ma.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.f46035g3, c8.ma.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(getParentActivity(), true, false, true);
            this.f46088k3 = o6Var2;
            o6Var2.b(0.0f, 420L, nrVar);
            this.f46088k3.setScaleProperty(0.7f);
            this.f46088k3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f46088k3.setGravity(5);
            this.f46088k3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(this.f46088k3, org.telegram.ui.ActionBar.m6.f29581o6, getResourceProvider());
            org.telegram.ui.Components.o6 o6Var3 = this.f46088k3;
            if (this.f46045gd.f57701f) {
                i7 = 2131745622;
            } else {
                i7 = 2131745621;
            }
            o6Var3.setText(org.telegram.messenger.hd.N0(i7, null));
            org.telegram.ui.Components.o6 o6Var4 = this.f46088k3;
            o6Var4.f38118n = false;
            o6Var4.setPadding(org.telegram.messenger.g0.L(15.33f), 0, org.telegram.messenger.g0.L(15.33f), 0);
            this.f46088k3.setOnClickListener(new oe(this, 2));
            this.f46088k3.setAlpha(0.5f);
            this.f46088k3.setClickable(false);
            this.f46035g3.addView(this.f46088k3, c8.ma.e(-2, -1, 117));
            org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(getParentActivity(), true, true, true);
            this.f46100l3 = o6Var5;
            o6Var5.setGravity(17);
            this.f46100l3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(this.f46100l3, org.telegram.ui.ActionBar.m6.f29667sf, getResourceProvider());
            this.f46100l3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            org.telegram.ui.Components.o6 o6Var6 = this.f46100l3;
            int i11 = org.telegram.ui.ActionBar.m6.f29381d6;
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.m6.f29473i6;
            org.telegram.ui.ActionBar.t6.Q(o6Var6, org.telegram.ui.ActionBar.m6.i0(themedColor, org.telegram.ui.ActionBar.m6.w(themedColor2, getThemedColor(i12))), org.telegram.ui.ActionBar.t6.M(i11), org.telegram.ui.ActionBar.t6.p(i11, i12), getResourceProvider());
            org.telegram.ui.Components.o6 o6Var7 = this.f46100l3;
            if (this.D0.O) {
                i10 = 2131745687;
            } else {
                i10 = 2131745670;
            }
            o6Var7.setText(org.telegram.messenger.hd.N0(i10, null));
            this.f46100l3.setOnClickListener(new oe(this, 3));
            this.f46100l3.setVisibility(8);
            this.f46100l3.setAlpha(0.0f);
            this.f46035g3.addView(this.f46100l3, c8.ma.e(-1, -1, 119));
            TLRPC.Chat chat = this.f46005e;
            if (chat != null && ((!org.telegram.messenger.v3.T(chat) || this.f46005e.megagroup) && this.f46036g4 != 7 && !org.telegram.messenger.v3.p0(this.f46005e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f46062i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f46062i3.setImageResource(2131232419);
                org.telegram.ui.ActionBar.t6.s(this.f46062i3, org.telegram.ui.ActionBar.m6.f29610pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f46062i3;
                int i13 = org.telegram.ui.ActionBar.m6.f29794z8;
                org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i13), getResourceProvider());
                this.f46035g3.addView(this.f46062i3, c8.ma.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f46062i3.setOnClickListener(new oe(this, 4));
                this.f46062i3.setContentDescription(org.telegram.messenger.hd.N0(2131754779, null));
            }
            if (this.f46036g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f46049h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f46049h3.setImageResource(2131232078);
                org.telegram.ui.ActionBar.t6.s(this.f46049h3, org.telegram.ui.ActionBar.m6.f29610pf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f46049h3;
                int i14 = org.telegram.ui.ActionBar.m6.f29794z8;
                org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
                this.f46035g3.addView(this.f46049h3, c8.ma.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f46049h3.setOnClickListener(new oe(this, 5));
                this.f46049h3.setContentDescription(org.telegram.messenger.hd.N0(2131748872, null));
            }
        }
    }

    public final int c9() {
        return Math.max(this.f45997d5, this.f46011e5);
    }

    public final boolean ca() {
        if (this.m0 != null && ga()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.g11 g11Var;
        wh.i iVar;
        org.telegram.ui.Components.de deVar;
        if ((this.f46036g4 != 5 || (!this.M6.isEmpty() && this.f46191s4 != 0)) && (((g11Var = this.f46122n0) == null || (g11Var.f35391y <= 0.0f && !g11Var.f35370c0)) && !this.f46272y9 && !this.f46045gd.f57701f && this.K9)) {
            rj rjVar = this.f45950a0;
            if (!rjVar.f32736v3 && ((!rjVar.f32598d1 || (deVar = rjVar.f32615f1) == null || deVar.getVisibility() != 0) && ((!rjVar.H0() || !rjVar.m0.f19100w) && !org.telegram.ui.ActionBar.g2.hasSheets(rjVar.F3) && this.f46095ka == 0.0f && ((iVar = this.f46220ua) == null || !iVar.a())))) {
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
                    this.f46129n8 = q02.getAbsolutePath();
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
                if (org.telegram.messenger.v3.T(this.f46005e) && (tL_chatBannedRights = this.f46005e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                qm0 qm0Var = new qm0(0, z10, true, this);
                if (this.f46036g4 == 9) {
                    qm0Var.H = 1;
                    qm0Var.I = true;
                } else {
                    TLRPC.Chat chat = this.f46005e;
                    if (chat != null && !org.telegram.messenger.v3.N(chat) && this.f46005e.slowmode_enabled) {
                        qm0Var.H = 10;
                        qm0Var.I = true;
                    } else {
                        org.telegram.messenger.gj gjVar = this.H5;
                        if (gjVar != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (gjVar == null) {
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
                        this.f46129n8 = s02.getAbsolutePath();
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
                this.W0.addListener(new bi.g7(29, this, z10));
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
            org.telegram.ui.Components.m80 m80Var = this.G0;
            if (z10 || !this.F0) {
                i11 = 4;
            }
            m80Var.setVisibility(i11);
            wj wjVar5 = this.E0;
            if (!z10 && !this.F0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            wjVar5.setScaleX(f12);
            org.telegram.ui.Components.m80 m80Var2 = this.G0;
            if (!z10 && this.F0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            m80Var2.setScaleX(f13);
            wj wjVar6 = this.E0;
            if (!z10 && !this.F0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            wjVar6.setScaleY(f14);
            org.telegram.ui.Components.m80 m80Var3 = this.G0;
            if (!z10 && this.F0) {
                f17 = 1.0f;
            }
            m80Var3.setScaleY(f17);
            wj wjVar7 = this.E0;
            if (!z10 && !this.F0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            wjVar7.setAlpha(f15);
            org.telegram.ui.Components.m80 m80Var4 = this.G0;
            if (!z10 && this.F0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            m80Var4.setAlpha(f16);
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
        if (!this.f46254x4 && (i7 = this.f46036g4) != 3 && i7 != 5 && i7 != 8) {
            return 0L;
        }
        return this.f46191s4;
    }

    public final void d7(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.t3 t3Var = this.f46141o8;
        if (t3Var != null && (((str = this.f46271y8) != null || this.f46283z8) && this.f46026f6)) {
            org.telegram.ui.Components.voip.b2.l(this.f46005e, str, this.f46167q8, Boolean.valueOf(!t3Var.f26950b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f46271y8 = null;
            this.f46283z8 = false;
            return;
        }
        if (this.f46271y8 != null && z10 && (chatFull = this.f46181r8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.f3.n(null, 2131748720, org.telegram.ui.Components.lc.b0(this), 2131624080, 36);
            this.f46271y8 = null;
        }
        this.f46154p8 = !this.f46026f6;
    }

    public final void d8() {
        if (this.f46189s2 == null && this.I1 == null) {
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(getParentActivity(), this.Ba);
            this.f46175r2 = yzVar;
            yzVar.setViewType(7);
            org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(getParentActivity(), this.f46175r2, 1, null);
            this.f46189s2 = nv0Var;
            nv0Var.setClickable(true);
            this.f46189s2.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
            this.f46189s2.setVisibility(8);
            this.f46189s2.addView(this.f46175r2, 0);
            this.f46189s2.e(true, false);
            this.Z3.addView(this.f46189s2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.h30 h30Var = new org.telegram.ui.Components.h30(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.I1 = h30Var;
            h30Var.setOnHashtagClickListener(new me(this, 3));
            this.I1.setOnScrollListener(new g3(this, 6));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            G7();
            E7();
        }
    }

    public final int d9() {
        if (this.f46036g4 == 5) {
            return (int) this.f46191s4;
        }
        return 0;
    }

    public final boolean da() {
        boolean z10;
        boolean z11;
        float f10;
        FrameLayout frameLayout;
        if (!this.f45978c && !this.d && this.f46019f == null && this.A0 != null && org.telegram.messenger.cz.c()) {
            if (this.Ib == null) {
                this.Ib = Boolean.valueOf(org.telegram.messenger.qc.e(360928));
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
                if ((!z12 || ((this.f45999d7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.Y6 && f11 > this.P9 && (!arrayList.isEmpty() ? i10 != 0 : this.Hb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f46021f1) == null || frameLayout.getVisibility() != 0 || this.f46021f1.getChildCount() <= 0) {
                    if (!z10 && this.f46027f7 == 0) {
                        a7(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.cz.o() != 0 && !this.f46143oa && this.fragmentBeginToShow) {
                        if (z10 && this.f46027f7 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable c10 = this.Ba.c();
                        pl plVar = this.f46111m1;
                        if (plVar != null) {
                            c10 = plVar.getBackgroundImage();
                        }
                        if (c10 instanceof org.telegram.ui.Components.cb0) {
                            org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) c10;
                            if (cb0Var.N != z11) {
                                if (!z11) {
                                    cb0Var.c();
                                }
                                float f12 = 1.0f;
                                if (!z11 && cb0Var.N) {
                                    cb0Var.h = 1.0f - ((cb0Var.h - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
                                    cb0Var.d = true;
                                }
                                cb0Var.N = z11;
                                if (z11) {
                                    f12 = 1.5f;
                                }
                                cb0Var.M = f12;
                                cb0Var.y();
                            } else if (z11) {
                                cb0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.f46027f7 != 0 && System.currentTimeMillis() - this.f46027f7 <= 200)) {
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
        String N0 = org.telegram.messenger.hd.N0(2131752701, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131752702, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751394, null), new ve(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, getResourceProvider());
        }
    }

    public final void dd() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f46264y1 == null) {
            return;
        }
        boolean z13 = false;
        if (this.D9 && !A9() && !this.f45950a0.V0() && !this.mb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f46052h6 != 0 && SystemClock.elapsedRealtime() >= this.f46052h6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f46276z1 = false;
        } else {
            this.T7 = 0;
            this.B6 = 0;
            z11 = true;
        }
        rj rjVar = this.f45950a0;
        if (rjVar != null && rjVar.a()) {
            z12 = true;
        } else {
            z12 = false;
        }
        lh.h hVar = this.f46264y1;
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
        org.telegram.ui.ActionBar.r4 r4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull d2;
        TLRPC.User c22;
        boolean z10;
        TLRPC.User c23;
        vi viVar;
        rj rjVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.ot editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.kw0 kw0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        rj rjVar2;
        bn bnVar = this;
        if (i7 == org.telegram.messenger.ls.D) {
            bnVar.t8(objArr);
            return;
        }
        if (i7 == org.telegram.messenger.ls.f25347m4) {
            bj bjVar = bnVar.A0;
            if (bjVar != null) {
                bjVar.g1();
            }
            org.telegram.ui.Components.ti tiVar = bnVar.f46081ja;
            if (tiVar != null) {
                tiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            int i12 = 0;
            if (i7 == org.telegram.messenger.ls.I) {
                if (((Integer) objArr[0]).intValue() == bnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        bnVar.finishFragment();
                        b.b(bnVar.currentAccount);
                    }
                }
            } else if (i7 == org.telegram.messenger.ls.f25395u3) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null && n2Var.isShowing()) {
                    bnVar.Y1.a(true);
                }
                if (z11 && (rjVar2 = bnVar.f45950a0) != null && rjVar2.S0()) {
                    bnVar.f45950a0.K0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f28454id = stickerSet2.f28461id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = bnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.kw0) && (tL_messages_stickerSet = (kw0Var = (org.telegram.ui.Components.kw0) dialog).N1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f28461id == stickerSet2.f28461id) {
                            kw0Var.N1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (kw0Var.f37018o1 != null) {
                                kw0Var.b1();
                                kw0Var.a1();
                                kw0Var.f37018o1.f();
                            }
                            kw0Var.Z0();
                            org.telegram.messenger.si.d0(kw0Var.f30173a).t1(kw0Var.N1);
                            kw0Var.K0();
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
                                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(kw0Var.f30179c, bnVar.resourceProvider);
                                    if (z12) {
                                        i11 = 2131744601;
                                    } else {
                                        i11 = 2131744602;
                                    }
                                    org.telegram.ui.Components.gc q10 = lcVar.q(document, org.telegram.messenger.hd.a0(null, null, i11, stickerSet2.title));
                                    q10.f35527j = 2750;
                                    q10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.kw0 kw0Var2 = new org.telegram.ui.Components.kw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.f45950a0, bnVar.Ba);
                            final boolean z15 = z12;
                            bnVar = this;
                            kw0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    bn.Y0(bn.this, objArr, kw0Var2, z15, stickerSet2);
                                }
                            });
                            bnVar.showDialog(kw0Var2);
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.ls.f25342l4) {
                bj bjVar2 = bnVar.A0;
                if (bjVar2 != null) {
                    bjVar2.g1();
                }
                TextView textView = bnVar.f46023f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.m5 m5Var = bnVar.S2[i13];
                    if (m5Var != null) {
                        m5Var.invalidate();
                    }
                }
                kj kjVar = bnVar.X1;
                if (kjVar != null) {
                    kjVar.getListView().g1();
                }
                di.b1 b1Var = bnVar.f45954a4;
                if (b1Var != null) {
                    b1Var.g1();
                }
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                rj rjVar3 = bnVar.f45950a0;
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
            } else if (i7 == org.telegram.messenger.ls.T1) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i7 == org.telegram.messenger.ls.f25311g1) {
                Long l10 = (Long) objArr[0];
                if (bnVar.f46181r8 != null && (chat = bnVar.f46005e) != null && chat.f28434id == l10.longValue()) {
                    bnVar.f46181r8.online_count = ((Integer) objArr[1]).intValue();
                    vi viVar2 = bnVar.f46147p1;
                    if (viVar2 != null) {
                        viVar2.m();
                        bnVar.f46147p1.n(false);
                    }
                }
            } else if (i7 == org.telegram.messenger.ls.G) {
                if (((Long) objArr[0]).longValue() == bnVar.f46103l6 && (rjVar = bnVar.f45950a0) != null) {
                    rjVar.x2(false, true);
                }
            } else if (i7 == org.telegram.messenger.ls.f25336k3) {
                rj rjVar4 = bnVar.f45950a0;
                if (rjVar4 != null) {
                    rjVar4.y2();
                }
            } else if (i7 == org.telegram.messenger.ls.f25371r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i14 = org.telegram.messenger.np.I8;
                int i15 = intValue & 1;
                if (i15 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (bnVar.f46005e != null) {
                        TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(bnVar.f46005e.f28434id));
                        if (O0 != null) {
                            bnVar.f46005e = O0;
                        }
                    } else if (bnVar.f46019f != null && (c22 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46019f.f28583id))) != null) {
                        bnVar.f46019f = c22;
                    }
                    bnVar.wd(true);
                }
                if (!bnVar.fa() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (bnVar.f46005e != null && (viVar = bnVar.f46147p1) != null) {
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
                if ((intValue & 8192) != 0 && bnVar.f46005e != null) {
                    bnVar.W9();
                    TLRPC.Chat O02 = bnVar.getMessagesController().O0(Long.valueOf(bnVar.f46005e.f28434id));
                    if (O02 != null) {
                        bnVar.f46005e = O02;
                        bnVar.W9();
                        z10 = !bnVar.fa();
                        bnVar.Pc(false);
                        rj rjVar5 = bnVar.f45950a0;
                        if (rjVar5 != null) {
                            rjVar5.D1(bnVar.currentAccount, bnVar.f46103l6);
                        }
                        org.telegram.messenger.n6 n6Var = bnVar.T3;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                }
                TLRPC.User user = bnVar.f46019f;
                if (user != null && org.telegram.messenger.p10.v(user) && (c23 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46019f.f28583id))) != null) {
                    bnVar.f46019f = c23;
                }
                if (bnVar.f46034g2 != null) {
                    boolean O6 = bnVar.O6();
                    org.telegram.ui.Components.a21 a21Var = bnVar.f46034g2;
                    if (a21Var.f33284c != O6) {
                        a21Var.setTabsEnabled(O6);
                        if (bnVar.f46122n0 != null && !bnVar.ga()) {
                            bnVar.f46122n0.e();
                        }
                        bnVar.Dd();
                    }
                }
                vi viVar3 = bnVar.f46147p1;
                if (viVar3 != null && z10) {
                    viVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    bnVar.zd(true);
                }
                org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46072j0;
                if (q0Var != null) {
                    if (org.telegram.messenger.v3.T(bnVar.f46005e) && !org.telegram.messenger.v3.p0(bnVar.f46005e)) {
                        long j10 = bnVar.f46005e.linked_monoforum_id;
                        if (j10 != 0 && org.telegram.messenger.v3.z(bnVar.currentAccount, 24, -j10)) {
                            z13 = true;
                        }
                    }
                    q0Var.R(70, z13);
                }
            } else if (i7 == 1) {
                org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!bnVar.mb) {
                    if (longValue == bnVar.f46103l6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i16 = bnVar.f46036g4;
                        if (intValue2 != i16 && i16 != 3 && i16 != 8) {
                            if (i16 != 1 && intValue2 == 1 && !bnVar.isPaused && LaunchActivity.T() == bnVar && bnVar.f46255x5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.gj) arrayList.get(0)).e1() < 0) {
                                int e12 = ((org.telegram.messenger.gj) arrayList.get(0)).e1();
                                if (((org.telegram.messenger.gj) arrayList.get(0)).f24213k != null && ((org.telegram.messenger.gj) arrayList.get(0)).f24213k.video_processing_pending) {
                                    z14 = true;
                                }
                                bnVar.Ma(e12, z14);
                            }
                            org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !bnVar.Yc && bnVar.f46019f != null && bnVar.a() != bnVar.getUserConfig().e() && (d2 = bnVar.getMessagesController().d2(bnVar.f46019f.f28583id)) != null && d2.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i12);
                                    if (gjVar3.e1() > 0 && !gjVar3.N3() && !gjVar3.r4()) {
                                        bnVar.Yc = true;
                                        bnVar.getMessagesController().c3(bnVar.f46019f, bnVar.classGuid, true, null);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            bnVar.bb(arrayList, true);
                        }
                    } else if (org.telegram.messenger.v3.T(bnVar.f46005e) && !bnVar.f46005e.megagroup && (chatFull = bnVar.f46181r8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) arrayList.get(i17);
                            if (gjVar4.e4()) {
                                bnVar.N6.put(gjVar4.e1(), gjVar4);
                            }
                        }
                        bnVar.L7();
                    }
                    org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i7 == org.telegram.messenger.ls.F) {
                bnVar.la(true);
            } else if (i7 == org.telegram.messenger.ls.E) {
                bnVar.G6();
            } else if (i7 == org.telegram.messenger.ls.f25384t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == bnVar.f46103l6) {
                        bnVar.finishFragment();
                    }
                } else if (org.telegram.messenger.g0.Q1() && (r4Var = bnVar.parentLayout) != null && r4Var.getFragmentStack().size() > 1) {
                    bnVar.finishFragment();
                } else {
                    bnVar.removeSelfFromStack(true);
                }
            } else if (i7 == org.telegram.messenger.ls.f25391u) {
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
                int i18 = org.telegram.messenger.ls.B;
                SparseArray[] sparseArrayArr = bnVar.G6;
                if (i7 == i18) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = bnVar.f46005e;
                    if (chat2 != null && chat2.f28434id == longValue3 && (gjVar2 = (org.telegram.messenger.gj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && gjVar2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (bnVar.I5) {
                            hh hhVar = bnVar.D4;
                            if (hhVar != null) {
                                org.telegram.messenger.g0.r(hhVar);
                                bnVar.D4 = null;
                            }
                            gjVar2.f24213k.replies.read_max_id = intValue3;
                        } else {
                            hh hhVar2 = new hh(bnVar, gjVar2, intValue3);
                            bnVar.D4 = hhVar2;
                            org.telegram.messenger.g0.h3(hhVar2, 500L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = bnVar.f46005e;
                    if (chat3 != null && chat3.f28434id == longValue4 && (gjVar = (org.telegram.messenger.gj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = gjVar.f24213k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer B1 = bnVar.getMessagesController().B1(org.telegram.messenger.v3.M(bnVar.f46005e, bnVar.getMessagesController().P0(bnVar.f46005e.f28434id), false));
                            int size3 = gjVar.f24213k.replies.recent_repliers.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.gj.B1(gjVar.f24213k.replies.recent_repliers.get(i19)) == org.telegram.messenger.gj.B1(B1)) {
                                    gjVar.f24213k.replies.recent_repliers.remove(i19);
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            gjVar.f24213k.replies.recent_repliers.add(0, B1);
                        }
                        TLRPC.MessageReplies messageReplies2 = gjVar.f24213k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i20 = org.telegram.messenger.ls.A;
                    int i21 = org.telegram.messenger.ls.f25425z;
                    if ((i7 == i21 || i7 == i20) && bnVar.f46103l6 == ((Long) objArr[0]).longValue()) {
                        if (i7 == i21) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i7 == i20) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = bnVar.f46191s4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i22 = bnVar.A4;
                            ArrayList arrayList2 = bnVar.M6;
                            if (intValue4 > i22) {
                                bnVar.A4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i23 = 0; i23 < size4; i23++) {
                                    org.telegram.messenger.gj gjVar5 = (org.telegram.messenger.gj) arrayList2.get(i23);
                                    int e13 = gjVar5.e1();
                                    if (!gjVar5.N3() && e13 > 0 && e13 <= bnVar.A4) {
                                        if (!gjVar5.F4()) {
                                            break;
                                        }
                                        gjVar5.I5();
                                        kl klVar = bnVar.D0;
                                        if (klVar != null) {
                                            klVar.M(gjVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > bnVar.B4) {
                                bnVar.B4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    org.telegram.messenger.gj gjVar6 = (org.telegram.messenger.gj) arrayList2.get(i24);
                                    int e14 = gjVar6.e1();
                                    if (gjVar6.N3() && e14 > 0 && e14 <= bnVar.B4) {
                                        if (!gjVar6.F4()) {
                                            break;
                                        }
                                        gjVar6.I5();
                                        kl klVar2 = bnVar.D0;
                                        if (klVar2 != null) {
                                            klVar2.R(gjVar6, false, false);
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
            n2Var.f40378e2.d0(false);
            this.Y1.L();
            this.Y1.f40378e2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.ya && !(dialog instanceof ki.s2) && super.dismissDialogOnPause(dialog)) {
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
        if (this.N1 == null && org.telegram.messenger.v3.n0(this.f46005e) && (P0 = getMessagesController().P0(this.f46005e.f28434id)) != null && this.f45950a0 != null && getParentActivity() != null && (stickerSet = P0.emojiset) != null) {
            vj vjVar = this.f45994d1;
            if (vjVar == null || vjVar.getVisibility() != 0) {
                org.telegram.ui.Components.n30 n30Var = org.telegram.ui.Components.n30.f37757n;
                if (n30Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (a02 = getMediaDataController().a0(stickerSet)) != null && !a02.documents.isEmpty()) {
                        j3 = a02.documents.get(0).f28440id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        n30Var.b();
                        hi.l3 l3Var = new hi.l3(getParentActivity(), 3);
                        this.N1 = l3Var;
                        l3Var.k(true);
                        this.N1.r(true);
                        hi.l3 l3Var2 = this.N1;
                        l3Var2.L = Layout.Alignment.ALIGN_CENTER;
                        l3Var2.s(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(j3, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.v(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.N0(2131749249, null), spannableStringBuilder, "%s"));
                        hi.l3 l3Var3 = this.N1;
                        l3Var3.h = hi.l3.a(l3Var3.getText(), this.N1.getTextPaint());
                        hi.l3 l3Var4 = this.N1;
                        l3Var4.d = -1L;
                        l3Var4.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
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
        if (viewGroup != null && viewGroup != this.f46111m1) {
            viewGroup.removeView(this.J8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.f46111m1.addView(this.J8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.g0.f3(ba(), S9()), org.telegram.messenger.g0.f3(ba(), S9())));
        }
        this.J8.setTag(null);
        this.L8.setDrawingReady(false);
        return this.M8;
    }

    public final long e9() {
        if (this.f46036g4 == 3) {
            return this.f46191s4;
        }
        return 0L;
    }

    public final boolean ea() {
        if (getUserConfig().e() == a() && !getMessagesController().I1().f26503b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final boolean eb(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f46258x8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f46019f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f46258x8 == this.f46103l6) {
            this.f46258x8 = 0L;
            this.f45950a0.setFieldText(str);
            return true;
        }
        getMediaDataController().V1(this.f46258x8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((g2Var instanceof bn) && ((bn) g2Var).f46103l6 == this.f46258x8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.n5.C(this.f46258x8)) {
                bundle.putInt("enc_id", (int) (this.f46258x8 & 4294967295L));
            } else if (org.telegram.messenger.n5.E(this.f46258x8)) {
                bundle.putLong("user_id", this.f46258x8);
            } else {
                bundle.putLong("chat_id", -this.f46258x8);
            }
            I6();
            presentFragment(new bn(bundle), true);
        }
        return true;
    }

    public final void ec() {
        TLRPC.Chat chat = this.f46005e;
        if (chat != null) {
            if (org.telegram.messenger.v3.n0(chat)) {
                if (org.telegram.messenger.v3.N(this.f46005e)) {
                    m40 m40Var = new m40(a());
                    m40Var.m0 = this;
                    presentFragment(m40Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.v3.w(1, this.f46005e)) {
                qc qcVar = new qc(a());
                qcVar.m0 = this;
                presentFragment(qcVar);
                return;
            } else {
                return;
            }
        }
        this.ya = new org.telegram.ui.Components.np(this, this.Ba);
        this.A0.setOnInterceptTouchListener(new org.telegram.messenger.fd(27));
        Pb(this.f46111m1, false);
        showDialog(this.ya, new ke(this, 1));
    }

    public final void ed() {
        lh.h hVar = this.f46264y1;
        wi wiVar = this.f46236w;
        if (hVar != null) {
            this.f46264y1.setTranslationY((((-wiVar.d()) - this.U.getInputBubbleHeight()) - t9(org.telegram.ui.Components.w11.f41626c)) - org.telegram.messenger.g0.L(13.0f));
        }
        if (this.f46188s1 != null) {
            this.f46188s1.setTranslationY((-wiVar.d()) - org.telegram.messenger.g0.L(16.0f));
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7() {
        ArrayList arrayList;
        int i7;
        if (this.f46132nb) {
            int i10 = -1;
            int i11 = 0;
            long j3 = 0;
            while (true) {
                arrayList = this.M6;
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
                    arrayList3.add((org.telegram.messenger.gj) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void f8() {
        if (this.f46111m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new ai.m0(2, getParentActivity(), this);
            M9();
            this.Z1.setClickable(true);
            this.f45966b1.addView(this.Z1, c8.ma.o(-1, 44));
            this.f45966b1.i(2, this.Z1);
            this.f45966b1.h(this.Z1);
            TextView textView = new TextView(getParentActivity());
            this.f45981c2 = textView;
            int i7 = org.telegram.ui.ActionBar.m6.f29622q7;
            org.telegram.ui.ActionBar.t6.U(textView, i7, getResourceProvider());
            TextView textView2 = this.f45981c2;
            float L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.t6.Q(textView2, org.telegram.ui.ActionBar.m6.Y(L, getThemedColor(i7) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.t6.g(i7, 25), getResourceProvider());
            this.f45981c2.setTag(Integer.valueOf(i7));
            this.f45981c2.setTextSize(1, 14.0f);
            this.f45981c2.setTypeface(org.telegram.messenger.g0.o());
            this.f45981c2.setSingleLine(true);
            this.f45981c2.setMaxLines(1);
            this.f45981c2.setGravity(17);
            this.Z1.addView(this.f45981c2, c8.ma.e(-1, -1, 51));
            this.f45981c2.setOnClickListener(new oe(this, 13));
            org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(getParentActivity(), this.Ba);
            this.f46061i2 = m80Var;
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.Xe, getResourceProvider());
            this.f46061i2.setTextSize(1, 13.3f);
            this.f46061i2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.t6.G(this.f46061i2, org.telegram.ui.ActionBar.m6.Zl, getResourceProvider());
            this.f46061i2.setGravity(17);
            this.f46061i2.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            this.f45966b1.addView(this.f46061i2, c8.ma.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f45966b1.i(8, this.f46061i2);
            this.f45966b1.h(this.f46061i2);
            TextView textView3 = new TextView(getParentActivity());
            this.f45952a2 = textView3;
            int i10 = org.telegram.ui.ActionBar.m6.Ye;
            org.telegram.ui.ActionBar.t6.U(textView3, i10, getResourceProvider());
            this.f45952a2.setVisibility(8);
            this.f45952a2.setTextSize(1, 14.0f);
            this.f45952a2.setTypeface(org.telegram.messenger.g0.o());
            this.f45952a2.setSingleLine(true);
            this.f45952a2.setMaxLines(1);
            this.f45952a2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f45952a2.setGravity(17);
            TextView textView4 = this.f45952a2;
            int themedColor = getThemedColor(i10) & 436207615;
            int L3 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.t6.Q(textView4, org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.t6.g(i10, 25), getResourceProvider());
            this.Z1.addView(this.f45952a2, c8.ma.e(-1, -1, 51));
            this.f45952a2.setOnClickListener(new oe(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.d2 = textView5;
            org.telegram.ui.ActionBar.t6.U(textView5, i10, getResourceProvider());
            this.d2.setVisibility(8);
            this.d2.setTextSize(1, 14.0f);
            this.d2.setTypeface(org.telegram.messenger.g0.o());
            this.d2.setSingleLine(true);
            this.d2.setMaxLines(1);
            this.d2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.d2.setGravity(17);
            this.d2.setText(org.telegram.messenger.hd.N0(2131745888, null));
            org.telegram.ui.ActionBar.t6.Q(this.d2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i10) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.t6.g(i10, 25), getResourceProvider());
            this.f45966b1.addView(this.d2, c8.ma.o(-1, 48));
            this.f45966b1.i(4, this.d2);
            this.f45966b1.h(this.d2);
            this.d2.setOnClickListener(new oe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f46074j2 = imageView;
            imageView.setImageResource(2131231984);
            this.f46074j2.setContentDescription(org.telegram.messenger.hd.N0(2131752029, null));
            ImageView imageView2 = this.f46074j2;
            int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
            org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.O(getThemedColor(i11), 0, 0), null, org.telegram.ui.ActionBar.t6.M(i11), getResourceProvider());
            org.telegram.ui.ActionBar.t6.s(this.f46074j2, org.telegram.ui.ActionBar.m6.Ue, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f46074j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.f46074j2, c8.ma.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f46074j2.setOnClickListener(new oe(this, 16));
        }
    }

    public final int f9(int i7) {
        return (int) org.telegram.ui.Cells.c0.x((((this.A0.getMeasuredHeight() - this.Ya) - this.P9) - this.f46236w.e()) - org.telegram.messenger.g0.L(53.0f), i7, 2.0f, -org.telegram.messenger.g0.L(2.0f));
    }

    public final boolean fa() {
        if (this.f46114m4 != null) {
            return true;
        }
        return false;
    }

    public final void fb(int i7, org.telegram.messenger.gj gjVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.u(gjVar.f24213k.date, false);
        tL_message.f28455id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(gjVar.f24213k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(this.currentAccount, tL_message, false, false);
        gjVar2.D = 10;
        gjVar2.U = 1;
        gjVar2.f24219l0 = true;
        gjVar2.f24223m1 = q9(gjVar.X);
        this.D0.Q.add(i7, gjVar2);
    }

    public final void fc(boolean z10, org.telegram.messenger.gj gjVar, org.telegram.messenger.gj gjVar2, ArrayList arrayList, TLRPC.WebPage webPage, boolean z11, int i7, rm rmVar, boolean z12, long j3) {
        gc(z10, gjVar, gjVar2, arrayList, webPage, z11, i7, rmVar, z12, j3, null, true);
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
        if ((!fa() || this.f46254x4) && this.f45953a3 != null) {
            if (!this.f46038g6) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.V4.size() > 1 && !this.X2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.f45953a3.getTag() != null) {
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
                AnimatorSet animatorSet = this.f45968b3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f45968b3 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.f45953a3.setVisibility(0);
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
                    this.f45968b3 = animatorSet2;
                    ImageView imageView = this.f45953a3;
                    Property property = View.ALPHA;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.f45953a3;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.f45953a3;
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
                    this.f45968b3.setInterpolator(org.telegram.ui.Components.nr.h);
                    this.f45968b3.setDuration(360L);
                    this.f45968b3.addListener(new bl(this, z14, z15, z16));
                    this.f45968b3.start();
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
                    ImageView imageView11 = this.f45953a3;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.f45953a3;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.f45953a3;
                    if (z15) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.f45953a3;
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
                ImageView imageView16 = this.f45953a3;
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
                if (fa() && !this.f46254x4) {
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
        org.telegram.ui.ActionBar.g1 g1Var = this.f46041g9;
        if (g1Var != null) {
            g1Var.f28977e = false;
            P7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f46005e;
    }

    public final void g7(boolean z10) {
        jg.l1 l1Var;
        if (this.f45996d4 == 2 && (l1Var = this.f45969b4) != null) {
            String str = this.J3;
            hi.l lVar = l1Var.F;
            if (!TextUtils.equals(l1Var.f17600y, str)) {
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
                org.telegram.messenger.g0.r(lVar);
                fi.b6 b6Var = l1Var.E;
                if (b6Var != null && b6Var.I != 0) {
                    ConnectionsManager.getInstance(b6Var.f12085c).cancelRequest(b6Var.I, true);
                    b6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    l1Var.f17600y = str;
                    l1Var.E = new fi.b6(l1Var.f17596r, str2, trim);
                    if (z10) {
                        lVar.run();
                    } else {
                        org.telegram.messenger.g0.h3(lVar, 1000L);
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
        if (this.f46034g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                b8();
            }
            org.telegram.ui.Components.a21 a21Var = new org.telegram.ui.Components.a21(getParentActivity(), this, this.currentAccount, a(), O6(), getResourceProvider());
            this.f46034g2 = a21Var;
            a21Var.S = new zd(this, 6);
            a21Var.setSideMenuBackgroundDrawable(this.L.c(a21Var, c8.i0.p(this.Ba), false));
            org.telegram.ui.Components.a21 a21Var2 = this.f46034g2;
            a21Var2.setTopMenuBackgroundDrawable(this.L.c(a21Var2, c8.i0.p(this.Ba), false));
            this.f46034g2.setCurrentTopic(d());
            this.f46034g2.setOnNewTopicSelected(new zd(this, 7));
            this.f46034g2.setOnTopicSelected(new le(this, 0));
            this.f46034g2.setOnDialogSelected(new le(this, 1));
            int indexOfChild = this.f46111m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i7 = indexOfChild + 1;
            } else {
                i7 = 8;
            }
            this.f46111m1.addView(this.f46034g2, i7, c8.ma.f(-1.0f, -1, 51, 0, -org.telegram.messenger.g0.L(5.0f), 0, 0));
            this.f46034g2.p();
            Dd();
            kj kjVar = this.X1;
            if (kjVar != null) {
                kjVar.bringToFront();
            }
        }
    }

    public final int g9(org.telegram.messenger.gj gjVar) {
        return f9(W8(gjVar, !TextUtils.isEmpty(this.f46053h8))) - yb(gjVar);
    }

    public final boolean ga() {
        if (Z9()) {
            return getMessagesController().I1().e();
        }
        org.telegram.ui.Components.a21 a21Var = this.f46034g2;
        if (a21Var == null || !a21Var.f33280a.f57701f) {
            return false;
        }
        if (!org.telegram.messenger.v3.u0(this.f46005e)) {
            TLRPC.User user = this.f46019f;
            if (!org.telegram.messenger.p10.v(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void gb(Bundle bundle, org.telegram.messenger.gj gjVar) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.f46005e;
        if (chat != null && org.telegram.messenger.v3.V(chat) && !org.telegram.messenger.v3.p0(this.f46005e)) {
            TLRPC.Chat chat2 = this.f46005e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().O0(Long.valueOf(this.f46005e.linked_monoforum_id)) != null && !org.telegram.messenger.v3.z(this.currentAccount, 24, -this.f46005e.linked_monoforum_id)) {
                org.telegram.messenger.np messagesController = getMessagesController();
                TLRPC.Chat chat3 = this.f46005e;
                long j3 = chat3.f28434id;
                long j10 = chat3.linked_monoforum_id;
                ConcurrentHashMap concurrentHashMap = messagesController.f25840f;
                concurrentHashMap.put(Long.valueOf(j3), Long.valueOf(j10));
                concurrentHashMap.put(Long.valueOf(j10), Long.valueOf(j3));
                bundle.putLong("reply_to_channel_direct", -this.f46005e.linked_monoforum_id);
                return;
            }
        }
        TLRPC.Message message = gjVar.f24213k;
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

    public final void gc(boolean r34, org.telegram.messenger.gj r35, org.telegram.messenger.gj r36, java.util.ArrayList r37, org.telegram.tgnet.TLRPC.WebPage r38, boolean r39, int r40, org.telegram.ui.rm r41, boolean r42, long r43, org.telegram.messenger.lj r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.gc(boolean, org.telegram.messenger.gj, org.telegram.messenger.gj, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.rm, boolean, long, org.telegram.messenger.lj, boolean):void");
    }

    public final void gd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.gd(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.n4 getBackButtonState() {
        return org.telegram.ui.ActionBar.n4.f29810a;
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.p3.f29886c;
    }

    @Override
    public final org.telegram.messenger.t3 getGroupCall() {
        org.telegram.messenger.t3 t3Var;
        if (this.f46036g4 == 0 && (t3Var = this.f46141o8) != null && (t3Var.f26950b instanceof TLRPC.TL_groupCall)) {
            return t3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f46036g4 == 2) {
            ArrayList arrayList = this.M6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(80.0f) + W8((org.telegram.messenger.gj) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.Ba;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.m5 m5Var;
        org.telegram.ui.ActionBar.m5 m5Var2;
        View view;
        org.telegram.ui.Components.ty tyVar;
        org.telegram.ui.Components.ty tyVar2;
        org.telegram.ui.Components.ty tyVar3;
        org.telegram.ui.Components.ty tyVar4;
        org.telegram.ui.Components.ty tyVar5;
        org.telegram.ui.Components.ty tyVar6;
        org.telegram.ui.Components.ty tyVar7;
        org.telegram.ui.Components.ty tyVar8;
        org.telegram.ui.Components.ty tyVar9;
        org.telegram.ui.Components.ty tyVar10;
        org.telegram.ui.Components.ty tyVar11;
        View view2;
        org.telegram.ui.Components.ty tyVar12 = null;
        if (this.f46244w7) {
            return null;
        }
        int i7 = 0;
        if (this.f46260xa) {
            this.f46260xa = false;
            return null;
        }
        f6 f6Var = new f6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ge));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.He));
        Y9();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.F8));
        vi viVar = this.f46147p1;
        if (viVar != null) {
            m5Var = viVar.getTitleTextView();
        } else {
            m5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(m5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A8));
        vi viVar2 = this.f46147p1;
        if (viVar2 != null) {
            m5Var2 = viVar2.getTitleTextView();
        } else {
            m5Var2 = null;
        }
        int i10 = org.telegram.ui.ActionBar.m6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(m5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        vi viVar3 = this.f46147p1;
        if (viVar3 != null) {
            view = viVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(i10, view));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.m6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29756x8));
        org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.u4 u4Var2 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.u4 u4Var3 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.u4 u4Var4 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.u4 u4Var5 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.u4 u4Var6 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.u4 u4Var7 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.u4 u4Var8 = (org.telegram.ui.ActionBar.u4) getThemedDrawable("drawableMsgOutMediaSelected");
        if (u4Var != null) {
            Drawable[] drawableArr = u4Var.A;
            int i12 = org.telegram.ui.ActionBar.m6.f29681ta;
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, u4Var2.A, (org.telegram.ui.ActionBar.u6) null, i12));
            Drawable[] drawableArr2 = u4Var5.A;
            int i13 = org.telegram.ui.ActionBar.m6.f29682tb;
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.u6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, u4Var6.A, (org.telegram.ui.ActionBar.u6) null, i13));
        }
        if (!this.Ba.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{u4Var5, u4Var6}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29702ub));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{u4Var5, u4Var6}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29721vb));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{u4Var5, u4Var6}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29740wb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{u4Var7, u4Var8}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29461hd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29479id));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29329ac));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29350bc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29569nc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29607pc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29587oc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29445gf));
        this.Ba.getClass();
        uj ujVar = this.f46035g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i14 = org.telegram.ui.ActionBar.m6.Je;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ujVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ol));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qe));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Re));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29353bg));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29409eg));
        rj rjVar = this.f45950a0;
        int i15 = org.telegram.ui.ActionBar.m6.f29390dg;
        arrayList.add(new org.telegram.ui.ActionBar.v6(rjVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29426fg));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Uf));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45950a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Xf));
        rj rjVar2 = this.f45950a0;
        if (rjVar2 != null) {
            tyVar = rjVar2.getEmojiView();
        } else {
            tyVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Cf));
        rj rjVar3 = this.f45950a0;
        if (rjVar3 != null) {
            tyVar2 = rjVar3.getEmojiView();
        } else {
            tyVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar2, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Df));
        rj rjVar4 = this.f45950a0;
        if (rjVar4 != null) {
            tyVar3 = rjVar4.getEmojiView();
        } else {
            tyVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar3, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ef));
        rj rjVar5 = this.f45950a0;
        if (rjVar5 != null) {
            tyVar4 = rjVar5.getEmojiView();
        } else {
            tyVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar4, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Gf));
        rj rjVar6 = this.f45950a0;
        if (rjVar6 != null) {
            tyVar5 = rjVar6.getEmojiView();
        } else {
            tyVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar5, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Hf));
        rj rjVar7 = this.f45950a0;
        if (rjVar7 != null) {
            tyVar6 = rjVar7.getEmojiView();
        } else {
            tyVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar6, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Jf));
        rj rjVar8 = this.f45950a0;
        if (rjVar8 != null) {
            tyVar7 = rjVar8.getEmojiView();
        } else {
            tyVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar7, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Kf));
        rj rjVar9 = this.f45950a0;
        if (rjVar9 != null) {
            tyVar8 = rjVar9.getEmojiView();
        } else {
            tyVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar8, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Of));
        rj rjVar10 = this.f45950a0;
        if (rjVar10 != null) {
            tyVar9 = rjVar10.getEmojiView();
        } else {
            tyVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar9, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ff));
        rj rjVar11 = this.f45950a0;
        if (rjVar11 != null) {
            tyVar10 = rjVar11.getEmojiView();
        } else {
            tyVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar10, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Bf));
        rj rjVar12 = this.f45950a0;
        if (rjVar12 != null) {
            tyVar11 = rjVar12.getEmojiView();
        } else {
            tyVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar11, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Mf));
        rj rjVar13 = this.f45950a0;
        if (rjVar13 != null) {
            tyVar12 = rjVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(tyVar12, 0, new Class[]{org.telegram.ui.Components.ty.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.If));
        rj rjVar14 = this.f45950a0;
        if (rjVar14 != null) {
            org.telegram.ui.Components.w31 trendingStickersAlert = rjVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.V());
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.f45950a0.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nl));
        }
        for (int i16 = 0; i16 < 2; i16++) {
            if (i16 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29717v7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29698u7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29774y7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29381d6));
        NumberTextView numberTextView = this.U2;
        int i17 = org.telegram.ui.ActionBar.m6.We;
        arrayList.add(new org.telegram.ui.ActionBar.v6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i17));
        ImageView imageView = this.f46049h3;
        int i18 = org.telegram.ui.ActionBar.m6.f29794z8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f46062i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.A0, 131072, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29762xf));
        hi.l5 l5Var = this.S;
        int i19 = org.telegram.ui.ActionBar.m6.f29370cd;
        arrayList.add(new org.telegram.ui.ActionBar.v6(l5Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f46161q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29510k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29537lg));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29554mg));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Zh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29335ai));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29355bi));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29324a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.tk));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.vk));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.uk));
        int i20 = org.telegram.ui.ActionBar.m6.wk;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i20));
        zh.d dVar = this.Ca;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(dVar.f62027g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.v6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ue));
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.v6) obj).f30149n = this.Ba;
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
        return org.telegram.ui.ActionBar.m6.V0(str);
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
        if (this.f46236w.f56655s == 1) {
            z10 = false;
        }
        if (this.f46208tb != z10) {
            this.f46208tb = z10;
            checkSystemBarColors();
        }
    }

    public final void h8() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.Ba);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.f46111m1.addView(this.N3, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
            if ((((org.telegram.messenger.gj) arrayList.get(0)).f24213k.date >= i7 && gjVar.f24213k.date <= i7) || (gjVar.f24213k.date >= i7 && this.U6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(size);
                    if (gjVar2.f24213k.date >= i7 && gjVar2.e1() != 0) {
                        int e12 = gjVar2.e1();
                        if (org.telegram.messenger.gj.B0(gjVar2.f24213k) != this.f45999d7) {
                            i12 = 0;
                        }
                        l(e12, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.n5.C(this.f46103l6)) {
                int N0 = this.C0.N0();
                int L0 = this.C0.L0();
                while (true) {
                    if (L0 <= N0) {
                        kl klVar = this.D0;
                        int i13 = klVar.K;
                        if (L0 >= i13 && L0 < klVar.L && (message = ((org.telegram.messenger.gj) arrayList.get(L0 - i13)).f24213k) != null) {
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
                this.f46142o9.m(i10);
                org.telegram.ui.ActionBar.t1 t1Var = this.Tb;
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                fd(false);
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), this.Ba);
                this.Tb = t1Var2;
                t1Var2.setOnCancelListener(this.Ja);
                this.Tb.r(1000L);
                int i14 = this.f46127n6;
                this.f46168q9 = i14;
                this.s9 = false;
                this.f46281z6.add(Integer.valueOf(i14));
                this.f46182r9 = 0;
                this.f46206t9 = false;
                org.telegram.messenger.np messagesController = getMessagesController();
                long j3 = this.f46103l6;
                long j10 = this.f45999d7;
                int i15 = this.classGuid;
                int i16 = this.f46036g4;
                long j11 = this.f46191s4;
                int i17 = this.C4;
                int i18 = this.f46127n6;
                this.f46127n6 = i18 + 1;
                messagesController.e3(j3, j10, false, 30, 0, i7, true, 0, i15, 4, i16, j11, i17, i18, this.f46254x4);
                this.f46113m3.setAlpha(0.0f);
                this.f46113m3.setTag(null);
                this.f46253x3 = 0.0f;
                Tc();
                this.f46124n3.setTag(null);
            }
        }
    }

    public final void hb() {
        int i7;
        this.V4.clear();
        this.X4.clear();
        this.Z4 = 0;
        this.f45997d5 = 0;
        this.f46011e5 = 0;
        gd(0, true);
        org.telegram.messenger.si mediaDataController = getMediaDataController();
        long a10 = a();
        TLRPC.ChatFull chatFull = this.f46181r8;
        if (chatFull == null) {
            i7 = 0;
        } else {
            i7 = chatFull.pinned_msg_id;
        }
        mediaDataController.T0(0, i7, a10);
        this.f46025f5 = true;
        hd();
    }

    public final void hc(ArrayList arrayList) {
        fc(true, null, null, arrayList, null, true, 0, null, false, 0L);
    }

    public final void hd() {
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f46254x4 && !this.X4.isEmpty() && this.V4.size() == 1 && ((Integer) this.V4.get(0)).intValue() == d() + 1) {
            gjVar = (org.telegram.messenger.gj) this.X4.get(this.V4.get(0));
        } else {
            gjVar = null;
        }
        this.f46125n4 = gjVar;
        if (this.f46254x4 && gjVar != null && (message = gjVar.f24213k) != null && (tL_forumTopic = this.f46177r4) != null && !org.telegram.messenger.gj.v5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.f46005e;
            TLRPC.Peer peer = this.f46125n4.f24213k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.v3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f28434id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.v3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f28434id == peer.chat_id) {
                        return;
                    }
                }
                this.f46125n4 = null;
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.gj gjVar = this.f46114m4;
        if (gjVar != null && gjVar.M1() == 0 && org.telegram.messenger.v3.n(this.f46005e)) {
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
                ImageView imageView = this.f46062i3;
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
            ImageView imageView2 = this.f46062i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Db(O0, null);
        }
    }

    public final ArrayList i8(org.telegram.messenger.gj gjVar, boolean z10) {
        ArrayList i7 = org.telegram.messenger.f3.i(gjVar);
        int e12 = gjVar.e1();
        gjVar.A0();
        if (e12 != 0) {
            ArrayList arrayList = this.M6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(size);
                if ((org.telegram.messenger.gj.B0(gjVar2.f24213k) != this.f45999d7 || org.telegram.messenger.gj.B0(gjVar.f24213k) == this.f45999d7) && (((this.h == null && gjVar2.e1() > e12) || (this.h != null && gjVar2.e1() < e12)) && ((org.telegram.messenger.gj.R4(gjVar2.f24213k) || gjVar2.h4()) && !gjVar2.S4() && !gjVar2.g4() && (!z10 || (gjVar2.f24213k.media_unread && !gjVar2.N3()))))) {
                    i7.add(gjVar2);
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
            rootView.addOnLayoutChangeListener(new ng(bVar, 0));
            rootView.requestApplyInsets();
        }
    }

    public final void ib(org.telegram.messenger.gj gjVar) {
        if (gjVar == this.f46171qc) {
            this.f46171qc = null;
            zd(true);
            return;
        }
        org.telegram.messenger.jp Q1 = getMessagesController().Q1(this.f46103l6);
        if (Q1 != null) {
            Q1.f24896a.remove(gjVar);
        }
    }

    public final void ic(org.telegram.messenger.gj gjVar) {
        fc(true, gjVar, null, null, null, true, 0, null, false, 0L);
    }

    public final void id(boolean z10) {
        boolean z11;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.B1 > 0 && ((i7 = this.f46036g4) == 0 || i7 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46264y1.e(4, z11, z10);
        this.f46264y1.c(4, this.B1, z10);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (Y9()) {
            org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.i(org.telegram.ui.ActionBar.m6.f29737w8);
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29737w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.m6.I.q();
        } else {
            z10 = this.f46057hc;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.g11 g11Var;
        mk mkVar;
        wh.i iVar;
        if ((this.f46036g4 == 5 && (this.M6.isEmpty() || this.f46191s4 == 0)) || (((g11Var = this.f46122n0) != null && (g11Var.f35391y > 0.0f || g11Var.f35370c0)) || this.f46272y9 || this.f46045gd.f57701f || !this.K9 || (((mkVar = this.f45990cb) != null && mkVar.f41743s) || ((iVar = this.f46220ua) != null && iVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f46019f;
    }

    public final void j7() {
        org.telegram.messenger.gj gjVar;
        if (!this.R4 && (gjVar = this.f45973b8) != null) {
            if (this.M6.indexOf(gjVar) >= 0) {
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
            int i12 = gjVar.f24213k.date;
            if (i12 <= i7 || i12 >= i10) {
                this.D0.N.add(gjVar);
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
        undoView.l(this.f46103l6, 81, new bi.r4(this, i7, i10, z10), new vf(this, 18));
    }

    public final long j9() {
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        org.telegram.messenger.gj gjVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.v3.p0(this.f46005e) || !org.telegram.messenger.v3.A(this.currentAccount, this.f46005e, 24)) {
            return 0L;
        }
        long j3 = this.f46191s4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && (gjVar2 = this.H5) != null && (message2 = gjVar2.f24213k) != null) {
            return org.telegram.messenger.n5.o(message2.saved_peer_id);
        }
        if (i7 == 0 && (gjVar = this.F5) != null && (message = gjVar.f24213k) != null) {
            return org.telegram.messenger.n5.o(message.saved_peer_id);
        }
        return j3;
    }

    public final void ja(ArrayList arrayList) {
        org.telegram.ui.Components.a21 a21Var;
        if (arrayList != null && (a21Var = this.f46034g2) != null && a21Var.U) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                if (gjVar != null && gjVar.D == 36) {
                    TLRPC.MessageMedia n1 = org.telegram.messenger.gj.n1(gjVar.f24213k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54891a;
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
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(gjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            kl klVar = this.D0;
            if (klVar != null && !klVar.O) {
                klVar.s(klVar.K + indexOf);
            }
        }
    }

    public final void jc(org.telegram.messenger.gj gjVar, rm rmVar) {
        fc(true, gjVar, null, null, null, true, 0, rmVar, false, 0L);
    }

    public final void jd(boolean z10) {
        boolean z11;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i7 = this.f46036g4) == 0 || i7 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46264y1.e(3, z11, z10);
        this.f46264y1.c(3, this.A1, z10);
    }

    public final void k7(boolean z10) {
        if (this.F5 != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.M6;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                    if (gjVar != null && gjVar.e1() == this.F5.e1() && org.telegram.messenger.gj.B0(gjVar.f24213k) == org.telegram.messenger.gj.B0(this.F5.f24213k)) {
                        this.F5 = gjVar;
                        rm rmVar = this.D5;
                        if (rmVar != null) {
                            rmVar.a(gjVar);
                        }
                        if (z10) {
                            org.telegram.messenger.kj kjVar = this.f46255x5;
                            if (kjVar != null) {
                                org.telegram.messenger.gj gjVar2 = this.F5;
                                org.telegram.messenger.bj bjVar = this.B5;
                                if (bjVar == null) {
                                    bjVar = U8(gjVar2.c1());
                                }
                                kjVar.f(gjVar2, bjVar, this.f46103l6, this.D5);
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

    public final void k8(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.gj gjVar, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.r1 r1Var2;
        CharacterStyle characterStyle2;
        int i7;
        org.telegram.messenger.gj gjVar2;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.a70 J = org.telegram.ui.Components.a70.J(this, r1Var);
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(getParentActivity(), this.Ba);
        J.f33391p = new fe(yk0Var, 0);
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
                i12 = 2131747597;
            } else {
                i12 = 2131747623;
            }
            String N0 = org.telegram.messenger.hd.N0(i12, null);
            z15 = z10;
            i7 = 2131232267;
            di.z1 z1Var = new di.z1(this, str, characterStyle, gjVar, r1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            r1Var2 = r1Var;
            J.c(i11, N0, z1Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            r1Var2 = r1Var;
            characterStyle2 = characterStyle;
            i7 = 2131232267;
        }
        if ((z13 && !z14) || startsWith) {
            J.c(i7, org.telegram.messenger.hd.N0(2131747599, null), new ge(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !T2) {
            J.c(2131231926, org.telegram.messenger.hd.N0(2131747597, null), new ge(this, str, 1), false);
        }
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(gjVar);
        if ((m12 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m12.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            gjVar2 = gjVar;
            J.c(2131231835, org.telegram.messenger.hd.N0(2131747596, null), new he(this, gjVar2, 0), false);
        } else {
            gjVar2 = gjVar;
        }
        if (z14) {
            i10 = 2131751751;
        } else if (startsWith) {
            i10 = 2131751749;
        } else {
            i10 = 2131751750;
        }
        J.c(2131232105, org.telegram.messenger.hd.N0(i10, null), new aa.c0(this, str, gjVar2, startsWith, 26), false);
        if (T2 && !z14 && !startsWith && !str.startsWith("tg:")) {
            J.c(2131232506, org.telegram.messenger.hd.N0(2131742675, null), new ge(this, str, 2), false);
        }
        yk0Var.e(J);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            yk0Var.f(r1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.u41) {
            String d = vf.c.d(((org.telegram.ui.Components.u41) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            yk0Var.f(r1Var2, characterStyle2, spannableString2, false);
        } else {
            yk0Var.f(r1Var2, characterStyle2, null, false);
        }
        showDialog(yk0Var);
    }

    public final int k9() {
        return this.f46111m1.getBackgroundSizeY();
    }

    public final void ka() {
        this.R4 = true;
        if (this.E6) {
            org.telegram.messenger.ur messagesStorage = getMessagesStorage();
            messagesStorage.f27250a.c(new org.telegram.messenger.t8(messagesStorage, d(), this.f46103l6, new cg(this, 1), 5));
            return;
        }
        org.telegram.messenger.ur messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().l1(this.f46103l6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f46254x4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f46191s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.D6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new u7(5, this, messagesStorage2));
    }

    public final void kb(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList = this.M6;
        int indexOf = arrayList.indexOf(gjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            kl klVar = this.D0;
            if (klVar != null && !klVar.O) {
                klVar.P(klVar.K + indexOf, true);
            }
        }
    }

    public final void kc(org.telegram.messenger.lj ljVar) {
        gc(true, null, null, null, null, true, 0, null, false, 0L, ljVar, true);
    }

    public final void kd(boolean z10) {
        String N0;
        if (this.f46036g4 != 3 && !org.telegram.messenger.p10.v(this.f46019f)) {
            vi viVar = this.f46147p1;
            if (viVar != null && this.f46191s4 != 0) {
                if (this.f46254x4) {
                    Bd();
                } else if (this.f46227v4) {
                    org.telegram.messenger.gj gjVar = this.f46114m4;
                    if (gjVar != null && gjVar.x2()) {
                        this.f46147p1.setTitle(org.telegram.messenger.hd.G(this.f46114m4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131751984, null));
                    }
                } else {
                    org.telegram.messenger.gj gjVar2 = this.f46114m4;
                    if (gjVar2 != null) {
                        viVar.setTitle(org.telegram.messenger.hd.G(gjVar2.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f46163q4 != null) {
                if (this.f46114m4.M1() == 0) {
                    if (this.f46227v4) {
                        N0 = org.telegram.messenger.hd.N0(2131748033, null);
                    } else {
                        N0 = org.telegram.messenger.hd.N0(2131747975, null);
                    }
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131751363, null);
                }
                org.telegram.messenger.gj gjVar3 = this.f46163q4;
                gjVar3.f24213k.message = N0;
                gjVar3.v = N0;
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
        vj vjVar;
        uj ujVar;
        uj ujVar2;
        rj rjVar = this.f45950a0;
        if (rjVar != null && rjVar.f32692p4) {
            MediaController.B().O = false;
            return;
        }
        TLRPC.Chat chat = this.f46005e;
        if (chat != null && !org.telegram.messenger.v3.v(chat)) {
            MediaController.B().O = false;
        } else if (!org.telegram.messenger.t0.f26939x && (((vjVar = this.f45994d1) == null || vjVar.getVisibility() != 0) && (((ujVar = this.T) == null || ujVar.getVisibility() != 0) && ((ujVar2 = this.f46035g3) == null || ujVar2.getVisibility() != 0)))) {
            MediaController.B().O = true;
        } else {
            MediaController.B().O = false;
        }
    }

    public final void l8(CharacterStyle characterStyle, boolean z10, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.r1 r1Var) {
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
        org.telegram.ui.Cells.r1 r1Var2;
        org.telegram.messenger.gj messageObject;
        ArrayList arrayList;
        org.telegram.messenger.bj bjVar;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z12 = true;
            boolean z13 = true;
            char c10 = 1;
            char c11 = 1;
            if (!W9() && (gjVar == null || (message = gjVar.f24213k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.r1 r1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.r41) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.r41 r41Var = (org.telegram.ui.Components.r41) characterStyle;
                    org.telegram.messenger.g0.g(r41Var.f39071a.subSequence(r41Var.f39072b, r41Var.f39073c).toString());
                    h8();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z10 && r1Var != null) {
                    r1Var.h3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.v41) {
                TLRPC.User c22 = getMessagesController().c2(Utilities.A(((org.telegram.ui.Components.v41) characterStyle).getURL()));
                if (c22 != null) {
                    org.telegram.messenger.np.u1(this.currentAccount).G3(c22, null, this, 0);
                }
                if (z10 && r1Var != null) {
                    r1Var.h3(-1);
                }
                ma(gjVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.m00) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.m00) characterStyle).f37368b;
                if (tL_messageEntityFormattedDate == null || (messageObject = r1Var.getMessageObject()) == null) {
                    r1Var2 = r1Var;
                } else {
                    if (messageObject.c1() != 0 && (bjVar = (org.telegram.messenger.bj) this.P6.f(messageObject.c1())) != null) {
                        arrayList = bjVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.f3.i(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e10 = getUserConfig().e();
                    String A = org.telegram.messenger.hd.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.a70 J = org.telegram.ui.Components.a70.J(this, r1Var);
                    org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(getParentActivity(), this.Ba);
                    J.f33391p = new fe(yk0Var, 0);
                    J.c(2131232105, org.telegram.messenger.hd.N0(2131746136, null), new je(this, yk0Var, A, 0), false);
                    r1Var2 = r1Var;
                    J.c(2131232079, org.telegram.messenger.hd.N0(2131746137, null), new di.m6((org.telegram.messenger.gs) this, (Object) J, (Object) messageObject, (Object) r1Var, A, (Object) tL_messageEntityFormattedDate, (Object) yk0Var, 4), false);
                    J.c(2131232264, org.telegram.messenger.hd.N0(2131746135, null), new di.a3(this, J, e10, tL_messageEntityFormattedDate, arrayList2, yk0Var, 5), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    yk0Var.e(J);
                    yk0Var.f(r1Var2, characterStyle, spannableString, false);
                    showDialog(yk0Var);
                }
                if (r1Var2 != null) {
                    r1Var2.h3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.s41) {
                String url = ((org.telegram.ui.Components.s41) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    m8(r1Var, characterStyle, url.substring(4));
                    if (z10 && r1Var != null) {
                        r1Var.h3(-1);
                    }
                } else if (gjVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.p41.h) {
                        rj rjVar = this.f45950a0;
                        TLRPC.Chat chat = this.f46005e;
                        if (chat == null || !chat.megagroup) {
                            z13 = false;
                        }
                        rjVar.C1(gjVar, url, z10, z13);
                        if (!z10 && this.f45950a0.getFieldText() == null) {
                            D9(false);
                        }
                    }
                    if (z10 && r1Var != null) {
                        r1Var.h3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.G6;
                    if (gjVar != null && url.startsWith("video") && !z10) {
                        int intValue = Utilities.z(url).intValue();
                        if (gjVar.e5()) {
                            webPage2 = gjVar.f24213k.media.webpage;
                            gjVar4 = gjVar;
                        } else {
                            org.telegram.messenger.gj gjVar6 = gjVar.C;
                            if (gjVar6 != null && gjVar6.e5()) {
                                gjVar4 = gjVar.C;
                                webPage2 = gjVar4.f24213k.media.webpage;
                            } else {
                                gjVar4 = gjVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.iu.O0(this, gjVar4, this.f46003db, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, V9());
                            return;
                        }
                        if (!org.telegram.messenger.gj.L4(gjVar4.f24213k) && (gjVar5 = gjVar4.C) != null) {
                            if (org.telegram.messenger.gj.B0(gjVar5.f24213k) == this.f46103l6) {
                                c10 = 0;
                            }
                            org.telegram.messenger.gj gjVar7 = (org.telegram.messenger.gj) sparseArrayArr[c10].get(gjVar4.C.e1());
                            if (gjVar7 == null) {
                                gjVar4 = gjVar4.C;
                            } else {
                                gjVar4 = gjVar7;
                            }
                        } else {
                            r1Var3 = r1Var;
                        }
                        gjVar4.f24178c0 = intValue / ((float) gjVar4.L0());
                        Ka(r1Var3, gjVar4);
                    } else if (gjVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!gjVar.I3() && (gjVar3 = gjVar.C) != null) {
                            if (org.telegram.messenger.gj.B0(gjVar3.f24213k) == this.f46103l6) {
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
                                gjVar2.f24173b0 = L0;
                                mediaController.i0(gjVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(gjVar2);
                                }
                            } else {
                                gjVar2.f24178c0 = f10 / ((float) gjVar2.L0());
                                mediaController.S(gjVar2);
                            }
                            if (z10 && r1Var != null) {
                                r1Var.h3(-1);
                            }
                            if (!org.telegram.messenger.gj.R4(gjVar2.f24213k)) {
                                showDialog(new org.telegram.ui.Components.f8(getParentActivity(), this.Ba));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        di.o3 o3Var = new di.o3(this, r1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            gi na2 = na(r1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (na2 != null) {
                                na2.f59417b = new hq0(zArr, 23);
                                na2.d();
                            }
                            D.i0(new ne(this, zArr, na2, userArr, o3Var, 0), substring);
                        } else {
                            o3Var.run();
                        }
                        if (r1Var != null) {
                            r1Var.h3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        gi na3 = na(r1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        na3.f59417b = new re(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new di.m7(this, na3, r1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().Q3, 1, true), 2);
                        na3.d();
                        r1Var.h3(-1);
                    } else {
                        Ca(characterStyle, url, z10, r1Var, gjVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    m8(r1Var, characterStyle, url2.substring(4));
                } else if (z10) {
                    k8(r1Var, gjVar, characterStyle, url2);
                    if (r1Var != null) {
                        r1Var.h3(-1);
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
                    boolean z14 = characterStyle instanceof org.telegram.ui.Components.u41;
                    if ((z14 && (url2 == null || !url2.startsWith("mailto:"))) || org.telegram.messenger.g0.H3(url2)) {
                        if (gjVar != null) {
                            i10 = gjVar.e1();
                        } else {
                            i10 = 0;
                        }
                        if (Ha(url2, r1Var, characterStyle, i10, 1)) {
                            return;
                        }
                    } else {
                        if (gjVar != null) {
                            TLRPC.MessageMedia messageMedia = gjVar.f24213k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = gjVar.f24213k.media.webpage.url.toLowerCase();
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
                        if (!Ha(url2, r1Var, characterStyle, i7, 1)) {
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
                    Za(2, url2, characterStyle, r1Var, z11);
                }
            }
        }
    }

    public final float l9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.f46111m1.getBackgroundTranslationY()) - ((1.0f - this.U9) * this.P9);
    }

    public final void la(boolean z10) {
        TLRPC.Chat chat;
        if (this.Ea == null && (chat = this.f46005e) != null && org.telegram.messenger.v3.k(chat) && this.f45950a0 != null && !org.telegram.messenger.v3.p0(this.f46005e)) {
            TLRPC.TL_channels_sendAsPeers O1 = getMessagesController().O1(this.f46103l6, false);
            this.Ea = O1;
            if (O1 != null) {
                this.f45950a0.x2(false, z10);
            }
        }
    }

    public final void lb() {
        if (this.f46053h8 == null && this.f46066i8 == null && this.f46079j8 == null) {
            zd zdVar = this.f46118m8;
            if (zdVar != null) {
                org.telegram.messenger.g0.r(zdVar);
                this.f46118m8 = null;
            }
            this.f46000d8 = Integer.MAX_VALUE;
            this.f46028f8 = false;
            this.f46040g8 = 0L;
            this.f46053h8 = null;
            this.f46066i8 = null;
            this.f46079j8 = null;
        }
    }

    public final void lc(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        fc(z10, null, null, null, webPage, true, 0, null, z11, 0L);
    }

    public final void ld(int i7, org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.gj gjVar2;
        SparseArray sparseArray = this.I6;
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
            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.G6[0].get(((Integer) arrayList.get(i10)).intValue());
            if (gjVar3 != null) {
                if (gjVar == null) {
                    gjVar3.C = gjVar2;
                } else {
                    gjVar3.C = gjVar;
                }
                kl klVar = this.D0;
                if (klVar != null) {
                    klVar.R(gjVar3, true, false);
                }
            }
        }
        if (gjVar == null) {
            sparseArray.remove(i7);
        }
    }

    public final boolean m7(boolean z10, boolean z11) {
        rj rjVar = this.f45950a0;
        if (rjVar == null || !rjVar.U0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
            boolean z12 = this.f45950a0.f32598d1;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            if (z12) {
                t1Var.S = org.telegram.messenger.hd.N0(2131751383, null);
                t1Var.U = org.telegram.messenger.hd.N0(2131751384, null);
            } else {
                t1Var.S = org.telegram.messenger.hd.N0(2131751380, null);
                t1Var.U = org.telegram.messenger.hd.N0(2131751381, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751382, null), new ab.z(5, this, z11));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751759, null), null);
            showDialog(t1Var);
            return true;
        }
        return true;
    }

    public final void m8(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, String str) {
        gi na2 = na(r1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f24611l0.get(pf.b.d(str, false));
        di.n2 n2Var = new di.n2(this, r1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(tL_contact.user_id));
            if (c22 != null) {
                n2Var.a(c22);
                return;
            } else {
                getMessagesStorage().f27250a.c(new o1(this, tL_contact, n2Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        na2.f59417b = new re(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new z9(this, na2, n2Var, 3)), 0);
        na2.d();
    }

    public final float m9() {
        org.telegram.ui.Components.a21 a21Var = this.f46034g2;
        if (a21Var != null) {
            return a21Var.getSideMenuT();
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
        org.telegram.messenger.gj gjVar = this.f45973b8;
        if (gjVar != null) {
            if (z10) {
                boolean[] zArr = this.W6;
                zArr[1] = true;
                zArr[0] = true;
                this.Z7 = 0;
                this.f45986c7 = 0;
            }
            this.V7 = 0;
            this.W7 = false;
            jb(gjVar);
            this.f45973b8 = null;
        }
    }

    public final void mc(boolean z10) {
        if (this.f46113m3 != null && !X9()) {
            if (this.f46113m3.getTag() == null) {
                AnimatorSet animatorSet = this.f46226v3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f46113m3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f46226v3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f46226v3.playTogether(ObjectAnimator.ofFloat(this.f46113m3, View.ALPHA, 1.0f));
                this.f46226v3.addListener(new ei(this, 4));
                this.f46226v3.start();
            }
            if (!z10) {
                O9();
                this.f46149p3 = 1000;
            }
        }
    }

    public final void md(boolean z10) {
        rj rjVar = this.f45950a0;
        if (rjVar != null) {
            rjVar.v2(z10);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        boolean z12;
        String str2 = null;
        D8(str, null);
        if (u7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(str, this.f46103l6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = Y8();
                z12 = z11;
                b10.L = z12;
                b10.Q = j10;
                b10.R = j9();
                b10.T = this.f46268y5;
                org.telegram.messenger.az.C(this.currentAccount).r0(b10);
            } else {
                z12 = z11;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f46103l6, false, false, true, 0, 0, null, -1, j10, j9(), this.f46268y5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j11 = this.f46103l6;
            org.telegram.messenger.gj gjVar = this.F5;
            org.telegram.messenger.gj gjVar2 = this.f46114m4;
            rm rmVar = this.D5;
            String str3 = str2;
            org.telegram.messenger.az.V(i7, j11, j3, j10, j9(), str3, null, arrayList, arrayList, null, arrayList2, null, null, accountInstance, gjVar, gjVar2, this.H5, this.f46268y5, Y8(), null, rmVar, null, null, z10, z12);
            L6();
        }
    }

    public final void n7() {
        if (!this.wc) {
            this.wc = true;
            if (!this.xc && this.f46036g4 == 0 && !getMessagesController().I1().f26503b && getMessagesController().I1().c() > 2) {
                if (this.K1 != null && org.telegram.messenger.np.g1().getInt("savedhint", 0) < 1) {
                    this.K1.x();
                    this.xc = true;
                    org.telegram.messenger.np.g1().edit().putInt("savedhint", org.telegram.messenger.np.g1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.np.g1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && org.telegram.messenger.np.g1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.x();
                    this.xc = true;
                    org.telegram.messenger.np.g1().edit().putInt("savedsearchhint", org.telegram.messenger.np.g1().getInt("savedsearchhint", 0) + 1).apply();
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

    public final gi na(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle) {
        vf.b bVar = this.f46017ec;
        if (bVar != null) {
            bVar.a(true);
            this.f46017ec = null;
        }
        if (characterStyle != null && r1Var != null && r1Var.getMessageObject() != null) {
            gi giVar = new gi(this, r1Var.getMessageObject().e1(), characterStyle, r1Var, 0);
            this.f46017ec = giVar;
            return giVar;
        }
        this.f46017ec = null;
        return null;
    }

    public final void nb(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.nb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void nc(boolean z10) {
        if (this.f46124n3 != null && !X9()) {
            if (this.f46124n3.getTag() == null) {
                ValueAnimator valueAnimator = this.f46240w3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f46124n3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46253x3, 1.0f);
                this.f46240w3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f46240w3.addUpdateListener(new be(this, 2));
                this.f46240w3.addListener(new ei(this, 6));
                this.f46240w3.start();
            }
            if (!z10) {
                O9();
                this.f46149p3 = 1000;
            }
        }
    }

    public final void nd(int i7, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        boolean z11;
        lh.h hVar = this.f46264y1;
        boolean z12 = false;
        if (hVar != null) {
            int i13 = 2;
            if (this.f46132nb) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if ((i12 & i7) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f3247c = z10;
            h6.m mVar = hVar.f19914e[6];
            if (mVar != null) {
                ((kh.b) mVar.f13968b).b(z10, true);
            }
            lh.h hVar2 = this.f46264y1;
            if (this.f46132nb) {
                i13 = 1;
            }
            if ((i7 & i13) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3247c = z11;
            h6.m mVar2 = hVar2.f19914e[5];
            if (mVar2 != null) {
                ((kh.b) mVar2.f13968b).b(z11, true);
            }
        }
        this.L3 = i11;
        this.M3 = i10;
        od();
        org.telegram.ui.Components.o6 o6Var = this.f46088k3;
        if (o6Var != null) {
            if (i11 > 0) {
                z12 = true;
            }
            o6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f46088k3.animate();
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
        if (this.f46036g4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((g2Var instanceof bn) && ((bn) g2Var).V9()) {
                return false;
            }
        }
        return this.Z6;
    }

    public final void o7() {
        org.telegram.ui.Cells.r1 r1Var;
        hi.l3 l3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        hi.l3 l3Var2 = this.M1;
        if (l3Var2 != null && !l3Var2.W && !this.f46287zc && this.wc && !this.f46045gd.f57701f && System.currentTimeMillis() - this.f46274yc > 1800 && org.telegram.messenger.np.g1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        r1Var = (org.telegram.ui.Cells.r1) childAt;
                        ch.q0 q0Var = r1Var.O;
                        org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f24213k) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !q0Var.f5527s.isEmpty()) {
                            r1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + q0Var.f5513c;
                            if (f10 >= org.telegram.messenger.g0.L(240.0f) && f10 <= (org.telegram.messenger.g0.f24046q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f24041n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    r1Var = null;
                    break;
                }
            }
            if (r1Var != null) {
                ch.q0 q0Var2 = r1Var.O;
                this.f46287zc = true;
                r1Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - l3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)) + q0Var2.f5513c);
                this.M1.p(0.0f, (((ch.n0) q0Var2.f5527s.get(0)).f5487z / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q0Var2.f5512b);
                this.M1.x();
                org.telegram.messenger.np.g1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.g0.r(new zd(this, 22));
            org.telegram.messenger.g0.h3(new zd(this, 22), 2000L);
        }
    }

    public final void o8(int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.o8(int, java.lang.Object[]):void");
    }

    public final org.telegram.ui.ActionBar.q0 o9() {
        org.telegram.ui.ActionBar.q0 q0Var = this.m0;
        if (q0Var != null && q0Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final void oa(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && gjVar.r4() && !gjVar.f24253u0) {
            gjVar.f24253u0 = true;
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
        this.M7 = 0;
        this.C7 = false;
        this.D7 = true;
        this.f46281z6.clear();
    }

    public final boolean oc() {
        rj rjVar = this.f45950a0;
        if (rjVar != null && rjVar.getVisibility() == 0) {
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            if (!g12.getBoolean("gifhint", false)) {
                g12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f46200t2 == null) {
                    if (!this.f46203t5) {
                        rj rjVar2 = this.f45950a0;
                        if (rjVar2 != null) {
                            rjVar2.Z();
                            org.telegram.messenger.si.d0(rjVar2.R).Y0(0, true, true, false);
                            org.telegram.ui.Components.fg fgVar = rjVar2.V0;
                            fgVar.M(false, false);
                            fgVar.R(false, false);
                            fgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        pl plVar = this.f46111m1;
                        int indexOfChild = plVar.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            rj rjVar3 = this.f45950a0;
                            rjVar3.Z();
                            org.telegram.messenger.si.d0(rjVar3.R).Y0(0, true, true, false);
                            org.telegram.ui.Components.fg fgVar2 = rjVar3.V0;
                            fgVar2.M(false, false);
                            fgVar2.R(false, false);
                            fgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232676);
                            int i7 = indexOfChild + 1;
                            plVar.addView(this.L2, i7, c8.ma.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            hi.l3 E6 = E6(310.0f, 3, i7, false);
                            this.f46200t2 = E6;
                            E6.d = 2300L;
                            E6.v(org.telegram.messenger.hd.N0(2131744025, null));
                            this.L2.setAlpha(0.0f);
                            this.L2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.f45950a0.getEmojiButton();
                            if (emojiButton != null) {
                                this.f46200t2.z(emojiButton, true);
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
        org.telegram.ui.Components.o6 o6Var = this.j3;
        if (o6Var != null) {
            boolean z10 = !org.telegram.messenger.hd.f24444a0;
            int i7 = this.L3;
            if (i7 < 0) {
                o6Var.c("", z10, true);
            } else if (i7 == 0) {
                o6Var.c(org.telegram.messenger.hd.N0(2131747974, null), z10, true);
            } else if (this.G3) {
                o6Var.c(org.telegram.messenger.hd.G(i7, "TaggedMessages", new Object[0]), z10, true);
            } else if (this.f46036g4 != 7 && !this.f46045gd.f57701f) {
                o6Var.c(org.telegram.messenger.hd.a0(null, null, 2131747635, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z10, true);
            } else {
                o6Var.c(org.telegram.messenger.hd.G(i7, "SearchMessagesResultCount", org.telegram.messenger.hd.E(i7, ' ')), z10, true);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.h50 h50Var;
        org.telegram.ui.ActionBar.t1 t1Var;
        org.telegram.ui.Components.gf gfVar;
        org.telegram.ui.ActionBar.t1 t1Var2;
        org.telegram.ui.Components.ef efVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        ql qlVar;
        ch.r rVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getOpenMenuOverlay() != null) {
            if (z10 && (j5Var = this.actionBar.f29121a1) != null) {
                j5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.g11 g11Var = this.f46122n0;
            if (g11Var != null && g11Var.f35391y > 0.0f) {
                if (z10) {
                    g11Var.e();
                    return false;
                }
            } else {
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35519w;
                if (gcVar != null) {
                    org.telegram.ui.Components.lb lbVar = gcVar.f35523e;
                    if (lbVar instanceof org.telegram.ui.Components.rb) {
                        if (z10) {
                            ((org.telegram.ui.Components.rb) lbVar).f();
                            gcVar.b();
                            return false;
                        }
                    }
                }
                uz0 uz0Var = this.f46247wa;
                if (uz0Var != null && !uz0Var.f52662c0) {
                    if (z10) {
                        uz0Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z10) {
                        closeSheet();
                        return false;
                    }
                } else {
                    ch.s sVar = this.f46233va;
                    if (sVar != null && (rVar = sVar.f5539b) != null && rVar.getReactionsWindow() != null) {
                        if (z10) {
                            sVar.f5539b.e();
                            return false;
                        }
                    } else if (ns.p().E) {
                        if (z10) {
                            ns.p().n();
                            return false;
                        }
                    } else {
                        mk mkVar = this.f45990cb;
                        if (mkVar != null && mkVar.f41743s) {
                            if (z10) {
                                mkVar.a(true);
                                return false;
                            }
                        } else if (this.f46045gd.f57701f) {
                            if (z10) {
                                sc(false);
                                return false;
                            }
                        } else if (this.f46041g9 != null) {
                            if (z10) {
                                P7(true);
                                return false;
                            }
                        } else if (!m7(z10, false)) {
                            if (A9()) {
                                if (z10 && (qlVar = this.f46219u9) != null && qlVar.x()) {
                                    this.f46219u9.f(false);
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
                                    rj rjVar = this.f45950a0;
                                    if (rjVar != null && rjVar.S0() && (rjVar.V2 != 1 || (tL_replyKeyboardMarkup = rjVar.f32599d3) == null || !tL_replyKeyboardMarkup.is_persistent || rjVar.f32592c3 == null)) {
                                        if (z10) {
                                            this.f45950a0.K0(true);
                                            return false;
                                        }
                                    } else {
                                        rj rjVar2 = this.f45950a0;
                                        if (rjVar2 != null && rjVar2.A()) {
                                            if (z10) {
                                                rj rjVar3 = this.f45950a0;
                                                ki.y yVar = rjVar3.m0;
                                                if (yVar != null) {
                                                    yVar.setOpened(false);
                                                }
                                                if (!rjVar3.H0() && (efVar = rjVar3.f32674n0) != null) {
                                                    efVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            rj rjVar4 = this.f45950a0;
                                            if (rjVar4 != null && (gfVar = rjVar4.F0) != null && (t1Var2 = gfVar.f38346b2) != null && t1Var2.isShowing()) {
                                                if (z10) {
                                                    gfVar.f38346b2.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f46036g4 == 6 && (t1Var = kg.v.f18539e) != null && t1Var.isShowing()) {
                                                if (z10) {
                                                    kg.v.f18539e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.v3.p0(this.f46005e) && !this.f46063i4 && this.f46034g2 != null && d() != 0) {
                                                if (z10) {
                                                    this.f46034g2.n(0L, this.H7);
                                                    return false;
                                                }
                                            } else if (this.f46036g4 == 5 && !"hello".equalsIgnoreCase(this.f46024f4) && !"away".equalsIgnoreCase(this.f46024f4) && (this.M6.isEmpty() || this.f46191s4 == 0)) {
                                                if (z10) {
                                                    xc();
                                                    return false;
                                                }
                                            } else if (this.f46036g4 == 6 && this.f45950a0.B()) {
                                                if (z10) {
                                                    dc(new vf(this, 20));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                                                if (kVar3 != null && kVar3.f29150o0) {
                                                    if (z10) {
                                                        kVar3.n(true);
                                                        return false;
                                                    }
                                                } else if (this.f46018ed.f57701f) {
                                                    if (z10) {
                                                        Va();
                                                    }
                                                } else {
                                                    if (z10 && (h50Var = this.f46162q3) != null) {
                                                        h50Var.a(false);
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
        if (!getMessagesController().K3() && getMessagesController().f25983v4 <= 0 && getMessagesController().f25898l7 < 2 && !getUserConfig().q() && (arrayList = this.M6) != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                if (gjVar != null && !gjVar.P3() && ((org.telegram.messenger.gj.R4(gjVar.f24213k) || gjVar.h4()) && !gjVar.F4() && (gjVar.f24213k.media_unread || org.telegram.messenger.v3.V(this.f46005e)))) {
                    org.telegram.ui.Components.j21.v(gjVar, false);
                }
            }
        }
        this.U3 = false;
        K9();
        ArrayList arrayList2 = org.telegram.ui.Components.j21.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        vf.b bVar = this.f46017ec;
        if (bVar != null) {
            bVar.a(false);
            this.f46017ec = null;
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
            rj rjVar = this.f45950a0;
            if (rjVar != null) {
                rjVar.j1();
                rj rjVar2 = this.f45950a0;
                rjVar2.U0 = false;
                org.telegram.ui.Components.fg fgVar = rjVar2.V0;
                if (fgVar != null) {
                    fgVar.u(false);
                }
            }
            this.Eb = false;
        }
        if (this.K1 != null) {
            org.telegram.messenger.g0.h3(new zd(this, 1), 600L);
        }
        if (this.H4 && !this.I4) {
            this.I4 = true;
            org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(this).I(2131623993, org.telegram.messenger.hd.N0(2131743352, null), org.telegram.messenger.hd.N0(2131743354, null));
            I.f35527j = 5000;
            I.v = new zd(this, 2);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ch.s sVar = this.f46233va;
        if (sVar != null && sVar.d()) {
            this.f46233va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.gj gjVar;
        long j3;
        long j10;
        vi viVar = this.f46147p1;
        if (viVar != null) {
            ViewTreeObserver viewTreeObserver = viVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new lh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        P7(true);
        if (!org.telegram.messenger.g0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.A1() || !PhotoViewer.p1().P1()) && (gjVar = MediaController.B().f22771v0) != null && org.telegram.messenger.gj.L4(gjVar.f24213k)) {
                    PhotoViewer.p1().I2(null, this, this.Ba);
                    getFileLoader().c0(gjVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i7 = gjVar.D;
                    long j11 = 0;
                    if (i7 != 0) {
                        j3 = this.f46103l6;
                    } else {
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        j10 = this.f45999d7;
                    } else {
                        j10 = 0;
                    }
                    if (i7 != 0) {
                        j11 = d();
                    }
                    if (p12.d2(gjVar, null, null, null, null, null, null, 0, this.f46003db, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.p1().f43307l4 = this;
                    }
                    G9(false);
                    MediaController.B().f22774w0 = null;
                }
            } else if (PhotoViewer.A1() && PhotoViewer.p1().f43313m2) {
                PhotoViewer p13 = PhotoViewer.p1();
                if (p13.G2.d0()) {
                    if (p13.Z2) {
                        p13.G2.s0(false);
                    }
                    MediaController B = MediaController.B();
                    org.telegram.ui.Components.i61 i61Var = p13.G2;
                    org.telegram.messenger.gj gjVar2 = p13.T4;
                    if (i61Var != null && gjVar2 != null) {
                        int i10 = gjVar2.K1;
                        org.telegram.messenger.w7.G(i10).c0(gjVar2.F0(), true);
                        B.G0 = false;
                        B.r();
                        B.F0 = i61Var;
                        B.f22771v0 = gjVar2;
                        int i11 = B.f22754n0 + 1;
                        B.f22754n0 = i11;
                        i61Var.K = new org.telegram.messenger.ke(B, i11, gjVar2, 1);
                        B.Q0 = false;
                        TextureView textureView = B.H0;
                        if (textureView != null) {
                            i61Var.A0(textureView);
                        }
                        B.j(gjVar2);
                        B.n0();
                        B.f22743h0 = false;
                        org.telegram.messenger.gj gjVar3 = B.f22771v0;
                        B.f22771v0 = gjVar2;
                        if (!org.telegram.messenger.cz.k(true)) {
                            B.w0(B.f22764s);
                        }
                        B.v0(B.f22771v0);
                        org.telegram.messenger.ls.f(i10).k(org.telegram.messenger.ls.f25318h2, gjVar2, gjVar3);
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
        yj yjVar = this.f46207ta;
        float f10 = 0.0f;
        if (z10 && this.f46143oa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (g2Var instanceof bn) {
                this.R4 = true;
                bn bnVar = (bn) g2Var;
                bnVar.f46169qa = this;
                this.fragmentView.setAlpha(0.0f);
                this.f46111m1.setSkipBackgroundDrawing(true);
                this.f46147p1.setTranslationY(org.telegram.messenger.g0.L(8.0f));
                this.f46147p1.getAvatarImageView().setAlpha(0.0f);
                this.f46147p1.getAvatarImageView().setTranslationY(-org.telegram.messenger.g0.L(8.0f));
                this.f46156pa = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                rj rjVar = this.f45950a0;
                if (rjVar != null) {
                    rjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24046q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                uj ujVar = this.T;
                if (ujVar != null) {
                    ujVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24046q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                rj rjVar2 = this.f45950a0;
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
                rj rjVar3 = bnVar.f45950a0;
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
                this.f46107la = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ch.w(9, this, bnVar));
                Rc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f46195sa = animatorSet;
                animatorSet.addListener(new bi.z0(this, bnVar, runnable));
                this.f46195sa.setDuration(300L);
                this.f46195sa.setInterpolator(org.telegram.ui.Components.nr.f37960f);
                this.f46195sa.playTogether(ofFloat2);
                org.telegram.messenger.g0.h3(yjVar, 200L);
                return this.f46195sa;
            }
        }
        if (this.Ga && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (g2Var2 instanceof y91) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                g2Var2.getFragmentView().getWidth();
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
                pl plVar = this.f46111m1;
                if (plVar != null) {
                    plVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f46195sa = animatorSet2;
                animatorSet2.addListener(new ki(this, z10, runnable));
                this.f46195sa.setDuration(150L);
                this.f46195sa.playTogether(ofFloat);
                if (z10) {
                    org.telegram.messenger.g0.h3(yjVar, 200L);
                } else {
                    this.f46195sa.start();
                }
                return this.f46195sa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.t1 t1Var = this.P;
        if (t1Var != null && dialog == t1Var) {
            getMessagesController().X(0, this.f46103l6, false);
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && !r4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
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
        org.telegram.ui.Components.bt0 bt0Var;
        long j3 = this.f46103l6;
        int[] iArr = org.telegram.ui.Components.j21.N;
        ArrayList arrayList = new ArrayList(org.telegram.ui.Components.j21.R.values());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            if (org.telegram.messenger.gj.B0(gjVar.f24213k) == j3) {
                org.telegram.ui.Components.j21.x(gjVar);
            }
        }
        super.onFragmentDestroy();
        jh.e eVar = this.f45983c4;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f17799x;
            int size2 = longSparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i10);
                if (dVar.f17785i) {
                    eVar.f17798w.add(dVar.a());
                }
            }
            if (org.telegram.messenger.s2.f26730a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        rj rjVar = this.f45950a0;
        if (rjVar != null) {
            rjVar.c1();
        }
        vi viVar = this.f46147p1;
        if (viVar != null && (bt0Var = viVar.f34233d0) != null) {
            bt0Var.b(viVar.H);
        }
        kj kjVar = this.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        fi.n2 n2Var = this.Y1;
        if (n2Var != null) {
            n2Var.L();
        }
        org.telegram.ui.Components.h50 h50Var = this.f46162q3;
        if (h50Var != null) {
            h50Var.c(true);
        }
        ns p10 = ns.p();
        if (p10.f50298l == this.H9) {
            p10.W = null;
            p10.f50285a0 = null;
            p10.Y = null;
            p10.f50298l = null;
            p10.f50289c0 = null;
            p10.t();
        }
        getNotificationCenter().j(this.f45989ca);
        org.telegram.messenger.ls.e().j(this.f46002da);
        getNotificationCenter().j(this.f46016ea);
        getNotificationCenter().j(this.fa);
        K9();
        zd zdVar = this.f45998d6;
        if (zdVar != null) {
            org.telegram.messenger.g0.r(zdVar);
            this.f45998d6 = null;
        }
        org.telegram.messenger.ls notificationCenter = getNotificationCenter();
        fk fkVar = this.Ka;
        notificationCenter.getClass();
        boolean z11 = org.telegram.messenger.s2.f26730a;
        if (Thread.currentThread() == org.telegram.messenger.t0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(fkVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.np messagesController = getMessagesController();
            long j10 = this.f46103l6;
            if (this.f46036g4 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            messagesController.W4(j10, z10, false);
            if (this.f46241w4) {
                this.f46241w4 = false;
                getMessagesController().h4(this.f46103l6);
            }
            xi.e eVar2 = this.f46157pb;
            if (eVar2 != null) {
                eVar2.b();
                this.f46157pb = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.ls.f25384t);
            if (this.f46036g4 == 0 && org.telegram.messenger.g0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.ls.f25316h0, Long.valueOf(this.f46103l6), Long.valueOf(d()), Boolean.TRUE);
            }
            if (this.f46019f != null) {
                MediaController B = MediaController.B();
                if (B.T1 == null) {
                    B.T1 = new androidx.emoji2.text.j(B);
                }
                B.T1.f2268b = 0;
                org.telegram.messenger.t0.d.postDelayed(B.T1, 5000L);
            }
            org.telegram.messenger.n6 n6Var = this.T3;
            if (n6Var != null) {
                n6Var.e();
            }
            if (this.f46019f != null) {
                getMessagesController().f25945r1.remove(Long.valueOf(this.f46019f.f28583id));
            }
            org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
            fi.n2 n2Var2 = this.Y1;
            if (n2Var2 != null) {
                n2Var2.k1();
                this.Y1 = null;
            }
            org.telegram.messenger.g0.O3(getParentActivity());
            if (org.telegram.messenger.v3.T(this.f46005e)) {
                getMessagesController().h5(this.f46005e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f46181r8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().h5(getMessagesController().O0(Long.valueOf(this.f46181r8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            ql qlVar = this.f46219u9;
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
            org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f45947td ? 1 : 0);
                org.telegram.ui.ActionBar.r4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i11 = 0;
                    while (i11 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.h9) parentLayout2.getPulledDialogs().get(i11)).f35832b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                }
            }
            f45947td = false;
            vf.b bVar = this.f46017ec;
            if (bVar != null) {
                bVar.a(false);
                this.f46017ec = null;
            }
            org.telegram.messenger.k3 k3Var = this.Da;
            bn bnVar = k3Var.f25001a;
            ArrayList arrayList2 = k3Var.f25005f;
            ArrayList arrayList3 = k3Var.f25004e;
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList3.get(i12)).intValue(), false);
            }
            arrayList3.clear();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i13)).intValue(), false);
            }
            arrayList2.clear();
            ax0 ax0Var = this.f46218u8;
            if (ax0Var != null) {
                ax0Var.b(true);
                this.f46218u8 = null;
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
        org.telegram.messenger.gj gjVar = MediaController.B().f22771v0;
        if (gjVar != null && org.telegram.messenger.gj.L4(gjVar.f24213k)) {
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
        org.telegram.ui.Components.ui uiVar;
        rj rjVar = this.f45950a0;
        boolean z12 = false;
        if (rjVar != null && i7 == 2 && rjVar.Z3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.az.C(rjVar.R).o0(rjVar.Y3, rjVar.Z3);
            }
            rjVar.Z3 = null;
            rjVar.Y3 = null;
        }
        kj kjVar = this.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            jg.h1 adapter = this.X1.getAdapter();
            if (i7 == 2) {
                TLRPC.User user = adapter.f17558x0;
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
                n2Var3.f40378e2.b0();
            }
            org.telegram.ui.Components.np npVar = this.ya;
            if (npVar != null && (uiVar = npVar.S1) != null) {
                uiVar.f40378e2.b0();
            }
        } else if ((i7 == 5 || i7 == 30) && (n2Var = this.Y1) != null) {
            if (i7 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                n2Var.r1();
            }
        } else if ((i7 == 17 || i7 == 18) && (n2Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n2Var2.f40378e2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.X(z12);
            this.Y1.f40378e2.b0();
        } else if (i7 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131747118, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747106, null), new dh(this));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                alertDialog$Builder.p();
            }
        } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            cb(0);
        } else if (i7 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            cb(2);
        } else if (((i7 != 101 && i7 != 102) || this.f46019f == null) && (i7 != 103 || this.f46005e == null)) {
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
                    org.telegram.ui.Components.voip.b2.l(this.f46005e, null, this.f46167q8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f46019f;
                if (i7 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f46194s8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.b2.m(user2, z11, z12, getParentActivity(), getMessagesController().d2(this.f46019f.f28583id), getAccountInstance());
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
                Iterator it = fVar.f59054w.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11699g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            ui.f fVar2 = this.K;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f59054w.iterator();
                while (it2.hasNext()) {
                    fh.e eVar2 = ((fh.g) it2.next()).f11699g0;
                    if (eVar2 != null) {
                        eVar2.h = true;
                    }
                }
            }
            Paint paint = this.W8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29661s8));
            }
            RadialProgressView radialProgressView = this.f46187s0;
            if (radialProgressView != null) {
                if (S9()) {
                    i10 = org.telegram.ui.ActionBar.m6.Ka;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Zc;
                }
                radialProgressView.setProgressColor(getThemedColor(i10));
            }
            vj vjVar = this.f45994d1;
            if (vjVar != null) {
                vjVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.I0;
            if (n2Var != null && n2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.m6.Fi)) != this.L0 || this.Db != org.telegram.ui.ActionBar.m6.I.q())) {
                this.L0 = themedColor4;
                this.Db = org.telegram.ui.ActionBar.m6.I.q();
                Drawable background = this.I0.getBackground();
                org.telegram.ui.ActionBar.m6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.m6.H1(background, org.telegram.ui.ActionBar.a6.b(themedColor4), true);
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
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.We));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ve));
            }
            org.telegram.ui.Components.m80 m80Var = this.f46061i2;
            if (m80Var != null && this.S0) {
                m80Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.m6.Xe));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.m6.f29773y6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.Fi)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.H6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            sh.b bVar = this.f46097kd;
            if (bVar != null && (i7 = this.T0) >= 0) {
                bVar.setColor(getThemedColor(i7));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.m6.f29602p7);
                for (org.telegram.ui.ActionBar.o0 o0Var : set2) {
                    if (o0Var != null) {
                        o0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29602p7, false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.dd ddVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        int i7 = org.telegram.messenger.ls.K2;
        int i10 = org.telegram.messenger.ls.G0;
        int i11 = org.telegram.messenger.ls.f25384t;
        int i12 = org.telegram.messenger.ls.f25378s;
        if (z10) {
            if (!this.f46038g6) {
                this.f46038g6 = true;
                cd();
            }
            iArr = this.f45989ca == 0 ? new int[]{i12, i11, i10, i7, org.telegram.messenger.ls.D} : new int[]{i12, i11, i10, i7};
            this.f46026f6 = false;
            if (!z11) {
                this.f46052h6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.p10.C(this.f46019f) ? new int[]{i12, i11, i10, i7, org.telegram.messenger.ls.V} : null;
            rj rjVar = this.f45950a0;
            if (rjVar != null && (ddVar = rjVar.I2) != null) {
                org.telegram.messenger.g0.r(ddVar);
                rjVar.I2 = null;
            }
        }
        s7();
        this.f45989ca = getNotificationCenter().q(iArr, this.f45989ca, true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        D8(((org.telegram.messenger.zy) arrayList.get(0)).d, ((org.telegram.messenger.zy) arrayList.get(0)).f28411i);
        org.telegram.messenger.az.X(getAccountInstance(), arrayList, this.f46103l6, this.F5, this.f46114m4, null, this.D5, true, false, this.H5, null, z10, i7, 0, ((org.telegram.messenger.zy) arrayList.get(0)).f28422t, null, Y8(), 0L, false, j3, j9(), this.f46268y5, null, false);
        L6();
        if (i7 != 0) {
            if (this.f46050h4 == -1) {
                this.f46050h4 = 0;
            }
            this.f46050h4 = arrayList.size() + this.f46050h4;
            md(true);
        }
    }

    public final void p7(boolean z10) {
        int i7;
        if (this.C0 != null && !this.I5 && !this.D0.M && !this.f46257x7) {
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
            if (this.f46036g4 == 7) {
                if ((b10 - i12) - i10 <= i15 && !this.Y6 && !this.U6[0]) {
                    this.Y6 = true;
                    this.f46281z6.add(Integer.valueOf(this.f46127n6));
                    org.telegram.messenger.na a10 = org.telegram.messenger.na.a(this.currentAccount);
                    String str = this.J3;
                    int i16 = this.classGuid;
                    int i17 = this.f45996d4;
                    int i18 = this.f46127n6;
                    this.f46127n6 = i18 + 1;
                    a10.e(i16, i17, i18, str);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.g3(new org.telegram.messenger.fr(this, b10, i12, i10, i15, 1));
        }
    }

    public final void p8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.p8(int, java.lang.Object[]):void");
    }

    public final int p9(int i7) {
        SparseIntArray sparseIntArray = this.f46076j5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f45942od;
            f45942od = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final boolean pa() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.Components.c6 c6Var;
        org.telegram.messenger.gj gjVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.c6 m10;
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var;
        boolean z11;
        if (this.A0 != null && ((gjVar = MediaController.B().f22771v0) == null || org.telegram.messenger.gj.L4(gjVar.f24213k))) {
            hi.l3 l3Var = this.I2;
            ArrayList arrayList = null;
            if (l3Var != null && l3Var.W && (r1Var = this.Lb) != null) {
                ImageReceiver photoImage2 = r1Var.getPhotoImage();
                c6Var = photoImage2.m();
                if (c6Var != null) {
                    gjVar2 = r1Var.getMessageObject();
                    if (photoImage2.A() + r1Var.getTop() > this.A0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.N8 = z11;
                } else {
                    gjVar2 = null;
                }
            } else {
                c6Var = null;
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
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                        org.telegram.messenger.gj messageObject = r1Var2.getMessageObject();
                        boolean h42 = messageObject.h4();
                        if (!messageObject.g4() && !messageObject.S4() && ((org.telegram.messenger.gj.L4(messageObject.f24213k) || h42) && messageObject.f24241r0 == null && (m10 = (photoImage = r1Var2.getPhotoImage()).m()) != null)) {
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
                                this.N8 = z10;
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    gjVar2 = messageObject;
                                    c6Var = m10;
                                    break;
                                }
                                gjVar2 = messageObject;
                                c6Var = m10;
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
                org.telegram.messenger.cz.D(true);
                gjVar2.f24173b0 = c6Var.n();
                gjVar2.f24182d0 = c6Var.o();
                c6Var.stop();
                if (PhotoViewer.J1(gjVar2)) {
                    PhotoViewer.f43203g9.J0();
                }
                return MediaController.B().S(gjVar2);
            }
        }
        return false;
    }

    public final void pb() {
        this.f45991cc = null;
        this.f45962ac = 0;
        this.f45977bc = -1;
        this.dc = null;
        this.f46017ec = null;
        this.f46264y1.d(false);
    }

    public final void pc() {
        TLRPC.ChatFull chatFull = this.f46181r8;
        if (chatFull != null && !this.I5) {
            TLRPC.Chat chat = this.f46005e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.g0.h3(new zd(this, 16), 1000L);
            }
        }
    }

    public final void pd() {
        d8();
        String str = this.J3;
        if (str != null) {
            this.f46189s2.f37995e.setText(org.telegram.messenger.hd.a0(null, null, 2131749161, str));
            this.f45954a4.setEmptyView(this.f46189s2);
            return;
        }
        this.f45954a4.setEmptyView(null);
        this.f46189s2.setVisibility(8);
    }

    @Override
    public final boolean q() {
        return this.O9;
    }

    public final void q7(org.telegram.messenger.gj gjVar) {
        if (gjVar.D == 4 && !this.H8) {
            int i7 = org.telegram.messenger.cz.f23390a;
            if (!org.telegram.messenger.np.g1().contains("mapPreviewType")) {
                this.H8 = true;
                org.telegram.ui.Components.c5.p0(getParentActivity(), this.currentAccount, new zd(this, 12), true, this.Ba);
            }
        }
    }

    public final void q8(int r35, final java.lang.Object... r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.q8(int, java.lang.Object[]):void");
    }

    public final int q9(int i7) {
        SparseIntArray sparseIntArray = this.f46064i5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f45942od;
            f45942od = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final void qa(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.ActionBar.g2 g2Var;
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var == null) {
            return;
        }
        long j3 = gjVar.f24213k.action.channel_id;
        if (r4Var.getFragmentStack().size() > 0) {
            g2Var = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            g2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
        if (indexOf > 0 && !(g2Var instanceof bn) && !(g2Var instanceof ProfileActivity) && this.f46005e.creator) {
            int size = r4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) r4Var2.getFragmentStack().get(indexOf);
                if (g2Var2 instanceof bn) {
                    ((ActionBarLayout) r4Var2).c(indexOf, new bn(a8.p0.j(j3, "chat_id")));
                    g2Var2.removeSelfFromStack();
                } else if (g2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) r4Var2).c(indexOf, new ProfileActivity(a8.p0.j(j3, "chat_id"), null));
                    g2Var2.removeSelfFromStack();
                } else if (g2Var2 instanceof rn) {
                    ((ActionBarLayout) r4Var2).c(indexOf, new rn(a8.p0.j(j3, "chat_id")));
                    g2Var2.removeSelfFromStack();
                } else if (g2Var2 instanceof rq) {
                    if (((rq) g2Var2).f51708e1 == 0) {
                        Bundle arguments = g2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) r4Var2).c(indexOf, new rq(arguments));
                    }
                    g2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i(this, g2Var, gjVar, r4Var2, 9));
        }
        org.telegram.messenger.g0.h3(new bg.k0(this, j3, 2), 1000L);
    }

    public final void qb(org.telegram.ui.Cells.r1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.qb(org.telegram.ui.Cells.r1):void");
    }

    public final void qc(org.telegram.messenger.gj gjVar, CharSequence charSequence, int i7) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.lc.b0(this).G(2131623982, 9999, charSequence);
        G.f35527j = max;
        G.v = new re(this, i7, 3);
        G.k(true);
        this.V3 = gjVar;
        this.W3 = i7;
    }

    public final void qd() {
        boolean z10;
        if (this.f46264y1 == null) {
            return;
        }
        if ((!getMediaDataController().Z0.isEmpty() && this.H3 && !this.G3) || (this.f46036g4 == 7 && this.f45996d4 == 2 && !this.M6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46264y1.e(6, z10, true);
        this.f46264y1.e(5, z10, true);
        if (z10) {
            this.f46264y1.e(1, false, true);
        }
        if (!z10) {
            this.T7 = 0;
        }
        this.f46111m1.invalidate();
    }

    @Override
    public final org.telegram.ui.Components.co r() {
        return this.f46147p1;
    }

    public final void r7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.r7(boolean):void");
    }

    public final void r8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.r8(int, java.lang.Object[]):void");
    }

    public final long r9() {
        return this.f46191s4;
    }

    public final void ra(boolean z10) {
        int i7;
        if (this.A0 != null) {
            ArrayList arrayList = this.M6;
            if (!arrayList.isEmpty() && !this.Ta.f47832n) {
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
        org.telegram.ui.Components.cb0 j3;
        zm zmVar = this.Ba;
        if (zmVar != null) {
            Drawable c10 = zmVar.c();
            if (this.fragmentView != null) {
                c10 = this.f46111m1.getBackgroundImage();
            }
            if (c10 instanceof en) {
                c10 = ((en) c10).c(true);
            }
            if (c10 instanceof org.telegram.ui.Components.cb0) {
                ((org.telegram.ui.Components.cb0) c10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.u4) && (j3 = ((org.telegram.ui.ActionBar.u4) themedDrawable).j()) != null) {
                j3.w(false);
            }
        }
    }

    public final void rc(boolean z10) {
        boolean z11;
        lh.h hVar = this.f46264y1;
        if (hVar != null) {
            if (z10 && !org.telegram.messenger.v3.p0(this.f46005e)) {
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
        if (this.f46036g4 == 7 && !TextUtils.equals(this.J3, str)) {
            d8();
            sc(true);
            this.J3 = str;
            this.I3 = str;
            g7(false);
            M7(true);
            this.f46027f7 = 0L;
            this.C7 = false;
            org.telegram.messenger.na.a(this.currentAccount).b(this.f45996d4).a();
            this.f45969b4.f();
            this.f45954a4.requestLayout();
            if (this.f45954a4.getLayoutManager() != null) {
                this.f45954a4.getLayoutManager().n0(0);
            }
            pd();
            this.f46189s2.e(true, true);
            L8();
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f46129n8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.f46254x4) {
            if (this.f46019f != null) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f46019f.f28583id));
                if (c22 != null) {
                    this.f46019f = c22;
                } else {
                    return;
                }
            } else if (this.f46005e != null) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f46005e.f28434id));
                if (O0 != null) {
                    this.f46005e = O0;
                } else {
                    return;
                }
            }
            vi viVar = this.f46147p1;
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
        org.telegram.ui.Components.ch chVar = bnVar.f45966b1;
        if (chVar == null) {
            return 0.0f;
        }
        return chVar.d(f10);
    }

    public final boolean sa() {
        rj rjVar = this.f45950a0;
        boolean z10 = rjVar.f32691p3;
        if (z10) {
            rjVar.W1();
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
        rj rjVar = this.f45950a0;
        if (rjVar != null && this.f46111m1 != null && rjVar.getAdjustPanLayoutHelper() != null && !this.f45950a0.getAdjustPanLayoutHelper().f29010f) {
            this.Ma = this.f46111m1.getKeyboardHeight();
        } else {
            this.Ma = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f46129n8;
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
        vj vjVar;
        rj rjVar = this.f45950a0;
        if (rjVar != null && rjVar.f32722t2) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f46115m5 && rjVar != null && (vjVar = this.f45994d1) != null && vjVar.getVisibility() != 0) {
            gjVar = this.F5;
            charSequence = org.telegram.messenger.g0.n1(this.f45950a0.getDraftMessage());
            z10 = this.f45950a0.O3;
        } else {
            z10 = true;
            gjVar = null;
            charSequence = null;
        }
        if (this.E5) {
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
        ArrayList Y = mediaDataController.Y(charSequenceArr, z11, false);
        long Q7 = Q7(gjVar);
        TLRPC.DraftMessage T = getMediaDataController().T(this.f46103l6, Q7);
        if (T != null) {
            richMessage = T.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.si mediaDataController2 = getMediaDataController();
        long j10 = this.f46103l6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (gjVar != null && !gjVar.f24232p && gjVar.f24211j1 == null && !this.E5) {
            message = gjVar.f24213k;
        } else {
            message = null;
        }
        rm rmVar = this.D5;
        org.telegram.messenger.lj ljVar = this.f46268y5;
        if (ljVar != null) {
            suggestedPost = ljVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        rj rjVar2 = this.f45950a0;
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
            te.a aVar = this.f46045gd;
            if (aVar.f57701f != z10) {
                aVar.a(z10, true);
                if (!z10 && this.f46036g4 == 7) {
                    v4.c0 c0Var = (v4.c0) this.f45954a4.getLayoutManager();
                    Object E = this.f45969b4.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.f45969b4.E(c0Var.L0());
                    Object E3 = this.f45969b4.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.D0.L();
                        int L0 = this.C0.L0();
                        int N0 = this.C0.N0();
                        int i10 = ((org.telegram.messenger.gj) E).f24213k.f28455id;
                        int i11 = ((org.telegram.messenger.gj) E2).f24213k.f28455id;
                        int i12 = ((org.telegram.messenger.gj) E3).f24213k.f28455id;
                        int i13 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((org.telegram.messenger.gj) L.get(i14)).f24213k.f28455id == i11) {
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
                            if (((org.telegram.messenger.gj) L.get(i14)).f24213k.f28455id == i12) {
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
                            if (((org.telegram.messenger.gj) L.get(i14)).f24213k.f28455id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z11 && !z12 && i13 != -1) {
                            this.C0.h1(this.D0.K + i13, (this.A0.getHeight() - W8((org.telegram.messenger.gj) L.get(i13), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.o6 o6Var = this.f46088k3;
                if (o6Var != null) {
                    if (aVar.f57701f) {
                        i7 = 2131745622;
                    } else {
                        i7 = 2131745621;
                    }
                    o6Var.c(org.telegram.messenger.hd.N0(i7, null), !org.telegram.messenger.hd.f24444a0, true);
                }
                hi.l3 l3Var = this.M1;
                if (l3Var != null && l3Var.W) {
                    l3Var.f(true);
                }
                al alVar = this.Q1;
                if (alVar != null && alVar.W) {
                    alVar.f(true);
                }
                rj rjVar = this.f45950a0;
                if (rjVar != null) {
                    rjVar.J0();
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
            if (this.f46036g4 == 3 && e9() == 2666000) {
                this.H0.setText(org.telegram.messenger.hd.N0(2131753879, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                ad();
                org.telegram.ui.Components.ax0 ax0Var = this.f46188s1;
                if (ax0Var != null) {
                    ax0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f46005e;
                if (chat != null && !org.telegram.messenger.v3.n(chat)) {
                    TLRPC.Chat chat2 = this.f46005e;
                    if (!org.telegram.messenger.v3.p(chat2) && !org.telegram.messenger.v3.u(chat2) && !org.telegram.messenger.v3.s(chat2) && !org.telegram.messenger.v3.v(chat2) && !org.telegram.messenger.v3.l(chat2) && !org.telegram.messenger.v3.o(chat2) && !org.telegram.messenger.v3.t(chat2)) {
                        TLRPC.Chat chat3 = this.f46005e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.v3.T(chat3) || this.f46005e.megagroup)) {
                            TLRPC.Chat chat4 = this.f46005e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.v3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i7 = org.telegram.ui.ActionBar.m6.Fi;
                                    mutate.setTint(getThemedColor(i7));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i7);
                                    mutate.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
                                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(null, mutate, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(-6.0f));
                                    int L = org.telegram.messenger.g0.L(14.0f);
                                    int L2 = org.telegram.messenger.g0.L(14.0f);
                                    oqVar.f38332e = L;
                                    oqVar.f38333f = L2;
                                    int L3 = org.telegram.messenger.g0.L(14.0f);
                                    int L4 = org.telegram.messenger.g0.L(14.0f);
                                    oqVar.h = L3;
                                    oqVar.f38334n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131753578, null, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.k00(i7, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(oqVar, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i10 = org.telegram.ui.ActionBar.m6.f29473i6;
                                    org.telegram.ui.ActionBar.t6.Q(textView, org.telegram.ui.ActionBar.m6.i0(0, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), null, org.telegram.ui.ActionBar.t6.M(i10), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new oe(this, 0));
                                } else {
                                    this.H0.setText(org.telegram.messenger.hd.N0(2131749358, null));
                                }
                            } else if (org.telegram.messenger.g0.D1(chat4.banned_rights)) {
                                this.H0.setText(org.telegram.messenger.hd.N0(2131745401, null));
                            } else {
                                this.H0.setText(org.telegram.messenger.hd.a0("SendMessageRestricted", null, 2131745402, org.telegram.messenger.hd.v(this.f46005e.banned_rights.until_date)));
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            ad();
                            org.telegram.ui.Components.ax0 ax0Var2 = this.f46188s1;
                            if (ax0Var2 != null) {
                                ax0Var2.f();
                            }
                        }
                    }
                }
                W7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(org.telegram.messenger.hd.N0(2131751117, null));
                        this.T.setVisibility(0);
                        this.f45950a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.f3.q("AwaitingEncryption", null, 2131753754, new Object[]{a8.p0.s(new StringBuilder("<b>"), this.f46019f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.f45950a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(org.telegram.messenger.hd.N0(2131751116, null));
                        this.T.setVisibility(0);
                        this.f45950a0.setVisibility(4);
                        this.f45950a0.setFieldText("");
                        getMediaDataController().F(this.f46103l6, this.f46191s4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.T.setVisibility(4);
                            if (!this.inPreviewMode && !this.mb && this.f46036g4 != 3) {
                                this.f45950a0.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    l7();
                    V6(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.f46188s1 != null && (rjVar = this.f45950a0) != null && rjVar.I0()) {
                        this.f46188s1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.T.setVisibility(4);
            }
            if (z10) {
                this.f45950a0.K0(false);
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
        rj rjVar;
        int i7;
        float f12;
        super.setInPreviewMode(z10);
        int i10 = 8;
        boolean z13 = true;
        if (this.f46019f != null && this.f46159q0 != null) {
            TLRPC.UserFull d2 = getMessagesController().d2(this.f46019f.f28583id);
            if (d2 != null && d2.phone_calls_available) {
                this.f46068ia = !this.inPreviewMode;
                this.f46159q0.e(0);
            } else {
                this.f46068ia = false;
                this.f46159q0.e(8);
            }
        }
        vi viVar = this.f46147p1;
        float f13 = 0.0f;
        if (viVar != null) {
            viVar.setOccupyStatusBar(!z10);
            vi viVar2 = this.f46147p1;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            viVar2.setLayoutParams(c8.ma.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        rj rjVar2 = this.f45950a0;
        if (rjVar2 != null) {
            if (!z10) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            rjVar2.setVisibility(i7);
        }
        org.telegram.ui.Components.ax0 ax0Var = this.f46188s1;
        if (ax0Var != null) {
            if (this.f46178r5 && !z10 && ((rjVar = this.f45950a0) == null || !rjVar.f32692p4)) {
                i10 = 0;
            }
            ax0Var.setVisibility(i10);
        }
        kj kjVar = this.X1;
        if (kjVar != null) {
            ViewPropertyAnimator animate = kjVar.animate();
            if (!this.f45950a0.f32692p4 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.nr.f37960f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                x1Var = new org.telegram.ui.ActionBar.x1(false);
            } else {
                x1Var = null;
            }
            kVar.setBackButtonDrawable(x1Var);
            org.telegram.ui.ActionBar.q0 q0Var = this.f46072j0;
            if (q0Var != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.x xVar = this.f46032g0;
            if (xVar != null) {
                if (!z10) {
                    f13 = 1.0f;
                }
                xVar.f30237i = f13;
                org.telegram.ui.ActionBar.q0 q0Var2 = xVar.f30241m;
                if (q0Var2 != null) {
                    q0Var2.setAlpha(f13);
                }
            }
        }
        bj bjVar = this.A0;
        if (bjVar != null) {
            int childCount = bjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.A0.getChildAt(i11);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.r1;
                if (z14) {
                    gjVar = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    gjVar = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    gjVar = null;
                }
                if (gjVar != null && (message = gjVar.f24213k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.gj.R4(message) && !gjVar.h4()) {
                        int i12 = this.D6 - 1;
                        this.D6 = i12;
                        if (i12 <= 0) {
                            this.D6 = 0;
                            this.E6 = true;
                            rc(false);
                        } else {
                            this.f46264y1.c(2, i12, true);
                        }
                        org.telegram.messenger.np messagesController = getMessagesController();
                        int e12 = gjVar.e1();
                        if (org.telegram.messenger.v3.T(this.f46005e)) {
                            j3 = this.f46005e.f28434id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.u3(j3, e12, this.f46103l6);
                        gjVar.f24213k.media_unread = false;
                    }
                    if (z14) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                        r1Var.setHighlighted(false);
                        r1Var.q3();
                    }
                }
            }
            this.A0.setItemAnimator(null);
        }
        Pc(false);
        sd();
        mj mjVar = this.f46112m2;
        if (mjVar != null) {
            if (!z10 && !this.mb) {
                z12 = true;
            } else {
                z12 = false;
            }
            mjVar.setEnabled(z12);
        }
        mj mjVar2 = this.f46136o2;
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
        pl plVar = this.f46111m1;
        if (plVar != null) {
            plVar.setOccupyStatusBar((this.inBubbleMode || this.mb || this.inPreviewMode) ? false : false);
        }
    }

    public final boolean t7(View view) {
        CharSequence slowModeTimer = this.f45950a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            zc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void t8(java.lang.Object... r89) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.t8(java.lang.Object[]):void");
    }

    public final float t9(org.telegram.ui.Components.w11 w11Var) {
        float f10;
        org.telegram.ui.Components.a21 a21Var = this.f46034g2;
        if (a21Var != null) {
            float L = org.telegram.messenger.g0.L(7.0f);
            float k10 = a21Var.k(w11Var);
            if (w11Var == org.telegram.ui.Components.w11.f41625b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (org.telegram.messenger.g0.L(f10) + L) * k10;
        }
        return 0.0f;
    }

    public final void tb() {
        org.telegram.ui.Cells.r1 r1Var = null;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= this.A0.getChildCount()) {
                break;
            }
            View childAt = this.A0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.a2) && childAt.getBottom() > 0 && childAt.getTop() < this.A0.getHeight()) {
                r1Var = childAt;
                break;
            }
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                int min = Math.min(r1Var2.getBottom(), this.A0.getHeight()) - Math.max(0, r1Var2.getTop());
                if (min > i10) {
                    r1Var = r1Var2;
                    i10 = min;
                }
            }
            i7++;
        }
        if (r1Var != null) {
            ej ejVar = this.C0;
            this.A0.getClass();
            ejVar.i1(RecyclerView.R(r1Var), r1Var.getTop() - ((int) this.P9), false);
        }
    }

    public final void tc(TLRPC.TL_game tL_game, org.telegram.messenger.gj gjVar, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.Ba);
            String N0 = org.telegram.messenger.hd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            if (c22 != null) {
                str3 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
            }
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131753003, str3);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new di.t1(this, tL_game, gjVar, str, j3));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            showDialog(t1Var);
            return;
        }
        String o4 = org.telegram.messenger.p10.o(c22);
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
                    presentFragment(new cd1(str, str2, tL_game.title, tL_game.short_name, gjVar));
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
        cd1.a0(str, gjVar, parentActivity, str6, str3);
    }

    public final void td() {
        boolean z10;
        int i7;
        int i10;
        org.telegram.messenger.yi yiVar;
        int i11 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f46139o6;
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
            ik ikVar = this.Bb;
            if (ikVar != null) {
                ikVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                ik ikVar2 = this.Bb;
                if (isEmpty) {
                    i10 = 2131745676;
                } else {
                    i10 = 2131745675;
                }
                ikVar2.setHint(org.telegram.messenger.hd.N0(i10, null));
                org.telegram.messenger.g0.h3(new zd(this, 14), 120L);
            } else {
                z10 = !org.telegram.ui.Components.xi0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.q0 j3 = this.actionBar.p(null).j(28);
            if (j3 != null) {
                if (z10) {
                    i7 = 2131231899;
                } else {
                    i7 = 2131231901;
                }
                org.telegram.ui.Components.rh0 rh0Var = j3.f29933y;
                if (rh0Var != null && j3.E != i7) {
                    j3.E = i7;
                    org.telegram.messenger.g0.P3(rh0Var, i7);
                }
            }
        }
        if (this.f46233va != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((org.telegram.messenger.gj) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((org.telegram.messenger.gj) sparseArray2.valueAt(i15));
            }
            this.f46233va.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final void u(final org.telegram.messenger.ff ffVar, final org.telegram.messenger.f20 f20Var, final boolean z10, final int i7, final int i10, final boolean z11, long j3) {
        if (ffVar == null) {
            return;
        }
        this.f46004dd.a(false, true);
        org.telegram.messenger.gj gjVar = this.H5;
        if (gjVar != null && gjVar.p5() && !org.telegram.messenger.v3.z(this.currentAccount, 24, org.telegram.messenger.gj.B0(this.H5.f24213k))) {
            org.telegram.messenger.lj ljVar = this.f46268y5;
            if (ljVar == null) {
                ljVar = org.telegram.messenger.lj.b(this.H5.f24213k.suggested_post);
            }
            if (!di.y8.S(this.currentAccount, ljVar.f25234a)) {
                Ac(ljVar);
                return;
            }
        }
        if (f20Var != null && f20Var.f23844s) {
            af afVar = new af(this, 24);
            this.I7 = afVar;
            org.telegram.messenger.g0.h3(afVar, 3000L);
        }
        D8(ffVar.f28058a, ffVar.f28069n);
        org.telegram.ui.Components.c5.Y(this.currentAccount, a(), 1, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                Long l10 = (Long) obj;
                bn bnVar = bn.this;
                org.telegram.messenger.gj gjVar2 = bnVar.H5;
                org.telegram.messenger.ff ffVar2 = ffVar;
                org.telegram.messenger.f20 f20Var2 = f20Var;
                boolean z12 = z10;
                int i11 = i7;
                int i12 = i10;
                boolean z13 = z11;
                if (gjVar2 != null && gjVar2.p5()) {
                    org.telegram.messenger.lj ljVar2 = bnVar.f46268y5;
                    if (ljVar2 == null) {
                        ljVar2 = org.telegram.messenger.lj.b(bnVar.H5.f24213k.suggested_post);
                    }
                    org.telegram.messenger.lj ljVar3 = ljVar2;
                    if (ffVar2.f28059b) {
                        org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                        String str = ffVar2.I;
                        String str2 = ffVar2.f28063g;
                        TLRPC.Photo photo = ffVar2.f28061e;
                        long j10 = bnVar.f46103l6;
                        org.telegram.messenger.gj gjVar3 = bnVar.H5;
                        org.telegram.messenger.gj gjVar4 = bnVar.f46114m4;
                        rm rmVar = bnVar.D5;
                        ArrayList arrayList = ffVar2.f28069n;
                        int i13 = ffVar2.f28078x;
                        boolean z14 = ffVar2.M;
                        org.telegram.messenger.az.b0(i13, i11, i12, j10, ffVar2.f28079y, l10.longValue(), bnVar.j9(), ffVar2.f28058a, str, str2, arrayList, accountInstance, gjVar3, gjVar4, null, ljVar3, bnVar.Y8(), f20Var2, photo, null, rmVar, z12, z13, z14);
                    } else if (ffVar2.h != null) {
                        org.telegram.messenger.az.Z(bnVar.getAccountInstance(), ffVar2.h, ffVar2.f28060c, null, bnVar.f46103l6, bnVar.H5, bnVar.f46114m4, bnVar.D5, ffVar2.f28069n, ffVar2.f28073r, null, ffVar2.f28078x, null, f20Var2, z12, i11, z13, ffVar2.f28058a, bnVar.Y8(), ffVar2.f28079y, l10.longValue(), bnVar.j9(), ljVar3);
                    } else if (ffVar2.I != null) {
                        org.telegram.messenger.az.Z(bnVar.getAccountInstance(), ffVar2.I, ffVar2.f28060c, null, bnVar.f46103l6, bnVar.H5, bnVar.f46114m4, bnVar.D5, ffVar2.f28069n, ffVar2.f28073r, null, ffVar2.f28078x, null, f20Var2, z12, i11, z13, ffVar2.f28058a, bnVar.Y8(), ffVar2.f28079y, l10.longValue(), bnVar.j9(), ljVar3);
                    }
                } else if (ffVar2.f28059b) {
                    org.telegram.messenger.c accountInstance2 = bnVar.getAccountInstance();
                    String str3 = ffVar2.I;
                    String str4 = ffVar2.f28063g;
                    TLRPC.Photo photo2 = ffVar2.f28061e;
                    long j11 = bnVar.f46103l6;
                    org.telegram.messenger.gj gjVar5 = bnVar.F5;
                    org.telegram.messenger.gj gjVar6 = bnVar.f46114m4;
                    rm rmVar2 = bnVar.D5;
                    ArrayList arrayList2 = ffVar2.f28069n;
                    int i14 = ffVar2.f28078x;
                    org.telegram.messenger.gj gjVar7 = bnVar.H5;
                    boolean z15 = ffVar2.M;
                    org.telegram.messenger.az.b0(i14, i11, i12, j11, ffVar2.f28079y, l10.longValue(), bnVar.j9(), ffVar2.f28058a, str3, str4, arrayList2, accountInstance2, gjVar5, gjVar6, gjVar7, bnVar.f46268y5, bnVar.Y8(), f20Var2, photo2, null, rmVar2, z12, z13, z15);
                } else if (ffVar2.h != null) {
                    org.telegram.messenger.az.Z(bnVar.getAccountInstance(), ffVar2.h, ffVar2.f28060c, null, bnVar.f46103l6, bnVar.F5, bnVar.f46114m4, bnVar.D5, ffVar2.f28069n, ffVar2.f28073r, null, ffVar2.f28078x, bnVar.H5, f20Var2, z12, i11, z13, ffVar2.f28058a, bnVar.Y8(), ffVar2.f28079y, l10.longValue(), bnVar.j9(), bnVar.f46268y5);
                } else if (ffVar2.I != null) {
                    org.telegram.messenger.az.Z(bnVar.getAccountInstance(), ffVar2.I, ffVar2.f28060c, null, bnVar.f46103l6, bnVar.F5, bnVar.f46114m4, bnVar.D5, ffVar2.f28069n, ffVar2.f28073r, null, ffVar2.f28078x, bnVar.H5, f20Var2, z12, i11, z13, ffVar2.f28058a, bnVar.Y8(), ffVar2.f28079y, l10.longValue(), bnVar.j9(), bnVar.f46268y5);
                }
                bnVar.L6();
            }
        }, j3);
    }

    public final boolean u7() {
        CharSequence slowModeTimer = this.f45950a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131745114, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SlowModeHint", null, 2131745115, slowModeTimer));
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
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
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList3.get(i11);
                    if (zyVar.f28415m == null && zyVar.f28413k == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.zy) arrayList3.get(0)).d)) {
                    org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(((org.telegram.messenger.zy) arrayList3.get(0)).d, bnVar2.f46103l6, bnVar2.F5, bnVar2.f46114m4, null, false, ((org.telegram.messenger.zy) arrayList3.get(0)).f28411i, null, null, z10, i7, 0, null, false);
                    b10.K = bnVar2.Y8();
                    org.telegram.messenger.az.C(bnVar2.currentAccount).r0(b10);
                }
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) arrayList3.get(i12);
                if (zyVar2.f28415m != null && zyVar2.f28413k == null) {
                    org.telegram.messenger.c accountInstance = bnVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = zyVar2.f28415m;
                    HashMap hashMap = zyVar2.f28416n;
                    int i13 = i12;
                    org.telegram.messenger.az.S(i7, bnVar2.f46103l6, 0L, bnVar2.j9(), hashMap, accountInstance, bnVar2.F5, bnVar2.f46114m4, bnVar2.Y8(), botInlineResult, null, bnVar2, bnVar2.D5, z10);
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
                bnVar3.D8(((org.telegram.messenger.zy) arrayList4.get(0)).d, ((org.telegram.messenger.zy) arrayList4.get(0)).f28411i);
                org.telegram.messenger.az.X(bnVar3.getAccountInstance(), arrayList4, bnVar3.f46103l6, bnVar3.F5, bnVar3.f46114m4, null, bnVar3.D5, false, true, bnVar3.H5, null, z10, i7, 0, ((org.telegram.messenger.zy) arrayList4.get(0)).f28422t, null, bnVar3.Y8(), 0L, false, 0L, bnVar3.j9(), bnVar3.f46268y5, null, false);
                L6();
                if (i7 != 0) {
                    if (this.f46050h4 == -1) {
                        this.f46050h4 = 0;
                    }
                    this.f46050h4 = arrayList.size() + this.f46050h4;
                    md(true);
                }
            }
        }
    }

    public final org.telegram.messenger.bj u9(org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.P6.f(gjVar.c1());
        if (bjVar != null && (bjVar.d.size() <= 1 || bjVar.d(gjVar) == null)) {
            return null;
        }
        return bjVar;
    }

    public final void ub(org.telegram.messenger.gj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.ub(org.telegram.messenger.gj):void");
    }

    public final void uc(boolean z10) {
        if (z10) {
            if (this.f46044gc == null) {
                zd zdVar = new zd(this, 13);
                this.f46044gc = zdVar;
                org.telegram.messenger.g0.h3(zdVar, 100L);
                return;
            }
            return;
        }
        zd zdVar2 = this.f46044gc;
        if (zdVar2 != null) {
            org.telegram.messenger.g0.r(zdVar2);
        }
        this.f46044gc = null;
        this.fc = false;
        fd(true);
    }

    public final void ud() {
        lh.h hVar;
        org.telegram.ui.ActionBar.x xVar;
        rj rjVar = this.f45950a0;
        if (rjVar != null) {
            if (this.f46036g4 != 1 && !this.f46227v4 && !ca()) {
                hVar = null;
            } else {
                hVar = this.f46264y1;
            }
            rjVar.setSideButtonsForAttach(hVar);
            boolean ca2 = ca();
            if (this.f46273yb != ca2) {
                this.f46273yb = ca2;
                org.telegram.ui.ActionBar.q0 q0Var = this.f46072j0;
                if ((q0Var != null && q0Var.getVisibility() == 0) || ((xVar = this.f46032g0) != null && xVar.f30240l == 0)) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!kVar.f29150o0 && !kVar.x()) {
                        if (this.f45950a0.I0() && TextUtils.isEmpty(this.f45950a0.getSlowModeTimer()) && !ca()) {
                            org.telegram.ui.ActionBar.x xVar2 = this.f46032g0;
                            if (xVar2 != null) {
                                xVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var2 = this.f46072j0;
                            if (q0Var2 != null) {
                                q0Var2.setVisibility(8);
                            }
                            fr frVar = this.f46020f0;
                            if (frVar != null) {
                                frVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.x xVar3 = this.f46032g0;
                            if (xVar3 != null) {
                                xVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var3 = this.f46072j0;
                            if (q0Var3 != null) {
                                q0Var3.setVisibility(0);
                            }
                            fr frVar2 = this.f46020f0;
                            if (frVar2 != null) {
                                frVar2.b(false);
                            }
                        }
                        vi viVar = this.f46147p1;
                        if (viVar != null) {
                            viVar.f34243l0 = false;
                        }
                    }
                }
            }
        }
    }

    public final void v7(Runnable runnable, cg.a aVar, boolean z10) {
        if (aVar != null && z10) {
            o1 o1Var = new o1(this, aVar, runnable, 20);
            di.y8 x10 = di.y8.x(this.currentAccount, aVar.f5303a);
            if (!x10.f10088e) {
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

    public final float v9(org.telegram.ui.Cells.r1 r1Var, float f10) {
        int[] iArr = this.Kb;
        r1Var.getLocationInWindow(iArr);
        int i7 = iArr[0];
        this.f46111m1.getLocationInWindow(iArr);
        return (i7 - iArr[0]) + f10;
    }

    public final void va() {
        Y6(5, this.f46007e1, true);
        Y6(1, this.f45950a0, false);
        Y6(4, this.f46035g3, true);
        Y6(3, this.f45994d1, false);
        Y6(2, this.T, false);
        float f10 = this.f46018ed.f57700e;
        m6.n nVar = this.f46084jd;
        float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 1.0f - ((float[]) nVar.f20910b)[5], 1.0f);
        lh.c cVar = this.f46007e1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(t6);
        }
        rj rjVar = this.f45950a0;
        if (rjVar != null) {
            rjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        uj ujVar = this.f46035g3;
        if (ujVar != null) {
            ujVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * t6);
        }
        vj vjVar = this.f45994d1;
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
        vj vjVar2 = this.f45994d1;
        te.a aVar = this.f45992cd;
        if (vjVar2 != null) {
            vjVar2.setTotalVisibilityFactor((1.0f - aVar.f57700e) * ((float[]) nVar.f20910b)[3]);
        }
        yo yoVar = this.ma;
        if (yoVar != null) {
            float f11 = aVar.f57700e;
            if (yoVar.T != f11) {
                yoVar.T = f11;
                this.fragmentView.invalidate();
            }
        }
        F7();
    }

    public final void vb(long j3) {
        ej ejVar;
        org.telegram.messenger.gj messageObject;
        int h92;
        int abs;
        int i7 = -1;
        if (this.A0 != null && (ejVar = this.C0) != null && ejVar.f59126y < 0) {
            int i10 = 0;
            if (this.W6[0] && ejVar.L0() == 0) {
                this.F7 = -1;
                return;
            }
            int i11 = Integer.MAX_VALUE;
            for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = ((org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject.Y1() == j3 && (abs = Math.abs((h92 = h9(childAt)))) < i11) {
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
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.np.u1(this.currentAccount).H5 * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!org.telegram.messenger.k10.i(this.currentAccount).q() && !org.telegram.messenger.np.u1(this.currentAccount).K3()) {
                if (z10) {
                    f10 = org.telegram.messenger.np.u1(this.currentAccount).F5;
                } else {
                    f10 = org.telegram.messenger.np.u1(this.currentAccount).G5;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(this);
                    if (z10) {
                        i7 = 2131743557;
                    } else {
                        i7 = 2131751336;
                    }
                    String N0 = org.telegram.messenger.hd.N0(i7, null);
                    if (z10) {
                        i10 = 2131743556;
                    } else {
                        i10 = 2131751335;
                    }
                    org.telegram.ui.Components.gc I = b02.I(2131624211, N0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(i10, null), new de(this, z10, 1)), spannableString, "%d"));
                    I.f35527j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void vd(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.Wallet.k4 k4Var;
        if (this.fragmentView != null && !this.I5) {
            int childCount = this.A0.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 < childCount) {
                    View childAt = this.A0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        org.telegram.messenger.gj messageObject = v0Var.getMessageObject();
                        if (this.f46000d8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.f46000d8 && v0Var.T()) {
                            org.telegram.ui.Wallet.m4 m4Var = v0Var.J0;
                            if (!m4Var.f44572h0 && (m4Var.f44567e0 == 0 || (k4Var = m4Var.f44565d0) == null || k4Var.c())) {
                                m4Var.e();
                                org.telegram.ui.Wallet.k4 k4Var2 = m4Var.f44565d0;
                                k4Var2.getClass();
                                k4Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.k4 k4Var3 = m4Var.f44565d0;
                                k4Var3.f38813b = -1L;
                                k4Var3.f38814c = -1L;
                                m4Var.f44567e0 = SystemClock.elapsedRealtime();
                                m4Var.f44569f0 = false;
                                m4Var.f44559a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                        org.telegram.messenger.gj messageObject2 = r1Var.getMessageObject();
                        if (this.J8 != null && ((messageObject2.h4() || org.telegram.messenger.gj.L4(messageObject2.f24213k)) && !messageObject2.T4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = r1Var.getPhotoImage();
                            this.J8.setTranslationX(r1Var.getX() + photoImage.L0);
                            this.J8.setTranslationY((this.A0.getY() + ((r1Var.getY() + r1Var.getPaddingTop()) + photoImage.M0)) - this.J8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J8.getLayoutParams();
                            if (messageObject2.h4()) {
                                this.J8.setTag(2131296593, null);
                                if (layoutParams.width != org.telegram.messenger.g0.f3(ba(), S9()) || layoutParams.height != org.telegram.messenger.g0.f3(ba(), S9())) {
                                    int f32 = org.telegram.messenger.g0.f3(ba(), S9());
                                    layoutParams.height = f32;
                                    layoutParams.width = f32;
                                    this.L8.setResizeMode(0);
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                float f33 = ((org.telegram.messenger.g0.f24052x * 2) + org.telegram.messenger.g0.f3(ba(), S9())) / org.telegram.messenger.g0.f3(ba(), S9());
                                float f34 = r1Var.getPhotoImage().N0 / org.telegram.messenger.g0.f3(ba(), S9());
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
                                this.J8.setTag(2131296593, photoImage);
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
            if (z10 && this.J8 != null && (gjVar = MediaController.B().f22771v0) != null && gjVar.T == 0) {
                if (!z12) {
                    if (this.B3 && org.telegram.messenger.gj.L4(gjVar.f24213k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.J8.setTranslationY((-org.telegram.messenger.g0.f3(ba(), S9())) - 100);
                    this.fragmentView.invalidate();
                    if (gjVar.h4() || org.telegram.messenger.gj.L4(gjVar.f24213k)) {
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
                    if (!gjVar.h4() && !this.N8) {
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
        this.f46111m1.addView(nkVar, 17, c8.ma.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void w8(View view, boolean z10) {
        boolean z11;
        Ub(view);
        if (view != this.f46264y1) {
            z11 = true;
        } else {
            z11 = false;
        }
        x8(z10, z11, 0.2f);
    }

    public final float w9(org.telegram.ui.Cells.r1 r1Var, float f10) {
        int[] iArr = this.Kb;
        r1Var.getLocationInWindow(iArr);
        int i7 = iArr[1];
        this.f46111m1.getLocationInWindow(iArr);
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
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                            i7 = h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
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
            if (!org.telegram.messenger.g0.Q1() && !this.f46227v4 && this.f46019f == null) {
                if (this.Ib == null) {
                    this.Ib = Boolean.valueOf(org.telegram.messenger.qc.e(360928));
                }
                if (this.Ib.booleanValue()) {
                    this.Hb = z10;
                    return;
                }
            }
            int i7 = 0;
            if (this.f46038g6 && org.telegram.messenger.cz.c()) {
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
        vi viVar = this.f46147p1;
        if (viVar == null) {
            return;
        }
        int i7 = this.f46036g4;
        if (i7 == 8 && (chat = this.f46005e) != null) {
            if (this.f46063i4) {
                String j3 = qg.c.j(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.f46005e;
                viVar.h(j3, chat2.scam, chat2.fake, chat2.verified, false, null, z10);
            } else if (org.telegram.messenger.v3.p0(chat)) {
                int i10 = (this.f46191s4 > 0L ? 1 : (this.f46191s4 == 0L ? 0 : -1));
                if (i10 == 0) {
                    TLRPC.Chat chat3 = this.f46005e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f46005e.linked_monoforum_id));
                        if (O02 == null) {
                            O02 = this.f46005e;
                        }
                        this.f46147p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(O02.title)), O02.scam, O02.fake, O02.verified, false, O02.emoji_status, z10);
                    } else {
                        vi viVar2 = this.f46147p1;
                        String F2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.f46005e;
                        viVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z10);
                    }
                } else if (i10 > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f46191s4));
                    this.f46147p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.p10.q(c22))), c22.scam, c22.fake, c22.verified, c22.premium, c22.emoji_status, z10);
                } else {
                    TLRPC.Chat O03 = getMessagesController().O0(Long.valueOf(-this.f46191s4));
                    if (O03 == null) {
                        O03 = this.f46005e;
                    }
                    this.f46147p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(O03.title)), O03.scam, O03.fake, O03.verified, false, O03.emoji_status, z10);
                }
            } else {
                vi viVar3 = this.f46147p1;
                String F22 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.f46005e.title));
                TLRPC.Chat chat5 = this.f46005e;
                viVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i7 == 9) {
                viVar.setTitle(org.telegram.messenger.hd.N0(2131742632, null));
            } else if (i7 == 5) {
                if ("hello".equalsIgnoreCase(this.f46024f4)) {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131752763, null));
                } else if ("away".equalsIgnoreCase(this.f46024f4)) {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131752826, null));
                } else {
                    this.f46147p1.setTitle(this.f46024f4);
                }
            } else if (i7 == 6) {
                if (!TextUtils.isEmpty(this.f46010e4.title)) {
                    this.f46147p1.setTitle(this.f46010e4.title);
                } else {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131752704, null));
                }
            } else if (i7 == 3) {
                long j10 = this.f46191s4;
                if (j10 > 0) {
                    user = getMessagesController().c2(Long.valueOf(j10));
                    O0 = null;
                } else {
                    O0 = getMessagesController().O0(Long.valueOf(-j10));
                    user = null;
                }
                if (org.telegram.messenger.p10.A(user)) {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131746070, null));
                } else if (org.telegram.messenger.p10.t(user)) {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131754249, null));
                } else if (org.telegram.messenger.p10.C(user)) {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131748110, null));
                } else if (user != null) {
                    this.f46147p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.p10.q(user))));
                } else if (O0 != null) {
                    this.f46147p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(O0.title)));
                } else {
                    this.f46147p1.setTitle("");
                }
            } else if (fa() && !org.telegram.messenger.p10.v(this.f46019f)) {
                if (this.f46254x4) {
                    Bd();
                } else if (this.f46227v4) {
                    if (this.f46114m4.x2()) {
                        this.f46147p1.setTitle(org.telegram.messenger.hd.G(this.f46114m4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131751984, null));
                    }
                } else {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.G(this.f46114m4.M1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.p10.A(this.f46019f)) {
                this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131746070, null));
            } else if (org.telegram.messenger.p10.t(this.f46019f)) {
                this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131754249, null));
            } else {
                int i11 = this.f46036g4;
                if (i11 == 1) {
                    if (org.telegram.messenger.p10.C(this.f46019f)) {
                        this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131746126, null));
                    } else {
                        this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131745652, null));
                    }
                } else if (i11 == 2) {
                    this.f46147p1.setTitle(org.telegram.messenger.hd.G(c9(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.f46005e;
                    if (chat6 != null) {
                        vi viVar4 = this.f46147p1;
                        String F23 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.f46005e;
                        viVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                    } else {
                        TLRPC.User user2 = this.f46019f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f46147p1.setTitle(org.telegram.messenger.hd.N0(2131745705, null));
                            } else if (!org.telegram.messenger.np.L2(user2) && getContactsController().f24606g0.get(Long.valueOf(this.f46019f.f28583id)) == null && (getContactsController().f24606g0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f46019f.phone)) {
                                    vi viVar5 = this.f46147p1;
                                    String h = org.telegram.messenger.o10.h(new StringBuilder("+"), this.f46019f.phone, pf.b.c());
                                    TLRPC.User user3 = this.f46019f;
                                    boolean z11 = user3.scam;
                                    boolean z12 = user3.fake;
                                    boolean z13 = user3.verified;
                                    org.telegram.messenger.np messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f46019f;
                                    messagesController.getClass();
                                    viVar5.h(h, z11, z12, z13, org.telegram.messenger.np.H2(user4), this.f46019f.emoji_status, z10);
                                } else {
                                    vi viVar6 = this.f46147p1;
                                    String F24 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.p10.q(this.f46019f)));
                                    TLRPC.User user5 = this.f46019f;
                                    boolean z14 = user5.scam;
                                    boolean z15 = user5.fake;
                                    boolean z16 = user5.verified;
                                    org.telegram.messenger.np messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f46019f;
                                    messagesController2.getClass();
                                    viVar6.h(F24, z14, z15, z16, org.telegram.messenger.np.H2(user6), this.f46019f.emoji_status, z10);
                                }
                            } else {
                                vi viVar7 = this.f46147p1;
                                String F25 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.p10.q(this.f46019f)));
                                TLRPC.User user7 = this.f46019f;
                                boolean z17 = user7.scam;
                                boolean z18 = user7.fake;
                                boolean z19 = user7.verified;
                                org.telegram.messenger.np messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f46019f;
                                messagesController3.getClass();
                                boolean H2 = org.telegram.messenger.np.H2(user8);
                                if (!org.telegram.messenger.np.L2(this.f46019f)) {
                                    emojiStatus = this.f46019f.emoji_status;
                                }
                                viVar7.h(F25, z17, z18, z19, H2, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f46147p1.getTitleTextView().getText());
        yd(false);
    }

    public final void x7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.f46109lc > 1000) {
            z10 = true;
        }
        vf vfVar = this.f46120mc;
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
        org.telegram.ui.Cells.r1 r1Var;
        if (f10 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.Z8;
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) view;
            r1Var2.setInvalidatesParent(z12);
            if (z12) {
                qb(r1Var2);
            }
        }
        this.f46111m1.invalidate();
        this.A0.invalidate();
        AnimatorSet animatorSet = this.f46029f9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f46029f9.cancel();
        }
        this.f46029f9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.X8, f10);
        float f11 = 1.0f;
        if (z12) {
            this.f45959a9 = 1.0f;
            this.f45974b9 = 0.0f;
            ValueAnimator valueAnimator = this.Ic;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.Y8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.yk0.d(new le(this, 3));
            }
        } else {
            float f12 = this.X8;
            this.f45974b9 = f12 / max;
            this.Y8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new rf(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f46264y1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f11));
        }
        this.f46029f9.playTogether(arrayList);
        this.f46029f9.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f46029f9.setDuration(320L);
        View view2 = this.Z8;
        if (view2 instanceof org.telegram.ui.Cells.r1) {
            r1Var = (org.telegram.ui.Cells.r1) view2;
        } else {
            r1Var = null;
        }
        this.f46029f9.addListener(new androidx.fragment.app.g(this, z12, r1Var, 6));
        if (this.Z8 != null && this.f45959a9 <= 0.0f) {
            Ub(null);
        }
        this.f46029f9.start();
    }

    public final void x9(boolean z10) {
        int i7;
        int i10;
        if (this.f46036g4 == 7) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.K3;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            org.telegram.messenger.ma b10 = a10.b(this.f45996d4);
            if (i13 >= 0 && i13 < b10.f25545a.size()) {
                b10.f25554l = i13;
                org.telegram.messenger.ls.f(a10.f25747a).k(org.telegram.messenger.ls.I0, Integer.valueOf(i11), Integer.valueOf(b10.f25555m), Boolean.valueOf(b10.f25556n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f25554l), Integer.valueOf(((org.telegram.messenger.gj) b10.f25545a.get(i13)).f24213k.f28455id));
                return;
            }
            return;
        }
        org.telegram.messenger.si mediaDataController = getMediaDataController();
        long j3 = this.f46103l6;
        long j10 = this.f45999d7;
        int i14 = this.classGuid;
        boolean z11 = this.f46132nb;
        if (!z10 ? !z11 : z11) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        mediaDataController.c2(null, j3, j10, i14, i7, this.f46191s4, false, this.D3, this.E3, true, this.F3);
        sc(false);
    }

    public final void xa() {
        this.R4 = true;
        ql qlVar = this.f46219u9;
        org.telegram.messenger.g0.r(qlVar.f32278f0);
        qlVar.f32304z = false;
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
            this.f45984c5 = true;
            this.f45970b5 = ((Integer) this.V4.get(0)).intValue();
        }
    }

    public final boolean xb() {
        rj rjVar = this.f45950a0;
        if (rjVar != null && rjVar.V0() && !this.f45950a0.f32598d1 && !MediaController.B().K()) {
            this.f46138o5 = true;
            rj rjVar2 = this.f45950a0;
            this.f46151p5 = rjVar2.P;
            this.f46164q5 = rjVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void xc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String N0 = org.telegram.messenger.hd.N0(2131752645, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131752646, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new ee(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        showDialog(t1Var);
    }

    public final void xd() {
        yd(false);
    }

    @Override
    public final boolean y(final org.telegram.ui.cx r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.y91 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.y(org.telegram.ui.cx, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.y91):boolean");
    }

    public final void y7() {
        int t92 = (int) (t9(org.telegram.ui.Components.w11.f41626c) + this.U.getInputBubbleHeight() + this.f46236w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        this.Z.setFadeZoneBottom(t92);
        int b10 = c8.l9.b(org.telegram.messenger.g0.L(36.0f) + (this.f46111m1.getMeasuredHeight() - t92), 0, this.f46111m1.getMeasuredHeight());
        int measuredWidth = this.f46111m1.getMeasuredWidth();
        Rect rect = f45948ud;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Xa, this.A0.getMeasuredWidth(), org.telegram.messenger.g0.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Ya) - t92));
    }

    public final void y8(Runnable runnable) {
        org.telegram.messenger.ls.f(this.currentAccount).d(runnable);
    }

    public final void y9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.y9():void");
    }

    public final int yb(org.telegram.messenger.gj r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn.yb(org.telegram.messenger.gj):int");
    }

    public final void yc() {
        String str;
        if (this.f46096kc != null) {
            return;
        }
        if (this.F5 != null) {
            str = getMessagesController().e1(this.F5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String N0 = org.telegram.messenger.hd.N0(2131743566, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743567, str));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751323, null), new ee(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ee(this, 20));
        t1Var.setOnDismissListener(new ke(this, 8));
        this.f46096kc = alertDialog$Builder.p();
    }

    public final void yd(boolean z10) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.o0 o0Var;
        if (this.f46147p1 != null) {
            int i7 = this.f46036g4;
            if (i7 == 0 || i7 == 8) {
                boolean u22 = getMessagesController().u2(this.f46103l6, d(), null);
                if (z10) {
                    u22 = !u22;
                }
                this.R0 = null;
                if (!org.telegram.messenger.v3.e0(this.currentAccount, this.f46005e) && !org.telegram.messenger.v3.f0(this.currentAccount, this.f46019f)) {
                    if (!org.telegram.messenger.p10.A(this.f46019f) && ((!fa() || this.f46254x4) && u22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231943).mutate();
                    int i10 = org.telegram.ui.ActionBar.m6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i10);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f46005e;
                    if (chat != null) {
                        drawable = this.f46147p1.c(org.telegram.messenger.n5.c(chat));
                    } else {
                        TLRPC.User user = this.f46019f;
                        if (user != null && !org.telegram.messenger.p10.C(user)) {
                            drawable = this.f46147p1.c(org.telegram.messenger.n5.c(this.f46019f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f46147p1.j(drawable, mutate);
                if (!z10 && (o0Var = this.f46199t1) != null) {
                    if (u22) {
                        if (o0Var.f29841m != 8) {
                            o0Var.f29841m = 8;
                            View view = o0Var.f29838j;
                            if (view instanceof org.telegram.ui.ActionBar.y0) {
                                ((org.telegram.ui.ActionBar.y0) view).getRightIcon().setVisibility(o0Var.f29841m);
                            }
                        }
                        this.f46199t1.d(org.telegram.messenger.hd.N0(2131743604, null));
                        this.f46199t1.b(2131232258);
                    } else {
                        if (o0Var.f29841m != 0) {
                            o0Var.f29841m = 0;
                            View view2 = o0Var.f29838j;
                            if (view2 instanceof org.telegram.ui.ActionBar.y0) {
                                ((org.telegram.ui.ActionBar.y0) view2).getRightIcon().setVisibility(o0Var.f29841m);
                            }
                        }
                        if (getMessagesController().v2(this.f46103l6, d())) {
                            this.f46199t1.d(org.telegram.messenger.hd.N0(2131748121, null));
                            this.f46199t1.b(2131232414);
                        } else {
                            this.f46199t1.d(org.telegram.messenger.hd.N0(2131748121, null));
                            this.f46199t1.b(2131232368);
                        }
                    }
                }
                org.telegram.ui.Components.ro roVar = this.f46251x1;
                if (roVar != null) {
                    roVar.e(this.f46103l6, d(), null);
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
        if (this.f46147p1 != null) {
            float actionModeFactor = (1.0f - this.f46058hd.f57700e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, actionModeFactor);
            this.f46147p1.setScaleX(T1);
            this.f46147p1.setScaleY(T1);
            this.f46147p1.setAlpha(actionModeFactor);
            vi viVar = this.f46147p1;
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
        org.telegram.messenger.gj gjVar = this.H5;
        if (gjVar != null && (message = gjVar.f24213k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean z9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f46139o6;
        for (int i7 = 0; i7 < sparseArrayArr.length; i7++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i7].size(); i10++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].valueAt(i10);
                    if (gjVar != null && (message = gjVar.f24213k) != null && message.noforwards) {
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
        hi.l3 l3Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((l3Var = this.B2) != null && l3Var.W)) {
                this.B2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SlowModeHint", null, 2131745115, charSequence)));
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
