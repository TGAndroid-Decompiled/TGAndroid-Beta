package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
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
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public class co extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, oy, dd0, org.telegram.ui.Components.fk, org.telegram.ui.Components.ch, ng.b, org.telegram.ui.Components.o50, le.d {
    public static int Hc = 22;
    public static float Ic = 1.4f;
    public static int Jc = 10;
    public static Pattern Kc;
    public static Pattern Lc;
    public static Pattern Mc;
    public static final int[] Nc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Oc = false;
    public static final Rect Pc = new Rect();
    public om A0;
    public di.f4 A1;
    public boolean A2;
    public org.telegram.ui.Components.qc A3;
    public int A4;
    public int A5;
    public final int[] A6;
    public boolean A7;
    public final bh.b A8;
    public float A9;
    public int Aa;
    public of.e Ab;
    public final le.b Ac;
    public tk B0;
    public yl B1;
    public final org.telegram.ui.Components.x9[] B2;
    public boolean B3;
    public int B4;
    public boolean B5;
    public final int[] B6;
    public int B7;
    public Bitmap B8;
    public TLRPC.Document B9;
    public ChatMessageSharedResources Ba;
    public boolean Bb;
    public final j6.l Bc;
    public boolean C0;
    public float C1;
    public final bo[] C2;
    public int C3;
    public qf C4;
    public TLRPC.PhotoSize C5;
    public final boolean[] C6;
    public int C7;
    public BitmapShader C8;
    public boolean C9;
    public ValueAnimator Ca;
    public me Cb;
    public rh.c Cc;
    public org.telegram.ui.Components.d90 D0;
    public TL_stories.TL_premium_boostsStatus D1;
    public final org.telegram.ui.ActionBar.j5[] D2;
    public boolean D3;
    public boolean D4;
    public TLRPC.PhotoSize D5;
    public final boolean[] D6;
    public int D7;
    public Paint D8;
    public boolean D9;
    public float Da;
    public boolean Db;
    public yf.c0 Dc;
    public final pe.b E;
    public TextView E0;
    public ChannelBoostsController.CanApplyBoost E1;
    public final bi.c4[] E2;
    public FlagSecureReason E3;
    public boolean E4;
    public TLObject E5;
    public final boolean[] E6;
    public boolean E7;
    public Matrix E8;
    public long E9;
    public il Ea;
    public boolean Eb;
    public final ArrayList Ec;
    public final bh.f F;
    public sk F0;
    public boolean F1;
    public NumberTextView F2;
    public boolean F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public boolean F7;
    public Paint F8;
    public int F9;
    public final ql Fa;
    public final RectF Fb;
    public final ArrayList Fc;
    public final int G;
    public RadialProgressView G0;
    public me G1;
    public int G2;
    public MessageObject G3;
    public int G4;
    public TLRPC.WebPage G5;
    public boolean G6;
    public boolean G7;
    public final Paint G8;
    public int G9;
    public final tl Ga;
    public org.telegram.ui.ActionBar.b2 Gb;
    public final Rect Gc;
    public final gh.d H;
    public AnimatorSet H0;
    public ImageView H1;
    public final AnimatorSet[] H2;
    public int H3;
    public ArrayList H4;
    public ArrayList H5;
    public boolean H6;
    public int H7;
    public float H8;
    public int H9;
    public ArrayList Ha;
    public long Hb;
    public final gh.d I;
    public boolean I0;
    public fk I1;
    public boolean I2;
    public MessageObject I3;
    public int I4;
    public String I5;
    public boolean I6;
    public boolean I7;
    public boolean I8;
    public int I9;
    public final bm Ia;
    public final ug Ib;
    public final bh.b J;
    public di.f4 J0;
    public bi.t3 J1;
    public ImageView J2;
    public MessageObject J3;
    public HashMap J4;
    public i9.s J5;
    public int J6;
    public MessageObject J7;
    public View J8;
    public boolean J9;
    public final ki Ja;
    public int Jb;
    public final bh.b K;
    public di.f4 K0;
    public org.telegram.ui.ActionBar.q0 K1;
    public RadialProgressView K2;
    public ih.f K3;
    public final SparseArray K4;
    public TLRPC.ChatInvite K5;
    public int K6;
    public MessageObject K7;
    public float K8;
    public boolean K9;
    public final bj Ka;
    public boolean Kb;
    public final gh.e L;
    public di.f4 L0;
    public TextView L1;
    public ImageView L2;
    public bi.o0 L3;
    public int L4;
    public me L5;
    public long L6;
    public int L7;
    public float L8;
    public boolean L9;
    public final pn La;
    public Pattern Lb;
    public final bh.b M;
    public org.telegram.ui.Components.dh M0;
    public boolean M1;
    public AnimatorSet M2;
    public hg.o1 M3;
    public final int[] M4;
    public final LongSparseIntArray M5;
    public boolean M6;
    public boolean M7;
    public Integer M8;
    public org.telegram.ui.Components.ui M9;
    public final qf Ma;
    public MessageObject Mb;
    public org.telegram.ui.ActionBar.b2 N;
    public boolean N0;
    public TextView N1;
    public FrameLayout N2;
    public ih.e N3;
    public int N4;
    public boolean N5;
    public long N6;
    public boolean N7;
    public int N8;
    public float N9;
    public final qf Na;
    public hf Nb;
    public boolean O;
    public rk O0;
    public TextView O1;
    public nk O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ArrayList O6;
    public long O7;
    public boolean O8;
    public float O9;
    public boolean Oa;
    public ArrayList Ob;
    public FrameLayout P;
    public kh.c P0;
    public zk P1;
    public TextView P2;
    public TL_account.TL_businessChatLink P3;
    public int P4;
    public long P5;
    public final Paint P6;
    public String P7;
    public AnimatorSet P8;
    public aq P9;
    public boolean Pa;
    public final BotForumHelper.BotDraftAnimationsPool Pb;
    public di.r6 Q;
    public FrameLayout Q0;
    public TextView Q1;
    public TextView Q2;
    public String Q3;
    public int Q4;
    public boolean Q5;
    public final Paint Q6;
    public Integer Q7;
    public org.telegram.ui.ActionBar.n1 Q8;
    public Animator Q9;
    public long Qa;
    public final ih.a Qb;
    public qk R;
    public LinearLayout R0;
    public org.telegram.ui.Components.w21 R1;
    public qk R2;
    public int R3;
    public boolean R4;
    public boolean R5;
    public final ColorMatrix R6;
    public byte[] R7;
    public boolean R8;
    public boolean R9;
    public NotificationCenter.ObserversGroup Ra;
    public boolean Rb;
    public ih.g S;
    public org.telegram.ui.Components.io S0;
    public ig.e S1;
    public ImageView S2;
    public int S3;
    public boolean S4;
    public boolean S5;
    public final m.c3 S6;
    public int S7;
    public org.telegram.ui.ActionBar.f1[] S8;
    public boolean S9;
    public NotificationCenter.ObserversGroup Sa;
    public boolean Sb;
    public View T;
    public ui T0;
    public org.telegram.ui.Components.d90 T1;
    public ImageView T2;
    public boolean T3;
    public AnimatorSet T4;
    public long T5;
    public final org.telegram.ui.ActionBar.f5 T6;
    public int T7;
    public org.telegram.ui.ActionBar.f1 T8;
    public co T9;
    public boolean Ta;
    public boolean Tb;
    public FrameLayout U;
    public ig.c2 U0;
    public ImageView U1;
    public org.telegram.ui.Components.q6 U2;
    public String U3;
    public final SparseIntArray U4;
    public Long U5;
    public long U6;
    public me U7;
    public final ek U8;
    public float U9;
    public int Ua;
    public long Ub;
    public FrameLayout V;
    public ig.z V0;
    public fi.o V1;
    public org.telegram.ui.Components.q6 V2;
    public byte[] V3;
    public final SparseIntArray V4;
    public int V5;
    public int V6;
    public String V7;
    public pm V8;
    public AnimatorSet V9;
    public int Va;
    public boolean Vb;
    public final ih.l W;
    public ih.k W0;
    public TextView W1;
    public org.telegram.ui.Components.q6 W2;
    public String W3;
    public boolean W4;
    public final SparseArray[] W5;
    public int W6;
    public ChatObject.Call W7;
    public uk W8;
    public final nk W9;
    public boolean Wa;
    public boolean Wb;
    public kh.f X;
    public um X0;
    public hk X1;
    public dk X2;
    public MessageObject X3;
    public boolean X4;
    public final SparseArray[] X5;
    public final Matrix X6;
    public boolean X7;
    public int X8;
    public vh.i X9;
    public boolean Xa;
    public boolean Xb;
    public mk Y;
    public org.telegram.ui.Components.eo Y0;
    public FrameLayout Y1;
    public ck Y2;
    public MessageObject Y3;
    public boolean Y4;
    public final SparseArray[] Y5;
    public LinearGradient Y6;
    public boolean Y7;
    public int Y8;
    public ah.g0 Y9;
    public a0.i Ya;
    public boolean Yb;
    public ok Z;
    public final ArrayList Z0;
    public hk Z1;
    public org.telegram.ui.Cells.w0 Z2;
    public boolean Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public TLRPC.ChatFull Z7;
    public int Z8;
    public k51 Z9;
    public a0.i Za;
    public z8 Zb;
    public int f35211a;
    public ah.y f35212a0;
    public pj f35213a1;
    public FrameLayout a2;
    public int f35214a3;
    public ArrayList f35215a4;
    public boolean f35216a5;
    public int f35217a6;
    public int f35218a7;
    public TLRPC.UserFull f35219a8;
    public boolean f35220a9;
    public boolean f35221aa;
    public long f35222ab;
    public int f35223ac;
    public boolean f35224b;
    public int f35225b0;
    public org.telegram.ui.Components.q6 f35226b1;
    public TextView f35227b2;
    public gl f35228b3;
    public MessageObject f35229b4;
    public boolean f35230b5;
    public int f35231b6;
    public final Paint f35232b7;
    public org.telegram.ui.Cells.f6 f35233b8;
    public boolean f35234b9;
    public org.telegram.ui.Components.lp f35235ba;
    public dl f35236bb;
    public ValueAnimator f35237bc;
    public boolean f35238c;
    public org.telegram.ui.ActionBar.t0 f35239c0;
    public ph f35240c1;
    public org.telegram.ui.Components.t00 f35241c2;
    public View f35242c3;
    public TLRPC.TL_forumTopic f35243c4;
    public MessageObject f35244c5;
    public int f35245c6;
    public final Matrix f35246c7;
    public p11 f35247c8;
    public vm f35248c9;
    public ao f35249ca;
    public boolean cb;
    public wi f35250cc;
    public boolean d;
    public hs f35251d0;
    public org.telegram.ui.Components.my0 f35252d1;
    public org.telegram.ui.Components.xw0 f35253d2;
    public boolean f35254d3;
    public long f35255d4;
    public MessageObject f35256d5;
    public int f35257d6;
    public LinearGradient f35258d7;
    public final a0.i f35259d8;
    public org.telegram.ui.Cells.t1 f35260d9;
    public co f35261da;
    public boolean f35262db;
    public boolean f35263dc;
    public TLRPC.Chat f35264e;
    public org.telegram.ui.ActionBar.y f35265e0;
    public org.telegram.ui.ActionBar.t0 f35266e1;
    public org.telegram.ui.Components.i40 f35267e2;
    public boolean f35268e3;
    public int f35269e4;
    public MessageObject.GroupedMessages f35270e5;
    public int f35271e6;
    public boolean e7;
    public String f35272e8;
    public boolean f35273e9;
    public ao f35274ea;
    public boolean f35275eb;
    public int ec;
    public TLRPC.User f35276f;
    public org.telegram.ui.ActionBar.t0 f35277f0;
    public org.telegram.ui.ActionBar.t0 f35278f1;
    public org.telegram.ui.Components.i40 f35279f2;
    public boolean f35280f3;
    public TLRPC.Chat f35281f4;
    public MessagePreviewParams f35282f5;
    public int f35283f6;
    public boolean f7;
    public long f35284f8;
    public boolean f35285f9;
    public xh.d f35286fa;
    public ArrayList f35287fb;
    public int f35288fc;
    public org.telegram.ui.ActionBar.t0 f35289g0;
    public org.telegram.ui.ActionBar.t0 f35290g1;
    public ij f35291g2;
    public AnimatorSet f35292g3;
    public boolean f35293g4;
    public MessageSuggestionParams f35294g5;
    public int f35295g6;
    public int f35296g7;
    public String f35297g8;
    public boolean f35298g9;
    public final ChatMessagesMetadataController ga;
    public ValueAnimator f35299gb;
    public int gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.v0 f35300h0;
    public org.telegram.ui.ActionBar.t0 f35301h1;
    public boolean f35302h2;
    public ValueAnimator f35303h3;
    public boolean f35304h4;
    public MessageObject f35305h5;
    public final ArrayList f35306h6;
    public boolean f35307h7;
    public boolean f35308h8;
    public rl f35309h9;
    public TLRPC.TL_channels_sendAsPeers ha;
    public boolean f35310hb;
    public int f35311hc;
    public org.telegram.ui.ActionBar.y f35312i0;
    public org.telegram.ui.Components.oo f35313i1;
    public org.telegram.ui.Components.i40 f35314i2;
    public float f35315i3;
    public boolean f35316i4;
    public MessageObject.GroupedMessages f35317i5;
    public boolean f35318i6;
    public boolean f35319i7;
    public boolean f35320i8;
    public boolean f35321i9;
    public TL_account.resolvedBusinessChatLinks f35322ia;
    public Boolean f35323ib;
    public int f35324ic;
    public org.telegram.ui.ActionBar.v0 f35325j0;
    public kh.h f35326j1;
    public boolean f35327j2;
    public boolean j3;
    public boolean f35328j4;
    public MessageObject.GroupedMessages f35329j5;
    public int f35330j6;
    public int f35331j7;
    public String f35332j8;
    public float f35333j9;
    public boolean f35334ja;
    public boolean f35335jb;
    public boolean f35336jc;
    public org.telegram.ui.ActionBar.v0 f35337k0;
    public boolean f35338k1;
    public org.telegram.ui.Components.i40 f35339k2;
    public boolean f35340k3;
    public int f35341k4;
    public MessageObject f35342k5;
    public int f35343k6;
    public boolean f35344k7;
    public String f35345k8;
    public gk f35346k9;
    public boolean f35347ka;
    public boolean f35348kb;
    public long f35349kc;
    public org.telegram.ui.ActionBar.t0 f35350l0;
    public int l1;
    public org.telegram.ui.Components.i40 f35351l2;
    public boolean f35352l3;
    public int l4;
    public sn f35353l5;
    public int f35354l6;
    public boolean f35355l7;
    public MessageObject f35356l8;
    public org.telegram.ui.Cells.t1 f35357l9;
    public float f35358la;
    public int f35359lb;
    public TLRPC.TL_messages_discussionMessage f35360lc;
    public org.telegram.ui.ActionBar.v0 m0;
    public int f35361m1;
    public org.telegram.ui.Components.i40 f35362m2;
    public boolean f35363m3;
    public int f35364m4;
    public boolean f35365m5;
    public boolean f35366m6;
    public boolean f35367m7;
    public MessageObject f35368m8;
    public org.telegram.ui.Components.r00 f35369m9;
    public final pg f35370ma;
    public HashMap f35371mb;
    public TLRPC.messages_Messages f35372mc;
    public boolean f35373n;
    public org.telegram.ui.ActionBar.y f35374n0;
    public org.telegram.ui.Components.qc f35375n1;
    public org.telegram.ui.Components.i40 f35376n2;
    public boolean f35377n3;
    public ai f35378n4;
    public MessageObject f35379n5;
    public final ArrayList f35380n6;
    public int f35381n7;
    public int f35382n8;
    public boolean f35383n9;
    public final wk f35384na;
    public qf nb;
    public boolean nc;
    public boolean f35385o0;
    public yk f35386o1;
    public org.telegram.ui.Components.i40 f35387o2;
    public TLRPC.User f35388o3;
    public final SparseArray f35389o4;
    public int f35390o5;
    public final SparseArray[] f35391o6;
    public int f35392o7;
    public boolean f35393o8;
    public boolean o9;
    public int f35394oa;
    public int f35395ob;
    public un f35396oc;
    public RadialProgressView f35397p0;
    public kk f35398p1;
    public org.telegram.ui.Cells.t1 f35399p2;
    public TLRPC.Chat f35400p3;
    public final ArrayList f35401p4;
    public MessageObject p5;
    public final SparseArray f35402p6;
    public boolean f35403p7;
    public long f35404p8;
    public ValueAnimator f35405p9;
    public int f35406pa;
    public org.telegram.ui.ActionBar.b2 f35407pb;
    public on f35408pc;
    public org.telegram.ui.ActionBar.t0 f35409q0;
    public di.i1 f35410q1;
    public int f35411q2;
    public ah.j1 f35412q3;
    public int f35413q4;
    public boolean f35414q5;
    public final SparseArray q6;
    public me f35415q7;
    public long f35416q8;
    public ValueAnimator f35417q9;
    public qf f35418qa;
    public int f35419qb;
    public zh.a4 f35420qc;
    public long f35421r;
    public org.telegram.ui.ActionBar.t0 f35422r0;
    public int f35423r1;
    public int f35424r2;
    public boolean f35425r3;
    public boolean f35426r4;
    public boolean f35427r5;
    public final HashMap f35428r6;
    public String f35429r7;
    public boolean f35430r8;
    public boolean f35431r9;
    public boolean f35432ra;
    public int f35433rb;
    public boolean f35434rc;
    public final HashMap f35435s;
    public org.telegram.ui.ActionBar.t0 f35436s0;
    public boolean f35437s1;
    public org.telegram.ui.Components.i40 f35438s2;
    public boolean f35439s3;
    public boolean f35440s4;
    public boolean f35441s5;
    public final SparseArray f35442s6;
    public boolean f35443s7;
    public String f35444s8;
    public float f35445s9;
    public boolean f35446sa;
    public boolean f35447sb;
    public float f35448sc;
    public org.telegram.ui.ActionBar.t0 f35449t0;
    public org.telegram.ui.Components.d40 f35450t1;
    public org.telegram.ui.Components.i40 f35451t2;
    public String f35452t3;
    public int f35453t4;
    public boolean f35454t5;
    public final a0.i f35455t6;
    public boolean f35456t7;
    public qk f35457t8;
    public float f35458t9;
    public long ta;
    public int f35459tb;
    public float f35460tc;
    public ClippingImageView f35461u0;
    public org.telegram.ui.ActionBar.b2 f35462u1;
    public org.telegram.ui.Components.i40 f35463u2;
    public String f35464u3;
    public final ArrayList f35465u4;
    public int f35466u5;
    public final ArrayList f35467u6;
    public int f35468u7;
    public org.telegram.ui.Cells.t1 f35469u8;
    public int f35470u9;
    public int f35471ua;
    public boolean f35472ub;
    public final le.b f35473uc;
    public final qh.i v;
    public org.telegram.ui.Components.w01 f35474v0;
    public di.f4 f35475v1;
    public org.telegram.ui.Components.pp f35476v2;
    public int f35477v3;
    public final HashMap f35478v4;
    public int f35479v5;
    public final SparseArray f35480v6;
    public int f35481v7;
    public l4 f35482v8;
    public int v9;
    public int f35483va;
    public int f35484vb;
    public final le.b f35485vc;
    public jj f35486w;
    public ih.h f35487w0;
    public di.f4 f35488w1;
    public View f35489w2;
    public int f35490w3;
    public MessageObject f35491w4;
    public TLRPC.PhotoSize f35492w5;
    public final a0.i f35493w6;
    public int f35494w7;
    public TextureView f35495w8;
    public float f35496w9;
    public vk f35497wa;
    public int f35498wb;
    public final le.b wc;
    public jj f35499x;
    public uj f35500x0;
    public di.f4 f35501x1;
    public kl f35502x2;
    public int f35503x3;
    public int f35504x4;
    public TLRPC.PhotoSize f35505x5;
    public final a0.i f35506x6;
    public int f35507x7;
    public boolean f35508x8;
    public float f35509x9;
    public xk f35510xa;
    public int f35511xb;
    public final le.b xc;
    public final pe.b f35512y;
    public wj f35513y0;
    public di.f4 f35514y1;
    public di.r6 f35515y2;
    public UndoView y3;
    public int f35516y4;
    public TLObject f35517y5;
    public final int[] f35518y6;
    public int f35519y7;
    public final qf f35520y8;
    public float f35521y9;
    public float f35522ya;
    public CharacterStyle f35523yb;
    public final le.b f35524yc;
    public xj f35525z0;
    public di.f4 f35526z1;
    public org.telegram.ui.Components.vf0 f35527z2;
    public jl f35528z3;
    public final ArrayList f35529z4;
    public int f35530z5;
    public final int[] f35531z6;
    public int f35532z7;
    public final gh.b f35533z8;
    public float f35534z9;
    public int f35535za;
    public String f35536zb;
    public final le.b f35537zc;

    public co(Bundle bundle) {
        super(bundle);
        this.f35211a = 0;
        this.f35238c = false;
        this.d = false;
        this.f35435s = new HashMap();
        this.v = new qh.i(new qf(this, 18));
        pe.b bVar = new pe.b(true);
        this.f35512y = bVar;
        pe.b bVar2 = new pe.b(true);
        this.E = bVar2;
        this.W = new ih.l();
        this.Z0 = new ArrayList();
        this.B2 = new org.telegram.ui.Components.x9[2];
        this.C2 = new bo[2];
        this.D2 = new org.telegram.ui.ActionBar.j5[2];
        this.E2 = new bi.c4[2];
        this.H2 = new AnimatorSet[2];
        this.I2 = false;
        this.f35214a3 = 500;
        this.P3 = null;
        this.S3 = -1;
        this.Z3 = true;
        this.f35389o4 = new SparseArray();
        this.f35401p4 = new ArrayList();
        this.f35465u4 = new ArrayList();
        this.f35478v4 = new HashMap();
        this.f35504x4 = -1;
        this.f35516y4 = 0;
        this.f35529z4 = new ArrayList(10);
        this.H4 = new ArrayList();
        this.J4 = new HashMap();
        this.K4 = new SparseArray();
        this.M4 = new int[1];
        this.U4 = new SparseIntArray();
        this.V4 = new SparseIntArray();
        this.Z4 = true;
        this.f35230b5 = true;
        this.f35414q5 = true;
        this.f35454t5 = true;
        this.M5 = new LongSparseIntArray();
        this.V5 = 1;
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f35306h6 = new ArrayList();
        this.f35318i6 = true;
        this.f35343k6 = Integer.MIN_VALUE;
        this.f35380n6 = new ArrayList();
        this.f35391o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f35402p6 = new SparseArray();
        this.q6 = new SparseArray();
        this.f35428r6 = new HashMap();
        this.f35442s6 = new SparseArray();
        this.f35455t6 = new a0.i();
        this.f35467u6 = new ArrayList();
        this.f35480v6 = new SparseArray();
        this.f35493w6 = new a0.i();
        this.f35506x6 = new a0.i();
        this.f35518y6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f35531z6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.A6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.B6 = new int[2];
        this.C6 = new boolean[2];
        this.D6 = new boolean[2];
        this.E6 = new boolean[]{true, true};
        this.G6 = true;
        this.H6 = true;
        this.K6 = 0;
        this.O6 = new ArrayList();
        this.P6 = new Paint(1);
        this.Q6 = new Paint(1);
        this.R6 = new ColorMatrix();
        this.S6 = new m.c3();
        this.T6 = new org.telegram.ui.ActionBar.f5(0, false, false, new qj(this));
        this.X6 = new Matrix();
        Paint paint = new Paint(1);
        this.f35232b7 = paint;
        this.f35246c7 = new Matrix();
        this.f35381n7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f35507x7 = Integer.MAX_VALUE;
        this.f35519y7 = -1;
        this.G7 = true;
        this.L7 = Integer.MAX_VALUE;
        this.S7 = -1;
        this.T7 = -10000;
        this.f35259d8 = new a0.i();
        this.f35520y8 = new qf(this, 23);
        gh.b bVar3 = new gh.b();
        this.f35533z8 = bVar3;
        bh.b bVar4 = new bh.b(bVar3);
        this.A8 = bVar4;
        this.G8 = new Paint(1);
        this.H8 = 0.0f;
        this.K8 = 1.0f;
        this.L8 = 0.0f;
        this.R8 = true;
        this.U8 = new ek(this);
        this.f35383n9 = true;
        this.W9 = new nk(this, 0);
        this.ga = new ChatMessagesMetadataController(this);
        this.f35370ma = new pg(this, 0);
        this.f35384na = new wk(this);
        this.f35406pa = -1;
        this.Fa = new ql(this);
        this.Ga = new tl(this);
        this.Ia = new bm(this);
        this.Ja = new ki(this);
        this.Ka = new bj(this);
        this.La = new pn(this);
        this.Ma = new qf(this, 26);
        this.Na = new qf(this, 27);
        this.f35262db = false;
        this.Fb = new RectF();
        this.Ib = new ug(this, 1);
        this.Pb = new BotForumHelper.BotDraftAnimationsPool();
        this.Qb = new Object();
        this.f35263dc = false;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f35473uc = new le.b(0, this, prVar, 320L, false);
        this.f35485vc = new le.b(1, this, prVar, 520L, false);
        this.wc = new le.b(2, this, prVar, 520L, false);
        this.xc = new le.b(3, this, prVar, 320L, false);
        this.f35524yc = new le.b(4, this, prVar, 320L, false);
        this.f35537zc = new le.b(5, this, prVar, 320L, false);
        this.Ac = new le.b(6, this, prVar, 320L, false);
        ug ugVar = new ug(this, 5);
        ?? obj = new Object();
        obj.f13577b = new float[32];
        obj.f13576a = 1;
        obj.d = new le.l(obj, ke.a.f14926a, 240L);
        obj.f13578c = ugVar;
        this.Bc = obj;
        this.Ec = new ArrayList();
        this.Fc = new ArrayList();
        this.Gc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.F = fVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            gh.d dVar = new gh.d(obj2);
            this.I = dVar;
            dVar.v = new ug(this, 8);
            dVar.d = fVar;
            dVar.f10684e = -3;
            dVar.f10685f = obj2;
            bh.b bVar5 = new bh.b(dVar);
            this.K = bVar5;
            bVar5.f2681f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj2);
                this.H = dVar2;
                dVar2.v = new ug(this, 8);
                dVar2.d = fVar;
                dVar2.f10684e = -2;
                dVar2.f10685f = obj2;
                bh.b bVar6 = new bh.b(dVar2);
                this.J = bVar6;
                bVar6.f2681f = LiteMode.isEnabled(262144);
            } else {
                this.H = null;
                this.J = bVar5;
            }
        } else {
            this.F = null;
            this.G = 0;
            this.H = null;
            this.I = null;
            this.J = new bh.b(obj2);
            this.K = new bh.b(obj2);
        }
        bh.b bVar7 = new bh.b(obj2);
        this.M = bVar7;
        bVar7.f2679c = bVar;
        this.J.f2679c = bVar;
        this.K.f2679c = bVar;
        bVar4.f2679c = new pe.b(true);
        bVar7.f2678b = bVar2;
        this.J.f2678b = bVar2;
        this.K.f2678b = bVar2;
        bVar4.f2678b = bVar2;
    }

    public static void A0(co coVar) {
        org.telegram.ui.Components.j40.h.a();
        coVar.showDialog(new yh.p1(coVar.getParentActivity(), coVar.currentAccount, coVar.a(), null, null));
    }

    public static org.telegram.ui.cv0 A1(org.telegram.ui.co r16, org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.A1(org.telegram.ui.co, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.cv0");
    }

    public static void B0(co coVar) {
        coVar.f35235ba = null;
        coVar.f35500x0.setOnInterceptTouchListener(null);
        coVar.jb(coVar.X0, true);
        ChatThemeController.getInstance(coVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void B1(co coVar) {
        SparseArray[] sparseArrayArr = coVar.W5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) coVar.f35391o6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            coVar.X5[i10].clear();
            coVar.Y5[i10].clear();
        }
        if (coVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(coVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null && (pathToAttach == null || !pathToAttach.exists())) {
                pathToAttach = new File(messageObject.messageOwner.attachPath);
            }
            if (pathToAttach != null && pathToAttach.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!messageObject.isVideo() && !messageObject.isRoundVideo()) {
                    intent.setType(messageObject.getMimeType());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(coVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                coVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        coVar.c9();
        coVar.yc(0, true);
        coVar.Wc(false);
        coVar.Lc();
    }

    public static CharSequence B8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.d31.k(messageObject)) {
            return messageObject.getVoiceTranscription();
        }
        CharSequence charSequence = messageObject.caption;
        if (charSequence != null) {
            return charSequence;
        }
        if (groupedMessages == null) {
            return null;
        }
        int size = groupedMessages.messages.size();
        CharSequence charSequence2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            MessageObject messageObject2 = groupedMessages.messages.get(i10);
            CharSequence charSequence3 = messageObject2.caption;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = messageObject2.getId();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void C0(co coVar) {
        if (coVar.X2.getAlpha() != 0.0f && !coVar.actionBar.s() && !coVar.A9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(coVar.X2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            coVar.G9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static TLRPC.TL_message C7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19917id = message.f19917id;
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

    public static void D0(org.telegram.ui.co r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.t1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.D0(org.telegram.ui.co, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1, int, int):void");
    }

    public static SpannableStringBuilder D8(MessageObject messageObject, boolean z10, long j3) {
        TLRPC.Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long fromChatId = messageObject.getFromChatId();
            if (j3 != fromChatId) {
                int i10 = (fromChatId > 0L ? 1 : (fromChatId == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user.first_name, user.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            spannableStringBuilder.append((CharSequence) restrictionReason);
            return spannableStringBuilder;
        }
        CharSequence charSequence = messageObject.caption;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(messageObject.messageText);
        return spannableStringBuilder;
    }

    public static void E0(co coVar) {
        coVar.G7(false);
        if (!coVar.fragmentBeginToShow) {
            uj ujVar = coVar.f35500x0;
            ujVar.Y1 = false;
            ujVar.Z1 = 0;
            ujVar.setEmptyView(coVar.Q0);
            uj ujVar2 = coVar.f35500x0;
            ujVar2.Y1 = true;
            ujVar2.Z1 = 1;
            return;
        }
        coVar.f35500x0.setEmptyView(coVar.Q0);
    }

    public static void F0(org.telegram.ui.co r19, org.telegram.ui.pk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.F0(org.telegram.ui.co, org.telegram.ui.pk, boolean[]):void");
    }

    public static void G0(co coVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(coVar.currentAccount).getInputUser(user.f20043id);
                    ConnectionsManager.getInstance(coVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new bi.m1(26, coVar, user));
                }
            }
        }
    }

    public static void G1(co coVar) {
        int i10;
        if (coVar.a() == coVar.getUserConfig().getClientUserId() && coVar.getUserConfig().isPremium() && coVar.f35236bb == null) {
            dl dlVar = new dl(coVar, coVar, coVar.getParentActivity(), coVar.currentAccount, coVar.f35274ea);
            coVar.f35236bb = dlVar;
            dlVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            coVar.f35236bb.setDelegate(new el(coVar));
            coVar.f35236bb.setTop(true);
            int i11 = 0;
            coVar.f35236bb.setClipChildren(false);
            coVar.f35236bb.setClipToPadding(false);
            coVar.f35236bb.setVisibility(0);
            dl dlVar2 = coVar.f35236bb;
            if (dlVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            dlVar2.setHint(LocaleController.getString(i10));
            coVar.X0.addView(coVar.f35236bb, w7.x5.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            coVar.f35236bb.p(null, null, true);
            coVar.f35236bb.setTranslationY(-AndroidUtilities.dp(12.0f));
            coVar.f35236bb.setScaleY(0.4f);
            coVar.f35236bb.setScaleX(0.4f);
            coVar.f35236bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
            coVar.Lc();
            dl dlVar3 = coVar.f35236bb;
            float f7 = coVar.f35496w9;
            yk ykVar = coVar.f35386o1;
            if (ykVar != null) {
                i11 = ykVar.getCurrentHeight();
            }
            dlVar3.setTranslationY(f7 + i11);
        }
    }

    public static java.util.ArrayList H7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.H7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void I0(co coVar, String str) {
        Uri parse = Uri.parse(str);
        m60.b(coVar.getParentActivity(), coVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void J0(co coVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        sg.o1 o1Var = new sg.o1(coVar, coVar.currentAccount, user, null, null, coVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            o1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(coVar.getParentActivity());
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(160.0f), 4, x9Var, false);
        x9Var.setImageDrawable(o5Var);
        x9Var.addOnAttachStateChangeListener(new f5(o5Var, 1));
        o5Var.j(j3, false);
        o1Var.E0 = true;
        o1Var.B0 = x9Var;
        coVar.showDialog(o1Var);
    }

    public static void J3(co coVar) {
        org.telegram.ui.ActionBar.y yVar;
        if (!coVar.f35262db && (yVar = coVar.f35312i0) != null) {
            yVar.a();
            org.telegram.ui.ActionBar.v0 v0Var = yVar.f21560m;
            v0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (coVar.R3 == 0) {
                v0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            v0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            v0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e51(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            v0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = coVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f28618a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o01(obj, 0), 0, spannableStringBuilder4.length(), 33);
                v0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f28618a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.o01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                v0Var.g(56, spannableStringBuilder5);
            }
            v0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (coVar.h == null) {
                v0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            v0Var.g(54, LocaleController.getString(R.string.Regular));
            coVar.f35262db = true;
        }
    }

    public static FrameLayout J7(Context context, org.telegram.ui.ActionBar.f6 f6Var, CharSequence charSequence, int i10) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        bi.c4 c4Var = new bi.c4(context, 12);
        int i11 = 3;
        c4Var.setMaxLines(3);
        c4Var.setGravity(3);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        c4Var.setTextSize(1, i10);
        c4Var.setMaxWidth(AndroidUtilities.dp(170.0f));
        c4Var.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(c4Var, w7.x5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void K0(co coVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            zh.v7.j1(coVar.getParentActivity(), coVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, coVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            coVar.presentFragment(new xo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void L0(co coVar) {
        if (AndroidUtilities.addToClipboard(coVar.Mb.sponsoredInfo)) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.resourceProvider));
        }
    }

    public static void M0(co coVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = coVar.I1.getAdapter().f11182w0;
        int i10 = coVar.currentAccount;
        TLRPC.User user2 = coVar.f35276f;
        if (user2 != null) {
            j3 = user2.f20043id;
        } else {
            j3 = coVar.f35264e.f19896id;
        }
        fi.f5 b10 = fi.f5.b(i10, j3, user.f20043id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, coVar.N8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(coVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(coVar.currentAccount);
            MessagesController.showCantOpenAlert(coVar, restrictionReason);
            return;
        }
        fi.k3 k3Var = new fi.k3(coVar.getParentActivity(), coVar.getResourceProvider());
        k3Var.w(false);
        k3Var.A0 = true;
        k3Var.f9801k0 = coVar.getParentActivity();
        k3Var.s(coVar, b10);
        k3Var.show();
    }

    public static void N0(co coVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (coVar.f35359lb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            coVar.G5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                coVar.G5 = null;
                MessagePreviewParams messagePreviewParams = coVar.f35282f5;
                if (messagePreviewParams != null) {
                    int i11 = coVar.currentAccount;
                    CharSequence fieldText = coVar.Y.getFieldText();
                    MessageObject messageObject3 = coVar.f35379n5;
                    if (messageObject3 == coVar.X3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, coVar.f35353l5, coVar.p5);
                }
                coVar.j8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                coVar.I5 = str;
            }
            if (coVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = coVar.f35282f5;
            if (messagePreviewParams2 != null) {
                int i12 = coVar.currentAccount;
                CharSequence fieldText2 = coVar.Y.getFieldText();
                MessageObject messageObject4 = coVar.f35379n5;
                if (messageObject4 == coVar.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, coVar.f35353l5, coVar.p5);
            }
            coVar.Eb(true, coVar.G5, false);
            return;
        }
        coVar.G5 = null;
        coVar.j8();
    }

    public static void O0(co coVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != coVar.d()) {
            coVar.f35222ab = SystemClock.uptimeMillis();
            coVar.f35403p7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                coVar.Sa(coVar.d());
            } else if (coVar.d() == 0) {
                coVar.Sa(l4.longValue());
            } else {
                coVar.f35381n7 = -1;
            }
            coVar.getConnectionsManager().cancelRequestsForGuid(coVar.classGuid);
            coVar.getMessagesStorage().cancelTasksForGuid(coVar.classGuid);
            coVar.classGuid = ConnectionsManager.generateClassGuid();
            coVar.Pa();
            coVar.f35282f5 = null;
            coVar.f35468u7 = 0;
            coVar.f35344k7 = false;
            coVar.f35355l7 = true;
            coVar.f35306h6.clear();
            coVar.f35255d4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = coVar.getMessagesController().getTopicsController().findTopic(-coVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                coVar.f35341k4 = i12;
                coVar.l4 = findTopic.read_outbox_max_id;
                coVar.f35364m4 = Math.max(1, i12);
                coVar.getMessagesController().getTopicsController().getTopicRepliesCount(coVar.T5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                coVar.f35243c4 = null;
                coVar.f35215a4 = null;
                coVar.X3 = null;
                coVar.f35379n5 = null;
                coVar.f35341k4 = 0;
                coVar.l4 = 0;
                coVar.f35364m4 = 0;
                coVar.f35255d4 = 0L;
                coVar.f35269e4 = 0;
                coVar.f35281f4 = null;
                coVar.f35304h4 = false;
                coVar.f35293g4 = false;
            }
            coVar.r8();
            coVar.Nc(true);
            coVar.f35213a1.n(true);
            coVar.f35213a1.b();
            coVar.R1.setCurrentTopic(l4.longValue());
            coVar.Qc(true);
            coVar.hc(true);
            coVar.getMessagesController().setForumLastTopicId(-coVar.a(), coVar.d());
            coVar.g9(true);
            coVar.e9(true);
            mk mkVar = coVar.Y;
            if (mkVar != null) {
                mkVar.m0(false);
                coVar.Y.G1(true);
            }
            coVar.A6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            coVar.l1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            coVar.f35361m1 = i11;
            coVar.Bc(false);
            coVar.Ac(false);
            coVar.Rc();
            un unVar = coVar.f35396oc;
            if (unVar != null && coVar.actionBar.f21130n0) {
                unVar.p(null);
            }
        }
    }

    public static a3.h0 O4(co coVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = coVar.getMessagesController().createDeleteShowOnceTask(coVar.T5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                coVar.tc(arrayList, true);
            }
            return new a3.h0(coVar, createDeleteShowOnceTask, messageObject, 14);
        }
        return null;
    }

    public static void P0(co coVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = coVar.getParentActivity();
        int i12 = coVar.currentAccount;
        long j3 = coVar.T5;
        ao aoVar = coVar.f35274ea;
        int i13 = org.telegram.ui.Components.io.L;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.f6) aoVar, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, aoVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, aoVar)));
        linearLayout.addView((View) imageView, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.f20797j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, aoVar));
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i12).getUser(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (premiumFeaturesBlocked) {
            i11 = R.string.PremiumMessageTextLocked;
        } else {
            i11 = R.string.PremiumMessageText;
        }
        org.telegram.messenger.wl.p(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            sg.r0 r0Var = new sg.r0(parentActivity, aoVar, true);
            r0Var.setOnClickListener(new org.telegram.ui.Components.e3(f3Var, 1));
            r0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(r0Var, w7.x5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }

    public static void Q0(co coVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f19937id = coVar.getMessagesController().getInputUser(coVar.f35276f);
            coVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new pe(coVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(coVar.getUserConfig().getCurrentUser(), coVar.T5, messageObject, coVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = coVar.C8();
        SendMessagesHelper.getInstance(coVar.currentAccount).sendMessage(of2);
        if (coVar.R3 == 0) {
            coVar.O9(false);
        }
        coVar.e9(false);
    }

    public static co Q9(int i10, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i10);
        return new co(bundle);
    }

    public static boolean R0(co coVar) {
        MessageObject messageObject = coVar.Mb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static co R9(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new co(bundle);
    }

    public static void S0(co coVar, int i10) {
        int i11;
        RectF rectF;
        gh.d dVar = coVar.H;
        gh.d dVar2 = coVar.I;
        ArrayList arrayList = coVar.Fc;
        bh.f fVar = coVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            if (w7.b0.a(i10, 4)) {
                coVar.p9();
            }
            if (w7.b0.a(i10, 2)) {
                ArrayList arrayList2 = coVar.Ec;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, coVar.X0.getMeasuredWidth(), coVar.f35500x0.getY() + coVar.f35500x0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.c(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.c(i11, AndroidUtilities.dp(8.0f), arrayList2);
                    }
                } else {
                    i11 = 0;
                }
                int a2 = yf.f0.a(i11, arrayList2, arrayList);
                int measuredWidth = coVar.X0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.p.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(coVar.f35500x0.getY(), rectF2.top);
                    rectF2.right = w7.p.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(coVar.f35500x0.getY() + coVar.f35500x0.getMeasuredHeight(), rectF2.bottom);
                }
                fVar.g(a2, arrayList);
            }
            um umVar = coVar.X0;
            Objects.requireNonNull(umVar);
            if (fVar.e(new eg(umVar, 0), coVar.X0.getWidth(), coVar.X0.getHeight())) {
                if (dVar != null) {
                    dVar.d();
                }
                if (dVar2 != null) {
                    dVar2.d();
                }
                org.telegram.ui.ActionBar.k kVar = coVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                coVar.n9();
            }
        }
    }

    public static void T0(co coVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(coVar.currentAccount).getInputUser(user.f20043id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(coVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new th(coVar, tL_attachMenuBot, user, 1), 66);
    }

    public static MessageObject T1(co coVar) {
        org.telegram.ui.Cells.t1 t1Var = coVar.f35260d9;
        if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
            return t1Var.getMessageObject();
        }
        return null;
    }

    public static void U(org.telegram.ui.co r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.U(org.telegram.ui.co, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void U0(co coVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, vf vfVar) {
        String str4;
        org.telegram.ui.Components.n31 n31Var;
        if (coVar.f35256d5 != null && i10 < arrayList.size() && coVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = coVar.getParentActivity();
            int i11 = iArr[0];
            qf qfVar = new qf(coVar, 20);
            String[] strArr = org.telegram.ui.Components.u31.R;
            if (parentActivity == null) {
                n31Var = null;
            } else {
                org.telegram.ui.Components.n31 n31Var2 = new org.telegram.ui.Components.n31(parentActivity, str, str4, inputPeer, i11, richMessage, qfVar);
                n31Var2.H(z10);
                n31Var2.M = coVar;
                n31Var2.N = vfVar;
                if (coVar.getParentActivity() != null) {
                    coVar.showDialog(n31Var2);
                }
                n31Var = n31Var2;
            }
            n31Var.setDimBehind(false);
            coVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(coVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + coVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + coVar.a(), i12 - 1).apply();
                coVar.Qc(true);
            }
        }
    }

    public static void U4(co coVar, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int themedColor;
        int i11;
        le.b bVar = coVar.wc;
        if (coVar.Y != null && !bVar.f15396f && t1Var.getMessageObject() != null) {
            um umVar = coVar.X0;
            RectF rectF = AndroidUtilities.rectTmp;
            ih.k.c(t1Var, umVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            th.a aVar = t1Var.f22888a6;
            if (aVar != null && t1Var.f23072n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((coVar.X0.getMeasuredHeight() - coVar.f35500x0.getPaddingBottom()) + coVar.f35448sc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = t1Var.getMessageObject();
                if (coVar.Cc == null) {
                    coVar.Cc = new rh.c(coVar.getParentActivity(), coVar.resourceProvider, coVar);
                    int indexOfChild = coVar.X0.indexOfChild(coVar.f35500x0);
                    if (indexOfChild >= 0) {
                        coVar.X0.addView(coVar.Cc, indexOfChild + 1, w7.x5.g());
                    } else {
                        coVar.X0.addView(coVar.Cc, w7.x5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (t1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.j6.nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20967sb;
                    }
                    themedColor = coVar.getThemedColor(i11);
                } else {
                    if (t1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.j6.f20895od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20878nd;
                    }
                    themedColor = coVar.getThemedColor(i10);
                }
                coVar.Cc.setColor(themedColor);
                coVar.Cc.setCellToWatch(t1Var);
                coVar.Cc.f45632b.f45628a.a(false, false);
                coVar.Cc.setAnimatedVisibility(bVar.f15395e);
                coVar.Cc.f45632b.setOnClickListener(new ji.m4(new ug(coVar, 2), 9));
                rh.c cVar = coVar.Cc;
                cVar.f45638s = new ug(coVar, 3);
                org.telegram.ui.Cells.b6 b6Var = cVar.f45631a;
                b6Var.setOnKeyListener(new vg(coVar, 0));
                b6Var.setOnEditorActionListener(new ia(coVar, 1));
                coVar.Y.T4 = b6Var;
                AndroidUtilities.runOnUIThread(new ah.p(coVar, measuredHeight, b6Var, 29), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(co coVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new ef(coVar, i10, 6));
        } else {
            coVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void V0(co coVar, TLRPC.ReactionCount reactionCount) {
        coVar.A7(true);
        org.telegram.ui.Components.hn0.c(coVar.getParentActivity(), coVar.currentAccount, reactionCount.reaction, coVar.f35274ea);
    }

    public static void V1(co coVar, float f7) {
        org.telegram.ui.Cells.t1 t1Var = coVar.f35260d9;
        if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
            t1Var.setSlidingOffset(f7);
        }
    }

    public static void W(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(coVar.currentAccount).loadAttachMenuBots(false, true);
            coVar.W9(user.f20043id, coVar.f35345k8, false);
        }
    }

    public static void W0(co coVar, String str) {
        if (MessagesController.getInstance(coVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            of.f.m(coVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.e5.o0(coVar.getParentActivity(), coVar.f35274ea, str, true, new og(coVar, str, 1));
        }
    }

    public static void X(co coVar) {
        if (!coVar.e7(coVar.Y.getSendButton())) {
            if (coVar.getMediaController().isPlayingMessage(coVar.f35256d5)) {
                coVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = coVar.getMessagesController().getInputPeer(coVar.T5);
            if (coVar.f35270e5 != null) {
                for (int i10 = 0; i10 < coVar.f35270e5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20012id.add(Integer.valueOf(coVar.f35270e5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20012id.add(Integer.valueOf(coVar.f35256d5.getId()));
            }
            ConnectionsManager.getInstance(coVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new bi.m1(27, coVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void X0(co coVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        coVar.Mb(tL_game, messageObject, str, false, j3);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void X1(co coVar) {
        long j3;
        aq aqVar = coVar.P9;
        if (aqVar != null) {
            if (coVar.f35304h4) {
                if (aqVar.H != null) {
                    if (coVar.getParentLayout() != null) {
                        org.telegram.ui.Components.p9.a(coVar, coVar.getParentLayout().getFragmentStack().indexOf(coVar), coVar.f35264e, coVar.f35276f, coVar.f35243c4, coVar.T5, coVar.f35483va, coVar.f35471ua);
                    }
                    TLRPC.Chat chat = coVar.f35264e;
                    TLRPC.TL_forumTopic tL_forumTopic = coVar.P9.H;
                    long j10 = coVar.T5;
                    int i10 = coVar.f35471ua;
                    int i11 = coVar.f35483va;
                    if (coVar.getParentLayout() != null) {
                        org.telegram.ui.Components.p9.a(coVar, coVar.getParentLayout().getFragmentStack().indexOf(coVar), chat, null, tL_forumTopic, j10, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", coVar.P9.f34531a);
                    bundle.putInt("dialog_filter_id", coVar.P9.f34533b);
                    bundle.putBoolean("pulled", true);
                    co g10 = og.d.g(coVar, -coVar.T5, coVar.P9.H, 0, bundle);
                    g10.R9 = true;
                    Oc = true;
                    coVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = aqVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f19896id;
            }
            if (j3 != 0) {
                coVar.v6();
                aq aqVar2 = coVar.P9;
                TLRPC.Chat chat3 = aqVar2.G;
                long j12 = aqVar2.Z;
                int i12 = aqVar2.f34531a;
                int i13 = aqVar2.f34533b;
                if (coVar.getParentLayout() != null) {
                    org.telegram.ui.Components.p9.a(coVar, coVar.getParentLayout().getFragmentStack().indexOf(coVar), chat3, null, null, j12, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = coVar.P9.G;
                if (chat4 != null) {
                    j11 = chat4.f19896id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", coVar.P9.f34531a);
                bundle2.putInt("dialog_filter_id", coVar.P9.f34533b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(coVar.currentAccount).edit().remove("diditem" + coVar.P9.Z).apply();
                co coVar2 = new co(bundle2);
                ArrayList arrayList = coVar.f35287fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = coVar.f35287fb;
                    coVar2.f35287fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                coVar2.R9 = true;
                Oc = true;
                coVar.presentFragment(coVar2, true);
            }
        }
    }

    public static void Y(co coVar, long j3, long j10, Long l4, Boolean bool) {
        boolean z10;
        zh.s5 y3 = zh.s5.y(coVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y3.i0(j3, j10, z10, true);
    }

    public static void Y0(co coVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            coVar.f35336jc = true;
            coVar.f35500x0.e1();
            Bundle bundle = new Bundle();
            final long dialogId = ((MessageObject) arrayList.get(0)).getDialogId();
            bundle.putLong("chat_id", -dialogId);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("historyPreloaded", z10);
            co coVar2 = new co(bundle);
            coVar2.pb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                coVar2.L7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = coVar2.X3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                coVar2.X3.messageOwner.reactions = tL_messageReactions;
            }
            bi.k8 k8Var = new bi.k8(coVar, new boolean[]{false}, i11, coVar2, 13);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f19917id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = coVar2.getClassGuid();
                NotificationCenter.getInstance(coVar.currentAccount).addObserver(new yi(coVar, classGuid, k8Var, coVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        co coVar3 = co.this;
                        MessagesController messagesController = coVar3.getMessagesController();
                        TLRPC.messages_Messages messages_messages2 = messages_messages;
                        int size2 = messages_messages2.messages.size();
                        int i19 = i10;
                        if (i19 > 0) {
                            i17 = i19;
                        } else {
                            i17 = i16;
                        }
                        if (i19 > 0) {
                            i18 = 3;
                        } else {
                            i18 = 2;
                        }
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i18, true, 0, ((MessageObject) i2.g.h(1, arrayList)).getId(), 1, false, 0, true, coVar3.f35304h4, null);
                    }
                });
                return;
            }
            k8Var.run();
            return;
        }
        coVar.f35324ic = 0;
        coVar.f35336jc = false;
        coVar.f35500x0.e1();
        if (messageObject2 != null) {
            coVar.ga(messageObject2);
        } else if (coVar.getParentActivity() != null) {
            org.telegram.ui.Components.yc.a0(coVar).t(LocaleController.getString(R.string.ChannelPostDeleted), coVar.f35274ea).j();
        }
    }

    public static void Z(co coVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (coVar.getParentActivity() != null) {
            TLRPC.Chat chat = coVar.f35264e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !coVar.f35264e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (coVar.h == null && (userFull = coVar.f35219a8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35274ea);
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new ve(coVar, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                coVar.showDialog(alertDialog$Builder.f20225a);
            } else if (!coVar.H4.isEmpty()) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
                edit.putInt("pin_" + coVar.T5, ((Integer) coVar.H4.get(0)).intValue()).commit();
                coVar.yc(0, true);
            }
        }
    }

    public static void Z0(co coVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = coVar.getMessagesController().getInputPeer(coVar.T5);
                tL_messages_getHistory.offset_date = coVar.f35494w7 + 86400;
                tL_messages_getHistory.limit = 1;
                coVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new bi.m1(25, coVar, tLObject));
                return;
            }
            coVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a0(co coVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(coVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, coVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(coVar.currentAccount).editMessage(messageObject, null, false, coVar, null, i10, i11);
        }
    }

    public static void a1(long j3, co coVar) {
        if (zh.s5.y(coVar.currentAccount, false).p().amount < j3) {
            new zh.k7(coVar.getParentActivity(), coVar.getResourceProvider(), j3, 13, DialogObject.getShortName(coVar.a()), new qf(coVar, 15), coVar.a()).show();
        } else {
            new zh.l7(coVar.getParentActivity(), coVar.resourceProvider).show();
        }
    }

    public static void b0(co coVar, long j3, boolean z10) {
        if (!coVar.H4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
            edit.putInt("pin_" + coVar.T5, ((Integer) coVar.H4.get(0)).intValue()).commit();
            coVar.H4.clear();
            coVar.J4.clear();
            coVar.L4 = 0;
            coVar.P4 = 0;
            coVar.Q4 = 0;
            coVar.yc(0, true);
        }
        if (ChatObject.isMonoForum(coVar.f35264e) && ChatObject.canManageMonoForum(coVar.currentAccount, coVar.f35264e)) {
            if (j3 != 0) {
                coVar.getMessagesStorage().removeTopic(-coVar.f35264e.f19896id, j3);
                coVar.getMessagesController().deleteSavedDialog(j3, coVar.getMessagesController().getInputPeer(-coVar.f35264e.f19896id));
                coVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(coVar.f35264e.f19896id, j3);
            }
        } else {
            coVar.getMessagesController().deleteDialog(coVar.T5, 1, z10);
            coVar.getMessagesStorage().removeAllTopics(coVar.T5);
            coVar.getMessagesController().getTopicsController().reloadTopics(-coVar.T5);
        }
        coVar.M5.put(j3, 0);
        org.telegram.ui.Components.w21 w21Var = coVar.R1;
        if (w21Var != null) {
            w21Var.setAllTopicsHidden(false);
        }
        if (j3 == coVar.f35255d4) {
            coVar.y7(false, null);
            coVar.A0.O(false);
        }
    }

    public static void b1(co coVar) {
        if (AndroidUtilities.addToClipboard(coVar.Mb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.resourceProvider));
        }
    }

    public static void b2(co coVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            messageObject = t1Var.getMessageObject();
            t1Var.f22968g1 = f7;
            t1Var.f22981h1 = f10;
            org.telegram.ui.Components.qa0 qa0Var = t1Var.Kc;
            float f11 = t1Var.f22981h1;
            qa0Var.h = t1Var.getTranslationX() + f7;
            qa0Var.f29678i = f11;
            qa0Var.f29681l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int E8 = coVar.E8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && E8 >= 2 && E8 != 20 && E8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        coVar.x6(messageObject, z10, true);
                        coVar.dc();
                        coVar.Wc(false);
                    }
                }
            }
        }
    }

    public static void b4(co coVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(coVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new b7(coVar, h0Var, text, 3), new z0(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void c0(co coVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        String str4;
        if (coVar.f35256d5 != null && i10 < arrayList.size() && coVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = coVar.f35256d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.u31.J(coVar.getParentActivity(), coVar, inputPeer, iArr[0], coVar.f35256d5.summarized, str, str4, charSequence, z10, vfVar, new qf(coVar, 28)).setDimBehind(false);
            coVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(coVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + coVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + coVar.a(), i11 - 1).apply();
                coVar.Qc(true);
            }
        }
    }

    public static void c1(co coVar, long j3, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(coVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.a01.c(coVar.getParentActivity(), coVar.currentAccount, -j3, coVar.getUserConfig().getCurrentUser(), null, z10, z11, coVar.getResourceProvider());
    }

    public static void c2(co coVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = coVar.f35467u6;
        SparseArray[] sparseArrayArr = coVar.W5;
        if (!coVar.Oa && (i11 = i10 - coVar.A0.J) >= 0 && i11 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            if (sparseArrayArr[0].get(messageObject.getId(), null) == null && sparseArrayArr[1].get(messageObject.getId(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i12), (MessageObject) sparseArrayArr[0].valueAt(i12));
            }
            for (int i13 = 0; i13 < sparseArrayArr[1].size(); i13++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i13), (MessageObject) sparseArrayArr[1].valueAt(i13));
            }
            org.telegram.ui.Components.ll0 ll0Var = coVar.f35500x0;
            qi qiVar = new qi(coVar, z10, sparseArray);
            if (!ll0Var.f28228d2) {
                ll0Var.f28245m2 = new int[2];
                new HashSet();
                ll0Var.k1(ll0Var, true);
                ll0Var.f28236h2 = qiVar;
                ll0Var.f28228d2 = true;
                ll0Var.f28234g2 = i10;
                ll0Var.f28232f2 = i10;
            }
        }
    }

    public static void d0(co coVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(coVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20012id;
        long clientUserId = coVar.getUserConfig().getClientUserId();
        long j10 = coVar.T5;
        if (clientUserId == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void d1(co coVar, TLRPC.User user, String str, Boolean bool) {
        Intent intent;
        String country;
        if (coVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (user != null) {
            intent.putExtra("name", ContactsController.formatName(user.first_name, user.last_name));
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        if (!str.startsWith("+")) {
            TLRPC.User currentUser = coVar.getUserConfig().getCurrentUser();
            HashMap hashMap = new HashMap();
            boolean z10 = false;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f41720a = split[2];
                    String str2 = split[0];
                    obj.f41722c = str2;
                    obj.d = split[1];
                    List list = (List) hashMap.get(str2);
                    if (list == null) {
                        String str3 = split[0];
                        list = new ArrayList();
                        hashMap.put(str3, list);
                    }
                    list.add(obj);
                }
                bufferedReader.close();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            String str4 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 < 1) {
                    break;
                }
                List list2 = (List) hashMap.get(str4.substring(0, i10));
                if (list2 != null && list2.size() > 0) {
                    String str5 = ((vt) list2.get(0)).f41722c;
                    if (str5.endsWith("0") && str.startsWith("0")) {
                        str = str.substring(1);
                    }
                    str = a4.a.p("+", str5, str);
                    z10 = true;
                } else {
                    i10--;
                }
            }
            if (!z10 && Build.VERSION.SDK_INT >= 23) {
                Context context = ApplicationLoader.applicationContext;
                if (context != null) {
                    country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                } else {
                    country = Locale.getDefault().getCountry();
                }
                if (country.endsWith("0") && str.startsWith("0")) {
                    str = str.substring(1);
                }
                str = a4.a.p("+", country, str);
            }
        }
        contentValues.put("data1", str);
        contentValues.put("data2", (Integer) 2);
        arrayList.add(contentValues);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra("data", arrayList);
        coVar.getParentActivity().startActivity(intent);
    }

    public static boolean d2(co coVar, View view, RectF rectF) {
        RectF rectF2 = coVar.Fb;
        if (rectF != null && coVar.f35500x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void d4(co coVar) {
        if (coVar.I3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = coVar.R3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f19917id = 0;
        MessageObject messageObject = new MessageObject(coVar.currentAccount, tL_message, false, false);
        coVar.I3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void e0(co coVar, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var = coVar.parentLayout;
        if (d5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 backgroundFragment = d5Var.getBackgroundFragment();
        if (backgroundFragment instanceof co) {
            co coVar2 = (co) backgroundFragment;
            if (coVar2.a() == coVar.T5) {
                coVar.finishFragment();
                coVar2.F(i10, 0, 0, 0, true, true);
                return;
            }
        }
        coVar.presentFragment(Q9(i10, coVar.T5));
    }

    public static void e1(co coVar, int i10) {
        if (coVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 q82 = coVar.q8(i10, false);
            if (q82 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q82;
                ah.k1 k1Var = t1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = t1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (k1Var.K || randomUnreadReaction.big)) {
                    ah.e1.d(coVar, null, q82, null, 0.0f, 0.0f, ah.j1.d(randomUnreadReaction.reaction), coVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    ah.e1.f();
                }
                k1Var.K = false;
                MessageObject messageObject = t1Var.f23232y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (q82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) q82;
                ah.k1 k1Var2 = w0Var.C0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (k1Var2.K || randomUnreadReaction2.big)) {
                    ah.e1.d(coVar, null, q82, null, 0.0f, 0.0f, ah.j1.d(randomUnreadReaction2.reaction), coVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    ah.e1.f();
                }
                k1Var2.K = false;
                MessageObject messageObject2 = w0Var.H0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void e4(co coVar) {
        if (coVar.J3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f19917id = 0;
        MessageObject messageObject = new MessageObject(coVar.currentAccount, tL_message, false, false);
        coVar.J3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void f0(co coVar, zf.a aVar, Runnable runnable) {
        if (!coVar.isFinished) {
            if (zf.a.m(zh.s5.x(coVar.currentAccount, aVar.f51653a).p()).f51654b < aVar.f51654b) {
                zf.b bVar = aVar.f51653a;
                if (bVar == zf.b.f51655a) {
                    new zh.k7(coVar.getParentActivity(), coVar.getResourceProvider(), aVar.a(), 13, og.d.h(coVar.currentAccount, coVar.a()), null, coVar.a()).show();
                    return;
                } else if (bVar == zf.b.f51656b) {
                    new ei.h(coVar.getParentActivity(), coVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void f1(co coVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        coVar.f35294g5 = null;
        int i10 = coVar.f35395ob;
        if (i10 == 2) {
            coVar.f35353l5 = null;
            coVar.f35379n5 = null;
            MessagePreviewParams messagePreviewParams = coVar.f35282f5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, coVar.T5, null);
            }
            coVar.j8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = coVar.f35282f5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = coVar.f35282f5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = coVar.f35282f5.forwardMessages.messages.get(i11);
                    if (j3 == 0) {
                        j10 = messageObject3.getDialogId();
                        j3 = messageObject3.getFromChatId();
                    } else if (j3 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35274ea);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                b2Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User user = coVar.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", coVar.f35282f5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = coVar.getMessagesController().getChat(Long.valueOf(-j10));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", coVar.f35282f5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                b2Var.T = AndroidUtilities.replaceTags(formatString);
                b2Var.R = LocaleController.formatPluralString("messages", coVar.f35282f5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new ve(coVar, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new ve(coVar, 5));
                coVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20925q7));
                }
            }
        } else if (i10 == 4) {
            coVar.G5 = null;
            MessagePreviewParams messagePreviewParams3 = coVar.f35282f5;
            if (messagePreviewParams3 != null) {
                int i12 = coVar.currentAccount;
                MessageObject messageObject4 = coVar.f35379n5;
                if (messageObject4 == coVar.X3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, coVar.f35353l5, coVar.p5);
            }
            mk mkVar = coVar.Y;
            mkVar.W2 = null;
            mkVar.X2 = false;
            coVar.i8();
            coVar.j8();
        } else {
            if (ChatObject.isForum(coVar.f35264e) && !coVar.f35304h4 && (messageObject = coVar.f35379n5) != null) {
                long topicId = MessageObject.getTopicId(coVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    coVar.getMediaDataController().cleanDraft(coVar.T5, topicId, false);
                }
            }
            coVar.zb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void g0(co coVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + coVar.T5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(coVar.f35264e) && !coVar.f35264e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.g80.f26347r;
            org.telegram.ui.Components.g80.w(context, coVar, org.telegram.ui.Components.yc.a0(coVar), z10);
        }
        coVar.vb(false, true);
    }

    public static void g1(co coVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        co coVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        ih.a aVar = coVar.Qb;
        if (num.intValue() != coVar.d()) {
            coVar.nc = false;
            hf hfVar = coVar.Nb;
            if (hfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(hfVar);
                coVar.Nb.run();
                coVar.Nb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.w21 w21Var = coVar.R1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(w21Var.f32120b).getTopicsController().getTopics(-w21Var.f32122c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f19948id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = coVar.getMessagesController().getTopicsController().findTopic(-coVar.a(), tL_forumTopic.f19948id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                coVar.f35222ab = SystemClock.uptimeMillis();
                coVar.f35403p7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    coVar.Sa(coVar.d());
                } else if (coVar.d() == 0) {
                    coVar.Sa(num.intValue());
                } else {
                    coVar.f35381n7 = -1;
                }
                coVar.getConnectionsManager().cancelRequestsForGuid(coVar.classGuid);
                coVar.getMessagesStorage().cancelTasksForGuid(coVar.classGuid);
                coVar.classGuid = ConnectionsManager.generateClassGuid();
                coVar.Pa();
                coVar.f35282f5 = null;
                coVar.f35468u7 = 0;
                coVar.f35344k7 = false;
                coVar.f35355l7 = true;
                coVar.f35306h6.clear();
                coVar.f35238c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(coVar.getCurrentAccount(), message, false, false));
                    coVar2 = coVar;
                    coVar2.pb(arrayList, coVar.f35264e, tL_forumTopic2.f19948id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    coVar2 = coVar;
                    coVar2.f35243c4 = null;
                    coVar2.f35215a4 = null;
                    coVar2.X3 = null;
                    coVar2.f35379n5 = null;
                    coVar2.f35341k4 = 0;
                    coVar2.l4 = 0;
                    coVar2.f35364m4 = 0;
                    coVar2.f35255d4 = 0L;
                    coVar2.f35269e4 = 0;
                    coVar2.f35281f4 = null;
                    coVar2.f35304h4 = false;
                    coVar2.f35293g4 = false;
                }
                om omVar = coVar2.A0;
                if (omVar != null) {
                    if (omVar.I >= 0 && !omVar.N()) {
                        om omVar2 = coVar2.A0;
                        omVar2.u(omVar2.I);
                    } else {
                        om omVar3 = coVar2.A0;
                        if (omVar3.I < 0 && omVar3.N()) {
                            coVar2.A0.o(0);
                        }
                    }
                    coVar2.A0.T();
                }
                coVar2.r8();
                coVar2.Nc(true);
                coVar2.f35213a1.n(true);
                if (tL_forumTopic2 != null) {
                    coVar2.Tc();
                } else {
                    coVar2.f35213a1.b();
                }
                coVar2.R1.setCurrentTopic(coVar2.d());
                coVar2.Qc(true);
                coVar2.hc(true);
                coVar2.getMessagesController().setForumLastTopicId(-coVar2.a(), coVar2.d());
                coVar2.Ea();
                coVar2.f9(true);
                coVar2.e9(true);
                coVar2.A6(true, true);
                if (coVar2.Y != null) {
                    if (!UserObject.isBotForum(coVar2.f35276f)) {
                        coVar2.Y.m0(false);
                    }
                    coVar2.Y.G1(true);
                }
                if (tL_forumTopic2 != null) {
                    coVar2.getMessagesController().getTopicsController().getTopicRepliesCount(coVar2.T5, tL_forumTopic2.f19948id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                coVar2.l1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                coVar2.f35361m1 = i11;
                coVar2.Bc(false);
                coVar2.Ac(false);
                coVar2.Rc();
                un unVar = coVar2.f35396oc;
                if (unVar != null && coVar2.actionBar.f21130n0) {
                    unVar.p(null);
                }
                if (UserObject.isBotForum(coVar2.f35276f)) {
                    coVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(coVar2.T5, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(co coVar, MessageObject messageObject, Long l4, Runnable runnable) {
        zh.s5.y(coVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void h1(co coVar, String str) {
        if (MessagesController.getInstance(coVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            coVar.getParentActivity();
            of.f.n(str);
            return;
        }
        org.telegram.ui.Components.e5.o0(coVar.getParentActivity(), coVar.f35274ea, str, false, new og(coVar, str, 0));
    }

    public static void i0(co coVar) {
        org.telegram.ui.Cells.t1 t1Var;
        yl ylVar;
        int i10;
        if (!coVar.Rb && coVar.F3 && coVar.f35500x0.G && coVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = coVar.f35500x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = coVar.f35500x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().messageOwner != null && t1Var.getMessageObject().messageOwner.video_processing_pending) {
                            if (t1Var.getCurrentPosition() != null) {
                                if (t1Var.getMessageObject() != null && (t1Var.getCurrentPosition().flags & 8) != 0) {
                                    int i11 = t1Var.getCurrentPosition().flags;
                                    if (t1Var.getMessageObject().isOutOwner()) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    if ((i11 & i10) == 0) {
                                        continue;
                                    }
                                }
                            }
                            t1Var.getLocationInWindow(iArr);
                            float timeY = t1Var.getTimeY() + iArr[1];
                            if (timeY >= AndroidUtilities.dp(240.0f) && timeY <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    t1Var = null;
                    break;
                }
            }
            if (t1Var != null) {
                coVar.Rb = true;
                yl ylVar2 = new yl(coVar, coVar.getParentActivity());
                ylVar2.p(true);
                ylVar2.K = Layout.Alignment.ALIGN_CENTER;
                ylVar2.d = 3500L;
                ylVar2.T = true;
                ylVar2.f7229e = true;
                ylVar2.h = AndroidUtilities.dp(150.0f);
                ylVar2.q(8.0f);
                coVar.B1 = ylVar2;
                ylVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                coVar.X0.addView(coVar.B1, w7.x5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                t1Var.getLocationInWindow(iArr);
                coVar.C1 = t1Var.getTimeY() + iArr[1];
                coVar.B1.setTranslationY(((-ylVar.getTop()) - AndroidUtilities.dp(120.0f)) + coVar.C1);
                coVar.B1.m(0.0f, (t1Var.f23102pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + t1Var.f23132rb);
                coVar.B1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new me(coVar, 2));
            AndroidUtilities.runOnUIThread(new me(coVar, 2), 2000L);
        }
    }

    public static void i1(co coVar, Object[] objArr, org.telegram.ui.Components.ux0 ux0Var, boolean z10, TLRPC.StickerSet stickerSet) {
        int i10;
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
                org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(ux0Var.container, coVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.qc r10 = ycVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f29706j = 2750;
                r10.k(true);
            }
        }
    }

    public static void i2(co coVar) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (coVar.f35526z1 != null) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = null;
        for (int childCount = coVar.f35500x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = coVar.f35500x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (primaryMessageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                t1Var2 = t1Var;
            }
        }
        coVar.ub(t1Var2);
    }

    public static void j0(co coVar) {
        if (coVar.M1) {
            coVar.getMessagesController().addDialogToFolder(coVar.T5, 0, 0, 0L);
            coVar.Q7();
            coVar.y3.j(23, coVar.T5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + coVar.T5, false);
            edit.putBoolean("dialog_bar_block" + coVar.T5, false);
            edit.putBoolean("dialog_bar_report" + coVar.T5, false);
            edit.commit();
            coVar.Qc(false);
            coVar.getNotificationsController().clearDialogNotificationsSettings(coVar.T5, coVar.d());
        } else if (coVar.L1.getTag() != null && ((Integer) coVar.L1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = coVar.Z7;
            if (chatFull != null && chatFull.participants != null) {
                a0.i iVar = new a0.i();
                for (int i10 = 0; i10 < coVar.Z7.participants.participants.size(); i10++) {
                    iVar.k(null, coVar.Z7.participants.participants.get(i10).user_id);
                }
                long j3 = coVar.Z7.f19897id;
                org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(coVar.getParentActivity(), coVar.currentAccount, iVar, coVar.Z7.f19897id, coVar, coVar.f35274ea);
                b70Var.f24605l0 = new ve(coVar, 20);
                b70Var.show();
            }
        } else if (coVar.L1.getTag() != null) {
            coVar.rb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", coVar.f35276f.f20043id);
            bundle.putBoolean("addContact", true);
            ss ssVar = new ss(bundle);
            ssVar.O = new ve(coVar, 21);
            coVar.presentFragment(ssVar);
        }
    }

    public static void j1(co coVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = coVar.f35379n5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = coVar.f35395ob;
            if (i10 == 5) {
                int i11 = coVar.currentAccount;
                long j3 = coVar.T5;
                MessageSuggestionParams messageSuggestionParams = coVar.f35294g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new zh.e0(context, i11, j3, messageSuggestionParams, coVar, coVar.getResourceProvider(), 0, new bf(coVar, 3)).show();
            } else if (i10 == 1 && (messageObject = coVar.p5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = coVar.f35294g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    coVar.Tb(messageSuggestionParams2);
                } else if (coVar.p5.canEditMedia() && coVar.f35390o5 == 0) {
                    if (coVar.J1 == null) {
                        coVar.E7();
                    }
                    coVar.J1.I1(coVar.p5, -1);
                    coVar.X9();
                } else {
                    coVar.F(coVar.p5.getId(), 0, 0, 0, true, true);
                }
            } else if (coVar.f35282f5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(coVar.T5) && !coVar.f35282f5.hasSecretMessages && coVar.R3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        coVar.ca(0);
                        return;
                    }
                    MessageObject messageObject3 = coVar.f35379n5;
                    if (messageObject3 != null) {
                        coVar.F(messageObject3.getId(), 0, 0, 0, true, true);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    coVar.ca(1);
                } else if (i10 == 4) {
                    coVar.ca(2);
                }
            }
        }
    }

    public static void k0(co coVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.n51[] n51VarArr;
        if (coVar.F5 != 0) {
            coVar.getConnectionsManager().cancelRequest(coVar.F5, true);
            coVar.F5 = 0;
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (n51VarArr = (org.telegram.ui.Components.n51[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.n51.class)) != null && n51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.n51 n51Var : n51VarArr) {
                    arrayList.add(n51Var.getURL());
                }
            }
            if (arrayList != null && coVar.H5 != null && arrayList.size() == coVar.H5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) coVar.H5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            coVar.H5 = arrayList;
        } catch (Exception e7) {
            FileLog.e(e7);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new qf(coVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new qf(coVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (coVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ue(coVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = coVar.G5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = coVar.f35359lb + 1;
            coVar.f35359lb = i11;
            kg kgVar = new kg(coVar, i11, getwebpagepreview, 0);
            if (coVar.f35371mb == null) {
                coVar.f35371mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) coVar.f35371mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                kgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            m6 m6Var = new m6(coVar, getwebpagepreview, kgVar, 1);
            if (coVar.F5 != 0) {
                coVar.getConnectionsManager().cancelRequest(coVar.F5, true);
            }
            coVar.F5 = coVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new bi.f0(6, coVar, m6Var));
            coVar.getConnectionsManager().bindRequestToGuid(coVar.F5, coVar.classGuid);
        }
    }

    public static void k1(co coVar, long j3, long j10) {
        zh.s5.y(coVar.currentAccount, false).C(j3, j10, new lg(coVar, j3, j10, 0));
    }

    public static void k8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        int i10 = 6;
        if (z10) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_quote, 6, LocaleController.getString(R.string.Quote));
            i10 = 7;
        }
        if (z13) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, i10, LocaleController.getString(R.string.Spoiler));
            i10++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e51(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f28618a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o01(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f28618a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.o01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i11 += 2;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_underline, i12, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_link, i11, LocaleController.getString(R.string.CreateLink));
            i11++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_date, i11, LocaleController.getString(R.string.FormattedDate));
            i11++;
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, i11, LocaleController.getString(R.string.Regular));
    }

    public static void l0(co coVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(coVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (coVar.i() != null) {
                tLObject2 = coVar.i();
            } else {
                tLObject2 = coVar.f35264e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = coVar.f35276f;
                if (user2 != null && user2.bot && user.f20043id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.yc.a0(coVar), null);
                } else if (user2 != null && user2.bot && user.f20043id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.yc.a0(coVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.yc.a0(coVar), null);
                } else {
                    TLRPC.Chat chat = coVar.f35264e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.yc.a0(coVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = coVar.f35264e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.yc.a0(coVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                coVar.W9(user.f20043id, coVar.f35345k8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(coVar.getParentActivity());
                x6Var.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20784ia, false));
                x6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false));
                x6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                b2Var.V = x6Var;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(coVar, user, atomicBoolean, tL_attachMenuBot, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(coVar.getParentActivity(), 5, coVar.getResourceProvider());
                    z1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    z1Var.setMultiline(true);
                    z1Var.e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(16.0f);
                    }
                    z1Var.setPadding(dp, 0, dp2, 0);
                    z1Var.setOnClickListener(new rf(3, z1Var, atomicBoolean));
                    b2Var.G = 6;
                    alertDialog$Builder.n(z1Var);
                }
                alertDialog$Builder.o();
            } else {
                mj1.a(coVar.getParentActivity(), new qh(coVar, user, tL_attachMenuBot, 0), null);
            }
        }
    }

    public static void l1(co coVar, int i10) {
        if (coVar.R3 == 7) {
            Object E = coVar.M3.E(i10);
            if (i10 == 0) {
                coVar.M3.getClass();
            }
            if (E instanceof MessageObject) {
                coVar.fa((MessageObject) E);
            }
        } else if (coVar.f35412q3 != null) {
            if (i10 >= 0 && i10 < coVar.getMediaDataController().searchResultMessages.size()) {
                coVar.f35425r3 = false;
                coVar.lb(false, true, false);
                coVar.getMediaDataController().setSearchedPosition(i10);
                coVar.Fc(coVar.getMediaDataController().getMask(), coVar.getMediaDataController().getSearchPosition(), coVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new te(coVar, coVar.getMediaDataController().searchResultMessages.get(i10), 2));
            }
        } else {
            coVar.getMediaDataController().jumpToSearchedMessage(coVar.classGuid, i10);
            coVar.Lb(false);
        }
    }

    public static void m0(co coVar) {
        if (coVar.Mb == null) {
            return;
        }
        k41[] k41VarArr = {k41.T(coVar.getParentActivity(), coVar, true, coVar.resourceProvider, new nf(1, coVar, k41VarArr))};
    }

    public static void m1(co coVar, long j3, long j10, Long l4) {
        int i10;
        String str;
        if (coVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = coVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(coVar.f35264e)) {
            i10 = R.string.RemoveMessageFeeMessageChannel;
        } else {
            i10 = R.string.RemoveMessageFeeMessage;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(j3)));
        if (l4.longValue() > 0) {
            str = LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l4.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.e5.i0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new oh(coVar, j3, j10, l4, 0), coVar.resourceProvider, true);
    }

    public static void n0(co coVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, m6 m6Var) {
        try {
            a0.i iVar = new a0.i();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f19917id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(coVar.currentAccount, tL_message, false, false));
            iVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            coVar.getMessagesController().getStoriesController().f3840k.d(iVar, new fh(6, iVar, m6Var), coVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void n1(co coVar) {
        MessagesController messagesController = coVar.getMessagesController();
        long j3 = coVar.T5;
        long j10 = coVar.L6;
        int i10 = coVar.classGuid;
        int i11 = coVar.R3;
        long j11 = coVar.f35255d4;
        int i12 = coVar.f35364m4;
        int i13 = coVar.V5;
        coVar.V5 = i13 + 1;
        messagesController.loadMessages(j3, j10, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j11, i12, i13, coVar.f35304h4);
    }

    public static void o0(co coVar, long j3, long j10) {
        BotForumHelper.getInstance(coVar.currentAccount).saveIsStreamingTopic(j3, j10, false);
        coVar.Nb = null;
    }

    public static void o1(co coVar) {
        int i10;
        TLRPC.ChatFull chatFull = coVar.Z7;
        if (chatFull != null && !coVar.f35414q5) {
            TLRPC.Chat chat = coVar.f35264e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && coVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(coVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = coVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && coVar.visibleDialog == null && coVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = coVar.getParentActivity();
                    ve veVar = new ve(coVar, 12);
                    ve veVar2 = new ve(coVar, 13);
                    Pattern pattern = org.telegram.ui.Components.e5.f25584a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bi.z1(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.x5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                    b2Var.V = frameLayout;
                    b2Var.O0 = 0.3974359f;
                    b2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), veVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), veVar2);
                    coVar.showDialog(b2Var);
                }
            }
        }
    }

    public static void p0(co coVar) {
        if (coVar.R3 == 0 && coVar.getMessagesController().freezeUntilDate > coVar.getConnectionsManager().getCurrentTime() && !b.a(coVar.currentAccount, coVar.f35276f)) {
            b.c(coVar.getParentActivity(), coVar.currentAccount, coVar.getResourceProvider());
        }
    }

    public static Integer p8(ArrayList arrayList, int i10, int[] iArr) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Integer num = (Integer) arrayList.get(0);
        if (i10 >= num.intValue()) {
            iArr[0] = 0;
            return num;
        }
        int size = arrayList.size();
        int i11 = size - 1;
        Integer num2 = (Integer) arrayList.get(i11);
        if (i10 <= num2.intValue()) {
            iArr[0] = i11;
            return num2;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            i13 = (i12 + size) / 2;
            Integer num3 = (Integer) arrayList.get(i13);
            if (num3.intValue() == i10) {
                iArr[0] = i13;
                return num3;
            } else if (i10 < num3.intValue()) {
                if (i13 > 0) {
                    int i14 = i13 - 1;
                    Integer num4 = (Integer) arrayList.get(i14);
                    if (i10 > num4.intValue()) {
                        iArr[0] = i14;
                        return num4;
                    }
                }
                i12 = i13 + 1;
            } else if (i13 > 0 && i10 < ((Integer) arrayList.get(i13 - 1)).intValue()) {
                iArr[0] = i13;
                return num3;
            } else {
                size = i13;
            }
        }
        iArr[0] = i13;
        return (Integer) arrayList.get(i13);
    }

    public static void q1(org.telegram.ui.co r19, final org.telegram.ui.k41[] r20, final org.telegram.ui.Components.n70 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.q1(org.telegram.ui.co, org.telegram.ui.k41[], org.telegram.ui.Components.n70):void");
    }

    public static void r0(co coVar, ArrayList arrayList, long j3, org.telegram.ui.Components.am0 am0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(coVar.currentAccount).sendMessage(arrayList, j3, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new le(coVar, j3, 5), 400L);
            am0Var.dismiss();
        }
    }

    public static void r1(co coVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = coVar.A6;
        int[] iArr4 = coVar.f35531z6;
        boolean[] zArr = coVar.E6;
        int[] iArr5 = coVar.f35518y6;
        int[] iArr6 = coVar.B6;
        boolean[] zArr2 = coVar.D6;
        ArrayList arrayList = coVar.f35306h6;
        if ((i10 - i11) - i12 <= i13 && !coVar.G6) {
            boolean[] zArr3 = coVar.C6;
            if (!zArr3[0]) {
                coVar.G6 = true;
                arrayList.add(Integer.valueOf(coVar.V5));
                if (coVar.f35428r6.size() != 0) {
                    MessagesController messagesController = coVar.getMessagesController();
                    j3 = 0;
                    long j10 = coVar.T5;
                    c10 = 0;
                    long j11 = coVar.L6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = coVar.classGuid;
                    int i17 = coVar.R3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = coVar.f35255d4;
                    int i18 = coVar.f35364m4;
                    int i19 = coVar.V5;
                    coVar.V5 = i19 + 1;
                    messagesController.loadMessages(j10, j11, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j12, i18, i19, coVar.f35304h4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    MessagesController messagesController2 = coVar.getMessagesController();
                    long j13 = coVar.T5;
                    long j14 = coVar.L6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = coVar.classGuid;
                    int i22 = coVar.R3;
                    long j15 = coVar.f35255d4;
                    int i23 = coVar.f35364m4;
                    int i24 = coVar.V5;
                    coVar.V5 = i24 + 1;
                    messagesController2.loadMessages(j13, j14, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j15, i23, i24, coVar.f35304h4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (coVar.L6 != 0 && !zArr3[1]) {
                    coVar.G6 = true;
                    arrayList.add(Integer.valueOf(coVar.V5));
                    MessagesController messagesController3 = coVar.getMessagesController();
                    long j16 = coVar.L6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = coVar.classGuid;
                    int i28 = coVar.R3;
                    long j17 = coVar.f35255d4;
                    int i29 = coVar.f35364m4;
                    int i30 = coVar.V5;
                    coVar.V5 = i30 + 1;
                    messagesController3.loadMessages(j16, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j17, i29, i30, coVar.f35304h4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i12 > 0 && !coVar.I7 && i11 <= 10) {
            if (coVar.L6 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(coVar.V5));
                MessagesController messagesController4 = coVar.getMessagesController();
                long j18 = coVar.L6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = coVar.classGuid;
                int i34 = coVar.R3;
                long j19 = coVar.f35255d4;
                int i35 = coVar.f35364m4;
                int i36 = coVar.V5;
                coVar.V5 = i36 + 1;
                messagesController4.loadMessages(j18, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j19, i35, i36, coVar.f35304h4);
                coVar.I7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(coVar.V5));
                MessagesController messagesController5 = coVar.getMessagesController();
                long j20 = coVar.T5;
                long j21 = coVar.L6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = coVar.classGuid;
                int i40 = coVar.R3;
                long j22 = coVar.f35255d4;
                int i41 = coVar.f35364m4;
                int i42 = coVar.V5;
                coVar.V5 = i42 + 1;
                messagesController5.loadMessages(j20, j21, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j22, i41, i42, coVar.f35304h4);
                coVar.I7 = true;
            }
        }
    }

    public static void s0(long j3, co coVar) {
        if (zh.s5.y(coVar.currentAccount, false).p().amount < j3) {
            new zh.k7(coVar.getParentActivity(), coVar.getResourceProvider(), j3, 13, DialogObject.getShortName(coVar.a()), new qf(coVar, 15), coVar.a()).show();
        } else {
            new zh.l7(coVar.getParentActivity(), coVar.resourceProvider).show();
        }
    }

    public static void t0(co coVar, TLRPC.Document document) {
        coVar.f35478v4.put(document, 0);
        SendMessagesHelper.getInstance(coVar.currentAccount).sendSticker(document, null, coVar.T5, null, null, null, coVar.f35353l5, null, true, 0, 0, false, null, coVar.C8(), 0L, coVar.N8(), coVar.f35294g5);
    }

    public static void t1(co coVar) {
        if (MessagesController.getInstance(coVar.currentAccount).isDialogMuted(coVar.T5, coVar.d())) {
            coVar.Pc(true);
            AndroidUtilities.runOnUIThread(new me(coVar, 18), 150L);
            coVar.f35300h0.M(null, null);
            if (coVar.getParentActivity() != null) {
                org.telegram.ui.Components.yc.z(coVar, 4, 0, coVar.f35274ea).j();
                return;
            }
            return;
        }
        View view = coVar.f35266e1.f21367i;
        if (view instanceof org.telegram.ui.ActionBar.f1) {
            ((org.telegram.ui.ActionBar.f1) view).b();
        }
    }

    public static void u0(co coVar, TLRPC.Document document) {
        coVar.f35478v4.put(document, 0);
        SendMessagesHelper.getInstance(coVar.currentAccount).sendSticker(document, null, coVar.T5, null, null, null, coVar.f35353l5, null, true, 0, 0, false, null, coVar.C8(), 0L, coVar.N8(), coVar.f35294g5);
    }

    public static void u1(co coVar, String str) {
        if (coVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(coVar.currentAccount).getInviteText(1));
            coVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static boolean u9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void v0(co coVar) {
        long j3;
        ArrayList arrayList = coVar.f35306h6;
        arrayList.add(Integer.valueOf(coVar.V5));
        if (coVar.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(coVar.currentAccount);
            String str = coVar.f35464u3;
            int i10 = coVar.classGuid;
            int i11 = coVar.O3;
            int i12 = coVar.V5;
            coVar.V5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (coVar.f35494w7 != 0) {
            MessagesController messagesController = coVar.getMessagesController();
            long j10 = coVar.T5;
            long j11 = coVar.L6;
            int i13 = coVar.f35494w7;
            int i14 = coVar.classGuid;
            int i15 = coVar.R3;
            long j12 = coVar.f35255d4;
            int i16 = coVar.f35364m4;
            int i17 = coVar.V5;
            coVar.V5 = i17 + 1;
            messagesController.loadMessages(j10, j11, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j12, i16, i17, coVar.f35304h4);
        } else if (coVar.f35468u7 != 0 && (!coVar.F9() || coVar.f35468u7 == coVar.L7 || coVar.f35304h4)) {
            int i18 = coVar.f35331j7;
            if (i18 != 0) {
                coVar.L6 = i18;
                MessagesController messagesController2 = coVar.getMessagesController();
                long j13 = coVar.L6;
                boolean z10 = coVar.f35307h7;
                int i19 = coVar.f35296g7;
                int i20 = coVar.f35468u7;
                int i21 = coVar.classGuid;
                int i22 = coVar.R3;
                long j14 = coVar.f35255d4;
                int i23 = coVar.f35364m4;
                int i24 = coVar.V5;
                coVar.V5 = i24 + 1;
                messagesController2.loadMessages(j13, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j14, i23, i24, coVar.f35304h4);
            } else {
                MessagesController messagesController3 = coVar.getMessagesController();
                long j15 = coVar.T5;
                long j16 = coVar.L6;
                boolean z11 = coVar.f35307h7;
                int i25 = coVar.f35296g7;
                int i26 = coVar.f35468u7;
                int i27 = coVar.classGuid;
                int i28 = coVar.R3;
                long j17 = coVar.f35255d4;
                int i29 = coVar.f35364m4;
                int i30 = coVar.V5;
                coVar.V5 = i30 + 1;
                messagesController3.loadMessages(j15, j16, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j17, i29, i30, coVar.f35304h4);
            }
        } else if (coVar.f35319i7) {
            coVar.V5++;
        } else {
            MessagesController messagesController4 = coVar.getMessagesController();
            long j18 = coVar.T5;
            long j19 = coVar.L6;
            boolean z12 = coVar.f35307h7;
            int i31 = coVar.f35296g7;
            int i32 = coVar.f35468u7;
            int i33 = coVar.classGuid;
            int i34 = coVar.R3;
            long j20 = coVar.f35255d4;
            int i35 = coVar.f35364m4;
            int i36 = coVar.V5;
            coVar.V5 = i36 + 1;
            messagesController4.loadMessages(j18, j19, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j20, i35, i36, coVar.f35304h4);
        }
        int i37 = coVar.R3;
        if (i37 == 0 || (i37 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId())) {
            if (coVar.F9() && !coVar.f35304h4) {
                return;
            }
            arrayList.add(Integer.valueOf(coVar.V5));
            MessagesController messagesController5 = coVar.getMessagesController();
            long j21 = coVar.T5;
            long j22 = coVar.L6;
            int i38 = coVar.classGuid;
            if (coVar.R3 == 3) {
                j3 = 0;
            } else {
                j3 = coVar.f35255d4;
            }
            long j23 = j3;
            int i39 = coVar.f35364m4;
            int i40 = coVar.V5;
            coVar.V5 = i40 + 1;
            messagesController5.loadMessages(j21, j22, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j23, i39, i40, coVar.f35304h4);
        }
    }

    public static boolean v1(org.telegram.ui.co r17, org.telegram.tgnet.TLRPC.MessageEntity r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.v1(org.telegram.ui.co, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void w0(co coVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        String str3;
        if (coVar.f35256d5 != null && i10 < arrayList.size() && coVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = coVar.f35256d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.u31.J(coVar.getParentActivity(), coVar, inputPeer, iArr[0], coVar.f35256d5.summarized, strArr[0], str3, charSequence, z10, vfVar, new ug(coVar, 12)).setDimBehind(false);
            coVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(coVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + coVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + coVar.a(), i11 - 1).apply();
                coVar.Qc(true);
            }
        }
    }

    public static void w1(co coVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(coVar.currentAccount).loadAttachMenuBots(false, true);
            coVar.W9(user.f20043id, coVar.f35345k8, false);
        }
    }

    public static void x0(co coVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(coVar.currentAccount).getInputUser(user.f20043id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(coVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new th(coVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void x1(co coVar, View view, int i10) {
        org.telegram.ui.Components.z5 z5Var;
        TLRPC.User user;
        char c10;
        qk qkVar;
        qk qkVar2;
        if (i10 != 0) {
            hg.k1 adapter = coVar.I1.getAdapter();
            if (adapter.f11182w0 != null && !adapter.f11164h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = coVar.I1.getAdapter().J(i11);
            int i12 = coVar.I1.getAdapter().X;
            int i13 = coVar.I1.getAdapter().Y;
            if (coVar.I1.getAdapter().F != null && i11 == 1) {
                coVar.Y.O0(i12, i13, coVar.I1.getAdapter().F + "@" + ChatObject.getPublicUsername(coVar.f35264e) + " ", false);
            } else if (coVar.I1.getAdapter().F != null && i11 == 0) {
                coVar.Y.O0(i12, i13, a4.a.s(new StringBuilder(), coVar.I1.getAdapter().F, " "), false);
            } else if (J instanceof ig.a2) {
                if (!coVar.getUserConfig().isPremium()) {
                    coVar.showDialog(new sg.a1(coVar, coVar.getParentActivity(), coVar.currentAccount, true, 31, false, null));
                    return;
                }
                ig.a2 a2Var = (ig.a2) J;
                org.telegram.ui.Components.e5.a0(coVar.currentAccount, Math.max(1, a2Var.a()), coVar.T5, new di.m2(28, coVar, a2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (coVar.R3 != 0 || !coVar.e7(view)) {
                        if (view instanceof org.telegram.ui.Cells.d8) {
                            sendAnimationData = ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.e5.a0(coVar.currentAccount, 1, coVar.a(), new ta(coVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), coVar.I1.getAdapter().L(i11), sendAnimationData, 2));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (coVar.f35377n3 && (qkVar2 = coVar.R2) != null && qkVar2.getVisibility() == 0) {
                        coVar.Za(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        coVar.Y.O0(i12, i13, a4.a.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (coVar.f35377n3 && (qkVar = coVar.R2) != null && qkVar.getVisibility() == 0) {
                        coVar.Za(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        coVar.Y.O0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.t(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.o51("" + user2.f20043id, 3, null), 0, spannableString.length(), 33);
                        coVar.Y.O0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof hg.h1) {
                    if (coVar.I1.getAdapter().J != null && coVar.R3 != 1) {
                        hg.h1 h1Var = (hg.h1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(h1Var.f11091a, coVar.T5, coVar.f35379n5, coVar.X3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = coVar.C8();
                        of2.ephemeralReceiverBotId = h1Var.f11092b;
                        of2.monoForumPeer = coVar.N8();
                        of2.suggestionParams = coVar.f35294g5;
                        coVar.getSendMessagesHelper().sendMessage(of2);
                        coVar.Y.setFieldText("");
                        coVar.e9(false);
                    }
                } else if (J instanceof String) {
                    if (coVar.I1.getAdapter().J != null) {
                        if (coVar.R3 == 1) {
                            org.telegram.ui.Components.e5.M(coVar.getParentActivity(), coVar.T5, new m4(7, coVar, (String) J), coVar.f35274ea);
                            return;
                        } else if (!coVar.e7(view)) {
                            org.telegram.ui.Components.e5.a0(coVar.currentAccount, 1, coVar.T5, new di.m2(29, coVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    coVar.Y.O0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (coVar.Y.getFieldText() != null) {
                        if (coVar.R3 == 1 || !coVar.e7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (coVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35274ea);
                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    coVar.showDialog(alertDialog$Builder.f20225a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(coVar.I1.getAdapter().R);
                                coVar.Ha = arrayList;
                                PhotoViewer.t1().K2(null, coVar, coVar.f35274ea);
                                PhotoViewer.t1().f2(arrayList, coVar.I1.getAdapter().M(i11), 3, false, coVar.Ia, coVar);
                                return;
                            }
                            org.telegram.ui.Components.e5.a0(coVar.currentAccount, 1, coVar.a(), new nf(0, coVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6(29, coVar, (TLRPC.TL_inlineBotWebView) J);
                    if (coVar.f35335jb) {
                        c6Var.run();
                    } else {
                        mj1.a(coVar.getParentActivity(), new bi.t2(6, coVar, c6Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    fk fkVar = coVar.I1;
                    if (fkVar != null && (user = fkVar.getAdapter().f11182w0) != null) {
                        coVar.Y.setFieldText("");
                        long j3 = coVar.T5;
                        if (j3 == user.f20043id) {
                            coVar.f35284f8 = j3;
                            coVar.getMessagesController().sendBotStart(coVar.f35276f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20043id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", coVar.T5);
                        if (coVar.getMessagesController().checkCanOpenChat(bundle, coVar)) {
                            coVar.presentFragment(new co(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    mk mkVar = coVar.Y;
                    mkVar.U();
                    mkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            coVar.Y.O0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = coVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e7) {
                                FileLog.e((Throwable) e7, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.q5.f(coVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                z5Var = new org.telegram.ui.Components.z5(f7, fontMetricsInt);
                            } else {
                                z5Var = new org.telegram.ui.Components.z5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(z5Var, 0, spannableString2.length(), 33);
                            coVar.Y.O0(i12, i13, spannableString2, false);
                            coVar.I1.o(false);
                        }
                    }
                    coVar.Y.O0(i12, i13, str, true);
                    coVar.I1.o(false);
                }
            }
        }
    }

    public static void y0(co coVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(coVar.currentAccount).sendSticker(tL_document, str, coVar.T5, coVar.f35379n5, coVar.X3, null, coVar.f35353l5, null, z10, i10, 0, false, obj, coVar.C8(), 0L, coVar.N8(), coVar.f35294g5);
    }

    public static void y1(co coVar, org.telegram.ui.Components.n70 n70Var) {
        if (coVar.Mb == null) {
            return;
        }
        n70Var.u();
        coVar.J9(coVar.Mb, false, true);
        of.f.r(coVar.getParentActivity(), Uri.parse(coVar.Mb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(coVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void z0(co coVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, vf vfVar) {
        if (coVar.f35256d5 != null && i10 < arrayList.size() && coVar.getParentActivity() != null) {
            org.telegram.ui.Components.u31.J(coVar.getParentActivity(), coVar, inputPeer, iArr[0], coVar.f35256d5.summarized, "und", str, charSequence, z10, vfVar, new ug(coVar, 4)).setDimBehind(false);
            coVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(coVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + coVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + coVar.a(), i11 - 1).apply();
                coVar.Qc(true);
            }
        }
    }

    public static void z1(co coVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.dh dhVar;
        String str;
        SparseArray[] sparseArrayArr = coVar.W5;
        if (coVar.getParentActivity() != null && coVar.N9 == 0.0f) {
            if (coVar.R3 == 3) {
                Bundle bundle = new Bundle();
                long I8 = coVar.I8();
                if (I8 >= 0) {
                    bundle.putLong("user_id", I8);
                } else {
                    bundle.putLong("chat_id", -I8);
                }
                coVar.presentFragment(new co(bundle));
                return;
            }
            boolean z12 = false;
            if (coVar.A9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                coVar.vb(true, true);
                byte[] bArr = coVar.V3;
                String str2 = coVar.W3;
                bf bfVar = new bf(coVar, 1);
                int i11 = e41.v;
                int currentAccount = coVar.getCurrentAccount();
                Activity parentActivity = coVar.getParentActivity();
                long a2 = coVar.a();
                if (parentActivity != null) {
                    e41.K(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.yc.a0(coVar), coVar.getResourceProvider(), bArr, str2, bfVar);
                }
            } else if (coVar.R3 == 2) {
                coVar.finishFragment();
                pm pmVar = coVar.V8;
                if (coVar.B0.getTag() == null) {
                    z12 = true;
                }
                pmVar.W(true, z12);
            } else {
                TLRPC.User user = coVar.f35276f;
                if (user != null && user.f20043id == 489000) {
                    coVar.bc(true);
                } else if (user != null && coVar.f35373n) {
                    if (user.bot) {
                        String str3 = coVar.f35272e8;
                        coVar.f35272e8 = null;
                        coVar.getMessagesController().unblockPeer(coVar.f35276f.f20043id, new se(coVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35274ea);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                    b2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ve(coVar, 6));
                    b2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    coVar.showDialog(b2Var);
                } else if (UserObject.isReplyUser(user)) {
                    coVar.bc(true);
                } else {
                    TLRPC.User user2 = coVar.f35276f;
                    if (user2 != null && user2.bot && (str = coVar.f35272e8) != null) {
                        if (str.length() != 0) {
                            coVar.getMessagesController().sendBotStart(coVar.f35276f, coVar.f35272e8);
                        } else {
                            coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        coVar.f35272e8 = null;
                        coVar.hc(false);
                        return;
                    }
                    if (ChatObject.isChannel(coVar.f35264e)) {
                        TLRPC.Chat chat = coVar.f35264e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (coVar.f35264e.join_request) {
                                    coVar.vb(true, true);
                                    MessagesController.getInstance(coVar.currentAccount).addUserToChat(coVar.f35264e.f19896id, UserConfig.getInstance(coVar.currentAccount).getCurrentUser(), 0, null, null, true, new me(coVar, 17), new m4(6, coVar, context));
                                    return;
                                }
                                me meVar = coVar.L5;
                                if (meVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(meVar);
                                    coVar.L5 = null;
                                }
                                coVar.vb(true, true);
                                coVar.getMessagesController().addUserToChat(coVar.f35264e.f19896id, coVar.getUserConfig().getCurrentUser(), 0, null, coVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.q0 q0Var = coVar.K1;
                                if (q0Var != null && (dhVar = coVar.M0) != null && dhVar.d(q0Var) && coVar.N1.getVisibility() != 8 && coVar.N1.getTag(R.id.object_tag) != null) {
                                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(coVar.currentAccount).edit();
                                    edit.putInt("dialog_bar_vis3" + coVar.T5, 3).commit();
                                    coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(coVar.T5));
                                    return;
                                }
                                return;
                            }
                            coVar.bc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = coVar.Z7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = coVar.f35264e;
                    TLRPC.User user3 = coVar.f35276f;
                    if (coVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.e5.s(coVar, false, chat2, user3, z11, true, false, z10, new ve(coVar, 7));
                }
            }
        }
    }

    @Override
    public final List A() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f35264e)) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f35211a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new ng.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new ug(this, 15)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new ug(this, 16)));
        }
        if (this.f35276f == null) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new t0("", 1)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.c2(this)));
        }
        return arrayList;
    }

    public final void A6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        sn snVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        sn snVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j11;
        org.telegram.ui.Components.n01 n01Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.z5 z5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        Long l10;
        if (this.Y != null) {
            int i11 = this.R3;
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == I8())) {
                long j13 = 0;
                if (this.R3 == 8) {
                    if (ChatObject.isMonoForum(this.f35264e)) {
                        if (this.f35255d4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f35264e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.n01 n01Var2 = null;
                if (v9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.T5);
                    if (oneThreadDraft != null) {
                        l10 = (Long) oneThreadDraft.first;
                        draft = (TLRPC.DraftMessage) oneThreadDraft.second;
                    } else {
                        draft = null;
                        l10 = null;
                    }
                    l4 = l10;
                } else {
                    MediaDataController mediaDataController = getMediaDataController();
                    long j14 = this.T5;
                    if (this.R3 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f35255d4;
                    }
                    draft = mediaDataController.getDraft(j14, j3);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                mk mkVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                mkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.T5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j15 = this.T5;
                    if (l4 != null) {
                        j12 = l4.longValue();
                    } else {
                        j12 = this.f35255d4;
                    }
                    message = mediaDataController2.getDraftMessage(j15, j12);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.R3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f35223ac >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        e9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f35223ac = draftMessage3.date;
                    mk mkVar2 = this.Y;
                    mkVar2.W2 = null;
                    mkVar2.X2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i12 = 0;
                        while (i12 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i12);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            long j16 = j13;
                            if (z12 || (messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                draftMessage2 = draftMessage3;
                                if (z12) {
                                    j11 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j11 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                n01Var = null;
                                org.telegram.ui.Components.o51 o51Var = new org.telegram.ui.Components.o51(a4.a.o(j11, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(o51Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f28618a |= 4;
                                    org.telegram.ui.Components.o01 o01Var = new org.telegram.ui.Components.o01(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(o01Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f28618a |= 1;
                                        org.telegram.ui.Components.o01 o01Var2 = new org.telegram.ui.Components.o01(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o01Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f28618a |= 2;
                                        org.telegram.ui.Components.o01 o01Var3 = new org.telegram.ui.Components.o01(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o01Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f28618a |= 8;
                                        org.telegram.ui.Components.o01 o01Var4 = new org.telegram.ui.Components.o01(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o01Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f28618a |= 16;
                                        org.telegram.ui.Components.o01 o01Var5 = new org.telegram.ui.Components.o01(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o01Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.n51 n51Var = new org.telegram.ui.Components.n51(messageEntity.url, n01Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(n51Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f28618a |= 256;
                                        org.telegram.ui.Components.o01 o01Var6 = new org.telegram.ui.Components.o01(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o01Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.si0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e7) {
                                            FileLog.e((Throwable) e7, false);
                                            fontMetricsInt = n01Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            z5Var = new org.telegram.ui.Components.z5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            z5Var = new org.telegram.ui.Components.z5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(z5Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        n01Var = n01Var2;
                                    }
                                    n01Var = n01Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                n01Var = null;
                            }
                            i12++;
                            n01Var2 = n01Var;
                            j13 = j16;
                            draftMessage3 = draftMessage2;
                        }
                        j10 = j13;
                        snVar = n01Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        snVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.f1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new me(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f35294g5 = of2;
                        Db(of2);
                    }
                    messageObject = this.f35379n5;
                    if (messageObject != null || this.X3 == messageObject) {
                        if (message == null && ((messageObject2 = this.X3) == null || messageObject2.getId() != message.f19917id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f35379n5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i23 = inputReplyTo2.flags;
                                if ((i23 & 4) != 0) {
                                    String str3 = inputReplyTo2.quote_text;
                                    if ((i23 & 16) != 0) {
                                        i10 = inputReplyTo2.quote_offset;
                                    } else {
                                        i10 = -1;
                                    }
                                    TLRPC.Message message3 = messageObject3.messageOwner;
                                    if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i10)) < 0) {
                                        snVar2 = snVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        snVar2 = new sn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f35353l5 = snVar2;
                                }
                            }
                            V6(false);
                            sn snVar3 = this.f35353l5;
                            if (snVar3 != null) {
                                Cb(this.f35379n5, snVar3);
                            } else {
                                Bb(this.f35379n5);
                            }
                            hc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j10 && this.f35264e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f35264e.f19896id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f35379n5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Bb(messageObject4);
                            hc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j10 = 0;
                snVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f35294g5 = of22;
                    Db(of22);
                }
                messageObject = this.f35379n5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void A7(boolean z10) {
        this.R8 = z10;
        org.telegram.ui.ActionBar.n1 n1Var = this.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f35237bc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f35237bc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f35237bc = ofFloat;
            ofFloat.addUpdateListener(new oe(this, 0));
            this.f35237bc.setDuration(150L);
            this.f35237bc.start();
        }
    }

    public final int A8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.f35357l9 == null) {
            this.f35357l9 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount, true, this.Ba, this.f35274ea);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f35357l9;
        if (this.f35264e == null && !UserObject.isUserSelf(this.f35276f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        t1Var.N7 = z11;
        org.telegram.ui.Cells.t1 t1Var2 = this.f35357l9;
        int i10 = this.R3;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        t1Var2.P7 = z12;
        if (i10 == 3 && this.Oa) {
            z13 = true;
        } else {
            z13 = false;
        }
        t1Var2.Q7 = z13;
        TLRPC.User user = this.f35276f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        t1Var2.R7 = z14;
        if (ChatObject.isChannel(this.f35264e) && this.f35264e.megagroup) {
            z15 = true;
        }
        t1Var2.S7 = z15;
        this.f35357l9.E8 = t9();
        this.f35357l9.F8 = C9();
        this.f35357l9.G8 = B9();
        return this.f35357l9.g1(messageObject, (MessageObject.GroupedMessages) this.f35506x6.f(messageObject.getGroupId()), z10);
    }

    public final boolean A9() {
        return !TextUtils.isEmpty(this.U3);
    }

    public final void Aa(int i10) {
        boolean z10;
        int i11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i10 == 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i12 >= 24) {
                        Activity parentActivity = getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.V7 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        try {
            if (i10 == 1) {
                Activity parentActivity2 = getParentActivity();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 33) {
                    if (parentActivity2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i13 >= 23 && parentActivity2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (ChatObject.isChannel(this.f35264e) && (tL_chatBannedRights = this.f35264e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                kq0 kq0Var = new kq0(0, z10, true, this);
                if (this.R3 == 9) {
                    kq0Var.G = 1;
                    kq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.f35264e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f35264e.slowmode_enabled) {
                        kq0Var.G = 10;
                        kq0Var.H = true;
                    } else {
                        MessageObject messageObject = this.p5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        kq0Var.G = i11;
                        kq0Var.H = z11;
                    }
                }
                kq0Var.V = new sl(this);
                presentFragment(kq0Var);
            } else if (i10 == 2) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File generateVideoPath = AndroidUtilities.generateVideoPath();
                    if (generateVideoPath != null) {
                        if (i14 >= 24) {
                            Activity parentActivity3 = getParentActivity();
                            intent2.putExtra("output", FileProvider.d(parentActivity3, ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(generateVideoPath));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.V7 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Ab(ArrayList arrayList) {
        yb(true, null, null, arrayList, null, null, false, true);
    }

    public final void Ac(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f35361m1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35326j1.e(4, z11, z10);
        this.f35326j1.c(4, this.f35361m1, z10);
    }

    @Override
    public final boolean B() {
        return false;
    }

    public final int B6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f35500x0.getHeight();
        long j3 = 0;
        int i11 = 0;
        while (true) {
            View T0 = this.f35500x0.T0(i10);
            if (T0 == null) {
                break;
            }
            if (T0 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) T0;
                messageObject = t1Var.getMessageObject();
                additionalPaddingHeight = t1Var.getAdditionalPaddingHeight();
            } else if (T0 instanceof org.telegram.ui.Cells.w0) {
                messageObject = ((org.telegram.ui.Cells.w0) T0).getMessageObject();
                additionalPaddingHeight = 0;
            } else {
                continue;
            }
            if (messageObject != null) {
                long groupId = messageObject.getGroupId();
                boolean isOut = messageObject.isOut();
                if (j3 != 0 && j3 != groupId) {
                    break;
                }
                height = Math.min(height, T0.getTop());
                i11 = Math.max(i11, T0.getBottom() - additionalPaddingHeight);
                if (isOut) {
                    if (groupId == 0) {
                        break;
                    }
                    j3 = groupId;
                }
                i10++;
            } else {
                continue;
            }
        }
        return Math.max(0, i11 - height);
    }

    public final long B7(MessageObject messageObject) {
        if (this.R3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f35264e) && !this.f35304h4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f19948id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f35264e));
        }
        return this.f35255d4;
    }

    public final boolean B9() {
        org.telegram.ui.Components.w21 w21Var = this.R1;
        if (w21Var != null && w21Var.Q && w21Var.f32118a.f15396f) {
            return true;
        }
        return false;
    }

    public final void Ba(int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Ba(int):void");
    }

    public final void Bb(MessageObject messageObject) {
        zb(true, messageObject, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void Bc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.l1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35326j1.e(3, z11, z10);
        this.f35326j1.c(3, this.l1, z10);
    }

    public final float C6(boolean z10) {
        float f7;
        float f10;
        float f11;
        mk mkVar = this.Y;
        float f12 = 0.0f;
        if (mkVar != null) {
            if (z10) {
                f7 = mkVar.f23751j5;
            } else {
                f7 = mkVar.f23746i5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        le.b bVar = this.wc;
        j6.l lVar = this.Bc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f13576a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f13576a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f15396f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f13577b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.f15395e;
            f11 = f13;
        }
        if (!this.Oa && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final SendMessageChatArguments C8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.R3 == 9) {
            builder.setWelcomeMessageChatId(this.ta);
        }
        if (this.R3 == 5) {
            builder.setQuickReplyShortcut(this.Q3, H8());
        }
        return builder.build();
    }

    public final boolean C9() {
        if (this.R1 == null) {
            if (this.T3 || !ChatObject.isMonoForum(this.f35264e)) {
                if (!ChatObject.isForum(this.f35264e) || !ChatObject.areTabsEnabled(this.f35264e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Ca(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f35284f8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f35276f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f35284f8 == this.T5) {
                this.f35284f8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f35284f8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((n2Var instanceof co) && ((co) n2Var).T5 == this.f35284f8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f35284f8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f35284f8));
                } else if (DialogObject.isUserDialog(this.f35284f8)) {
                    bundle.putLong("user_id", this.f35284f8);
                } else {
                    bundle.putLong("chat_id", -this.f35284f8);
                }
                v6();
                presentFragment(new co(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Cb(MessageObject messageObject, sn snVar) {
        yb(true, messageObject, null, null, null, snVar, false, true);
    }

    public final void Cc(boolean z10) {
        String string;
        if (this.R3 != 3 && !UserObject.isBotForum(this.f35276f)) {
            pj pjVar = this.f35213a1;
            if (pjVar != null && this.f35255d4 != 0) {
                if (this.f35304h4) {
                    Sc();
                } else if (this.f35293g4) {
                    MessageObject messageObject = this.X3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f35213a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f35213a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.X3;
                    if (messageObject2 != null) {
                        pjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f35229b4 != null) {
                if (this.X3.getRepliesCount() == 0) {
                    if (this.f35293g4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f35229b4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final boolean D6() {
        if (!z9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f35304h4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                rk rkVar = this.O0;
                if (rkVar == null || rkVar.getVisibility() != 0) {
                    if (!F9() || this.f35304h4) {
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

    public final void D7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.D7():void");
    }

    public final boolean D9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f35238c && !this.d && this.f35276f == null && this.f35500x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f35323ib == null) {
                this.f35323ib = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f35323ib.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f35500x0.getChildCount(); i12++) {
                    i11 += this.f35500x0.getChildAt(i12).getHeight();
                    int top = this.f35500x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f35445s9) {
                    L6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.C6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f35467u6;
                if ((!z12 || ((this.L6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.G6 && f10 > this.f35445s9 && (!arrayList.isEmpty() ? i11 != 0 : this.f35310hb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.Q0) == null || frameLayout.getVisibility() != 0 || this.Q0.getChildCount() <= 0) {
                    if (!z10 && this.N6 == 0) {
                        L6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.R9 && this.fragmentBeginToShow) {
                        if (z10 && this.N6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable d = this.f35274ea.d();
                        um umVar = this.X0;
                        if (umVar != null) {
                            d = umVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.dc0) {
                            org.telegram.ui.Components.dc0 dc0Var = (org.telegram.ui.Components.dc0) d;
                            if (dc0Var.N != z11) {
                                if (!z11) {
                                    dc0Var.c();
                                }
                                dc0Var.q(z11);
                                if (z11) {
                                    f7 = 1.5f;
                                } else {
                                    f7 = 1.0f;
                                }
                                dc0Var.M = f7;
                                dc0Var.z();
                            } else if (z11) {
                                dc0Var.z();
                            }
                        }
                    }
                    if (z10 || (this.N6 != 0 && System.currentTimeMillis() - this.N6 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Da(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f19917id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
        messageObject2.type = 10;
        messageObject2.contentType = 1;
        messageObject2.isDateObject = true;
        messageObject2.stableId = T8(messageObject.dateKeyInt);
        this.A0.P.add(i10, messageObject2);
    }

    public final void Db(MessageSuggestionParams messageSuggestionParams) {
        zb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Dc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.q6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i10);
        if (arrayList == null) {
            return;
        }
        if (messageObject == null) {
            messageObject2 = new MessageObject(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            messageObject2 = null;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MessageObject messageObject3 = (MessageObject) this.f35391o6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                om omVar = this.A0;
                if (omVar != null) {
                    omVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        if (i10 == 0) {
            S9();
            return;
        }
        int i13 = 4;
        int i14 = 0;
        if (i10 == 1) {
            View view = this.T;
            if (view != null) {
                view.setAlpha(f7);
                View view2 = this.T;
                if (f7 > 0.0f) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            S9();
            s7();
            rh.c cVar = this.Cc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.wc.f15395e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                le.b bVar = this.xc;
                float f11 = 1.0f - bVar.f15395e;
                this.M0.setAlpha(f11);
                org.telegram.ui.Components.dh dhVar = this.M0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                dhVar.setVisibility(i12);
                float f12 = 1.0f - bVar.f15395e;
                org.telegram.ui.Components.w21 w21Var = this.R1;
                if (w21Var != null) {
                    w21Var.setAlpha(f12);
                    org.telegram.ui.Components.w21 w21Var2 = this.R1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    w21Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                ih.f fVar = this.K3;
                le.b bVar2 = this.f35524yc;
                if (fVar != null) {
                    float f13 = bVar2.f15395e;
                    fVar.setAlpha(f13);
                    ih.f fVar2 = this.K3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    fVar2.setVisibility(i15);
                }
                if (bVar2.f15395e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kh.f fVar3 = this.X;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar3.setVisibility(i11);
                l7();
                if (bVar2.f15395e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                uj ujVar = this.f35500x0;
                if (z11) {
                    i13 = 0;
                }
                ujVar.setVisibility(i13);
                s7();
                v7();
                u7();
                q9(1);
            } else if (i10 == 5) {
                k7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                p7();
            }
        }
    }

    public final boolean E6() {
        if (this.h == null) {
            rk rkVar = this.O0;
            if (rkVar == null || rkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E7() {
        if (getParentActivity() != null && getParentActivity() != null && this.J1 == null) {
            bi.t3 t3Var = new bi.t3(this, getParentActivity(), this, this.f35274ea, 2);
            this.J1 = t3Var;
            t3Var.Z = a();
            bi.t3 t3Var2 = this.J1;
            t3Var2.f31315i0 = true;
            t3Var2.Z1 = new pl(this);
        }
    }

    public final int E8(MessageObject messageObject) {
        String str;
        String str2;
        if (messageObject == null) {
            return -1;
        }
        boolean z10 = false;
        boolean z11 = true;
        if (this.h == null) {
            if (messageObject.isEditing()) {
                return -1;
            }
            if (messageObject.getId() <= 0 && messageObject.isOut()) {
                if (!messageObject.isSendError()) {
                    return -1;
                }
                if (messageObject.isMediaEmpty()) {
                    return 20;
                }
                return 0;
            } else if (messageObject.isAnimatedEmoji()) {
                return 2;
            } else {
                int i10 = messageObject.type;
                if (i10 == 6) {
                    return -1;
                }
                if (i10 != 10 && i10 != 31 && i10 != 11 && i10 != 21 && i10 != 30 && !messageObject.isWallpaperAction()) {
                    if (messageObject.isVoice()) {
                        return 2;
                    }
                    if (!messageObject.isSticker() && !messageObject.isAnimatedSticker()) {
                        if (!messageObject.isRoundVideo() && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                            if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath) && new File(messageObject.messageOwner.attachPath).exists()) {
                                z10 = true;
                            }
                            if (z10 || !messageObject.mediaExists()) {
                                z11 = z10;
                            }
                            if (z11) {
                                if (messageObject.getDocument() != null && !messageObject.isMusic() && (str2 = messageObject.getDocument().mime_type) != null) {
                                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                                        return 10;
                                    }
                                    if (str2.endsWith("/xml")) {
                                        return 5;
                                    }
                                    if ((!messageObject.isNewGif() && str2.endsWith("/mp4")) || str2.endsWith("/png") || str2.endsWith("/jpg") || str2.endsWith("/jpeg")) {
                                        return 6;
                                    }
                                }
                                return 4;
                            }
                        } else if (messageObject.type == 12) {
                            return 8;
                        } else {
                            if (messageObject.isMediaEmpty()) {
                                return 3;
                            }
                        }
                        return 2;
                    }
                    TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                    if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f19916id)) {
                            return 7;
                        }
                        return 9;
                    } else if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && !getMediaDataController().isStickerPackInstalled(inputStickerSet.short_name)) {
                        return 7;
                    } else {
                        return 9;
                    }
                } else if (messageObject.getId() == 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else if (messageObject.isSending()) {
            return -1;
        } else {
            if (messageObject.isAnimatedEmoji()) {
                return 2;
            }
            if (messageObject.type == 6) {
                return -1;
            }
            if (messageObject.isSendError()) {
                if (messageObject.isMediaEmpty()) {
                    return 20;
                }
                return 0;
            }
            int i11 = messageObject.type;
            if (i11 != 10 && i11 != 11) {
                if (messageObject.isVoice()) {
                    return 2;
                }
                if (!messageObject.isAnimatedEmoji() && (messageObject.isSticker() || messageObject.isAnimatedSticker())) {
                    TLRPC.InputStickerSet inputStickerSet2 = messageObject.getInputStickerSet();
                    if ((inputStickerSet2 instanceof TLRPC.TL_inputStickerSetShortName) && !getMediaDataController().isStickerPackInstalled(inputStickerSet2.short_name)) {
                        return 7;
                    }
                } else if (!messageObject.isRoundVideo() && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                    if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath) && new File(messageObject.messageOwner.attachPath).exists()) {
                        z10 = true;
                    }
                    if (z10 || !FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).exists()) {
                        z11 = z10;
                    }
                    if (z11) {
                        if (messageObject.getDocument() != null && (str = messageObject.getDocument().mime_type) != null && str.endsWith("text/xml")) {
                            return 5;
                        }
                        if (messageObject.messageOwner.ttl <= 0) {
                            return 4;
                        }
                    }
                } else if (messageObject.type == 12) {
                    return 8;
                } else {
                    if (messageObject.isMediaEmpty()) {
                        return 3;
                    }
                }
                return 2;
            } else if (messageObject.getId() == 0 || messageObject.isSending()) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public final boolean E9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Ea() {
        int i10;
        this.H4.clear();
        this.J4.clear();
        this.L4 = 0;
        this.P4 = 0;
        this.Q4 = 0;
        yc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.Z7;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.R4 = true;
        zc();
    }

    public final void Eb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        yb(z10, null, null, null, webPage, null, z11, true);
    }

    public final void Ec(boolean z10) {
        mk mkVar = this.Y;
        if (mkVar != null) {
            mkVar.O1(z10);
        }
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        Xa(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final boolean F6(MessageObject messageObject) {
        if (this.R3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.f35264e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f35264e.f19896id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.R3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f35264e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void F7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        ug ugVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.W5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f35276f;
        TLRPC.Chat chat = this.f35264e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.Z7;
        long j3 = this.L6;
        int d = (int) d();
        int i10 = this.R3;
        ug ugVar2 = new ug(this, 6);
        if (z10) {
            ugVar = new ug(this, 7);
        } else {
            ugVar = null;
        }
        ug ugVar3 = ugVar;
        org.telegram.ui.Components.e5.z(this, user, chat, encryptedChat, chatFull, j3, messageObject, this.W5, groupedMessages, d, i10, null, ugVar2, ugVar3, this.f35274ea);
    }

    public final int F8() {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        int i10 = 0;
        if (d5Var == null || d5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(i10);
                if (n2Var != this && (n2Var instanceof co) && ((co) n2Var).T5 == this.T5) {
                    break;
                }
                i10++;
            } else {
                i10 = indexOf;
                break;
            }
        }
        return i10 - indexOf;
    }

    public final boolean F9() {
        if (this.X3 != null) {
            return true;
        }
        return false;
    }

    public final void Fa(MessageObject messageObject) {
        if (messageObject == this.Mb) {
            this.Mb = null;
            Qc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.T5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Fb(boolean z10) {
        if (this.X2 != null && !z9()) {
            if (this.X2.getTag() == null) {
                AnimatorSet animatorSet = this.f35292g3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.X2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f35292g3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f35292g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 1.0f));
                this.f35292g3.addListener(new xi(this, 5));
                this.f35292g3.start();
            }
            if (!z10) {
                r9();
                this.f35214a3 = 1000;
            }
        }
    }

    public final void Fc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        kh.h hVar = this.f35326j1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.Pa) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f2248c = z10;
            aa.a aVar = hVar.f14993e[6];
            if (aVar != null) {
                ((jh.b) aVar.f383b).b(z10, true);
            }
            kh.h hVar2 = this.f35326j1;
            if (this.Pa) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f2248c = z11;
            aa.a aVar2 = hVar2.f14993e[5];
            if (aVar2 != null) {
                ((jh.b) aVar2.f383b).b(z11, true);
            }
        }
        this.f35490w3 = i12;
        this.f35503x3 = i11;
        Gc();
        org.telegram.ui.Components.q6 q6Var = this.V2;
        if (q6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            q6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.V2.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    @Override
    public final boolean G() {
        return this.f35320i8;
    }

    public final void G6(boolean z10) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z11;
        final boolean z12;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z13 = true;
        int i12 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f35264e != null && (this.R3 != 0 || this.f35255d4 != 0 || (chatFull = this.Z7) == null || chatFull.ttl_period == 0)) || ((user = this.f35276f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f35219a8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.t0 t0Var = this.f35239c0;
            if (t0Var != null) {
                t0Var.e(8);
            }
            pj pjVar = this.f35213a1;
            if (pjVar != null) {
                pjVar.f25065a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.t0 t0Var2 = this.f35239c0;
            if (t0Var2 != null) {
                t0Var2.e(0);
            }
            pj pjVar2 = this.f35213a1;
            if (pjVar2 != null) {
                pjVar2.f25065a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var3 = this.f35436s0;
        if (t0Var3 != null) {
            TLRPC.Chat chat = this.f35264e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            t0Var3.e(i11);
        }
        pj pjVar3 = this.f35213a1;
        if (pjVar3 != null) {
            TLRPC.Chat chat2 = this.f35264e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f35276f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            pjVar3.setCommunityItemVisible(z11);
            final pj pjVar4 = this.f35213a1;
            TLRPC.Chat chat3 = this.f35264e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = pjVar4.E;
            ImageView imageView2 = pjVar4.f25095y;
            if (imageView2 != null && imageView != null) {
                pjVar4.f25081l0 = z12;
                float f17 = 1.1f;
                float f18 = 1.0f;
                if (!z10) {
                    int i13 = 4;
                    if (z12) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView2.setVisibility(i10);
                    if (z12) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView2.setAlpha(f13);
                    if (z12) {
                        f14 = 1.1f;
                    } else {
                        f14 = 0.0f;
                    }
                    imageView2.setScaleX(f14);
                    if (!z12) {
                        f17 = 0.0f;
                    }
                    imageView2.setScaleY(f17);
                    if (z12) {
                        i13 = 0;
                    }
                    imageView.setVisibility(i13);
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    imageView.setAlpha(f15);
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    imageView.setScaleX(f16);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    imageView.setScaleY(f18);
                } else {
                    if (z12) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z12) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z12) {
                        f10 = 1.1f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z12) {
                        f17 = 0.0f;
                    }
                    scaleX.scaleY(f17).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    co coVar = pjVar4;
                                    if (!z14) {
                                        coVar.f25095y.setVisibility(4);
                                        return;
                                    } else {
                                        coVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    co coVar2 = pjVar4;
                                    if (!z15) {
                                        coVar2.E.setVisibility(4);
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
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f11);
                    if (z12) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    scaleX2.scaleY(f18).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    co coVar = pjVar4;
                                    if (!z14) {
                                        coVar.f25095y.setVisibility(4);
                                        return;
                                    } else {
                                        coVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    co coVar2 = pjVar4;
                                    if (!z15) {
                                        coVar2.E.setVisibility(4);
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
                this.f35213a1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f35219a8;
                if (userFull2 != null) {
                    this.f35213a1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.Z7;
                    if (chatFull3 != null) {
                        this.f35213a1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f35422r0 != null && (chatFull2 = this.Z7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f35264e)) {
                TLRPC.Chat chat4 = this.f35264e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = this.f35422r0;
            if (z13) {
                i12 = 0;
            }
            t0Var4.e(i12);
        }
        o();
    }

    public final void G7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.G7(boolean):void");
    }

    public final int G8() {
        return Math.max(this.P4, this.Q4);
    }

    public final void G9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        ArrayList arrayList = this.f35467u6;
        if (!arrayList.isEmpty()) {
            MessageObject messageObject = (MessageObject) i2.g.h(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.C6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() == this.L6) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        F(id2, 0, i13, 0, false, true);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.T5)) {
                int N0 = this.f35525z0.N0();
                int L0 = this.f35525z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        om omVar = this.A0;
                        int i14 = omVar.J;
                        if (L0 >= i14 && L0 < omVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
                            if (message.date < i10) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (v()) {
                                i12 ^= 1;
                            }
                            i11 = i12 ^ 1;
                        } else {
                            L0++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                this.W8.d(i11);
                org.telegram.ui.ActionBar.b2 b2Var = this.f35407pb;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                xc(false);
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f35274ea);
                this.f35407pb = b2Var2;
                b2Var2.setOnCancelListener(this.f35370ma);
                this.f35407pb.q(1000L);
                int i15 = this.V5;
                this.Y8 = i15;
                this.f35220a9 = false;
                this.f35306h6.add(Integer.valueOf(i15));
                this.Z8 = 0;
                this.f35234b9 = false;
                MessagesController messagesController = getMessagesController();
                long j3 = this.T5;
                long j10 = this.L6;
                int i16 = this.classGuid;
                int i17 = this.R3;
                long j11 = this.f35255d4;
                int i18 = this.f35364m4;
                int i19 = this.V5;
                this.V5 = i19 + 1;
                messagesController.loadMessages(j3, j10, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j11, i18, i19, this.f35304h4);
                this.X2.setAlpha(0.0f);
                this.X2.setTag(null);
                this.f35315i3 = 0.0f;
                lc();
                this.Y2.setTag(null);
            }
        }
    }

    public final void Ga(MessageObject messageObject) {
        ArrayList arrayList = this.f35467u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            om omVar = this.A0;
            if (omVar != null && !omVar.N) {
                omVar.u(omVar.J + indexOf);
            }
        }
    }

    public final void Gb(boolean z10) {
        if (this.Y2 != null && !z9()) {
            if (this.Y2.getTag() == null) {
                ValueAnimator valueAnimator = this.f35303h3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.Y2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35315i3, 1.0f);
                this.f35303h3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f35303h3.addUpdateListener(new oe(this, 2));
                this.f35303h3.addListener(new xi(this, 7));
                this.f35303h3.start();
            }
            if (!z10) {
                r9();
                this.f35214a3 = 1000;
            }
        }
    }

    public final void Gc() {
        org.telegram.ui.Components.q6 q6Var = this.U2;
        if (q6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f35490w3;
            if (i10 < 0) {
                q6Var.c("", z10, true);
            } else if (i10 == 0) {
                q6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f35425r3) {
                q6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.R3 != 7 && !this.f35524yc.f15396f) {
                q6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f35503x3 + 1), Integer.valueOf(this.f35490w3)), z10, true);
            } else {
                q6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void H6() {
        if (this.Oa) {
            return;
        }
        if (A9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int H8() {
        if (this.R3 == 5) {
            return (int) this.f35255d4;
        }
        return 0;
    }

    public final void H9() {
        this.D4 = true;
        if (this.f35366m6) {
            getMessagesStorage().getUnreadMention(this.T5, d(), new ch(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.T5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f35304h4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f35255d4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f35354l6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new bi.m1(28, this, messagesStorage));
    }

    public final void Ha(MessageObject messageObject) {
        ArrayList arrayList = this.f35467u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            om omVar = this.A0;
            if (omVar != null && !omVar.N) {
                omVar.P(omVar.J + indexOf, true);
            }
        }
    }

    public final boolean Hb() {
        mk mkVar = this.Y;
        if (mkVar != null && mkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f35267e2 == null) {
                    if (!this.f35230b5) {
                        mk mkVar2 = this.Y;
                        if (mkVar2 != null) {
                            mkVar2.U();
                            MediaDataController.getInstance(mkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.eg egVar = mkVar2.U0;
                            egVar.N(false, false);
                            egVar.S(false, false);
                            egVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        um umVar = this.X0;
                        int indexOfChild = umVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            mk mkVar3 = this.Y;
                            mkVar3.U();
                            MediaDataController.getInstance(mkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.eg egVar2 = mkVar3.U0;
                            egVar2.N(false, false);
                            egVar2.S(false, false);
                            egVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f35489w2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            umVar.addView(this.f35489w2, i10, w7.x5.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(9, getParentActivity(), this.f35274ea, false);
                            this.f35267e2 = i40Var;
                            i40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            umVar.addView(this.f35267e2, i10, w7.x5.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.i40 i40Var2 = this.f35267e2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f35489w2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new xi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f35267e2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Hc() {
        M7();
        String str = this.f35464u3;
        if (str != null) {
            this.f35253d2.f32782e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.L3.setEmptyView(this.f35253d2);
            return;
        }
        this.L3.setEmptyView(null);
        this.f35253d2.setVisibility(8);
    }

    @Override
    public final long I() {
        return this.L6;
    }

    public final void I6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.I6():void");
    }

    public final boolean I7(android.view.View r92, boolean r93, boolean r94, float r95, float r96, boolean r97, boolean r98, boolean r99) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.I7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final long I8() {
        if (this.R3 == 3) {
            return this.f35255d4;
        }
        return 0L;
    }

    public final void I9(boolean z10) {
        TLRPC.Chat chat;
        if (this.ha == null && (chat = this.f35264e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.f35264e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.T5);
            this.ha = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.Q1(false, z10);
            }
        }
    }

    public final void Ia() {
        if (this.P7 == null && this.Q7 == null && this.R7 == null) {
            me meVar = this.U7;
            if (meVar != null) {
                AndroidUtilities.cancelRunOnUIThread(meVar);
                this.U7 = null;
            }
            this.L7 = Integer.MAX_VALUE;
            this.N7 = false;
            this.O7 = 0L;
            this.P7 = null;
            this.Q7 = null;
            this.R7 = null;
        }
    }

    public final void Ib() {
        TLRPC.ChatFull chatFull = this.Z7;
        if (chatFull != null && !this.f35414q5) {
            TLRPC.Chat chat = this.f35264e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new me(this, 14), 1000L);
            }
        }
    }

    public final void Ic() {
        boolean z10;
        if (this.f35326j1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f35439s3 && !this.f35425r3) || (this.R3 == 7 && this.O3 == 2 && !this.f35467u6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35326j1.e(6, z10, true);
        this.f35326j1.e(5, z10, true);
        if (z10) {
            this.f35326j1.e(1, false, true);
        }
        if (!z10) {
            this.B7 = 0;
        }
        this.X0.invalidate();
    }

    public final void J6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.wc.f15395e) * (1.0f - this.f35473uc.f15395e) * ((float[]) this.Bc.f13577b)[i10];
            view.setAlpha(f7);
            if (z10) {
                if (f7 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (view.getVisibility() != i11) {
                    view.setVisibility(i11);
                }
            }
        }
    }

    public final int J8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f35500x0.getMeasuredHeight() - this.Aa) - this.f35445s9) - this.v.d()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void J9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Ja(boolean z10) {
        MessageObject messageObject = this.J7;
        if (messageObject != null) {
            if (z10) {
                boolean[] zArr = this.E6;
                zArr[1] = true;
                zArr[0] = true;
                this.H7 = 0;
                this.K6 = 0;
            }
            this.D7 = 0;
            this.E7 = false;
            Ga(messageObject);
            this.J7 = null;
        }
    }

    public final void Jb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.yc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f29706j = max;
        G.v = new ef(this, i10, 3);
        G.k(true);
        this.G3 = messageObject;
        this.H3 = i10;
    }

    public final void Jc(String str) {
        if (this.R3 == 7 && !TextUtils.equals(this.f35464u3, str)) {
            M7();
            Lb(true);
            this.f35464u3 = str;
            this.f35452t3 = str;
            R6(false);
            x7(true);
            this.N6 = 0L;
            this.f35344k7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.O3);
            this.M3.l();
            this.L3.requestLayout();
            if (this.L3.getLayoutManager() != null) {
                this.L3.getLayoutManager().n0(0);
            }
            Hc();
            this.f35253d2.e(true, true);
            r8();
        }
    }

    @Override
    public final boolean K(uy uyVar) {
        return false;
    }

    public final boolean K6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.Z7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            sg.k0.C1(this, this.D1, this.E1, this.T5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void K7() {
        if (this.h == null && this.f35502x2 == null && getParentActivity() != null) {
            kl klVar = new kl(this, getParentActivity());
            this.f35502x2 = klVar;
            klVar.setTag(1);
            this.M0.addView(this.f35502x2, w7.x5.n(-1, 48));
            this.M0.h(1, this.f35502x2);
            this.M0.g(this.f35502x2);
            this.f35502x2.setOnClickListener(new we(this, 17));
            this.f35502x2.setEnabled(!isInPreviewMode());
            this.f35502x2.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            org.telegram.ui.Components.vf0 vf0Var = new org.telegram.ui.Components.vf0(getParentActivity(), this.f35274ea);
            this.f35527z2 = vf0Var;
            this.f35502x2.addView(vf0Var, w7.x5.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f35502x2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.F2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.F2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.fe));
            this.F2.setTypeface(AndroidUtilities.bold());
            this.f35502x2.addView(this.F2, w7.x5.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            int i11 = 0;
            while (i11 < 2) {
                bo boVar = new bo(this, getParentActivity());
                bo[] boVarArr = this.C2;
                boVarArr[i11] = boVar;
                boVar.setTextSize(i10);
                boVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.fe));
                boVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f35502x2.addView(boVarArr[i11], w7.x5.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                ll llVar = new ll(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.D2;
                j5VarArr[i11] = llVar;
                llVar.setTextSize(i10);
                j5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20751ge));
                this.f35502x2.addView(j5VarArr[i11], w7.x5.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                bi.c4 c4Var = new bi.c4(getParentActivity(), 13);
                c4Var.setSingleLine(true);
                c4Var.setLines(1);
                c4Var.setMaxLines(1);
                c4Var.setEllipsize(TextUtils.TruncateAt.END);
                c4Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
                c4Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                c4Var.setTextSize(1, 14.0f);
                c4Var.setTypeface(AndroidUtilities.bold());
                c4Var.setGravity(17);
                c4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                bi.c4[] c4VarArr = this.E2;
                c4VarArr[i11] = c4Var;
                this.f35502x2.addView(c4Var, w7.x5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                ml mlVar = new ml(getParentActivity());
                mlVar.I = new wh.h();
                mlVar.H = new Path();
                mlVar.J = new float[8];
                org.telegram.ui.Components.x9[] x9VarArr = this.B2;
                x9VarArr[i11] = mlVar;
                mlVar.setBlurAllowed(true);
                x9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f35502x2.addView(x9VarArr[i11], w7.x5.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i11 == 1) {
                    boVarArr[i11].setVisibility(4);
                    c4VarArr[i11].setVisibility(4);
                    j5VarArr[i11].setVisibility(4);
                    x9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.L2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.L2;
            int i12 = org.telegram.ui.ActionBar.j6.f20698de;
            int themedColor = getThemedColor(i12);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            ImageView imageView3 = this.L2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.L2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.L2.setVisibility(4);
            this.L2.setAlpha(0.0f);
            this.L2.setScaleX(0.4f);
            this.L2.setScaleY(0.4f);
            ImageView imageView4 = this.L2;
            int i13 = org.telegram.ui.ActionBar.j6.f21053x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13) & 436207615, 1, -1));
            this.f35502x2.addView(this.L2, w7.x5.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.L2.setOnClickListener(new we(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.J2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.J2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.J2.setScaleType(scaleType);
            this.J2.setVisibility(8);
            this.J2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f35274ea);
            this.K2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.K2.setSize(AndroidUtilities.dp(16.0f));
            this.K2.setStrokeWidth(2.0f);
            this.K2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20716ee));
            this.f35502x2.addView(this.K2, w7.x5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.J2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f35502x2.addView(this.J2, w7.x5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.J2.setOnClickListener(new we(this, 19));
            xc(false);
        }
    }

    public final int K8(MessageObject messageObject) {
        return J8(A8(messageObject, !TextUtils.isEmpty(this.P7))) - Ua(messageObject);
    }

    public final zi K9(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle) {
        of.e eVar = this.Ab;
        if (eVar != null) {
            eVar.a(true);
            this.Ab = null;
        }
        if (characterStyle != null && t1Var != null && t1Var.getMessageObject() != null) {
            zi ziVar = new zi(this, t1Var.getMessageObject().getId(), characterStyle, t1Var, 0);
            this.Ab = ziVar;
            return ziVar;
        }
        this.Ab = null;
        return null;
    }

    public final void Ka(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        a0.i iVar;
        ArrayList arrayList2;
        om omVar;
        int i11;
        int i12;
        ArrayList arrayList3;
        HashMap hashMap;
        int i13;
        int i14;
        int i15;
        boolean z12;
        MessageObject.GroupedMessages groupedMessages;
        int indexOf;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        TL_stories.StoryItem storyItem;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.WebPage webPage;
        TL_stories.StoryItem storyItem2;
        RichMessageLayout richMessageLayout;
        TLRPC.Message message;
        ArrayList arrayList5 = arrayList;
        int i16 = 0;
        a0.i iVar2 = null;
        while (true) {
            int size = arrayList5.size();
            iVar = this.f35506x6;
            arrayList2 = this.f35467u6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.J4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f35391o6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f35276f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f35276f.f20043id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Ta();
                this.Qb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Pb.bind(messageObject2.messageOwner.f19917id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f19917id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.J4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.L4) {
                    yc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f35402p6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.R3 == 1))) {
                if (z10) {
                    arrayList5.remove(i16);
                    i16--;
                }
                u6(messageObject, messageObject2);
                if (messageObject2.richCheckboxEcho && messageObject.type == 36 && (richMessageLayout = messageObject2.richLayout) != null && (message = messageObject.messageOwner) != null) {
                    messageObject.richLayout = richMessageLayout;
                    message.rich_message = messageObject2.messageOwner.rich_message;
                    messageObject2.richCheckboxEcho = false;
                }
                if (messageObject.type >= 0) {
                    MessageObject messageObject3 = messageObject2.replyMessageObject;
                    if (messageObject3 != null) {
                        messageObject.replyMessageObject = messageObject3;
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                            storyItem = null;
                            messageObject.generateGameMessageText(null);
                        } else {
                            storyItem = null;
                            if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                messageObject.generatePaymentSentMessageText(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                messageObject.generatePaymentSentMessageText(null, true);
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                messageObject.generateSuggestionApprovalMessageText();
                            }
                        }
                    } else {
                        storyItem = null;
                    }
                    if (messageObject2.isWebpage() && messageObject.isWebpage() && (webPage = (tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) MessageObject.getMedia(messageObject2.messageOwner)).webpage) != null && "telegram_story".equals(webPage.type)) {
                        int i17 = 0;
                        while (true) {
                            if (i17 < tL_messageMediaWebPage.webpage.attributes.size()) {
                                TLRPC.WebPageAttribute webPageAttribute = tL_messageMediaWebPage.webpage.attributes.get(i17);
                                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                                    storyItem2 = ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem;
                                    break;
                                }
                                i17++;
                            } else {
                                storyItem2 = storyItem;
                                break;
                            }
                        }
                        if (storyItem2 != null) {
                            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = (TLRPC.TL_messageMediaWebPage) MessageObject.getMedia(messageObject.messageOwner);
                            int i18 = 0;
                            while (true) {
                                if (i18 >= tL_messageMediaWebPage2.webpage.attributes.size()) {
                                    break;
                                }
                                TLRPC.WebPageAttribute webPageAttribute2 = tL_messageMediaWebPage2.webpage.attributes.get(i18);
                                if (webPageAttribute2 instanceof TLRPC.TL_webPageAttributeStory) {
                                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute2;
                                    if (!(tL_webPageAttributeStory.storyItem instanceof TL_stories.TL_storyItem)) {
                                        tL_webPageAttributeStory.storyItem = storyItem2;
                                    }
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                    if (!messageObject2.isEditing()) {
                        if (messageObject2.getFileName().equals(messageObject.getFileName())) {
                            messageObject.messageOwner.attachPath = messageObject2.messageOwner.attachPath;
                            messageObject.attachPathExists = messageObject2.attachPathExists;
                            messageObject.mediaExists = messageObject2.mediaExists;
                        } else {
                            messageObject.checkMediaExistance();
                        }
                    }
                    sparseArrayArr[i10].put(messageObject2.getId(), messageObject);
                } else {
                    sparseArrayArr[i10].remove(messageObject2.getId());
                }
                int indexOf2 = arrayList2.indexOf(messageObject2);
                if (indexOf2 >= 0) {
                    String str = messageObject2.dateKey;
                    HashMap hashMap2 = this.f35428r6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i12 = arrayList6.indexOf(messageObject2);
                    } else {
                        i12 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        i11 = i16;
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            iVar.k(groupedMessages, messageObject.getGroupId());
                        }
                        if (messageObject.isMusic() || messageObject.isDocument() || ((arrayList4 = messageObject.photoThumbs) != null && !arrayList4.isEmpty())) {
                            arrayList3 = arrayList6;
                            hashMap = hashMap2;
                            i13 = i12;
                            groupedMessages.messages.set(indexOf, messageObject);
                            MessageObject.GroupedMessagePosition remove = groupedMessages.positions.remove(messageObject2);
                            groupedMessages.positionsArray.l(messageObject2.getId());
                            if (remove != null) {
                                groupedMessages.positions.put(messageObject, remove);
                                groupedMessages.positionsArray.k(remove, messageObject.getId());
                            }
                            if (iVar2 == null) {
                                iVar2 = new a0.i();
                            }
                            iVar2.k(groupedMessages, groupedMessages.groupId);
                        } else {
                            if (iVar2 == null) {
                                iVar2 = new a0.i();
                            }
                            iVar2.k(groupedMessages, groupedMessages.groupId);
                            if (indexOf > 0 && indexOf < groupedMessages.messages.size() - 1) {
                                MessageObject.GroupedMessages groupedMessages2 = new MessageObject.GroupedMessages();
                                groupedMessages2.reversed = this.Pa;
                                arrayList3 = arrayList6;
                                groupedMessages2.groupId = Utilities.random.nextLong();
                                ArrayList<MessageObject> arrayList7 = groupedMessages2.messages;
                                ArrayList<MessageObject> arrayList8 = groupedMessages.messages;
                                int i19 = indexOf + 1;
                                arrayList7.addAll(arrayList8.subList(i19, arrayList8.size()));
                                int i20 = 0;
                                while (i20 < groupedMessages2.messages.size()) {
                                    groupedMessages2.messages.get(i20).localGroupId = groupedMessages2.groupId;
                                    groupedMessages.messages.remove(i19);
                                    i20++;
                                    hashMap2 = hashMap2;
                                    i12 = i12;
                                }
                                hashMap = hashMap2;
                                i13 = i12;
                                iVar2.k(groupedMessages2, groupedMessages2.groupId);
                                iVar.k(groupedMessages2, groupedMessages2.groupId);
                            } else {
                                arrayList3 = arrayList6;
                                hashMap = hashMap2;
                                i13 = i12;
                            }
                            groupedMessages.messages.remove(indexOf);
                        }
                    } else {
                        i11 = i16;
                        arrayList3 = arrayList6;
                        hashMap = hashMap2;
                        i13 = i12;
                    }
                    if (this.R3 == 3) {
                        messageObject.isSaved = true;
                    }
                    if (messageObject.type >= 0) {
                        boolean z13 = messageObject.reactionsChanged;
                        if (messageObject2.isBotPendingDraft && !messageObject.isBotPendingDraft) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        messageObject.reactionsChanged = z13 | z12;
                        messageObject.copyStableParams(messageObject2);
                        arrayList2.set(indexOf2, messageObject);
                        om omVar2 = this.A0;
                        if (omVar2 != null && !omVar2.N) {
                            omVar2.Q(omVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        om omVar3 = this.A0;
                        if (omVar3 != null && !omVar3.N) {
                            omVar3.u(omVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.i iVar3 = this.f35455t6;
                        if (((MessageObject) iVar3.f(id4)) != null) {
                            iVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            om omVar4 = this.A0;
                            int i22 = omVar4.E;
                            int i23 = omVar4.F;
                            int i24 = omVar4.H;
                            int i25 = omVar4.G;
                            if (!omVar4.N) {
                                omVar4.u(omVar4.J + indexOf2);
                                if (arrayList2.isEmpty()) {
                                    if (i22 >= 0) {
                                        i15 = 0;
                                        this.A0.u(0);
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i23 >= 0) {
                                        this.A0.u(i15);
                                    }
                                    if (i24 >= 0) {
                                        this.A0.u(i15);
                                    }
                                    if (i25 >= 0) {
                                        this.A0.u(i15);
                                    }
                                }
                            }
                        }
                        if (i21 >= 0) {
                            arrayList9.remove(i21);
                            if (arrayList9.isEmpty()) {
                                hashMap.remove(messageObject2.dateKey);
                                this.f35442s6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                om omVar5 = this.A0;
                                int i26 = omVar5.E;
                                int i27 = omVar5.F;
                                int i28 = omVar5.H;
                                int i29 = omVar5.G;
                                if (!omVar5.N) {
                                    omVar5.u(omVar5.J + indexOf2);
                                    if (arrayList2.isEmpty()) {
                                        if (i26 >= 0) {
                                            i14 = 0;
                                            this.A0.u(0);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i27 >= 0) {
                                            this.A0.u(i14);
                                        }
                                        if (i28 >= 0) {
                                            this.A0.u(i14);
                                        }
                                        if (i29 >= 0) {
                                            this.A0.u(i14);
                                        }
                                        Dc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Dc(messageObject, messageObject2.getId());
                i16 = i11;
            }
            i16++;
            arrayList5 = arrayList;
        }
        if (iVar2 != null) {
            for (int i30 = 0; i30 < iVar2.m(); i30++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) iVar2.n(i30);
                if (groupedMessages3.messages.isEmpty()) {
                    iVar.l(groupedMessages3.groupId);
                } else {
                    groupedMessages3.calculate();
                    int indexOf3 = arrayList2.indexOf((MessageObject) i2.g.h(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (omVar = this.A0) != null) {
                        omVar.q(indexOf3 + omVar.J, groupedMessages3.messages.size());
                        wj wjVar = this.f35513y0;
                        if (wjVar != null) {
                            wjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        zc();
    }

    public final void Kb(boolean z10) {
        boolean z11;
        kh.h hVar = this.f35326j1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.f35264e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.B7 = 0;
            }
        }
    }

    public final void Kc() {
        mk mkVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.R3 == 3 && I8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.I1.setVisibility(8);
                this.I1.setTag(null);
                sc();
                org.telegram.ui.Components.my0 my0Var = this.f35252d1;
                if (my0Var != null) {
                    my0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f35264e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f35264e)) {
                    TLRPC.Chat chat2 = this.f35264e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f35264e.megagroup)) {
                        TLRPC.Chat chat3 = this.f35264e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.j6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                oqVar.f29189e = dp;
                                oqVar.f29190f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                oqVar.h = dp3;
                                oqVar.f29191n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(oqVar, 1), 0, 1, 33);
                                this.E0.setBackground(org.telegram.ui.ActionBar.j6.g0(0, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20780i6, false)));
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new we(this, 0));
                            } else {
                                this.E0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.E0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.E0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f35264e.banned_rights.until_date)));
                        }
                        this.R.setVisibility(0);
                        this.I1.setVisibility(8);
                        this.I1.setTag(null);
                        sc();
                        org.telegram.ui.Components.my0 my0Var2 = this.f35252d1;
                        if (my0Var2 != null) {
                            my0Var2.f();
                        }
                    }
                }
                G7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.Y0 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a4.a.s(new StringBuilder("<b>"), this.f35276f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.T5, this.f35255d4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.R.setVisibility(4);
                            if (!this.inPreviewMode && !this.Oa && this.R3 != 3) {
                                this.Y.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    W6();
                    G6(false);
                } else {
                    this.R.setVisibility(4);
                    if (this.f35252d1 != null && (mkVar = this.Y) != null && mkVar.k0()) {
                        this.f35252d1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.R.setVisibility(4);
            }
            if (z10) {
                this.Y.m0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    public final void L6(boolean z10) {
        if (this.N6 == 0) {
            if (z10 && !this.O6.isEmpty()) {
                this.N6 = System.currentTimeMillis();
            } else {
                this.N6 = 1L;
            }
            D9();
            uj ujVar = this.f35500x0;
            if (ujVar != null) {
                ujVar.invalidate();
            }
        }
    }

    public final void L7() {
        int i10;
        int i11;
        if (this.R2 == null && getParentActivity() != null) {
            qk qkVar = new qk(this, getParentActivity(), 1);
            this.R2 = qkVar;
            qkVar.setClickable(false);
            this.R2.setWillNotDraw(false);
            this.Bc.j(4, false, false);
            this.R2.setClipToPadding(false);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), true, true, true);
            this.U2 = q6Var;
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            q6Var.b(0.25f, 280L, prVar);
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f21077ye));
            this.U2.setGravity(3);
            this.R2.addView(this.U2, w7.x5.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.U.addView(this.R2, w7.x5.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(getParentActivity(), true, false, true);
            this.V2 = q6Var2;
            q6Var2.b(0.0f, 420L, prVar);
            this.V2.setScaleProperty(0.7f);
            this.V2.setTextSize(AndroidUtilities.dp(15.0f));
            this.V2.setGravity(5);
            this.V2.setTypeface(AndroidUtilities.bold());
            this.V2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20889o6));
            org.telegram.ui.Components.q6 q6Var3 = this.V2;
            if (this.f35524yc.f15396f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            q6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.q6 q6Var4 = this.V2;
            q6Var4.f29627n = false;
            q6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.V2.setOnClickListener(new we(this, 2));
            this.V2.setAlpha(0.5f);
            this.V2.setClickable(false);
            this.R2.addView(this.V2, w7.x5.e(-2, -1, 117));
            org.telegram.ui.Components.q6 q6Var5 = new org.telegram.ui.Components.q6(getParentActivity(), true, true, true);
            this.W2 = q6Var5;
            q6Var5.setGravity(17);
            this.W2.setTypeface(AndroidUtilities.bold());
            this.W2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
            this.W2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.q6 q6Var6 = this.W2;
            int i12 = org.telegram.ui.ActionBar.j6.f20690d6;
            q6Var6.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i12), org.telegram.ui.ActionBar.j6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.j6.f20780i6))));
            org.telegram.ui.Components.q6 q6Var7 = this.W2;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            q6Var7.setText(LocaleController.getString(i11));
            this.W2.setOnClickListener(new we(this, 3));
            this.W2.setVisibility(8);
            this.W2.setAlpha(0.0f);
            this.R2.addView(this.W2, w7.x5.e(-1, -1, 119));
            TLRPC.Chat chat = this.f35264e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f35264e.megagroup) && this.R3 != 7 && !ChatObject.isMonoForum(this.f35264e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.T2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.T2.setImageResource(R.drawable.msg_usersearch);
                this.T2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f21059xe), PorterDuff.Mode.MULTIPLY));
                this.T2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f21090z8), 1, -1));
                this.R2.addView(this.T2, w7.x5.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.T2.setOnClickListener(new we(this, 4));
                this.T2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.R3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.S2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.S2.setImageResource(R.drawable.msg_calendar);
                this.S2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f21059xe), PorterDuff.Mode.MULTIPLY));
                this.S2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f21090z8), 1, -1));
                this.R2.addView(this.S2, w7.x5.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.S2.setOnClickListener(new we(this, 5));
                this.S2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int L8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f35500x0.getMeasuredHeight() - view.getBottom()) - this.f35500x0.getPaddingBottom()) + "} chatHeight=" + this.f35500x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f35500x0.getPaddingBottom());
        return (this.f35500x0.getMeasuredHeight() - view.getBottom()) - this.f35500x0.getPaddingBottom();
    }

    public final void L9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.T5, messageObject);
        }
    }

    public final void La() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f35468u7 = 0;
        this.f35344k7 = false;
        this.f35355l7 = true;
        this.f35306h6.clear();
    }

    public final void Lb(boolean z10) {
        int i10;
        if (this.K3 != null) {
            le.b bVar = this.f35524yc;
            if (bVar.f15396f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.R3 == 7) {
                    s4.c0 c0Var = (s4.c0) this.L3.getLayoutManager();
                    Object E = this.M3.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.M3.E(c0Var.L0());
                    Object E3 = this.M3.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f35525z0.L0();
                        int N0 = this.f35525z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f19917id;
                        int i12 = ((MessageObject) E2).messageOwner.f19917id;
                        int i13 = ((MessageObject) E3).messageOwner.f19917id;
                        boolean z11 = false;
                        boolean z12 = false;
                        int i14 = -1;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f19917id == i12) {
                                int i16 = this.A0.J + i15;
                                if (L0 <= i16 && N0 >= i16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f19917id == i13) {
                                int i17 = this.A0.J + i15;
                                if (L0 <= i17 && N0 >= i17) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f19917id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            int A8 = A8((MessageObject) L.get(i14), true);
                            this.f35525z0.h1(this.A0.J + i14, (this.f35500x0.getHeight() - A8) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.q6 q6Var = this.V2;
                if (q6Var != null) {
                    if (bVar.f15396f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    q6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                di.f4 f4Var = this.f35501x1;
                if (f4Var != null && f4Var.V) {
                    f4Var.e(true);
                }
                yl ylVar = this.B1;
                if (ylVar != null && ylVar.V) {
                    ylVar.e(true);
                }
                mk mkVar = this.Y;
                if (mkVar != null) {
                    mkVar.l0();
                }
                Gc();
            }
        }
    }

    public final void Lc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        long a2 = a();
        long clientUserId = getUserConfig().getClientUserId();
        SparseArray[] sparseArrayArr = this.W5;
        if (a2 == clientUserId) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i12].valueAt(i13);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages X8 = X8(messageObject);
                        if (X8 != null) {
                            groupedMessagePosition = X8.getPosition(messageObject);
                        } else {
                            groupedMessagePosition = null;
                        }
                        if (groupedMessagePosition != null) {
                            if (!groupedMessagePosition.last) {
                            }
                        }
                    }
                    arrayList.add(messageObject);
                }
            }
            dl dlVar = this.f35236bb;
            if (dlVar != null) {
                dlVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f35236bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                dl dlVar2 = this.f35236bb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                dlVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new me(this, 11), 120L);
            } else {
                z10 = !org.telegram.ui.Components.fk0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.v0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.aj0 aj0Var = k10.f21432x;
                if (aj0Var != null && k10.f21433y != i10) {
                    k10.f21433y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i10);
                }
            }
        }
        if (this.Y9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i15));
            }
            this.Y9.setSelectedMessages(arrayList2);
        }
    }

    public final void M6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f35282f5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.G5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.G5 = null;
                mk mkVar = this.Y;
                if (mkVar != null) {
                    mkVar.W2 = null;
                    mkVar.X2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f35282f5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = mkVar.getFieldText();
                    MessageObject messageObject3 = this.f35379n5;
                    if (messageObject3 == this.X3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f35353l5, this.p5);
                }
                i8();
                j8();
            }
        }
    }

    public final void M7() {
        if (this.f35253d2 == null && this.f35450t1 == null) {
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getParentActivity(), this.f35274ea);
            this.f35241c2 = t00Var;
            t00Var.setViewType(7);
            org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(getParentActivity(), this.f35241c2, 1, null);
            this.f35253d2 = xw0Var;
            xw0Var.setClickable(true);
            this.f35253d2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f35253d2.setVisibility(8);
            this.f35253d2.addView(this.f35241c2, 0);
            this.f35253d2.e(true, false);
            this.K3.addView(this.f35253d2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.d40 d40Var = new org.telegram.ui.Components.d40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f35450t1 = d40Var;
            d40Var.setOnHashtagClickListener(new bf(this, 2));
            this.f35450t1.setOnScrollListener(new i3(this, 5));
            this.f35450t1.setVisibility(8);
            this.K3.addView(this.f35450t1, -1, -1);
            r7();
            p7();
        }
    }

    public final un M8() {
        if (this.f35396oc == null) {
            this.f35396oc = new un(this);
        }
        return this.f35396oc;
    }

    public final boolean M9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.d6 d6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.d6 animation;
        boolean z10;
        org.telegram.ui.Cells.t1 messageCell;
        boolean z11;
        if (this.f35500x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.i40 i40Var = this.f35451t2;
            ArrayList<MessageObject> arrayList = null;
            if (i40Var != null && i40Var.getTag() != null && (messageCell = this.f35451t2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                d6Var = photoImage2.getAnimation();
                if (d6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f35500x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f35508x8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                d6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f35500x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f35500x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject2 = t1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = t1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f35500x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f35500x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f35508x8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f35500x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    d6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                d6Var = animation;
                            }
                        }
                    }
                    i10++;
                }
            }
            if (messageObject != null && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                h9(true);
                if (messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                    MediaController mediaController = MediaController.getInstance();
                    if (playMessage) {
                        arrayList = R7(messageObject, false);
                    }
                    mediaController.setVoiceMessagesPlaylist(arrayList, false);
                    return playMessage;
                }
                SharedConfig.setNoSoundHintShowed(true);
                messageObject.audioProgress = d6Var.n();
                messageObject.audioProgressMs = d6Var.o();
                d6Var.stop();
                if (PhotoViewer.K1(messageObject)) {
                    PhotoViewer.f33536a9.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ma() {
        this.f35523yb = null;
        this.f35498wb = 0;
        this.f35511xb = -1;
        this.f35536zb = null;
        this.Ab = null;
        this.f35326j1.d(false);
    }

    public final void Mb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f35274ea);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            b2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            b2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new xe(this, tL_game, messageObject, str, j3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            return;
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (!AndroidUtilities.isTablet()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (user == null || TextUtils.isEmpty(publicUsername)) {
                        str2 = "";
                    } else {
                        str2 = publicUsername;
                    }
                    presentFragment(new qj1(str, str2, tL_game.title, tL_game.short_name, messageObject));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (user != null && publicUsername != null) {
            str3 = publicUsername;
        }
        qj1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Mc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        if (this.fragmentView != null && !this.f35414q5) {
            int childCount = this.f35500x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f35500x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject = t1Var.getMessageObject();
                        if (this.f35457t8 != null && ((messageObject.isRoundVideo() || messageObject.isVideo()) && !messageObject.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject))) {
                            ImageReceiver photoImage = t1Var.getPhotoImage();
                            this.f35457t8.setTranslationX(t1Var.getX() + photoImage.getImageX());
                            this.f35457t8.setTranslationY((this.f35500x0.getY() + (photoImage.getImageY() + (t1Var.getY() + t1Var.getPaddingTop()))) - this.f35457t8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35457t8.getLayoutParams();
                            if (messageObject.isRoundVideo()) {
                                this.f35457t8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(C9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(C9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(C9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f35482v8.setResizeMode(0);
                                    this.f35457t8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(C9())) / AndroidUtilities.roundPlayingMessageSize(C9());
                                float imageWidth = t1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(C9());
                                if (this.f35457t8.getScaleX() != imageWidth) {
                                    this.f35457t8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f35457t8.setPivotX(0.0f);
                                this.f35457t8.setPivotY(0.0f);
                                this.f35457t8.setScaleX(imageWidth);
                                this.f35457t8.setScaleY(imageWidth);
                                this.f35495w8.setScaleX(roundPlayingMessageSize2);
                                this.f35495w8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f35457t8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f35482v8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f35457t8.setLayoutParams(layoutParams);
                                }
                                this.f35495w8.setScaleX(1.0f);
                                this.f35495w8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f35457t8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f35457t8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f35363m3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f35457t8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(C9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f35363m3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                F(playingMessageObject.getId(), 0, 0, 0, false, true);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f35508x8) {
                        this.f35500x0.invalidate();
                    }
                }
            }
        }
    }

    public final void N6() {
        MessageObject editingMessageObject;
        int abs;
        mk mkVar = this.Y;
        if (mkVar != null && (editingMessageObject = mkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f35276f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.po[]) this.f35212a0.f730b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f35264e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        j5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new ug(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.ye yeVar = this.Y.E1;
                if (yeVar != null) {
                    yeVar.setVisibility(8);
                }
                j5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView N7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f35520y8);
        if (this.f35457t8 == null) {
            qk qkVar = new qk(this, getParentActivity(), 2);
            this.f35457t8 = qkVar;
            qkVar.setOutlineProvider(new ol(this));
            this.f35457t8.setClipToOutline(true);
            this.f35457t8.setWillNotDraw(false);
            l4 l4Var = new l4(getParentActivity());
            this.f35482v8 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f35457t8.addView(this.f35482v8, w7.x5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f35495w8 = textureView;
            textureView.setOpaque(false);
            this.f35482v8.addView(this.f35495w8, w7.x5.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f35457t8.getParent();
        if (viewGroup != null && viewGroup != this.X0) {
            viewGroup.removeView(this.f35457t8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.X0.addView(this.f35457t8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(C9()), AndroidUtilities.roundPlayingMessageSize(C9())));
        }
        this.f35457t8.setTag(null);
        this.f35482v8.setDrawingReady(false);
        return this.f35495w8;
    }

    public final long N8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f35264e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f35264e)) {
            return 0L;
        }
        long j3 = this.f35255d4;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.p5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f35379n5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j3;
    }

    public final void N9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var == null) {
            return;
        }
        long j3 = messageObject.messageOwner.action.channel_id;
        if (d5Var.getFragmentStack().size() > 0) {
            n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            n2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (indexOf > 0 && !(n2Var instanceof co) && !(n2Var instanceof ProfileActivity) && this.f35264e.creator) {
            int size = d5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) d5Var2.getFragmentStack().get(indexOf);
                if (n2Var2 instanceof co) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new co(w.f.e(j3, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new ProfileActivity(w.f.e(j3, "chat_id"), null));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof xo) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new xo(w.f.e(j3, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof vr) {
                    if (((vr) n2Var2).f41669e1 == 0) {
                        Bundle arguments = n2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) d5Var2).c(indexOf, new vr(arguments));
                    }
                    n2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(this, n2Var, messageObject, d5Var2, 5));
        }
        AndroidUtilities.runOnUIThread(new le(this, j3, 1), 1000L);
    }

    public final void Na(org.telegram.ui.Cells.t1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Na(org.telegram.ui.Cells.t1):void");
    }

    public final void Nb(boolean z10) {
        if (z10) {
            if (this.Cb == null) {
                me meVar = new me(this, 10);
                this.Cb = meVar;
                AndroidUtilities.runOnUIThread(meVar, 100L);
                return;
            }
            return;
        }
        me meVar2 = this.Cb;
        if (meVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(meVar2);
        }
        this.Cb = null;
        this.Bb = false;
        xc(true);
    }

    public final void Nc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        pj pjVar = this.f35213a1;
        if (pjVar == null) {
            return;
        }
        int i10 = this.R3;
        if (i10 == 8 && (chat2 = this.f35264e) != null) {
            if (this.T3) {
                String i11 = og.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f35264e;
                pjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f35255d4 > 0L ? 1 : (this.f35255d4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.f35264e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f35264e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f35264e;
                        }
                        this.f35213a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        pj pjVar2 = this.f35213a1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f35264e;
                        pjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35255d4));
                    this.f35213a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f35255d4));
                    if (chat7 == null) {
                        chat7 = this.f35264e;
                    }
                    this.f35213a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                pj pjVar3 = this.f35213a1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f35264e.title));
                TLRPC.Chat chat8 = this.f35264e;
                pjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            pjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.Q3)) {
                this.f35213a1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.Q3)) {
                this.f35213a1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f35213a1.setTitle(this.Q3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.P3.title)) {
                this.f35213a1.setTitle(this.P3.title);
            } else {
                this.f35213a1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j3 = this.f35255d4;
                if (j3 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j3));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j3));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f35213a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f35213a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f35213a1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f35213a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f35213a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f35213a1.setTitle("");
                }
            } else if (F9() && !UserObject.isBotForum(this.f35276f)) {
                if (this.f35304h4) {
                    Sc();
                } else if (this.f35293g4) {
                    if (this.X3.hasReplies()) {
                        this.f35213a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f35213a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f35213a1.setTitle(LocaleController.formatPluralString("Replies", this.X3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f35276f)) {
                this.f35213a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f35276f)) {
                this.f35213a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.R3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f35276f)) {
                        this.f35213a1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f35213a1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f35213a1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", G8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f35264e;
                    if (chat9 != null) {
                        pj pjVar4 = this.f35213a1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f35264e;
                        pjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f35276f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f35213a1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f35276f.f20043id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f35276f.phone)) {
                                    pj pjVar5 = this.f35213a1;
                                    String j10 = org.telegram.messenger.w1.j(new StringBuilder("+"), this.f35276f.phone, gf.b.c());
                                    TLRPC.User user4 = this.f35276f;
                                    pjVar5.h(j10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f35276f), this.f35276f.emoji_status, z10);
                                } else {
                                    pj pjVar6 = this.f35213a1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f35276f)));
                                    TLRPC.User user5 = this.f35276f;
                                    pjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f35276f), this.f35276f.emoji_status, z10);
                                }
                            } else {
                                pj pjVar7 = this.f35213a1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f35276f)));
                                TLRPC.User user6 = this.f35276f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f35276f);
                                if (!MessagesController.isSupportUser(this.f35276f)) {
                                    emojiStatus = this.f35276f.emoji_status;
                                }
                                pjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f35213a1.getTitleTextView().getText());
        Pc(false);
    }

    public final void O6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.W7;
        if (call != null && (((str = this.f35297g8) != null || this.f35308h8) && this.N5)) {
            org.telegram.ui.Components.voip.d2.l(this.f35264e, str, this.Y7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f35297g8 = null;
            this.f35308h8 = false;
            return;
        }
        if (this.f35297g8 != null && z10 && (chatFull = this.Z7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.yc.a0(this), R.raw.linkbroken, 36);
            this.f35297g8 = null;
        }
        this.X7 = !this.N5;
    }

    public final void O7() {
        if (this.X0 != null && this.K1 == null && getParentActivity() != null) {
            this.K1 = new org.telegram.ui.ActionBar.q0(this, getParentActivity(), 1);
            o9();
            this.K1.setClickable(true);
            this.M0.addView(this.K1, w7.x5.n(-1, 44));
            this.M0.h(2, this.K1);
            this.M0.g(this.K1);
            TextView textView = new TextView(getParentActivity());
            this.N1 = textView;
            int i10 = org.telegram.ui.ActionBar.j6.f20925q7;
            textView.setTextColor(getThemedColor(i10));
            TextView textView2 = this.N1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.W(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2));
            this.N1.setTag(Integer.valueOf(i10));
            this.N1.setTextSize(1, 14.0f);
            this.N1.setTypeface(AndroidUtilities.bold());
            this.N1.setSingleLine(true);
            this.N1.setMaxLines(1);
            this.N1.setGravity(17);
            this.K1.addView(this.N1, w7.x5.e(-1, -1, 51));
            this.N1.setOnClickListener(new we(this, 13));
            org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(getParentActivity(), this.f35274ea);
            this.T1 = d90Var;
            d90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20751ge));
            this.T1.setTextSize(1, 13.3f);
            this.T1.setDisablePaddingsOffset(true);
            this.T1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.il));
            this.T1.setGravity(17);
            this.T1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.M0.addView(this.T1, w7.x5.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.M0.h(8, this.T1);
            this.M0.g(this.T1);
            TextView textView3 = new TextView(getParentActivity());
            this.L1 = textView3;
            int i11 = org.telegram.ui.ActionBar.j6.f20769he;
            textView3.setTextColor(getThemedColor(i11));
            this.L1.setVisibility(8);
            this.L1.setTextSize(1, 14.0f);
            this.L1.setTypeface(AndroidUtilities.bold());
            this.L1.setSingleLine(true);
            this.L1.setMaxLines(1);
            this.L1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.L1.setGravity(17);
            TextView textView4 = this.L1;
            float dp3 = AndroidUtilities.dp(18.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            textView4.setBackground(org.telegram.ui.ActionBar.j6.W(dp3, getThemedColor(i11) & 436207615, dp4, dp4, dp4, dp4));
            this.K1.addView(this.L1, w7.x5.e(-1, -1, 51));
            this.L1.setOnClickListener(new we(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.O1 = textView5;
            textView5.setTextColor(getThemedColor(i11));
            this.O1.setVisibility(8);
            this.O1.setTextSize(1, 14.0f);
            this.O1.setTypeface(AndroidUtilities.bold());
            this.O1.setSingleLine(true);
            this.O1.setMaxLines(1);
            this.O1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.O1.setGravity(17);
            this.O1.setText(LocaleController.getString(R.string.RestartTopic));
            this.O1.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i11) & 436207615, 3, -1));
            this.M0.addView(this.O1, w7.x5.n(-1, 48));
            this.M0.h(4, this.O1);
            this.M0.g(this.O1);
            this.O1.setOnClickListener(new we(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.U1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.U1.setContentDescription(LocaleController.getString(R.string.Close));
            this.U1.setBackground(org.telegram.ui.ActionBar.j6.M(getThemedColor(org.telegram.ui.ActionBar.j6.f20780i6), 0, 0));
            this.U1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f20698de), PorterDuff.Mode.MULTIPLY));
            this.U1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.addView(this.U1, w7.x5.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.U1.setOnClickListener(new we(this, 16));
        }
    }

    public final int O8() {
        return this.X0.getBackgroundSizeY();
    }

    public final void O9(boolean z10) {
        int i10;
        if (this.f35500x0 != null) {
            ArrayList arrayList = this.f35467u6;
            if (!arrayList.isEmpty() && !this.f35497wa.f39364n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f35525z0.h1(i10, 0);
                this.f35500x0.B0();
            }
        }
    }

    public final void Oa() {
        org.telegram.ui.Components.dc0 i10;
        ao aoVar = this.f35274ea;
        if (aoVar != null) {
            Drawable d = aoVar.d();
            if (this.fragmentView != null) {
                d = this.X0.getBackgroundImage();
            }
            if (d instanceof go) {
                d = ((go) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.dc0) {
                ((org.telegram.ui.Components.dc0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.f5) && (i10 = ((org.telegram.ui.ActionBar.f5) themedDrawable).i()) != null) {
                i10.x(false);
            }
        }
    }

    public final void Ob(boolean z10) {
        float f7;
        int i10;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupNotifyPeriod * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                if (z10) {
                    f7 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupUpload;
                } else {
                    f7 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupDownload;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this);
                    int i12 = R.raw.speed_limit;
                    if (z10) {
                        i10 = R.string.UploadSpeedLimited;
                    } else {
                        i10 = R.string.DownloadSpeedLimited;
                    }
                    String string = LocaleController.getString(i10);
                    if (z10) {
                        i11 = R.string.UploadSpeedLimitedMessage;
                    } else {
                        i11 = R.string.DownloadSpeedLimitedMessage;
                    }
                    org.telegram.ui.Components.qc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new kf(this, z10, 0)), spannableString), i12);
                    M.f29706j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Oc() {
        Pc(false);
    }

    public final void P6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f35514y1 == null && ChatObject.isMegagroup(this.f35264e) && (chatFull = getMessagesController().getChatFull(this.f35264e.f19896id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            rk rkVar = this.O0;
            if (rkVar == null || rkVar.getVisibility() != 0) {
                org.telegram.ui.Components.j40 j40Var = org.telegram.ui.Components.j40.f27363n;
                if (j40Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j3 = groupStickerSetById.documents.get(0).f19902id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        j40Var.b();
                        di.f4 f4Var = new di.f4(getParentActivity(), 3);
                        this.f35514y1 = f4Var;
                        f4Var.i();
                        this.f35514y1.p(true);
                        di.f4 f4Var2 = this.f35514y1;
                        f4Var2.K = Layout.Alignment.ALIGN_CENTER;
                        f4Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(j3, this.f35514y1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f35514y1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        di.f4 f4Var3 = this.f35514y1;
                        f4Var3.h = di.f4.a(f4Var3.getText(), this.f35514y1.getTextPaint());
                        di.f4 f4Var4 = this.f35514y1;
                        f4Var4.d = -1L;
                        f4Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new ug(this, 27), 300L);
                    }
                }
            }
        }
    }

    public final void P7() {
        int i10;
        if (this.R1 == null && getParentActivity() != null) {
            if (this.f35502x2 == null) {
                K7();
            }
            org.telegram.ui.Components.w21 w21Var = new org.telegram.ui.Components.w21(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.R1 = w21Var;
            w21Var.O = new me(this, 5);
            eh.e o9 = fh.b.o(this.f35274ea);
            bh.b bVar = this.J;
            w21Var.setSideMenuBackgroundDrawable(bVar.c(w21Var, o9, false));
            org.telegram.ui.Components.w21 w21Var2 = this.R1;
            w21Var2.setTopMenuBackgroundDrawable(bVar.c(w21Var2, fh.b.o(this.f35274ea), false));
            this.R1.setCurrentTopic(d());
            this.R1.setOnNewTopicSelected(new me(this, 6));
            this.R1.setOnTopicSelected(new af(this, 0));
            this.R1.setOnDialogSelected(new af(this, 1));
            int indexOfChild = this.X0.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.X0.addView(this.R1, i10, w7.x5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.R1.n();
            fk fkVar = this.I1;
            if (fkVar != null) {
                fkVar.bringToFront();
            }
        }
    }

    public final float P8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.X0.getBackgroundTranslationY()) - ((1.0f - this.f35509x9) * this.f35445s9);
    }

    public final boolean P9() {
        mk mkVar = this.Y;
        boolean z10 = mkVar.f23829y2;
        if (z10) {
            mkVar.s1();
            this.D3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Pa() {
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z10;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        rk rkVar;
        mk mkVar = this.Y;
        if (mkVar != null && mkVar.C1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.Y4 && mkVar != null && (rkVar = this.O0) != null && rkVar.getVisibility() != 0) {
            messageObject = this.f35379n5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.X2;
        } else {
            messageObject = null;
            charSequence = null;
            z10 = true;
        }
        if (this.f35365m5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        MediaDataController mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            z11 = false;
        } else {
            z11 = true;
        }
        ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z11, false);
        long B7 = B7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.T5, B7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j10 = this.T5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f35365m5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        sn snVar = this.f35353l5;
        MessageSuggestionParams messageSuggestionParams = this.f35294g5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        mk mkVar2 = this.Y;
        if (mkVar2 != null) {
            j3 = mkVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.saveDraft(j10, B7, charSequence2, entities, message, snVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void Pb(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f35293g4 && this.f35276f == null) {
                if (this.f35323ib == null) {
                    this.f35323ib = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f35323ib.booleanValue()) {
                    this.f35310hb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.O5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f35310hb) {
                    return;
                }
                this.f35310hb = z10;
                if (z10) {
                    if (this.P.getVisibility() != 0) {
                        this.P.setVisibility(0);
                        this.P.setAlpha(0.0f);
                        this.P.setScaleX(0.3f);
                        this.P.setScaleY(0.3f);
                    }
                    this.P.animate().setListener(null).cancel();
                    this.P.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.P.animate().setListener(null).cancel();
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new xi(this, 3)).start();
                return;
            }
            this.f35310hb = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Pc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.t0 t0Var;
        if (this.f35213a1 != null) {
            int i10 = this.R3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.T5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f35264e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f35276f)) {
                    if (!UserObject.isReplyUser(this.f35276f) && ((!F9() || this.f35304h4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f35264e;
                    if (chat != null) {
                        drawable = this.f35213a1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f35276f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f35213a1.c(DialogObject.getBotVerificationIcon(this.f35276f));
                        }
                    }
                }
                this.f35213a1.j(drawable, mutate);
                if (!z10 && (t0Var = this.f35266e1) != null) {
                    if (isDialogMuted) {
                        if (t0Var.f21370l != 8) {
                            t0Var.f21370l = 8;
                            View view = t0Var.f21367i;
                            if (view instanceof org.telegram.ui.ActionBar.f1) {
                                ((org.telegram.ui.ActionBar.f1) view).getRightIcon().setVisibility(t0Var.f21370l);
                            }
                        }
                        this.f35266e1.d(LocaleController.getString(R.string.Unmute));
                        this.f35266e1.b(R.drawable.msg_mute);
                    } else {
                        if (t0Var.f21370l != 0) {
                            t0Var.f21370l = 0;
                            View view2 = t0Var.f21367i;
                            if (view2 instanceof org.telegram.ui.ActionBar.f1) {
                                ((org.telegram.ui.ActionBar.f1) view2).getRightIcon().setVisibility(t0Var.f21370l);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.T5, d())) {
                            this.f35266e1.d(LocaleController.getString(R.string.Mute));
                            this.f35266e1.b(R.drawable.msg_unmute);
                        } else {
                            this.f35266e1.d(LocaleController.getString(R.string.Mute));
                            this.f35266e1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.oo ooVar = this.f35313i1;
                if (ooVar != null) {
                    ooVar.d(this.T5, d(), null);
                }
            }
        }
    }

    public final void Q6() {
        ArrayList arrayList;
        int i10;
        if (this.Pa) {
            int i11 = -1;
            long j3 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f35467u6;
                if (i12 >= arrayList.size()) {
                    break;
                }
                long groupIdForUse = ((MessageObject) arrayList.get(i12)).getGroupIdForUse();
                if (j3 != groupIdForUse) {
                    if (i11 >= 0 && j3 != 0 && (i10 = i12 - i11) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < i10; i13++) {
                            arrayList2.add((MessageObject) arrayList.remove(i11));
                        }
                        Collections.sort(arrayList2, new f6(5));
                        arrayList.addAll(i11, arrayList2);
                    }
                    i11 = i12;
                    j3 = groupIdForUse;
                }
                i12++;
            }
            if (i11 >= 0 && j3 != 0 && arrayList.size() - i11 > 1) {
                int size = arrayList.size() - i11;
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList3.add((MessageObject) arrayList.remove(i11));
                }
                arrayList.addAll(i11, arrayList3);
            }
        }
    }

    public final void Q7() {
        if (this.y3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f35274ea);
            this.y3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.X0.addView(this.y3, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final float Q8() {
        org.telegram.ui.Components.w21 w21Var = this.R1;
        if (w21Var != null) {
            return w21Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Qa() {
        org.telegram.ui.Cells.t1 t1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f35500x0.getChildCount(); i11++) {
            View childAt = this.f35500x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int min = Math.min(t1Var2.getBottom(), this.f35500x0.getHeight()) - Math.max(0, t1Var2.getTop());
                if (min > i10) {
                    t1Var = t1Var2;
                    i10 = min;
                }
            }
        }
        if (t1Var != null) {
            xj xjVar = this.f35525z0;
            this.f35500x0.getClass();
            xjVar.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) this.f35445s9), false);
        }
    }

    public final void Qb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ve(this, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20225a);
    }

    public final void Qc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Qc(boolean):void");
    }

    public final void R6(boolean z10) {
        hg.o1 o1Var;
        if (this.O3 == 2 && (o1Var = this.M3) != null) {
            String str = this.f35464u3;
            di.nb nbVar = o1Var.E;
            if (!TextUtils.equals(o1Var.f11226x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(nbVar);
                bi.d8 d8Var = o1Var.f11227y;
                if (d8Var != null && d8Var.I != 0) {
                    ConnectionsManager.getInstance(d8Var.f3298c).cancelRequest(d8Var.I, true);
                    d8Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    o1Var.f11226x = str;
                    o1Var.f11227y = new bi.d8(o1Var.f11223r, str2, trim);
                    if (z10) {
                        nbVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(nbVar, 1000L);
                    }
                }
                bi.d8 d8Var2 = o1Var.f11227y;
                if (d8Var2 != null && d8Var2.J > 0) {
                    o1Var.l();
                }
            }
        }
    }

    public final ArrayList R7(MessageObject messageObject, boolean z10) {
        ArrayList l4 = org.telegram.messenger.w1.l(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f35467u6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.L6 || messageObject.getDialogId() == this.L6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    l4.add(messageObject2);
                }
            }
        }
        return l4;
    }

    public final int R8() {
        return (int) (Q8() * AndroidUtilities.dp(71.0f));
    }

    public final void Ra(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Ra(org.telegram.messenger.MessageObject):void");
    }

    public final void Rb() {
        String str;
        if (this.Gb != null) {
            return;
        }
        if (this.f35379n5 != null) {
            str = getMessagesController().getFullName(this.f35379n5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new ve(this, 15));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(this, 16));
        b2Var.setOnDismissListener(new jg(this, 7));
        this.Gb = alertDialog$Builder.o();
    }

    public final void Rc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.t0 t0Var = this.f35449t0;
        if (t0Var != null) {
            TLRPC.Chat chat = this.f35264e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f35243c4) && (tL_forumTopic = this.f35243c4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            t0Var.e(i10);
        }
    }

    public final void S6() {
        this.S.d();
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
        r7();
        p9();
        boolean z10 = true;
        if (this.v.f44684s == 1) {
            z10 = false;
        }
        if (this.Wa != z10) {
            this.Wa = z10;
            checkSystemBarColors();
        }
    }

    public final void S7(final int i10, final int i11, final boolean z10) {
        this.A0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f35467u6;
            if (i12 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            int i13 = messageObject.messageOwner.date;
            if (i13 <= i10 || i13 >= i11) {
                this.A0.M.add(messageObject);
            }
            i12++;
        }
        uj ujVar = this.f35500x0;
        if (ujVar != null) {
            ujVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Pb(true);
        }
        om omVar = this.A0;
        omVar.L = true;
        omVar.O(true);
        Q7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                co coVar = co.this;
                MessagesController messagesController = coVar.getMessagesController();
                long j10 = coVar.T5;
                if (ChatObject.isChannel(coVar.f35264e)) {
                    j3 = coVar.T5;
                } else {
                    j3 = 0;
                }
                messagesController.deleteMessagesRange(j10, j3, i10, i11, z10, new ug(coVar, 18));
            }
        }, new qf(this, 29));
    }

    public final int S8(int i10) {
        SparseIntArray sparseIntArray = this.V4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Jc;
            Jc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void S9() {
        J6(this.P0, 5, true);
        J6(this.Y, 1, false);
        J6(this.R2, 4, true);
        J6(this.O0, 3, false);
        J6(this.R, 2, false);
        float f7 = this.wc.f15395e;
        j6.l lVar = this.Bc;
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 1.0f - ((float[]) lVar.f13577b)[5], 1.0f);
        kh.c cVar = this.P0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(b10);
        }
        mk mkVar = this.Y;
        if (mkVar != null) {
            mkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        qk qkVar = this.R2;
        if (qkVar != null) {
            qkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        rk rkVar = this.O0;
        if (rkVar != null) {
            rkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        qk qkVar2 = this.R;
        if (qkVar2 != null) {
            qkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        ih.g gVar = this.S;
        if (gVar != null) {
            gVar.setInputBubbleAlpha((int) ((1.0f - b10) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        rk rkVar2 = this.O0;
        le.b bVar = this.f35473uc;
        if (rkVar2 != null) {
            rkVar2.setTotalVisibilityFactor((1.0f - bVar.f15395e) * ((float[]) lVar.f13577b)[3]);
        }
        aq aqVar = this.P9;
        if (aqVar != null) {
            float f10 = bVar.f15395e;
            if (aqVar.S != f10) {
                aqVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        q7();
    }

    public final void Sa(long j3) {
        xj xjVar;
        MessageObject messageObject;
        int L8;
        int abs;
        uj ujVar = this.f35500x0;
        int i10 = -1;
        if (ujVar != null && (xjVar = this.f35525z0) != null && xjVar.f45763y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f35500x0.getChildAt(childCount);
                this.f35500x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j3 && (abs = Math.abs((L8 = L8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = L8;
                    i12 = abs;
                }
            }
            this.f35381n7 = i10;
            this.f35392o7 = i11;
            return;
        }
        this.f35381n7 = -1;
    }

    public final void Sb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.i40 i40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((i40Var = this.f35362m2) != null && i40Var.getVisibility() == 0)) {
                this.f35362m2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f35362m2.f(view, true);
                }
            }
        }
    }

    public final void Sc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        pj pjVar = this.f35213a1;
        if (pjVar != null && (tL_forumTopic = this.f35243c4) != null) {
            pjVar.setTitle(tL_forumTopic.title);
        }
        Tc();
    }

    public final void T6() {
        TLRPC.Chat chat;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                la("");
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                Za(null, user);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j10))) != null) {
            la("");
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Za(chat, null);
        }
    }

    public final void T7(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.t1 t1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i10;
        String str2;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(this, t1Var);
        org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(getParentActivity(), this.f35274ea);
        I.f28682p = new qe(am0Var, 0);
        if (!str.startsWith("video?") && !of.f.f(Uri.parse(str), false, null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isWebBrowserOpenInApp = getMessagesController().isWebBrowserOpenInApp(str);
        if (isWebBrowserOpenInApp && z10) {
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
                i11 = R.drawable.menu_website;
            } else {
                i11 = R.drawable.msg_openin;
            }
            if (z11 && !z12) {
                i12 = R.string.OpenInTelegramBrowser2;
            } else {
                i12 = R.string.Open;
            }
            String string = LocaleController.getString(i12);
            int i13 = i11;
            z15 = z10;
            re reVar = new re(this, str, characterStyle, messageObject, t1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            t1Var2 = t1Var;
            I.c(i13, string, reVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            t1Var2 = t1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new se(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new se(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new te(this, messageObject2, 0), false);
        } else {
            messageObject2 = messageObject;
        }
        int i14 = R.drawable.msg_copy;
        if (z14) {
            i10 = R.string.CopyHashtag;
        } else if (startsWith) {
            i10 = R.string.CopyMail;
        } else {
            i10 = R.string.CopyLink;
        }
        I.c(i14, LocaleController.getString(i10), new bi.e4(this, str, messageObject2, startsWith, 10), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new se(this, str, 2), false);
        }
        am0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            am0Var.f(t1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.n51) {
            String url = ((org.telegram.ui.Components.n51) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                }
                str2 = URLDecoder.decode(url.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e10) {
                FileLog.e(e10);
                str2 = url;
            }
            if (str2.length() > 204) {
                str2 = str2.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            am0Var.f(t1Var2, characterStyle2, spannableString2, false);
        } else {
            am0Var.f(t1Var2, characterStyle2, null, false);
        }
        showDialog(am0Var);
    }

    public final int T8(int i10) {
        SparseIntArray sparseIntArray = this.U4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Jc;
            Jc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void T9(boolean z10, boolean z11) {
        if (this.D3) {
            AndroidUtilities.runOnUIThread(new me(this, 20), 200L);
            if (z11) {
                this.D3 = false;
            }
        }
        if (z10 && !this.Oa) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final void Ta() {
        int i10;
        int i11;
        uj ujVar = this.f35500x0;
        if (ujVar != null && this.f35525z0 != null) {
            for (int childCount = ujVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f35500x0.getChildAt(childCount);
                this.f35500x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i10 = L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f35525z0.h1(i11, i10);
        }
    }

    public final void Tb(MessageSuggestionParams messageSuggestionParams) {
        if (this.p5 == null) {
            return;
        }
        new zh.e0(getParentActivity(), this.currentAccount, this.T5, messageSuggestionParams, this, getResourceProvider(), 0, new bf(this, 0)).show();
    }

    public final void Tc() {
        pj pjVar;
        pj pjVar2;
        if (UserObject.isBotForum(this.f35276f) && (pjVar2 = this.f35213a1) != null) {
            pjVar2.getAvatarImageView().setVisibility(0);
            this.f35213a1.b();
        } else if (this.f35243c4 != null && (pjVar = this.f35213a1) != null) {
            pjVar.getAvatarImageView().setVisibility(0);
            og.d.p(this.f35213a1.getAvatarImageView(), this.f35243c4, true, true, this.f35274ea);
        }
    }

    public final void U6() {
        MessageObject messageObject;
        if (!this.D4 && (messageObject = this.J7) != null) {
            if (this.f35467u6.indexOf(messageObject) >= 0) {
                this.E4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.C4 != null) {
        } else {
            qf qfVar = new qf(this, 22);
            this.C4 = qfVar;
            AndroidUtilities.runOnUIThread(qfVar);
        }
    }

    public final void U7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.t1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.U7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1):void");
    }

    public final long U8() {
        return this.f35255d4;
    }

    public final void U9() {
        this.D4 = true;
        vm vmVar = this.f35248c9;
        AndroidUtilities.cancelRunOnUIThread(vmVar.f21801g0);
        vmVar.f21830z = false;
        me meVar = new me(this, 8);
        int i10 = this.D7;
        if (i10 != 0) {
            Xa(i10, 0, false, this.C7, true, 0, null, null, meVar);
            return;
        }
        int i11 = this.B7;
        if (i11 > 0) {
            Xa(i11, 0, true, this.C7, true, 0, null, null, meVar);
            return;
        }
        Wa(!this.cb, meVar);
        this.cb = false;
        if (!this.H4.isEmpty()) {
            this.O4 = true;
            this.N4 = ((Integer) this.H4.get(0)).intValue();
        }
    }

    public final int Ua(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        MessageObject messageObject2;
        if (!TextUtils.isEmpty(this.P7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages y82 = y8(messageObject.getGroupId());
                org.telegram.ui.Cells.t1 t1Var2 = this.f35357l9;
                if (t1Var2 != null && (textLayoutBlocks2 = t1Var2.f23224xe) != null && y82 != null && (messageObject2 = y82.captionMessage) != null) {
                    i10 = t1Var2.f23209we;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (t1Var2 != null) {
                        t1Var2.f23209we = 0;
                        t1Var2.f23224xe = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.f35357l9) != null && (textLayoutBlocks = t1Var.f22915c4) != null) {
                i10 = (int) t1Var.f23110q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.f35357l9;
                if (t1Var3 != null && t1Var3.f23153t1) {
                    i10 = t1Var3.f23052m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.f35357l9;
            if (t1Var4 != null) {
                t1Var4.f23209we = 0;
                t1Var4.f23224xe = null;
            }
            if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.P7, this.S7)) < 0) {
                return 0;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                int i12 = textLayoutBlock.charactersOffset;
                if (findQuoteStart > i12) {
                    if (findQuoteStart - i12 > charSequence3.length() - 1) {
                        lineTop = i10 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                    } else {
                        lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i10 + textLayoutBlock.padTop;
                    }
                    float f10 = AndroidUtilities.displaySize.y;
                    float f11 = 0.5f;
                    if (x9()) {
                        f7 = 0.7f;
                    } else {
                        f7 = 0.5f;
                    }
                    if (lineTop <= f10 * f7) {
                        return 0;
                    }
                    float f12 = AndroidUtilities.displaySize.y;
                    if (x9()) {
                        f11 = 0.7f;
                    }
                    return (int) (lineTop - (f12 * f11));
                }
            }
            return 0;
        }
        org.telegram.ui.Cells.t1 t1Var5 = this.f35357l9;
        if (t1Var5 != null) {
            t1Var5.f23209we = 0;
            t1Var5.f23224xe = null;
        }
        return 0;
    }

    public final void Ub(MessageObject messageObject) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().isPeerNoForwards(messageObject.getDialogId())) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || !message.noforwards) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = messageObject.messageText;
                    if (messageObject.textLayoutBlocks.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = messageObject.caption;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f35321i9 && this.f35333j9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f35321i9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f35309h9 == null) {
                        rl rlVar = new rl(getParentActivity(), this.f35274ea, this);
                        this.f35309h9 = rlVar;
                        this.X0.addView(rlVar, w7.x5.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f35309h9.c();
                }
            }
        }
    }

    public final void Uc() {
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var = this.f35350l0;
        if (t0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        t0Var.e(i10);
    }

    public final void V6(boolean z10) {
        if (this.f35379n5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f35467u6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f35379n5.getId() && messageObject.getDialogId() == this.f35379n5.getDialogId()) {
                        this.f35379n5 = messageObject;
                        sn snVar = this.f35353l5;
                        if (snVar != null) {
                            snVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f35282f5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f35379n5;
                                MessageObject.GroupedMessages groupedMessages = this.f35329j5;
                                if (groupedMessages == null) {
                                    groupedMessages = y8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.T5, this.f35353l5);
                            }
                            j8();
                            return;
                        }
                        return;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void V7(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, String str) {
        zi K9 = K9(t1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(gf.b.d(str, false));
        ta taVar = new ta(this, t1Var, str, tL_contact, characterStyle, 1);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                taVar.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new r1(this, tL_contact, taVar, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = gf.b.d(str, false);
        K9.f17031b = new ef(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new aa(this, K9, taVar, 3)), 0);
        K9.d();
    }

    public final float V8(float f7) {
        co coVar = this.f35261da;
        if (coVar == null) {
            coVar = this;
        }
        org.telegram.ui.Components.dh dhVar = coVar.M0;
        if (dhVar == null) {
            return 0.0f;
        }
        return dhVar.c(f7);
    }

    public final void Va() {
        Wa(false, null);
    }

    public final void Vb(boolean z10, boolean z11) {
        mk mkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f35438s2 != null) && this.R3 == 0 && (mkVar = this.Y) != null && mkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f35438s2 == null) {
                    um umVar = this.X0;
                    int indexOfChild = umVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(9, getParentActivity(), this.f35274ea, false);
                        this.f35438s2 = i40Var;
                        umVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f35438s2.b(true);
                    return;
                }
                if (this.Y.f23711d2) {
                    org.telegram.ui.Components.i40 i40Var2 = this.f35438s2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    i40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f35438s2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f35438s2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Vc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        uj ujVar = this.f35500x0;
        if (ujVar != null) {
            if (!this.D4 && this.J7 != null) {
                int childCount = ujVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f35500x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.J7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f35467u6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.J7) + this.A0.J;
                                i11 = L8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f35500x0.getChildCount();
            mk mkVar = this.Y;
            if (mkVar != null) {
                mkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f35500x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                    MessageObject messageObject3 = t1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        t1Var.X3(messageObject3, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        om omVar = this.A0;
                        this.f35500x0.getClass();
                        omVar.Q(RecyclerView.R(t1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f35525z0.h1(i10, i11);
            }
        }
    }

    public final void W6() {
        rk rkVar;
        qk qkVar;
        qk qkVar2;
        mk mkVar = this.Y;
        if (mkVar != null && mkVar.y3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f35264e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((rkVar = this.O0) == null || rkVar.getVisibility() != 0) && (((qkVar = this.R) == null || qkVar.getVisibility() != 0) && ((qkVar2 = this.R2) == null || qkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void W7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.W7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final float W8(org.telegram.ui.Components.s21 s21Var) {
        float f7;
        org.telegram.ui.Components.w21 w21Var = this.R1;
        if (w21Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j3 = w21Var.j(s21Var);
            if (s21Var == org.telegram.ui.Components.s21.f30204b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * j3;
        }
        return 0.0f;
    }

    public final void W9(long j3, String str, boolean z10) {
        X9();
        bi.t3 t3Var = this.J1;
        if (t3Var != null) {
            t3Var.N1(j3, str, z10, false);
        }
    }

    public final void Wa(boolean z10, me meVar) {
        ArrayList arrayList;
        int i10;
        if (this.f35500x0.X1) {
            return;
        }
        this.N4 = 0;
        this.f35419qb = 0;
        this.O4 = false;
        this.W8.d(0);
        if (this.E6[0] && this.H7 == 0 && this.f35468u7 == 0) {
            this.f35326j1.d(false);
            if (this.f35525z0.I0() == 0) {
                this.f35298g9 = false;
                vc();
                Ia();
                Wc(false);
                return;
            }
            this.A0.T();
            pn pnVar = this.La;
            pnVar.f39569a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f35467u6;
                if (i11 >= arrayList.size() || !((MessageObject) arrayList.get(i11)).isSponsored()) {
                    break;
                }
                i11++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i11) != null) {
                long groupId = ((MessageObject) arrayList.get(i11)).getGroupId();
                while (groupId != 0 && (i10 = i11 + 1) < arrayList.size() && groupId == ((MessageObject) arrayList.get(i10)).getGroupId()) {
                    i11 = i10;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i11 = Math.min(i11, arrayList.size() - 1);
            }
            uk ukVar = this.W8;
            pnVar.f39570b = i11;
            pnVar.d = 0;
            boolean z11 = !z10;
            pnVar.f39571c = z11;
            ukVar.c(i11, 0, z11, true);
            this.f35298g9 = false;
            vc();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f35407pb;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        xc(false);
        if (meVar != null) {
            meVar.run();
        } else {
            Ma();
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f35274ea);
            this.f35407pb = b2Var2;
            b2Var2.setOnCancelListener(this.f35370ma);
            this.f35407pb.q(1000L);
        }
        this.Y8 = this.V5;
        this.f35220a9 = false;
        this.Z8 = 0;
        this.f35234b9 = false;
        ArrayList arrayList2 = this.f35306h6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.V5));
        AndroidUtilities.runOnUIThread(new qf(this, 13), 0L);
    }

    public final boolean Wb(MessageObject messageObject) {
        if (this.R3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void Wc(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Wc(boolean):void");
    }

    public final boolean X6(boolean z10, boolean z11) {
        mk mkVar = this.Y;
        if (mkVar == null || !mkVar.v0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f35274ea);
            if (this.Y.f23704c1) {
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new bi.h(6, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20225a);
            return true;
        }
        return true;
    }

    public final void X7(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.X7(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages X8(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f35506x6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void X9() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            mk mkVar = this.Y;
            if (mkVar == null || TextUtils.isEmpty(mkVar.getSlowModeTimer())) {
                mk mkVar2 = this.Y;
                if (mkVar2 != null && mkVar2.f23740h5.f15396f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                E7();
                bi.t3 t3Var = this.J1;
                if (!z10 && this.R3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                t3Var.R1 = z11;
                t3Var.f31318j0.f0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 == 21 || i10 == 22) {
                    this.Y.P();
                }
                TLRPC.Chat chat = this.f35264e;
                if ((chat == null || this.f35294g5 == null) && !z10 && this.R3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f35264e.slowmode_enabled) {
                        this.J1.J1(10, true);
                    } else {
                        this.J1.J1(-1, true);
                    }
                } else {
                    this.J1.J1(1, true);
                }
                bi.t3 t3Var2 = this.J1;
                t3Var2.S0 = true;
                t3Var2.f31364x1.setVisibility(0);
                t3Var2.Q0 = 0;
                t3Var2.F = false;
                t3Var2.G = false;
                t3Var2.f31315i0 = true;
                t3Var2.J = null;
                org.telegram.ui.ActionBar.v0 v0Var = t3Var2.f31322k1;
                if (v0Var != null) {
                    t3Var2.f31319j1.setTranslationY(0.0f);
                    v0Var.setVisibility(8);
                }
                this.J1.r1();
                this.J1.m1().setText(this.Y.getFieldText());
                bi.t3 t3Var3 = this.J1;
                t3Var3.f31341r = this.f35274ea;
                showDialog(t3Var3);
            }
        }
    }

    public final void Xa(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Xa(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Xb(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            ah.g0 g0Var = this.Y9;
            if (g0Var != null && g0Var.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            if (this.f35325j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21130n0) {
                    kVar.h(true);
                    this.Y.e1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ji.c2 c2Var = new ji.c2(richMessage);
                c2Var.J = this;
                c2Var.f13854r = messageObject;
                presentFragment(c2Var);
                return;
            }
            this.I1.getAdapter().f11162f0 = false;
            this.Y.setVisibility(0);
            yb(true, null, messageObject, null, null, null, false, true);
            hc(false);
            if (!z10) {
                N6();
            }
            if (z10) {
                this.f35294g5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.V0(false, false, true);
            yc(0, true);
            Wc(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.R3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.T5);
                tL_messages_getMessageEditData.f19988id = messageObject.getId();
                this.f35390o5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new pe(this, 3));
                return;
            }
            mk mkVar = this.Y;
            org.telegram.ui.Components.ye yeVar = mkVar.E1;
            if (yeVar != null) {
                yeVar.setEnabled(true);
                mkVar.E1.h(false);
            }
        }
    }

    public final void Y6() {
        if (!this.Sb) {
            this.Sb = true;
            if (!this.Tb && this.R3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f35475v1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f35475v1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f35488w1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f35488w1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    Z6();
                }
            }
        }
    }

    public final void Y7(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Y7(int, java.lang.Object[]):void");
    }

    public final void Y8(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f35477v3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.O3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j3 = this.T5;
        long j10 = this.L6;
        int i14 = this.classGuid;
        boolean z11 = this.Pa;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j3, j10, i14, i10, this.f35255d4, this.f35388o3, this.f35400p3, this.f35412q3);
        Lb(false);
    }

    public final void Y9() {
        st.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        E7();
        this.J1.f31318j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.Y.P();
        }
        this.J1.J1(1, false);
        bi.t3 t3Var = this.J1;
        t3Var.U1 = true;
        t3Var.i1(null);
        this.J1.r1();
        bi.t3 t3Var2 = this.J1;
        t3Var2.f31341r = this.f35274ea;
        if (this.visibleDialog != null) {
            t3Var2.show();
        } else {
            showDialog(t3Var2);
        }
    }

    public final void Ya(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Ya(java.lang.CharSequence, boolean):void");
    }

    public final void Yb() {
        org.telegram.ui.Components.r00 r00Var = this.f35369m9;
        if (r00Var != null && !r00Var.f29896c) {
            r00Var.c(false);
            try {
                this.f35369m9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Z6() {
        org.telegram.ui.Cells.t1 t1Var;
        di.f4 f4Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        di.f4 f4Var2 = this.f35501x1;
        if (f4Var2 != null && !f4Var2.V && !this.Vb && this.Sb && !this.f35524yc.f15396f && System.currentTimeMillis() - this.Ub > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f35500x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f35500x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        ah.k1 k1Var = t1Var.N;
                        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !k1Var.v.isEmpty()) {
                            t1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + k1Var.d;
                            if (f7 >= AndroidUtilities.dp(240.0f) && f7 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    t1Var = null;
                    break;
                }
            }
            if (t1Var != null) {
                ah.k1 k1Var2 = t1Var.N;
                this.Vb = true;
                t1Var.getLocationInWindow(iArr);
                this.f35501x1.setTranslationY(((iArr[1] - f4Var.getTop()) - AndroidUtilities.dp(120.0f)) + k1Var2.d);
                this.f35501x1.m(0.0f, (((ah.h1) k1Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + k1Var2.f620c);
                this.f35501x1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new me(this, 19));
            AndroidUtilities.runOnUIThread(new me(this, 19), 2000L);
        }
    }

    public final void Z7(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Z7(int, java.lang.Object[]):void");
    }

    public final void Z8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Z8():void");
    }

    public final void Z9(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.t1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.Z9(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.t1, org.telegram.messenger.MessageObject):void");
    }

    public final void Za(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f35388o3 = user;
        this.f35400p3 = chat;
        if (this.f35325j0 != null && this.I1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f35388o3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f35377n3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a4.a.C(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.j6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f35325j0.setSearchFieldCaption(spannableString);
                    this.I1.getAdapter().U(null, 0, null, false, true);
                    this.f35325j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.v0 v0Var = this.f35325j0;
                    v0Var.f21425r = null;
                    di.h2 h2Var = v0Var.f21410e;
                    if (h2Var != null) {
                        h2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f35452t3 = "";
                    mediaDataController.searchMessagesInChat("", this.T5, this.L6, this.classGuid, 0, this.f35255d4, this.f35388o3, this.f35400p3, this.f35412q3);
                }
            }
        }
    }

    public final void Zb() {
        long j3;
        me meVar = this.U7;
        if (meVar != null) {
            AndroidUtilities.cancelRunOnUIThread(meVar);
        }
        me meVar2 = new me(this, 15);
        this.U7 = meVar2;
        if (this.P7 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(meVar2, j3);
    }

    public long a() {
        return this.T5;
    }

    public final void a7(boolean z10) {
        int i10;
        if (this.f35525z0 != null && !this.f35414q5 && !this.A0.L && !this.f7) {
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f35500x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f35500x0.getChildAt(i14));
                if (R != -1) {
                    if (i12 == -1 || R < i12) {
                        i12 = R;
                    }
                    if (i11 == -1 || R > i11) {
                        i11 = R;
                    }
                    i13++;
                }
            }
            om omVar = this.A0;
            if (omVar.N) {
                int i15 = omVar.E;
                if (i15 >= 0 && i12 >= 0 && i15 >= i12 && i15 <= i11) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = omVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            if (this.R3 == 7) {
                if ((h - i12) - i13 <= i10 && !this.G6 && !this.C6[0]) {
                    this.G6 = true;
                    this.f35306h6.add(Integer.valueOf(this.V5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f35464u3;
                    int i16 = this.classGuid;
                    int i17 = this.O3;
                    int i18 = this.V5;
                    this.V5 = i18 + 1;
                    hashtagSearchController.searchHashtag(str, i16, i17, i18);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.ff(this, h, i12, i13, i10, 1));
        }
    }

    public final void a8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.a8(int, java.lang.Object[]):void");
    }

    public final boolean a9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.W5;
        for (int i10 = 0; i10 < sparseArrayArr.length; i10++) {
            try {
                for (int i11 = 0; i11 < sparseArrayArr[i10].size(); i11++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i10].valueAt(i11);
                    if (messageObject != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void aa(long j3, final MessageObject messageObject, int i10, final long j10, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f19896id + " msg_id = " + i13);
        }
        this.f35324ic = 0;
        this.f35336jc = false;
        this.f35360lc = null;
        this.f35372mc = null;
        uj ujVar = this.f35500x0;
        if (ujVar != null) {
            ujVar.e1();
        }
        if (this.f35311hc != -1) {
            getConnectionsManager().cancelRequest(this.f35311hc, false);
        }
        if (this.gc != -1) {
            getConnectionsManager().cancelRequest(this.gc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f35324ic = i13;
        this.f35336jc = false;
        this.f35349kc = System.currentTimeMillis();
        uj ujVar2 = this.f35500x0;
        if (ujVar2 != null) {
            ujVar2.e1();
        }
        final int i14 = this.ec + 1;
        this.ec = i14;
        this.gc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final co coVar = co.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j11 = j10;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new fh(1, coVar, new Runnable(i15, i16, j11, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f37394b;
                    public final int f37395c;
                    public final TLObject d;
                    public final int f37396e;
                    public final MessageObject f37397f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f37398n;
                    public final MessageObject f37399r;

                    {
                        this.d = tLObject;
                        this.f37396e = i17;
                        this.f37397f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f37398n = chat2;
                        this.f37399r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final co coVar2 = co.this;
                        if (this.f37394b != coVar2.ec) {
                            return;
                        }
                        coVar2.gc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            coVar2.f35360lc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            coVar2.getMessagesController().putUsers(coVar2.f35360lc.users, false);
                            coVar2.getMessagesController().putChats(coVar2.f35360lc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = coVar2.f35360lc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < coVar2.f35360lc.messages.size(); i19++) {
                                TLRPC.Message message = coVar2.f35360lc.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f37395c;
                        final int i21 = this.f37396e;
                        final MessageObject messageObject5 = this.f37397f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f37398n;
                        final MessageObject messageObject6 = this.f37399r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = coVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f19917id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i21 > 0) {
                                tL_messages_getReplies.offset_id = i21;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i20 == 0) {
                                    i18 = 1;
                                } else {
                                    i18 = i20;
                                }
                                tL_messages_getReplies.offset_id = i18;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i22 = coVar2.f35288fc + 1;
                            coVar2.f35288fc = i22;
                            coVar2.f35311hc = coVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new uh(co.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        coVar2.ya(coVar2.f35360lc, coVar2.f35372mc, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.gc, this.classGuid);
    }

    public final void ab(View view, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var, View view2, float f7, float f10, ah.j1 j1Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        zh.a4 a4Var;
        int[] iArr;
        int[] iArr2;
        int i12;
        boolean z14;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && messageObject != null) {
            if (getMessagesController().isFrozen()) {
                b.b(this.currentAccount);
                return;
            }
            ArrayList<TLRPC.MessageReactor> arrayList = null;
            if (j1Var != null && j1Var.f605a) {
                A7(true);
                if (view == null) {
                    a0Var = q8(messageObject.getId(), true);
                } else {
                    a0Var = view;
                }
                String str2 = "";
                if (z11) {
                    if (a0Var != null) {
                        try {
                            a0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    long j3 = -zh.l5.b(messageObject).f52244a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    zh.r5 r5Var = zh.s5.y(this.currentAccount, false).B;
                    if (r5Var != null) {
                        r5Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j10 = this.T5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    zh.n8 n8Var = new zh.n8(parentActivity, i15, j10, this, messageObject, arrayList2, z14, false, 0L, this.f35274ea);
                    messageObject.getId();
                    n8Var.T = this;
                    n8Var.U = a0Var;
                    n8Var.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -zh.l5.b(messageObject).f52244a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                zh.r5 d02 = zh.s5.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f35420qc == null) {
                        this.f35420qc = new zh.a4(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        a4Var = null;
                    } else {
                        if (this.f35420qc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f35420qc);
                            layoutContainer.addView(this.f35420qc, w7.x5.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f35420qc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f35420qc.bringToFront();
                        }
                        a4Var = this.f35420qc;
                    }
                    a4Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f52555o = a4Var;
                    a4Var.I = false;
                    a4Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    a4Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.t1) {
                        i12 = ((org.telegram.ui.Cells.t1) a0Var).V;
                    } else {
                        i12 = 0;
                    }
                    a4Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            ah.j1 j1Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new sg.a1((org.telegram.ui.ActionBar.n2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(j1Var) && (chat = this.f35264e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f35264e, 26)) {
                org.telegram.messenger.w1.o(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.yc.a0(this), R.raw.e_hand_2, 36);
            } else {
                ah.e1.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(j1Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.i iVar = this.f35506x6;
                if (iVar.f(groupId) != null) {
                    if (messageObject.shouldDrawReactionsInLayout()) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                    MessageObject findMessageWithFlags = ((MessageObject.GroupedMessages) iVar.f(messageObject.getGroupId())).findMessageWithFlags(i11);
                    if (findMessageWithFlags != null) {
                        id2 = findMessageWithFlags.getId();
                    }
                }
                int i18 = id2;
                if (selectReaction) {
                    org.telegram.ui.Cells.a0 q82 = q8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && q82 != null && j1Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j12 = j1Var.f610g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(j1Var.f609f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.q5.f(this.currentAccount, j12);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.qc r10 = org.telegram.ui.Components.yc.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f29706j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (fk0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        ah.e1.d(this, fk0Var, q82, view2, f7, f10, j1Var, i19, i10);
                    }
                }
                if (selectReaction && j1Var != null && (str = j1Var.f609f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<ah.j1> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    j1Var2 = j1Var;
                }
                wi wiVar = new wi(this, z13, z10, i18, selectReaction, fk0Var, f7, f10, j1Var, messageObject);
                this.f35250cc = wiVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, j1Var2, z11, z12, this, wiVar);
                if (z10 || z13) {
                    qc(messageObject, true);
                    this.f35250cc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f35250cc, 50L);
                }
            }
        }
    }

    public final void ac() {
        AndroidUtilities.forEachViews((RecyclerView) this.f35500x0, (e2.h) new m4.s0(2, this, t9()));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.T5, this.f35379n5, this.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = C8();
        of2.payStars = j3;
        of2.monoForumPeer = N8();
        of2.suggestionParams = this.f35294g5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.R3 == 0) {
            O9(false);
        }
        if (i10 == 0 || i10 == 1) {
            y6();
        }
        if (this.f35414q5) {
            this.Q5 = true;
        }
    }

    public final void b7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f35430r8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f35430r8 = true;
            org.telegram.ui.Components.e5.s0(getParentActivity(), this.currentAccount, new me(this, 9), true, this.f35274ea);
        }
    }

    public final void b8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.b8(int, java.lang.Object[]):void");
    }

    public final boolean b9() {
        vm vmVar = this.f35248c9;
        if (vmVar != null && vmVar.y()) {
            return true;
        }
        return false;
    }

    public final void ba(boolean z10) {
        String string;
        if (!y9() && !a9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.W5;
                    if (i12 >= sparseArrayArr[i11].size()) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i11].valueAt(i12);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (messageObject.isPublicPoll()) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        if (i10 == 2) {
                            break;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    i12++;
                }
                if (i10 == 2) {
                    break;
                }
            }
            ah.g0 g0Var = this.Y9;
            if (g0Var != null && g0Var.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e7.putInt("messagesCount", this.f35245c6);
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            e7.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e7);
            uyVar.C2 = this;
            presentFragment(uyVar);
            return;
        }
        if (y9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f35264e) && !this.f35264e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f35339k2 == null) {
                um umVar = this.X0;
                int indexOfChild = umVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, getParentActivity(), null, true);
                    this.f35339k2 = i40Var;
                    umVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f35339k2.setAlpha(0.0f);
                    this.f35339k2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f35339k2.setText(string);
            this.f35339k2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f35351l2 == null) {
            um umVar2 = this.X0;
            int indexOfChild2 = umVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(getParentActivity(), 9);
            this.f35351l2 = i40Var2;
            umVar2.addView(i40Var2, indexOfChild2 + 1, w7.x5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f35351l2.setAlpha(0.0f);
            this.f35351l2.setVisibility(4);
        }
        this.f35351l2.setText(string);
        this.f35351l2.f(this.P0.getForwardButton(), true);
    }

    public final void bb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f19902id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.T5, this.f35379n5, this.X3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = C8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        y6();
    }

    public final void bc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.T5, d())) {
            if (z10) {
                getNotificationsController().muteDialog(this.T5, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.f3 F = org.telegram.ui.Components.e5.F(this.T5, d(), this, this.f35274ea);
            F.setCalcMandatoryInsets(x9());
            showDialog(F);
            return;
        }
        getNotificationsController().muteDialog(this.T5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.yc.z(this, 4, 0, this.f35274ea).j();
        }
    }

    @Override
    public final boolean c() {
        if (this.R3 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        mk mkVar = this.Y;
        if (mkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.T5, (int) d());
            le.b bVar = mkVar.f23734g5;
            hi.a aVar = mkVar.I0;
            boolean z14 = false;
            if (streamingSendButtonState != BotForumHelper.SteamingSendButtonState.NO_STREAMING) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (streamingSendButtonState == BotForumHelper.SteamingSendButtonState.STOP) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 && bVar.f15395e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((le.b) aVar.f11373c).a(z12, z13);
            aVar.setClickable(z12);
            aVar.setEnabled(z12);
            if (bVar.f15396f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            mkVar.S4 = streamingSendButtonState;
            if (z14) {
                mkVar.K(z10);
            }
        }
    }

    public final void c8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.c8(java.lang.Object[]):void");
    }

    public final void c9() {
        org.telegram.ui.Components.zt editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.Bc.j(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.f35217a6 = 0;
        this.f35257d6 = 0;
        this.f35231b6 = 0;
        this.f35283f6 = 0;
        this.f35295g6 = 0;
        this.f35271e6 = 0;
        mk mkVar = this.Y;
        if (mkVar != null && (editField = mkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        vm vmVar = this.f35248c9;
        if (vmVar != null) {
            vmVar.f(true);
            SparseArray sparseArray = this.f35248c9.f22718u0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        rl rlVar = this.f35309h9;
        if (rlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rlVar.H);
            rlVar.a();
        }
        mk mkVar2 = this.Y;
        if (mkVar2 != null) {
            mkVar2.f23690a0 = false;
        }
        this.f35321i9 = false;
        if (this.f35236bb != null) {
            k9();
        }
    }

    public final void ca(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f35282f5;
        if (messagePreviewParams != null && this.Ea == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.G5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f35379n5;
                if (messageObject2 == this.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f35353l5, this.p5);
            }
            if (!this.f35282f5.isEmpty()) {
                this.f35275eb = this.Y.f23829y2;
                Context context = this.X0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f35282f5;
                TLRPC.User user = this.f35276f;
                TLRPC.Chat chat = this.f35264e;
                int i12 = this.currentAccount;
                ao aoVar = this.f35274ea;
                sn snVar = this.f35353l5;
                if (snVar != null && snVar.f40508f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                il ilVar = new il(this, context, this, this.A8, messagePreviewParams2, user, chat, i12, aoVar, i10, z10);
                this.Ea = ilVar;
                this.f35282f5.attach(ilVar);
                TLRPC.ChatFull chatFull = this.Z7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.ha) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.ha.peers.get(0).peer;
                }
                this.Ea.setSendAsPeer(peer);
                d7();
                this.X0.addView(this.Ea);
                if (this.f35275eb) {
                    mk mkVar = this.Y;
                    mkVar.T0 = true;
                    org.telegram.ui.Components.eg egVar = mkVar.U0;
                    if (egVar != null) {
                        egVar.u(true);
                    }
                    this.Y.s1();
                    this.D3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ke keVar;
        if ((this.R3 != 5 || (!this.f35467u6.isEmpty() && this.f35255d4 != 0)) && !this.f35524yc.f15396f && this.f35383n9) {
            mk mkVar = this.Y;
            if (!mkVar.E2) {
                if (!mkVar.f23704c1 || (keVar = mkVar.f23717e1) == null || keVar.getVisibility() != 0) {
                    if ((!mkVar.j0() || !mkVar.f23758l0.v) && !org.telegram.ui.ActionBar.n2.hasSheets(mkVar.O2) && this.N9 == 0.0f) {
                        vh.i iVar = this.X9;
                        if (iVar == null || !iVar.a()) {
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
        return false;
    }

    public final void cb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j3) {
        long j10;
        String str;
        fk fkVar = this.I1;
        if (fkVar == null) {
            return;
        }
        TLRPC.User user = fkVar.getAdapter().f11182w0;
        if (user != null) {
            j10 = user.f20043id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f19894id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.I1.getAdapter().f11182w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.T5, this.f35379n5, this.X3, null, this.f35353l5, z10, i10, 0, C8(), j3, N8());
        this.Y.setFieldText("");
        e9(false);
        getMediaDataController().increaseInlineRating(j10);
    }

    public final void cc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = this.A3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f35256d5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.Q4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.T5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.Q4 - 1), Boolean.valueOf(this.S4));
        this.A3 = org.telegram.ui.Components.yc.B(this, false, new bi.k8(this, arrayList2, arrayList, i10, 12), new te(this, messageObject, 7), this.f35274ea).j();
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f35304h4 && (i10 = this.R3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f35255d4;
    }

    public final void d7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.d7():void");
    }

    public final void d8(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && f7()) {
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i12);
                    if (sendingMediaInfo.inlineResult == null && sendingMediaInfo.videoEditedInfo == null) {
                        break;
                    }
                    i12++;
                } else if (!TextUtils.isEmpty(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption)) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.T5, this.f35379n5, this.X3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = C8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13 = i11 + 1) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.T5, this.f35379n5, this.X3, null, this.f35353l5, z10, i10, 0, C8(), 0L, N8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
            }
            if (!arrayList2.isEmpty()) {
                l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f35379n5, this.X3, null, this.f35353l5, false, true, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f35294g5);
                y6();
                if (i10 != 0) {
                    if (this.S3 == -1) {
                        this.S3 = 0;
                    }
                    this.S3 = arrayList.size() + this.S3;
                    Ec(true);
                }
            }
        }
    }

    public final void d9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Fa(this.f35256d5);
            Ha(this.f35256d5);
            return;
        }
        showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) this, 3, true));
    }

    public final void da(String str, boolean z10) {
        boolean z11;
        kk kkVar;
        boolean z12;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                M7();
                di.f4 f4Var = this.f35475v1;
                if (f4Var != null && f4Var.V) {
                    f4Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                di.f4 f4Var2 = this.f35488w1;
                if (f4Var2 != null && f4Var2.V) {
                    f4Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new se(this, str, 5), 200L);
                    return;
                }
                this.f35464u3 = str;
                this.f35452t3 = str;
                boolean contains = str.contains("@");
                R6(true);
                if (!this.actionBar.f21130n0) {
                    this.f35537zc.a(true, true);
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.f35300h0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f35265e0;
                    if (yVar != null) {
                        yVar.f(8);
                    }
                    hs hsVar = this.f35251d0;
                    if (hsVar != null) {
                        hsVar.b(false);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f35312i0;
                    if (yVar2 != null) {
                        yVar2.f(8);
                    }
                    if ((this.f35255d4 == 0 || (i10 = this.R3) == 3 || i10 == 8) && (v0Var = this.f35325j0) != null) {
                        v0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = this.m0;
                    if (v0Var3 != null && this.K9) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar3 = this.f35374n0;
                    if (yVar3 != null && this.L9) {
                        yVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = this.f35337k0;
                    if (v0Var4 != null) {
                        v0Var4.setVisibility(8);
                    }
                    this.f35385o0 = true;
                    Fc(0, 0, -1);
                    hc(false);
                }
                yk ykVar = this.f35386o1;
                if (ykVar != null) {
                    if (ykVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        ykVar.g(false);
                    }
                }
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.f35264e) || !ChatObject.isPublic(this.f35264e) || this.f35464u3 == null)) {
                    this.f35423r1 = 0;
                } else {
                    this.f35423r1 = 2;
                }
                this.W4 = false;
                if (this.O3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                di.i1 i1Var = this.f35410q1;
                if (i1Var != null) {
                    i1Var.h.clear();
                }
                org.telegram.ui.ActionBar.v0 v0Var5 = this.f35325j0;
                if (v0Var5 != null) {
                    this.f35263dc = true;
                    v0Var5.z(false);
                    this.f35263dc = false;
                }
                org.telegram.ui.ActionBar.v0 v0Var6 = this.f35325j0;
                if (v0Var6 != null) {
                    v0Var6.setSearchFieldCaption(null);
                    this.f35325j0.H(str, false);
                    this.f35325j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f35452t3, this.T5, this.L6, this.classGuid, 0, this.f35255d4, false, this.f35388o3, this.f35400p3, false, this.f35412q3);
                yc(0, true);
                this.f35253d2.e(true, true);
                Lb(true);
                kk kkVar2 = this.f35398p1;
                if (kkVar2 != null) {
                    kkVar2.b(!contains);
                    Hc();
                }
                if ((contains || z10) && this.f35464u3 != null && (kkVar = this.f35398p1) != null) {
                    int currentPosition = kkVar.f30404a.getCurrentPosition();
                    int i11 = this.f35423r1;
                    if (currentPosition != i11) {
                        this.f35398p1.f30404a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f35464u3);
                this.f35450t1.f25253f.N(true);
                View currentView = this.f35410q1.getCurrentView();
                if (currentView instanceof fo) {
                    ((fo) currentView).f36464a.Jc(this.f35464u3);
                }
            }
        }
    }

    public final void db(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        long j10;
        if (f7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.effect_id = j3;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f35294g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                j10 = 0;
            } else {
                j10 = j3;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.T5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = C8();
                of3.effect_id = j10;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = N8();
                of3.suggestionParams = this.f35294g5;
                getSendMessagesHelper().sendMessage(of3);
                j10 = 0;
            }
            y6();
        }
    }

    public final void dc() {
        boolean A9 = A9();
        SparseArray[] sparseArrayArr = this.W5;
        if (!A9) {
            if (this.actionBar.s() && this.f35226b1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f35226b1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.B0.setText(LocaleController.getString(R.string.ReportMessagesNoCaps));
            this.B0.setAlpha(0.5f);
            this.B0.setEnabled(false);
            return;
        }
        this.B0.setText(LocaleController.formatString(R.string.ReportMessagesCountNoCaps, LocaleController.formatPluralString("messages", size, new Object[0])));
        this.B0.setAlpha(1.0f);
        this.B0.setEnabled(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j3;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.d5 d5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        pj pjVar;
        mk mkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.zt editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ux0 ux0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        mk mkVar2;
        co coVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            coVar.c8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            uj ujVar = coVar.f35500x0;
            if (ujVar != null) {
                ujVar.e1();
            }
            org.telegram.ui.Components.ui uiVar = coVar.M9;
            if (uiVar != null) {
                uiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == coVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        coVar.finishFragment();
                        b.b(coVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                bi.t3 t3Var = coVar.J1;
                if (t3Var != null && t3Var.isShowing()) {
                    coVar.J1.dismiss(true);
                }
                if (z11 && (mkVar2 = coVar.Y) != null && mkVar2.t0()) {
                    coVar.Y.m0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f19916id = stickerSet2.f19923id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = coVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.ux0) && (tL_messages_stickerSet = (ux0Var = (org.telegram.ui.Components.ux0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f19923id == stickerSet2.f19923id) {
                            ux0Var.D0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(ux0Var.container, coVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.qc r10 = ycVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f29706j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.ux0 ux0Var2 = new org.telegram.ui.Components.ux0(coVar.getParentActivity(), coVar, tL_inputStickerSetID, null, coVar.Y, coVar.f35274ea);
                            final boolean z15 = z12;
                            coVar = this;
                            ux0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    co.i1(co.this, objArr, ux0Var2, z15, stickerSet2);
                                }
                            });
                            coVar.showDialog(ux0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                uj ujVar2 = coVar.f35500x0;
                if (ujVar2 != null) {
                    ujVar2.e1();
                }
                TextView textView = coVar.Q2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.j5 j5Var = coVar.D2[i13];
                    if (j5Var != null) {
                        j5Var.invalidate();
                    }
                }
                fk fkVar = coVar.I1;
                if (fkVar != null) {
                    fkVar.getListView().e1();
                }
                bi.o0 o0Var = coVar.L3;
                if (o0Var != null) {
                    o0Var.e1();
                }
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                mk mkVar3 = coVar.Y;
                if (mkVar3 != null && (editField = mkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                bi.c4[] c4VarArr = coVar.E2;
                bi.c4 c4Var = c4VarArr[0];
                if (c4Var != null) {
                    c4Var.invalidate();
                }
                bi.c4 c4Var2 = c4VarArr[1];
                if (c4Var2 != null) {
                    c4Var2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (coVar.Z7 != null && (chat = coVar.f35264e) != null && chat.f19896id == l4.longValue()) {
                    coVar.Z7.online_count = ((Integer) objArr[1]).intValue();
                    pj pjVar2 = coVar.f35213a1;
                    if (pjVar2 != null) {
                        pjVar2.m();
                        coVar.f35213a1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == coVar.T5 && (mkVar = coVar.Y) != null) {
                    mkVar.Q1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                mk mkVar4 = coVar.Y;
                if (mkVar4 != null) {
                    mkVar4.R1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (coVar.f35264e != null) {
                        TLRPC.Chat chat2 = coVar.getMessagesController().getChat(Long.valueOf(coVar.f35264e.f19896id));
                        if (chat2 != null) {
                            coVar.f35264e = chat2;
                        }
                    } else if (coVar.f35276f != null && (user = coVar.getMessagesController().getUser(Long.valueOf(coVar.f35276f.f20043id))) != null) {
                        coVar.f35276f = user;
                    }
                    coVar.Nc(true);
                }
                if (!coVar.F9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (coVar.f35264e != null && (pjVar = coVar.f35213a1) != null) {
                        pjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    coVar.o();
                    coVar.Wc(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && coVar.f35264e != null) {
                    coVar.y9();
                    TLRPC.Chat chat3 = coVar.getMessagesController().getChat(Long.valueOf(coVar.f35264e.f19896id));
                    if (chat3 != null) {
                        coVar.f35264e = chat3;
                        coVar.y9();
                        z10 = !coVar.F9();
                        coVar.hc(false);
                        mk mkVar5 = coVar.Y;
                        if (mkVar5 != null) {
                            mkVar5.b1(coVar.currentAccount, coVar.T5);
                        }
                        FlagSecureReason flagSecureReason = coVar.E3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                pj pjVar3 = coVar.f35213a1;
                if (pjVar3 != null && z10) {
                    pjVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    coVar.Qc(true);
                }
                org.telegram.ui.ActionBar.v0 v0Var = coVar.f35300h0;
                if (v0Var != null) {
                    if (ChatObject.isChannel(coVar.f35264e) && !ChatObject.isMonoForum(coVar.f35264e)) {
                        long j10 = coVar.f35264e.linked_monoforum_id;
                        if (j10 != 0 && ChatObject.canManageMonoForum(coVar.currentAccount, -j10)) {
                            z13 = true;
                        }
                    }
                    v0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!coVar.Oa) {
                    if (longValue == coVar.T5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = coVar.R3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !coVar.isPaused && LaunchActivity.U() == coVar && coVar.f35282f5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                coVar.ja(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            coVar.za(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(coVar.f35264e) && !coVar.f35264e.megagroup && (chatFull = coVar.Z7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                coVar.f35480v6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        coVar.w7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                coVar.I9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                coVar.t6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == coVar.T5) {
                        coVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (d5Var = coVar.parentLayout) != null && d5Var.getFragmentStack().size() > 1) {
                    coVar.finishFragment();
                } else {
                    coVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == coVar.a() && (booleanValue || coVar.parentLayout.getLastFragment() != coVar)) {
                    if (coVar.parentLayout.getLastFragment() == coVar) {
                        coVar.finishFragment();
                    } else {
                        coVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = coVar.f35391o6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = coVar.f35264e;
                    if (chat4 != null && chat4.f19896id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (coVar.f35414q5) {
                            ai aiVar = coVar.f35378n4;
                            if (aiVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(aiVar);
                                coVar.f35378n4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            ai aiVar2 = new ai(coVar, messageObject2, intValue3);
                            coVar.f35378n4 = aiVar2;
                            AndroidUtilities.runOnUIThread(aiVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = coVar.f35264e;
                    if (chat5 != null && chat5.f19896id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = coVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(coVar.f35264e, coVar.getMessagesController().getChatFull(coVar.f35264e.f19896id)));
                            int size2 = messageObject.messageOwner.replies.recent_repliers.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    break;
                                } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i17)) == MessageObject.getPeerId(peer)) {
                                    messageObject.messageOwner.replies.recent_repliers.remove(i17);
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            messageObject.messageOwner.replies.recent_repliers.add(0, peer);
                        }
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i18 = NotificationCenter.threadMessagesRead;
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && coVar.T5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = coVar.f35255d4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = coVar.f35341k4;
                            ArrayList arrayList2 = coVar.f35467u6;
                            if (intValue4 > i19) {
                                coVar.f35341k4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= coVar.f35341k4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        om omVar = coVar.A0;
                                        if (omVar != null) {
                                            omVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > coVar.l4) {
                                coVar.l4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= coVar.l4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        om omVar2 = coVar.A0;
                                        if (omVar2 != null) {
                                            omVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        coVar.X7(i10, objArr);
        coVar.Y7(i10, objArr);
        coVar.Z7(i10, objArr);
        coVar.a8(i10, objArr);
        coVar.b8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        bi.t3 t3Var = this.J1;
        if (t3Var != null && this.visibleDialog == t3Var) {
            t3Var.f31318j0.a0(false);
            this.J1.dismissInternal();
            this.J1.f31318j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J1 && dialog != this.f35235ba && !(dialog instanceof fi.k3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            Sb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void e8(View view) {
        f8(view, false);
    }

    public final void e9(boolean z10) {
        yb(false, null, null, null, null, null, false, z10);
    }

    public final boolean ea(String str, org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, int i10, int i11) {
        fi.y4 y4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f35264e == null || str == null || this.R3 != 0) {
            return false;
        }
        if (t1Var != null && (characterStyle != null || i11 != 1)) {
            y4Var = new fi.y4(this, i10, i11, characterStyle, t1Var);
        } else {
            y4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f35264e) != null) {
                try {
                    if (Kc == null) {
                        Kc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Lc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Kc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f35264e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = rh.f.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.f35264e) && i12 != d()) {
                                        return false;
                                    }
                                    this.f35456t7 = true;
                                    if (this.R3 == 2) {
                                        this.V8.V0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f35519y7 = W;
                                    if (W >= 0) {
                                        this.f35532z7 = parseInt;
                                    }
                                    Xa(parseInt, i10, true, 0, false, 0, num, g10, y4Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Lc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f35264e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f35297g8 = queryParameter2;
                                    O6(true);
                                    return true;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("comment")).intValue();
                    if (ChatObject.hasPublicLink(this.f35264e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.R3 == 2) {
                            this.V8.V0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Xa(intValue3, i10, true, 0, false, 0, null, null, y4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
            } else {
                try {
                    if (Mc == null) {
                        Mc = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Mc.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f35264e.f19896id || parseInt3 == 0) {
                        return false;
                    }
                    Uri parse3 = Uri.parse(str);
                    int intValue6 = Utilities.parseInt((CharSequence) parse3.getQueryParameter("thread")).intValue();
                    int intValue7 = Utilities.parseInt((CharSequence) parse3.getQueryParameter("topic")).intValue();
                    int intValue8 = Utilities.parseInt((CharSequence) parse3.getQueryParameter("comment")).intValue();
                    String queryParameter3 = parse3.getQueryParameter("task");
                    if (queryParameter3 != null) {
                        num2 = Utilities.parseInt((CharSequence) queryParameter3);
                    } else {
                        num2 = null;
                    }
                    byte[] g11 = rh.f.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.f35264e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f35243c4;
                            if (tL_forumTopic != null && tL_forumTopic.f19948id == findTopic.f19948id) {
                                return true;
                            }
                            return false;
                        }
                        this.f35456t7 = true;
                        if (this.R3 == 2) {
                            this.V8.V0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Xa(parseInt3, i10, true, 0, false, 0, num2, g11, y4Var);
                        return true;
                    }
                    return false;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.parseLong(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("thread")).intValue();
            long j3 = this.f35264e.f19896id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                aa(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f35456t7 = true;
            if (this.R3 == 2) {
                this.V8.V0(intValue9);
                finishFragment();
                return true;
            }
            Xa(intValue9, i10, true, 0, false, 0, null, null, y4Var);
            return true;
        }
    }

    public final void eb(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                if (!photoEntry.isVideo && (str2 = photoEntry.imagePath) != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    String str3 = photoEntry.path;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    }
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                CharSequence charSequence = photoEntry.caption;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                sendingMediaInfo.caption = str;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                arrayList2.add(sendingMediaInfo);
                photoEntry.reset();
            }
            l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f35379n5, this.X3, null, this.f35353l5, z11, true, null, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f35294g5);
            y6();
            mk mkVar = this.Y;
            if (mkVar != null) {
                mkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ec(true);
        }
    }

    public final void ec() {
        um umVar = this.X0;
        if (umVar != null && this.f35249ca == null) {
            if (this.f35274ea.f34518n == null || umVar.getBackgroundImage() == null) {
                if (this.X0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.X0.V(org.telegram.ui.ActionBar.j6.r0());
                }
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        i2.g.B(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void f8(View view, boolean z10) {
        boolean z11;
        ob(view);
        if (view != this.f35326j1) {
            z11 = true;
        } else {
            z11 = false;
        }
        g8(z10, z11, 0.2f);
    }

    public final void f9(boolean z10) {
        if (this.X2.getTag() != null && !this.f35254d3) {
            if (!this.j3 || this.f35280f3) {
                this.X2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f35292g3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f35292g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 0.0f));
                    this.f35292g3.addListener(new xi(this, 6));
                    this.f35292g3.setStartDelay(this.f35214a3);
                    this.f35292g3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f35292g3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f35292g3 = null;
                    }
                    this.X2.setAlpha(0.0f);
                }
                this.f35214a3 = 500;
            }
        }
    }

    public final void fa(MessageObject messageObject) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
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
        bundle.putInt("message_id", messageObject.getRealId());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new co(bundle));
        }
    }

    public final te fb(MessageObject messageObject, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        if (messageObject == null || messageObject.isOut() || !messageObject.isSecretMedia()) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message.destroyTime != 0 || (i10 = message.ttl) <= 0) {
            return null;
        }
        if (z10) {
            if (i10 != Integer.MAX_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 == Integer.MAX_VALUE) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i11;
            if (this.h != null) {
                getMessagesController().markMessageAsRead(this.T5, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.T5, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new te(this, messageObject, 1);
    }

    public final void fc() {
        TLRPC.User user;
        boolean z10;
        if (this.f35300h0 != null && (user = this.f35276f) != null && this.h == null && user.bot) {
            a0.i iVar = this.f35259d8;
            boolean z11 = false;
            if (iVar.m() != 0) {
                boolean z12 = false;
                z10 = false;
                for (int i10 = 0; i10 < iVar.m(); i10++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(i10);
                    for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
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
                this.f35300h0.K(30);
            } else {
                this.f35300h0.r(30);
            }
            if (z10) {
                this.f35300h0.K(31);
            } else {
                this.f35300h0.r(31);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.n1 n1Var = this.Q8;
        if (n1Var != null) {
            n1Var.f21238e = false;
            A7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f35264e;
    }

    public final void g7(Runnable runnable, zf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            r1 r1Var = new r1(this, aVar, runnable, 19);
            zh.s5 x10 = zh.s5.x(this.currentAccount, aVar.f51653a);
            if (!x10.f52600e) {
                x10.q(true, true, r1Var);
                return;
            } else {
                r1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void g8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        kh.h hVar;
        org.telegram.ui.Cells.t1 t1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.J8;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            t1Var2.setInvalidatesParent(z12);
            if (z12) {
                Na(t1Var2);
            }
        }
        this.X0.invalidate();
        this.f35500x0.invalidate();
        AnimatorSet animatorSet = this.P8;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.P8.cancel();
        }
        this.P8 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.H8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.K8 = 1.0f;
            this.L8 = 0.0f;
            ValueAnimator valueAnimator = this.f35237bc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.I8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.am0.d(new af(this, 3));
            }
        } else {
            float f11 = this.H8;
            this.L8 = f11 / max;
            this.I8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new ng(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f35326j1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.P8.playTogether(arrayList);
        this.P8.setInterpolator(org.telegram.ui.Components.pr.h);
        this.P8.setDuration(320L);
        View view2 = this.J8;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view2;
        } else {
            t1Var = null;
        }
        this.P8.addListener(new ah.r0(this, z12, t1Var, 4));
        if (this.J8 != null && this.K8 <= 0.0f) {
            ob(null);
        }
        this.P8.start();
    }

    public final void g9(boolean z10) {
        if (this.Y2.getTag() != null && !this.f35268e3) {
            if (!this.f35340k3 || this.f35280f3) {
                this.Y2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35315i3, 0.0f);
                    this.f35303h3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f35303h3.addUpdateListener(new oe(this, 1));
                    this.f35303h3.addListener(new xi(this, 8));
                    this.f35303h3.setStartDelay(this.f35214a3);
                    this.f35303h3.start();
                } else {
                    ValueAnimator valueAnimator = this.f35303h3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f35303h3 = null;
                    }
                    this.f35315i3 = 0.0f;
                    lc();
                }
                this.f35214a3 = 500;
            }
        }
    }

    public final void ga(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f35276f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f35276f.f20043id) {
                F(messageFwdHeader.saved_from_msg_id, messageObject.getId(), 0, 0, true, true);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = messageObject.messageOwner.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", messageObject.messageOwner.fwd_from.saved_from_msg_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new co(bundle));
        }
    }

    public final void gb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.gb(int, android.net.Uri, boolean):void");
    }

    public final void gc() {
        if (this.R1 == null) {
            return;
        }
        this.R1.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.c());
    }

    @Override
    public final org.telegram.ui.ActionBar.z4 getBackButtonState() {
        return org.telegram.ui.ActionBar.z4.f21588a;
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f20234c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.R3 == 0 && (call = this.W7) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.R3 == 2) {
            ArrayList arrayList = this.f35467u6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + A8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f35274ea;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        if (this.e7) {
            return null;
        }
        if (this.f35221aa) {
            this.f35221aa = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Qd));
        if (!A9()) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.f21071y8;
            arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f21090z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1024, null, null, null, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20964s8));
        pj pjVar = this.f35213a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pjVar != null ? pjVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        pj pjVar2 = this.f35213a1;
        org.telegram.ui.ActionBar.j5 titleTextView = pjVar2 != null ? pjVar2.getTitleTextView() : null;
        int i12 = org.telegram.ui.ActionBar.j6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(titleTextView, 8, null, null, null, null, i12));
        pj pjVar3 = this.f35213a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pjVar3 != null ? pjVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.f20668c2, org.telegram.ui.ActionBar.j6.f20686d2}, org.telegram.ui.ActionBar.j6.f20910pa));
        pj pjVar4 = this.f35213a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pjVar4 != null ? pjVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 67108864, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, i13));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.j6.f21071y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar3, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.j6.f21037w8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.j6.f21054x8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.j6.f21090z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35226b1, 4, null, null, null, null, i14));
        pj pjVar5 = this.f35213a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pjVar5 != null ? pjVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20816k4}, null, org.telegram.ui.ActionBar.j6.f20894oc));
        pj pjVar6 = this.f35213a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pjVar6 != null ? pjVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.l4}, null, org.telegram.ui.ActionBar.j6.f20912pc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f20937r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20782i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20800j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20820k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20838l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20856m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20875n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20891o8));
        org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.f5 f5Var3 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.f5 f5Var4 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.f5 f5Var5 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.f5 f5Var6 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{f5Var, f5Var2}, null, org.telegram.ui.ActionBar.j6.f20947ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.j6.f20696dc));
        if (f5Var != null) {
            Drawable[] k10 = f5Var.k();
            int i15 = org.telegram.ui.ActionBar.j6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, f5Var2.k(), null, i15));
            Drawable[] k11 = f5Var3.k();
            int i16 = org.telegram.ui.ActionBar.j6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, f5Var4.k(), null, i16));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.j6.Aa));
        if (this.f35274ea.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.j6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.j6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.j6.Fa));
        }
        uj ujVar = this.f35500x0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = f5Var5;
        drawableArr[i10] = f5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ujVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.j6.Ba));
        uj ujVar2 = this.f35500x0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = f5Var5;
        drawableArr2[i10] = f5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ujVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.j6.f20659bc));
        uj ujVar3 = this.f35500x0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i17 = org.telegram.ui.ActionBar.j6.f20786ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ujVar3, 4, clsArr3, themedPaint, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.j6.f20804jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f21033w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.j6.f20824kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20842lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20860mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20732fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 2, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.f20767hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.j6.f20759h3};
        int i18 = org.telegram.ui.ActionBar.j6.f20825kd;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr3, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20930qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20949rc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20968sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20986tc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.f21075yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20631a4, org.telegram.ui.ActionBar.j6.f20651b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.f21094zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20670c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20688d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20743g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i19 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr4, null, i19));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.j6.f20760h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i20 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr5, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.f20944r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.f20928qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.f20649b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20796j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, eVar, org.telegram.ui.ActionBar.j6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.j6.wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i21 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.f20638ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20695db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20714eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20640ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20731fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20678cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20749gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20697dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20766hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20715ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20785ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20733fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20750gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20803jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20823kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20768hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20787id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20929qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20805jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20948rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20878nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20967sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20895od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20843ld));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20861md));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20893ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20911pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20913pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20931qd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20841lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20859mb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20950rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20985tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20969sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21004ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20987td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21021vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21006ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21040wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21041wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21074yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21058xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21023vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21093zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21057xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21076yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21095zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, org.telegram.ui.ActionBar.j6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.V1, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20788ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21005uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20806je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21022vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.j6.f20951re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.j6.f20970se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20914pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.j6.f20932qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20713ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20730fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ga));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.j6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.j6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.j6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.j6.Ra));
        if (!this.f35274ea.h(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.f20937r0, null, org.telegram.ui.ActionBar.j6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.f21029w0, null, null, org.telegram.ui.ActionBar.j6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.j6.B0[0], org.telegram.ui.ActionBar.j6.B0[1], org.telegram.ui.ActionBar.j6.D0}, null, null, org.telegram.ui.ActionBar.j6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.j6.C0[0], org.telegram.ui.ActionBar.j6.C0[1], org.telegram.ui.ActionBar.j6.E0}, null, null, org.telegram.ui.ActionBar.j6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20629a1}, null, org.telegram.ui.ActionBar.j6.f20636a9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20740g1, org.telegram.ui.ActionBar.j6.f20757h1}, null, org.telegram.ui.ActionBar.j6.f20801j9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[1], null, null, org.telegram.ui.ActionBar.j6.f20783i9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.G0, null, null, org.telegram.ui.ActionBar.j6.f20857m9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20821k9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.o9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.H0, null, null, org.telegram.ui.ActionBar.j6.f20909p9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.I0, null, null, org.telegram.ui.ActionBar.j6.f20927q9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.T0}, null, org.telegram.ui.ActionBar.j6.f21002u9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.V0, org.telegram.ui.ActionBar.j6.W0}, null, org.telegram.ui.ActionBar.j6.v9));
        }
        fk fkVar = this.I1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i23 = org.telegram.ui.ActionBar.j6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fkVar, 0, null, themedPaint2, null, null, i23));
        fk fkVar2 = this.I1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.j6.f20777i3};
        int i24 = org.telegram.ui.ActionBar.j6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fkVar2, 0, null, null, drawableArr10, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.j3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20777i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20777i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20777i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Xk));
        int i25 = org.telegram.ui.ActionBar.j6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i25));
        int i26 = org.telegram.ui.ActionBar.j6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.j6.f20780i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i26));
        int i28 = org.telegram.ui.ActionBar.j6.f20807jf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i25));
        int i29 = org.telegram.ui.ActionBar.j6.f20661bf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20641ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.j6.f20660be));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.j6.f20827kf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20879nf));
        mk mkVar = this.Y;
        int i30 = org.telegram.ui.ActionBar.j6.f20863mf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.j6.f20897of));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.j6.f20680cf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.j6.f20642af));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20734ff));
        mk mkVar2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar2 != null ? mkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.He));
        mk mkVar3 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar3 != null ? mkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Ke));
        mk mkVar4 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar4 != null ? mkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Le));
        mk mkVar5 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar5 != null ? mkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Me));
        mk mkVar6 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar6 != null ? mkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Oe));
        mk mkVar7 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar7 != null ? mkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Pe));
        mk mkVar8 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar8 != null ? mkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Re));
        mk mkVar9 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar9 != null ? mkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Se));
        mk mkVar10 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar10 != null ? mkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.We));
        mk mkVar11 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar11 != null ? mkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Ne));
        mk mkVar12 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar12 != null ? mkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Je));
        mk mkVar13 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar13 != null ? mkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Ue));
        mk mkVar14 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mkVar14 != null ? mkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Qe));
        mk mkVar15 = this.Y;
        if (mkVar15 != null) {
            org.telegram.ui.Components.p41 trendingStickersAlert = mkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, new Drawable[]{this.Y.getStickersArrowDrawable()}, null, i26));
        }
        int i31 = 0;
        while (i31 < 2) {
            View view = i31 == 0 ? this.y3 : this.f35528z3;
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
            int i32 = org.telegram.ui.ActionBar.j6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i32));
            int i33 = org.telegram.ui.ActionBar.j6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.l6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i33));
            i31++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.f21018v7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.j6.f21036w7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.f21000u7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.f20982t7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.j6.f21053x7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.f21070y7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35527z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20716ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35527z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20690d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F2, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.fe));
        for (int i34 = 0; i34 < 2; i34++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.fe));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.D2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20751ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P2, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q2, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20751ge));
        ImageView imageView = this.J2;
        int i35 = org.telegram.ui.ActionBar.j6.f20698de;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L2, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U1, 8, null, null, null, null, i35));
        TextView textView = this.L1;
        int i36 = org.telegram.ui.ActionBar.j6.f20769he;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N1, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.f20925q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N1, 262148, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H1, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f21024ve));
        ImageView imageView2 = this.S2;
        int i37 = org.telegram.ui.ActionBar.j6.f21059xe;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i37));
        ImageView imageView3 = this.S2;
        int i38 = org.telegram.ui.ActionBar.j6.f21090z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView3, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T2, 8, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T2, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f21096ze));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20989tf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Sh));
        org.telegram.ui.Components.eo eoVar = this.Y0;
        int i39 = org.telegram.ui.ActionBar.j6.f20786ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(eoVar, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35227b2, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35397p0, 2048, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35500x0, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        di.r6 r6Var = this.Q;
        int i40 = org.telegram.ui.ActionBar.j6.f20842lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(r6Var, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35227b2, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y0, 536870912, null, null, null, null, i40));
        if (this.I1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ce));
            int i41 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"nameTextView"}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.A6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20852m4, org.telegram.ui.ActionBar.j6.f20871n4, org.telegram.ui.ActionBar.j6.f20887o4}, null, org.telegram.ui.ActionBar.j6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f21088z6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20787id));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20805jd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20691d7));
        }
        org.telegram.ui.Components.i40 i40Var = this.f35267e2;
        int i42 = org.telegram.ui.ActionBar.j6.f20933qf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i40Var, 32, null, null, null, null, i42));
        org.telegram.ui.Components.i40 i40Var2 = this.f35267e2;
        int i43 = org.telegram.ui.ActionBar.j6.f20915pf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i40Var2, 4, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35451t2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35451t2, 8, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"imageView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35451t2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35463u2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35463u2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X2, 0, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Z2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Z2, 0, null, null, null, null, i40));
        int i44 = org.telegram.ui.ActionBar.j6.f20784ia;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20802ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20822ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20840la));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20858ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20877na));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20892oa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.f20694da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20761h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20779i5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20924q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20818k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f21008uf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f21025vf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20644ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20663bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20682ch));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20701dh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20718eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20736fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20790ih));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20809jh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20829kh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20754gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20771hh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Dj));
        int i45 = org.telegram.ui.ActionBar.j6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f21060xf));
        mk mkVar16 = this.Y;
        if (mkVar16 != null && mkVar16.m0 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y.m0.f10128c, 4, new Class[]{fi.a0.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y.m0.f10128c, 4, new Class[]{fi.a0.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.j6.f21069y6));
        }
        xh.d dVar = this.f35286fa;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i46 = 0;
        while (i46 < size) {
            Object obj = arrayList.get(i46);
            i46++;
            ((org.telegram.ui.ActionBar.l6) obj).f21212o = this.f35274ea;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f35274ea.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint G = this.f35274ea.G(str);
        if (G != null) {
            return G;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final void h7() {
        if (this.f35528z3 != null) {
            return;
        }
        jl jlVar = new jl(this, getParentActivity(), this, this.f35274ea);
        this.f35528z3 = jlVar;
        this.X0.addView(jlVar, 17, w7.x5.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void h8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void h9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.i40 i40Var = this.f35362m2;
            if (i40Var != null) {
                i40Var.b(true);
            }
            ij ijVar = this.f35291g2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = this.f35314i2;
            if (i40Var2 != null) {
                i40Var2.b(true);
            }
        }
        org.telegram.ui.Components.i40 i40Var3 = this.f35351l2;
        if (i40Var3 != null) {
            i40Var3.b(true);
        }
        org.telegram.ui.Components.i40 i40Var4 = this.f35339k2;
        if (i40Var4 != null) {
            i40Var4.b(true);
        }
        org.telegram.ui.Components.i40 i40Var5 = this.f35451t2;
        if (i40Var5 != null) {
            i40Var5.b(true);
        }
        org.telegram.ui.Components.i40 i40Var6 = this.f35463u2;
        if (i40Var6 != null) {
            i40Var6.b(true);
        }
        org.telegram.ui.Components.i40 i40Var7 = this.f35376n2;
        if (i40Var7 != null) {
            i40Var7.b(true);
        }
        org.telegram.ui.Components.i40 i40Var8 = this.f35387o2;
        if (i40Var8 != null) {
            i40Var8.b(true);
        }
        org.telegram.ui.Components.pp ppVar = this.f35476v2;
        if (ppVar != null) {
            ppVar.a();
        }
        di.f4 f4Var = this.J0;
        if (f4Var != null) {
            f4Var.e(true);
        }
        di.f4 f4Var2 = this.L0;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        di.f4 f4Var3 = this.K0;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
    }

    public final void ha(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        long j3;
        long j10;
        org.telegram.ui.Components.d6 animation;
        Bitmap m10;
        if (t1Var == null) {
            int childCount = this.f35500x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f35500x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var2.getMessageObject().equals(messageObject)) {
                        t1Var = t1Var2;
                        break;
                    }
                }
                i10++;
            }
        }
        if (messageObject.isVideo()) {
            fb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f35274ea);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (t1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = t1Var.getPhotoImage().getAnimation()) != null && this.f35495w8 != null && this.f35457t8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f35495w8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.R3;
        ql qlVar = this.Fa;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f35467u6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().a2(arrayList, arrayList.indexOf(messageObject), this.T5, 0L, d(), qlVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = messageObject.type;
            long j11 = 0;
            if (i13 != 0) {
                j3 = this.T5;
            } else {
                j3 = 0;
            }
            if (i13 != 0) {
                j10 = this.L6;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = d();
            }
            t12.c2(messageObject, this, j3, j10, j11, qlVar);
        }
        h9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void hb(MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages X8 = X8(messageObject);
        boolean z12 = false;
        if (X8 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < X8.messages.size()) {
                    if (this.W5[i10].indexOfKey(X8.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    X8 = null;
                    break;
                }
            }
        }
        if (X8 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        t1Var.setDrawSelectionBackground(z11);
        if (X8 == null) {
            z12 = true;
        }
        t1Var.L3(true, z12, z10);
    }

    public final void hc(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.hc(boolean):void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.X3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f35264e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f35276f;
    }

    public final void i7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.Hb > 1000) {
            z10 = true;
        }
        ug ugVar = this.Ib;
        AndroidUtilities.cancelRunOnUIThread(ugVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        AndroidUtilities.runOnUIThread(ugVar, j3);
    }

    public final void i8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.p5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void i9() {
        ValueAnimator valueAnimator = this.f35299gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.Z2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.Z2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.Z2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new jf(this, w0Var2, 1));
            ofFloat.addListener(new bi.t(13, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f35299gb = ofFloat;
            ofFloat.start();
        }
    }

    public final void ia(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        int i10;
        if (getParentActivity() != null && (d5Var = this.parentLayout) != null && d5Var.getLastFragment() == this && !this.H4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f35264e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f19896id);
            } else {
                bundle.putLong("user_id", this.f35276f.f20043id);
            }
            bundle.putInt("chatMode", 2);
            co coVar = new co(bundle);
            coVar.H4 = new ArrayList(this.H4);
            coVar.J4 = new HashMap(this.J4);
            int size = this.H4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.H4.get(i11);
                MessageObject messageObject = (MessageObject) this.J4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f35391o6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    coVar.J4.put(num, messageObject);
                    coVar.zc();
                }
            }
            coVar.P4 = this.P4;
            if (this.f35304h4) {
                i10 = this.H4.size();
            } else {
                i10 = this.Q4;
            }
            coVar.Q4 = i10;
            coVar.S4 = this.S4;
            coVar.f35219a8 = this.f35219a8;
            coVar.Z7 = this.Z7;
            coVar.V8 = new nl(this, coVar);
            if (z10) {
                presentFragmentAsPreview(coVar);
                d7();
                return;
            }
            presentFragment(coVar, false);
        }
    }

    public final void ib(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f35274ea != null && this.f35249ca == null) {
            gg.b c10 = gg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.T5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.d4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.d4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.d4 d4Var = theme;
                ao aoVar = this.f35274ea;
                TLRPC.WallPaper wallPaper = aoVar.h;
                if (this.P5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aoVar.i(d4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new ve(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.T5);
            ao aoVar2 = this.f35274ea;
            org.telegram.ui.ActionBar.d4 d4Var2 = aoVar2.f34517f;
            if (this.P5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aoVar2.i(d4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void ic() {
        hc(false);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int w02;
        if (A9()) {
            org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w02 = resourceProvider.h0(org.telegram.ui.ActionBar.j6.f21037w8);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21037w8, true);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            z10 = this.Db;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.R3 != 5 || (!this.f35467u6.isEmpty() && this.f35255d4 != 0)) && !this.f35524yc.f15396f && this.f35383n9) {
            il ilVar = this.Ea;
            if (ilVar == null || !ilVar.f32258s) {
                vh.i iVar = this.X9;
                if (iVar == null || !iVar.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void j7() {
        int W8 = (int) (W8(org.telegram.ui.Components.s21.f30205c) + this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(W8);
        int b10 = w7.p.b(AndroidUtilities.dp(36.0f) + (this.X0.getMeasuredHeight() - W8), 0, this.X0.getMeasuredHeight());
        int measuredWidth = this.X0.getMeasuredWidth();
        Rect rect = Pc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.f35535za, this.f35500x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f35500x0.getMeasuredHeight() - this.Aa) - W8));
    }

    public final void j8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f35294g5;
        if (messageSuggestionParams != null) {
            Db(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.G5;
        if (webPage != null) {
            Eb(true, webPage, false);
            return;
        }
        sn snVar = this.f35353l5;
        if (snVar != null) {
            Cb(this.f35379n5, snVar);
            return;
        }
        MessageObject messageObject = this.f35379n5;
        if (messageObject != null && messageObject != this.X3) {
            Bb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f35282f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Ab(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null) {
            yb(true, null, messageObject2, null, null, null, false, true);
        } else {
            Eb(false, null, true);
        }
    }

    public final boolean j9(boolean z10) {
        kl klVar;
        kl klVar2 = this.f35502x2;
        if (klVar2 == null || klVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.dh dhVar = this.M0;
        if (dhVar != null && (klVar = this.f35502x2) != null) {
            dhVar.i(klVar, false, z10);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.H2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.A2 = false;
                this.f35502x2.setTag(1);
                return true;
            }
        }
    }

    public final void ja(int i10, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f19904id);
            } else {
                TLRPC.Chat chat = this.f35264e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f19896id);
                } else {
                    bundle.putLong("user_id", this.f35276f.f20043id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            co coVar = new co(bundle);
            if (this.f35304h4) {
                og.d.a(coVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            coVar.V8 = new qj(this);
            presentFragment(coVar, false);
        }
    }

    public final void jb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                jb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f35500x0 && view != this.X0) {
            view.setEnabled(z10);
        }
    }

    public final void jc() {
        int i10;
        org.telegram.ui.Components.ub ubVar;
        zk zkVar;
        mk mkVar;
        if (this.D9 && this.f35500x0 != null) {
            float f7 = 0.0f;
            if (this.f35406pa <= 0 || this.Da != 0.0f) {
                float V8 = V8(AndroidUtilities.dp(7.0f));
                yk ykVar = this.f35386o1;
                if (ykVar != null) {
                    i10 = AndroidUtilities.dp(ykVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float z82 = (z8() * AndroidUtilities.dp(43.0f)) + V8 + i10;
                float f10 = this.f35445s9;
                this.f35458t9 = z82;
                this.f35445s9 = W8(org.telegram.ui.Components.s21.f30203a) + AndroidUtilities.dp(4.0f) + this.v9 + z82;
                if (this.actionBar.getVisibility() == 0 || this.f35261da != null) {
                    this.f35445s9 += this.actionBar.getMeasuredHeight();
                }
                this.f35470u9 = 0;
                this.f35445s9 = this.f35445s9 + this.f35535za + this.f35496w9;
                if (this.Da != 0.0f && (mkVar = this.Y) != null && mkVar.getVisibility() == 0) {
                    float f11 = this.f35445s9;
                    float measuredHeight = this.Da * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f35445s9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.Z2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f35500x0.getTranslationY() + this.f35445s9) + this.A9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f35445s9;
                    float f13 = this.A9;
                    this.f35445s9 = f12 + f13;
                    this.f35470u9 = (int) (this.f35470u9 + f13);
                }
                dk dkVar = this.X2;
                if (dkVar != null) {
                    dkVar.setTranslationY((((this.f35500x0.getTranslationY() - f7) + this.f35445s9) + this.f35521y9) - AndroidUtilities.dp(4.0f));
                }
                lc();
                uj ujVar = this.f35500x0;
                if (ujVar != null && this.f35525z0 != null && this.A0 != null) {
                    int paddingTop = ujVar.getPaddingTop();
                    int paddingBottom = this.f35500x0.getPaddingBottom();
                    n7();
                    if (this.f35500x0.getPaddingTop() != paddingTop || this.f35500x0.getPaddingBottom() != paddingBottom) {
                        r9();
                        q9(2);
                    }
                    this.f35500x0.setTopGlowOffset((int) ((this.f35445s9 - this.f35470u9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f35445s9) {
                        int childCount = this.f35500x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f35500x0.getChildAt(i11);
                            this.f35500x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.f35445s9;
                                if (childAt.getTop() > f14) {
                                    this.f35500x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!F9() && !this.D4 && this.J7 != null && this.f35500x0 != null && ((zkVar = this.P1) == null || zkVar.getVisibility() != 0)) {
                        this.f35500x0.scrollBy(0, (int) (f10 - this.f35445s9));
                    }
                }
                this.D9 = false;
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29698w;
                if (qcVar != null && (ubVar = qcVar.f29702e) != null) {
                    ubVar.updatePosition();
                }
                n7();
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2 = null;
        l8(str, null);
        if (f7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.invert_media = z11;
                of2.payStars = j10;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f35294g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.T5, false, false, true, 0, 0, null, -1, j10, N8(), this.f35294g5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.T5, this.f35379n5, this.X3, null, this.f35353l5, this.p5, z10, i10, 0, null, C8(), j3, z11, j10, N8(), this.f35294g5);
            y6();
        }
    }

    public final void k7() {
        int i10;
        if (this.f35213a1 != null) {
            float actionModeFactor = (1.0f - this.f35537zc.f15395e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f35213a1.setScaleX(lerp);
            this.f35213a1.setScaleY(lerp);
            this.f35213a1.setAlpha(actionModeFactor);
            pj pjVar = this.f35213a1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pjVar.setVisibility(i10);
        }
    }

    public final void k9() {
        dl dlVar = this.f35236bb;
        if (dlVar == null) {
            return;
        }
        this.f35236bb = null;
        dlVar.e();
        if (dlVar.getReactionsWindow() != null && dlVar.getReactionsWindow().f697a != null) {
            dlVar.getReactionsWindow().f697a.animate().alpha(0.0f).setDuration(180L).start();
        }
        dlVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new fh(9, this, dlVar)).setDuration(180L).start();
    }

    public final void ka(TLRPC.Chat chat) {
        boolean z10;
        di.f4 f4Var = this.f35475v1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        di.f4 f4Var2 = this.f35488w1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new fh(3, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21130n0) {
            this.f35537zc.a(true, true);
            org.telegram.ui.ActionBar.v0 v0Var = this.f35300h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f35265e0;
            if (yVar != null) {
                yVar.f(8);
            }
            hs hsVar = this.f35251d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f35312i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = this.f35325j0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = this.m0;
            if (v0Var3 != null && this.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f35374n0;
            if (yVar3 != null && this.L9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = this.f35337k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            this.f35385o0 = true;
            Fc(0, 0, -1);
            hc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = this.f35325j0;
        if (v0Var5 != null) {
            this.f35263dc = true;
            this.W4 = false;
            v0Var5.z(false);
            this.f35263dc = false;
        }
        Za(chat, null);
        yc(0, true);
    }

    public final void kb(boolean z10) {
        lb(z10, false, true);
    }

    public final void kc(boolean z10) {
        a0.i iVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.Za == null) {
            this.Za = new a0.i();
        }
        a0.i iVar2 = this.Ya;
        if (iVar2 == null) {
            this.Ya = new a0.i();
        } else {
            iVar2.b();
        }
        this.A0.P.clear();
        this.Za.b();
        a0.i iVar3 = null;
        a0.i iVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            iVar = this.f35506x6;
            arrayList = this.f35467u6;
            z11 = true;
            if (i10 >= size) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.getDialogId() == messageObject2.getDialogId() && messageObject.getId() == messageObject2.getId()) {
                        break;
                    }
                    i11++;
                } else {
                    messageObject = null;
                    break;
                }
            }
            if (messageObject2.stableId == 0) {
                if (messageObject == null) {
                    messageObject2.checkMediaExistance();
                } else {
                    messageObject2.mediaExists = messageObject.mediaExists;
                    messageObject2.attachPathExists = messageObject.attachPathExists;
                }
            }
            if (messageObject != null) {
                messageObject2.isSaved = messageObject.isSaved;
                if (this.A0.N && messageObject2.stableId != 0) {
                    messageObject.copyStableParams(messageObject2);
                } else {
                    messageObject2.copyStableParams(messageObject);
                }
            } else if (messageObject2.stableId == 0) {
                int i12 = Jc;
                Jc = i12 + 1;
                messageObject2.stableId = i12;
            }
            messageObject2.isOutOwnerCached = null;
            TLRPC.Message message2 = messageObject2.messageOwner;
            if (message2 != null) {
                message2.out = true;
            }
            messageObject2.isOutOwner();
            if (messageObject2.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupIdForUse());
                if (groupedMessages2 == null) {
                    groupedMessages2 = new MessageObject.GroupedMessages();
                    groupedMessages2.reversed = this.Pa;
                    long groupId = messageObject2.getGroupId();
                    groupedMessages2.groupId = groupId;
                    iVar.k(groupedMessages2, groupId);
                } else if (iVar3 == null || iVar3.h(messageObject2.getGroupId()) < 0) {
                    if (iVar4 == null) {
                        iVar4 = new a0.i();
                    }
                    iVar4.k(groupedMessages2, messageObject2.getGroupId());
                }
                if (iVar3 == null) {
                    iVar3 = new a0.i();
                }
                iVar3.k(groupedMessages2, groupedMessages2.groupId);
                if (groupedMessages2.getPosition(messageObject2) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < groupedMessages2.messages.size()) {
                            if (groupedMessages2.messages.get(i13).getId() == messageObject2.getId()) {
                                break;
                            }
                            i13++;
                        } else {
                            groupedMessages2.messages.add(messageObject2);
                            break;
                        }
                    }
                }
            } else if (messageObject2.getGroupIdForUse() != 0) {
                messageObject2.messageOwner.grouped_id = 0L;
                messageObject2.localSentGroupId = 0L;
            }
            this.A0.P.add(messageObject2);
            this.Za.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (iVar3 != null) {
            for (int i14 = 0; i14 < iVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) iVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new f6(2));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f35412q3 != null && TextUtils.isEmpty(this.f35452t3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f35412q3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
                            arrayList3.add(messageObject3);
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            MessageObject messageObject4 = (MessageObject) arrayList3.get(i17);
            if (!this.Za.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.A0.P.add(messageObject4);
                this.Za.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.A0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.A0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Za.d(messageObject6.getId())) {
                        this.A0.P.add(i18, messageObject6);
                        this.Za.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.A0.P, new f6(3));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.A0.P.size()) {
            MessageObject messageObject8 = (MessageObject) this.A0.P.get(i19);
            if (this.Pa && messageObject8 != null && i19 == 0) {
                Da(messageObject8, i19);
                i19++;
            }
            if (!this.Pa && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.Ya.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.w1.k(messageObject8.dateKeyInt, this.Ya);
            }
            arrayList4.add(messageObject8);
            if (this.Pa && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject8, i19);
                i19++;
            }
            if (!this.Pa && i19 >= this.A0.P.size() - 1) {
                Da(messageObject8, this.A0.P.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.A0.O = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.A0.T();
            this.A0.O(true);
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.G6 || !arrayList.isEmpty() || this.A0.f39306w >= 0) {
                z11 = false;
            }
            Pb(z11);
            if (this.f35500x0 != null) {
                G7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.G6 || !arrayList.isEmpty() || this.A0.f39306w >= 0)) {
                    this.f35500x0.setEmptyView(this.Q0);
                    uj ujVar = this.f35500x0;
                    ujVar.J0(ujVar.t1());
                    return;
                }
                this.Q0.setVisibility(8);
                this.f35500x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.T5, this.f35379n5, this.X3, null, this.f35353l5, true, false, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, C8(), 0L, false, j3, N8(), this.f35294g5);
        y6();
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ec(true);
        }
    }

    public final void l7() {
        boolean z10;
        di.i1 i1Var;
        if (this.f35261da != null) {
            return;
        }
        int i10 = 0;
        if (this.f35524yc.f15395e >= 1.0f && ((i1Var = this.f35410q1) == null || i1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        di.eb ebVar = this.X0.L;
        if (!z10) {
            i10 = 4;
        }
        ebVar.setVisibility(i10);
    }

    public final void l8(CharSequence charSequence, ArrayList arrayList) {
        if (this.p5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.p5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.p5.isMediaEmpty()) {
                MessageObject messageObject2 = this.p5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                mk mkVar = this.Y;
                if (mkVar != null) {
                    this.p5.editingMessage = mkVar.getFieldText();
                    MessageObject messageObject3 = this.p5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.p5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void l9() {
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.qc qcVar = this.A3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        jl jlVar = this.f35528z3;
        if (jlVar != null) {
            jlVar.e(0, true);
        }
    }

    public final void la(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i11;
        di.f4 f4Var = this.f35475v1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        di.f4 f4Var2 = this.f35488w1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new se(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21130n0) {
            this.f35537zc.a(true, true);
            org.telegram.ui.ActionBar.v0 v0Var2 = this.f35300h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f35265e0;
            if (yVar != null) {
                yVar.f(8);
            }
            hs hsVar = this.f35251d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f35312i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            if ((this.f35255d4 == 0 || (i11 = this.R3) == 3 || i11 == 8) && (v0Var = this.f35325j0) != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = this.m0;
            if (v0Var3 != null && this.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f35374n0;
            if (yVar3 != null && this.L9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = this.f35337k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            this.f35385o0 = true;
            Fc(0, 0, -1);
            hc(false);
        }
        if ((this.f35255d4 == 0 || this.f35304h4 || (i10 = this.R3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f35276f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W4 = z11;
            org.telegram.ui.ActionBar.v0 v0Var5 = this.f35325j0;
            if (v0Var5 != null) {
                v0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var6 = this.f35325j0;
        if (v0Var6 != null) {
            v0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f35452t3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.T5, this.L6, this.classGuid, 0, this.f35255d4, false, this.f35388o3, this.f35400p3, !TextUtils.isEmpty(str), this.f35412q3);
        yc(0, true);
    }

    public final void lb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.lb(boolean, boolean, boolean):void");
    }

    public final void lc() {
        int i10;
        ck ckVar = this.Y2;
        if (ckVar == null) {
            return;
        }
        ckVar.setTranslationX(R8() / 2.0f);
        this.Y2.setTranslationY((((this.f35500x0.getTranslationY() + this.f35445s9) + this.f35534z9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f35534z9, -this.Y2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.Y2.setAlpha(this.f35315i3 * clamp);
        ck ckVar2 = this.Y2;
        if (this.f35315i3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ckVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.Y2.setScaleX(lerp);
        this.Y2.setScaleY(lerp);
    }

    @Override
    public final boolean m() {
        return this.f35431r9;
    }

    public final void m7() {
        float f7;
        org.telegram.ui.Components.of ofVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + W8(org.telegram.ui.Components.s21.f30205c) + this.v.c();
        mk mkVar = this.Y;
        if (mkVar != null && (ofVar = mkVar.m0) != null) {
            ofVar.setTranslationY(-inputBubbleHeight);
        }
        fk fkVar = this.I1;
        if (fkVar != null) {
            if (fkVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            fkVar.setTranslationY(f7);
        }
    }

    public final void m8(boolean z10) {
        TLRPC.Chat chat = this.f35264e;
        if (chat != null && this.Z7 != null && !ChatObject.isNotInChat(chat) && !this.f35264e.creator) {
            TLRPC.ChatFull chatFull = this.Z7;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f35421r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f35421r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.Z7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.Z7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f35421r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f35421r == 0) {
                getMessagesController().checkChatInviter(this.f35264e.f19896id, false);
            }
        }
    }

    public final void m9() {
        boolean z10;
        Fc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f35452t3, this.T5, this.L6, this.classGuid, 0, this.f35255d4, this.f35388o3, this.f35400p3, this.f35412q3);
        if (TextUtils.isEmpty(this.f35452t3) && this.f35412q3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f35439s3 = z10;
        this.f35385o0 = z10;
        hc(false);
        Ic();
    }

    public final void ma(TLRPC.User user) {
        boolean z10;
        di.f4 f4Var = this.f35475v1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        di.f4 f4Var2 = this.f35488w1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new sg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21130n0) {
            this.f35537zc.a(true, true);
            org.telegram.ui.ActionBar.v0 v0Var = this.f35300h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f35265e0;
            if (yVar != null) {
                yVar.f(8);
            }
            hs hsVar = this.f35251d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f35312i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = this.f35325j0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = this.m0;
            if (v0Var3 != null && this.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f35374n0;
            if (yVar3 != null && this.L9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = this.f35337k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            this.f35385o0 = true;
            Fc(0, 0, -1);
            hc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = this.f35325j0;
        if (v0Var5 != null) {
            this.f35263dc = true;
            this.W4 = false;
            v0Var5.z(false);
            this.f35263dc = false;
        }
        Za(null, user);
        yc(0, true);
    }

    public final void mb(int i10, int i11, String str) {
        this.L7 = i10;
        this.N7 = true;
        this.O7 = 0L;
        this.P7 = str;
        this.S7 = i11;
        this.M7 = true;
    }

    public final void mc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f35219a8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f35219a8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != null) {
            if (z10 && this.T0 == null) {
                ui uiVar = new ui(getParentActivity(), getResourceProvider(), this);
                this.T0 = uiVar;
                w7.z5.b(uiVar, 0.02f, 1.2f);
                this.T0.setOnClickListener(new we(this, 12));
            }
            ui uiVar2 = this.T0;
            if (uiVar2 != null) {
                if (!z10) {
                    uiVar2.setVisibility(8);
                    return;
                }
                uiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f35219a8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f35219a8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f35276f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        m11 m11Var = new m11(formatString.substring(indexOf, indexOf2));
                        if (m11Var.f38570c != -1) {
                            m11Var.f38570c = -1;
                            m11Var.invalidateSelf();
                        }
                        m11Var.a(503316480);
                        m11Var.setBounds(0, 0, m11Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(m11Var), indexOf, indexOf2, 33);
                    }
                }
                this.T0.setCustomText(spannableStringBuilder);
                this.T0.setOverrideTextMaxWidth(di.f4.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.T0.getParent() != null && (!z10 || this.T0.getParent() != this.R0)) {
                    ((ViewGroup) this.T0.getParent()).removeView(this.T0);
                }
                if (z10) {
                    ViewParent parent = this.T0.getParent();
                    LinearLayout linearLayout = this.R0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.T0, w7.x5.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.co n() {
        return this.f35213a1;
    }

    public final void n7() {
        float c10;
        if (this.f35500x0 != null) {
            if (this.Oa && this.f35261da == null) {
                c10 = AndroidUtilities.navigationBarHeight;
            } else {
                c10 = this.v.c() + W8(org.telegram.ui.Components.s21.f30205c) + AndroidUtilities.dp(16.0f) + this.Aa + this.f35448sc;
            }
            int i10 = (int) this.f35445s9;
            org.telegram.ui.Components.w21 w21Var = this.R1;
            if (w21Var != null) {
                w21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            ih.h hVar = this.f35487w0;
            boolean z10 = this.f35500x0.X1;
            RecyclerView recyclerView = hVar.f12366a;
            int i11 = (int) c10;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ah.g(hVar, i12, 10));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            ih.e eVar = this.N3;
            if (eVar != null) {
                RectF rectF = eVar.f12344b;
                rectF.set(W8(org.telegram.ui.Components.s21.f30204b), i10 - this.G, 0.0f, c10 - this.Aa);
                eVar.f12345c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void n8(org.telegram.messenger.MessageObject r61, java.util.ArrayList r62, java.util.ArrayList r63, java.util.ArrayList r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.n8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n9() {
        this.X0.invalidate();
        Iterator it = this.f35512y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void na(long j3) {
        int i10 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f35213a1.e(true, false);
            } else if (getMessagesController().isCommunity(j3)) {
                showDialog(new gi.k0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new co(bundle));
                }
            }
        } else if (j3 != getUserConfig().getClientUserId()) {
            if (j3 == a()) {
                this.f35213a1.e(true, false);
                return;
            }
            Bundle e7 = w.f.e(j3, "user_id");
            if (this.h != null && j3 == this.f35276f.f20043id) {
                e7.putLong("dialog_id", this.T5);
            }
            ProfileActivity profileActivity = new ProfileActivity(e7, null);
            TLRPC.User user = this.f35276f;
            if (user != null && user.f20043id == j3) {
                i10 = 1;
            }
            profileActivity.N4(i10);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j3);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void nb(long j3) {
        this.f35255d4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19917id = (int) j3;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void nc() {
        final long j3;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.S0 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.f35264e)) {
            if (this.f35264e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f35264e.f19896id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f35264e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j10 = this.f35264e.send_paid_messages_stars;
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f19896id), LocaleController.formatNumber(j10, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f19896id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(zh.v7.R0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.S0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final co f36420b;

                    {
                        this.f36420b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                co.a1(j10, this.f36420b);
                                return;
                            default:
                                co.s0(j10, this.f36420b);
                                return;
                        }
                    }
                });
                return;
            }
            this.S0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f35219a8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.io ioVar = this.S0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                ioVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.T5))), LocaleController.getString(R.string.MessagePremiumUnlock), new ah.f(8));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.io ioVar2 = this.S0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ioVar2.c(z10, false, AndroidUtilities.replaceTags(zh.v7.R0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.T5), LocaleController.formatNumber(this.f35219a8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final co f36420b;

                    {
                        this.f36420b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                co.a1(j3, this.f36420b);
                                return;
                            default:
                                co.s0(j3, this.f36420b);
                                return;
                        }
                    }
                });
            } else {
                this.S0.c(false, false, null, null, null);
            }
        } else {
            this.S0.c(false, false, null, null, null);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.R3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((n2Var instanceof co) && ((co) n2Var).x9()) {
                return false;
            }
        }
        return this.H6;
    }

    @Override
    public final void o() {
        if (!this.f35304h4) {
            if (this.f35276f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35276f.f20043id));
                if (user != null) {
                    this.f35276f = user;
                } else {
                    return;
                }
            } else if (this.f35264e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35264e.f19896id));
                if (chat != null) {
                    this.f35264e = chat;
                } else {
                    return;
                }
            }
            pj pjVar = this.f35213a1;
            if (pjVar != null) {
                pjVar.b();
            }
        }
    }

    public final void o7() {
        FrameLayout frameLayout = this.Q0;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.S.getInputBubbleHeight() + this.v.b() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int o8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.f35467u6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.J7);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            MessageObject messageObject = (MessageObject) arrayList4.get(i15);
            int approximateHeightCached = messageObject.getApproximateHeightCached();
            arrayList5.add(Integer.valueOf(approximateHeightCached));
            if (messageObject.isSponsored() || i15 == indexOf) {
                if (i15 == indexOf) {
                    i14 = i12;
                }
                arrayList7.add(Integer.valueOf(i15));
                arrayList6.add(Integer.valueOf(i12));
                arrayList8.add(Integer.valueOf(i13));
            }
            if (messageObject.hasValidGroupIdFast()) {
                if (!hashSet.contains(Long.valueOf(messageObject.getGroupId()))) {
                    hashSet.add(Long.valueOf(messageObject.getGroupId()));
                }
            }
            i13++;
            i12 += approximateHeightCached;
        }
        int size = arrayList7.size();
        if (indexOf >= 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (size - i10 <= 0) {
            return 0;
        }
        hashSet.clear();
        int i16 = 0;
        while (indexOf >= 0) {
            MessageObject messageObject2 = (MessageObject) arrayList4.get(indexOf);
            int intValue = ((Integer) arrayList5.get(indexOf)).intValue();
            if (messageObject2.hasValidGroupIdFast()) {
                if (!hashSet.contains(Long.valueOf(messageObject2.getGroupId()))) {
                    hashSet.add(Long.valueOf(messageObject2.getGroupId()));
                }
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.J7) {
                    i11 = i16;
                } else {
                    int i17 = -1;
                    int i18 = 0;
                    int i19 = -1;
                    int i20 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    while (i18 < arrayList7.size()) {
                        int intValue2 = ((Integer) arrayList7.get(i18)).intValue();
                        int i24 = i16;
                        if (intValue2 >= indexOf && (i19 == -1 || i19 > intValue2)) {
                            i21 = ((Integer) arrayList6.get(i18)).intValue();
                            i20 = ((Integer) arrayList8.get(i18)).intValue();
                            i19 = intValue2;
                        }
                        if (intValue2 <= indexOf && (i17 == -1 || i17 < intValue2)) {
                            i22 = ((Integer) arrayList6.get(i18)).intValue();
                            i23 = ((Integer) arrayList8.get(i18)).intValue();
                            i17 = intValue2;
                        }
                        i18++;
                        i16 = i24;
                    }
                    i11 = i16;
                    int i25 = -1;
                    if (i19 != -1) {
                        if (Math.abs(i19 - indexOf) > this.Jb + 1 && Math.abs(i20 - i11) > this.Jb + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i17 == i25 || (Math.abs(i17 - indexOf) > this.Jb + 1 && Math.abs(i23 - i11) > this.Jb + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
                        return indexOf;
                    }
                }
                indexOf--;
                i16 = i11;
            }
            i16--;
            i14 -= intValue;
            if (!messageObject2.isSponsored()) {
            }
            i11 = i16;
            indexOf--;
            i16 = i11;
        }
        hashSet.clear();
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < arrayList4.size()) {
            MessageObject messageObject3 = (MessageObject) arrayList4.get(i26);
            int intValue3 = ((Integer) arrayList5.get(i26)).intValue();
            if (!messageObject3.hasValidGroupIdFast()) {
                i27++;
                i28 += intValue3;
            } else if (!hashSet.contains(Long.valueOf(messageObject3.getGroupId()))) {
                hashSet.add(Long.valueOf(messageObject3.getGroupId()));
                i27++;
            }
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.J7) {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                arrayList3 = arrayList7;
            } else {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                int i29 = 0;
                int i30 = -1;
                int i31 = -1;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                while (i29 < arrayList7.size()) {
                    int intValue4 = ((Integer) arrayList7.get(i29)).intValue();
                    ArrayList arrayList9 = arrayList7;
                    if (intValue4 >= i26 && (i33 == -1 || i33 > intValue4)) {
                        i35 = ((Integer) arrayList6.get(i29)).intValue();
                        i34 = ((Integer) arrayList8.get(i29)).intValue();
                        i33 = intValue4;
                    }
                    if (intValue4 <= i26 && (i30 == -1 || i30 < intValue4)) {
                        i31 = ((Integer) arrayList6.get(i29)).intValue();
                        i32 = ((Integer) arrayList8.get(i29)).intValue();
                        i30 = intValue4;
                    }
                    i29++;
                    arrayList7 = arrayList9;
                }
                arrayList3 = arrayList7;
                int i36 = -1;
                if (i33 != -1) {
                    if (Math.abs(i33 - i26) >= this.Jb + 1 && Math.abs(i34 - i27) >= this.Jb + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.Jb + 1 && Math.abs(i32 - i27) >= this.Jb + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
                    return i26;
                }
            }
            i26++;
            arrayList5 = arrayList;
            arrayList4 = arrayList2;
            arrayList7 = arrayList3;
        }
        return -1;
    }

    public final void o9() {
        if (!this.D9) {
            this.D9 = true;
            um umVar = this.X0;
            if (umVar != null) {
                umVar.invalidate();
            }
            uj ujVar = this.f35500x0;
            if (ujVar != null) {
                ujVar.invalidate();
            }
        }
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(W8(org.telegram.ui.Components.s21.f30205c) + this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(16.0f));
        }
        v7();
    }

    public final void oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f35274ea);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().f2(arrayList, 0, 0, false, new ul(this, createVideoThumbnail, arrayList), this);
            return;
        }
        l8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.T5, this.f35379n5, this.X3, null, this.f35353l5, null, 0, this.p5, true, 0, 0, false, false, null, C8(), 0L, 0L, N8(), this.f35294g5);
        y6();
    }

    public final void ob(View view) {
        View view2 = this.J8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.w0)) {
                ((org.telegram.ui.Cells.w0) view2).setInvalidateWithParent(null);
            }
            this.J8 = view;
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void oc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.oc(boolean):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        bi.t3 t3Var;
        org.telegram.ui.Components.tn tnVar;
        String str;
        bi.t3 t3Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (t3Var2 = this.J1) != null) {
                    org.telegram.ui.Components.ni niVar = t3Var2.f31367y0;
                    if (niVar instanceof ji.r) {
                        ji.r rVar = (ji.r) niVar;
                        if (intent != null && intent.getData() != null) {
                            ji.v3 v3Var = rVar.f14159r;
                            Uri data = intent.getData();
                            if (data == null) {
                                v3Var.getClass();
                                return;
                            } else if (v3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new fi.j4(26, v3Var, data));
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                }
                if (i10 == 1) {
                    if (intent != null && intent.getData() != null) {
                        bi.t3 t3Var3 = this.J1;
                        if (t3Var3 != null) {
                            org.telegram.ui.Components.ni niVar2 = t3Var3.f31367y0;
                            if (niVar2 instanceof ji.r) {
                                ji.r rVar2 = (ji.r) niVar2;
                                if (intent.getData() != null) {
                                    rVar2.f14159r.d2(intent.getData());
                                    return;
                                }
                                return;
                            }
                        }
                        Uri data2 = intent.getData();
                        if (data2.toString().contains("video")) {
                            try {
                                str = AndroidUtilities.getPath(data2);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                str = null;
                            }
                            if (str == null) {
                                tb();
                            }
                            if (this.f35414q5) {
                                this.f35444s8 = str;
                            } else {
                                oa(null, str);
                            }
                        } else if (this.p5 == null && this.R3 == 1) {
                            org.telegram.ui.Components.e5.M(getParentActivity(), this.T5, new m4(5, this, data2), this.f35274ea);
                        } else {
                            l8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.T5, this.f35379n5, this.X3, this.f35353l5, null, null, null, null, 0, this.p5, true, 0, this.R3, C8());
                        }
                        y6();
                        return;
                    }
                    tb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        tb();
                        return;
                    }
                    if (this.p5 == null && this.R3 == 1) {
                        if (intent.getData() != null) {
                            bi.t3 t3Var4 = this.J1;
                            if (t3Var4 != null) {
                                t3Var4.dismiss();
                            }
                            org.telegram.ui.Components.e5.M(getParentActivity(), this.T5, new org.telegram.ui.Components.d5(this) {
                                public final co f38961b;

                                {
                                    this.f38961b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            co coVar = this.f38961b;
                                            coVar.l8(null, null);
                                            coVar.gb(i12, intent.getData(), z10);
                                            coVar.y6();
                                            return;
                                        default:
                                            co coVar2 = this.f38961b;
                                            coVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                coVar2.gb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            coVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f35274ea);
                            return;
                        } else if (intent.getClipData() != null) {
                            bi.t3 t3Var5 = this.J1;
                            if (t3Var5 != null) {
                                t3Var5.dismiss();
                            }
                            org.telegram.ui.Components.e5.M(getParentActivity(), this.T5, new org.telegram.ui.Components.d5(this) {
                                public final co f38961b;

                                {
                                    this.f38961b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            co coVar = this.f38961b;
                                            coVar.l8(null, null);
                                            coVar.gb(i12, intent.getData(), z10);
                                            coVar.y6();
                                            return;
                                        default:
                                            co coVar2 = this.f38961b;
                                            coVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                coVar2.gb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            coVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f35274ea);
                            return;
                        } else {
                            tb();
                        }
                    } else {
                        l8(null, null);
                        if (intent.getData() != null) {
                            gb(0, intent.getData(), true);
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                gb(0, clipData.getItemAt(i12).getUri(), true);
                            }
                        } else {
                            tb();
                        }
                    }
                    bi.t3 t3Var6 = this.J1;
                    if (t3Var6 != null) {
                        t3Var6.dismiss();
                    }
                    y6();
                    return;
                } else if (i10 == 28 && (t3Var = this.J1) != null && (tnVar = t3Var.m0) != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = tnVar.f28779a;
                    if (tnVar.f30672k1 != -1 && tnVar.f30670j1 != null) {
                        if (intent != null) {
                            if (intent.getData() != null) {
                                uri = intent.getData();
                            } else if (intent.getClipData() != null) {
                                ClipData clipData2 = intent.getClipData();
                                if (clipData2.getItemCount() > 0) {
                                    uri = clipData2.getItemAt(0).getUri();
                                }
                            }
                        }
                        if (uri == null) {
                            org.telegram.messenger.w1.p(R.string.UnsupportedAttachment, new org.telegram.ui.Components.yc(tnVar.f28780b.container, f6Var), f6Var);
                            return;
                        }
                        tnVar.e0(tnVar.f30672k1, new sh.c(uri));
                        org.telegram.ui.Components.bn bnVar = tnVar.f30670j1;
                        if (bnVar != null) {
                            bnVar.dismiss(true);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            E7();
            bi.t3 t3Var7 = this.J1;
            if (t3Var7 != null) {
                t3Var7.f31318j0.g0(i10, intent, this.V7);
            }
            this.V7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        gl glVar;
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.Components.qf qfVar;
        org.telegram.ui.Components.of ofVar;
        vm vmVar;
        ah.f0 f0Var;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29698w;
        if (qcVar != null) {
            org.telegram.ui.Components.ub ubVar = qcVar.f29702e;
            if (ubVar instanceof org.telegram.ui.Components.bc) {
                if (z10) {
                    ((org.telegram.ui.Components.bc) ubVar).f();
                    qcVar.b();
                    return false;
                }
                return false;
            }
        }
        k51 k51Var = this.Z9;
        if (k51Var != null && !k51Var.f37947b0) {
            if (z10) {
                k51Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            ah.g0 g0Var = this.Y9;
            if (g0Var != null && (f0Var = g0Var.f548b) != null && f0Var.getReactionsWindow() != null) {
                if (z10) {
                    g0Var.f548b.e();
                    return false;
                }
            } else if (st.q().E) {
                if (z10) {
                    st.q().o();
                    return false;
                }
            } else {
                il ilVar = this.Ea;
                if (ilVar != null && ilVar.f32258s) {
                    if (z10) {
                        ilVar.a(true);
                        return false;
                    }
                } else if (this.f35524yc.f15396f) {
                    if (z10) {
                        Lb(false);
                        return false;
                    }
                } else if (this.Q8 != null) {
                    if (z10) {
                        A7(true);
                        return false;
                    }
                } else if (!X6(z10, false)) {
                    if (b9()) {
                        if (z10 && (vmVar = this.f35248c9) != null && vmVar.y()) {
                            this.f35248c9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.s()) {
                            if (z10) {
                                z7(false);
                                return false;
                            }
                        } else {
                            mk mkVar = this.Y;
                            if (mkVar != null && mkVar.t0()) {
                                if (z10) {
                                    this.Y.m0(true);
                                    return false;
                                }
                            } else {
                                mk mkVar2 = this.Y;
                                if (mkVar2 != null && mkVar2.v()) {
                                    if (z10) {
                                        mk mkVar3 = this.Y;
                                        fi.c0 c0Var = mkVar3.f23758l0;
                                        if (c0Var != null) {
                                            c0Var.setOpened(false);
                                        }
                                        if (!mkVar3.j0() && (ofVar = mkVar3.m0) != null) {
                                            ofVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    mk mkVar4 = this.Y;
                                    if (mkVar4 == null || (qfVar = mkVar4.E0) == null || !qfVar.closeCreationLinkDialog(z10)) {
                                        if (this.R3 == 6 && (b2Var = ig.v.d) != null && b2Var.isShowing()) {
                                            if (z10) {
                                                ig.v.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f35264e) && !this.T3 && this.R1 != null && d() != 0) {
                                            if (z10) {
                                                this.R1.m(0L, this.f35403p7);
                                                return false;
                                            }
                                        } else if (this.R3 == 5 && !"hello".equalsIgnoreCase(this.Q3) && !"away".equalsIgnoreCase(this.Q3) && (this.f35467u6.isEmpty() || this.f35255d4 == 0)) {
                                            if (z10) {
                                                Qb();
                                                return false;
                                            }
                                        } else if (this.R3 == 6 && this.Y.w()) {
                                            if (z10) {
                                                wb(new qf(this, 19));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21130n0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.wc.f15396f) {
                                                if (z10) {
                                                    ta();
                                                }
                                            } else {
                                                if (z10 && (glVar = this.f35228b3) != null) {
                                                    glVar.d(false);
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
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        k9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f35467u6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f35264e)))) {
                    org.telegram.ui.Components.d31.u(messageObject, false);
                }
            }
        }
        this.F3 = false;
        l9();
        ArrayList arrayList2 = org.telegram.ui.Components.d31.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        of.e eVar = this.Ab;
        if (eVar != null) {
            eVar.a(false);
            this.Ab = null;
        }
        this.E3.detach();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.F3 = true;
        super.onBecomeFullyVisible();
        if (this.O) {
            showDialog(this.N);
        }
        if (this.f35275eb) {
            mk mkVar = this.Y;
            if (mkVar != null) {
                mkVar.I0();
                mk mkVar2 = this.Y;
                mkVar2.T0 = false;
                org.telegram.ui.Components.eg egVar = mkVar2.U0;
                if (egVar != null) {
                    egVar.u(false);
                }
            }
            this.f35275eb = false;
        }
        if (this.f35475v1 != null) {
            AndroidUtilities.runOnUIThread(new me(this, 1), 600L);
        }
        if (this.f35426r4 && !this.f35440s4) {
            this.f35440s4 = true;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.yc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f29706j = 5000;
            M.v = new me(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ah.g0 g0Var = this.Y9;
        if (g0Var != null && g0Var.d()) {
            this.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j3;
        long j10;
        pj pjVar = this.f35213a1;
        if (pjVar != null) {
            pjVar.getViewTreeObserver().addOnPreDrawListener(new ei(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        A7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C1() || !PhotoViewer.t1().Q1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f35274ea);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i10 = playingMessageObject.type;
                    long j11 = 0;
                    if (i10 != 0) {
                        j3 = this.T5;
                    } else {
                        j3 = 0;
                    }
                    if (i10 != 0) {
                        j10 = this.L6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = d();
                    }
                    if (t12.e2(playingMessageObject, null, null, null, null, null, null, 0, this.Fa, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.t1().l4 = this;
                    }
                    h9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.C1() && PhotoViewer.t1().f33638l2) {
                PhotoViewer t13 = PhotoViewer.t1();
                if (t13.F2.y()) {
                    if (t13.Z2) {
                        t13.F2.N(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(t13.F2, t13.T4);
                    t13.F2 = null;
                }
                PhotoViewer.t1().G0(false, true);
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
        nk nkVar = this.W9;
        float f7 = 0.0f;
        if (z10 && this.R9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var instanceof co) {
                this.D4 = true;
                co coVar = (co) n2Var;
                coVar.T9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.X0.setSkipBackgroundDrawing(true);
                this.f35213a1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f35213a1.getAvatarImageView().setAlpha(0.0f);
                this.f35213a1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.S9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                mk mkVar = this.Y;
                if (mkVar != null) {
                    mkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                qk qkVar = this.R;
                if (qkVar != null) {
                    qkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                mk mkVar2 = this.Y;
                if (mkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = mkVar2.getMeasuredHeight();
                }
                qk qkVar2 = this.R;
                if (qkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = qkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                mk mkVar3 = coVar.Y;
                if (mkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = mkVar3.getMeasuredHeight();
                }
                qk qkVar3 = this.R;
                if (qkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = qkVar3.getMeasuredHeight();
                }
                this.O9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ah.m0(10, this, coVar));
                jc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.V9 = animatorSet;
                animatorSet.addListener(new di.y5(this, coVar, runnable));
                this.V9.setDuration(300L);
                this.V9.setInterpolator(org.telegram.ui.Components.pr.f29493f);
                this.V9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(nkVar, 200L);
                return this.V9;
            }
        }
        if (this.f35334ja && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var2 instanceof eg1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                n2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f35358la = f7;
                ofFloat.addUpdateListener(new cj(0, this));
                this.f35347ka = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                um umVar = this.X0;
                if (umVar != null) {
                    umVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V9 = animatorSet2;
                animatorSet2.addListener(new ej(this, z10, runnable));
                this.V9.setDuration(150L);
                this.V9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(nkVar, 200L);
                } else {
                    this.V9.start();
                }
                return this.V9;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var = this.N;
        if (b2Var != null && dialog == b2Var) {
            getMessagesController().deleteDialog(this.T5, 0);
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var != null && !d5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.pu0 pu0Var;
        super.onFragmentDestroy();
        ih.e eVar = this.N3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f12351w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ih.d dVar = (ih.d) longSparseArray.valueAt(i10);
                if (dVar.f12338i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        mk mkVar = this.Y;
        if (mkVar != null) {
            mkVar.B0();
        }
        pj pjVar = this.f35213a1;
        if (pjVar != null && (pu0Var = pjVar.f25070c0) != null) {
            pu0Var.b(pjVar.G);
        }
        fk fkVar = this.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            this.I1.getAdapter().P();
        }
        bi.t3 t3Var = this.J1;
        if (t3Var != null) {
            t3Var.dismissInternal();
        }
        st q6 = st.q();
        if (q6.f40565l == this.f35346k9) {
            q6.W = null;
            q6.f40552a0 = null;
            q6.Y = null;
            q6.f40565l = null;
            q6.f40556c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.F9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.G9);
        getNotificationCenter().onAnimationFinish(this.H9);
        getNotificationCenter().onAnimationFinish(this.I9);
        l9();
        me meVar = this.L5;
        if (meVar != null) {
            AndroidUtilities.cancelRunOnUIThread(meVar);
            this.L5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f35384na);
        MessagesController messagesController = getMessagesController();
        long j3 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j3, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.Ra;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Ra = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.Sa;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.Sa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.R3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.T5), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f35276f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.E3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f35276f != null) {
            getMessagesController().cancelLoadFullUser(this.f35276f.f20043id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        bi.t3 t3Var2 = this.J1;
        if (t3Var2 != null) {
            t3Var2.v1();
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f35264e)) {
            getMessagesController().startShortPoll(this.f35264e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.Z7.linked_chat_id)), this.classGuid, true);
            }
        }
        vm vmVar = this.f35248c9;
        if (vmVar != null) {
            vmVar.f(false);
        }
        wj wjVar = this.f35513y0;
        if (wjVar != null) {
            wjVar.N();
        }
        vk vkVar = this.f35497wa;
        if (vkVar != null) {
            vkVar.b();
        }
        this.f35235ba = null;
        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Oc ? 1 : 0);
            org.telegram.ui.ActionBar.d5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.o9) parentLayout2.getPulledDialogs().get(i11)).f29031b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Oc = false;
        of.e eVar2 = this.Ab;
        if (eVar2 != null) {
            eVar2.a(false);
            this.Ab = null;
        }
        this.ga.onFragmentDestroy();
        p11 p11Var = this.f35247c8;
        if (p11Var != null) {
            p11Var.b(true);
            this.f35247c8 = null;
        }
        zh.a4 a4Var = this.f35420qc;
        if (a4Var != null) {
            a4Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f35420qc);
            this.f35420qc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f35348kb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f35495w8, null, null, false);
        }
        zh.a4 a4Var = this.f35420qc;
        if (a4Var != null) {
            a4Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f35420qc);
            this.f35420qc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        bi.t3 t3Var;
        org.telegram.ui.Components.gl glVar;
        bi.t3 t3Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        mk mkVar = this.Y;
        boolean z12 = false;
        if (mkVar != null && i10 == 2 && mkVar.f23744i3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(mkVar.Q).sendCurrentLocation(mkVar.f23738h3, mkVar.f23744i3);
            }
            mkVar.f23744i3 = null;
            mkVar.f23738h3 = null;
        }
        fk fkVar = this.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            hg.k1 adapter = this.I1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f11182w0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.I0.start();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i10 == 4) {
            bi.t3 t3Var3 = this.J1;
            if (t3Var3 != null) {
                t3Var3.f31318j0.Y();
            }
            org.telegram.ui.Components.lp lpVar = this.f35235ba;
            if (lpVar != null && (viVar = lpVar.Y) != null) {
                viVar.f31318j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (t3Var = this.J1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                t3Var.D1();
            } else if (i10 == 30 && (glVar = t3Var.f31332o0) != null && t3Var.f31367y0 == glVar && t3Var.isShowing()) {
                t3Var.f31332o0.Y();
            }
        } else if ((i10 == 17 || i10 == 18) && (t3Var2 = this.J1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = t3Var2.f31318j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.J1.f31318j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f35274ea);
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yh(this));
                i2.g.B(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(2);
        } else if (((i10 != 101 && i10 != 102) || this.f35276f == null) && (i10 != 103 || this.f35264e == null)) {
        } else {
            int i11 = 0;
            while (true) {
                if (i11 < iArr.length) {
                    if (iArr[i11] != 0) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (iArr.length > 0 && z10) {
                if (i10 == 103) {
                    org.telegram.ui.Components.voip.d2.l(this.f35264e, null, this.Y7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f35276f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f35219a8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f35276f.f20043id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        mk mkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.x9[] x9VarArr;
        ah.y yVar;
        super.onResume();
        d7();
        this.E9 = System.currentTimeMillis();
        if (this.f35431r9 && getSendMessagesHelper().getImportingHistory(this.T5) != null) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(getParentActivity(), null, this, this.f35274ea);
            w40Var.setOnHideListener(new jg(this, 8));
            showDialog(w40Var);
            this.f35431r9 = false;
        }
        H6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        W6();
        bi.t3 t3Var = this.J1;
        if (t3Var != null) {
            t3Var.y1();
        }
        um umVar = this.X0;
        boolean z12 = true;
        if (umVar != null) {
            org.telegram.ui.Components.l81 l81Var = umVar.v;
            if (l81Var != null) {
                l81Var.c(true);
            }
            umVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new me(this, 24), 1000L);
        }
        z8 z8Var = new z8(this, 2);
        this.Zb = z8Var;
        setBulletinDelegate(z8Var);
        G6(false);
        TLRPC.PhotoSize photoSize = this.f35492w5;
        if (photoSize != null && (yVar = this.f35212a0) != null) {
            ((org.telegram.ui.Components.po[]) yVar.f730b)[0].f29475f.k(ImageLocation.getForObject(photoSize, this.f35517y5), "50_50", ImageLocation.getForObject(this.f35505x5, this.f35517y5), "50_50_b", this.f35466u5, null, this.f35379n5, this.f35479v5);
        }
        if (this.C5 != null && (x9VarArr = this.B2) != null) {
            x9VarArr[0].k(ImageLocation.getForObject(this.C5, this.E5), "50_50", ImageLocation.getForObject(this.D5, this.E5), "50_50_b", this.f35530z5, null, (MessageObject) this.J4.get(Integer.valueOf(this.L4)), this.A5);
            x9VarArr[0].setHasBlur(this.B5);
        }
        if (this.R3 == 0) {
            getNotificationsController().setOpenedDialogId(this.T5, d());
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j3, z10, true);
        if (this.Q5) {
            if (this.S5 && (messageObject = this.K7) != null) {
                if (this.f35500x0 != null) {
                    int i10 = this.T7;
                    if (i10 == -9000) {
                        i10 = K8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f35525z0.i1(this.f35467u6.indexOf(this.K7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f35525z0.i1(this.f35467u6.indexOf(this.K7) + this.A0.J, i10, z11);
                }
            } else {
                O9(false);
            }
            this.S5 = false;
            this.Q5 = false;
            this.K7 = null;
        }
        this.f35414q5 = false;
        this.f35427r5 = false;
        a7(false);
        if (this.f35441s5) {
            this.f35441s5 = false;
            om omVar = this.A0;
            if (omVar != null) {
                omVar.O(false);
            }
        }
        pj pjVar = this.f35213a1;
        if (pjVar != null) {
            pjVar.getViewTreeObserver().addOnPreDrawListener(new ei(this, 0));
        }
        A6(false, false);
        if (this.Y != null && this.R3 == 0 && this.f35322ia != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.T5 && (arrayList2 = this.f35322ia.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new s80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f35322ia.entities;
            }
            CharSequence r10 = ChatActivityEnterView.r(arrayList, this.f35322ia.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (r10 != null && r10.length() > 0 && r10.charAt(0) == '@') {
                r10 = TextUtils.concat(" ", r10);
            }
            this.Y.f1(r10, true);
            this.f35322ia = null;
        }
        rk rkVar = this.O0;
        if (rkVar != null && rkVar.getVisibility() != 0 && !this.actionBar.f21130n0 && this.R3 != 7 && !org.telegram.ui.ActionBar.n2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        mk mkVar2 = this.Y;
        if (mkVar2 != null) {
            mkVar2.E0();
        }
        if (this.f35276f != null) {
            this.f35404p8 = System.currentTimeMillis();
            this.f35416q8 = 0L;
        }
        if (this.f35444s8 != null) {
            AndroidUtilities.runOnUIThread(new me(this, 3));
        }
        if (this.f35500x0 != null && ((mkVar = this.Y) == null || !mkVar.r0())) {
            this.f35500x0.setOnItemLongClickListener(this.Ja);
            this.f35500x0.setOnItemClickListener(this.Ka);
            this.f35500x0.setLongClickable(true);
        }
        org.telegram.ui.Components.i51.h = false;
        TLRPC.User user = this.f35276f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.i51.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.Z7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.Z7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.i51.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                org.telegram.ui.Components.i51.h = (chatFull.bot_info.isEmpty() || (chat = this.f35264e) == null || !chat.megagroup) ? false : false;
            }
        }
        Nc(false);
        Ib();
        if (this.N9 != 0.0f) {
            this.N9 = 0.0f;
            this.f35500x0.invalidate();
        }
        this.E3.attach();
        zh.a4 a4Var = this.f35420qc;
        if (a4Var != null) {
            a4Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.sd sdVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.O5) {
                this.O5 = true;
                uc();
            }
            iArr = this.F9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.N5 = false;
            if (!z11) {
                this.P5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f35276f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            mk mkVar = this.Y;
            if (mkVar != null && (sdVar = mkVar.R1) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                mkVar.R1 = null;
            }
        }
        d7();
        this.F9 = getNotificationCenter().setAnimationInProgress(this.F9, iArr);
    }

    public final void p7() {
        int i10;
        float f7 = this.Ac.f15395e;
        org.telegram.ui.Components.d40 d40Var = this.f35450t1;
        int i11 = 8;
        if (d40Var != null) {
            d40Var.setAlpha(f7);
            org.telegram.ui.Components.d40 d40Var2 = this.f35450t1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d40Var2.setVisibility(i10);
        }
        bi.o0 o0Var = this.L3;
        if (o0Var != null) {
            float f10 = 1.0f - f7;
            o0Var.setAlpha(f10);
            bi.o0 o0Var2 = this.L3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            o0Var2.setVisibility(i11);
        }
    }

    public final void p9() {
        boolean z10;
        Rect rect;
        if (this.X0 != null) {
            if (this.Ua <= 0 && this.Va <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            qh.i iVar = this.v;
            float b10 = iVar.b();
            le.m mVar = iVar.f44678b;
            int max = (int) Math.max(0.0f, (b10 * mVar.f15423a) - AndroidUtilities.dp(29.0f));
            um umVar = this.X0;
            di.eb ebVar = umVar.L;
            Rect rect2 = this.Gc;
            if (ebVar != null) {
                rect2.set(0, 0, umVar.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                this.X0.L.setClipBounds(rect2);
            }
            if (this.f35500x0 != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f35500x0.getTop());
                uj ujVar = this.f35500x0;
                if (ujVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                ujVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(iVar.v, iVar.b() * mVar.f15423a) - AndroidUtilities.dp(29.0f))));
                kh.f fVar = this.X;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void pa() {
        this.O5 = true;
        this.fragmentBeginToShow = true;
        this.V9 = null;
        this.X0.invalidate();
        this.X0.setSkipBackgroundDrawing(false);
        this.S9 = false;
        this.fragmentView.setAlpha(1.0f);
        this.f35213a1.setTranslationY(0.0f);
        this.f35213a1.getAvatarImageView().setScaleX(1.0f);
        this.f35213a1.getAvatarImageView().setScaleY(1.0f);
        this.f35213a1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void pb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f35243c4 = tL_forumTopic;
        this.f35215a4 = arrayList;
        MessageObject messageObject = (MessageObject) i2.g.h(1, arrayList);
        this.X3 = messageObject;
        this.f35379n5 = messageObject;
        this.f35341k4 = i11;
        this.l4 = i12;
        this.f35364m4 = Math.max(1, i11);
        this.f35255d4 = this.X3.getId();
        this.f35269e4 = i10;
        this.f35281f4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35304h4 = z10;
        MessageObject messageObject2 = this.f35379n5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35293g4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        zc();
        Qc(false);
        hc(false);
    }

    public final void pc() {
        MessageObject messageObject;
        if (this.f35276f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                uj ujVar = this.f35500x0;
                if (ujVar != null) {
                    int childCount = ujVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f35500x0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.getId() < 0) {
                            long j3 = messageObject.messageOwner.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f35404p8, this.f35416q8, this.f35276f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f34103h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f35276f, null, null, messageObject2.getId());
            }
        }
    }

    @Override
    public final void q(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j3) {
        if (photoEntry == null) {
            return;
        }
        this.f35485vc.a(false, true);
        MessageObject messageObject = this.p5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.p5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f35294g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.p5.messageOwner.suggested_post);
            }
            if (!zh.s5.U(this.currentAccount, messageSuggestionParams.amount)) {
                Tb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            me meVar = new me(this, 21);
            this.f35415q7 = meVar;
            AndroidUtilities.runOnUIThread(meVar, 3000L);
        }
        l8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.e5.b0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                co coVar = co.this;
                MessageObject messageObject2 = coVar.p5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = coVar.f35294g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(coVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(coVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, coVar.T5, coVar.p5, coVar.X3, null, coVar.f35353l5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, coVar.C8(), photoEntry2.effectId, l4.longValue(), coVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(coVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, coVar.T5, coVar.p5, coVar.X3, null, coVar.f35353l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, coVar.C8(), photoEntry2.effectId, l4.longValue(), coVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(coVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, coVar.T5, coVar.p5, coVar.X3, null, coVar.f35353l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, coVar.C8(), photoEntry2.effectId, l4.longValue(), coVar.N8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(coVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, coVar.T5, coVar.f35379n5, coVar.X3, null, coVar.f35353l5, photoEntry2.entities, photoEntry2.ttl, coVar.p5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, coVar.C8(), photoEntry2.effectId, l4.longValue(), coVar.N8(), coVar.f35294g5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(coVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, coVar.T5, coVar.f35379n5, coVar.X3, null, coVar.f35353l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, coVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, coVar.C8(), photoEntry2.effectId, l4.longValue(), coVar.N8(), coVar.f35294g5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(coVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, coVar.T5, coVar.f35379n5, coVar.X3, null, coVar.f35353l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, coVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, coVar.C8(), photoEntry2.effectId, l4.longValue(), coVar.N8(), coVar.f35294g5);
                }
                coVar.y6();
            }
        }, j3);
    }

    public final void q7() {
        if (this.X0 == null) {
            return;
        }
        this.f35448sc = C6(false);
        this.f35460tc = C6(true);
        this.S.setInputBubbleHeight(this.f35448sc);
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
    }

    public final org.telegram.ui.Cells.a0 q8(int i10, boolean z10) {
        MessageObject messageObject;
        uj ujVar = this.f35500x0;
        if (ujVar != null) {
            int childCount = ujVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f35500x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f35445s9 - this.f35470u9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f35500x0.getMeasuredHeight() - this.Aa) {
                            return null;
                        }
                    }
                    return (org.telegram.ui.Cells.a0) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void q9(int i10) {
        co coVar = this.f35261da;
        if (coVar != null) {
            coVar.q9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            yf.c0 c0Var = this.Dc;
            if (c0Var.f50082c == 0) {
                c0Var.invalidate();
            }
            c0Var.f50082c = i10 | c0Var.f50082c;
        }
    }

    public final void qa(long j3, boolean z10) {
        if (this.R1 != null && UserObject.isBotForum(this.f35276f)) {
            this.R1.setAllTopicsHidden(true);
        }
        this.M5.put(j3, 1);
        Q7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 0, new di.q9(this, j3, z10, 5), new le(this, j3, 2));
        this.A0.O(false);
    }

    public final void qb() {
        AndroidUtilities.shakeViewSpring(this.f35500x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        mk mkVar = this.Y;
        for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(mkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void qc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new di.y0(this, messageObject, z10, 11));
    }

    public final void r7() {
        int i10;
        co coVar = this.f35261da;
        if (coVar != null) {
            coVar.r7();
        }
        int i11 = AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + ((int) V8(AndroidUtilities.dp(7.0f)));
        yk ykVar = this.f35386o1;
        if (ykVar != null) {
            i10 = AndroidUtilities.dp(ykVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(z8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.c());
        bi.o0 o0Var = this.L3;
        if (o0Var != null) {
            o0Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.d40 d40Var = this.f35450t1;
        if (d40Var != null) {
            d40Var.f25252e.setPadding(0, dp2, 0, dp3);
            d40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        ih.f fVar = this.K3;
        if (fVar != null) {
            kh.f fVar2 = fVar.f12354a;
            fVar2.setFadeZoneTop(dp2);
            fVar2.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.t00 t00Var = this.f35241c2;
        if (t00Var != null) {
            t00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.xw0 xw0Var = this.f35253d2;
        if (xw0Var != null) {
            xw0Var.f32779a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final void r8() {
        if (this.f35344k7) {
            return;
        }
        this.f35344k7 = true;
        getMessagesController().checkSensitive(this, this.T5, new me(this, 26), new qf(this, 19));
    }

    public final void r9() {
        this.f35432ra = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean ra() {
        if (this.H4.size() != 1 || this.Y3 == null || ((Integer) this.H4.get(0)).intValue() != this.Y3.getId()) {
            return false;
        }
        return true;
    }

    public final void rb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f35274ea);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        TLRPC.User user = this.f35276f;
        if (user != null) {
            if (user.bot) {
                b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String j3 = org.telegram.messenger.w1.j(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, gf.b.c());
                TLRPC.User user2 = this.f35276f;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, j3, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new hg.c2(this, i10, messageObject, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
    }

    public final void rc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f35506x6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                wj wjVar = this.f35513y0;
                if (wjVar != null) {
                    wjVar.V(groupedMessages);
                }
                for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                    groupedMessages.messages.get(i10).forceUpdate = true;
                    if (z10) {
                        groupedMessages.messages.get(i10).reactionsChanged = true;
                    }
                }
                this.A0.O(true);
                return;
            }
            MessageObject messageObject3 = (MessageObject) this.f35391o6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.A0.N) {
                a0.i iVar = this.Za;
                if (iVar != null) {
                    messageObject2 = (MessageObject) iVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.A0.P.indexOf(messageObject2);
                if (messageObject2 != null && z10) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    om omVar = this.A0;
                    omVar.m(omVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f35467u6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                om omVar2 = this.A0;
                omVar2.m(omVar2.J + indexOf2);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.V7 = bundle.getString("path");
    }

    public final void s6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.q6;
            ArrayList arrayList = (ArrayList) sparseArray.get(id2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(id2, arrayList);
            }
            int id3 = messageObject.getId();
            if (!arrayList.contains(Integer.valueOf(id3))) {
                arrayList.add(Integer.valueOf(id3));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void s7() {
        int i10;
        float f7 = (1.0f - this.f35524yc.f15395e) * (1.0f - this.wc.f15395e);
        this.f35326j1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f35326j1.setAlpha(f7);
        kh.h hVar = this.f35326j1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final boolean s8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f35500x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f35500x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (currentMessagesGroup = ((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f35467u6.indexOf((MessageObject) i2.g.h(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        om omVar = this.A0;
                        omVar.q(indexOf + omVar.J, currentMessagesGroup.messages.size());
                        this.f35500x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            i2.g.x(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && !d5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(z10));
        return false;
    }

    public final void s9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f35276f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f35467u6.isEmpty();
            if (getMessagesController().isUserContactBlocked(a()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty != z10) {
                getMessagesController().invalidateUserPremiumBlocked(a(), this.classGuid);
            }
        }
    }

    public final boolean sa() {
        ArrayList<MessageObject> arrayList;
        mk mkVar = this.Y;
        if (mkVar != null && mkVar.w0()) {
            return true;
        }
        ArrayList arrayList2 = this.f35467u6;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            MessageObject messageObject = (MessageObject) arrayList2.get(size);
            if ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.isContentUnread() && !messageObject.isOut()) {
                MediaController mediaController = MediaController.getInstance();
                if (MediaController.getInstance().playMessage(messageObject)) {
                    arrayList = R7(messageObject, true);
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, true);
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return true;
        }
        return false;
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        qf qfVar = this.f35418qa;
        if (qfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qfVar);
        }
        mk mkVar = this.Y;
        if (mkVar != null && this.X0 != null && mkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f21307f) {
            this.f35406pa = this.X0.getKeyboardHeight();
        } else {
            this.f35406pa = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.V7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean sb() {
        if (v9() && this.f35379n5 == null && this.p5 == null) {
            if (this.R3 != 8 && v9() && this.f35264e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f35264e.f19896id, 1L);
                if (this.R3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f35264e, findTopic)) {
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

    public final void sc() {
        org.telegram.ui.ActionBar.n1 n1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        uj ujVar = this.f35500x0;
        fk fkVar = this.I1;
        if ((fkVar != null && fkVar.I) || ((n1Var = this.Q8) != null && n1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        ujVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.z n10 = kVar.n();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            n10.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.g2 g2Var;
        float f7;
        float f10;
        mk mkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f35276f != null && this.f35374n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f35276f.f20043id);
            if (userFull != null && userFull.phone_calls_available) {
                this.L9 = !this.inPreviewMode;
                this.f35374n0.f(0);
            } else {
                this.L9 = false;
                this.f35374n0.f(8);
            }
        }
        pj pjVar = this.f35213a1;
        float f12 = 0.0f;
        if (pjVar != null) {
            pjVar.setOccupyStatusBar(!z10);
            pj pjVar2 = this.f35213a1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            pjVar2.setLayoutParams(w7.x5.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        mk mkVar2 = this.Y;
        if (mkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            mkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.my0 my0Var = this.f35252d1;
        if (my0Var != null) {
            if (this.Z4 && !z10 && ((mkVar = this.Y) == null || !mkVar.y3)) {
                i11 = 0;
            }
            my0Var.setVisibility(i11);
        }
        fk fkVar = this.I1;
        if (fkVar != null) {
            ViewPropertyAnimator animate = fkVar.animate();
            if (!this.Y.y3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.pr.f29493f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                g2Var = new org.telegram.ui.ActionBar.g2(false);
            } else {
                g2Var = null;
            }
            kVar.setBackButtonDrawable(g2Var);
            org.telegram.ui.ActionBar.v0 v0Var = this.f35300h0;
            if (v0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.y yVar = this.f35265e0;
            if (yVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                yVar.f21556i = f12;
                org.telegram.ui.ActionBar.v0 v0Var2 = yVar.f21560m;
                if (v0Var2 != null) {
                    v0Var2.setAlpha(f12);
                }
            }
        }
        uj ujVar = this.f35500x0;
        if (ujVar != null) {
            int childCount = ujVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f35500x0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.t1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f35354l6 - 1;
                        this.f35354l6 = i13;
                        if (i13 <= 0) {
                            this.f35354l6 = 0;
                            this.f35366m6 = true;
                            Kb(false);
                        } else {
                            this.f35326j1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f35264e)) {
                            j3 = this.f35264e.f19896id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j3, this.T5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        t1Var.setHighlighted(false);
                        t1Var.O3();
                    }
                }
            }
            this.f35500x0.setItemAnimator(null);
        }
        hc(false);
        Kc();
        hk hkVar = this.X1;
        if (hkVar != null) {
            if (!z10 && !this.Oa) {
                z12 = true;
            } else {
                z12 = false;
            }
            hkVar.setEnabled(z12);
        }
        hk hkVar2 = this.Z1;
        if (hkVar2 != null) {
            if (!z10 && !this.Oa) {
                z11 = true;
            } else {
                z11 = false;
            }
            hkVar2.setEnabled(z11);
        }
        kl klVar = this.f35502x2;
        if (klVar != null) {
            klVar.setEnabled(!isInPreviewMode());
        }
        um umVar = this.X0;
        if (umVar != null) {
            umVar.setOccupyStatusBar((this.inBubbleMode || this.Oa || this.inPreviewMode) ? false : false);
        }
    }

    public final void t6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.t6():void");
    }

    public final void t7() {
        co coVar = this.f35261da;
        if (coVar != null) {
            coVar.t7();
        }
        float V8 = V8(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.R1 != null) {
            V8 += W8(org.telegram.ui.Components.s21.f30203a);
        }
        if (this.f35386o1 != null) {
            V8 += AndroidUtilities.dp(35.0f) * this.f35386o1.E;
        }
        this.X.setFadeZoneTop((int) ((z8() * AndroidUtilities.dp(43.0f)) + V8));
    }

    public final void t8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j3) {
        boolean z13;
        if (!arrayList.isEmpty() && f7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.R3 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.o9 = true;
                om omVar = this.A0;
                if (omVar != null) {
                    omVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.T5, z10, z11, z12, i10, 0, this.X3, -1, j3, N8(), this.f35294g5);
            org.telegram.ui.Components.e5.t0(sendMessage, this, this.f35274ea);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new qf(this, 24));
            }
        }
    }

    public final boolean t9() {
        if (this.R1 != null && this.f35255d4 == 0) {
            return true;
        }
        return false;
    }

    public final void ta() {
        org.telegram.ui.Cells.t1 t1Var;
        this.wc.a(false, true);
        rh.c cVar = this.Cc;
        if (cVar != null && (t1Var = cVar.f45636n) != null && t1Var.getDelegate() != null) {
            cVar.f45636n.getDelegate().w1(cVar.f45636n, false);
        }
        mk mkVar = this.Y;
        if (mkVar != null) {
            mkVar.V0(true, true, false);
            this.Y.T4 = null;
        }
    }

    public final void tb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.yc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f35274ea).j();
    }

    public final void tc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    @Override
    public final boolean u(final org.telegram.ui.uy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.eg1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.u(org.telegram.ui.uy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.eg1):boolean");
    }

    public final void u6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.i iVar = this.f35493w6;
            ArrayList arrayList = (ArrayList) iVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.w1.k(pollId, iVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void u7() {
        if (this.M0 != null) {
            this.M0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - z8()) * (1.0f - this.f35524yc.f15395e) * R8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final int u8() {
        return this.R3;
    }

    public final void ua(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar;
        if (this.wc.f15396f && (cVar = this.Cc) != null && cVar.f45636n == t1Var) {
            Editable text = cVar.f45631a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(t1Var.getMessageObject(), text, this.Cc.getAttachedMedia());
                ta();
                return;
            }
            AndroidUtilities.shakeView(this.Cc.f45631a);
        }
    }

    public final void ub(org.telegram.ui.Cells.t1 t1Var) {
        if (getParentActivity() != null && t1Var != null && t1Var.f23088ob != null && t1Var.getPrimaryMessageObject() != null && t1Var.getPrimaryMessageObject().messageOwner != null && t1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Xa) {
                this.Xa = true;
                if (this.f35526z1 != null) {
                    return;
                }
                di.f4 f4Var = new di.f4(getParentActivity(), 3);
                f4Var.p(true);
                f4Var.K = Layout.Alignment.ALIGN_NORMAL;
                f4Var.d = -1L;
                f4Var.T = true;
                f4Var.f7229e = true;
                f4Var.i();
                f4Var.q(8.0f);
                this.f35526z1 = f4Var;
                f4Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                di.f4 f4Var2 = this.f35526z1;
                f4Var2.h = di.f4.a(f4Var2.getText(), this.f35526z1.getTextPaint());
                this.X0.addView(this.f35526z1, w7.x5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.X0.post(new org.telegram.ui.ActionBar.c6(28, this, t1Var));
            }
        }
    }

    public final void uc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.uc():void");
    }

    @Override
    public final boolean v() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void v6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.p9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f35264e, this.f35276f, null, this.T5, this.f35483va, this.f35471ua);
    }

    public final void v7() {
        float f7 = this.f35496w9;
        yk ykVar = this.f35386o1;
        if (ykVar != null) {
            ykVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f35386o1.E;
        }
        kk kkVar = this.f35398p1;
        if (kkVar != null) {
            kkVar.setTranslationY(f7);
        }
        float z82 = (z8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.w21 w21Var = this.R1;
        org.telegram.ui.Components.s21 s21Var = org.telegram.ui.Components.s21.f30203a;
        if (w21Var != null) {
            w21Var.setSideMenuBackgroundMarginTop((z8() * V8(AndroidUtilities.dp(7.0f))) + z82);
            float W8 = W8(s21Var);
            float b10 = yf.f0.b(this.f35524yc.f15395e);
            float z83 = z8();
            z82 += yf.f0.b(Math.min(w7.p.a(yf.f0.b(b10), 0.0f, 1.0f), w7.p.a(yf.f0.b(z83), 0.0f, 1.0f))) * W8;
        }
        org.telegram.ui.Components.dh dhVar = this.M0;
        if (dhVar != null) {
            dhVar.setTranslationY((z82 - AndroidUtilities.dp(5.0f)) - (z8() * W8(s21Var)));
        }
    }

    public final TLRPC.ChatFull v8() {
        return this.Z7;
    }

    public final boolean v9() {
        if (!ChatObject.isForum(this.f35264e) || this.f35304h4) {
            if (ChatObject.isMonoForum(this.f35264e) && d() == 0 && !this.T3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void va(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        ah.j1 d = ah.j1.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            messageObject = ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        ab(a0Var, messageObject2, null, null, f7, f10, d, false, false, false, false);
        if (messageObject2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (messageObject2.messageOwner != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.A0.N;
            if (z12) {
                MessageObject messageObject3 = (MessageObject) this.f35391o6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f35412q3 != null) {
                kc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.f35412q3)) {
            MessageObject.GroupedMessages X8 = X8(messageObject2);
            if (X8 != null) {
                for (int i10 = 0; i10 < X8.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(X8.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            hg.o1 o1Var = this.M3;
            if (o1Var != null) {
                o1Var.l();
            }
            kc(true);
        }
    }

    public final void vb(boolean z10, boolean z11) {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Object obj;
        if (!z10 || this.G0.getTag() == null) {
            if (!z10 && this.G0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.H0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.H0 = null;
            }
            RadialProgressView radialProgressView = this.G0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f16 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H0 = animatorSet2;
                if (z10) {
                    this.G0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.H0;
                    tk tkVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tkVar, property, 0.1f);
                    tk tkVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tkVar2, property2, 0.1f);
                    tk tkVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(tkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
                    this.H0.setStartDelay(200L);
                } else {
                    if (this.C0) {
                        obj = this.D0;
                    } else {
                        obj = this.B0;
                    }
                    RadialProgressView radialProgressView2 = this.G0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.G0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.G0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.H0.addListener(new ah.q0(29, this, z10));
                this.H0.setDuration(150L);
                this.H0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.G0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            radialProgressView5.setVisibility(i10);
            RadialProgressView radialProgressView6 = this.G0;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.1f;
            }
            radialProgressView6.setScaleX(f7);
            RadialProgressView radialProgressView7 = this.G0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView7.setScaleY(f10);
            this.G0.setAlpha(1.0f);
            tk tkVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            tkVar4.setVisibility(i11);
            org.telegram.ui.Components.d90 d90Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            d90Var.setVisibility(i12);
            tk tkVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            tkVar5.setScaleX(f11);
            org.telegram.ui.Components.d90 d90Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            d90Var2.setScaleX(f12);
            tk tkVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            tkVar6.setScaleY(f13);
            org.telegram.ui.Components.d90 d90Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            d90Var3.setScaleY(f16);
            tk tkVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            tkVar7.setAlpha(f14);
            org.telegram.ui.Components.d90 d90Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            d90Var4.setAlpha(f15);
        }
    }

    public final void vc() {
        boolean z10;
        boolean z11;
        if (this.f35326j1 == null) {
            return;
        }
        if (this.f35298g9 && !b9() && !this.Y.w0() && !this.Oa && (!this.f35439s3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.P5 != 0 && SystemClock.elapsedRealtime() >= this.P5 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35338k1 = false;
        } else {
            this.B7 = 0;
            this.f35330j6 = 0;
            z11 = true;
        }
        this.f35326j1.e(1, z10, z11);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void w6(MessageObject messageObject, boolean z10) {
        x6(messageObject, z10, true);
    }

    public final void w7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.f35480v6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.i iVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f35467u6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.T5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f35391o6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        messageReplies.replies++;
                        messageObject.animateComments = true;
                        TLRPC.Message message = messageObject2.messageOwner;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i12)) == MessageObject.getPeerId(peer)) {
                                messageObject.messageOwner.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        messageObject.messageOwner.replies.recent_repliers.add(0, peer);
                        if (!messageObject2.isOut()) {
                            messageObject.messageOwner.replies.max_id = messageObject2.getId();
                        }
                        MessagesStorage messagesStorage = getMessagesStorage();
                        long j3 = this.f35264e.f19896id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j3, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f35506x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (iVar == null) {
                                    iVar = new a0.i();
                                }
                                iVar.k(groupedMessages, groupedMessages.groupId);
                                int size3 = groupedMessages.messages.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    groupedMessages.messages.get(i13).animateComments = true;
                                }
                            }
                        } else if (this.A0 != null && (indexOf = arrayList.indexOf(messageObject)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.A0.J));
                        }
                    }
                }
                i11++;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    sparseArray.remove(((Integer) arrayList2.get(i14)).intValue());
                }
            }
            if (this.A0 != null) {
                if (iVar != null) {
                    int m10 = iVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.n(i15);
                        int indexOf2 = arrayList.indexOf((MessageObject) i2.g.h(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            om omVar = this.A0;
                            if (!omVar.N) {
                                omVar.q(indexOf2 + omVar.J, groupedMessages2.messages.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.A0.N) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.A0.m(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final TLRPC.UserFull w8() {
        return this.f35219a8;
    }

    public final boolean w9() {
        return UserObject.isBotForum(this.f35276f);
    }

    public final void wa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.wa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void wb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new lf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20925q7));
        }
    }

    public final void wc() {
        kh.h hVar = this.f35326j1;
        qh.i iVar = this.v;
        if (hVar != null) {
            this.f35326j1.setTranslationY((((-iVar.c()) - this.S.getInputBubbleHeight()) - W8(org.telegram.ui.Components.s21.f30205c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f35252d1 != null) {
            this.f35252d1.setTranslationY((-iVar.c()) - AndroidUtilities.dp(16.0f));
        }
    }

    public final void x6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.x6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void x7(boolean z10) {
        boolean z11;
        this.f35467u6.clear();
        this.f35428r6.clear();
        this.f35442s6.clear();
        this.f35306h6.clear();
        this.f35506x6.b();
        this.f35316i4 = false;
        om omVar = this.A0;
        if (omVar != null) {
            if (omVar.f39306w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Pb(z11);
        }
        uj ujVar = this.f35500x0;
        if (ujVar != null) {
            ujVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f35391o6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f35531z6;
            int[] iArr2 = this.f35518y6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.A6[i10] = Integer.MIN_VALUE;
            this.B6[i10] = 0;
            this.C6[i10] = false;
            this.D6[i10] = false;
            this.E6[i10] = true;
        }
        if (z10) {
            this.G7 = true;
            this.H6 = true;
            this.G6 = true;
            this.I7 = false;
        }
        this.X4 = false;
        this.f35468u7 = 0;
        this.f35456t7 = false;
        this.K6 = 0;
        this.J7 = null;
        this.D7 = 0;
        this.E7 = false;
        this.A7 = false;
        om omVar2 = this.A0;
        if (omVar2 != null && !omVar2.N) {
            omVar2.O(false);
        }
    }

    public final ArrayList x8() {
        om omVar = this.A0;
        if (omVar != null) {
            return omVar.P;
        }
        return null;
    }

    public boolean x9() {
        if (this.X0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void xa(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        org.telegram.ui.Components.n01 n01Var;
        String hostAuthority;
        boolean z11;
        boolean z12 = false;
        try {
            hostAuthority = AndroidUtilities.getHostAuthority(str);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.h != null) {
            if (getMessagesController().secretWebpagePreview == 1) {
            }
            if (z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i10 == 0) {
                    of.f.q(getParentActivity(), Uri.parse(str), true, true, K9(t1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f35284f8 == 0) {
                        z12 = true;
                    }
                    of.f.q(parentActivity, parse, z12, true, K9(t1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f35284f8 == 0) {
                        z12 = true;
                    }
                    of.f.q(parentActivity2, parse2, z12, true, K9(t1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.r0(this, str, true, true, false, false, K9(t1Var, characterStyle), null, this.f35274ea);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.n51) && (n01Var = ((org.telegram.ui.Components.n51) characterStyle).f28651a) != null && (n01Var.f28618a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.e5.r0(this, str, true, true, true, z12, K9(t1Var, characterStyle), null, this.f35274ea);
            }
        }
        if (getMessagesController().authDomains.contains(hostAuthority)) {
            SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
            if (i10 != 0 && i10 != 2) {
                z11 = false;
                sendMessagesHelper.requestUrlAuth(str, this, z11);
                return;
            }
            z11 = true;
            sendMessagesHelper.requestUrlAuth(str, this, z11);
            return;
        }
        if (z10) {
        }
        if (i10 == 0) {
        }
        if (characterStyle instanceof org.telegram.ui.Components.n51) {
            z12 = true;
        }
        org.telegram.ui.Components.e5.r0(this, str, true, true, true, z12, K9(t1Var, characterStyle), null, this.f35274ea);
    }

    public final void xb() {
        TLRPC.Chat chat = this.f35264e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f35264e)) {
                    t60 t60Var = new t60(a());
                    t60Var.f34777l0 = this;
                    presentFragment(t60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f35264e)) {
                bd bdVar = new bd(a());
                bdVar.f34777l0 = this;
                presentFragment(bdVar);
                return;
            } else {
                return;
            }
        }
        this.f35235ba = new org.telegram.ui.Components.lp(this, this.f35274ea);
        this.f35500x0.setOnInterceptTouchListener(new m4.t0(18));
        jb(this.X0, false);
        showDialog(this.f35235ba, new jg(this, 0));
    }

    public final void xc(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Integer num;
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        int i12;
        Integer num2;
        Integer num3;
        Integer num4;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        if ((!F9() || this.f35304h4) && this.L2 != null) {
            if (!this.O5) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.H4.size() > 1 && !this.I2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.L2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.K2.getTag() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.J2.getTag() != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z12 && !this.Bb && !this.I2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z12 && !this.Bb && !this.I2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.Bb && !this.I2) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z13 != z12 || z14 != z18 || z15 != z16) {
                AnimatorSet animatorSet = this.M2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.M2 = null;
                }
                if (z11) {
                    if (z12) {
                        this.L2.setVisibility(0);
                    } else if (z16) {
                        this.J2.setVisibility(0);
                    }
                    if (z18) {
                        this.K2.setVisibility(0);
                        this.K2.setAlpha(0.0f);
                        this.K2.setScaleX(0.4f);
                        this.K2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M2 = animatorSet2;
                    ImageView imageView = this.L2;
                    Property property = View.ALPHA;
                    if (z17) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.L2;
                    Property property2 = View.SCALE_X;
                    if (z17) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.L2;
                    Property property3 = View.SCALE_Y;
                    if (z17) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.J2;
                    if (z16) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.J2;
                    if (z16) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.J2;
                    if (z16) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.K2;
                    if (!z18) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.K2;
                    if (!z18) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.K2;
                    if (!z18) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.M2.setInterpolator(org.telegram.ui.Components.pr.h);
                    this.M2.setDuration(360L);
                    this.M2.addListener(new zl(this, z16, z17, z18));
                    this.M2.start();
                } else {
                    num = 1;
                    ImageView imageView7 = this.J2;
                    if (z16) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView7.setAlpha(f7);
                    ImageView imageView8 = this.J2;
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.J2;
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.J2;
                    if (z16) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.L2;
                    if (z17) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.L2;
                    if (z17) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.L2;
                    if (z17) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.L2;
                    if (z17) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.K2;
                    if (z18) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.K2;
                    if (z18) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.K2;
                    if (z18) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.K2;
                    if (z18) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.J2;
                if (z16) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.L2;
                if (z12) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.K2;
                if (z18) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.f35527z2 != null) {
                if (F9() && !this.f35304h4) {
                    this.f35527z2.c(0, 1, false);
                } else {
                    this.f35527z2.c((this.H4.size() - 1) - Collections.binarySearch(this.H4, Integer.valueOf(this.L4), Comparator$CC.reverseOrder()), this.H4.size(), z11);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ov0 y() {
        return this.X0;
    }

    public final void y6() {
        this.f35294g5 = null;
        if (this.f35255d4 == 0 || this.f35304h4) {
            if (this.f35304h4) {
                this.f35379n5 = this.X3;
            } else {
                this.f35379n5 = null;
            }
            this.f35353l5 = null;
            mk mkVar = this.Y;
            if (mkVar != null) {
                mkVar.l1(null, null, null);
            }
        }
        e9(false);
        if (this.R3 == 0) {
            getMediaDataController().cleanDraft(this.T5, this.f35255d4, true);
        }
    }

    public final void y7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f35531z6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.H6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                i2.g.o(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.D7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.E6[0] = false;
            this.F6 = false;
            om omVar = this.A0;
            if (omVar != null && omVar.F < 0) {
                omVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f35330j6 = i12;
            this.f35354l6 = dialog2.unread_mentions_count;
            if (this.f35343k6 != i12) {
                kh.h hVar = this.f35326j1;
                if (hVar != null) {
                    hVar.c(1, i12, this.N5);
                }
                this.f35343k6 = this.f35330j6;
                vc();
            }
            int i13 = this.f35354l6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f35354l6 = i14;
                if (i14 <= 0) {
                    this.f35354l6 = 0;
                    this.f35366m6 = true;
                    Kb(false);
                } else {
                    kh.h hVar2 = this.f35326j1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Kb(true);
                }
            }
            a7(false);
            return;
        }
        this.f35467u6.clear();
        this.f35306h6.clear();
        this.f35428r6.clear();
        this.f35442s6.clear();
        this.f35506x6.b();
        this.f35316i4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f35391o6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f35518y6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.A6[i15] = Integer.MIN_VALUE;
            this.B6[i15] = 0;
            this.W5[i15].clear();
            this.X5[i15].clear();
            this.Y5[i15].clear();
        }
        c9();
        yc(0, true);
        if (this.f35356l8 != null) {
            this.f35356l8 = null;
            mk mkVar = this.Y;
            if (mkVar != null) {
                mkVar.Z0(null, true, false);
            }
        }
        if (this.P != null) {
            Pb(false);
            G7(false);
            this.f35500x0.setEmptyView(this.Q0);
        }
        om omVar2 = this.A0;
        if (omVar2 != null) {
            omVar2.O(false);
        }
        if (this.h == null && (user = this.f35276f) != null && user.bot && this.f35272e8 == null) {
            this.f35272e8 = "";
            hc(false);
        }
    }

    public final MessageObject.GroupedMessages y8(long j3) {
        return (MessageObject.GroupedMessages) this.f35506x6.f(j3);
    }

    public final boolean y9() {
        if (this.f35264e != null) {
            return getMessagesController().isChatNoForwards(this.f35264e);
        }
        return getMessagesController().isUserNoForwards(this.f35219a8);
    }

    public final void ya(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.ya(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void yb(boolean z10, MessageObject messageObject, MessageObject messageObject2, ArrayList arrayList, TLRPC.WebPage webPage, sn snVar, boolean z11, boolean z12) {
        zb(z10, messageObject, messageObject2, arrayList, webPage, true, 0, snVar, z11, 0L, null, z12);
    }

    public final void yc(int r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.yc(int, boolean):void");
    }

    @Override
    public final void z(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            rh.c cVar = this.Cc;
            if (cVar != null) {
                this.X0.removeView(cVar);
                this.Cc = null;
            }
            mk mkVar = this.Y;
            if (mkVar != null) {
                mkVar.H0();
            }
        }
    }

    public final void z6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f35274ea);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(b2Var);
    }

    public final void z7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.W5[i10].clear();
            this.X5[i10].clear();
            this.Y5[i10].clear();
        }
        c9();
        yc(0, true);
        Wc(z10);
        Lc();
    }

    public final float z8() {
        co coVar = this.f35261da;
        if (coVar == null) {
            coVar = this;
        }
        kk kkVar = coVar.f35398p1;
        if (kkVar == null) {
            return 0.0f;
        }
        return kkVar.f30405b;
    }

    public final boolean z9() {
        int i10 = this.R3;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void za(java.util.ArrayList r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.za(java.util.ArrayList, boolean):void");
    }

    public final void zb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.sn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.zb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.sn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void zc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f35304h4 && !this.J4.isEmpty() && this.H4.size() == 1 && ((Integer) this.H4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.J4.get(this.H4.get(0));
        } else {
            messageObject = null;
        }
        this.Y3 = messageObject;
        if (this.f35304h4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f35243c4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f35264e, this.Y3.messageOwner.from_id)) {
            this.Y3 = null;
        }
    }

    @Override
    public final void O() {
    }

    public void V9(boolean z10) {
    }
}
