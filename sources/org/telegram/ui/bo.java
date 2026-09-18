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
public class bo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, qy, fd0, org.telegram.ui.Components.fk, org.telegram.ui.Components.ah, mg.b, org.telegram.ui.Components.o50, le.d {
    public static int Gc = 22;
    public static float Hc = 1.4f;
    public static int Ic = 10;
    public static Pattern Jc;
    public static Pattern Kc;
    public static Pattern Lc;
    public static final int[] Mc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Nc = false;
    public static final Rect Oc = new Rect();
    public nm A0;
    public ci.f4 A1;
    public boolean A2;
    public org.telegram.ui.Components.oc A3;
    public int A4;
    public int A5;
    public final int[] A6;
    public boolean A7;
    public final ah.c A8;
    public float A9;
    public int Aa;
    public boolean Ab;
    public final j6.l Ac;
    public uk B0;
    public yl B1;
    public final org.telegram.ui.Components.u9[] B2;
    public boolean B3;
    public int B4;
    public boolean B5;
    public final int[] B6;
    public int B7;
    public Bitmap B8;
    public TLRPC.Document B9;
    public ChatMessageSharedResources Ba;
    public ne Bb;
    public qh.c Bc;
    public boolean C0;
    public float C1;
    public final ao[] C2;
    public int C3;
    public sf C4;
    public TLRPC.PhotoSize C5;
    public final boolean[] C6;
    public int C7;
    public BitmapShader C8;
    public boolean C9;
    public ValueAnimator Ca;
    public boolean Cb;
    public yf.b0 Cc;
    public org.telegram.ui.Components.c90 D0;
    public TL_stories.TL_premium_boostsStatus D1;
    public final org.telegram.ui.ActionBar.k5[] D2;
    public boolean D3;
    public boolean D4;
    public TLRPC.PhotoSize D5;
    public final boolean[] D6;
    public int D7;
    public Paint D8;
    public boolean D9;
    public float Da;
    public boolean Db;
    public final ArrayList Dc;
    public final pe.b E;
    public TextView E0;
    public ChannelBoostsController.CanApplyBoost E1;
    public final ai.p4[] E2;
    public FlagSecureReason E3;
    public boolean E4;
    public TLObject E5;
    public final boolean[] E6;
    public boolean E7;
    public Matrix E8;
    public long E9;
    public il Ea;
    public final RectF Eb;
    public final ArrayList Ec;
    public final ah.i F;
    public tk F0;
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
    public org.telegram.ui.ActionBar.c2 Fb;
    public final Rect Fc;
    public final int G;
    public RadialProgressView G0;
    public ne G1;
    public int G2;
    public MessageObject G3;
    public int G4;
    public TLRPC.WebPage G5;
    public boolean G6;
    public boolean G7;
    public final Paint G8;
    public int G9;
    public final tl Ga;
    public long Gb;
    public final fh.d H;
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
    public final wg Hb;
    public final fh.d I;
    public boolean I0;
    public gk I1;
    public boolean I2;
    public MessageObject I3;
    public int I4;
    public String I5;
    public boolean I6;
    public boolean I7;
    public boolean I8;
    public int I9;
    public final bm Ia;
    public int Ib;
    public final ah.c J;
    public ci.f4 J0;
    public ai.g4 J1;
    public ImageView J2;
    public MessageObject J3;
    public HashMap J4;
    public i9.s J5;
    public int J6;
    public MessageObject J7;
    public View J8;
    public boolean J9;
    public final li Ja;
    public boolean Jb;
    public final ah.c K;
    public ci.f4 K0;
    public org.telegram.ui.ActionBar.r0 K1;
    public RadialProgressView K2;
    public hh.f K3;
    public final SparseArray K4;
    public TLRPC.ChatInvite K5;
    public int K6;
    public MessageObject K7;
    public float K8;
    public boolean K9;
    public final cj Ka;
    public Pattern Kb;
    public final fh.e L;
    public ci.f4 L0;
    public TextView L1;
    public ImageView L2;
    public ai.w0 L3;
    public int L4;
    public ne L5;
    public long L6;
    public int L7;
    public float L8;
    public boolean L9;
    public final on La;
    public MessageObject Lb;
    public final ah.c M;
    public org.telegram.ui.Components.bh M0;
    public boolean M1;
    public AnimatorSet M2;
    public gg.o1 M3;
    public final int[] M4;
    public final LongSparseIntArray M5;
    public boolean M6;
    public boolean M7;
    public Integer M8;
    public org.telegram.ui.Components.ui M9;
    public final sf Ma;
    public kf Mb;
    public org.telegram.ui.ActionBar.c2 N;
    public boolean N0;
    public TextView N1;
    public FrameLayout N2;
    public hh.e N3;
    public int N4;
    public boolean N5;
    public long N6;
    public boolean N7;
    public int N8;
    public float N9;
    public final sf Na;
    public ArrayList Nb;
    public boolean O;
    public sk O0;
    public TextView O1;
    public ok O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ArrayList O6;
    public long O7;
    public boolean O8;
    public float O9;
    public boolean Oa;
    public final BotForumHelper.BotDraftAnimationsPool Ob;
    public FrameLayout P;
    public jh.c P0;
    public al P1;
    public TextView P2;
    public TL_account.TL_businessChatLink P3;
    public int P4;
    public long P5;
    public final Paint P6;
    public String P7;
    public AnimatorSet P8;
    public zp P9;
    public boolean Pa;
    public final hh.a Pb;
    public ci.s6 Q;
    public FrameLayout Q0;
    public TextView Q1;
    public TextView Q2;
    public String Q3;
    public int Q4;
    public boolean Q5;
    public final Paint Q6;
    public Integer Q7;
    public org.telegram.ui.ActionBar.o1 Q8;
    public Animator Q9;
    public long Qa;
    public boolean Qb;
    public rk R;
    public LinearLayout R0;
    public org.telegram.ui.Components.y21 R1;
    public rk R2;
    public int R3;
    public boolean R4;
    public boolean R5;
    public final ColorMatrix R6;
    public byte[] R7;
    public boolean R8;
    public boolean R9;
    public NotificationCenter.ObserversGroup Ra;
    public boolean Rb;
    public hh.g S;
    public org.telegram.ui.Components.jo S0;
    public hg.e S1;
    public ImageView S2;
    public int S3;
    public boolean S4;
    public boolean S5;
    public final m.c3 S6;
    public int S7;
    public org.telegram.ui.ActionBar.g1[] S8;
    public boolean S9;
    public boolean Sa;
    public boolean Sb;
    public View T;
    public vi T0;
    public org.telegram.ui.Components.c90 T1;
    public ImageView T2;
    public boolean T3;
    public AnimatorSet T4;
    public long T5;
    public final org.telegram.ui.ActionBar.g5 T6;
    public int T7;
    public org.telegram.ui.ActionBar.g1 T8;
    public bo T9;
    public int Ta;
    public long Tb;
    public FrameLayout U;
    public hg.c2 U0;
    public ImageView U1;
    public org.telegram.ui.Components.n6 U2;
    public String U3;
    public final SparseIntArray U4;
    public Long U5;
    public long U6;
    public ne U7;
    public final fk U8;
    public float U9;
    public int Ua;
    public boolean Ub;
    public FrameLayout V;
    public hg.z V0;
    public ei.n V1;
    public org.telegram.ui.Components.n6 V2;
    public byte[] V3;
    public final SparseIntArray V4;
    public int V5;
    public int V6;
    public String V7;
    public om V8;
    public AnimatorSet V9;
    public boolean Va;
    public boolean Vb;
    public final hh.l W;
    public hh.k W0;
    public TextView W1;
    public org.telegram.ui.Components.n6 W2;
    public String W3;
    public boolean W4;
    public final SparseArray[] W5;
    public int W6;
    public ChatObject.Call W7;
    public vk W8;
    public final ok W9;
    public boolean Wa;
    public boolean Wb;
    public jh.f X;
    public tm X0;
    public ik X1;
    public ek X2;
    public MessageObject X3;
    public boolean X4;
    public final SparseArray[] X5;
    public final Matrix X6;
    public boolean X7;
    public int X8;
    public uh.j X9;
    public a0.i Xa;
    public boolean Xb;
    public nk Y;
    public org.telegram.ui.Components.fo Y0;
    public FrameLayout Y1;
    public dk Y2;
    public MessageObject Y3;
    public boolean Y4;
    public final SparseArray[] Y5;
    public LinearGradient Y6;
    public boolean Y7;
    public int Y8;
    public zg.t Y9;
    public a0.i Ya;
    public b9 Yb;
    public pk Z;
    public final ArrayList Z0;
    public ik Z1;
    public org.telegram.ui.Cells.w0 Z2;
    public boolean Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public TLRPC.ChatFull Z7;
    public int Z8;
    public k51 Z9;
    public long Za;
    public int Zb;
    public int f32217a;
    public ai.f0 f32218a0;
    public qj f32219a1;
    public FrameLayout a2;
    public int f32220a3;
    public ArrayList f32221a4;
    public boolean f32222a5;
    public int f32223a6;
    public int f32224a7;
    public TLRPC.UserFull f32225a8;
    public boolean f32226a9;
    public boolean f32227aa;
    public dl f32228ab;
    public ValueAnimator f32229ac;
    public boolean f32230b;
    public int f32231b0;
    public org.telegram.ui.Components.n6 f32232b1;
    public TextView f32233b2;
    public gl f32234b3;
    public MessageObject f32235b4;
    public boolean f32236b5;
    public int f32237b6;
    public final Paint f32238b7;
    public org.telegram.ui.Cells.f6 f32239b8;
    public boolean f32240b9;
    public org.telegram.ui.Components.mp f32241ba;
    public boolean f32242bb;
    public xi f32243bc;
    public boolean f32244c;
    public org.telegram.ui.ActionBar.u0 f32245c0;
    public qh f32246c1;
    public org.telegram.ui.Components.t00 f32247c2;
    public View f32248c3;
    public TLRPC.TL_forumTopic f32249c4;
    public MessageObject f32250c5;
    public int f32251c6;
    public final Matrix f32252c7;
    public p11 f32253c8;
    public um f32254c9;
    public zn f32255ca;
    public boolean cb;
    public boolean f32256cc;
    public boolean d;
    public js f32257d0;
    public org.telegram.ui.Components.oy0 f32258d1;
    public org.telegram.ui.Components.zw0 f32259d2;
    public boolean f32260d3;
    public long f32261d4;
    public MessageObject f32262d5;
    public int f32263d6;
    public LinearGradient f32264d7;
    public final a0.i f32265d8;
    public org.telegram.ui.Cells.t1 f32266d9;
    public bo f32267da;
    public boolean f32268db;
    public int f32269dc;
    public TLRPC.Chat e;
    public org.telegram.ui.ActionBar.z f32270e0;
    public org.telegram.ui.ActionBar.u0 f32271e1;
    public org.telegram.ui.Components.i40 f32272e2;
    public boolean f32273e3;
    public int f32274e4;
    public MessageObject.GroupedMessages f32275e5;
    public int f32276e6;
    public boolean e7;
    public String f32277e8;
    public boolean f32278e9;
    public zn f32279ea;
    public ArrayList f32280eb;
    public int ec;
    public TLRPC.User f32281f;
    public org.telegram.ui.ActionBar.u0 f32282f0;
    public org.telegram.ui.ActionBar.u0 f32283f1;
    public org.telegram.ui.Components.i40 f32284f2;
    public boolean f32285f3;
    public TLRPC.Chat f32286f4;
    public MessagePreviewParams f32287f5;
    public int f32288f6;
    public boolean f7;
    public long f32289f8;
    public boolean f32290f9;
    public wh.d f32291fa;
    public ValueAnimator f32292fb;
    public int f32293fc;
    public org.telegram.ui.ActionBar.u0 f32294g0;
    public org.telegram.ui.ActionBar.u0 f32295g1;
    public jj f32296g2;
    public AnimatorSet f32297g3;
    public boolean f32298g4;
    public MessageSuggestionParams f32299g5;
    public int f32300g6;
    public int f32301g7;
    public String f32302g8;
    public boolean f32303g9;
    public final ChatMessagesMetadataController f32304ga;
    public boolean f32305gb;
    public int gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.w0 f32306h0;
    public org.telegram.ui.ActionBar.u0 f32307h1;
    public boolean f32308h2;
    public ValueAnimator f32309h3;
    public boolean f32310h4;
    public MessageObject f32311h5;
    public final ArrayList f32312h6;
    public boolean f32313h7;
    public boolean f32314h8;
    public rl f32315h9;
    public TLRPC.TL_channels_sendAsPeers ha;
    public Boolean f32316hb;
    public int f32317hc;
    public org.telegram.ui.ActionBar.z f32318i0;
    public org.telegram.ui.Components.po f32319i1;
    public org.telegram.ui.Components.i40 f32320i2;
    public float f32321i3;
    public boolean f32322i4;
    public MessageObject.GroupedMessages f32323i5;
    public boolean f32324i6;
    public boolean f32325i7;
    public boolean f32326i8;
    public boolean f32327i9;
    public TL_account.resolvedBusinessChatLinks f32328ia;
    public boolean f32329ib;
    public boolean f32330ic;
    public org.telegram.ui.ActionBar.w0 f32331j0;
    public jh.h f32332j1;
    public boolean f32333j2;
    public boolean j3;
    public boolean f32334j4;
    public MessageObject.GroupedMessages f32335j5;
    public int f32336j6;
    public int f32337j7;
    public String f32338j8;
    public float f32339j9;
    public boolean f32340ja;
    public boolean f32341jb;
    public long f32342jc;
    public org.telegram.ui.ActionBar.w0 f32343k0;
    public boolean f32344k1;
    public org.telegram.ui.Components.i40 f32345k2;
    public boolean f32346k3;
    public int f32347k4;
    public MessageObject f32348k5;
    public int f32349k6;
    public boolean f32350k7;
    public String f32351k8;
    public hk f32352k9;
    public boolean f32353ka;
    public int f32354kb;
    public TLRPC.TL_messages_discussionMessage f32355kc;
    public org.telegram.ui.ActionBar.u0 f32356l0;
    public int l1;
    public org.telegram.ui.Components.i40 f32357l2;
    public boolean f32358l3;
    public int l4;
    public rn f32359l5;
    public int f32360l6;
    public boolean f32361l7;
    public MessageObject f32362l8;
    public org.telegram.ui.Cells.t1 f32363l9;
    public float f32364la;
    public HashMap f32365lb;
    public TLRPC.messages_Messages f32366lc;
    public org.telegram.ui.ActionBar.w0 m0;
    public int f32367m1;
    public org.telegram.ui.Components.i40 f32368m2;
    public boolean f32369m3;
    public int f32370m4;
    public boolean f32371m5;
    public boolean f32372m6;
    public boolean f32373m7;
    public MessageObject f32374m8;
    public org.telegram.ui.Components.r00 f32375m9;
    public final rg f32376ma;
    public sf f32377mb;
    public boolean f32378mc;
    public boolean f32379n;
    public org.telegram.ui.ActionBar.z f32380n0;
    public org.telegram.ui.Components.oc f32381n1;
    public org.telegram.ui.Components.i40 f32382n2;
    public boolean f32383n3;
    public ci f32384n4;
    public MessageObject f32385n5;
    public final ArrayList f32386n6;
    public int f32387n7;
    public int f32388n8;
    public boolean f32389n9;
    public final xk f32390na;
    public int nb;
    public tn nc;
    public boolean f32391o0;
    public zk f32392o1;
    public org.telegram.ui.Components.i40 f32393o2;
    public TLRPC.User f32394o3;
    public final SparseArray f32395o4;
    public int f32396o5;
    public final SparseArray[] f32397o6;
    public int f32398o7;
    public boolean f32399o8;
    public boolean o9;
    public int f32400oa;
    public org.telegram.ui.ActionBar.c2 f32401ob;
    public nn f32402oc;
    public RadialProgressView f32403p0;
    public lk f32404p1;
    public org.telegram.ui.Cells.t1 f32405p2;
    public TLRPC.Chat f32406p3;
    public final ArrayList f32407p4;
    public MessageObject p5;
    public final SparseArray f32408p6;
    public boolean f32409p7;
    public long f32410p8;
    public ValueAnimator f32411p9;
    public int f32412pa;
    public int f32413pb;
    public yh.e4 f32414pc;
    public org.telegram.ui.ActionBar.u0 f32415q0;
    public ci.i1 f32416q1;
    public int f32417q2;
    public zg.p0 f32418q3;
    public int f32419q4;
    public boolean f32420q5;
    public final SparseArray q6;
    public ne f32421q7;
    public long f32422q8;
    public ValueAnimator f32423q9;
    public sf f32424qa;
    public int f32425qb;
    public boolean f32426qc;
    public long f32427r;
    public org.telegram.ui.ActionBar.u0 f32428r0;
    public int f32429r1;
    public int f32430r2;
    public boolean f32431r3;
    public boolean f32432r4;
    public boolean f32433r5;
    public final HashMap f32434r6;
    public String f32435r7;
    public boolean f32436r8;
    public boolean f32437r9;
    public boolean f32438ra;
    public boolean f32439rb;
    public float f32440rc;
    public final HashMap f32441s;
    public org.telegram.ui.ActionBar.u0 f32442s0;
    public boolean f32443s1;
    public org.telegram.ui.Components.i40 f32444s2;
    public boolean f32445s3;
    public boolean f32446s4;
    public boolean f32447s5;
    public final SparseArray f32448s6;
    public boolean f32449s7;
    public String f32450s8;
    public float f32451s9;
    public boolean f32452sa;
    public int f32453sb;
    public float f32454sc;
    public org.telegram.ui.ActionBar.u0 f32455t0;
    public org.telegram.ui.Components.d40 f32456t1;
    public org.telegram.ui.Components.i40 f32457t2;
    public String f32458t3;
    public int f32459t4;
    public boolean f32460t5;
    public final a0.i f32461t6;
    public boolean f32462t7;
    public rk f32463t8;
    public float f32464t9;
    public long ta;
    public boolean f32465tb;
    public final le.b f32466tc;
    public ClippingImageView f32467u0;
    public org.telegram.ui.ActionBar.c2 f32468u1;
    public org.telegram.ui.Components.i40 f32469u2;
    public String f32470u3;
    public final ArrayList f32471u4;
    public int f32472u5;
    public final ArrayList f32473u6;
    public int f32474u7;
    public org.telegram.ui.Cells.t1 f32475u8;
    public int f32476u9;
    public int f32477ua;
    public int f32478ub;
    public final le.b f32479uc;
    public final ph.i v;
    public org.telegram.ui.Components.y01 f32480v0;
    public ci.f4 f32481v1;
    public org.telegram.ui.Components.qp f32482v2;
    public int f32483v3;
    public final HashMap f32484v4;
    public int f32485v5;
    public final SparseArray f32486v6;
    public int f32487v7;
    public k4 f32488v8;
    public int v9;
    public int f32489va;
    public int f32490vb;
    public final le.b f32491vc;
    public kj f32492w;
    public hh.h f32493w0;
    public ci.f4 f32494w1;
    public View f32495w2;
    public int f32496w3;
    public MessageObject f32497w4;
    public TLRPC.PhotoSize f32498w5;
    public final a0.i f32499w6;
    public int f32500w7;
    public TextureView f32501w8;
    public float f32502w9;
    public wk f32503wa;
    public int f32504wb;
    public final le.b wc;
    public kj f32505x;
    public vj f32506x0;
    public ci.f4 f32507x1;
    public kl f32508x2;
    public int f32509x3;
    public int f32510x4;
    public TLRPC.PhotoSize f32511x5;
    public final a0.i f32512x6;
    public int f32513x7;
    public boolean f32514x8;
    public float f32515x9;
    public yk f32516xa;
    public CharacterStyle f32517xb;
    public final le.b xc;
    public final pe.b f32518y;
    public xj f32519y0;
    public ci.f4 f32520y1;
    public ci.s6 f32521y2;
    public UndoView y3;
    public int f32522y4;
    public TLObject f32523y5;
    public final int[] f32524y6;
    public int f32525y7;
    public final sf f32526y8;
    public float f32527y9;
    public float f32528ya;
    public String f32529yb;
    public final le.b f32530yc;
    public yj f32531z0;
    public ci.f4 f32532z1;
    public org.telegram.ui.Components.vf0 f32533z2;
    public jl f32534z3;
    public final ArrayList f32535z4;
    public int f32536z5;
    public final int[] f32537z6;
    public int f32538z7;
    public final fh.b f32539z8;
    public float f32540z9;
    public int f32541za;
    public nf.e f32542zb;
    public final le.b f32543zc;

    public bo(Bundle bundle) {
        super(bundle);
        this.f32217a = 0;
        this.f32244c = false;
        this.d = false;
        this.f32441s = new HashMap();
        this.v = new ph.i(new sf(this, 18));
        pe.b bVar = new pe.b(true);
        this.f32518y = bVar;
        pe.b bVar2 = new pe.b(true);
        this.E = bVar2;
        this.W = new hh.l();
        this.Z0 = new ArrayList();
        this.B2 = new org.telegram.ui.Components.u9[2];
        this.C2 = new ao[2];
        this.D2 = new org.telegram.ui.ActionBar.k5[2];
        this.E2 = new ai.p4[2];
        this.H2 = new AnimatorSet[2];
        this.I2 = false;
        this.f32220a3 = 500;
        this.P3 = null;
        this.S3 = -1;
        this.Z3 = true;
        this.f32395o4 = new SparseArray();
        this.f32407p4 = new ArrayList();
        this.f32471u4 = new ArrayList();
        this.f32484v4 = new HashMap();
        this.f32510x4 = -1;
        this.f32522y4 = 0;
        this.f32535z4 = new ArrayList(10);
        this.H4 = new ArrayList();
        this.J4 = new HashMap();
        this.K4 = new SparseArray();
        this.M4 = new int[1];
        this.U4 = new SparseIntArray();
        this.V4 = new SparseIntArray();
        this.Z4 = true;
        this.f32236b5 = true;
        this.f32420q5 = true;
        this.f32460t5 = true;
        this.M5 = new LongSparseIntArray();
        this.V5 = 1;
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f32312h6 = new ArrayList();
        this.f32324i6 = true;
        this.f32349k6 = Integer.MIN_VALUE;
        this.f32386n6 = new ArrayList();
        this.f32397o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f32408p6 = new SparseArray();
        this.q6 = new SparseArray();
        this.f32434r6 = new HashMap();
        this.f32448s6 = new SparseArray();
        this.f32461t6 = new a0.i();
        this.f32473u6 = new ArrayList();
        this.f32486v6 = new SparseArray();
        this.f32499w6 = new a0.i();
        this.f32512x6 = new a0.i();
        this.f32524y6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f32537z6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
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
        this.T6 = new org.telegram.ui.ActionBar.g5(0, false, false, new rj(this));
        this.X6 = new Matrix();
        Paint paint = new Paint(1);
        this.f32238b7 = paint;
        this.f32252c7 = new Matrix();
        this.f32387n7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f32513x7 = Integer.MAX_VALUE;
        this.f32525y7 = -1;
        this.G7 = true;
        this.L7 = Integer.MAX_VALUE;
        this.S7 = -1;
        this.T7 = -10000;
        this.f32265d8 = new a0.i();
        this.f32526y8 = new sf(this, 23);
        fh.b bVar3 = new fh.b();
        this.f32539z8 = bVar3;
        ah.c cVar = new ah.c(bVar3);
        this.A8 = cVar;
        this.G8 = new Paint(1);
        this.H8 = 0.0f;
        this.K8 = 1.0f;
        this.L8 = 0.0f;
        this.R8 = true;
        this.U8 = new fk(this);
        this.f32389n9 = true;
        this.W9 = new ok(this, 0);
        this.f32304ga = new ChatMessagesMetadataController(this);
        this.f32376ma = new rg(this, 0);
        this.f32390na = new xk(this);
        this.f32412pa = -1;
        this.Fa = new ql(this);
        this.Ga = new tl(this);
        this.Ia = new bm(this);
        this.Ja = new li(this);
        this.Ka = new cj(this);
        this.La = new on(this);
        this.Ma = new sf(this, 26);
        this.Na = new sf(this, 27);
        this.cb = false;
        this.Eb = new RectF();
        this.Hb = new wg(this, 1);
        this.Ob = new BotForumHelper.BotDraftAnimationsPool();
        this.Pb = new Object();
        this.f32256cc = false;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.f32466tc = new le.b(0, this, qrVar, 320L, false);
        this.f32479uc = new le.b(1, this, qrVar, 520L, false);
        this.f32491vc = new le.b(2, this, qrVar, 520L, false);
        this.wc = new le.b(3, this, qrVar, 320L, false);
        this.xc = new le.b(4, this, qrVar, 320L, false);
        this.f32530yc = new le.b(5, this, qrVar, 320L, false);
        this.f32543zc = new le.b(6, this, qrVar, 320L, false);
        wg wgVar = new wg(this, 5);
        ?? obj = new Object();
        obj.f12911b = new float[32];
        obj.f12910a = 1;
        obj.d = new le.l(obj, ke.a.f13590a, 240L);
        obj.f12912c = wgVar;
        this.Ac = obj;
        this.Dc = new ArrayList();
        this.Ec = new ArrayList();
        this.Fc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i(false);
            this.F = iVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            fh.d dVar = new fh.d(obj2);
            this.I = dVar;
            dVar.v = new wg(this, 8);
            dVar.d = iVar;
            dVar.e = -3;
            dVar.f9077f = obj2;
            ah.c cVar2 = new ah.c(dVar);
            this.K = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj2);
                this.H = dVar2;
                dVar2.v = new wg(this, 8);
                dVar2.d = iVar;
                dVar2.e = -2;
                dVar2.f9077f = obj2;
                ah.c cVar3 = new ah.c(dVar2);
                this.J = cVar3;
                cVar3.f427i = LiteMode.isEnabled(262144);
            } else {
                this.H = null;
                this.J = cVar2;
            }
        } else {
            this.F = null;
            this.G = 0;
            this.H = null;
            this.I = null;
            this.J = new ah.c(obj2);
            this.K = new ah.c(obj2);
        }
        ah.c cVar4 = new ah.c(obj2);
        this.M = cVar4;
        cVar4.e = bVar;
        this.J.e = bVar;
        this.K.e = bVar;
        cVar.e = new pe.b(true);
        cVar4.d = bVar2;
        this.J.d = bVar2;
        this.K.d = bVar2;
        cVar.d = bVar2;
    }

    public static void A0(bo boVar) {
        org.telegram.ui.Components.j40.h.a();
        boVar.showDialog(new xh.q1(boVar.getParentActivity(), boVar.currentAccount, boVar.a(), null, null));
    }

    public static org.telegram.ui.fv0 A1(org.telegram.ui.bo r16, org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.A1(org.telegram.ui.bo, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.fv0");
    }

    public static void B0(bo boVar) {
        boVar.f32241ba = null;
        boVar.f32506x0.setOnInterceptTouchListener(null);
        boVar.jb(boVar.X0, true);
        ChatThemeController.getInstance(boVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void B1(bo boVar) {
        SparseArray[] sparseArrayArr = boVar.W5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) boVar.f32397o6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            boVar.X5[i10].clear();
            boVar.Y5[i10].clear();
        }
        if (boVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(boVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(boVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                boVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        boVar.c9();
        boVar.yc(0, true);
        boVar.Wc(false);
        boVar.Lc();
    }

    public static CharSequence B8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.f31.k(messageObject)) {
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

    public static void C0(bo boVar) {
        if (boVar.X2.getAlpha() != 0.0f && !boVar.actionBar.s() && !boVar.A9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(boVar.X2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            boVar.G9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static TLRPC.TL_message C7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f18142id = message.f18142id;
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

    public static void D0(org.telegram.ui.bo r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.t1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.D0(org.telegram.ui.bo, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1, int, int):void");
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

    public static void E0(bo boVar) {
        boVar.G7(false);
        if (!boVar.fragmentBeginToShow) {
            vj vjVar = boVar.f32506x0;
            vjVar.Y1 = false;
            vjVar.Z1 = 0;
            vjVar.setEmptyView(boVar.Q0);
            vj vjVar2 = boVar.f32506x0;
            vjVar2.Y1 = true;
            vjVar2.Z1 = 1;
            return;
        }
        boVar.f32506x0.setEmptyView(boVar.Q0);
    }

    public static void F0(org.telegram.ui.bo r19, org.telegram.ui.qk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.F0(org.telegram.ui.bo, org.telegram.ui.qk, boolean[]):void");
    }

    public static void G0(bo boVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(boVar.currentAccount).getInputUser(user.f18268id);
                    ConnectionsManager.getInstance(boVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ai.v1(26, boVar, user));
                }
            }
        }
    }

    public static void G1(bo boVar) {
        int i10;
        if (boVar.a() == boVar.getUserConfig().getClientUserId() && boVar.getUserConfig().isPremium() && boVar.f32228ab == null) {
            dl dlVar = new dl(boVar, boVar, boVar.getParentActivity(), boVar.currentAccount, boVar.f32279ea);
            boVar.f32228ab = dlVar;
            dlVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            boVar.f32228ab.setDelegate(new el(boVar));
            boVar.f32228ab.setTop(true);
            int i11 = 0;
            boVar.f32228ab.setClipChildren(false);
            boVar.f32228ab.setClipToPadding(false);
            boVar.f32228ab.setVisibility(0);
            dl dlVar2 = boVar.f32228ab;
            if (dlVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            dlVar2.setHint(LocaleController.getString(i10));
            boVar.X0.addView(boVar.f32228ab, w7.x5.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            boVar.f32228ab.p(null, null, true);
            boVar.f32228ab.setTranslationY(-AndroidUtilities.dp(12.0f));
            boVar.f32228ab.setScaleY(0.4f);
            boVar.f32228ab.setScaleX(0.4f);
            boVar.f32228ab.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
            boVar.Lc();
            dl dlVar3 = boVar.f32228ab;
            float f7 = boVar.f32502w9;
            zk zkVar = boVar.f32392o1;
            if (zkVar != null) {
                i11 = zkVar.getCurrentHeight();
            }
            dlVar3.setTranslationY(f7 + i11);
        }
    }

    public static java.util.ArrayList H7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.H7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void I0(bo boVar, String str) {
        Uri parse = Uri.parse(str);
        n60.b(boVar.getParentActivity(), boVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void J0(bo boVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        rg.k1 k1Var = new rg.k1(boVar, boVar.currentAccount, user, null, null, boVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            k1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(boVar.getParentActivity());
        org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(AndroidUtilities.dp(160.0f), 4, u9Var, false);
        u9Var.setImageDrawable(m5Var);
        u9Var.addOnAttachStateChangeListener(new f5(m5Var, 1));
        m5Var.j(j3, false);
        k1Var.E0 = true;
        k1Var.B0 = u9Var;
        boVar.showDialog(k1Var);
    }

    public static void J3(bo boVar) {
        org.telegram.ui.ActionBar.z zVar;
        if (!boVar.cb && (zVar = boVar.f32318i0) != null) {
            zVar.a();
            org.telegram.ui.ActionBar.w0 w0Var = zVar.f19752m;
            w0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (boVar.R3 == 0) {
                w0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            w0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            w0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.g51(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            w0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = boVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f26908a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.q01(obj, 0), 0, spannableStringBuilder4.length(), 33);
                w0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f26908a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.q01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                w0Var.g(56, spannableStringBuilder5);
            }
            w0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (boVar.h == null) {
                w0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            w0Var.g(54, LocaleController.getString(R.string.Regular));
            boVar.cb = true;
        }
    }

    public static FrameLayout J7(Context context, org.telegram.ui.ActionBar.f6 f6Var, CharSequence charSequence, int i10) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.p4 p4Var = new ai.p4(context, 12);
        int i11 = 3;
        p4Var.setMaxLines(3);
        p4Var.setGravity(3);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        p4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        p4Var.setTextSize(1, i10);
        p4Var.setMaxWidth(AndroidUtilities.dp(170.0f));
        p4Var.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(p4Var, w7.x5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void K0(bo boVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            yh.y7.j1(boVar.getParentActivity(), boVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, boVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            boVar.presentFragment(new yo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void L0(bo boVar) {
        if (AndroidUtilities.addToClipboard(boVar.Lb.sponsoredInfo)) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.resourceProvider));
        }
    }

    public static void M0(bo boVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = boVar.I1.getAdapter().f9842w0;
        int i10 = boVar.currentAccount;
        TLRPC.User user2 = boVar.f32281f;
        if (user2 != null) {
            j3 = user2.f18268id;
        } else {
            j3 = boVar.e.f18121id;
        }
        ei.f5 b10 = ei.f5.b(i10, j3, user.f18268id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, boVar.N8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(boVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(boVar.currentAccount);
            MessagesController.showCantOpenAlert(boVar, restrictionReason);
            return;
        }
        ei.k3 k3Var = new ei.k3(boVar.getParentActivity(), boVar.getResourceProvider());
        k3Var.w(false);
        k3Var.A0 = true;
        k3Var.f8440k0 = boVar.getParentActivity();
        k3Var.s(boVar, b10);
        k3Var.show();
    }

    public static void N0(bo boVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (boVar.f32354kb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            boVar.G5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                boVar.G5 = null;
                MessagePreviewParams messagePreviewParams = boVar.f32287f5;
                if (messagePreviewParams != null) {
                    int i11 = boVar.currentAccount;
                    CharSequence fieldText = boVar.Y.getFieldText();
                    MessageObject messageObject3 = boVar.f32385n5;
                    if (messageObject3 == boVar.X3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, boVar.f32359l5, boVar.p5);
                }
                boVar.j8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                boVar.I5 = str;
            }
            if (boVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = boVar.f32287f5;
            if (messagePreviewParams2 != null) {
                int i12 = boVar.currentAccount;
                CharSequence fieldText2 = boVar.Y.getFieldText();
                MessageObject messageObject4 = boVar.f32385n5;
                if (messageObject4 == boVar.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, boVar.f32359l5, boVar.p5);
            }
            boVar.Eb(true, boVar.G5, false);
            return;
        }
        boVar.G5 = null;
        boVar.j8();
    }

    public static void O0(bo boVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != boVar.d()) {
            boVar.Za = SystemClock.uptimeMillis();
            boVar.f32409p7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                boVar.Sa(boVar.d());
            } else if (boVar.d() == 0) {
                boVar.Sa(l4.longValue());
            } else {
                boVar.f32387n7 = -1;
            }
            boVar.getConnectionsManager().cancelRequestsForGuid(boVar.classGuid);
            boVar.getMessagesStorage().cancelTasksForGuid(boVar.classGuid);
            boVar.classGuid = ConnectionsManager.generateClassGuid();
            boVar.Pa();
            boVar.f32287f5 = null;
            boVar.f32474u7 = 0;
            boVar.f32350k7 = false;
            boVar.f32361l7 = true;
            boVar.f32312h6.clear();
            boVar.f32261d4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = boVar.getMessagesController().getTopicsController().findTopic(-boVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                boVar.f32347k4 = i12;
                boVar.l4 = findTopic.read_outbox_max_id;
                boVar.f32370m4 = Math.max(1, i12);
                boVar.getMessagesController().getTopicsController().getTopicRepliesCount(boVar.T5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                boVar.f32249c4 = null;
                boVar.f32221a4 = null;
                boVar.X3 = null;
                boVar.f32385n5 = null;
                boVar.f32347k4 = 0;
                boVar.l4 = 0;
                boVar.f32370m4 = 0;
                boVar.f32261d4 = 0L;
                boVar.f32274e4 = 0;
                boVar.f32286f4 = null;
                boVar.f32310h4 = false;
                boVar.f32298g4 = false;
            }
            boVar.r8();
            boVar.Nc(true);
            boVar.f32219a1.n(true);
            boVar.f32219a1.b();
            boVar.R1.setCurrentTopic(l4.longValue());
            boVar.Qc(true);
            boVar.hc(true);
            boVar.getMessagesController().setForumLastTopicId(-boVar.a(), boVar.d());
            boVar.g9(true);
            boVar.e9(true);
            nk nkVar = boVar.Y;
            if (nkVar != null) {
                nkVar.n0(false);
                boVar.Y.G1(true);
            }
            boVar.A6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            boVar.l1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            boVar.f32367m1 = i11;
            boVar.Bc(false);
            boVar.Ac(false);
            boVar.Rc();
            tn tnVar = boVar.nc;
            if (tnVar != null && boVar.actionBar.f19305n0) {
                tnVar.p(null);
            }
        }
    }

    public static a3.h0 O4(bo boVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = boVar.getMessagesController().createDeleteShowOnceTask(boVar.T5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                boVar.tc(arrayList, true);
            }
            return new a3.h0(boVar, createDeleteShowOnceTask, messageObject, 14);
        }
        return null;
    }

    public static void P0(bo boVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = boVar.getParentActivity();
        int i12 = boVar.currentAccount;
        long j3 = boVar.T5;
        zn znVar = boVar.f32279ea;
        int i13 = org.telegram.ui.Components.jo.L;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.f6) znVar, false);
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, znVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, znVar)));
        linearLayout.addView((View) imageView, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.f18970j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, znVar));
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
            rg.p0 p0Var = new rg.p0(parentActivity, znVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.c3(g3Var, 1));
            p0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, w7.x5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        g3Var.setCustomView(linearLayout);
        g3Var.show();
    }

    public static void Q0(bo boVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f18162id = boVar.getMessagesController().getInputUser(boVar.f32281f);
            boVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new qe(boVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(boVar.getUserConfig().getCurrentUser(), boVar.T5, messageObject, boVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = boVar.C8();
        SendMessagesHelper.getInstance(boVar.currentAccount).sendMessage(of2);
        if (boVar.R3 == 0) {
            boVar.O9(false);
        }
        boVar.e9(false);
    }

    public static bo Q9(int i10, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i10);
        return new bo(bundle);
    }

    public static boolean R0(bo boVar) {
        MessageObject messageObject = boVar.Lb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static bo R9(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new bo(bundle);
    }

    public static void S0(bo boVar, int i10) {
        int i11;
        RectF rectF;
        fh.d dVar = boVar.H;
        fh.d dVar2 = boVar.I;
        ArrayList arrayList = boVar.Ec;
        ah.i iVar = boVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && iVar != null) {
            if (w7.c0.a(i10, 4)) {
                boVar.p9();
            }
            if (w7.c0.a(i10, 2)) {
                ArrayList arrayList2 = boVar.Dc;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, boVar.X0.getMeasuredWidth(), boVar.f32506x0.getY() + boVar.f32506x0.getPaddingTop());
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
                int a2 = yf.e0.a(arrayList2, i11, arrayList);
                int measuredWidth = boVar.X0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.p.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(boVar.f32506x0.getY(), rectF2.top);
                    rectF2.right = w7.p.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(boVar.f32506x0.getY() + boVar.f32506x0.getMeasuredHeight(), rectF2.bottom);
                }
                iVar.g(a2, arrayList);
            }
            tm tmVar = boVar.X0;
            Objects.requireNonNull(tmVar);
            if (iVar.e(new gg(tmVar, 0), boVar.X0.getWidth(), boVar.X0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = boVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                boVar.n9();
            }
        }
    }

    public static void T0(bo boVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(boVar.currentAccount).getInputUser(user.f18268id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(boVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new uh(boVar, tL_attachMenuBot, user, 1), 66);
    }

    public static MessageObject T1(bo boVar) {
        org.telegram.ui.Cells.t1 t1Var = boVar.f32266d9;
        if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
            return t1Var.getMessageObject();
        }
        return null;
    }

    public static void U(org.telegram.ui.bo r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.U(org.telegram.ui.bo, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void U0(bo boVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, xf xfVar) {
        String str4;
        org.telegram.ui.Components.p31 p31Var;
        if (boVar.f32262d5 != null && i10 < arrayList.size() && boVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = boVar.getParentActivity();
            int i11 = iArr[0];
            sf sfVar = new sf(boVar, 20);
            String[] strArr = org.telegram.ui.Components.w31.R;
            if (parentActivity == null) {
                p31Var = null;
            } else {
                org.telegram.ui.Components.p31 p31Var2 = new org.telegram.ui.Components.p31(parentActivity, str, str4, inputPeer, i11, richMessage, sfVar);
                p31Var2.H(z10);
                p31Var2.M = boVar;
                p31Var2.N = xfVar;
                if (boVar.getParentActivity() != null) {
                    boVar.showDialog(p31Var2);
                }
                p31Var = p31Var2;
            }
            p31Var.setDimBehind(false);
            boVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(boVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + boVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + boVar.a(), i12 - 1).apply();
                boVar.Qc(true);
            }
        }
    }

    public static void U4(bo boVar, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int themedColor;
        int i11;
        le.b bVar = boVar.f32491vc;
        if (boVar.Y != null && !bVar.f13985f && t1Var.getMessageObject() != null) {
            tm tmVar = boVar.X0;
            RectF rectF = AndroidUtilities.rectTmp;
            hh.k.c(t1Var, tmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            sh.a aVar = t1Var.f20988a6;
            if (aVar != null && t1Var.f21173n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((boVar.X0.getMeasuredHeight() - boVar.f32506x0.getPaddingBottom()) + boVar.f32440rc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = t1Var.getMessageObject();
                if (boVar.Bc == null) {
                    boVar.Bc = new qh.c(boVar.getParentActivity(), boVar.resourceProvider, boVar);
                    int indexOfChild = boVar.X0.indexOfChild(boVar.f32506x0);
                    if (indexOfChild >= 0) {
                        boVar.X0.addView(boVar.Bc, indexOfChild + 1, w7.x5.g());
                    } else {
                        boVar.X0.addView(boVar.Bc, w7.x5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (t1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.j6.nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f19143sb;
                    }
                    themedColor = boVar.getThemedColor(i11);
                } else {
                    if (t1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.j6.f19071od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19053nd;
                    }
                    themedColor = boVar.getThemedColor(i10);
                }
                boVar.Bc.setColor(themedColor);
                boVar.Bc.setCellToWatch(t1Var);
                boVar.Bc.f41780b.f41776a.a(false, false);
                boVar.Bc.setAnimatedVisibility(bVar.e);
                boVar.Bc.f41780b.setOnClickListener(new org.telegram.ui.Components.voip.o(new wg(boVar, 2), 8));
                qh.c cVar = boVar.Bc;
                cVar.f41785s = new wg(boVar, 3);
                org.telegram.ui.Cells.b6 b6Var = cVar.f41779a;
                b6Var.setOnKeyListener(new xg(boVar, 0));
                b6Var.setOnEditorActionListener(new ka(boVar, 1));
                boVar.Y.U4 = b6Var;
                AndroidUtilities.runOnUIThread(new ai.s1(boVar, measuredHeight, b6Var, 28), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(bo boVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new gf(boVar, i10, 6));
        } else {
            boVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void V0(bo boVar, TLRPC.ReactionCount reactionCount) {
        boVar.A7(true);
        org.telegram.ui.Components.jn0.c(boVar.getParentActivity(), boVar.currentAccount, reactionCount.reaction, boVar.f32279ea);
    }

    public static void V1(bo boVar, float f7) {
        org.telegram.ui.Cells.t1 t1Var = boVar.f32266d9;
        if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
            t1Var.setSlidingOffset(f7);
        }
    }

    public static void W(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(boVar.currentAccount).loadAttachMenuBots(false, true);
            boVar.W9(user.f18268id, boVar.f32351k8, false);
        }
    }

    public static void W0(bo boVar, String str) {
        if (MessagesController.getInstance(boVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            nf.f.m(boVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.c5.o0(boVar.getParentActivity(), boVar.f32279ea, str, true, new qg(boVar, str, 1));
        }
    }

    public static void X(bo boVar) {
        if (!boVar.e7(boVar.Y.getSendButton())) {
            if (boVar.getMediaController().isPlayingMessage(boVar.f32262d5)) {
                boVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = boVar.getMessagesController().getInputPeer(boVar.T5);
            if (boVar.f32275e5 != null) {
                for (int i10 = 0; i10 < boVar.f32275e5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f18237id.add(Integer.valueOf(boVar.f32275e5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f18237id.add(Integer.valueOf(boVar.f32262d5.getId()));
            }
            ConnectionsManager.getInstance(boVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ai.v1(27, boVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void X0(bo boVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        boVar.Mb(tL_game, messageObject, str, false, j3);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void X1(bo boVar) {
        long j3;
        zp zpVar = boVar.P9;
        if (zpVar != null) {
            if (boVar.f32310h4) {
                if (zpVar.H != null) {
                    if (boVar.getParentLayout() != null) {
                        org.telegram.ui.Components.m9.a(boVar, boVar.getParentLayout().getFragmentStack().indexOf(boVar), boVar.e, boVar.f32281f, boVar.f32249c4, boVar.T5, boVar.f32489va, boVar.f32477ua);
                    }
                    TLRPC.Chat chat = boVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = boVar.P9.H;
                    long j10 = boVar.T5;
                    int i10 = boVar.f32477ua;
                    int i11 = boVar.f32489va;
                    if (boVar.getParentLayout() != null) {
                        org.telegram.ui.Components.m9.a(boVar, boVar.getParentLayout().getFragmentStack().indexOf(boVar), chat, null, tL_forumTopic, j10, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", boVar.P9.f40298a);
                    bundle.putInt("dialog_filter_id", boVar.P9.f40300b);
                    bundle.putBoolean("pulled", true);
                    bo g10 = ng.d.g(boVar, -boVar.T5, boVar.P9.H, 0, bundle);
                    g10.R9 = true;
                    Nc = true;
                    boVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = zpVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f18121id;
            }
            if (j3 != 0) {
                boVar.v6();
                zp zpVar2 = boVar.P9;
                TLRPC.Chat chat3 = zpVar2.G;
                long j12 = zpVar2.Z;
                int i12 = zpVar2.f40298a;
                int i13 = zpVar2.f40300b;
                if (boVar.getParentLayout() != null) {
                    org.telegram.ui.Components.m9.a(boVar, boVar.getParentLayout().getFragmentStack().indexOf(boVar), chat3, null, null, j12, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = boVar.P9.G;
                if (chat4 != null) {
                    j11 = chat4.f18121id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", boVar.P9.f40298a);
                bundle2.putInt("dialog_filter_id", boVar.P9.f40300b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(boVar.currentAccount).edit().remove("diditem" + boVar.P9.Z).apply();
                bo boVar2 = new bo(bundle2);
                ArrayList arrayList = boVar.f32280eb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = boVar.f32280eb;
                    boVar2.f32280eb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                boVar2.R9 = true;
                Nc = true;
                boVar.presentFragment(boVar2, true);
            }
        }
    }

    public static void Y(bo boVar, long j3, long j10, Long l4, Boolean bool) {
        boolean z10;
        yh.v5 y3 = yh.v5.y(boVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y3.i0(j3, j10, z10, true);
    }

    public static void Y0(bo boVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            boVar.f32330ic = true;
            boVar.f32506x0.g1();
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
            bo boVar2 = new bo(bundle);
            boVar2.pb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                boVar2.L7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = boVar2.X3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                boVar2.X3.messageOwner.reactions = tL_messageReactions;
            }
            ai.c9 c9Var = new ai.c9(boVar, new boolean[]{false}, i11, boVar2, 13);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f18142id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = boVar2.getClassGuid();
                NotificationCenter.getInstance(boVar.currentAccount).addObserver(new zi(boVar, classGuid, c9Var, boVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        bo boVar3 = bo.this;
                        MessagesController messagesController = boVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i18, true, 0, ((MessageObject) hg.k0.h(1, arrayList)).getId(), 1, false, 0, true, boVar3.f32310h4, null);
                    }
                });
                return;
            }
            c9Var.run();
            return;
        }
        boVar.f32317hc = 0;
        boVar.f32330ic = false;
        boVar.f32506x0.g1();
        if (messageObject2 != null) {
            boVar.ga(messageObject2);
        } else if (boVar.getParentActivity() != null) {
            org.telegram.ui.Components.vc.a0(boVar).t(LocaleController.getString(R.string.ChannelPostDeleted), boVar.f32279ea).j();
        }
    }

    public static void Z(bo boVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (boVar.getParentActivity() != null) {
            TLRPC.Chat chat = boVar.e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !boVar.e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (boVar.h == null && (userFull = boVar.f32225a8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32279ea);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new we(boVar, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                boVar.showDialog(alertDialog$Builder.f18447a);
            } else if (!boVar.H4.isEmpty()) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
                edit.putInt("pin_" + boVar.T5, ((Integer) boVar.H4.get(0)).intValue()).commit();
                boVar.yc(0, true);
            }
        }
    }

    public static void Z0(bo boVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = boVar.getMessagesController().getInputPeer(boVar.T5);
                tL_messages_getHistory.offset_date = boVar.f32500w7 + 86400;
                tL_messages_getHistory.limit = 1;
                boVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ai.v1(25, boVar, tLObject));
                return;
            }
            boVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a0(bo boVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(boVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, boVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(boVar.currentAccount).editMessage(messageObject, null, false, boVar, null, i10, i11);
        }
    }

    public static void a1(long j3, bo boVar) {
        if (yh.v5.y(boVar.currentAccount, false).p().amount < j3) {
            new yh.n7(boVar.getParentActivity(), boVar.getResourceProvider(), j3, 13, DialogObject.getShortName(boVar.a()), new sf(boVar, 15), boVar.a()).show();
        } else {
            new yh.o7(boVar.getParentActivity(), boVar.resourceProvider).show();
        }
    }

    public static void b0(bo boVar, long j3, boolean z10) {
        if (!boVar.H4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
            edit.putInt("pin_" + boVar.T5, ((Integer) boVar.H4.get(0)).intValue()).commit();
            boVar.H4.clear();
            boVar.J4.clear();
            boVar.L4 = 0;
            boVar.P4 = 0;
            boVar.Q4 = 0;
            boVar.yc(0, true);
        }
        if (ChatObject.isMonoForum(boVar.e) && ChatObject.canManageMonoForum(boVar.currentAccount, boVar.e)) {
            if (j3 != 0) {
                boVar.getMessagesStorage().removeTopic(-boVar.e.f18121id, j3);
                boVar.getMessagesController().deleteSavedDialog(j3, boVar.getMessagesController().getInputPeer(-boVar.e.f18121id));
                boVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(boVar.e.f18121id, j3);
            }
        } else {
            boVar.getMessagesController().deleteDialog(boVar.T5, 1, z10);
            boVar.getMessagesStorage().removeAllTopics(boVar.T5);
            boVar.getMessagesController().getTopicsController().reloadTopics(-boVar.T5);
        }
        boVar.M5.put(j3, 0);
        org.telegram.ui.Components.y21 y21Var = boVar.R1;
        if (y21Var != null) {
            y21Var.setAllTopicsHidden(false);
        }
        if (j3 == boVar.f32261d4) {
            boVar.y7(false, null);
            boVar.A0.O(false);
        }
    }

    public static void b1(bo boVar) {
        if (AndroidUtilities.addToClipboard(boVar.Lb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.resourceProvider));
        }
    }

    public static void b2(bo boVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            messageObject = t1Var.getMessageObject();
            t1Var.f21068g1 = f7;
            t1Var.f21082h1 = f10;
            org.telegram.ui.Components.pa0 pa0Var = t1Var.Kc;
            float f11 = t1Var.f21082h1;
            pa0Var.h = t1Var.getTranslationX() + f7;
            pa0Var.f26981i = f11;
            pa0Var.f26984l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int E8 = boVar.E8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && E8 >= 2 && E8 != 20 && E8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        boVar.x6(messageObject, z10, true);
                        boVar.dc();
                        boVar.Wc(false);
                    }
                }
            }
        }
    }

    public static void b4(bo boVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(boVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new c7(boVar, h0Var, text, 3), new y0(h0Var, 15));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void c0(bo boVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, xf xfVar) {
        String str4;
        if (boVar.f32262d5 != null && i10 < arrayList.size() && boVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = boVar.f32262d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.w31.J(boVar.getParentActivity(), boVar, inputPeer, iArr[0], boVar.f32262d5.summarized, str, str4, charSequence, z10, xfVar, new sf(boVar, 28)).setDimBehind(false);
            boVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(boVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + boVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + boVar.a(), i11 - 1).apply();
                boVar.Qc(true);
            }
        }
    }

    public static void c1(bo boVar, long j3, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(boVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.c01.c(boVar.getParentActivity(), boVar.currentAccount, -j3, boVar.getUserConfig().getCurrentUser(), null, z10, z11, boVar.getResourceProvider());
    }

    public static void c2(bo boVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = boVar.f32473u6;
        SparseArray[] sparseArrayArr = boVar.W5;
        if (!boVar.Oa && (i11 = i10 - boVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.ml0 ml0Var = boVar.f32506x0;
            ri riVar = new ri(boVar, z10, sparseArray);
            if (!ml0Var.f26171d2) {
                ml0Var.f26188m2 = new int[2];
                new HashSet();
                ml0Var.m1(ml0Var, true);
                ml0Var.f26179h2 = riVar;
                ml0Var.f26171d2 = true;
                ml0Var.f26177g2 = i10;
                ml0Var.f26175f2 = i10;
            }
        }
    }

    public static void d0(bo boVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(boVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f18237id;
        long clientUserId = boVar.getUserConfig().getClientUserId();
        long j10 = boVar.T5;
        if (clientUserId == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void d1(bo boVar, TLRPC.User user, String str, Boolean bool) {
        Intent intent;
        String country;
        if (boVar.getParentActivity() == null) {
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
            TLRPC.User currentUser = boVar.getUserConfig().getCurrentUser();
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
                    obj.f39700a = split[2];
                    String str2 = split[0];
                    obj.f39702c = str2;
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
            } catch (Exception e) {
                FileLog.e(e);
            }
            String str4 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 < 1) {
                    break;
                }
                List list2 = (List) hashMap.get(str4.substring(0, i10));
                if (list2 != null && list2.size() > 0) {
                    String str5 = ((xt) list2.get(0)).f39702c;
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
        boVar.getParentActivity().startActivity(intent);
    }

    public static boolean d2(bo boVar, View view, RectF rectF) {
        RectF rectF2 = boVar.Eb;
        if (rectF != null && boVar.f32506x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void d4(bo boVar) {
        if (boVar.I3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = boVar.R3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f18142id = 0;
        MessageObject messageObject = new MessageObject(boVar.currentAccount, tL_message, false, false);
        boVar.I3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void e0(bo boVar, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var = boVar.parentLayout;
        if (e5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 backgroundFragment = e5Var.getBackgroundFragment();
        if (backgroundFragment instanceof bo) {
            bo boVar2 = (bo) backgroundFragment;
            if (boVar2.a() == boVar.T5) {
                boVar.finishFragment();
                boVar2.F(i10, 0, 0, 0, true, true);
                return;
            }
        }
        boVar.presentFragment(Q9(i10, boVar.T5));
    }

    public static void e1(bo boVar, int i10) {
        if (boVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 q82 = boVar.q8(i10, false);
            if (q82 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q82;
                zg.q0 q0Var = t1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = t1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (q0Var.K || randomUnreadReaction.big)) {
                    zg.l0.d(boVar, null, q82, null, 0.0f, 0.0f, zg.p0.d(randomUnreadReaction.reaction), boVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    zg.l0.f();
                }
                q0Var.K = false;
                MessageObject messageObject = t1Var.f21333y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (q82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) q82;
                zg.q0 q0Var2 = w0Var.C0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (q0Var2.K || randomUnreadReaction2.big)) {
                    zg.l0.d(boVar, null, q82, null, 0.0f, 0.0f, zg.p0.d(randomUnreadReaction2.reaction), boVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    zg.l0.f();
                }
                q0Var2.K = false;
                MessageObject messageObject2 = w0Var.H0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void e4(bo boVar) {
        if (boVar.J3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f18142id = 0;
        MessageObject messageObject = new MessageObject(boVar.currentAccount, tL_message, false, false);
        boVar.J3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void f0(bo boVar, zf.a aVar, Runnable runnable) {
        if (!boVar.isFinished) {
            if (zf.a.m(yh.v5.x(boVar.currentAccount, aVar.f48980a).p()).f48981b < aVar.f48981b) {
                zf.b bVar = aVar.f48980a;
                if (bVar == zf.b.f48982a) {
                    new yh.n7(boVar.getParentActivity(), boVar.getResourceProvider(), aVar.a(), 13, ng.d.h(boVar.currentAccount, boVar.a()), null, boVar.a()).show();
                    return;
                } else if (bVar == zf.b.f48983b) {
                    new di.h(boVar.getParentActivity(), boVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void f1(bo boVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        boVar.f32299g5 = null;
        int i10 = boVar.nb;
        if (i10 == 2) {
            boVar.f32359l5 = null;
            boVar.f32385n5 = null;
            MessagePreviewParams messagePreviewParams = boVar.f32287f5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, boVar.T5, null);
            }
            boVar.j8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = boVar.f32287f5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = boVar.f32287f5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = boVar.f32287f5.forwardMessages.messages.get(i11);
                    if (j3 == 0) {
                        j10 = messageObject3.getDialogId();
                        j3 = messageObject3.getFromChatId();
                    } else if (j3 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32279ea);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User user = boVar.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", boVar.f32287f5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = boVar.getMessagesController().getChat(Long.valueOf(-j10));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", boVar.f32287f5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                c2Var.T = AndroidUtilities.replaceTags(formatString);
                c2Var.R = LocaleController.formatPluralString("messages", boVar.f32287f5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new we(boVar, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new we(boVar, 5));
                boVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19101q7));
                }
            }
        } else if (i10 == 4) {
            boVar.G5 = null;
            MessagePreviewParams messagePreviewParams3 = boVar.f32287f5;
            if (messagePreviewParams3 != null) {
                int i12 = boVar.currentAccount;
                MessageObject messageObject4 = boVar.f32385n5;
                if (messageObject4 == boVar.X3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, boVar.f32359l5, boVar.p5);
            }
            nk nkVar = boVar.Y;
            nkVar.W2 = null;
            nkVar.X2 = false;
            boVar.i8();
            boVar.j8();
        } else {
            if (ChatObject.isForum(boVar.e) && !boVar.f32310h4 && (messageObject = boVar.f32385n5) != null) {
                long topicId = MessageObject.getTopicId(boVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    boVar.getMediaDataController().cleanDraft(boVar.T5, topicId, false);
                }
            }
            boVar.yb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void g0(bo boVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + boVar.T5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(boVar.e) && !boVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.g80.f24115r;
            org.telegram.ui.Components.g80.w(context, boVar, org.telegram.ui.Components.vc.a0(boVar), z10);
        }
        boVar.vb(false, true);
    }

    public static void g1(bo boVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        bo boVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        hh.a aVar = boVar.Pb;
        if (num.intValue() != boVar.d()) {
            boVar.f32378mc = false;
            kf kfVar = boVar.Mb;
            if (kfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kfVar);
                boVar.Mb.run();
                boVar.Mb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.y21 y21Var = boVar.R1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(y21Var.f30101b).getTopicsController().getTopics(-y21Var.f30103c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f18173id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = boVar.getMessagesController().getTopicsController().findTopic(-boVar.a(), tL_forumTopic.f18173id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                boVar.Za = SystemClock.uptimeMillis();
                boVar.f32409p7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    boVar.Sa(boVar.d());
                } else if (boVar.d() == 0) {
                    boVar.Sa(num.intValue());
                } else {
                    boVar.f32387n7 = -1;
                }
                boVar.getConnectionsManager().cancelRequestsForGuid(boVar.classGuid);
                boVar.getMessagesStorage().cancelTasksForGuid(boVar.classGuid);
                boVar.classGuid = ConnectionsManager.generateClassGuid();
                boVar.Pa();
                boVar.f32287f5 = null;
                boVar.f32474u7 = 0;
                boVar.f32350k7 = false;
                boVar.f32361l7 = true;
                boVar.f32312h6.clear();
                boVar.f32244c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(boVar.getCurrentAccount(), message, false, false));
                    boVar2 = boVar;
                    boVar2.pb(arrayList, boVar.e, tL_forumTopic2.f18173id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    boVar2 = boVar;
                    boVar2.f32249c4 = null;
                    boVar2.f32221a4 = null;
                    boVar2.X3 = null;
                    boVar2.f32385n5 = null;
                    boVar2.f32347k4 = 0;
                    boVar2.l4 = 0;
                    boVar2.f32370m4 = 0;
                    boVar2.f32261d4 = 0L;
                    boVar2.f32274e4 = 0;
                    boVar2.f32286f4 = null;
                    boVar2.f32310h4 = false;
                    boVar2.f32298g4 = false;
                }
                nm nmVar = boVar2.A0;
                if (nmVar != null) {
                    if (nmVar.I >= 0 && !nmVar.N()) {
                        nm nmVar2 = boVar2.A0;
                        nmVar2.u(nmVar2.I);
                    } else {
                        nm nmVar3 = boVar2.A0;
                        if (nmVar3.I < 0 && nmVar3.N()) {
                            boVar2.A0.o(0);
                        }
                    }
                    boVar2.A0.T();
                }
                boVar2.r8();
                boVar2.Nc(true);
                boVar2.f32219a1.n(true);
                if (tL_forumTopic2 != null) {
                    boVar2.Tc();
                } else {
                    boVar2.f32219a1.b();
                }
                boVar2.R1.setCurrentTopic(boVar2.d());
                boVar2.Qc(true);
                boVar2.hc(true);
                boVar2.getMessagesController().setForumLastTopicId(-boVar2.a(), boVar2.d());
                boVar2.Ea();
                boVar2.f9(true);
                boVar2.e9(true);
                boVar2.A6(true, true);
                if (boVar2.Y != null) {
                    if (!UserObject.isBotForum(boVar2.f32281f)) {
                        boVar2.Y.n0(false);
                    }
                    boVar2.Y.G1(true);
                }
                if (tL_forumTopic2 != null) {
                    boVar2.getMessagesController().getTopicsController().getTopicRepliesCount(boVar2.T5, tL_forumTopic2.f18173id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                boVar2.l1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                boVar2.f32367m1 = i11;
                boVar2.Bc(false);
                boVar2.Ac(false);
                boVar2.Rc();
                tn tnVar = boVar2.nc;
                if (tnVar != null && boVar2.actionBar.f19305n0) {
                    tnVar.p(null);
                }
                if (UserObject.isBotForum(boVar2.f32281f)) {
                    boVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(boVar2.T5, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(bo boVar, MessageObject messageObject, Long l4, Runnable runnable) {
        yh.v5.y(boVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void h1(bo boVar, String str) {
        if (MessagesController.getInstance(boVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            boVar.getParentActivity();
            nf.f.n(str);
            return;
        }
        org.telegram.ui.Components.c5.o0(boVar.getParentActivity(), boVar.f32279ea, str, false, new qg(boVar, str, 0));
    }

    public static void i0(bo boVar) {
        org.telegram.ui.Cells.t1 t1Var;
        yl ylVar;
        int i10;
        if (!boVar.Qb && boVar.F3 && boVar.f32506x0.G && boVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = boVar.f32506x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = boVar.f32506x0.getChildAt(childCount);
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
                boVar.Qb = true;
                yl ylVar2 = new yl(boVar, boVar.getParentActivity());
                ylVar2.p(true);
                ylVar2.K = Layout.Alignment.ALIGN_CENTER;
                ylVar2.d = 3500L;
                ylVar2.T = true;
                ylVar2.e = true;
                ylVar2.h = AndroidUtilities.dp(150.0f);
                ylVar2.q(8.0f);
                boVar.B1 = ylVar2;
                ylVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                boVar.X0.addView(boVar.B1, w7.x5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                t1Var.getLocationInWindow(iArr);
                boVar.C1 = t1Var.getTimeY() + iArr[1];
                boVar.B1.setTranslationY(((-ylVar.getTop()) - AndroidUtilities.dp(120.0f)) + boVar.C1);
                boVar.B1.m(0.0f, (t1Var.f21203pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + t1Var.f21233rb);
                boVar.B1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ne(boVar, 2));
            AndroidUtilities.runOnUIThread(new ne(boVar, 2), 2000L);
        }
    }

    public static void i1(bo boVar, Object[] objArr, org.telegram.ui.Components.wx0 wx0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.vc vcVar = new org.telegram.ui.Components.vc(wx0Var.container, boVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.oc r10 = vcVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f26705j = 2750;
                r10.k(true);
            }
        }
    }

    public static void i2(bo boVar) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (boVar.f32532z1 != null) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = null;
        for (int childCount = boVar.f32506x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = boVar.f32506x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (primaryMessageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                t1Var2 = t1Var;
            }
        }
        boVar.ub(t1Var2);
    }

    public static void j0(bo boVar) {
        if (boVar.M1) {
            boVar.getMessagesController().addDialogToFolder(boVar.T5, 0, 0, 0L);
            boVar.Q7();
            boVar.y3.j(23, boVar.T5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + boVar.T5, false);
            edit.putBoolean("dialog_bar_block" + boVar.T5, false);
            edit.putBoolean("dialog_bar_report" + boVar.T5, false);
            edit.commit();
            boVar.Qc(false);
            boVar.getNotificationsController().clearDialogNotificationsSettings(boVar.T5, boVar.d());
        } else if (boVar.L1.getTag() != null && ((Integer) boVar.L1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = boVar.Z7;
            if (chatFull != null && chatFull.participants != null) {
                a0.i iVar = new a0.i();
                for (int i10 = 0; i10 < boVar.Z7.participants.participants.size(); i10++) {
                    iVar.k(null, boVar.Z7.participants.participants.get(i10).user_id);
                }
                long j3 = boVar.Z7.f18122id;
                org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(boVar.getParentActivity(), boVar.currentAccount, iVar, boVar.Z7.f18122id, boVar, boVar.f32279ea);
                b70Var.f22636l0 = new we(boVar, 20);
                b70Var.show();
            }
        } else if (boVar.L1.getTag() != null) {
            boVar.rb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", boVar.f32281f.f18268id);
            bundle.putBoolean("addContact", true);
            us usVar = new us(bundle);
            usVar.O = new we(boVar, 21);
            boVar.presentFragment(usVar);
        }
    }

    public static void j1(bo boVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = boVar.f32385n5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = boVar.nb;
            if (i10 == 5) {
                int i11 = boVar.currentAccount;
                long j3 = boVar.T5;
                MessageSuggestionParams messageSuggestionParams = boVar.f32299g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new yh.e0(context, i11, j3, messageSuggestionParams, boVar, boVar.getResourceProvider(), 0, new cf(boVar, 3)).show();
            } else if (i10 == 1 && (messageObject = boVar.p5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = boVar.f32299g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    boVar.Tb(messageSuggestionParams2);
                } else if (boVar.p5.canEditMedia() && boVar.f32396o5 == 0) {
                    if (boVar.J1 == null) {
                        boVar.E7();
                    }
                    boVar.J1.I1(boVar.p5, -1);
                    boVar.X9();
                } else {
                    boVar.F(boVar.p5.getId(), 0, 0, 0, true, true);
                }
            } else if (boVar.f32287f5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(boVar.T5) && !boVar.f32287f5.hasSecretMessages && boVar.R3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        boVar.ca(0);
                        return;
                    }
                    MessageObject messageObject3 = boVar.f32385n5;
                    if (messageObject3 != null) {
                        boVar.F(messageObject3.getId(), 0, 0, 0, true, true);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    boVar.ca(1);
                } else if (i10 == 4) {
                    boVar.ca(2);
                }
            }
        }
    }

    public static void k0(bo boVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.p51[] p51VarArr;
        if (boVar.F5 != 0) {
            boVar.getConnectionsManager().cancelRequest(boVar.F5, true);
            boVar.F5 = 0;
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
            if ((charSequence instanceof Spannable) && (p51VarArr = (org.telegram.ui.Components.p51[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.p51.class)) != null && p51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.p51 p51Var : p51VarArr) {
                    arrayList.add(p51Var.getURL());
                }
            }
            if (arrayList != null && boVar.H5 != null && arrayList.size() == boVar.H5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) boVar.H5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            boVar.H5 = arrayList;
        } catch (Exception e) {
            FileLog.e(e);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new sf(boVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new sf(boVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (boVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ve(boVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = boVar.G5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = boVar.f32354kb + 1;
            boVar.f32354kb = i11;
            mg mgVar = new mg(boVar, i11, getwebpagepreview, 0);
            if (boVar.f32365lb == null) {
                boVar.f32365lb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) boVar.f32365lb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                mgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            n6 n6Var = new n6(boVar, getwebpagepreview, mgVar, 1);
            if (boVar.F5 != 0) {
                boVar.getConnectionsManager().cancelRequest(boVar.F5, true);
            }
            boVar.F5 = boVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.m0(6, boVar, n6Var));
            boVar.getConnectionsManager().bindRequestToGuid(boVar.F5, boVar.classGuid);
        }
    }

    public static void k1(bo boVar, long j3, long j10) {
        yh.v5.y(boVar.currentAccount, false).C(j3, j10, new ng(boVar, j3, j10, 0));
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.g51(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f26908a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.q01(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f26908a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.q01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void l0(bo boVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(boVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (boVar.i() != null) {
                tLObject2 = boVar.i();
            } else {
                tLObject2 = boVar.e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = boVar.f32281f;
                if (user2 != null && user2.bot && user.f18268id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.vc.a0(boVar), null);
                } else if (user2 != null && user2.bot && user.f18268id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.vc.a0(boVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.vc.a0(boVar), null);
                } else {
                    TLRPC.Chat chat = boVar.e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.vc.a0(boVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = boVar.e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.w1.p(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.vc.a0(boVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                boVar.W9(user.f18268id, boVar.f32351k8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(boVar.getParentActivity());
                u6Var.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18957ia, false));
                u6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false));
                u6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.V = u6Var;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(boVar, user, atomicBoolean, tL_attachMenuBot, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(boVar.getParentActivity(), 5, boVar.getResourceProvider());
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
                    z1Var.setOnClickListener(new tf(3, z1Var, atomicBoolean));
                    c2Var.G = 6;
                    alertDialog$Builder.n(z1Var);
                }
                alertDialog$Builder.o();
            } else {
                lj1.a(boVar.getParentActivity(), new rh(boVar, user, tL_attachMenuBot, 0), null);
            }
        }
    }

    public static void l1(bo boVar, int i10) {
        if (boVar.R3 == 7) {
            Object E = boVar.M3.E(i10);
            if (i10 == 0) {
                boVar.M3.getClass();
            }
            if (E instanceof MessageObject) {
                boVar.fa((MessageObject) E);
            }
        } else if (boVar.f32418q3 != null) {
            if (i10 >= 0 && i10 < boVar.getMediaDataController().searchResultMessages.size()) {
                boVar.f32431r3 = false;
                boVar.lb(false, true, false);
                boVar.getMediaDataController().setSearchedPosition(i10);
                boVar.Fc(boVar.getMediaDataController().getMask(), boVar.getMediaDataController().getSearchPosition(), boVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new ue(boVar, boVar.getMediaDataController().searchResultMessages.get(i10), 2));
            }
        } else {
            boVar.getMediaDataController().jumpToSearchedMessage(boVar.classGuid, i10);
            boVar.Lb(false);
        }
    }

    public static void m0(bo boVar) {
        if (boVar.Lb == null) {
            return;
        }
        j41[] j41VarArr = {j41.T(boVar.getParentActivity(), boVar, true, boVar.resourceProvider, new pf(1, boVar, j41VarArr))};
    }

    public static void m1(bo boVar, long j3, long j10, Long l4) {
        int i10;
        String str;
        if (boVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = boVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(boVar.e)) {
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
        org.telegram.ui.Components.c5.i0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new ph(boVar, j3, j10, l4, 0), boVar.resourceProvider, true);
    }

    public static void n0(bo boVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, n6 n6Var) {
        try {
            a0.i iVar = new a0.i();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f18142id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(boVar.currentAccount, tL_message, false, false));
            iVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            boVar.getMessagesController().getStoriesController().f1200k.d(iVar, new wh(0, iVar, n6Var), boVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void n1(bo boVar) {
        MessagesController messagesController = boVar.getMessagesController();
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        int i10 = boVar.classGuid;
        int i11 = boVar.R3;
        long j11 = boVar.f32261d4;
        int i12 = boVar.f32370m4;
        int i13 = boVar.V5;
        boVar.V5 = i13 + 1;
        messagesController.loadMessages(j3, j10, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j11, i12, i13, boVar.f32310h4);
    }

    public static void o0(bo boVar, long j3, long j10) {
        BotForumHelper.getInstance(boVar.currentAccount).saveIsStreamingTopic(j3, j10, false);
        boVar.Mb = null;
    }

    public static void o1(bo boVar) {
        int i10;
        TLRPC.ChatFull chatFull = boVar.Z7;
        if (chatFull != null && !boVar.f32420q5) {
            TLRPC.Chat chat = boVar.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && boVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(boVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = boVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && boVar.visibleDialog == null && boVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = boVar.getParentActivity();
                    we weVar = new we(boVar, 12);
                    we weVar2 = new we(boVar, 13);
                    Pattern pattern = org.telegram.ui.Components.c5.f22934a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ai.k2(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.x5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                    c2Var.V = frameLayout;
                    c2Var.O0 = 0.3974359f;
                    c2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), weVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), weVar2);
                    boVar.showDialog(c2Var);
                }
            }
        }
    }

    public static void p0(bo boVar) {
        if (boVar.R3 == 0 && boVar.getMessagesController().freezeUntilDate > boVar.getConnectionsManager().getCurrentTime() && !b.a(boVar.currentAccount, boVar.f32281f)) {
            b.c(boVar.getParentActivity(), boVar.currentAccount, boVar.getResourceProvider());
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

    public static void q1(org.telegram.ui.bo r19, final org.telegram.ui.j41[] r20, final org.telegram.ui.Components.n70 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.q1(org.telegram.ui.bo, org.telegram.ui.j41[], org.telegram.ui.Components.n70):void");
    }

    public static void r0(bo boVar, ArrayList arrayList, long j3, org.telegram.ui.Components.bm0 bm0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(boVar.currentAccount).sendMessage(arrayList, j3, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new me(boVar, j3, 5), 400L);
            bm0Var.dismiss();
        }
    }

    public static void r1(bo boVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = boVar.A6;
        int[] iArr4 = boVar.f32537z6;
        boolean[] zArr = boVar.E6;
        int[] iArr5 = boVar.f32524y6;
        int[] iArr6 = boVar.B6;
        boolean[] zArr2 = boVar.D6;
        ArrayList arrayList = boVar.f32312h6;
        if ((i10 - i11) - i12 <= i13 && !boVar.G6) {
            boolean[] zArr3 = boVar.C6;
            if (!zArr3[0]) {
                boVar.G6 = true;
                arrayList.add(Integer.valueOf(boVar.V5));
                if (boVar.f32434r6.size() != 0) {
                    MessagesController messagesController = boVar.getMessagesController();
                    j3 = 0;
                    long j10 = boVar.T5;
                    c10 = 0;
                    long j11 = boVar.L6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = boVar.classGuid;
                    int i17 = boVar.R3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = boVar.f32261d4;
                    int i18 = boVar.f32370m4;
                    int i19 = boVar.V5;
                    boVar.V5 = i19 + 1;
                    messagesController.loadMessages(j10, j11, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j12, i18, i19, boVar.f32310h4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    MessagesController messagesController2 = boVar.getMessagesController();
                    long j13 = boVar.T5;
                    long j14 = boVar.L6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = boVar.classGuid;
                    int i22 = boVar.R3;
                    long j15 = boVar.f32261d4;
                    int i23 = boVar.f32370m4;
                    int i24 = boVar.V5;
                    boVar.V5 = i24 + 1;
                    messagesController2.loadMessages(j13, j14, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j15, i23, i24, boVar.f32310h4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (boVar.L6 != 0 && !zArr3[1]) {
                    boVar.G6 = true;
                    arrayList.add(Integer.valueOf(boVar.V5));
                    MessagesController messagesController3 = boVar.getMessagesController();
                    long j16 = boVar.L6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = boVar.classGuid;
                    int i28 = boVar.R3;
                    long j17 = boVar.f32261d4;
                    int i29 = boVar.f32370m4;
                    int i30 = boVar.V5;
                    boVar.V5 = i30 + 1;
                    messagesController3.loadMessages(j16, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j17, i29, i30, boVar.f32310h4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i12 > 0 && !boVar.I7 && i11 <= 10) {
            if (boVar.L6 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(boVar.V5));
                MessagesController messagesController4 = boVar.getMessagesController();
                long j18 = boVar.L6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = boVar.classGuid;
                int i34 = boVar.R3;
                long j19 = boVar.f32261d4;
                int i35 = boVar.f32370m4;
                int i36 = boVar.V5;
                boVar.V5 = i36 + 1;
                messagesController4.loadMessages(j18, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j19, i35, i36, boVar.f32310h4);
                boVar.I7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(boVar.V5));
                MessagesController messagesController5 = boVar.getMessagesController();
                long j20 = boVar.T5;
                long j21 = boVar.L6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = boVar.classGuid;
                int i40 = boVar.R3;
                long j22 = boVar.f32261d4;
                int i41 = boVar.f32370m4;
                int i42 = boVar.V5;
                boVar.V5 = i42 + 1;
                messagesController5.loadMessages(j20, j21, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j22, i41, i42, boVar.f32310h4);
                boVar.I7 = true;
            }
        }
    }

    public static void s0(long j3, bo boVar) {
        if (yh.v5.y(boVar.currentAccount, false).p().amount < j3) {
            new yh.n7(boVar.getParentActivity(), boVar.getResourceProvider(), j3, 13, DialogObject.getShortName(boVar.a()), new sf(boVar, 15), boVar.a()).show();
        } else {
            new yh.o7(boVar.getParentActivity(), boVar.resourceProvider).show();
        }
    }

    public static void t0(bo boVar, TLRPC.Document document) {
        boVar.f32484v4.put(document, 0);
        SendMessagesHelper.getInstance(boVar.currentAccount).sendSticker(document, null, boVar.T5, null, null, null, boVar.f32359l5, null, true, 0, 0, false, null, boVar.C8(), 0L, boVar.N8(), boVar.f32299g5);
    }

    public static void t1(bo boVar) {
        if (MessagesController.getInstance(boVar.currentAccount).isDialogMuted(boVar.T5, boVar.d())) {
            boVar.Pc(true);
            AndroidUtilities.runOnUIThread(new ne(boVar, 18), 150L);
            boVar.f32306h0.M(null, null);
            if (boVar.getParentActivity() != null) {
                org.telegram.ui.Components.vc.z(boVar, 4, 0, boVar.f32279ea).j();
                return;
            }
            return;
        }
        View view = boVar.f32271e1.f19571i;
        if (view instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) view).b();
        }
    }

    public static void u0(bo boVar, TLRPC.Document document) {
        boVar.f32484v4.put(document, 0);
        SendMessagesHelper.getInstance(boVar.currentAccount).sendSticker(document, null, boVar.T5, null, null, null, boVar.f32359l5, null, true, 0, 0, false, null, boVar.C8(), 0L, boVar.N8(), boVar.f32299g5);
    }

    public static void u1(bo boVar, String str) {
        if (boVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(boVar.currentAccount).getInviteText(1));
            boVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean u9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void v0(bo boVar) {
        long j3;
        ArrayList arrayList = boVar.f32312h6;
        arrayList.add(Integer.valueOf(boVar.V5));
        if (boVar.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(boVar.currentAccount);
            String str = boVar.f32470u3;
            int i10 = boVar.classGuid;
            int i11 = boVar.O3;
            int i12 = boVar.V5;
            boVar.V5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (boVar.f32500w7 != 0) {
            MessagesController messagesController = boVar.getMessagesController();
            long j10 = boVar.T5;
            long j11 = boVar.L6;
            int i13 = boVar.f32500w7;
            int i14 = boVar.classGuid;
            int i15 = boVar.R3;
            long j12 = boVar.f32261d4;
            int i16 = boVar.f32370m4;
            int i17 = boVar.V5;
            boVar.V5 = i17 + 1;
            messagesController.loadMessages(j10, j11, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j12, i16, i17, boVar.f32310h4);
        } else if (boVar.f32474u7 != 0 && (!boVar.F9() || boVar.f32474u7 == boVar.L7 || boVar.f32310h4)) {
            int i18 = boVar.f32337j7;
            if (i18 != 0) {
                boVar.L6 = i18;
                MessagesController messagesController2 = boVar.getMessagesController();
                long j13 = boVar.L6;
                boolean z10 = boVar.f32313h7;
                int i19 = boVar.f32301g7;
                int i20 = boVar.f32474u7;
                int i21 = boVar.classGuid;
                int i22 = boVar.R3;
                long j14 = boVar.f32261d4;
                int i23 = boVar.f32370m4;
                int i24 = boVar.V5;
                boVar.V5 = i24 + 1;
                messagesController2.loadMessages(j13, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j14, i23, i24, boVar.f32310h4);
            } else {
                MessagesController messagesController3 = boVar.getMessagesController();
                long j15 = boVar.T5;
                long j16 = boVar.L6;
                boolean z11 = boVar.f32313h7;
                int i25 = boVar.f32301g7;
                int i26 = boVar.f32474u7;
                int i27 = boVar.classGuid;
                int i28 = boVar.R3;
                long j17 = boVar.f32261d4;
                int i29 = boVar.f32370m4;
                int i30 = boVar.V5;
                boVar.V5 = i30 + 1;
                messagesController3.loadMessages(j15, j16, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j17, i29, i30, boVar.f32310h4);
            }
        } else if (boVar.f32325i7) {
            boVar.V5++;
        } else {
            MessagesController messagesController4 = boVar.getMessagesController();
            long j18 = boVar.T5;
            long j19 = boVar.L6;
            boolean z12 = boVar.f32313h7;
            int i31 = boVar.f32301g7;
            int i32 = boVar.f32474u7;
            int i33 = boVar.classGuid;
            int i34 = boVar.R3;
            long j20 = boVar.f32261d4;
            int i35 = boVar.f32370m4;
            int i36 = boVar.V5;
            boVar.V5 = i36 + 1;
            messagesController4.loadMessages(j18, j19, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j20, i35, i36, boVar.f32310h4);
        }
        int i37 = boVar.R3;
        if (i37 == 0 || (i37 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId())) {
            if (boVar.F9() && !boVar.f32310h4) {
                return;
            }
            arrayList.add(Integer.valueOf(boVar.V5));
            MessagesController messagesController5 = boVar.getMessagesController();
            long j21 = boVar.T5;
            long j22 = boVar.L6;
            int i38 = boVar.classGuid;
            if (boVar.R3 == 3) {
                j3 = 0;
            } else {
                j3 = boVar.f32261d4;
            }
            long j23 = j3;
            int i39 = boVar.f32370m4;
            int i40 = boVar.V5;
            boVar.V5 = i40 + 1;
            messagesController5.loadMessages(j21, j22, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j23, i39, i40, boVar.f32310h4);
        }
    }

    public static boolean v1(org.telegram.ui.bo r17, org.telegram.tgnet.TLRPC.MessageEntity r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.v1(org.telegram.ui.bo, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void w0(bo boVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, xf xfVar) {
        String str3;
        if (boVar.f32262d5 != null && i10 < arrayList.size() && boVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = boVar.f32262d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.w31.J(boVar.getParentActivity(), boVar, inputPeer, iArr[0], boVar.f32262d5.summarized, strArr[0], str3, charSequence, z10, xfVar, new wg(boVar, 12)).setDimBehind(false);
            boVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(boVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + boVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + boVar.a(), i11 - 1).apply();
                boVar.Qc(true);
            }
        }
    }

    public static void w1(bo boVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(boVar.currentAccount).loadAttachMenuBots(false, true);
            boVar.W9(user.f18268id, boVar.f32351k8, false);
        }
    }

    public static void x0(bo boVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(boVar.currentAccount).getInputUser(user.f18268id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(boVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new uh(boVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void x1(bo boVar, View view, int i10) {
        org.telegram.ui.Components.x5 x5Var;
        TLRPC.User user;
        char c10;
        rk rkVar;
        rk rkVar2;
        if (i10 != 0) {
            gg.k1 adapter = boVar.I1.getAdapter();
            if (adapter.f9842w0 != null && !adapter.f9824h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = boVar.I1.getAdapter().J(i11);
            int i12 = boVar.I1.getAdapter().X;
            int i13 = boVar.I1.getAdapter().Y;
            if (boVar.I1.getAdapter().F != null && i11 == 1) {
                boVar.Y.P0(i12, i13, boVar.I1.getAdapter().F + "@" + ChatObject.getPublicUsername(boVar.e) + " ", false);
            } else if (boVar.I1.getAdapter().F != null && i11 == 0) {
                boVar.Y.P0(i12, i13, a4.a.s(new StringBuilder(), boVar.I1.getAdapter().F, " "), false);
            } else if (J instanceof hg.a2) {
                if (!boVar.getUserConfig().isPremium()) {
                    boVar.showDialog(new rg.x0(boVar, boVar.getParentActivity(), boVar.currentAccount, true, 31, false, null));
                    return;
                }
                hg.a2 a2Var = (hg.a2) J;
                org.telegram.ui.Components.c5.a0(boVar.currentAccount, Math.max(1, a2Var.a()), boVar.T5, new ci.m2(28, boVar, a2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (boVar.R3 != 0 || !boVar.e7(view)) {
                        if (view instanceof org.telegram.ui.Cells.d8) {
                            sendAnimationData = ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.c5.a0(boVar.currentAccount, 1, boVar.a(), new ua(boVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), boVar.I1.getAdapter().L(i11), sendAnimationData, 2));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (boVar.f32383n3 && (rkVar2 = boVar.R2) != null && rkVar2.getVisibility() == 0) {
                        boVar.Za(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        boVar.Y.P0(i12, i13, a4.a.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (boVar.f32383n3 && (rkVar = boVar.R2) != null && rkVar.getVisibility() == 0) {
                        boVar.Za(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        boVar.Y.P0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(org.telegram.ui.Cells.p6.t(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.q51("" + user2.f18268id, 3, null), 0, spannableString.length(), 33);
                        boVar.Y.P0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof gg.h1) {
                    if (boVar.I1.getAdapter().J != null && boVar.R3 != 1) {
                        gg.h1 h1Var = (gg.h1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(h1Var.f9757a, boVar.T5, boVar.f32385n5, boVar.X3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = boVar.C8();
                        of2.ephemeralReceiverBotId = h1Var.f9758b;
                        of2.monoForumPeer = boVar.N8();
                        of2.suggestionParams = boVar.f32299g5;
                        boVar.getSendMessagesHelper().sendMessage(of2);
                        boVar.Y.setFieldText("");
                        boVar.e9(false);
                    }
                } else if (J instanceof String) {
                    if (boVar.I1.getAdapter().J != null) {
                        if (boVar.R3 == 1) {
                            org.telegram.ui.Components.c5.M(boVar.getParentActivity(), boVar.T5, new x5(6, boVar, (String) J), boVar.f32279ea);
                            return;
                        } else if (!boVar.e7(view)) {
                            org.telegram.ui.Components.c5.a0(boVar.currentAccount, 1, boVar.T5, new ci.m2(29, boVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    boVar.Y.P0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (boVar.Y.getFieldText() != null) {
                        if (boVar.R3 == 1 || !boVar.e7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (boVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32279ea);
                                    alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    boVar.showDialog(alertDialog$Builder.f18447a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(boVar.I1.getAdapter().R);
                                boVar.Ha = arrayList;
                                PhotoViewer.t1().J2(null, boVar, boVar.f32279ea);
                                PhotoViewer.t1().f2(arrayList, boVar.I1.getAdapter().M(i11), 3, false, boVar.Ia, boVar);
                                return;
                            }
                            org.telegram.ui.Components.c5.a0(boVar.currentAccount, 1, boVar.a(), new pf(0, boVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    l4 l4Var = new l4(23, boVar, (TLRPC.TL_inlineBotWebView) J);
                    if (boVar.f32329ib) {
                        l4Var.run();
                    } else {
                        lj1.a(boVar.getParentActivity(), new ai.g3(6, boVar, l4Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    gk gkVar = boVar.I1;
                    if (gkVar != null && (user = gkVar.getAdapter().f9842w0) != null) {
                        boVar.Y.setFieldText("");
                        long j3 = boVar.T5;
                        if (j3 == user.f18268id) {
                            boVar.f32289f8 = j3;
                            boVar.getMessagesController().sendBotStart(boVar.f32281f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f18268id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", boVar.T5);
                        if (boVar.getMessagesController().checkCanOpenChat(bundle, boVar)) {
                            boVar.presentFragment(new bo(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    nk nkVar = boVar.Y;
                    nkVar.V();
                    nkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            boVar.Y.P0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = boVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.o5.f(boVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                x5Var = new org.telegram.ui.Components.x5(f7, fontMetricsInt);
                            } else {
                                x5Var = new org.telegram.ui.Components.x5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(x5Var, 0, spannableString2.length(), 33);
                            boVar.Y.P0(i12, i13, spannableString2, false);
                            boVar.I1.o(false);
                        }
                    }
                    boVar.Y.P0(i12, i13, str, true);
                    boVar.I1.o(false);
                }
            }
        }
    }

    public static void y0(bo boVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(boVar.currentAccount).sendSticker(tL_document, str, boVar.T5, boVar.f32385n5, boVar.X3, null, boVar.f32359l5, null, z10, i10, 0, false, obj, boVar.C8(), 0L, boVar.N8(), boVar.f32299g5);
    }

    public static void y1(bo boVar, org.telegram.ui.Components.n70 n70Var) {
        if (boVar.Lb == null) {
            return;
        }
        n70Var.u();
        boVar.J9(boVar.Lb, false, true);
        nf.f.r(boVar.getParentActivity(), Uri.parse(boVar.Lb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(boVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void z0(bo boVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, xf xfVar) {
        if (boVar.f32262d5 != null && i10 < arrayList.size() && boVar.getParentActivity() != null) {
            org.telegram.ui.Components.w31.J(boVar.getParentActivity(), boVar, inputPeer, iArr[0], boVar.f32262d5.summarized, "und", str, charSequence, z10, xfVar, new wg(boVar, 4)).setDimBehind(false);
            boVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(boVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + boVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + boVar.a(), i11 - 1).apply();
                boVar.Qc(true);
            }
        }
    }

    public static void z1(bo boVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.bh bhVar;
        String str;
        SparseArray[] sparseArrayArr = boVar.W5;
        if (boVar.getParentActivity() != null && boVar.N9 == 0.0f) {
            if (boVar.R3 == 3) {
                Bundle bundle = new Bundle();
                long I8 = boVar.I8();
                if (I8 >= 0) {
                    bundle.putLong("user_id", I8);
                } else {
                    bundle.putLong("chat_id", -I8);
                }
                boVar.presentFragment(new bo(bundle));
                return;
            }
            boolean z12 = false;
            if (boVar.A9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                boVar.vb(true, true);
                byte[] bArr = boVar.V3;
                String str2 = boVar.W3;
                cf cfVar = new cf(boVar, 1);
                int i11 = d41.v;
                int currentAccount = boVar.getCurrentAccount();
                Activity parentActivity = boVar.getParentActivity();
                long a2 = boVar.a();
                if (parentActivity != null) {
                    d41.K(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.vc.a0(boVar), boVar.getResourceProvider(), bArr, str2, cfVar);
                }
            } else if (boVar.R3 == 2) {
                boVar.finishFragment();
                om omVar = boVar.V8;
                if (boVar.B0.getTag() == null) {
                    z12 = true;
                }
                omVar.W(true, z12);
            } else {
                TLRPC.User user = boVar.f32281f;
                if (user != null && user.f18268id == 489000) {
                    boVar.bc(true);
                } else if (user != null && boVar.f32379n) {
                    if (user.bot) {
                        String str3 = boVar.f32277e8;
                        boVar.f32277e8 = null;
                        boVar.getMessagesController().unblockPeer(boVar.f32281f.f18268id, new te(boVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32279ea);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                    c2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new we(boVar, 6));
                    c2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    boVar.showDialog(c2Var);
                } else if (UserObject.isReplyUser(user)) {
                    boVar.bc(true);
                } else {
                    TLRPC.User user2 = boVar.f32281f;
                    if (user2 != null && user2.bot && (str = boVar.f32277e8) != null) {
                        if (str.length() != 0) {
                            boVar.getMessagesController().sendBotStart(boVar.f32281f, boVar.f32277e8);
                        } else {
                            boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        boVar.f32277e8 = null;
                        boVar.hc(false);
                        return;
                    }
                    if (ChatObject.isChannel(boVar.e)) {
                        TLRPC.Chat chat = boVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (boVar.e.join_request) {
                                    boVar.vb(true, true);
                                    MessagesController.getInstance(boVar.currentAccount).addUserToChat(boVar.e.f18121id, UserConfig.getInstance(boVar.currentAccount).getCurrentUser(), 0, null, null, true, new ne(boVar, 17), new x5(5, boVar, context));
                                    return;
                                }
                                ne neVar = boVar.L5;
                                if (neVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(neVar);
                                    boVar.L5 = null;
                                }
                                boVar.vb(true, true);
                                boVar.getMessagesController().addUserToChat(boVar.e.f18121id, boVar.getUserConfig().getCurrentUser(), 0, null, boVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.r0 r0Var = boVar.K1;
                                if (r0Var != null && (bhVar = boVar.M0) != null && bhVar.d(r0Var) && boVar.N1.getVisibility() != 8 && boVar.N1.getTag(R.id.object_tag) != null) {
                                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(boVar.currentAccount).edit();
                                    edit.putInt("dialog_bar_vis3" + boVar.T5, 3).commit();
                                    boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(boVar.T5));
                                    return;
                                }
                                return;
                            }
                            boVar.bc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = boVar.Z7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = boVar.e;
                    TLRPC.User user3 = boVar.f32281f;
                    if (boVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.c5.s(boVar, false, chat2, user3, z11, true, false, z10, new we(boVar, 7));
                }
            }
        }
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final void A6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        rn rnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        rn rnVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j11;
        org.telegram.ui.Components.p01 p01Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.x5 x5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        Long l10;
        if (this.Y != null) {
            int i11 = this.R3;
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == I8())) {
                long j13 = 0;
                if (this.R3 == 8) {
                    if (ChatObject.isMonoForum(this.e)) {
                        if (this.f32261d4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.p01 p01Var2 = null;
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
                        j3 = this.f32261d4;
                    }
                    draft = mediaDataController.getDraft(j14, j3);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                nk nkVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                nkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.T5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j15 = this.T5;
                    if (l4 != null) {
                        j12 = l4.longValue();
                    } else {
                        j12 = this.f32261d4;
                    }
                    message = mediaDataController2.getDraftMessage(j15, j12);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.R3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.Zb >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        e9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.Zb = draftMessage3.date;
                    nk nkVar2 = this.Y;
                    nkVar2.W2 = null;
                    nkVar2.X2 = !draftMessage3.no_webpage;
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
                                p01Var = null;
                                org.telegram.ui.Components.q51 q51Var = new org.telegram.ui.Components.q51(a4.a.o(j11, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(q51Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f26908a |= 4;
                                    org.telegram.ui.Components.q01 q01Var = new org.telegram.ui.Components.q01(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(q01Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f26908a |= 1;
                                        org.telegram.ui.Components.q01 q01Var2 = new org.telegram.ui.Components.q01(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q01Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f26908a |= 2;
                                        org.telegram.ui.Components.q01 q01Var3 = new org.telegram.ui.Components.q01(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q01Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f26908a |= 8;
                                        org.telegram.ui.Components.q01 q01Var4 = new org.telegram.ui.Components.q01(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q01Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f26908a |= 16;
                                        org.telegram.ui.Components.q01 q01Var5 = new org.telegram.ui.Components.q01(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q01Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.p51 p51Var = new org.telegram.ui.Components.p51(messageEntity.url, p01Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(p51Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f26908a |= 256;
                                        org.telegram.ui.Components.q01 q01Var6 = new org.telegram.ui.Components.q01(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q01Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.ti0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            FileLog.e((Throwable) e, false);
                                            fontMetricsInt = p01Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            x5Var = new org.telegram.ui.Components.x5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            x5Var = new org.telegram.ui.Components.x5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(x5Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        p01Var = p01Var2;
                                    }
                                    p01Var = p01Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                p01Var = null;
                            }
                            i12++;
                            p01Var2 = p01Var;
                            j13 = j16;
                            draftMessage3 = draftMessage2;
                        }
                        j10 = j13;
                        rnVar = p01Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        rnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.f1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new ne(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f32299g5 = of2;
                        Db(of2);
                    }
                    messageObject = this.f32385n5;
                    if (messageObject != null || this.X3 == messageObject) {
                        if (message == null && ((messageObject2 = this.X3) == null || messageObject2.getId() != message.f18142id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f32385n5 = messageObject3;
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
                                        rnVar2 = rnVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        rnVar2 = new rn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f32359l5 = rnVar2;
                                }
                            }
                            V6(false);
                            rn rnVar3 = this.f32359l5;
                            if (rnVar3 != null) {
                                Cb(this.f32385n5, rnVar3);
                            } else {
                                Bb(this.f32385n5);
                            }
                            hc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j10 && this.e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.e.f18121id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f32385n5 = messageObject4;
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
                rnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f32299g5 = of22;
                    Db(of22);
                }
                messageObject = this.f32385n5;
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
        org.telegram.ui.ActionBar.o1 o1Var = this.Q8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f32229ac;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32229ac.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f32229ac = ofFloat;
            ofFloat.addUpdateListener(new pe(this, 0));
            this.f32229ac.setDuration(150L);
            this.f32229ac.start();
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
        if (this.f32363l9 == null) {
            this.f32363l9 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount, true, this.Ba, this.f32279ea);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f32363l9;
        if (this.e == null && !UserObject.isUserSelf(this.f32281f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        t1Var.N7 = z11;
        org.telegram.ui.Cells.t1 t1Var2 = this.f32363l9;
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
        TLRPC.User user = this.f32281f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        t1Var2.R7 = z14;
        if (ChatObject.isChannel(this.e) && this.e.megagroup) {
            z15 = true;
        }
        t1Var2.S7 = z15;
        this.f32363l9.E8 = t9();
        this.f32363l9.F8 = C9();
        this.f32363l9.G8 = B9();
        return this.f32363l9.g1(messageObject, (MessageObject.GroupedMessages) this.f32512x6.f(messageObject.getGroupId()), z10);
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
            } catch (Exception e) {
                FileLog.e(e);
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
                if (ChatObject.isChannel(this.e) && (tL_chatBannedRights = this.e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                lq0 lq0Var = new lq0(0, z10, true, this);
                if (this.R3 == 9) {
                    lq0Var.G = 1;
                    lq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        lq0Var.G = 10;
                        lq0Var.H = true;
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
                        lq0Var.G = i11;
                        lq0Var.H = z11;
                    }
                }
                lq0Var.V = new sl(this);
                presentFragment(lq0Var);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Ab(ArrayList arrayList) {
        yb(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void Ac(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f32367m1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32332j1.e(4, z11, z10);
        this.f32332j1.c(4, this.f32367m1, z10);
    }

    public final int B6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f32506x0.getHeight();
        long j3 = 0;
        int i11 = 0;
        while (true) {
            View V0 = this.f32506x0.V0(i10);
            if (V0 == null) {
                break;
            }
            if (V0 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) V0;
                messageObject = t1Var.getMessageObject();
                additionalPaddingHeight = t1Var.getAdditionalPaddingHeight();
            } else if (V0 instanceof org.telegram.ui.Cells.w0) {
                messageObject = ((org.telegram.ui.Cells.w0) V0).getMessageObject();
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
                height = Math.min(height, V0.getTop());
                i11 = Math.max(i11, V0.getBottom() - additionalPaddingHeight);
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
        if (ChatObject.isForum(this.e) && !this.f32310h4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f18173id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.e));
        }
        return this.f32261d4;
    }

    public final boolean B9() {
        org.telegram.ui.Components.y21 y21Var = this.R1;
        if (y21Var != null && y21Var.Q && y21Var.f30099a.f13985f) {
            return true;
        }
        return false;
    }

    public final void Ba(int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Ba(int):void");
    }

    public final void Bb(MessageObject messageObject) {
        zb(true, messageObject, null, false, true);
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
        this.f32332j1.e(3, z11, z10);
        this.f32332j1.c(3, this.l1, z10);
    }

    @Override
    public final void C(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            qh.c cVar = this.Bc;
            if (cVar != null) {
                this.X0.removeView(cVar);
                this.Bc = null;
            }
            nk nkVar = this.Y;
            if (nkVar != null) {
                nkVar.I0();
            }
        }
    }

    public final float C6(boolean z10) {
        float f7;
        float f10;
        float f11;
        nk nkVar = this.Y;
        float f12 = 0.0f;
        if (nkVar != null) {
            if (z10) {
                f7 = nkVar.f21811k5;
            } else {
                f7 = nkVar.f21805j5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        le.b bVar = this.f32491vc;
        j6.l lVar = this.Ac;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f12910a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f12910a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f13985f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f12911b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.e;
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
            if (this.T3 || !ChatObject.isMonoForum(this.e)) {
                if (!ChatObject.isForum(this.e) || !ChatObject.areTabsEnabled(this.e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Ca(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f32289f8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f32281f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f32289f8 == this.T5) {
                this.f32289f8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f32289f8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((o2Var instanceof bo) && ((bo) o2Var).T5 == this.f32289f8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f32289f8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f32289f8));
                } else if (DialogObject.isUserDialog(this.f32289f8)) {
                    bundle.putLong("user_id", this.f32289f8);
                } else {
                    bundle.putLong("chat_id", -this.f32289f8);
                }
                v6();
                presentFragment(new bo(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Cb(MessageObject messageObject, rn rnVar) {
        yb(true, messageObject, null, null, null, true, 0, rnVar, false, 0L, null, true);
    }

    public final void Cc(boolean z10) {
        String string;
        if (this.R3 != 3 && !UserObject.isBotForum(this.f32281f)) {
            qj qjVar = this.f32219a1;
            if (qjVar != null && this.f32261d4 != 0) {
                if (this.f32310h4) {
                    Sc();
                } else if (this.f32298g4) {
                    MessageObject messageObject = this.X3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f32219a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f32219a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.X3;
                    if (messageObject2 != null) {
                        qjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f32235b4 != null) {
                if (this.X3.getRepliesCount() == 0) {
                    if (this.f32298g4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f32235b4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
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
            qh.c cVar = this.Bc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.f32491vc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                le.b bVar = this.wc;
                float f11 = 1.0f - bVar.e;
                this.M0.setAlpha(f11);
                org.telegram.ui.Components.bh bhVar = this.M0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                bhVar.setVisibility(i12);
                float f12 = 1.0f - bVar.e;
                org.telegram.ui.Components.y21 y21Var = this.R1;
                if (y21Var != null) {
                    y21Var.setAlpha(f12);
                    org.telegram.ui.Components.y21 y21Var2 = this.R1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    y21Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                hh.f fVar = this.K3;
                le.b bVar2 = this.xc;
                if (fVar != null) {
                    float f13 = bVar2.e;
                    fVar.setAlpha(f13);
                    hh.f fVar2 = this.K3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    fVar2.setVisibility(i15);
                }
                if (bVar2.e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jh.f fVar3 = this.X;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar3.setVisibility(i11);
                l7();
                if (bVar2.e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vj vjVar = this.f32506x0;
                if (z11) {
                    i13 = 0;
                }
                vjVar.setVisibility(i13);
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

    public final boolean D6() {
        if (!z9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f32310h4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                sk skVar = this.O0;
                if (skVar == null || skVar.getVisibility() != 0) {
                    if (!F9() || this.f32310h4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.D7():void");
    }

    public final boolean D9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f32244c && !this.d && this.f32281f == null && this.f32506x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f32316hb == null) {
                this.f32316hb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f32316hb.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f32506x0.getChildCount(); i12++) {
                    i11 += this.f32506x0.getChildAt(i12).getHeight();
                    int top = this.f32506x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f32451s9) {
                    L6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.C6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f32473u6;
                if ((!z12 || ((this.L6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.G6 && f10 > this.f32451s9 && (!arrayList.isEmpty() ? i11 != 0 : this.f32305gb)) {
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
                        Drawable d = this.f32279ea.d();
                        tm tmVar = this.X0;
                        if (tmVar != null) {
                            d = tmVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.cc0) {
                            org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) d;
                            if (cc0Var.N != z11) {
                                if (!z11) {
                                    cc0Var.c();
                                }
                                cc0Var.q(z11);
                                if (z11) {
                                    f7 = 1.5f;
                                } else {
                                    f7 = 1.0f;
                                }
                                cc0Var.M = f7;
                                cc0Var.z();
                            } else if (z11) {
                                cc0Var.z();
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
        tL_message.f18142id = 0;
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
        yb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
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
            MessageObject messageObject3 = (MessageObject) this.f32397o6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                nm nmVar = this.A0;
                if (nmVar != null) {
                    nmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    public final boolean E6() {
        if (this.h == null) {
            sk skVar = this.O0;
            if (skVar == null || skVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E7() {
        if (getParentActivity() != null && getParentActivity() != null && this.J1 == null) {
            ai.g4 g4Var = new ai.g4(this, getParentActivity(), this, this.f32279ea, 2);
            this.J1 = g4Var;
            g4Var.Z = a();
            ai.g4 g4Var2 = this.J1;
            g4Var2.f28754i0 = true;
            g4Var2.Z1 = new pl(this);
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f18141id)) {
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
        zb(z10, null, webPage, z11, true);
    }

    public final void Ec(boolean z10) {
        nk nkVar = this.Y;
        if (nkVar != null) {
            nkVar.O1(z10);
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
        if (messageObject != null && ChatObject.isForum(this.e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f18121id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.R3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void F7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        wg wgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.W5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f32281f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.Z7;
        long j3 = this.L6;
        int d = (int) d();
        int i10 = this.R3;
        wg wgVar2 = new wg(this, 6);
        if (z10) {
            wgVar = new wg(this, 7);
        } else {
            wgVar = null;
        }
        wg wgVar3 = wgVar;
        org.telegram.ui.Components.c5.z(this, user, chat, encryptedChat, chatFull, j3, messageObject, this.W5, groupedMessages, d, i10, null, wgVar2, wgVar3, this.f32279ea);
    }

    public final int F8() {
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        int i10 = 0;
        if (e5Var == null || e5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i10);
                if (o2Var != this && (o2Var instanceof bo) && ((bo) o2Var).T5 == this.T5) {
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
        if (messageObject == this.Lb) {
            this.Lb = null;
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
                AnimatorSet animatorSet = this.f32297g3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.X2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32297g3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f32297g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 1.0f));
                this.f32297g3.addListener(new yi(this, 5));
                this.f32297g3.start();
            }
            if (!z10) {
                r9();
                this.f32220a3 = 1000;
            }
        }
    }

    public final void Fc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        jh.h hVar = this.f32332j1;
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
            hVar.b(6).f3166c = z10;
            aa.a aVar = hVar.e[6];
            if (aVar != null) {
                ((ih.b) aVar.f359b).b(z10, true);
            }
            jh.h hVar2 = this.f32332j1;
            if (this.Pa) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3166c = z11;
            aa.a aVar2 = hVar2.e[5];
            if (aVar2 != null) {
                ((ih.b) aVar2.f359b).b(z11, true);
            }
        }
        this.f32496w3 = i12;
        this.f32509x3 = i11;
        Gc();
        org.telegram.ui.Components.n6 n6Var = this.V2;
        if (n6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            n6Var.setClickable(z12);
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
        return this.f32326i8;
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.R3 != 0 || this.f32261d4 != 0 || (chatFull = this.Z7) == null || chatFull.ttl_period == 0)) || ((user = this.f32281f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f32225a8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f32245c0;
            if (u0Var != null) {
                u0Var.e(8);
            }
            qj qjVar = this.f32219a1;
            if (qjVar != null) {
                qjVar.f23610a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f32245c0;
            if (u0Var2 != null) {
                u0Var2.e(0);
            }
            qj qjVar2 = this.f32219a1;
            if (qjVar2 != null) {
                qjVar2.f23610a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f32442s0;
        if (u0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u0Var3.e(i11);
        }
        qj qjVar3 = this.f32219a1;
        if (qjVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f32281f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            qjVar3.setCommunityItemVisible(z11);
            final qj qjVar4 = this.f32219a1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = qjVar4.E;
            ImageView imageView2 = qjVar4.f23639y;
            if (imageView2 != null && imageView != null) {
                qjVar4.f23625l0 = z12;
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
                                    eo eoVar = qjVar4;
                                    if (!z14) {
                                        eoVar.f23639y.setVisibility(4);
                                        return;
                                    } else {
                                        eoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    eo eoVar2 = qjVar4;
                                    if (!z15) {
                                        eoVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        eoVar2.getClass();
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
                                    eo eoVar = qjVar4;
                                    if (!z14) {
                                        eoVar.f23639y.setVisibility(4);
                                        return;
                                    } else {
                                        eoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    eo eoVar2 = qjVar4;
                                    if (!z15) {
                                        eoVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        eoVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f32219a1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f32225a8;
                if (userFull2 != null) {
                    this.f32219a1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.Z7;
                    if (chatFull3 != null) {
                        this.f32219a1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f32428r0 != null && (chatFull2 = this.Z7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f32428r0;
            if (z13) {
                i12 = 0;
            }
            u0Var4.e(i12);
        }
        o();
    }

    public final void G7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.G7(boolean):void");
    }

    public final int G8() {
        return Math.max(this.P4, this.Q4);
    }

    public final void G9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        ArrayList arrayList = this.f32473u6;
        if (!arrayList.isEmpty()) {
            MessageObject messageObject = (MessageObject) hg.k0.h(1, arrayList);
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
                int N0 = this.f32531z0.N0();
                int L0 = this.f32531z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        nm nmVar = this.A0;
                        int i14 = nmVar.J;
                        if (L0 >= i14 && L0 < nmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                this.W8.f(i11);
                org.telegram.ui.ActionBar.c2 c2Var = this.f32401ob;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                xc(false);
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f32279ea);
                this.f32401ob = c2Var2;
                c2Var2.setOnCancelListener(this.f32376ma);
                this.f32401ob.q(1000L);
                int i15 = this.V5;
                this.Y8 = i15;
                this.f32226a9 = false;
                this.f32312h6.add(Integer.valueOf(i15));
                this.Z8 = 0;
                this.f32240b9 = false;
                MessagesController messagesController = getMessagesController();
                long j3 = this.T5;
                long j10 = this.L6;
                int i16 = this.classGuid;
                int i17 = this.R3;
                long j11 = this.f32261d4;
                int i18 = this.f32370m4;
                int i19 = this.V5;
                this.V5 = i19 + 1;
                messagesController.loadMessages(j3, j10, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j11, i18, i19, this.f32310h4);
                this.X2.setAlpha(0.0f);
                this.X2.setTag(null);
                this.f32321i3 = 0.0f;
                lc();
                this.Y2.setTag(null);
            }
        }
    }

    public final void Ga(MessageObject messageObject) {
        ArrayList arrayList = this.f32473u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            nm nmVar = this.A0;
            if (nmVar != null && !nmVar.N) {
                nmVar.u(nmVar.J + indexOf);
            }
        }
    }

    public final void Gb(boolean z10) {
        if (this.Y2 != null && !z9()) {
            if (this.Y2.getTag() == null) {
                ValueAnimator valueAnimator = this.f32309h3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.Y2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32321i3, 1.0f);
                this.f32309h3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f32309h3.addUpdateListener(new pe(this, 2));
                this.f32309h3.addListener(new yi(this, 7));
                this.f32309h3.start();
            }
            if (!z10) {
                r9();
                this.f32220a3 = 1000;
            }
        }
    }

    public final void Gc() {
        org.telegram.ui.Components.n6 n6Var = this.U2;
        if (n6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f32496w3;
            if (i10 < 0) {
                n6Var.c("", z10, true);
            } else if (i10 == 0) {
                n6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f32431r3) {
                n6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.R3 != 7 && !this.xc.f13985f) {
                n6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f32509x3 + 1), Integer.valueOf(this.f32496w3)), z10, true);
            } else {
                n6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
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
            return (int) this.f32261d4;
        }
        return 0;
    }

    public final void H9() {
        this.D4 = true;
        if (this.f32372m6) {
            getMessagesStorage().getUnreadMention(this.T5, d(), new eh(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.T5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f32310h4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f32261d4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f32360l6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ai.v1(28, this, messagesStorage));
    }

    public final void Ha(MessageObject messageObject) {
        ArrayList arrayList = this.f32473u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            nm nmVar = this.A0;
            if (nmVar != null && !nmVar.N) {
                nmVar.P(nmVar.J + indexOf, true);
            }
        }
    }

    public final boolean Hb() {
        nk nkVar = this.Y;
        if (nkVar != null && nkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f32272e2 == null) {
                    if (!this.f32236b5) {
                        nk nkVar2 = this.Y;
                        if (nkVar2 != null) {
                            nkVar2.V();
                            MediaDataController.getInstance(nkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.cg cgVar = nkVar2.U0;
                            cgVar.L(false, false);
                            cgVar.Q(false, false);
                            cgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        tm tmVar = this.X0;
                        int indexOfChild = tmVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            nk nkVar3 = this.Y;
                            nkVar3.V();
                            MediaDataController.getInstance(nkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.cg cgVar2 = nkVar3.U0;
                            cgVar2.L(false, false);
                            cgVar2.Q(false, false);
                            cgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f32495w2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            tmVar.addView(this.f32495w2, i10, w7.x5.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(9, getParentActivity(), this.f32279ea, false);
                            this.f32272e2 = i40Var;
                            i40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            tmVar.addView(this.f32272e2, i10, w7.x5.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.i40 i40Var2 = this.f32272e2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f32495w2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new yi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f32272e2.f(emojiButton, true);
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
        String str = this.f32470u3;
        if (str != null) {
            this.f32259d2.e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.L3.setEmptyView(this.f32259d2);
            return;
        }
        this.L3.setEmptyView(null);
        this.f32259d2.setVisibility(8);
    }

    @Override
    public final long I() {
        return this.L6;
    }

    public final void I6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.I6():void");
    }

    public final boolean I7(android.view.View r94, boolean r95, boolean r96, float r97, float r98, boolean r99, boolean r100, boolean r101) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.I7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final long I8() {
        if (this.R3 == 3) {
            return this.f32261d4;
        }
        return 0L;
    }

    public final void I9(boolean z10) {
        TLRPC.Chat chat;
        if (this.ha == null && (chat = this.e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.T5);
            this.ha = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.R1(false, z10);
            }
        }
    }

    public final void Ia() {
        if (this.P7 == null && this.Q7 == null && this.R7 == null) {
            ne neVar = this.U7;
            if (neVar != null) {
                AndroidUtilities.cancelRunOnUIThread(neVar);
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
        if (chatFull != null && !this.f32420q5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new ne(this, 14), 1000L);
            }
        }
    }

    public final void Ic() {
        boolean z10;
        if (this.f32332j1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f32445s3 && !this.f32431r3) || (this.R3 == 7 && this.O3 == 2 && !this.f32473u6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32332j1.e(6, z10, true);
        this.f32332j1.e(5, z10, true);
        if (z10) {
            this.f32332j1.e(1, false, true);
        }
        if (!z10) {
            this.B7 = 0;
        }
        this.X0.invalidate();
    }

    public final void J6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.f32491vc.e) * (1.0f - this.f32466tc.e) * ((float[]) this.Ac.f12911b)[i10];
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
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f32506x0.getMeasuredHeight() - this.Aa) - this.f32451s9) - this.v.d()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
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
        org.telegram.ui.Components.oc G = org.telegram.ui.Components.vc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f26705j = max;
        G.v = new gf(this, i10, 3);
        G.k(true);
        this.G3 = messageObject;
        this.H3 = i10;
    }

    public final void Jc(String str) {
        if (this.R3 == 7 && !TextUtils.equals(this.f32470u3, str)) {
            M7();
            Lb(true);
            this.f32470u3 = str;
            this.f32458t3 = str;
            R6(false);
            x7(true);
            this.N6 = 0L;
            this.f32350k7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.O3);
            this.M3.l();
            this.L3.requestLayout();
            if (this.L3.getLayoutManager() != null) {
                this.L3.getLayoutManager().n0(0);
            }
            Hc();
            this.f32259d2.e(true, true);
            r8();
        }
    }

    @Override
    public final boolean K(wy wyVar) {
        return false;
    }

    public final boolean K6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.Z7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            rg.j0.C1(this, this.D1, this.E1, this.T5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void K7() {
        if (this.h == null && this.f32508x2 == null && getParentActivity() != null) {
            kl klVar = new kl(this, getParentActivity());
            this.f32508x2 = klVar;
            klVar.setTag(1);
            this.M0.addView(this.f32508x2, w7.x5.n(-1, 48));
            this.M0.h(1, this.f32508x2);
            this.M0.g(this.f32508x2);
            this.f32508x2.setOnClickListener(new xe(this, 17));
            this.f32508x2.setEnabled(!isInPreviewMode());
            this.f32508x2.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            org.telegram.ui.Components.vf0 vf0Var = new org.telegram.ui.Components.vf0(getParentActivity(), this.f32279ea);
            this.f32533z2 = vf0Var;
            this.f32508x2.addView(vf0Var, w7.x5.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f32508x2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.F2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.F2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.fe));
            this.F2.setTypeface(AndroidUtilities.bold());
            this.f32508x2.addView(this.F2, w7.x5.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            int i11 = 0;
            while (i11 < 2) {
                ao aoVar = new ao(this, getParentActivity());
                ao[] aoVarArr = this.C2;
                aoVarArr[i11] = aoVar;
                aoVar.setTextSize(i10);
                aoVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.fe));
                aoVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f32508x2.addView(aoVarArr[i11], w7.x5.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                ll llVar = new ll(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.D2;
                k5VarArr[i11] = llVar;
                llVar.setTextSize(i10);
                k5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18924ge));
                this.f32508x2.addView(k5VarArr[i11], w7.x5.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                ai.p4 p4Var = new ai.p4(getParentActivity(), 13);
                p4Var.setSingleLine(true);
                p4Var.setLines(1);
                p4Var.setMaxLines(1);
                p4Var.setEllipsize(TextUtils.TruncateAt.END);
                p4Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
                p4Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                p4Var.setTextSize(1, 14.0f);
                p4Var.setTypeface(AndroidUtilities.bold());
                p4Var.setGravity(17);
                p4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                ai.p4[] p4VarArr = this.E2;
                p4VarArr[i11] = p4Var;
                this.f32508x2.addView(p4Var, w7.x5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                ml mlVar = new ml(getParentActivity());
                mlVar.I = new vh.h();
                mlVar.H = new Path();
                mlVar.J = new float[8];
                org.telegram.ui.Components.u9[] u9VarArr = this.B2;
                u9VarArr[i11] = mlVar;
                mlVar.setBlurAllowed(true);
                u9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f32508x2.addView(u9VarArr[i11], w7.x5.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i11 == 1) {
                    aoVarArr[i11].setVisibility(4);
                    p4VarArr[i11].setVisibility(4);
                    k5VarArr[i11].setVisibility(4);
                    u9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.L2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.L2;
            int i12 = org.telegram.ui.ActionBar.j6.f18871de;
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
            int i13 = org.telegram.ui.ActionBar.j6.f19229x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13) & 436207615, 1, -1));
            this.f32508x2.addView(this.L2, w7.x5.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.L2.setOnClickListener(new xe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.J2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.J2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.J2.setScaleType(scaleType);
            this.J2.setVisibility(8);
            this.J2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f32279ea);
            this.K2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.K2.setSize(AndroidUtilities.dp(16.0f));
            this.K2.setStrokeWidth(2.0f);
            this.K2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18888ee));
            this.f32508x2.addView(this.K2, w7.x5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.J2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f32508x2.addView(this.J2, w7.x5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.J2.setOnClickListener(new xe(this, 19));
            xc(false);
        }
    }

    public final int K8(MessageObject messageObject) {
        return J8(A8(messageObject, !TextUtils.isEmpty(this.P7))) - Ua(messageObject);
    }

    public final aj K9(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle) {
        nf.e eVar = this.f32542zb;
        if (eVar != null) {
            eVar.a(true);
            this.f32542zb = null;
        }
        if (characterStyle != null && t1Var != null && t1Var.getMessageObject() != null) {
            aj ajVar = new aj(this, t1Var.getMessageObject().getId(), characterStyle, t1Var, 0);
            this.f32542zb = ajVar;
            return ajVar;
        }
        this.f32542zb = null;
        return null;
    }

    public final void Ka(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        a0.i iVar;
        ArrayList arrayList2;
        nm nmVar;
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
            iVar = this.f32512x6;
            arrayList2 = this.f32473u6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.J4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f32397o6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f32281f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f32281f.f18268id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Ta();
                this.Pb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Ob.bind(messageObject2.messageOwner.f18142id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f18142id = id2;
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
                SparseArray sparseArray = this.f32408p6;
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
                    HashMap hashMap2 = this.f32434r6;
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
                        nm nmVar2 = this.A0;
                        if (nmVar2 != null && !nmVar2.N) {
                            nmVar2.Q(nmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        nm nmVar3 = this.A0;
                        if (nmVar3 != null && !nmVar3.N) {
                            nmVar3.u(nmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.i iVar3 = this.f32461t6;
                        if (((MessageObject) iVar3.f(id4)) != null) {
                            iVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            nm nmVar4 = this.A0;
                            int i22 = nmVar4.E;
                            int i23 = nmVar4.F;
                            int i24 = nmVar4.H;
                            int i25 = nmVar4.G;
                            if (!nmVar4.N) {
                                nmVar4.u(nmVar4.J + indexOf2);
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
                                this.f32448s6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                nm nmVar5 = this.A0;
                                int i26 = nmVar5.E;
                                int i27 = nmVar5.F;
                                int i28 = nmVar5.H;
                                int i29 = nmVar5.G;
                                if (!nmVar5.N) {
                                    nmVar5.u(nmVar5.J + indexOf2);
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) hg.k0.h(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (nmVar = this.A0) != null) {
                        nmVar.q(indexOf3 + nmVar.J, groupedMessages3.messages.size());
                        xj xjVar = this.f32519y0;
                        if (xjVar != null) {
                            xjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        zc();
    }

    public final void Kb(boolean z10) {
        boolean z11;
        jh.h hVar = this.f32332j1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.e)) {
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
        nk nkVar;
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
                org.telegram.ui.Components.oy0 oy0Var = this.f32258d1;
                if (oy0Var != null) {
                    oy0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.e)) {
                    TLRPC.Chat chat2 = this.e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.e.megagroup)) {
                        TLRPC.Chat chat3 = this.e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.j6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                pqVar.e = dp;
                                pqVar.f27112f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                pqVar.h = dp3;
                                pqVar.f27113n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(pqVar, 1), 0, 1, 33);
                                this.E0.setBackground(org.telegram.ui.ActionBar.j6.g0(0, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18953i6, false)));
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new xe(this, 0));
                            } else {
                                this.E0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.E0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.E0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.e.banned_rights.until_date)));
                        }
                        this.R.setVisibility(0);
                        this.I1.setVisibility(8);
                        this.I1.setTag(null);
                        sc();
                        org.telegram.ui.Components.oy0 oy0Var2 = this.f32258d1;
                        if (oy0Var2 != null) {
                            oy0Var2.f();
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
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a4.a.s(new StringBuilder("<b>"), this.f32281f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.T5, this.f32261d4, false);
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
                    if (this.f32258d1 != null && (nkVar = this.Y) != null && nkVar.l0()) {
                        this.f32258d1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.R.setVisibility(4);
            }
            if (z10) {
                this.Y.n0(false);
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
            vj vjVar = this.f32506x0;
            if (vjVar != null) {
                vjVar.invalidate();
            }
        }
    }

    public final void L7() {
        int i10;
        int i11;
        if (this.R2 == null && getParentActivity() != null) {
            rk rkVar = new rk(this, getParentActivity(), 1);
            this.R2 = rkVar;
            rkVar.setClickable(false);
            this.R2.setWillNotDraw(false);
            this.Ac.j(4, false, false);
            this.R2.setClipToPadding(false);
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), true, true, true);
            this.U2 = n6Var;
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
            n6Var.b(0.25f, 280L, qrVar);
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19253ye));
            this.U2.setGravity(3);
            this.R2.addView(this.U2, w7.x5.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.U.addView(this.R2, w7.x5.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(getParentActivity(), true, false, true);
            this.V2 = n6Var2;
            n6Var2.b(0.0f, 420L, qrVar);
            this.V2.setScaleProperty(0.7f);
            this.V2.setTextSize(AndroidUtilities.dp(15.0f));
            this.V2.setGravity(5);
            this.V2.setTypeface(AndroidUtilities.bold());
            this.V2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19065o6));
            org.telegram.ui.Components.n6 n6Var3 = this.V2;
            if (this.xc.f13985f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            n6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.n6 n6Var4 = this.V2;
            n6Var4.f26348n = false;
            n6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.V2.setOnClickListener(new xe(this, 2));
            this.V2.setAlpha(0.5f);
            this.V2.setClickable(false);
            this.R2.addView(this.V2, w7.x5.e(-2, -1, 117));
            org.telegram.ui.Components.n6 n6Var5 = new org.telegram.ui.Components.n6(getParentActivity(), true, true, true);
            this.W2 = n6Var5;
            n6Var5.setGravity(17);
            this.W2.setTypeface(AndroidUtilities.bold());
            this.W2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
            this.W2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.n6 n6Var6 = this.W2;
            int i12 = org.telegram.ui.ActionBar.j6.f18863d6;
            n6Var6.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i12), org.telegram.ui.ActionBar.j6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.j6.f18953i6))));
            org.telegram.ui.Components.n6 n6Var7 = this.W2;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            n6Var7.setText(LocaleController.getString(i11));
            this.W2.setOnClickListener(new xe(this, 3));
            this.W2.setVisibility(8);
            this.W2.setAlpha(0.0f);
            this.R2.addView(this.W2, w7.x5.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.e.megagroup) && this.R3 != 7 && !ChatObject.isMonoForum(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.T2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.T2.setImageResource(R.drawable.msg_usersearch);
                this.T2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19235xe), PorterDuff.Mode.MULTIPLY));
                this.T2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f19266z8), 1, -1));
                this.R2.addView(this.T2, w7.x5.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.T2.setOnClickListener(new xe(this, 4));
                this.T2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.R3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.S2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.S2.setImageResource(R.drawable.msg_calendar);
                this.S2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19235xe), PorterDuff.Mode.MULTIPLY));
                this.S2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f19266z8), 1, -1));
                this.R2.addView(this.S2, w7.x5.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.S2.setOnClickListener(new xe(this, 5));
                this.S2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int L8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f32506x0.getMeasuredHeight() - view.getBottom()) - this.f32506x0.getPaddingBottom()) + "} chatHeight=" + this.f32506x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f32506x0.getPaddingBottom());
        return (this.f32506x0.getMeasuredHeight() - view.getBottom()) - this.f32506x0.getPaddingBottom();
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
        this.f32474u7 = 0;
        this.f32350k7 = false;
        this.f32361l7 = true;
        this.f32312h6.clear();
    }

    public final void Lb(boolean z10) {
        int i10;
        if (this.K3 != null) {
            le.b bVar = this.xc;
            if (bVar.f13985f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.R3 == 7) {
                    s4.c0 c0Var = (s4.c0) this.L3.getLayoutManager();
                    Object E = this.M3.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.M3.E(c0Var.L0());
                    Object E3 = this.M3.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f32531z0.L0();
                        int N0 = this.f32531z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f18142id;
                        int i12 = ((MessageObject) E2).messageOwner.f18142id;
                        int i13 = ((MessageObject) E3).messageOwner.f18142id;
                        boolean z11 = false;
                        boolean z12 = false;
                        int i14 = -1;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f18142id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f18142id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f18142id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            int A8 = A8((MessageObject) L.get(i14), true);
                            this.f32531z0.h1(this.A0.J + i14, (this.f32506x0.getHeight() - A8) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.n6 n6Var = this.V2;
                if (n6Var != null) {
                    if (bVar.f13985f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    n6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ci.f4 f4Var = this.f32507x1;
                if (f4Var != null && f4Var.V) {
                    f4Var.e(true);
                }
                yl ylVar = this.B1;
                if (ylVar != null && ylVar.V) {
                    ylVar.e(true);
                }
                nk nkVar = this.Y;
                if (nkVar != null) {
                    nkVar.m0();
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
            dl dlVar = this.f32228ab;
            if (dlVar != null) {
                dlVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f32228ab.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                dl dlVar2 = this.f32228ab;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                dlVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new ne(this, 11), 120L);
            } else {
                z10 = !org.telegram.ui.Components.gk0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.w0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.bj0 bj0Var = k10.f19632x;
                if (bj0Var != null && k10.f19633y != i10) {
                    k10.f19633y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(bj0Var, i10);
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
        MessagePreviewParams messagePreviewParams = this.f32287f5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.G5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.G5 = null;
                nk nkVar = this.Y;
                if (nkVar != null) {
                    nkVar.W2 = null;
                    nkVar.X2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f32287f5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = nkVar.getFieldText();
                    MessageObject messageObject3 = this.f32385n5;
                    if (messageObject3 == this.X3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f32359l5, this.p5);
                }
                i8();
                j8();
            }
        }
    }

    public final void M7() {
        if (this.f32259d2 == null && this.f32456t1 == null) {
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getParentActivity(), this.f32279ea);
            this.f32247c2 = t00Var;
            t00Var.setViewType(7);
            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(getParentActivity(), this.f32247c2, 1, null);
            this.f32259d2 = zw0Var;
            zw0Var.setClickable(true);
            this.f32259d2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f32259d2.setVisibility(8);
            this.f32259d2.addView(this.f32247c2, 0);
            this.f32259d2.e(true, false);
            this.K3.addView(this.f32259d2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.d40 d40Var = new org.telegram.ui.Components.d40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f32456t1 = d40Var;
            d40Var.setOnHashtagClickListener(new cf(this, 2));
            this.f32456t1.setOnScrollListener(new h3(this, 5));
            this.f32456t1.setVisibility(8);
            this.K3.addView(this.f32456t1, -1, -1);
            r7();
            p7();
        }
    }

    public final tn M8() {
        if (this.nc == null) {
            this.nc = new tn(this);
        }
        return this.nc;
    }

    public final boolean M9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.b6 b6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.b6 animation;
        boolean z10;
        org.telegram.ui.Cells.t1 messageCell;
        boolean z11;
        if (this.f32506x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.i40 i40Var = this.f32457t2;
            ArrayList<MessageObject> arrayList = null;
            if (i40Var != null && i40Var.getTag() != null && (messageCell = this.f32457t2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                b6Var = photoImage2.getAnimation();
                if (b6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f32506x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f32514x8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                b6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f32506x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f32506x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject2 = t1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = t1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f32506x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f32506x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f32514x8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f32506x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    b6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                b6Var = animation;
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
                messageObject.audioProgress = b6Var.n();
                messageObject.audioProgressMs = b6Var.o();
                b6Var.stop();
                if (PhotoViewer.K1(messageObject)) {
                    PhotoViewer.f30915b9.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ma() {
        this.f32517xb = null;
        this.f32490vb = 0;
        this.f32504wb = -1;
        this.f32529yb = null;
        this.f32542zb = null;
        this.f32332j1.d(false);
    }

    public final void Mb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32279ea);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
            c2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            c2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ye(this, tL_game, messageObject, str, j3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
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
                    presentFragment(new oj1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        oj1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Mc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        if (this.fragmentView != null && !this.f32420q5) {
            int childCount = this.f32506x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f32506x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject = t1Var.getMessageObject();
                        if (this.f32463t8 != null && ((messageObject.isRoundVideo() || messageObject.isVideo()) && !messageObject.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject))) {
                            ImageReceiver photoImage = t1Var.getPhotoImage();
                            this.f32463t8.setTranslationX(t1Var.getX() + photoImage.getImageX());
                            this.f32463t8.setTranslationY((this.f32506x0.getY() + (photoImage.getImageY() + (t1Var.getY() + t1Var.getPaddingTop()))) - this.f32463t8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32463t8.getLayoutParams();
                            if (messageObject.isRoundVideo()) {
                                this.f32463t8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(C9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(C9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(C9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f32488v8.setResizeMode(0);
                                    this.f32463t8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(C9())) / AndroidUtilities.roundPlayingMessageSize(C9());
                                float imageWidth = t1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(C9());
                                if (this.f32463t8.getScaleX() != imageWidth) {
                                    this.f32463t8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f32463t8.setPivotX(0.0f);
                                this.f32463t8.setPivotY(0.0f);
                                this.f32463t8.setScaleX(imageWidth);
                                this.f32463t8.setScaleY(imageWidth);
                                this.f32501w8.setScaleX(roundPlayingMessageSize2);
                                this.f32501w8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f32463t8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f32488v8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f32463t8.setLayoutParams(layoutParams);
                                }
                                this.f32501w8.setScaleX(1.0f);
                                this.f32501w8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f32463t8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f32463t8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f32369m3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f32463t8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(C9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f32369m3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                F(playingMessageObject.getId(), 0, 0, 0, false, true);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f32514x8) {
                        this.f32506x0.invalidate();
                    }
                }
            }
        }
    }

    public final void N6() {
        MessageObject editingMessageObject;
        int abs;
        nk nkVar = this.Y;
        if (nkVar != null && (editingMessageObject = nkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f32281f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.k5 k5Var = ((org.telegram.ui.Components.qo[]) this.f32218a0.f785b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        k5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new wg(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.ve veVar = this.Y.E1;
                if (veVar != null) {
                    veVar.setVisibility(8);
                }
                k5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView N7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f32526y8);
        if (this.f32463t8 == null) {
            rk rkVar = new rk(this, getParentActivity(), 2);
            this.f32463t8 = rkVar;
            rkVar.setOutlineProvider(new ol(this));
            this.f32463t8.setClipToOutline(true);
            this.f32463t8.setWillNotDraw(false);
            k4 k4Var = new k4(getParentActivity());
            this.f32488v8 = k4Var;
            k4Var.setBackgroundColor(0);
            if (z10) {
                this.f32463t8.addView(this.f32488v8, w7.x5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f32501w8 = textureView;
            textureView.setOpaque(false);
            this.f32488v8.addView(this.f32501w8, w7.x5.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f32463t8.getParent();
        if (viewGroup != null && viewGroup != this.X0) {
            viewGroup.removeView(this.f32463t8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.X0.addView(this.f32463t8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(C9()), AndroidUtilities.roundPlayingMessageSize(C9())));
        }
        this.f32463t8.setTag(null);
        this.f32488v8.setDrawingReady(false);
        return this.f32501w8;
    }

    public final long N8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.e) || !ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
            return 0L;
        }
        long j3 = this.f32261d4;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.p5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f32385n5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j3;
    }

    public final void N9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var == null) {
            return;
        }
        long j3 = messageObject.messageOwner.action.channel_id;
        if (e5Var.getFragmentStack().size() > 0) {
            o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            o2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.e5 e5Var2 = this.parentLayout;
        if (indexOf > 0 && !(o2Var instanceof bo) && !(o2Var instanceof ProfileActivity) && this.e.creator) {
            int size = e5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) e5Var2.getFragmentStack().get(indexOf);
                if (o2Var2 instanceof bo) {
                    ((ActionBarLayout) e5Var2).c(indexOf, new bo(w.f.e(j3, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) e5Var2).c(indexOf, new ProfileActivity(w.f.e(j3, "chat_id"), null));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof wo) {
                    ((ActionBarLayout) e5Var2).c(indexOf, new wo(w.f.e(j3, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ur) {
                    if (((ur) o2Var2).f38134e1 == 0) {
                        Bundle arguments = o2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) e5Var2).c(indexOf, new ur(arguments));
                    }
                    o2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(this, o2Var, messageObject, e5Var2, 5));
        }
        AndroidUtilities.runOnUIThread(new me(this, j3, 1), 1000L);
    }

    public final void Na(org.telegram.ui.Cells.t1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Na(org.telegram.ui.Cells.t1):void");
    }

    public final void Nb(boolean z10) {
        if (z10) {
            if (this.Bb == null) {
                ne neVar = new ne(this, 10);
                this.Bb = neVar;
                AndroidUtilities.runOnUIThread(neVar, 100L);
                return;
            }
            return;
        }
        ne neVar2 = this.Bb;
        if (neVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(neVar2);
        }
        this.Bb = null;
        this.Ab = false;
        xc(true);
    }

    public final void Nc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        qj qjVar = this.f32219a1;
        if (qjVar == null) {
            return;
        }
        int i10 = this.R3;
        if (i10 == 8 && (chat2 = this.e) != null) {
            if (this.T3) {
                String i11 = ng.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.e;
                qjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f32261d4 > 0L ? 1 : (this.f32261d4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.e;
                        }
                        this.f32219a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        qj qjVar2 = this.f32219a1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.e;
                        qjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32261d4));
                    this.f32219a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f32261d4));
                    if (chat7 == null) {
                        chat7 = this.e;
                    }
                    this.f32219a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                qj qjVar3 = this.f32219a1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.e.title));
                TLRPC.Chat chat8 = this.e;
                qjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            qjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.Q3)) {
                this.f32219a1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.Q3)) {
                this.f32219a1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f32219a1.setTitle(this.Q3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.P3.title)) {
                this.f32219a1.setTitle(this.P3.title);
            } else {
                this.f32219a1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j3 = this.f32261d4;
                if (j3 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j3));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j3));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f32219a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f32219a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f32219a1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f32219a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f32219a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f32219a1.setTitle("");
                }
            } else if (F9() && !UserObject.isBotForum(this.f32281f)) {
                if (this.f32310h4) {
                    Sc();
                } else if (this.f32298g4) {
                    if (this.X3.hasReplies()) {
                        this.f32219a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f32219a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f32219a1.setTitle(LocaleController.formatPluralString("Replies", this.X3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f32281f)) {
                this.f32219a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f32281f)) {
                this.f32219a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.R3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f32281f)) {
                        this.f32219a1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f32219a1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f32219a1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", G8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.e;
                    if (chat9 != null) {
                        qj qjVar4 = this.f32219a1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.e;
                        qjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f32281f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f32219a1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f32281f.f18268id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f32281f.phone)) {
                                    qj qjVar5 = this.f32219a1;
                                    String j10 = org.telegram.messenger.w1.j(new StringBuilder("+"), this.f32281f.phone, gf.b.c());
                                    TLRPC.User user4 = this.f32281f;
                                    qjVar5.h(j10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f32281f), this.f32281f.emoji_status, z10);
                                } else {
                                    qj qjVar6 = this.f32219a1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f32281f)));
                                    TLRPC.User user5 = this.f32281f;
                                    qjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f32281f), this.f32281f.emoji_status, z10);
                                }
                            } else {
                                qj qjVar7 = this.f32219a1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f32281f)));
                                TLRPC.User user6 = this.f32281f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f32281f);
                                if (!MessagesController.isSupportUser(this.f32281f)) {
                                    emojiStatus = this.f32281f.emoji_status;
                                }
                                qjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f32219a1.getTitleTextView().getText());
        Pc(false);
    }

    public final void O6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.W7;
        if (call != null && (((str = this.f32302g8) != null || this.f32314h8) && this.N5)) {
            org.telegram.ui.Components.voip.f2.l(this.e, str, this.Y7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f32302g8 = null;
            this.f32314h8 = false;
            return;
        }
        if (this.f32302g8 != null && z10 && (chatFull = this.Z7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.vc.a0(this), R.raw.linkbroken, 36);
            this.f32302g8 = null;
        }
        this.X7 = !this.N5;
    }

    public final void O7() {
        if (this.X0 != null && this.K1 == null && getParentActivity() != null) {
            this.K1 = new org.telegram.ui.ActionBar.r0(this, getParentActivity(), 1);
            o9();
            this.K1.setClickable(true);
            this.M0.addView(this.K1, w7.x5.n(-1, 44));
            this.M0.h(2, this.K1);
            this.M0.g(this.K1);
            TextView textView = new TextView(getParentActivity());
            this.N1 = textView;
            int i10 = org.telegram.ui.ActionBar.j6.f19101q7;
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
            this.N1.setOnClickListener(new xe(this, 13));
            org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(getParentActivity(), this.f32279ea);
            this.T1 = c90Var;
            c90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18924ge));
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
            int i11 = org.telegram.ui.ActionBar.j6.f18942he;
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
            this.L1.setOnClickListener(new xe(this, 14));
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
            this.O1.setOnClickListener(new xe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.U1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.U1.setContentDescription(LocaleController.getString(R.string.Close));
            this.U1.setBackground(org.telegram.ui.ActionBar.j6.M(getThemedColor(org.telegram.ui.ActionBar.j6.f18953i6), 0, 0));
            this.U1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18871de), PorterDuff.Mode.MULTIPLY));
            this.U1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.addView(this.U1, w7.x5.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.U1.setOnClickListener(new xe(this, 16));
        }
    }

    public final int O8() {
        return this.X0.getBackgroundSizeY();
    }

    public final void O9(boolean z10) {
        int i10;
        if (this.f32506x0 != null) {
            ArrayList arrayList = this.f32473u6;
            if (!arrayList.isEmpty() && !this.f32503wa.f37326n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f32531z0.h1(i10, 0);
                this.f32506x0.C0();
            }
        }
    }

    public final void Oa() {
        org.telegram.ui.Components.cc0 i10;
        zn znVar = this.f32279ea;
        if (znVar != null) {
            Drawable d = znVar.d();
            if (this.fragmentView != null) {
                d = this.X0.getBackgroundImage();
            }
            if (d instanceof fo) {
                d = ((fo) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.cc0) {
                ((org.telegram.ui.Components.cc0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.g5) && (i10 = ((org.telegram.ui.ActionBar.g5) themedDrawable).i()) != null) {
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
                spannableString.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this);
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
                    org.telegram.ui.Components.oc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new mf(this, z10, 0)), spannableString), i12);
                    M.f26705j = 8000;
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
        if (this.f32520y1 == null && ChatObject.isMegagroup(this.e) && (chatFull = getMessagesController().getChatFull(this.e.f18121id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            sk skVar = this.O0;
            if (skVar == null || skVar.getVisibility() != 0) {
                org.telegram.ui.Components.j40 j40Var = org.telegram.ui.Components.j40.f25106n;
                if (j40Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j3 = groupStickerSetById.documents.get(0).f18127id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        j40Var.b();
                        ci.f4 f4Var = new ci.f4(getParentActivity(), 3);
                        this.f32520y1 = f4Var;
                        f4Var.i();
                        this.f32520y1.p(true);
                        ci.f4 f4Var2 = this.f32520y1;
                        f4Var2.K = Layout.Alignment.ALIGN_CENTER;
                        f4Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(j3, this.f32520y1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f32520y1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ci.f4 f4Var3 = this.f32520y1;
                        f4Var3.h = ci.f4.a(f4Var3.getText(), this.f32520y1.getTextPaint());
                        ci.f4 f4Var4 = this.f32520y1;
                        f4Var4.d = -1L;
                        f4Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new wg(this, 27), 300L);
                    }
                }
            }
        }
    }

    public final void P7() {
        int i10;
        if (this.R1 == null && getParentActivity() != null) {
            if (this.f32508x2 == null) {
                K7();
            }
            org.telegram.ui.Components.y21 y21Var = new org.telegram.ui.Components.y21(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.R1 = y21Var;
            y21Var.O = new ne(this, 5);
            dh.e p5 = eh.b.p(this.f32279ea);
            ah.c cVar = this.J;
            y21Var.setSideMenuBackgroundDrawable(cVar.c(y21Var, p5, false));
            org.telegram.ui.Components.y21 y21Var2 = this.R1;
            y21Var2.setTopMenuBackgroundDrawable(cVar.c(y21Var2, eh.b.p(this.f32279ea), false));
            this.R1.setCurrentTopic(d());
            this.R1.setOnNewTopicSelected(new ne(this, 6));
            this.R1.setOnTopicSelected(new bf(this, 0));
            this.R1.setOnDialogSelected(new bf(this, 1));
            int indexOfChild = this.X0.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.X0.addView(this.R1, i10, w7.x5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.R1.n();
            gk gkVar = this.I1;
            if (gkVar != null) {
                gkVar.bringToFront();
            }
        }
    }

    public final float P8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.X0.getBackgroundTranslationY()) - ((1.0f - this.f32515x9) * this.f32451s9);
    }

    public final boolean P9() {
        nk nkVar = this.Y;
        boolean z10 = nkVar.f21884y2;
        if (z10) {
            nkVar.s1();
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
        sk skVar;
        nk nkVar = this.Y;
        if (nkVar != null && nkVar.C1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.Y4 && nkVar != null && (skVar = this.O0) != null && skVar.getVisibility() != 0) {
            messageObject = this.f32385n5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.X2;
        } else {
            messageObject = null;
            charSequence = null;
            z10 = true;
        }
        if (this.f32371m5) {
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
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f32371m5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        rn rnVar = this.f32359l5;
        MessageSuggestionParams messageSuggestionParams = this.f32299g5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        nk nkVar2 = this.Y;
        if (nkVar2 != null) {
            j3 = nkVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.saveDraft(j10, B7, charSequence2, entities, message, rnVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void Pb(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f32298g4 && this.f32281f == null) {
                if (this.f32316hb == null) {
                    this.f32316hb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f32316hb.booleanValue()) {
                    this.f32305gb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.O5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f32305gb) {
                    return;
                }
                this.f32305gb = z10;
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
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new yi(this, 3)).start();
                return;
            }
            this.f32305gb = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Pc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (this.f32219a1 != null) {
            int i10 = this.R3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.T5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f32281f)) {
                    if (!UserObject.isReplyUser(this.f32281f) && ((!F9() || this.f32310h4) && isDialogMuted)) {
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
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.f32219a1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f32281f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f32219a1.c(DialogObject.getBotVerificationIcon(this.f32281f));
                        }
                    }
                }
                this.f32219a1.j(drawable, mutate);
                if (!z10 && (u0Var = this.f32271e1) != null) {
                    if (isDialogMuted) {
                        if (u0Var.f19574l != 8) {
                            u0Var.f19574l = 8;
                            View view = u0Var.f19571i;
                            if (view instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view).getRightIcon().setVisibility(u0Var.f19574l);
                            }
                        }
                        this.f32271e1.d(LocaleController.getString(R.string.Unmute));
                        this.f32271e1.b(R.drawable.msg_mute);
                    } else {
                        if (u0Var.f19574l != 0) {
                            u0Var.f19574l = 0;
                            View view2 = u0Var.f19571i;
                            if (view2 instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view2).getRightIcon().setVisibility(u0Var.f19574l);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.T5, d())) {
                            this.f32271e1.d(LocaleController.getString(R.string.Mute));
                            this.f32271e1.b(R.drawable.msg_unmute);
                        } else {
                            this.f32271e1.d(LocaleController.getString(R.string.Mute));
                            this.f32271e1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.po poVar = this.f32319i1;
                if (poVar != null) {
                    poVar.d(this.T5, d(), null);
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
                arrayList = this.f32473u6;
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
                        Collections.sort(arrayList2, new ff(3));
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
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f32279ea);
            this.y3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.X0.addView(this.y3, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final float Q8() {
        org.telegram.ui.Components.y21 y21Var = this.R1;
        if (y21Var != null) {
            return y21Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Qa() {
        org.telegram.ui.Cells.t1 t1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32506x0.getChildCount(); i11++) {
            View childAt = this.f32506x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int min = Math.min(t1Var2.getBottom(), this.f32506x0.getHeight()) - Math.max(0, t1Var2.getTop());
                if (min > i10) {
                    t1Var = t1Var2;
                    i10 = min;
                }
            }
        }
        if (t1Var != null) {
            yj yjVar = this.f32531z0;
            this.f32506x0.getClass();
            yjVar.i1(RecyclerView.S(t1Var), t1Var.getTop() - ((int) this.f32451s9), false);
        }
    }

    public final void Qb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new we(this, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f18447a);
    }

    public final void Qc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Qc(boolean):void");
    }

    public final void R6(boolean z10) {
        gg.o1 o1Var;
        if (this.O3 == 2 && (o1Var = this.M3) != null) {
            String str = this.f32470u3;
            ci.uc ucVar = o1Var.E;
            if (!TextUtils.equals(o1Var.f9883x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(ucVar);
                ai.v8 v8Var = o1Var.f9884y;
                if (v8Var != null && v8Var.I != 0) {
                    ConnectionsManager.getInstance(v8Var.f718c).cancelRequest(v8Var.I, true);
                    v8Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    o1Var.f9883x = str;
                    o1Var.f9884y = new ai.v8(o1Var.f9880r, str2, trim);
                    if (z10) {
                        ucVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(ucVar, 1000L);
                    }
                }
                ai.v8 v8Var2 = o1Var.f9884y;
                if (v8Var2 != null && v8Var2.J > 0) {
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
            ArrayList arrayList = this.f32473u6;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Ra(org.telegram.messenger.MessageObject):void");
    }

    public final void Rb() {
        String str;
        if (this.Fb != null) {
            return;
        }
        if (this.f32385n5 != null) {
            str = getMessagesController().getFullName(this.f32385n5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new we(this, 15));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new we(this, 16));
        c2Var.setOnDismissListener(new lg(this, 7));
        this.Fb = alertDialog$Builder.o();
    }

    public final void Rc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.u0 u0Var = this.f32455t0;
        if (u0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f32249c4) && (tL_forumTopic = this.f32249c4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u0Var.e(i10);
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
        if (this.v.f41098s == 1) {
            z10 = false;
        }
        if (this.Va != z10) {
            this.Va = z10;
            checkSystemBarColors();
        }
    }

    public final void S7(final int i10, final int i11, final boolean z10) {
        this.A0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f32473u6;
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
        vj vjVar = this.f32506x0;
        if (vjVar != null) {
            vjVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Pb(true);
        }
        nm nmVar = this.A0;
        nmVar.L = true;
        nmVar.O(true);
        Q7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                bo boVar = bo.this;
                MessagesController messagesController = boVar.getMessagesController();
                long j10 = boVar.T5;
                if (ChatObject.isChannel(boVar.e)) {
                    j3 = boVar.T5;
                } else {
                    j3 = 0;
                }
                messagesController.deleteMessagesRange(j10, j3, i10, i11, z10, new wg(boVar, 18));
            }
        }, new sf(this, 29));
    }

    public final int S8(int i10) {
        SparseIntArray sparseIntArray = this.V4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Ic;
            Ic = i12 + 1;
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
        float f7 = this.f32491vc.e;
        j6.l lVar = this.Ac;
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 1.0f - ((float[]) lVar.f12911b)[5], 1.0f);
        jh.c cVar = this.P0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(b10);
        }
        nk nkVar = this.Y;
        if (nkVar != null) {
            nkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        rk rkVar = this.R2;
        if (rkVar != null) {
            rkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        sk skVar = this.O0;
        if (skVar != null) {
            skVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        rk rkVar2 = this.R;
        if (rkVar2 != null) {
            rkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        hh.g gVar = this.S;
        if (gVar != null) {
            gVar.setInputBubbleAlpha((int) ((1.0f - b10) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        sk skVar2 = this.O0;
        le.b bVar = this.f32466tc;
        if (skVar2 != null) {
            skVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) lVar.f12911b)[3]);
        }
        zp zpVar = this.P9;
        if (zpVar != null) {
            float f10 = bVar.e;
            if (zpVar.S != f10) {
                zpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        q7();
    }

    public final void Sa(long j3) {
        yj yjVar;
        MessageObject messageObject;
        int L8;
        int abs;
        vj vjVar = this.f32506x0;
        int i10 = -1;
        if (vjVar != null && (yjVar = this.f32531z0) != null && yjVar.f42699y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f32506x0.getChildAt(childCount);
                this.f32506x0.getClass();
                if (RecyclerView.S(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j3 && (abs = Math.abs((L8 = L8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = L8;
                    i12 = abs;
                }
            }
            this.f32387n7 = i10;
            this.f32398o7 = i11;
            return;
        }
        this.f32387n7 = -1;
    }

    public final void Sb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.i40 i40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((i40Var = this.f32368m2) != null && i40Var.getVisibility() == 0)) {
                this.f32368m2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f32368m2.f(view, true);
                }
            }
        }
    }

    public final void Sc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        qj qjVar = this.f32219a1;
        if (qjVar != null && (tL_forumTopic = this.f32249c4) != null) {
            qjVar.setTitle(tL_forumTopic.title);
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
        org.telegram.ui.Components.bm0 bm0Var = new org.telegram.ui.Components.bm0(getParentActivity(), this.f32279ea);
        I.f26382p = new re(bm0Var, 0);
        if (!str.startsWith("video?") && !nf.f.f(Uri.parse(str), false, null)) {
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
            se seVar = new se(this, str, characterStyle, messageObject, t1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            t1Var2 = t1Var;
            I.c(i13, string, seVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            t1Var2 = t1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new te(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new te(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new ue(this, messageObject2, 0), false);
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
        I.c(i14, LocaleController.getString(i10), new ai.s4(this, str, messageObject2, startsWith, 10), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new te(this, str, 2), false);
        }
        bm0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            bm0Var.f(t1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.p51) {
            String url = ((org.telegram.ui.Components.p51) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                str2 = URLDecoder.decode(url.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e7) {
                FileLog.e(e7);
                str2 = url;
            }
            if (str2.length() > 204) {
                str2 = str2.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            bm0Var.f(t1Var2, characterStyle2, spannableString2, false);
        } else {
            bm0Var.f(t1Var2, characterStyle2, null, false);
        }
        showDialog(bm0Var);
    }

    public final int T8(int i10) {
        SparseIntArray sparseIntArray = this.U4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Ic;
            Ic = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void T9(boolean z10, boolean z11) {
        if (this.D3) {
            AndroidUtilities.runOnUIThread(new ne(this, 20), 200L);
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
        vj vjVar = this.f32506x0;
        if (vjVar != null && this.f32531z0 != null) {
            for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f32506x0.getChildAt(childCount);
                this.f32506x0.getClass();
                i11 = RecyclerView.S(childAt);
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
            this.f32531z0.h1(i11, i10);
        }
    }

    public final void Tb(MessageSuggestionParams messageSuggestionParams) {
        if (this.p5 == null) {
            return;
        }
        new yh.e0(getParentActivity(), this.currentAccount, this.T5, messageSuggestionParams, this, getResourceProvider(), 0, new cf(this, 0)).show();
    }

    public final void Tc() {
        qj qjVar;
        qj qjVar2;
        if (UserObject.isBotForum(this.f32281f) && (qjVar2 = this.f32219a1) != null) {
            qjVar2.getAvatarImageView().setVisibility(0);
            this.f32219a1.b();
        } else if (this.f32249c4 != null && (qjVar = this.f32219a1) != null) {
            qjVar.getAvatarImageView().setVisibility(0);
            ng.d.p(this.f32219a1.getAvatarImageView(), this.f32249c4, true, true, this.f32279ea);
        }
    }

    public final void U6() {
        MessageObject messageObject;
        if (!this.D4 && (messageObject = this.J7) != null) {
            if (this.f32473u6.indexOf(messageObject) >= 0) {
                this.E4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.C4 != null) {
        } else {
            sf sfVar = new sf(this, 22);
            this.C4 = sfVar;
            AndroidUtilities.runOnUIThread(sfVar);
        }
    }

    public final void U7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.t1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.U7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1):void");
    }

    public final long U8() {
        return this.f32261d4;
    }

    public final void U9() {
        this.D4 = true;
        um umVar = this.f32254c9;
        AndroidUtilities.cancelRunOnUIThread(umVar.f19961g0);
        umVar.f19990z = false;
        ne neVar = new ne(this, 8);
        int i10 = this.D7;
        if (i10 != 0) {
            Xa(i10, 0, false, this.C7, true, 0, null, null, neVar);
            return;
        }
        int i11 = this.B7;
        if (i11 > 0) {
            Xa(i11, 0, true, this.C7, true, 0, null, null, neVar);
            return;
        }
        Wa(!this.f32242bb, neVar);
        this.f32242bb = false;
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
                org.telegram.ui.Cells.t1 t1Var2 = this.f32363l9;
                if (t1Var2 != null && (textLayoutBlocks2 = t1Var2.f21340ye) != null && y82 != null && (messageObject2 = y82.captionMessage) != null) {
                    i10 = t1Var2.f21325xe;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (t1Var2 != null) {
                        t1Var2.f21325xe = 0;
                        t1Var2.f21340ye = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.f32363l9) != null && (textLayoutBlocks = t1Var.f21015c4) != null) {
                i10 = (int) t1Var.f21211q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.f32363l9;
                if (t1Var3 != null && t1Var3.f21254t1) {
                    i10 = t1Var3.f21153m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.f32363l9;
            if (t1Var4 != null) {
                t1Var4.f21325xe = 0;
                t1Var4.f21340ye = null;
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
        org.telegram.ui.Cells.t1 t1Var5 = this.f32363l9;
        if (t1Var5 != null) {
            t1Var5.f21325xe = 0;
            t1Var5.f21340ye = null;
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f32327i9 && this.f32339j9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f32327i9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f32315h9 == null) {
                        rl rlVar = new rl(getParentActivity(), this.f32279ea, this);
                        this.f32315h9 = rlVar;
                        this.X0.addView(rlVar, w7.x5.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f32315h9.c();
                }
            }
        }
    }

    public final void Uc() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.f32356l0;
        if (u0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var.e(i10);
    }

    public final void V6(boolean z10) {
        if (this.f32385n5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f32473u6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f32385n5.getId() && messageObject.getDialogId() == this.f32385n5.getDialogId()) {
                        this.f32385n5 = messageObject;
                        rn rnVar = this.f32359l5;
                        if (rnVar != null) {
                            rnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f32287f5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f32385n5;
                                MessageObject.GroupedMessages groupedMessages = this.f32335j5;
                                if (groupedMessages == null) {
                                    groupedMessages = y8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.T5, this.f32359l5);
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
        aj K9 = K9(t1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(gf.b.d(str, false));
        ua uaVar = new ua(this, t1Var, str, tL_contact, characterStyle, 1);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                uaVar.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new q1(this, tL_contact, uaVar, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = gf.b.d(str, false);
        K9.f15220b = new gf(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ca(this, K9, uaVar, 3)), 0);
        K9.d();
    }

    public final float V8(float f7) {
        bo boVar = this.f32267da;
        if (boVar == null) {
            boVar = this;
        }
        org.telegram.ui.Components.bh bhVar = boVar.M0;
        if (bhVar == null) {
            return 0.0f;
        }
        return bhVar.c(f7);
    }

    public final void Va() {
        Wa(false, null);
    }

    public final void Vb(boolean z10, boolean z11) {
        nk nkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f32444s2 != null) && this.R3 == 0 && (nkVar = this.Y) != null && nkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f32444s2 == null) {
                    tm tmVar = this.X0;
                    int indexOfChild = tmVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(9, getParentActivity(), this.f32279ea, false);
                        this.f32444s2 = i40Var;
                        tmVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f32444s2.b(true);
                    return;
                }
                if (this.Y.f21766d2) {
                    org.telegram.ui.Components.i40 i40Var2 = this.f32444s2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    i40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f32444s2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f32444s2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Vc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        vj vjVar = this.f32506x0;
        if (vjVar != null) {
            if (!this.D4 && this.J7 != null) {
                int childCount = vjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f32506x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.J7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f32473u6;
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
            int childCount2 = this.f32506x0.getChildCount();
            nk nkVar = this.Y;
            if (nkVar != null) {
                nkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f32506x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                    MessageObject messageObject3 = t1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        t1Var.X3(messageObject3, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        nm nmVar = this.A0;
                        this.f32506x0.getClass();
                        nmVar.Q(RecyclerView.S(t1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f32531z0.h1(i10, i11);
            }
        }
    }

    public final void W6() {
        sk skVar;
        rk rkVar;
        rk rkVar2;
        nk nkVar = this.Y;
        if (nkVar != null && nkVar.y3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((skVar = this.O0) == null || skVar.getVisibility() != 0) && (((rkVar = this.R) == null || rkVar.getVisibility() != 0) && ((rkVar2 = this.R2) == null || rkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void W7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.W7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final float W8(org.telegram.ui.Components.u21 u21Var) {
        float f7;
        org.telegram.ui.Components.y21 y21Var = this.R1;
        if (y21Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j3 = y21Var.j(u21Var);
            if (u21Var == org.telegram.ui.Components.u21.f28264b) {
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
        ai.g4 g4Var = this.J1;
        if (g4Var != null) {
            g4Var.N1(j3, str, z10, false);
        }
    }

    public final void Wa(boolean z10, ne neVar) {
        ArrayList arrayList;
        int i10;
        if (this.f32506x0.X1) {
            return;
        }
        this.N4 = 0;
        this.f32413pb = 0;
        this.O4 = false;
        this.W8.f(0);
        if (this.E6[0] && this.H7 == 0 && this.f32474u7 == 0) {
            this.f32332j1.d(false);
            if (this.f32531z0.I0() == 0) {
                this.f32303g9 = false;
                vc();
                Ia();
                Wc(false);
                return;
            }
            this.A0.T();
            on onVar = this.La;
            onVar.f36386a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f32473u6;
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
            vk vkVar = this.W8;
            onVar.f36387b = i11;
            onVar.d = 0;
            boolean z11 = !z10;
            onVar.f36388c = z11;
            vkVar.d(i11, 0, z11, true);
            this.f32303g9 = false;
            vc();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f32401ob;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        xc(false);
        if (neVar != null) {
            neVar.run();
        } else {
            Ma();
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f32279ea);
            this.f32401ob = c2Var2;
            c2Var2.setOnCancelListener(this.f32376ma);
            this.f32401ob.q(1000L);
        }
        this.Y8 = this.V5;
        this.f32226a9 = false;
        this.Z8 = 0;
        this.f32240b9 = false;
        ArrayList arrayList2 = this.f32312h6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.V5));
        AndroidUtilities.runOnUIThread(new sf(this, 13), 0L);
    }

    public final boolean Wb(MessageObject messageObject) {
        if (this.R3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void Wc(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Wc(boolean):void");
    }

    public final boolean X6(boolean z10, boolean z11) {
        nk nkVar = this.Y;
        if (nkVar == null || !nkVar.w0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32279ea);
            if (this.Y.f21759c1) {
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ai.k(6, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f18447a);
            return true;
        }
        return true;
    }

    public final void X7(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.X7(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages X8(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f32512x6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void X9() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            nk nkVar = this.Y;
            if (nkVar == null || TextUtils.isEmpty(nkVar.getSlowModeTimer())) {
                nk nkVar2 = this.Y;
                if (nkVar2 != null && nkVar2.f21800i5.f13985f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                E7();
                ai.g4 g4Var = this.J1;
                if (!z10 && this.R3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                g4Var.R1 = z11;
                g4Var.f28757j0.f0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 == 21 || i10 == 22) {
                    this.Y.Q();
                }
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f32299g5 == null) && !z10 && this.R3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        this.J1.J1(10, true);
                    } else {
                        this.J1.J1(-1, true);
                    }
                } else {
                    this.J1.J1(1, true);
                }
                ai.g4 g4Var2 = this.J1;
                g4Var2.S0 = true;
                g4Var2.f28803x1.setVisibility(0);
                g4Var2.Q0 = 0;
                g4Var2.F = false;
                g4Var2.G = false;
                g4Var2.f28754i0 = true;
                g4Var2.J = null;
                org.telegram.ui.ActionBar.w0 w0Var = g4Var2.f28761k1;
                if (w0Var != null) {
                    g4Var2.f28758j1.setTranslationY(0.0f);
                    w0Var.setVisibility(8);
                }
                this.J1.r1();
                this.J1.m1().setText(this.Y.getFieldText());
                ai.g4 g4Var3 = this.J1;
                g4Var3.f28780r = this.f32279ea;
                showDialog(g4Var3);
            }
        }
    }

    public final void Xa(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Xa(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Xb(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            zg.t tVar = this.Y9;
            if (tVar != null && tVar.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            if (this.f32331j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f19305n0) {
                    kVar.h(true);
                    this.Y.e1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ii.d2 d2Var = new ii.d2(richMessage);
                d2Var.J = this;
                d2Var.f11319r = messageObject;
                presentFragment(d2Var);
                return;
            }
            this.I1.getAdapter().f9822f0 = false;
            this.Y.setVisibility(0);
            yb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            hc(false);
            if (!z10) {
                N6();
            }
            if (z10) {
                this.f32299g5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.V0(false, false, true);
            yc(0, true);
            Wc(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.R3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.T5);
                tL_messages_getMessageEditData.f18213id = messageObject.getId();
                this.f32396o5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new qe(this, 3));
                return;
            }
            nk nkVar = this.Y;
            org.telegram.ui.Components.ve veVar = nkVar.E1;
            if (veVar != null) {
                veVar.setEnabled(true);
                nkVar.E1.h(false);
            }
        }
    }

    public final void Y6() {
        if (!this.Rb) {
            this.Rb = true;
            if (!this.Sb && this.R3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f32481v1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f32481v1.u();
                    this.Sb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f32494w1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f32494w1.u();
                    this.Sb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    Z6();
                }
            }
        }
    }

    public final void Y7(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Y7(int, java.lang.Object[]):void");
    }

    public final void Y8(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f32483v3;
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
        mediaDataController.searchMessagesInChat(null, j3, j10, i14, i10, this.f32261d4, this.f32394o3, this.f32406p3, this.f32418q3);
        Lb(false);
    }

    public final void Y9() {
        ut.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        E7();
        this.J1.f28757j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.Y.Q();
        }
        this.J1.J1(1, false);
        ai.g4 g4Var = this.J1;
        g4Var.U1 = true;
        g4Var.i1(null);
        this.J1.r1();
        ai.g4 g4Var2 = this.J1;
        g4Var2.f28780r = this.f32279ea;
        if (this.visibleDialog != null) {
            g4Var2.show();
        } else {
            showDialog(g4Var2);
        }
    }

    public final void Ya(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Ya(java.lang.CharSequence, boolean):void");
    }

    public final void Yb() {
        org.telegram.ui.Components.r00 r00Var = this.f32375m9;
        if (r00Var != null && !r00Var.f27481c) {
            r00Var.c(false);
            try {
                this.f32375m9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Z6() {
        org.telegram.ui.Cells.t1 t1Var;
        ci.f4 f4Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        ci.f4 f4Var2 = this.f32507x1;
        if (f4Var2 != null && !f4Var2.V && !this.Ub && this.Rb && !this.xc.f13985f && System.currentTimeMillis() - this.Tb > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f32506x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f32506x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        zg.q0 q0Var = t1Var.N;
                        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !q0Var.v.isEmpty()) {
                            t1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + q0Var.d;
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
                zg.q0 q0Var2 = t1Var.N;
                this.Ub = true;
                t1Var.getLocationInWindow(iArr);
                this.f32507x1.setTranslationY(((iArr[1] - f4Var.getTop()) - AndroidUtilities.dp(120.0f)) + q0Var2.d);
                this.f32507x1.m(0.0f, (((zg.n0) q0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + q0Var2.f49172c);
                this.f32507x1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ne(this, 19));
            AndroidUtilities.runOnUIThread(new ne(this, 19), 2000L);
        }
    }

    public final void Z7(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Z7(int, java.lang.Object[]):void");
    }

    public final void Z8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Z8():void");
    }

    public final void Z9(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.t1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.Z9(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.t1, org.telegram.messenger.MessageObject):void");
    }

    public final void Za(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f32394o3 = user;
        this.f32406p3 = chat;
        if (this.f32331j0 != null && this.I1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f32394o3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f32383n3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a4.a.C(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.j6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f32331j0.setSearchFieldCaption(spannableString);
                    this.I1.getAdapter().U(null, 0, null, false, true);
                    this.f32331j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f32331j0;
                    w0Var.f19625r = null;
                    ci.h2 h2Var = w0Var.e;
                    if (h2Var != null) {
                        h2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f32458t3 = "";
                    mediaDataController.searchMessagesInChat("", this.T5, this.L6, this.classGuid, 0, this.f32261d4, this.f32394o3, this.f32406p3, this.f32418q3);
                }
            }
        }
    }

    public final void Zb() {
        long j3;
        ne neVar = this.U7;
        if (neVar != null) {
            AndroidUtilities.cancelRunOnUIThread(neVar);
        }
        ne neVar2 = new ne(this, 15);
        this.U7 = neVar2;
        if (this.P7 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(neVar2, j3);
    }

    public long a() {
        return this.T5;
    }

    public final void a7(boolean z10) {
        int i10;
        if (this.f32531z0 != null && !this.f32420q5 && !this.A0.L && !this.f7) {
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f32506x0.getChildCount(); i14++) {
                int S = RecyclerView.S(this.f32506x0.getChildAt(i14));
                if (S != -1) {
                    if (i12 == -1 || S < i12) {
                        i12 = S;
                    }
                    if (i11 == -1 || S > i11) {
                        i11 = S;
                    }
                    i13++;
                }
            }
            nm nmVar = this.A0;
            if (nmVar.N) {
                int i15 = nmVar.E;
                if (i15 >= 0 && i12 >= 0 && i15 >= i12 && i15 <= i11) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = nmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            if (this.R3 == 7) {
                if ((h - i12) - i13 <= i10 && !this.G6 && !this.C6[0]) {
                    this.G6 = true;
                    this.f32312h6.add(Integer.valueOf(this.V5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f32470u3;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.a8(int, java.lang.Object[]):void");
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
            FileLog.d("getDiscussionMessage chat = " + chat.f18121id + " msg_id = " + i13);
        }
        this.f32317hc = 0;
        this.f32330ic = false;
        this.f32355kc = null;
        this.f32366lc = null;
        vj vjVar = this.f32506x0;
        if (vjVar != null) {
            vjVar.g1();
        }
        if (this.gc != -1) {
            getConnectionsManager().cancelRequest(this.gc, false);
        }
        if (this.f32293fc != -1) {
            getConnectionsManager().cancelRequest(this.f32293fc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f32317hc = i13;
        this.f32330ic = false;
        this.f32342jc = System.currentTimeMillis();
        vj vjVar2 = this.f32506x0;
        if (vjVar2 != null) {
            vjVar2.g1();
        }
        final int i14 = this.f32269dc + 1;
        this.f32269dc = i14;
        this.f32293fc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final bo boVar = bo.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j11 = j10;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new l4(25, boVar, new Runnable(i15, i16, j11, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f34883b;
                    public final int f34884c;
                    public final TLObject d;
                    public final int e;
                    public final MessageObject f34885f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f34886n;
                    public final MessageObject f34887r;

                    {
                        this.d = tLObject;
                        this.e = i17;
                        this.f34885f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f34886n = chat2;
                        this.f34887r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final bo boVar2 = bo.this;
                        if (this.f34883b != boVar2.f32269dc) {
                            return;
                        }
                        boVar2.f32293fc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            boVar2.f32355kc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            boVar2.getMessagesController().putUsers(boVar2.f32355kc.users, false);
                            boVar2.getMessagesController().putChats(boVar2.f32355kc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = boVar2.f32355kc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < boVar2.f32355kc.messages.size(); i19++) {
                                TLRPC.Message message = boVar2.f32355kc.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f34884c;
                        final int i21 = this.e;
                        final MessageObject messageObject5 = this.f34885f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f34886n;
                        final MessageObject messageObject6 = this.f34887r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = boVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f18142id;
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
                            final int i22 = boVar2.ec + 1;
                            boVar2.ec = i22;
                            boVar2.gc = boVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new vh(bo.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        boVar2.ya(boVar2.f32355kc, boVar2.f32366lc, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f32293fc, this.classGuid);
    }

    public final void ab(View view, MessageObject messageObject, org.telegram.ui.Components.gk0 gk0Var, View view2, float f7, float f10, zg.p0 p0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        yh.e4 e4Var;
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
            if (p0Var != null && p0Var.f49152a) {
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
                    long j3 = -yh.p5.b(messageObject).f47656a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    yh.u5 u5Var = yh.v5.y(this.currentAccount, false).B;
                    if (u5Var != null) {
                        u5Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j10 = this.T5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    yh.q8 q8Var = new yh.q8(parentActivity, i15, j10, this, messageObject, arrayList2, z14, false, 0L, this.f32279ea);
                    messageObject.getId();
                    q8Var.T = this;
                    q8Var.U = a0Var;
                    q8Var.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -yh.p5.b(messageObject).f47656a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                yh.u5 d02 = yh.v5.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f32414pc == null) {
                        this.f32414pc = new yh.e4(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        e4Var = null;
                    } else {
                        if (this.f32414pc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f32414pc);
                            layoutContainer.addView(this.f32414pc, w7.x5.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f32414pc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f32414pc.bringToFront();
                        }
                        e4Var = this.f32414pc;
                    }
                    e4Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f47898o = e4Var;
                    e4Var.I = false;
                    e4Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    e4Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.t1) {
                        i12 = ((org.telegram.ui.Cells.t1) a0Var).V;
                    } else {
                        i12 = 0;
                    }
                    e4Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            zg.p0 p0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new rg.x0((org.telegram.ui.ActionBar.o2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(p0Var) && (chat = this.e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.e, 26)) {
                org.telegram.messenger.w1.o(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.vc.a0(this), R.raw.e_hand_2, 36);
            } else {
                zg.l0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(p0Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.i iVar = this.f32512x6;
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
                    if (!SharedConfig.multipleReactionsPromoShowed && q82 != null && p0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j12 = p0Var.f49156g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(p0Var.f49155f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.o5.f(this.currentAccount, j12);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.oc r10 = org.telegram.ui.Components.vc.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f26705j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (gk0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        zg.l0.d(this, gk0Var, q82, view2, f7, f10, p0Var, i19, i10);
                    }
                }
                if (selectReaction && p0Var != null && (str = p0Var.f49155f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<zg.p0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    p0Var2 = p0Var;
                }
                xi xiVar = new xi(this, z13, z10, i18, selectReaction, gk0Var, f7, f10, p0Var, messageObject);
                this.f32243bc = xiVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, p0Var2, z11, z12, this, xiVar);
                if (z10 || z13) {
                    qc(messageObject, true);
                    this.f32243bc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f32243bc, 50L);
                }
            }
        }
    }

    public final void ac() {
        AndroidUtilities.forEachViews((RecyclerView) this.f32506x0, (e2.h) new m4.t0(2, this, t9()));
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
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.T5, this.f32385n5, this.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = C8();
        of2.payStars = j3;
        of2.monoForumPeer = N8();
        of2.suggestionParams = this.f32299g5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.R3 == 0) {
            O9(false);
        }
        if (i10 == 0 || i10 == 1) {
            y6();
        }
        if (this.f32420q5) {
            this.Q5 = true;
        }
    }

    public final void b7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f32436r8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f32436r8 = true;
            org.telegram.ui.Components.c5.s0(getParentActivity(), this.currentAccount, new ne(this, 9), true, this.f32279ea);
        }
    }

    public final void b8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.b8(int, java.lang.Object[]):void");
    }

    public final boolean b9() {
        um umVar = this.f32254c9;
        if (umVar != null && umVar.y()) {
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
            zg.t tVar = this.Y9;
            if (tVar != null && tVar.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            Bundle e = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e.putInt("messagesCount", this.f32251c6);
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            e.putBoolean("canSelectTopics", true);
            wy wyVar = new wy(e);
            wyVar.C2 = this;
            presentFragment(wyVar);
            return;
        }
        if (y9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.e) && !this.e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f32345k2 == null) {
                tm tmVar = this.X0;
                int indexOfChild = tmVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, getParentActivity(), null, true);
                    this.f32345k2 = i40Var;
                    tmVar.addView(i40Var, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f32345k2.setAlpha(0.0f);
                    this.f32345k2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f32345k2.setText(string);
            this.f32345k2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f32357l2 == null) {
            tm tmVar2 = this.X0;
            int indexOfChild2 = tmVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(getParentActivity(), 9);
            this.f32357l2 = i40Var2;
            tmVar2.addView(i40Var2, indexOfChild2 + 1, w7.x5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f32357l2.setAlpha(0.0f);
            this.f32357l2.setVisibility(4);
        }
        this.f32357l2.setText(string);
        this.f32357l2.f(this.P0.getForwardButton(), true);
    }

    public final void bb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f18127id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.T5, this.f32385n5, this.X3, null, false, arrayList, null, null, true, 0, 0, null, false);
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
            org.telegram.ui.ActionBar.g3 F = org.telegram.ui.Components.c5.F(this.T5, d(), this, this.f32279ea);
            F.setCalcMandatoryInsets(x9());
            showDialog(F);
            return;
        }
        getNotificationsController().muteDialog(this.T5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.vc.z(this, 4, 0, this.f32279ea).j();
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
        nk nkVar = this.Y;
        if (nkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.T5, (int) d());
            le.b bVar = nkVar.f21794h5;
            gi.a aVar = nkVar.I0;
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
            if (z10 && bVar.e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((le.b) aVar.f10018c).a(z12, z13);
            aVar.setClickable(z12);
            aVar.setEnabled(z12);
            if (bVar.f13985f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            nkVar.T4 = streamingSendButtonState;
            if (z14) {
                nkVar.L(z10);
            }
        }
    }

    public final void c8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.c8(java.lang.Object[]):void");
    }

    public final void c9() {
        org.telegram.ui.Components.bu editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.Ac.j(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.f32223a6 = 0;
        this.f32263d6 = 0;
        this.f32237b6 = 0;
        this.f32288f6 = 0;
        this.f32300g6 = 0;
        this.f32276e6 = 0;
        nk nkVar = this.Y;
        if (nkVar != null && (editField = nkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        um umVar = this.f32254c9;
        if (umVar != null) {
            umVar.f(true);
            SparseArray sparseArray = this.f32254c9.f20825u0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        rl rlVar = this.f32315h9;
        if (rlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rlVar.H);
            rlVar.a();
        }
        nk nkVar2 = this.Y;
        if (nkVar2 != null) {
            nkVar2.f21745a0 = false;
        }
        this.f32327i9 = false;
        if (this.f32228ab != null) {
            k9();
        }
    }

    public final void ca(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f32287f5;
        if (messagePreviewParams != null && this.Ea == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.G5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f32385n5;
                if (messageObject2 == this.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f32359l5, this.p5);
            }
            if (!this.f32287f5.isEmpty()) {
                this.f32268db = this.Y.f21884y2;
                Context context = this.X0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f32287f5;
                TLRPC.User user = this.f32281f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                zn znVar = this.f32279ea;
                rn rnVar = this.f32359l5;
                if (rnVar != null && rnVar.f37279f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                il ilVar = new il(this, context, this, this.A8, messagePreviewParams2, user, chat, i12, znVar, i10, z10);
                this.Ea = ilVar;
                this.f32287f5.attach(ilVar);
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
                if (this.f32268db) {
                    nk nkVar = this.Y;
                    nkVar.T0 = true;
                    org.telegram.ui.Components.cg cgVar = nkVar.U0;
                    if (cgVar != null) {
                        cgVar.u(true);
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
        org.telegram.ui.Components.ie ieVar;
        if ((this.R3 != 5 || (!this.f32473u6.isEmpty() && this.f32261d4 != 0)) && !this.xc.f13985f && this.f32389n9) {
            nk nkVar = this.Y;
            if (!nkVar.E2) {
                if (!nkVar.f21759c1 || (ieVar = nkVar.f21771e1) == null || ieVar.getVisibility() != 0) {
                    if ((!nkVar.k0() || !nkVar.f21812l0.v) && !org.telegram.ui.ActionBar.o2.hasSheets(nkVar.O2) && this.N9 == 0.0f) {
                        uh.j jVar = this.X9;
                        if (jVar == null || !jVar.a()) {
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
        gk gkVar = this.I1;
        if (gkVar == null) {
            return;
        }
        TLRPC.User user = gkVar.getAdapter().f9842w0;
        if (user != null) {
            j10 = user.f18268id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f18119id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.I1.getAdapter().f9842w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.T5, this.f32385n5, this.X3, null, this.f32359l5, z10, i10, 0, C8(), j3, N8());
        this.Y.setFieldText("");
        e9(false);
        getMediaDataController().increaseInlineRating(j10);
    }

    public final void cc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.oc ocVar = this.A3;
        if (ocVar != null) {
            ocVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f32262d5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.Q4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.T5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.Q4 - 1), Boolean.valueOf(this.S4));
        this.A3 = org.telegram.ui.Components.vc.B(this, false, new ai.c9(this, arrayList2, arrayList, i10, 12), new ue(this, messageObject, 7), this.f32279ea).j();
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f32310h4 && (i10 = this.R3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f32261d4;
    }

    public final void d7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.d7():void");
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.T5, this.f32385n5, this.X3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = C8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13 = i11 + 1) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.T5, this.f32385n5, this.X3, null, this.f32359l5, z10, i10, 0, C8(), 0L, N8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
            }
            if (!arrayList2.isEmpty()) {
                l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f32385n5, this.X3, null, this.f32359l5, false, true, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f32299g5);
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
            org.telegram.ui.Components.vc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Fa(this.f32262d5);
            Ha(this.f32262d5);
            return;
        }
        showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) this, 3, true));
    }

    public final void da(String str, boolean z10) {
        boolean z11;
        lk lkVar;
        boolean z12;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                M7();
                ci.f4 f4Var = this.f32481v1;
                if (f4Var != null && f4Var.V) {
                    f4Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ci.f4 f4Var2 = this.f32494w1;
                if (f4Var2 != null && f4Var2.V) {
                    f4Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new te(this, str, 5), 200L);
                    return;
                }
                this.f32470u3 = str;
                this.f32458t3 = str;
                boolean contains = str.contains("@");
                R6(true);
                if (!this.actionBar.f19305n0) {
                    this.f32530yc.a(true, true);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f32306h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.z zVar = this.f32270e0;
                    if (zVar != null) {
                        zVar.f(8);
                    }
                    js jsVar = this.f32257d0;
                    if (jsVar != null) {
                        jsVar.b(false);
                    }
                    org.telegram.ui.ActionBar.z zVar2 = this.f32318i0;
                    if (zVar2 != null) {
                        zVar2.f(8);
                    }
                    if ((this.f32261d4 == 0 || (i10 = this.R3) == 3 || i10 == 8) && (w0Var = this.f32331j0) != null) {
                        w0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
                    if (w0Var3 != null && this.K9) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.z zVar3 = this.f32380n0;
                    if (zVar3 != null && this.L9) {
                        zVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.f32343k0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    this.f32391o0 = true;
                    Fc(0, 0, -1);
                    hc(false);
                }
                zk zkVar = this.f32392o1;
                if (zkVar != null) {
                    if (zkVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        zkVar.g(false);
                    }
                }
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.e) || !ChatObject.isPublic(this.e) || this.f32470u3 == null)) {
                    this.f32429r1 = 0;
                } else {
                    this.f32429r1 = 2;
                }
                this.W4 = false;
                if (this.O3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ci.i1 i1Var = this.f32416q1;
                if (i1Var != null) {
                    i1Var.h.clear();
                }
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f32331j0;
                if (w0Var5 != null) {
                    this.f32256cc = true;
                    w0Var5.z(false);
                    this.f32256cc = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = this.f32331j0;
                if (w0Var6 != null) {
                    w0Var6.setSearchFieldCaption(null);
                    this.f32331j0.H(str, false);
                    this.f32331j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f32458t3, this.T5, this.L6, this.classGuid, 0, this.f32261d4, false, this.f32394o3, this.f32406p3, false, this.f32418q3);
                yc(0, true);
                this.f32259d2.e(true, true);
                Lb(true);
                lk lkVar2 = this.f32404p1;
                if (lkVar2 != null) {
                    lkVar2.b(!contains);
                    Hc();
                }
                if ((contains || z10) && this.f32470u3 != null && (lkVar = this.f32404p1) != null) {
                    int currentPosition = lkVar.f28172a.getCurrentPosition();
                    int i11 = this.f32429r1;
                    if (currentPosition != i11) {
                        this.f32404p1.f28172a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f32470u3);
                this.f32456t1.f23210f.N(true);
                View currentView = this.f32416q1.getCurrentView();
                if (currentView instanceof eo) {
                    ((eo) currentView).f33448a.Jc(this.f32470u3);
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
                of2.suggestionParams = this.f32299g5;
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
                of3.suggestionParams = this.f32299g5;
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
            if (this.actionBar.s() && this.f32232b1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f32232b1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
        org.telegram.ui.ActionBar.e5 e5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        qj qjVar;
        nk nkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.bu editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.wx0 wx0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        nk nkVar2;
        bo boVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            boVar.c8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            vj vjVar = boVar.f32506x0;
            if (vjVar != null) {
                vjVar.g1();
            }
            org.telegram.ui.Components.ui uiVar = boVar.M9;
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
                if (((Integer) objArr[0]).intValue() == boVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        boVar.finishFragment();
                        b.b(boVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null && g4Var.isShowing()) {
                    boVar.J1.dismiss(true);
                }
                if (z11 && (nkVar2 = boVar.Y) != null && nkVar2.u0()) {
                    boVar.Y.n0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f18141id = stickerSet2.f18148id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = boVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.wx0) && (tL_messages_stickerSet = (wx0Var = (org.telegram.ui.Components.wx0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f18148id == stickerSet2.f18148id) {
                            wx0Var.D0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.vc vcVar = new org.telegram.ui.Components.vc(wx0Var.container, boVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.oc r10 = vcVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f26705j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.wx0 wx0Var2 = new org.telegram.ui.Components.wx0(boVar.getParentActivity(), boVar, tL_inputStickerSetID, null, boVar.Y, boVar.f32279ea);
                            final boolean z15 = z12;
                            boVar = this;
                            wx0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    bo.i1(bo.this, objArr, wx0Var2, z15, stickerSet2);
                                }
                            });
                            boVar.showDialog(wx0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                vj vjVar2 = boVar.f32506x0;
                if (vjVar2 != null) {
                    vjVar2.g1();
                }
                TextView textView = boVar.Q2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.k5 k5Var = boVar.D2[i13];
                    if (k5Var != null) {
                        k5Var.invalidate();
                    }
                }
                gk gkVar = boVar.I1;
                if (gkVar != null) {
                    gkVar.getListView().g1();
                }
                ai.w0 w0Var = boVar.L3;
                if (w0Var != null) {
                    w0Var.g1();
                }
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                nk nkVar3 = boVar.Y;
                if (nkVar3 != null && (editField = nkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ai.p4[] p4VarArr = boVar.E2;
                ai.p4 p4Var = p4VarArr[0];
                if (p4Var != null) {
                    p4Var.invalidate();
                }
                ai.p4 p4Var2 = p4VarArr[1];
                if (p4Var2 != null) {
                    p4Var2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (boVar.Z7 != null && (chat = boVar.e) != null && chat.f18121id == l4.longValue()) {
                    boVar.Z7.online_count = ((Integer) objArr[1]).intValue();
                    qj qjVar2 = boVar.f32219a1;
                    if (qjVar2 != null) {
                        qjVar2.m();
                        boVar.f32219a1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == boVar.T5 && (nkVar = boVar.Y) != null) {
                    nkVar.R1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                nk nkVar4 = boVar.Y;
                if (nkVar4 != null) {
                    nkVar4.S1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (boVar.e != null) {
                        TLRPC.Chat chat2 = boVar.getMessagesController().getChat(Long.valueOf(boVar.e.f18121id));
                        if (chat2 != null) {
                            boVar.e = chat2;
                        }
                    } else if (boVar.f32281f != null && (user = boVar.getMessagesController().getUser(Long.valueOf(boVar.f32281f.f18268id))) != null) {
                        boVar.f32281f = user;
                    }
                    boVar.Nc(true);
                }
                if (!boVar.F9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (boVar.e != null && (qjVar = boVar.f32219a1) != null) {
                        qjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    boVar.o();
                    boVar.Wc(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && boVar.e != null) {
                    boVar.y9();
                    TLRPC.Chat chat3 = boVar.getMessagesController().getChat(Long.valueOf(boVar.e.f18121id));
                    if (chat3 != null) {
                        boVar.e = chat3;
                        boVar.y9();
                        z10 = !boVar.F9();
                        boVar.hc(false);
                        nk nkVar5 = boVar.Y;
                        if (nkVar5 != null) {
                            nkVar5.b1(boVar.currentAccount, boVar.T5);
                        }
                        FlagSecureReason flagSecureReason = boVar.E3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                qj qjVar3 = boVar.f32219a1;
                if (qjVar3 != null && z10) {
                    qjVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    boVar.Qc(true);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = boVar.f32306h0;
                if (w0Var2 != null) {
                    if (ChatObject.isChannel(boVar.e) && !ChatObject.isMonoForum(boVar.e)) {
                        long j10 = boVar.e.linked_monoforum_id;
                        if (j10 != 0 && ChatObject.canManageMonoForum(boVar.currentAccount, -j10)) {
                            z13 = true;
                        }
                    }
                    w0Var2.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!boVar.Oa) {
                    if (longValue == boVar.T5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = boVar.R3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !boVar.isPaused && LaunchActivity.U() == boVar && boVar.f32287f5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                boVar.ja(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            boVar.za(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(boVar.e) && !boVar.e.megagroup && (chatFull = boVar.Z7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                boVar.f32486v6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        boVar.w7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                boVar.I9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                boVar.t6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == boVar.T5) {
                        boVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (e5Var = boVar.parentLayout) != null && e5Var.getFragmentStack().size() > 1) {
                    boVar.finishFragment();
                } else {
                    boVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == boVar.a() && (booleanValue || boVar.parentLayout.getLastFragment() != boVar)) {
                    if (boVar.parentLayout.getLastFragment() == boVar) {
                        boVar.finishFragment();
                    } else {
                        boVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = boVar.f32397o6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = boVar.e;
                    if (chat4 != null && chat4.f18121id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (boVar.f32420q5) {
                            ci ciVar = boVar.f32384n4;
                            if (ciVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(ciVar);
                                boVar.f32384n4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            ci ciVar2 = new ci(boVar, messageObject2, intValue3);
                            boVar.f32384n4 = ciVar2;
                            AndroidUtilities.runOnUIThread(ciVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = boVar.e;
                    if (chat5 != null && chat5.f18121id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = boVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(boVar.e, boVar.getMessagesController().getChatFull(boVar.e.f18121id)));
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
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && boVar.T5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = boVar.f32261d4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = boVar.f32347k4;
                            ArrayList arrayList2 = boVar.f32473u6;
                            if (intValue4 > i19) {
                                boVar.f32347k4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= boVar.f32347k4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        nm nmVar = boVar.A0;
                                        if (nmVar != null) {
                                            nmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > boVar.l4) {
                                boVar.l4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= boVar.l4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        nm nmVar2 = boVar.A0;
                                        if (nmVar2 != null) {
                                            nmVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boVar.X7(i10, objArr);
        boVar.Y7(i10, objArr);
        boVar.Z7(i10, objArr);
        boVar.a8(i10, objArr);
        boVar.b8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ai.g4 g4Var = this.J1;
        if (g4Var != null && this.visibleDialog == g4Var) {
            g4Var.f28757j0.a0(false);
            this.J1.dismissInternal();
            this.J1.f28757j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J1 && dialog != this.f32241ba && !(dialog instanceof ei.k3) && super.dismissDialogOnPause(dialog)) {
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
        zb(false, null, null, false, z10);
    }

    public final boolean ea(String str, org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, int i10, int i11) {
        ei.x4 x4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.e == null || str == null || this.R3 != 0) {
            return false;
        }
        if (t1Var != null && (characterStyle != null || i11 != 1)) {
            x4Var = new ei.x4(this, i10, i11, characterStyle, t1Var);
        } else {
            x4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.e) != null) {
                try {
                    if (Jc == null) {
                        Jc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Kc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Jc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = qh.f.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.e) && i12 != d()) {
                                        return false;
                                    }
                                    this.f32462t7 = true;
                                    if (this.R3 == 2) {
                                        this.V8.S0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f32525y7 = W;
                                    if (W >= 0) {
                                        this.f32538z7 = parseInt;
                                    }
                                    Xa(parseInt, i10, true, 0, false, 0, num, g10, x4Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Kc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f32302g8 = queryParameter2;
                                    O6(true);
                                    return true;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("comment")).intValue();
                    if (ChatObject.hasPublicLink(this.e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.R3 == 2) {
                            this.V8.S0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Xa(intValue3, i10, true, 0, false, 0, null, null, x4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e10) {
                    e = e10;
                    z10 = false;
                }
            } else {
                try {
                    if (Lc == null) {
                        Lc = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Lc.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f18121id || parseInt3 == 0) {
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
                    byte[] g11 = qh.f.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f32249c4;
                            if (tL_forumTopic != null && tL_forumTopic.f18173id == findTopic.f18173id) {
                                return true;
                            }
                            return false;
                        }
                        this.f32462t7 = true;
                        if (this.R3 == 2) {
                            this.V8.S0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Xa(parseInt3, i10, true, 0, false, 0, num2, g11, x4Var);
                        return true;
                    }
                    return false;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.parseLong(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("thread")).intValue();
            long j3 = this.e.f18121id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                aa(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f32462t7 = true;
            if (this.R3 == 2) {
                this.V8.S0(intValue9);
                finishFragment();
                return true;
            }
            Xa(intValue9, i10, true, 0, false, 0, null, null, x4Var);
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f32385n5, this.X3, null, this.f32359l5, z11, true, null, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f32299g5);
            y6();
            nk nkVar = this.Y;
            if (nkVar != null) {
                nkVar.setFieldText("");
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
        tm tmVar = this.X0;
        if (tmVar != null && this.f32255ca == null) {
            if (this.f32279ea.f40286n == null || tmVar.getBackgroundImage() == null) {
                if (this.X0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.X0.V(org.telegram.ui.ActionBar.j6.r0());
                }
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        hg.k0.A(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void f8(View view, boolean z10) {
        boolean z11;
        ob(view);
        if (view != this.f32332j1) {
            z11 = true;
        } else {
            z11 = false;
        }
        g8(z10, z11, 0.2f);
    }

    public final void f9(boolean z10) {
        if (this.X2.getTag() != null && !this.f32260d3) {
            if (!this.j3 || this.f32285f3) {
                this.X2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f32297g3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f32297g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 0.0f));
                    this.f32297g3.addListener(new yi(this, 6));
                    this.f32297g3.setStartDelay(this.f32220a3);
                    this.f32297g3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f32297g3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f32297g3 = null;
                    }
                    this.X2.setAlpha(0.0f);
                }
                this.f32220a3 = 500;
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
            presentFragment(new bo(bundle));
        }
    }

    public final ue fb(MessageObject messageObject, boolean z10) {
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
        return new ue(this, messageObject, 1);
    }

    public final void fc() {
        TLRPC.User user;
        boolean z10;
        if (this.f32306h0 != null && (user = this.f32281f) != null && this.h == null && user.bot) {
            a0.i iVar = this.f32265d8;
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
                this.f32306h0.K(30);
            } else {
                this.f32306h0.r(30);
            }
            if (z10) {
                this.f32306h0.K(31);
            } else {
                this.f32306h0.r(31);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.o1 o1Var = this.Q8;
        if (o1Var != null) {
            o1Var.e = false;
            A7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.e;
    }

    public final void g7(Runnable runnable, zf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            q1 q1Var = new q1(this, aVar, runnable, 19);
            yh.v5 x10 = yh.v5.x(this.currentAccount, aVar.f48980a);
            if (!x10.e) {
                x10.q(true, true, q1Var);
                return;
            } else {
                q1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void g8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        jh.h hVar;
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
        this.f32506x0.invalidate();
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
            ValueAnimator valueAnimator = this.f32229ac;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.I8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.bm0.d(new bf(this, 3));
            }
        } else {
            float f11 = this.H8;
            this.L8 = f11 / max;
            this.I8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new pg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f32332j1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.P8.playTogether(arrayList);
        this.P8.setInterpolator(org.telegram.ui.Components.qr.h);
        this.P8.setDuration(320L);
        View view2 = this.J8;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view2;
        } else {
            t1Var = null;
        }
        this.P8.addListener(new androidx.fragment.app.g(this, z12, t1Var, 3));
        if (this.J8 != null && this.K8 <= 0.0f) {
            ob(null);
        }
        this.P8.start();
    }

    public final void g9(boolean z10) {
        if (this.Y2.getTag() != null && !this.f32273e3) {
            if (!this.f32346k3 || this.f32285f3) {
                this.Y2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32321i3, 0.0f);
                    this.f32309h3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f32309h3.addUpdateListener(new pe(this, 1));
                    this.f32309h3.addListener(new yi(this, 8));
                    this.f32309h3.setStartDelay(this.f32220a3);
                    this.f32309h3.start();
                } else {
                    ValueAnimator valueAnimator = this.f32309h3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f32309h3 = null;
                    }
                    this.f32321i3 = 0.0f;
                    lc();
                }
                this.f32220a3 = 500;
            }
        }
    }

    public final void ga(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f32281f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f32281f.f18268id) {
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
            presentFragment(new bo(bundle));
        }
    }

    public final void gb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.gb(int, android.net.Uri, boolean):void");
    }

    public final void gc() {
        if (this.R1 == null) {
            return;
        }
        this.R1.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.c());
    }

    @Override
    public final org.telegram.ui.ActionBar.a5 getBackButtonState() {
        return org.telegram.ui.ActionBar.a5.f18465a;
    }

    @Override
    public final org.telegram.ui.ActionBar.b4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.b4.f18474c;
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
            ArrayList arrayList = this.f32473u6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + A8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f32279ea;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        if (this.e7) {
            return null;
        }
        if (this.f32227aa) {
            this.f32227aa = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Qd));
        if (!A9()) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19195v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19159t8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.f19247y8;
            arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19266z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1024, null, null, null, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19140s8));
        qj qjVar = this.f32219a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qjVar != null ? qjVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        qj qjVar2 = this.f32219a1;
        org.telegram.ui.ActionBar.k5 titleTextView = qjVar2 != null ? qjVar2.getTitleTextView() : null;
        int i12 = org.telegram.ui.ActionBar.j6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(titleTextView, 8, null, null, null, null, i12));
        qj qjVar3 = this.f32219a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qjVar3 != null ? qjVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.f18841c2, org.telegram.ui.ActionBar.j6.f18859d2}, org.telegram.ui.ActionBar.j6.f19086pa));
        qj qjVar4 = this.f32219a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qjVar4 != null ? qjVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19159t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 67108864, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, i13));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.j6.f19247y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar3, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.j6.f19213w8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.j6.f19230x8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.j6.f19266z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32232b1, 4, null, null, null, null, i14));
        qj qjVar5 = this.f32219a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qjVar5 != null ? qjVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18989k4}, null, org.telegram.ui.ActionBar.j6.f19070oc));
        qj qjVar6 = this.f32219a1;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qjVar6 != null ? qjVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.l4}, null, org.telegram.ui.ActionBar.j6.f19088pc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f19113r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18955i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18973j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18993k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19011l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19030m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19050n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19067o8));
        org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.g5 g5Var2 = (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.g5 g5Var3 = (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.g5 g5Var4 = (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.g5 g5Var5 = (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.g5 g5Var6 = (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{g5Var, g5Var2}, null, org.telegram.ui.ActionBar.j6.f19123ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.g5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.j6.f18869dc));
        if (g5Var != null) {
            Drawable[] k10 = g5Var.k();
            int i15 = org.telegram.ui.ActionBar.j6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, g5Var2.k(), null, i15));
            Drawable[] k11 = g5Var3.k();
            int i16 = org.telegram.ui.ActionBar.j6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, g5Var4.k(), null, i16));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{g5Var3, g5Var4}, null, org.telegram.ui.ActionBar.j6.Aa));
        if (this.f32279ea.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{g5Var3, g5Var4}, null, org.telegram.ui.ActionBar.j6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{g5Var3, g5Var4}, null, org.telegram.ui.ActionBar.j6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{g5Var3, g5Var4}, null, org.telegram.ui.ActionBar.j6.Fa));
        }
        vj vjVar = this.f32506x0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = g5Var5;
        drawableArr[i10] = g5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.j6.Ba));
        vj vjVar2 = this.f32506x0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = g5Var5;
        drawableArr2[i10] = g5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.j6.f18832bc));
        vj vjVar3 = this.f32506x0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i17 = org.telegram.ui.ActionBar.j6.f18959ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(vjVar3, 4, clsArr3, themedPaint, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.j6.f18977jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19209w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.j6.f18997kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19015lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19034mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18904fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 2, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.f18940hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.j6.f18932h3};
        int i18 = org.telegram.ui.ActionBar.j6.f18998kd;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr3, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19106qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19125rc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f19144sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19162tc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.f19251yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18804a4, org.telegram.ui.ActionBar.j6.f18824b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.f19270zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18843c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18861d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18915g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i19 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr4, null, i19));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.j6.f18933h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i20 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr5, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.f19120r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.f19104qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.f18822b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18969j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, eVar, org.telegram.ui.ActionBar.j6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.j6.wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i21 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.f18811ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18868db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18886eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18813ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18903fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18851cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18922gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18870dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18939hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18887ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18958ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18905fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18923gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18976jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18996kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18941hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18960id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19105qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18978jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19124rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19053nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19143sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19071od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19016ld));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19035md));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19069ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19087pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19089pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19107qd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19014lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19033mb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19126rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19161tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19145sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19180ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19163td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19197vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19182ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19216wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19217wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19250yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19234xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19199vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19269zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19233xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19252yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19271zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, org.telegram.ui.ActionBar.j6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.V1, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18961ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19181uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18979je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19198vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.j6.f19127re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.j6.f19146se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19090pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.j6.f19108qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18885ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18902fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18921ga));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.j6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.j6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.j6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.j6.Ra));
        if (!this.f32279ea.h(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.f19113r0, null, org.telegram.ui.ActionBar.j6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.f19205w0, null, null, org.telegram.ui.ActionBar.j6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.j6.B0[0], org.telegram.ui.ActionBar.j6.B0[1], org.telegram.ui.ActionBar.j6.D0}, null, null, org.telegram.ui.ActionBar.j6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.j6.C0[0], org.telegram.ui.ActionBar.j6.C0[1], org.telegram.ui.ActionBar.j6.E0}, null, null, org.telegram.ui.ActionBar.j6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18802a1}, null, org.telegram.ui.ActionBar.j6.f18809a9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18912g1, org.telegram.ui.ActionBar.j6.f18930h1}, null, org.telegram.ui.ActionBar.j6.f18974j9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.F0[1], null, null, org.telegram.ui.ActionBar.j6.f18956i9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.G0, null, null, org.telegram.ui.ActionBar.j6.f19031m9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18994k9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.o9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.j6.H0, null, null, org.telegram.ui.ActionBar.j6.f19085p9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.j6.I0, null, null, org.telegram.ui.ActionBar.j6.f19103q9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.T0}, null, org.telegram.ui.ActionBar.j6.f19178u9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.V0, org.telegram.ui.ActionBar.j6.W0}, null, org.telegram.ui.ActionBar.j6.v9));
        }
        gk gkVar = this.I1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i23 = org.telegram.ui.ActionBar.j6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gkVar, 0, null, themedPaint2, null, null, i23));
        gk gkVar2 = this.I1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.j6.f18950i3};
        int i24 = org.telegram.ui.ActionBar.j6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gkVar2, 0, null, null, drawableArr10, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.j3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18950i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18950i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18950i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.j6.Xk));
        int i25 = org.telegram.ui.ActionBar.j6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i25));
        int i26 = org.telegram.ui.ActionBar.j6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.j6.f18953i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i26));
        int i28 = org.telegram.ui.ActionBar.j6.f18980jf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i25));
        int i29 = org.telegram.ui.ActionBar.j6.f18834bf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18814ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.j6.f18833be));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.j6.f19000kf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19054nf));
        nk nkVar = this.Y;
        int i30 = org.telegram.ui.ActionBar.j6.f19037mf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.j6.f19073of));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.j6.f18853cf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.j6.f18815af));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18906ff));
        nk nkVar2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar2 != null ? nkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.He));
        nk nkVar3 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar3 != null ? nkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Ke));
        nk nkVar4 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar4 != null ? nkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Le));
        nk nkVar5 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar5 != null ? nkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Me));
        nk nkVar6 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar6 != null ? nkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Oe));
        nk nkVar7 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar7 != null ? nkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Pe));
        nk nkVar8 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar8 != null ? nkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Re));
        nk nkVar9 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar9 != null ? nkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Se));
        nk nkVar10 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar10 != null ? nkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.We));
        nk nkVar11 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar11 != null ? nkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Ne));
        nk nkVar12 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar12 != null ? nkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Je));
        nk nkVar13 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar13 != null ? nkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Ue));
        nk nkVar14 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nkVar14 != null ? nkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.kz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Qe));
        nk nkVar15 = this.Y;
        if (nkVar15 != null) {
            org.telegram.ui.Components.r41 trendingStickersAlert = nkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, new Drawable[]{this.Y.getStickersArrowDrawable()}, null, i26));
        }
        int i31 = 0;
        while (i31 < 2) {
            View view = i31 == 0 ? this.y3 : this.f32534z3;
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.f19194v7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.j6.f19212w7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.f19176u7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.f19158t7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.j6.f19229x7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.f19246y7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32533z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18888ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32533z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18863d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F2, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.fe));
        for (int i34 = 0; i34 < 2; i34++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.fe));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.D2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18924ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P2, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q2, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18924ge));
        ImageView imageView = this.J2;
        int i35 = org.telegram.ui.ActionBar.j6.f18871de;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L2, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U1, 8, null, null, null, null, i35));
        TextView textView = this.L1;
        int i36 = org.telegram.ui.ActionBar.j6.f18942he;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N1, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.f19101q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N1, 262148, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H1, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19200ve));
        ImageView imageView2 = this.S2;
        int i37 = org.telegram.ui.ActionBar.j6.f19235xe;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i37));
        ImageView imageView3 = this.S2;
        int i38 = org.telegram.ui.ActionBar.j6.f19266z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView3, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T2, 8, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T2, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19272ze));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19165tf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G0, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Sh));
        org.telegram.ui.Components.fo foVar = this.Y0;
        int i39 = org.telegram.ui.ActionBar.j6.f18959ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(foVar, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32233b2, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32403p0, 2048, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32506x0, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        ci.s6 s6Var = this.Q;
        int i40 = org.telegram.ui.ActionBar.j6.f19015lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(s6Var, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32233b2, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y0, 536870912, null, null, null, null, i40));
        if (this.I1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ce));
            int i41 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"nameTextView"}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.j6.A6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19026m4, org.telegram.ui.ActionBar.j6.f19046n4, org.telegram.ui.ActionBar.j6.f19063o4}, null, org.telegram.ui.ActionBar.j6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19264z6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18960id));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18978jd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18864d7));
        }
        org.telegram.ui.Components.i40 i40Var = this.f32272e2;
        int i42 = org.telegram.ui.ActionBar.j6.f19109qf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i40Var, 32, null, null, null, null, i42));
        org.telegram.ui.Components.i40 i40Var2 = this.f32272e2;
        int i43 = org.telegram.ui.ActionBar.j6.f19091pf;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i40Var2, 4, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32457t2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32457t2, 8, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"imageView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32457t2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32469u2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32469u2, 4, new Class[]{org.telegram.ui.Components.i40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X2, 0, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Z2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Z2, 0, null, null, null, null, i40));
        int i44 = org.telegram.ui.ActionBar.j6.f18957ia;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18975ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18995ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19013la));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19032ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19052na));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19068oa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.f18867da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18934h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18952i5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19100q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18991k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184uf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19201vf));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18817ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18836bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18855ch));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18874dh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18890eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18908fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18963ih));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18982jh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19002kh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18927gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18944hh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18807a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Dj));
        int i45 = org.telegram.ui.ActionBar.j6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19236xf));
        nk nkVar16 = this.Y;
        if (nkVar16 != null && nkVar16.m0 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y.m0.f8740c, 4, new Class[]{ei.a0.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y.m0.f8740c, 4, new Class[]{ei.a0.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.j6.f19245y6));
        }
        wh.d dVar = this.f32291fa;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i46 = 0;
        while (i46 < size) {
            Object obj = arrayList.get(i46);
            i46++;
            ((org.telegram.ui.ActionBar.l6) obj).f19392o = this.f32279ea;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f32279ea.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint G = this.f32279ea.G(str);
        if (G != null) {
            return G;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final void h7() {
        if (this.f32534z3 != null) {
            return;
        }
        jl jlVar = new jl(this, getParentActivity(), this, this.f32279ea);
        this.f32534z3 = jlVar;
        this.X0.addView(jlVar, 17, w7.x5.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void h8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void h9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.i40 i40Var = this.f32368m2;
            if (i40Var != null) {
                i40Var.b(true);
            }
            jj jjVar = this.f32296g2;
            if (jjVar != null) {
                jjVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = this.f32320i2;
            if (i40Var2 != null) {
                i40Var2.b(true);
            }
        }
        org.telegram.ui.Components.i40 i40Var3 = this.f32357l2;
        if (i40Var3 != null) {
            i40Var3.b(true);
        }
        org.telegram.ui.Components.i40 i40Var4 = this.f32345k2;
        if (i40Var4 != null) {
            i40Var4.b(true);
        }
        org.telegram.ui.Components.i40 i40Var5 = this.f32457t2;
        if (i40Var5 != null) {
            i40Var5.b(true);
        }
        org.telegram.ui.Components.i40 i40Var6 = this.f32469u2;
        if (i40Var6 != null) {
            i40Var6.b(true);
        }
        org.telegram.ui.Components.i40 i40Var7 = this.f32382n2;
        if (i40Var7 != null) {
            i40Var7.b(true);
        }
        org.telegram.ui.Components.i40 i40Var8 = this.f32393o2;
        if (i40Var8 != null) {
            i40Var8.b(true);
        }
        org.telegram.ui.Components.qp qpVar = this.f32482v2;
        if (qpVar != null) {
            qpVar.a();
        }
        ci.f4 f4Var = this.J0;
        if (f4Var != null) {
            f4Var.e(true);
        }
        ci.f4 f4Var2 = this.L0;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        ci.f4 f4Var3 = this.K0;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
    }

    public final void ha(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        long j3;
        long j10;
        org.telegram.ui.Components.b6 animation;
        Bitmap m10;
        if (t1Var == null) {
            int childCount = this.f32506x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f32506x0.getChildAt(i10);
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
        PhotoViewer.t1().J2(null, this, this.f32279ea);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (t1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = t1Var.getPhotoImage().getAnimation()) != null && this.f32501w8 != null && this.f32463t8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f32501w8.getBitmap(m10.getWidth(), m10.getHeight());
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
            ArrayList arrayList2 = this.f32473u6;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.hc(boolean):void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.X3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f32281f;
    }

    public final void i7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.Gb > 1000) {
            z10 = true;
        }
        wg wgVar = this.Hb;
        AndroidUtilities.cancelRunOnUIThread(wgVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        AndroidUtilities.runOnUIThread(wgVar, j3);
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
        ValueAnimator valueAnimator = this.f32292fb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.Z2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.Z2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.Z2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new lf(this, w0Var2, 1));
            ofFloat.addListener(new ai.z(13, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f32292fb = ofFloat;
            ofFloat.start();
        }
    }

    public final void ia(boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        int i10;
        if (getParentActivity() != null && (e5Var = this.parentLayout) != null && e5Var.getLastFragment() == this && !this.H4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f18121id);
            } else {
                bundle.putLong("user_id", this.f32281f.f18268id);
            }
            bundle.putInt("chatMode", 2);
            bo boVar = new bo(bundle);
            boVar.H4 = new ArrayList(this.H4);
            boVar.J4 = new HashMap(this.J4);
            int size = this.H4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.H4.get(i11);
                MessageObject messageObject = (MessageObject) this.J4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f32397o6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    boVar.J4.put(num, messageObject);
                    boVar.zc();
                }
            }
            boVar.P4 = this.P4;
            if (this.f32310h4) {
                i10 = this.H4.size();
            } else {
                i10 = this.Q4;
            }
            boVar.Q4 = i10;
            boVar.S4 = this.S4;
            boVar.f32225a8 = this.f32225a8;
            boVar.Z7 = this.Z7;
            boVar.V8 = new nl(this, boVar);
            if (z10) {
                presentFragmentAsPreview(boVar);
                d7();
                return;
            }
            presentFragment(boVar, false);
        }
    }

    public final void ib(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f32279ea != null && this.f32255ca == null) {
            fg.b c10 = fg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.T5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.e4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.e4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.e4 e4Var = theme;
                zn znVar = this.f32279ea;
                TLRPC.WallPaper wallPaper = znVar.h;
                if (this.P5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                znVar.i(e4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new we(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.T5);
            zn znVar2 = this.f32279ea;
            org.telegram.ui.ActionBar.e4 e4Var2 = znVar2.f40285f;
            if (this.P5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            znVar2.i(e4Var2, dialogWallpaper, z10, null, false);
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
                w02 = resourceProvider.g0(org.telegram.ui.ActionBar.j6.f19213w8);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19213w8, true);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            z10 = this.Cb;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.R3 != 5 || (!this.f32473u6.isEmpty() && this.f32261d4 != 0)) && !this.xc.f13985f && this.f32389n9) {
            il ilVar = this.Ea;
            if (ilVar == null || !ilVar.f28680s) {
                uh.j jVar = this.X9;
                if (jVar == null || !jVar.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void j7() {
        int W8 = (int) (W8(org.telegram.ui.Components.u21.f28265c) + this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(W8);
        int b10 = w7.p.b(AndroidUtilities.dp(36.0f) + (this.X0.getMeasuredHeight() - W8), 0, this.X0.getMeasuredHeight());
        int measuredWidth = this.X0.getMeasuredWidth();
        Rect rect = Oc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.f32541za, this.f32506x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f32506x0.getMeasuredHeight() - this.Aa) - W8));
    }

    public final void j8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f32299g5;
        if (messageSuggestionParams != null) {
            Db(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.G5;
        if (webPage != null) {
            Eb(true, webPage, false);
            return;
        }
        rn rnVar = this.f32359l5;
        if (rnVar != null) {
            Cb(this.f32385n5, rnVar);
            return;
        }
        MessageObject messageObject = this.f32385n5;
        if (messageObject != null && messageObject != this.X3) {
            Bb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f32287f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Ab(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null) {
            yb(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Eb(false, null, true);
        }
    }

    public final boolean j9(boolean z10) {
        kl klVar;
        kl klVar2 = this.f32508x2;
        if (klVar2 == null || klVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.bh bhVar = this.M0;
        if (bhVar != null && (klVar = this.f32508x2) != null) {
            bhVar.i(klVar, false, z10);
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
                this.f32508x2.setTag(1);
                return true;
            }
        }
    }

    public final void ja(int i10, boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f18129id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f18121id);
                } else {
                    bundle.putLong("user_id", this.f32281f.f18268id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            bo boVar = new bo(bundle);
            if (this.f32310h4) {
                ng.d.a(boVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            boVar.V8 = new rj(this);
            presentFragment(boVar, false);
        }
    }

    public final void jb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                jb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f32506x0 && view != this.X0) {
            view.setEnabled(z10);
        }
    }

    public final void jc() {
        int i10;
        org.telegram.ui.Components.sb sbVar;
        al alVar;
        nk nkVar;
        if (this.D9 && this.f32506x0 != null) {
            float f7 = 0.0f;
            if (this.f32412pa <= 0 || this.Da != 0.0f) {
                float V8 = V8(AndroidUtilities.dp(7.0f));
                zk zkVar = this.f32392o1;
                if (zkVar != null) {
                    i10 = AndroidUtilities.dp(zkVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float z82 = (z8() * AndroidUtilities.dp(43.0f)) + V8 + i10;
                float f10 = this.f32451s9;
                this.f32464t9 = z82;
                this.f32451s9 = W8(org.telegram.ui.Components.u21.f28263a) + AndroidUtilities.dp(4.0f) + this.v9 + z82;
                if (this.actionBar.getVisibility() == 0 || this.f32267da != null) {
                    this.f32451s9 += this.actionBar.getMeasuredHeight();
                }
                this.f32476u9 = 0;
                this.f32451s9 = this.f32451s9 + this.f32541za + this.f32502w9;
                if (this.Da != 0.0f && (nkVar = this.Y) != null && nkVar.getVisibility() == 0) {
                    float f11 = this.f32451s9;
                    float measuredHeight = this.Da * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f32451s9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.Z2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f32506x0.getTranslationY() + this.f32451s9) + this.A9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f32451s9;
                    float f13 = this.A9;
                    this.f32451s9 = f12 + f13;
                    this.f32476u9 = (int) (this.f32476u9 + f13);
                }
                ek ekVar = this.X2;
                if (ekVar != null) {
                    ekVar.setTranslationY((((this.f32506x0.getTranslationY() - f7) + this.f32451s9) + this.f32527y9) - AndroidUtilities.dp(4.0f));
                }
                lc();
                vj vjVar = this.f32506x0;
                if (vjVar != null && this.f32531z0 != null && this.A0 != null) {
                    int paddingTop = vjVar.getPaddingTop();
                    int paddingBottom = this.f32506x0.getPaddingBottom();
                    n7();
                    if (this.f32506x0.getPaddingTop() != paddingTop || this.f32506x0.getPaddingBottom() != paddingBottom) {
                        r9();
                        q9(2);
                    }
                    this.f32506x0.setTopGlowOffset((int) ((this.f32451s9 - this.f32476u9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f32451s9) {
                        int childCount = this.f32506x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f32506x0.getChildAt(i11);
                            this.f32506x0.getClass();
                            if (RecyclerView.S(childAt) == this.A0.h() - 1) {
                                float f14 = this.f32451s9;
                                if (childAt.getTop() > f14) {
                                    this.f32506x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!F9() && !this.D4 && this.J7 != null && this.f32506x0 != null && ((alVar = this.P1) == null || alVar.getVisibility() != 0)) {
                        this.f32506x0.scrollBy(0, (int) (f10 - this.f32451s9));
                    }
                }
                this.D9 = false;
                org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26698w;
                if (ocVar != null && (sbVar = ocVar.e) != null) {
                    sbVar.updatePosition();
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
                of2.suggestionParams = this.f32299g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.T5, false, false, true, 0, 0, null, -1, j10, N8(), this.f32299g5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.T5, this.f32385n5, this.X3, null, this.f32359l5, this.p5, z10, i10, 0, null, C8(), j3, z11, j10, N8(), this.f32299g5);
            y6();
        }
    }

    public final void k7() {
        int i10;
        if (this.f32219a1 != null) {
            float actionModeFactor = (1.0f - this.f32530yc.e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f32219a1.setScaleX(lerp);
            this.f32219a1.setScaleY(lerp);
            this.f32219a1.setAlpha(actionModeFactor);
            qj qjVar = this.f32219a1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qjVar.setVisibility(i10);
        }
    }

    public final void k9() {
        dl dlVar = this.f32228ab;
        if (dlVar == null) {
            return;
        }
        this.f32228ab = null;
        dlVar.e();
        if (dlVar.getReactionsWindow() != null && dlVar.getReactionsWindow().f49011a != null) {
            dlVar.getReactionsWindow().f49011a.animate().alpha(0.0f).setDuration(180L).start();
        }
        dlVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new wh(3, this, dlVar)).setDuration(180L).start();
    }

    public final void ka(TLRPC.Chat chat) {
        boolean z10;
        ci.f4 f4Var = this.f32481v1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.f4 f4Var2 = this.f32494w1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new l4(27, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f19305n0) {
            this.f32530yc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f32306h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar = this.f32270e0;
            if (zVar != null) {
                zVar.f(8);
            }
            js jsVar = this.f32257d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
            org.telegram.ui.ActionBar.z zVar2 = this.f32318i0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f32331j0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.K9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar3 = this.f32380n0;
            if (zVar3 != null && this.L9) {
                zVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f32343k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f32391o0 = true;
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
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f32331j0;
        if (w0Var5 != null) {
            this.f32256cc = true;
            this.W4 = false;
            w0Var5.z(false);
            this.f32256cc = false;
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
        if (this.Ya == null) {
            this.Ya = new a0.i();
        }
        a0.i iVar2 = this.Xa;
        if (iVar2 == null) {
            this.Xa = new a0.i();
        } else {
            iVar2.b();
        }
        this.A0.P.clear();
        this.Ya.b();
        a0.i iVar3 = null;
        a0.i iVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            iVar = this.f32512x6;
            arrayList = this.f32473u6;
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
                int i12 = Ic;
                Ic = i12 + 1;
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
            this.Ya.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (iVar3 != null) {
            for (int i14 = 0; i14 < iVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) iVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new ff(0));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f32418q3 != null && TextUtils.isEmpty(this.f32458t3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f32418q3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
            if (!this.Ya.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.A0.P.add(messageObject4);
                this.Ya.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.A0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.A0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Ya.d(messageObject6.getId())) {
                        this.A0.P.add(i18, messageObject6);
                        this.Ya.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.A0.P, new ff(1));
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
            ArrayList arrayList4 = (ArrayList) this.Xa.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.w1.k(messageObject8.dateKeyInt, this.Xa);
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
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.G6 || !arrayList.isEmpty() || this.A0.f36135w >= 0) {
                z11 = false;
            }
            Pb(z11);
            if (this.f32506x0 != null) {
                G7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.G6 || !arrayList.isEmpty() || this.A0.f36135w >= 0)) {
                    this.f32506x0.setEmptyView(this.Q0);
                    vj vjVar = this.f32506x0;
                    vjVar.L0(vjVar.v1());
                    return;
                }
                this.Q0.setVisibility(8);
                this.f32506x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.T5, this.f32385n5, this.X3, null, this.f32359l5, true, false, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, C8(), 0L, false, j3, N8(), this.f32299g5);
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
        ci.i1 i1Var;
        if (this.f32267da != null) {
            return;
        }
        int i10 = 0;
        if (this.xc.e >= 1.0f && ((i1Var = this.f32416q1) == null || i1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ci.eb ebVar = this.X0.L;
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
                nk nkVar = this.Y;
                if (nkVar != null) {
                    this.p5.editingMessage = nkVar.getFieldText();
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
        org.telegram.ui.Components.oc ocVar = this.A3;
        if (ocVar != null) {
            ocVar.c(0L, false);
        }
        jl jlVar = this.f32534z3;
        if (jlVar != null) {
            jlVar.e(0, true);
        }
    }

    public final void la(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        ci.f4 f4Var = this.f32481v1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.f4 f4Var2 = this.f32494w1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new te(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f19305n0) {
            this.f32530yc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f32306h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar = this.f32270e0;
            if (zVar != null) {
                zVar.f(8);
            }
            js jsVar = this.f32257d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
            org.telegram.ui.ActionBar.z zVar2 = this.f32318i0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            if ((this.f32261d4 == 0 || (i11 = this.R3) == 3 || i11 == 8) && (w0Var = this.f32331j0) != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.K9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar3 = this.f32380n0;
            if (zVar3 != null && this.L9) {
                zVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f32343k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f32391o0 = true;
            Fc(0, 0, -1);
            hc(false);
        }
        if ((this.f32261d4 == 0 || this.f32310h4 || (i10 = this.R3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f32281f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W4 = z11;
            org.telegram.ui.ActionBar.w0 w0Var5 = this.f32331j0;
            if (w0Var5 != null) {
                w0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f32331j0;
        if (w0Var6 != null) {
            w0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f32458t3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.T5, this.L6, this.classGuid, 0, this.f32261d4, false, this.f32394o3, this.f32406p3, !TextUtils.isEmpty(str), this.f32418q3);
        yc(0, true);
    }

    public final void lb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.lb(boolean, boolean, boolean):void");
    }

    public final void lc() {
        int i10;
        dk dkVar = this.Y2;
        if (dkVar == null) {
            return;
        }
        dkVar.setTranslationX(R8() / 2.0f);
        this.Y2.setTranslationY((((this.f32506x0.getTranslationY() + this.f32451s9) + this.f32540z9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f32540z9, -this.Y2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.Y2.setAlpha(this.f32321i3 * clamp);
        dk dkVar2 = this.Y2;
        if (this.f32321i3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dkVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.Y2.setScaleX(lerp);
        this.Y2.setScaleY(lerp);
    }

    @Override
    public final boolean m() {
        return this.f32437r9;
    }

    public final void m7() {
        float f7;
        org.telegram.ui.Components.lf lfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + W8(org.telegram.ui.Components.u21.f28265c) + this.v.c();
        nk nkVar = this.Y;
        if (nkVar != null && (lfVar = nkVar.m0) != null) {
            lfVar.setTranslationY(-inputBubbleHeight);
        }
        gk gkVar = this.I1;
        if (gkVar != null) {
            if (gkVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            gkVar.setTranslationY(f7);
        }
    }

    public final void m8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.Z7 != null && !ChatObject.isNotInChat(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.Z7;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f32427r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f32427r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.Z7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.Z7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f32427r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f32427r == 0) {
                getMessagesController().checkChatInviter(this.e.f18121id, false);
            }
        }
    }

    public final void m9() {
        boolean z10;
        Fc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f32458t3, this.T5, this.L6, this.classGuid, 0, this.f32261d4, this.f32394o3, this.f32406p3, this.f32418q3);
        if (TextUtils.isEmpty(this.f32458t3) && this.f32418q3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f32445s3 = z10;
        this.f32391o0 = z10;
        hc(false);
        Ic();
    }

    public final void ma(TLRPC.User user) {
        boolean z10;
        ci.f4 f4Var = this.f32481v1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.f4 f4Var2 = this.f32494w1;
        if (f4Var2 != null && f4Var2.V) {
            f4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ug(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f19305n0) {
            this.f32530yc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f32306h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar = this.f32270e0;
            if (zVar != null) {
                zVar.f(8);
            }
            js jsVar = this.f32257d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
            org.telegram.ui.ActionBar.z zVar2 = this.f32318i0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f32331j0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.K9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar3 = this.f32380n0;
            if (zVar3 != null && this.L9) {
                zVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f32343k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f32391o0 = true;
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
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f32331j0;
        if (w0Var5 != null) {
            this.f32256cc = true;
            this.W4 = false;
            w0Var5.z(false);
            this.f32256cc = false;
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
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f32225a8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f32225a8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != null) {
            if (z10 && this.T0 == null) {
                vi viVar = new vi(getParentActivity(), getResourceProvider(), this);
                this.T0 = viVar;
                w7.z5.b(viVar, 0.02f, 1.2f);
                this.T0.setOnClickListener(new xe(this, 12));
            }
            vi viVar2 = this.T0;
            if (viVar2 != null) {
                if (!z10) {
                    viVar2.setVisibility(8);
                    return;
                }
                viVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f32225a8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f32225a8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f32281f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        m11 m11Var = new m11(formatString.substring(indexOf, indexOf2));
                        if (m11Var.f35670c != -1) {
                            m11Var.f35670c = -1;
                            m11Var.invalidateSelf();
                        }
                        m11Var.a(503316480);
                        m11Var.setBounds(0, 0, m11Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(m11Var), indexOf, indexOf2, 33);
                    }
                }
                this.T0.setCustomText(spannableStringBuilder);
                this.T0.setOverrideTextMaxWidth(ci.f4.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
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
    public final org.telegram.ui.Components.eo n() {
        return this.f32219a1;
    }

    public final void n7() {
        float c10;
        if (this.f32506x0 != null) {
            if (this.Oa && this.f32267da == null) {
                c10 = AndroidUtilities.navigationBarHeight;
            } else {
                c10 = this.v.c() + W8(org.telegram.ui.Components.u21.f28265c) + AndroidUtilities.dp(16.0f) + this.Aa + this.f32440rc;
            }
            int i10 = (int) this.f32451s9;
            org.telegram.ui.Components.y21 y21Var = this.R1;
            if (y21Var != null) {
                y21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            hh.h hVar = this.f32493w0;
            boolean z10 = this.f32506x0.X1;
            RecyclerView recyclerView = hVar.f10534a;
            int i11 = (int) c10;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ai.n8(hVar, i12, 9));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            hh.e eVar = this.N3;
            if (eVar != null) {
                RectF rectF = eVar.f10514b;
                rectF.set(W8(org.telegram.ui.Components.u21.f28264b), i10 - this.G, 0.0f, c10 - this.Aa);
                eVar.f10515c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void n8(org.telegram.messenger.MessageObject r61, java.util.ArrayList r62, java.util.ArrayList r63, java.util.ArrayList r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.n8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n9() {
        this.X0.invalidate();
        Iterator it = this.f32518y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void na(long j3) {
        int i10 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f32219a1.e(true, false);
            } else if (getMessagesController().isCommunity(j3)) {
                showDialog(new fi.k0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new bo(bundle));
                }
            }
        } else if (j3 != getUserConfig().getClientUserId()) {
            if (j3 == a()) {
                this.f32219a1.e(true, false);
                return;
            }
            Bundle e = w.f.e(j3, "user_id");
            if (this.h != null && j3 == this.f32281f.f18268id) {
                e.putLong("dialog_id", this.T5);
            }
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            TLRPC.User user = this.f32281f;
            if (user != null && user.f18268id == j3) {
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
        this.f32261d4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f18142id = (int) j3;
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
        if (ChatObject.isMonoForum(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.e.f18121id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j10 = this.e.send_paid_messages_stars;
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f18121id), LocaleController.formatNumber(j10, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f18121id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(yh.y7.R0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.S0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final bo f34265b;

                    {
                        this.f34265b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                bo.a1(j10, this.f34265b);
                                return;
                            default:
                                bo.s0(j10, this.f34265b);
                                return;
                        }
                    }
                });
                return;
            }
            this.S0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f32225a8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.jo joVar = this.S0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                joVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.T5))), LocaleController.getString(R.string.MessagePremiumUnlock), new ai.e2(7));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.jo joVar2 = this.S0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                joVar2.c(z10, false, AndroidUtilities.replaceTags(yh.y7.R0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.T5), LocaleController.formatNumber(this.f32225a8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final bo f34265b;

                    {
                        this.f34265b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                bo.a1(j3, this.f34265b);
                                return;
                            default:
                                bo.s0(j3, this.f34265b);
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
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((o2Var instanceof bo) && ((bo) o2Var).x9()) {
                return false;
            }
        }
        return this.H6;
    }

    @Override
    public final void o() {
        if (!this.f32310h4) {
            if (this.f32281f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32281f.f18268id));
                if (user != null) {
                    this.f32281f = user;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.e.f18121id));
                if (chat != null) {
                    this.e = chat;
                } else {
                    return;
                }
            }
            qj qjVar = this.f32219a1;
            if (qjVar != null) {
                qjVar.b();
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
        ArrayList arrayList4 = this.f32473u6;
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
                        if (Math.abs(i19 - indexOf) > this.Ib + 1 && Math.abs(i20 - i11) > this.Ib + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i17 == i25 || (Math.abs(i17 - indexOf) > this.Ib + 1 && Math.abs(i23 - i11) > this.Ib + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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
                    if (Math.abs(i33 - i26) >= this.Ib + 1 && Math.abs(i34 - i27) >= this.Ib + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.Ib + 1 && Math.abs(i32 - i27) >= this.Ib + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
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
            tm tmVar = this.X0;
            if (tmVar != null) {
                tmVar.invalidate();
            }
            vj vjVar = this.f32506x0;
            if (vjVar != null) {
                vjVar.invalidate();
            }
        }
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(W8(org.telegram.ui.Components.u21.f28265c) + this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(16.0f));
        }
        v7();
    }

    public final void oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().J2(null, this, this.f32279ea);
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
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.T5, this.f32385n5, this.X3, null, this.f32359l5, null, 0, this.p5, true, 0, 0, false, false, null, C8(), 0L, 0L, N8(), this.f32299g5);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.oc(boolean):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        ai.g4 g4Var;
        org.telegram.ui.Components.un unVar;
        String str;
        ai.g4 g4Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (g4Var2 = this.J1) != null) {
                    org.telegram.ui.Components.ni niVar = g4Var2.f28806y0;
                    if (niVar instanceof ii.r) {
                        ii.r rVar = (ii.r) niVar;
                        if (intent != null && intent.getData() != null) {
                            ii.w3 w3Var = rVar.f11591r;
                            Uri data = intent.getData();
                            if (data == null) {
                                w3Var.getClass();
                                return;
                            } else if (w3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new gg.x1(13, w3Var, data));
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
                        ai.g4 g4Var3 = this.J1;
                        if (g4Var3 != null) {
                            org.telegram.ui.Components.ni niVar2 = g4Var3.f28806y0;
                            if (niVar2 instanceof ii.r) {
                                ii.r rVar2 = (ii.r) niVar2;
                                if (intent.getData() != null) {
                                    rVar2.f11591r.f2(intent.getData());
                                    return;
                                }
                                return;
                            }
                        }
                        Uri data2 = intent.getData();
                        if (data2.toString().contains("video")) {
                            try {
                                str = AndroidUtilities.getPath(data2);
                            } catch (Exception e) {
                                FileLog.e(e);
                                str = null;
                            }
                            if (str == null) {
                                tb();
                            }
                            if (this.f32420q5) {
                                this.f32450s8 = str;
                            } else {
                                oa(null, str);
                            }
                        } else if (this.p5 == null && this.R3 == 1) {
                            org.telegram.ui.Components.c5.M(getParentActivity(), this.T5, new x5(4, this, data2), this.f32279ea);
                        } else {
                            l8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.T5, this.f32385n5, this.X3, this.f32359l5, null, null, null, null, 0, this.p5, true, 0, this.R3, C8());
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
                            ai.g4 g4Var4 = this.J1;
                            if (g4Var4 != null) {
                                g4Var4.dismiss();
                            }
                            org.telegram.ui.Components.c5.M(getParentActivity(), this.T5, new org.telegram.ui.Components.b5(this) {
                                public final bo f36319b;

                                {
                                    this.f36319b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            bo boVar = this.f36319b;
                                            boVar.l8(null, null);
                                            boVar.gb(i12, intent.getData(), z10);
                                            boVar.y6();
                                            return;
                                        default:
                                            bo boVar2 = this.f36319b;
                                            boVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                boVar2.gb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            boVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f32279ea);
                            return;
                        } else if (intent.getClipData() != null) {
                            ai.g4 g4Var5 = this.J1;
                            if (g4Var5 != null) {
                                g4Var5.dismiss();
                            }
                            org.telegram.ui.Components.c5.M(getParentActivity(), this.T5, new org.telegram.ui.Components.b5(this) {
                                public final bo f36319b;

                                {
                                    this.f36319b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            bo boVar = this.f36319b;
                                            boVar.l8(null, null);
                                            boVar.gb(i12, intent.getData(), z10);
                                            boVar.y6();
                                            return;
                                        default:
                                            bo boVar2 = this.f36319b;
                                            boVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                boVar2.gb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            boVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f32279ea);
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
                    ai.g4 g4Var6 = this.J1;
                    if (g4Var6 != null) {
                        g4Var6.dismiss();
                    }
                    y6();
                    return;
                } else if (i10 == 28 && (g4Var = this.J1) != null && (unVar = g4Var.m0) != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = unVar.f26462a;
                    if (unVar.f28435k1 != -1 && unVar.f28433j1 != null) {
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
                            org.telegram.messenger.w1.p(R.string.UnsupportedAttachment, new org.telegram.ui.Components.vc(unVar.f26463b.container, f6Var), f6Var);
                            return;
                        }
                        unVar.e0(unVar.f28435k1, new rh.c(uri));
                        org.telegram.ui.Components.cn cnVar = unVar.f28433j1;
                        if (cnVar != null) {
                            cnVar.dismiss(true);
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
            ai.g4 g4Var7 = this.J1;
            if (g4Var7 != null) {
                g4Var7.f28757j0.g0(i10, intent, this.V7);
            }
            this.V7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        gl glVar;
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.Components.of ofVar;
        org.telegram.ui.Components.lf lfVar;
        um umVar;
        zg.s sVar;
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26698w;
        if (ocVar != null) {
            org.telegram.ui.Components.sb sbVar = ocVar.e;
            if (sbVar instanceof org.telegram.ui.Components.zb) {
                if (z10) {
                    ((org.telegram.ui.Components.zb) sbVar).f();
                    ocVar.b();
                    return false;
                }
                return false;
            }
        }
        k51 k51Var = this.Z9;
        if (k51Var != null && !k51Var.f35002b0) {
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
            zg.t tVar = this.Y9;
            if (tVar != null && (sVar = tVar.f49197b) != null && sVar.getReactionsWindow() != null) {
                if (z10) {
                    tVar.f49197b.e();
                    return false;
                }
            } else if (ut.q().E) {
                if (z10) {
                    ut.q().o();
                    return false;
                }
            } else {
                il ilVar = this.Ea;
                if (ilVar != null && ilVar.f28680s) {
                    if (z10) {
                        ilVar.a(true);
                        return false;
                    }
                } else if (this.xc.f13985f) {
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
                        if (z10 && (umVar = this.f32254c9) != null && umVar.y()) {
                            this.f32254c9.f(false);
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
                            nk nkVar = this.Y;
                            if (nkVar != null && nkVar.u0()) {
                                if (z10) {
                                    this.Y.n0(true);
                                    return false;
                                }
                            } else {
                                nk nkVar2 = this.Y;
                                if (nkVar2 != null && nkVar2.w()) {
                                    if (z10) {
                                        nk nkVar3 = this.Y;
                                        ei.c0 c0Var = nkVar3.f21812l0;
                                        if (c0Var != null) {
                                            c0Var.setOpened(false);
                                        }
                                        if (!nkVar3.k0() && (lfVar = nkVar3.m0) != null) {
                                            lfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    nk nkVar4 = this.Y;
                                    if (nkVar4 == null || (ofVar = nkVar4.E0) == null || !ofVar.closeCreationLinkDialog(z10)) {
                                        if (this.R3 == 6 && (c2Var = hg.v.e) != null && c2Var.isShowing()) {
                                            if (z10) {
                                                hg.v.e.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.e) && !this.T3 && this.R1 != null && d() != 0) {
                                            if (z10) {
                                                this.R1.m(0L, this.f32409p7);
                                                return false;
                                            }
                                        } else if (this.R3 == 5 && !"hello".equalsIgnoreCase(this.Q3) && !"away".equalsIgnoreCase(this.Q3) && (this.f32473u6.isEmpty() || this.f32261d4 == 0)) {
                                            if (z10) {
                                                Qb();
                                                return false;
                                            }
                                        } else if (this.R3 == 6 && this.Y.x()) {
                                            if (z10) {
                                                wb(new sf(this, 19));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f19305n0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f32491vc.f13985f) {
                                                if (z10) {
                                                    ta();
                                                }
                                            } else {
                                                if (z10 && (glVar = this.f32234b3) != null) {
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
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f32473u6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.e)))) {
                    org.telegram.ui.Components.f31.u(messageObject, false);
                }
            }
        }
        this.F3 = false;
        l9();
        ArrayList arrayList2 = org.telegram.ui.Components.f31.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        nf.e eVar = this.f32542zb;
        if (eVar != null) {
            eVar.a(false);
            this.f32542zb = null;
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
        if (this.f32268db) {
            nk nkVar = this.Y;
            if (nkVar != null) {
                nkVar.J0();
                nk nkVar2 = this.Y;
                nkVar2.T0 = false;
                org.telegram.ui.Components.cg cgVar = nkVar2.U0;
                if (cgVar != null) {
                    cgVar.u(false);
                }
            }
            this.f32268db = false;
        }
        if (this.f32481v1 != null) {
            AndroidUtilities.runOnUIThread(new ne(this, 1), 600L);
        }
        if (this.f32432r4 && !this.f32446s4) {
            this.f32446s4 = true;
            org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f26705j = 5000;
            M.v = new ne(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        zg.t tVar = this.Y9;
        if (tVar != null && tVar.d()) {
            this.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j3;
        long j10;
        qj qjVar = this.f32219a1;
        if (qjVar != null) {
            qjVar.getViewTreeObserver().addOnPreDrawListener(new g7(this, 1));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        A7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C1() || !PhotoViewer.t1().Q1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().J2(null, this, this.f32279ea);
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
            } else if (PhotoViewer.C1() && PhotoViewer.t1().f31016l2) {
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
        ok okVar = this.W9;
        float f7 = 0.0f;
        if (z10 && this.R9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var instanceof bo) {
                this.D4 = true;
                bo boVar = (bo) o2Var;
                boVar.T9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.X0.setSkipBackgroundDrawing(true);
                this.f32219a1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f32219a1.getAvatarImageView().setAlpha(0.0f);
                this.f32219a1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.S9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                nk nkVar = this.Y;
                if (nkVar != null) {
                    nkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                rk rkVar = this.R;
                if (rkVar != null) {
                    rkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                nk nkVar2 = this.Y;
                if (nkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = nkVar2.getMeasuredHeight();
                }
                rk rkVar2 = this.R;
                if (rkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = rkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                nk nkVar3 = boVar.Y;
                if (nkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = nkVar3.getMeasuredHeight();
                }
                rk rkVar3 = this.R;
                if (rkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = rkVar3.getMeasuredHeight();
                }
                this.O9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ai.x(9, this, boVar));
                jc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.V9 = animatorSet;
                animatorSet.addListener(new ci.y5(this, boVar, runnable));
                this.V9.setDuration(300L);
                this.V9.setInterpolator(org.telegram.ui.Components.qr.f27383f);
                this.V9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(okVar, 200L);
                return this.V9;
            }
        }
        if (this.f32340ja && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var2 instanceof fg1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                o2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f32364la = f7;
                ofFloat.addUpdateListener(new dj(0, this));
                this.f32353ka = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                tm tmVar = this.X0;
                if (tmVar != null) {
                    tmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V9 = animatorSet2;
                animatorSet2.addListener(new fj(this, z10, runnable));
                this.V9.setDuration(150L);
                this.V9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(okVar, 200L);
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
        org.telegram.ui.ActionBar.c2 c2Var = this.N;
        if (c2Var != null && dialog == c2Var) {
            getMessagesController().deleteDialog(this.T5, 0);
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var != null && !e5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.ru0 ru0Var;
        super.onFragmentDestroy();
        hh.e eVar = this.N3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f10520w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                hh.d dVar = (hh.d) longSparseArray.valueAt(i10);
                if (dVar.f10508i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        nk nkVar = this.Y;
        if (nkVar != null) {
            nkVar.C0();
        }
        qj qjVar = this.f32219a1;
        if (qjVar != null && (ru0Var = qjVar.f23615c0) != null) {
            ru0Var.b(qjVar.G);
        }
        gk gkVar = this.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            this.I1.getAdapter().P();
        }
        ai.g4 g4Var = this.J1;
        if (g4Var != null) {
            g4Var.dismissInternal();
        }
        ut q6 = ut.q();
        if (q6.f38213l == this.f32352k9) {
            q6.W = null;
            q6.f38201a0 = null;
            q6.Y = null;
            q6.f38213l = null;
            q6.f38205c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.F9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.G9);
        getNotificationCenter().onAnimationFinish(this.H9);
        getNotificationCenter().onAnimationFinish(this.I9);
        l9();
        ne neVar = this.L5;
        if (neVar != null) {
            AndroidUtilities.cancelRunOnUIThread(neVar);
            this.L5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f32390na);
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
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.R3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.T5), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f32281f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.E3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f32281f != null) {
            getMessagesController().cancelLoadFullUser(this.f32281f.f18268id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ai.g4 g4Var2 = this.J1;
        if (g4Var2 != null) {
            g4Var2.v1();
            this.J1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.e)) {
            getMessagesController().startShortPoll(this.e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.Z7.linked_chat_id)), this.classGuid, true);
            }
        }
        um umVar = this.f32254c9;
        if (umVar != null) {
            umVar.f(false);
        }
        xj xjVar = this.f32519y0;
        if (xjVar != null) {
            xjVar.N();
        }
        wk wkVar = this.f32503wa;
        if (wkVar != null) {
            wkVar.b();
        }
        this.f32241ba = null;
        org.telegram.ui.ActionBar.e5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Nc ? 1 : 0);
            org.telegram.ui.ActionBar.e5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.l9) parentLayout2.getPulledDialogs().get(i11)).f25863b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Nc = false;
        nf.e eVar2 = this.f32542zb;
        if (eVar2 != null) {
            eVar2.a(false);
            this.f32542zb = null;
        }
        this.f32304ga.onFragmentDestroy();
        p11 p11Var = this.f32253c8;
        if (p11Var != null) {
            p11Var.b(true);
            this.f32253c8 = null;
        }
        yh.e4 e4Var = this.f32414pc;
        if (e4Var != null) {
            e4Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f32414pc);
            this.f32414pc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f32341jb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f32501w8, null, null, false);
        }
        yh.e4 e4Var = this.f32414pc;
        if (e4Var != null) {
            e4Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f32414pc);
            this.f32414pc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ai.g4 g4Var;
        org.telegram.ui.Components.gl glVar;
        ai.g4 g4Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vi viVar;
        nk nkVar = this.Y;
        boolean z12 = false;
        if (nkVar != null && i10 == 2 && nkVar.f21798i3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(nkVar.Q).sendCurrentLocation(nkVar.f21792h3, nkVar.f21798i3);
            }
            nkVar.f21798i3 = null;
            nkVar.f21792h3 = null;
        }
        gk gkVar = this.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            gg.k1 adapter = this.I1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f9842w0;
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
            ai.g4 g4Var3 = this.J1;
            if (g4Var3 != null) {
                g4Var3.f28757j0.Y();
            }
            org.telegram.ui.Components.mp mpVar = this.f32241ba;
            if (mpVar != null && (viVar = mpVar.Y) != null) {
                viVar.f28757j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (g4Var = this.J1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                g4Var.D1();
            } else if (i10 == 30 && (glVar = g4Var.f28771o0) != null && g4Var.f28806y0 == glVar && g4Var.isShowing()) {
                g4Var.f28771o0.Y();
            }
        } else if ((i10 == 17 || i10 == 18) && (g4Var2 = this.J1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = g4Var2.f28757j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.J1.f28757j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32279ea);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new ai(this));
                hg.k0.A(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(2);
        } else if (((i10 != 101 && i10 != 102) || this.f32281f == null) && (i10 != 103 || this.e == null)) {
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
                    org.telegram.ui.Components.voip.f2.l(this.e, null, this.Y7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f32281f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f32225a8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.f2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f32281f.f18268id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.f2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        nk nkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.u9[] u9VarArr;
        ai.f0 f0Var;
        super.onResume();
        d7();
        this.E9 = System.currentTimeMillis();
        if (this.f32437r9 && getSendMessagesHelper().getImportingHistory(this.T5) != null) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(getParentActivity(), null, this, this.f32279ea);
            w40Var.setOnHideListener(new lg(this, 8));
            showDialog(w40Var);
            this.f32437r9 = false;
        }
        H6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        W6();
        ai.g4 g4Var = this.J1;
        if (g4Var != null) {
            g4Var.y1();
        }
        tm tmVar = this.X0;
        boolean z12 = true;
        if (tmVar != null) {
            org.telegram.ui.Components.m81 m81Var = tmVar.v;
            if (m81Var != null) {
                m81Var.c(true);
            }
            tmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new ne(this, 24), 1000L);
        }
        b9 b9Var = new b9(this, 2);
        this.Yb = b9Var;
        setBulletinDelegate(b9Var);
        G6(false);
        TLRPC.PhotoSize photoSize = this.f32498w5;
        if (photoSize != null && (f0Var = this.f32218a0) != null) {
            ((org.telegram.ui.Components.qo[]) f0Var.f785b)[0].f27366f.k(ImageLocation.getForObject(photoSize, this.f32523y5), "50_50", ImageLocation.getForObject(this.f32511x5, this.f32523y5), "50_50_b", this.f32472u5, null, this.f32385n5, this.f32485v5);
        }
        if (this.C5 != null && (u9VarArr = this.B2) != null) {
            u9VarArr[0].k(ImageLocation.getForObject(this.C5, this.E5), "50_50", ImageLocation.getForObject(this.D5, this.E5), "50_50_b", this.f32536z5, null, (MessageObject) this.J4.get(Integer.valueOf(this.L4)), this.A5);
            u9VarArr[0].setHasBlur(this.B5);
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
                if (this.f32506x0 != null) {
                    int i10 = this.T7;
                    if (i10 == -9000) {
                        i10 = K8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f32531z0.i1(this.f32473u6.indexOf(this.K7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f32531z0.i1(this.f32473u6.indexOf(this.K7) + this.A0.J, i10, z11);
                }
            } else {
                O9(false);
            }
            this.S5 = false;
            this.Q5 = false;
            this.K7 = null;
        }
        this.f32420q5 = false;
        this.f32433r5 = false;
        a7(false);
        if (this.f32447s5) {
            this.f32447s5 = false;
            nm nmVar = this.A0;
            if (nmVar != null) {
                nmVar.O(false);
            }
        }
        qj qjVar = this.f32219a1;
        if (qjVar != null) {
            qjVar.getViewTreeObserver().addOnPreDrawListener(new g7(this, 1));
        }
        A6(false, false);
        if (this.Y != null && this.R3 == 0 && this.f32328ia != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.T5 && (arrayList2 = this.f32328ia.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new t80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f32328ia.entities;
            }
            CharSequence s10 = ChatActivityEnterView.s(arrayList, this.f32328ia.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (s10 != null && s10.length() > 0 && s10.charAt(0) == '@') {
                s10 = TextUtils.concat(" ", s10);
            }
            this.Y.f1(s10, true);
            this.f32328ia = null;
        }
        sk skVar = this.O0;
        if (skVar != null && skVar.getVisibility() != 0 && !this.actionBar.f19305n0 && this.R3 != 7 && !org.telegram.ui.ActionBar.o2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        nk nkVar2 = this.Y;
        if (nkVar2 != null) {
            nkVar2.F0();
        }
        if (this.f32281f != null) {
            this.f32410p8 = System.currentTimeMillis();
            this.f32422q8 = 0L;
        }
        if (this.f32450s8 != null) {
            AndroidUtilities.runOnUIThread(new ne(this, 3));
        }
        if (this.f32506x0 != null && ((nkVar = this.Y) == null || !nkVar.s0())) {
            this.f32506x0.setOnItemLongClickListener(this.Ja);
            this.f32506x0.setOnItemClickListener(this.Ka);
            this.f32506x0.setLongClickable(true);
        }
        org.telegram.ui.Components.k51.h = false;
        TLRPC.User user = this.f32281f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.k51.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.Z7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.Z7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.k51.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                org.telegram.ui.Components.k51.h = (chatFull.bot_info.isEmpty() || (chat = this.e) == null || !chat.megagroup) ? false : false;
            }
        }
        Nc(false);
        Ib();
        if (this.N9 != 0.0f) {
            this.N9 = 0.0f;
            this.f32506x0.invalidate();
        }
        this.E3.attach();
        yh.e4 e4Var = this.f32414pc;
        if (e4Var != null) {
            e4Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.qd qdVar;
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
            iArr = UserObject.isUserSelf(this.f32281f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            nk nkVar = this.Y;
            if (nkVar != null && (qdVar = nkVar.R1) != null) {
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                nkVar.R1 = null;
            }
        }
        d7();
        this.F9 = getNotificationCenter().setAnimationInProgress(this.F9, iArr);
    }

    public final void p7() {
        int i10;
        float f7 = this.f32543zc.e;
        org.telegram.ui.Components.d40 d40Var = this.f32456t1;
        int i11 = 8;
        if (d40Var != null) {
            d40Var.setAlpha(f7);
            org.telegram.ui.Components.d40 d40Var2 = this.f32456t1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d40Var2.setVisibility(i10);
        }
        ai.w0 w0Var = this.L3;
        if (w0Var != null) {
            float f10 = 1.0f - f7;
            w0Var.setAlpha(f10);
            ai.w0 w0Var2 = this.L3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            w0Var2.setVisibility(i11);
        }
    }

    public final void p9() {
        boolean z10;
        Rect rect;
        if (this.X0 != null) {
            if (this.Ta <= 0 && this.Ua <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ph.i iVar = this.v;
            float b10 = iVar.b();
            le.m mVar = iVar.f41093b;
            int max = (int) Math.max(0.0f, (b10 * mVar.f14008a) - AndroidUtilities.dp(29.0f));
            tm tmVar = this.X0;
            ci.eb ebVar = tmVar.L;
            Rect rect2 = this.Fc;
            if (ebVar != null) {
                rect2.set(0, 0, tmVar.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                this.X0.L.setClipBounds(rect2);
            }
            if (this.f32506x0 != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f32506x0.getTop());
                vj vjVar = this.f32506x0;
                if (vjVar.a1()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                vjVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(iVar.v, iVar.b() * mVar.f14008a) - AndroidUtilities.dp(29.0f))));
                jh.f fVar = this.X;
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
        this.f32219a1.setTranslationY(0.0f);
        this.f32219a1.getAvatarImageView().setScaleX(1.0f);
        this.f32219a1.getAvatarImageView().setScaleY(1.0f);
        this.f32219a1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void pb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f32249c4 = tL_forumTopic;
        this.f32221a4 = arrayList;
        MessageObject messageObject = (MessageObject) hg.k0.h(1, arrayList);
        this.X3 = messageObject;
        this.f32385n5 = messageObject;
        this.f32347k4 = i11;
        this.l4 = i12;
        this.f32370m4 = Math.max(1, i11);
        this.f32261d4 = this.X3.getId();
        this.f32274e4 = i10;
        this.f32286f4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32310h4 = z10;
        MessageObject messageObject2 = this.f32385n5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32298g4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        zc();
        Qc(false);
        hc(false);
    }

    public final void pc() {
        MessageObject messageObject;
        if (this.f32281f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                vj vjVar = this.f32506x0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f32506x0.getChildAt(i10);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f32410p8, this.f32422q8, this.f32281f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f31471h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f32281f, null, null, messageObject2.getId());
            }
        }
    }

    @Override
    public final void q(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j3) {
        if (photoEntry == null) {
            return;
        }
        this.f32479uc.a(false, true);
        MessageObject messageObject = this.p5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.p5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f32299g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.p5.messageOwner.suggested_post);
            }
            if (!yh.v5.U(this.currentAccount, messageSuggestionParams.amount)) {
                Tb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            ne neVar = new ne(this, 21);
            this.f32421q7 = neVar;
            AndroidUtilities.runOnUIThread(neVar, 3000L);
        }
        l8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.c5.b0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                bo boVar = bo.this;
                MessageObject messageObject2 = boVar.p5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = boVar.f32299g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(boVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(boVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, boVar.T5, boVar.p5, boVar.X3, null, boVar.f32359l5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, boVar.C8(), photoEntry2.effectId, l4.longValue(), boVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(boVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, boVar.T5, boVar.p5, boVar.X3, null, boVar.f32359l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, boVar.C8(), photoEntry2.effectId, l4.longValue(), boVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(boVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, boVar.T5, boVar.p5, boVar.X3, null, boVar.f32359l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, boVar.C8(), photoEntry2.effectId, l4.longValue(), boVar.N8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(boVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, boVar.T5, boVar.f32385n5, boVar.X3, null, boVar.f32359l5, photoEntry2.entities, photoEntry2.ttl, boVar.p5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, boVar.C8(), photoEntry2.effectId, l4.longValue(), boVar.N8(), boVar.f32299g5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(boVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, boVar.T5, boVar.f32385n5, boVar.X3, null, boVar.f32359l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, boVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, boVar.C8(), photoEntry2.effectId, l4.longValue(), boVar.N8(), boVar.f32299g5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(boVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, boVar.T5, boVar.f32385n5, boVar.X3, null, boVar.f32359l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, boVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, boVar.C8(), photoEntry2.effectId, l4.longValue(), boVar.N8(), boVar.f32299g5);
                }
                boVar.y6();
            }
        }, j3);
    }

    public final void q7() {
        if (this.X0 == null) {
            return;
        }
        this.f32440rc = C6(false);
        this.f32454sc = C6(true);
        this.S.setInputBubbleHeight(this.f32440rc);
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
    }

    public final org.telegram.ui.Cells.a0 q8(int i10, boolean z10) {
        MessageObject messageObject;
        vj vjVar = this.f32506x0;
        if (vjVar != null) {
            int childCount = vjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f32506x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f32451s9 - this.f32476u9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f32506x0.getMeasuredHeight() - this.Aa) {
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
        bo boVar = this.f32267da;
        if (boVar != null) {
            boVar.q9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            yf.b0 b0Var = this.Cc;
            if (b0Var.f46809c == 0) {
                b0Var.invalidate();
            }
            b0Var.f46809c = i10 | b0Var.f46809c;
        }
    }

    public final void qa(long j3, boolean z10) {
        if (this.R1 != null && UserObject.isBotForum(this.f32281f)) {
            this.R1.setAllTopicsHidden(true);
        }
        this.M5.put(j3, 1);
        Q7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 0, new ci.r9(this, j3, z10, 5), new me(this, j3, 2));
        this.A0.O(false);
    }

    public final void qb() {
        AndroidUtilities.shakeViewSpring(this.f32506x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        nk nkVar = this.Y;
        for (int i10 = 0; i10 < nkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(nkVar.getChildAt(i10), 5.0f);
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
        getNotificationCenter().doOnIdle(new ci.y0(this, messageObject, z10, 11));
    }

    public final void r7() {
        int i10;
        bo boVar = this.f32267da;
        if (boVar != null) {
            boVar.r7();
        }
        int i11 = AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + ((int) V8(AndroidUtilities.dp(7.0f)));
        zk zkVar = this.f32392o1;
        if (zkVar != null) {
            i10 = AndroidUtilities.dp(zkVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(z8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.c());
        ai.w0 w0Var = this.L3;
        if (w0Var != null) {
            w0Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.d40 d40Var = this.f32456t1;
        if (d40Var != null) {
            d40Var.e.setPadding(0, dp2, 0, dp3);
            d40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        hh.f fVar = this.K3;
        if (fVar != null) {
            jh.f fVar2 = fVar.f10523a;
            fVar2.setFadeZoneTop(dp2);
            fVar2.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.t00 t00Var = this.f32247c2;
        if (t00Var != null) {
            t00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.zw0 zw0Var = this.f32259d2;
        if (zw0Var != null) {
            zw0Var.f30675a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final void r8() {
        if (this.f32350k7) {
            return;
        }
        this.f32350k7 = true;
        getMessagesController().checkSensitive(this, this.T5, new ne(this, 26), new sf(this, 19));
    }

    public final void r9() {
        this.f32438ra = true;
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32279ea);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        c2Var.R = string;
        TLRPC.User user = this.f32281f;
        if (user != null) {
            if (user.bot) {
                c2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String j3 = org.telegram.messenger.w1.j(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, gf.b.c());
                TLRPC.User user2 = this.f32281f;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, j3, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            c2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new gg.d2(this, i10, messageObject, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void rc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f32512x6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                xj xjVar = this.f32519y0;
                if (xjVar != null) {
                    xjVar.V(groupedMessages);
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
            MessageObject messageObject3 = (MessageObject) this.f32397o6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.A0.N) {
                a0.i iVar = this.Ya;
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
                    nm nmVar = this.A0;
                    nmVar.m(nmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f32473u6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                nm nmVar2 = this.A0;
                nmVar2.m(nmVar2.J + indexOf2);
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
        float f7 = (1.0f - this.xc.e) * (1.0f - this.f32491vc.e);
        this.f32332j1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f32332j1.setAlpha(f7);
        jh.h hVar = this.f32332j1;
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
        int childCount = this.f32506x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f32506x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (currentMessagesGroup = ((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f32473u6.indexOf((MessageObject) hg.k0.h(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        nm nmVar = this.A0;
                        nmVar.q(indexOf + nmVar.J, currentMessagesGroup.messages.size());
                        this.f32506x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            hg.k0.x(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && !e5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(z10));
        return false;
    }

    public final void s9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f32281f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f32473u6.isEmpty();
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
        nk nkVar = this.Y;
        if (nkVar != null && nkVar.x0()) {
            return true;
        }
        ArrayList arrayList2 = this.f32473u6;
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
        sf sfVar = this.f32424qa;
        if (sfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sfVar);
        }
        nk nkVar = this.Y;
        if (nkVar != null && this.X0 != null && nkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f19512f) {
            this.f32412pa = this.X0.getKeyboardHeight();
        } else {
            this.f32412pa = -1;
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
        if (v9() && this.f32385n5 == null && this.p5 == null) {
            if (this.R3 != 8 && v9() && this.e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f18121id, 1L);
                if (this.R3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)) {
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
        org.telegram.ui.ActionBar.o1 o1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        vj vjVar = this.f32506x0;
        gk gkVar = this.I1;
        if ((gkVar != null && gkVar.I) || ((o1Var = this.Q8) != null && o1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        vjVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.a0 n10 = kVar.n();
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
        org.telegram.ui.ActionBar.h2 h2Var;
        float f7;
        float f10;
        nk nkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f32281f != null && this.f32380n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f32281f.f18268id);
            if (userFull != null && userFull.phone_calls_available) {
                this.L9 = !this.inPreviewMode;
                this.f32380n0.f(0);
            } else {
                this.L9 = false;
                this.f32380n0.f(8);
            }
        }
        qj qjVar = this.f32219a1;
        float f12 = 0.0f;
        if (qjVar != null) {
            qjVar.setOccupyStatusBar(!z10);
            qj qjVar2 = this.f32219a1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            qjVar2.setLayoutParams(w7.x5.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        nk nkVar2 = this.Y;
        if (nkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            nkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.oy0 oy0Var = this.f32258d1;
        if (oy0Var != null) {
            if (this.Z4 && !z10 && ((nkVar = this.Y) == null || !nkVar.y3)) {
                i11 = 0;
            }
            oy0Var.setVisibility(i11);
        }
        gk gkVar = this.I1;
        if (gkVar != null) {
            ViewPropertyAnimator animate = gkVar.animate();
            if (!this.Y.y3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.qr.f27383f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                h2Var = new org.telegram.ui.ActionBar.h2(false);
            } else {
                h2Var = null;
            }
            kVar.setBackButtonDrawable(h2Var);
            org.telegram.ui.ActionBar.w0 w0Var = this.f32306h0;
            if (w0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                w0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.z zVar = this.f32270e0;
            if (zVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                zVar.f19748i = f12;
                org.telegram.ui.ActionBar.w0 w0Var2 = zVar.f19752m;
                if (w0Var2 != null) {
                    w0Var2.setAlpha(f12);
                }
            }
        }
        vj vjVar = this.f32506x0;
        if (vjVar != null) {
            int childCount = vjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f32506x0.getChildAt(i12);
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
                        int i13 = this.f32360l6 - 1;
                        this.f32360l6 = i13;
                        if (i13 <= 0) {
                            this.f32360l6 = 0;
                            this.f32372m6 = true;
                            Kb(false);
                        } else {
                            this.f32332j1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.e)) {
                            j3 = this.e.f18121id;
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
            this.f32506x0.setItemAnimator(null);
        }
        hc(false);
        Kc();
        ik ikVar = this.X1;
        if (ikVar != null) {
            if (!z10 && !this.Oa) {
                z12 = true;
            } else {
                z12 = false;
            }
            ikVar.setEnabled(z12);
        }
        ik ikVar2 = this.Z1;
        if (ikVar2 != null) {
            if (!z10 && !this.Oa) {
                z11 = true;
            } else {
                z11 = false;
            }
            ikVar2.setEnabled(z11);
        }
        kl klVar = this.f32508x2;
        if (klVar != null) {
            klVar.setEnabled(!isInPreviewMode());
        }
        tm tmVar = this.X0;
        if (tmVar != null) {
            tmVar.setOccupyStatusBar((this.inBubbleMode || this.Oa || this.inPreviewMode) ? false : false);
        }
    }

    public final void t6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.t6():void");
    }

    public final void t7() {
        bo boVar = this.f32267da;
        if (boVar != null) {
            boVar.t7();
        }
        float V8 = V8(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.R1 != null) {
            V8 += W8(org.telegram.ui.Components.u21.f28263a);
        }
        if (this.f32392o1 != null) {
            V8 += AndroidUtilities.dp(35.0f) * this.f32392o1.E;
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
                nm nmVar = this.A0;
                if (nmVar != null) {
                    nmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.T5, z10, z11, z12, i10, 0, this.X3, -1, j3, N8(), this.f32299g5);
            org.telegram.ui.Components.c5.t0(sendMessage, this, this.f32279ea);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new sf(this, 24));
            }
        }
    }

    public final boolean t9() {
        if (this.R1 != null && this.f32261d4 == 0) {
            return true;
        }
        return false;
    }

    public final void ta() {
        org.telegram.ui.Cells.t1 t1Var;
        this.f32491vc.a(false, true);
        qh.c cVar = this.Bc;
        if (cVar != null && (t1Var = cVar.f41783n) != null && t1Var.getDelegate() != null) {
            cVar.f41783n.getDelegate().D1(cVar.f41783n, false);
        }
        nk nkVar = this.Y;
        if (nkVar != null) {
            nkVar.V0(true, true, false);
            this.Y.U4 = null;
        }
    }

    public final void tb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.vc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f32279ea).j();
    }

    public final void tc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    @Override
    public final boolean u(final org.telegram.ui.wy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.fg1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.u(org.telegram.ui.wy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.fg1):boolean");
    }

    public final void u6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.i iVar = this.f32499w6;
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
            this.M0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - z8()) * (1.0f - this.xc.e) * R8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final int u8() {
        return this.R3;
    }

    public final void ua(org.telegram.ui.Cells.t1 t1Var) {
        qh.c cVar;
        if (this.f32491vc.f13985f && (cVar = this.Bc) != null && cVar.f41783n == t1Var) {
            Editable text = cVar.f41779a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(t1Var.getMessageObject(), text, this.Bc.getAttachedMedia());
                ta();
                return;
            }
            AndroidUtilities.shakeView(this.Bc.f41779a);
        }
    }

    public final void ub(org.telegram.ui.Cells.t1 t1Var) {
        if (getParentActivity() != null && t1Var != null && t1Var.f21189ob != null && t1Var.getPrimaryMessageObject() != null && t1Var.getPrimaryMessageObject().messageOwner != null && t1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Wa) {
                this.Wa = true;
                if (this.f32532z1 != null) {
                    return;
                }
                ci.f4 f4Var = new ci.f4(getParentActivity(), 3);
                f4Var.p(true);
                f4Var.K = Layout.Alignment.ALIGN_NORMAL;
                f4Var.d = -1L;
                f4Var.T = true;
                f4Var.e = true;
                f4Var.i();
                f4Var.q(8.0f);
                this.f32532z1 = f4Var;
                f4Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ci.f4 f4Var2 = this.f32532z1;
                f4Var2.h = ci.f4.a(f4Var2.getText(), this.f32532z1.getTextPaint());
                this.X0.addView(this.f32532z1, w7.x5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.X0.post(new l4(22, this, t1Var));
            }
        }
    }

    public final void uc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.uc():void");
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
        org.telegram.ui.Components.m9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f32281f, null, this.T5, this.f32489va, this.f32477ua);
    }

    public final void v7() {
        float f7 = this.f32502w9;
        zk zkVar = this.f32392o1;
        if (zkVar != null) {
            zkVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f32392o1.E;
        }
        lk lkVar = this.f32404p1;
        if (lkVar != null) {
            lkVar.setTranslationY(f7);
        }
        float z82 = (z8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.y21 y21Var = this.R1;
        org.telegram.ui.Components.u21 u21Var = org.telegram.ui.Components.u21.f28263a;
        if (y21Var != null) {
            y21Var.setSideMenuBackgroundMarginTop((z8() * V8(AndroidUtilities.dp(7.0f))) + z82);
            float W8 = W8(u21Var);
            float b10 = yf.e0.b(this.xc.e);
            float z83 = z8();
            z82 += yf.e0.b(Math.min(w7.p.a(yf.e0.b(b10), 0.0f, 1.0f), w7.p.a(yf.e0.b(z83), 0.0f, 1.0f))) * W8;
        }
        org.telegram.ui.Components.bh bhVar = this.M0;
        if (bhVar != null) {
            bhVar.setTranslationY((z82 - AndroidUtilities.dp(5.0f)) - (z8() * W8(u21Var)));
        }
    }

    public final TLRPC.ChatFull v8() {
        return this.Z7;
    }

    public final boolean v9() {
        if (!ChatObject.isForum(this.e) || this.f32310h4) {
            if (ChatObject.isMonoForum(this.e) && d() == 0 && !this.T3) {
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
        zg.p0 d = zg.p0.d(reactionCount.reaction);
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
                MessageObject messageObject3 = (MessageObject) this.f32397o6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f32418q3 != null) {
                kc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.f32418q3)) {
            MessageObject.GroupedMessages X8 = X8(messageObject2);
            if (X8 != null) {
                for (int i10 = 0; i10 < X8.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(X8.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            gg.o1 o1Var = this.M3;
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
                    uk ukVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ukVar, property, 0.1f);
                    uk ukVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ukVar2, property2, 0.1f);
                    uk ukVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ukVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
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
                this.H0.addListener(new ai.n(28, this, z10));
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
            uk ukVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ukVar4.setVisibility(i11);
            org.telegram.ui.Components.c90 c90Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            c90Var.setVisibility(i12);
            uk ukVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            ukVar5.setScaleX(f11);
            org.telegram.ui.Components.c90 c90Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            c90Var2.setScaleX(f12);
            uk ukVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            ukVar6.setScaleY(f13);
            org.telegram.ui.Components.c90 c90Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            c90Var3.setScaleY(f16);
            uk ukVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ukVar7.setAlpha(f14);
            org.telegram.ui.Components.c90 c90Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            c90Var4.setAlpha(f15);
        }
    }

    public final void vc() {
        boolean z10;
        boolean z11;
        if (this.f32332j1 == null) {
            return;
        }
        if (this.f32303g9 && !b9() && !this.Y.x0() && !this.Oa && (!this.f32445s3 || getMediaDataController().searchResultMessages.isEmpty())) {
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
            this.f32344k1 = false;
        } else {
            this.B7 = 0;
            this.f32336j6 = 0;
            z11 = true;
        }
        this.f32332j1.e(1, z10, z11);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
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
        SparseArray sparseArray = this.f32486v6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.i iVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f32473u6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.T5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f32397o6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j3 = this.e.f18121id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j3, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f32512x6.f(messageObject.getGroupId());
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
                        int indexOf2 = arrayList.indexOf((MessageObject) hg.k0.h(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            nm nmVar = this.A0;
                            if (!nmVar.N) {
                                nmVar.q(indexOf2 + nmVar.J, groupedMessages2.messages.size());
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
        return this.f32225a8;
    }

    public final boolean w9() {
        return UserObject.isBotForum(this.f32281f);
    }

    public final void wa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.wa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void wb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new nf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19101q7));
        }
    }

    public final void wc() {
        jh.h hVar = this.f32332j1;
        ph.i iVar = this.v;
        if (hVar != null) {
            this.f32332j1.setTranslationY((((-iVar.c()) - this.S.getInputBubbleHeight()) - W8(org.telegram.ui.Components.u21.f28265c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f32258d1 != null) {
            this.f32258d1.setTranslationY((-iVar.c()) - AndroidUtilities.dp(16.0f));
        }
    }

    public final void x6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.x6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void x7(boolean z10) {
        boolean z11;
        this.f32473u6.clear();
        this.f32434r6.clear();
        this.f32448s6.clear();
        this.f32312h6.clear();
        this.f32512x6.b();
        this.f32322i4 = false;
        nm nmVar = this.A0;
        if (nmVar != null) {
            if (nmVar.f36135w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Pb(z11);
        }
        vj vjVar = this.f32506x0;
        if (vjVar != null) {
            vjVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f32397o6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f32537z6;
            int[] iArr2 = this.f32524y6;
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
        this.f32474u7 = 0;
        this.f32462t7 = false;
        this.K6 = 0;
        this.J7 = null;
        this.D7 = 0;
        this.E7 = false;
        this.A7 = false;
        nm nmVar2 = this.A0;
        if (nmVar2 != null && !nmVar2.N) {
            nmVar2.O(false);
        }
    }

    public final ArrayList x8() {
        nm nmVar = this.A0;
        if (nmVar != null) {
            return nmVar.P;
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
        org.telegram.ui.Components.p01 p01Var;
        String hostAuthority;
        boolean z11;
        boolean z12 = false;
        try {
            hostAuthority = AndroidUtilities.getHostAuthority(str);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.h != null) {
            if (getMessagesController().secretWebpagePreview == 1) {
            }
            if (z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i10 == 0) {
                    nf.f.q(getParentActivity(), Uri.parse(str), true, true, K9(t1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f32289f8 == 0) {
                        z12 = true;
                    }
                    nf.f.q(parentActivity, parse, z12, true, K9(t1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f32289f8 == 0) {
                        z12 = true;
                    }
                    nf.f.q(parentActivity2, parse2, z12, true, K9(t1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.c5.r0(this, str, true, true, false, false, K9(t1Var, characterStyle), null, this.f32279ea);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.p51) && (p01Var = ((org.telegram.ui.Components.p51) characterStyle).f26936a) != null && (p01Var.f26908a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.c5.r0(this, str, true, true, true, z12, K9(t1Var, characterStyle), null, this.f32279ea);
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
        if (characterStyle instanceof org.telegram.ui.Components.p51) {
            z12 = true;
        }
        org.telegram.ui.Components.c5.r0(this, str, true, true, true, z12, K9(t1Var, characterStyle), null, this.f32279ea);
    }

    public final void xb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.e)) {
                    u60 u60Var = new u60(a());
                    u60Var.f32743l0 = this;
                    presentFragment(u60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.e)) {
                cd cdVar = new cd(a());
                cdVar.f32743l0 = this;
                presentFragment(cdVar);
                return;
            } else {
                return;
            }
        }
        this.f32241ba = new org.telegram.ui.Components.mp(this, this.f32279ea);
        this.f32506x0.setOnInterceptTouchListener(new m4.u0(21));
        jb(this.X0, false);
        showDialog(this.f32241ba, new lg(this, 0));
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
        if ((!F9() || this.f32310h4) && this.L2 != null) {
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
            if (!z12 && !this.Ab && !this.I2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z12 && !this.Ab && !this.I2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.Ab && !this.I2) {
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
                    this.M2.setInterpolator(org.telegram.ui.Components.qr.h);
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
            if (this.f32533z2 != null) {
                if (F9() && !this.f32310h4) {
                    this.f32533z2.c(0, 1, false);
                } else {
                    this.f32533z2.c((this.H4.size() - 1) - Collections.binarySearch(this.H4, Integer.valueOf(this.L4), Comparator$CC.reverseOrder()), this.H4.size(), z11);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qv0 y() {
        return this.X0;
    }

    public final void y6() {
        this.f32299g5 = null;
        if (this.f32261d4 == 0 || this.f32310h4) {
            if (this.f32310h4) {
                this.f32385n5 = this.X3;
            } else {
                this.f32385n5 = null;
            }
            this.f32359l5 = null;
            nk nkVar = this.Y;
            if (nkVar != null) {
                nkVar.l1(null, null, null);
            }
        }
        e9(false);
        if (this.R3 == 0) {
            getMediaDataController().cleanDraft(this.T5, this.f32261d4, true);
        }
    }

    public final void y7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f32537z6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.H6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                hg.k0.p(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.D7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.E6[0] = false;
            this.F6 = false;
            nm nmVar = this.A0;
            if (nmVar != null && nmVar.F < 0) {
                nmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f32336j6 = i12;
            this.f32360l6 = dialog2.unread_mentions_count;
            if (this.f32349k6 != i12) {
                jh.h hVar = this.f32332j1;
                if (hVar != null) {
                    hVar.c(1, i12, this.N5);
                }
                this.f32349k6 = this.f32336j6;
                vc();
            }
            int i13 = this.f32360l6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f32360l6 = i14;
                if (i14 <= 0) {
                    this.f32360l6 = 0;
                    this.f32372m6 = true;
                    Kb(false);
                } else {
                    jh.h hVar2 = this.f32332j1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Kb(true);
                }
            }
            a7(false);
            return;
        }
        this.f32473u6.clear();
        this.f32312h6.clear();
        this.f32434r6.clear();
        this.f32448s6.clear();
        this.f32512x6.b();
        this.f32322i4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f32397o6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f32524y6;
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
        if (this.f32362l8 != null) {
            this.f32362l8 = null;
            nk nkVar = this.Y;
            if (nkVar != null) {
                nkVar.Z0(null, true, false);
            }
        }
        if (this.P != null) {
            Pb(false);
            G7(false);
            this.f32506x0.setEmptyView(this.Q0);
        }
        nm nmVar2 = this.A0;
        if (nmVar2 != null) {
            nmVar2.O(false);
        }
        if (this.h == null && (user = this.f32281f) != null && user.bot && this.f32277e8 == null) {
            this.f32277e8 = "";
            hc(false);
        }
    }

    public final MessageObject.GroupedMessages y8(long j3) {
        return (MessageObject.GroupedMessages) this.f32512x6.f(j3);
    }

    public final boolean y9() {
        if (this.e != null) {
            return getMessagesController().isChatNoForwards(this.e);
        }
        return getMessagesController().isUserNoForwards(this.f32225a8);
    }

    public final void ya(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.ya(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void yb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.rn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.yb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.rn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void yc(int r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.yc(int, boolean):void");
    }

    @Override
    public final List z() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.e)) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f32217a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new mg.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new wg(this, 15)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new wg(this, 16)));
        }
        if (this.f32281f == null) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new s0("", 1)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.c2(this)));
        }
        return arrayList;
    }

    public final void z6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32279ea);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        c2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(c2Var);
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
        bo boVar = this.f32267da;
        if (boVar == null) {
            boVar = this;
        }
        lk lkVar = boVar.f32404p1;
        if (lkVar == null) {
            return 0.0f;
        }
        return lkVar.f28173b;
    }

    public final boolean z9() {
        int i10 = this.R3;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void za(java.util.ArrayList r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.za(java.util.ArrayList, boolean):void");
    }

    public final void zb(boolean z10, MessageObject messageObject, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        yb(z10, messageObject, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void zc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f32310h4 && !this.J4.isEmpty() && this.H4.size() == 1 && ((Integer) this.H4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.J4.get(this.H4.get(0));
        } else {
            messageObject = null;
        }
        this.Y3 = messageObject;
        if (this.f32310h4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f32249c4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.e, this.Y3.messageOwner.from_id)) {
            this.Y3 = null;
        }
    }

    @Override
    public final void O() {
    }

    public void V9(boolean z10) {
    }
}
