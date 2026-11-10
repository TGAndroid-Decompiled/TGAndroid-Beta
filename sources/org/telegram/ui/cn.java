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
public class cn extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, tw, pa0, org.telegram.ui.Components.lj, org.telegram.ui.Components.jg, pg.b, org.telegram.ui.Components.b40, te.b {
    public static int f44408kd = 22;
    public static float f44409ld = 1.4f;
    public static int f44410md = 10;
    public static Pattern f44411nd;
    public static Pattern f44412od;
    public static Pattern f44413pd;
    public static final int[] f44414qd = {org.telegram.messenger.qs.f25114y, org.telegram.messenger.qs.f25121z, org.telegram.messenger.qs.A, org.telegram.messenger.qs.B, org.telegram.messenger.qs.Z, org.telegram.messenger.qs.C0, org.telegram.messenger.qs.f25081t0, org.telegram.messenger.qs.W0, org.telegram.messenger.qs.f24995e1, org.telegram.messenger.qs.T1, org.telegram.messenger.qs.G, org.telegram.messenger.qs.f25080t, org.telegram.messenger.qs.U, org.telegram.messenger.qs.E0, org.telegram.messenger.qs.F0, org.telegram.messenger.qs.f25126z4, org.telegram.messenger.qs.f25009g3, org.telegram.messenger.qs.f25059p4, org.telegram.messenger.qs.L};
    public static boolean f44415rd = false;
    public static final Rect f44416sd = new Rect();
    public ej A0;
    public int A1;
    public fi.m3 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.ij A5;
    public int A6;
    public boolean A7;
    public String A8;
    public boolean A9;
    public yh.d Aa;
    public boolean Ab;
    public boolean Ac;
    public fj B0;
    public org.telegram.ui.Components.bc B1;
    public fi.m3 B2;
    public boolean B3;
    public ih B4;
    public sm B5;
    public int B6;
    public boolean B7;
    public org.telegram.messenger.ij B8;
    public boolean B9;
    public final org.telegram.messenger.i3 Ba;
    public boolean Bb;
    public boolean Bc;
    public ll C0;
    public ck C1;
    public fi.m3 C2;
    public TLRPC.User C3;
    public final SparseArray C4;
    public boolean C5;
    public boolean C6;
    public boolean C7;
    public org.telegram.messenger.ij C8;
    public vk C9;
    public TLRPC.TL_channels_sendAsPeers Ca;
    public boolean Cb;
    public y8 Cc;
    public qi D;
    public xj D0;
    public pj D1;
    public org.telegram.ui.Cells.q1 D2;
    public TLRPC.Chat D3;
    public final ArrayList D4;
    public org.telegram.messenger.ij D5;
    public final ArrayList D6;
    public int D7;
    public int D8;
    public boolean D9;
    public TL_account.resolvedBusinessChatLinks Da;
    public ArrayList Db;
    public int Dc;
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
    public float E9;
    public boolean Ea;
    public ValueAnimator Eb;
    public TLRPC.DraftMessage Ec;
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
    public mj F9;
    public boolean Fa;
    public boolean Fb;
    public boolean Fc;
    public final dh.g G;
    public TextView G0;
    public boolean G1;
    public fi.m3 G2;
    public boolean G3;
    public boolean G4;
    public boolean G5;
    public final SparseArray G6;
    public bf G7;
    public String G8;
    public org.telegram.ui.Cells.q1 G9;
    public float Ga;
    public Boolean Gb;
    public ValueAnimator Gc;
    public final int H;
    public org.telegram.ui.ActionBar.n2 H0;
    public org.telegram.ui.Components.t20 H1;
    public fi.m3 H2;
    public String H3;
    public int H4;
    public boolean H5;
    public final HashMap H6;
    public String H7;
    public vj H8;
    public org.telegram.ui.Components.jz H9;
    public final vf Ha;
    public boolean Hb;
    public fi Hc;
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
    public boolean I9;
    public final gk Ia;
    public final int[] Ib;
    public boolean Ic;
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
    public boolean J9;
    public int Ja;
    public org.telegram.ui.Cells.q1 Jb;
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
    public ValueAnimator K9;
    public int Ka;
    public org.telegram.ui.Cells.q1 Kb;
    public int Kc;
    public dh.c L;
    public int L0;
    public fi.m3 L1;
    public pk L2;
    public int L3;
    public int L4;
    public int L5;
    public final SparseArray L6;
    public int L7;
    public boolean L8;
    public ValueAnimator L9;
    public bf La;
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
    public final bf M8;
    public boolean M9;
    public boolean Ma;
    public boolean Mb;
    public int Mc;
    public dh.c N;
    public int N0;
    public fi.m3 N1;
    public org.telegram.ui.Components.de0 N2;
    public ok N3;
    public final ArrayList N4;
    public TLRPC.PhotoSize N5;
    public final a0.h N6;
    public int N7;
    public final ri.b N8;
    public float N9;
    public boolean Na;
    public int Nb;
    public int Nc;
    public org.telegram.ui.ActionBar.u1 O;
    public Drawable O0;
    public fi.m3 O1;
    public boolean O2;
    public org.telegram.ui.Components.bc O3;
    public bf O4;
    public TLObject O5;
    public final int[] O6;
    public int O7;
    public dh.c O8;
    public float O9;
    public long Oa;
    public HashMap Ob;
    public boolean Oc;
    public boolean P;
    public Drawable P0;
    public bl P1;
    public final org.telegram.ui.Components.k9[] P2;
    public boolean P3;
    public boolean P4;
    public int P5;
    public final int[] P6;
    public int P7;
    public Bitmap P8;
    public int P9;
    public int Pa;
    public bf Pb;
    public long Pc;
    public FrameLayout Q;
    public Drawable Q0;
    public float Q1;
    public final bn[] Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public final int[] Q6;
    public boolean Q7;
    public BitmapShader Q8;
    public int Q9;
    public int Qa;
    public int Qb;
    public TLRPC.TL_messages_discussionMessage Qc;
    public fi.p5 R;
    public boolean R0;
    public TL_stories.TL_premium_boostsStatus R1;
    public final org.telegram.ui.ActionBar.m5[] R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public final int[] R6;
    public int R7;
    public Paint R8;
    public float R9;
    public ak Ra;
    public org.telegram.ui.ActionBar.u1 Rb;
    public TLRPC.messages_Messages Rc;
    public vj S;
    public int S0;
    public org.telegram.messenger.e3 S1;
    public final rm[] S2;
    public org.telegram.messenger.n6 S3;
    public int S4;
    public TLRPC.PhotoSize S5;
    public final boolean[] S6;
    public int S7;
    public Matrix S8;
    public float S9;
    public bk Sa;
    public int Sb;
    public boolean Sc;
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
    public boolean Ta;
    public int Tb;
    public um Tc;
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
    public float U9;
    public float Ua;
    public boolean Ub;
    public nm Uc;
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
    public float V9;
    public int Va;
    public int Vb;
    public bi.p7 Vc;
    public FrameLayout W;
    public boolean W0;
    public lj W1;
    public boolean W2;
    public org.telegram.messenger.ij W3;
    public final SparseArray W4;
    public TLRPC.WebPage W5;
    public boolean W6;
    public boolean W7;
    public boolean W8;
    public TLRPC.Document W9;
    public int Wa;
    public boolean Wb;
    public boolean Wc;
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
    public boolean X9;
    public h6.m Xa;
    public int Xb;
    public boolean Xc;
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
    public boolean Y9;
    public ValueAnimator Ya;
    public int Yb;
    public float Yc;
    public sj Z;
    public fi.m3 Z0;
    public TextView Z1;
    public ImageView Z2;
    public bi.q1 Z3;
    public int Z4;
    public m9.u Z5;
    public int Z6;
    public org.telegram.messenger.ij Z7;
    public float Z8;
    public long Z9;
    public float Za;
    public int Zb;
    public float Zc;
    public int f44417a;
    public tj f44418a0;
    public org.telegram.ui.Components.kg f44419a1;
    public boolean f44420a2;
    public AnimatorSet f44421a3;
    public jg.m1 f44422a4;
    public boolean f44423a5;
    public TLRPC.ChatInvite f44424a6;
    public int f44425a7;
    public org.telegram.messenger.ij f44426a8;
    public Integer f44427a9;
    public int f44428aa;
    public nk f44429ab;
    public CharacterStyle f44430ac;
    public final te.a f44431ad;
    public boolean f44432b;
    public bi.e5 f44433b0;
    public boolean f44434b1;
    public TextView f44435b2;
    public FrameLayout f44436b3;
    public jh.e f44437b4;
    public int f44438b5;
    public ae f44439b6;
    public long f44440b7;
    public int f44441b8;
    public int f44442b9;
    public int f44443ba;
    public final wk f44444bb;
    public String f44445bc;
    public final te.a bd;
    public boolean f44446c;
    public int f44447c0;
    public wj f44448c1;
    public TextView f44449c2;
    public zj f44450c3;
    public int f44451c4;
    public int f44452c5;
    public final LongSparseIntArray f44453c6;
    public boolean f44454c7;
    public boolean f44455c8;
    public boolean f44456c9;
    public int f44457ca;
    public final dl f44458cb;
    public vf.b f44459cc;
    public final te.a f44460cd;
    public boolean d;
    public org.telegram.ui.ActionBar.p0 f44461d0;
    public lh.c f44462d1;
    public dk d2;
    public TextView f44463d3;
    public TL_account.TL_businessChatLink f44464d4;
    public boolean f44465d5;
    public boolean f44466d6;
    public long f44467d7;
    public boolean f44468d8;
    public AnimatorSet f44469d9;
    public int f44470da;
    public ArrayList f44471db;
    public boolean dc;
    public final te.a f44472dd;
    public TLRPC.Chat f44473e;
    public fr f44474e0;
    public FrameLayout f44475e1;
    public TextView f44476e2;
    public TextView f44477e3;
    public String f44478e4;
    public boolean f44479e5;
    public boolean f44480e6;
    public final ArrayList f44481e7;
    public long f44482e8;
    public org.telegram.ui.ActionBar.g1 f44483e9;
    public boolean f44484ea;
    public final th eb;
    public ae f44485ec;
    public final te.a f44486ed;
    public TLRPC.User f44487f;
    public org.telegram.ui.ActionBar.x f44488f0;
    public LinearLayout f44489f1;
    public org.telegram.ui.Components.m11 f44490f2;
    public vj f44491f3;
    public int f44492f4;
    public AnimatorSet f44493f5;
    public long f44494f6;
    public final Paint f44495f7;
    public String f44496f8;
    public boolean f44497f9;
    public boolean fa;
    public final yh f44498fb;
    public boolean fc;
    public final te.a f44499fd;
    public org.telegram.ui.ActionBar.p0 f44500g0;
    public org.telegram.ui.Components.on f44501g1;
    public kg.e f44502g2;
    public ImageView f44503g3;
    public int f44504g4;
    public final SparseIntArray f44505g5;
    public boolean f44506g6;
    public final Paint f44507g7;
    public Integer f44508g8;
    public int f44509g9;
    public boolean f44510ga;
    public final pi f44511gb;
    public boolean f44512gc;
    public final te.a f44513gd;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.p0 f44514h0;
    public di f44515h1;
    public org.telegram.ui.Components.w70 f44516h2;
    public ImageView f44517h3;
    public boolean f44518h4;
    public final SparseIntArray f44519h5;
    public boolean f44520h6;
    public final ColorMatrix h7;
    public byte[] f44521h8;
    public int f44522h9;
    public org.telegram.ui.Components.bi f44523ha;
    public final om f44524hb;
    public final RectF f44525hc;
    public final m6.n f44526hd;
    public org.telegram.ui.ActionBar.r0 f44527i0;
    public kg.u1 f44528i1;
    public ImageView f44529i2;
    public org.telegram.ui.Components.i6 f44530i3;
    public String f44531i4;
    public boolean f44532i5;
    public boolean f44533i6;
    public final m.c3 i7;
    public int f44534i8;
    public org.telegram.ui.ActionBar.z0[] f44535i9;
    public float f44536ia;
    public final xf f44537ib;
    public org.telegram.ui.ActionBar.u1 f44538ic;
    public sh.c f44539id;
    public org.telegram.ui.ActionBar.r0 f44540j0;
    public kg.z f44541j1;
    public hi.l f44542j2;
    public org.telegram.ui.Components.i6 j3;
    public byte[] f44543j4;
    public boolean f44544j5;
    public long f44545j6;
    public final org.telegram.ui.ActionBar.u4 f44546j7;
    public int f44547j8;
    public org.telegram.ui.ActionBar.z0 f44548j9;
    public float f44549ja;
    public final xf f44550jb;
    public long f44551jc;
    public final Rect f44552jd;
    public org.telegram.ui.ActionBar.r0 f44553k0;
    public jh.k f44554k1;
    public TextView f44555k2;
    public org.telegram.ui.Components.i6 f44556k3;
    public String f44557k4;
    public boolean f44558k5;
    public Long f44559k6;
    public long f44560k7;
    public ae f44561k8;
    public final qj f44562k9;
    public xo f44563ka;
    public boolean kb;
    public final xf f44564kc;
    public org.telegram.ui.ActionBar.r0 f44565l0;
    public ql l1;
    public nj f44566l2;
    public kj f44567l3;
    public org.telegram.messenger.ij f44568l4;
    public boolean f44569l5;
    public int f44570l6;
    public int f44571l7;
    public String f44572l8;
    public ml f44573l9;
    public Animator f44574la;
    public boolean f44575lb;
    public int f44576lc;
    public org.telegram.ui.Components.s01 m0;
    public org.telegram.ui.Components.kn f44577m1;
    public FrameLayout f44578m2;
    public ij f44579m3;
    public org.telegram.messenger.ij f44580m4;
    public boolean f44581m5;
    public final SparseArray[] f44582m6;
    public int f44583m7;
    public org.telegram.messenger.r3 f44584m8;
    public yj f44585m9;
    public boolean ma;
    public long mb;
    public boolean f44586mc;
    public boolean f44587n;
    public org.telegram.ui.ActionBar.p0 f44588n0;
    public final ArrayList n1;
    public nj f44589n2;
    public org.telegram.ui.Cells.t0 f44590n3;
    public boolean f44591n4;
    public boolean f44592n5;
    public final SparseArray[] f44593n6;
    public final Matrix f44594n7;
    public boolean f44595n8;
    public int f44596n9;
    public boolean f44597na;
    public ab.b0 f44598nb;
    public Pattern f44599nc;
    public org.telegram.ui.ActionBar.r0 f44600o0;
    public wi f44601o1;
    public FrameLayout f44602o2;
    public int f44603o3;
    public ArrayList o4;
    public long f44604o5;
    public final SparseArray[] f44605o6;
    public LinearGradient f44606o7;
    public boolean f44607o8;
    public int f44608o9;
    public cn f44609oa;
    public boolean f44610ob;
    public org.telegram.messenger.ij f44611oc;
    public org.telegram.ui.ActionBar.x f44612p0;
    public org.telegram.ui.Components.i6 f44613p1;
    public TextView f44614p2;
    public org.telegram.ui.Components.t40 f44615p3;
    public org.telegram.messenger.ij f44616p4;
    public boolean f44617p5;
    public boolean f44618p6;
    public int f44619p7;
    public TLRPC.ChatFull f44620p8;
    public int f44621p9;
    public float f44622pa;
    public int f44623pb;
    public te f44624pc;
    public boolean f44625q0;
    public ug f44626q1;
    public org.telegram.ui.Components.lz f44627q2;
    public View f44628q3;
    public TLRPC.TL_forumTopic f44629q4;
    public boolean f44630q5;
    public int f44631q6;
    public int f44632q7;
    public TLRPC.UserFull f44633q8;
    public boolean f44634q9;
    public AnimatorSet f44635qa;
    public int f44636qb;
    public ArrayList f44637qc;
    public long f44638r;
    public RadialProgressView f44639r0;
    public org.telegram.ui.Components.ow0 f44640r1;
    public org.telegram.ui.Components.bv0 f44641r2;
    public boolean f44642r3;
    public long f44643r4;
    public boolean f44644r5;
    public int f44645r6;
    public final Paint f44646r7;
    public org.telegram.ui.Cells.e6 f44647r8;
    public boolean f44648r9;
    public final zj f44649ra;
    public boolean f44650rb;
    public final m4.d0 f44651rc;
    public final HashMap f44652s;
    public org.telegram.ui.ActionBar.p0 f44653s0;
    public org.telegram.ui.ActionBar.p0 f44654s1;
    public fi.m3 f44655s2;
    public boolean f44656s3;
    public int f44657s4;
    public org.telegram.messenger.ij s5;
    public int f44658s6;
    public final Matrix f44659s7;
    public cx0 f44660s8;
    public rl s9;
    public wh.i f44661sa;
    public boolean f44662sb;
    public final jh.a f44663sc;
    public org.telegram.ui.ActionBar.p0 f44664t0;
    public org.telegram.ui.ActionBar.p0 f44665t1;
    public fi.m3 f44666t2;
    public boolean f44667t3;
    public TLRPC.Chat f44668t4;
    public org.telegram.messenger.ij f44669t5;
    public int t6;
    public LinearGradient f44670t7;
    public final a0.h f44671t8;
    public View f44672t9;
    public ch.r f44673ta;
    public a0.h f44674tb;
    public boolean f44675tc;
    public org.telegram.ui.ActionBar.p0 f44676u0;
    public org.telegram.ui.ActionBar.p0 f44677u1;
    public fi.m3 f44678u2;
    public AnimatorSet f44679u3;
    public boolean f44680u4;
    public org.telegram.messenger.dj f44681u5;
    public int f44682u6;
    public boolean f44683u7;
    public String f44684u8;
    public boolean f44685u9;
    public vz0 f44686ua;
    public a0.h f44687ub;
    public boolean f44688uc;
    public org.telegram.ui.ActionBar.p0 f44689v0;
    public org.telegram.ui.ActionBar.p0 f44690v1;
    public boolean f44691v2;
    public ValueAnimator f44692v3;
    public boolean f44693v4;
    public org.telegram.messenger.mj f44694v5;
    public int f44695v6;
    public boolean f44696v7;
    public long f44697v8;
    public boolean f44698v9;
    public boolean f44699va;
    public boolean f44700vb;
    public boolean f44701vc;
    public final xi f44702w;
    public ClippingImageView f44703w0;
    public org.telegram.ui.Components.xn f44704w1;
    public fi.m3 f44705w2;
    public float f44706w3;
    public boolean f44707w4;
    public org.telegram.messenger.nj f44708w5;
    public int f44709w6;
    public int f44710w7;
    public String f44711w8;
    public boolean f44712w9;
    public org.telegram.ui.Components.vo f44713wa;
    public boolean f44714wb;
    public long wc;
    public qi f44715x;
    public org.telegram.ui.Components.dz0 f44716x0;
    public lh.h f44717x1;
    public boolean f44718x2;
    public boolean f44719x3;
    public boolean f44720x4;
    public org.telegram.messenger.ij f44721x5;
    public final ArrayList f44722x6;
    public boolean f44723x7;
    public boolean f44724x8;
    public float f44725x9;
    public an f44726xa;
    public Paint f44727xb;
    public boolean xc;
    public qi f44728y;
    public jh.g f44729y0;
    public boolean f44730y1;
    public fi.m3 f44731y2;
    public boolean f44732y3;
    public int f44733y4;
    public org.telegram.messenger.dj f44734y5;
    public boolean f44735y6;
    public boolean f44736y7;
    public boolean f44737y8;
    public float f44738y9;
    public cn ya;
    public long f44739yb;
    public boolean f44740yc;
    public cj f44741z0;
    public int f44742z1;
    public fi.m3 f44743z2;
    public boolean f44744z3;
    public int f44745z4;
    public org.telegram.messenger.dj f44746z5;
    public int f44747z6;
    public int f44748z7;
    public String f44749z8;
    public VelocityTracker z9;
    public an f44750za;
    public jk f44751zb;
    public boolean f44752zc;

    public cn(Bundle bundle) {
        super(bundle);
        this.f44417a = 0;
        this.f44446c = false;
        this.d = false;
        this.f44652s = new HashMap();
        this.f44702w = new xi(this, new bf(this, 22));
        xe.b bVar = new xe.b();
        this.E = bVar;
        xe.b bVar2 = new xe.b();
        this.F = bVar2;
        this.X = new jh.l();
        this.J0 = org.telegram.ui.ActionBar.m6.Gi;
        this.S0 = -1;
        this.T0 = Collections.newSetFromMap(new WeakHashMap());
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.n1 = new ArrayList();
        this.P2 = new org.telegram.ui.Components.k9[2];
        this.Q2 = new bn[2];
        this.R2 = new org.telegram.ui.ActionBar.m5[2];
        this.S2 = new rm[2];
        this.V2 = new AnimatorSet[2];
        this.W2 = false;
        this.f44603o3 = 500;
        this.f44464d4 = null;
        this.f44504g4 = -1;
        this.f44591n4 = true;
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
        this.f44505g5 = new SparseIntArray();
        this.f44519h5 = new SparseIntArray();
        this.f44617p5 = true;
        this.f44644r5 = true;
        this.G5 = true;
        this.J5 = true;
        this.f44453c6 = new LongSparseIntArray();
        this.f44570l6 = 1;
        this.f44582m6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44593n6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44605o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44722x6 = new ArrayList();
        this.f44735y6 = true;
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
        this.f44425a7 = 0;
        this.f44481e7 = new ArrayList();
        this.f44495f7 = new Paint(1);
        this.f44507g7 = new Paint(1);
        this.h7 = new ColorMatrix();
        this.i7 = new m.c3();
        this.f44546j7 = new org.telegram.ui.ActionBar.u4(0, false, false, new jj(this, 0));
        this.f44594n7 = new Matrix();
        Paint paint = new Paint(1);
        this.f44646r7 = paint;
        this.f44659s7 = new Matrix();
        this.D7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.N7 = Integer.MAX_VALUE;
        this.O7 = -1;
        this.W7 = true;
        this.f44441b8 = Integer.MAX_VALUE;
        this.f44534i8 = -1;
        this.f44547j8 = -10000;
        this.f44671t8 = new a0.h();
        this.M8 = new bf(this, 26);
        ri.b bVar3 = new ri.b();
        this.N8 = bVar3;
        this.O8 = new dh.c(bVar3, bVar3, bVar3);
        this.U8 = new Paint(1);
        this.V8 = 0.0f;
        this.Y8 = 1.0f;
        this.Z8 = 0.0f;
        this.f44497f9 = true;
        this.f44562k9 = new qj(this);
        this.I9 = true;
        this.f44649ra = new zj(this, 0);
        this.Ba = new org.telegram.messenger.i3(this);
        this.Ha = new vf(this, 0);
        this.Ia = new gk(this);
        this.Ka = -1;
        this.f44444bb = new wk(this);
        this.f44458cb = new dl(this);
        this.eb = new th(this);
        this.f44498fb = new yh(this);
        this.f44511gb = new pi(this);
        this.f44524hb = new om(this);
        this.f44537ib = new xf(this, 1);
        this.f44550jb = new xf(this, 5);
        this.Ib = new int[2];
        this.f44525hc = new RectF();
        this.f44564kc = new xf(this, 7);
        this.f44651rc = new m4.d0(5);
        this.f44663sc = new Object();
        this.Ic = false;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.f44431ad = new te.a(0, this, wqVar, 320L, false);
        this.bd = new te.a(1, this, wqVar, 520L, false);
        this.f44460cd = new te.a(2, this, wqVar, 520L, false);
        this.f44472dd = new te.a(3, this, wqVar, 320L, false);
        this.f44486ed = new te.a(4, this, wqVar, 320L, false);
        this.f44499fd = new te.a(5, this, wqVar, 320L, false);
        this.f44513gd = new te.a(6, this, wqVar, 320L, false);
        xf xfVar = new xf(this, 9);
        ?? obj = new Object();
        obj.f19926b = new float[32];
        obj.f19925a = 1;
        obj.d = new te.j(obj, se.a.f55016a, 240L);
        obj.f19927c = xfVar;
        this.f44526hd = obj;
        this.f44552jd = new Rect();
        ?? obj2 = new Object();
        this.M = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.G = gVar;
            this.H = Math.max(0, org.telegram.messenger.g0.L(48.0f) - Math.min(org.telegram.messenger.g0.f22562n, org.telegram.messenger.g0.f22561m));
            ri.f fVar = new ri.f(obj2);
            this.J = fVar;
            fVar.d = gVar;
            fVar.f54583e = -3;
            fVar.f54584f = obj2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.L = cVar;
            cVar.f8713k = true;
            if (org.telegram.messenger.sc.e(262144)) {
                ri.f fVar2 = new ri.f(obj2);
                this.I = fVar2;
                fVar2.d = gVar;
                fVar2.f54583e = -2;
                fVar2.f54584f = obj2;
                dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
                this.K = cVar2;
                cVar2.f8713k = true;
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
        cVar3.f8710g = bVar;
        this.K.f8710g = bVar;
        this.L.f8710g = bVar;
        this.O8.f8710g = new xe.b();
        this.N.f8709f = bVar2;
        this.K.f8709f = bVar2;
        this.L.f8709f = bVar2;
        this.O8.f8709f = bVar2;
    }

    public static void A0(cn cnVar) {
        if (cnVar.f44611oc == null) {
            return;
        }
        wy0[] wy0VarArr = {wy0.d1(cnVar.getParentActivity(), cnVar, true, cnVar.resourceProvider, new org.telegram.messenger.voip.k(13, cnVar, wy0VarArr))};
    }

    public static void A1(cn cnVar, ArrayList arrayList, long j3, org.telegram.ui.Components.jk0 jk0Var, boolean z9, int i7) {
        if (z9) {
            org.telegram.messenger.gz.C(cnVar.currentAccount).q0(arrayList, j3, false, false, true, i7, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.g0.i3(new bg.j0(cnVar, j3, 4), 400L);
            jk0Var.dismiss();
        }
    }

    public static void B0(cn cnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.qp.s1(cnVar.currentAccount).o1(user.f27109id);
                    ConnectionsManager.getInstance(cnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ld(2, cnVar, user));
                }
            }
        }
    }

    public static void B1(cn cnVar, String str) {
        if (org.telegram.messenger.qp.s1(cnVar.currentAccount).L2(false)) {
            cnVar.getParentActivity();
            vf.c.o(str);
            return;
        }
        org.telegram.ui.Components.u4.l0(cnVar.getParentActivity(), cnVar.f44750za, str, false, new rf(cnVar, str, 0));
    }

    public static void B8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z9, boolean z10, boolean z11, boolean z12) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i7 = 6;
        if (z9) {
            menu.add(2131296496, 2131296502, 6, org.telegram.messenger.id.M0(2131746440, null));
            i7 = 7;
        }
        if (z12) {
            menu.add(2131296496, 2131296508, i7, org.telegram.messenger.id.M0(2131745262, null));
            i7++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, i7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i7 + 2;
        menu.add(2131296496, 2131296497, i7 + 1, spannableStringBuilder2);
        if (z11) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131748350, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.u31(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296496, 2131296499, i10, spannableStringBuilder3);
            i10 = i7 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131744437, null));
            ?? obj = new Object();
            obj.f38777a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.vy0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(2131296496, 2131296509, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131743889, null));
            ?? obj2 = new Object();
            obj2.f38777a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.vy0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(2131296496, 2131296512, i11, spannableStringBuilder5);
        }
        if (z10) {
            menu.add(2131296496, 2131296498, i10, org.telegram.messenger.id.M0(2131751744, null));
            i10++;
        }
        if (z9 && encryptedChat == null) {
            menu.add(2131296496, 2131296493, i10, org.telegram.messenger.id.M0(2131750590, null));
            i10++;
        }
        menu.add(2131296496, 2131296503, i10, org.telegram.messenger.id.M0(2131746337, null));
    }

    public static void C0(cn cnVar, org.telegram.messenger.dj djVar, org.telegram.messenger.ij ijVar, int i7, int i10) {
        if (djVar != null) {
            ArrayList arrayList = djVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.gz.C(cnVar.currentAccount).u((org.telegram.messenger.ij) arrayList.get(0), cnVar, i7, i10);
                return;
            }
        }
        org.telegram.messenger.gz.C(cnVar.currentAccount).u(ijVar, cnVar, i7, i10);
    }

    public static void C1(cn cnVar, String str) {
        Uri parse = Uri.parse(str);
        h40.b(cnVar.getParentActivity(), cnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void D0(cn cnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(cnVar.currentAccount).o1(user.f27109id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(cnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new zg(cnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void D1(cn cnVar) {
        org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
        long j3 = cnVar.f44545j6;
        long j10 = cnVar.f44440b7;
        int i7 = cnVar.classGuid;
        int i10 = cnVar.f44492f4;
        long j11 = cnVar.f44643r4;
        int i11 = cnVar.A4;
        int i12 = cnVar.f44570l6;
        cnVar.f44570l6 = i12 + 1;
        messagesController.Y2(j3, j10, false, 30, 0, 0, true, 0, i7, 0, i10, j11, i11, i12, cnVar.f44693v4);
    }

    public static void E0(cn cnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ff ffVar) {
        String str4;
        if (cnVar.f44669t5 != null && i7 < arrayList.size() && cnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.ij ijVar = cnVar.f44669t5;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.f23266k;
            }
            org.telegram.ui.Components.k21.T0(cnVar.getParentActivity(), cnVar, inputPeer, iArr[0], cnVar.f44669t5.K2, str, str4, charSequence, z9, ffVar, new xf(cnVar, 11)).f28698o0 = false;
            cnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + cnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit();
                edit.putInt("dialog_show_translate_count" + cnVar.a(), i10 - 1).apply();
                cnVar.yd(true);
            }
        }
    }

    public static boolean E1(org.telegram.ui.cn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.E1(org.telegram.ui.cn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void F0(org.telegram.ui.cn r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.ij r11, org.telegram.ui.Cells.q1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.F0(org.telegram.ui.cn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.ij, org.telegram.ui.Cells.q1, int, int):void");
    }

    public static void F1(cn cnVar, View view, int i7) {
        org.telegram.ui.Components.q5 q5Var;
        TLRPC.User user;
        char c10;
        vj vjVar;
        vj vjVar2;
        if (i7 != 0) {
            jg.i1 adapter = cnVar.W1.getAdapter();
            if (adapter.f16802w0 != null && !adapter.f16784h0) {
                return;
            }
            int i10 = i7 - 1;
            Object J = cnVar.W1.getAdapter().J(i10);
            int i11 = cnVar.W1.getAdapter().X;
            int i12 = cnVar.W1.getAdapter().Y;
            if (cnVar.W1.getAdapter().F != null && i10 == 1) {
                cnVar.Z.O0(i11, i12, cnVar.W1.getAdapter().F + "@" + org.telegram.messenger.t3.K(cnVar.f44473e, false) + " ", false);
            } else if (cnVar.W1.getAdapter().F != null && i10 == 0) {
                cnVar.Z.O0(i11, i12, a8.p0.s(new StringBuilder(), cnVar.W1.getAdapter().F, " "), false);
            } else if (J instanceof kg.s1) {
                if (!cnVar.getUserConfig().q()) {
                    cnVar.showDialog(new ug.w0(cnVar, cnVar.getParentActivity(), cnVar.currentAccount, true, 31, false, null));
                    return;
                }
                kg.s1 s1Var = (kg.s1) J;
                org.telegram.ui.Components.u4.X(cnVar.currentAccount, Math.max(1, s1Var.a()), cnVar.f44545j6, new org.telegram.messenger.voip.k(9, cnVar, s1Var));
            } else {
                org.telegram.messenger.ej ejVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (cnVar.f44492f4 != 0 || !cnVar.t7(view)) {
                        if (view instanceof org.telegram.ui.Cells.x7) {
                            ejVar = ((org.telegram.ui.Cells.x7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.u4.X(cnVar.currentAccount, 1, cnVar.a(), new bi.z2(cnVar, tL_document, org.telegram.messenger.ij.U(tL_document), cnVar.W1.getAdapter().L(i10), ejVar, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (cnVar.B3 && (vjVar2 = cnVar.f44491f3) != null && vjVar2.getVisibility() == 0) {
                        cnVar.Cb(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.t3.K(chat, false);
                    if (K != null) {
                        cnVar.Z.O0(i11, i12, a8.p0.p("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (cnVar.B3 && (vjVar = cnVar.f44491f3) != null && vjVar.getVisibility() == 0) {
                        cnVar.Cb(null, user2);
                    } else if (org.telegram.messenger.t10.n(user2) != null) {
                        cnVar.Z.O0(i11, i12, "@" + org.telegram.messenger.t10.n(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(rf.b.r(org.telegram.messenger.t10.j(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.e41("" + user2.f27109id, 3, null), 0, spannableString.length(), 33);
                        cnVar.Z.O0(i11, i12, spannableString, false);
                    }
                } else if (J instanceof jg.f1) {
                    if (cnVar.W1.getAdapter().J != null && cnVar.f44492f4 != 1) {
                        jg.f1 f1Var = (jg.f1) J;
                        org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(f1Var.f16725a, cnVar.f44545j6, cnVar.D5, cnVar.f44568l4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = cnVar.X8();
                        b10.X = f1Var.f16726b;
                        b10.R = cnVar.i9();
                        b10.T = cnVar.f44708w5;
                        cnVar.getSendMessagesHelper().r0(b10);
                        cnVar.Z.setFieldText("");
                        cnVar.C9(false);
                    }
                } else if (J instanceof String) {
                    if (cnVar.W1.getAdapter().J != null) {
                        if (cnVar.f44492f4 == 1) {
                            org.telegram.ui.Components.u4.J(cnVar.getParentActivity(), cnVar.f44545j6, new ni.c(10, cnVar, (String) J), cnVar.f44750za);
                            return;
                        } else if (!cnVar.t7(view)) {
                            org.telegram.ui.Components.u4.X(cnVar.currentAccount, 1, cnVar.f44545j6, new org.telegram.messenger.voip.k(10, cnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    cnVar.Z.O0(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (cnVar.Z.getFieldText() != null) {
                        if (cnVar.f44492f4 == 1 || !cnVar.t7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (cnVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44750za);
                                    String M0 = org.telegram.messenger.id.M0(2131745596, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                                    u1Var.R = M0;
                                    if (c10 == 1) {
                                        u1Var.T = org.telegram.messenger.id.M0(2131750475, null);
                                    } else {
                                        u1Var.T = org.telegram.messenger.id.M0(2131749103, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar.showDialog(u1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(cnVar.W1.getAdapter().R);
                                cnVar.f44471db = arrayList;
                                PhotoViewer.p1().H2(null, cnVar, cnVar.f44750za);
                                PhotoViewer.p1().e2(arrayList, cnVar.W1.getAdapter().M(i10), 3, false, cnVar.eb, cnVar);
                                return;
                            }
                            org.telegram.ui.Components.u4.X(cnVar.currentAccount, 1, cnVar.a(), new org.telegram.messenger.voip.k(11, cnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    oe oeVar = new oe(5, cnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (cnVar.Hb) {
                        oeVar.run();
                    } else {
                        ad1.a(cnVar.getParentActivity(), new org.telegram.messenger.voip.k(12, cnVar, oeVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    lj ljVar = cnVar.W1;
                    if (ljVar != null && (user = ljVar.getAdapter().f16802w0) != null) {
                        cnVar.Z.setFieldText("");
                        long j3 = cnVar.f44545j6;
                        if (j3 == user.f27109id) {
                            cnVar.f44697v8 = j3;
                            cnVar.getMessagesController().A4(tL_inlineBotSwitchPM.start_param, cnVar.f44487f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f27109id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", cnVar.f44545j6);
                        if (cnVar.getMessagesController().E(bundle, cnVar, null, null)) {
                            cnVar.presentFragment(new cn(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.qi) {
                    String str = ((org.telegram.messenger.qi) J).f24705a;
                    sj sjVar = cnVar.Z;
                    sjVar.Q();
                    sjVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            cnVar.Z.O0(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = cnVar.Z.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e11 = org.telegram.ui.Components.h5.e(cnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.ij.U(e11));
                            if (e11 != null) {
                                q5Var = new org.telegram.ui.Components.q5(e11, fontMetricsInt);
                            } else {
                                q5Var = new org.telegram.ui.Components.q5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(q5Var, 0, spannableString2.length(), 33);
                            cnVar.Z.O0(i11, i12, spannableString2, false);
                            cnVar.W1.o(false);
                        }
                    }
                    cnVar.Z.O0(i11, i12, str, true);
                    cnVar.W1.o(false);
                }
            }
        }
    }

    public static void G0(cn cnVar) {
        long j3;
        ArrayList arrayList = cnVar.f44722x6;
        arrayList.add(Integer.valueOf(cnVar.f44570l6));
        if (cnVar.f44492f4 == 7) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(cnVar.currentAccount);
            String str = cnVar.I3;
            int i7 = cnVar.classGuid;
            int i10 = cnVar.f44451c4;
            int i11 = cnVar.f44570l6;
            cnVar.f44570l6 = i11 + 1;
            a10.e(i7, i10, i11, str);
        } else if (cnVar.M7 != 0) {
            org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
            long j10 = cnVar.f44545j6;
            long j11 = cnVar.f44440b7;
            int i12 = cnVar.M7;
            int i13 = cnVar.classGuid;
            int i14 = cnVar.f44492f4;
            long j12 = cnVar.f44643r4;
            int i15 = cnVar.A4;
            int i16 = cnVar.f44570l6;
            cnVar.f44570l6 = i16 + 1;
            messagesController.Y2(j10, j11, false, 30, 0, i12, true, 0, i13, 4, i14, j12, i15, i16, cnVar.f44693v4);
        } else if (cnVar.K7 != 0 && (!cnVar.ea() || cnVar.K7 == cnVar.f44441b8 || cnVar.f44693v4)) {
            int i17 = cnVar.f44748z7;
            if (i17 != 0) {
                cnVar.f44440b7 = i17;
                org.telegram.messenger.qp messagesController2 = cnVar.getMessagesController();
                long j13 = cnVar.f44440b7;
                boolean z9 = cnVar.f44723x7;
                int i18 = cnVar.f44710w7;
                int i19 = cnVar.K7;
                int i20 = cnVar.classGuid;
                int i21 = cnVar.f44492f4;
                long j14 = cnVar.f44643r4;
                int i22 = cnVar.A4;
                int i23 = cnVar.f44570l6;
                cnVar.f44570l6 = i23 + 1;
                messagesController2.Y2(j13, 0L, z9, i18, i19, 0, true, 0, i20, 3, i21, j14, i22, i23, cnVar.f44693v4);
            } else {
                org.telegram.messenger.qp messagesController3 = cnVar.getMessagesController();
                long j15 = cnVar.f44545j6;
                long j16 = cnVar.f44440b7;
                boolean z10 = cnVar.f44723x7;
                int i24 = cnVar.f44710w7;
                int i25 = cnVar.K7;
                int i26 = cnVar.classGuid;
                int i27 = cnVar.f44492f4;
                long j17 = cnVar.f44643r4;
                int i28 = cnVar.A4;
                int i29 = cnVar.f44570l6;
                cnVar.f44570l6 = i29 + 1;
                messagesController3.Y2(j15, j16, z10, i24, i25, 0, true, 0, i26, 3, i27, j17, i28, i29, cnVar.f44693v4);
            }
        } else if (cnVar.f44736y7) {
            cnVar.f44570l6++;
        } else {
            org.telegram.messenger.qp messagesController4 = cnVar.getMessagesController();
            long j18 = cnVar.f44545j6;
            long j19 = cnVar.f44440b7;
            boolean z11 = cnVar.f44723x7;
            int i30 = cnVar.f44710w7;
            int i31 = cnVar.K7;
            int i32 = cnVar.classGuid;
            int i33 = cnVar.f44492f4;
            long j20 = cnVar.f44643r4;
            int i34 = cnVar.A4;
            int i35 = cnVar.f44570l6;
            cnVar.f44570l6 = i35 + 1;
            messagesController4.Y2(j18, j19, z11, i30, i31, 0, true, 0, i32, 2, i33, j20, i34, i35, cnVar.f44693v4);
        }
        int i36 = cnVar.f44492f4;
        if (i36 == 0 || (i36 == 3 && cnVar.d9() == cnVar.getUserConfig().e())) {
            if (cnVar.ea() && !cnVar.f44693v4) {
                return;
            }
            arrayList.add(Integer.valueOf(cnVar.f44570l6));
            org.telegram.messenger.qp messagesController5 = cnVar.getMessagesController();
            long j21 = cnVar.f44545j6;
            long j22 = cnVar.f44440b7;
            int i37 = cnVar.classGuid;
            if (cnVar.f44492f4 == 3) {
                j3 = 0;
            } else {
                j3 = cnVar.f44643r4;
            }
            long j23 = j3;
            int i38 = cnVar.A4;
            int i39 = cnVar.f44570l6;
            cnVar.f44570l6 = i39 + 1;
            messagesController5.Y2(j21, j22, false, 1, 0, 0, true, 0, i37, 2, 1, j23, i38, i39, cnVar.f44693v4);
        }
    }

    public static void G1(cn cnVar, long j3, long j10) {
        bi.ea.y(cnVar.currentAccount, false).C(j3, j10, new bi.o5(cnVar, j3, j10, 1));
    }

    public static boolean H0(cn cnVar) {
        org.telegram.messenger.ij ijVar = cnVar.f44611oc;
        if (ijVar == null) {
            return false;
        }
        if (org.telegram.messenger.g0.g(ijVar.R0)) {
            new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cnVar.getParentActivity()), cnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void H1(cn cnVar, TLRPC.Document document) {
        cnVar.J4.put(document, 0);
        org.telegram.messenger.gz.C(cnVar.currentAccount).v0(document, null, cnVar.f44545j6, null, null, null, cnVar.B5, null, true, 0, 0, false, null, cnVar.X8(), 0L, cnVar.i9(), cnVar.f44708w5);
    }

    public static Integer H8(ArrayList arrayList, int i7, int[] iArr) {
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

    public static void I1(cn cnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i7, org.telegram.messenger.ij ijVar, int i10, int i11, org.telegram.messenger.ij ijVar2) {
        boolean z9;
        int i12;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i13 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            cnVar.Oc = true;
            cnVar.f44741z0.g1();
            Bundle bundle = new Bundle();
            final long B0 = org.telegram.messenger.ij.B0(((org.telegram.messenger.ij) arrayList.get(0)).f23266k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            bundle.putBoolean("historyPreloaded", z9);
            cn cnVar2 = new cn(bundle);
            cnVar2.Ub(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i7 != 0) {
                cnVar2.f44441b8 = i7;
            }
            if (ijVar != null && (messageReplies = ijVar.f23266k.replies) != null && (messageReplies2 = cnVar2.f44568l4.f23266k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (ijVar != null && (tL_messageReactions = ijVar.f23266k.reactions) != null) {
                cnVar2.f44568l4.f23266k.reactions = tL_messageReactions;
            }
            ai.a1 a1Var = new ai.a1(cnVar, new boolean[]{false}, i10, cnVar2, 17);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f26981id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = cnVar2.getClassGuid();
                org.telegram.messenger.qs.f(cnVar.currentAccount).b(new hi(cnVar, classGuid, a1Var, cnVar2), org.telegram.messenger.qs.D);
                final int i15 = i12;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        cn cnVar3 = cn.this;
                        org.telegram.messenger.qp messagesController = cnVar3.getMessagesController();
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
                        messagesController.K3(messages_messages2, size2, B0, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i19, true, 0, ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1(), 1, false, 0, true, cnVar3.f44693v4, null);
                    }
                });
                return;
            }
            a1Var.run();
            return;
        }
        cnVar.Nc = 0;
        cnVar.Oc = false;
        cnVar.f44741z0.g1();
        if (ijVar2 != null) {
            cnVar.Ia(ijVar2);
        } else if (cnVar.getParentActivity() != null) {
            org.telegram.ui.Components.gc.a0(cnVar).t(org.telegram.messenger.id.M0(2131752330, null), cnVar.f44750za).j();
        }
    }

    public static void J0(cn cnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z9, int i7) {
        org.telegram.messenger.gz.C(cnVar.currentAccount).v0(tL_document, str, cnVar.f44545j6, cnVar.D5, cnVar.f44568l4, null, cnVar.B5, null, z9, i7, 0, false, obj, cnVar.X8(), 0L, cnVar.i9(), cnVar.f44708w5);
    }

    public static void J1(cn cnVar) {
        SparseArray[] sparseArrayArr = cnVar.f44582m6;
        org.telegram.messenger.ij ijVar = null;
        for (int i7 = 1; i7 >= 0; i7--) {
            if (ijVar == null && sparseArrayArr[i7].size() != 0) {
                ijVar = (org.telegram.messenger.ij) cnVar.E6[i7].get(sparseArrayArr[i7].keyAt(0));
            }
            sparseArrayArr[i7].clear();
            cnVar.f44593n6[i7].clear();
            cnVar.f44605o6[i7].clear();
        }
        if (cnVar.getParentActivity() != null && ijVar != null && ((org.telegram.messenger.ij.R4(ijVar.f23266k) || ijVar.h4()) && ijVar.F0() != null)) {
            TLRPC.Document F0 = ijVar.F0();
            org.telegram.messenger.w7.G(cnVar.currentAccount);
            File J = org.telegram.messenger.w7.J(F0, null, false, true);
            TLRPC.Message message = ijVar.f23266k;
            if (message != null && message.attachPath != null && (J == null || !J.exists())) {
                J = new File(ijVar.f23266k.attachPath);
            }
            if (J != null && J.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.ij.L4(ijVar.f23266k) && !ijVar.h4()) {
                    intent.setType(ijVar.t1());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = cnVar.getParentActivity();
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
                cnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131745459, null)), 500);
            }
        }
        cnVar.A9();
        cnVar.fd(0, true);
        cnVar.Fd(false);
        cnVar.sd();
    }

    public static void K0(cn cnVar, TLRPC.Document document) {
        cnVar.J4.put(document, 0);
        org.telegram.messenger.gz.C(cnVar.currentAccount).v0(document, null, cnVar.f44545j6, null, null, null, cnVar.B5, null, true, 0, 0, false, null, cnVar.X8(), 0L, cnVar.i9(), cnVar.f44708w5);
    }

    public static void L0(cn cnVar) {
        if (cnVar.f44567l3.getAlpha() != 0.0f && !cnVar.actionBar.x() && !cnVar.X9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(cnVar.f44567l3.getCustomDate() * 1000);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i7, i10, i11);
            cnVar.ga((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void M0(cn cnVar, int i7, org.telegram.messenger.ij ijVar) {
        if (i7 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f27001id = cnVar.getMessagesController().q1(cnVar.f44487f);
            cnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new de(cnVar, 4));
            return;
        }
        org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(cnVar.getUserConfig().f(), cnVar.f44545j6, ijVar, cnVar.f44568l4, null, null, true, 0, 0);
        g10.K = cnVar.X8();
        org.telegram.messenger.gz.C(cnVar.currentAccount).r0(g10);
        if (cnVar.f44492f4 == 0) {
            cnVar.qa(false);
        }
        cnVar.C9(false);
    }

    public static void M2(long j3, cn cnVar) {
        int i7;
        boolean z9;
        org.telegram.messenger.uv uvVar;
        if (j3 != cnVar.d9()) {
            cnVar.getConnectionsManager().cancelRequestsForGuid(cnVar.classGuid);
            cnVar.getMessagesStorage().k(cnVar.classGuid);
            cnVar.classGuid = ConnectionsManager.generateClassGuid();
            cnVar.rb();
            cnVar.f44694v5 = null;
            cnVar.K7 = 0;
            cnVar.D7 = -1;
            cnVar.A7 = false;
            cnVar.B7 = true;
            cnVar.f44722x6.clear();
            if (j3 != 0) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            cnVar.f44492f4 = i7;
            cnVar.f44643r4 = j3;
            if (i7 == 3) {
                org.telegram.messenger.vv G1 = cnVar.getMessagesController().G1();
                long b10 = cnVar.b();
                ArrayList arrayList = G1.f26222j;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        uvVar = (org.telegram.messenger.uv) arrayList.get(i10);
                        if (uvVar.f25900a == b10) {
                            break;
                        }
                        i10++;
                    } else {
                        uvVar = null;
                        break;
                    }
                }
                if (uvVar != null && !uvVar.f25906i) {
                    G1.f(b10, null);
                }
            }
            cnVar.K8();
            cnVar.vd(true);
            wi wiVar = cnVar.f44601o1;
            if (wiVar != null) {
                wiVar.n(true);
                cnVar.f44601o1.b();
            }
            org.telegram.ui.Components.s01 s01Var = cnVar.m0;
            if (s01Var != null) {
                s01Var.setCurrentTopic(j3);
                org.telegram.ui.Components.s01 s01Var2 = cnVar.m0;
                if (cnVar.f44527i0 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                s01Var2.setMenuAvailable(z9);
            }
            cnVar.yd(true);
            cnVar.Oc(true);
            cnVar.D9(true);
            cnVar.C9(true);
            sj sjVar = cnVar.Z;
            if (sjVar != null) {
                sjVar.k0(false);
                cnVar.Z.I1(true);
            }
            cnVar.N6(true, true);
            um umVar = cnVar.Tc;
            if (umVar != null && cnVar.actionBar.f27691n0) {
                umVar.k(null);
            }
        }
    }

    public static void N0(cn cnVar) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        org.telegram.messenger.kj kjVar;
        ArrayList arrayList;
        String a02;
        cnVar.f44708w5 = null;
        int i7 = cnVar.Qb;
        if (i7 == 2) {
            cnVar.B5 = null;
            cnVar.D5 = null;
            org.telegram.messenger.mj mjVar = cnVar.f44694v5;
            if (mjVar != null) {
                mjVar.f(null, null, cnVar.f44545j6, null);
            }
            cnVar.A8();
        } else if (i7 == 3) {
            org.telegram.messenger.mj mjVar2 = cnVar.f44694v5;
            if (mjVar2 != null && !mjVar2.c() && (kjVar = cnVar.f44694v5.f24035b) != null && (arrayList = kjVar.f23704e) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) cnVar.f44694v5.f24035b.f23704e.get(i10);
                    if (j3 == 0) {
                        j10 = org.telegram.messenger.ij.B0(ijVar3.f23266k);
                        j3 = ijVar3.Z0();
                    } else if (j3 != ijVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44750za);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User a22 = cnVar.getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        a02 = org.telegram.messenger.id.a0("CancelForwardPrivate", null, 2131752583, org.telegram.messenger.id.G(cnVar.f44694v5.f24035b.f23704e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat M0 = cnVar.getMessagesController().M0(Long.valueOf(-j10));
                    if (M0 != null) {
                        a02 = org.telegram.messenger.id.a0("CancelForwardChat", null, 2131752584, org.telegram.messenger.id.G(cnVar.f44694v5.f24035b.f23704e.size(), "MessagesBold", new Object[0]), M0.title);
                    } else {
                        return;
                    }
                }
                u1Var.T = org.telegram.messenger.g0.X2(a02);
                u1Var.R = org.telegram.messenger.id.G(cnVar.f44694v5.f24035b.f23704e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752582, null), new fe(cnVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131745343, null), new fe(cnVar, 7));
                cnVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, cnVar.getResourceProvider());
                }
            }
        } else if (i7 == 4) {
            cnVar.W5 = null;
            org.telegram.messenger.mj mjVar3 = cnVar.f44694v5;
            if (mjVar3 != null) {
                int i11 = cnVar.currentAccount;
                org.telegram.messenger.ij ijVar4 = cnVar.D5;
                if (ijVar4 == cnVar.f44568l4) {
                    ijVar2 = null;
                } else {
                    ijVar2 = ijVar4;
                }
                mjVar3.e(i11, null, null, ijVar2, cnVar.B5, cnVar.F5);
            }
            sj sjVar = cnVar.Z;
            sjVar.X2 = null;
            sjVar.Y2 = false;
            cnVar.y8();
            cnVar.A8();
        } else {
            if (org.telegram.messenger.t3.c0(cnVar.f44473e) && !cnVar.f44693v4 && (ijVar = cnVar.D5) != null) {
                long b22 = org.telegram.messenger.ij.b2(cnVar.currentAccount, ijVar.f23266k, true, false);
                if (b22 != 0) {
                    cnVar.getMediaDataController().D(cnVar.f44545j6, b22, false);
                }
            }
            cnVar.fc(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void N2(cn cnVar, Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.r0 n92 = cnVar.n9();
        if (n92 == null) {
            return;
        }
        View view = (View) n92.getParent();
        float x10 = cnVar.actionBar.getX();
        org.telegram.ui.Components.s01 s01Var = cnVar.m0;
        if (s01Var != null) {
            f10 = s01Var.getProgress() * cnVar.m0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        float x11 = (n92.getX() + (view.getX() + (x10 - f10))) - cnVar.m0.getX();
        float y10 = (n92.getY() + (view.getY() + cnVar.actionBar.getY())) - cnVar.m0.getY();
        if (cnVar.f44727xb == null) {
            cnVar.f44727xb = new Paint(1);
        }
        cnVar.f44727xb.setColor(org.telegram.ui.ActionBar.m6.r1(cnVar.m0.getProgress(), cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6)));
        canvas.drawCircle((n92.getWidth() / 2.0f) + x11, (n92.getHeight() / 2.0f) + y10, org.telegram.messenger.g0.L(23.0f), cnVar.f44727xb);
        canvas.save();
        canvas.translate(x11, y10);
        n92.draw(canvas);
        canvas.restore();
    }

    public static void O0(cn cnVar, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var = cnVar.parentLayout;
        if (r4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 backgroundFragment = r4Var.getBackgroundFragment();
        if (backgroundFragment instanceof cn) {
            cn cnVar2 = (cn) backgroundFragment;
            if (cnVar2.a() == cnVar.f44545j6) {
                cnVar.finishFragment();
                cnVar2.l(i7, 0, true, 0, true, 0);
                return;
            }
        }
        cnVar.presentFragment(sa(i7, cnVar.f44545j6));
    }

    public static void O1(cn cnVar) {
        int i7;
        if (cnVar.a() == cnVar.getUserConfig().e() && cnVar.getUserConfig().q() && cnVar.f44751zb == null) {
            jk jkVar = new jk(cnVar, cnVar, cnVar.getParentActivity(), cnVar.currentAccount, cnVar.f44750za);
            cnVar.f44751zb = jkVar;
            jkVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
            cnVar.f44751zb.setDelegate(new kk(cnVar));
            cnVar.f44751zb.setTop(true);
            int i10 = 0;
            cnVar.f44751zb.setClipChildren(false);
            cnVar.f44751zb.setClipToPadding(false);
            cnVar.f44751zb.setVisibility(0);
            jk jkVar2 = cnVar.f44751zb;
            if (jkVar2.getSelectedReactions().isEmpty()) {
                i7 = 2131745872;
            } else {
                i7 = 2131745871;
            }
            jkVar2.setHint(org.telegram.messenger.id.M0(i7, null));
            cnVar.l1.addView(cnVar.f44751zb, c8.ha.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            cnVar.f44751zb.p(null, null, true);
            cnVar.f44751zb.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
            cnVar.f44751zb.setScaleY(0.4f);
            cnVar.f44751zb.setScaleX(0.4f);
            cnVar.f44751zb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wq.h).start();
            cnVar.sd();
            jk jkVar3 = cnVar.f44751zb;
            float f10 = cnVar.R9;
            ck ckVar = cnVar.C1;
            if (ckVar != null) {
                i10 = ckVar.getCurrentHeight();
            }
            jkVar3.setTranslationY(f10 + i10);
        }
    }

    public static void P0(cn cnVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        boolean z10;
        CharSequence charSequence2;
        org.telegram.ui.Components.d41[] d41VarArr;
        if (cnVar.V5 != 0) {
            cnVar.getConnectionsManager().cancelRequest(cnVar.V5, true);
            cnVar.V5 = 0;
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
            if (arrayList != null && cnVar.X5 != null && arrayList.size() == cnVar.X5.size()) {
                boolean z11 = true;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) cnVar.X5.get(i7))) {
                        z11 = false;
                    }
                }
                if (z11 && !z10) {
                    return;
                }
            }
            cnVar.X5 = arrayList;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                org.telegram.messenger.g0.h3(new xf(cnVar, 4));
                return;
            }
        }
        if (arrayList == null) {
            org.telegram.messenger.g0.h3(new xf(cnVar, 3));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (cnVar.h != null && qpVar.G2 == 2) {
            org.telegram.messenger.g0.h3(new je(cnVar, qpVar, charSequence, z9));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = cnVar.W5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i10 = cnVar.Nb + 1;
            cnVar.Nb = i10;
            yf yfVar = new yf(cnVar, i10, getwebpagepreview, 0);
            if (cnVar.Ob == null) {
                cnVar.Ob = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) cnVar.Ob.get(getwebpagepreview.message);
            if (webPage2 != null) {
                yfVar.a(Boolean.TRUE, webPage2);
                return;
            }
            n6 n6Var = new n6(cnVar, getwebpagepreview, yfVar, 1);
            if (cnVar.V5 != 0) {
                cnVar.getConnectionsManager().cancelRequest(cnVar.V5, true);
            }
            cnVar.V5 = cnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.p5(10, cnVar, n6Var));
            cnVar.getConnectionsManager().bindRequestToGuid(cnVar.V5, cnVar.classGuid);
        }
    }

    public static org.telegram.ui.zq0 P1(org.telegram.ui.cn r14, org.telegram.messenger.ij r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.P1(org.telegram.ui.cn, org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.zq0");
    }

    public static void Q0(cn cnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z9;
        org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit().putLong("dialog_join_requested_time_" + cnVar.f44545j6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.t3.T(cnVar.f44473e) && !cnVar.f44473e.megagroup) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i7 = org.telegram.ui.Components.b70.f32131t1;
            org.telegram.ui.Components.b70.J0(context, cnVar, org.telegram.ui.Components.gc.a0(cnVar), z9);
        }
        cnVar.bc(false, true);
    }

    public static boolean Q9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static TLRPC.TL_message R7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26981id = message.f26981id;
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

    public static void S0(org.telegram.ui.cn r7, java.lang.String r8, org.telegram.messenger.ij r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.S0(org.telegram.ui.cn, java.lang.String, org.telegram.messenger.ij, boolean):void");
    }

    public static void T0(cn cnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, n6 n6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f26981id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.ij(cnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer));
            cnVar.getMessagesController().P1().f10005k.d(hVar, new oe(12, hVar, n6Var), cnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void U0(cn cnVar) {
        cnVar.W7(false);
        if (!cnVar.fragmentBeginToShow) {
            cj cjVar = cnVar.f44741z0;
            cjVar.W1 = false;
            cjVar.X1 = 0;
            cjVar.setEmptyView(cnVar.f44475e1);
            cj cjVar2 = cnVar.f44741z0;
            cjVar2.W1 = true;
            cjVar2.X1 = 1;
            return;
        }
        cnVar.f44741z0.setEmptyView(cnVar.f44475e1);
    }

    public static void V0(cn cnVar, TLRPC.ReactionCount reactionCount) {
        cnVar.P7(true);
        org.telegram.ui.Components.ql0.c(cnVar.getParentActivity(), cnVar.currentAccount, reactionCount.reaction, cnVar.f44750za);
    }

    public static void W0(cn cnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(cnVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f27078id;
        long e10 = cnVar.getUserConfig().e();
        long j10 = cnVar.f44545j6;
        if (e10 == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        f10.k(org.telegram.messenger.qs.f25100w, arrayList, valueOf, bool, bool);
    }

    public static CharSequence W8(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, int[] iArr) {
        if (ijVar == null) {
            return null;
        }
        String F1 = org.telegram.messenger.qp.s1(ijVar.I1).F1(ijVar.f23266k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            return F1;
        }
        if (ijVar.T4() && !org.telegram.ui.Components.s11.j(ijVar)) {
            return ijVar.i2();
        }
        CharSequence charSequence = ijVar.f23322z;
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
            CharSequence charSequence3 = ijVar2.f23322z;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = ijVar2.e1();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void X0(cn cnVar, org.telegram.ui.Cells.q1 q1Var, boolean z9, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i7;
        org.telegram.ui.Components.k60 I = org.telegram.ui.Components.k60.I(cnVar, q1Var);
        org.telegram.ui.Components.jk0 jk0Var = new org.telegram.ui.Components.jk0(cnVar.getParentActivity(), cnVar.f44750za);
        I.f35214p = new ge(jk0Var, 0);
        if (z9 && ((org.telegram.messenger.h0) cnVar.getMessagesController().f24946x7.f24450j0.f13891b).f22784c) {
            I.c(2131231275, org.telegram.messenger.id.M0(2131743017, null), new he(cnVar, str, 5), false);
        }
        boolean z10 = true;
        I.c(2131232103, org.telegram.messenger.id.M0(2131743152, null), new ke(cnVar, jk0Var, str, 1), false);
        if (z9) {
            I.c(2131232354, org.telegram.messenger.id.M0(2131742963, null), new he(cnVar, str, 6), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i10 = cnVar.currentAccount;
                long j3 = user.f27109id;
                oe oeVar = new oe(2, cnVar, userArr);
                TLObject e22 = org.telegram.messenger.qp.s1(i10).e2(j3);
                boolean z11 = e22 instanceof TLRPC.User;
                if (!(e22 instanceof TLRPC.Chat) || !org.telegram.messenger.t3.V((TLRPC.Chat) e22)) {
                    z10 = false;
                }
                if (z11) {
                    i7 = 2131743546;
                } else if (z10) {
                    i7 = 2131743560;
                } else {
                    i7 = 2131743553;
                }
                I.n(e22, org.telegram.messenger.id.M0(i7, null), oeVar);
            } else {
                I.p(13, -1, org.telegram.messenger.id.M0(2131743198, null));
            }
        }
        jk0Var.e(I);
        jk0Var.f(q1Var, characterStyle, null, false);
        cnVar.showDialog(jk0Var);
    }

    public static ArrayList X7(ArrayList arrayList, boolean z9, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(i7);
            String str = fzVar.f22516c;
            if (str == null) {
                if (fzVar.f22514a != null) {
                    try {
                        File q02 = org.telegram.messenger.g0.q0("", z9);
                        InputStream openInputStream = org.telegram.messenger.t0.f25570b.getContentResolver().openInputStream(fzVar.f22514a);
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
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str2, ((Integer) N0.first).intValue(), fzVar.f22526o, 0, 0);
                gfVar.n(N0);
                if (i7 == arrayList.size() - 1 && charSequence != null) {
                    gfVar.f26848a = charSequence;
                }
                arrayList2.add(gfVar);
            }
        }
        return arrayList2;
    }

    public static void Y0(cn cnVar, Object[] objArr, org.telegram.ui.Components.yv0 yv0Var, boolean z9, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(yv0Var.f28675c, cnVar.resourceProvider);
                if (z9) {
                    i7 = 2131744844;
                } else {
                    i7 = 2131744845;
                }
                org.telegram.ui.Components.bc q10 = gcVar.q(document, org.telegram.messenger.id.a0(null, null, i7, stickerSet.title));
                q10.f32203j = 2750;
                q10.k(true);
            }
        }
    }

    public static SpannableStringBuilder Y8(long j3, org.telegram.messenger.ij ijVar, boolean z9) {
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
        String F1 = org.telegram.messenger.qp.s1(ijVar.I1).F1(ijVar.f23266k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            spannableStringBuilder.append((CharSequence) F1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = ijVar.f23322z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(ijVar.v);
        return spannableStringBuilder;
    }

    public static void Z(cn cnVar) {
        int i7;
        String str;
        int i10;
        Activity parentActivity = cnVar.getParentActivity();
        int i11 = cnVar.currentAccount;
        long j3 = cnVar.f44545j6;
        an anVar = cnVar.f44750za;
        int i12 = org.telegram.ui.Components.on.L;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.h6) anVar, false);
        w2Var.P(org.telegram.ui.ActionBar.m6.f27963h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624077, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i13, anVar));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, anVar);
        linearLayout.addView((View) imageView, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        boolean D3 = org.telegram.messenger.qp.s1(i11).D3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(textView, i14, anVar);
        textView.setTextSize(1, 20.0f);
        if (D3) {
            i7 = 2131747036;
        } else {
            i7 = 2131747037;
        }
        textView.setText(org.telegram.messenger.id.M0(i7, null));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView2, i14, anVar);
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(j3)), true);
        } else {
            str = "";
        }
        if (D3) {
            i10 = 2131747034;
        } else {
            i10 = 2131747035;
        }
        org.telegram.messenger.k5.r(null, null, i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 1, 12, 9, 12, 19));
        if (!D3) {
            ug.p0 p0Var = new ug.p0(parentActivity, anVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.x2(w2Var, 1));
            p0Var.c(org.telegram.messenger.id.M0(2131747038, null), false, false);
            linearLayout.addView(p0Var, c8.ha.t(-1, 48, 1, 0, 0, 0, 4));
        }
        w2Var.N = linearLayout;
        w2Var.show();
    }

    public static void Z0(cn cnVar) {
        if (org.telegram.messenger.g0.g(cnVar.f44611oc.V0)) {
            org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cnVar.getParentActivity()), cnVar.resourceProvider));
        }
    }

    public static FrameLayout Z7(int i7, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f));
        bi.md mdVar = new bi.md(context, 13);
        int i10 = 3;
        mdVar.setMaxLines(3);
        mdVar.setGravity(3);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.t6.U(mdVar, org.telegram.ui.ActionBar.m6.E8, h6Var);
        mdVar.setTextSize(1, i7);
        mdVar.setMaxWidth(org.telegram.messenger.g0.L(170.0f));
        mdVar.setText(charSequence);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        }
        frameLayout.addView(mdVar, c8.ha.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static void a0(cn cnVar, String str) {
        if (cnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(cnVar.currentAccount).s(1));
            cnVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void a1(cn cnVar) {
        if (!cnVar.t7(cnVar.Z.getSendButton())) {
            if (cnVar.getMediaController().I(cnVar.f44669t5)) {
                cnVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = cnVar.getMessagesController().j1(cnVar.f44545j6);
            if (cnVar.f44681u5 != null) {
                for (int i7 = 0; i7 < cnVar.f44681u5.d.size(); i7++) {
                    tL_messages_sendScheduledMessages.f27078id.add(Integer.valueOf(((org.telegram.messenger.ij) cnVar.f44681u5.d.get(i7)).e1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f27078id.add(Integer.valueOf(cnVar.f44669t5.e1()));
            }
            ConnectionsManager.getInstance(cnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ld(4, cnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static org.telegram.messenger.ij a2(cn cnVar) {
        View view = cnVar.f44672t9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) view).getMessageObject();
        }
        return null;
    }

    public static bi.d3 a5(cn cnVar, org.telegram.messenger.ij ijVar) {
        if (ijVar != null && !ijVar.N3() && ijVar.l4() && ijVar.f23266k.ttl == Integer.MAX_VALUE) {
            long V = cnVar.getMessagesController().V(ijVar.e1(), cnVar.f44545j6);
            ijVar.G0 = true;
            if (ijVar.P3() || (!ijVar.g4() && !ijVar.S4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar);
                cnVar.ad(arrayList, true);
            }
            return new bi.d3(cnVar, V, ijVar, 16);
        }
        return null;
    }

    public static void b0(cn cnVar, org.telegram.ui.Components.k60 k60Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) k60Var.A;
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(cnVar.getParentActivity(), cnVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new j2.n(16, cnVar, k60Var), cnVar.getResourceProvider());
        xnVar.e(cnVar.f44545j6, cnVar.b(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(xnVar.f40357f);
        k60Var.f35211n0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void c0(cn cnVar, int i7) {
        if (i7 != 0) {
            org.telegram.messenger.g0.h3(new re(cnVar, i7, 7));
        } else {
            cnVar.actionBar.setSubtitle(org.telegram.messenger.id.M0(2131748192, null));
        }
    }

    public static void c1(cn cnVar, long j3, boolean z9) {
        if (!cnVar.T4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit();
            edit.putInt("pin_" + cnVar.f44545j6, ((Integer) cnVar.T4.get(0)).intValue()).commit();
            cnVar.T4.clear();
            cnVar.V4.clear();
            cnVar.X4 = 0;
            cnVar.f44438b5 = 0;
            cnVar.f44452c5 = 0;
            cnVar.fd(0, true);
        }
        if (org.telegram.messenger.t3.p0(cnVar.f44473e) && org.telegram.messenger.t3.A(cnVar.currentAccount, cnVar.f44473e, 24)) {
            if (j3 != 0) {
                org.telegram.messenger.yr messagesStorage = cnVar.getMessagesStorage();
                messagesStorage.f26723a.c(new org.telegram.messenger.vp(1, -cnVar.f44473e.f26960id, j3, messagesStorage));
                cnVar.getMessagesController().i0(j3, 0, cnVar.getMessagesController().j1(-cnVar.f44473e.f26960id));
                cnVar.getMessagesController().f24881q7.s(cnVar.f44473e.f26960id, j3);
            }
        } else {
            cnVar.getMessagesController().X(1, cnVar.f44545j6, z9);
            org.telegram.messenger.yr messagesStorage2 = cnVar.getMessagesStorage();
            long j10 = cnVar.f44545j6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.xp(messagesStorage2, j10, 2));
            org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().f24881q7;
            k00Var.getClass();
            org.telegram.messenger.g0.h3(new bi.kd((Object) k00Var, -cnVar.f44545j6, true, 4));
        }
        cnVar.f44453c6.put(j3, 0);
        org.telegram.ui.Components.m11 m11Var = cnVar.f44490f2;
        if (m11Var != null) {
            m11Var.setAllTopicsHidden(false);
        }
        if (j3 == cnVar.f44643r4) {
            cnVar.N7(false, null);
            cnVar.C0.O(false);
        }
    }

    public static void d0(long j3, cn cnVar) {
        if (bi.ea.y(cnVar.currentAccount, false).p().amount < j3) {
            new bi.tc(cnVar.getParentActivity(), cnVar.getResourceProvider(), j3, 13, org.telegram.messenger.m5.t(cnVar.a()), new bf(cnVar, 21), cnVar.a()).show();
        } else {
            new bi.uc(cnVar.getParentActivity(), cnVar.resourceProvider).show();
        }
    }

    public static void d1(cn cnVar, int i7) {
        if (cnVar.fragmentView != null) {
            org.telegram.ui.Cells.z I8 = cnVar.I8(i7, false);
            if (I8 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) I8;
                ch.p0 p0Var = q1Var.N;
                TLRPC.MessagePeerReaction K1 = q1Var.getMessageObject().K1();
                if (K1 != null && (p0Var.H || K1.big)) {
                    ch.k0.d(cnVar, null, I8, null, 0.0f, 0.0f, ch.o0.d(K1.reaction), cnVar.currentAccount, !K1.big ? 1 : 0);
                    ch.k0.f();
                }
                p0Var.H = false;
                org.telegram.messenger.ij ijVar = q1Var.P5;
                if (ijVar != null) {
                    ijVar.h5();
                }
            } else if (I8 instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) I8;
                ch.p0 p0Var2 = t0Var.E0;
                TLRPC.MessagePeerReaction K12 = t0Var.getMessageObject().K1();
                if (K12 != null && (p0Var2.H || K12.big)) {
                    ch.k0.d(cnVar, null, I8, null, 0.0f, 0.0f, ch.o0.d(K12.reaction), cnVar.currentAccount, !K12.big ? 1 : 0);
                    ch.k0.f();
                }
                p0Var2.H = false;
                org.telegram.messenger.ij ijVar2 = t0Var.P0;
                if (ijVar2 != null) {
                    ijVar2.h5();
                }
            }
        }
    }

    public static void e0(cn cnVar) {
        if (cnVar.f44581m5) {
            cnVar.f44581m5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f21273g1 == cnVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void e1(cn cnVar, org.telegram.messenger.ij ijVar, Long l10, Runnable runnable) {
        bi.ea.y(cnVar.currentAccount, false).j0(ijVar, l10.longValue(), runnable, false);
    }

    public static void e2(cn cnVar, float f10) {
        View view = cnVar.f44672t9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).setSlidingOffset(f10);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setWalletSlidingOffset(f10);
        }
    }

    public static void f0(cn cnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.qp.s1(cnVar.currentAccount).Y3(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (cnVar.j() != null) {
                tLObject2 = cnVar.j();
            } else {
                tLObject2 = cnVar.f44473e;
            }
            if (!org.telegram.messenger.ui.t(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = cnVar.f44487f;
                if (user2 != null && user2.bot && user.f27109id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.p(null, 2131753104, org.telegram.ui.Components.gc.a0(cnVar), null);
                } else if (user2 != null && user2.bot && user.f27109id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.p(null, 2131753107, org.telegram.ui.Components.gc.a0(cnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.k5.p(null, 2131753103, org.telegram.ui.Components.gc.a0(cnVar), null);
                } else {
                    TLRPC.Chat chat = cnVar.f44473e;
                    if (chat != null && !org.telegram.messenger.t3.V(chat)) {
                        org.telegram.messenger.k5.p(null, 2131753105, org.telegram.ui.Components.gc.a0(cnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = cnVar.f44473e;
                    if (chat2 != null && org.telegram.messenger.t3.V(chat2)) {
                        org.telegram.messenger.k5.p(null, 2131753106, org.telegram.ui.Components.gc.a0(cnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                cnVar.ya(user.f27109id, cnVar.A8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(cnVar.getParentActivity());
                p6Var.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27985ia, false));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.L5, p6Var, null);
                p6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cnVar.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.V = p6Var;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("BotRequestAttachPermission", null, 2131752996, org.telegram.messenger.t10.p(user)));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753153, null), new a1.d(cnVar, user, atomicBoolean, tL_attachMenuBot, 8));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(5, cnVar.getParentActivity(), cnVar.getResourceProvider());
                    c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    c2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                    c2Var.setMultiline(true);
                    c2Var.e(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131747780, org.telegram.messenger.t10.p(user))), "", true, false, false);
                    if (org.telegram.messenger.id.f23161a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.id.f23161a0) {
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
                ad1.a(cnVar.getParentActivity(), new y(cnVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void f1(cn cnVar, TLRPC.TL_game tL_game, org.telegram.messenger.ij ijVar, String str, long j3) {
        cnVar.sc(tL_game, ijVar, str, false, j3);
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void f2(cn cnVar) {
        long j3;
        xo xoVar = cnVar.f44563ka;
        if (xoVar != null) {
            if (cnVar.f44693v4) {
                if (xoVar.H != null) {
                    if (cnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.c9.a(cnVar, cnVar.getParentLayout().getFragmentStack().indexOf(cnVar), cnVar.f44473e, cnVar.f44487f, cnVar.f44629q4, cnVar.f44545j6, cnVar.Qa, cnVar.Pa);
                    }
                    TLRPC.Chat chat = cnVar.f44473e;
                    TLRPC.TL_forumTopic tL_forumTopic = cnVar.f44563ka.H;
                    long j10 = cnVar.f44545j6;
                    int i7 = cnVar.Pa;
                    int i10 = cnVar.Qa;
                    if (cnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.c9.a(cnVar, cnVar.getParentLayout().getFragmentStack().indexOf(cnVar), chat, null, tL_forumTopic, j10, i7, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", cnVar.f44563ka.f51753a);
                    bundle.putInt("dialog_filter_id", cnVar.f44563ka.f51755b);
                    bundle.putBoolean("pulled", true);
                    cn g10 = qg.d.g(cnVar, -cnVar.f44545j6, cnVar.f44563ka.H, 0, bundle);
                    g10.ma = true;
                    f44415rd = true;
                    cnVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = xoVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f26960id;
            }
            if (j3 != 0) {
                cnVar.I6();
                xo xoVar2 = cnVar.f44563ka;
                TLRPC.Chat chat3 = xoVar2.G;
                long j12 = xoVar2.Z;
                int i11 = xoVar2.f51753a;
                int i12 = xoVar2.f51755b;
                if (cnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.c9.a(cnVar, cnVar.getParentLayout().getFragmentStack().indexOf(cnVar), chat3, null, null, j12, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = cnVar.f44563ka.G;
                if (chat4 != null) {
                    j11 = chat4.f26960id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", cnVar.f44563ka.f51753a);
                bundle2.putInt("dialog_filter_id", cnVar.f44563ka.f51755b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit().remove("diditem" + cnVar.f44563ka.Z).apply();
                cn cnVar2 = new cn(bundle2);
                ArrayList arrayList = cnVar.Db;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = cnVar.Db;
                    cnVar2.Db = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                cnVar2.ma = true;
                f44415rd = true;
                cnVar.presentFragment(cnVar2, true);
            }
        }
    }

    public static void f5(cn cnVar, org.telegram.ui.Cells.q1 q1Var) {
        uh.a aVar;
        int i7;
        int i10;
        te.a aVar2 = cnVar.f44460cd;
        if (cnVar.Z != null && !aVar2.f55499f && q1Var.getMessageObject() != null) {
            ql qlVar = cnVar.l1;
            RectF rectF = org.telegram.messenger.g0.P;
            jh.k.c(q1Var, qlVar, rectF);
            Rect rect = org.telegram.messenger.g0.Q;
            org.telegram.ui.Cells.w1 w1Var = q1Var.f30066w2;
            if (w1Var != null && (aVar = w1Var.f30724l) != null && w1Var.f30731s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((cnVar.l1.getMeasuredHeight() - cnVar.f44741z0.getPaddingBottom()) + cnVar.Yc) - org.telegram.messenger.g0.L(2.0f)));
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                if (cnVar.f44539id == null) {
                    cnVar.f44539id = new sh.c(cnVar.getParentActivity(), cnVar.resourceProvider, cnVar);
                    int indexOfChild = cnVar.l1.indexOfChild(cnVar.f44741z0);
                    if (indexOfChild >= 0) {
                        cnVar.l1.addView(cnVar.f44539id, indexOfChild + 1, c8.ha.g());
                    } else {
                        cnVar.l1.addView(cnVar.f44539id, c8.ha.g());
                    }
                }
                if (messageObject.P3()) {
                    if (q1Var.x2()) {
                        i10 = org.telegram.ui.ActionBar.m6.f27859bc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f27951gc;
                    }
                    cnVar.S0 = i10;
                } else {
                    if (q1Var.x2()) {
                        i7 = org.telegram.ui.ActionBar.m6.f27880ce;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f27860be;
                    }
                    cnVar.S0 = i7;
                }
                cnVar.f44539id.setColor(cnVar.getThemedColor(cnVar.S0));
                cnVar.f44539id.setCellToWatch(q1Var);
                ((te.a) cnVar.f44539id.f55295b.f8840b).a(false, false);
                cnVar.f44539id.setAnimatedVisibility(aVar2.f55498e);
                cnVar.f44539id.f55295b.setOnClickListener(new ii.g(new bf(cnVar, 27), 22));
                sh.c cVar = cnVar.f44539id;
                cVar.f55301s = new bf(cnVar, 28);
                org.telegram.ui.Cells.z5 z5Var = cVar.f55294a;
                z5Var.setOnKeyListener(new wf(cnVar, 0));
                z5Var.setOnEditorActionListener(new fa(cnVar, 1));
                cnVar.Z.X4 = z5Var;
                org.telegram.messenger.g0.i3(new q8(cnVar, measuredHeight, z5Var, 2), 100L);
                aVar2.a(true, true);
            }
        }
    }

    public static void g0(cn cnVar, int i7, int i10, int i11, int i12) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = cnVar.Q6;
        int[] iArr4 = cnVar.P6;
        boolean[] zArr = cnVar.U6;
        int[] iArr5 = cnVar.O6;
        int[] iArr6 = cnVar.R6;
        boolean[] zArr2 = cnVar.T6;
        ArrayList arrayList = cnVar.f44722x6;
        if ((i7 - i10) - i11 <= i12 && !cnVar.W6) {
            boolean[] zArr3 = cnVar.S6;
            if (!zArr3[0]) {
                cnVar.W6 = true;
                arrayList.add(Integer.valueOf(cnVar.f44570l6));
                if (cnVar.H6.size() != 0) {
                    org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
                    j3 = 0;
                    long j10 = cnVar.f44545j6;
                    c10 = 0;
                    long j11 = cnVar.f44440b7;
                    int i13 = iArr5[0];
                    boolean z9 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = cnVar.classGuid;
                    int i16 = cnVar.f44492f4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = cnVar.f44643r4;
                    int i17 = cnVar.A4;
                    int i18 = cnVar.f44570l6;
                    cnVar.f44570l6 = i18 + 1;
                    messagesController.Y2(j10, j11, false, 50, i13, 0, z9, i14, i15, 0, i16, j12, i17, i18, cnVar.f44693v4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    org.telegram.messenger.qp messagesController2 = cnVar.getMessagesController();
                    long j13 = cnVar.f44545j6;
                    long j14 = cnVar.f44440b7;
                    boolean z10 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = cnVar.classGuid;
                    int i21 = cnVar.f44492f4;
                    long j15 = cnVar.f44643r4;
                    int i22 = cnVar.A4;
                    int i23 = cnVar.f44570l6;
                    cnVar.f44570l6 = i23 + 1;
                    messagesController2.Y2(j13, j14, false, 50, 0, 0, z10, i19, i20, 0, i21, j15, i22, i23, cnVar.f44693v4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (cnVar.f44440b7 != 0 && !zArr3[1]) {
                    cnVar.W6 = true;
                    arrayList.add(Integer.valueOf(cnVar.f44570l6));
                    org.telegram.messenger.qp messagesController3 = cnVar.getMessagesController();
                    long j16 = cnVar.f44440b7;
                    int i24 = iArr5[1];
                    boolean z11 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = cnVar.classGuid;
                    int i27 = cnVar.f44492f4;
                    long j17 = cnVar.f44643r4;
                    int i28 = cnVar.A4;
                    int i29 = cnVar.f44570l6;
                    cnVar.f44570l6 = i29 + 1;
                    messagesController3.Y2(j16, 0L, false, 50, i24, 0, z11, i25, i26, 0, i27, j17, i28, i29, cnVar.f44693v4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i11 > 0 && !cnVar.Y7 && i10 <= 10) {
            if (cnVar.f44440b7 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(cnVar.f44570l6));
                org.telegram.messenger.qp messagesController4 = cnVar.getMessagesController();
                long j18 = cnVar.f44440b7;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = cnVar.classGuid;
                int i33 = cnVar.f44492f4;
                long j19 = cnVar.f44643r4;
                int i34 = cnVar.A4;
                int i35 = cnVar.f44570l6;
                cnVar.f44570l6 = i35 + 1;
                messagesController4.Y2(j18, 0L, false, 50, i30, 0, true, i31, i32, 1, i33, j19, i34, i35, cnVar.f44693v4);
                cnVar.Y7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(cnVar.f44570l6));
                org.telegram.messenger.qp messagesController5 = cnVar.getMessagesController();
                long j20 = cnVar.f44545j6;
                long j21 = cnVar.f44440b7;
                int i36 = iArr2[c10];
                int i37 = iArr[c10];
                int i38 = cnVar.classGuid;
                int i39 = cnVar.f44492f4;
                long j22 = cnVar.f44643r4;
                int i40 = cnVar.A4;
                int i41 = cnVar.f44570l6;
                cnVar.f44570l6 = i41 + 1;
                messagesController5.Y2(j20, j21, false, 50, i36, 0, true, i37, i38, 1, i39, j22, i40, i41, cnVar.f44693v4);
                cnVar.Y7 = true;
            }
        }
    }

    public static void g1(org.telegram.ui.cn r12, org.telegram.ui.uj r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.g1(org.telegram.ui.cn, org.telegram.ui.uj, boolean[]):void");
    }

    public static void h0(org.telegram.ui.cn r19, final org.telegram.ui.wy0[] r20, final org.telegram.ui.Components.k60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.h0(org.telegram.ui.cn, org.telegram.ui.wy0[], org.telegram.ui.Components.k60):void");
    }

    public static void h1(cn cnVar) {
        if (cnVar.f44492f4 == 0 && cnVar.getMessagesController().N6 > cnVar.getConnectionsManager().getCurrentTime() && !b.a(cnVar.currentAccount, cnVar.f44487f)) {
            b.c(cnVar.currentAccount, cnVar.getParentActivity(), cnVar.getResourceProvider());
        }
    }

    public static void i0(cn cnVar, int i7, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        if (cnVar.Nb != i7) {
            return;
        }
        if (bool.booleanValue()) {
            cnVar.W5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                cnVar.W5 = null;
                org.telegram.messenger.mj mjVar = cnVar.f44694v5;
                if (mjVar != null) {
                    int i10 = cnVar.currentAccount;
                    CharSequence fieldText = cnVar.Z.getFieldText();
                    org.telegram.messenger.ij ijVar3 = cnVar.D5;
                    if (ijVar3 == cnVar.f44568l4) {
                        ijVar2 = null;
                    } else {
                        ijVar2 = ijVar3;
                    }
                    mjVar.e(i10, null, fieldText, ijVar2, cnVar.B5, cnVar.F5);
                }
                cnVar.A8();
                return;
            }
            boolean z9 = webPage instanceof TLRPC.TL_webPagePending;
            if (z9) {
                cnVar.Y5 = str;
            }
            if (cnVar.h != null && z9) {
                webPage.url = str;
            }
            org.telegram.messenger.mj mjVar2 = cnVar.f44694v5;
            if (mjVar2 != null) {
                int i11 = cnVar.currentAccount;
                CharSequence fieldText2 = cnVar.Z.getFieldText();
                org.telegram.messenger.ij ijVar4 = cnVar.D5;
                if (ijVar4 == cnVar.f44568l4) {
                    ijVar = null;
                } else {
                    ijVar = ijVar4;
                }
                mjVar2.e(i11, null, fieldText2, ijVar, cnVar.B5, cnVar.F5);
            }
            cnVar.kc(true, cnVar.W5, false);
            return;
        }
        cnVar.W5 = null;
        cnVar.A8();
    }

    public static void i1(cn cnVar, int i7) {
        dh.g gVar = cnVar.G;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                qi.a e10 = cnVar.glassEngine.e();
                float L = org.telegram.messenger.g0.L(48.0f);
                float L2 = org.telegram.messenger.g0.L(48.0f);
                int i10 = 0;
                while (i10 < e10.f54165b) {
                    RectF rectF = (RectF) e10.f54164a.get(i10);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e10.d(i10);
                    } else {
                        i10++;
                    }
                }
                e10.b(cnVar.f44741z0.getY(), cnVar.f44741z0.getWidth(), cnVar.f44741z0.getY() + cnVar.f44741z0.getHeight());
                gVar.h(e10);
            }
            ql qlVar = cnVar.l1;
            gVar.e(qlVar.f49074p0, qlVar.getWidth(), cnVar.l1.getHeight());
        }
    }

    public static void j0(cn cnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.ui.b0(cnVar.currentAccount).E0(false, true, null);
            cnVar.ya(user.f27109id, cnVar.A8, false);
        }
    }

    public static void j1(cn cnVar) {
        cnVar.f44713wa = null;
        cnVar.f44741z0.setOnInterceptTouchListener(null);
        cnVar.Ob(cnVar.l1, true);
        org.telegram.messenger.d4.f(cnVar.currentAccount).f21983a.clear();
    }

    public static void k0(cn cnVar, boolean[] zArr, Context context) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2 = cnVar.D5;
        if (ijVar2 == null || !org.telegram.messenger.ij.c3(ijVar2.f23266k)) {
            boolean z9 = zArr[0];
            if (z9) {
                zArr[0] = false;
            }
            int i7 = cnVar.Qb;
            if (i7 == 5) {
                int i10 = cnVar.currentAccount;
                long j3 = cnVar.f44545j6;
                org.telegram.messenger.nj njVar = cnVar.f44708w5;
                if (njVar == null) {
                    njVar = org.telegram.messenger.nj.a();
                }
                new bi.e1(context, i10, j3, njVar, cnVar, cnVar.getResourceProvider(), 0, new ne(cnVar, 1)).show();
            } else if (i7 == 1 && (ijVar = cnVar.F5) != null) {
                if (ijVar.p5() && !z9) {
                    org.telegram.messenger.nj njVar2 = cnVar.f44708w5;
                    if (njVar2 == null) {
                        njVar2 = org.telegram.messenger.nj.a();
                    }
                    cnVar.zc(njVar2);
                } else if (cnVar.F5.t() && cnVar.E5 == 0) {
                    if (cnVar.X1 == null) {
                        cnVar.U7();
                    }
                    cnVar.X1.w1(-1, cnVar.F5);
                    cnVar.za();
                } else {
                    cnVar.l(cnVar.F5.e1(), 0, true, 0, true, 0);
                }
            } else if (cnVar.f44694v5 != null) {
                if (i7 == 2) {
                    if (!org.telegram.messenger.m5.C(cnVar.f44545j6) && !cnVar.f44694v5.f24052u && cnVar.f44492f4 != 5) {
                        int i11 = org.telegram.messenger.iz.f23389a;
                        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                        org.telegram.messenger.iz.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        cnVar.Ea(0);
                        return;
                    }
                    org.telegram.messenger.ij ijVar3 = cnVar.D5;
                    if (ijVar3 != null) {
                        cnVar.l(ijVar3.e1(), 0, true, 0, true, 0);
                    }
                } else if (i7 == 3) {
                    int i12 = org.telegram.messenger.iz.f23389a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.P = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    cnVar.Ea(1);
                } else if (i7 == 4) {
                    cnVar.Ea(2);
                }
            }
        }
    }

    public static void k1(cn cnVar) {
        org.telegram.ui.Components.z20.h.a();
        cnVar.showDialog(new zh.g1(cnVar.getParentActivity(), cnVar.currentAccount, cnVar.a(), null, null));
    }

    public static void k2(cn cnVar, View view, boolean z9, float f10, float f11) {
        org.telegram.messenger.ij ijVar;
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            ijVar = q1Var.getMessageObject();
            q1Var.f29864g1 = f10;
            q1Var.f29878h1 = f11;
            org.telegram.ui.Components.i90 i90Var = q1Var.Sa;
            float f12 = q1Var.f29878h1;
            i90Var.h = q1Var.getTranslationX() + f10;
            i90Var.f34574i = f12;
            i90Var.f34577l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ijVar = ((org.telegram.ui.Cells.t0) view).getMessageObject();
        } else {
            ijVar = null;
        }
        int Z8 = cnVar.Z8(ijVar);
        if ((ijVar == null || ((i10 = ijVar.D) != 30 && i10 != 18 && i10 != 25)) && Z8 >= 2 && Z8 != 20 && Z8 != 21) {
            if (ijVar == null || ((i7 = ijVar.D) != 27 && i7 != 30)) {
                if (ijVar == null || !ijVar.X4()) {
                    if (ijVar == null || (!ijVar.r4() && !org.telegram.messenger.ij.c3(ijVar.f23266k))) {
                        cnVar.K6(ijVar, z9, true);
                        cnVar.Kc();
                        cnVar.Fd(false);
                    }
                }
            }
        }
    }

    public static void l0(cn cnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        ug.f1 f1Var = new ug.f1(cnVar, cnVar.currentAccount, user, null, null, cnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            f1Var.f56597y2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(cnVar.getParentActivity());
        org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(160.0f), 4, k9Var, false);
        k9Var.setImageDrawable(f5Var);
        k9Var.addOnAttachStateChangeListener(new e5(f5Var, 1));
        f5Var.j(j3, false);
        f1Var.f56598z2 = true;
        f1Var.f56595w2 = k9Var;
        cnVar.showDialog(f1Var);
    }

    public static void l1(cn cnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        cn cnVar2;
        int i7;
        int i10;
        TLRPC.TL_forumTopic f10;
        jh.a aVar = cnVar.f44663sc;
        if (num.intValue() != cnVar.b()) {
            cnVar.Sc = false;
            te teVar = cnVar.f44624pc;
            if (teVar != null) {
                org.telegram.messenger.g0.r(teVar);
                cnVar.f44624pc.run();
                cnVar.f44624pc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.m11 m11Var = cnVar.f44490f2;
            long intValue = num.intValue();
            ArrayList l10 = org.telegram.messenger.qp.s1(m11Var.f35801e).f24881q7.l(-m11Var.f35803f);
            if (l10 != null) {
                int size = l10.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = l10.get(i11);
                    i11++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f27012id == intValue) {
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
            if (message == null && tL_forumTopic != null && (f10 = cnVar.getMessagesController().f24881q7.f(-cnVar.a(), tL_forumTopic.f27012id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                cnVar.f44739yb = SystemClock.uptimeMillis();
                cnVar.F7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    cnVar.ub(cnVar.b());
                } else if (cnVar.b() == 0) {
                    cnVar.ub(num.intValue());
                } else {
                    cnVar.D7 = -1;
                }
                cnVar.getConnectionsManager().cancelRequestsForGuid(cnVar.classGuid);
                cnVar.getMessagesStorage().k(cnVar.classGuid);
                cnVar.classGuid = ConnectionsManager.generateClassGuid();
                cnVar.rb();
                cnVar.f44694v5 = null;
                cnVar.K7 = 0;
                cnVar.A7 = false;
                cnVar.B7 = true;
                cnVar.W7 = true;
                cnVar.X7 = 0;
                cnVar.Z7 = null;
                cnVar.f44722x6.clear();
                cnVar.f44446c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.ij(cnVar.getCurrentAccount(), message, false, false));
                    cnVar2 = cnVar;
                    cnVar2.Ub(arrayList, cnVar.f44473e, tL_forumTopic2.f27012id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    cnVar2 = cnVar;
                    cnVar2.f44629q4 = null;
                    cnVar2.o4 = null;
                    cnVar2.f44568l4 = null;
                    cnVar2.D5 = null;
                    cnVar2.f44733y4 = 0;
                    cnVar2.f44745z4 = 0;
                    cnVar2.A4 = 0;
                    cnVar2.f44643r4 = 0L;
                    cnVar2.f44657s4 = 0;
                    cnVar2.f44668t4 = null;
                    cnVar2.f44693v4 = false;
                    cnVar2.f44680u4 = false;
                }
                ll llVar = cnVar2.C0;
                if (llVar != null) {
                    if (llVar.I >= 0 && !llVar.N()) {
                        ll llVar2 = cnVar2.C0;
                        llVar2.s(llVar2.I);
                    } else {
                        ll llVar3 = cnVar2.C0;
                        if (llVar3.I < 0 && llVar3.N()) {
                            cnVar2.C0.i(0);
                        }
                    }
                    cnVar2.C0.T();
                }
                cnVar2.K8();
                cnVar2.vd(true);
                cnVar2.f44601o1.n(true);
                if (tL_forumTopic2 != null) {
                    cnVar2.Bd();
                } else {
                    cnVar2.f44601o1.b();
                }
                cnVar2.f44490f2.setCurrentTopic(cnVar2.b());
                cnVar2.yd(true);
                cnVar2.Oc(true);
                cnVar2.getMessagesController().J4(-cnVar2.a(), cnVar2.b());
                cnVar2.gb();
                cnVar2.D9(true);
                cnVar2.C9(true);
                cnVar2.N6(true, true);
                if (cnVar2.Z != null) {
                    if (!org.telegram.messenger.t10.u(cnVar2.f44487f)) {
                        cnVar2.Z.k0(false);
                    }
                    cnVar2.Z.I1(true);
                }
                if (tL_forumTopic2 != null) {
                    cnVar2.getMessagesController().f24881q7.k(cnVar2.f44545j6, tL_forumTopic2.f27012id);
                }
                if (tL_forumTopic2 != null) {
                    i7 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i7 = 0;
                }
                cnVar2.f44742z1 = i7;
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i10 = 0;
                }
                cnVar2.A1 = i10;
                cnVar2.id(false);
                cnVar2.hd(false);
                cnVar2.zd();
                um umVar = cnVar2.Tc;
                if (umVar != null && cnVar2.actionBar.f27691n0) {
                    umVar.k(null);
                }
                if (org.telegram.messenger.t10.u(cnVar2.f44487f)) {
                    cnVar2.getMediaDataController().I0(org.telegram.messenger.xr.a(cnVar2.f44545j6, num.intValue()), true);
                }
            }
        }
    }

    public static void l2(cn cnVar, int i7) {
        int i10;
        boolean z9;
        ArrayList arrayList = cnVar.K6;
        SparseArray[] sparseArrayArr = cnVar.f44582m6;
        if (!cnVar.kb && (i10 = i7 - cnVar.C0.J) >= 0 && i10 < arrayList.size()) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
            if (sparseArrayArr[0].get(ijVar.e1(), null) == null && sparseArrayArr[1].get(ijVar.e1(), null) == null) {
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
            org.telegram.ui.Components.pj0 pj0Var = cnVar.f44741z0;
            ?? obj = new Object();
            obj.d = cnVar;
            obj.f19081b = z9;
            obj.f19082c = sparseArray;
            if (!pj0Var.f36959b2) {
                pj0Var.f36976k2 = new int[2];
                new HashSet();
                pj0Var.n1(pj0Var, true);
                pj0Var.f36966f2 = obj;
                pj0Var.f36959b2 = true;
                pj0Var.f36964e2 = i7;
                pj0Var.d2 = i7;
            }
        }
    }

    public static void m0(cn cnVar) {
        org.telegram.ui.Cells.q1 q1Var;
        bl blVar;
        int i7;
        if (!cnVar.f44675tc && cnVar.T3 && cnVar.f44741z0.G && cnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = cnVar.f44741z0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = cnVar.f44741z0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f23266k != null && q1Var.getMessageObject().f23266k.video_processing_pending) {
                            if (q1Var.getCurrentPosition() != null) {
                                if (q1Var.getMessageObject() != null && (q1Var.getCurrentPosition().f21455l & 8) != 0) {
                                    int i10 = q1Var.getCurrentPosition().f21455l;
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
                            if (timeY >= org.telegram.messenger.g0.L(240.0f) && timeY <= (org.telegram.messenger.g0.f22567q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f22562n) {
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
                cnVar.f44675tc = true;
                bl blVar2 = new bl(cnVar, cnVar.getParentActivity());
                blVar2.r(true);
                blVar2.K = Layout.Alignment.ALIGN_CENTER;
                blVar2.d = 3500L;
                blVar2.T = true;
                blVar2.f12424e = true;
                blVar2.h = org.telegram.messenger.g0.L(150.0f);
                blVar2.s(8.0f);
                cnVar.P1 = blVar2;
                blVar2.u(org.telegram.messenger.id.M0(2131743598, null));
                cnVar.P1.l(cnVar.K);
                cnVar.l1.addView(cnVar.P1, c8.ha.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                q1Var.getLocationInWindow(iArr);
                cnVar.Q1 = q1Var.getTimeY() + iArr[1];
                cnVar.P1.setTranslationY(((-blVar.getTop()) - org.telegram.messenger.g0.L(120.0f)) + cnVar.Q1);
                cnVar.P1.p(0.0f, (q1Var.z9 / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q1Var.B9);
                cnVar.P1.w();
                return;
            }
            org.telegram.messenger.g0.r(new ae(cnVar, 2));
            org.telegram.messenger.g0.i3(new ae(cnVar, 2), 2000L);
        }
    }

    public static void m1(cn cnVar, long j3, long j10, Long l10) {
        int i7;
        String str;
        if (cnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = cnVar.getParentActivity();
        String M0 = org.telegram.messenger.id.M0(2131746291, null);
        if (org.telegram.messenger.t3.p0(cnVar.f44473e)) {
            i7 = 2131746295;
        } else {
            i7 = 2131746296;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i7, org.telegram.messenger.m5.t(j3)));
        if (l10.longValue() > 0) {
            str = org.telegram.messenger.id.H(',', "RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.u4.f0(parentActivity, M0, X2, str, org.telegram.messenger.id.M0(2131751817, null), new vg(cnVar, j3, j10, l10, 0), cnVar.resourceProvider, true);
    }

    public static boolean m2(cn cnVar, View view, RectF rectF) {
        RectF rectF2 = cnVar.f44525hc;
        if (rectF != null && cnVar.f44741z0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void n0(cn cnVar) {
        if (cnVar.f44420a2) {
            cnVar.getMessagesController().d(0, 0, cnVar.f44545j6);
            cnVar.g8();
            cnVar.M3.j(23, cnVar.f44545j6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit();
            edit.putBoolean("dialog_bar_archived" + cnVar.f44545j6, false);
            edit.putBoolean("dialog_bar_block" + cnVar.f44545j6, false);
            edit.putBoolean("dialog_bar_report" + cnVar.f44545j6, false);
            edit.commit();
            cnVar.yd(false);
            org.telegram.messenger.dt notificationsController = cnVar.getNotificationsController();
            long j3 = cnVar.f44545j6;
            long b10 = cnVar.b();
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
        } else if (cnVar.Z1.getTag() != null && ((Integer) cnVar.Z1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = cnVar.f44620p8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i7 = 0; i7 < cnVar.f44620p8.participants.participants.size(); i7++) {
                    hVar.k(null, cnVar.f44620p8.participants.participants.get(i7).user_id);
                }
                long j10 = cnVar.f44620p8.f26961id;
                org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(cnVar.getParentActivity(), cnVar.currentAccount, hVar, cnVar.f44620p8.f26961id, cnVar, cnVar.f44750za);
                x50Var.f40188f2 = new fe(cnVar, 25);
                x50Var.show();
            }
        } else if (cnVar.Z1.getTag() != null) {
            cnVar.Xb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cnVar.f44487f.f27109id);
            bundle.putBoolean("addContact", true);
            qr qrVar = new qr(bundle);
            qrVar.O = new fe(cnVar, 26);
            cnVar.presentFragment(qrVar);
        }
    }

    public static void n1(cn cnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = cnVar.getMessagesController().j1(cnVar.f44545j6);
                tL_messages_getHistory.offset_date = cnVar.M7 + 86400;
                tL_messages_getHistory.limit = 1;
                cnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ld(1, cnVar, tLObject));
                return;
            }
            cnVar.actionBar.setSubtitle(org.telegram.messenger.id.M0(2131748192, null));
        }
    }

    public static void o1(cn cnVar, cg.a aVar, Runnable runnable) {
        if (!cnVar.isFinished) {
            if (cg.a.m(bi.ea.x(cnVar.currentAccount, aVar.f6163a).p()).f6164b < aVar.f6164b) {
                cg.b bVar = aVar.f6163a;
                if (bVar == cg.b.f6165a) {
                    new bi.tc(cnVar.getParentActivity(), cnVar.getResourceProvider(), aVar.a(), 13, qg.d.h(cnVar.currentAccount, cnVar.a()), null, cnVar.a()).show();
                    return;
                } else if (bVar == cg.b.f6166b) {
                    new gi.e(cnVar.getParentActivity(), cnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void p0(cn cnVar, long j3, long j10) {
        org.telegram.messenger.f2.b(cnVar.currentAccount).h(j3, j10, false);
        cnVar.f44624pc = null;
    }

    public static void p1(cn cnVar, org.telegram.ui.Components.k60 k60Var) {
        if (cnVar.f44611oc == null) {
            return;
        }
        k60Var.u();
        cnVar.la(cnVar.f44611oc, false, true);
        vf.c.s(cnVar.getParentActivity(), Uri.parse(cnVar.f44611oc.R0), true, false, false, null, null, false, org.telegram.messenger.qp.s1(cnVar.currentAccount).f24767d6, false, false);
    }

    public static void p4(cn cnVar, org.telegram.ui.Cells.f0 f0Var) {
        String charSequence;
        if (org.telegram.messenger.qp.s1(cnVar.currentAccount).f24900s7.s()) {
            CharSequence text = f0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            org.telegram.messenger.b6.d(charSequence, new a7(cnVar, f0Var, text, 3), new w0(f0Var, 16), false);
            return;
        }
        f0Var.setClickable(false);
    }

    public static void q0(cn cnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.m1(cnVar.getParentActivity(), cnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, cnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            cnVar.presentFragment(new kl0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void q1(cn cnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(cnVar.currentAccount).o1(user.f27109id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(cnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new zg(cnVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void q2(cn cnVar, org.telegram.ui.Cells.q1 q1Var, int i7, int i10, int i11) {
        if (!cnVar.B2.V || cnVar.Kb != q1Var || cnVar.Lb != i11) {
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (messageObject != null && (org.telegram.messenger.ij.m1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.ij.m1(messageObject);
                if (org.telegram.messenger.ij.W4(tL_messageMediaPoll) && !org.telegram.messenger.ij.U4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        cnVar.B2.u(org.telegram.messenger.id.M0(2131747159, null));
                        cnVar.Kb = q1Var;
                        cnVar.Lb = i11;
                        cnVar.B2.x(cnVar.u9(q1Var, i10), cnVar.v9(q1Var, i11), true);
                    }
                }
            }
            if (i7 == -1) {
                cnVar.B2.u(org.telegram.messenger.id.M0(2131747158, null));
                cnVar.Kb = q1Var;
                cnVar.Lb = i11;
                cnVar.B2.x(cnVar.u9(q1Var, i10), cnVar.v9(q1Var, i11), true);
            }
        }
    }

    public static void q4(cn cnVar) {
        if (cnVar.W3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = cnVar.f44492f4;
        if (i7 == 3) {
            tL_message.message = org.telegram.messenger.id.M0(2131745894, null);
        } else if (i7 == 9) {
            tL_message.message = org.telegram.messenger.id.M0(2131742893, null);
        } else {
            tL_message.message = org.telegram.messenger.id.M0(2131752671, null);
        }
        tL_message.f26981id = 0;
        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(cnVar.currentAccount, tL_message, false, false);
        cnVar.W3 = ijVar;
        ijVar.D = 10;
        ijVar.U = 1;
    }

    public static void r0(cn cnVar) {
        TLRPC.ChatFull chatFull = cnVar.f44620p8;
        if (chatFull != null && !cnVar.G5) {
            TLRPC.Chat chat = cnVar.f44473e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && cnVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7;
                int i7 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z9 = org.telegram.messenger.r2.f25216a;
                int currentTime = cnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i7) >= 604800 && cnVar.visibleDialog == null && cnVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = cnVar.getParentActivity();
                    fe feVar = new fe(cnVar, 15);
                    fe feVar2 = new fe(cnVar, 16);
                    Pattern pattern = org.telegram.ui.Components.u4.f38507a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.g0.y2(null, 2131624037);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bg.q0(10));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.sz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(127.17949f), y22)));
                    frameLayout.addView(view, c8.ha.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.V = frameLayout;
                    u1Var.O0 = 0.3974359f;
                    u1Var.R = org.telegram.messenger.id.M0(2131749564, null);
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749565, null));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749566, null), feVar);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), feVar2);
                    cnVar.showDialog(u1Var);
                }
            }
        }
    }

    public static void r1(cn cnVar) {
        if (org.telegram.messenger.g0.g(cnVar.f44611oc.U0)) {
            org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cnVar.getParentActivity()), cnVar.resourceProvider));
        }
    }

    public static void r4(cn cnVar) {
        if (cnVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.id.M0(2131742894, null);
        tL_message.f26981id = 0;
        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(cnVar.currentAccount, tL_message, false, false);
        cnVar.X3 = ijVar;
        ijVar.D = 10;
        ijVar.U = 1;
    }

    public static void s0(cn cnVar, int i7, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z9, ff ffVar) {
        String str4;
        org.telegram.ui.Components.c21 c21Var;
        if (cnVar.f44669t5 != null && i7 < arrayList.size() && cnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = cnVar.getParentActivity();
            int i10 = iArr[0];
            xf xfVar = new xf(cnVar, 13);
            String[] strArr = org.telegram.ui.Components.k21.R1;
            if (parentActivity == null) {
                c21Var = null;
            } else {
                org.telegram.ui.Components.c21 c21Var2 = new org.telegram.ui.Components.c21(parentActivity, str, str4, inputPeer, i10, richMessage, xfVar);
                c21Var2.R0(z9);
                c21Var2.M1 = cnVar;
                c21Var2.N1 = ffVar;
                if (cnVar.getParentActivity() != null) {
                    cnVar.showDialog(c21Var2);
                }
                c21Var = c21Var2;
            }
            c21Var.f28698o0 = false;
            cnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + cnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit();
                edit.putInt("dialog_show_translate_count" + cnVar.a(), i11 - 1).apply();
                cnVar.yd(true);
            }
        }
    }

    public static void s1(cn cnVar, Context context) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.kg kgVar;
        String str;
        SparseArray[] sparseArrayArr = cnVar.f44582m6;
        if (cnVar.getParentActivity() != null && cnVar.f44536ia == 0.0f) {
            if (cnVar.f44492f4 == 3) {
                Bundle bundle = new Bundle();
                long d92 = cnVar.d9();
                if (d92 >= 0) {
                    bundle.putLong("user_id", d92);
                } else {
                    bundle.putLong("chat_id", -d92);
                }
                cnVar.presentFragment(new cn(bundle));
                return;
            }
            boolean z11 = false;
            if (cnVar.X9()) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < sparseArrayArr[0].size(); i7++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i7)));
                }
                cnVar.bc(true, true);
                byte[] bArr = cnVar.f44543j4;
                String str2 = cnVar.f44557k4;
                ne neVar = new ne(cnVar, 2);
                int i10 = sy0.f49991v1;
                int currentAccount = cnVar.getCurrentAccount();
                Activity parentActivity = cnVar.getParentActivity();
                long a10 = cnVar.a();
                if (parentActivity != null) {
                    sy0.J0(currentAccount, parentActivity, a10, false, false, arrayList, org.telegram.ui.Components.gc.a0(cnVar), cnVar.getResourceProvider(), bArr, str2, neVar);
                }
            } else if (cnVar.f44492f4 == 2) {
                cnVar.finishFragment();
                ml mlVar = cnVar.f44573l9;
                if (cnVar.D0.getTag() == null) {
                    z11 = true;
                }
                mlVar.Y(true, z11);
            } else {
                TLRPC.User user = cnVar.f44487f;
                if (user != null && user.f27109id == 489000) {
                    cnVar.Hc(true);
                } else if (user != null && cnVar.f44587n) {
                    if (user.bot) {
                        String str3 = cnVar.f44684u8;
                        cnVar.f44684u8 = null;
                        cnVar.getMessagesController().f5(new he(cnVar, str3, 3), cnVar.f44487f.f27109id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44750za);
                    String M0 = org.telegram.messenger.id.M0(2131754065, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.T = M0;
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new fe(cnVar, 8));
                    u1Var.R = org.telegram.messenger.id.M0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    cnVar.showDialog(u1Var);
                } else if (org.telegram.messenger.t10.z(user)) {
                    cnVar.Hc(true);
                } else {
                    TLRPC.User user2 = cnVar.f44487f;
                    if (user2 != null && user2.bot && (str = cnVar.f44684u8) != null) {
                        if (str.length() != 0) {
                            cnVar.getMessagesController().A4(cnVar.f44684u8, cnVar.f44487f);
                        } else {
                            cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", cnVar.f44545j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        cnVar.f44684u8 = null;
                        cnVar.Oc(false);
                        return;
                    }
                    if (org.telegram.messenger.t3.T(cnVar.f44473e)) {
                        TLRPC.Chat chat = cnVar.f44473e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.t3.r0(chat)) {
                                if (cnVar.f44473e.join_request) {
                                    cnVar.bc(true, true);
                                    org.telegram.messenger.qp.s1(cnVar.currentAccount).m(cnVar.f44473e.f26960id, org.telegram.messenger.p10.i(cnVar.currentAccount).f(), 0, null, null, true, new ae(cnVar, 20), new ni.c(9, cnVar, context), null);
                                    return;
                                }
                                ae aeVar = cnVar.f44439b6;
                                if (aeVar != null) {
                                    org.telegram.messenger.g0.r(aeVar);
                                    cnVar.f44439b6 = null;
                                }
                                cnVar.bc(true, true);
                                cnVar.getMessagesController().n(cnVar.f44473e.f26960id, cnVar.getUserConfig().f(), null, cnVar, null);
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
                                org.telegram.ui.ActionBar.l0 l0Var = cnVar.Y1;
                                if (l0Var != null && (kgVar = cnVar.f44419a1) != null && kgVar.d(l0Var) && cnVar.f44435b2.getVisibility() != 8 && cnVar.f44435b2.getTag(2131296585) != null) {
                                    org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit().putInt("dialog_bar_vis3" + cnVar.f44545j6, 3).commit();
                                    cnVar.getNotificationCenter().k(org.telegram.messenger.qs.Q0, Long.valueOf(cnVar.f44545j6));
                                    return;
                                }
                                return;
                            }
                            cnVar.Hc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = cnVar.f44620p8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    TLRPC.Chat chat2 = cnVar.f44473e;
                    TLRPC.User user3 = cnVar.f44487f;
                    if (cnVar.h != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.u4.r(cnVar, false, chat2, user3, z10, true, false, z9, new fe(cnVar, 9));
                }
            }
        }
    }

    public static void s2(cn cnVar) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij primaryMessageObject;
        TLRPC.Message message;
        if (cnVar.N1 != null) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = null;
        for (int childCount = cnVar.f44741z0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = cnVar.f44741z0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (primaryMessageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f23266k) != null && message.via_business_bot_id != 0) {
                q1Var2 = q1Var;
            }
        }
        cnVar.ac(q1Var2);
    }

    public static cn sa(int i7, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i7);
        return new cn(bundle);
    }

    public static void t0(cn cnVar) {
        TLRPC.UserFull userFull;
        boolean z9;
        if (cnVar.getParentActivity() != null) {
            TLRPC.Chat chat = cnVar.f44473e;
            if (chat != null) {
                if (org.telegram.messenger.t3.j(chat) && !cnVar.f44473e.monoforum) {
                    z9 = true;
                }
                z9 = false;
            } else {
                if (cnVar.h == null && (userFull = cnVar.f44633q8) != null) {
                    z9 = userFull.can_pin_message;
                }
                z9 = false;
            }
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44750za);
                String M0 = org.telegram.messenger.id.M0(2131743842, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131743843, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743844, null), new fe(cnVar, 23));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                cnVar.showDialog(u1Var);
            } else if (!cnVar.T4.isEmpty()) {
                org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit().putInt("pin_" + cnVar.f44545j6, ((Integer) cnVar.T4.get(0)).intValue()).commit();
                cnVar.fd(0, true);
            }
        }
    }

    public static void t1(cn cnVar, String str) {
        if (org.telegram.messenger.qp.s1(cnVar.currentAccount).L2(true)) {
            vf.c.n(cnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.u4.l0(cnVar.getParentActivity(), cnVar.f44750za, str, true, new rf(cnVar, str, 1));
        }
    }

    public static cn ta(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new cn(bundle);
    }

    public static org.telegram.ui.Components.vn u0(cn cnVar, Context context) {
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, cnVar.currentAccount, cnVar.f44527i0.getPopupLayout().getSwipeBack(), false, new zi(cnVar), cnVar.getResourceProvider());
        cnVar.f44704w1 = xnVar;
        xnVar.e(cnVar.f44545j6, cnVar.b(), null);
        return cnVar.f44704w1.f40357f;
    }

    public static void u1(cn cnVar, long j3, long j10, Long l10, Boolean bool) {
        boolean z9 = false;
        bi.ea y10 = bi.ea.y(cnVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z9 = true;
        }
        y10.g0(j3, j10, z9, true);
    }

    public static void v0(cn cnVar) {
        if (org.telegram.messenger.qp.s1(cnVar.currentAccount).r2(cnVar.f44545j6, cnVar.b(), null)) {
            cnVar.xd(true);
            org.telegram.messenger.g0.i3(new ae(cnVar, 8), 150L);
            cnVar.f44527i0.U(null, null);
            if (cnVar.getParentActivity() != null) {
                org.telegram.ui.Components.gc.z(cnVar, 4, 0, cnVar.f44750za).j();
                return;
            }
            return;
        }
        View view = cnVar.f44654s1.f28364j;
        if (view instanceof org.telegram.ui.ActionBar.z0) {
            ((org.telegram.ui.ActionBar.z0) view).b();
        }
    }

    public static void v1(cn cnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = cnVar.W1.getAdapter().f16802w0;
        int i7 = cnVar.currentAccount;
        TLRPC.User user2 = cnVar.f44487f;
        if (user2 != null) {
            j3 = user2.f27109id;
        } else {
            j3 = cnVar.f44473e.f26960id;
        }
        hi.q4 b10 = hi.q4.b(i7, j3, user.f27109id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, cnVar.i9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
            return;
        }
        String F1 = org.telegram.messenger.qp.s1(cnVar.currentAccount).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.qp.s1(cnVar.currentAccount);
            org.telegram.messenger.qp.R4(F1, cnVar);
            return;
        }
        hi.a3 a3Var = new hi.a3(cnVar.getParentActivity(), cnVar.getResourceProvider());
        a3Var.B(false);
        a3Var.B0 = true;
        a3Var.f14528l0 = cnVar.getParentActivity();
        a3Var.x(cnVar, b10);
        a3Var.show();
    }

    public static void w0(cn cnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        int i7;
        int i10;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            i7 = 0;
        } else {
            i7 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        }
        if (i7 > 0 && !zArr[0] && g1Var == cnVar.f44483e9 && g1Var.isShowing() && view2.isLaidOut()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = (view2.getHeight() + iArr[1]) - (view.getHeight() - i7);
            int i11 = org.telegram.messenger.g0.f22561m;
            int i12 = cnVar.f44522h9;
            if (height > 0) {
                i10 = org.telegram.messenger.g0.L(8.0f) + height;
            } else {
                i10 = 0;
            }
            int max = Math.max(i11, i12 - i10);
            if (max != cnVar.f44522h9) {
                zArr[0] = true;
                int i13 = cnVar.f44509g9;
                cnVar.f44522h9 = max;
                g1Var.update(i13, max, -1, -1);
            }
        }
    }

    public static void w1(cn cnVar, int i7) {
        if (cnVar.f44492f4 == 7) {
            Object E = cnVar.f44422a4.E(i7);
            if (i7 == 0) {
                cnVar.f44422a4.getClass();
            }
            if (E instanceof org.telegram.messenger.ij) {
                cnVar.Ha((org.telegram.messenger.ij) E);
            }
        } else if (cnVar.E3 != null) {
            if (i7 >= 0 && i7 < cnVar.getMediaDataController().Y0.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.getMediaDataController().Y0.get(i7);
                cnVar.F3 = false;
                cnVar.Qb(false, true, false);
                org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
                if (i7 >= 0) {
                    if (i7 < mediaDataController.Y0.size()) {
                        mediaDataController.f25816e1 = i7;
                    }
                } else {
                    mediaDataController.getClass();
                }
                cnVar.md(cnVar.getMediaDataController().c0(), cnVar.getMediaDataController().f25816e1, cnVar.getMediaDataController().j0());
                org.telegram.messenger.g0.h3(new ie(cnVar, ijVar, 2));
            }
        } else {
            org.telegram.messenger.ui mediaDataController2 = cnVar.getMediaDataController();
            int i10 = cnVar.classGuid;
            ArrayList arrayList = mediaDataController2.Y0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                mediaDataController2.f25816e1 = i7;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(i10), Integer.valueOf(ijVar2.e1()), Integer.valueOf(mediaDataController2.c0()), Long.valueOf(org.telegram.messenger.ij.B0(ijVar2.f23266k)), Integer.valueOf(mediaDataController2.f25816e1), Integer.valueOf(mediaDataController2.j0()), Boolean.TRUE);
            }
            cnVar.rc(false);
        }
    }

    public static void x0(cn cnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.ui.b0(cnVar.currentAccount).E0(false, true, null);
            cnVar.ya(user.f27109id, cnVar.A8, false);
        }
    }

    public static void x1(cn cnVar, Long l10, Boolean bool) {
        int i7;
        int i10;
        if (l10.longValue() != cnVar.b()) {
            cnVar.f44739yb = SystemClock.uptimeMillis();
            cnVar.F7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                cnVar.ub(cnVar.b());
            } else if (cnVar.b() == 0) {
                cnVar.ub(l10.longValue());
            } else {
                cnVar.D7 = -1;
            }
            cnVar.getConnectionsManager().cancelRequestsForGuid(cnVar.classGuid);
            cnVar.getMessagesStorage().k(cnVar.classGuid);
            cnVar.classGuid = ConnectionsManager.generateClassGuid();
            cnVar.rb();
            cnVar.f44694v5 = null;
            cnVar.K7 = 0;
            cnVar.A7 = false;
            cnVar.B7 = true;
            cnVar.W7 = true;
            cnVar.X7 = 0;
            cnVar.Z7 = null;
            cnVar.f44722x6.clear();
            cnVar.f44643r4 = l10.longValue();
            TLRPC.TL_forumTopic f10 = cnVar.getMessagesController().f24881q7.f(-cnVar.a(), l10.longValue());
            if (l10.longValue() != 0 && f10 != null) {
                int i11 = f10.read_inbox_max_id;
                cnVar.f44733y4 = i11;
                cnVar.f44745z4 = f10.read_outbox_max_id;
                cnVar.A4 = Math.max(1, i11);
                cnVar.getMessagesController().f24881q7.k(cnVar.f44545j6, org.telegram.messenger.m5.o(f10.from_id));
            } else {
                cnVar.f44629q4 = null;
                cnVar.o4 = null;
                cnVar.f44568l4 = null;
                cnVar.D5 = null;
                cnVar.f44733y4 = 0;
                cnVar.f44745z4 = 0;
                cnVar.A4 = 0;
                cnVar.f44643r4 = 0L;
                cnVar.f44657s4 = 0;
                cnVar.f44668t4 = null;
                cnVar.f44693v4 = false;
                cnVar.f44680u4 = false;
            }
            cnVar.K8();
            cnVar.vd(true);
            cnVar.f44601o1.n(true);
            cnVar.f44601o1.b();
            cnVar.f44490f2.setCurrentTopic(l10.longValue());
            cnVar.yd(true);
            cnVar.Oc(true);
            cnVar.getMessagesController().J4(-cnVar.a(), cnVar.b());
            cnVar.E9(true);
            cnVar.C9(true);
            sj sjVar = cnVar.Z;
            if (sjVar != null) {
                sjVar.k0(false);
                cnVar.Z.I1(true);
            }
            cnVar.N6(true, true);
            if (f10 != null) {
                i7 = f10.unread_reactions_count;
            } else {
                i7 = 0;
            }
            cnVar.f44742z1 = i7;
            if (f10 != null) {
                i10 = f10.unread_poll_votes_count;
            } else {
                i10 = 0;
            }
            cnVar.A1 = i10;
            cnVar.id(false);
            cnVar.hd(false);
            cnVar.zd();
            um umVar = cnVar.Tc;
            if (umVar != null && cnVar.actionBar.f27691n0) {
                umVar.k(null);
            }
        }
    }

    public static void y0(long j3, cn cnVar) {
        if (bi.ea.y(cnVar.currentAccount, false).p().amount < j3) {
            new bi.tc(cnVar.getParentActivity(), cnVar.getResourceProvider(), j3, 13, org.telegram.messenger.m5.t(cnVar.a()), new bf(cnVar, 21), cnVar.a()).show();
        } else {
            new bi.uc(cnVar.getParentActivity(), cnVar.resourceProvider).show();
        }
    }

    public static void y1(cn cnVar, long j3, boolean z9, boolean z10) {
        if (!org.telegram.messenger.g0.E1(cnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.ey0.c(cnVar.getParentActivity(), cnVar.currentAccount, -j3, cnVar.getUserConfig().f(), null, z9, z10, cnVar.getResourceProvider());
    }

    public static void z0(cn cnVar, int i7, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z9, ff ffVar) {
        String str3;
        if (cnVar.f44669t5 != null && i7 < arrayList.size() && cnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.ij ijVar = cnVar.f44669t5;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.f23266k;
            }
            org.telegram.ui.Components.k21.T0(cnVar.getParentActivity(), cnVar, inputPeer, iArr[0], cnVar.f44669t5.K2, strArr[0], str3, charSequence, z9, ffVar, new bf(cnVar, 14)).f28698o0 = false;
            cnVar.P7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + cnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(cnVar.currentAccount).f24768d7.edit();
                edit.putInt("dialog_show_translate_count" + cnVar.a(), i10 - 1).apply();
                cnVar.yd(true);
            }
        }
    }

    public static void z1(long j3, cn cnVar) {
        cnVar.getMediaDataController().G0(j3, j3, true, cnVar.classGuid, null);
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
        boolean z9;
        fi.g1 g1Var;
        if (this.ya != null) {
            return;
        }
        int i7 = 0;
        if (this.f44486ed.f55498e >= 1.0f && ((g1Var = this.E1) == null || g1Var.getPositionAnimated() <= 0.0f)) {
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

    public final void A8() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.nj njVar = this.f44708w5;
        if (njVar != null) {
            jc(njVar);
            return;
        }
        TLRPC.WebPage webPage = this.W5;
        if (webPage != null) {
            kc(true, webPage, false);
            return;
        }
        sm smVar = this.B5;
        if (smVar != null) {
            ic(this.D5, smVar);
            return;
        }
        org.telegram.messenger.ij ijVar = this.D5;
        if (ijVar != null && ijVar != this.f44568l4) {
            hc(ijVar);
            return;
        }
        org.telegram.messenger.mj mjVar = this.f44694v5;
        if (mjVar != null && (kjVar = mjVar.f24035b) != null) {
            gc(kjVar.f23704e);
            return;
        }
        org.telegram.messenger.ij ijVar2 = this.F5;
        if (ijVar2 != null) {
            ec(true, null, ijVar2, null, null, true, 0, null, false, 0L);
        } else {
            kc(false, null, true);
        }
    }

    public final void A9() {
        org.telegram.ui.Components.ys editField;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            if (lVar.x()) {
                this.f44526hd.h(5, false, true);
                this.actionBar.w();
            } else {
                return;
            }
        }
        this.f44631q6 = 0;
        this.t6 = 0;
        this.f44645r6 = 0;
        this.f44695v6 = 0;
        this.f44709w6 = 0;
        this.f44682u6 = 0;
        sj sjVar = this.Z;
        if (sjVar != null && (editField = sjVar.getEditField()) != null) {
            if (this.Z.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        rl rlVar = this.s9;
        if (rlVar != null) {
            rlVar.f(true);
            SparseArray sparseArray = this.s9.f29392p0;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i7))).cancel();
            }
            sparseArray.clear();
        }
        vk vkVar = this.C9;
        if (vkVar != null) {
            org.telegram.messenger.g0.r(vkVar.H);
            vkVar.a();
        }
        sj sjVar2 = this.Z;
        if (sjVar2 != null) {
            sjVar2.f31030a0 = false;
        }
        this.D9 = false;
        if (this.f44751zb != null) {
            I9();
        }
    }

    public final void Aa() {
        ns.p().T = null;
        if (getParentActivity() == null) {
            return;
        }
        U7();
        this.X1.d2.i0();
        this.X1.y1(1, false);
        di.u2 u2Var = this.X1;
        u2Var.R3 = true;
        u2Var.W0(null);
        this.X1.e1();
        di.u2 u2Var2 = this.X1;
        u2Var2.f32647s1 = this.f44750za;
        if (this.visibleDialog != null) {
            u2Var2.show();
        } else {
            showDialog(u2Var2);
        }
    }

    public final void Ab(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Ab(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Ac(org.telegram.messenger.ij ijVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().A2(org.telegram.messenger.ij.B0(ijVar.f23266k))) {
            TLRPC.Message message = ijVar.f23266k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = ijVar.f23325z2;
                boolean z9 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = ijVar.v;
                    if (ijVar.f23325z2.size() > 1) {
                        z9 = true;
                    }
                } else {
                    charSequence = ijVar.f23322z;
                }
                if (!z9 && charSequence != null) {
                    z9 = true;
                }
                if (z9 && org.telegram.messenger.iz.J <= 2 && !this.D9 && this.E9 <= this.Z.getTop() - org.telegram.messenger.g0.L(60.0f)) {
                    this.D9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i7 = org.telegram.messenger.iz.J + 1;
                    org.telegram.messenger.iz.J = i7;
                    edit.putInt("textSelectionHintShows", i7);
                    edit.apply();
                    if (this.C9 == null) {
                        vk vkVar = new vk(getParentActivity(), this.f44750za, this);
                        this.C9 = vkVar;
                        this.l1.addView(vkVar, c8.ha.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.C9.c();
                }
            }
        }
    }

    public final void Ad() {
        TLRPC.TL_forumTopic tL_forumTopic;
        wi wiVar = this.f44601o1;
        if (wiVar != null && (tL_forumTopic = this.f44629q4) != null) {
            wiVar.setTitle(tL_forumTopic.title);
        }
        Bd();
    }

    public final void B7() {
        float f10;
        org.telegram.ui.Components.ue ueVar;
        float inputBubbleHeight = this.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(15.0f) + s9(org.telegram.ui.Components.i11.f34509c) + this.f44702w.d();
        sj sjVar = this.Z;
        if (sjVar != null && (ueVar = sjVar.m0) != null) {
            ueVar.setTranslationY(-inputBubbleHeight);
        }
        lj ljVar = this.W1;
        if (ljVar != null) {
            if (ljVar.g()) {
                f10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            ljVar.setTranslationY(f10);
        }
    }

    public final void B9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.gc.a0(this).c(org.telegram.messenger.id.M0(2131754488, null)).j();
            getMessagesController().o0(true);
            hb(this.f44669t5);
            jb(this.f44669t5);
            return;
        }
        showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 3, true));
    }

    public final void Ba(final CharacterStyle characterStyle, final String str, boolean z9, final org.telegram.ui.Cells.q1 q1Var, final org.telegram.messenger.ij ijVar) {
        TLRPC.Message message;
        if (z9) {
            int i7 = -1;
            if (str.startsWith("@")) {
                if (q1Var != null) {
                    q1Var.f3(-1);
                }
                String substring = str.substring(1);
                ii ma = ma(q1Var, characterStyle);
                TLObject f22 = getMessagesController().f2(substring);
                bi.t3 t3Var = new bi.t3(this, ma, q1Var, substring, characterStyle, 2);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                ma.f57332b = new re(this, getConnectionsManager().sendRequest(checkusername, new bi.r8(this, f22, t3Var, substring, ma, 4)), 5);
                ma.d();
                return;
            } else if (characterStyle == null) {
                org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.h6) this.f44750za, false);
                w2Var.N();
                if (str.startsWith("video?")) {
                    i7 = Utilities.z(str).intValue();
                }
                final int i10 = i7;
                if (i10 >= 0) {
                    w2Var.O = org.telegram.messenger.g0.g0(i10, false, false);
                    w2Var.P = false;
                } else {
                    w2Var.O = vf.c.d(str, true);
                    w2Var.P = false;
                    w2Var.Q = true;
                }
                CharSequence[] charSequenceArr = (V9() || !(ijVar == null || (message = ijVar.f23266k) == null || !message.noforwards)) ? new CharSequence[]{org.telegram.messenger.id.M0(2131747817, null)} : new CharSequence[]{org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        cn.F0(cn.this, str, characterStyle, ijVar, q1Var, i10, i11);
                    }
                };
                w2Var.L = charSequenceArr;
                w2Var.K = onClickListener;
                w2Var.H0 = new q5(q1Var, 3);
                showDialog(w2Var);
                return;
            } else {
                if (q1Var != null) {
                    q1Var.f3(-1);
                }
                j8(q1Var, ijVar, characterStyle, str);
                return;
            }
        }
        la(ijVar, false, false);
        String c10 = vf.c.c(str);
        if (c10 != null) {
            String lowerCase = c10.toLowerCase();
            if (!org.telegram.messenger.t3.O(lowerCase, this.f44473e) && !org.telegram.messenger.t10.r(lowerCase, this.f44487f)) {
                if (str.startsWith("@")) {
                    getMessagesController().y3(lowerCase, this, 0, ma(q1Var, characterStyle));
                    return;
                } else {
                    Ya(0, str, characterStyle, q1Var, false);
                    return;
                }
            }
            wi wiVar = this.f44601o1;
            if (wiVar != null) {
                wiVar.e(false, false);
            } else {
                Wb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Ya(0, str, characterStyle, q1Var, false);
        } else {
            int i11 = this.f44492f4;
            if (i11 != 1 && i11 != 2 && i11 != 7) {
                if (str.contains("@")) {
                    presentFragment(new org.telegram.ui.Components.r20(str, this.resourceProvider));
                    return;
                } else {
                    Fa(str, false);
                    return;
                }
            }
            this.f44573l9.w0(str);
            if (this.f44492f4 != 7) {
                finishFragment();
            }
        }
    }

    public final void Bb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Bb(java.lang.CharSequence, boolean):void");
    }

    public final void Bc(boolean z9, boolean z10) {
        sj sjVar;
        int i7;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z9 || this.G2 != null) && this.f44492f4 == 0 && (sjVar = this.Z) != null && sjVar.getAudioVideoButtonContainer() != null && this.Z.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.G2 == null) {
                    int indexOfChild = this.l1.indexOfChild(this.T);
                    if (indexOfChild != -1) {
                        this.G2 = E6(310.0f, 3, indexOfChild + 1, false);
                    } else {
                        return;
                    }
                }
                if (z9) {
                    this.G2.f(true);
                    return;
                }
                if (this.Z.f31058e2) {
                    fi.m3 m3Var = this.G2;
                    if (z10) {
                        i7 = 2131749290;
                    } else {
                        i7 = 2131749292;
                    }
                    m3Var.u(org.telegram.messenger.id.M0(i7, null));
                } else {
                    this.G2.u(org.telegram.messenger.id.M0(2131749291, null));
                }
                this.G2.y(this.Z.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Bd() {
        wi wiVar;
        wi wiVar2;
        if (org.telegram.messenger.t10.u(this.f44487f) && (wiVar2 = this.f44601o1) != null) {
            wiVar2.getAvatarImageView().setVisibility(0);
            this.f44601o1.b();
        } else if (this.f44629q4 != null && (wiVar = this.f44601o1) != null) {
            wiVar.getAvatarImageView().setVisibility(0);
            qg.d.p(this.f44601o1.getAvatarImageView(), this.f44629q4, true, true, this.f44750za);
        }
    }

    public final void C7() {
        float d;
        if (this.f44741z0 != null) {
            if (this.kb && this.ya == null) {
                d = org.telegram.messenger.g0.f22562n;
            } else {
                d = this.f44702w.d() + s9(org.telegram.ui.Components.i11.f34509c) + org.telegram.messenger.g0.L(16.0f) + this.Wa + this.Yc;
            }
            int i7 = (int) this.N9;
            org.telegram.ui.Components.m11 m11Var = this.f44490f2;
            if (m11Var != null) {
                m11Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f44729y0;
            boolean z9 = this.f44741z0.V1;
            RecyclerView recyclerView = gVar.f17049a;
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
            jh.e eVar = this.f44437b4;
            if (eVar != null) {
                RectF rectF = eVar.f17028b;
                rectF.set(s9(org.telegram.ui.Components.i11.f34508b), i7 - this.H, 0.0f, d - this.Wa);
                eVar.f17029c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void C8(CharSequence charSequence, ArrayList arrayList) {
        if (this.F5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.ij ijVar = this.F5;
                ijVar.f23312w1 = charSequence;
                ijVar.f23316x1 = arrayList;
            } else if (this.F5.F3()) {
                org.telegram.messenger.ij ijVar2 = this.F5;
                ijVar2.f23312w1 = "";
                ijVar2.f23316x1 = new ArrayList();
            } else {
                sj sjVar = this.Z;
                if (sjVar != null) {
                    this.F5.f23312w1 = sjVar.getFieldText();
                    org.telegram.messenger.ij ijVar3 = this.F5;
                    if (ijVar3.f23312w1 == null && !TextUtils.isEmpty(ijVar3.f23266k.message)) {
                        this.F5.f23312w1 = "";
                    }
                }
            }
        }
    }

    public final void C9(boolean z9) {
        fc(false, null, null, null, null, true, 0, null, false, 0L, null, z9);
    }

    public final void Ca(long j3, final org.telegram.messenger.ij ijVar, int i7, final long j10, final int i10, final int i11, final org.telegram.messenger.ij ijVar2) {
        int i12 = i7;
        final TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.qp.l1(M0);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (org.telegram.messenger.r2.f25216a) {
            org.telegram.messenger.a8.b("getDiscussionMessage chat = " + M0.f26960id + " msg_id = " + i12);
        }
        this.Nc = 0;
        this.Oc = false;
        this.Qc = null;
        this.Rc = null;
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            cjVar.g1();
        }
        if (this.Mc != -1) {
            getConnectionsManager().cancelRequest(this.Mc, false);
        }
        if (this.Lc != -1) {
            getConnectionsManager().cancelRequest(this.Lc, false);
        }
        if (ijVar2 != null) {
            i12 = ijVar2.e1();
        }
        this.Nc = i12;
        this.Oc = false;
        this.Pc = System.currentTimeMillis();
        cj cjVar2 = this.f44741z0;
        if (cjVar2 != null) {
            cjVar2.g1();
        }
        final int i13 = this.Jc + 1;
        this.Jc = i13;
        this.Lc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final cn cnVar = cn.this;
                final int i14 = i13;
                final int i15 = i10;
                final long j11 = j10;
                final int i16 = i11;
                final org.telegram.messenger.ij ijVar3 = ijVar2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = M0;
                final org.telegram.messenger.ij ijVar4 = ijVar;
                org.telegram.messenger.g0.h3(new oe(7, cnVar, new Runnable(i14, i15, j11, tLObject, i16, ijVar3, tL_messages_getDiscussionMessage2, chat, ijVar4) {
                    public final int f47003b;
                    public final int f47004c;
                    public final TLObject d;
                    public final int f47005e;
                    public final org.telegram.messenger.ij f47006f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f47007n;
                    public final org.telegram.messenger.ij f47008r;

                    {
                        this.d = tLObject;
                        this.f47005e = i16;
                        this.f47006f = ijVar3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f47007n = chat;
                        this.f47008r = ijVar4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final cn cnVar2 = cn.this;
                        if (this.f47003b != cnVar2.Jc) {
                            return;
                        }
                        cnVar2.Lc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            cnVar2.Qc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            cnVar2.getMessagesController().Y3(cnVar2.Qc.users, false);
                            cnVar2.getMessagesController().S3(cnVar2.Qc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = cnVar2.Qc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i18 = 0; i18 < cnVar2.Qc.messages.size(); i18++) {
                                TLRPC.Message message = cnVar2.Qc.messages.get(i18);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i19 = this.f47004c;
                        final int i20 = this.f47005e;
                        final org.telegram.messenger.ij ijVar5 = this.f47006f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.f47007n;
                        final org.telegram.messenger.ij ijVar6 = this.f47008r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = cnVar2.getMessagesController().m1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f26981id;
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
                            final int i21 = cnVar2.Kc + 1;
                            cnVar2.Kc = i21;
                            cnVar2.Mc = cnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    org.telegram.messenger.g0.h3(new ah(cn.this, i21, tLObject3, tL_error2, i19, ijVar5, tL_messages_getDiscussionMessage3, chat2, i20, ijVar6, 0));
                                }
                            });
                            return;
                        }
                        cnVar2.Za(cnVar2.Qc, cnVar2.Rc, i19, ijVar5, tL_messages_getDiscussionMessage3, chat2, i20, ijVar6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Lc, this.classGuid);
    }

    public final void Cb(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.C3 = user;
        this.D3 = chat;
        if (this.f44540j0 != null && this.W1 != null) {
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
                    String M0 = org.telegram.messenger.id.M0(2131745766, null);
                    SpannableString spannableString = new SpannableString(a8.p0.D(M0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.B8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                    this.f44540j0.setSearchFieldCaption(spannableString);
                    this.W1.getAdapter().U(null, 0, null, false, true);
                    this.f44540j0.setSearchFieldHint(null);
                    this.f44540j0.n();
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    this.H3 = "";
                    mediaDataController.X1("", this.f44545j6, this.f44440b7, this.classGuid, 0, this.f44643r4, false, this.C3, this.D3, true, this.E3);
                }
            }
        }
    }

    public final boolean Cc(org.telegram.messenger.ij ijVar) {
        if (this.f44492f4 == 0 && ijVar != null && ijVar.b5()) {
            return true;
        }
        return false;
    }

    public final void Cd() {
        boolean z9;
        int i7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        if (this.f44565l0 == null) {
            return;
        }
        int i10 = 0;
        if (fa() && !this.f44625q0 && ((lVar = this.actionBar) == null || !lVar.x())) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f44565l0;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        r0Var.setVisibility(i7);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f44527i0;
        if (r0Var2 != null && (r0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f44527i0.getLayoutParams();
            if (!z9) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            }
            if (layoutParams.width != i10) {
                layoutParams.width = i10;
                this.f44527i0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f44527i0;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            r0Var3.setAlpha(f10);
            this.f44527i0.setClickable(!z9);
        }
        td();
    }

    @Override
    public final org.telegram.ui.Components.st0 D() {
        return this.l1;
    }

    public final void D7() {
        FrameLayout frameLayout = this.f44475e1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.T.getInputBubbleHeight() + this.f44702w.c() + org.telegram.messenger.g0.L(9.0f)) * (-0.5f));
        }
    }

    public final void D8() {
        CharSequence charSequence;
        sj sjVar = this.Z;
        if (sjVar != null) {
            charSequence = sjVar.getFieldText();
        } else {
            charSequence = null;
        }
        C8(charSequence, null);
    }

    public final void D9(boolean z9) {
        if (this.f44567l3.getTag() != null && !this.f44642r3) {
            if (!this.f44719x3 || this.f44667t3) {
                this.f44567l3.setTag(null);
                if (z9) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f44679u3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f44679u3.playTogether(ObjectAnimator.ofFloat(this.f44567l3, View.ALPHA, 0.0f));
                    this.f44679u3.addListener(new gi(this, 5));
                    this.f44679u3.setStartDelay(this.f44603o3);
                    this.f44679u3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f44679u3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f44679u3 = null;
                    }
                    this.f44567l3.setAlpha(0.0f);
                }
                this.f44603o3 = 500;
            }
        }
    }

    public final void Da(boolean z9) {
        String M0;
        if (!V9() && !y9()) {
            int i7 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f44582m6;
                    if (i11 >= sparseArrayArr[i10].size()) {
                        break;
                    }
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i10].valueAt(i11);
                    if (ijVar.D4()) {
                        i7 = 3;
                    } else if (ijVar.T3()) {
                        if (ijVar.Z3()) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                        if (i7 == 2) {
                            break;
                        }
                    } else if (ijVar.z3()) {
                        z10 = true;
                    }
                    i11++;
                }
                if (i7 == 2) {
                    break;
                }
            }
            ch.r rVar = this.f44673ta;
            if (rVar != null && rVar.d()) {
                this.f44673ta.setHiddenByScroll(true);
            }
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putInt("messagesCount", this.f44658s6);
            h.putInt("hasPoll", i7);
            h.putBoolean("hasInvoice", z10);
            h.putBoolean("canSelectTopics", true);
            zw zwVar = new zw(h);
            zwVar.D2 = this;
            presentFragment(zwVar);
            return;
        }
        if (V9()) {
            if (a() > 0) {
                M0 = org.telegram.messenger.id.M0(2131750534, null);
            } else if (org.telegram.messenger.t3.T(this.f44473e) && !this.f44473e.megagroup) {
                M0 = org.telegram.messenger.id.M0(2131750536, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131750535, null);
            }
        } else {
            M0 = org.telegram.messenger.id.M0(2131750537, null);
        }
        if (z9) {
            if (this.f44731y2 == null) {
                int indexOfChild = this.l1.indexOfChild(this.T);
                if (indexOfChild != -1) {
                    this.f44731y2 = E6(310.0f, 1, indexOfChild + 1, false);
                } else {
                    return;
                }
            }
            this.f44731y2.u(M0);
            this.f44731y2.y(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.f44743z2 == null) {
            int indexOfChild2 = this.l1.indexOfChild(this.T);
            if (indexOfChild2 == -1) {
                return;
            }
            this.f44743z2 = E6(310.0f, 3, indexOfChild2 + 1, false);
        }
        this.f44743z2.u(M0);
        this.f44743z2.y(this.f44462d1.getForwardButton(), true);
    }

    public final void Db(View view, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.ii0 ii0Var, View view2, float f10, float f11, ch.o0 o0Var, boolean z9, boolean z10, boolean z11, boolean z12) {
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
            if (o0Var != null && o0Var.f6355a) {
                P7(true);
                if (view == null) {
                    zVar = I8(ijVar.e1(), true);
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
                    TLRPC.Message message2 = ijVar.f23266k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j3 = -bi.x9.b(ijVar).f5045a;
                    TLRPC.ChatFull N0 = getMessagesController().N0(j3);
                    if (N0 != null && !N0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
                        org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(this);
                        if (M0 != null) {
                            str2 = M0.title;
                        }
                        a02.Q(2131624226, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131745032, str2))).k(true);
                        return;
                    }
                    bi.ca caVar = bi.ea.y(this.currentAccount, false).B;
                    if (caVar != null) {
                        caVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i11 = this.currentAccount;
                    long j10 = this.f44545j6;
                    if (N0 != null && !N0.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    bi.ce ceVar = new bi.ce(parentActivity, i11, j10, this, ijVar, arrayList, z14, false, 0L, this.f44750za);
                    ijVar.e1();
                    ceVar.P1 = this;
                    ceVar.Q1 = zVar;
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
                long j11 = -bi.x9.b(ijVar).f5045a;
                TLRPC.ChatFull N02 = getMessagesController().N0(j11);
                if (N02 != null && !N02.paid_reactions_available) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j11));
                    org.telegram.ui.Components.gc a03 = org.telegram.ui.Components.gc.a0(this);
                    if (M02 != null) {
                        str2 = M02.title;
                    }
                    a03.Q(2131624226, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131745032, str2))).k(true);
                    return;
                }
                bi.ca b02 = bi.ea.y(this.currentAccount, false).b0(ijVar, this, 1L, true, true, null);
                if (b02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Vc == null) {
                        this.Vc = new bi.p7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        p7Var = null;
                    } else {
                        if (this.Vc.getParent() != layoutContainer) {
                            org.telegram.messenger.g0.E2(this.Vc);
                            layoutContainer.addView(this.Vc, c8.ha.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Vc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Vc.bringToFront();
                        }
                        p7Var = this.Vc;
                    }
                    p7Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    b02.f3602o = p7Var;
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
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = ijVar.f23266k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new ug.w0((org.telegram.ui.ActionBar.f2) this, 24, true).show();
            } else {
                if (ijVar.w2() && o0Var != null) {
                    for (int i12 = 0; i12 < ijVar.f23266k.reactions.results.size(); i12++) {
                        TLRPC.ReactionCount reactionCount = ijVar.f23266k.reactions.results.get(i12);
                        if (o0Var.f(reactionCount.reaction)) {
                            z13 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z13 = false;
                if (!z13 && (chat = this.f44473e) != null && !org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.w(26, this.f44473e)) {
                    org.telegram.messenger.k5.o(null, 2131745591, org.telegram.ui.Components.gc.a0(this), 2131624006, 36);
                    return;
                }
                ch.k0.b(false);
                int size = ijVar.y0().size();
                boolean H5 = ijVar.H5(o0Var, z10);
                int e12 = ijVar.e1();
                long c12 = ijVar.c1();
                a0.h hVar = this.N6;
                if (hVar.f(c12) != null && (b10 = ((org.telegram.messenger.dj) hVar.f(ijVar.c1())).b(9)) != null) {
                    e12 = b10.e1();
                }
                int i13 = e12;
                if (H5) {
                    org.telegram.ui.Cells.z I8 = I8(i13, true);
                    if (!org.telegram.messenger.iz.f23451w1 && I8 != null && o0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.iz.C(true);
                        long j12 = o0Var.f6360g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(this.currentAccount).f25840r.get(o0Var.f6359f);
                            if (tL_availableReaction != null) {
                                e10 = tL_availableReaction.center_icon;
                            }
                        } else {
                            e10 = org.telegram.ui.Components.h5.e(this.currentAccount, j12);
                        }
                        if (e10 != null) {
                            org.telegram.ui.Components.bc q10 = org.telegram.ui.Components.gc.a0(this).q(e10, org.telegram.messenger.id.M0(2131752218, null));
                            q10.f32203j = 5000;
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
                        ch.k0.d(this, ii0Var, I8, view2, f10, f11, o0Var, i14, i10);
                    }
                }
                if (H5 && o0Var != null && (str = o0Var.f6359f) != null) {
                    org.telegram.messenger.g0.i2(org.telegram.messenger.id.a0(null, null, 2131754725, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(ijVar.y0());
                org.telegram.messenger.gz sendMessagesHelper = getSendMessagesHelper();
                if (H5) {
                    o0Var2 = o0Var;
                } else {
                    o0Var2 = null;
                }
                fi fiVar = new fi(this, z12, z9, i13, H5, ii0Var, f10, f11, o0Var, ijVar);
                this.Hc = fiVar;
                sendMessagesHelper.s0(ijVar, arrayList2, o0Var2, z10, z11, this, fiVar);
                if (z9 || z12) {
                    Xc(ijVar, true);
                    this.Hc.run();
                }
                if (!z12) {
                    org.telegram.messenger.g0.i3(this.Hc, 50L);
                }
            }
        }
    }

    public final void Dc(org.telegram.messenger.ij ijVar, boolean z9) {
        TL_iv.RichMessage richMessage;
        if (ijVar != null && getParentActivity() != null) {
            ch.r rVar = this.f44673ta;
            if (rVar != null && rVar.d()) {
                this.f44673ta.setHiddenByScroll(true);
            }
            if (this.f44540j0 != null) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar.f27691n0) {
                    lVar.n(true);
                    this.Z.e1();
                }
            }
            TLRPC.Message message = ijVar.f23266k;
            if (message != null && (richMessage = message.rich_message) != null) {
                li.b2 b2Var = new li.b2(richMessage);
                b2Var.J = this;
                b2Var.f18466r = ijVar;
                presentFragment(b2Var);
                return;
            }
            this.W1.getAdapter().f16782f0 = false;
            this.Z.setVisibility(0);
            ec(true, null, ijVar, null, null, true, 0, null, false, 0L);
            Oc(false);
            if (!z9) {
                c7();
            }
            if (z9) {
                this.f44708w5 = org.telegram.messenger.nj.b(ijVar.f23266k.suggested_post);
            }
            this.Z.V0(false, false, true);
            fd(0, true);
            Fd(false);
            if (!z9 && !ijVar.f23285p1 && !org.telegram.messenger.ij.b4(ijVar.f23266k) && this.f44492f4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().j1(this.f44545j6);
                tL_messages_getMessageEditData.f27054id = ijVar.e1();
                this.E5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new de(this, 3));
                return;
            }
            sj sjVar = this.Z;
            org.telegram.ui.Components.fe feVar = sjVar.F1;
            if (feVar != null) {
                feVar.setEnabled(true);
                sjVar.F1.f(false);
            }
        }
    }

    public final void Dd() {
        int i7;
        org.telegram.ui.ActionBar.p0 p0Var = this.f44588n0;
        if (p0Var == null) {
            return;
        }
        if (getMessagesController().f24900s7.z(a()) && getMessagesController().f24900s7.t(a())) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        p0Var.e(i7);
    }

    @Override
    public final List E() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.t3.T(this.f44473e)) {
            arrayList.add(new pg.a(org.telegram.messenger.id.M0(2131751612, null)));
            int i7 = this.f44417a;
            if (i7 != 1) {
                if (i7 != 2) {
                    M0 = org.telegram.messenger.id.M0(2131751609, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131751610, null);
                }
            } else {
                M0 = org.telegram.messenger.id.M0(2131751611, null);
            }
            arrayList.add(new pg.a(org.telegram.messenger.id.a0(null, null, 2131751608, M0), new xf(this, 16)));
            arrayList.add(new pg.a(org.telegram.messenger.id.M0(2131751607, null), new xf(this, 17)));
        }
        if (this.f44487f == null) {
            arrayList.add(new pg.a(org.telegram.messenger.id.M0(2131751617, null)));
            arrayList.add(new pg.a(org.telegram.messenger.id.M0(2131751616, null), 0.0f, 255.0f, new q0("", 1)));
            arrayList.add(new pg.a(org.telegram.messenger.id.M0(2131751615, null), 1.0f, 10.0f, new org.telegram.ui.Cells.f2(this)));
        }
        return arrayList;
    }

    public final fi.m3 E6(float f10, int i7, int i10, boolean z9) {
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
        m3Var.f12424e = true;
        m3Var.k(z9);
        m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        m3Var.f12444u0 = org.telegram.messenger.g0.L(4.0f);
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

    public final void E7() {
        int i7;
        float f10 = this.f44513gd.f55498e;
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

    public final void E8(boolean z9) {
        TLRPC.Chat chat = this.f44473e;
        if (chat != null && this.f44620p8 != null && !org.telegram.messenger.t3.r0(chat) && !this.f44473e.creator) {
            TLRPC.ChatFull chatFull = this.f44620p8;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f44638r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f44638r = chatParticipant.inviter_id;
                    return;
                }
                long e10 = getUserConfig().e();
                int size = this.f44620p8.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f44620p8.participants.participants.get(i7);
                    if (chatParticipant2.user_id == e10) {
                        this.f44638r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z9 && this.f44638r == 0) {
                getMessagesController().G(this.f44473e.f26960id, false);
            }
        }
    }

    public final void E9(boolean z9) {
        if (this.f44579m3.getTag() != null && !this.f44656s3) {
            if (!this.f44732y3 || this.f44667t3) {
                this.f44579m3.setTag(null);
                if (z9) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44706w3, 0.0f);
                    this.f44692v3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f44692v3.addUpdateListener(new ce(this, 1));
                    this.f44692v3.addListener(new gi(this, 7));
                    this.f44692v3.setStartDelay(this.f44603o3);
                    this.f44692v3.start();
                } else {
                    ValueAnimator valueAnimator = this.f44692v3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f44692v3 = null;
                    }
                    this.f44706w3 = 0.0f;
                    Sc();
                }
                this.f44603o3 = 500;
            }
        }
    }

    public final void Ea(int i7) {
        boolean z9;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.mj mjVar = this.f44694v5;
        if (mjVar != null && this.f44429ab == null) {
            TLRPC.Peer peer = null;
            if (mjVar.f24036c != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.W5;
                CharSequence fieldText = this.Z.getFieldText();
                org.telegram.messenger.ij ijVar2 = this.D5;
                if (ijVar2 == this.f44568l4) {
                    ijVar = null;
                } else {
                    ijVar = ijVar2;
                }
                mjVar.e(i10, webPage, fieldText, ijVar, this.B5, this.F5);
            }
            if (!this.f44694v5.c()) {
                this.Cb = this.Z.f31179z2;
                Context context = this.l1.getContext();
                dh.c cVar = this.O8;
                org.telegram.messenger.mj mjVar2 = this.f44694v5;
                TLRPC.User user = this.f44487f;
                TLRPC.Chat chat = this.f44473e;
                int i11 = this.currentAccount;
                an anVar = this.f44750za;
                sm smVar = this.B5;
                if (smVar != null && smVar.f49883f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                nk nkVar = new nk(this, context, this, cVar, mjVar2, user, chat, i11, anVar, i7, z9);
                this.f44429ab = nkVar;
                this.f44694v5.f24054x = nkVar;
                TLRPC.ChatFull chatFull = this.f44620p8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ca) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ca.peers.get(0).peer;
                }
                this.f44429ab.setSendAsPeer(peer);
                s7();
                this.l1.addView(this.f44429ab);
                if (this.Cb) {
                    sj sjVar = this.Z;
                    sjVar.T0 = true;
                    org.telegram.ui.Components.lf lfVar = sjVar.U0;
                    if (lfVar != null) {
                        lfVar.u(true);
                    }
                    this.Z.s1();
                    this.R3 = true;
                }
                org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void Eb() {
        h6.m[] mVarArr;
        kh.b bVar;
        kh.a aVar;
        org.telegram.ui.Components.wc[] wcVarArr;
        an anVar = this.f44750za;
        if (anVar != null) {
            anVar.t();
        }
        qi qiVar = this.f44728y;
        if (qiVar != null) {
            qiVar.d();
        }
        qi qiVar2 = this.f44715x;
        if (qiVar2 != null) {
            qiVar2.d();
        }
        qi qiVar3 = this.D;
        if (qiVar3 != null) {
            qiVar3.d();
        }
        sj sjVar = this.Z;
        if (sjVar != null) {
            sjVar.updateColors();
        }
        di.u2 u2Var = this.X1;
        if (u2Var != null) {
            u2Var.P0();
        }
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            int childCount = cjVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f44741z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) childAt).B0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f44483e9;
        if (g1Var != null && g1Var.getContentView() != null) {
            View contentView = this.f44483e9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.de0 de0Var = this.N2;
        if (de0Var != null) {
            de0Var.d();
        }
        tj tjVar = this.f44418a0;
        if (tjVar != null && tjVar.getEditView() != null) {
            for (org.telegram.ui.Components.wc wcVar : this.f44418a0.getEditView().f38984a) {
                if (wcVar != null) {
                    wcVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f44527i0;
        if (r0Var != null) {
            r0Var.V();
        }
        nj njVar = this.f44566l2;
        if (njVar != null) {
            njVar.updateColors();
        }
        wi wiVar = this.f44601o1;
        if (wiVar != null) {
            wiVar.updateColors();
        }
        ql qlVar = this.l1;
        if (qlVar != null) {
            qlVar.M();
            bi.ec ecVar = this.l1.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
        org.telegram.ui.Components.kg kgVar = this.f44419a1;
        if (kgVar != null) {
            fh.g gVar = kgVar.f35316s;
            if (gVar != null) {
                gVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
            kgVar.invalidate();
        }
        org.telegram.ui.Components.ow0 ow0Var = this.f44640r1;
        if (ow0Var != null) {
            ow0Var.updateColors();
        }
        wi wiVar2 = this.f44601o1;
        if (wiVar2 != null && wiVar2.getTimeItem() != null) {
            this.f44601o1.getTimeItem().invalidate();
        }
        jh.f fVar = this.T;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f44717x1;
        if (hVar != null) {
            for (h6.m mVar : hVar.f18389e) {
                if (mVar != null && (aVar = (bVar = (kh.b) mVar.f14266b).f17602b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        wj wjVar = this.f44448c1;
        if (wjVar != null) {
            wjVar.updateColors();
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

    public final void Ec() {
        org.telegram.ui.Components.jz jzVar = this.H9;
        if (jzVar != null && !jzVar.f35113c) {
            jzVar.c(false);
            try {
                this.H9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Ed(org.telegram.messenger.d20 d20Var) {
        int i7;
        int i10;
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            if (!this.P4 && this.Z7 != null) {
                int childCount = cjVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.f44741z0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.ij ijVar = this.Z7;
                        if (messageObject == ijVar) {
                            ArrayList arrayList = this.K6;
                            if (arrayList.indexOf(ijVar) >= 0) {
                                i7 = arrayList.indexOf(this.Z7) + this.C0.J;
                                i10 = g9(childAt);
                            }
                        }
                    }
                    i11++;
                }
            }
            i7 = -1;
            i10 = 0;
            int childCount2 = this.f44741z0.getChildCount();
            sj sjVar = this.Z;
            if (sjVar != null) {
                sjVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.f44741z0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                    org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                    if (((Boolean) d20Var.a(messageObject2)).booleanValue()) {
                        messageObject2.K1 = true;
                        q1Var.w3(messageObject2, q1Var.getCurrentMessagesGroup(), q1Var.H2(), q1Var.I2(), q1Var.z2(), q1Var.D2());
                        ll llVar = this.C0;
                        this.f44741z0.getClass();
                        llVar.Q(RecyclerView.R(q1Var));
                    }
                }
            }
            if (i7 != -1) {
                this.B0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void F(float f10, int i7) {
        if (i7 == 2 && f10 == 0.0f) {
            sh.c cVar = this.f44539id;
            if (cVar != null) {
                this.l1.removeView(cVar);
                this.f44539id = null;
            }
            sj sjVar = this.Z;
            if (sjVar != null) {
                sjVar.H0();
            }
        }
    }

    public final void F6(org.telegram.messenger.ij ijVar, Integer num) {
        org.telegram.messenger.ij ijVar2 = ijVar.C;
        if (ijVar2 != null) {
            int e12 = ijVar2.e1();
            SparseArray sparseArray = this.G6;
            ArrayList arrayList = (ArrayList) sparseArray.get(e12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(e12, arrayList);
            }
            int e13 = ijVar.e1();
            if (!arrayList.contains(Integer.valueOf(e13))) {
                arrayList.add(Integer.valueOf(e13));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void F7() {
        if (this.l1 == null) {
            return;
        }
        this.Yc = Q6(false);
        this.Zc = Q6(true);
        this.T.setInputBubbleHeight(this.Yc);
        dd();
        Nc();
        B7();
        y7();
        D7();
        C7();
    }

    public final void F8(org.telegram.messenger.ij r75, java.util.ArrayList r76, java.util.ArrayList r77, java.util.ArrayList r78) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.F8(org.telegram.messenger.ij, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void F9(boolean z9) {
        if (!z9) {
            fi.m3 m3Var = this.A2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = this.f44678u2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            fi.m3 m3Var3 = this.f44705w2;
            if (m3Var3 != null) {
                m3Var3.f(true);
            }
        }
        fi.m3 m3Var4 = this.f44743z2;
        if (m3Var4 != null) {
            m3Var4.f(true);
        }
        fi.m3 m3Var5 = this.f44731y2;
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

    public final void Fa(String str, boolean z9) {
        boolean z10;
        pj pjVar;
        boolean z11;
        org.telegram.ui.ActionBar.r0 r0Var;
        int i7;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                c8();
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
                    org.telegram.messenger.g0.i3(new he(this, str, 7), 200L);
                    return;
                }
                this.I3 = str;
                this.H3 = str;
                boolean contains = str.contains("@");
                g7(true);
                if (!this.actionBar.f27691n0) {
                    this.f44499fd.a(true, true);
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.f44527i0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f44488f0;
                    if (xVar != null) {
                        xVar.e(8);
                    }
                    fr frVar = this.f44474e0;
                    if (frVar != null) {
                        frVar.b(false);
                    }
                    if ((this.f44643r4 == 0 || (i7 = this.f44492f4) == 3 || i7 == 8) && (r0Var = this.f44540j0) != null) {
                        r0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = this.f44600o0;
                    if (r0Var3 != null && this.fa) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f44612p0;
                    if (xVar2 != null && this.f44510ga) {
                        xVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = this.f44553k0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = this.f44565l0;
                    if (r0Var5 != null) {
                        r0Var5.setVisibility(8);
                    }
                    this.f44625q0 = true;
                    md(0, 0, -1);
                    Oc(false);
                }
                ck ckVar = this.C1;
                if (ckVar != null) {
                    if (ckVar.E > 0.5f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        ckVar.g(false);
                    }
                }
                ImageView imageView = this.f44517h3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z9 && (!org.telegram.messenger.t3.V(this.f44473e) || !org.telegram.messenger.t3.t0(this.f44473e) || this.I3 == null)) {
                    this.F1 = 0;
                } else {
                    this.F1 = 2;
                }
                this.f44532i5 = false;
                if (this.f44451c4 == 3) {
                    org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(this.currentAccount);
                    a10.f24317b.a();
                    a10.f24318c.a();
                }
                fi.g1 g1Var = this.E1;
                if (g1Var != null) {
                    g1Var.h.clear();
                }
                org.telegram.ui.ActionBar.r0 r0Var6 = this.f44540j0;
                if (r0Var6 != null) {
                    this.Ic = true;
                    r0Var6.F(false);
                    this.Ic = false;
                }
                org.telegram.ui.ActionBar.r0 r0Var7 = this.f44540j0;
                if (r0Var7 != null) {
                    r0Var7.setSearchFieldCaption(null);
                    this.f44540j0.P(str, false);
                    this.f44540j0.setSearchFieldHint(org.telegram.messenger.id.M0(2131745763, null));
                }
                getMediaDataController().X1(this.H3, this.f44545j6, this.f44440b7, this.classGuid, 0, this.f44643r4, false, this.C3, this.D3, false, this.E3);
                fd(0, true);
                this.f44641r2.e(true, true);
                rc(true);
                pj pjVar2 = this.D1;
                if (pjVar2 != null) {
                    pjVar2.b(!contains);
                    od();
                }
                if ((contains || z9) && this.I3 != null && (pjVar = this.D1) != null) {
                    int currentPosition = pjVar.f32302a.getCurrentPosition();
                    int i10 = this.F1;
                    if (currentPosition != i10) {
                        this.D1.f32302a.d(i10, i10);
                    }
                }
                org.telegram.messenger.oa.a(this.currentAccount).c(this.I3);
                this.H1.f38147f.O(true);
                View currentView = this.E1.getCurrentView();
                if (currentView instanceof en) {
                    ((en) currentView).f45407a.qd(this.I3);
                }
            }
        }
    }

    public final void Fb(TLRPC.Document document) {
        String V;
        if (document == null || (V = org.telegram.messenger.ij.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f26966id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(V, this.f44545j6, this.D5, this.f44568l4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = X8();
        org.telegram.messenger.gz.C(this.currentAccount).r0(b10);
        L6();
    }

    public final void Fc() {
        long j3;
        ae aeVar = this.f44561k8;
        if (aeVar != null) {
            org.telegram.messenger.g0.r(aeVar);
        }
        ae aeVar2 = new ae(this, 18);
        this.f44561k8 = aeVar2;
        if (this.f44496f8 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        org.telegram.messenger.g0.i3(aeVar2, j3);
    }

    public final void Fd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Fd(boolean):void");
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.G6():void");
    }

    public final void G7() {
        int i7;
        cn cnVar = this.ya;
        if (cnVar != null) {
            cnVar.G7();
        }
        int L = org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m + ((int) r9(org.telegram.messenger.g0.L(7.0f)));
        ck ckVar = this.C1;
        if (ckVar != null) {
            i7 = org.telegram.messenger.g0.L(ckVar.E * 35.0f);
        } else {
            i7 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(U8() * 43.0f) + L + i7;
        int L3 = org.telegram.messenger.g0.L(60.0f) + ((int) this.f44702w.d());
        bi.q1 q1Var = this.Z3;
        if (q1Var != null) {
            q1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.t20 t20Var = this.H1;
        if (t20Var != null) {
            t20Var.f38146e.setPadding(0, L2, 0, L3);
            t20Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        bi.e5 e5Var = this.Y3;
        if (e5Var != null) {
            lh.f fVar = (lh.f) e5Var.f3758b;
            fVar.setFadeZoneTop(L2);
            fVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.lz lzVar = this.f44627q2;
        if (lzVar != null) {
            lzVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.bv0 bv0Var = this.f44641r2;
        if (bv0Var != null) {
            bv0Var.f32365a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.g0.L(32.0f));
        }
    }

    public final int G8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.G8():int");
    }

    public final void G9() {
        ValueAnimator valueAnimator = this.Eb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.t0 t0Var = this.f44590n3;
        if (t0Var != null && t0Var.getTag() != null) {
            this.f44590n3.setTag(null);
            org.telegram.ui.Cells.t0 t0Var2 = this.f44590n3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ue(this, t0Var2, 1));
            ofFloat.addListener(new ah.l(16, this, t0Var2));
            ofFloat.setDuration(150L);
            this.Eb = ofFloat;
            ofFloat.start();
        }
    }

    public final boolean Ga(String str, org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, int i7, int i10) {
        hi.j4 j4Var;
        boolean z9;
        Integer num;
        int parseInt;
        int i11;
        Integer num2;
        TLRPC.TL_forumTopic f10;
        if (this.f44473e == null || str == null || this.f44492f4 != 0) {
            return false;
        }
        if (q1Var != null && (characterStyle != null || i10 != 1)) {
            j4Var = new hi.j4(this, i7, i10, characterStyle, q1Var);
        } else {
            j4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.t3.K(this.f44473e, false) != null) {
                try {
                    if (f44411nd == null) {
                        f44411nd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f44412od = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f44411nd.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z9 = false;
                        try {
                            if (org.telegram.messenger.t3.O(matcher.group(2), this.f44473e)) {
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
                                    if (org.telegram.messenger.t3.c0(this.f44473e) && i11 != b()) {
                                        return false;
                                    }
                                    this.J7 = true;
                                    if (this.f44492f4 == 2) {
                                        this.f44573l9.T0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int V = LaunchActivity.V(parse);
                                    this.O7 = V;
                                    if (V >= 0) {
                                        this.P7 = parseInt;
                                    }
                                    Ab(parseInt, i7, true, 0, false, 0, num, g10, j4Var);
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
                        Matcher matcher2 = f44412od.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.t3.O(matcher2.group(2), this.f44473e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f44711w8 = queryParameter2;
                                        d7(true);
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
                    if (org.telegram.messenger.t3.O(lowerCase, this.f44473e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f44492f4 == 2) {
                            this.f44573l9.T0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Ab(intValue3, i7, true, 0, false, 0, null, null, j4Var);
                        return true;
                    }
                    return z9;
                } catch (Exception e12) {
                    e = e12;
                    z9 = false;
                }
            } else {
                try {
                    if (f44413pd == null) {
                        f44413pd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f44413pd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f44473e.f26960id || parseInt3 == 0) {
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
                        if (org.telegram.messenger.t3.c0(this.f44473e) && (f10 = getMessagesController().f24881q7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f44629q4;
                            if (tL_forumTopic == null || tL_forumTopic.f27012id != f10.f27012id) {
                                return false;
                            }
                            return true;
                        }
                        this.J7 = true;
                        if (this.f44492f4 == 2) {
                            this.f44573l9.T0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Ab(parseInt3, i7, true, 0, false, 0, num2, g11, j4Var);
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
            long j3 = this.f44473e.f26960id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Ca(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.J7 = true;
            if (this.f44492f4 == 2) {
                this.f44573l9.T0(intValue9);
                finishFragment();
                return true;
            }
            Ab(intValue9, i7, true, 0, false, 0, null, null, j4Var);
            return true;
        }
    }

    public final void Gb(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7, long j3) {
        long j10;
        String str;
        lj ljVar = this.W1;
        if (ljVar == null) {
            return;
        }
        TLRPC.User user = ljVar.getAdapter().f16802w0;
        if (user != null) {
            j10 = user.f27109id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f26958id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.W1.getAdapter().f16802w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j11 = this.f44545j6;
        org.telegram.messenger.ij ijVar = this.D5;
        org.telegram.messenger.ij ijVar2 = this.f44568l4;
        sm smVar = this.B5;
        org.telegram.messenger.gz.S(i7, j11, j3, i9(), hashMap, accountInstance, ijVar, ijVar2, X8(), botInlineResult, null, this, smVar, z9);
        this.Z.setFieldText("");
        C9(false);
        getMediaDataController().v0(j10, false);
    }

    public final void Gc() {
        org.telegram.messenger.g0.d0(this.f44741z0, new bi.b9(5, this, P9()));
    }

    public final void H6(org.telegram.messenger.ij ijVar, org.telegram.messenger.ij ijVar2) {
        long D1 = ijVar.D1();
        if (D1 != 0) {
            a0.h hVar = this.M6;
            ArrayList arrayList = (ArrayList) hVar.f(D1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.k5.j(hVar, D1);
            }
            arrayList.add(ijVar);
            if (ijVar2 != null) {
                arrayList.remove(ijVar2);
            }
        }
    }

    public final void H7() {
        int i7;
        float f10 = (1.0f - this.f44486ed.f55498e) * (1.0f - this.f44460cd.f55498e);
        this.f44717x1.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(80.0f));
        this.f44717x1.setAlpha(f10);
        lh.h hVar = this.f44717x1;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        hVar.setVisibility(i7);
    }

    public final boolean H9(boolean z9) {
        pk pkVar;
        pk pkVar2 = this.L2;
        if (pkVar2 == null || pkVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.kg kgVar = this.f44419a1;
        if (kgVar != null && (pkVar = this.L2) != null) {
            kgVar.i(pkVar, false, z9);
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

    public final void Ha(org.telegram.messenger.ij ijVar) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = ijVar.f23266k.peer_id;
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
        bundle.putInt("message_id", ijVar.L1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new cn(bundle));
        }
    }

    public final void Hb(ClipData clipData, boolean z9, int i7) {
        int i10 = 0;
        if (this.F5 != null) {
            while (i10 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    Lb(i7, arrayList, z9);
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
        Lb(i7, arrayList2, z9);
    }

    public final void Hc(boolean z9) {
        if (!getMessagesController().r2(this.f44545j6, b(), null)) {
            if (z9) {
                getNotificationsController().G(this.f44545j6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.w2 C = org.telegram.ui.Components.u4.C(this.f44545j6, b(), this, this.f44750za);
            boolean U9 = U9();
            C.f28688h0 = U9;
            C.f28696n = U9;
            showDialog(C);
            return;
        }
        getNotificationsController().G(this.f44545j6, b(), false);
        if (!z9) {
            org.telegram.ui.Components.gc.z(this, 4, 0, this.f44750za).j();
        }
    }

    public final void I6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.c9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f44473e, this.f44487f, null, this.f44545j6, this.Qa, this.Pa);
    }

    public final void I7() {
        cn cnVar = this.ya;
        if (cnVar != null) {
            cnVar.I7();
        }
        float f10 = 0.0f;
        if (!this.kb) {
            f10 = org.telegram.messenger.g0.L(1.0f) + this.actionBar.getMeasuredHeight() + 0.0f;
        }
        float r92 = r9(org.telegram.messenger.g0.L(7.0f)) + f10;
        if (this.f44490f2 != null) {
            r92 += s9(org.telegram.ui.Components.i11.f34507a);
        }
        if (this.C1 != null) {
            r92 += org.telegram.messenger.g0.L(35.0f) * this.C1.E;
        }
        this.Y.setFadeZoneTop((int) ((U8() * org.telegram.messenger.g0.L(43.0f)) + r92));
    }

    public final org.telegram.ui.Cells.z I8(int i7, boolean z9) {
        org.telegram.messenger.ij messageObject;
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            int childCount = cjVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f44741z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    messageObject = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.e1() == i7) {
                    if (z9) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.N9 - this.P9) - org.telegram.messenger.g0.L(4.0f) || childAt.getY() > this.f44741z0.getMeasuredHeight() - this.Wa) {
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

    public final void I9() {
        jk jkVar = this.f44751zb;
        if (jkVar == null) {
            return;
        }
        this.f44751zb = null;
        jkVar.e();
        if (jkVar.getReactionsWindow() != null && jkVar.getReactionsWindow().f6186a != null) {
            jkVar.getReactionsWindow().f6186a.animate().alpha(0.0f).setDuration(180L).start();
        }
        jkVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new oe(15, this, jkVar)).setDuration(180L).start();
    }

    public final void Ia(org.telegram.messenger.ij ijVar) {
        if (org.telegram.messenger.t10.B(this.f44487f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23266k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f44487f.f27109id) {
                l(messageFwdHeader.saved_from_msg_id, ijVar.e1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = ijVar.f23266k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", ijVar.f23266k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new cn(bundle));
        }
    }

    public final void Ib(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        long j10;
        if (u7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, this.f44545j6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = X8();
                b10.O = j3;
                b10.L = z10;
                b10.Q = 0L;
                b10.R = i9();
                b10.T = this.f44708w5;
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
                org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g((TLRPC.User) obj, this.f44545j6, null, null, null, null, z9, i7, 0);
                g10.K = X8();
                g10.O = j10;
                g10.L = z10;
                g10.Q = 0L;
                g10.R = i9();
                g10.T = this.f44708w5;
                getSendMessagesHelper().r0(g10);
                j10 = 0;
            }
            L6();
        }
    }

    public final void Ic(org.telegram.ui.ActionBar.p0 p0Var, boolean z9) {
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
    public final boolean J() {
        return this.f44737y8;
    }

    public final void J6(org.telegram.messenger.ij ijVar, boolean z9) {
        K6(ijVar, z9, true);
    }

    public final void J7() {
        if (this.f44419a1 != null) {
            this.f44419a1.setPadding(org.telegram.messenger.g0.L(7.0f) + ((int) ((1.0f - U8()) * (1.0f - this.f44486ed.f55498e) * m9())), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final org.telegram.ui.Cells.t0 J8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f44741z0 != null && this.C0 != null) {
            for (int i7 = 0; i7 < this.f44741z0.getChildCount(); i7++) {
                View childAt = this.f44741z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (org.telegram.ui.Wallet.l0.I(t0Var.getMessageObject(), wallettransaction)) {
                        return t0Var;
                    }
                }
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.l0.I((org.telegram.messenger.ij) arrayList.get(i10), wallettransaction)) {
                    this.f44741z0.C0();
                    this.B0.h1(this.C0.J + i10, 0);
                    return null;
                } else {
                    i10++;
                }
            }
        }
        return null;
    }

    public final void J9() {
        UndoView undoView = this.M3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.bc bcVar = this.O3;
        if (bcVar != null) {
            bcVar.c(0L, false);
        }
        ok okVar = this.N3;
        if (okVar != null) {
            okVar.d(0, true);
        }
    }

    public final void Ja(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Cells.q1 q1Var2;
        boolean z9;
        long j3;
        long j10;
        org.telegram.ui.Components.u5 m10;
        Bitmap m11;
        if (q1Var == null) {
            int childCount = this.f44741z0.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f44741z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getMessageObject().T(ijVar)) {
                        break;
                    }
                }
            }
        }
        q1Var2 = q1Var;
        if (org.telegram.messenger.ij.L4(ijVar.f23266k)) {
            Kb(ijVar, true);
        }
        if (org.telegram.messenger.ij.L4(ijVar.f23266k) && !ijVar.D2(true) && org.telegram.messenger.iz.B0 && ijVar.B() && !org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.f23266k)) && !ijVar.f23315x0 && !ijVar.f23311w0) {
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
        PhotoViewer.p1().H2(null, this, this.f44750za);
        org.telegram.messenger.ij ijVar2 = MediaController.B().f21300u0;
        if (q1Var2 != null && ijVar2 != null && org.telegram.messenger.ij.L4(ijVar2.f23266k)) {
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
        if (this.f44492f4 == 1 && (org.telegram.messenger.ij.L4(ijVar.f23266k) || ijVar.D == 1)) {
            PhotoViewer.p1().f41438k4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.K6.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.K6.get(i10);
                if (org.telegram.messenger.ij.L4(ijVar3.f23266k) || ijVar3.D == 1) {
                    arrayList.add(0, ijVar3);
                }
            }
            PhotoViewer.p1().Z1(arrayList, arrayList.indexOf(ijVar), this.f44545j6, 0L, b(), this.f44444bb);
        } else {
            PhotoViewer p12 = PhotoViewer.p1();
            int i11 = ijVar.D;
            long j11 = 0;
            if (i11 != 0) {
                j3 = this.f44545j6;
            } else {
                j3 = 0;
            }
            if (i11 != 0) {
                j10 = this.f44440b7;
            } else {
                j10 = 0;
            }
            if (i11 != 0) {
                j11 = b();
            }
            if (!p12.d2(ijVar, this, j3, j10, j11, this.f44444bb) && z9) {
                getFileLoader().f(ijVar.F0());
            }
        }
        F9(false);
        MediaController.B().f21302v0 = null;
    }

    public final void Jb(int i7, ArrayList arrayList, boolean z9, boolean z10) {
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
                if (!gfVar.f26849b && (str2 = gfVar.h) != null) {
                    obj2.f22516c = str2;
                } else {
                    String str3 = gfVar.I;
                    if (str3 != null) {
                        obj2.f22516c = str3;
                    }
                }
                obj2.f22517e = gfVar.f26850c;
                obj2.f22518f = gfVar.f26853g;
                obj2.f22527p = gfVar.d();
                obj2.f22526o = gfVar.f26849b;
                obj2.f22528q = gfVar.j();
                obj2.f22536z = gfVar.f26858m;
                obj2.A = gfVar.P;
                CharSequence charSequence = gfVar.f26848a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f22520i = gfVar.f26859n;
                obj2.f22521j = gfVar.f26863r;
                obj2.h = gfVar.f26868x;
                obj2.f22522k = gfVar.f26864s;
                obj2.f22529r = gfVar.L;
                obj2.f22534x = gfVar.c();
                arrayList2.add(obj2);
                gfVar.e();
            }
            C8(((org.telegram.messenger.fz) arrayList2.get(0)).d, ((org.telegram.messenger.fz) arrayList2.get(0)).f22520i);
            org.telegram.messenger.gz.X(getAccountInstance(), arrayList2, this.f44545j6, this.D5, this.f44568l4, null, this.B5, z10, true, null, null, z9, i7, 0, ((org.telegram.messenger.fz) arrayList2.get(0)).f22531t, null, X8(), 0L, false, 0L, i9(), this.f44708w5, null, false);
            L6();
            sj sjVar = this.Z;
            if (sjVar != null) {
                sjVar.setFieldText("");
            }
        }
        if (i7 != 0) {
            if (this.f44504g4 == -1) {
                this.f44504g4 = 0;
            }
            this.f44504g4 = arrayList.size() + this.f44504g4;
            ld(true);
        }
    }

    public final void Jc(org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return;
        }
        org.telegram.ui.Components.bc bcVar = this.O3;
        if (bcVar != null) {
            bcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f44669t5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ijVar.e1()));
        int i7 = this.f44452c5;
        getNotificationCenter().k(org.telegram.messenger.qs.f25081t0, Long.valueOf(this.f44545j6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f44452c5 - 1), Boolean.valueOf(this.f44479e5));
        this.O3 = org.telegram.ui.Components.gc.B(this, false, new ai.a1(this, arrayList2, arrayList, i7, 16), new ie(this, ijVar, 7), this.f44750za).j();
    }

    public final void K6(org.telegram.messenger.ij r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.K6(org.telegram.messenger.ij, boolean, boolean):void");
    }

    public final void K7() {
        float f10 = this.R9;
        ck ckVar = this.C1;
        if (ckVar != null) {
            ckVar.setTranslationY(f10);
            f10 += org.telegram.messenger.g0.L(35.0f) * this.C1.E;
        }
        pj pjVar = this.D1;
        if (pjVar != null) {
            pjVar.setTranslationY(f10);
        }
        float U8 = (U8() * org.telegram.messenger.g0.L(43.0f)) + f10;
        org.telegram.ui.Components.m11 m11Var = this.f44490f2;
        org.telegram.ui.Components.i11 i11Var = org.telegram.ui.Components.i11.f34507a;
        if (m11Var != null) {
            m11Var.setSideMenuBackgroundMarginTop((U8() * r9(org.telegram.messenger.g0.L(7.0f))) + U8);
            float s9 = s9(i11Var);
            float a10 = a8.j7.a(this.f44486ed.f55498e);
            float U82 = U8();
            U8 += a8.j7.a(Math.min(c8.j9.a(a8.j7.a(a10), 0.0f, 1.0f), c8.j9.a(a8.j7.a(U82), 0.0f, 1.0f))) * s9;
        }
        org.telegram.ui.Components.kg kgVar = this.f44419a1;
        if (kgVar != null) {
            kgVar.setTranslationY((U8 - org.telegram.messenger.g0.L(5.0f)) - (U8() * s9(i11Var)));
        }
    }

    public final void K8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.K8():void");
    }

    public final void K9() {
        boolean z9;
        md(0, 0, -1);
        getMediaDataController().X1(this.H3, this.f44545j6, this.f44440b7, this.classGuid, 0, this.f44643r4, false, this.C3, this.D3, true, this.E3);
        if (TextUtils.isEmpty(this.H3) && this.E3 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.G3 = z9;
        this.f44625q0 = z9;
        Oc(false);
        pd();
    }

    public final void Ka(boolean z9) {
        org.telegram.ui.ActionBar.r4 r4Var;
        int i7;
        if (getParentActivity() != null && (r4Var = this.parentLayout) != null && r4Var.getLastFragment() == this && !this.T4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f44473e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f26960id);
            } else {
                bundle.putLong("user_id", this.f44487f.f27109id);
            }
            bundle.putInt("chatMode", 2);
            cn cnVar = new cn(bundle);
            cnVar.T4 = new ArrayList(this.T4);
            cnVar.V4 = new HashMap(this.V4);
            int size = this.T4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.T4.get(i10);
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.V4.get(num);
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.E6[0].get(num.intValue());
                if (ijVar == null) {
                    ijVar = ijVar2;
                } else if (ijVar2 != null) {
                    ijVar.f23315x0 = ijVar2.f23315x0;
                    ijVar.f23311w0 = ijVar2.f23311w0;
                }
                if (ijVar != null) {
                    cnVar.V4.put(num, ijVar);
                    cnVar.gd();
                }
            }
            cnVar.f44438b5 = this.f44438b5;
            if (this.f44693v4) {
                i7 = this.T4.size();
            } else {
                i7 = this.f44452c5;
            }
            cnVar.f44452c5 = i7;
            cnVar.f44479e5 = this.f44479e5;
            cnVar.f44633q8 = this.f44633q8;
            cnVar.f44620p8 = this.f44620p8;
            cnVar.f44573l9 = new tk(this, cnVar);
            if (z9) {
                presentFragmentAsPreview(cnVar);
                s7();
                return;
            }
            presentFragment(cnVar, false);
        }
    }

    public final ie Kb(org.telegram.messenger.ij ijVar, boolean z9) {
        int i7;
        boolean z10;
        int i10;
        if (ijVar == null || ijVar.N3() || !ijVar.l4()) {
            return null;
        }
        TLRPC.Message message = ijVar.f23266k;
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
                getMessagesController().p3(this.f44545j6, i10, ijVar.f23266k.random_id);
                return null;
            }
            getMessagesController().q3(this.f44545j6, ijVar.e1(), null, i10, 0L, z10);
            return null;
        }
        return new ie(this, ijVar, 1);
    }

    public final void Kc() {
        boolean X9 = X9();
        SparseArray[] sparseArrayArr = this.f44582m6;
        if (!X9) {
            if (this.actionBar.x() && this.f44613p1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f44613p1.c(org.telegram.messenger.id.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.D0.setText(org.telegram.messenger.id.M0(2131746213, null));
            this.D0.setAlpha(0.5f);
            this.D0.setEnabled(false);
            return;
        }
        this.D0.setText(org.telegram.messenger.id.a0(null, null, 2131746214, org.telegram.messenger.id.G(size, "messages", new Object[0])));
        this.D0.setAlpha(1.0f);
        this.D0.setEnabled(true);
    }

    @Override
    public final long L() {
        return this.f44440b7;
    }

    public final void L6() {
        this.f44708w5 = null;
        if (this.f44643r4 == 0 || this.f44693v4) {
            if (this.f44693v4) {
                this.D5 = this.f44568l4;
            } else {
                this.D5 = null;
            }
            this.B5 = null;
            sj sjVar = this.Z;
            if (sjVar != null) {
                sjVar.l1(null, null, null);
            }
        }
        C9(false);
        if (this.f44492f4 == 0) {
            getMediaDataController().D(this.f44545j6, this.f44643r4, true);
        }
    }

    public final void L7() {
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
                    if (!(ijVar2.f23266k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = ijVar2.C.f23266k.fwd_from) != null && org.telegram.messenger.ij.B1(messageFwdHeader.saved_from_peer) == this.f44545j6 && (i7 = ijVar2.C.f23266k.fwd_from.channel_post) != 0 && (ijVar = (org.telegram.messenger.ij) this.E6[i10].get(i7)) != null && (messageReplies = ijVar.f23266k.replies) != null) {
                        messageReplies.replies++;
                        ijVar.f23259i1 = true;
                        TLRPC.Message message = ijVar2.f23266k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = i10;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (org.telegram.messenger.ij.B1(ijVar.f23266k.replies.recent_repliers.get(i12)) == org.telegram.messenger.ij.B1(peer)) {
                                ijVar.f23266k.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        ijVar.f23266k.replies.recent_repliers.add(i10, peer);
                        if (!ijVar2.N3()) {
                            ijVar.f23266k.replies.max_id = ijVar2.e1();
                        }
                        org.telegram.messenger.yr messagesStorage = getMessagesStorage();
                        long j3 = this.f44473e.f26960id;
                        int e12 = ijVar.e1();
                        TLRPC.MessageReplies messageReplies2 = ijVar.f23266k.replies;
                        messagesStorage.f26723a.c(new org.telegram.messenger.d8(messagesStorage, e12, j3, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (ijVar.z2()) {
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.N6.f(ijVar.c1());
                            if (djVar != null) {
                                ArrayList arrayList4 = djVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(djVar, djVar.f22038a);
                                int size3 = arrayList4.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    ((org.telegram.messenger.ij) arrayList4.get(i13)).f23259i1 = true;
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
                            ll llVar = this.C0;
                            if (!llVar.N) {
                                llVar.k(indexOf2 + llVar.J, djVar2.d.size());
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

    public final boolean L8() {
        boolean z9;
        org.telegram.messenger.dj currentMessagesGroup;
        int childCount = this.f44741z0.getChildCount();
        HashMap hashMap = null;
        int i7 = 0;
        while (true) {
            z9 = true;
            if (i7 >= childCount) {
                break;
            }
            View childAt = this.f44741z0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = ((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f22039b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f22038a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f22038a), currentMessagesGroup);
                    int indexOf = this.K6.indexOf((org.telegram.messenger.ij) jg.g.i(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        ll llVar = this.C0;
                        llVar.k(indexOf + llVar.J, currentMessagesGroup.d.size());
                        this.f44741z0.setItemAnimator(null);
                    }
                }
            }
            i7++;
        }
        if (!org.telegram.messenger.g0.Q1()) {
            return true;
        }
        if (org.telegram.messenger.g0.P1() && org.telegram.messenger.t0.f25570b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            return false;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && !r4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z9 = false;
        }
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(z9));
        return false;
    }

    public final void L9() {
        if (!this.Y9) {
            this.Y9 = true;
            ql qlVar = this.l1;
            if (qlVar != null) {
                qlVar.invalidate();
            }
            cj cjVar = this.f44741z0;
            if (cjVar != null) {
                cjVar.invalidate();
            }
        }
        UndoView undoView = this.M3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(s9(org.telegram.ui.Components.i11.f34509c) + this.T.getInputBubbleHeight() + this.f44702w.d() + org.telegram.messenger.g0.L(16.0f));
        }
        K7();
    }

    public final void La(int i7, boolean z9) {
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f26968id);
            } else {
                TLRPC.Chat chat = this.f44473e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f26960id);
                } else {
                    bundle.putLong("user_id", this.f44487f.f27109id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z9) {
                bundle.putInt("converting_toast_from", i7);
                bundle.putBoolean("converting_toast", true);
            }
            cn cnVar = new cn(bundle);
            if (this.f44693v4) {
                qg.d.a(cnVar, org.telegram.messenger.xr.a(a(), b()));
            }
            cnVar.f44573l9 = new yi(this);
            presentFragment(cnVar, false);
        }
    }

    public final void Lb(int i7, ArrayList arrayList, boolean z9) {
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
            if (!org.telegram.messenger.r2.f25217b) {
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
                        Zb();
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
        D8();
        org.telegram.messenger.gz.V(i7, this.f44545j6, 0L, 0L, 0L, null, null, arrayList2, arrayList3, arrayList4, null, null, null, getAccountInstance(), this.D5, this.f44568l4, this.F5, null, X8(), null, this.B5, null, null, z9, false);
        C9(false);
    }

    public final void Lc() {
        Drawable s02;
        ql qlVar = this.l1;
        if (qlVar != null && this.f44726xa == null) {
            if (this.f44750za.h == null || qlVar.getBackgroundImage() == null) {
                if (this.l1.getBackgroundImage() == null || org.telegram.messenger.g0.Q1()) {
                    if (R9()) {
                        s02 = this.l1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.m6.s0();
                    }
                    ql qlVar2 = this.l1;
                    if (!R9()) {
                        boolean z9 = org.telegram.ui.ActionBar.m6.f27976i0;
                    }
                    qlVar2.U(s02);
                }
            }
        }
    }

    public final void M6(org.telegram.messenger.ij ijVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44750za);
        String M0 = org.telegram.messenger.id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
        if (ijVar.D == 3) {
            u1Var.T = org.telegram.messenger.id.M0(2131748178, null);
        } else {
            u1Var.T = org.telegram.messenger.id.a0("NoHandleAppInstalled", null, 2131748205, ijVar.F0().mime_type);
        }
        showDialog(u1Var);
    }

    public final void M7(boolean z9) {
        boolean z10;
        this.K6.clear();
        this.H6.clear();
        this.I6.clear();
        this.f44722x6.clear();
        this.N6.b();
        this.f44707w4 = false;
        ll llVar = this.C0;
        if (llVar != null) {
            if (llVar.f47629x < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            vc(z10);
        }
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            cjVar.setEmptyView(null);
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
        this.f44544j5 = false;
        this.K7 = 0;
        this.J7 = false;
        this.f44425a7 = 0;
        this.Z7 = null;
        this.T7 = 0;
        this.U7 = false;
        this.Q7 = false;
        ll llVar2 = this.C0;
        if (llVar2 != null && !llVar2.N) {
            llVar2.O(false);
        }
    }

    public final void M8(ArrayList arrayList, boolean z9, boolean z10, boolean z11, int i7, long j3) {
        boolean z12;
        if (!arrayList.isEmpty() && u7()) {
            boolean z13 = false;
            if (i7 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f44492f4 == 1) {
                z13 = true;
            }
            if (z12 == z13) {
                this.J9 = true;
                ll llVar = this.C0;
                if (llVar != null) {
                    llVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f44545j6, z9, z10, z11, i7, 0, this.f44568l4, -1, j3, i9(), this.f44708w5);
            org.telegram.ui.Components.u4.q0(q02, this, this.f44750za);
            if (q02 != 0) {
                org.telegram.messenger.g0.h3(new bf(this, 24));
            }
        }
    }

    public final void M9() {
        boolean z9;
        Rect rect;
        if (this.l1 != null) {
            if (this.f44623pb <= 0 && this.f44636qb <= 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            xi xiVar = this.f44702w;
            float c10 = xiVar.c();
            te.k kVar = xiVar.f54558b;
            int max = (int) Math.max(0.0f, (c10 * kVar.f55524a) - org.telegram.messenger.g0.L(29.0f));
            ql qlVar = this.l1;
            bi.ec ecVar = qlVar.L;
            Rect rect2 = this.f44552jd;
            if (ecVar != null) {
                rect2.set(0, 0, qlVar.getMeasuredWidth(), this.l1.getMeasuredHeight() - max);
                this.l1.L.setClipBounds(rect2);
            }
            if (this.f44741z0 != null) {
                rect2.set(0, 0, this.l1.getMeasuredWidth(), this.l1.getMeasuredHeight() - max);
                rect2.offset(0, -this.f44741z0.getTop());
                cj cjVar = this.f44741z0;
                if (cjVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                cjVar.setClipBounds(rect);
            }
            if (this.Y != null) {
                rect2.set(0, 0, this.l1.getMeasuredWidth(), this.l1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(xiVar.f54565w, xiVar.c() * kVar.f55524a) - org.telegram.messenger.g0.L(29.0f))));
                lh.f fVar = this.Y;
                if (z9) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void Ma(TLRPC.Chat chat) {
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
            org.telegram.messenger.g0.i3(new oe(9, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f27691n0) {
            this.f44499fd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var = this.f44527i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44488f0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = this.f44474e0;
            if (frVar != null) {
                frVar.b(false);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f44540j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f44600o0;
            if (r0Var3 != null && this.fa) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f44612p0;
            if (xVar2 != null && this.f44510ga) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f44553k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.f44565l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f44625q0 = true;
            md(0, 0, -1);
            Oc(false);
            ImageView imageView = this.f44503g3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f44517h3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f44540j0;
        if (r0Var6 != null) {
            this.Ic = true;
            this.f44532i5 = false;
            r0Var6.F(false);
            this.Ic = false;
        }
        Cb(chat, null);
        fd(0, true);
    }

    public final void Mb(org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, int i7, boolean z9) {
        boolean z10;
        org.telegram.messenger.dj t92 = t9(ijVar);
        boolean z11 = false;
        if (t92 != null) {
            ArrayList arrayList = t92.d;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (this.f44582m6[i7].indexOfKey(((org.telegram.messenger.ij) arrayList.get(i10)).e1()) < 0) {
                        break;
                    }
                    i10++;
                } else {
                    t92 = null;
                    break;
                }
            }
        }
        if (t92 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.setDrawSelectionBackground(z10);
        if (t92 == null) {
            z11 = true;
        }
        q1Var.l3(true, z11, z9);
    }

    public final void Mc() {
        TLRPC.User user;
        boolean z9;
        if (this.f44527i0 != null && (user = this.f44487f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f44671t8;
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
                this.f44527i0.S(30);
            } else {
                this.f44527i0.t(30);
            }
            if (z9) {
                this.f44527i0.S(31);
            } else {
                this.f44527i0.t(31);
            }
        }
    }

    @Override
    public final boolean N(zw zwVar) {
        return false;
    }

    public final void N6(boolean z9, boolean z10) {
        long j3;
        TLRPC.DraftMessage R;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        Long l11;
        long j10;
        sm smVar;
        org.telegram.messenger.ij ijVar;
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message2;
        org.telegram.messenger.ij ijVar2;
        sm smVar2;
        String str;
        int Y;
        sm smVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        Long l12;
        long j11;
        org.telegram.ui.Components.uy0 uy0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.q5 q5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        TLRPC.Message message3;
        Pair pair;
        Long l13;
        TLRPC.DraftMessage draftMessage;
        if (this.Z != null) {
            int i7 = this.f44492f4;
            char c10 = '\b';
            if (i7 == 0 || i7 == 8 || (i7 == 3 && getUserConfig().e() == d9())) {
                long j13 = 0;
                if (this.f44492f4 == 8) {
                    if (org.telegram.messenger.t3.p0(this.f44473e)) {
                        if (this.f44643r4 == 0 && org.telegram.messenger.t3.A(this.currentAccount, this.f44473e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.uy0 uy0Var2 = null;
                if (S9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f25842r1.f(this.f44545j6);
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
                    R = draftMessage;
                    l10 = l13;
                } else {
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    long j14 = this.f44545j6;
                    if (this.f44492f4 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f44643r4;
                    }
                    R = mediaDataController.R(j14, j3);
                    l10 = null;
                }
                sj sjVar = this.Z;
                if (R != null) {
                    richMessage = R.rich_message;
                } else {
                    richMessage = null;
                }
                sjVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.pi S = org.telegram.messenger.ui.b0(this.currentAccount).S(this.f44545j6, b());
                if (R != null && (inputReplyTo = R.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.ui mediaDataController2 = getMediaDataController();
                    long j15 = this.f44545j6;
                    if (l10 != null) {
                        j12 = l10.longValue();
                    } else {
                        j12 = this.f44643r4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f25845s1.f(j15);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j12);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z10 || R == null) && this.Z.getFieldText() != null && (this.f44492f4 != 0 || getUserConfig().e() != a() || R == null || this.Dc >= R.date)) {
                    if (z9 && R == null) {
                        this.Z.setFieldText("");
                        this.Z.setEffectId(0L);
                        C9(true);
                    }
                } else if (S != null) {
                    this.Z.setVoiceDraft(S);
                } else if (R != null) {
                    this.Dc = R.date;
                    sj sjVar2 = this.Z;
                    sjVar2.X2 = null;
                    sjVar2.Y2 = !R.no_webpage;
                    if (!R.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(R.message);
                        Collections.sort(R.entities, org.telegram.messenger.ui.d2);
                        int i10 = 0;
                        while (i10 < R.entities.size()) {
                            TLRPC.MessageEntity messageEntity = R.entities.get(i10);
                            boolean z11 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j16 = j13;
                            if (z11 || (messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                l12 = l10;
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
                                int i11 = messageEntity.offset;
                                valueOf.setSpan(e41Var, i11, messageEntity.length + i11, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    l12 = l10;
                                    ?? obj = new Object();
                                    obj.f38777a |= 4;
                                    org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(obj, 0);
                                    int i12 = messageEntity.offset;
                                    org.telegram.messenger.ui.f(vy0Var, i12, messageEntity.length + i12, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f38777a |= 1;
                                        org.telegram.ui.Components.vy0 vy0Var2 = new org.telegram.ui.Components.vy0(obj2, 0);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var2, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f38777a |= 2;
                                        org.telegram.ui.Components.vy0 vy0Var3 = new org.telegram.ui.Components.vy0(obj3, 0);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var3, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f38777a |= 8;
                                        org.telegram.ui.Components.vy0 vy0Var4 = new org.telegram.ui.Components.vy0(obj4, 0);
                                        int i15 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var4, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f38777a |= 16;
                                        org.telegram.ui.Components.vy0 vy0Var5 = new org.telegram.ui.Components.vy0(obj5, 0);
                                        int i16 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var5, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.d41 d41Var = new org.telegram.ui.Components.d41(messageEntity.url, uy0Var2);
                                        int i17 = messageEntity.offset;
                                        valueOf.setSpan(d41Var, i17, messageEntity.length + i17, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f38777a |= 256;
                                        org.telegram.ui.Components.vy0 vy0Var6 = new org.telegram.ui.Components.vy0(obj6, 0);
                                        int i18 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(vy0Var6, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i19 = messageEntity.offset;
                                        org.telegram.ui.Components.ug0.c(valueOf, i19, messageEntity.length + i19, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Z.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, false);
                                            fontMetricsInt = uy0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            q5Var = new org.telegram.ui.Components.q5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            l12 = l10;
                                        } else {
                                            l12 = l10;
                                            q5Var = new org.telegram.ui.Components.q5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i20 = messageEntity.offset;
                                        valueOf.setSpan(q5Var, i20, messageEntity.length + i20, 33);
                                    } else {
                                        l12 = l10;
                                        uy0Var = uy0Var2;
                                    }
                                    uy0Var = uy0Var2;
                                    l12 = l10;
                                }
                                uy0Var = null;
                            }
                            i10++;
                            uy0Var2 = uy0Var;
                            c10 = c11;
                            j13 = j16;
                            l10 = l12;
                        }
                        j10 = j13;
                        smVar = uy0Var2;
                        l11 = l10;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        smVar = null;
                        l11 = l10;
                        str2 = R.message;
                    }
                    this.Z.f1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Z.setSelection(R.message.indexOf(10) + 1);
                        org.telegram.messenger.g0.i3(new ae(this, 5), 700L);
                    }
                    this.Z.setEffectId(R.effect);
                    if (R != null && (suggestedPost = R.suggested_post) != null) {
                        org.telegram.messenger.nj b10 = org.telegram.messenger.nj.b(suggestedPost);
                        this.f44708w5 = b10;
                        jc(b10);
                    }
                    ijVar = this.D5;
                    if (ijVar != null || this.f44568l4 == ijVar) {
                        if (message == null && ((ijVar2 = this.f44568l4) == null || ijVar2.e1() != message.f26981id)) {
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
                                            smVar3 = smVar;
                                        } else {
                                            org.telegram.messenger.ij.B0(ijVar3.f23266k);
                                            ?? obj7 = new Object();
                                            obj7.f49879a = ijVar3;
                                            obj7.f49880b = -1;
                                            obj7.f49881c = -1;
                                            obj7.d = -1;
                                            obj7.f49889m = true;
                                            obj7.e(i23, arrayList);
                                            smVar3 = obj7;
                                        }
                                        this.B5 = smVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i21 & 16) != 0) {
                                            i22 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = ijVar3.f23266k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.ij.Y(i22, str, str3)) < 0) {
                                            smVar2 = smVar;
                                        } else {
                                            org.telegram.messenger.ij.B0(ijVar3.f23266k);
                                            smVar2 = new sm(Y, str3.length() + Y, ijVar3);
                                        }
                                        this.B5 = smVar2;
                                    }
                                }
                            }
                            k7(false);
                            sm smVar4 = this.B5;
                            if (smVar4 != null) {
                                ic(this.D5, smVar4);
                            } else {
                                hc(this.D5);
                            }
                            Oc(false);
                            return;
                        } else if (l11 == null && l11.longValue() != j10 && this.f44473e != null && (f10 = getMessagesController().f24881q7.f(this.f44473e.f26960id, l11.longValue())) != null && (message2 = f10.topicStartMessage) != null) {
                            org.telegram.messenger.ij ijVar4 = new org.telegram.messenger.ij(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.D5 = ijVar4;
                            ijVar4.f23254h1 = f10;
                            hc(ijVar4);
                            Oc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j10 = 0;
                smVar = null;
                l11 = l10;
                if (R != null) {
                    org.telegram.messenger.nj b102 = org.telegram.messenger.nj.b(suggestedPost);
                    this.f44708w5 = b102;
                    jc(b102);
                }
                ijVar = this.D5;
                if (ijVar != null) {
                }
                if (message == null) {
                }
                if (l11 == null) {
                }
            }
        }
    }

    public final void N7(boolean z9, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.P6;
        if (z9) {
            if (org.telegram.messenger.r2.f25216a) {
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
            ll llVar = this.C0;
            if (llVar != null && llVar.F < 0) {
                llVar.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i11 = dialog2.unread_count;
            this.f44747z6 = i11;
            this.B6 = dialog2.unread_mentions_count;
            if (this.A6 != i11) {
                lh.h hVar = this.f44717x1;
                if (hVar != null) {
                    hVar.c(1, i11, this.f44466d6);
                }
                this.A6 = this.f44747z6;
                cd();
            }
            int i12 = this.B6;
            int i13 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i12 != i13) {
                this.B6 = i13;
                if (i13 <= 0) {
                    this.B6 = 0;
                    this.C6 = true;
                    qc(false);
                } else {
                    lh.h hVar2 = this.f44717x1;
                    if (hVar2 != null) {
                        hVar2.c(2, i13, true);
                    }
                    qc(true);
                }
            }
            p7(false);
            return;
        }
        this.K6.clear();
        this.f44722x6.clear();
        this.H6.clear();
        this.I6.clear();
        this.N6.b();
        this.f44707w4 = false;
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
            this.f44582m6[i14].clear();
            this.f44593n6[i14].clear();
            this.f44605o6[i14].clear();
        }
        A9();
        fd(0, true);
        if (this.B8 != null) {
            this.B8 = null;
            sj sjVar = this.Z;
            if (sjVar != null) {
                sjVar.Z0(null, true, false);
            }
        }
        if (this.Q != null) {
            vc(false);
            W7(false);
            this.f44741z0.setEmptyView(this.f44475e1);
        }
        ll llVar2 = this.C0;
        if (llVar2 != null) {
            llVar2.O(false);
        }
        if (this.h == null && (user = this.f44487f) != null && user.bot && this.f44684u8 == null) {
            this.f44684u8 = "";
            Oc(false);
        }
    }

    public final int N8() {
        return this.f44492f4;
    }

    public final void N9() {
        this.Ma = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Na(String str) {
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
        if (!this.actionBar.f27691n0) {
            this.f44499fd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f44527i0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44488f0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = this.f44474e0;
            if (frVar != null) {
                frVar.b(false);
            }
            if ((this.f44643r4 == 0 || (i10 = this.f44492f4) == 3 || i10 == 8) && (r0Var = this.f44540j0) != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f44600o0;
            if (r0Var3 != null && this.fa) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f44612p0;
            if (xVar2 != null && this.f44510ga) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f44553k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.f44565l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f44625q0 = true;
            md(0, 0, -1);
            Oc(false);
        }
        if ((this.f44643r4 == 0 || this.f44693v4 || (i7 = this.f44492f4) == 3 || i7 == 8) && !org.telegram.messenger.t10.z(this.f44487f)) {
            if (str == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44532i5 = z10;
            org.telegram.ui.ActionBar.r0 r0Var6 = this.f44540j0;
            if (r0Var6 != null) {
                r0Var6.F(z10);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var7 = this.f44540j0;
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
        mediaDataController.X1(str2, this.f44545j6, this.f44440b7, this.classGuid, 0, this.f44643r4, false, this.C3, this.D3, !TextUtils.isEmpty(str), this.E3);
        fd(0, true);
    }

    public final void Nb(TLRPC.ChatTheme chatTheme) {
        boolean z9;
        boolean z10;
        if (this.f44750za != null && this.f44726xa == null) {
            ig.b c10 = ig.b.c(chatTheme);
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.currentAccount);
            f10.s(this.f44545j6, ig.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f10.p(chatTheme);
                org.telegram.ui.ActionBar.s3 i7 = f10.i(c10);
                if (i7 == null) {
                    i7 = new org.telegram.ui.ActionBar.s3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i7.k();
                    i7.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.s3 s3Var = i7;
                an anVar = this.f44750za;
                TLRPC.WallPaper wallPaper = anVar.f43730g;
                if (this.f44494f6 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                anVar.r(s3Var, wallPaper, z10, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                fe feVar = new fe(this, 14);
                String str = c10.f15479b;
                if (c10.b()) {
                    feVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.s3 s3Var2 = (org.telegram.ui.ActionBar.s3) f10.f21986e.get(str);
                    if (s3Var2 != null) {
                        s3Var2.k();
                        feVar.onComplete(s3Var2);
                    } else {
                        feVar.onComplete(null);
                    }
                } else {
                    f10.q(new org.telegram.messenger.c4(c10, feVar), false);
                }
            }
            TLRPC.WallPaper d = f10.d(this.f44545j6);
            an anVar2 = this.f44750za;
            org.telegram.ui.ActionBar.s3 s3Var3 = anVar2.f43729f;
            if (this.f44494f6 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            anVar2.r(s3Var3, d, z9, null, false);
        }
    }

    public final void Nc() {
        if (this.f44490f2 == null) {
            return;
        }
        this.f44490f2.setSideMenuBackgroundMarginBottom(((this.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(5.0f)) + this.f44702w.d());
    }

    public final boolean O6() {
        if (!org.telegram.messenger.t3.u0(this.f44473e)) {
            TLRPC.User user = this.f44487f;
            if (!org.telegram.messenger.t10.u(user) || !user.bot_forum_sidebar) {
                if (!org.telegram.messenger.t10.u(this.f44487f) && !org.telegram.messenger.t3.a(this.f44473e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void O7(boolean z9) {
        for (int i7 = 1; i7 >= 0; i7--) {
            this.f44582m6[i7].clear();
            this.f44593n6[i7].clear();
            this.f44605o6[i7].clear();
        }
        A9();
        fd(0, true);
        Fd(z9);
        sd();
    }

    public final r0.k1 O8(r0.k1 k1Var) {
        di.u2 u2Var;
        r0.a1 w0Var;
        if (k1Var != null && (u2Var = this.X1) != null) {
            if ((u2Var.isShowing() && !this.X1.I) || this.X1.f32644r2) {
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
                w0Var.c(8, i0.b.f15121e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void O9() {
        TLRPC.User user;
        boolean z9;
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f44487f) != null && user.contact_require_premium) {
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

    public final void Oa(TLRPC.User user) {
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
            org.telegram.messenger.g0.i3(new hg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f27691n0) {
            this.f44499fd.a(true, true);
            org.telegram.ui.ActionBar.r0 r0Var = this.f44527i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44488f0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = this.f44474e0;
            if (frVar != null) {
                frVar.b(false);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f44540j0;
            if (r0Var2 != null) {
                r0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = this.f44600o0;
            if (r0Var3 != null && this.fa) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f44612p0;
            if (xVar2 != null && this.f44510ga) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f44553k0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var5 = this.f44565l0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(8);
            }
            this.f44625q0 = true;
            md(0, 0, -1);
            Oc(false);
            ImageView imageView = this.f44503g3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f44517h3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f44540j0;
        if (r0Var6 != null) {
            this.Ic = true;
            this.f44532i5 = false;
            r0Var6.F(false);
            this.Ic = false;
        }
        Cb(null, user);
        fd(0, true);
    }

    public final void Ob(View view, boolean z9) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                Ob(viewGroup.getChildAt(i7), z9);
            }
        }
        if (view != this.f44741z0 && view != this.l1) {
            view.setEnabled(z9);
        }
    }

    public final void Oc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Oc(boolean):void");
    }

    public final int P6(int i7) {
        org.telegram.messenger.ij messageObject;
        int i10;
        int height = this.f44741z0.getHeight();
        int i11 = 0;
        long j3 = 0;
        while (true) {
            View T0 = this.f44741z0.T0(i7);
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

    public final void P7(boolean z9) {
        this.f44497f9 = z9;
        org.telegram.ui.ActionBar.g1 g1Var = this.f44483e9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
        if (!z9) {
            ValueAnimator valueAnimator = this.Gc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Gc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Gc = ofFloat;
            ofFloat.addUpdateListener(new ce(this, 0));
            this.Gc.setDuration(150L);
            this.Gc.start();
        }
    }

    public final TLRPC.ChatFull P8() {
        return this.f44620p8;
    }

    public final boolean P9() {
        if (this.f44490f2 != null && this.f44643r4 == 0) {
            return true;
        }
        return false;
    }

    public final void Pa(long j3) {
        int i7 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f44601o1.e(true, false);
            } else if (getMessagesController().p2(j3)) {
                showDialog(new ii.d0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().E(bundle, this, null, null)) {
                    presentFragment(new cn(bundle));
                }
            }
        } else if (j3 != getUserConfig().e()) {
            if (j3 == a()) {
                this.f44601o1.e(true, false);
                return;
            }
            Bundle j10 = a8.p0.j(j3, "user_id");
            if (this.h != null && j3 == this.f44487f.f27109id) {
                j10.putLong("dialog_id", this.f44545j6);
            }
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            TLRPC.User user = this.f44487f;
            if (user != null && user.f27109id == j3) {
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

    public final void Pb(boolean z9) {
        Qb(z9, false, true);
    }

    public final void Pc() {
        Oc(false);
    }

    public final float Q6(boolean z9) {
        float f10;
        float f11;
        float f12;
        sj sjVar = this.Z;
        float f13 = 0.0f;
        if (sjVar != null) {
            if (z9) {
                f10 = sjVar.f31118o5;
            } else {
                f10 = sjVar.f31113n5;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, org.telegram.messenger.g0.L(44.0f));
        float L = org.telegram.messenger.g0.L(44.0f);
        te.a aVar = this.f44460cd;
        m6.n nVar = this.f44526hd;
        if (z9) {
            if (31 - Integer.numberOfLeadingZeros(nVar.f19925a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(nVar.f19925a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f55499f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) nVar.f19926b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f55498e;
            f12 = f14;
        }
        if (!this.kb && !isInPreviewMode()) {
            return org.telegram.messenger.g0.T1(Math.max(org.telegram.messenger.g0.T1(L, max, f12) * f11, org.telegram.messenger.g0.L(44.0f)), -org.telegram.messenger.g0.L(7.0f), f13);
        }
        return org.telegram.messenger.g0.T1(L, max, f12) * f11;
    }

    public final long Q7(org.telegram.messenger.ij ijVar) {
        if (this.f44492f4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.t3.c0(this.f44473e) && !this.f44693v4 && ijVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.f23254h1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f27012id;
            }
            return org.telegram.messenger.ij.b2(this.currentAccount, ijVar.f23266k, org.telegram.messenger.t3.c0(this.f44473e), false);
        }
        return this.f44643r4;
    }

    public final TLRPC.UserFull Q8() {
        return this.f44633q8;
    }

    public final void Qa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r10 = org.telegram.messenger.gz.r(1, str);
            PhotoViewer.p1().H2(null, this, this.f44750za);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str, 0, true, 0, 0);
            gfVar.f26848a = charSequence;
            arrayList.add(gfVar);
            if (PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, false);
            }
            PhotoViewer.p1().e2(arrayList, 0, 0, false, new xk(this, r10, arrayList), this);
            return;
        }
        C8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j3 = this.f44545j6;
        org.telegram.messenger.ij ijVar = this.D5;
        org.telegram.messenger.ij ijVar2 = this.f44568l4;
        sm smVar = this.B5;
        org.telegram.messenger.gz.b0(0, 0, 0, j3, 0L, 0L, i9(), null, str, null, null, accountInstance, ijVar, ijVar2, this.F5, this.f44708w5, X8(), null, null, null, smVar, true, false, false);
        L6();
    }

    public final void Qb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Qb(boolean, boolean, boolean):void");
    }

    public final void Qc() {
        int i7;
        org.telegram.ui.Components.fb fbVar;
        dk dkVar;
        sj sjVar;
        if (this.Y9 && this.f44741z0 != null) {
            float f10 = 0.0f;
            if (this.Ka <= 0 || this.Za != 0.0f) {
                float r92 = r9(org.telegram.messenger.g0.L(7.0f));
                ck ckVar = this.C1;
                if (ckVar != null) {
                    i7 = org.telegram.messenger.g0.L(ckVar.E * 35.0f);
                } else {
                    i7 = 0;
                }
                float U8 = (U8() * org.telegram.messenger.g0.L(43.0f)) + r92 + i7;
                float f11 = this.N9;
                this.O9 = U8;
                this.N9 = s9(org.telegram.ui.Components.i11.f34507a) + org.telegram.messenger.g0.L(4.0f) + this.Q9 + U8;
                if (this.actionBar.getVisibility() == 0 || this.ya != null) {
                    this.N9 += this.actionBar.getMeasuredHeight();
                }
                this.P9 = 0;
                this.N9 = this.N9 + this.Va + this.R9;
                if (this.Za != 0.0f && (sjVar = this.Z) != null && sjVar.getVisibility() == 0) {
                    float f12 = this.N9;
                    float measuredHeight = this.Za * (this.Z.getMeasuredHeight() - org.telegram.messenger.g0.L(44.0f));
                    this.N9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.t0 t0Var = this.f44590n3;
                if (t0Var != null) {
                    t0Var.setTranslationY(((this.f44741z0.getTranslationY() + this.N9) + this.V9) - org.telegram.messenger.g0.L(30.0f));
                    float f13 = this.N9;
                    float f14 = this.V9;
                    this.N9 = f13 + f14;
                    this.P9 = (int) (this.P9 + f14);
                }
                kj kjVar = this.f44567l3;
                if (kjVar != null) {
                    kjVar.setTranslationY((((this.f44741z0.getTranslationY() - f10) + this.N9) + this.T9) - org.telegram.messenger.g0.L(4.0f));
                }
                Sc();
                cj cjVar = this.f44741z0;
                if (cjVar != null && this.B0 != null && this.C0 != null) {
                    int paddingTop = cjVar.getPaddingTop();
                    int paddingBottom = this.f44741z0.getPaddingBottom();
                    C7();
                    if (this.f44741z0.getPaddingTop() != paddingTop || this.f44741z0.getPaddingBottom() != paddingBottom) {
                        N9();
                    }
                    this.f44741z0.setTopGlowOffset((int) ((this.N9 - this.P9) - org.telegram.messenger.g0.L(4.0f)));
                    if (f11 != this.N9) {
                        int childCount = this.f44741z0.getChildCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            }
                            View childAt = this.f44741z0.getChildAt(i10);
                            this.f44741z0.getClass();
                            if (RecyclerView.R(childAt) == this.C0.b() - 1) {
                                float f15 = this.N9;
                                if (childAt.getTop() > f15) {
                                    this.f44741z0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!ea() && !this.P4 && this.Z7 != null && this.f44741z0 != null && ((dkVar = this.d2) == null || dkVar.getVisibility() != 0)) {
                        this.f44741z0.scrollBy(0, (int) (f11 - this.N9));
                    }
                }
                this.Y9 = false;
                org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
                if (bcVar != null && (fbVar = bcVar.f32199e) != null) {
                    fbVar.updatePosition();
                }
                C7();
            }
        }
    }

    public final boolean R6(org.telegram.messenger.ij ijVar) {
        if (!V9()) {
            TLRPC.Message message = ijVar.f23266k;
            if ((message == null || !message.noforwards) && !ijVar.g4() && !ijVar.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ArrayList R8() {
        ll llVar = this.C0;
        if (llVar != null) {
            return llVar.P;
        }
        return null;
    }

    public final boolean R9() {
        if (!org.telegram.messenger.iz.H0 && !this.f44700vb) {
            return false;
        }
        return true;
    }

    public final void Ra() {
        this.f44480e6 = true;
        this.fragmentBeginToShow = true;
        this.f44635qa = null;
        this.l1.invalidate();
        this.l1.setSkipBackgroundDrawing(false);
        this.f44597na = false;
        this.fragmentView.setAlpha(1.0f);
        this.f44601o1.setTranslationY(0.0f);
        this.f44601o1.getAvatarImageView().setScaleX(1.0f);
        this.f44601o1.getAvatarImageView().setScaleY(1.0f);
        this.f44601o1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Rb(int i7, int i10, String str) {
        this.f44441b8 = i7;
        this.f44468d8 = true;
        this.f44482e8 = 0L;
        this.f44496f8 = str;
        this.f44534i8 = i10;
        this.f44455c8 = true;
    }

    public final void Rc(boolean z9) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        org.telegram.messenger.dj djVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.ij ijVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).Y0);
        if (this.f44687ub == null) {
            this.f44687ub = new a0.h();
        }
        a0.h hVar2 = this.f44674tb;
        if (hVar2 == null) {
            this.f44674tb = new a0.h();
        } else {
            hVar2.b();
        }
        this.C0.P.clear();
        this.f44687ub.b();
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
                    if (org.telegram.messenger.ij.B0(ijVar.f23266k) == org.telegram.messenger.ij.B0(ijVar2.f23266k) && ijVar.e1() == ijVar2.e1()) {
                        break;
                    }
                    i10++;
                } else {
                    ijVar = null;
                    break;
                }
            }
            if (ijVar2.f23268k1 == 0) {
                if (ijVar == null) {
                    ijVar2.K(true);
                } else {
                    ijVar2.f23315x0 = ijVar.f23315x0;
                    ijVar2.f23311w0 = ijVar.f23311w0;
                }
            }
            if (ijVar != null) {
                ijVar2.f23272l2 = ijVar.f23272l2;
                if (this.C0.N && ijVar2.f23268k1 != 0) {
                    ijVar.N(ijVar2);
                } else {
                    ijVar2.N(ijVar);
                }
            } else if (ijVar2.f23268k1 == 0) {
                int i11 = f44410md;
                f44410md = i11 + 1;
                ijVar2.f23268k1 = i11;
            }
            ijVar2.U2 = null;
            TLRPC.Message message2 = ijVar2.f23266k;
            if (message2 != null) {
                message2.out = true;
            }
            ijVar2.P3();
            if (ijVar2.z2()) {
                org.telegram.messenger.dj djVar2 = (org.telegram.messenger.dj) hVar.f(ijVar2.d1());
                if (djVar2 == null) {
                    djVar2 = new org.telegram.messenger.dj();
                    djVar2.f22049n = this.f44575lb;
                    long c12 = ijVar2.c1();
                    djVar2.f22038a = c12;
                    hVar.k(djVar2, c12);
                } else if (hVar3 == null || hVar3.h(ijVar2.c1()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(djVar2, ijVar2.c1());
                }
                ArrayList arrayList3 = djVar2.d;
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(djVar2, djVar2.f22038a);
                if (djVar2.d(ijVar2) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList3.size()) {
                            if (((org.telegram.messenger.ij) arrayList3.get(i12)).e1() == ijVar2.e1()) {
                                break;
                            }
                            i12++;
                        } else {
                            arrayList3.add(ijVar2);
                            break;
                        }
                    }
                }
            } else if (ijVar2.d1() != 0) {
                ijVar2.f23266k.grouped_id = 0L;
                ijVar2.f23238e = 0L;
            }
            this.C0.P.add(ijVar2);
            this.f44687ub.k(ijVar2, ijVar2.e1());
            i7++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                org.telegram.messenger.dj djVar3 = (org.telegram.messenger.dj) hVar3.n(i13);
                Collections.sort(djVar3.d, new pe(0));
                djVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.E3 != null && TextUtils.isEmpty(this.H3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i14);
                if (ijVar3 != null && (message = ijVar3.f23266k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= ijVar3.f23266k.reactions.results.size()) {
                            break;
                        } else if (this.E3.f(ijVar3.f23266k.reactions.results.get(i15).reaction)) {
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
            if (!this.f44687ub.d(ijVar4.e1())) {
                ijVar4.U2 = null;
                TLRPC.Message message3 = ijVar4.f23266k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.C0.P.add(ijVar4);
                this.f44687ub.k(ijVar4, ijVar4.e1());
            }
        }
        int i17 = 0;
        while (i17 < this.C0.P.size()) {
            org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) this.C0.P.get(i17);
            if (ijVar5.z2() && (djVar = (org.telegram.messenger.dj) hVar.f(ijVar5.c1())) != null) {
                ArrayList arrayList5 = djVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) arrayList5.get(size2);
                    if (ijVar6 != ijVar5 && !this.f44687ub.d(ijVar6.e1())) {
                        this.C0.P.add(i17, ijVar6);
                        this.f44687ub.k(ijVar6, ijVar6.e1());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.C0.P, new pe(1));
        org.telegram.messenger.ij ijVar7 = null;
        int i18 = 0;
        while (i18 < this.C0.P.size()) {
            org.telegram.messenger.ij ijVar8 = (org.telegram.messenger.ij) this.C0.P.get(i18);
            if (this.f44575lb && ijVar8 != null && i18 == 0) {
                eb(i18, ijVar8);
                i18++;
            }
            if (!this.f44575lb && ijVar7 != null && ijVar8.X != ijVar7.X) {
                eb(i18, ijVar7);
                i18++;
            }
            a0.h hVar5 = this.f44674tb;
            int i19 = ijVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i19);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.k5.j(this.f44674tb, i19);
            }
            arrayList6.add(ijVar8);
            if (this.f44575lb && ijVar7 != null && i19 != ijVar7.X) {
                eb(i18, ijVar8);
                i18++;
            }
            if (!this.f44575lb && i18 >= this.C0.P.size() - 1) {
                eb(this.C0.P.size(), ijVar8);
                i18++;
            }
            i18++;
            ijVar7 = ijVar8;
        }
        this.C0.O = org.telegram.messenger.ui.b0(this.currentAccount).W1();
        if (z9) {
            this.C0.T();
            this.C0.O(true);
            if (this.C0.N ? getMediaDataController().L0 == 0 || !this.C0.P.isEmpty() : !this.W6 || !arrayList.isEmpty() || this.C0.f47629x >= 0) {
                z10 = false;
            }
            vc(z10);
            if (this.f44741z0 != null) {
                W7(false);
                if (this.C0.N ? !(getMediaDataController().L0 == 0 && this.C0.P.isEmpty()) : !(!this.W6 && arrayList.isEmpty() && this.C0.f47629x < 0)) {
                    this.f44475e1.setVisibility(8);
                    this.f44741z0.setEmptyView(null);
                    return;
                }
                this.f44741z0.setEmptyView(this.f44475e1);
                cj cjVar = this.f44741z0;
                cjVar.K0(cjVar.w1());
            }
        }
    }

    public final boolean S6() {
        if (!W9() && !getMessagesController().y2(a())) {
            if ((!getMessagesController().t2(a()) || this.f44693v4) && getMessagesController().N1(a()) <= 0 && this.h == null) {
                wj wjVar = this.f44448c1;
                if (wjVar == null || wjVar.getVisibility() != 0) {
                    if (!ea() || this.f44693v4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.S7():void");
    }

    public final oi.q S8() {
        cn cnVar = this.ya;
        if (cnVar != null) {
            return cnVar.S8();
        }
        return this.glassEngine;
    }

    public final boolean S9() {
        if (!org.telegram.messenger.t3.c0(this.f44473e) || this.f44693v4) {
            if (org.telegram.messenger.t3.p0(this.f44473e) && b() == 0 && !this.f44518h4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Sa(long j3, boolean z9) {
        if (this.f44490f2 != null && org.telegram.messenger.t10.u(this.f44487f)) {
            this.f44490f2.setAllTopicsHidden(true);
        }
        this.f44453c6.put(j3, 1);
        g8();
        UndoView undoView = this.M3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f44545j6, 0, new pg(this, j3, z9), new bg.j0(this, j3, 3));
        this.C0.O(false);
    }

    public final void Sb(long j3) {
        this.f44643r4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26981id = (int) j3;
        new org.telegram.messenger.ij(this.currentAccount, tL_message, false, false);
    }

    public final void Sc() {
        int i7;
        ij ijVar = this.f44579m3;
        if (ijVar == null) {
            return;
        }
        ijVar.setTranslationX(m9() / 2.0f);
        this.f44579m3.setTranslationY((((this.f44741z0.getTranslationY() + this.N9) + this.U9) - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(28.0f));
        float i10 = Utilities.i(org.telegram.messenger.g0.z1(this.U9, -this.f44579m3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f44579m3.setAlpha(this.f44706w3 * i10);
        ij ijVar2 = this.f44579m3;
        if (this.f44706w3 * i10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        ijVar2.setVisibility(i7);
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i10);
        this.f44579m3.setScaleX(T1);
        this.f44579m3.setScaleY(T1);
    }

    public final boolean T6() {
        if (this.h == null) {
            wj wjVar = this.f44448c1;
            if (wjVar == null || wjVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T7() {
        if (this.f44476e2 == null && getParentActivity() != null) {
            e8();
            if (this.f44419a1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f44476e2 = textView;
                textView.setGravity(17);
                this.f44476e2.setTextSize(1, 14.0f);
                this.f44476e2.setTypeface(org.telegram.messenger.g0.o());
                TextView textView2 = this.f44476e2;
                int i7 = org.telegram.ui.ActionBar.m6.Ci;
                org.telegram.ui.ActionBar.t6.U(textView2, i7, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232477, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131745516, null));
                this.f44476e2.setText(spannableStringBuilder);
                TextView textView3 = this.f44476e2;
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
                int L = org.telegram.messenger.g0.L(3.0f);
                org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(15.0f), r12, L, L, L, L), null, org.telegram.ui.ActionBar.t6.K(0.1f, i7), getResourceProvider());
                this.f44476e2.setOnClickListener(new le(this, 20));
                c8.ka.b(this.f44476e2, 0.04f, 1.5f);
                this.f44419a1.addView(this.f44476e2, c8.ha.r(-1, 36, 83));
                this.f44419a1.h(12, this.f44476e2);
                this.f44419a1.g(this.f44476e2);
            }
        }
    }

    public final org.telegram.messenger.dj T8(long j3) {
        return (org.telegram.messenger.dj) this.N6.f(j3);
    }

    public final boolean T9() {
        return org.telegram.messenger.t10.u(this.f44487f);
    }

    public final boolean Ta() {
        if (this.T4.size() != 1 || this.f44580m4 == null || ((Integer) this.T4.get(0)).intValue() != this.f44580m4.e1()) {
            return false;
        }
        return true;
    }

    public final void Tb(View view) {
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

    public final void Tc() {
        boolean z9;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f44633q8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f44633q8.send_paid_messages_stars <= 0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f44489f1 != null) {
            if (z9 && this.f44515h1 == null) {
                di diVar = new di(getParentActivity(), getResourceProvider(), this);
                this.f44515h1 = diVar;
                c8.ka.b(diVar, 0.02f, 1.2f);
                this.f44515h1.setOnClickListener(new le(this, 12));
            }
            di diVar2 = this.f44515h1;
            if (diVar2 != null) {
                if (!z9) {
                    diVar2.setVisibility(8);
                    return;
                }
                diVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f44633q8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f44633q8.business_intro.title)) {
                    i7 = 2131749501;
                } else {
                    i7 = 2131749502;
                }
                String a02 = org.telegram.messenger.id.a0(null, null, i7, org.telegram.messenger.t10.j(this.f44487f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        zw0 zw0Var = new zw0(a02.substring(indexOf, indexOf2));
                        if (zw0Var.f52689c != -1) {
                            zw0Var.f52689c = -1;
                            zw0Var.invalidateSelf();
                        }
                        zw0Var.a(503316480);
                        zw0Var.setBounds(0, 0, zw0Var.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(zw0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f44515h1.setCustomText(spannableStringBuilder);
                this.f44515h1.setOverrideTextMaxWidth(fi.m3.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f44515h1.getParent() != null && (!z9 || this.f44515h1.getParent() != this.f44489f1)) {
                    ((ViewGroup) this.f44515h1.getParent()).removeView(this.f44515h1);
                }
                if (z9) {
                    ViewParent parent = this.f44515h1.getParent();
                    LinearLayout linearLayout = this.f44489f1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f44515h1, c8.ha.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final boolean U6(org.telegram.messenger.ij ijVar) {
        if (this.f44492f4 != 8) {
            if (ijVar != null && org.telegram.messenger.t3.c0(this.f44473e)) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f24881q7.f(this.f44473e.f26960id, org.telegram.messenger.ij.b2(this.currentAccount, ijVar.f23266k, true, false));
                if (this.f44492f4 == 8 || (f10 != null && (!f10.closed || org.telegram.messenger.t3.i(this.currentAccount, this.f44473e, f10)))) {
                    return true;
                }
                return false;
            } else if (ijVar == null || !org.telegram.messenger.t3.p0(this.f44473e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f44473e, 24) || org.telegram.messenger.ij.u1(ijVar.f23266k) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void U7() {
        if (getParentActivity() != null && getParentActivity() != null && this.X1 == null) {
            di.u2 u2Var = new di.u2(this, getParentActivity(), this, this.f44750za, 2);
            this.X1 = u2Var;
            u2Var.T1 = a();
            di.u2 u2Var2 = this.X1;
            u2Var2.f32597c2 = true;
            u2Var2.W3 = new uk(this);
        }
    }

    public final float U8() {
        cn cnVar = this.ya;
        if (cnVar == null) {
            cnVar = this;
        }
        pj pjVar = cnVar.D1;
        if (pjVar == null) {
            return 0.0f;
        }
        return pjVar.f32303b;
    }

    public boolean U9() {
        if (this.l1.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ua() {
        org.telegram.ui.Cells.q1 q1Var;
        this.f44460cd.a(false, true);
        sh.c cVar = this.f44539id;
        if (cVar != null && (q1Var = cVar.f55299n) != null && q1Var.getDelegate() != null) {
            cVar.f55299n.getDelegate().s1(cVar.f55299n, false);
        }
        sj sjVar = this.Z;
        if (sjVar != null) {
            sjVar.V0(true, true, false);
            this.Z.X4 = null;
        }
    }

    public final void Ub(ArrayList arrayList, TLRPC.Chat chat, int i7, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z9;
        boolean z10;
        this.f44629q4 = tL_forumTopic;
        this.o4 = arrayList;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
        this.f44568l4 = ijVar;
        this.D5 = ijVar;
        this.f44733y4 = i10;
        this.f44745z4 = i11;
        this.A4 = Math.max(1, i10);
        this.f44643r4 = this.f44568l4.e1();
        this.f44657s4 = i7;
        this.f44668t4 = chat;
        if (tL_forumTopic != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f44693v4 = z9;
        org.telegram.messenger.ij ijVar2 = this.D5;
        TLRPC.MessageFwdHeader messageFwdHeader = ijVar2.f23266k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44680u4 = z10;
        if (z9) {
            ijVar2.f23283p = true;
        }
        gd();
        yd(false);
        Oc(false);
    }

    public final void Uc() {
        final long j3;
        int i7;
        boolean z9;
        int i10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a02;
        if (this.f44501g1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.t3.p0(this.f44473e)) {
            if (this.f44473e != null) {
                chat = getMessagesController().v1(this.f44473e.f26960id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f44473e) != null && !org.telegram.messenger.t3.A(this.currentAccount, chat2, 24)) {
                final long j10 = this.f44473e.send_paid_messages_stars;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 > 0) {
                    a02 = org.telegram.messenger.id.a0(null, null, 2131744349, org.telegram.messenger.m5.t(-chat.f26960id), org.telegram.messenger.id.E(j10, ','));
                } else {
                    a02 = org.telegram.messenger.id.a0(null, null, 2131744332, org.telegram.messenger.m5.t(-chat.f26960id));
                }
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(bi.dd.U0(a02, 1.0f, null));
                if (i11 > 0) {
                    str = org.telegram.messenger.id.M0(2131748472, null);
                }
                this.f44501g1.c(true, true, V2, str, new View.OnClickListener(this) {
                    public final cn f48518b;

                    {
                        this.f48518b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                cn.d0(j10, this.f48518b);
                                return;
                            default:
                                cn.y0(j10, this.f48518b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f44501g1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f44633q8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.on onVar = this.f44501g1;
                boolean z10 = !getUserConfig().q();
                if (getMessagesController().D3()) {
                    i10 = 2131748581;
                } else {
                    i10 = 2131748582;
                }
                onVar.c(z10, false, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i10, org.telegram.messenger.m5.t(this.f44545j6))), org.telegram.messenger.id.M0(2131748538, null), new bi.l1(8));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.on onVar2 = this.f44501g1;
                if (i7 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                onVar2.c(z9, false, org.telegram.messenger.g0.V2(bi.dd.U0(org.telegram.messenger.id.a0(null, null, 2131748580, org.telegram.messenger.m5.t(this.f44545j6), org.telegram.messenger.id.E(this.f44633q8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.id.M0(2131748472, null), new View.OnClickListener(this) {
                    public final cn f48518b;

                    {
                        this.f48518b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                cn.d0(j3, this.f48518b);
                                return;
                            default:
                                cn.y0(j3, this.f48518b);
                                return;
                        }
                    }
                });
            } else {
                this.f44501g1.c(false, false, null, null, null);
            }
        } else {
            this.f44501g1.c(false, false, null, null, null);
        }
    }

    public final void V6(boolean z9) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f44473e != null && (this.f44492f4 != 0 || this.f44643r4 != 0 || (chatFull = this.f44620p8) == null || chatFull.ttl_period == 0)) || ((user = this.f44487f) != null && (org.telegram.messenger.t10.x(user) || (this.h == null && ((userFull = this.f44633q8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.p0 p0Var = this.f44461d0;
            if (p0Var != null) {
                p0Var.e(8);
            }
            wi wiVar = this.f44601o1;
            if (wiVar != null) {
                wiVar.f34990a.a(false, z9);
            }
        } else {
            org.telegram.ui.ActionBar.p0 p0Var2 = this.f44461d0;
            if (p0Var2 != null) {
                p0Var2.e(0);
            }
            wi wiVar2 = this.f44601o1;
            if (wiVar2 != null) {
                wiVar2.f34990a.a(true, z9);
            }
        }
        org.telegram.ui.ActionBar.p0 p0Var3 = this.f44676u0;
        if (p0Var3 != null) {
            TLRPC.Chat chat = this.f44473e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p0Var3.e(i10);
        }
        wi wiVar3 = this.f44601o1;
        if (wiVar3 != null) {
            TLRPC.Chat chat2 = this.f44473e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f44487f) != null && user2.linked_community_id != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            wiVar3.setCommunityItemVisible(z10);
            final wi wiVar4 = this.f44601o1;
            TLRPC.Chat chat3 = this.f44473e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ImageView imageView = wiVar4.E;
            ImageView imageView2 = wiVar4.D;
            if (imageView2 != null && imageView != null) {
                wiVar4.m0 = z11;
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
                                    jn jnVar = wiVar4;
                                    if (!z13) {
                                        jnVar.D.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z14 = z11;
                                    jn jnVar2 = wiVar4;
                                    if (!z14) {
                                        jnVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar2.getClass();
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
                                    jn jnVar = wiVar4;
                                    if (!z13) {
                                        jnVar.D.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z14 = z11;
                                    jn jnVar2 = wiVar4;
                                    if (!z14) {
                                        jnVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f44601o1.g(encryptedChat2.ttl, z9);
            } else {
                TLRPC.UserFull userFull2 = this.f44633q8;
                if (userFull2 != null) {
                    this.f44601o1.g(userFull2.ttl_period, z9);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f44620p8;
                    if (chatFull3 != null) {
                        this.f44601o1.g(chatFull3.ttl_period, z9);
                    }
                }
            }
        }
        if (this.f44664t0 != null && (chatFull2 = this.f44620p8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.t3.T(this.f44473e)) {
                TLRPC.Chat chat4 = this.f44473e;
                if (!chat4.megagroup || org.telegram.messenger.t3.t0(chat4)) {
                    z12 = false;
                }
            }
            org.telegram.ui.ActionBar.p0 p0Var4 = this.f44664t0;
            if (z12) {
                i11 = 0;
            }
            p0Var4.e(i11);
        }
        s();
    }

    public final void V7(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, boolean z9) {
        xf xfVar;
        if (ijVar == null) {
            SparseArray[] sparseArrayArr = this.f44582m6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f44487f;
        TLRPC.Chat chat = this.f44473e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f44620p8;
        long j3 = this.f44440b7;
        int b10 = (int) b();
        int i7 = this.f44492f4;
        bf bfVar = new bf(this, 29);
        if (z9) {
            xfVar = new xf(this, 0);
        } else {
            xfVar = null;
        }
        xf xfVar2 = xfVar;
        org.telegram.ui.Components.u4.y(this, user, chat, encryptedChat, chatFull, j3, ijVar, this.f44582m6, djVar, b10, i7, null, bfVar, xfVar2, this.f44750za);
    }

    public final int V8(org.telegram.messenger.ij ijVar, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.G9 == null) {
            this.G9 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount, true, this.Xa, this.f44750za);
        }
        org.telegram.ui.Cells.q1 q1Var = this.G9;
        if (this.f44473e == null && !org.telegram.messenger.t10.B(this.f44487f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        q1Var.f29843e6 = z10;
        org.telegram.ui.Cells.q1 q1Var2 = this.G9;
        int i7 = this.f44492f4;
        if (i7 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var2.f29869g6 = z11;
        if (i7 == 3 && this.kb) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var2.f29883h6 = z12;
        TLRPC.User user = this.f44487f;
        if (user != null && user.bot) {
            z13 = true;
        } else {
            z13 = false;
        }
        q1Var2.f29896i6 = z13;
        if (org.telegram.messenger.t3.T(this.f44473e) && this.f44473e.megagroup) {
            z14 = true;
        }
        q1Var2.f29907j6 = z14;
        this.G9.V6 = P9();
        this.G9.W6 = aa();
        this.G9.X6 = Z9();
        return this.G9.q0(ijVar, (org.telegram.messenger.dj) this.N6.f(ijVar.c1()), z9);
    }

    public final boolean V9() {
        if (this.f44473e != null) {
            return getMessagesController().o2(this.f44473e);
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f44633q8;
        messagesController.getClass();
        return org.telegram.messenger.qp.K2(userFull);
    }

    public final void Va(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar;
        if (this.f44460cd.f55499f && (cVar = this.f44539id) != null && cVar.f55299n == q1Var) {
            Editable text = cVar.f55294a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.j0) getMessagesController().f24946x7.I.f13557b).f23464c) {
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(this.currentAccount);
                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                sh.d attachedMedia = this.f44539id.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(messageObject);
                    if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.ij.B0(messageObject.f23266k);
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
                            arrayList.add(((th.d) attachedMedia).f56063c);
                            org.telegram.messenger.gz.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof th.h) {
                            th.h hVar = (th.h) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f56074b, null, null, null, false, false, hVar.f56075c);
                        } else if (attachedMedia instanceof th.f) {
                            tL_inputPollAnswer.input_media = cg.d.h(((th.f) attachedMedia).f56071b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof th.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((th.e) attachedMedia).f56064b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Ua();
                return;
            }
            org.telegram.messenger.g0.F3(this.f44539id.f55294a);
        }
    }

    public final void Vb(ql qlVar) {
        if (this.f44527i0 != null && !this.inPreviewMode && !this.kb && this.ya == null && (this.fragmentView instanceof FrameLayout)) {
            ri.f fVar = this.J;
            if (fVar != null) {
                ri.f fVar2 = this.I;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                ri.d dVar = new ri.d(fVar2, fVar);
                dh.c cVar = new dh.c(dVar, dVar, dVar);
                cVar.f8713k = true;
                cVar.f8712j = S8();
                cVar.h = this.f44554k1;
                cVar.f8711i = qlVar;
                cVar.f8710g = this.E;
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                lVar.W0 = cVar;
                lVar.X0 = dVar;
            }
            this.actionBar.setMenuRise(org.telegram.messenger.g0.L(8.0f));
            this.f44527i0.setSubMenuOverlayProvider(new qe(0, this));
        }
    }

    public final void Vc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Vc(boolean):void");
    }

    public final void W6() {
        if (this.kb) {
            return;
        }
        if (X9()) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final void W7(boolean z9) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        Paint paint;
        int i7;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f44475e1 == null || z9) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f44475e1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f44475e1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.l1.addView(this.f44475e1, 3, c8.ha.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f44475e1.setTranslationX(m9() / 2.0f);
            int i10 = 1;
            String str = null;
            if (this.C0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f44614p2 = textView;
                textView.setText(org.telegram.messenger.id.M0(2131748210, null));
                this.f44614p2.setTextSize(1, 14.0f);
                this.f44614p2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(this.f44614p2, org.telegram.ui.ActionBar.m6.Wc, getResourceProvider());
                this.f44614p2.setBackground(new org.telegram.ui.ActionBar.y5(this.f44614p2, this.l1, org.telegram.messenger.g0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f44614p2.setTypeface(org.telegram.messenger.g0.o());
                this.f44614p2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(3.0f));
                this.f44475e1.addView(this.f44614p2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (W9()) {
                kg.u1 u1Var = new kg.u1(getParentActivity(), this.f44492f4, this.f44643r4, this.f44478e4, getResourceProvider());
                this.f44528i1 = u1Var;
                int L = org.telegram.messenger.g0.L(24.0f);
                kg.u1 u1Var2 = this.f44528i1;
                ql qlVar = this.l1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.m6.f27826a;
                u1Var.setBackground(new org.telegram.ui.ActionBar.y5(u1Var2, qlVar, L, themedPaint));
                this.f44475e1.addView(this.f44528i1, c8.ha.e(-2, -2, 17));
                this.f44554k1.d(this.f44528i1, this.l1, new org.telegram.messenger.ch(21), false);
            } else if (this.f44492f4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f44464d4;
                org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.m6.Wc;
                org.telegram.ui.ActionBar.m6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.m6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, c8.ha.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131752702, null)));
                linearLayout.addView(textView2, c8.ha.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                kg.y[] yVarArr = kg.y.f17586e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.m6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                textView3.setOnClickListener(new bi.r(19, tL_businessChatLink, this));
                linearLayout.addView(textView3, c8.ha.t(-2, -2, 49, 17, 0, 17, 17));
                this.f44541j1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.y5(this.f44541j1, this.l1, org.telegram.messenger.g0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f44475e1.addView(this.f44541j1, c8.ha.e(-2, -2, 17));
            } else if ((this.W9 != null && this.f44487f != null && !this.f44587n) || (this.f44633q8 != null && a() != getUserConfig().e() && ((this.f44633q8.contact_require_premium && !getUserConfig().q()) || this.f44633q8.send_paid_messages_stars > bi.ea.y(this.currentAccount, false).p().amount))) {
                this.f44501g1 = new bi(this, getParentActivity(), this.currentAccount, this.W9, this.f44750za);
                Uc();
                this.f44501g1.setListener(new fe(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f44489f1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f44489f1.setGravity(17);
                this.f44489f1.addView(this.f44501g1, c8.ha.e(-2, -2, 17));
                this.f44475e1.addView(this.f44489f1, c8.ha.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f44633q8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f44501g1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f44501g1.setSticker(this.f44633q8.business_intro.sticker);
                }
                Tc();
            } else if (this.h == null) {
                if (this.f44693v4 && this.f44492f4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    ql qlVar2 = this.l1;
                    an anVar = this.f44750za;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.g0.L(18.0f);
                    if (anVar != null) {
                        paint = anVar.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.m6.f27826a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.y5(linearLayout3, qlVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity2);
                    if (org.telegram.ui.ActionBar.m6.i1(anVar)) {
                        i7 = org.telegram.ui.ActionBar.m6.Ja;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.Wc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.camera.q.m(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.t6.U(textView4, i7, anVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
                    textView4.setText(org.telegram.messenger.id.M0(2131754272, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.t6.U(textView5, i7, anVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
                    textView5.setText(org.telegram.messenger.id.M0(2131744019, null));
                    linearLayout3.addView(k9Var, c8.ha.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, c8.ha.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, c8.ha.r(-2, -2, 1));
                    TLRPC.Document T = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).T("🥳");
                    if (T != null) {
                        org.telegram.messenger.rz d = org.telegram.messenger.t5.d(T.thumbs, org.telegram.ui.ActionBar.m6.f27873c7, 0.2f, false);
                        if (d != null) {
                            d.f25386e = 512;
                            d.f25387f = 512;
                        }
                        k9Var.k(org.telegram.messenger.hc.b(T), null, "tgs", d, null);
                    }
                    this.f44475e1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!ea() && this.f44492f4 == 0 && (((user2 = this.f44487f) != null && user2.self) || ((chat = this.f44473e) != null && chat.creator && !org.telegram.messenger.t3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    ql qlVar3 = this.l1;
                    if (this.f44473e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(parentActivity3, qlVar3, i10, this.f44750za);
                    this.f44577m1 = knVar;
                    this.f44475e1.addView(knVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f44473e != null) {
                        this.f44577m1.setStatusText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749438, null)));
                    }
                } else {
                    if (ea() && this.f44492f4 == 0) {
                        str = this.f44680u4 ? org.telegram.messenger.id.M0(2131748226, null) : org.telegram.messenger.id.M0(2131748168, null);
                    } else if (this.f44492f4 == 1) {
                        str = org.telegram.messenger.id.M0(2131748161, null);
                    } else {
                        TLRPC.User user3 = this.f44487f;
                        if (user3 != null) {
                            long j3 = user3.f27109id;
                            if (j3 != 777000 && j3 != 429000 && j3 != 4244000 && org.telegram.messenger.qp.F2(user3)) {
                                str = org.telegram.messenger.id.M0(2131749532, null);
                            }
                        }
                        if (this.f44492f4 != 8 && ((user = this.f44487f) == null || user.self || user.deleted || this.f44587n)) {
                            str = org.telegram.messenger.id.M0(2131748193, null);
                        }
                    }
                    if (str == null) {
                        this.f44501g1 = new ci(this, getParentActivity(), this.currentAccount, this.W9, this.f44750za);
                        Uc();
                        this.f44501g1.setListener(new fe(this, 5));
                        TLRPC.UserFull userFull2 = this.f44633q8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f44501g1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f44501g1.setSticker(this.f44633q8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f44489f1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f44489f1.setGravity(17);
                        this.f44489f1.addView(this.f44501g1, c8.ha.e(-2, -2, 17));
                        this.f44475e1.addView(this.f44489f1, c8.ha.e(-1, -2, 17));
                        Tc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f44614p2 = textView6;
                    textView6.setText(str);
                    this.f44614p2.setTextSize(1, 14.0f);
                    this.f44614p2.setGravity(17);
                    org.telegram.ui.ActionBar.t6.U(this.f44614p2, org.telegram.ui.ActionBar.m6.Wc, getResourceProvider());
                    this.f44614p2.setBackground(new org.telegram.ui.ActionBar.y5(this.f44614p2, this.l1, org.telegram.messenger.g0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f44614p2.setTypeface(org.telegram.messenger.g0.o());
                    this.f44614p2.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(3.0f));
                    this.f44475e1.addView(this.f44614p2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f44577m1 = new org.telegram.ui.Components.kn(getParentActivity(), this.l1, 0, this.f44750za);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.f44577m1.setStatusText(org.telegram.messenger.id.a0(null, null, 2131751133, org.telegram.messenger.t10.j(this.f44487f, true)));
                } else {
                    this.f44577m1.setStatusText(org.telegram.messenger.id.a0(null, null, 2131751134, org.telegram.messenger.t10.j(this.f44487f, true)));
                }
                this.f44475e1.addView(this.f44577m1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final boolean W9() {
        int i7 = this.f44492f4;
        if (i7 != 5 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final void Wa(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f10, float f11) {
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
        Db(zVar, ijVar, null, null, f10, f11, d, false, false, false, false);
        if (ijVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (ijVar.f23266k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 & z10) {
            boolean z11 = this.C0.N;
            if (z11) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.E6[0].get(ijVar.e1());
                if (ijVar2 != null && (message = ijVar2.f23266k) != null) {
                    message.reactions = ijVar.f23266k.reactions;
                }
            } else if (!z11 && this.E3 != null) {
                Rc(false);
            }
        }
        if (this.C0.N && !ijVar.v2(this.E3)) {
            org.telegram.messenger.dj t92 = t9(ijVar);
            if (t92 != null) {
                ArrayList arrayList = t92.d;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getMediaDataController().M1(((org.telegram.messenger.ij) arrayList.get(i7)).e1());
                }
            } else {
                getMediaDataController().M1(ijVar.e1());
            }
            jg.m1 m1Var = this.f44422a4;
            if (m1Var != null) {
                m1Var.f();
            }
            Rc(true);
        }
    }

    public final void Wb() {
        org.telegram.messenger.g0.G3(5.0f, this.f44741z0, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        sj sjVar = this.Z;
        for (int i7 = 0; i7 < sjVar.getChildCount(); i7++) {
            org.telegram.messenger.g0.G3(5.0f, sjVar.getChildAt(i7), null);
        }
        org.telegram.ui.ActionBar.l actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
        }
    }

    public final void Wc() {
        org.telegram.messenger.ij ijVar;
        if (this.f44487f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                cj cjVar = this.f44741z0;
                if (cjVar != null) {
                    int childCount = cjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = this.f44741z0.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            ijVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        } else {
                            ijVar = null;
                        }
                        if (ijVar != null && ijVar.e1() < 0) {
                            long j3 = ijVar.f23266k.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.ij ijVar2 = SecretMediaViewer.f().f41910f0;
            if (ijVar2 != null && !ijVar2.N3()) {
                MediaController.B();
                ijVar2.e1();
            }
        }
    }

    public final void X6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.X6():void");
    }

    public final org.telegram.messenger.hw X8() {
        ?? obj = new Object();
        int i7 = this.f44492f4;
        if (i7 == 9) {
            obj.f19041b = this.Oa;
        }
        if (i7 == 5) {
            String str = this.f44478e4;
            int c92 = c9();
            obj.f19042c = str;
            obj.f19040a = c92;
        }
        return new org.telegram.messenger.hw(obj);
    }

    public final boolean X9() {
        return !TextUtils.isEmpty(this.f44531i4);
    }

    public final void Xa(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Xa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Xb(int i7, org.telegram.messenger.ij ijVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44750za);
        String M0 = org.telegram.messenger.id.M0(2131745420, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        TLRPC.User user = this.f44487f;
        if (user != null) {
            if (user.bot) {
                u1Var.T = org.telegram.messenger.id.M0(2131754069, null);
            } else {
                String i10 = org.telegram.messenger.k5.i(new StringBuilder("+"), getUserConfig().f().phone, pf.b.c());
                TLRPC.User user2 = this.f44487f;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AreYouSureShareMyContactInfoUser", null, 2131754067, i10, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            u1Var.T = org.telegram.messenger.id.M0(2131754070, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745461, null), new jg.a2(this, i7, ijVar, 5));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        showDialog(u1Var);
    }

    public final void Xc(org.telegram.messenger.ij ijVar, boolean z9) {
        if (this.C0 == null) {
            return;
        }
        getNotificationCenter().d(new bi.u7(this, ijVar, z9, 14));
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        boolean z9;
        int i10;
        int i11;
        if (i7 == 0) {
            ua();
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
            ua();
            H7();
            sh.c cVar2 = this.f44539id;
            if (cVar2 != null) {
                cVar2.setAnimatedVisibility(this.f44460cd.f55498e);
            }
        } else {
            int i14 = 8;
            if (i7 == 3) {
                te.a aVar = this.f44472dd;
                float f12 = 1.0f - aVar.f55498e;
                this.f44419a1.setAlpha(f12);
                org.telegram.ui.Components.kg kgVar = this.f44419a1;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                kgVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f55498e;
                org.telegram.ui.Components.m11 m11Var = this.f44490f2;
                if (m11Var != null) {
                    m11Var.setAlpha(f13);
                    org.telegram.ui.Components.m11 m11Var2 = this.f44490f2;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    m11Var2.setVisibility(i13);
                }
            } else if (i7 == 4) {
                bi.e5 e5Var = this.Y3;
                te.a aVar2 = this.f44486ed;
                if (e5Var != null) {
                    float f14 = aVar2.f55498e;
                    e5Var.setAlpha(f14);
                    bi.e5 e5Var2 = this.Y3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    e5Var2.setVisibility(i14);
                }
                if (aVar2.f55498e < 1.0f) {
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
                A7();
                if (aVar2.f55498e >= 1.0f) {
                    z10 = false;
                }
                cj cjVar = this.f44741z0;
                if (z10) {
                    i12 = 0;
                }
                cjVar.setVisibility(i12);
                H7();
                K7();
                J7();
                this.glassEngine.g();
            } else if (i7 == 5) {
                z7();
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.setSearchFactor(f10);
                }
            } else if (i7 == 6) {
                E7();
            }
        }
    }

    public final void Y6(int i7, View view, boolean z9) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f44460cd.f55498e) * (1.0f - this.f44431ad.f55498e) * ((float[]) this.f44526hd.f19926b)[i7];
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

    public final boolean Y7(android.view.View r97, boolean r98, boolean r99, float r100, float r101, boolean r102, boolean r103, boolean r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Y7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final boolean Y9() {
        int i7 = this.f44492f4;
        if (((i7 == 0 && this.f44643r4 == 0) || i7 == 3) && this.f44545j6 == getUserConfig().e() && !X9()) {
            return true;
        }
        return false;
    }

    public final void Ya(int i7, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var, boolean z9) {
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
                    vf.c.r(getParentActivity(), Uri.parse(str), true, true, ma(q1Var, characterStyle));
                    return;
                } else if (i7 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f44697v8 == 0) {
                        z12 = true;
                    }
                    vf.c.r(parentActivity, parse, z12, true, ma(q1Var, characterStyle));
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f44697v8 == 0) {
                        z12 = true;
                    }
                    vf.c.r(parentActivity2, parse2, z12, true, ma(q1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i7 == 0 && i7 != 2) {
                if (i7 == 1) {
                    org.telegram.ui.Components.u4.o0(this, str, true, true, false, false, ma(q1Var, characterStyle), null, this.f44750za);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.d41) && (uy0Var = ((org.telegram.ui.Components.d41) characterStyle).f32885a) != null && (uy0Var.f38777a & 1024) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.u4.o0(this, str, true, true, true, z10, ma(q1Var, characterStyle), null, this.f44750za);
            }
        }
        if (getMessagesController().f24775e4.contains(K0)) {
            org.telegram.messenger.gz sendMessagesHelper = getSendMessagesHelper();
            if (i7 != 0 && i7 != 2) {
                z11 = false;
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new org.telegram.messenger.p4(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z11), 2);
                return;
            }
            z11 = true;
            sendMessagesHelper.getClass();
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth2.url = str;
            tL_messages_requestUrlAuth2.flags |= 4;
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth2, new org.telegram.messenger.p4(sendMessagesHelper, tL_messages_requestUrlAuth2, this, str, z11), 2);
            return;
        }
        if (z9) {
        }
        if (i7 == 0) {
        }
        if (!(characterStyle instanceof org.telegram.ui.Components.d41)) {
        }
        z10 = false;
        org.telegram.ui.Components.u4.o0(this, str, true, true, true, z10, ma(q1Var, characterStyle), null, this.f44750za);
    }

    public final boolean Yb() {
        if (S9() && this.D5 == null && this.F5 == null) {
            if (this.f44492f4 != 8 && S9() && this.f44473e != null) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f24881q7.f(this.f44473e.f26960id, 1L);
                if (this.f44492f4 != 8) {
                    if (f10 != null) {
                        if (f10.closed && !org.telegram.messenger.t3.i(this.currentAccount, this.f44473e, f10)) {
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

    public final void Yc(org.telegram.messenger.ij ijVar, boolean z9) {
        org.telegram.messenger.ij ijVar2;
        if (this.C0 != null && this.fragmentView != null) {
            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.N6.f(ijVar.c1());
            if (djVar != null) {
                ArrayList arrayList = djVar.d;
                ej ejVar = this.A0;
                if (ejVar != null) {
                    ejVar.V(djVar);
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
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.E6[0].get(ijVar.e1());
            if (z9) {
                ijVar.K1 = true;
                ijVar.H = true;
            }
            if (this.C0.N) {
                a0.h hVar = this.f44687ub;
                if (hVar != null) {
                    ijVar2 = (org.telegram.messenger.ij) hVar.f(ijVar.e1());
                } else {
                    ijVar2 = null;
                }
                int indexOf = this.C0.P.indexOf(ijVar2);
                if (ijVar2 != null && z9) {
                    ijVar2.K1 = true;
                    ijVar2.H = true;
                }
                if (indexOf >= 0) {
                    ll llVar = this.C0;
                    llVar.g(llVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.K6.indexOf(ijVar3);
            if (indexOf2 >= 0) {
                ll llVar2 = this.C0;
                llVar2.g(llVar2.J + indexOf2);
            }
        }
    }

    public final boolean Z6() {
        boolean z9;
        TLRPC.ChatFull chatFull = this.f44620p8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
            ug.i0.w1(this, this.R1, this.S1, this.f44545j6, false);
        }
        return z9;
    }

    public final int Z8(org.telegram.messenger.ij r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Z8(org.telegram.messenger.ij):int");
    }

    public final boolean Z9() {
        org.telegram.ui.Components.m11 m11Var = this.f44490f2;
        if (m11Var != null && m11Var.T && m11Var.f35794a.f55499f) {
            return true;
        }
        return false;
    }

    public final void Za(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.ij r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.ij r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.Za(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.ij):void");
    }

    public final void Zb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.gc.a0(this).t(org.telegram.messenger.id.M0(2131743833, null), this.f44750za).j();
    }

    public final void Zc() {
        org.telegram.ui.ActionBar.g1 g1Var;
        int i7;
        if (this.h != null) {
            return;
        }
        cj cjVar = this.f44741z0;
        lj ljVar = this.W1;
        if ((ljVar != null && ljVar.I) || ((g1Var = this.f44483e9) != null && g1Var.isShowing())) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        cjVar.setImportantForAccessibility(i7);
    }

    public long a() {
        return this.f44545j6;
    }

    public final void a7(boolean z9) {
        if (this.f44467d7 == 0) {
            if (z9 && !this.f44481e7.isEmpty()) {
                this.f44467d7 = System.currentTimeMillis();
            } else {
                this.f44467d7 = 1L;
            }
            ca();
            cj cjVar = this.f44741z0;
            if (cjVar != null) {
                cjVar.invalidate();
            }
        }
    }

    public final void a8() {
        if (this.h == null && this.L2 == null && getParentActivity() != null) {
            pk pkVar = new pk(this, getParentActivity());
            this.L2 = pkVar;
            pkVar.setTag(1);
            this.f44419a1.addView(this.L2, c8.ha.o(-1, 48));
            this.f44419a1.h(1, this.L2);
            this.f44419a1.g(this.L2);
            this.L2.setOnClickListener(new le(this, 17));
            this.L2.setEnabled(!isInPreviewMode());
            this.L2.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            org.telegram.ui.Components.de0 de0Var = new org.telegram.ui.Components.de0(getParentActivity(), this.f44750za);
            this.N2 = de0Var;
            this.L2.addView(de0Var, c8.ha.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.L2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.T2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.T2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.Te));
            this.T2.setTypeface(org.telegram.messenger.g0.o());
            this.L2.addView(this.T2, c8.ha.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i7 = 0; i7 < 2; i7++) {
                bn bnVar = new bn(this, getParentActivity());
                bn[] bnVarArr = this.Q2;
                bnVarArr[i7] = bnVar;
                bnVar.setTextSize(14);
                org.telegram.ui.ActionBar.t6.X(bnVarArr[i7], org.telegram.ui.ActionBar.m6.Te, getResourceProvider());
                bnVarArr[i7].setTypeface(org.telegram.messenger.g0.o());
                this.L2.addView(bnVarArr[i7], c8.ha.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                qk qkVar = new qk(0, getParentActivity(), this);
                org.telegram.ui.ActionBar.m5[] m5VarArr = this.R2;
                m5VarArr[i7] = qkVar;
                qkVar.setTextSize(14);
                org.telegram.ui.ActionBar.t6.X(m5VarArr[i7], org.telegram.ui.ActionBar.m6.Ue, getResourceProvider());
                this.L2.addView(m5VarArr[i7], c8.ha.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                rm rmVar = new rm(this, getParentActivity());
                rm[] rmVarArr = this.S2;
                rmVarArr[i7] = rmVar;
                this.L2.addView(rmVar, c8.ha.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                rk rkVar = new rk(getParentActivity());
                rkVar.I = new xh.f();
                rkVar.H = new Path();
                rkVar.J = new float[8];
                org.telegram.ui.Components.k9[] k9VarArr = this.P2;
                k9VarArr[i7] = rkVar;
                rkVar.setBlurAllowed(true);
                k9VarArr[i7].setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                this.L2.addView(k9VarArr[i7], c8.ha.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i7 == 1) {
                    bnVarArr[i7].setVisibility(4);
                    rmVarArr[i7].setVisibility(4);
                    m5VarArr[i7].setVisibility(4);
                    k9VarArr[i7].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.Z2 = imageView;
            imageView.setImageResource(2131232297);
            ImageView imageView2 = this.Z2;
            int i10 = org.telegram.ui.ActionBar.m6.Re;
            org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.s(imageView2, i10, resourceProvider, mode);
            ImageView imageView3 = this.Z2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.Z2.setContentDescription(org.telegram.messenger.id.M0(2131754723, null));
            this.Z2.setVisibility(4);
            this.Z2.setAlpha(0.0f);
            this.Z2.setScaleX(0.4f);
            this.Z2.setScaleY(0.4f);
            ImageView imageView4 = this.Z2;
            int i11 = org.telegram.ui.ActionBar.m6.f28264x7;
            org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i11) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.t6.g(i11, 25), getResourceProvider());
            this.L2.addView(this.Z2, c8.ha.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.Z2.setOnClickListener(new le(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.X2 = imageView5;
            imageView5.setImageResource(2131231983);
            org.telegram.ui.ActionBar.t6.s(this.X2, i10, getResourceProvider(), mode);
            this.X2.setScaleType(scaleType);
            this.X2.setVisibility(8);
            this.X2.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f44750za);
            this.Y2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Y2.setSize(org.telegram.messenger.g0.L(16.0f));
            this.Y2.setStrokeWidth(2.0f);
            this.Y2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.m6.Se));
            this.L2.addView(this.Y2, c8.ha.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.t6.Q(this.X2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i11) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)), null, org.telegram.ui.ActionBar.t6.g(i11, 25), getResourceProvider());
            this.L2.addView(this.X2, c8.ha.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.X2.setOnClickListener(new le(this, 19));
            ed(false);
        }
    }

    public final int a9() {
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
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(i7);
                if (f2Var != this && (f2Var instanceof cn) && ((cn) f2Var).f44545j6 == this.f44545j6) {
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

    public final boolean aa() {
        org.telegram.ui.Components.m11 m11Var = this.f44490f2;
        if (m11Var != null) {
            return m11Var.f35798c;
        }
        if (org.telegram.messenger.t3.c0(this.f44473e) && O6()) {
            return true;
        }
        return false;
    }

    public final void ab(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.ab(java.util.ArrayList, boolean):void");
    }

    public final void ac(org.telegram.ui.Cells.q1 q1Var) {
        if (getParentActivity() != null && q1Var != null && q1Var.f30099y9 != null && q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().f23266k != null && q1Var.getPrimaryMessageObject().f23266k.via_business_bot_id != 0 && !getMessagesController().f24778e7.getBoolean("bizbothint", false)) {
            getMessagesController().f24778e7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f44662sb) {
                this.f44662sb = true;
                if (this.N1 != null) {
                    return;
                }
                fi.m3 m3Var = new fi.m3(getParentActivity(), 3);
                m3Var.r(true);
                m3Var.K = Layout.Alignment.ALIGN_NORMAL;
                m3Var.d = -1L;
                m3Var.T = true;
                m3Var.f12424e = true;
                m3Var.k(true);
                m3Var.s(8.0f);
                this.N1 = m3Var;
                m3Var.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748598, null)));
                this.N1.l(this.K);
                fi.m3 m3Var2 = this.N1;
                m3Var2.h = fi.m3.a(m3Var2.getText(), this.N1.getTextPaint());
                this.l1.addView(this.N1, c8.ha.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.l1.post(new oe(4, this, q1Var));
            }
        }
    }

    public final void ad(ArrayList arrayList, boolean z9) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.C0.R((org.telegram.messenger.ij) arrayList.get(i7), false, z9);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28046lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28129q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27981i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27963h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27894da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28094oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27985ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28076na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28041la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28023ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28003ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27899dg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28233vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28158rf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28195tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28176sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.hg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28027kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28187t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28245w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28252wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28228v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28209u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28133q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28113p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28093o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28022k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28058m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27984i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28002j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27836a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28044ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28288yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27967ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27949ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27913ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27917ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27954gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27934ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28006jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27988id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28307ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28289ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28305zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28270xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28287yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28251we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28214ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28231vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28194te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28212uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28175se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28192tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28157re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28173sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28138qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28155rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28118pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28136qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28098oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28116pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28096oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28061me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28078nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28007je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28026ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27989ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28005jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27971he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27987ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27953ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27969hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27839ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27916ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27897de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27859bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27878cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27841ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27880ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27951gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27860be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27914ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28025kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28306zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28269xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28250wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28232vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28213ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28193td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28134qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28150r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28249wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28174sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28156rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28137qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28117pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28097od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28079nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28060md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27970hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27952gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28304zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28286yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28268xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27840ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28115pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28095ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28153ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28092o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28074n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28057m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28039l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28021k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28001j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27983i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27896dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27879cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28114pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
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
        if (!this.f44693v4 && (i7 = this.f44492f4) != 3 && i7 != 5 && i7 != 8) {
            return 0L;
        }
        return this.f44643r4;
    }

    public final void b7(CharSequence charSequence) {
        boolean z9;
        TLRPC.WebPage webPage;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.ij ijVar2 = this.F5;
        if (ijVar2 != null && (message = ijVar2.f23266k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f44694v5 != null && ijVar2 != null) {
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
                    sj sjVar = this.Z;
                    if (sjVar != null) {
                        sjVar.X2 = null;
                        sjVar.Y2 = true;
                    }
                    org.telegram.messenger.mj mjVar = this.f44694v5;
                    if (mjVar != null) {
                        int i10 = this.currentAccount;
                        CharSequence fieldText = sjVar.getFieldText();
                        org.telegram.messenger.ij ijVar3 = this.D5;
                        if (ijVar3 == this.f44568l4) {
                            ijVar = null;
                        } else {
                            ijVar = ijVar3;
                        }
                        mjVar.e(i10, null, fieldText, ijVar, this.B5, this.F5);
                    }
                    y8();
                    A8();
                }
            }
        }
    }

    public final void b8() {
        int i7;
        int i10;
        if (this.f44491f3 == null && getParentActivity() != null) {
            vj vjVar = new vj(this, getParentActivity(), 1);
            this.f44491f3 = vjVar;
            vjVar.setClickable(false);
            this.f44491f3.setWillNotDraw(false);
            this.f44526hd.h(4, false, false);
            this.f44491f3.setClipToPadding(false);
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(getParentActivity(), true, true, true);
            this.f44530i3 = i6Var;
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
            i6Var.b(0.25f, 280L, wqVar);
            this.f44530i3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f44530i3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(this.f44530i3, org.telegram.ui.ActionBar.m6.f28080nf, getResourceProvider());
            this.f44530i3.setGravity(3);
            this.f44491f3.addView(this.f44530i3, c8.ha.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.V.addView(this.f44491f3, c8.ha.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(getParentActivity(), true, false, true);
            this.j3 = i6Var2;
            i6Var2.b(0.0f, 420L, wqVar);
            this.j3.setScaleProperty(0.7f);
            this.j3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.j3.setGravity(5);
            this.j3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(this.j3, org.telegram.ui.ActionBar.m6.f28090o6, getResourceProvider());
            org.telegram.ui.Components.i6 i6Var3 = this.j3;
            if (this.f44486ed.f55499f) {
                i7 = 2131745818;
            } else {
                i7 = 2131745817;
            }
            i6Var3.setText(org.telegram.messenger.id.M0(i7, null));
            org.telegram.ui.Components.i6 i6Var4 = this.j3;
            i6Var4.f34546n = false;
            i6Var4.setPadding(org.telegram.messenger.g0.L(15.33f), 0, org.telegram.messenger.g0.L(15.33f), 0);
            this.j3.setOnClickListener(new le(this, 2));
            this.j3.setAlpha(0.5f);
            this.j3.setClickable(false);
            this.f44491f3.addView(this.j3, c8.ha.e(-2, -1, 117));
            org.telegram.ui.Components.i6 i6Var5 = new org.telegram.ui.Components.i6(getParentActivity(), true, true, true);
            this.f44556k3 = i6Var5;
            i6Var5.setGravity(17);
            this.f44556k3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.Y(this.f44556k3, org.telegram.ui.ActionBar.m6.f28119pf, getResourceProvider());
            this.f44556k3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            org.telegram.ui.Components.i6 i6Var6 = this.f44556k3;
            int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.ActionBar.t6.Q(i6Var6, org.telegram.ui.ActionBar.m6.i0(themedColor, org.telegram.ui.ActionBar.m6.w(themedColor2, getThemedColor(i12))), org.telegram.ui.ActionBar.t6.M(i11), org.telegram.ui.ActionBar.t6.p(i11, i12), getResourceProvider());
            org.telegram.ui.Components.i6 i6Var7 = this.f44556k3;
            if (this.C0.N) {
                i10 = 2131745883;
            } else {
                i10 = 2131745866;
            }
            i6Var7.setText(org.telegram.messenger.id.M0(i10, null));
            this.f44556k3.setOnClickListener(new le(this, 3));
            this.f44556k3.setVisibility(8);
            this.f44556k3.setAlpha(0.0f);
            this.f44491f3.addView(this.f44556k3, c8.ha.e(-1, -1, 119));
            TLRPC.Chat chat = this.f44473e;
            if (chat != null && ((!org.telegram.messenger.t3.T(chat) || this.f44473e.megagroup) && this.f44492f4 != 7 && !org.telegram.messenger.t3.p0(this.f44473e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f44517h3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f44517h3.setImageResource(2131232417);
                org.telegram.ui.ActionBar.t6.s(this.f44517h3, org.telegram.ui.ActionBar.m6.f28062mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f44517h3;
                int i13 = org.telegram.ui.ActionBar.m6.f28302z8;
                org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i13), getResourceProvider());
                this.f44491f3.addView(this.f44517h3, c8.ha.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f44517h3.setOnClickListener(new le(this, 4));
                this.f44517h3.setContentDescription(org.telegram.messenger.id.M0(2131754780, null));
            }
            if (this.f44492f4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f44503g3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f44503g3.setImageResource(2131232076);
                org.telegram.ui.ActionBar.t6.s(this.f44503g3, org.telegram.ui.ActionBar.m6.f28062mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f44503g3;
                int i14 = org.telegram.ui.ActionBar.m6.f28302z8;
                org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
                this.f44491f3.addView(this.f44503g3, c8.ha.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f44503g3.setOnClickListener(new le(this, 5));
                this.f44503g3.setContentDescription(org.telegram.messenger.id.M0(2131749065, null));
            }
        }
    }

    public final int b9() {
        return Math.max(this.f44438b5, this.f44452c5);
    }

    public final boolean ba() {
        if (this.f44565l0 != null && fa()) {
            return true;
        }
        return false;
    }

    public final void bb(int i7) {
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
                    this.f44572l8 = q02.getAbsolutePath();
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
                if (org.telegram.messenger.t3.T(this.f44473e) && (tL_chatBannedRights = this.f44473e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                pm0 pm0Var = new pm0(0, z9, true, this);
                if (this.f44492f4 == 9) {
                    pm0Var.G = 1;
                    pm0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.f44473e;
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f44473e.slowmode_enabled) {
                        pm0Var.G = 10;
                        pm0Var.H = true;
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
                        pm0Var.G = i10;
                        pm0Var.H = z10;
                    }
                }
                pm0Var.V = new yi(this);
                presentFragment(pm0Var);
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
                        this.f44572l8 = s02.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void bc(boolean z9, boolean z10) {
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
                    xj xjVar = this.D0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xjVar, property, 0.1f);
                    xj xjVar2 = this.D0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xjVar2, property2, 0.1f);
                    xj xjVar3 = this.D0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(xjVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.I0, property, 1.0f), ObjectAnimator.ofFloat(this.I0, property2, 1.0f), ObjectAnimator.ofFloat(this.I0, property3, 1.0f));
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
            xj xjVar4 = this.D0;
            if (!z9 && !this.E0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xjVar4.setVisibility(i10);
            org.telegram.ui.Components.w70 w70Var = this.F0;
            if (!z9 && this.E0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            w70Var.setVisibility(i11);
            xj xjVar5 = this.D0;
            if (!z9 && !this.E0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            xjVar5.setScaleX(f12);
            org.telegram.ui.Components.w70 w70Var2 = this.F0;
            if (!z9 && this.E0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            w70Var2.setScaleX(f13);
            xj xjVar6 = this.D0;
            if (!z9 && !this.E0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            xjVar6.setScaleY(f14);
            org.telegram.ui.Components.w70 w70Var3 = this.F0;
            if (!z9 && this.E0) {
                f17 = 1.0f;
            }
            w70Var3.setScaleY(f17);
            xj xjVar7 = this.D0;
            if (!z9 && !this.E0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            xjVar7.setAlpha(f15);
            org.telegram.ui.Components.w70 w70Var4 = this.F0;
            if (!z9 && this.E0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            w70Var4.setAlpha(f16);
        }
    }

    public final void bd() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.bd():void");
    }

    @Override
    public final boolean c() {
        if (this.f44492f4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.c7():void");
    }

    public final void c8() {
        if (this.f44641r2 == null && this.H1 == null) {
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(getParentActivity(), this.f44750za);
            this.f44627q2 = lzVar;
            lzVar.setViewType(7);
            org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(getParentActivity(), this.f44627q2, 1, null);
            this.f44641r2 = bv0Var;
            bv0Var.setClickable(true);
            this.f44641r2.d.setText(org.telegram.messenger.id.M0(2131748167, null));
            this.f44641r2.setVisibility(8);
            this.f44641r2.addView(this.f44627q2, 0);
            this.f44641r2.e(true, false);
            this.Y3.addView(this.f44641r2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.H1 = t20Var;
            t20Var.setOnHashtagClickListener(new ne(this, 3));
            this.H1.setOnScrollListener(new g3(this, 6));
            this.H1.setVisibility(8);
            this.Y3.addView(this.H1, -1, -1);
            G7();
            E7();
        }
    }

    public final int c9() {
        if (this.f44492f4 == 5) {
            return (int) this.f44643r4;
        }
        return 0;
    }

    public final boolean ca() {
        boolean z9;
        boolean z10;
        float f10;
        FrameLayout frameLayout;
        if (!this.f44446c && !this.d && this.f44487f == null && this.f44741z0 != null && org.telegram.messenger.iz.c()) {
            if (this.Gb == null) {
                this.Gb = Boolean.valueOf(org.telegram.messenger.sc.e(360928));
            }
            if (this.Gb.booleanValue()) {
                int i7 = Integer.MAX_VALUE;
                int i10 = 0;
                for (int i11 = 0; i11 < this.f44741z0.getChildCount(); i11++) {
                    i10 += this.f44741z0.getChildAt(i11).getHeight();
                    int top = this.f44741z0.getChildAt(i11).getTop();
                    if (top < i7) {
                        i7 = top;
                    }
                }
                float f11 = i7;
                if (f11 <= this.N9) {
                    a7(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.S6;
                boolean z11 = zArr[0];
                ArrayList arrayList = this.K6;
                if ((!z11 || ((this.f44440b7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.W6 && f11 > this.N9 && (!arrayList.isEmpty() ? i10 != 0 : this.Fb)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 || !this.inTransitionAnimation || (frameLayout = this.f44475e1) == null || frameLayout.getVisibility() != 0 || this.f44475e1.getChildCount() <= 0) {
                    if (!z9 && this.f44467d7 == 0) {
                        a7(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.iz.o() != 0 && !this.ma && this.fragmentBeginToShow) {
                        if (z9 && this.f44467d7 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Drawable m10 = this.f44750za.m();
                        ql qlVar = this.l1;
                        if (qlVar != null) {
                            m10 = qlVar.getBackgroundImage();
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
                    if (z9 || (this.f44467d7 != 0 && System.currentTimeMillis() - this.f44467d7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.s01 s01Var;
        wh.i iVar;
        org.telegram.ui.Components.td tdVar;
        if ((this.f44492f4 != 5 || (!this.K6.isEmpty() && this.f44643r4 != 0)) && (((s01Var = this.m0) == null || (s01Var.f37813y <= 0.0f && !s01Var.U)) && !this.f44712w9 && !this.f44486ed.f55499f && this.I9)) {
            sj sjVar = this.Z;
            if (!sjVar.F2 && ((!sjVar.f31045c1 || (tdVar = sjVar.f31057e1) == null || tdVar.getVisibility() != 0) && ((!sjVar.g0() || !sjVar.f31098l0.f15046w) && !org.telegram.ui.ActionBar.f2.hasSheets(sjVar.P2) && this.f44536ia == 0.0f && ((iVar = this.f44661sa) == null || !iVar.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.cb(int):void");
    }

    public final void cc(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.id.M0(2131752713, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752714, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751406, null), new we(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, getResourceProvider());
        }
    }

    public final void cd() {
        boolean z9;
        boolean z10;
        if (this.f44717x1 == null) {
            return;
        }
        if (this.B9 && !z9() && !this.Z.v0() && !this.kb && (!this.G3 || getMediaDataController().Y0.isEmpty())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (this.f44494f6 != 0 && SystemClock.elapsedRealtime() >= this.f44494f6 + 150) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f44730y1 = false;
        } else {
            this.R7 = 0;
            this.f44747z6 = 0;
            z10 = true;
        }
        this.f44717x1.e(1, z9, z10);
    }

    @Override
    public final android.view.View createView(android.content.Context r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        org.telegram.messenger.ez d = org.telegram.messenger.ez.d(messageMedia, this.f44545j6, this.D5, this.f44568l4, null, null, z9, i10);
        d.K = X8();
        d.Q = j3;
        d.R = i9();
        d.T = this.f44708w5;
        getSendMessagesHelper().r0(d);
        if (this.f44492f4 == 0) {
            qa(false);
        }
        if (i7 == 0 || i7 == 1) {
            L6();
        }
        if (this.G5) {
            this.f44506g6 = true;
        }
    }

    public final void d7(boolean z9) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.r3 r3Var = this.f44584m8;
        if (r3Var != null && (((str = this.f44711w8) != null || this.f44724x8) && this.f44466d6)) {
            org.telegram.ui.Components.voip.y1.l(this.f44473e, str, this.f44607o8, Boolean.valueOf(!r3Var.f25226b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f44711w8 = null;
            this.f44724x8 = false;
            return;
        }
        if (this.f44711w8 != null && z9 && (chatFull = this.f44620p8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.o(null, 2131748913, org.telegram.ui.Components.gc.a0(this), 2131624079, 36);
            this.f44711w8 = null;
        }
        this.f44595n8 = !this.f44466d6;
    }

    public final TextureView d8(boolean z9) {
        if (this.parentLayout == null) {
            return null;
        }
        org.telegram.messenger.g0.r(this.M8);
        if (this.H8 == null) {
            vj vjVar = new vj(this, getParentActivity(), 2);
            this.H8 = vjVar;
            vjVar.setOutlineProvider(new fh.a(this, 1));
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
            this.l1.addView(this.H8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.g0.g3(aa(), R9()), org.telegram.messenger.g0.g3(aa(), R9())));
        }
        this.H8.setTag(null);
        this.J8.setDrawingReady(false);
        return this.K8;
    }

    public final long d9() {
        if (this.f44492f4 == 3) {
            return this.f44643r4;
        }
        return 0L;
    }

    public final boolean da() {
        if (getUserConfig().e() == a() && !getMessagesController().G1().f26216b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final boolean db(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f44697v8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f44487f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f44697v8 == this.f44545j6) {
            this.f44697v8 = 0L;
            this.Z.setFieldText(str);
            return true;
        }
        getMediaDataController().Q1(this.f44697v8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((f2Var instanceof cn) && ((cn) f2Var).f44545j6 == this.f44697v8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.m5.C(this.f44697v8)) {
                bundle.putInt("enc_id", (int) (this.f44697v8 & 4294967295L));
            } else if (org.telegram.messenger.m5.E(this.f44697v8)) {
                bundle.putLong("user_id", this.f44697v8);
            } else {
                bundle.putLong("chat_id", -this.f44697v8);
            }
            I6();
            presentFragment(new cn(bundle), true);
        }
        return true;
    }

    public final void dc() {
        TLRPC.Chat chat = this.f44473e;
        if (chat != null) {
            if (org.telegram.messenger.t3.n0(chat)) {
                if (org.telegram.messenger.t3.N(this.f44473e)) {
                    m40 m40Var = new m40(a());
                    m40Var.f49367l0 = this;
                    presentFragment(m40Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.t3.w(1, this.f44473e)) {
                rc rcVar = new rc(a());
                rcVar.f49367l0 = this;
                presentFragment(rcVar);
                return;
            } else {
                return;
            }
        }
        this.f44713wa = new org.telegram.ui.Components.vo(this, this.f44750za);
        this.f44741z0.setOnInterceptTouchListener(new org.telegram.messenger.ch(22));
        Ob(this.l1, false);
        showDialog(this.f44713wa, new ee(this, 1));
    }

    public final void dd() {
        lh.h hVar = this.f44717x1;
        xi xiVar = this.f44702w;
        if (hVar != null) {
            this.f44717x1.setTranslationY((((-xiVar.d()) - this.T.getInputBubbleHeight()) - s9(org.telegram.ui.Components.i11.f34509c)) - org.telegram.messenger.g0.L(13.0f));
        }
        if (this.f44640r1 != null) {
            this.f44640r1.setTranslationY((-xiVar.d()) - org.telegram.messenger.g0.L(16.0f));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, final Object... objArr) {
        long j3;
        org.telegram.messenger.ij ijVar;
        TLRPC.MessageReplies messageReplies;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.ActionBar.r4 r4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull b22;
        TLRPC.User a22;
        boolean z9;
        TLRPC.User a23;
        wi wiVar;
        sj sjVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.ys editField;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yv0 yv0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        sj sjVar2;
        cn cnVar = this;
        if (i7 == org.telegram.messenger.qs.D) {
            cnVar.s8(objArr);
            return;
        }
        if (i7 == org.telegram.messenger.qs.f25027j4) {
            cj cjVar = cnVar.f44741z0;
            if (cjVar != null) {
                cjVar.g1();
            }
            org.telegram.ui.Components.bi biVar = cnVar.f44523ha;
            if (biVar != null) {
                biVar.invalidate();
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
                if (((Integer) objArr[0]).intValue() == cnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        cnVar.finishFragment();
                        b.b(cnVar.currentAccount);
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25078s3) {
                if (objArr.length > 0) {
                    z10 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z10 = false;
                }
                di.u2 u2Var = cnVar.X1;
                if (u2Var != null && u2Var.isShowing()) {
                    cnVar.X1.a(true);
                }
                if (z10 && (sjVar2 = cnVar.Z) != null && sjVar2.s0()) {
                    cnVar.Z.k0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f26980id = stickerSet2.f26987id;
                        if (objArr.length > 4) {
                            z11 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z11 = false;
                        }
                        Dialog dialog = cnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.yv0) && (tL_messages_stickerSet = (yv0Var = (org.telegram.ui.Components.yv0) dialog).M1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f26987id == stickerSet2.f26987id) {
                            yv0Var.M1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (yv0Var.n1 != null) {
                                yv0Var.a1();
                                yv0Var.Z0();
                                yv0Var.n1.f();
                            }
                            yv0Var.Y0();
                            org.telegram.messenger.ui.b0(yv0Var.f28669a).q1(yv0Var.M1);
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
                                    org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(yv0Var.f28675c, cnVar.resourceProvider);
                                    if (z11) {
                                        i11 = 2131744844;
                                    } else {
                                        i11 = 2131744845;
                                    }
                                    org.telegram.ui.Components.bc q10 = gcVar.q(document, org.telegram.messenger.id.a0(null, null, i11, stickerSet2.title));
                                    q10.f32203j = 2750;
                                    q10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.yv0 yv0Var2 = new org.telegram.ui.Components.yv0(cnVar.getParentActivity(), cnVar, tL_inputStickerSetID, null, cnVar.Z, cnVar.f44750za);
                            final boolean z14 = z11;
                            cnVar = this;
                            yv0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    cn.Y0(cn.this, objArr, yv0Var2, z14, stickerSet2);
                                }
                            });
                            cnVar.showDialog(yv0Var2);
                        }
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25022i4) {
                cj cjVar2 = cnVar.f44741z0;
                if (cjVar2 != null) {
                    cjVar2.g1();
                }
                TextView textView = cnVar.f44477e3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.m5 m5Var = cnVar.R2[i13];
                    if (m5Var != null) {
                        m5Var.invalidate();
                    }
                }
                lj ljVar = cnVar.W1;
                if (ljVar != null) {
                    ljVar.getListView().g1();
                }
                bi.q1 q1Var = cnVar.Z3;
                if (q1Var != null) {
                    q1Var.g1();
                }
                UndoView undoView = cnVar.M3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                sj sjVar3 = cnVar.Z;
                if (sjVar3 != null && (editField = sjVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                rm[] rmVarArr = cnVar.S2;
                rm rmVar = rmVarArr[0];
                if (rmVar != null) {
                    rmVar.invalidate();
                }
                rm rmVar2 = rmVarArr[1];
                if (rmVar2 != null) {
                    rmVar2.invalidate();
                }
            } else if (i7 == org.telegram.messenger.qs.T1) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i7 == org.telegram.messenger.qs.f25007g1) {
                Long l10 = (Long) objArr[0];
                if (cnVar.f44620p8 != null && (chat = cnVar.f44473e) != null && chat.f26960id == l10.longValue()) {
                    cnVar.f44620p8.online_count = ((Integer) objArr[1]).intValue();
                    wi wiVar2 = cnVar.f44601o1;
                    if (wiVar2 != null) {
                        wiVar2.m();
                        cnVar.f44601o1.n(false);
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.G) {
                if (((Long) objArr[0]).longValue() == cnVar.f44545j6 && (sjVar = cnVar.Z) != null) {
                    sjVar.S1(false, true);
                }
            } else if (i7 == org.telegram.messenger.qs.f25021i3) {
                sj sjVar4 = cnVar.Z;
                if (sjVar4 != null) {
                    sjVar4.T1();
                }
            } else if (i7 == org.telegram.messenger.qs.f25067r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i14 = org.telegram.messenger.qp.C8;
                int i15 = intValue & 1;
                if (i15 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (cnVar.f44473e != null) {
                        TLRPC.Chat M0 = cnVar.getMessagesController().M0(Long.valueOf(cnVar.f44473e.f26960id));
                        if (M0 != null) {
                            cnVar.f44473e = M0;
                        }
                    } else if (cnVar.f44487f != null && (a22 = cnVar.getMessagesController().a2(Long.valueOf(cnVar.f44487f.f27109id))) != null) {
                        cnVar.f44487f = a22;
                    }
                    cnVar.vd(true);
                }
                if (!cnVar.ea() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (cnVar.f44473e != null && (wiVar = cnVar.f44601o1) != null) {
                        wiVar.m();
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i15 != 0) {
                    cnVar.s();
                    cnVar.Fd(false);
                }
                if ((intValue & 64) != 0) {
                    z9 = true;
                }
                if ((intValue & 8192) != 0 && cnVar.f44473e != null) {
                    cnVar.V9();
                    TLRPC.Chat M02 = cnVar.getMessagesController().M0(Long.valueOf(cnVar.f44473e.f26960id));
                    if (M02 != null) {
                        cnVar.f44473e = M02;
                        cnVar.V9();
                        z9 = !cnVar.ea();
                        cnVar.Oc(false);
                        sj sjVar5 = cnVar.Z;
                        if (sjVar5 != null) {
                            sjVar5.b1(cnVar.currentAccount, cnVar.f44545j6);
                        }
                        org.telegram.messenger.n6 n6Var = cnVar.S3;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                }
                TLRPC.User user = cnVar.f44487f;
                if (user != null && org.telegram.messenger.t10.u(user) && (a23 = cnVar.getMessagesController().a2(Long.valueOf(cnVar.f44487f.f27109id))) != null) {
                    cnVar.f44487f = a23;
                }
                if (cnVar.f44490f2 != null) {
                    boolean O6 = cnVar.O6();
                    org.telegram.ui.Components.m11 m11Var = cnVar.f44490f2;
                    if (m11Var.f35798c != O6) {
                        m11Var.setTabsEnabled(O6);
                        if (cnVar.m0 != null && !cnVar.fa()) {
                            cnVar.m0.d();
                        }
                        cnVar.Cd();
                    }
                }
                wi wiVar3 = cnVar.f44601o1;
                if (wiVar3 != null && z9) {
                    wiVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    cnVar.yd(true);
                }
                org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44527i0;
                if (r0Var != null) {
                    if (org.telegram.messenger.t3.T(cnVar.f44473e) && !org.telegram.messenger.t3.p0(cnVar.f44473e)) {
                        long j10 = cnVar.f44473e.linked_monoforum_id;
                        if (j10 != 0 && org.telegram.messenger.t3.z(cnVar.currentAccount, 24, -j10)) {
                            z12 = true;
                        }
                    }
                    r0Var.Q(70, z12);
                }
            } else if (i7 == 1) {
                org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!cnVar.kb) {
                    if (longValue == cnVar.f44545j6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i16 = cnVar.f44492f4;
                        if (intValue2 != i16 && i16 != 3 && i16 != 8) {
                            if (i16 != 1 && intValue2 == 1 && !cnVar.isPaused && LaunchActivity.T() == cnVar && cnVar.f44694v5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.ij) arrayList.get(0)).e1() < 0) {
                                int e12 = ((org.telegram.messenger.ij) arrayList.get(0)).e1();
                                if (((org.telegram.messenger.ij) arrayList.get(0)).f23266k != null && ((org.telegram.messenger.ij) arrayList.get(0)).f23266k.video_processing_pending) {
                                    z13 = true;
                                }
                                cnVar.La(e12, z13);
                            }
                            org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !cnVar.Wc && cnVar.f44487f != null && cnVar.a() != cnVar.getUserConfig().e() && (b22 = cnVar.getMessagesController().b2(cnVar.f44487f.f27109id)) != null && b22.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i12);
                                    if (ijVar3.e1() > 0 && !ijVar3.N3() && !ijVar3.r4()) {
                                        cnVar.Wc = true;
                                        cnVar.getMessagesController().W2(cnVar.f44487f, cnVar.classGuid, true, null);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            cnVar.ab(arrayList, true);
                        }
                    } else if (org.telegram.messenger.t3.T(cnVar.f44473e) && !cnVar.f44473e.megagroup && (chatFull = cnVar.f44620p8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList.get(i17);
                            if (ijVar4.e4()) {
                                cnVar.L6.put(ijVar4.e1(), ijVar4);
                            }
                        }
                        cnVar.L7();
                    }
                    org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i7 == org.telegram.messenger.qs.F) {
                cnVar.ka(true);
            } else if (i7 == org.telegram.messenger.qs.E) {
                cnVar.G6();
            } else if (i7 == org.telegram.messenger.qs.f25080t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == cnVar.f44545j6) {
                        cnVar.finishFragment();
                    }
                } else if (org.telegram.messenger.g0.Q1() && (r4Var = cnVar.parentLayout) != null && r4Var.getFragmentStack().size() > 1) {
                    cnVar.finishFragment();
                } else {
                    cnVar.removeSelfFromStack(true);
                }
            } else if (i7 == org.telegram.messenger.qs.f25087u) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == cnVar.a() && (booleanValue2 || cnVar.parentLayout.getLastFragment() != cnVar)) {
                    if (cnVar.parentLayout.getLastFragment() == cnVar) {
                        cnVar.finishFragment();
                    } else {
                        cnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i18 = org.telegram.messenger.qs.B;
                SparseArray[] sparseArrayArr = cnVar.E6;
                if (i7 == i18) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = cnVar.f44473e;
                    if (chat2 != null && chat2.f26960id == longValue3 && (ijVar2 = (org.telegram.messenger.ij) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && ijVar2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (cnVar.G5) {
                            ih ihVar = cnVar.B4;
                            if (ihVar != null) {
                                org.telegram.messenger.g0.r(ihVar);
                                cnVar.B4 = null;
                            }
                            ijVar2.f23266k.replies.read_max_id = intValue3;
                        } else {
                            ih ihVar2 = new ih(cnVar, ijVar2, intValue3);
                            cnVar.B4 = ihVar2;
                            org.telegram.messenger.g0.i3(ihVar2, 500L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = cnVar.f44473e;
                    if (chat3 != null && chat3.f26960id == longValue4 && (ijVar = (org.telegram.messenger.ij) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = ijVar.f23266k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer z15 = cnVar.getMessagesController().z1(org.telegram.messenger.t3.M(cnVar.f44473e, cnVar.getMessagesController().N0(cnVar.f44473e.f26960id), false));
                            int size3 = ijVar.f23266k.replies.recent_repliers.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.ij.B1(ijVar.f23266k.replies.recent_repliers.get(i19)) == org.telegram.messenger.ij.B1(z15)) {
                                    ijVar.f23266k.replies.recent_repliers.remove(i19);
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            ijVar.f23266k.replies.recent_repliers.add(0, z15);
                        }
                        TLRPC.MessageReplies messageReplies2 = ijVar.f23266k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i20 = org.telegram.messenger.qs.A;
                    int i21 = org.telegram.messenger.qs.f25121z;
                    if ((i7 == i21 || i7 == i20) && cnVar.f44545j6 == ((Long) objArr[0]).longValue()) {
                        if (i7 == i21) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i7 == i20) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = cnVar.f44643r4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i22 = cnVar.f44733y4;
                            ArrayList arrayList2 = cnVar.K6;
                            if (intValue4 > i22) {
                                cnVar.f44733y4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i23 = 0; i23 < size4; i23++) {
                                    org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) arrayList2.get(i23);
                                    int e13 = ijVar5.e1();
                                    if (!ijVar5.N3() && e13 > 0 && e13 <= cnVar.f44733y4) {
                                        if (!ijVar5.F4()) {
                                            break;
                                        }
                                        ijVar5.I5();
                                        ll llVar = cnVar.C0;
                                        if (llVar != null) {
                                            llVar.M(ijVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > cnVar.f44745z4) {
                                cnVar.f44745z4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    org.telegram.messenger.ij ijVar6 = (org.telegram.messenger.ij) arrayList2.get(i24);
                                    int e14 = ijVar6.e1();
                                    if (ijVar6.N3() && e14 > 0 && e14 <= cnVar.f44745z4) {
                                        if (!ijVar6.F4()) {
                                            break;
                                        }
                                        ijVar6.I5();
                                        ll llVar2 = cnVar.C0;
                                        if (llVar2 != null) {
                                            llVar2.R(ijVar6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        cnVar.n8(i7, objArr);
        cnVar.o8(i7, objArr);
        cnVar.p8(i7, objArr);
        cnVar.q8(i7, objArr);
        cnVar.r8(i7, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        di.u2 u2Var = this.X1;
        if (u2Var != null && this.visibleDialog == u2Var) {
            u2Var.d2.d0(false);
            this.X1.K();
            this.X1.d2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.X1 && dialog != this.f44713wa && !(dialog instanceof hi.a3) && super.dismissDialogOnPause(dialog)) {
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
        if (this.M1 == null && org.telegram.messenger.t3.n0(this.f44473e) && (N0 = getMessagesController().N0(this.f44473e.f26960id)) != null && this.Z != null && getParentActivity() != null && (stickerSet = N0.emojiset) != null) {
            wj wjVar = this.f44448c1;
            if (wjVar == null || wjVar.getVisibility() != 0) {
                org.telegram.ui.Components.z20 z20Var = org.telegram.ui.Components.z20.f40834n;
                if (z20Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (Y = getMediaDataController().Y(stickerSet)) != null && !Y.documents.isEmpty()) {
                        j3 = Y.documents.get(0).f26966id;
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.q5(j3, this.M1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.M1.u(org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131749442, null), spannableStringBuilder, "%s"));
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

    public final void e8() {
        if (this.l1 != null && this.Y1 == null && getParentActivity() != null) {
            this.Y1 = new org.telegram.ui.ActionBar.l0(1, getParentActivity(), this);
            L9();
            this.Y1.setClickable(true);
            this.f44419a1.addView(this.Y1, c8.ha.o(-1, 44));
            this.f44419a1.h(2, this.Y1);
            this.f44419a1.g(this.Y1);
            TextView textView = new TextView(getParentActivity());
            this.f44435b2 = textView;
            int i7 = org.telegram.ui.ActionBar.m6.f28131q7;
            org.telegram.ui.ActionBar.t6.U(textView, i7, getResourceProvider());
            TextView textView2 = this.f44435b2;
            float L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.t6.Q(textView2, org.telegram.ui.ActionBar.m6.Y(L, getThemedColor(i7) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.t6.g(i7, 25), getResourceProvider());
            this.f44435b2.setTag(Integer.valueOf(i7));
            this.f44435b2.setTextSize(1, 14.0f);
            this.f44435b2.setTypeface(org.telegram.messenger.g0.o());
            this.f44435b2.setSingleLine(true);
            this.f44435b2.setMaxLines(1);
            this.f44435b2.setGravity(17);
            this.Y1.addView(this.f44435b2, c8.ha.e(-1, -1, 51));
            this.f44435b2.setOnClickListener(new le(this, 13));
            org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(getParentActivity(), this.f44750za);
            this.f44516h2 = w70Var;
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.Ue, getResourceProvider());
            this.f44516h2.setTextSize(1, 13.3f);
            this.f44516h2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.t6.G(this.f44516h2, org.telegram.ui.ActionBar.m6.Wl, getResourceProvider());
            this.f44516h2.setGravity(17);
            this.f44516h2.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            this.f44419a1.addView(this.f44516h2, c8.ha.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f44419a1.h(8, this.f44516h2);
            this.f44419a1.g(this.f44516h2);
            TextView textView3 = new TextView(getParentActivity());
            this.Z1 = textView3;
            int i10 = org.telegram.ui.ActionBar.m6.Ve;
            org.telegram.ui.ActionBar.t6.U(textView3, i10, getResourceProvider());
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
            org.telegram.ui.ActionBar.t6.Q(textView4, org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.t6.g(i10, 25), getResourceProvider());
            this.Y1.addView(this.Z1, c8.ha.e(-1, -1, 51));
            this.Z1.setOnClickListener(new le(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.f44449c2 = textView5;
            org.telegram.ui.ActionBar.t6.U(textView5, i10, getResourceProvider());
            this.f44449c2.setVisibility(8);
            this.f44449c2.setTextSize(1, 14.0f);
            this.f44449c2.setTypeface(org.telegram.messenger.g0.o());
            this.f44449c2.setSingleLine(true);
            this.f44449c2.setMaxLines(1);
            this.f44449c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f44449c2.setGravity(17);
            this.f44449c2.setText(org.telegram.messenger.id.M0(2131746084, null));
            org.telegram.ui.ActionBar.t6.Q(this.f44449c2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i10) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.t6.g(i10, 25), getResourceProvider());
            this.f44419a1.addView(this.f44449c2, c8.ha.o(-1, 48));
            this.f44419a1.h(4, this.f44449c2);
            this.f44419a1.g(this.f44449c2);
            this.f44449c2.setOnClickListener(new le(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f44529i2 = imageView;
            imageView.setImageResource(2131231983);
            this.f44529i2.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
            ImageView imageView2 = this.f44529i2;
            int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.O(getThemedColor(i11), 0, 0), null, org.telegram.ui.ActionBar.t6.M(i11), getResourceProvider());
            org.telegram.ui.ActionBar.t6.s(this.f44529i2, org.telegram.ui.ActionBar.m6.Re, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f44529i2.setScaleType(ImageView.ScaleType.CENTER);
            this.Y1.addView(this.f44529i2, c8.ha.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f44529i2.setOnClickListener(new le(this, 16));
        }
    }

    public final int e9(int i7) {
        return (int) Math.max(-org.telegram.messenger.g0.L(2.0f), (((((this.f44741z0.getMeasuredHeight() - this.Wa) - this.N9) - this.f44702w.e()) - org.telegram.messenger.g0.L(53.0f)) - i7) / 2.0f);
    }

    public final boolean ea() {
        if (this.f44568l4 != null) {
            return true;
        }
        return false;
    }

    public final void eb(int i7, org.telegram.messenger.ij ijVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.id.u(ijVar.f23266k.date, false);
        tL_message.f26981id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ijVar.f23266k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.currentAccount, tL_message, false, false);
        ijVar2.D = 10;
        ijVar2.U = 1;
        ijVar2.f23263j0 = true;
        ijVar2.f23268k1 = p9(ijVar.X);
        this.C0.P.add(i7, ijVar2);
    }

    public final void ec(boolean z9, org.telegram.messenger.ij ijVar, org.telegram.messenger.ij ijVar2, ArrayList arrayList, TLRPC.WebPage webPage, boolean z10, int i7, sm smVar, boolean z11, long j3) {
        fc(z9, ijVar, ijVar2, arrayList, webPage, z10, i7, smVar, z11, j3, null, true);
    }

    public final void ed(boolean z9) {
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
        if ((!ea() || this.f44693v4) && this.Z2 != null) {
            if (!this.f44480e6) {
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
            if (objArr == null && !this.dc && !this.W2) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr != null && !this.dc && !this.W2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.dc && !this.W2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (objArr2 == objArr && z11 == z15 && z12 == z13) {
                z16 = false;
            } else {
                AnimatorSet animatorSet = this.f44421a3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f44421a3 = null;
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
                    this.f44421a3 = animatorSet2;
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
                    this.f44421a3.setInterpolator(org.telegram.ui.Components.wq.h);
                    this.f44421a3.setDuration(360L);
                    this.f44421a3.addListener(new cl(this, z13, z14, z15));
                    this.f44421a3.start();
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
                if (ea() && !this.f44693v4) {
                    boolean z17 = z16;
                    this.N2.c(z17 ? 1 : 0, 1, z17);
                    return;
                }
                this.N2.c((this.T4.size() - 1) - Collections.binarySearch(this.T4, Integer.valueOf(this.X4), Comparator$CC.reverseOrder()), this.T4.size(), z10);
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7() {
        ArrayList arrayList;
        int i7;
        if (this.f44575lb) {
            int i10 = -1;
            int i11 = 0;
            long j3 = 0;
            while (true) {
                arrayList = this.K6;
                if (i11 >= arrayList.size()) {
                    break;
                }
                long d12 = ((org.telegram.messenger.ij) arrayList.get(i11)).d1();
                if (j3 != d12) {
                    if (i10 >= 0 && j3 != 0 && (i7 = i11 - i10) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < i7; i12++) {
                            arrayList2.add((org.telegram.messenger.ij) arrayList.remove(i10));
                        }
                        Collections.sort(arrayList2, new pe(3));
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
                    arrayList3.add((org.telegram.messenger.ij) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void f8() {
        int i7;
        if (this.f44490f2 == null && getParentActivity() != null) {
            if (this.L2 == null) {
                a8();
            }
            org.telegram.ui.Components.m11 m11Var = new org.telegram.ui.Components.m11(getParentActivity(), this, this.currentAccount, a(), O6(), getResourceProvider());
            this.f44490f2 = m11Var;
            m11Var.R = new ae(this, 6);
            m11Var.setSideMenuBackgroundDrawable(this.K.c(m11Var, c8.g0.o(this.f44750za), false));
            org.telegram.ui.Components.m11 m11Var2 = this.f44490f2;
            m11Var2.setTopMenuBackgroundDrawable(this.K.c(m11Var2, c8.g0.o(this.f44750za), false));
            this.f44490f2.setCurrentTopic(b());
            this.f44490f2.setOnNewTopicSelected(new ae(this, 7));
            this.f44490f2.setOnTopicSelected(new me(this, 0));
            this.f44490f2.setOnDialogSelected(new me(this, 1));
            int indexOfChild = this.l1.indexOfChild(this.Y);
            if (indexOfChild >= 0) {
                i7 = indexOfChild + 1;
            } else {
                i7 = 8;
            }
            this.l1.addView(this.f44490f2, i7, c8.ha.f(-1.0f, -1, 51, 0, -org.telegram.messenger.g0.L(5.0f), 0, 0));
            this.f44490f2.p();
            Cd();
            lj ljVar = this.W1;
            if (ljVar != null) {
                ljVar.bringToFront();
            }
        }
    }

    public final int f9(org.telegram.messenger.ij ijVar) {
        return e9(V8(ijVar, !TextUtils.isEmpty(this.f44496f8))) - xb(ijVar);
    }

    public final boolean fa() {
        if (Y9()) {
            return getMessagesController().G1().e();
        }
        org.telegram.ui.Components.m11 m11Var = this.f44490f2;
        if (m11Var == null || !m11Var.f35794a.f55499f) {
            return false;
        }
        if (!org.telegram.messenger.t3.u0(this.f44473e)) {
            TLRPC.User user = this.f44487f;
            if (!org.telegram.messenger.t10.u(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void fb(Bundle bundle, org.telegram.messenger.ij ijVar) {
        TLRPC.Peer peer;
        TLRPC.Chat chat = this.f44473e;
        if (chat != null && org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.p0(this.f44473e)) {
            TLRPC.Chat chat2 = this.f44473e;
            if (chat2.broadcast_messages_allowed && chat2.linked_monoforum_id != 0 && getMessagesController().M0(Long.valueOf(this.f44473e.linked_monoforum_id)) != null && !org.telegram.messenger.t3.z(this.currentAccount, 24, -this.f44473e.linked_monoforum_id)) {
                org.telegram.messenger.qp messagesController = getMessagesController();
                TLRPC.Chat chat3 = this.f44473e;
                long j3 = chat3.f26960id;
                long j10 = chat3.linked_monoforum_id;
                ConcurrentHashMap concurrentHashMap = messagesController.f24780f;
                concurrentHashMap.put(Long.valueOf(j3), Long.valueOf(j10));
                concurrentHashMap.put(Long.valueOf(j10), Long.valueOf(j3));
                bundle.putLong("reply_to_channel_direct", -this.f44473e.linked_monoforum_id);
                return;
            }
        }
        TLRPC.Message message = ijVar.f23266k;
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

    public final void fc(boolean r32, org.telegram.messenger.ij r33, org.telegram.messenger.ij r34, java.util.ArrayList r35, org.telegram.tgnet.TLRPC.WebPage r36, boolean r37, int r38, org.telegram.ui.sm r39, boolean r40, long r41, org.telegram.messenger.nj r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.fc(boolean, org.telegram.messenger.ij, org.telegram.messenger.ij, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.sm, boolean, long, org.telegram.messenger.nj, boolean):void");
    }

    public final void fd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.fd(int, boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.g1 g1Var = this.f44483e9;
        if (g1Var != null) {
            g1Var.f27493e = false;
            P7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f44473e;
    }

    public final void g7(boolean z9) {
        jg.m1 m1Var;
        if (this.f44451c4 == 2 && (m1Var = this.f44422a4) != null) {
            String str = this.I3;
            fi.v9 v9Var = m1Var.E;
            if (!TextUtils.equals(m1Var.f16849y, str)) {
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
                org.telegram.messenger.g0.r(v9Var);
                di.l6 l6Var = m1Var.D;
                if (l6Var != null && l6Var.I != 0) {
                    ConnectionsManager.getInstance(l6Var.f9695c).cancelRequest(l6Var.I, true);
                    l6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    m1Var.f16849y = str;
                    m1Var.D = new di.l6(m1Var.f16845r, str2, trim);
                    if (z9) {
                        v9Var.run();
                    } else {
                        org.telegram.messenger.g0.i3(v9Var, 1000L);
                    }
                }
                di.l6 l6Var2 = m1Var.D;
                if (l6Var2 != null && l6Var2.J > 0) {
                    m1Var.f();
                }
            }
        }
    }

    public final void g8() {
        if (this.M3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f44750za);
            this.M3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.l1.addView(this.M3, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int g9(View view) {
        org.telegram.messenger.a8.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.f44741z0.getMeasuredHeight() - view.getBottom()) - this.f44741z0.getPaddingBottom()) + "} chatHeight=" + this.f44741z0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f44741z0.getPaddingBottom());
        return (this.f44741z0.getMeasuredHeight() - view.getBottom()) - this.f44741z0.getPaddingBottom();
    }

    public final void ga(int i7) {
        int i10;
        TLRPC.Message message;
        int i11;
        ArrayList arrayList = this.K6;
        if (!arrayList.isEmpty()) {
            int i12 = 1;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
            if ((((org.telegram.messenger.ij) arrayList.get(0)).f23266k.date >= i7 && ijVar.f23266k.date <= i7) || (ijVar.f23266k.date >= i7 && this.S6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(size);
                    if (ijVar2.f23266k.date >= i7 && ijVar2.e1() != 0) {
                        int e12 = ijVar2.e1();
                        if (org.telegram.messenger.ij.B0(ijVar2.f23266k) != this.f44440b7) {
                            i12 = 0;
                        }
                        l(e12, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.m5.C(this.f44545j6)) {
                int N0 = this.B0.N0();
                int L0 = this.B0.L0();
                while (true) {
                    if (L0 <= N0) {
                        ll llVar = this.C0;
                        int i13 = llVar.J;
                        if (L0 >= i13 && L0 < llVar.K && (message = ((org.telegram.messenger.ij) arrayList.get(L0 - i13)).f23266k) != null) {
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
                this.f44585m9.f(i10);
                org.telegram.ui.ActionBar.u1 u1Var = this.Rb;
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                ed(false);
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), this.f44750za);
                this.Rb = u1Var2;
                u1Var2.setOnCancelListener(this.Ha);
                this.Rb.r(1000L);
                int i14 = this.f44570l6;
                this.f44608o9 = i14;
                this.f44634q9 = false;
                this.f44722x6.add(Integer.valueOf(i14));
                this.f44621p9 = 0;
                this.f44648r9 = false;
                org.telegram.messenger.qp messagesController = getMessagesController();
                long j3 = this.f44545j6;
                long j10 = this.f44440b7;
                int i15 = this.classGuid;
                int i16 = this.f44492f4;
                long j11 = this.f44643r4;
                int i17 = this.A4;
                int i18 = this.f44570l6;
                this.f44570l6 = i18 + 1;
                messagesController.Y2(j3, j10, false, 30, 0, i7, true, 0, i15, 4, i16, j11, i17, i18, this.f44693v4);
                this.f44567l3.setAlpha(0.0f);
                this.f44567l3.setTag(null);
                this.f44706w3 = 0.0f;
                Sc();
                this.f44579m3.setTag(null);
            }
        }
    }

    public final void gb() {
        int i7;
        this.T4.clear();
        this.V4.clear();
        this.X4 = 0;
        this.f44438b5 = 0;
        this.f44452c5 = 0;
        fd(0, true);
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        long a10 = a();
        TLRPC.ChatFull chatFull = this.f44620p8;
        if (chatFull == null) {
            i7 = 0;
        } else {
            i7 = chatFull.pinned_msg_id;
        }
        mediaDataController.Q0(0, i7, a10);
        this.f44465d5 = true;
        gd();
    }

    public final void gc(ArrayList arrayList) {
        ec(true, null, null, arrayList, null, true, 0, null, false, 0L);
    }

    public final void gd() {
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f44693v4 && !this.V4.isEmpty() && this.T4.size() == 1 && ((Integer) this.T4.get(0)).intValue() == b() + 1) {
            ijVar = (org.telegram.messenger.ij) this.V4.get(this.T4.get(0));
        } else {
            ijVar = null;
        }
        this.f44580m4 = ijVar;
        if (this.f44693v4 && ijVar != null && (message = ijVar.f23266k) != null && (tL_forumTopic = this.f44629q4) != null && !org.telegram.messenger.ij.v5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.f44473e;
            TLRPC.Peer peer = this.f44580m4.f23266k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f26960id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f26960id == peer.chat_id) {
                        return;
                    }
                }
                this.f44580m4 = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n4 getBackButtonState() {
        return org.telegram.ui.ActionBar.n4.f28318a;
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.p3.f28378c;
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var;
        if (this.f44492f4 == 0 && (r3Var = this.f44584m8) != null && (r3Var.f25226b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f44492f4 == 2) {
            ArrayList arrayList = this.K6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(80.0f) + V8((org.telegram.messenger.ij) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.f44750za;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.m5 m5Var;
        org.telegram.ui.ActionBar.m5 m5Var2;
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
        if (this.f44683u7) {
            return null;
        }
        int i7 = 0;
        if (this.f44699va) {
            this.f44699va = false;
            return null;
        }
        f6 f6Var = new f6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ce));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.De));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ee));
        X9();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.F8));
        wi wiVar = this.f44601o1;
        if (wiVar != null) {
            m5Var = wiVar.getTitleTextView();
        } else {
            m5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(m5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A8));
        wi wiVar2 = this.f44601o1;
        if (wiVar2 != null) {
            m5Var2 = wiVar2.getTitleTextView();
        } else {
            m5Var2 = null;
        }
        int i10 = org.telegram.ui.ActionBar.m6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(m5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        wi wiVar3 = this.f44601o1;
        if (wiVar3 != null) {
            view = wiVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(i10, view));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.m6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(lVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28265x8));
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
            int i12 = org.telegram.ui.ActionBar.m6.f28190ta;
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, u4Var2.A, (org.telegram.ui.ActionBar.u6) null, i12));
            Drawable[] drawableArr2 = u4Var5.A;
            int i13 = org.telegram.ui.ActionBar.m6.f28135qb;
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.u6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, u4Var6.A, (org.telegram.ui.ActionBar.u6) null, i13));
        }
        if (!this.f44750za.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{u4Var5, u4Var6}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28154rb));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{u4Var5, u4Var6}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28172sb));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{u4Var5, u4Var6}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28191tb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{u4Var7, u4Var8}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27915ed));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27933fd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Yb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28024kc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28059mc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28043lc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27898df));
        this.f44750za.getClass();
        vj vjVar = this.f44491f3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i14 = org.telegram.ui.ActionBar.m6.Ge;
        arrayList.add(new org.telegram.ui.ActionBar.v6(vjVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.S, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ll));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ne));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oe));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Yf));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27862bg));
        sj sjVar = this.Z;
        int i15 = org.telegram.ui.ActionBar.m6.f27843ag;
        arrayList.add(new org.telegram.ui.ActionBar.v6(sjVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27882cg));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Uf));
        sj sjVar2 = this.Z;
        if (sjVar2 != null) {
            gyVar = sjVar2.getEmojiView();
        } else {
            gyVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28308zf));
        sj sjVar3 = this.Z;
        if (sjVar3 != null) {
            gyVar2 = sjVar3.getEmojiView();
        } else {
            gyVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar2, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Af));
        sj sjVar4 = this.Z;
        if (sjVar4 != null) {
            gyVar3 = sjVar4.getEmojiView();
        } else {
            gyVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar3, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Bf));
        sj sjVar5 = this.Z;
        if (sjVar5 != null) {
            gyVar4 = sjVar5.getEmojiView();
        } else {
            gyVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar4, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Df));
        sj sjVar6 = this.Z;
        if (sjVar6 != null) {
            gyVar5 = sjVar6.getEmojiView();
        } else {
            gyVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar5, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ef));
        sj sjVar7 = this.Z;
        if (sjVar7 != null) {
            gyVar6 = sjVar7.getEmojiView();
        } else {
            gyVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar6, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Gf));
        sj sjVar8 = this.Z;
        if (sjVar8 != null) {
            gyVar7 = sjVar8.getEmojiView();
        } else {
            gyVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar7, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Hf));
        sj sjVar9 = this.Z;
        if (sjVar9 != null) {
            gyVar8 = sjVar9.getEmojiView();
        } else {
            gyVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar8, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Lf));
        sj sjVar10 = this.Z;
        if (sjVar10 != null) {
            gyVar9 = sjVar10.getEmojiView();
        } else {
            gyVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar9, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Cf));
        sj sjVar11 = this.Z;
        if (sjVar11 != null) {
            gyVar10 = sjVar11.getEmojiView();
        } else {
            gyVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar10, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28290yf));
        sj sjVar12 = this.Z;
        if (sjVar12 != null) {
            gyVar11 = sjVar12.getEmojiView();
        } else {
            gyVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar11, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Jf));
        sj sjVar13 = this.Z;
        if (sjVar13 != null) {
            gyVar12 = sjVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(gyVar12, 0, new Class[]{org.telegram.ui.Components.gy.class}, (String[]) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ff));
        sj sjVar14 = this.Z;
        if (sjVar14 != null) {
            org.telegram.ui.Components.e31 trendingStickersAlert = sjVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.U());
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.Z.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kl));
        }
        for (int i16 = 0; i16 < 2; i16++) {
            if (i16 == 0) {
                view2 = this.M3;
            } else {
                view2 = this.N3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.tj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Of));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28226v7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28207u7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28283y7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.N2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f27890d6));
        NumberTextView numberTextView = this.T2;
        int i17 = org.telegram.ui.ActionBar.m6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.v6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i17));
        ImageView imageView = this.f44503g3;
        int i18 = org.telegram.ui.ActionBar.m6.f28302z8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44517h3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44577m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44741z0, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28215uf));
        fi.p5 p5Var = this.R;
        int i19 = org.telegram.ui.ActionBar.m6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.v6(p5Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44614p2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44577m1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28019k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27990ig));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28009jg));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jh));
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
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27834a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qk));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.sk));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.rk));
        int i20 = org.telegram.ui.ActionBar.m6.tk;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i20));
        yh.d dVar = this.Aa;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(dVar.f59521g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.v6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Re));
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.v6) obj).f28639n = this.f44750za;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f44750za.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f44750za.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.m6.V0(str);
    }

    public final void h7() {
        this.T.d();
        dd();
        Nc();
        B7();
        y7();
        D7();
        C7();
        G7();
        M9();
        boolean z9 = true;
        if (this.f44702w.f54564s == 1) {
            z9 = false;
        }
        if (this.f44650rb != z9) {
            this.f44650rb = z9;
            checkSystemBarColors();
        }
    }

    public final ArrayList h8(org.telegram.messenger.ij ijVar, boolean z9) {
        ArrayList k10 = org.telegram.messenger.k5.k(ijVar);
        int e12 = ijVar.e1();
        ijVar.A0();
        if (e12 != 0) {
            ArrayList arrayList = this.K6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(size);
                if ((org.telegram.messenger.ij.B0(ijVar2.f23266k) != this.f44440b7 || org.telegram.messenger.ij.B0(ijVar.f23266k) == this.f44440b7) && (((this.h == null && ijVar2.e1() > e12) || (this.h != null && ijVar2.e1() < e12)) && ((org.telegram.messenger.ij.R4(ijVar2.f23266k) || ijVar2.h4()) && !ijVar2.S4() && !ijVar2.g4() && (!z9 || (ijVar2.f23266k.media_unread && !ijVar2.N3()))))) {
                    k10.add(ijVar2);
                }
            }
        }
        return k10;
    }

    public final um h9() {
        if (this.Tc == null) {
            this.Tc = new um(this);
        }
        return this.Tc;
    }

    public final void ha(org.telegram.ui.ActionBar.g1 g1Var) {
        if (Build.VERSION.SDK_INT >= 30 && g1Var != null && g1Var.isShowing()) {
            View contentView = g1Var.getContentView();
            View rootView = contentView.getRootView();
            final boolean[] zArr = new boolean[1];
            final bi.u0 u0Var = new bi.u0(this, rootView, zArr, g1Var, contentView, 25);
            rootView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    zArr[0] = false;
                    view.post(u0Var);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
            rootView.addOnLayoutChangeListener(new og(u0Var, 0));
            rootView.requestApplyInsets();
        }
    }

    public final void hb(org.telegram.messenger.ij ijVar) {
        if (ijVar == this.f44611oc) {
            this.f44611oc = null;
            yd(true);
            return;
        }
        org.telegram.messenger.mp O1 = getMessagesController().O1(this.f44545j6);
        if (O1 != null) {
            O1.f24074a.remove(ijVar);
        }
    }

    public final void hc(org.telegram.messenger.ij ijVar) {
        ec(true, ijVar, null, null, null, true, 0, null, false, 0L);
    }

    public final void hd(boolean z9) {
        boolean z10;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i7 = this.f44492f4) == 0 || i7 == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44717x1.e(4, z10, z9);
        this.f44717x1.c(4, this.A1, z9);
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.ij ijVar = this.f44568l4;
        if (ijVar != null && ijVar.M1() == 0 && org.telegram.messenger.t3.n(this.f44473e)) {
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
                Na("");
                ImageView imageView = this.f44517h3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                Cb(null, a22);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (M0 = getMessagesController().M0(Long.valueOf(j10))) != null) {
            Na("");
            ImageView imageView2 = this.f44517h3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Cb(M0, null);
        }
    }

    public final void i8(final int i7, final int i10, final boolean z9) {
        this.C0.M.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.K6;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
            int i12 = ijVar.f23266k.date;
            if (i12 <= i7 || i12 >= i10) {
                this.C0.M.add(ijVar);
            }
            i11++;
        }
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            cjVar.setEmptyView(null);
        }
        if (this.C0.M.isEmpty()) {
            vc(true);
        }
        ll llVar = this.C0;
        llVar.L = true;
        llVar.O(true);
        g8();
        UndoView undoView = this.M3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f44545j6, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                cn cnVar = cn.this;
                org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
                long j10 = cnVar.f44545j6;
                if (org.telegram.messenger.t3.T(cnVar.f44473e)) {
                    j3 = cnVar.f44545j6;
                } else {
                    j3 = 0;
                }
                messagesController.d0(j10, j3, i7, i10, z9, new xf(cnVar, 20));
            }
        }, new xf(this, 18));
    }

    public final long i9() {
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        org.telegram.messenger.ij ijVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.t3.p0(this.f44473e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f44473e, 24)) {
            return 0L;
        }
        long j3 = this.f44643r4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && (ijVar2 = this.F5) != null && (message2 = ijVar2.f23266k) != null) {
            return org.telegram.messenger.m5.o(message2.saved_peer_id);
        }
        if (i7 == 0 && (ijVar = this.D5) != null && (message = ijVar.f23266k) != null) {
            return org.telegram.messenger.m5.o(message.saved_peer_id);
        }
        return j3;
    }

    public final void ia(ArrayList arrayList) {
        org.telegram.ui.Components.m11 m11Var;
        if (arrayList != null && (m11Var = this.f44490f2) != null && m11Var.T) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                if (ijVar != null && ijVar.D == 36) {
                    TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(ijVar.f23266k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f52928a;
                    if (n1 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!ijVar.S2) {
                            ijVar.S2 = true;
                            ijVar.n0(null);
                        }
                    }
                }
                if (ijVar != null && ijVar.P2() && !ijVar.P3() && ijVar.c1() != 0 && !ijVar.S2) {
                    ijVar.S2 = true;
                    ijVar.n0(null);
                }
            }
        }
    }

    public final void ib(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(ijVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            ll llVar = this.C0;
            if (llVar != null && !llVar.N) {
                llVar.s(llVar.J + indexOf);
            }
        }
    }

    public final void ic(org.telegram.messenger.ij ijVar, sm smVar) {
        ec(true, ijVar, null, null, null, true, 0, smVar, false, 0L);
    }

    public final void id(boolean z9) {
        boolean z10;
        int i7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f44742z1 > 0 && ((i7 = this.f44492f4) == 0 || i7 == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44717x1.e(3, z10, z9);
        this.f44717x1.c(3, this.f44742z1, z9);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z9;
        int x02;
        if (X9()) {
            org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.f(org.telegram.ui.ActionBar.m6.f28246w8);
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28246w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z9 = org.telegram.ui.ActionBar.m6.I.q();
        } else {
            z9 = this.fc;
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
        nk nkVar;
        wh.i iVar;
        if ((this.f44492f4 == 5 && (this.K6.isEmpty() || this.f44643r4 == 0)) || (((s01Var = this.m0) != null && (s01Var.f37813y > 0.0f || s01Var.U)) || this.f44712w9 || this.f44486ed.f55499f || !this.I9 || (((nkVar = this.f44429ab) != null && nkVar.f34586s) || ((iVar = this.f44661sa) != null && iVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f44487f;
    }

    public final void j7() {
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
            bf bfVar = new bf(this, 20);
            this.O4 = bfVar;
            org.telegram.messenger.g0.h3(bfVar);
        }
    }

    public final void j8(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar, CharacterStyle characterStyle, String str) {
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
        org.telegram.ui.Components.jk0 jk0Var = new org.telegram.ui.Components.jk0(getParentActivity(), this.f44750za);
        I.f35214p = new ge(jk0Var, 0);
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
                i12 = 2131747791;
            } else {
                i12 = 2131747817;
            }
            String M0 = org.telegram.messenger.id.M0(i12, null);
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
            I.c(i7, org.telegram.messenger.id.M0(2131747793, null), new he(this, str, 0), false);
        } else if (!startsWith && !z13 && !z12 && z14 && !N2) {
            I.c(2131231925, org.telegram.messenger.id.M0(2131747791, null), new he(this, str, 1), false);
        }
        TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(ijVar);
        if ((m12 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = m12.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            ijVar2 = ijVar;
            I.c(2131231834, org.telegram.messenger.id.M0(2131747790, null), new ie(this, ijVar2, 0), false);
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
        I.c(2131232103, org.telegram.messenger.id.M0(i10, null), new aa.d0(this, str, ijVar2, startsWith, 26), false);
        if (N2 && !z13 && !startsWith && !str.startsWith("tg:")) {
            I.c(2131232504, org.telegram.messenger.id.M0(2131742941, null), new he(this, str, 2), false);
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

    public final int j9() {
        return this.l1.getBackgroundSizeY();
    }

    public final void ja() {
        this.P4 = true;
        if (this.C6) {
            org.telegram.messenger.yr messagesStorage = getMessagesStorage();
            messagesStorage.f26723a.c(new org.telegram.messenger.t8(messagesStorage, b(), this.f44545j6, new dg(this, 1), 5));
            return;
        }
        org.telegram.messenger.yr messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().j1(this.f44545j6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f44693v4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f44643r4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.B6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ld(3, this, messagesStorage2));
    }

    public final void jb(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(ijVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            ll llVar = this.C0;
            if (llVar != null && !llVar.N) {
                llVar.P(llVar.J + indexOf, true);
            }
        }
    }

    public final void jc(org.telegram.messenger.nj njVar) {
        fc(true, null, null, null, null, true, 0, null, false, 0L, njVar, true);
    }

    public final void jd(boolean z9) {
        String M0;
        if (this.f44492f4 != 3 && !org.telegram.messenger.t10.u(this.f44487f)) {
            wi wiVar = this.f44601o1;
            if (wiVar != null && this.f44643r4 != 0) {
                if (this.f44693v4) {
                    Ad();
                } else if (this.f44680u4) {
                    org.telegram.messenger.ij ijVar = this.f44568l4;
                    if (ijVar != null && ijVar.x2()) {
                        this.f44601o1.setTitle(org.telegram.messenger.id.G(this.f44568l4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131751996, null));
                    }
                } else {
                    org.telegram.messenger.ij ijVar2 = this.f44568l4;
                    if (ijVar2 != null) {
                        wiVar.setTitle(org.telegram.messenger.id.G(ijVar2.M1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f44616p4 != null) {
                if (this.f44568l4.M1() == 0) {
                    if (this.f44680u4) {
                        M0 = org.telegram.messenger.id.M0(2131748226, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131748168, null);
                    }
                } else {
                    M0 = org.telegram.messenger.id.M0(2131751375, null);
                }
                org.telegram.messenger.ij ijVar3 = this.f44616p4;
                ijVar3.f23266k.message = M0;
                ijVar3.v = M0;
                if (z9) {
                    this.C0.R(ijVar3, true, false);
                }
            }
        }
    }

    public final void k7(boolean z9) {
        if (this.D5 != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                    if (ijVar != null && ijVar.e1() == this.D5.e1() && org.telegram.messenger.ij.B0(ijVar.f23266k) == org.telegram.messenger.ij.B0(this.D5.f23266k)) {
                        this.D5 = ijVar;
                        sm smVar = this.B5;
                        if (smVar != null) {
                            smVar.a(ijVar);
                        }
                        if (z9) {
                            org.telegram.messenger.mj mjVar = this.f44694v5;
                            if (mjVar != null) {
                                org.telegram.messenger.ij ijVar2 = this.D5;
                                org.telegram.messenger.dj djVar = this.f44746z5;
                                if (djVar == null) {
                                    djVar = T8(ijVar2.c1());
                                }
                                mjVar.f(ijVar2, djVar, this.f44545j6, this.B5);
                            }
                            A8();
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

    public final void k8(CharacterStyle characterStyle, boolean z9, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var) {
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
            if (!V9() && (ijVar == null || (message = ijVar.f23266k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.q1 q1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.a41) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.a41 a41Var = (org.telegram.ui.Components.a41) characterStyle;
                    org.telegram.messenger.g0.g(a41Var.f31703a.subSequence(a41Var.f31704b, a41Var.f31705c).toString());
                    g8();
                    UndoView undoView = this.M3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z9 && q1Var != null) {
                    q1Var.f3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.e41) {
                TLRPC.User a22 = getMessagesController().a2(Utilities.A(((org.telegram.ui.Components.e41) characterStyle).getURL()));
                if (a22 != null) {
                    org.telegram.messenger.qp.s1(this.currentAccount).z3(a22, null, this, 0);
                }
                if (z9 && q1Var != null) {
                    q1Var.f3(-1);
                }
                la(ijVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.zz) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.zz) characterStyle).f41164b;
                if (tL_messageEntityFormattedDate == null || (messageObject = q1Var.getMessageObject()) == null) {
                    q1Var2 = q1Var;
                } else {
                    if (messageObject.c1() != 0 && (djVar = (org.telegram.messenger.dj) this.N6.f(messageObject.c1())) != null) {
                        arrayList = djVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.k(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e10 = getUserConfig().e();
                    String A = org.telegram.messenger.id.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.k60 I = org.telegram.ui.Components.k60.I(this, q1Var);
                    org.telegram.ui.Components.jk0 jk0Var = new org.telegram.ui.Components.jk0(getParentActivity(), this.f44750za);
                    I.f35214p = new ge(jk0Var, 0);
                    I.c(2131232103, org.telegram.messenger.id.M0(2131746332, null), new ke(this, jk0Var, A, 0), false);
                    q1Var2 = q1Var;
                    I.c(2131232077, org.telegram.messenger.id.M0(2131746333, null), new bi.r7((org.telegram.messenger.ls) this, (Object) I, (Object) messageObject, (Object) q1Var, A, (Object) tL_messageEntityFormattedDate, (Object) jk0Var, 4), false);
                    I.c(2131232262, org.telegram.messenger.id.M0(2131746331, null), new bi.m3(this, I, e10, tL_messageEntityFormattedDate, arrayList2, jk0Var, 6), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    jk0Var.e(I);
                    jk0Var.f(q1Var2, characterStyle, spannableString, false);
                    showDialog(jk0Var);
                }
                if (q1Var2 != null) {
                    q1Var2.f3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.b41) {
                String url = ((org.telegram.ui.Components.b41) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    l8(q1Var, characterStyle, url.substring(4));
                    if (z9 && q1Var != null) {
                        q1Var.f3(-1);
                    }
                } else if (ijVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.y31.h) {
                        sj sjVar = this.Z;
                        TLRPC.Chat chat = this.f44473e;
                        if (chat == null || !chat.megagroup) {
                            z12 = false;
                        }
                        sjVar.a1(ijVar, url, z9, z12);
                        if (!z9 && this.Z.getFieldText() == null) {
                            C9(false);
                        }
                    }
                    if (z9 && q1Var != null) {
                        q1Var.f3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.E6;
                    if (ijVar != null && url.startsWith("video") && !z9) {
                        int intValue = Utilities.z(url).intValue();
                        if (ijVar.e5()) {
                            webPage2 = ijVar.f23266k.media.webpage;
                            ijVar4 = ijVar;
                        } else {
                            org.telegram.messenger.ij ijVar6 = ijVar.C;
                            if (ijVar6 != null && ijVar6.e5()) {
                                ijVar4 = ijVar.C;
                                webPage2 = ijVar4.f23266k.media.webpage;
                            } else {
                                ijVar4 = ijVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.vt.N0(this, ijVar4, this.f44444bb, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, U9());
                            return;
                        }
                        if (!org.telegram.messenger.ij.L4(ijVar4.f23266k) && (ijVar5 = ijVar4.C) != null) {
                            if (org.telegram.messenger.ij.B0(ijVar5.f23266k) == this.f44545j6) {
                                c10 = 0;
                            }
                            org.telegram.messenger.ij ijVar7 = (org.telegram.messenger.ij) sparseArrayArr[c10].get(ijVar4.C.e1());
                            if (ijVar7 == null) {
                                ijVar4 = ijVar4.C;
                            } else {
                                ijVar4 = ijVar7;
                            }
                        } else {
                            q1Var3 = q1Var;
                        }
                        ijVar4.f23231c0 = intValue / ((float) ijVar4.L0());
                        Ja(q1Var3, ijVar4);
                    } else if (ijVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!ijVar.I3() && (ijVar3 = ijVar.C) != null) {
                            if (org.telegram.messenger.ij.B0(ijVar3.f23266k) == this.f44545j6) {
                                c11 = 0;
                            }
                            ijVar2 = (org.telegram.messenger.ij) sparseArrayArr[c11].get(ijVar.C.e1());
                        } else {
                            ijVar2 = ijVar;
                        }
                        if (ijVar2 != null) {
                            float f10 = intValue2;
                            float L0 = f10 / ((float) ijVar2.L0());
                            MediaController mediaController = getMediaController();
                            if (mediaController.I(ijVar2)) {
                                ijVar2.f23226b0 = L0;
                                mediaController.i0(ijVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(ijVar2);
                                }
                            } else {
                                ijVar2.f23231c0 = f10 / ((float) ijVar2.L0());
                                mediaController.S(ijVar2);
                            }
                            if (z9 && q1Var != null) {
                                q1Var.f3(-1);
                            }
                            if (!org.telegram.messenger.ij.R4(ijVar2.f23266k)) {
                                showDialog(new org.telegram.ui.Components.a8(getParentActivity(), this.f44750za));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        bi.l4 l4Var = new bi.l4(this, q1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            ii ma = ma(q1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (ma != null) {
                                ma.f57332b = new jq0(zArr, 23);
                                ma.d();
                            }
                            x10.Z(new bi.t3(this, zArr, ma, userArr, l4Var, 1), substring);
                        } else {
                            l4Var.run();
                        }
                        if (q1Var != null) {
                            q1Var.f3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        ii ma2 = ma(q1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        ma2.f57332b = new re(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new bi.r8(this, ma2, q1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().N3, 1, true), 2);
                        ma2.d();
                        q1Var.f3(-1);
                    } else {
                        Ba(characterStyle, url, z9, q1Var, ijVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    l8(q1Var, characterStyle, url2.substring(4));
                } else if (z9) {
                    j8(q1Var, ijVar, characterStyle, url2);
                    if (q1Var != null) {
                        q1Var.f3(-1);
                    }
                } else {
                    la(ijVar, false, false);
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
                            i10 = ijVar.e1();
                        } else {
                            i10 = 0;
                        }
                        if (Ga(url2, q1Var, characterStyle, i10, 1)) {
                            return;
                        }
                    } else {
                        if (ijVar != null) {
                            TLRPC.MessageMedia messageMedia = ijVar.f23266k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = ijVar.f23266k.media.webpage.url.toLowerCase();
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
                            i7 = ijVar.e1();
                        } else {
                            i7 = 0;
                        }
                        if (!Ga(url2, q1Var, characterStyle, i7, 1)) {
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
                    Ya(2, url2, characterStyle, q1Var, z10);
                }
            }
        }
    }

    public final float k9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.l1.getBackgroundTranslationY()) - ((1.0f - this.S9) * this.N9);
    }

    public final void ka(boolean z9) {
        TLRPC.Chat chat;
        if (this.Ca == null && (chat = this.f44473e) != null && org.telegram.messenger.t3.k(chat) && this.Z != null && !org.telegram.messenger.t3.p0(this.f44473e)) {
            TLRPC.TL_channels_sendAsPeers M1 = getMessagesController().M1(this.f44545j6, false);
            this.Ca = M1;
            if (M1 != null) {
                this.Z.S1(false, z9);
            }
        }
    }

    public final void kb() {
        if (this.f44496f8 == null && this.f44508g8 == null && this.f44521h8 == null) {
            ae aeVar = this.f44561k8;
            if (aeVar != null) {
                org.telegram.messenger.g0.r(aeVar);
                this.f44561k8 = null;
            }
            this.f44441b8 = Integer.MAX_VALUE;
            this.f44468d8 = false;
            this.f44482e8 = 0L;
            this.f44496f8 = null;
            this.f44508g8 = null;
            this.f44521h8 = null;
        }
    }

    public final void kc(boolean z9, TLRPC.WebPage webPage, boolean z10) {
        ec(z9, null, null, null, webPage, true, 0, null, z10, 0L);
    }

    public final void kd(int i7, org.telegram.messenger.ij ijVar) {
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
                ll llVar = this.C0;
                if (llVar != null) {
                    llVar.R(ijVar3, true, false);
                }
            }
        }
        if (ijVar == null) {
            sparseArray.remove(i7);
        }
    }

    @Override
    public final void l(int i7, int i10, boolean z9, int i11, boolean z10, int i12) {
        Ab(i7, i10, z9, i11, z10, i12, null, null, null);
    }

    public final void l7() {
        wj wjVar;
        vj vjVar;
        vj vjVar2;
        sj sjVar = this.Z;
        if (sjVar != null && sjVar.f31180z3) {
            MediaController.B().N = false;
            return;
        }
        TLRPC.Chat chat = this.f44473e;
        if (chat != null && !org.telegram.messenger.t3.v(chat)) {
            MediaController.B().N = false;
        } else if (!org.telegram.messenger.t0.f25578x && (((wjVar = this.f44448c1) == null || wjVar.getVisibility() != 0) && (((vjVar = this.S) == null || vjVar.getVisibility() != 0) && ((vjVar2 = this.f44491f3) == null || vjVar2.getVisibility() != 0)))) {
            MediaController.B().N = true;
        } else {
            MediaController.B().N = false;
        }
    }

    public final void l8(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, String str) {
        ii ma = ma(q1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f22619k0.get(pf.b.d(str, false));
        bi.z2 z2Var = new bi.z2(this, q1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                z2Var.a(a22);
                return;
            } else {
                getMessagesStorage().f26723a.c(new o1(this, tL_contact, z2Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        ma.f57332b = new re(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new z9(this, ma, z2Var, 3)), 0);
        ma.d();
    }

    public final float l9() {
        org.telegram.ui.Components.m11 m11Var = this.f44490f2;
        if (m11Var != null) {
            return m11Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void la(org.telegram.messenger.ij ijVar, boolean z9, boolean z10) {
        if (ijVar != null && ijVar.r4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = ijVar.P0;
            tL_messages_clickSponsoredMessage.media = z9;
            tL_messages_clickSponsoredMessage.fullscreen = z10;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void lb(boolean z9) {
        org.telegram.messenger.ij ijVar = this.Z7;
        if (ijVar != null) {
            if (z9) {
                boolean[] zArr = this.U6;
                zArr[1] = true;
                zArr[0] = true;
                this.X7 = 0;
                this.f44425a7 = 0;
            }
            this.T7 = 0;
            this.U7 = false;
            ib(ijVar);
            this.Z7 = null;
        }
    }

    public final void lc(boolean z9) {
        if (this.f44567l3 != null && !W9()) {
            if (this.f44567l3.getTag() == null) {
                AnimatorSet animatorSet = this.f44679u3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f44567l3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44679u3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f44679u3.playTogether(ObjectAnimator.ofFloat(this.f44567l3, View.ALPHA, 1.0f));
                this.f44679u3.addListener(new gi(this, 4));
                this.f44679u3.start();
            }
            if (!z9) {
                N9();
                this.f44603o3 = 1000;
            }
        }
    }

    public final void ld(boolean z9) {
        sj sjVar = this.Z;
        if (sjVar != null) {
            sjVar.Q1(z9);
        }
    }

    public final boolean m7(boolean z9, boolean z10) {
        sj sjVar = this.Z;
        if (sjVar == null || !sjVar.u0()) {
            return false;
        }
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44750za);
            boolean z11 = this.Z.f31045c1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            if (z11) {
                u1Var.R = org.telegram.messenger.id.M0(2131751395, null);
                u1Var.T = org.telegram.messenger.id.M0(2131751396, null);
            } else {
                u1Var.R = org.telegram.messenger.id.M0(2131751392, null);
                u1Var.T = org.telegram.messenger.id.M0(2131751393, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751394, null), new ab.y(5, this, z10));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751771, null), null);
            showDialog(u1Var);
            return true;
        }
        return true;
    }

    public final void m8(org.telegram.ui.Cells.z r31, final org.telegram.tgnet.TLRPC.ReactionCount r32, boolean r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.m8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int m9() {
        return (int) (l9() * org.telegram.messenger.g0.L(71.0f));
    }

    public final ii ma(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle) {
        vf.b bVar = this.f44459cc;
        if (bVar != null) {
            bVar.a(true);
            this.f44459cc = null;
        }
        if (characterStyle != null && q1Var != null && q1Var.getMessageObject() != null) {
            ii iiVar = new ii(this, q1Var.getMessageObject().e1(), characterStyle, q1Var, 0);
            this.f44459cc = iiVar;
            return iiVar;
        }
        this.f44459cc = null;
        return null;
    }

    public final void mb(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.mb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void mc(boolean z9) {
        if (this.f44579m3 != null && !W9()) {
            if (this.f44579m3.getTag() == null) {
                ValueAnimator valueAnimator = this.f44692v3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f44579m3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44706w3, 1.0f);
                this.f44692v3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f44692v3.addUpdateListener(new ce(this, 2));
                this.f44692v3.addListener(new gi(this, 6));
                this.f44692v3.start();
            }
            if (!z9) {
                N9();
                this.f44603o3 = 1000;
            }
        }
    }

    public final void md(int i7, int i10, int i11) {
        float f10;
        int i12;
        boolean z9;
        boolean z10;
        lh.h hVar = this.f44717x1;
        boolean z11 = false;
        if (hVar != null) {
            int i13 = 2;
            if (this.f44575lb) {
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
            h6.m mVar = hVar.f18389e[6];
            if (mVar != null) {
                ((kh.b) mVar.f14266b).b(z9, true);
            }
            lh.h hVar2 = this.f44717x1;
            if (this.f44575lb) {
                i13 = 1;
            }
            if ((i7 & i13) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar2.b(5).f3277c = z10;
            h6.m mVar2 = hVar2.f18389e[5];
            if (mVar2 != null) {
                ((kh.b) mVar2.f14266b).b(z10, true);
            }
        }
        this.K3 = i11;
        this.L3 = i10;
        nd();
        org.telegram.ui.Components.i6 i6Var = this.j3;
        if (i6Var != null) {
            if (i11 > 0) {
                z11 = true;
            }
            i6Var.setClickable(z11);
            ViewPropertyAnimator animate = this.j3.animate();
            if (i11 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        boolean z11;
        String str2 = null;
        C8(str, null);
        if (u7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, this.f44545j6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = X8();
                z11 = z10;
                b10.L = z11;
                b10.Q = j10;
                b10.R = i9();
                b10.T = this.f44708w5;
                org.telegram.messenger.gz.C(this.currentAccount).r0(b10);
            } else {
                z11 = z10;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f44545j6, false, false, true, 0, 0, null, -1, j10, i9(), this.f44708w5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j11 = this.f44545j6;
            org.telegram.messenger.ij ijVar = this.D5;
            org.telegram.messenger.ij ijVar2 = this.f44568l4;
            sm smVar = this.B5;
            String str3 = str2;
            org.telegram.messenger.gz.V(i7, j11, j3, j10, i9(), str3, null, arrayList, arrayList, null, arrayList2, null, null, accountInstance, ijVar, ijVar2, this.F5, this.f44708w5, X8(), null, smVar, null, null, z9, z11);
            L6();
        }
    }

    public final void n7() {
        if (!this.f44688uc) {
            this.f44688uc = true;
            if (!this.f44701vc && this.f44492f4 == 0 && !getMessagesController().G1().f26216b && getMessagesController().G1().c() > 2) {
                if (this.J1 != null && org.telegram.messenger.qp.e1().getInt("savedhint", 0) < 1) {
                    this.J1.w();
                    this.f44701vc = true;
                    org.telegram.messenger.qp.e1().edit().putInt("savedhint", org.telegram.messenger.qp.e1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.qp.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.K1 != null && org.telegram.messenger.qp.e1().getInt("savedsearchhint", 0) < 1) {
                    this.K1.w();
                    this.f44701vc = true;
                    org.telegram.messenger.qp.e1().edit().putInt("savedsearchhint", org.telegram.messenger.qp.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    o7();
                }
            }
        }
    }

    public final void n8(int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.n8(int, java.lang.Object[]):void");
    }

    public final org.telegram.ui.ActionBar.r0 n9() {
        org.telegram.ui.ActionBar.r0 r0Var = this.f44565l0;
        if (r0Var != null && r0Var.getVisibility() == 0 && this.f44565l0.getWidth() != 0 && this.actionBar != null && (this.f44565l0.getParent() instanceof View)) {
            return this.f44565l0;
        }
        return null;
    }

    public final void na(org.telegram.messenger.ij ijVar) {
        if (ijVar != null && ijVar.r4() && !ijVar.f23296s0) {
            ijVar.f23296s0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = ijVar.P0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void nb() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.K7 = 0;
        this.A7 = false;
        this.B7 = true;
        this.f44722x6.clear();
    }

    public final boolean nc() {
        sj sjVar = this.Z;
        if (sjVar != null && sjVar.getVisibility() == 0) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("gifhint", false)) {
                e12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f44655s2 == null) {
                    if (!this.f44644r5) {
                        sj sjVar2 = this.Z;
                        if (sjVar2 != null) {
                            sjVar2.Q();
                            org.telegram.messenger.ui.b0(sjVar2.Q).V0(0, true, true, false);
                            org.telegram.ui.Components.lf lfVar = sjVar2.U0;
                            lfVar.L(false, false);
                            lfVar.Q(false, false);
                            lfVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        ql qlVar = this.l1;
                        int indexOfChild = qlVar.indexOfChild(this.T);
                        if (indexOfChild != -1) {
                            sj sjVar3 = this.Z;
                            sjVar3.Q();
                            org.telegram.messenger.ui.b0(sjVar3.Q).V0(0, true, true, false);
                            org.telegram.ui.Components.lf lfVar2 = sjVar3.U0;
                            lfVar2.L(false, false);
                            lfVar2.Q(false, false);
                            lfVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.K2 = view;
                            view.setBackgroundResource(2131232674);
                            int i7 = indexOfChild + 1;
                            qlVar.addView(this.K2, i7, c8.ha.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            fi.m3 E6 = E6(310.0f, 3, i7, false);
                            this.f44655s2 = E6;
                            E6.d = 2300L;
                            E6.u(org.telegram.messenger.id.M0(2131744268, null));
                            this.K2.setAlpha(0.0f);
                            this.K2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.Z.getEmojiButton();
                            if (emojiButton != null) {
                                this.f44655s2.y(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void nd() {
        org.telegram.ui.Components.i6 i6Var = this.f44530i3;
        if (i6Var != null) {
            boolean z9 = !org.telegram.messenger.id.f23161a0;
            int i7 = this.K3;
            if (i7 < 0) {
                i6Var.c("", z9, true);
            } else if (i7 == 0) {
                i6Var.c(org.telegram.messenger.id.M0(2131748167, null), z9, true);
            } else if (this.F3) {
                i6Var.c(org.telegram.messenger.id.G(i7, "TaggedMessages", new Object[0]), z9, true);
            } else if (this.f44492f4 != 7 && !this.f44486ed.f55499f) {
                i6Var.c(org.telegram.messenger.id.a0(null, null, 2131747829, Integer.valueOf(this.L3 + 1), Integer.valueOf(this.K3)), z9, true);
            } else {
                i6Var.c(org.telegram.messenger.id.G(i7, "SearchMessagesResultCount", org.telegram.messenger.id.E(i7, ' ')), z9, true);
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f44492f4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((f2Var instanceof cn) && ((cn) f2Var).U9()) {
                return false;
            }
        }
        return this.X6;
    }

    public final void o7() {
        org.telegram.ui.Cells.q1 q1Var;
        fi.m3 m3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z9;
        fi.m3 m3Var2 = this.L1;
        if (m3Var2 != null && !m3Var2.V && !this.xc && this.f44688uc && !this.f44486ed.f55499f && System.currentTimeMillis() - this.wc > 1800 && org.telegram.messenger.qp.e1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f44741z0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f44741z0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        ch.p0 p0Var = q1Var.N;
                        org.telegram.messenger.ij primaryMessageObject = q1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f23266k) == null || (tL_messageReactions = message.reactions) == null) {
                            z9 = false;
                        } else {
                            z9 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z9 && !p0Var.f6379s.isEmpty()) {
                            q1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + p0Var.f6365c;
                            if (f10 >= org.telegram.messenger.g0.L(240.0f) && f10 <= (org.telegram.messenger.g0.f22567q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f22562n) {
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
                this.xc = true;
                q1Var.getLocationInWindow(iArr);
                this.L1.setTranslationY(((iArr[1] - m3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)) + p0Var2.f6365c);
                this.L1.p(0.0f, (((ch.m0) p0Var2.f6379s.get(0)).f6340z / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + p0Var2.f6364b);
                this.L1.w();
                org.telegram.messenger.qp.e1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.g0.r(new ae(this, 22));
            org.telegram.messenger.g0.i3(new ae(this, 22), 2000L);
        }
    }

    public final void o8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.o8(int, java.lang.Object[]):void");
    }

    public final int o9(int i7) {
        SparseIntArray sparseIntArray = this.f44519h5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f44410md;
            f44410md = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final boolean oa() {
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.Components.u5 u5Var;
        org.telegram.messenger.ij ijVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.u5 m10;
        boolean z9;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        if (this.f44741z0 != null && ((ijVar = MediaController.B().f21300u0) == null || org.telegram.messenger.ij.L4(ijVar.f23266k))) {
            fi.m3 m3Var = this.H2;
            ArrayList arrayList = null;
            if (m3Var != null && m3Var.V && (q1Var = this.Jb) != null) {
                ImageReceiver photoImage2 = q1Var.getPhotoImage();
                u5Var = photoImage2.m();
                if (u5Var != null) {
                    ijVar2 = q1Var.getMessageObject();
                    if (photoImage2.A() + q1Var.getTop() > this.f44741z0.getMeasuredHeight()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.L8 = z10;
                } else {
                    ijVar2 = null;
                }
            } else {
                u5Var = null;
                ijVar2 = null;
            }
            if (ijVar2 == null) {
                int childCount = this.f44741z0.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = this.f44741z0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.ij messageObject = q1Var2.getMessageObject();
                        boolean h42 = messageObject.h4();
                        if (!messageObject.g4() && !messageObject.S4() && ((org.telegram.messenger.ij.L4(messageObject.f23266k) || h42) && messageObject.f23284p0 == null && (m10 = (photoImage = q1Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.L0;
                            float f10 = photoImage.N0 + top;
                            if (f10 >= 0.0f && top <= this.f44741z0.getMeasuredHeight()) {
                                if (ijVar2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f10 <= this.f44741z0.getMeasuredHeight()) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                this.L8 = z9;
                                if (top >= 0.0f && f10 <= this.f44741z0.getMeasuredHeight()) {
                                    ijVar2 = messageObject;
                                    u5Var = m10;
                                    break;
                                }
                                ijVar2 = messageObject;
                                u5Var = m10;
                            }
                        }
                    }
                    i7++;
                }
            }
            if (ijVar2 != null && !MediaController.B().I(ijVar2)) {
                F9(true);
                if (ijVar2.h4()) {
                    boolean S = MediaController.B().S(ijVar2);
                    MediaController B = MediaController.B();
                    if (S) {
                        arrayList = h8(ijVar2, false);
                    }
                    B.r0(arrayList, false);
                    return S;
                }
                org.telegram.messenger.iz.D(true);
                ijVar2.f23226b0 = u5Var.n();
                ijVar2.f23235d0 = u5Var.o();
                u5Var.stop();
                if (PhotoViewer.J1(ijVar2)) {
                    PhotoViewer.f41342f9.J0();
                }
                return MediaController.B().S(ijVar2);
            }
        }
        return false;
    }

    public final void ob() {
        this.f44430ac = null;
        this.Yb = 0;
        this.Zb = -1;
        this.f44445bc = null;
        this.f44459cc = null;
        this.f44717x1.d(false);
    }

    public final void oc() {
        TLRPC.ChatFull chatFull = this.f44620p8;
        if (chatFull != null && !this.G5) {
            TLRPC.Chat chat = this.f44473e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.g0.i3(new ae(this, 17), 1000L);
            }
        }
    }

    public final void od() {
        c8();
        String str = this.I3;
        if (str != null) {
            this.f44641r2.f32368e.setText(org.telegram.messenger.id.a0(null, null, 2131749354, str));
            this.Z3.setEmptyView(this.f44641r2);
            return;
        }
        this.Z3.setEmptyView(null);
        this.f44641r2.setVisibility(8);
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.t40 t40Var;
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.Components.we weVar;
        org.telegram.ui.ActionBar.u1 u1Var2;
        org.telegram.ui.Components.ue ueVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        rl rlVar;
        ch.q qVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getOpenMenuOverlay() != null) {
            if (z9 && (j5Var = this.actionBar.Z0) != null) {
                j5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.s01 s01Var = this.m0;
            if (s01Var != null && s01Var.f37813y > 0.0f) {
                if (z9) {
                    s01Var.d();
                    return false;
                }
            } else {
                org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
                if (bcVar != null) {
                    org.telegram.ui.Components.fb fbVar = bcVar.f32199e;
                    if (fbVar instanceof org.telegram.ui.Components.mb) {
                        if (z9) {
                            ((org.telegram.ui.Components.mb) fbVar).f();
                            bcVar.b();
                            return false;
                        }
                    }
                }
                vz0 vz0Var = this.f44686ua;
                if (vz0Var != null && !vz0Var.f50832b0) {
                    if (z9) {
                        vz0Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z9) {
                        closeSheet();
                        return false;
                    }
                } else {
                    ch.r rVar = this.f44673ta;
                    if (rVar != null && (qVar = rVar.f6388b) != null && qVar.getReactionsWindow() != null) {
                        if (z9) {
                            rVar.f6388b.e();
                            return false;
                        }
                    } else if (ns.p().E) {
                        if (z9) {
                            ns.p().n();
                            return false;
                        }
                    } else {
                        nk nkVar = this.f44429ab;
                        if (nkVar != null && nkVar.f34586s) {
                            if (z9) {
                                nkVar.a(true);
                                return false;
                            }
                        } else if (this.f44486ed.f55499f) {
                            if (z9) {
                                rc(false);
                                return false;
                            }
                        } else if (this.f44483e9 != null) {
                            if (z9) {
                                P7(true);
                                return false;
                            }
                        } else if (!m7(z9, false)) {
                            if (z9()) {
                                if (z9 && (rlVar = this.s9) != null && rlVar.x()) {
                                    this.s9.f(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                                if (lVar2 != null && lVar2.x()) {
                                    if (z9) {
                                        O7(false);
                                        return false;
                                    }
                                } else {
                                    sj sjVar = this.Z;
                                    if (sjVar != null && sjVar.s0() && (sjVar.f31065f2 != 1 || (tL_replyKeyboardMarkup = sjVar.f31110n2) == null || !tL_replyKeyboardMarkup.is_persistent || sjVar.f31104m2 == null)) {
                                        if (z9) {
                                            this.Z.k0(true);
                                            return false;
                                        }
                                    } else {
                                        sj sjVar2 = this.Z;
                                        if (sjVar2 != null && sjVar2.s()) {
                                            if (z9) {
                                                sj sjVar3 = this.Z;
                                                hi.y yVar = sjVar3.f31098l0;
                                                if (yVar != null) {
                                                    yVar.setOpened(false);
                                                }
                                                if (!sjVar3.g0() && (ueVar = sjVar3.m0) != null) {
                                                    ueVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            sj sjVar4 = this.Z;
                                            if (sjVar4 != null && (weVar = sjVar4.E0) != null && (u1Var2 = weVar.V1) != null && u1Var2.isShowing()) {
                                                if (z9) {
                                                    weVar.V1.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f44492f4 == 6 && (u1Var = kg.v.f17563e) != null && u1Var.isShowing()) {
                                                if (z9) {
                                                    kg.v.f17563e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.t3.p0(this.f44473e) && !this.f44518h4 && this.f44490f2 != null && b() != 0) {
                                                if (z9) {
                                                    this.f44490f2.n(0L, this.F7);
                                                    return false;
                                                }
                                            } else if (this.f44492f4 == 5 && !"hello".equalsIgnoreCase(this.f44478e4) && !"away".equalsIgnoreCase(this.f44478e4) && (this.K6.isEmpty() || this.f44643r4 == 0)) {
                                                if (z9) {
                                                    wc();
                                                    return false;
                                                }
                                            } else if (this.f44492f4 == 6 && this.Z.t()) {
                                                if (z9) {
                                                    cc(new bf(this, 18));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
                                                if (lVar3 != null && lVar3.f27691n0) {
                                                    if (z9) {
                                                        lVar3.n(true);
                                                        return false;
                                                    }
                                                } else if (this.f44460cd.f55499f) {
                                                    if (z9) {
                                                        Ua();
                                                    }
                                                } else {
                                                    if (z9 && (t40Var = this.f44615p3) != null) {
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
        I9();
        if (!getMessagesController().D3() && getMessagesController().f24898s4 <= 0 && getMessagesController().i7 < 2 && !getUserConfig().q() && (arrayList = this.K6) != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                if (ijVar != null && !ijVar.P3() && ((org.telegram.messenger.ij.R4(ijVar.f23266k) || ijVar.h4()) && !ijVar.F4() && (ijVar.f23266k.media_unread || org.telegram.messenger.t3.V(this.f44473e)))) {
                    org.telegram.ui.Components.s11.r(ijVar, false);
                }
            }
        }
        this.T3 = false;
        J9();
        ArrayList arrayList2 = org.telegram.ui.Components.s11.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        vf.b bVar = this.f44459cc;
        if (bVar != null) {
            bVar.a(false);
            this.f44459cc = null;
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
        if (this.Cb) {
            sj sjVar = this.Z;
            if (sjVar != null) {
                sjVar.I0();
                sj sjVar2 = this.Z;
                sjVar2.T0 = false;
                org.telegram.ui.Components.lf lfVar = sjVar2.U0;
                if (lfVar != null) {
                    lfVar.u(false);
                }
            }
            this.Cb = false;
        }
        if (this.J1 != null) {
            org.telegram.messenger.g0.i3(new ae(this, 1), 600L);
        }
        if (this.F4 && !this.G4) {
            this.G4 = true;
            org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(this).I(2131623992, org.telegram.messenger.id.M0(2131743597, null), org.telegram.messenger.id.M0(2131743599, null));
            I.f32203j = 5000;
            I.v = new ae(this, 2);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ch.r rVar = this.f44673ta;
        if (rVar != null && rVar.d()) {
            this.f44673ta.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.ij ijVar;
        long j3;
        long j10;
        wi wiVar = this.f44601o1;
        if (wiVar != null) {
            ViewTreeObserver viewTreeObserver = wiVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new nh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        P7(true);
        if (!org.telegram.messenger.g0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.A1() || !PhotoViewer.p1().P1()) && (ijVar = MediaController.B().f21300u0) != null && org.telegram.messenger.ij.L4(ijVar.f23266k)) {
                    PhotoViewer.p1().H2(null, this, this.f44750za);
                    getFileLoader().c0(ijVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i7 = ijVar.D;
                    long j11 = 0;
                    if (i7 != 0) {
                        j3 = this.f44545j6;
                    } else {
                        j3 = 0;
                    }
                    if (i7 != 0) {
                        j10 = this.f44440b7;
                    } else {
                        j10 = 0;
                    }
                    if (i7 != 0) {
                        j11 = b();
                    }
                    if (p12.c2(ijVar, null, null, null, null, null, null, 0, this.f44444bb, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.p1().f41438k4 = this;
                    }
                    F9(false);
                    MediaController.B().f21302v0 = null;
                }
            } else if (PhotoViewer.A1() && PhotoViewer.p1().f41444l2) {
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
                        B.f21300u0 = ijVar2;
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
                        B.f21272g0 = false;
                        org.telegram.messenger.ij ijVar3 = B.f21300u0;
                        B.f21300u0 = ijVar2;
                        if (!org.telegram.messenger.iz.k(true)) {
                            B.w0(B.f21295s);
                        }
                        B.v0(B.f21300u0);
                        org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.f25014h2, ijVar2, ijVar3);
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
        zj zjVar = this.f44649ra;
        float f10 = 0.0f;
        if (z9 && this.ma && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (f2Var instanceof cn) {
                this.P4 = true;
                cn cnVar = (cn) f2Var;
                cnVar.f44609oa = this;
                this.fragmentView.setAlpha(0.0f);
                this.l1.setSkipBackgroundDrawing(true);
                this.f44601o1.setTranslationY(org.telegram.messenger.g0.L(8.0f));
                this.f44601o1.getAvatarImageView().setAlpha(0.0f);
                this.f44601o1.getAvatarImageView().setTranslationY(-org.telegram.messenger.g0.L(8.0f));
                this.f44597na = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                sj sjVar = this.Z;
                if (sjVar != null) {
                    sjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22567q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                vj vjVar = this.S;
                if (vjVar != null) {
                    vjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22567q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                sj sjVar2 = this.Z;
                if (sjVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = sjVar2.getMeasuredHeight();
                }
                vj vjVar2 = this.S;
                if (vjVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = vjVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                sj sjVar3 = cnVar.Z;
                if (sjVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = sjVar3.getMeasuredHeight();
                }
                vj vjVar3 = this.S;
                if (vjVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = vjVar3.getMeasuredHeight();
                }
                this.f44549ja = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new bi.de(10, this, cnVar));
                Qc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f44635qa = animatorSet;
                animatorSet.addListener(new fi.b5(this, cnVar, runnable));
                this.f44635qa.setDuration(300L);
                this.f44635qa.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                this.f44635qa.playTogether(ofFloat2);
                org.telegram.messenger.g0.i3(zjVar, 200L);
                return this.f44635qa;
            }
        }
        if (this.Ea && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (f2Var2 instanceof z91) {
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
                this.Ga = f10;
                ofFloat.addUpdateListener(new ki(0, this));
                this.Fa = true;
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.invalidate();
                }
                ql qlVar = this.l1;
                if (qlVar != null) {
                    qlVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44635qa = animatorSet2;
                animatorSet2.addListener(new li(this, z9, runnable));
                this.f44635qa.setDuration(150L);
                this.f44635qa.playTogether(ofFloat);
                if (z9) {
                    org.telegram.messenger.g0.i3(zjVar, 200L);
                } else {
                    this.f44635qa.start();
                }
                return this.f44635qa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.u1 u1Var = this.O;
        if (u1Var != null && dialog == u1Var) {
            getMessagesController().X(0, this.f44545j6, false);
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && !r4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z9;
        org.telegram.ui.Components.qs0 qs0Var;
        super.onFragmentDestroy();
        jh.e eVar = this.f44437b4;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f17036x;
            int size = longSparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i7);
                if (dVar.f17022i) {
                    eVar.f17035w.add(dVar.a());
                }
            }
            if (org.telegram.messenger.r2.f25216a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        sj sjVar = this.Z;
        if (sjVar != null) {
            sjVar.B0();
        }
        wi wiVar = this.f44601o1;
        if (wiVar != null && (qs0Var = wiVar.f34995c0) != null) {
            qs0Var.b(wiVar.G);
        }
        lj ljVar = this.W1;
        if (ljVar != null && ljVar.getAdapter() != null) {
            this.W1.getAdapter().P();
        }
        di.u2 u2Var = this.X1;
        if (u2Var != null) {
            u2Var.K();
        }
        org.telegram.ui.Components.t40 t40Var = this.f44615p3;
        if (t40Var != null) {
            t40Var.c(true);
        }
        ns p10 = ns.p();
        if (p10.f48267l == this.F9) {
            p10.W = null;
            p10.f48254a0 = null;
            p10.Y = null;
            p10.f48267l = null;
            p10.f48258c0 = null;
            p10.t();
        }
        getNotificationCenter().j(this.f44428aa);
        org.telegram.messenger.qs.e().j(this.f44443ba);
        getNotificationCenter().j(this.f44457ca);
        getNotificationCenter().j(this.f44470da);
        J9();
        ae aeVar = this.f44439b6;
        if (aeVar != null) {
            org.telegram.messenger.g0.r(aeVar);
            this.f44439b6 = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        gk gkVar = this.Ia;
        notificationCenter.getClass();
        boolean z10 = org.telegram.messenger.r2.f25216a;
        if (Thread.currentThread() == org.telegram.messenger.t0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(gkVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.f44545j6;
            if (this.f44492f4 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            messagesController.K4(j3, z9, false);
            ab.b0 b0Var = this.f44598nb;
            if (b0Var != null) {
                b0Var.b();
                this.f44598nb = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25080t);
            if (this.f44492f4 == 0 && org.telegram.messenger.g0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.qs.f25012h0, Long.valueOf(this.f44545j6), Long.valueOf(b()), Boolean.TRUE);
            }
            if (this.f44487f != null) {
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
            if (this.f44487f != null) {
                getMessagesController().f24875q1.remove(Long.valueOf(this.f44487f.f27109id));
            }
            org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
            di.u2 u2Var2 = this.X1;
            if (u2Var2 != null) {
                u2Var2.j1();
                this.X1 = null;
            }
            org.telegram.messenger.g0.Q3(getParentActivity());
            if (org.telegram.messenger.t3.T(this.f44473e)) {
                getMessagesController().V4(this.f44473e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f44620p8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().V4(getMessagesController().M0(Long.valueOf(this.f44620p8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            rl rlVar = this.s9;
            if (rlVar != null) {
                rlVar.f(false);
            }
            ej ejVar = this.A0;
            if (ejVar != null) {
                ejVar.N();
            }
            ak akVar = this.Ra;
            if (akVar != null) {
                akVar.b();
            }
            this.f44713wa = null;
            org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f44415rd ? 1 : 0);
                org.telegram.ui.ActionBar.r4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i10 = 0;
                    while (i10 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.b9) parentLayout2.getPulledDialogs().get(i10)).f32167b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                }
            }
            f44415rd = false;
            vf.b bVar = this.f44459cc;
            if (bVar != null) {
                bVar.a(false);
                this.f44459cc = null;
            }
            org.telegram.messenger.i3 i3Var = this.Ba;
            cn cnVar = i3Var.f23040a;
            ArrayList arrayList = i3Var.f23044f;
            ArrayList arrayList2 = i3Var.f23043e;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                cnVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i11)).intValue(), false);
            }
            arrayList2.clear();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                cnVar.getConnectionsManager().cancelRequest(((Integer) arrayList.get(i12)).intValue(), false);
            }
            arrayList.clear();
            cx0 cx0Var = this.f44660s8;
            if (cx0Var != null) {
                cx0Var.b(true);
                this.f44660s8 = null;
            }
            bi.p7 p7Var = this.Vc;
            if (p7Var != null) {
                p7Var.setMessageCell(null);
                org.telegram.messenger.g0.E2(this.Vc);
                this.Vc = null;
                return;
            }
            return;
        }
        throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Mb = true;
        org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
        if (ijVar != null && org.telegram.messenger.ij.L4(ijVar.f23266k)) {
            MediaController.B().q(true, true, false, false);
        } else {
            MediaController.B().p0(this.K8, null, null, false);
        }
        bi.p7 p7Var = this.Vc;
        if (p7Var != null) {
            p7Var.setMessageCell(null);
            org.telegram.messenger.g0.E2(this.Vc);
            this.Vc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        di.u2 u2Var;
        di.u2 u2Var2;
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.ci ciVar;
        sj sjVar = this.Z;
        boolean z11 = false;
        if (sjVar != null && i7 == 2 && sjVar.j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.gz.C(sjVar.Q).o0(sjVar.f31084i3, sjVar.j3);
            }
            sjVar.j3 = null;
            sjVar.f31084i3 = null;
        }
        lj ljVar = this.W1;
        if (ljVar != null && ljVar.getAdapter() != null) {
            jg.i1 adapter = this.W1.getAdapter();
            if (i7 == 2) {
                TLRPC.User user = adapter.f16802w0;
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
                u2Var3.d2.b0();
            }
            org.telegram.ui.Components.vo voVar = this.f44713wa;
            if (voVar != null && (ciVar = voVar.R1) != null) {
                ciVar.d2.b0();
            }
        } else if ((i7 == 5 || i7 == 30) && (u2Var = this.X1) != null) {
            if (i7 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                u2Var.q1();
            }
        } else if ((i7 == 17 || i7 == 18) && (u2Var2 = this.X1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var2.d2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z11 = true;
            }
            chatAttachAlertPhotoLayout.W(z11);
            this.X1.d2.b0();
        } else if (i7 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44750za);
                String M0 = org.telegram.messenger.id.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131747312, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747300, null), new fh(this));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                alertDialog$Builder.p();
            }
        } else if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            bb(0);
        } else if (i7 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            bb(2);
        } else if (((i7 != 101 && i7 != 102) || this.f44487f == null) && (i7 != 103 || this.f44473e == null)) {
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
                    org.telegram.ui.Components.voip.y1.l(this.f44473e, null, this.f44607o8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f44487f;
                if (i7 == 102) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.UserFull userFull = this.f44633q8;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.y1.m(user2, z10, z11, getParentActivity(), getMessagesController().b2(this.f44487f.f27109id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.onResume():void");
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
                Iterator it = fVar.f54588w.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11540f0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            ri.f fVar2 = this.J;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f54588w.iterator();
                while (it2.hasNext()) {
                    fh.e eVar2 = ((fh.g) it2.next()).f11540f0;
                    if (eVar2 != null) {
                        eVar2.h = true;
                    }
                }
            }
            Paint paint = this.U8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28170s8));
            }
            RadialProgressView radialProgressView = this.f44639r0;
            if (radialProgressView != null) {
                if (R9()) {
                    i10 = org.telegram.ui.ActionBar.m6.Ka;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Wc;
                }
                radialProgressView.setProgressColor(getThemedColor(i10));
            }
            wj wjVar = this.f44448c1;
            if (wjVar != null) {
                wjVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.H0;
            if (n2Var != null && n2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.m6.Ci)) != this.K0 || this.Bb != org.telegram.ui.ActionBar.m6.I.q())) {
                this.K0 = themedColor4;
                this.Bb = org.telegram.ui.ActionBar.m6.I.q();
                Drawable background = this.H0.getBackground();
                org.telegram.ui.ActionBar.m6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.m6.H1(background, org.telegram.ui.ActionBar.b6.b(themedColor4), true);
            }
            Eb();
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
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.Te));
            }
            RadialProgressView radialProgressView3 = this.Y2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.m6.Se));
            }
            org.telegram.ui.Components.w70 w70Var = this.f44516h2;
            if (w70Var != null && this.R0) {
                w70Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ue));
            }
            if (this.O0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.m6.f28282y6)) != this.L0) {
                this.L0 = themedColor3;
                this.O0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.P0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.Ci)) != this.M0) {
                this.M0 = themedColor2;
                this.P0.setTint(themedColor2);
            }
            if (this.Q0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.H6)) != this.N0) {
                this.N0 = themedColor;
                this.Q0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            sh.c cVar = this.f44539id;
            if (cVar != null && (i7 = this.S0) >= 0) {
                cVar.setColor(getThemedColor(i7));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.m6.f28111p7);
                for (org.telegram.ui.ActionBar.p0 p0Var : set2) {
                    if (p0Var != null) {
                        p0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28111p7, false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z9, boolean z10) {
        int[] iArr;
        org.telegram.ui.Components.zc zcVar;
        super.onTransitionAnimationStart(z9, z10);
        System.currentTimeMillis();
        int i7 = org.telegram.messenger.qs.K2;
        int i10 = org.telegram.messenger.qs.G0;
        int i11 = org.telegram.messenger.qs.f25080t;
        int i12 = org.telegram.messenger.qs.f25074s;
        if (z9) {
            if (!this.f44480e6) {
                this.f44480e6 = true;
                bd();
            }
            iArr = this.f44428aa == 0 ? new int[]{i12, i11, i10, i7, org.telegram.messenger.qs.D} : new int[]{i12, i11, i10, i7};
            this.f44466d6 = false;
            if (!z10) {
                this.f44494f6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.t10.B(this.f44487f) ? new int[]{i12, i11, i10, i7, org.telegram.messenger.qs.V} : null;
            sj sjVar = this.Z;
            if (sjVar != null && (zcVar = sjVar.S1) != null) {
                org.telegram.messenger.g0.r(zcVar);
                sjVar.S1 = null;
            }
        }
        s7();
        this.f44428aa = getNotificationCenter().q(iArr, this.f44428aa, true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        C8(((org.telegram.messenger.fz) arrayList.get(0)).d, ((org.telegram.messenger.fz) arrayList.get(0)).f22520i);
        org.telegram.messenger.gz.X(getAccountInstance(), arrayList, this.f44545j6, this.D5, this.f44568l4, null, this.B5, true, false, this.F5, null, z9, i7, 0, ((org.telegram.messenger.fz) arrayList.get(0)).f22531t, null, X8(), 0L, false, j3, i9(), this.f44708w5, null, false);
        L6();
        if (i7 != 0) {
            if (this.f44504g4 == -1) {
                this.f44504g4 = 0;
            }
            this.f44504g4 = arrayList.size() + this.f44504g4;
            ld(true);
        }
    }

    public final void p7(boolean z9) {
        int i7;
        if (this.B0 != null && !this.G5 && !this.C0.L && !this.f44696v7) {
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < this.f44741z0.getChildCount(); i13++) {
                int R = RecyclerView.R(this.f44741z0.getChildAt(i13));
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
            ll llVar = this.C0;
            if (llVar.N) {
                int i14 = llVar.E;
                if (i14 >= 0 && i12 >= 0 && i14 >= i12 && i14 <= i11) {
                    getMediaDataController().O0();
                    return;
                }
                return;
            }
            int b10 = llVar.b();
            if (z9) {
                i7 = 25;
            } else {
                i7 = 5;
            }
            int i15 = i7;
            if (this.f44492f4 == 7) {
                if ((b10 - i12) - i10 <= i15 && !this.W6 && !this.S6[0]) {
                    this.W6 = true;
                    this.f44722x6.add(Integer.valueOf(this.f44570l6));
                    org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(this.currentAccount);
                    String str = this.I3;
                    int i16 = this.classGuid;
                    int i17 = this.f44451c4;
                    int i18 = this.f44570l6;
                    this.f44570l6 = i18 + 1;
                    a10.e(i16, i17, i18, str);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(new org.telegram.messenger.jr(this, b10, i12, i10, i15, 1));
        }
    }

    public final void p8(int r34, final java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.p8(int, java.lang.Object[]):void");
    }

    public final int p9(int i7) {
        SparseIntArray sparseIntArray = this.f44505g5;
        int i10 = sparseIntArray.get(i7, -1);
        if (i10 == -1) {
            int i11 = f44410md;
            f44410md = i11 + 1;
            sparseIntArray.put(i7, i11);
            return i11;
        }
        return i10;
    }

    public final void pa(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var == null) {
            return;
        }
        long j3 = ijVar.f23266k.action.channel_id;
        if (r4Var.getFragmentStack().size() > 0) {
            f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            f2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
        if (indexOf > 0 && !(f2Var instanceof cn) && !(f2Var instanceof ProfileActivity) && this.f44473e.creator) {
            int size = r4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) r4Var2.getFragmentStack().get(indexOf);
                if (f2Var2 instanceof cn) {
                    ((ActionBarLayout) r4Var2).c(indexOf, new cn(a8.p0.j(j3, "chat_id")));
                    f2Var2.removeSelfFromStack();
                } else if (f2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) r4Var2).c(indexOf, new ProfileActivity(a8.p0.j(j3, "chat_id"), null));
                    f2Var2.removeSelfFromStack();
                } else if (f2Var2 instanceof rn) {
                    ((ActionBarLayout) r4Var2).c(indexOf, new rn(a8.p0.j(j3, "chat_id")));
                    f2Var2.removeSelfFromStack();
                } else if (f2Var2 instanceof rq) {
                    if (((rq) f2Var2).f49506d1 == 0) {
                        Bundle arguments = f2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) r4Var2).c(indexOf, new rq(arguments));
                    }
                    f2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.g0.h3(new m6(this, f2Var, ijVar, r4Var2, 4));
        }
        org.telegram.messenger.g0.i3(new bg.j0(this, j3, 2), 1000L);
    }

    public final void pb(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.pb(org.telegram.ui.Cells.q1):void");
    }

    public final void pc(org.telegram.messenger.ij ijVar, CharSequence charSequence, int i7) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.bc G = org.telegram.ui.Components.gc.a0(this).G(2131623981, 9999, charSequence);
        G.f32203j = max;
        G.v = new re(this, i7, 3);
        G.k(true);
        this.U3 = ijVar;
        this.V3 = i7;
    }

    public final void pd() {
        boolean z9;
        if (this.f44717x1 == null) {
            return;
        }
        if ((!getMediaDataController().Y0.isEmpty() && this.G3 && !this.F3) || (this.f44492f4 == 7 && this.f44451c4 == 2 && !this.K6.isEmpty())) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f44717x1.e(6, z9, true);
        this.f44717x1.e(5, z9, true);
        if (z9) {
            this.f44717x1.e(1, false, true);
        }
        if (!z9) {
            this.R7 = 0;
        }
        this.l1.invalidate();
    }

    @Override
    public final boolean q() {
        return this.M9;
    }

    public final void q7(org.telegram.messenger.ij ijVar) {
        if (ijVar.D == 4 && !this.F8) {
            int i7 = org.telegram.messenger.iz.f23389a;
            if (!org.telegram.messenger.qp.e1().contains("mapPreviewType")) {
                this.F8 = true;
                org.telegram.ui.Components.u4.p0(getParentActivity(), this.currentAccount, new ae(this, 12), true, this.f44750za);
            }
        }
    }

    public final void q8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.q8(int, java.lang.Object[]):void");
    }

    public final long q9() {
        return this.f44643r4;
    }

    public final void qa(boolean z9) {
        int i7;
        if (this.f44741z0 != null) {
            ArrayList arrayList = this.K6;
            if (!arrayList.isEmpty() && !this.Ra.f46737n) {
                if (z9) {
                    i7 = 0;
                    while (i7 < arrayList.size() && ((org.telegram.messenger.ij) arrayList.get(i7)).r4()) {
                        i7++;
                    }
                } else {
                    i7 = 0;
                }
                this.B0.h1(i7, 0);
                this.f44741z0.C0();
            }
        }
    }

    public final void qb() {
        org.telegram.ui.Components.qa0 j3;
        an anVar = this.f44750za;
        if (anVar != null) {
            Drawable m10 = anVar.m();
            if (this.fragmentView != null) {
                m10 = this.l1.getBackgroundImage();
            }
            if (m10 instanceof fn) {
                m10 = ((fn) m10).c(true);
            }
            if (m10 instanceof org.telegram.ui.Components.qa0) {
                ((org.telegram.ui.Components.qa0) m10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.u4) && (j3 = ((org.telegram.ui.ActionBar.u4) themedDrawable).j()) != null) {
                j3.w(false);
            }
        }
    }

    public final void qc(boolean z9) {
        boolean z10;
        lh.h hVar = this.f44717x1;
        if (hVar != null) {
            if (z9 && !org.telegram.messenger.t3.p0(this.f44473e)) {
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

    public final void qd(String str) {
        if (this.f44492f4 == 7 && !TextUtils.equals(this.I3, str)) {
            c8();
            rc(true);
            this.I3 = str;
            this.H3 = str;
            g7(false);
            M7(true);
            this.f44467d7 = 0L;
            this.A7 = false;
            org.telegram.messenger.oa.a(this.currentAccount).b(this.f44451c4).a();
            this.f44422a4.f();
            this.Z3.requestLayout();
            if (this.Z3.getLayoutManager() != null) {
                this.Z3.getLayoutManager().n0(0);
            }
            od();
            this.f44641r2.e(true, true);
            K8();
        }
    }

    @Override
    public final org.telegram.ui.Components.jn r() {
        return this.f44601o1;
    }

    public final void r7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.r7(boolean):void");
    }

    public final void r8(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.r8(int, java.lang.Object[]):void");
    }

    public final float r9(float f10) {
        cn cnVar = this.ya;
        if (cnVar == null) {
            cnVar = this;
        }
        org.telegram.ui.Components.kg kgVar = cnVar.f44419a1;
        if (kgVar == null) {
            return 0.0f;
        }
        return kgVar.c(f10);
    }

    public final boolean ra() {
        sj sjVar = this.Z;
        boolean z9 = sjVar.f31179z2;
        if (z9) {
            sjVar.s1();
            this.R3 = true;
        }
        org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z9;
    }

    public final void rb() {
        boolean z9;
        org.telegram.messenger.ij ijVar;
        CharSequence charSequence;
        boolean z10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        wj wjVar;
        sj sjVar = this.Z;
        if (sjVar != null && sjVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f44558k5 && sjVar != null && (wjVar = this.f44448c1) != null && wjVar.getVisibility() != 0) {
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
        long Q7 = Q7(ijVar);
        TLRPC.DraftMessage R = getMediaDataController().R(this.f44545j6, Q7);
        if (R != null) {
            richMessage = R.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.ui mediaDataController2 = getMediaDataController();
        long j10 = this.f44545j6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (ijVar != null && !ijVar.f23283p && ijVar.f23254h1 == null && !this.C5) {
            message = ijVar.f23266k;
        } else {
            message = null;
        }
        sm smVar = this.B5;
        org.telegram.messenger.nj njVar = this.f44708w5;
        if (njVar != null) {
            suggestedPost = njVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        sj sjVar2 = this.Z;
        if (sjVar2 != null) {
            j3 = sjVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.Q1(j10, Q7, charSequence2, W, message, smVar, suggestedPost2, j3, !z9, false, richMessage);
    }

    public final void rc(boolean z9) {
        int i7;
        if (this.Y3 != null) {
            te.a aVar = this.f44486ed;
            if (aVar.f55499f != z9) {
                aVar.a(z9, true);
                if (!z9 && this.f44492f4 == 7) {
                    v4.b0 b0Var = (v4.b0) this.Z3.getLayoutManager();
                    Object E = this.f44422a4.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.f44422a4.E(b0Var.L0());
                    Object E3 = this.f44422a4.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.C0.L();
                        int L0 = this.B0.L0();
                        int N0 = this.B0.N0();
                        int i10 = ((org.telegram.messenger.ij) E).f23266k.f26981id;
                        int i11 = ((org.telegram.messenger.ij) E2).f23266k.f26981id;
                        int i12 = ((org.telegram.messenger.ij) E3).f23266k.f26981id;
                        int i13 = -1;
                        boolean z10 = false;
                        boolean z11 = false;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((org.telegram.messenger.ij) L.get(i14)).f23266k.f26981id == i11) {
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
                            if (((org.telegram.messenger.ij) L.get(i14)).f23266k.f26981id == i12) {
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
                            if (((org.telegram.messenger.ij) L.get(i14)).f23266k.f26981id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z10 && !z11 && i13 != -1) {
                            this.B0.h1(this.C0.J + i13, (this.f44741z0.getHeight() - V8((org.telegram.messenger.ij) L.get(i13), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.i6 i6Var = this.j3;
                if (i6Var != null) {
                    if (aVar.f55499f) {
                        i7 = 2131745818;
                    } else {
                        i7 = 2131745817;
                    }
                    i6Var.c(org.telegram.messenger.id.M0(i7, null), !org.telegram.messenger.id.f23161a0, true);
                }
                fi.m3 m3Var = this.L1;
                if (m3Var != null && m3Var.V) {
                    m3Var.f(true);
                }
                bl blVar = this.P1;
                if (blVar != null && blVar.V) {
                    blVar.f(true);
                }
                sj sjVar = this.Z;
                if (sjVar != null) {
                    sjVar.i0();
                }
                nd();
            }
        }
    }

    public final void rd() {
        sj sjVar;
        if (this.S != null) {
            this.G0.setBackground(null);
            this.G0.setOnClickListener(null);
            boolean z9 = true;
            if (this.f44492f4 == 3 && d9() == 2666000) {
                this.G0.setText(org.telegram.messenger.id.M0(2131753882, null));
                this.S.setVisibility(0);
                this.W1.setVisibility(8);
                this.W1.setTag(null);
                Zc();
                org.telegram.ui.Components.ow0 ow0Var = this.f44640r1;
                if (ow0Var != null) {
                    ow0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f44473e;
                if (chat != null && !org.telegram.messenger.t3.n(chat)) {
                    TLRPC.Chat chat2 = this.f44473e;
                    if (!org.telegram.messenger.t3.p(chat2) && !org.telegram.messenger.t3.u(chat2) && !org.telegram.messenger.t3.s(chat2) && !org.telegram.messenger.t3.v(chat2) && !org.telegram.messenger.t3.l(chat2) && !org.telegram.messenger.t3.o(chat2) && !org.telegram.messenger.t3.t(chat2)) {
                        TLRPC.Chat chat3 = this.f44473e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.t3.T(chat3) || this.f44473e.megagroup)) {
                            TLRPC.Chat chat4 = this.f44473e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.t3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i7 = org.telegram.ui.ActionBar.m6.Ci;
                                    mutate.setTint(getThemedColor(i7));
                                    this.P0 = mutate;
                                    this.M0 = getThemedColor(i7);
                                    mutate.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
                                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(null, mutate, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(-6.0f));
                                    int L = org.telegram.messenger.g0.L(14.0f);
                                    int L2 = org.telegram.messenger.g0.L(14.0f);
                                    xpVar.f40377e = L;
                                    xpVar.f40378f = L2;
                                    int L3 = org.telegram.messenger.g0.L(14.0f);
                                    int L4 = org.telegram.messenger.g0.L(14.0f);
                                    xpVar.h = L3;
                                    xpVar.f40379n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131753581, null, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(i7, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(xpVar, 1), 0, 1, 33);
                                    TextView textView = this.G0;
                                    int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
                                    org.telegram.ui.ActionBar.t6.Q(textView, org.telegram.ui.ActionBar.m6.i0(0, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), null, org.telegram.ui.ActionBar.t6.M(i10), null);
                                    this.G0.setText(spannableStringBuilder);
                                    this.G0.setOnClickListener(new le(this, 0));
                                } else {
                                    this.G0.setText(org.telegram.messenger.id.M0(2131749534, null));
                                }
                            } else if (org.telegram.messenger.g0.D1(chat4.banned_rights)) {
                                this.G0.setText(org.telegram.messenger.id.M0(2131745597, null));
                            } else {
                                this.G0.setText(org.telegram.messenger.id.a0("SendMessageRestricted", null, 2131745598, org.telegram.messenger.id.v(this.f44473e.banned_rights.until_date)));
                            }
                            this.S.setVisibility(0);
                            this.W1.setVisibility(8);
                            this.W1.setTag(null);
                            Zc();
                            org.telegram.ui.Components.ow0 ow0Var2 = this.f44640r1;
                            if (ow0Var2 != null) {
                                ow0Var2.f();
                            }
                        }
                    }
                }
                W7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f44577m1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.G0.setText(org.telegram.messenger.id.M0(2131751129, null));
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.k5.r("AwaitingEncryption", null, 2131753757, new Object[]{a8.p0.s(new StringBuilder("<b>"), this.f44487f.first_name, "</b>")}, this.G0);
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.G0.setText(org.telegram.messenger.id.M0(2131751128, null));
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                        this.Z.setFieldText("");
                        getMediaDataController().D(this.f44545j6, this.f44643r4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.S.setVisibility(4);
                            if (!this.inPreviewMode && !this.kb && this.f44492f4 != 3) {
                                this.Z.setVisibility(0);
                            }
                        }
                        z9 = false;
                    }
                    l7();
                    V6(false);
                } else {
                    this.S.setVisibility(4);
                    if (this.f44640r1 != null && (sjVar = this.Z) != null && sjVar.h0()) {
                        this.f44640r1.e();
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
    public final void restoreSelfArgs(Bundle bundle) {
        this.f44572l8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.f44693v4) {
            if (this.f44487f != null) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f44487f.f27109id));
                if (a22 != null) {
                    this.f44487f = a22;
                } else {
                    return;
                }
            } else if (this.f44473e != null) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f44473e.f26960id));
                if (M0 != null) {
                    this.f44473e = M0;
                } else {
                    return;
                }
            }
            wi wiVar = this.f44601o1;
            if (wiVar != null) {
                wiVar.b();
            }
        }
    }

    public final void s7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.s7():void");
    }

    public final void s8(java.lang.Object... r82) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.s8(java.lang.Object[]):void");
    }

    public final float s9(org.telegram.ui.Components.i11 i11Var) {
        float f10;
        org.telegram.ui.Components.m11 m11Var = this.f44490f2;
        if (m11Var != null) {
            float L = org.telegram.messenger.g0.L(7.0f);
            float k10 = m11Var.k(i11Var);
            if (i11Var == org.telegram.ui.Components.i11.f34508b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (org.telegram.messenger.g0.L(f10) + L) * k10;
        }
        return 0.0f;
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        bf bfVar = this.La;
        if (bfVar != null) {
            org.telegram.messenger.g0.r(bfVar);
        }
        sj sjVar = this.Z;
        if (sjVar != null && this.l1 != null && sjVar.getAdjustPanLayoutHelper() != null && !this.Z.getAdjustPanLayoutHelper().f27532f) {
            this.Ka = this.l1.getKeyboardHeight();
        } else {
            this.Ka = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f44572l8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb() {
        org.telegram.ui.Cells.q1 q1Var = null;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= this.f44741z0.getChildCount()) {
                break;
            }
            View childAt = this.f44741z0.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.z1) && childAt.getBottom() > 0 && childAt.getTop() < this.f44741z0.getHeight()) {
                q1Var = childAt;
                break;
            }
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int min = Math.min(q1Var2.getBottom(), this.f44741z0.getHeight()) - Math.max(0, q1Var2.getTop());
                if (min > i10) {
                    q1Var = q1Var2;
                    i10 = min;
                }
            }
            i7++;
        }
        if (q1Var != null) {
            fj fjVar = this.B0;
            this.f44741z0.getClass();
            fjVar.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) this.N9), false);
        }
    }

    public final void sc(TLRPC.TL_game tL_game, org.telegram.messenger.ij ijVar, String str, boolean z9, long j3) {
        String str2;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        String str3 = "";
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f44750za);
            String M0 = org.telegram.messenger.id.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            if (a22 != null) {
                str3 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            }
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131753015, str3);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new bi.n4(this, tL_game, ijVar, str, j3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
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
                    presentFragment(new dd1(str, str2, tL_game.title, tL_game.short_name, ijVar));
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
        dd1.a0(str, ijVar, parentActivity, str6, str3);
    }

    public final void sd() {
        boolean z9;
        int i7;
        int i10;
        org.telegram.messenger.aj ajVar;
        int i11 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f44582m6;
        if (i11 == 0) {
            ArrayList<org.telegram.messenger.ij> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i12].valueAt(i13);
                    if (ijVar.z2()) {
                        org.telegram.messenger.dj t92 = t9(ijVar);
                        if (t92 != null) {
                            ajVar = t92.d(ijVar);
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
            jk jkVar = this.f44751zb;
            if (jkVar != null) {
                jkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f44751zb.getSelectedReactions().isEmpty();
                z9 = !isEmpty;
                jk jkVar2 = this.f44751zb;
                if (isEmpty) {
                    i10 = 2131745872;
                } else {
                    i10 = 2131745871;
                }
                jkVar2.setHint(org.telegram.messenger.id.M0(i10, null));
                org.telegram.messenger.g0.i3(new ae(this, 14), 120L);
            } else {
                z9 = !org.telegram.ui.Components.ii0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.r0 j3 = this.actionBar.p(null).j(28);
            if (j3 != null) {
                if (z9) {
                    i7 = 2131231898;
                } else {
                    i7 = 2131231900;
                }
                org.telegram.ui.Components.ch0 ch0Var = j3.f28461y;
                if (ch0Var != null && j3.D != i7) {
                    j3.D = i7;
                    org.telegram.messenger.g0.R3(ch0Var, i7);
                }
            }
        }
        if (this.f44673ta != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((org.telegram.messenger.ij) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((org.telegram.messenger.ij) sparseArray2.valueAt(i15));
            }
            this.f44673ta.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final void setInMenuMode(boolean z9) {
        int i7;
        super.setInMenuMode(z9);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            org.telegram.ui.ActionBar.y s5 = lVar.s();
            if (this.inMenuMode) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            s5.setVisibility(i7);
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
        sj sjVar;
        int i7;
        float f12;
        super.setInPreviewMode(z9);
        int i10 = 8;
        boolean z12 = true;
        if (this.f44487f != null && this.f44612p0 != null) {
            TLRPC.UserFull b22 = getMessagesController().b2(this.f44487f.f27109id);
            if (b22 != null && b22.phone_calls_available) {
                this.f44510ga = !this.inPreviewMode;
                this.f44612p0.e(0);
            } else {
                this.f44510ga = false;
                this.f44612p0.e(8);
            }
        }
        wi wiVar = this.f44601o1;
        float f13 = 0.0f;
        if (wiVar != null) {
            wiVar.setOccupyStatusBar(!z9);
            wi wiVar2 = this.f44601o1;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            wiVar2.setLayoutParams(c8.ha.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        sj sjVar2 = this.Z;
        if (sjVar2 != null) {
            if (!z9) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            sjVar2.setVisibility(i7);
        }
        org.telegram.ui.Components.ow0 ow0Var = this.f44640r1;
        if (ow0Var != null) {
            if (this.f44617p5 && !z9 && ((sjVar = this.Z) == null || !sjVar.f31180z3)) {
                i10 = 0;
            }
            ow0Var.setVisibility(i10);
        }
        lj ljVar = this.W1;
        if (ljVar != null) {
            ViewPropertyAnimator animate = ljVar.animate();
            if (!this.Z.f31180z3 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.wq.f40046f).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            if (!z9) {
                y1Var = new org.telegram.ui.ActionBar.y1(false);
            } else {
                y1Var = null;
            }
            lVar.setBackButtonDrawable(y1Var);
            org.telegram.ui.ActionBar.r0 r0Var = this.f44527i0;
            if (r0Var != null) {
                if (!z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44488f0;
            if (xVar != null) {
                if (!z9) {
                    f13 = 1.0f;
                }
                xVar.f28729i = f13;
                org.telegram.ui.ActionBar.r0 r0Var2 = xVar.f28733m;
                if (r0Var2 != null) {
                    r0Var2.setAlpha(f13);
                }
            }
        }
        cj cjVar = this.f44741z0;
        if (cjVar != null) {
            int childCount = cjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f44741z0.getChildAt(i11);
                boolean z13 = childAt instanceof org.telegram.ui.Cells.q1;
                if (z13) {
                    ijVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ijVar = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    ijVar = null;
                }
                if (ijVar != null && (message = ijVar.f23266k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.ij.R4(message) && !ijVar.h4()) {
                        int i12 = this.B6 - 1;
                        this.B6 = i12;
                        if (i12 <= 0) {
                            this.B6 = 0;
                            this.C6 = true;
                            qc(false);
                        } else {
                            this.f44717x1.c(2, i12, true);
                        }
                        org.telegram.messenger.qp messagesController = getMessagesController();
                        int e12 = ijVar.e1();
                        if (org.telegram.messenger.t3.T(this.f44473e)) {
                            j3 = this.f44473e.f26960id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.n3(j3, e12, this.f44545j6);
                        ijVar.f23266k.media_unread = false;
                    }
                    if (z13) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        q1Var.setHighlighted(false);
                        q1Var.o3();
                    }
                }
            }
            this.f44741z0.setItemAnimator(null);
        }
        Oc(false);
        rd();
        nj njVar = this.f44566l2;
        if (njVar != null) {
            if (!z9 && !this.kb) {
                z11 = true;
            } else {
                z11 = false;
            }
            njVar.setEnabled(z11);
        }
        nj njVar2 = this.f44589n2;
        if (njVar2 != null) {
            if (!z9 && !this.kb) {
                z10 = true;
            } else {
                z10 = false;
            }
            njVar2.setEnabled(z10);
        }
        pk pkVar = this.L2;
        if (pkVar != null) {
            pkVar.setEnabled(!isInPreviewMode());
        }
        ql qlVar = this.l1;
        if (qlVar != null) {
            qlVar.setOccupyStatusBar((this.inBubbleMode || this.kb || this.inPreviewMode) ? false : false);
        }
    }

    public final boolean t7(View view) {
        CharSequence slowModeTimer = this.Z.getSlowModeTimer();
        if (slowModeTimer != null) {
            yc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void t8(int i7, ArrayList arrayList, boolean z9) {
        ArrayList arrayList2;
        cn cnVar;
        int i10;
        cn cnVar2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && cnVar2.u7()) {
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList3.size()) {
                    org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList3.get(i11);
                    if (fzVar.f22524m == null && fzVar.f22522k == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.fz) arrayList3.get(0)).d)) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(((org.telegram.messenger.fz) arrayList3.get(0)).d, cnVar2.f44545j6, cnVar2.D5, cnVar2.f44568l4, null, false, ((org.telegram.messenger.fz) arrayList3.get(0)).f22520i, null, null, z9, i7, 0, null, false);
                    b10.K = cnVar2.X8();
                    org.telegram.messenger.gz.C(cnVar2.currentAccount).r0(b10);
                }
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                org.telegram.messenger.fz fzVar2 = (org.telegram.messenger.fz) arrayList3.get(i12);
                if (fzVar2.f22524m != null && fzVar2.f22522k == null) {
                    org.telegram.messenger.c accountInstance = cnVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = fzVar2.f22524m;
                    HashMap hashMap = fzVar2.f22525n;
                    int i13 = i12;
                    org.telegram.messenger.gz.S(i7, cnVar2.f44545j6, 0L, cnVar2.i9(), hashMap, accountInstance, cnVar2.D5, cnVar2.f44568l4, cnVar2.X8(), botInlineResult, null, cnVar2, cnVar2.B5, z9);
                    arrayList2 = arrayList;
                    cnVar = cnVar2;
                    arrayList2.remove(i13);
                    i10 = i13 - 1;
                } else {
                    arrayList2 = arrayList3;
                    cnVar = cnVar2;
                    i10 = i12;
                }
                i12 = i10 + 1;
                cnVar2 = cnVar;
                arrayList3 = arrayList2;
                z10 = false;
            }
            ArrayList arrayList4 = arrayList3;
            cn cnVar3 = cnVar2;
            if (!arrayList4.isEmpty()) {
                cnVar3.C8(((org.telegram.messenger.fz) arrayList4.get(0)).d, ((org.telegram.messenger.fz) arrayList4.get(0)).f22520i);
                org.telegram.messenger.gz.X(cnVar3.getAccountInstance(), arrayList4, cnVar3.f44545j6, cnVar3.D5, cnVar3.f44568l4, null, cnVar3.B5, false, true, cnVar3.F5, null, z9, i7, 0, ((org.telegram.messenger.fz) arrayList4.get(0)).f22531t, null, cnVar3.X8(), 0L, false, 0L, cnVar3.i9(), cnVar3.f44708w5, null, false);
                L6();
                if (i7 != 0) {
                    if (this.f44504g4 == -1) {
                        this.f44504g4 = 0;
                    }
                    this.f44504g4 = arrayList.size() + this.f44504g4;
                    ld(true);
                }
            }
        }
    }

    public final org.telegram.messenger.dj t9(org.telegram.messenger.ij ijVar) {
        if (ijVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.N6.f(ijVar.c1());
        if (djVar != null && (djVar.d.size() <= 1 || djVar.d(ijVar) == null)) {
            return null;
        }
        return djVar;
    }

    public final void tb(org.telegram.messenger.ij r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.tb(org.telegram.messenger.ij):void");
    }

    public final void tc(boolean z9) {
        if (z9) {
            if (this.f44485ec == null) {
                ae aeVar = new ae(this, 13);
                this.f44485ec = aeVar;
                org.telegram.messenger.g0.i3(aeVar, 100L);
                return;
            }
            return;
        }
        ae aeVar2 = this.f44485ec;
        if (aeVar2 != null) {
            org.telegram.messenger.g0.r(aeVar2);
        }
        this.f44485ec = null;
        this.dc = false;
        ed(true);
    }

    public final void td() {
        lh.h hVar;
        org.telegram.ui.ActionBar.x xVar;
        sj sjVar = this.Z;
        if (sjVar != null) {
            if (this.f44492f4 != 1 && !this.f44680u4 && !ba()) {
                hVar = null;
            } else {
                hVar = this.f44717x1;
            }
            sjVar.setSideButtonsForAttach(hVar);
            boolean ba2 = ba();
            if (this.f44714wb != ba2) {
                this.f44714wb = ba2;
                org.telegram.ui.ActionBar.r0 r0Var = this.f44527i0;
                if ((r0Var != null && r0Var.getVisibility() == 0) || ((xVar = this.f44488f0) != null && xVar.f28732l == 0)) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (!lVar.f27691n0 && !lVar.x()) {
                        if (this.Z.h0() && TextUtils.isEmpty(this.Z.getSlowModeTimer()) && !ba()) {
                            org.telegram.ui.ActionBar.x xVar2 = this.f44488f0;
                            if (xVar2 != null) {
                                xVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var2 = this.f44527i0;
                            if (r0Var2 != null) {
                                r0Var2.setVisibility(8);
                            }
                            fr frVar = this.f44474e0;
                            if (frVar != null) {
                                frVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.x xVar3 = this.f44488f0;
                            if (xVar3 != null) {
                                xVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var3 = this.f44527i0;
                            if (r0Var3 != null) {
                                r0Var3.setVisibility(0);
                            }
                            fr frVar2 = this.f44474e0;
                            if (frVar2 != null) {
                                frVar2.b(false);
                            }
                        }
                        wi wiVar = this.f44601o1;
                        if (wiVar != null) {
                            wiVar.f35005k0 = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void u(final org.telegram.messenger.gf gfVar, final org.telegram.messenger.j20 j20Var, final boolean z9, final int i7, final int i10, final boolean z10, long j3) {
        if (gfVar == null) {
            return;
        }
        this.bd.a(false, true);
        org.telegram.messenger.ij ijVar = this.F5;
        if (ijVar != null && ijVar.p5() && !org.telegram.messenger.t3.z(this.currentAccount, 24, org.telegram.messenger.ij.B0(this.F5.f23266k))) {
            org.telegram.messenger.nj njVar = this.f44708w5;
            if (njVar == null) {
                njVar = org.telegram.messenger.nj.b(this.F5.f23266k.suggested_post);
            }
            if (!bi.ea.T(this.currentAccount, njVar.f24206a)) {
                zc(njVar);
                return;
            }
        }
        if (j20Var != null && j20Var.f23493s) {
            bf bfVar = new bf(this, 25);
            this.G7 = bfVar;
            org.telegram.messenger.g0.i3(bfVar, 3000L);
        }
        C8(gfVar.f26848a, gfVar.f26859n);
        org.telegram.ui.Components.u4.Y(this.currentAccount, a(), 1, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                Long l10 = (Long) obj;
                cn cnVar = cn.this;
                org.telegram.messenger.ij ijVar2 = cnVar.F5;
                org.telegram.messenger.gf gfVar2 = gfVar;
                org.telegram.messenger.j20 j20Var2 = j20Var;
                boolean z11 = z9;
                int i11 = i7;
                int i12 = i10;
                boolean z12 = z10;
                if (ijVar2 != null && ijVar2.p5()) {
                    org.telegram.messenger.nj njVar2 = cnVar.f44708w5;
                    if (njVar2 == null) {
                        njVar2 = org.telegram.messenger.nj.b(cnVar.F5.f23266k.suggested_post);
                    }
                    org.telegram.messenger.nj njVar3 = njVar2;
                    if (gfVar2.f26849b) {
                        org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
                        String str = gfVar2.I;
                        String str2 = gfVar2.f26853g;
                        TLRPC.Photo photo = gfVar2.f26851e;
                        long j10 = cnVar.f44545j6;
                        org.telegram.messenger.ij ijVar3 = cnVar.F5;
                        org.telegram.messenger.ij ijVar4 = cnVar.f44568l4;
                        sm smVar = cnVar.B5;
                        ArrayList arrayList = gfVar2.f26859n;
                        int i13 = gfVar2.f26868x;
                        boolean z13 = gfVar2.M;
                        org.telegram.messenger.gz.b0(i13, i11, i12, j10, gfVar2.f26869y, l10.longValue(), cnVar.i9(), gfVar2.f26848a, str, str2, arrayList, accountInstance, ijVar3, ijVar4, null, njVar3, cnVar.X8(), j20Var2, photo, null, smVar, z11, z12, z13);
                    } else if (gfVar2.h != null) {
                        org.telegram.messenger.gz.Z(cnVar.getAccountInstance(), gfVar2.h, gfVar2.f26850c, null, cnVar.f44545j6, cnVar.F5, cnVar.f44568l4, cnVar.B5, gfVar2.f26859n, gfVar2.f26863r, null, gfVar2.f26868x, null, j20Var2, z11, i11, z12, gfVar2.f26848a, cnVar.X8(), gfVar2.f26869y, l10.longValue(), cnVar.i9(), njVar3);
                    } else if (gfVar2.I != null) {
                        org.telegram.messenger.gz.Z(cnVar.getAccountInstance(), gfVar2.I, gfVar2.f26850c, null, cnVar.f44545j6, cnVar.F5, cnVar.f44568l4, cnVar.B5, gfVar2.f26859n, gfVar2.f26863r, null, gfVar2.f26868x, null, j20Var2, z11, i11, z12, gfVar2.f26848a, cnVar.X8(), gfVar2.f26869y, l10.longValue(), cnVar.i9(), njVar3);
                    }
                } else if (gfVar2.f26849b) {
                    org.telegram.messenger.c accountInstance2 = cnVar.getAccountInstance();
                    String str3 = gfVar2.I;
                    String str4 = gfVar2.f26853g;
                    TLRPC.Photo photo2 = gfVar2.f26851e;
                    long j11 = cnVar.f44545j6;
                    org.telegram.messenger.ij ijVar5 = cnVar.D5;
                    org.telegram.messenger.ij ijVar6 = cnVar.f44568l4;
                    sm smVar2 = cnVar.B5;
                    ArrayList arrayList2 = gfVar2.f26859n;
                    int i14 = gfVar2.f26868x;
                    org.telegram.messenger.ij ijVar7 = cnVar.F5;
                    boolean z14 = gfVar2.M;
                    org.telegram.messenger.gz.b0(i14, i11, i12, j11, gfVar2.f26869y, l10.longValue(), cnVar.i9(), gfVar2.f26848a, str3, str4, arrayList2, accountInstance2, ijVar5, ijVar6, ijVar7, cnVar.f44708w5, cnVar.X8(), j20Var2, photo2, null, smVar2, z11, z12, z14);
                } else if (gfVar2.h != null) {
                    org.telegram.messenger.gz.Z(cnVar.getAccountInstance(), gfVar2.h, gfVar2.f26850c, null, cnVar.f44545j6, cnVar.D5, cnVar.f44568l4, cnVar.B5, gfVar2.f26859n, gfVar2.f26863r, null, gfVar2.f26868x, cnVar.F5, j20Var2, z11, i11, z12, gfVar2.f26848a, cnVar.X8(), gfVar2.f26869y, l10.longValue(), cnVar.i9(), cnVar.f44708w5);
                } else if (gfVar2.I != null) {
                    org.telegram.messenger.gz.Z(cnVar.getAccountInstance(), gfVar2.I, gfVar2.f26850c, null, cnVar.f44545j6, cnVar.D5, cnVar.f44568l4, cnVar.B5, gfVar2.f26859n, gfVar2.f26863r, null, gfVar2.f26868x, cnVar.F5, j20Var2, z11, i11, z12, gfVar2.f26848a, cnVar.X8(), gfVar2.f26869y, l10.longValue(), cnVar.i9(), cnVar.f44708w5);
                }
                cnVar.L6();
            }
        }, j3);
    }

    public final boolean u7() {
        CharSequence slowModeTimer = this.Z.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131745310, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SlowModeHint", null, 2131745311, slowModeTimer));
        jg.g.C(null, 2131747831, alertDialog$Builder, null);
        return false;
    }

    public final void u8(View view) {
        v8(view, false);
    }

    public final float u9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Ib;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[0];
        this.l1.getLocationInWindow(iArr);
        return (i7 - iArr[0]) + f10;
    }

    public final void ua() {
        Y6(5, this.f44462d1, true);
        Y6(1, this.Z, false);
        Y6(4, this.f44491f3, true);
        Y6(3, this.f44448c1, false);
        Y6(2, this.S, false);
        float f10 = this.f44460cd.f55498e;
        m6.n nVar = this.f44526hd;
        float v = com.google.android.recaptcha.internal.a.v(1.0f, f10, 1.0f - ((float[]) nVar.f19926b)[5], 1.0f);
        lh.c cVar = this.f44462d1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(v);
        }
        sj sjVar = this.Z;
        if (sjVar != null) {
            sjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        vj vjVar = this.f44491f3;
        if (vjVar != null) {
            vjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        wj wjVar = this.f44448c1;
        if (wjVar != null) {
            wjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        vj vjVar2 = this.S;
        if (vjVar2 != null) {
            vjVar2.setTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        jh.f fVar = this.T;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - v) * 255.0f));
            this.T.setInputBubbleTranslationY(org.telegram.messenger.g0.L(54.0f) * v);
        }
        wj wjVar2 = this.f44448c1;
        te.a aVar = this.f44431ad;
        if (wjVar2 != null) {
            wjVar2.setTotalVisibilityFactor((1.0f - aVar.f55498e) * ((float[]) nVar.f19926b)[3]);
        }
        xo xoVar = this.f44563ka;
        if (xoVar != null) {
            float f11 = aVar.f55498e;
            if (xoVar.S != f11) {
                xoVar.S = f11;
                this.fragmentView.invalidate();
            }
        }
        F7();
    }

    public final void ub(long j3) {
        fj fjVar;
        org.telegram.messenger.ij messageObject;
        int g92;
        int abs;
        int i7 = -1;
        if (this.f44741z0 != null && (fjVar = this.B0) != null && fjVar.f57030y < 0) {
            int i10 = 0;
            if (this.U6[0] && fjVar.L0() == 0) {
                this.D7 = -1;
                return;
            }
            int i11 = Integer.MAX_VALUE;
            for (int childCount = this.f44741z0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44741z0.getChildAt(childCount);
                this.f44741z0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.Y1() == j3 && (abs = Math.abs((g92 = g9(childAt)))) < i11) {
                    i7 = messageObject.e1();
                    i10 = g92;
                    i11 = abs;
                }
            }
            this.D7 = i7;
            this.E7 = i10;
            return;
        }
        this.D7 = -1;
    }

    public final void uc(boolean z9) {
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
                    org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(this);
                    if (z9) {
                        i7 = 2131743802;
                    } else {
                        i7 = 2131751348;
                    }
                    String M0 = org.telegram.messenger.id.M0(i7, null);
                    if (z9) {
                        i10 = 2131743801;
                    } else {
                        i10 = 2131751347;
                    }
                    org.telegram.ui.Components.bc I = a02.I(2131624210, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(i10, null), new ve(this, z9, 0)), spannableString, "%d"));
                    I.f32203j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void ud(boolean z9, boolean z10) {
        boolean z11;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.Wallet.b4 b4Var;
        if (this.fragmentView != null && !this.G5) {
            int childCount = this.f44741z0.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 < childCount) {
                    View childAt = this.f44741z0.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
                        if (this.f44441b8 != Integer.MAX_VALUE && messageObject != null && messageObject.e1() == this.f44441b8 && t0Var.S()) {
                            org.telegram.ui.Wallet.d4 d4Var = t0Var.I0;
                            if (!d4Var.f42315h0 && (d4Var.f42310e0 == 0 || (b4Var = d4Var.f42308d0) == null || b4Var.c())) {
                                d4Var.e();
                                org.telegram.ui.Wallet.b4 b4Var2 = d4Var.f42308d0;
                                b4Var2.getClass();
                                b4Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.b4 b4Var3 = d4Var.f42308d0;
                                b4Var3.f31773b = -1L;
                                b4Var3.f31774c = -1L;
                                d4Var.f42310e0 = SystemClock.elapsedRealtime();
                                d4Var.f42312f0 = false;
                                d4Var.f42302a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.ij messageObject2 = q1Var.getMessageObject();
                        if (this.H8 != null && ((messageObject2.h4() || org.telegram.messenger.ij.L4(messageObject2.f23266k)) && !messageObject2.T4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = q1Var.getPhotoImage();
                            this.H8.setTranslationX(q1Var.getX() + photoImage.K0);
                            this.H8.setTranslationY((this.f44741z0.getY() + ((q1Var.getY() + q1Var.getPaddingTop()) + photoImage.L0)) - this.H8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H8.getLayoutParams();
                            if (messageObject2.h4()) {
                                this.H8.setTag(2131296591, null);
                                if (layoutParams.width != org.telegram.messenger.g0.g3(aa(), R9()) || layoutParams.height != org.telegram.messenger.g0.g3(aa(), R9())) {
                                    int g32 = org.telegram.messenger.g0.g3(aa(), R9());
                                    layoutParams.height = g32;
                                    layoutParams.width = g32;
                                    this.J8.setResizeMode(0);
                                    this.H8.setLayoutParams(layoutParams);
                                }
                                float g33 = ((org.telegram.messenger.g0.f22573x * 2) + org.telegram.messenger.g0.g3(aa(), R9())) / org.telegram.messenger.g0.g3(aa(), R9());
                                float g34 = q1Var.getPhotoImage().M0 / org.telegram.messenger.g0.g3(aa(), R9());
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
            if (z9 && this.H8 != null && (ijVar = MediaController.B().f21300u0) != null && ijVar.T == 0) {
                if (!z11) {
                    if (this.A3 && org.telegram.messenger.ij.L4(ijVar.f23266k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.H8.setTranslationY((-org.telegram.messenger.g0.g3(aa(), R9())) - 100);
                    this.fragmentView.invalidate();
                    if (ijVar.h4() || org.telegram.messenger.ij.L4(ijVar.f23266k)) {
                        if (!this.A3 && PipRoundVideoView.F == null) {
                            if (z10) {
                                l(ijVar.e1(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.B().k0(false);
                        }
                    }
                } else {
                    MediaController.B().k0(true);
                    if (!ijVar.h4() && !this.L8) {
                        this.f44741z0.invalidate();
                    }
                }
            }
        }
    }

    public final void v7(Runnable runnable, cg.a aVar, boolean z9) {
        if (aVar != null && z9) {
            o1 o1Var = new o1(this, aVar, runnable, 20);
            bi.ea x10 = bi.ea.x(this.currentAccount, aVar.f6163a);
            if (!x10.f3807e) {
                x10.q(o1Var, true, true);
                return;
            } else {
                o1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void v8(View view, boolean z9) {
        boolean z10;
        Tb(view);
        if (view != this.f44717x1) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8(z9, z10, 0.2f);
    }

    public final float v9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Ib;
        q1Var.getLocationInWindow(iArr);
        int i7 = iArr[1];
        this.l1.getLocationInWindow(iArr);
        return (i7 - iArr[1]) + f10;
    }

    public final void va(boolean z9, boolean z10) {
        if (this.R3) {
            org.telegram.messenger.g0.i3(new ae(this, 23), 200L);
            if (z10) {
                this.R3 = false;
            }
        }
        if (z9 && !this.kb) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final void vb() {
        int i7;
        int i10;
        cj cjVar = this.f44741z0;
        if (cjVar != null && this.B0 != null) {
            for (int childCount = cjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44741z0.getChildAt(childCount);
                this.f44741z0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i7 = g9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i7 = g9(childAt);
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

    public final void vc(boolean z9) {
        if (this.Q != null) {
            if (!org.telegram.messenger.g0.Q1() && !this.f44680u4 && this.f44487f == null) {
                if (this.Gb == null) {
                    this.Gb = Boolean.valueOf(org.telegram.messenger.sc.e(360928));
                }
                if (this.Gb.booleanValue()) {
                    this.Fb = z9;
                    return;
                }
            }
            int i7 = 0;
            if (this.f44480e6 && org.telegram.messenger.iz.c()) {
                if (z9 == this.Fb) {
                    return;
                }
                this.Fb = z9;
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
                this.Q.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new gi(this, 3)).start();
                return;
            }
            this.Fb = z9;
            FrameLayout frameLayout = this.Q;
            if (!z9) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
        }
    }

    public final void vd(boolean z9) {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.Chat chat;
        wi wiVar = this.f44601o1;
        if (wiVar == null) {
            return;
        }
        int i7 = this.f44492f4;
        if (i7 == 8 && (chat = this.f44473e) != null) {
            if (this.f44518h4) {
                String i10 = qg.d.i(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.f44473e;
                wiVar.h(i10, chat2.scam, chat2.fake, chat2.verified, false, null, z9);
            } else if (org.telegram.messenger.t3.p0(chat)) {
                int i11 = (this.f44643r4 > 0L ? 1 : (this.f44643r4 == 0L ? 0 : -1));
                if (i11 == 0) {
                    TLRPC.Chat chat3 = this.f44473e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f44473e.linked_monoforum_id));
                        if (M02 == null) {
                            M02 = this.f44473e;
                        }
                        this.f44601o1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M02.title)), M02.scam, M02.fake, M02.verified, false, M02.emoji_status, z9);
                    } else {
                        wi wiVar2 = this.f44601o1;
                        String F2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.f44473e;
                        wiVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z9);
                    }
                } else if (i11 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f44643r4));
                    this.f44601o1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(a22))), a22.scam, a22.fake, a22.verified, a22.premium, a22.emoji_status, z9);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-this.f44643r4));
                    if (M03 == null) {
                        M03 = this.f44473e;
                    }
                    this.f44601o1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M03.title)), M03.scam, M03.fake, M03.verified, false, M03.emoji_status, z9);
                }
            } else {
                wi wiVar3 = this.f44601o1;
                String F22 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.f44473e.title));
                TLRPC.Chat chat5 = this.f44473e;
                wiVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z9);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i7 == 9) {
                wiVar.setTitle(org.telegram.messenger.id.M0(2131742898, null));
            } else if (i7 == 5) {
                if ("hello".equalsIgnoreCase(this.f44478e4)) {
                    this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131752775, null));
                } else if ("away".equalsIgnoreCase(this.f44478e4)) {
                    this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131752838, null));
                } else {
                    this.f44601o1.setTitle(this.f44478e4);
                }
            } else if (i7 == 6) {
                if (!TextUtils.isEmpty(this.f44464d4.title)) {
                    this.f44601o1.setTitle(this.f44464d4.title);
                } else {
                    this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131752716, null));
                }
            } else if (i7 == 3) {
                long j3 = this.f44643r4;
                if (j3 > 0) {
                    user = getMessagesController().a2(Long.valueOf(j3));
                    M0 = null;
                } else {
                    M0 = getMessagesController().M0(Long.valueOf(-j3));
                    user = null;
                }
                if (org.telegram.messenger.t10.z(user)) {
                    this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131746266, null));
                } else if (org.telegram.messenger.t10.s(user)) {
                    this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131754252, null));
                } else if (org.telegram.messenger.t10.B(user)) {
                    this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131748303, null));
                } else if (user != null) {
                    this.f44601o1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(user))));
                } else if (M0 != null) {
                    this.f44601o1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M0.title)));
                } else {
                    this.f44601o1.setTitle("");
                }
            } else if (ea() && !org.telegram.messenger.t10.u(this.f44487f)) {
                if (this.f44693v4) {
                    Ad();
                } else if (this.f44680u4) {
                    if (this.f44568l4.x2()) {
                        this.f44601o1.setTitle(org.telegram.messenger.id.G(this.f44568l4.M1(), "Comments", new Object[0]));
                    } else {
                        this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131751996, null));
                    }
                } else {
                    this.f44601o1.setTitle(org.telegram.messenger.id.G(this.f44568l4.M1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.t10.z(this.f44487f)) {
                this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131746266, null));
            } else if (org.telegram.messenger.t10.s(this.f44487f)) {
                this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131754252, null));
            } else {
                int i12 = this.f44492f4;
                if (i12 == 1) {
                    if (org.telegram.messenger.t10.B(this.f44487f)) {
                        this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131746322, null));
                    } else {
                        this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131745848, null));
                    }
                } else if (i12 == 2) {
                    this.f44601o1.setTitle(org.telegram.messenger.id.G(b9(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.f44473e;
                    if (chat6 != null) {
                        wi wiVar4 = this.f44601o1;
                        String F23 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.f44473e;
                        wiVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z9);
                    } else {
                        TLRPC.User user2 = this.f44487f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f44601o1.setTitle(org.telegram.messenger.id.M0(2131745901, null));
                            } else if (!org.telegram.messenger.qp.F2(user2) && getContactsController().f22614f0.get(Long.valueOf(this.f44487f.f27109id)) == null && (getContactsController().f22614f0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f44487f.phone)) {
                                    wi wiVar5 = this.f44601o1;
                                    String i13 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.f44487f.phone, pf.b.c());
                                    TLRPC.User user3 = this.f44487f;
                                    boolean z10 = user3.scam;
                                    boolean z11 = user3.fake;
                                    boolean z12 = user3.verified;
                                    org.telegram.messenger.qp messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f44487f;
                                    messagesController.getClass();
                                    wiVar5.h(i13, z10, z11, z12, org.telegram.messenger.qp.B2(user4), this.f44487f.emoji_status, z9);
                                } else {
                                    wi wiVar6 = this.f44601o1;
                                    String F24 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(this.f44487f)));
                                    TLRPC.User user5 = this.f44487f;
                                    boolean z13 = user5.scam;
                                    boolean z14 = user5.fake;
                                    boolean z15 = user5.verified;
                                    org.telegram.messenger.qp messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f44487f;
                                    messagesController2.getClass();
                                    wiVar6.h(F24, z13, z14, z15, org.telegram.messenger.qp.B2(user6), this.f44487f.emoji_status, z9);
                                }
                            } else {
                                wi wiVar7 = this.f44601o1;
                                String F25 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.t10.p(this.f44487f)));
                                TLRPC.User user7 = this.f44487f;
                                boolean z16 = user7.scam;
                                boolean z17 = user7.fake;
                                boolean z18 = user7.verified;
                                org.telegram.messenger.qp messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f44487f;
                                messagesController3.getClass();
                                boolean B2 = org.telegram.messenger.qp.B2(user8);
                                if (!org.telegram.messenger.qp.F2(this.f44487f)) {
                                    emojiStatus = this.f44487f.emoji_status;
                                }
                                wiVar7.h(F25, z16, z17, z18, B2, emojiStatus, z9);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f44601o1.getTitleTextView().getText());
        xd(false);
    }

    public final void w7() {
        if (this.N3 != null) {
            return;
        }
        ok okVar = new ok(this, getParentActivity(), this, this.f44750za);
        this.N3 = okVar;
        this.l1.addView(okVar, 17, c8.ha.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void w8(boolean z9, boolean z10, float f10) {
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
                pb(q1Var2);
            }
        }
        this.l1.invalidate();
        this.f44741z0.invalidate();
        AnimatorSet animatorSet = this.f44469d9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f44469d9.cancel();
        }
        this.f44469d9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.V8, f10);
        float f11 = 1.0f;
        if (z11) {
            this.Y8 = 1.0f;
            this.Z8 = 0.0f;
            ValueAnimator valueAnimator = this.Gc;
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
        if ((!z11 || z10) && (hVar = this.f44717x1) != null) {
            Property property = View.ALPHA;
            if (z11) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f11));
        }
        this.f44469d9.playTogether(arrayList);
        this.f44469d9.setInterpolator(org.telegram.ui.Components.wq.h);
        this.f44469d9.setDuration(320L);
        View view2 = this.X8;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view2;
        } else {
            q1Var = null;
        }
        this.f44469d9.addListener(new ai.g0(this, z11, q1Var, 6));
        if (this.X8 != null && this.Y8 <= 0.0f) {
            Tb(null);
        }
        this.f44469d9.start();
    }

    public final void w9(boolean z9) {
        int i7;
        int i10;
        if (this.f44492f4 == 7) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.J3;
            if (z9) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            org.telegram.messenger.na b10 = a10.b(this.f44451c4);
            if (i13 >= 0 && i13 < b10.f24163a.size()) {
                b10.f24172l = i13;
                org.telegram.messenger.qs.f(a10.f24316a).k(org.telegram.messenger.qs.I0, Integer.valueOf(i11), Integer.valueOf(b10.f24173m), Boolean.valueOf(b10.f24174n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f24172l), Integer.valueOf(((org.telegram.messenger.ij) b10.f24163a.get(i13)).f23266k.f26981id));
                return;
            }
            return;
        }
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        long j3 = this.f44545j6;
        long j10 = this.f44440b7;
        int i14 = this.classGuid;
        boolean z10 = this.f44575lb;
        if (!z9 ? !z10 : z10) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        mediaDataController.X1(null, j3, j10, i14, i7, this.f44643r4, false, this.C3, this.D3, true, this.E3);
        rc(false);
    }

    public final void wa() {
        this.P4 = true;
        rl rlVar = this.s9;
        org.telegram.messenger.g0.r(rlVar.f30673f0);
        rlVar.f30699z = false;
        ae aeVar = new ae(this, 9);
        int i7 = this.T7;
        if (i7 != 0) {
            Ab(i7, 0, false, this.S7, true, 0, null, null, aeVar);
            return;
        }
        int i10 = this.R7;
        if (i10 > 0) {
            Ab(i10, 0, true, this.S7, true, 0, null, null, aeVar);
            return;
        }
        zb(!this.Ab, aeVar);
        this.Ab = false;
        if (!this.T4.isEmpty()) {
            this.f44423a5 = true;
            this.Z4 = ((Integer) this.T4.get(0)).intValue();
        }
    }

    public final boolean wb() {
        sj sjVar = this.Z;
        if (sjVar != null && sjVar.v0() && !this.Z.f31045c1 && !MediaController.B().K()) {
            this.f44581m5 = true;
            sj sjVar2 = this.Z;
            this.f44592n5 = sjVar2.O;
            this.f44604o5 = sjVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void wc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.id.M0(2131752657, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752658, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new fe(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        showDialog(u1Var);
    }

    public final void wd() {
        xd(false);
    }

    public final void x7(boolean z9) {
        long j3;
        if (System.currentTimeMillis() - this.f44551jc > 1000) {
            z9 = true;
        }
        xf xfVar = this.f44564kc;
        org.telegram.messenger.g0.r(xfVar);
        if (z9) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        org.telegram.messenger.g0.i3(xfVar, j3);
    }

    public final void x8(Runnable runnable) {
        org.telegram.messenger.qs.f(this.currentAccount).d(runnable);
    }

    public final void x9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.x9():void");
    }

    public final int xb(org.telegram.messenger.ij r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.xb(org.telegram.messenger.ij):int");
    }

    public final void xc() {
        String str;
        if (this.f44538ic != null) {
            return;
        }
        if (this.D5 != null) {
            str = getMessagesController().c1(this.D5.R1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.id.M0(2131743811, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743812, str));
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751335, null), new fe(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new fe(this, 20));
        u1Var.setOnDismissListener(new ee(this, 8));
        this.f44538ic = alertDialog$Builder.p();
    }

    public final void xd(boolean z9) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.p0 p0Var;
        if (this.f44601o1 != null) {
            int i7 = this.f44492f4;
            if (i7 == 0 || i7 == 8) {
                boolean r22 = getMessagesController().r2(this.f44545j6, b(), null);
                if (z9) {
                    r22 = !r22;
                }
                this.Q0 = null;
                if (!org.telegram.messenger.t3.e0(this.currentAccount, this.f44473e) && !org.telegram.messenger.t3.f0(this.currentAccount, this.f44487f)) {
                    if (!org.telegram.messenger.t10.z(this.f44487f) && ((!ea() || this.f44693v4) && r22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231942).mutate();
                    int i10 = org.telegram.ui.ActionBar.m6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
                    this.Q0 = mutate;
                    this.N0 = getThemedColor(i10);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f44473e;
                    if (chat != null) {
                        drawable = this.f44601o1.c(org.telegram.messenger.m5.c(chat));
                    } else {
                        TLRPC.User user = this.f44487f;
                        if (user != null && !org.telegram.messenger.t10.B(user)) {
                            drawable = this.f44601o1.c(org.telegram.messenger.m5.c(this.f44487f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f44601o1.j(drawable, mutate);
                if (!z9 && (p0Var = this.f44654s1) != null) {
                    if (r22) {
                        if (p0Var.f28367m != 8) {
                            p0Var.f28367m = 8;
                            View view = p0Var.f28364j;
                            if (view instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view).getRightIcon().setVisibility(p0Var.f28367m);
                            }
                        }
                        this.f44654s1.d(org.telegram.messenger.id.M0(2131743849, null));
                        this.f44654s1.b(2131232256);
                    } else {
                        if (p0Var.f28367m != 0) {
                            p0Var.f28367m = 0;
                            View view2 = p0Var.f28364j;
                            if (view2 instanceof org.telegram.ui.ActionBar.z0) {
                                ((org.telegram.ui.ActionBar.z0) view2).getRightIcon().setVisibility(p0Var.f28367m);
                            }
                        }
                        if (getMessagesController().s2(this.f44545j6, b())) {
                            this.f44654s1.d(org.telegram.messenger.id.M0(2131748314, null));
                            this.f44654s1.b(2131232412);
                        } else {
                            this.f44654s1.d(org.telegram.messenger.id.M0(2131748314, null));
                            this.f44654s1.b(2131232366);
                        }
                    }
                }
                org.telegram.ui.Components.xn xnVar = this.f44704w1;
                if (xnVar != null) {
                    xnVar.e(this.f44545j6, b(), null);
                }
            }
        }
    }

    @Override
    public final boolean y(final org.telegram.ui.zw r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.z91 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.y(org.telegram.ui.zw, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.z91):boolean");
    }

    public final void y7() {
        int s9 = (int) (s9(org.telegram.ui.Components.i11.f34509c) + this.T.getInputBubbleHeight() + this.f44702w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        this.Y.setFadeZoneBottom(s9);
        int b10 = c8.j9.b(org.telegram.messenger.g0.L(36.0f) + (this.l1.getMeasuredHeight() - s9), 0, this.l1.getMeasuredHeight());
        int measuredWidth = this.l1.getMeasuredWidth();
        Rect rect = f44416sd;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Va, this.f44741z0.getMeasuredWidth(), org.telegram.messenger.g0.L(36.0f) + ((this.f44741z0.getMeasuredHeight() - this.Wa) - s9));
    }

    public final void y8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        org.telegram.messenger.ij ijVar = this.F5;
        if (ijVar != null && (message = ijVar.f23266k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean y9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f44582m6;
        for (int i7 = 0; i7 < sparseArrayArr.length; i7++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i7].size(); i10++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].valueAt(i10);
                    if (ijVar != null && (message = ijVar.f23266k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void ya(long j3, String str, boolean z9) {
        za();
        di.u2 u2Var = this.X1;
        if (u2Var != null) {
            u2Var.C1(j3, str, z9, false);
        }
    }

    public final void yb() {
        zb(false, null);
    }

    public final void yc(View view, CharSequence charSequence, boolean z9) {
        fi.m3 m3Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z9 || ((m3Var = this.A2) != null && m3Var.V)) {
                this.A2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SlowModeHint", null, 2131745311, charSequence)));
                if (z9) {
                    this.A2.y(view, true);
                }
            }
        }
    }

    public final void yd(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.yd(boolean):void");
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
        if (this.f44601o1 != null) {
            float actionModeFactor = (1.0f - this.f44499fd.f55498e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, actionModeFactor);
            this.f44601o1.setScaleX(T1);
            this.f44601o1.setScaleY(T1);
            this.f44601o1.setAlpha(actionModeFactor);
            wi wiVar = this.f44601o1;
            if (actionModeFactor > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            wiVar.setVisibility(i7);
        }
    }

    public final org.telegram.ui.Components.s01 z8() {
        long b10;
        boolean z9;
        if (this.m0 == null && getParentActivity() != null && this.l1 != null) {
            org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01(getParentActivity(), this.currentAccount, a(), this.f44750za, new fk(this));
            this.m0 = s01Var;
            this.l1.addView(s01Var, c8.ha.c(-1.0f, -1));
        }
        org.telegram.ui.Components.s01 s01Var2 = this.m0;
        if (s01Var2 != null) {
            if (Y9()) {
                b10 = d9();
            } else {
                b10 = b();
            }
            s01Var2.setCurrentTopic(b10);
            org.telegram.ui.Components.s01 s01Var3 = this.m0;
            if (this.f44527i0 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            s01Var3.setMenuAvailable(z9);
        }
        return this.m0;
    }

    public final boolean z9() {
        rl rlVar = this.s9;
        if (rlVar != null && rlVar.x()) {
            return true;
        }
        return false;
    }

    public final void za() {
        boolean z9;
        boolean z10;
        if (getParentActivity() != null) {
            sj sjVar = this.Z;
            if (sjVar == null || TextUtils.isEmpty(sjVar.getSlowModeTimer())) {
                sj sjVar2 = this.Z;
                if (sjVar2 != null && sjVar2.f31107m5.f55499f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                U7();
                di.u2 u2Var = this.X1;
                if (!z9 && this.f44492f4 != 9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u2Var.O3 = z10;
                u2Var.d2.i0();
                TLRPC.Chat chat = this.f44473e;
                if ((chat == null || this.f44708w5 == null) && !z9 && this.f44492f4 != 9) {
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f44473e.slowmode_enabled) {
                        this.X1.y1(10, true);
                    } else {
                        this.X1.y1(-1, true);
                    }
                } else {
                    this.X1.y1(1, true);
                }
                di.u2 u2Var2 = this.X1;
                u2Var2.P2 = true;
                u2Var2.f32657u3.setVisibility(0);
                u2Var2.N2 = 0;
                u2Var2.f32675z1 = false;
                u2Var2.A1 = false;
                u2Var2.f32597c2 = true;
                u2Var2.D1 = null;
                org.telegram.ui.ActionBar.r0 r0Var = u2Var2.f32612h3;
                if (r0Var != null) {
                    u2Var2.f32609g3.setTranslationY(0.0f);
                    r0Var.setVisibility(8);
                }
                this.X1.e1();
                this.X1.a1().setText(this.Z.getFieldText());
                di.u2 u2Var3 = this.X1;
                u2Var3.f32647s1 = this.f44750za;
                showDialog(u2Var3);
            }
        }
    }

    public final void zb(boolean z9, ae aeVar) {
        ArrayList arrayList;
        int i7;
        if (this.f44741z0.V1) {
            return;
        }
        this.Z4 = 0;
        this.Sb = 0;
        this.f44423a5 = false;
        this.f44585m9.f(0);
        if (this.U6[0] && this.X7 == 0 && this.K7 == 0) {
            this.f44717x1.d(false);
            if (this.B0.I0() == 0) {
                this.B9 = false;
                cd();
                kb();
                Fd(false);
                return;
            }
            this.C0.T();
            om omVar = this.f44524hb;
            omVar.f48546a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.K6;
                if (i10 >= arrayList.size() || !((org.telegram.messenger.ij) arrayList.get(i10)).r4()) {
                    break;
                }
                i10++;
                z9 = false;
            }
            if (z9 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i10) != null) {
                long c12 = ((org.telegram.messenger.ij) arrayList.get(i10)).c1();
                while (c12 != 0 && (i7 = i10 + 1) < arrayList.size() && c12 == ((org.telegram.messenger.ij) arrayList.get(i7)).c1()) {
                    i10 = i7;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 = Math.min(i10, arrayList.size() - 1);
            }
            yj yjVar = this.f44585m9;
            omVar.f48547b = i10;
            omVar.d = 0;
            boolean z10 = !z9;
            omVar.f48548c = z10;
            yjVar.d(i10, 0, z10, true);
            this.B9 = false;
            cd();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.Rb;
        if (u1Var != null) {
            u1Var.dismiss();
        }
        ed(false);
        if (aeVar != null) {
            aeVar.run();
        } else {
            ob();
            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), this.f44750za);
            this.Rb = u1Var2;
            u1Var2.setOnCancelListener(this.Ha);
            this.Rb.r(1000L);
        }
        this.f44608o9 = this.f44570l6;
        this.f44634q9 = false;
        this.f44621p9 = 0;
        this.f44648r9 = false;
        ArrayList arrayList2 = this.f44722x6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f44570l6));
        org.telegram.messenger.g0.i3(new bf(this, 13), 0L);
    }

    public final void zc(org.telegram.messenger.nj njVar) {
        if (this.F5 == null) {
            return;
        }
        new bi.e1(getParentActivity(), this.currentAccount, this.f44545j6, njVar, this, getResourceProvider(), 0, new ne(this, 0)).show();
    }

    public final void zd() {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.p0 p0Var = this.f44689v0;
        if (p0Var != null) {
            TLRPC.Chat chat = this.f44473e;
            if (chat != null && org.telegram.messenger.t3.i(this.currentAccount, chat, this.f44629q4) && (tL_forumTopic = this.f44629q4) != null && !tL_forumTopic.closed) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            p0Var.e(i7);
        }
    }

    public void xa(boolean z9) {
    }

    @Override
    public final void S() {
    }
}
