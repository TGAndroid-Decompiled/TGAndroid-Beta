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
import android.os.SystemClock;
import android.os.Vibrator;
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
import java.io.File;
import java.net.URLDecoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.messenger.DocumentObject;
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
import org.telegram.tgnet.tl.TL_wallet;
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
public class eo extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, py, dd0, org.telegram.ui.Components.lk, org.telegram.ui.Components.gh, mg.b, org.telegram.ui.Components.j60, me.d {
    public static int Hc = 22;
    public static float Ic = 1.4f;
    public static int Jc = 10;
    public static Pattern Kc;
    public static Pattern Lc;
    public static Pattern Mc;
    public static final int[] Nc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Oc = false;
    public static final Rect Pc = new Rect();
    public qm A0;
    public ci.d4 A1;
    public boolean A2;
    public org.telegram.ui.Components.sc A3;
    public int A4;
    public int A5;
    public final int[] A6;
    public boolean A7;
    public final ah.c A8;
    public float A9;
    public int Aa;
    public of.e Ab;
    public final me.b Ac;
    public yk B0;
    public cm B1;
    public final org.telegram.ui.Components.y9[] B2;
    public boolean B3;
    public int B4;
    public boolean B5;
    public final int[] B6;
    public int B7;
    public Bitmap B8;
    public TLRPC.Document B9;
    public int Ba;
    public boolean Bb;
    public final j6.l Bc;
    public boolean C0;
    public float C1;
    public final co[] C2;
    public int C3;
    public vf C4;
    public TLRPC.PhotoSize C5;
    public final boolean[] C6;
    public int C7;
    public BitmapShader C8;
    public boolean C9;
    public ChatMessageSharedResources Ca;
    public qe Cb;
    public qh.c Cc;
    public org.telegram.ui.Components.ia0 D0;
    public TL_stories.TL_premium_boostsStatus D1;
    public final org.telegram.ui.ActionBar.h5[] D2;
    public boolean D3;
    public boolean D4;
    public TLRPC.PhotoSize D5;
    public final boolean[] D6;
    public int D7;
    public Paint D8;
    public boolean D9;
    public ValueAnimator Da;
    public boolean Db;
    public yf.b0 Dc;
    public final qe.b E;
    public TextView E0;
    public ChannelBoostsController.CanApplyBoost E1;
    public final ai.q4[] E2;
    public FlagSecureReason E3;
    public boolean E4;
    public TLObject E5;
    public final boolean[] E6;
    public boolean E7;
    public Matrix E8;
    public long E9;
    public float Ea;
    public boolean Eb;
    public final ArrayList Ec;
    public final ah.h F;
    public xk F0;
    public boolean F1;
    public NumberTextView F2;
    public boolean F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public boolean F7;
    public Paint F8;
    public int F9;
    public nl Fa;
    public final RectF Fb;
    public final ArrayList Fc;
    public final int G;
    public RadialProgressView G0;
    public qe G1;
    public int G2;
    public MessageObject G3;
    public int G4;
    public TLRPC.WebPage G5;
    public boolean G6;
    public boolean G7;
    public final Paint G8;
    public int G9;
    public final xl Ga;
    public org.telegram.ui.ActionBar.a2 Gb;
    public final Rect Gc;
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
    public final em Ha;
    public long Hb;
    public final fh.d I;
    public boolean I0;
    public kk I1;
    public boolean I2;
    public MessageObject I3;
    public int I4;
    public String I5;
    public boolean I6;
    public boolean I7;
    public boolean I8;
    public int I9;
    public ArrayList Ia;
    public final wg Ib;
    public final ah.c J;
    public ci.d4 J0;
    public ai.h4 J1;
    public ImageView J2;
    public MessageObject J3;
    public HashMap J4;
    public i9.s J5;
    public int J6;
    public MessageObject J7;
    public View J8;
    public boolean J9;
    public final oi Ja;
    public int Jb;
    public final ah.c K;
    public ci.d4 K0;
    public org.telegram.ui.ActionBar.p0 K1;
    public RadialProgressView K2;
    public ai.f0 K3;
    public final SparseArray K4;
    public TLRPC.ChatInvite K5;
    public int K6;
    public MessageObject K7;
    public float K8;
    public boolean K9;
    public final ti Ka;
    public boolean Kb;
    public final fh.e L;
    public ci.d4 L0;
    public TextView L1;
    public ImageView L2;
    public ai.w0 L3;
    public int L4;
    public qe L5;
    public long L6;
    public int L7;
    public float L8;
    public boolean L9;
    public final mj La;
    public Pattern Lb;
    public final ah.c M;
    public org.telegram.ui.Components.hh M0;
    public boolean M1;
    public AnimatorSet M2;
    public gg.n1 M3;
    public final int[] M4;
    public final LongSparseIntArray M5;
    public boolean M6;
    public boolean M7;
    public Integer M8;
    public org.telegram.ui.Components.zi M9;
    public final qn Ma;
    public MessageObject Mb;
    public org.telegram.ui.ActionBar.a2 N;
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
    public final vf Na;
    public pf Nb;
    public boolean O;
    public wk O0;
    public TextView O1;
    public al O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ArrayList O6;
    public long O7;
    public boolean O8;
    public float O9;
    public final vf Oa;
    public ArrayList Ob;
    public FrameLayout P;
    public jh.c P0;
    public el P1;
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
    public ci.r6 Q;
    public FrameLayout Q0;
    public TextView Q1;
    public TextView Q2;
    public String Q3;
    public int Q4;
    public boolean Q5;
    public final Paint Q6;
    public Integer Q7;
    public org.telegram.ui.ActionBar.m1 Q8;
    public Animator Q9;
    public boolean Qa;
    public final hh.a Qb;
    public vk R;
    public LinearLayout R0;
    public org.telegram.ui.Components.h41 R1;
    public vk R2;
    public int R3;
    public boolean R4;
    public boolean R5;
    public final ColorMatrix R6;
    public byte[] R7;
    public boolean R8;
    public boolean R9;
    public long Ra;
    public boolean Rb;
    public hh.f S;
    public org.telegram.ui.Components.bp S0;
    public hg.f S1;
    public ImageView S2;
    public int S3;
    public boolean S4;
    public boolean S5;
    public final m.d3 S6;
    public int S7;
    public org.telegram.ui.ActionBar.e1[] S8;
    public boolean S9;
    public NotificationCenter.ObserversGroup Sa;
    public boolean Sb;
    public View T;
    public yi T0;
    public org.telegram.ui.Components.ia0 T1;
    public ImageView T2;
    public boolean T3;
    public AnimatorSet T4;
    public long T5;
    public final org.telegram.ui.ActionBar.d5 T6;
    public int T7;
    public org.telegram.ui.ActionBar.e1 T8;
    public eo T9;
    public boolean Ta;
    public boolean Tb;
    public FrameLayout U;
    public hg.d2 U0;
    public ImageView U1;
    public org.telegram.ui.Components.r6 U2;
    public String U3;
    public final SparseIntArray U4;
    public Long U5;
    public long U6;
    public qe U7;
    public final qk U8;
    public float U9;
    public int Ua;
    public long Ub;
    public FrameLayout V;
    public hg.a0 V0;
    public ei.n V1;
    public org.telegram.ui.Components.r6 V2;
    public byte[] V3;
    public final SparseIntArray V4;
    public int V5;
    public int V6;
    public String V7;
    public rm V8;
    public AnimatorSet V9;
    public int Va;
    public boolean Vb;
    public final hh.k W;
    public hh.j W0;
    public TextView W1;
    public org.telegram.ui.Components.r6 W2;
    public String W3;
    public boolean W4;
    public final SparseArray[] W5;
    public int W6;
    public ChatObject.Call W7;
    public zk W8;
    public final al W9;
    public boolean Wa;
    public boolean Wb;
    public jh.f X;
    public wm X0;
    public mk X1;
    public jk X2;
    public MessageObject X3;
    public boolean X4;
    public final SparseArray[] X5;
    public final Matrix X6;
    public boolean X7;
    public int X8;
    public uh.i X9;
    public boolean Xa;
    public boolean Xb;
    public sk Y;
    public org.telegram.ui.Components.xo Y0;
    public FrameLayout Y1;
    public ik Y2;
    public MessageObject Y3;
    public boolean Y4;
    public final SparseArray[] Y5;
    public LinearGradient Y6;
    public boolean Y7;
    public int Y8;
    public zg.t Y9;
    public a0.i Ya;
    public boolean Yb;
    public tk Z;
    public final ArrayList Z0;
    public mk Z1;
    public org.telegram.ui.Cells.w0 Z2;
    public boolean Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public TLRPC.ChatFull Z7;
    public int Z8;
    public n51 Z9;
    public a0.i Za;
    public b9 Zb;
    public int f37188a;
    public ai.f0 f37189a0;
    public uj f37190a1;
    public FrameLayout a2;
    public int f37191a3;
    public ArrayList f37192a4;
    public boolean f37193a5;
    public int f37194a6;
    public int f37195a7;
    public TLRPC.UserFull f37196a8;
    public boolean f37197a9;
    public boolean f37198aa;
    public long f37199ab;
    public int f37200ac;
    public boolean f37201b;
    public int f37202b0;
    public org.telegram.ui.Components.r6 f37203b1;
    public TextView f37204b2;
    public org.telegram.ui.Components.b70 f37205b3;
    public MessageObject f37206b4;
    public boolean f37207b5;
    public int f37208b6;
    public final Paint f37209b7;
    public org.telegram.ui.Cells.g6 f37210b8;
    public boolean f37211b9;
    public org.telegram.ui.Components.eq f37212ba;
    public il f37213bb;
    public ValueAnimator f37214bc;
    public boolean f37215c;
    public org.telegram.ui.ActionBar.s0 f37216c0;
    public sh f37217c1;
    public org.telegram.ui.Components.m10 f37218c2;
    public View f37219c3;
    public TLRPC.TL_forumTopic f37220c4;
    public MessageObject f37221c5;
    public int f37222c6;
    public final Matrix f37223c7;
    public o11 f37224c8;
    public xm f37225c9;
    public bo f37226ca;
    public boolean cb;
    public aj f37227cc;
    public boolean d;
    public is f37228d0;
    public org.telegram.ui.Components.uz0 f37229d1;
    public org.telegram.ui.Components.gy0 f37230d2;
    public boolean f37231d3;
    public long f37232d4;
    public MessageObject f37233d5;
    public int f37234d6;
    public LinearGradient f37235d7;
    public final a0.i f37236d8;
    public View f37237d9;
    public eo f37238da;
    public boolean f37239db;
    public boolean f37240dc;
    public TLRPC.Chat f37241e;
    public org.telegram.ui.ActionBar.x f37242e0;
    public org.telegram.ui.ActionBar.s0 f37243e1;
    public org.telegram.ui.Components.c50 f37244e2;
    public boolean f37245e3;
    public int f37246e4;
    public MessageObject.GroupedMessages f37247e5;
    public int f37248e6;
    public boolean e7;
    public String f37249e8;
    public boolean f37250e9;
    public bo f37251ea;
    public boolean f37252eb;
    public int ec;
    public TLRPC.User f37253f;
    public org.telegram.ui.ActionBar.s0 f37254f0;
    public org.telegram.ui.ActionBar.s0 f37255f1;
    public org.telegram.ui.Components.c50 f37256f2;
    public boolean f37257f3;
    public TLRPC.Chat f37258f4;
    public MessagePreviewParams f37259f5;
    public int f37260f6;
    public boolean f7;
    public long f37261f8;
    public boolean f37262f9;
    public wh.d f37263fa;
    public ArrayList f37264fb;
    public int f37265fc;
    public org.telegram.ui.ActionBar.s0 f37266g0;
    public org.telegram.ui.ActionBar.s0 f37267g1;
    public nj f37268g2;
    public AnimatorSet f37269g3;
    public boolean f37270g4;
    public MessageSuggestionParams f37271g5;
    public int f37272g6;
    public int f37273g7;
    public String f37274g8;
    public boolean f37275g9;
    public final ChatMessagesMetadataController ga;
    public ValueAnimator f37276gb;
    public int gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f37277h0;
    public org.telegram.ui.ActionBar.s0 f37278h1;
    public boolean f37279h2;
    public ValueAnimator f37280h3;
    public boolean f37281h4;
    public MessageObject f37282h5;
    public final ArrayList f37283h6;
    public boolean f37284h7;
    public boolean f37285h8;
    public vl f37286h9;
    public TLRPC.TL_channels_sendAsPeers ha;
    public boolean f37287hb;
    public int f37288hc;
    public org.telegram.ui.ActionBar.x f37289i0;
    public org.telegram.ui.Components.hp f37290i1;
    public org.telegram.ui.Components.c50 f37291i2;
    public float f37292i3;
    public boolean f37293i4;
    public MessageObject.GroupedMessages f37294i5;
    public boolean f37295i6;
    public boolean f37296i7;
    public boolean f37297i8;
    public boolean f37298i9;
    public TL_account.resolvedBusinessChatLinks f37299ia;
    public Boolean f37300ib;
    public int f37301ic;
    public org.telegram.ui.ActionBar.u0 f37302j0;
    public jh.h f37303j1;
    public boolean f37304j2;
    public boolean j3;
    public boolean f37305j4;
    public MessageObject.GroupedMessages f37306j5;
    public int f37307j6;
    public int f37308j7;
    public String f37309j8;
    public float f37310j9;
    public boolean f37311ja;
    public boolean f37312jb;
    public boolean f37313jc;
    public org.telegram.ui.ActionBar.u0 f37314k0;
    public boolean f37315k1;
    public org.telegram.ui.Components.c50 f37316k2;
    public boolean f37317k3;
    public int f37318k4;
    public MessageObject f37319k5;
    public int f37320k6;
    public boolean f37321k7;
    public String f37322k8;
    public lk f37323k9;
    public boolean f37324ka;
    public boolean f37325kb;
    public long f37326kc;
    public org.telegram.ui.ActionBar.s0 f37327l0;
    public int l1;
    public org.telegram.ui.Components.c50 f37328l2;
    public boolean f37329l3;
    public int l4;
    public tn f37330l5;
    public int f37331l6;
    public boolean f37332l7;
    public MessageObject f37333l8;
    public org.telegram.ui.Cells.u1 f37334l9;
    public float f37335la;
    public int f37336lb;
    public TLRPC.TL_messages_discussionMessage f37337lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public int f37338m1;
    public org.telegram.ui.Components.c50 f37339m2;
    public boolean f37340m3;
    public int f37341m4;
    public boolean f37342m5;
    public boolean f37343m6;
    public boolean f37344m7;
    public MessageObject f37345m8;
    public org.telegram.ui.Components.k10 f37346m9;
    public final tg f37347ma;
    public HashMap f37348mb;
    public TLRPC.messages_Messages f37349mc;
    public boolean f37350n;
    public org.telegram.ui.ActionBar.x f37351n0;
    public org.telegram.ui.Components.sc f37352n1;
    public org.telegram.ui.Components.c50 f37353n2;
    public boolean f37354n3;
    public di f37355n4;
    public MessageObject f37356n5;
    public final ArrayList f37357n6;
    public int f37358n7;
    public int f37359n8;
    public boolean f37360n9;
    public final jl f37361na;
    public vf nb;
    public boolean nc;
    public boolean f37362o0;
    public dl f37363o1;
    public org.telegram.ui.Components.c50 f37364o2;
    public TLRPC.User f37365o3;
    public final SparseArray f37366o4;
    public int f37367o5;
    public final SparseArray[] f37368o6;
    public int f37369o7;
    public boolean f37370o8;
    public boolean o9;
    public int f37371oa;
    public int f37372ob;
    public vn f37373oc;
    public RadialProgressView f37374p0;
    public pk f37375p1;
    public org.telegram.ui.Cells.u1 f37376p2;
    public TLRPC.Chat f37377p3;
    public final ArrayList f37378p4;
    public MessageObject p5;
    public final SparseArray f37379p6;
    public boolean f37380p7;
    public long f37381p8;
    public ValueAnimator f37382p9;
    public int f37383pa;
    public org.telegram.ui.ActionBar.a2 f37384pb;
    public pn f37385pc;
    public org.telegram.ui.ActionBar.s0 f37386q0;
    public ci.h1 f37387q1;
    public int f37388q2;
    public zg.n0 f37389q3;
    public int f37390q4;
    public boolean f37391q5;
    public final SparseArray q6;
    public vf f37392q7;
    public long f37393q8;
    public ValueAnimator f37394q9;
    public vf f37395qa;
    public int f37396qb;
    public yh.w3 f37397qc;
    public long f37398r;
    public org.telegram.ui.ActionBar.s0 f37399r0;
    public int f37400r1;
    public int f37401r2;
    public boolean f37402r3;
    public boolean f37403r4;
    public boolean f37404r5;
    public final HashMap f37405r6;
    public String f37406r7;
    public boolean f37407r8;
    public boolean f37408r9;
    public boolean f37409ra;
    public int f37410rb;
    public boolean f37411rc;
    public final HashMap f37412s;
    public org.telegram.ui.ActionBar.s0 f37413s0;
    public boolean f37414s1;
    public org.telegram.ui.Components.c50 f37415s2;
    public boolean f37416s3;
    public boolean f37417s4;
    public boolean f37418s5;
    public final SparseArray f37419s6;
    public boolean f37420s7;
    public String f37421s8;
    public float f37422s9;
    public boolean f37423sa;
    public boolean f37424sb;
    public float f37425sc;
    public org.telegram.ui.ActionBar.s0 f37426t0;
    public org.telegram.ui.Components.x40 f37427t1;
    public org.telegram.ui.Components.c50 f37428t2;
    public String f37429t3;
    public int f37430t4;
    public boolean f37431t5;
    public final a0.i f37432t6;
    public boolean f37433t7;
    public vk f37434t8;
    public float f37435t9;
    public long ta;
    public int f37436tb;
    public float f37437tc;
    public ClippingImageView f37438u0;
    public org.telegram.ui.ActionBar.a2 f37439u1;
    public org.telegram.ui.Components.c50 f37440u2;
    public String f37441u3;
    public final ArrayList f37442u4;
    public int f37443u5;
    public final ArrayList f37444u6;
    public int f37445u7;
    public org.telegram.ui.Cells.u1 f37446u8;
    public int f37447u9;
    public int f37448ua;
    public boolean f37449ub;
    public final me.b f37450uc;
    public final vj v;
    public org.telegram.ui.Components.i21 f37451v0;
    public ci.d4 f37452v1;
    public org.telegram.ui.Components.iq f37453v2;
    public int f37454v3;
    public final HashMap f37455v4;
    public int f37456v5;
    public final SparseArray f37457v6;
    public int f37458v7;
    public l4 f37459v8;
    public int v9;
    public int f37460va;
    public int f37461vb;
    public final me.b f37462vc;
    public oj f37463w;
    public hh.g f37464w0;
    public ci.d4 f37465w1;
    public View f37466w2;
    public int f37467w3;
    public MessageObject f37468w4;
    public TLRPC.PhotoSize f37469w5;
    public final a0.i f37470w6;
    public int f37471w7;
    public TextureView f37472w8;
    public float f37473w9;
    public bl f37474wa;
    public int f37475wb;
    public final me.b f37476wc;
    public oj f37477x;
    public ak f37478x0;
    public ci.d4 f37479x1;
    public pl f37480x2;
    public int f37481x3;
    public int f37482x4;
    public TLRPC.PhotoSize f37483x5;
    public final a0.i f37484x6;
    public int f37485x7;
    public boolean f37486x8;
    public float f37487x9;
    public cl f37488xa;
    public int f37489xb;
    public final me.b xc;
    public final qe.b f37490y;
    public ck f37491y0;
    public ci.d4 f37492y1;
    public ci.r6 f37493y2;
    public UndoView y3;
    public int f37494y4;
    public TLObject f37495y5;
    public final int[] f37496y6;
    public int f37497y7;
    public final vf f37498y8;
    public float f37499y9;
    public boolean f37500ya;
    public CharacterStyle f37501yb;
    public final me.b yc;
    public dk f37502z0;
    public ci.d4 f37503z1;
    public org.telegram.ui.Components.ah0 f37504z2;
    public ol f37505z3;
    public final ArrayList f37506z4;
    public int f37507z5;
    public final int[] f37508z6;
    public int f37509z7;
    public final fh.b f37510z8;
    public float f37511z9;
    public float f37512za;
    public String f37513zb;
    public final me.b f37514zc;

    public eo(Bundle bundle) {
        super(bundle);
        this.f37188a = 0;
        this.f37215c = false;
        this.d = false;
        this.f37412s = new HashMap();
        this.v = new vj(this, new vf(this, 21));
        qe.b bVar = new qe.b();
        this.f37490y = bVar;
        qe.b bVar2 = new qe.b();
        this.E = bVar2;
        this.W = new hh.k();
        this.Z0 = new ArrayList();
        this.B2 = new org.telegram.ui.Components.y9[2];
        this.C2 = new co[2];
        this.D2 = new org.telegram.ui.ActionBar.h5[2];
        this.E2 = new ai.q4[2];
        this.H2 = new AnimatorSet[2];
        this.I2 = false;
        this.f37191a3 = 500;
        this.P3 = null;
        this.S3 = -1;
        this.Z3 = true;
        this.f37366o4 = new SparseArray();
        this.f37378p4 = new ArrayList();
        this.f37442u4 = new ArrayList();
        this.f37455v4 = new HashMap();
        this.f37482x4 = -1;
        this.f37494y4 = 0;
        this.f37506z4 = new ArrayList(10);
        this.H4 = new ArrayList();
        this.J4 = new HashMap();
        this.K4 = new SparseArray();
        this.M4 = new int[1];
        this.U4 = new SparseIntArray();
        this.V4 = new SparseIntArray();
        this.Z4 = true;
        this.f37207b5 = true;
        this.f37391q5 = true;
        this.f37431t5 = true;
        this.M5 = new LongSparseIntArray();
        this.V5 = 1;
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f37283h6 = new ArrayList();
        this.f37295i6 = true;
        this.f37320k6 = Integer.MIN_VALUE;
        this.f37357n6 = new ArrayList();
        this.f37368o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f37379p6 = new SparseArray();
        this.q6 = new SparseArray();
        this.f37405r6 = new HashMap();
        this.f37419s6 = new SparseArray();
        this.f37432t6 = new a0.i();
        this.f37444u6 = new ArrayList();
        this.f37457v6 = new SparseArray();
        this.f37470w6 = new a0.i();
        this.f37484x6 = new a0.i();
        this.f37496y6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f37508z6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
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
        this.S6 = new m.d3();
        this.T6 = new org.telegram.ui.ActionBar.d5(0, false, false, new wj(this));
        this.X6 = new Matrix();
        Paint paint = new Paint(1);
        this.f37209b7 = paint;
        this.f37223c7 = new Matrix();
        this.f37358n7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f37485x7 = Integer.MAX_VALUE;
        this.f37497y7 = -1;
        this.G7 = true;
        this.L7 = Integer.MAX_VALUE;
        this.S7 = -1;
        this.T7 = -10000;
        this.f37236d8 = new a0.i();
        this.f37498y8 = new vf(this, 24);
        fh.b bVar3 = new fh.b();
        this.f37510z8 = bVar3;
        ah.c cVar = new ah.c(bVar3);
        this.A8 = cVar;
        this.G8 = new Paint(1);
        this.H8 = 0.0f;
        this.K8 = 1.0f;
        this.L8 = 0.0f;
        this.R8 = true;
        this.U8 = new qk(this);
        this.f37360n9 = true;
        this.W9 = new al(this, 0);
        this.ga = new ChatMessagesMetadataController(this);
        this.f37347ma = new tg(this, 0);
        this.f37361na = new jl(this);
        this.f37383pa = -1;
        this.Ga = new xl(this);
        this.Ha = new em(this);
        this.Ja = new oi(this);
        this.Ka = new ti(this);
        this.La = new mj(this);
        this.Ma = new qn(this);
        this.Na = new vf(this, 27);
        this.Oa = new vf(this, 29);
        this.f37239db = false;
        this.Fb = new RectF();
        this.Ib = new wg(this, 1);
        this.Pb = new BotForumHelper.BotDraftAnimationsPool();
        this.Qb = new Object();
        this.f37240dc = false;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        this.f37450uc = new me.b(0, this, jsVar, 320L, false);
        this.f37462vc = new me.b(1, this, jsVar, 520L, false);
        this.f37476wc = new me.b(2, this, jsVar, 520L, false);
        this.xc = new me.b(3, this, jsVar, 320L, false);
        this.yc = new me.b(4, this, jsVar, 320L, false);
        this.f37514zc = new me.b(5, this, jsVar, 320L, false);
        this.Ac = new me.b(6, this, jsVar, 320L, false);
        wg wgVar = new wg(this, 6);
        ?? obj = new Object();
        obj.f14059b = new float[32];
        obj.f14058a = 1;
        obj.d = new me.l(obj, le.a.f15247a, 240L);
        obj.f14060c = wgVar;
        this.Bc = obj;
        this.Ec = new ArrayList();
        this.Fc = new ArrayList();
        this.Gc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.F = hVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            fh.d dVar = new fh.d(obj2);
            this.I = dVar;
            dVar.v = new wg(this, 8);
            dVar.d = hVar;
            dVar.f9935e = -3;
            dVar.f9936f = obj2;
            ah.c cVar2 = new ah.c(dVar);
            this.K = cVar2;
            cVar2.f549i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj2);
                this.H = dVar2;
                dVar2.v = new wg(this, 8);
                dVar2.d = hVar;
                dVar2.f9935e = -2;
                dVar2.f9936f = obj2;
                ah.c cVar3 = new ah.c(dVar2);
                this.J = cVar3;
                cVar3.f549i = LiteMode.isEnabled(262144);
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
        cVar4.f546e = bVar;
        this.J.f546e = bVar;
        this.K.f546e = bVar;
        cVar.f546e = new qe.b();
        cVar4.d = bVar2;
        this.J.d = bVar2;
        this.K.d = bVar2;
        cVar.d = bVar2;
    }

    public static void A0(eo eoVar, MessageObject messageObject, Long l4, Runnable runnable) {
        yh.n5.y(eoVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void A1(eo eoVar, zf.a aVar, Runnable runnable) {
        if (!eoVar.isFinished) {
            if (zf.a.m(yh.n5.x(eoVar.currentAccount, aVar.f54665a).p()).f54666b < aVar.f54666b) {
                zf.b bVar = aVar.f54665a;
                if (bVar == zf.b.f54667a) {
                    new yh.e7(eoVar.getParentActivity(), eoVar.getResourceProvider(), aVar.a(), 13, ng.d.h(eoVar.currentAccount, eoVar.a()), null, eoVar.a()).show();
                    return;
                } else if (bVar == zf.b.f54668b) {
                    new di.h(eoVar.getParentActivity(), eoVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void B0(eo eoVar) {
        org.telegram.ui.Components.d50.h.a();
        eoVar.showDialog(new xh.q1(eoVar.getParentActivity(), eoVar.currentAccount, eoVar.a(), null, null));
    }

    public static void C0(org.telegram.ui.eo r19, org.telegram.ui.uk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.C0(org.telegram.ui.eo, org.telegram.ui.uk, boolean[]):void");
    }

    public static void C1(eo eoVar) {
        SparseArray[] sparseArrayArr = eoVar.W5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) eoVar.f37368o6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            eoVar.X5[i10].clear();
            eoVar.Y5[i10].clear();
        }
        if (eoVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(eoVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(eoVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                eoVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        eoVar.h9();
        eoVar.Cc(0, true);
        eoVar.ad(false);
        eoVar.Pc();
    }

    public static void D0(eo eoVar, TLRPC.Document document) {
        eoVar.f37455v4.put(document, 0);
        SendMessagesHelper.getInstance(eoVar.currentAccount).sendSticker(document, null, eoVar.T5, null, null, null, eoVar.f37330l5, null, true, 0, 0, false, null, eoVar.H8(), 0L, eoVar.S8(), eoVar.f37271g5);
    }

    public static void E0(eo eoVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(eoVar.currentAccount).getInputUser(user.f19949id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(eoVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new uh(eoVar, tL_attachMenuBot, user, 1), 66);
    }

    public static org.telegram.ui.gv0 E1(org.telegram.ui.eo r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.E1(org.telegram.ui.eo, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gv0");
    }

    public static void F0(eo eoVar, long j3, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(eoVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.j11.c(eoVar.getParentActivity(), eoVar.currentAccount, -j3, eoVar.getUserConfig().getCurrentUser(), null, z10, z11, eoVar.getResourceProvider());
    }

    public static TLRPC.TL_message F7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19823id = message.f19823id;
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

    public static void G0(eo eoVar) {
        long j3;
        ArrayList arrayList = eoVar.f37283h6;
        arrayList.add(Integer.valueOf(eoVar.V5));
        if (eoVar.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(eoVar.currentAccount);
            String str = eoVar.f37441u3;
            int i10 = eoVar.classGuid;
            int i11 = eoVar.O3;
            int i12 = eoVar.V5;
            eoVar.V5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (eoVar.f37471w7 != 0) {
            MessagesController messagesController = eoVar.getMessagesController();
            long j10 = eoVar.T5;
            long j11 = eoVar.L6;
            int i13 = eoVar.f37471w7;
            int i14 = eoVar.classGuid;
            int i15 = eoVar.R3;
            long j12 = eoVar.f37232d4;
            int i16 = eoVar.f37341m4;
            int i17 = eoVar.V5;
            eoVar.V5 = i17 + 1;
            messagesController.loadMessages(j10, j11, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j12, i16, i17, eoVar.f37281h4);
        } else if (eoVar.f37445u7 != 0 && (!eoVar.K9() || eoVar.f37445u7 == eoVar.L7 || eoVar.f37281h4)) {
            int i18 = eoVar.f37308j7;
            if (i18 != 0) {
                eoVar.L6 = i18;
                MessagesController messagesController2 = eoVar.getMessagesController();
                long j13 = eoVar.L6;
                boolean z10 = eoVar.f37284h7;
                int i19 = eoVar.f37273g7;
                int i20 = eoVar.f37445u7;
                int i21 = eoVar.classGuid;
                int i22 = eoVar.R3;
                long j14 = eoVar.f37232d4;
                int i23 = eoVar.f37341m4;
                int i24 = eoVar.V5;
                eoVar.V5 = i24 + 1;
                messagesController2.loadMessages(j13, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j14, i23, i24, eoVar.f37281h4);
            } else {
                MessagesController messagesController3 = eoVar.getMessagesController();
                long j15 = eoVar.T5;
                long j16 = eoVar.L6;
                boolean z11 = eoVar.f37284h7;
                int i25 = eoVar.f37273g7;
                int i26 = eoVar.f37445u7;
                int i27 = eoVar.classGuid;
                int i28 = eoVar.R3;
                long j17 = eoVar.f37232d4;
                int i29 = eoVar.f37341m4;
                int i30 = eoVar.V5;
                eoVar.V5 = i30 + 1;
                messagesController3.loadMessages(j15, j16, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j17, i29, i30, eoVar.f37281h4);
            }
        } else if (eoVar.f37296i7) {
            eoVar.V5++;
        } else {
            MessagesController messagesController4 = eoVar.getMessagesController();
            long j18 = eoVar.T5;
            long j19 = eoVar.L6;
            boolean z12 = eoVar.f37284h7;
            int i31 = eoVar.f37273g7;
            int i32 = eoVar.f37445u7;
            int i33 = eoVar.classGuid;
            int i34 = eoVar.R3;
            long j20 = eoVar.f37232d4;
            int i35 = eoVar.f37341m4;
            int i36 = eoVar.V5;
            eoVar.V5 = i36 + 1;
            messagesController4.loadMessages(j18, j19, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j20, i35, i36, eoVar.f37281h4);
        }
        int i37 = eoVar.R3;
        if (i37 == 0 || (i37 == 3 && eoVar.N8() == eoVar.getUserConfig().getClientUserId())) {
            if (eoVar.K9() && !eoVar.f37281h4) {
                return;
            }
            arrayList.add(Integer.valueOf(eoVar.V5));
            MessagesController messagesController5 = eoVar.getMessagesController();
            long j21 = eoVar.T5;
            long j22 = eoVar.L6;
            int i38 = eoVar.classGuid;
            if (eoVar.R3 == 3) {
                j3 = 0;
            } else {
                j3 = eoVar.f37232d4;
            }
            long j23 = j3;
            int i39 = eoVar.f37341m4;
            int i40 = eoVar.V5;
            eoVar.V5 = i40 + 1;
            messagesController5.loadMessages(j21, j22, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j23, i39, i40, eoVar.f37281h4);
        }
    }

    public static CharSequence G8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.o41.k(messageObject)) {
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

    public static void H0(eo eoVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(eoVar.currentAccount).edit().putLong("dialog_join_requested_time_" + eoVar.T5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(eoVar.f37241e) && !eoVar.f37241e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.m90.f28448r;
            org.telegram.ui.Components.m90.y(context, eoVar, org.telegram.ui.Components.zc.a0(eoVar), z10);
        }
        eoVar.zb(false, true);
    }

    public static void I0(eo eoVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, o6 o6Var) {
        try {
            a0.i iVar = new a0.i();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f19823id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(eoVar.currentAccount, tL_message, false, false));
            iVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            eoVar.getMessagesController().getStoriesController().f1412k.d(iVar, new nh(5, iVar, o6Var), eoVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void I1(eo eoVar) {
        int i10;
        if (eoVar.a() == eoVar.getUserConfig().getClientUserId() && eoVar.getUserConfig().isPremium() && eoVar.f37213bb == null) {
            il ilVar = new il(eoVar, eoVar, eoVar.getParentActivity(), eoVar.currentAccount, eoVar.f37251ea);
            eoVar.f37213bb = ilVar;
            ilVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            eoVar.f37213bb.setDelegate(new kl(eoVar));
            eoVar.f37213bb.setTop(true);
            int i11 = 0;
            eoVar.f37213bb.setClipChildren(false);
            eoVar.f37213bb.setClipToPadding(false);
            eoVar.f37213bb.setVisibility(0);
            il ilVar2 = eoVar.f37213bb;
            if (ilVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            ilVar2.setHint(LocaleController.getString(i10));
            eoVar.X0.addView(eoVar.f37213bb, w7.w5.a(92.5f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49));
            eoVar.f37213bb.p(null, null, true);
            eoVar.f37213bb.setTranslationY(-AndroidUtilities.dp(12.0f));
            eoVar.f37213bb.setScaleY(0.4f);
            eoVar.f37213bb.setScaleX(0.4f);
            eoVar.f37213bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.js.h).start();
            eoVar.Pc();
            il ilVar3 = eoVar.f37213bb;
            float f7 = eoVar.f37473w9;
            dl dlVar = eoVar.f37363o1;
            if (dlVar != null) {
                i11 = dlVar.getCurrentHeight();
            }
            ilVar3.setTranslationY(f7 + i11);
        }
    }

    public static SpannableStringBuilder I8(MessageObject messageObject, boolean z10, long j3) {
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

    public static void J0(eo eoVar) {
        eoVar.J7(false);
        if (!eoVar.fragmentBeginToShow) {
            ak akVar = eoVar.f37478x0;
            akVar.W1 = false;
            akVar.X1 = 0;
            akVar.setEmptyView(eoVar.Q0);
            ak akVar2 = eoVar.f37478x0;
            akVar2.W1 = true;
            akVar2.X1 = 1;
            return;
        }
        eoVar.f37478x0.setEmptyView(eoVar.Q0);
    }

    public static void K0(eo eoVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        eoVar.Qb(tL_game, messageObject, str, false, j3);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static java.util.ArrayList K7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.K7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void L0(eo eoVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = eoVar.I1.getAdapter().f10692w0;
        int i10 = eoVar.currentAccount;
        TLRPC.User user2 = eoVar.f37253f;
        if (user2 != null) {
            j3 = user2.f19949id;
        } else {
            j3 = eoVar.f37241e.f19802id;
        }
        ei.e5 b10 = ei.e5.b(i10, j3, user.f19949id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, eoVar.S8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(eoVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(eoVar.currentAccount);
            MessagesController.showCantOpenAlert(eoVar, restrictionReason);
            return;
        }
        ei.k3 k3Var = new ei.k3(eoVar.getParentActivity(), eoVar.getResourceProvider());
        k3Var.x(false);
        k3Var.A0 = true;
        k3Var.f9164k0 = eoVar.getParentActivity();
        k3Var.t(eoVar, b10);
        k3Var.show();
    }

    public static void M0(eo eoVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(eoVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, eoVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(eoVar.currentAccount).editMessage(messageObject, null, false, eoVar, null, i10, i11);
        }
    }

    public static FrameLayout M7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.q4 q4Var = new ai.q4(context, 12);
        int i11 = 3;
        q4Var.setMaxLines(3);
        q4Var.setGravity(3);
        q4Var.setEllipsize(TextUtils.TruncateAt.END);
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, c6Var));
        q4Var.setTextSize(1, i10);
        q4Var.setMaxWidth(AndroidUtilities.dp(170.0f));
        q4Var.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(q4Var, w7.w5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void N0(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(eoVar.currentAccount).loadAttachMenuBots(false, true);
            eoVar.ba(user.f19949id, eoVar.f37322k8, false);
        }
    }

    public static boolean P0(org.telegram.ui.eo r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.P0(org.telegram.ui.eo, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static a3.h0 P4(eo eoVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = eoVar.getMessagesController().createDeleteShowOnceTask(eoVar.T5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                eoVar.xc(arrayList, true);
            }
            return new a3.h0(eoVar, createDeleteShowOnceTask, messageObject, 14);
        }
        return null;
    }

    public static void Q0(eo eoVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(eoVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (eoVar.i() != null) {
                tLObject2 = eoVar.i();
            } else {
                tLObject2 = eoVar.f37241e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = eoVar.f37253f;
                if (user2 != null && user2.bot && user.f19949id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.am.q(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.zc.a0(eoVar), null);
                } else if (user2 != null && user2.bot && user.f19949id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.am.q(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.zc.a0(eoVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.am.q(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.zc.a0(eoVar), null);
                } else {
                    TLRPC.Chat chat = eoVar.f37241e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.am.q(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.zc.a0(eoVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = eoVar.f37241e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.am.q(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.zc.a0(eoVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                eoVar.ba(user.f19949id, eoVar.f37322k8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(eoVar.getParentActivity());
                y6Var.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20654ia, false));
                y6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false));
                y6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity());
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.V = y6Var;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(eoVar, user, atomicBoolean, tL_attachMenuBot, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(eoVar.getParentActivity(), 5, eoVar.getResourceProvider());
                    a2Var2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    a2Var2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    a2Var2.setMultiline(true);
                    a2Var2.e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
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
                    a2Var2.setPadding(dp, 0, dp2, 0);
                    a2Var2.setOnClickListener(new wf(3, a2Var2, atomicBoolean));
                    a2Var.G = 6;
                    alertDialog$Builder.n(a2Var2);
                }
                alertDialog$Builder.o();
            } else {
                pj1.a(eoVar.getParentActivity(), new z(eoVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void R0(eo eoVar, long j3, long j10, Long l4) {
        int i10;
        String str;
        if (eoVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = eoVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(eoVar.f37241e)) {
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
        org.telegram.ui.Components.g5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new ph(eoVar, j3, j10, l4, 0), eoVar.resourceProvider, true);
    }

    public static void S0(eo eoVar, org.telegram.ui.Components.s80 s80Var) {
        if (eoVar.Mb == null) {
            return;
        }
        s80Var.u();
        eoVar.O9(eoVar.Mb, false, true);
        of.f.r(eoVar.getParentActivity(), Uri.parse(eoVar.Mb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(eoVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void S3(eo eoVar) {
        org.telegram.ui.ActionBar.x xVar;
        if (!eoVar.f37239db && (xVar = eoVar.f37289i0) != null) {
            xVar.a();
            org.telegram.ui.ActionBar.u0 u0Var = xVar.f21440m;
            u0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (eoVar.R3 == 0) {
                u0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            u0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            u0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            u0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = eoVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f33249a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.a21(obj, 0), 0, spannableStringBuilder4.length(), 33);
                u0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f33249a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.a21(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                u0Var.g(56, spannableStringBuilder5);
            }
            u0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (eoVar.h == null) {
                u0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            u0Var.g(54, LocaleController.getString(R.string.Regular));
            eoVar.f37239db = true;
        }
    }

    public static void T0(eo eoVar, Object[] objArr, org.telegram.ui.Components.dz0 dz0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.zc zcVar = new org.telegram.ui.Components.zc(dz0Var.container, eoVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.sc r10 = zcVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f30540j = 2750;
                r10.k(true);
            }
        }
    }

    public static MessageObject T1(eo eoVar) {
        View view = eoVar.f37237d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) view).getMessageObject();
        }
        return null;
    }

    public static void U(eo eoVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = eoVar.getParentActivity();
        int i12 = eoVar.currentAccount;
        long j3 = eoVar.T5;
        bo boVar = eoVar.f37251ea;
        int i13 = org.telegram.ui.Components.bp.L;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.c6) boVar, false);
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20630h5, boVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, boVar)));
        linearLayout.addView((View) imageView, w7.w5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.h6.f20667j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.w5.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
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
        org.telegram.messenger.am.r(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.w5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            rg.q0 q0Var = new rg.q0(parentActivity, boVar, true);
            q0Var.setOnClickListener(new org.telegram.ui.Components.g3(e3Var, 1));
            q0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(q0Var, w7.w5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        e3Var.setCustomView(linearLayout);
        e3Var.show();
    }

    public static void U0(eo eoVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            eoVar.f37313jc = true;
            eoVar.f37478x0.f1();
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
            eo eoVar2 = new eo(bundle);
            eoVar2.tb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                eoVar2.L7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = eoVar2.X3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                eoVar2.X3.messageOwner.reactions = tL_messageReactions;
            }
            ai.d9 d9Var = new ai.d9(eoVar, new boolean[]{false}, i11, eoVar2, 14);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f19823id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = eoVar2.getClassGuid();
                NotificationCenter.getInstance(eoVar.currentAccount).addObserver(new cj(eoVar, classGuid, d9Var, eoVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        eo eoVar3 = eo.this;
                        MessagesController messagesController = eoVar3.getMessagesController();
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
                        int i20 = i18;
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) hg.c.h(1, arrayList)).getId(), 1, false, 0, true, eoVar3.f37281h4, null);
                    }
                });
                return;
            }
            d9Var.run();
            return;
        }
        eoVar.f37301ic = 0;
        eoVar.f37313jc = false;
        eoVar.f37478x0.f1();
        if (messageObject2 != null) {
            eoVar.la(messageObject2);
        } else if (eoVar.getParentActivity() != null) {
            org.telegram.ui.Components.zc.a0(eoVar).t(LocaleController.getString(R.string.ChannelPostDeleted), eoVar.f37251ea).j();
        }
    }

    public static void U4(eo eoVar, org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int themedColor;
        int i11;
        me.b bVar = eoVar.f37476wc;
        if (eoVar.Y != null && !bVar.f16088f && u1Var.getMessageObject() != null) {
            wm wmVar = eoVar.X0;
            RectF rectF = AndroidUtilities.rectTmp;
            hh.j.c(u1Var, wmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            sh.a aVar = u1Var.f22886a6;
            if (aVar != null && u1Var.f23070n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((eoVar.X0.getMeasuredHeight() - eoVar.f37478x0.getPaddingBottom()) + eoVar.f37425sc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = u1Var.getMessageObject();
                if (eoVar.Cc == null) {
                    eoVar.Cc = new qh.c(eoVar.getParentActivity(), eoVar.resourceProvider, eoVar);
                    int indexOfChild = eoVar.X0.indexOfChild(eoVar.f37478x0);
                    if (indexOfChild >= 0) {
                        eoVar.X0.addView(eoVar.Cc, indexOfChild + 1, w7.w5.g());
                    } else {
                        eoVar.X0.addView(eoVar.Cc, w7.w5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (u1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.h6.nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f20842sb;
                    }
                    themedColor = eoVar.getThemedColor(i11);
                } else {
                    if (u1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.h6.f20768od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20749nd;
                    }
                    themedColor = eoVar.getThemedColor(i10);
                }
                eoVar.Cc.setColor(themedColor);
                eoVar.Cc.setCellToWatch(u1Var);
                eoVar.Cc.f46601b.f46597a.a(false, false);
                eoVar.Cc.setAnimatedVisibility(bVar.f16087e);
                eoVar.Cc.f46601b.setOnClickListener(new org.telegram.ui.Components.voip.o(new wg(eoVar, 0), 8));
                qh.c cVar = eoVar.Cc;
                cVar.f46607s = new wg(eoVar, 2);
                org.telegram.ui.Cells.c6 c6Var = cVar.f46600a;
                c6Var.setOnKeyListener(new xg(eoVar, 0));
                c6Var.setOnEditorActionListener(new ma(eoVar, 1));
                eoVar.Y.f23763x5 = c6Var;
                AndroidUtilities.runOnUIThread(new ai.s1(eoVar, measuredHeight, c6Var, 28), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(eo eoVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (eoVar.f37336lb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            eoVar.G5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                eoVar.G5 = null;
                MessagePreviewParams messagePreviewParams = eoVar.f37259f5;
                if (messagePreviewParams != null) {
                    int i11 = eoVar.currentAccount;
                    CharSequence fieldText = eoVar.Y.getFieldText();
                    MessageObject messageObject3 = eoVar.f37356n5;
                    if (messageObject3 == eoVar.X3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, eoVar.f37330l5, eoVar.p5);
                }
                eoVar.m8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                eoVar.I5 = str;
            }
            if (eoVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = eoVar.f37259f5;
            if (messagePreviewParams2 != null) {
                int i12 = eoVar.currentAccount;
                CharSequence fieldText2 = eoVar.Y.getFieldText();
                MessageObject messageObject4 = eoVar.f37356n5;
                if (messageObject4 == eoVar.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, eoVar.f37330l5, eoVar.p5);
            }
            eoVar.Ib(true, eoVar.G5, false);
            return;
        }
        eoVar.G5 = null;
        eoVar.m8();
    }

    public static void V0(eo eoVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            yh.p7.k1(eoVar.getParentActivity(), eoVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, eoVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            eoVar.presentFragment(new xo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static eo V9(int i10, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i10);
        return new eo(bundle);
    }

    public static boolean W(eo eoVar) {
        MessageObject messageObject = eoVar.Mb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void W0(eo eoVar, String str) {
        Uri parse = Uri.parse(str);
        k60.b(eoVar.getParentActivity(), eoVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void W1(eo eoVar, float f7) {
        View view = eoVar.f37237d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setWalletSlidingOffset(f7);
        }
    }

    public static eo W9(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new eo(bundle);
    }

    public static void X(eo eoVar, long j3, long j10) {
        yh.n5.y(eoVar.currentAccount, false).C(j3, j10, new hh(eoVar, j3, j10, 0));
    }

    public static void X0(eo eoVar, int i10) {
        int i11;
        RectF rectF;
        fh.d dVar = eoVar.H;
        fh.d dVar2 = eoVar.I;
        ArrayList arrayList = eoVar.Fc;
        ah.h hVar = eoVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            if (w7.f0.a(i10, 4)) {
                eoVar.u9();
            }
            if (w7.f0.a(i10, 2)) {
                ArrayList arrayList2 = eoVar.Ec;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, eoVar.X0.getMeasuredWidth(), eoVar.f37478x0.getY() + eoVar.f37478x0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.d(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.d(i11, AndroidUtilities.dp(8.0f), arrayList2);
                    }
                } else {
                    i11 = 0;
                }
                int a2 = yf.e0.a(arrayList2, i11, arrayList);
                int measuredWidth = eoVar.X0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.n.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(eoVar.f37478x0.getY(), rectF2.top);
                    rectF2.right = w7.n.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(eoVar.f37478x0.getY() + eoVar.f37478x0.getMeasuredHeight(), rectF2.bottom);
                }
                hVar.g(a2, arrayList);
            }
            wm wmVar = eoVar.X0;
            Objects.requireNonNull(wmVar);
            if (hVar.e(new jg(wmVar, 0), eoVar.X0.getWidth(), eoVar.X0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = eoVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                eoVar.s9();
            }
        }
    }

    public static void X1(eo eoVar) {
        long j3;
        aq aqVar = eoVar.P9;
        if (aqVar != null) {
            if (eoVar.f37281h4) {
                if (aqVar.H != null) {
                    if (eoVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(eoVar, eoVar.getParentLayout().getFragmentStack().indexOf(eoVar), eoVar.f37241e, eoVar.f37253f, eoVar.f37220c4, eoVar.T5, eoVar.f37460va, eoVar.f37448ua);
                    }
                    TLRPC.Chat chat = eoVar.f37241e;
                    TLRPC.TL_forumTopic tL_forumTopic = eoVar.P9.H;
                    long j10 = eoVar.T5;
                    int i10 = eoVar.f37448ua;
                    int i11 = eoVar.f37460va;
                    if (eoVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(eoVar, eoVar.getParentLayout().getFragmentStack().indexOf(eoVar), chat, null, tL_forumTopic, j10, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", eoVar.P9.f35917a);
                    bundle.putInt("dialog_filter_id", eoVar.P9.f35919b);
                    bundle.putBoolean("pulled", true);
                    eo g10 = ng.d.g(eoVar, -eoVar.T5, eoVar.P9.H, 0, bundle);
                    g10.R9 = true;
                    Oc = true;
                    eoVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = aqVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f19802id;
            }
            if (j3 != 0) {
                eoVar.y6();
                aq aqVar2 = eoVar.P9;
                TLRPC.Chat chat3 = aqVar2.G;
                long j12 = aqVar2.Z;
                int i12 = aqVar2.f35917a;
                int i13 = aqVar2.f35919b;
                if (eoVar.getParentLayout() != null) {
                    org.telegram.ui.Components.q9.a(eoVar, eoVar.getParentLayout().getFragmentStack().indexOf(eoVar), chat3, null, null, j12, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = eoVar.P9.G;
                if (chat4 != null) {
                    j11 = chat4.f19802id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", eoVar.P9.f35917a);
                bundle2.putInt("dialog_filter_id", eoVar.P9.f35919b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(eoVar.currentAccount).edit().remove("diditem" + eoVar.P9.Z).apply();
                eo eoVar2 = new eo(bundle2);
                ArrayList arrayList = eoVar.f37264fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = eoVar.f37264fb;
                    eoVar2.f37264fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                eoVar2.R9 = true;
                Oc = true;
                eoVar.presentFragment(eoVar2, true);
            }
        }
    }

    public static void Y(eo eoVar, long j3, long j10) {
        BotForumHelper.getInstance(eoVar.currentAccount).saveIsStreamingTopic(j3, j10, false);
        eoVar.Nb = null;
    }

    public static void Y0(eo eoVar) {
        if (AndroidUtilities.addToClipboard(eoVar.Mb.sponsoredInfo)) {
            org.telegram.messenger.am.p(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.resourceProvider));
        }
    }

    public static void Z(eo eoVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(eoVar.currentAccount).sendSticker(tL_document, str, eoVar.T5, eoVar.f37356n5, eoVar.X3, null, eoVar.f37330l5, null, z10, i10, 0, false, obj, eoVar.H8(), 0L, eoVar.S8(), eoVar.f37271g5);
    }

    public static void Z0(eo eoVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(eoVar.currentAccount).loadAttachMenuBots(false, true);
            eoVar.ba(user.f19949id, eoVar.f37322k8, false);
        }
    }

    public static void a0(eo eoVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new nf(eoVar, i10, 6));
        } else {
            eoVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a1(eo eoVar) {
        eoVar.f37212ba = null;
        eoVar.f37478x0.setOnInterceptTouchListener(null);
        eoVar.nb(eoVar.X0, true);
        ChatThemeController.getInstance(eoVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void b0(eo eoVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, ag agVar) {
        String str4;
        org.telegram.ui.Components.z41 z41Var;
        if (eoVar.f37233d5 != null && i10 < arrayList.size() && eoVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = eoVar.getParentActivity();
            int i11 = iArr[0];
            vf vfVar = new vf(eoVar, 13);
            String[] strArr = org.telegram.ui.Components.g51.R;
            if (parentActivity == null) {
                z41Var = null;
            } else {
                org.telegram.ui.Components.z41 z41Var2 = new org.telegram.ui.Components.z41(parentActivity, str, str4, inputPeer, i11, richMessage, vfVar);
                z41Var2.I(z10);
                z41Var2.M = eoVar;
                z41Var2.N = agVar;
                if (eoVar.getParentActivity() != null) {
                    eoVar.showDialog(z41Var2);
                }
                z41Var = z41Var2;
            }
            z41Var.setDimBehind(false);
            eoVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(eoVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + eoVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + eoVar.a(), i12 - 1).apply();
                eoVar.Uc(true);
            }
        }
    }

    public static void b1(eo eoVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (eoVar.getParentActivity() != null) {
            TLRPC.Chat chat = eoVar.f37241e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !eoVar.f37241e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (eoVar.h == null && (userFull = eoVar.f37196a8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37251ea);
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new ve(eoVar, 21));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eoVar.showDialog(alertDialog$Builder.f20141a);
            } else if (!eoVar.H4.isEmpty()) {
                MessagesController.getNotificationsSettings(eoVar.currentAccount).edit().putInt("pin_" + eoVar.T5, ((Integer) eoVar.H4.get(0)).intValue()).commit();
                eoVar.Cc(0, true);
            }
        }
    }

    public static void c0(long j3, eo eoVar) {
        if (yh.n5.y(eoVar.currentAccount, false).p().amount < j3) {
            new yh.e7(eoVar.getParentActivity(), eoVar.getResourceProvider(), j3, 13, DialogObject.getShortName(eoVar.a()), new wg(eoVar, 7), eoVar.a()).show();
        } else {
            new yh.f7(eoVar.getParentActivity(), eoVar.resourceProvider).show();
        }
    }

    public static void c1(eo eoVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        eoVar.f37271g5 = null;
        int i10 = eoVar.f37372ob;
        if (i10 == 2) {
            eoVar.f37330l5 = null;
            eoVar.f37356n5 = null;
            MessagePreviewParams messagePreviewParams = eoVar.f37259f5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, eoVar.T5, null);
            }
            eoVar.m8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = eoVar.f37259f5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = eoVar.f37259f5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = eoVar.f37259f5.forwardMessages.messages.get(i11);
                    if (j3 == 0) {
                        j10 = messageObject3.getDialogId();
                        j3 = messageObject3.getFromChatId();
                    } else if (j3 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37251ea);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User user = eoVar.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", eoVar.f37259f5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = eoVar.getMessagesController().getChat(Long.valueOf(-j10));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", eoVar.f37259f5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                a2Var.T = AndroidUtilities.replaceTags(formatString);
                a2Var.R = LocaleController.formatPluralString("messages", eoVar.f37259f5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new ve(eoVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new ve(eoVar, 7));
                eoVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20799q7));
                }
            }
        } else if (i10 == 4) {
            eoVar.G5 = null;
            MessagePreviewParams messagePreviewParams3 = eoVar.f37259f5;
            if (messagePreviewParams3 != null) {
                int i12 = eoVar.currentAccount;
                MessageObject messageObject4 = eoVar.f37356n5;
                if (messageObject4 == eoVar.X3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, eoVar.f37330l5, eoVar.p5);
            }
            sk skVar = eoVar.Y;
            skVar.X2 = null;
            skVar.Y2 = false;
            eoVar.l8();
            eoVar.m8();
        } else {
            if (ChatObject.isForum(eoVar.f37241e) && !eoVar.f37281h4 && (messageObject = eoVar.f37356n5) != null) {
                long topicId = MessageObject.getTopicId(eoVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    eoVar.getMediaDataController().cleanDraft(eoVar.T5, topicId, false);
                }
            }
            eoVar.Cb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void c2(eo eoVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            messageObject = u1Var.getMessageObject();
            u1Var.f22967g1 = f7;
            u1Var.f22979h1 = f10;
            org.telegram.ui.Components.vb0 vb0Var = u1Var.Kc;
            float f11 = u1Var.f22979h1;
            vb0Var.h = u1Var.getTranslationX() + f7;
            vb0Var.f31484i = f11;
            vb0Var.f31487l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int J8 = eoVar.J8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && J8 >= 2 && J8 != 20 && J8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        eoVar.A6(messageObject, z10, true);
                        eoVar.hc();
                        eoVar.ad(false);
                    }
                }
            }
        }
    }

    public static void d0(eo eoVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ag agVar) {
        String str4;
        if (eoVar.f37233d5 != null && i10 < arrayList.size() && eoVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = eoVar.f37233d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.g51.K(eoVar.getParentActivity(), eoVar, inputPeer, iArr[0], eoVar.f37233d5.summarized, str, str4, charSequence, z10, agVar, new vf(eoVar, 19)).setDimBehind(false);
            eoVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(eoVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + eoVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + eoVar.a(), i11 - 1).apply();
                eoVar.Uc(true);
            }
        }
    }

    public static void d1(eo eoVar, String str) {
        if (eoVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(eoVar.currentAccount).getInviteText(1));
            eoVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void d2(eo eoVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = eoVar.f37444u6;
        SparseArray[] sparseArrayArr = eoVar.W5;
        if (!eoVar.Pa && (i11 = i10 - eoVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.wm0 wm0Var = eoVar.f37478x0;
            fj fjVar = new fj(eoVar, z10, sparseArray);
            if (!wm0Var.f32444b2) {
                wm0Var.f32462k2 = new int[2];
                new HashSet();
                wm0Var.l1(wm0Var, true);
                wm0Var.f32452f2 = fjVar;
                wm0Var.f32444b2 = true;
                wm0Var.f32450e2 = i10;
                wm0Var.f32448d2 = i10;
            }
        }
    }

    public static void d4(eo eoVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(eoVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new d7(eoVar, h0Var, text, 3), new z0(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void e0(eo eoVar, long j3, long j10, Long l4, Boolean bool) {
        boolean z10 = false;
        yh.n5 y3 = yh.n5.y(eoVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j3, j10, z10, true);
    }

    public static void e1(eo eoVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = eoVar.getMessagesController().getInputPeer(eoVar.T5);
                tL_messages_getHistory.offset_date = eoVar.f37471w7 + 86400;
                tL_messages_getHistory.limit = 1;
                eoVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ai.v1(25, eoVar, tLObject));
                return;
            }
            eoVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static boolean e2(eo eoVar, View view, RectF rectF) {
        RectF rectF2 = eoVar.Fb;
        if (rectF != null && eoVar.f37478x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void f0(eo eoVar) {
        if (eoVar.Mb == null) {
            return;
        }
        j41[] j41VarArr = {j41.U(eoVar.getParentActivity(), eoVar, true, eoVar.resourceProvider, new tc(5, eoVar, j41VarArr))};
    }

    public static void f1(eo eoVar, int i10) {
        if (eoVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 t82 = eoVar.t8(i10, false);
            if (t82 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) t82;
                zg.o0 o0Var = u1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = u1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (o0Var.K || randomUnreadReaction.big)) {
                    zg.j0.d(eoVar, null, t82, null, 0.0f, 0.0f, zg.n0.d(randomUnreadReaction.reaction), eoVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    zg.j0.f();
                }
                o0Var.K = false;
                MessageObject messageObject = u1Var.f23230y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (t82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) t82;
                zg.o0 o0Var2 = w0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (o0Var2.K || randomUnreadReaction2.big)) {
                    zg.j0.d(eoVar, null, t82, null, 0.0f, 0.0f, zg.n0.d(randomUnreadReaction2.reaction), eoVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    zg.j0.f();
                }
                o0Var2.K = false;
                MessageObject messageObject2 = w0Var.P0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void f4(eo eoVar) {
        if (eoVar.I3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = eoVar.R3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f19823id = 0;
        MessageObject messageObject = new MessageObject(eoVar.currentAccount, tL_message, false, false);
        eoVar.I3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void g0(eo eoVar) {
        MessagesController messagesController = eoVar.getMessagesController();
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        int i10 = eoVar.classGuid;
        int i11 = eoVar.R3;
        long j11 = eoVar.f37232d4;
        int i12 = eoVar.f37341m4;
        int i13 = eoVar.V5;
        eoVar.V5 = i13 + 1;
        messagesController.loadMessages(j3, j10, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j11, i12, i13, eoVar.f37281h4);
    }

    public static void g1(eo eoVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.hh hhVar;
        String str;
        SparseArray[] sparseArrayArr = eoVar.W5;
        if (eoVar.getParentActivity() != null && eoVar.N9 == 0.0f) {
            if (eoVar.R3 == 3) {
                Bundle bundle = new Bundle();
                long N8 = eoVar.N8();
                if (N8 >= 0) {
                    bundle.putLong("user_id", N8);
                } else {
                    bundle.putLong("chat_id", -N8);
                }
                eoVar.presentFragment(new eo(bundle));
                return;
            }
            boolean z12 = false;
            if (eoVar.F9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                eoVar.zb(true, true);
                byte[] bArr = eoVar.V3;
                String str2 = eoVar.W3;
                gf gfVar = new gf(eoVar, 1);
                int i11 = e41.v;
                int currentAccount = eoVar.getCurrentAccount();
                Activity parentActivity = eoVar.getParentActivity();
                long a2 = eoVar.a();
                if (parentActivity != null) {
                    e41.L(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.zc.a0(eoVar), eoVar.getResourceProvider(), bArr, str2, gfVar);
                }
            } else if (eoVar.R3 == 2) {
                eoVar.finishFragment();
                rm rmVar = eoVar.V8;
                if (eoVar.B0.getTag() == null) {
                    z12 = true;
                }
                rmVar.W(true, z12);
            } else {
                TLRPC.User user = eoVar.f37253f;
                if (user != null && user.f19949id == 489000) {
                    eoVar.fc(true);
                } else if (user != null && eoVar.f37350n) {
                    if (user.bot) {
                        String str3 = eoVar.f37249e8;
                        eoVar.f37249e8 = null;
                        eoVar.getMessagesController().unblockPeer(eoVar.f37253f.f19949id, new ye(eoVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37251ea);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                    a2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ve(eoVar, 8));
                    a2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    eoVar.showDialog(a2Var);
                } else if (UserObject.isReplyUser(user)) {
                    eoVar.fc(true);
                } else {
                    TLRPC.User user2 = eoVar.f37253f;
                    if (user2 != null && user2.bot && (str = eoVar.f37249e8) != null) {
                        if (str.length() != 0) {
                            eoVar.getMessagesController().sendBotStart(eoVar.f37253f, eoVar.f37249e8);
                        } else {
                            eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        eoVar.f37249e8 = null;
                        eoVar.lc(false);
                        return;
                    }
                    if (ChatObject.isChannel(eoVar.f37241e)) {
                        TLRPC.Chat chat = eoVar.f37241e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (eoVar.f37241e.join_request) {
                                    eoVar.zb(true, true);
                                    MessagesController.getInstance(eoVar.currentAccount).addUserToChat(eoVar.f37241e.f19802id, UserConfig.getInstance(eoVar.currentAccount).getCurrentUser(), 0, null, null, true, new qe(eoVar, 14), new o(9, eoVar, context));
                                    return;
                                }
                                qe qeVar = eoVar.L5;
                                if (qeVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(qeVar);
                                    eoVar.L5 = null;
                                }
                                eoVar.zb(true, true);
                                eoVar.getMessagesController().addUserToChat(eoVar.f37241e.f19802id, eoVar.getUserConfig().getCurrentUser(), 0, null, eoVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.p0 p0Var = eoVar.K1;
                                if (p0Var != null && (hhVar = eoVar.M0) != null && hhVar.d(p0Var) && eoVar.N1.getVisibility() != 8 && eoVar.N1.getTag(R.id.object_tag) != null) {
                                    MessagesController.getNotificationsSettings(eoVar.currentAccount).edit().putInt("dialog_bar_vis3" + eoVar.T5, 3).commit();
                                    eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eoVar.T5));
                                    return;
                                }
                                return;
                            }
                            eoVar.fc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = eoVar.Z7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = eoVar.f37241e;
                    TLRPC.User user3 = eoVar.f37253f;
                    if (eoVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.g5.r(eoVar, false, chat2, user3, z11, true, false, z10, new ve(eoVar, 9));
                }
            }
        }
    }

    public static void g4(eo eoVar) {
        if (eoVar.J3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f19823id = 0;
        MessageObject messageObject = new MessageObject(eoVar.currentAccount, tL_message, false, false);
        eoVar.J3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void h0(eo eoVar, ArrayList arrayList, long j3, org.telegram.ui.Components.mn0 mn0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(eoVar.currentAccount).sendMessage(arrayList, j3, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new pe(eoVar, j3, 5), 400L);
            mn0Var.dismiss();
        }
    }

    public static void h1(eo eoVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.s80 I = org.telegram.ui.Components.s80.I(eoVar, u1Var);
        org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0(eoVar.getParentActivity(), eoVar.f37251ea);
        I.f30467p = new we(mn0Var, 0);
        if (z10 && eoVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new ye(eoVar, str, 11), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new cf(eoVar, mn0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new ye(eoVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = eoVar.currentAccount;
                long j3 = user.f19949id;
                org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6(27, eoVar, userArr);
                TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(j3);
                boolean z12 = userOrChat instanceof TLRPC.User;
                if ((userOrChat instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) userOrChat)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12) {
                    i10 = R.string.ViewProfile;
                } else if (z11) {
                    i10 = R.string.ViewChannelProfile;
                } else {
                    i10 = R.string.ViewGroupProfile;
                }
                I.n(userOrChat, LocaleController.getString(i10), f6Var);
            } else {
                I.p(13, -1, LocaleController.getString(R.string.WalletAddressNoLinkedAccount));
            }
        }
        mn0Var.e(I);
        mn0Var.f(u1Var, characterStyle, null, false);
        eoVar.showDialog(mn0Var);
    }

    public static void i0(eo eoVar) {
        if (AndroidUtilities.addToClipboard(eoVar.Mb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.am.p(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.resourceProvider));
        }
    }

    public static void i1(org.telegram.ui.eo r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.u1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.i1(org.telegram.ui.eo, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1, int, int):void");
    }

    public static void j0(eo eoVar, TLRPC.Document document) {
        eoVar.f37455v4.put(document, 0);
        SendMessagesHelper.getInstance(eoVar.currentAccount).sendSticker(document, null, eoVar.T5, null, null, null, eoVar.f37330l5, null, true, 0, 0, false, null, eoVar.H8(), 0L, eoVar.S8(), eoVar.f37271g5);
    }

    public static void j1(eo eoVar, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var = eoVar.parentLayout;
        if (b5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 backgroundFragment = b5Var.getBackgroundFragment();
        if (backgroundFragment instanceof eo) {
            eo eoVar2 = (eo) backgroundFragment;
            if (eoVar2.a() == eoVar.T5) {
                eoVar.finishFragment();
                eoVar2.F(i10, 0, 0, 0, true, true);
                return;
            }
        }
        eoVar.presentFragment(V9(i10, eoVar.T5));
    }

    public static void j2(eo eoVar) {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (eoVar.f37503z1 != null) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var2 = null;
        for (int childCount = eoVar.f37478x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = eoVar.f37478x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (primaryMessageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                u1Var2 = u1Var;
            }
        }
        eoVar.yb(u1Var2);
    }

    public static void k0(eo eoVar) {
        if (eoVar.M1) {
            eoVar.getMessagesController().addDialogToFolder(eoVar.T5, 0, 0, 0L);
            eoVar.T7();
            eoVar.y3.j(23, eoVar.T5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + eoVar.T5, false);
            edit.putBoolean("dialog_bar_block" + eoVar.T5, false);
            edit.putBoolean("dialog_bar_report" + eoVar.T5, false);
            edit.commit();
            eoVar.Uc(false);
            eoVar.getNotificationsController().clearDialogNotificationsSettings(eoVar.T5, eoVar.d());
        } else if (eoVar.L1.getTag() != null && ((Integer) eoVar.L1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = eoVar.Z7;
            if (chatFull != null && chatFull.participants != null) {
                a0.i iVar = new a0.i();
                for (int i10 = 0; i10 < eoVar.Z7.participants.participants.size(); i10++) {
                    iVar.k(null, eoVar.Z7.participants.participants.get(i10).user_id);
                }
                long j3 = eoVar.Z7.f19803id;
                org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(eoVar.getParentActivity(), eoVar.currentAccount, iVar, eoVar.Z7.f19803id, eoVar, eoVar.f37251ea);
                g80Var.f26334l0 = new ve(eoVar, 23);
                g80Var.show();
            }
        } else if (eoVar.L1.getTag() != null) {
            eoVar.vb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", eoVar.f37253f.f19949id);
            bundle.putBoolean("addContact", true);
            ts tsVar = new ts(bundle);
            tsVar.O = new ve(eoVar, 24);
            eoVar.presentFragment(tsVar);
        }
    }

    public static void k1(org.telegram.ui.eo r19, final org.telegram.ui.j41[] r20, final org.telegram.ui.Components.s80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.k1(org.telegram.ui.eo, org.telegram.ui.j41[], org.telegram.ui.Components.s80):void");
    }

    public static void l0(eo eoVar, TLRPC.ReactionCount reactionCount) {
        eoVar.D7(true);
        org.telegram.ui.Components.to0.c(eoVar.getParentActivity(), eoVar.currentAccount, reactionCount.reaction, eoVar.f37251ea);
    }

    public static void l1(eo eoVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(eoVar.currentAccount).getInputUser(user.f19949id);
                    ConnectionsManager.getInstance(eoVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ai.v1(26, eoVar, user));
                }
            }
        }
    }

    public static void m0(eo eoVar) {
        if (eoVar.X2.getAlpha() != 0.0f && !eoVar.actionBar.u() && !eoVar.F9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(eoVar.X2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            eoVar.L9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void m1(eo eoVar, int i10) {
        if (eoVar.R3 == 7) {
            Object E = eoVar.M3.E(i10);
            if (i10 == 0) {
                eoVar.M3.getClass();
            }
            if (E instanceof MessageObject) {
                eoVar.ka((MessageObject) E);
            }
        } else if (eoVar.f37389q3 != null) {
            if (i10 >= 0 && i10 < eoVar.getMediaDataController().searchResultMessages.size()) {
                eoVar.f37402r3 = false;
                eoVar.pb(false, true, false);
                eoVar.getMediaDataController().setSearchedPosition(i10);
                eoVar.Jc(eoVar.getMediaDataController().getMask(), eoVar.getMediaDataController().getSearchPosition(), eoVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new ze(eoVar, eoVar.getMediaDataController().searchResultMessages.get(i10), 5));
            }
        } else {
            eoVar.getMediaDataController().jumpToSearchedMessage(eoVar.classGuid, i10);
            eoVar.Pb(false);
        }
    }

    public static void n0(eo eoVar) {
        org.telegram.ui.Cells.u1 u1Var;
        cm cmVar;
        int i10;
        if (!eoVar.Rb && eoVar.F3 && eoVar.f37478x0.G && eoVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = eoVar.f37478x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = eoVar.f37478x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        u1Var = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().messageOwner != null && u1Var.getMessageObject().messageOwner.video_processing_pending) {
                            if (u1Var.getCurrentPosition() != null) {
                                if (u1Var.getMessageObject() != null && (u1Var.getCurrentPosition().flags & 8) != 0) {
                                    int i11 = u1Var.getCurrentPosition().flags;
                                    if (u1Var.getMessageObject().isOutOwner()) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    if ((i11 & i10) == 0) {
                                        continue;
                                    }
                                }
                            }
                            u1Var.getLocationInWindow(iArr);
                            float timeY = u1Var.getTimeY() + iArr[1];
                            if (timeY >= AndroidUtilities.dp(240.0f) && timeY <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    u1Var = null;
                    break;
                }
            }
            if (u1Var != null) {
                eoVar.Rb = true;
                cm cmVar2 = new cm(eoVar, eoVar.getParentActivity());
                cmVar2.p(true);
                cmVar2.K = Layout.Alignment.ALIGN_CENTER;
                cmVar2.d = 3500L;
                cmVar2.T = true;
                cmVar2.f4907e = true;
                cmVar2.h = AndroidUtilities.dp(150.0f);
                cmVar2.q(8.0f);
                eoVar.B1 = cmVar2;
                cmVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                eoVar.X0.addView(eoVar.B1, w7.w5.a(120.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
                u1Var.getLocationInWindow(iArr);
                eoVar.C1 = u1Var.getTimeY() + iArr[1];
                eoVar.B1.setTranslationY(((-cmVar.getTop()) - AndroidUtilities.dp(120.0f)) + eoVar.C1);
                eoVar.B1.m(0.0f, (u1Var.f23100pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + u1Var.f23130rb);
                eoVar.B1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new qe(eoVar, 2));
            AndroidUtilities.runOnUIThread(new qe(eoVar, 2), 2000L);
        }
    }

    public static void n8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f33249a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.a21(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f33249a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.a21(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void o0(eo eoVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.a71[] a71VarArr;
        if (eoVar.F5 != 0) {
            eoVar.getConnectionsManager().cancelRequest(eoVar.F5, true);
            eoVar.F5 = 0;
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
            if ((charSequence instanceof Spannable) && (a71VarArr = (org.telegram.ui.Components.a71[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.a71.class)) != null && a71VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.a71 a71Var : a71VarArr) {
                    arrayList.add(a71Var.getURL());
                }
            }
            if (arrayList != null && eoVar.H5 != null && arrayList.size() == eoVar.H5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) eoVar.H5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            eoVar.H5 = arrayList;
        } catch (Exception e7) {
            FileLog.e(e7);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new vf(eoVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new vf(eoVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (eoVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new af(eoVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = eoVar.G5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = eoVar.f37336lb + 1;
            eoVar.f37336lb = i11;
            og ogVar = new og(eoVar, i11, getwebpagepreview, 0);
            if (eoVar.f37348mb == null) {
                eoVar.f37348mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) eoVar.f37348mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                ogVar.run(Boolean.TRUE, webPage2);
                return;
            }
            o6 o6Var = new o6(eoVar, getwebpagepreview, ogVar, 1);
            if (eoVar.F5 != 0) {
                eoVar.getConnectionsManager().cancelRequest(eoVar.F5, true);
            }
            eoVar.F5 = eoVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.m0(6, eoVar, o6Var));
            eoVar.getConnectionsManager().bindRequestToGuid(eoVar.F5, eoVar.classGuid);
        }
    }

    public static void o1(long j3, eo eoVar) {
        if (yh.n5.y(eoVar.currentAccount, false).p().amount < j3) {
            new yh.e7(eoVar.getParentActivity(), eoVar.getResourceProvider(), j3, 13, DialogObject.getShortName(eoVar.a()), new wg(eoVar, 7), eoVar.a()).show();
        } else {
            new yh.f7(eoVar.getParentActivity(), eoVar.resourceProvider).show();
        }
    }

    public static org.telegram.ui.Components.fp p0(eo eoVar, Context context) {
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, eoVar.currentAccount, eoVar.f37277h0.getPopupLayout().getSwipeBack(), false, new xj(eoVar), eoVar.getResourceProvider());
        eoVar.f37290i1 = hpVar;
        hpVar.d(eoVar.T5, eoVar.d(), null);
        return eoVar.f37290i1.f26868f;
    }

    public static void p1(eo eoVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != eoVar.d()) {
            eoVar.f37199ab = SystemClock.uptimeMillis();
            eoVar.f37380p7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                eoVar.Wa(eoVar.d());
            } else if (eoVar.d() == 0) {
                eoVar.Wa(l4.longValue());
            } else {
                eoVar.f37358n7 = -1;
            }
            eoVar.getConnectionsManager().cancelRequestsForGuid(eoVar.classGuid);
            eoVar.getMessagesStorage().cancelTasksForGuid(eoVar.classGuid);
            eoVar.classGuid = ConnectionsManager.generateClassGuid();
            eoVar.Ta();
            eoVar.f37259f5 = null;
            eoVar.f37445u7 = 0;
            eoVar.f37321k7 = false;
            eoVar.f37332l7 = true;
            eoVar.f37283h6.clear();
            eoVar.f37232d4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = eoVar.getMessagesController().getTopicsController().findTopic(-eoVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                eoVar.f37318k4 = i12;
                eoVar.l4 = findTopic.read_outbox_max_id;
                eoVar.f37341m4 = Math.max(1, i12);
                eoVar.getMessagesController().getTopicsController().getTopicRepliesCount(eoVar.T5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                eoVar.f37220c4 = null;
                eoVar.f37192a4 = null;
                eoVar.X3 = null;
                eoVar.f37356n5 = null;
                eoVar.f37318k4 = 0;
                eoVar.l4 = 0;
                eoVar.f37341m4 = 0;
                eoVar.f37232d4 = 0L;
                eoVar.f37246e4 = 0;
                eoVar.f37258f4 = null;
                eoVar.f37281h4 = false;
                eoVar.f37270g4 = false;
            }
            eoVar.v8();
            eoVar.Rc(true);
            eoVar.f37190a1.o(true);
            eoVar.f37190a1.b();
            eoVar.R1.setCurrentTopic(l4.longValue());
            eoVar.Uc(true);
            eoVar.lc(true);
            eoVar.getMessagesController().setForumLastTopicId(-eoVar.a(), eoVar.d());
            eoVar.l9(true);
            eoVar.j9(true);
            sk skVar = eoVar.Y;
            if (skVar != null) {
                skVar.n0(false);
                eoVar.Y.J1(true);
            }
            eoVar.D6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            eoVar.l1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            eoVar.f37338m1 = i11;
            eoVar.Fc(false);
            eoVar.Ec(false);
            eoVar.Vc();
            vn vnVar = eoVar.f37373oc;
            if (vnVar != null && eoVar.actionBar.f21060n0) {
                vnVar.p(null);
            }
        }
    }

    public static void q0(eo eoVar) {
        if (MessagesController.getInstance(eoVar.currentAccount).isDialogMuted(eoVar.T5, eoVar.d())) {
            eoVar.Tc(true);
            AndroidUtilities.runOnUIThread(new qe(eoVar, 7), 150L);
            eoVar.f37277h0.M(null, null);
            if (eoVar.getParentActivity() != null) {
                org.telegram.ui.Components.zc.z(eoVar, 4, 0, eoVar.f37251ea).j();
                return;
            }
            return;
        }
        View view = eoVar.f37243e1.f21249j;
        if (view instanceof org.telegram.ui.ActionBar.e1) {
            ((org.telegram.ui.ActionBar.e1) view).b();
        }
    }

    public static void q1(eo eoVar, String str) {
        if (MessagesController.getInstance(eoVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            of.f.m(eoVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.g5.n0(eoVar.getParentActivity(), eoVar.f37251ea, str, true, new ng(eoVar, str, 1));
        }
    }

    public static void r0(eo eoVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(eoVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f19918id;
        long clientUserId = eoVar.getUserConfig().getClientUserId();
        long j10 = eoVar.T5;
        if (clientUserId == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void s0(eo eoVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f19843id = eoVar.getMessagesController().getInputUser(eoVar.f37253f);
            eoVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new te(eoVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(eoVar.getUserConfig().getCurrentUser(), eoVar.T5, messageObject, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = eoVar.H8();
        SendMessagesHelper.getInstance(eoVar.currentAccount).sendMessage(of2);
        if (eoVar.R3 == 0) {
            eoVar.T9(false);
        }
        eoVar.j9(false);
    }

    public static void s1(eo eoVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(eoVar.currentAccount).getInputUser(user.f19949id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(eoVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new uh(eoVar, tL_attachMenuBot, user, 0), 66);
    }

    public static Integer s8(ArrayList arrayList, int i10, int[] iArr) {
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

    public static void t0(eo eoVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, ag agVar) {
        String str3;
        if (eoVar.f37233d5 != null && i10 < arrayList.size() && eoVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = eoVar.f37233d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.g51.K(eoVar.getParentActivity(), eoVar, inputPeer, iArr[0], eoVar.f37233d5.summarized, strArr[0], str3, charSequence, z10, agVar, new wg(eoVar, 13)).setDimBehind(false);
            eoVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(eoVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + eoVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + eoVar.a(), i11 - 1).apply();
                eoVar.Uc(true);
            }
        }
    }

    public static void t1(eo eoVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        rg.l1 l1Var = new rg.l1(eoVar, eoVar.currentAccount, user, null, null, eoVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            l1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(eoVar.getParentActivity());
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(160.0f), 4, y9Var, false);
        y9Var.setImageDrawable(q5Var);
        y9Var.addOnAttachStateChangeListener(new i5(q5Var, 1));
        q5Var.j(j3, false);
        l1Var.E0 = true;
        l1Var.B0 = y9Var;
        eoVar.showDialog(l1Var);
    }

    public static void u0(eo eoVar) {
        int i10;
        TLRPC.ChatFull chatFull = eoVar.Z7;
        if (chatFull != null && !eoVar.f37391q5) {
            TLRPC.Chat chat = eoVar.f37241e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && eoVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(eoVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = eoVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && eoVar.visibleDialog == null && eoVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = eoVar.getParentActivity();
                    ve veVar = new ve(eoVar, 15);
                    ve veVar2 = new ve(eoVar, 16);
                    Pattern pattern = org.telegram.ui.Components.g5.f26280a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ai.l2(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.w5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                    a2Var.V = frameLayout;
                    a2Var.O0 = 0.3974359f;
                    a2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), veVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), veVar2);
                    eoVar.showDialog(a2Var);
                }
            }
        }
    }

    public static void u1(eo eoVar, String str) {
        if (MessagesController.getInstance(eoVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            eoVar.getParentActivity();
            of.f.n(str);
            return;
        }
        org.telegram.ui.Components.g5.n0(eoVar.getParentActivity(), eoVar.f37251ea, str, false, new ng(eoVar, str, 0));
    }

    public static void v0(org.telegram.ui.eo r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.v0(org.telegram.ui.eo, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void w0(eo eoVar) {
        if (eoVar.R3 == 0 && eoVar.getMessagesController().freezeUntilDate > eoVar.getConnectionsManager().getCurrentTime() && !b.a(eoVar.currentAccount, eoVar.f37253f)) {
            b.c(eoVar.getParentActivity(), eoVar.currentAccount, eoVar.getResourceProvider());
        }
    }

    public static void w1(eo eoVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = eoVar.A6;
        int[] iArr4 = eoVar.f37508z6;
        boolean[] zArr = eoVar.E6;
        int[] iArr5 = eoVar.f37496y6;
        int[] iArr6 = eoVar.B6;
        boolean[] zArr2 = eoVar.D6;
        ArrayList arrayList = eoVar.f37283h6;
        if ((i10 - i11) - i12 <= i13 && !eoVar.G6) {
            boolean[] zArr3 = eoVar.C6;
            if (!zArr3[0]) {
                eoVar.G6 = true;
                arrayList.add(Integer.valueOf(eoVar.V5));
                if (eoVar.f37405r6.size() != 0) {
                    MessagesController messagesController = eoVar.getMessagesController();
                    j3 = 0;
                    long j10 = eoVar.T5;
                    c10 = 0;
                    long j11 = eoVar.L6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = eoVar.classGuid;
                    int i17 = eoVar.R3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = eoVar.f37232d4;
                    int i18 = eoVar.f37341m4;
                    int i19 = eoVar.V5;
                    eoVar.V5 = i19 + 1;
                    messagesController.loadMessages(j10, j11, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j12, i18, i19, eoVar.f37281h4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    MessagesController messagesController2 = eoVar.getMessagesController();
                    long j13 = eoVar.T5;
                    long j14 = eoVar.L6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = eoVar.classGuid;
                    int i22 = eoVar.R3;
                    long j15 = eoVar.f37232d4;
                    int i23 = eoVar.f37341m4;
                    int i24 = eoVar.V5;
                    eoVar.V5 = i24 + 1;
                    messagesController2.loadMessages(j13, j14, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j15, i23, i24, eoVar.f37281h4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (eoVar.L6 != 0 && !zArr3[1]) {
                    eoVar.G6 = true;
                    arrayList.add(Integer.valueOf(eoVar.V5));
                    MessagesController messagesController3 = eoVar.getMessagesController();
                    long j16 = eoVar.L6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = eoVar.classGuid;
                    int i28 = eoVar.R3;
                    long j17 = eoVar.f37232d4;
                    int i29 = eoVar.f37341m4;
                    int i30 = eoVar.V5;
                    eoVar.V5 = i30 + 1;
                    messagesController3.loadMessages(j16, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j17, i29, i30, eoVar.f37281h4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i12 > 0 && !eoVar.I7 && i11 <= 10) {
            if (eoVar.L6 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(eoVar.V5));
                MessagesController messagesController4 = eoVar.getMessagesController();
                long j18 = eoVar.L6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = eoVar.classGuid;
                int i34 = eoVar.R3;
                long j19 = eoVar.f37232d4;
                int i35 = eoVar.f37341m4;
                int i36 = eoVar.V5;
                eoVar.V5 = i36 + 1;
                messagesController4.loadMessages(j18, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j19, i35, i36, eoVar.f37281h4);
                eoVar.I7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(eoVar.V5));
                MessagesController messagesController5 = eoVar.getMessagesController();
                long j20 = eoVar.T5;
                long j21 = eoVar.L6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = eoVar.classGuid;
                int i40 = eoVar.R3;
                long j22 = eoVar.f37232d4;
                int i41 = eoVar.f37341m4;
                int i42 = eoVar.V5;
                eoVar.V5 = i42 + 1;
                messagesController5.loadMessages(j20, j21, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j22, i41, i42, eoVar.f37281h4);
                eoVar.I7 = true;
            }
        }
    }

    public static void x0(eo eoVar) {
        if (!eoVar.h7(eoVar.Y.getSendButton())) {
            if (eoVar.getMediaController().isPlayingMessage(eoVar.f37233d5)) {
                eoVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = eoVar.getMessagesController().getInputPeer(eoVar.T5);
            if (eoVar.f37247e5 != null) {
                for (int i10 = 0; i10 < eoVar.f37247e5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f19918id.add(Integer.valueOf(eoVar.f37247e5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f19918id.add(Integer.valueOf(eoVar.f37233d5.getId()));
            }
            ConnectionsManager.getInstance(eoVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ai.v1(28, eoVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void x1(eo eoVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, ag agVar) {
        if (eoVar.f37233d5 != null && i10 < arrayList.size() && eoVar.getParentActivity() != null) {
            org.telegram.ui.Components.g51.K(eoVar.getParentActivity(), eoVar, inputPeer, iArr[0], eoVar.f37233d5.summarized, "und", str, charSequence, z10, agVar, new vf(eoVar, 15)).setDimBehind(false);
            eoVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(eoVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + eoVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + eoVar.a(), i11 - 1).apply();
                eoVar.Uc(true);
            }
        }
    }

    public static void y0(eo eoVar, View view, int i10) {
        org.telegram.ui.Components.b6 b6Var;
        TLRPC.User user;
        char c10;
        vk vkVar;
        vk vkVar2;
        if (i10 != 0) {
            gg.j1 adapter = eoVar.I1.getAdapter();
            if (adapter.f10692w0 != null && !adapter.f10674h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = eoVar.I1.getAdapter().J(i11);
            int i12 = eoVar.I1.getAdapter().X;
            int i13 = eoVar.I1.getAdapter().Y;
            if (eoVar.I1.getAdapter().F != null && i11 == 1) {
                eoVar.Y.R0(i12, i13, eoVar.I1.getAdapter().F + "@" + ChatObject.getPublicUsername(eoVar.f37241e) + " ", false);
            } else if (eoVar.I1.getAdapter().F != null && i11 == 0) {
                eoVar.Y.R0(i12, i13, a1.g.t(new StringBuilder(), eoVar.I1.getAdapter().F, " "), false);
            } else if (J instanceof hg.b2) {
                if (!eoVar.getUserConfig().isPremium()) {
                    eoVar.showDialog(new rg.y0(eoVar, eoVar.getParentActivity(), eoVar.currentAccount, true, 31, false, null));
                    return;
                }
                hg.b2 b2Var = (hg.b2) J;
                org.telegram.ui.Components.g5.Z(eoVar.currentAccount, Math.max(1, b2Var.a()), eoVar.T5, new tc(2, eoVar, b2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (eoVar.R3 != 0 || !eoVar.h7(view)) {
                        if (view instanceof org.telegram.ui.Cells.d8) {
                            sendAnimationData = ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.g5.Z(eoVar.currentAccount, 1, eoVar.a(), new wa(eoVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), eoVar.I1.getAdapter().L(i11), sendAnimationData, 1));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (eoVar.f37354n3 && (vkVar2 = eoVar.R2) != null && vkVar2.getVisibility() == 0) {
                        eoVar.db(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        eoVar.Y.R0(i12, i13, a1.g.q("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (eoVar.f37354n3 && (vkVar = eoVar.R2) != null && vkVar.getVisibility() == 0) {
                        eoVar.db(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        eoVar.Y.R0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(sc.v.v(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.b71("" + user2.f19949id, 3, null), 0, spannableString.length(), 33);
                        eoVar.Y.R0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof gg.g1) {
                    if (eoVar.I1.getAdapter().J != null && eoVar.R3 != 1) {
                        gg.g1 g1Var = (gg.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f10610a, eoVar.T5, eoVar.f37356n5, eoVar.X3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = eoVar.H8();
                        of2.ephemeralReceiverBotId = g1Var.f10611b;
                        of2.monoForumPeer = eoVar.S8();
                        of2.suggestionParams = eoVar.f37271g5;
                        eoVar.getSendMessagesHelper().sendMessage(of2);
                        eoVar.Y.setFieldText("");
                        eoVar.j9(false);
                    }
                } else if (J instanceof String) {
                    if (eoVar.I1.getAdapter().J != null) {
                        if (eoVar.R3 == 1) {
                            org.telegram.ui.Components.g5.L(eoVar.getParentActivity(), eoVar.T5, new o(8, eoVar, (String) J), eoVar.f37251ea);
                            return;
                        } else if (!eoVar.h7(view)) {
                            org.telegram.ui.Components.g5.Z(eoVar.currentAccount, 1, eoVar.T5, new tc(3, eoVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    eoVar.Y.R0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (eoVar.Y.getFieldText() != null) {
                        if (eoVar.R3 == 1 || !eoVar.h7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (eoVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37251ea);
                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    eoVar.showDialog(alertDialog$Builder.f20141a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(eoVar.I1.getAdapter().R);
                                eoVar.Ia = arrayList;
                                PhotoViewer.t1().K2(null, eoVar, eoVar.f37251ea);
                                PhotoViewer.t1().g2(arrayList, eoVar.I1.getAdapter().M(i11), 3, false, eoVar.Ja, eoVar);
                                return;
                            }
                            org.telegram.ui.Components.g5.Z(eoVar.currentAccount, 1, eoVar.a(), new tc(4, eoVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6(26, eoVar, (TLRPC.TL_inlineBotWebView) J);
                    if (eoVar.f37312jb) {
                        f6Var.run();
                    } else {
                        pj1.a(eoVar.getParentActivity(), new tc(6, eoVar, f6Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    kk kkVar = eoVar.I1;
                    if (kkVar != null && (user = kkVar.getAdapter().f10692w0) != null) {
                        eoVar.Y.setFieldText("");
                        long j3 = eoVar.T5;
                        if (j3 == user.f19949id) {
                            eoVar.f37261f8 = j3;
                            eoVar.getMessagesController().sendBotStart(eoVar.f37253f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f19949id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", eoVar.T5);
                        if (eoVar.getMessagesController().checkCanOpenChat(bundle, eoVar)) {
                            eoVar.presentFragment(new eo(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    sk skVar = eoVar.Y;
                    skVar.V();
                    skVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            eoVar.Y.R0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = eoVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e7) {
                                FileLog.e((Throwable) e7, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.s5.f(eoVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                b6Var = new org.telegram.ui.Components.b6(f7, fontMetricsInt);
                            } else {
                                b6Var = new org.telegram.ui.Components.b6(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(b6Var, 0, spannableString2.length(), 33);
                            eoVar.Y.R0(i12, i13, spannableString2, false);
                            eoVar.I1.o(false);
                        }
                    }
                    eoVar.Y.R0(i12, i13, str, true);
                    eoVar.I1.o(false);
                }
            }
        }
    }

    public static void y1(eo eoVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = eoVar.f37356n5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = eoVar.f37372ob;
            if (i10 == 5) {
                int i11 = eoVar.currentAccount;
                long j3 = eoVar.T5;
                MessageSuggestionParams messageSuggestionParams = eoVar.f37271g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new yh.c0(context, i11, j3, messageSuggestionParams, eoVar, eoVar.getResourceProvider(), 0, new gf(eoVar, 4)).show();
            } else if (i10 == 1 && (messageObject = eoVar.p5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = eoVar.f37271g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    eoVar.Xb(messageSuggestionParams2);
                } else if (eoVar.p5.canEditMedia() && eoVar.f37367o5 == 0) {
                    if (eoVar.J1 == null) {
                        eoVar.H7();
                    }
                    eoVar.J1.L1(eoVar.p5, -1);
                    eoVar.ca();
                } else {
                    eoVar.F(eoVar.p5.getId(), 0, 0, 0, true, true);
                }
            } else if (eoVar.f37259f5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(eoVar.T5) && !eoVar.f37259f5.hasSecretMessages && eoVar.R3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        eoVar.ha(0);
                        return;
                    }
                    MessageObject messageObject3 = eoVar.f37356n5;
                    if (messageObject3 != null) {
                        eoVar.F(messageObject3.getId(), 0, 0, 0, true, true);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    eoVar.ha(1);
                } else if (i10 == 4) {
                    eoVar.ha(2);
                }
            }
        }
    }

    public static void z0(eo eoVar, long j3, boolean z10) {
        if (!eoVar.H4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eoVar.currentAccount).edit();
            edit.putInt("pin_" + eoVar.T5, ((Integer) eoVar.H4.get(0)).intValue()).commit();
            eoVar.H4.clear();
            eoVar.J4.clear();
            eoVar.L4 = 0;
            eoVar.P4 = 0;
            eoVar.Q4 = 0;
            eoVar.Cc(0, true);
        }
        if (ChatObject.isMonoForum(eoVar.f37241e) && ChatObject.canManageMonoForum(eoVar.currentAccount, eoVar.f37241e)) {
            if (j3 != 0) {
                eoVar.getMessagesStorage().removeTopic(-eoVar.f37241e.f19802id, j3);
                eoVar.getMessagesController().deleteSavedDialog(j3, eoVar.getMessagesController().getInputPeer(-eoVar.f37241e.f19802id));
                eoVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(eoVar.f37241e.f19802id, j3);
            }
        } else {
            eoVar.getMessagesController().deleteDialog(eoVar.T5, 1, z10);
            eoVar.getMessagesStorage().removeAllTopics(eoVar.T5);
            eoVar.getMessagesController().getTopicsController().reloadTopics(-eoVar.T5);
        }
        eoVar.M5.put(j3, 0);
        org.telegram.ui.Components.h41 h41Var = eoVar.R1;
        if (h41Var != null) {
            h41Var.setAllTopicsHidden(false);
        }
        if (j3 == eoVar.f37232d4) {
            eoVar.B7(false, null);
            eoVar.A0.O(false);
        }
    }

    public static void z1(eo eoVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        eo eoVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        hh.a aVar = eoVar.Qb;
        if (num.intValue() != eoVar.d()) {
            eoVar.nc = false;
            pf pfVar = eoVar.Nb;
            if (pfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(pfVar);
                eoVar.Nb.run();
                eoVar.Nb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.h41 h41Var = eoVar.R1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(h41Var.f26636b).getTopicsController().getTopics(-h41Var.f26638c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f19854id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = eoVar.getMessagesController().getTopicsController().findTopic(-eoVar.a(), tL_forumTopic.f19854id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                eoVar.f37199ab = SystemClock.uptimeMillis();
                eoVar.f37380p7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    eoVar.Wa(eoVar.d());
                } else if (eoVar.d() == 0) {
                    eoVar.Wa(num.intValue());
                } else {
                    eoVar.f37358n7 = -1;
                }
                eoVar.getConnectionsManager().cancelRequestsForGuid(eoVar.classGuid);
                eoVar.getMessagesStorage().cancelTasksForGuid(eoVar.classGuid);
                eoVar.classGuid = ConnectionsManager.generateClassGuid();
                eoVar.Ta();
                eoVar.f37259f5 = null;
                eoVar.f37445u7 = 0;
                eoVar.f37321k7 = false;
                eoVar.f37332l7 = true;
                eoVar.f37283h6.clear();
                eoVar.f37215c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(eoVar.getCurrentAccount(), message, false, false));
                    eoVar2 = eoVar;
                    eoVar2.tb(arrayList, eoVar.f37241e, tL_forumTopic2.f19854id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    eoVar2 = eoVar;
                    eoVar2.f37220c4 = null;
                    eoVar2.f37192a4 = null;
                    eoVar2.X3 = null;
                    eoVar2.f37356n5 = null;
                    eoVar2.f37318k4 = 0;
                    eoVar2.l4 = 0;
                    eoVar2.f37341m4 = 0;
                    eoVar2.f37232d4 = 0L;
                    eoVar2.f37246e4 = 0;
                    eoVar2.f37258f4 = null;
                    eoVar2.f37281h4 = false;
                    eoVar2.f37270g4 = false;
                }
                qm qmVar = eoVar2.A0;
                if (qmVar != null) {
                    if (qmVar.I >= 0 && !qmVar.N()) {
                        qm qmVar2 = eoVar2.A0;
                        qmVar2.u(qmVar2.I);
                    } else {
                        qm qmVar3 = eoVar2.A0;
                        if (qmVar3.I < 0 && qmVar3.N()) {
                            eoVar2.A0.o(0);
                        }
                    }
                    eoVar2.A0.T();
                }
                eoVar2.v8();
                eoVar2.Rc(true);
                eoVar2.f37190a1.o(true);
                if (tL_forumTopic2 != null) {
                    eoVar2.Xc();
                } else {
                    eoVar2.f37190a1.b();
                }
                eoVar2.R1.setCurrentTopic(eoVar2.d());
                eoVar2.Uc(true);
                eoVar2.lc(true);
                eoVar2.getMessagesController().setForumLastTopicId(-eoVar2.a(), eoVar2.d());
                eoVar2.Ia();
                eoVar2.k9(true);
                eoVar2.j9(true);
                eoVar2.D6(true, true);
                if (eoVar2.Y != null) {
                    if (!UserObject.isBotForum(eoVar2.f37253f)) {
                        eoVar2.Y.n0(false);
                    }
                    eoVar2.Y.J1(true);
                }
                if (tL_forumTopic2 != null) {
                    eoVar2.getMessagesController().getTopicsController().getTopicRepliesCount(eoVar2.T5, tL_forumTopic2.f19854id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                eoVar2.l1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                eoVar2.f37338m1 = i11;
                eoVar2.Fc(false);
                eoVar2.Ec(false);
                eoVar2.Vc();
                vn vnVar = eoVar2.f37373oc;
                if (vnVar != null && eoVar2.actionBar.f21060n0) {
                    vnVar.p(null);
                }
                if (UserObject.isBotForum(eoVar2.f37253f)) {
                    eoVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(eoVar2.T5, num.intValue()), true);
                }
            }
        }
    }

    public static boolean z9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    @Override
    public final List A() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f37241e)) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f37188a;
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
        if (this.f37253f == null) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new t0("", 1)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.d2(this)));
        }
        return arrayList;
    }

    public final void A6(MessageObject messageObject, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        int i10;
        boolean z13;
        boolean z14;
        float f7;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i14;
        boolean z15;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        TLRPC.Chat chat;
        boolean z16;
        char c11;
        boolean z17;
        int i25;
        char c12;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z18;
        boolean z19;
        char c13;
        TLRPC.Message message;
        boolean z20;
        TLRPC.Message message2;
        boolean z21;
        boolean z22;
        boolean z23;
        int i32 = this.f37208b6;
        if (messageObject != null) {
            ArrayList arrayList = this.f37192a4;
            if (arrayList == null || !arrayList.contains(messageObject) || K9()) {
                if (messageObject.getDialogId() == this.T5) {
                    c13 = 0;
                } else {
                    c13 = 1;
                }
                if (z10 && messageObject.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f37484x6.f(messageObject.getGroupId());
                    if (groupedMessages != null) {
                        boolean z24 = false;
                        int i33 = 0;
                        for (int i34 = 0; i34 < groupedMessages.messages.size(); i34++) {
                            if (this.W5[c13].indexOfKey(groupedMessages.messages.get(i34).getId()) < 0) {
                                i33 = i34;
                                z24 = true;
                            }
                        }
                        for (int i35 = 0; i35 < groupedMessages.messages.size(); i35++) {
                            MessageObject messageObject2 = groupedMessages.messages.get(i35);
                            if (z24) {
                                if (this.W5[c13].indexOfKey(messageObject2.getId()) < 0) {
                                    if (i35 == i33) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    A6(messageObject2, false, z23);
                                }
                            } else {
                                if (i35 == groupedMessages.messages.size() - 1) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                A6(messageObject2, false, z22);
                            }
                            if (!TextUtils.isEmpty(messageObject2.caption)) {
                                Yb(messageObject);
                            }
                        }
                        return;
                    }
                    return;
                } else if (this.W5[c13].indexOfKey(messageObject.getId()) >= 0) {
                    this.W5[c13].remove(messageObject.getId());
                    if (!F9()) {
                        if ((messageObject.type == 0 || messageObject.isAnimatedEmoji() || messageObject.caption != null) && ((message2 = messageObject.messageOwner) == null || !message2.noforwards)) {
                            this.X5[c13].remove(messageObject.getId());
                        }
                        if (!messageObject.isAnimatedEmoji() && ((messageObject.isSticker() || messageObject.isAnimatedSticker()) && MessageObject.isStickerHasSet(messageObject.getDocument()))) {
                            this.Y5[c13].remove(messageObject.getId());
                        }
                        if (messageObject.canEditMessage(this.f37241e)) {
                            this.f37234d6--;
                        }
                        if (this.R3 == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (!messageObject.canDeleteMessage(z21, this.f37241e)) {
                            this.f37194a6--;
                        }
                        boolean D9 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D9) {
                            this.f37208b6--;
                        } else {
                            this.f37222c6--;
                        }
                        if (messageObject.isMusic() && !D9) {
                            this.f37260f6--;
                        } else if (messageObject.isDocument() && !D9) {
                            this.f37272g6--;
                        } else {
                            this.f37248e6--;
                        }
                    }
                } else if (this.W5[1].size() + this.W5[0].size() >= 100) {
                    AndroidUtilities.shakeView(this.f37203b1);
                    Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                        return;
                    }
                    return;
                } else {
                    this.W5[c13].put(messageObject.getId(), messageObject);
                    if (!F9()) {
                        if ((messageObject.type == 0 || messageObject.isAnimatedEmoji() || messageObject.caption != null) && ((message = messageObject.messageOwner) == null || !message.noforwards)) {
                            this.X5[c13].put(messageObject.getId(), messageObject);
                        }
                        if (!messageObject.isAnimatedEmoji() && ((messageObject.isSticker() || messageObject.isAnimatedSticker()) && MessageObject.isStickerHasSet(messageObject.getDocument()))) {
                            this.Y5[c13].put(messageObject.getId(), messageObject);
                        }
                        if (messageObject.canEditMessage(this.f37241e)) {
                            this.f37234d6++;
                        }
                        if (this.R3 == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (!messageObject.canDeleteMessage(z20, this.f37241e)) {
                            this.f37194a6++;
                        }
                        boolean D92 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D92) {
                            this.f37208b6++;
                        } else {
                            this.f37222c6++;
                        }
                        if (messageObject.isMusic() && !D92) {
                            this.f37260f6++;
                        } else if (!messageObject.isDocument() || messageObject.isRoundOnce() || messageObject.isVoiceOnce() || D92) {
                            this.f37248e6++;
                        } else {
                            this.f37272g6++;
                        }
                        if (z10) {
                            Yb(messageObject);
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (z11 && this.actionBar.u() && !F9()) {
            int size = this.W5[1].size() + this.W5[0].size();
            if (size == 0) {
                h9();
                Cc(0, true);
            } else {
                G7();
                org.telegram.ui.ActionBar.u0 k10 = this.actionBar.k(null).k(25);
                org.telegram.ui.ActionBar.u0 k11 = this.actionBar.k(null).k(10);
                org.telegram.ui.ActionBar.u0 k12 = this.actionBar.k(null).k(22);
                org.telegram.ui.ActionBar.u0 k13 = this.actionBar.k(null).k(23);
                org.telegram.ui.ActionBar.u0 k14 = this.actionBar.k(null).k(11);
                org.telegram.ui.ActionBar.u0 k15 = this.actionBar.k(null).k(12);
                org.telegram.ui.ActionBar.u0 k16 = this.actionBar.k(null).k(28);
                org.telegram.ui.ActionBar.u0 k17 = this.actionBar.k(null).k(69);
                if (!D9() && !f9()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                float f10 = 0.5f;
                if ((i32 == 0 && this.f37208b6 != 0) || (i32 != 0 && this.f37208b6 == 0)) {
                    this.T4 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (k14 != null) {
                        if (this.f37208b6 != 0 && !z12) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        k14.setEnabled(z19);
                        Property property = View.ALPHA;
                        if (this.f37208b6 == 0) {
                            f10 = 1.0f;
                        }
                        arrayList2.add(ObjectAnimator.ofFloat(k14, property, f10));
                        if (z12 && k14.getBackground() != null) {
                            k14.setBackground(null);
                        } else if (k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f20965z8), 5, -1));
                        }
                    }
                    jh.c cVar = this.P0;
                    if (cVar != null) {
                        if (this.f37208b6 != 0 && !z12) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        ci.u5 u5Var = cVar.f14173c;
                        ((me.b) u5Var.d).a(z18, true);
                        ((ih.a) u5Var.f6063a).setEnabled(z18);
                    }
                    this.T4.playTogether(arrayList2);
                    c10 = 1;
                    i10 = size;
                    this.T4.setDuration(100L);
                    this.T4.addListener(new bj(this, 9));
                    this.T4.start();
                } else {
                    c10 = 1;
                    i10 = size;
                    if (k14 != null) {
                        if (this.f37208b6 != 0 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        k14.setEnabled(z14);
                        if (this.f37208b6 == 0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        k14.setAlpha(f7);
                        if (!z12 && k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f20965z8), 3, -1));
                        }
                    }
                    jh.c cVar2 = this.P0;
                    if (cVar2 != null) {
                        if (this.f37208b6 != 0 && !z12) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        ci.u5 u5Var2 = cVar2.f14173c;
                        ((me.b) u5Var2.d).a(z13, false);
                        ((ih.a) u5Var2.f6063a).setEnabled(z13);
                    }
                }
                if (k10 != null) {
                    int i36 = this.f37260f6;
                    if (((i36 > 0 && this.f37272g6 == 0) || (i36 == 0 && this.f37272g6 > 0)) && this.f37248e6 == 0) {
                        i30 = 0;
                    } else {
                        i30 = 8;
                    }
                    k10.setVisibility(i30);
                    if (this.f37260f6 > 0) {
                        i31 = R.string.SaveToMusic;
                    } else {
                        i31 = R.string.SaveToDownloads;
                    }
                    k10.setContentDescription(LocaleController.getString(i31));
                }
                if (k11 != null) {
                    k11.getVisibility();
                    if (!z12 && this.X5[c10].size() + this.X5[0].size() != 0) {
                        i29 = 0;
                    } else {
                        i29 = 8;
                    }
                    k11.setVisibility(i29);
                    k11.getVisibility();
                }
                if (k12 != null) {
                    k12.getVisibility();
                    if (getMediaDataController().canAddStickerToFavorites()) {
                        i11 = i10;
                        if (this.Y5[c10].size() + this.Y5[0].size() == i11) {
                            i28 = 0;
                            k12.setVisibility(i28);
                            k12.getVisibility();
                        }
                    } else {
                        i11 = i10;
                    }
                    i28 = 8;
                    k12.setVisibility(i28);
                    k12.getVisibility();
                } else {
                    i11 = i10;
                }
                if (k15 != null) {
                    if (this.f37194a6 == 0) {
                        i27 = 0;
                    } else {
                        i27 = 8;
                    }
                    k15.setVisibility(i27);
                }
                this.Z5 = false;
                int i37 = 0;
                while (true) {
                    if (i37 >= 2) {
                        break;
                    }
                    int i38 = 0;
                    while (true) {
                        if (i38 >= this.Y5[i37].size()) {
                            break;
                        }
                        MessageObject messageObject3 = (MessageObject) this.Y5[i37].valueAt(i38);
                        if (messageObject3 != null && !getMediaDataController().isStickerInFavorites(messageObject3.getDocument())) {
                            this.Z5 = true;
                            break;
                        }
                        i38++;
                    }
                    if (this.Z5) {
                        break;
                    }
                    i37++;
                }
                if (k12 != null) {
                    if (this.Z5) {
                        i26 = R.drawable.msg_fave;
                    } else {
                        i26 = R.drawable.msg_unfave;
                    }
                    k12.setIcon(i26);
                }
                if (this.f37234d6 == 1 && i11 == 1) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                if (this.P0 != null) {
                    wk wkVar = this.O0;
                    if ((wkVar != null && wkVar.getVisibility() == 0 && !this.I0) || ((chat = this.f37241e) != null && ((ChatObject.isNotInChat(chat) && !K9()) || ((ChatObject.isChannel(this.f37241e) && !ChatObject.canPost(this.f37241e) && !this.f37241e.megagroup) || !ChatObject.canSendMessages(this.f37241e))))) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (this.R3 == 1 || !z16 || (this.W5[0].size() != 0 && this.W5[1].size() != 0)) {
                        u0Var = k10;
                        c11 = '\b';
                    } else if (i11 == 1) {
                        char c14 = 0;
                        int size2 = this.W5[0].size();
                        int i39 = 0;
                        while (true) {
                            if (i39 < size2) {
                                MessageObject messageObject4 = (MessageObject) this.W5[c14].valueAt(i39);
                                if (ChatObject.isForum(this.f37241e) && !I6(messageObject4)) {
                                    c12 = '\b';
                                    break;
                                } else {
                                    i39++;
                                    c14 = 0;
                                }
                            } else {
                                c12 = 0;
                                break;
                            }
                        }
                        u0Var = k10;
                        c11 = c12;
                    } else {
                        long j3 = 0;
                        int i40 = 0;
                        c11 = 0;
                        for (i12 = 2; i40 < i12; i12 = 2) {
                            int size3 = this.W5[i40].size();
                            int i41 = 0;
                            while (true) {
                                u0Var = k10;
                                if (i41 < size3) {
                                    MessageObject messageObject5 = (MessageObject) this.W5[i40].valueAt(i41);
                                    long groupId = messageObject5.getGroupId();
                                    if (groupId == 0 || (j3 != 0 && j3 != groupId)) {
                                        break;
                                    }
                                    i25 = i40;
                                    if (ChatObject.isForum(this.f37241e) && !I6(messageObject5)) {
                                        break;
                                    }
                                    i41++;
                                    k10 = u0Var;
                                    j3 = groupId;
                                    i40 = i25;
                                } else {
                                    i25 = i40;
                                    break;
                                }
                            }
                            i25 = i40;
                            c11 = '\b';
                            if (c11 == '\b') {
                                break;
                            }
                            i40 = i25 + 1;
                            k10 = u0Var;
                        }
                        u0Var = k10;
                    }
                    if (this.f37192a4 != null && c11 == 0) {
                        z15 = 0;
                        int size4 = this.W5[0].size();
                        for (int i42 = 0; i42 < size4; i42++) {
                            if (this.f37192a4.contains((MessageObject) this.W5[0].valueAt(i42))) {
                                c11 = '\b';
                            }
                        }
                    } else {
                        z15 = 0;
                    }
                    jh.c cVar3 = this.P0;
                    if (c11 == 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    i14 = 1;
                    ((me.b) cVar3.f14172b.f6065c).a(z17, true);
                } else {
                    u0Var = k10;
                    i14 = 1;
                    z15 = 0;
                }
                if (k13 != null) {
                    k13.setVisibility(i13);
                }
                if (k17 != null) {
                    if (i11 == i14 && !z12) {
                        i23 = i14;
                    } else {
                        i23 = z15;
                    }
                    if (i23 != 0) {
                        int i43 = z15;
                        for (int i44 = i43; i44 < 2; i44++) {
                            for (int i45 = z15; i45 < this.W5[i44].size(); i45++) {
                                MessageObject messageObject6 = (MessageObject) this.W5[i44].valueAt(i45);
                                if (messageObject6 != null && !messageObject6.isVoiceOnce() && !messageObject6.isRoundOnce() && !messageObject6.messageOwner.noforwards && (messageObject6.isVoice() || messageObject6.isRoundVideo())) {
                                    i43 = i14;
                                }
                            }
                        }
                        i23 = i43;
                    }
                    if (i23 != 0) {
                        i24 = z15;
                    } else {
                        i24 = 8;
                    }
                    k17.setVisibility(i24);
                }
                if (k16 != null) {
                    if (getUserConfig().isPremium()) {
                        if (k13 != null && k13.getVisibility() == 0) {
                            i16 = i14;
                        } else {
                            i16 = z15;
                        }
                        if (k14 != null && k14.getVisibility() == 0) {
                            i17 = i14;
                        } else {
                            i17 = z15;
                        }
                        int i46 = i16 + i17;
                        if (u0Var != null && u0Var.getVisibility() == 0) {
                            i18 = i14;
                        } else {
                            i18 = z15;
                        }
                        int i47 = i46 + i18;
                        if (k11 != null && k11.getVisibility() == 0) {
                            i19 = i14;
                        } else {
                            i19 = z15;
                        }
                        int i48 = i47 + i19;
                        if (k15 != null && k15.getVisibility() == 0) {
                            i20 = i14;
                        } else {
                            i20 = z15;
                        }
                        int i49 = i48 + i20;
                        if (k12 != null && k12.getVisibility() == 0) {
                            i21 = i14;
                        } else {
                            i21 = z15;
                        }
                        int i50 = i49 + i21;
                        if (k17 != null && k17.getVisibility() == 0) {
                            i22 = i14;
                        } else {
                            i22 = z15;
                        }
                        if (i50 + i22 < 4) {
                            i15 = z15;
                            k16.setVisibility(i15);
                        }
                    }
                    i15 = 8;
                    k16.setVisibility(i15);
                }
            }
        }
        Pc();
    }

    public final void A7(boolean z10) {
        boolean z11;
        this.f37444u6.clear();
        this.f37405r6.clear();
        this.f37419s6.clear();
        this.f37283h6.clear();
        this.f37484x6.b();
        this.f37293i4 = false;
        qm qmVar = this.A0;
        if (qmVar != null) {
            if (qmVar.f41351w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Tb(z11);
        }
        ak akVar = this.f37478x0;
        if (akVar != null) {
            akVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f37368o6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f37508z6;
            int[] iArr2 = this.f37496y6;
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
        this.f37445u7 = 0;
        this.f37433t7 = false;
        this.K6 = 0;
        this.J7 = null;
        this.D7 = 0;
        this.E7 = false;
        this.A7 = false;
        qm qmVar2 = this.A0;
        if (qmVar2 != null && !qmVar2.N) {
            qmVar2.O(false);
        }
    }

    public final TLRPC.ChatFull A8() {
        return this.Z7;
    }

    public final boolean A9() {
        if (!ChatObject.isForum(this.f37241e) || this.f37281h4) {
            if (ChatObject.isMonoForum(this.f37241e) && d() == 0 && !this.T3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Aa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Aa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ab(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new sf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20799q7));
        }
    }

    public final void Ac() {
        jh.h hVar = this.f37303j1;
        vj vjVar = this.v;
        if (hVar != null) {
            this.f37303j1.setTranslationY((((-vjVar.d()) - this.S.getInputBubbleHeight()) - b9(org.telegram.ui.Components.d41.f25240c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f37229d1 != null) {
            this.f37229d1.setTranslationY((-vjVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    public final void B6() {
        this.f37271g5 = null;
        if (this.f37232d4 == 0 || this.f37281h4) {
            if (this.f37281h4) {
                this.f37356n5 = this.X3;
            } else {
                this.f37356n5 = null;
            }
            this.f37330l5 = null;
            sk skVar = this.Y;
            if (skVar != null) {
                skVar.n1(null, null, null);
            }
        }
        j9(false);
        if (this.R3 == 0) {
            getMediaDataController().cleanDraft(this.T5, this.f37232d4, true);
        }
    }

    public final void B7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f37508z6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.H6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.v0.o(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.D7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.E6[0] = false;
            this.F6 = false;
            qm qmVar = this.A0;
            if (qmVar != null && qmVar.F < 0) {
                qmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f37307j6 = i12;
            this.f37331l6 = dialog2.unread_mentions_count;
            if (this.f37320k6 != i12) {
                jh.h hVar = this.f37303j1;
                if (hVar != null) {
                    hVar.c(1, i12, this.N5);
                }
                this.f37320k6 = this.f37307j6;
                zc();
            }
            int i13 = this.f37331l6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f37331l6 = i14;
                if (i14 <= 0) {
                    this.f37331l6 = 0;
                    this.f37343m6 = true;
                    Ob(false);
                } else {
                    jh.h hVar2 = this.f37303j1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Ob(true);
                }
            }
            d7(false);
            return;
        }
        this.f37444u6.clear();
        this.f37283h6.clear();
        this.f37405r6.clear();
        this.f37419s6.clear();
        this.f37484x6.b();
        this.f37293i4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f37368o6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f37496y6;
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
        h9();
        Cc(0, true);
        if (this.f37333l8 != null) {
            this.f37333l8 = null;
            sk skVar = this.Y;
            if (skVar != null) {
                skVar.b1(null, true, false);
            }
        }
        if (this.P != null) {
            Tb(false);
            J7(false);
            this.f37478x0.setEmptyView(this.Q0);
        }
        qm qmVar2 = this.A0;
        if (qmVar2 != null) {
            qmVar2.O(false);
        }
        if (this.h == null && (user = this.f37253f) != null && user.bot && this.f37249e8 == null) {
            this.f37249e8 = "";
            lc(false);
        }
    }

    public final TLRPC.UserFull B8() {
        return this.f37196a8;
    }

    public final boolean B9() {
        return UserObject.isBotForum(this.f37253f);
    }

    public final void Ba(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        org.telegram.ui.Components.z11 z11Var;
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
                    of.f.q(getParentActivity(), Uri.parse(str), true, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f37261f8 == 0) {
                        z12 = true;
                    }
                    of.f.q(parentActivity, parse, z12, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f37261f8 == 0) {
                        z12 = true;
                    }
                    of.f.q(parentActivity2, parse2, z12, true, P9(u1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.q0(this, str, true, true, false, false, P9(u1Var, characterStyle), null, this.f37251ea);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.a71) && (z11Var = ((org.telegram.ui.Components.a71) characterStyle).f24247a) != null && (z11Var.f33249a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f37251ea);
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
        if (characterStyle instanceof org.telegram.ui.Components.a71) {
            z12 = true;
        }
        org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f37251ea);
    }

    public final void Bb() {
        TLRPC.Chat chat = this.f37241e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f37241e)) {
                    s60 s60Var = new s60(a());
                    s60Var.f37736l0 = this;
                    presentFragment(s60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f37241e)) {
                fd fdVar = new fd(a());
                fdVar.f37736l0 = this;
                presentFragment(fdVar);
                return;
            } else {
                return;
            }
        }
        this.f37212ba = new org.telegram.ui.Components.eq(this, this.f37251ea);
        this.f37478x0.setOnInterceptTouchListener(new m4.r0(28));
        nb(this.X0, false);
        showDialog(this.f37212ba, new ue(this, 1));
    }

    public final void Bc(boolean z10) {
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
        if ((!K9() || this.f37281h4) && this.L2 != null) {
            if (!this.O5) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.H4.size() > 1 && !this.I2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.L2.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.K2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.J2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr == null && !this.Bb && !this.I2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.Bb && !this.I2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.Bb && !this.I2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.M2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.M2 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.L2.setVisibility(0);
                    } else if (z14) {
                        this.J2.setVisibility(0);
                    }
                    if (z16) {
                        this.K2.setVisibility(0);
                        this.K2.setAlpha(0.0f);
                        this.K2.setScaleX(0.4f);
                        this.K2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M2 = animatorSet2;
                    ImageView imageView = this.L2;
                    Property property = View.ALPHA;
                    if (z15) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.L2;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.L2;
                    Property property3 = View.SCALE_Y;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    z17 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.J2;
                    if (z14) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.J2;
                    if (z14) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.J2;
                    if (z14) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.K2;
                    if (!z16) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.K2;
                    if (!z16) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.K2;
                    if (!z16) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.M2.setInterpolator(org.telegram.ui.Components.js.h);
                    this.M2.setDuration(360L);
                    this.M2.addListener(new dm(this, z14, z15, z16));
                    this.M2.start();
                } else {
                    num = 1;
                    z17 = false;
                    ImageView imageView7 = this.J2;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView7.setAlpha(f7);
                    ImageView imageView8 = this.J2;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.J2;
                    if (z14) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.J2;
                    if (z14) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.L2;
                    if (z15) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.L2;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.L2;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.L2;
                    if (z15) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.K2;
                    if (z16) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.K2;
                    if (z16) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.K2;
                    if (z16) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.K2;
                    if (z16) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.J2;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.L2;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.K2;
                if (z16) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.f37504z2 != null) {
                if (K9() && !this.f37281h4) {
                    boolean z18 = z17;
                    this.f37504z2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.f37504z2.c((this.H4.size() - 1) - Collections.binarySearch(this.H4, Integer.valueOf(this.L4), Comparator$CC.reverseOrder()), this.H4.size(), z11);
            }
        }
    }

    @Override
    public final void C(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            qh.c cVar = this.Cc;
            if (cVar != null) {
                this.X0.removeView(cVar);
                this.Cc = null;
            }
            sk skVar = this.Y;
            if (skVar != null) {
                skVar.J0();
            }
        }
    }

    public final void C6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f37251ea);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        a2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            a2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            a2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(a2Var);
    }

    public final void C7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.W5[i10].clear();
            this.X5[i10].clear();
            this.Y5[i10].clear();
        }
        h9();
        Cc(0, true);
        ad(z10);
        Pc();
    }

    public final ArrayList C8() {
        qm qmVar = this.A0;
        if (qmVar != null) {
            return qmVar.P;
        }
        return null;
    }

    public boolean C9() {
        if (this.X0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ca(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Ca(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Cb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.tn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Cb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.tn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Cc(int r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Cc(int, boolean):void");
    }

    public final void D6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        tn tnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        tn tnVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j11;
        org.telegram.ui.Components.z11 z11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.b6 b6Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        Long l10;
        if (this.Y != null) {
            int i11 = this.R3;
            char c10 = '\b';
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == N8())) {
                long j13 = 0;
                if (this.R3 == 8) {
                    if (ChatObject.isMonoForum(this.f37241e)) {
                        if (this.f37232d4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f37241e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.z11 z11Var2 = null;
                if (A9()) {
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
                        j3 = this.f37232d4;
                    }
                    draft = mediaDataController.getDraft(j14, j3);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                sk skVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                skVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.T5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j15 = this.T5;
                    if (l4 != null) {
                        j12 = l4.longValue();
                    } else {
                        j12 = this.f37232d4;
                    }
                    message = mediaDataController2.getDraftMessage(j15, j12);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.R3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f37200ac >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        j9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f37200ac = draftMessage3.date;
                    sk skVar2 = this.Y;
                    skVar2.X2 = null;
                    skVar2.Y2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i12 = 0;
                        while (i12 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i12);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
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
                                z11Var = null;
                                org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(a1.g.p(j11, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(b71Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f33249a |= 4;
                                    org.telegram.ui.Components.a21 a21Var = new org.telegram.ui.Components.a21(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(a21Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f33249a |= 1;
                                        org.telegram.ui.Components.a21 a21Var2 = new org.telegram.ui.Components.a21(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f33249a |= 2;
                                        org.telegram.ui.Components.a21 a21Var3 = new org.telegram.ui.Components.a21(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f33249a |= 8;
                                        org.telegram.ui.Components.a21 a21Var4 = new org.telegram.ui.Components.a21(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f33249a |= 16;
                                        org.telegram.ui.Components.a21 a21Var5 = new org.telegram.ui.Components.a21(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(messageEntity.url, z11Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(a71Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f33249a |= 256;
                                        org.telegram.ui.Components.a21 a21Var6 = new org.telegram.ui.Components.a21(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.ak0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e7) {
                                            FileLog.e((Throwable) e7, false);
                                            fontMetricsInt = z11Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            b6Var = new org.telegram.ui.Components.b6(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            b6Var = new org.telegram.ui.Components.b6(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(b6Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        z11Var = z11Var2;
                                    }
                                    z11Var = z11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                z11Var = null;
                            }
                            i12++;
                            z11Var2 = z11Var;
                            c10 = c11;
                            j13 = j16;
                            draftMessage3 = draftMessage2;
                        }
                        j10 = j13;
                        tnVar = z11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        tnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.h1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new qe(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f37271g5 = of2;
                        Hb(of2);
                    }
                    messageObject = this.f37356n5;
                    if (messageObject != null || this.X3 == messageObject) {
                        if (message == null && ((messageObject2 = this.X3) == null || messageObject2.getId() != message.f19823id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f37356n5 = messageObject3;
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
                                        tnVar2 = tnVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        tnVar2 = new tn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f37330l5 = tnVar2;
                                }
                            }
                            Y6(false);
                            tn tnVar3 = this.f37330l5;
                            if (tnVar3 != null) {
                                Gb(this.f37356n5, tnVar3);
                            } else {
                                Fb(this.f37356n5);
                            }
                            lc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j10 && this.f37241e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f37241e.f19802id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f37356n5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Fb(messageObject4);
                            lc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j10 = 0;
                tnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f37271g5 = of22;
                    Hb(of22);
                }
                messageObject = this.f37356n5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void D7(boolean z10) {
        this.R8 = z10;
        org.telegram.ui.ActionBar.m1 m1Var = this.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f37214bc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f37214bc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f37214bc = ofFloat;
            ofFloat.addUpdateListener(new se(this, 0));
            this.f37214bc.setDuration(150L);
            this.f37214bc.start();
        }
    }

    public final MessageObject.GroupedMessages D8(long j3) {
        return (MessageObject.GroupedMessages) this.f37484x6.f(j3);
    }

    public final boolean D9() {
        if (this.f37241e != null) {
            return getMessagesController().isChatNoForwards(this.f37241e);
        }
        return getMessagesController().isUserNoForwards(this.f37196a8);
    }

    public final void Da(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Da(java.util.ArrayList, boolean):void");
    }

    public final void Db(boolean z10, MessageObject messageObject, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        Cb(z10, messageObject, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void Dc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f37281h4 && !this.J4.isEmpty() && this.H4.size() == 1 && ((Integer) this.H4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.J4.get(this.H4.get(0));
        } else {
            messageObject = null;
        }
        this.Y3 = messageObject;
        if (this.f37281h4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f37220c4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f37241e, this.Y3.messageOwner.from_id)) {
            this.Y3 = null;
        }
    }

    public final int E6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f37478x0.getHeight();
        int i11 = 0;
        long j3 = 0;
        while (true) {
            View U0 = this.f37478x0.U0(i10);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) U0;
                messageObject = u1Var.getMessageObject();
                additionalPaddingHeight = u1Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof org.telegram.ui.Cells.w0) {
                messageObject = ((org.telegram.ui.Cells.w0) U0).getMessageObject();
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
                height = Math.min(height, U0.getTop());
                i11 = Math.max(i11, U0.getBottom() - additionalPaddingHeight);
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

    public final long E7(MessageObject messageObject) {
        if (this.R3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f37241e) && !this.f37281h4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f19854id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f37241e));
        }
        return this.f37232d4;
    }

    public final float E8() {
        eo eoVar = this.f37238da;
        if (eoVar == null) {
            eoVar = this;
        }
        pk pkVar = eoVar.f37375p1;
        if (pkVar == null) {
            return 0.0f;
        }
        return pkVar.f28257b;
    }

    public final boolean E9() {
        int i10 = this.R3;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void Ea(int i10) {
        boolean z10;
        int i11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i10 == 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i12 >= 24) {
                        intent.putExtra("output", FileProvider.d(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
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
                Activity parentActivity = getParentActivity();
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (ChatObject.isChannel(this.f37241e) && (tL_chatBannedRights = this.f37241e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mq0 mq0Var = new mq0(0, z10, true, this);
                if (this.R3 == 9) {
                    mq0Var.G = 1;
                    mq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.f37241e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f37241e.slowmode_enabled) {
                        mq0Var.G = 10;
                        mq0Var.H = true;
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
                        mq0Var.G = i11;
                        mq0Var.H = z11;
                    }
                }
                mq0Var.V = new wl(this);
                presentFragment(mq0Var);
            } else if (i10 == 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File generateVideoPath = AndroidUtilities.generateVideoPath();
                    if (generateVideoPath != null) {
                        if (i13 >= 24) {
                            intent2.putExtra("output", FileProvider.d(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
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

    public final void Eb(ArrayList arrayList) {
        Cb(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void Ec(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f37338m1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37303j1.e(4, z11, z10);
        this.f37303j1.c(4, this.f37338m1, z10);
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        bb(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final float F6(boolean z10) {
        float f7;
        float f10;
        float f11;
        sk skVar = this.Y;
        float f12 = 0.0f;
        if (skVar != null) {
            if (z10) {
                f7 = skVar.N5;
            } else {
                f7 = skVar.M5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        me.b bVar = this.f37476wc;
        j6.l lVar = this.Bc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f14058a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f14058a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f16088f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f14059b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.f16087e;
            f11 = f13;
        }
        if (!this.Pa && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final int F8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.f37334l9 == null) {
            this.f37334l9 = new org.telegram.ui.Cells.u1(getParentActivity(), this.currentAccount, true, this.Ca, this.f37251ea);
        }
        org.telegram.ui.Cells.u1 u1Var = this.f37334l9;
        if (this.f37241e == null && !UserObject.isUserSelf(this.f37253f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1Var.N7 = z11;
        org.telegram.ui.Cells.u1 u1Var2 = this.f37334l9;
        int i10 = this.R3;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1Var2.P7 = z12;
        if (i10 == 3 && this.Pa) {
            z13 = true;
        } else {
            z13 = false;
        }
        u1Var2.Q7 = z13;
        TLRPC.User user = this.f37253f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        u1Var2.R7 = z14;
        if (ChatObject.isChannel(this.f37241e) && this.f37241e.megagroup) {
            z15 = true;
        }
        u1Var2.S7 = z15;
        this.f37334l9.E8 = y9();
        this.f37334l9.F8 = H9();
        this.f37334l9.G8 = G9();
        return this.f37334l9.g1(messageObject, (MessageObject.GroupedMessages) this.f37484x6.f(messageObject.getGroupId()), z10);
    }

    public final boolean F9() {
        return !TextUtils.isEmpty(this.U3);
    }

    public final void Fa(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Fa(int):void");
    }

    public final void Fb(MessageObject messageObject) {
        Db(true, messageObject, null, false, true);
    }

    public final void Fc(boolean z10) {
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
        this.f37303j1.e(3, z11, z10);
        this.f37303j1.c(3, this.l1, z10);
    }

    @Override
    public final boolean G() {
        return this.f37297i8;
    }

    public final boolean G6() {
        if (!E9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f37281h4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                wk wkVar = this.O0;
                if (wkVar == null || wkVar.getVisibility() != 0) {
                    if (!K9() || this.f37281h4) {
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

    public final void G7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.G7():void");
    }

    public final boolean G9() {
        org.telegram.ui.Components.h41 h41Var = this.R1;
        if (h41Var != null && h41Var.Q && h41Var.f26634a.f16088f) {
            return true;
        }
        return false;
    }

    public final boolean Ga(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f37261f8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f37253f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f37261f8 == this.T5) {
                this.f37261f8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f37261f8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((m2Var instanceof eo) && ((eo) m2Var).T5 == this.f37261f8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f37261f8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f37261f8));
                } else if (DialogObject.isUserDialog(this.f37261f8)) {
                    bundle.putLong("user_id", this.f37261f8);
                } else {
                    bundle.putLong("chat_id", -this.f37261f8);
                }
                y6();
                presentFragment(new eo(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Gb(MessageObject messageObject, tn tnVar) {
        Cb(true, messageObject, null, null, null, true, 0, tnVar, false, 0L, null, true);
    }

    public final void Gc(boolean z10) {
        String string;
        if (this.R3 != 3 && !UserObject.isBotForum(this.f37253f)) {
            uj ujVar = this.f37190a1;
            if (ujVar != null && this.f37232d4 != 0) {
                if (this.f37281h4) {
                    Wc();
                } else if (this.f37270g4) {
                    MessageObject messageObject = this.X3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f37190a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f37190a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.X3;
                    if (messageObject2 != null) {
                        ujVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f37206b4 != null) {
                if (this.X3.getRepliesCount() == 0) {
                    if (this.f37270g4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f37206b4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final boolean H6() {
        if (this.h == null) {
            wk wkVar = this.O0;
            if (wkVar == null || wkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H7() {
        if (getParentActivity() != null && getParentActivity() != null && this.J1 == null) {
            ai.h4 h4Var = new ai.h4(this, getParentActivity(), this, this.f37251ea, 2);
            this.J1 = h4Var;
            h4Var.Z = a();
            ai.h4 h4Var2 = this.J1;
            h4Var2.f24351i0 = true;
            h4Var2.f24333c2 = new ul(this);
        }
    }

    public final SendMessageChatArguments H8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.R3 == 9) {
            builder.setWelcomeMessageChatId(this.ta);
        }
        if (this.R3 == 5) {
            builder.setQuickReplyShortcut(this.Q3, M8());
        }
        return builder.build();
    }

    public final boolean H9() {
        if (this.R1 == null) {
            if (this.T3 || !ChatObject.isMonoForum(this.f37241e)) {
                if (!ChatObject.isForum(this.f37241e) || !ChatObject.areTabsEnabled(this.f37241e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void Ha(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f19823id = 0;
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
        messageObject2.stableId = Y8(messageObject.dateKeyInt);
        this.A0.P.add(i10, messageObject2);
    }

    public final void Hb(MessageSuggestionParams messageSuggestionParams) {
        Cb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Hc(MessageObject messageObject, int i10) {
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
            MessageObject messageObject3 = (MessageObject) this.f37368o6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                qm qmVar = this.A0;
                if (qmVar != null) {
                    qmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    @Override
    public final long I() {
        return this.L6;
    }

    public final boolean I6(MessageObject messageObject) {
        if (this.R3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.f37241e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f37241e.f19802id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.R3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f37241e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void I7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        wg wgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.W5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f37253f;
        TLRPC.Chat chat = this.f37241e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.Z7;
        long j3 = this.L6;
        int d = (int) d();
        int i10 = this.R3;
        wg wgVar2 = new wg(this, 4);
        if (z10) {
            wgVar = new wg(this, 5);
        } else {
            wgVar = null;
        }
        wg wgVar3 = wgVar;
        org.telegram.ui.Components.g5.y(this, user, chat, encryptedChat, chatFull, j3, messageObject, this.W5, groupedMessages, d, i10, null, wgVar2, wgVar3, this.f37251ea);
    }

    public final boolean I9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f37215c && !this.d && this.f37253f == null && this.f37478x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f37300ib == null) {
                this.f37300ib = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f37300ib.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f37478x0.getChildCount(); i12++) {
                    i11 += this.f37478x0.getChildAt(i12).getHeight();
                    int top = this.f37478x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f37422s9) {
                    O6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.C6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f37444u6;
                if ((!z12 || ((this.L6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.G6 && f10 > this.f37422s9 && (!arrayList.isEmpty() ? i11 != 0 : this.f37287hb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.Q0) == null || frameLayout.getVisibility() != 0 || this.Q0.getChildCount() <= 0) {
                    if (!z10 && this.N6 == 0) {
                        O6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.R9 && this.fragmentBeginToShow) {
                        if (z10 && this.N6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable d = this.f37251ea.d();
                        wm wmVar = this.X0;
                        if (wmVar != null) {
                            d = wmVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.gd0) {
                            org.telegram.ui.Components.gd0 gd0Var = (org.telegram.ui.Components.gd0) d;
                            if (gd0Var.N != z11) {
                                if (!z11) {
                                    gd0Var.c();
                                }
                                gd0Var.q(z11);
                                if (z11) {
                                    f7 = 1.5f;
                                } else {
                                    f7 = 1.0f;
                                }
                                gd0Var.M = f7;
                                gd0Var.z();
                            } else if (z11) {
                                gd0Var.z();
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

    public final void Ia() {
        int i10;
        this.H4.clear();
        this.J4.clear();
        this.L4 = 0;
        this.P4 = 0;
        this.Q4 = 0;
        Cc(0, true);
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
        Dc();
    }

    public final void Ib(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Db(z10, null, webPage, z11, true);
    }

    public final void Ic(boolean z10) {
        sk skVar = this.Y;
        if (skVar != null) {
            skVar.R1(z10);
        }
    }

    public final void J6(boolean z10) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f37241e != null && (this.R3 != 0 || this.f37232d4 != 0 || (chatFull = this.Z7) == null || chatFull.ttl_period == 0)) || ((user = this.f37253f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f37196a8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.s0 s0Var = this.f37216c0;
            if (s0Var != null) {
                s0Var.e(8);
            }
            uj ujVar = this.f37190a1;
            if (ujVar != null) {
                ujVar.f32497a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.s0 s0Var2 = this.f37216c0;
            if (s0Var2 != null) {
                s0Var2.e(0);
            }
            uj ujVar2 = this.f37190a1;
            if (ujVar2 != null) {
                ujVar2.f32497a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.s0 s0Var3 = this.f37413s0;
        if (s0Var3 != null) {
            TLRPC.Chat chat = this.f37241e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s0Var3.e(i11);
        }
        uj ujVar3 = this.f37190a1;
        if (ujVar3 != null) {
            TLRPC.Chat chat2 = this.f37241e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f37253f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ujVar3.setCommunityItemVisible(z11);
            final uj ujVar4 = this.f37190a1;
            TLRPC.Chat chat3 = this.f37241e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = ujVar4.E;
            ImageView imageView2 = ujVar4.f32527y;
            if (imageView2 != null && imageView != null) {
                ujVar4.f32513l0 = z12;
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
                                    wo woVar = ujVar4;
                                    if (!z14) {
                                        woVar.f32527y.setVisibility(4);
                                        return;
                                    } else {
                                        woVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    wo woVar2 = ujVar4;
                                    if (!z15) {
                                        woVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        woVar2.getClass();
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
                                    wo woVar = ujVar4;
                                    if (!z14) {
                                        woVar.f32527y.setVisibility(4);
                                        return;
                                    } else {
                                        woVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    wo woVar2 = ujVar4;
                                    if (!z15) {
                                        woVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        woVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f37190a1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f37196a8;
                if (userFull2 != null) {
                    this.f37190a1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.Z7;
                    if (chatFull3 != null) {
                        this.f37190a1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f37399r0 != null && (chatFull2 = this.Z7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f37241e)) {
                TLRPC.Chat chat4 = this.f37241e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.s0 s0Var4 = this.f37399r0;
            if (z13) {
                i12 = 0;
            }
            s0Var4.e(i12);
        }
        p();
    }

    public final void J7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.Q0 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.Q0;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.Q0 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.X0.addView(this.Q0, 3, w7.w5.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.Q0.setTranslationX(W8() / 2.0f);
            if (this.A0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f37204b2 = textView;
                textView.setText(LocaleController.getString(R.string.NoFilteredMessages));
                this.f37204b2.setTextSize(1, 14.0f);
                this.f37204b2.setGravity(17);
                this.f37204b2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20656ic));
                this.f37204b2.setBackground(new org.telegram.ui.ActionBar.t5(this.f37204b2, this.X0, AndroidUtilities.dp(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f37204b2.setTypeface(AndroidUtilities.bold());
                this.f37204b2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(3.0f));
                this.Q0.addView(this.f37204b2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (E9()) {
                Activity parentActivity = getParentActivity();
                int i11 = this.R3;
                long j3 = this.f37232d4;
                String str = this.Q3;
                org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setTextAlignment(4);
                textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
                textView2.setGravity(17);
                ai.q4 q4Var = new ai.q4(parentActivity, 3);
                q4Var.setTextAlignment(4);
                q4Var.setGravity(17);
                q4Var.setTextSize(1, 12.0f);
                q4Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                q4Var.setGravity(1);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                q4Var.setMaxWidth(AndroidUtilities.dp(160.0f));
                int i12 = 22;
                int i13 = 9;
                if (i11 == 9) {
                    imageView.setImageResource(R.drawable.large_greeting);
                    textView2.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
                    q4Var.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
                    q4Var.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), ci.d4.a(q4Var.getText(), q4Var.getPaint())));
                } else if ("hello".equalsIgnoreCase(str)) {
                    imageView.setImageResource(R.drawable.large_greeting);
                    textView2.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
                    q4Var.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
                    q4Var.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), ci.d4.a(q4Var.getText(), q4Var.getPaint())));
                } else if ("away".equalsIgnoreCase(str)) {
                    imageView.setImageResource(R.drawable.large_away);
                    textView2.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
                    q4Var.setText(LocaleController.getString(R.string.BusinessAwayIntro));
                    q4Var.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), ci.d4.a(q4Var.getText(), q4Var.getPaint())));
                } else {
                    if (i11 == 5) {
                        imageView.setImageResource(R.drawable.large_quickreplies);
                        hg.b2 c10 = hg.c2.f(UserConfig.selectedAccount).c(j3);
                        if (c10 != null) {
                            str = c10.f11173b;
                        }
                        textView2.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                        q4Var.setMaxWidth(AndroidUtilities.dp(208.0f));
                        q4Var.setTextAlignment(2);
                        q4Var.setGravity(3);
                        q4Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str)));
                        q4Var.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                        ai.q4 q4Var2 = new ai.q4(parentActivity, 3);
                        linearLayout.f11199a = q4Var2;
                        q4Var2.setMaxWidth(AndroidUtilities.dp(208.0f));
                        q4Var2.setTextAlignment(2);
                        q4Var2.setGravity(3);
                        q4Var2.setTextSize(1, 13.0f);
                        q4Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                        q4Var2.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                    }
                    i12 = 12;
                }
                int i14 = i12;
                linearLayout.addView(imageView, w7.w5.t(78, 78, 49, 20, 17, 20, 9));
                linearLayout.addView(textView2, w7.w5.t(-2, -2, 49, 20, 0, 20, 6));
                if (linearLayout.f11199a == null) {
                    i13 = 19;
                }
                linearLayout.addView(q4Var, w7.w5.t(-2, -2, 49, i14, 0, i14, i13));
                ai.q4 q4Var3 = linearLayout.f11199a;
                if (q4Var3 != null) {
                    linearLayout.addView(q4Var3, w7.w5.t(-2, -2, 49, 12, 0, 12, 19));
                }
                int i15 = org.telegram.ui.ActionBar.h6.f20656ic;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
                q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
                ai.q4 q4Var4 = linearLayout.f11199a;
                if (q4Var4 != null) {
                    q4Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
                }
                this.U0 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.U0, this.X0, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.Q0.addView(this.U0, w7.w5.e(-2, -2, 17));
                this.W0.d(this.U0, this.X0, new m4.r0(27), false);
            } else if (this.R3 == 6) {
                Activity parentActivity2 = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.P3;
                org.telegram.ui.ActionBar.c6 resourceProvider2 = getResourceProvider();
                ?? linearLayout2 = new LinearLayout(parentActivity2);
                linearLayout2.setOrientation(1);
                int i16 = org.telegram.ui.ActionBar.h6.f20656ic;
                org.telegram.ui.ActionBar.h6.w0(i16, resourceProvider2);
                org.telegram.ui.ActionBar.h6.v0(i16);
                ImageView imageView2 = new ImageView(parentActivity2);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView2.setImageResource(R.drawable.filled_chatlink_large);
                linearLayout2.addView(imageView2, w7.w5.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView3 = new TextView(parentActivity2);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, resourceProvider2));
                textView3.setGravity(1);
                textView3.setMaxWidth(AndroidUtilities.dp(208.0f));
                org.telegram.messenger.v0.n(R.string.BusinessLinksIntro, textView3);
                linearLayout2.addView(textView3, w7.w5.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView4 = new TextView(parentActivity2);
                textView4.setTextAlignment(4);
                textView4.setTextSize(1, 13.0f);
                textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, resourceProvider2));
                textView4.setTypeface(textView4.getTypeface(), 1);
                textView4.setGravity(1);
                textView4.setMaxWidth(AndroidUtilities.dp(208.0f));
                String str2 = tL_businessChatLink.link;
                hg.z[] zVarArr = hg.z.f11457e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView4.setText(str2);
                textView4.setBackground(org.telegram.ui.ActionBar.h6.a0(503316480, 503316480, 5, 5));
                textView4.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                textView4.setOnClickListener(new ai.f2(10, tL_businessChatLink, this));
                linearLayout2.addView(textView4, w7.w5.t(-2, -2, 49, 17, 0, 17, 17));
                this.V0 = linearLayout2;
                linearLayout2.setBackground(new org.telegram.ui.ActionBar.t5(this.V0, this.X0, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.Q0.addView(this.V0, w7.w5.e(-2, -2, 17));
            } else if ((this.B9 != null && this.f37253f != null && !this.f37350n) || (this.f37196a8 != null && a() != getUserConfig().getClientUserId() && ((this.f37196a8.contact_require_premium && !getUserConfig().isPremium()) || this.f37196a8.send_paid_messages_stars > yh.n5.y(this.currentAccount, false).p().amount))) {
                this.S0 = new wi(this, getParentActivity(), this.currentAccount, this.B9, this.f37251ea);
                rc();
                this.S0.setListener(new ve(this, 4));
                LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
                this.R0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.R0.setGravity(17);
                this.R0.addView(this.S0, w7.w5.e(-2, -2, 17));
                this.Q0.addView(this.R0, w7.w5.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f37196a8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.S0.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.S0.setSticker(this.f37196a8.business_intro.sticker);
                }
                qc();
            } else if (this.h == null) {
                String str3 = null;
                Paint paint = null;
                str3 = null;
                if (this.f37281h4 && this.R3 == 0) {
                    Activity parentActivity3 = getParentActivity();
                    wm wmVar = this.X0;
                    bo boVar = this.f37251ea;
                    LinearLayout linearLayout4 = new LinearLayout(parentActivity3);
                    int dp = AndroidUtilities.dp(18.0f);
                    if (boVar != null) {
                        paint = boVar.G("paintChatActionBackground");
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
                    }
                    int i17 = org.telegram.ui.ActionBar.h6.f20496a;
                    linearLayout4.setBackground(new org.telegram.ui.ActionBar.t5(linearLayout4, wmVar, dp, paint));
                    linearLayout4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                    linearLayout4.setOrientation(1);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity3);
                    TextView textView5 = new TextView(parentActivity3);
                    org.telegram.messenger.am.k(15.0f, 1, textView5);
                    int i18 = org.telegram.ui.ActionBar.h6.f20656ic;
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, boVar));
                    textView5.setGravity(1);
                    textView5.setMaxWidth(AndroidUtilities.dp(210.0f));
                    textView5.setText(LocaleController.getString(R.string.AlmostDone));
                    TextView textView6 = new TextView(parentActivity3);
                    textView6.setTextSize(1, 13.0f);
                    textView6.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, boVar));
                    textView6.setGravity(1);
                    textView6.setMaxWidth(AndroidUtilities.dp(160.0f));
                    textView6.setText(LocaleController.getString(R.string.TopicEmptyViewDescription));
                    linearLayout4.addView(y9Var, w7.w5.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout4.addView(textView5, w7.w5.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout4.addView(textView6, w7.w5.q(-2, -2, 1));
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker("🥳");
                    if (emojiAnimatedSticker != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, org.telegram.ui.ActionBar.h6.f20543c7, 0.2f);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        y9Var.i(ImageLocation.getForDocument(emojiAnimatedSticker), null, "tgs", svgThumb, null);
                    }
                    this.Q0.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!K9() && this.R3 == 0 && (((user2 = this.f37253f) != null && user2.self) || ((chat = this.f37241e) != null && chat.creator && !ChatObject.isChannelAndNotMegaGroup(chat)))) {
                    Activity parentActivity4 = getParentActivity();
                    wm wmVar2 = this.X0;
                    if (this.f37241e != null) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.xo xoVar = new org.telegram.ui.Components.xo(parentActivity4, wmVar2, i10, this.f37251ea);
                    this.Y0 = xoVar;
                    this.Q0.addView(xoVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f37241e != null) {
                        this.Y0.setStatusText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupEmptyTitle1)));
                    }
                } else {
                    if (K9() && this.R3 == 0) {
                        str3 = this.f37270g4 ? LocaleController.getString(R.string.NoComments) : LocaleController.getString(R.string.NoReplies);
                    } else if (this.R3 == 1) {
                        str3 = LocaleController.getString(R.string.NoScheduledMessages);
                    } else {
                        TLRPC.User user3 = this.f37253f;
                        if (user3 != null) {
                            long j10 = user3.f19949id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && MessagesController.isSupportUser(user3)) {
                                str3 = LocaleController.getString(R.string.GotAQuestion);
                            }
                        }
                        if (this.R3 != 8 && ((user = this.f37253f) == null || user.self || user.deleted || this.f37350n)) {
                            str3 = LocaleController.getString(R.string.NoMessages);
                        }
                    }
                    if (str3 == null) {
                        this.S0 = new xi(this, getParentActivity(), this.currentAccount, this.B9, this.f37251ea);
                        rc();
                        this.S0.setListener(new ve(this, 5));
                        TLRPC.UserFull userFull2 = this.f37196a8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.S0.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.S0.setSticker(this.f37196a8.business_intro.sticker);
                        }
                        LinearLayout linearLayout5 = new LinearLayout(getParentActivity());
                        this.R0 = linearLayout5;
                        linearLayout5.setOrientation(1);
                        this.R0.setGravity(17);
                        this.R0.addView(this.S0, w7.w5.e(-2, -2, 17));
                        this.Q0.addView(this.R0, w7.w5.e(-1, -2, 17));
                        qc();
                        return;
                    }
                    TextView textView7 = new TextView(getParentActivity());
                    this.f37204b2 = textView7;
                    textView7.setText(str3);
                    this.f37204b2.setTextSize(1, 14.0f);
                    this.f37204b2.setGravity(17);
                    this.f37204b2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20656ic));
                    this.f37204b2.setBackground(new org.telegram.ui.ActionBar.t5(this.f37204b2, this.X0, AndroidUtilities.dp(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f37204b2.setTypeface(AndroidUtilities.bold());
                    this.f37204b2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(3.0f));
                    this.Q0.addView(this.f37204b2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.Y0 = new org.telegram.ui.Components.xo(getParentActivity(), this.X0, 0, this.f37251ea);
                if (this.h.admin_id == getUserConfig().getClientUserId()) {
                    this.Y0.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleOutgoing, UserObject.getFirstName(this.f37253f)));
                } else {
                    this.Y0.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleIncoming, UserObject.getFirstName(this.f37253f)));
                }
                this.Q0.addView(this.Y0, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final int J8(MessageObject messageObject) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f19822id)) {
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

    public final boolean J9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Ja(MessageObject messageObject) {
        if (messageObject == this.Mb) {
            this.Mb = null;
            Uc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.T5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Jb(boolean z10) {
        if (this.X2 != null && !E9()) {
            if (this.X2.getTag() == null) {
                AnimatorSet animatorSet = this.f37269g3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.X2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f37269g3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f37269g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 1.0f));
                this.f37269g3.addListener(new bj(this, 5));
                this.f37269g3.start();
            }
            if (!z10) {
                w9();
                this.f37191a3 = 1000;
            }
        }
    }

    public final void Jc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        jh.h hVar = this.f37303j1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.Qa) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f3492c = z10;
            aa.a aVar = hVar.f14197e[6];
            if (aVar != null) {
                ((ih.b) aVar.f386b).b(z10, true);
            }
            jh.h hVar2 = this.f37303j1;
            if (this.Qa) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3492c = z11;
            aa.a aVar2 = hVar2.f14197e[5];
            if (aVar2 != null) {
                ((ih.b) aVar2.f386b).b(z11, true);
            }
        }
        this.f37467w3 = i12;
        this.f37481x3 = i11;
        Kc();
        org.telegram.ui.Components.r6 r6Var = this.V2;
        if (r6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            r6Var.setClickable(z12);
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
    public final boolean K(vy vyVar) {
        return false;
    }

    public final void K6() {
        if (this.Pa) {
            return;
        }
        if (F9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int K8() {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        int i10 = 0;
        if (b5Var == null || b5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(i10);
                if (m2Var != this && (m2Var instanceof eo) && ((eo) m2Var).T5 == this.T5) {
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

    public final boolean K9() {
        if (this.X3 != null) {
            return true;
        }
        return false;
    }

    public final void Ka(MessageObject messageObject) {
        ArrayList arrayList = this.f37444u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            qm qmVar = this.A0;
            if (qmVar != null && !qmVar.N) {
                qmVar.u(qmVar.J + indexOf);
            }
        }
    }

    public final void Kb(boolean z10) {
        if (this.Y2 != null && !E9()) {
            if (this.Y2.getTag() == null) {
                ValueAnimator valueAnimator = this.f37280h3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.Y2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37292i3, 1.0f);
                this.f37280h3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f37280h3.addUpdateListener(new se(this, 2));
                this.f37280h3.addListener(new bj(this, 7));
                this.f37280h3.start();
            }
            if (!z10) {
                w9();
                this.f37191a3 = 1000;
            }
        }
    }

    public final void Kc() {
        org.telegram.ui.Components.r6 r6Var = this.U2;
        if (r6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f37467w3;
            if (i10 < 0) {
                r6Var.c("", z10, true);
            } else if (i10 == 0) {
                r6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f37402r3) {
                r6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.R3 != 7 && !this.yc.f16088f) {
                r6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f37481x3 + 1), Integer.valueOf(this.f37467w3)), z10, true);
            } else {
                r6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void L6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.L6():void");
    }

    public final boolean L7(android.view.View r93, boolean r94, boolean r95, float r96, float r97, boolean r98, boolean r99, boolean r100) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.L7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int L8() {
        return Math.max(this.P4, this.Q4);
    }

    public final void L9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        ArrayList arrayList = this.f37444u6;
        if (!arrayList.isEmpty()) {
            MessageObject messageObject = (MessageObject) hg.c.h(1, arrayList);
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
                int N0 = this.f37502z0.N0();
                int L0 = this.f37502z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        qm qmVar = this.A0;
                        int i14 = qmVar.J;
                        if (L0 >= i14 && L0 < qmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                org.telegram.ui.ActionBar.a2 a2Var = this.f37384pb;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                Bc(false);
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, this.f37251ea);
                this.f37384pb = a2Var2;
                a2Var2.setOnCancelListener(this.f37347ma);
                this.f37384pb.q(1000L);
                int i15 = this.V5;
                this.Y8 = i15;
                this.f37197a9 = false;
                this.f37283h6.add(Integer.valueOf(i15));
                this.Z8 = 0;
                this.f37211b9 = false;
                MessagesController messagesController = getMessagesController();
                long j3 = this.T5;
                long j10 = this.L6;
                int i16 = this.classGuid;
                int i17 = this.R3;
                long j11 = this.f37232d4;
                int i18 = this.f37341m4;
                int i19 = this.V5;
                this.V5 = i19 + 1;
                messagesController.loadMessages(j3, j10, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j11, i18, i19, this.f37281h4);
                this.X2.setAlpha(0.0f);
                this.X2.setTag(null);
                this.f37292i3 = 0.0f;
                pc();
                this.Y2.setTag(null);
            }
        }
    }

    public final void La(MessageObject messageObject) {
        ArrayList arrayList = this.f37444u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            qm qmVar = this.A0;
            if (qmVar != null && !qmVar.N) {
                qmVar.P(qmVar.J + indexOf, true);
            }
        }
    }

    public final boolean Lb() {
        sk skVar = this.Y;
        if (skVar != null && skVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f37244e2 == null) {
                    if (!this.f37207b5) {
                        sk skVar2 = this.Y;
                        if (skVar2 != null) {
                            skVar2.V();
                            MediaDataController.getInstance(skVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.ig igVar = skVar2.U0;
                            igVar.L(false, false);
                            igVar.Q(false, false);
                            igVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        wm wmVar = this.X0;
                        int indexOfChild = wmVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            sk skVar3 = this.Y;
                            skVar3.V();
                            MediaDataController.getInstance(skVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.ig igVar2 = skVar3.U0;
                            igVar2.L(false, false);
                            igVar2.Q(false, false);
                            igVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f37466w2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            wmVar.addView(this.f37466w2, i10, w7.w5.a(10.0f, 37.0f, 0.0f, 0.0f, 27.0f, 10, 83));
                            org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(9, getParentActivity(), this.f37251ea, false);
                            this.f37244e2 = c50Var;
                            c50Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            wmVar.addView(this.f37244e2, i10, w7.w5.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 83));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.c50 c50Var2 = this.f37244e2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(c50Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37466w2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new bj(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f37244e2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Lc() {
        P7();
        String str = this.f37441u3;
        if (str != null) {
            this.f37230d2.f26557e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.L3.setEmptyView(this.f37230d2);
            return;
        }
        this.L3.setEmptyView(null);
        this.f37230d2.setVisibility(8);
    }

    public final void M6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.f37476wc.f16087e) * (1.0f - this.f37450uc.f16087e) * ((float[]) this.Bc.f14059b)[i10];
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

    public final int M8() {
        if (this.R3 == 5) {
            return (int) this.f37232d4;
        }
        return 0;
    }

    public final void M9() {
        this.D4 = true;
        if (this.f37343m6) {
            getMessagesStorage().getUnreadMention(this.T5, d(), new eh(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.T5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f37281h4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f37232d4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f37331l6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ai.v1(27, this, messagesStorage));
    }

    public final void Ma() {
        if (this.P7 == null && this.Q7 == null && this.R7 == null) {
            qe qeVar = this.U7;
            if (qeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(qeVar);
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

    public final void Mb() {
        TLRPC.ChatFull chatFull = this.Z7;
        if (chatFull != null && !this.f37391q5) {
            TLRPC.Chat chat = this.f37241e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new qe(this, 17), 1000L);
            }
        }
    }

    public final void Mc() {
        boolean z10;
        if (this.f37303j1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f37416s3 && !this.f37402r3) || (this.R3 == 7 && this.O3 == 2 && !this.f37444u6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37303j1.e(6, z10, true);
        this.f37303j1.e(5, z10, true);
        if (z10) {
            this.f37303j1.e(1, false, true);
        }
        if (!z10) {
            this.B7 = 0;
        }
        this.X0.invalidate();
    }

    public final boolean N6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.Z7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            rg.j0.D1(this, this.D1, this.E1, this.T5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void N7() {
        if (this.h == null && this.f37480x2 == null && getParentActivity() != null) {
            pl plVar = new pl(this, getParentActivity());
            this.f37480x2 = plVar;
            plVar.setTag(1);
            this.M0.addView(this.f37480x2, w7.w5.n(-1, 48));
            this.M0.h(1, this.f37480x2);
            this.M0.g(this.f37480x2);
            this.f37480x2.setOnClickListener(new ef(this, 17));
            this.f37480x2.setEnabled(!isInPreviewMode());
            this.f37480x2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(getParentActivity(), this.f37251ea);
            this.f37504z2 = ah0Var;
            this.f37480x2.addView(ah0Var, w7.w5.a(48.0f, 13.0f, 0.0f, 0.0f, 0.0f, 3, 51));
            this.f37480x2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.F2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.F2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20603fe));
            this.F2.setTypeface(AndroidUtilities.bold());
            this.f37480x2.addView(this.F2, w7.w5.a(18.0f, 23.0f, 7.0f, 44.0f, 0.0f, -1, 51));
            int i11 = 0;
            while (i11 < 2) {
                co coVar = new co(this, getParentActivity());
                co[] coVarArr = this.C2;
                coVarArr[i11] = coVar;
                coVar.setTextSize(i10);
                coVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20603fe));
                coVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f37480x2.addView(coVarArr[i11], w7.w5.a(18.0f, 23.0f, 7.3f, 44.0f, 0.0f, -1, 51));
                ql qlVar = new ql(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.D2;
                h5VarArr[i11] = qlVar;
                qlVar.setTextSize(i10);
                h5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.ge));
                this.f37480x2.addView(h5VarArr[i11], w7.w5.a(18.0f, 23.0f, 25.3f, 44.0f, 0.0f, -1, 51));
                ai.q4 q4Var = new ai.q4(getParentActivity(), 13);
                q4Var.setSingleLine(true);
                q4Var.setLines(1);
                q4Var.setMaxLines(1);
                q4Var.setEllipsize(TextUtils.TruncateAt.END);
                q4Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
                q4Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                q4Var.setTextSize(1, 14.0f);
                q4Var.setTypeface(AndroidUtilities.bold());
                q4Var.setGravity(17);
                q4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                ai.q4[] q4VarArr = this.E2;
                q4VarArr[i11] = q4Var;
                this.f37480x2.addView(q4Var, w7.w5.a(28.0f, 0.0f, 10.0f, 14.0f, 0.0f, -2, 53));
                rl rlVar = new rl(getParentActivity());
                rlVar.I = new vh.g();
                rlVar.H = new Path();
                rlVar.J = new float[8];
                org.telegram.ui.Components.y9[] y9VarArr = this.B2;
                y9VarArr[i11] = rlVar;
                rlVar.setBlurAllowed(true);
                y9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f37480x2.addView(y9VarArr[i11], w7.w5.a(32.0f, 22.0f, 8.0f, 0.0f, 0.0f, 32, 51));
                if (i11 == 1) {
                    coVarArr[i11].setVisibility(4);
                    q4VarArr[i11].setVisibility(4);
                    h5VarArr[i11].setVisibility(4);
                    y9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.L2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.L2;
            int i12 = org.telegram.ui.ActionBar.h6.f20567de;
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
            int i13 = org.telegram.ui.ActionBar.h6.f20930x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i13) & 436207615, 1, -1));
            this.f37480x2.addView(this.L2, w7.w5.a(48.0f, 0.0f, 0.0f, 7.0f, 0.0f, 36, 53));
            this.L2.setOnClickListener(new ef(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.J2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.J2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.J2.setScaleType(scaleType);
            this.J2.setVisibility(8);
            this.J2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f37251ea);
            this.K2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.K2.setSize(AndroidUtilities.dp(16.0f));
            this.K2.setStrokeWidth(2.0f);
            this.K2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20585ee));
            this.f37480x2.addView(this.K2, w7.w5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
            this.J2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f37480x2.addView(this.J2, w7.w5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
            this.J2.setOnClickListener(new ef(this, 19));
            Bc(false);
        }
    }

    public final long N8() {
        if (this.R3 == 3) {
            return this.f37232d4;
        }
        return 0L;
    }

    public final void N9(boolean z10) {
        TLRPC.Chat chat;
        if (this.ha == null && (chat = this.f37241e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.f37241e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.T5);
            this.ha = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.T1(false, z10);
            }
        }
    }

    public final void Na(boolean z10) {
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
            Ka(messageObject);
            this.J7 = null;
        }
    }

    public final void Nb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f30540j = max;
        G.v = new nf(this, i10, 3);
        G.k(true);
        this.G3 = messageObject;
        this.H3 = i10;
    }

    public final void Nc(String str) {
        if (this.R3 == 7 && !TextUtils.equals(this.f37441u3, str)) {
            P7();
            Pb(true);
            this.f37441u3 = str;
            this.f37429t3 = str;
            U6(false);
            A7(true);
            this.N6 = 0L;
            this.f37321k7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.O3);
            this.M3.l();
            this.L3.requestLayout();
            if (this.L3.getLayoutManager() != null) {
                this.L3.getLayoutManager().n0(0);
            }
            Lc();
            this.f37230d2.e(true, true);
            v8();
        }
    }

    public final void O6(boolean z10) {
        if (this.N6 == 0) {
            if (z10 && !this.O6.isEmpty()) {
                this.N6 = System.currentTimeMillis();
            } else {
                this.N6 = 1L;
            }
            I9();
            ak akVar = this.f37478x0;
            if (akVar != null) {
                akVar.invalidate();
            }
        }
    }

    public final void O7() {
        int i10;
        int i11;
        if (this.R2 == null && getParentActivity() != null) {
            vk vkVar = new vk(this, getParentActivity(), 1);
            this.R2 = vkVar;
            vkVar.setClickable(false);
            this.R2.setWillNotDraw(false);
            this.Bc.i(4, false, false);
            this.R2.setClipToPadding(false);
            org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(getParentActivity(), true, true, true);
            this.U2 = r6Var;
            org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
            r6Var.b(0.25f, 280L, jsVar);
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20952ye));
            this.U2.setGravity(3);
            this.R2.addView(this.U2, w7.w5.a(30.0f, 0.0f, -1.0f, 97.33f, 0.0f, -2, 16));
            this.U.addView(this.R2, w7.w5.a(44.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 80));
            org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(getParentActivity(), true, false, true);
            this.V2 = r6Var2;
            r6Var2.b(0.0f, 420L, jsVar);
            this.V2.setScaleProperty(0.7f);
            this.V2.setTextSize(AndroidUtilities.dp(15.0f));
            this.V2.setGravity(5);
            this.V2.setTypeface(AndroidUtilities.bold());
            this.V2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20762o6));
            org.telegram.ui.Components.r6 r6Var3 = this.V2;
            if (this.yc.f16088f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            r6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.r6 r6Var4 = this.V2;
            r6Var4.f30058n = false;
            r6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.V2.setOnClickListener(new ef(this, 2));
            this.V2.setAlpha(0.5f);
            this.V2.setClickable(false);
            this.R2.addView(this.V2, w7.w5.e(-2, -1, 117));
            org.telegram.ui.Components.r6 r6Var5 = new org.telegram.ui.Components.r6(getParentActivity(), true, true, true);
            this.W2 = r6Var5;
            r6Var5.setGravity(17);
            this.W2.setTypeface(AndroidUtilities.bold());
            this.W2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ae));
            this.W2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.r6 r6Var6 = this.W2;
            int i12 = org.telegram.ui.ActionBar.h6.f20559d6;
            r6Var6.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i12), org.telegram.ui.ActionBar.h6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f20650i6))));
            org.telegram.ui.Components.r6 r6Var7 = this.W2;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            r6Var7.setText(LocaleController.getString(i11));
            this.W2.setOnClickListener(new ef(this, 3));
            this.W2.setVisibility(8);
            this.W2.setAlpha(0.0f);
            this.R2.addView(this.W2, w7.w5.e(-1, -1, 119));
            TLRPC.Chat chat = this.f37241e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f37241e.megagroup) && this.R3 != 7 && !ChatObject.isMonoForum(this.f37241e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.T2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.T2.setImageResource(R.drawable.msg_usersearch);
                this.T2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20936xe), PorterDuff.Mode.MULTIPLY));
                this.T2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f20965z8), 1, -1));
                this.R2.addView(this.T2, w7.w5.a(44.0f, 48.0f, 0.0f, 0.0f, 0.0f, 44, 51));
                this.T2.setOnClickListener(new ef(this, 4));
                this.T2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.R3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.S2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.S2.setImageResource(R.drawable.msg_calendar);
                this.S2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20936xe), PorterDuff.Mode.MULTIPLY));
                this.S2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f20965z8), 1, -1));
                this.R2.addView(this.S2, w7.w5.a(44.0f, 2.66f, 0.0f, 0.0f, 0.0f, 44, 51));
                this.S2.setOnClickListener(new ef(this, 5));
                this.S2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int O8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f37478x0.getMeasuredHeight() - this.Ba) - this.f37422s9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void O9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Oa(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        a0.i iVar;
        ArrayList arrayList2;
        qm qmVar;
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
            iVar = this.f37484x6;
            arrayList2 = this.f37444u6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.J4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f37368o6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f37253f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f37253f.f19949id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Xa();
                this.Qb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Pb.bind(messageObject2.messageOwner.f19823id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f19823id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.J4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.L4) {
                    Cc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f37379p6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.R3 == 1))) {
                if (z10) {
                    arrayList5.remove(i16);
                    i16--;
                }
                x6(messageObject, messageObject2);
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
                    HashMap hashMap2 = this.f37405r6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i12 = arrayList6.indexOf(messageObject2);
                    } else {
                        i12 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            i11 = i16;
                            iVar.k(groupedMessages, messageObject.getGroupId());
                        } else {
                            i11 = i16;
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
                                groupedMessages2.reversed = this.Qa;
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
                        qm qmVar2 = this.A0;
                        if (qmVar2 != null && !qmVar2.N) {
                            qmVar2.Q(qmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        qm qmVar3 = this.A0;
                        if (qmVar3 != null && !qmVar3.N) {
                            qmVar3.u(qmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.i iVar3 = this.f37432t6;
                        if (((MessageObject) iVar3.f(id4)) != null) {
                            iVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            qm qmVar4 = this.A0;
                            int i22 = qmVar4.E;
                            int i23 = qmVar4.F;
                            int i24 = qmVar4.H;
                            int i25 = qmVar4.G;
                            if (!qmVar4.N) {
                                qmVar4.u(qmVar4.J + indexOf2);
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
                                this.f37419s6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                qm qmVar5 = this.A0;
                                int i26 = qmVar5.E;
                                int i27 = qmVar5.F;
                                int i28 = qmVar5.H;
                                int i29 = qmVar5.G;
                                if (!qmVar5.N) {
                                    qmVar5.u(qmVar5.J + indexOf2);
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
                                        Hc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Hc(messageObject, messageObject2.getId());
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) hg.c.h(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (qmVar = this.A0) != null) {
                        qmVar.q(indexOf3 + qmVar.J, groupedMessages3.messages.size());
                        ck ckVar = this.f37491y0;
                        if (ckVar != null) {
                            ckVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Dc();
    }

    public final void Ob(boolean z10) {
        boolean z11;
        jh.h hVar = this.f37303j1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.f37241e)) {
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

    public final void Oc() {
        sk skVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.R3 == 3 && N8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.I1.setVisibility(8);
                this.I1.setTag(null);
                wc();
                org.telegram.ui.Components.uz0 uz0Var = this.f37229d1;
                if (uz0Var != null) {
                    uz0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f37241e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f37241e)) {
                    TLRPC.Chat chat2 = this.f37241e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f37241e.megagroup)) {
                        TLRPC.Chat chat3 = this.f37241e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.h6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                hrVar.f26892e = dp;
                                hrVar.f26893f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                hrVar.h = dp3;
                                hrVar.f26894n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(hrVar, 1), 0, 1, 33);
                                this.E0.setBackground(org.telegram.ui.ActionBar.h6.h0(0, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false)));
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new ef(this, 0));
                            } else {
                                this.E0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.E0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.E0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f37241e.banned_rights.until_date)));
                        }
                        this.R.setVisibility(0);
                        this.I1.setVisibility(8);
                        this.I1.setTag(null);
                        wc();
                        org.telegram.ui.Components.uz0 uz0Var2 = this.f37229d1;
                        if (uz0Var2 != null) {
                            uz0Var2.f();
                        }
                    }
                }
                J7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.Y0 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.t(new StringBuilder("<b>"), this.f37253f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.T5, this.f37232d4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.R.setVisibility(4);
                            if (!this.inPreviewMode && !this.Pa && this.R3 != 3) {
                                this.Y.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    Z6();
                    J6(false);
                } else {
                    this.R.setVisibility(4);
                    if (this.f37229d1 != null && (skVar = this.Y) != null && skVar.l0()) {
                        this.f37229d1.e();
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

    public final void P6(CharSequence charSequence) {
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
        MessagePreviewParams messagePreviewParams = this.f37259f5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.G5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.G5 = null;
                sk skVar = this.Y;
                if (skVar != null) {
                    skVar.X2 = null;
                    skVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f37259f5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = skVar.getFieldText();
                    MessageObject messageObject3 = this.f37356n5;
                    if (messageObject3 == this.X3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f37330l5, this.p5);
                }
                l8();
                m8();
            }
        }
    }

    public final void P7() {
        if (this.f37230d2 == null && this.f37427t1 == null) {
            org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(getParentActivity(), this.f37251ea);
            this.f37218c2 = m10Var;
            m10Var.setViewType(7);
            org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(getParentActivity(), this.f37218c2, 1, null);
            this.f37230d2 = gy0Var;
            gy0Var.setClickable(true);
            this.f37230d2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f37230d2.setVisibility(8);
            this.f37230d2.addView(this.f37218c2, 0);
            this.f37230d2.e(true, false);
            this.K3.addView(this.f37230d2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f37427t1 = x40Var;
            x40Var.setOnHashtagClickListener(new gf(this, 2));
            this.f37427t1.setOnScrollListener(new i3(this, 5));
            this.f37427t1.setVisibility(8);
            this.K3.addView(this.f37427t1, -1, -1);
            u7();
            s7();
        }
    }

    public final int P8(MessageObject messageObject) {
        return O8(F8(messageObject, !TextUtils.isEmpty(this.P7))) - Ya(messageObject);
    }

    public final dj P9(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle) {
        of.e eVar = this.Ab;
        if (eVar != null) {
            eVar.a(true);
            this.Ab = null;
        }
        if (characterStyle != null && u1Var != null && u1Var.getMessageObject() != null) {
            dj djVar = new dj(this, u1Var.getMessageObject().getId(), characterStyle, u1Var, 0);
            this.Ab = djVar;
            return djVar;
        }
        this.Ab = null;
        return null;
    }

    public final void Pa() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f37445u7 = 0;
        this.f37321k7 = false;
        this.f37332l7 = true;
        this.f37283h6.clear();
    }

    public final void Pb(boolean z10) {
        int i10;
        if (this.K3 != null) {
            me.b bVar = this.yc;
            if (bVar.f16088f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.R3 == 7) {
                    s4.d0 d0Var = (s4.d0) this.L3.getLayoutManager();
                    Object E = this.M3.E((d0Var.N0() + d0Var.L0()) / 2);
                    Object E2 = this.M3.E(d0Var.L0());
                    Object E3 = this.M3.E(d0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f37502z0.L0();
                        int N0 = this.f37502z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f19823id;
                        int i12 = ((MessageObject) E2).messageOwner.f19823id;
                        int i13 = ((MessageObject) E3).messageOwner.f19823id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f19823id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f19823id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f19823id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f37502z0.h1(this.A0.J + i14, (this.f37478x0.getHeight() - F8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.r6 r6Var = this.V2;
                if (r6Var != null) {
                    if (bVar.f16088f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    r6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ci.d4 d4Var = this.f37479x1;
                if (d4Var != null && d4Var.V) {
                    d4Var.e(true);
                }
                cm cmVar = this.B1;
                if (cmVar != null && cmVar.V) {
                    cmVar.e(true);
                }
                sk skVar = this.Y;
                if (skVar != null) {
                    skVar.m0();
                }
                Kc();
            }
        }
    }

    public final void Pc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i12 = (a() > getUserConfig().getClientUserId() ? 1 : (a() == getUserConfig().getClientUserId() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.W5;
        if (i12 == 0) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i13 = 0; i13 < sparseArrayArr.length; i13++) {
                for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i13].valueAt(i14);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages c92 = c9(messageObject);
                        if (c92 != null) {
                            groupedMessagePosition = c92.getPosition(messageObject);
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
            il ilVar = this.f37213bb;
            if (ilVar != null) {
                ilVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f37213bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                il ilVar2 = this.f37213bb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                ilVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new qe(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.nl0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.u0 k10 = this.actionBar.k(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.ik0 ik0Var = k10.f21336x;
                if (ik0Var != null && k10.f21337y != i10) {
                    k10.f21337y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(ik0Var, i10);
                }
            }
        }
        if (this.Y9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i15));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i16));
            }
            this.Y9.setSelectedMessages(arrayList2);
        }
    }

    public final void Q6() {
        MessageObject editingMessageObject;
        int abs;
        sk skVar = this.Y;
        if (skVar != null && (editingMessageObject = skVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f37253f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.ip[]) this.f37189a0.f931b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f37241e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        h5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new wg(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.af afVar = this.Y.F1;
                if (afVar != null) {
                    afVar.setVisibility(8);
                }
                h5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView Q7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f37498y8);
        if (this.f37434t8 == null) {
            vk vkVar = new vk(this, getParentActivity(), 2);
            this.f37434t8 = vkVar;
            vkVar.setOutlineProvider(new tl(this));
            this.f37434t8.setClipToOutline(true);
            this.f37434t8.setWillNotDraw(false);
            l4 l4Var = new l4(getParentActivity());
            this.f37459v8 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f37434t8.addView(this.f37459v8, w7.w5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f37472w8 = textureView;
            textureView.setOpaque(false);
            this.f37459v8.addView(this.f37472w8, w7.w5.d(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f37434t8.getParent();
        if (viewGroup != null && viewGroup != this.X0) {
            viewGroup.removeView(this.f37434t8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.X0.addView(this.f37434t8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(H9()), AndroidUtilities.roundPlayingMessageSize(H9())));
        }
        this.f37434t8.setTag(null);
        this.f37459v8.setDrawingReady(false);
        return this.f37472w8;
    }

    public final int Q8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f37478x0.getMeasuredHeight() - view.getBottom()) - this.f37478x0.getPaddingBottom()) + "} chatHeight=" + this.f37478x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f37478x0.getPaddingBottom());
        return (this.f37478x0.getMeasuredHeight() - view.getBottom()) - this.f37478x0.getPaddingBottom();
    }

    public final void Q9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.T5, messageObject);
        }
    }

    public final void Qa() {
        this.f37501yb = null;
        this.f37475wb = 0;
        this.f37489xb = -1;
        this.f37513zb = null;
        this.Ab = null;
        this.f37303j1.d(false);
    }

    public final void Qb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f37251ea);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
            a2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            a2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new bf(this, tL_game, messageObject, str, j3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(a2Var);
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
                    presentFragment(new sj1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        sj1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Qc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.d3 d3Var;
        if (this.fragmentView != null && !this.f37391q5) {
            int childCount = this.f37478x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f37478x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        MessageObject messageObject = w0Var.getMessageObject();
                        if (this.L7 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.L7 && w0Var.M()) {
                            org.telegram.ui.Wallet.f3 f3Var = w0Var.I0;
                            if (!f3Var.f34718h0 && (f3Var.f34713e0 == 0 || (d3Var = f3Var.f34711d0) == null || d3Var.c())) {
                                f3Var.e();
                                org.telegram.ui.Wallet.d3 d3Var2 = f3Var.f34711d0;
                                d3Var2.getClass();
                                d3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.d3 d3Var3 = f3Var.f34711d0;
                                d3Var3.f28467b = -1L;
                                d3Var3.f28468c = -1L;
                                f3Var.f34713e0 = SystemClock.elapsedRealtime();
                                f3Var.f34715f0 = false;
                                f3Var.f34705a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        if (this.f37434t8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = u1Var.getPhotoImage();
                            this.f37434t8.setTranslationX(u1Var.getX() + photoImage.getImageX());
                            this.f37434t8.setTranslationY((this.f37478x0.getY() + (photoImage.getImageY() + (u1Var.getY() + u1Var.getPaddingTop()))) - this.f37434t8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37434t8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.f37434t8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(H9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(H9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(H9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f37459v8.setResizeMode(0);
                                    this.f37434t8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(H9())) / AndroidUtilities.roundPlayingMessageSize(H9());
                                float imageWidth = u1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(H9());
                                if (this.f37434t8.getScaleX() != imageWidth) {
                                    this.f37434t8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f37434t8.setPivotX(0.0f);
                                this.f37434t8.setPivotY(0.0f);
                                this.f37434t8.setScaleX(imageWidth);
                                this.f37434t8.setScaleY(imageWidth);
                                this.f37472w8.setScaleX(roundPlayingMessageSize2);
                                this.f37472w8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f37434t8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f37459v8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f37434t8.setLayoutParams(layoutParams);
                                }
                                this.f37472w8.setScaleX(1.0f);
                                this.f37472w8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f37434t8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f37434t8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f37340m3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f37434t8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(H9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f37340m3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                F(playingMessageObject.getId(), 0, 0, 0, false, true);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f37486x8) {
                        this.f37478x0.invalidate();
                    }
                }
            }
        }
    }

    public final void R6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.W7;
        if (call != null && (((str = this.f37274g8) != null || this.f37285h8) && this.N5)) {
            org.telegram.ui.Components.voip.g2.l(this.f37241e, str, this.Y7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f37274g8 = null;
            this.f37285h8 = false;
            return;
        }
        if (this.f37274g8 != null && z10 && (chatFull = this.Z7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.v0.q(R.string.LinkHashExpired, org.telegram.ui.Components.zc.a0(this), R.raw.linkbroken, 36);
            this.f37274g8 = null;
        }
        this.X7 = !this.N5;
    }

    public final void R7() {
        if (this.X0 != null && this.K1 == null && getParentActivity() != null) {
            this.K1 = new org.telegram.ui.ActionBar.p0(this, getParentActivity(), 1);
            t9();
            this.K1.setClickable(true);
            this.M0.addView(this.K1, w7.w5.n(-1, 44));
            this.M0.h(2, this.K1);
            this.M0.g(this.K1);
            TextView textView = new TextView(getParentActivity());
            this.N1 = textView;
            int i10 = org.telegram.ui.ActionBar.h6.f20799q7;
            textView.setTextColor(getThemedColor(i10));
            TextView textView2 = this.N1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.X(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2));
            this.N1.setTag(Integer.valueOf(i10));
            this.N1.setTextSize(1, 14.0f);
            this.N1.setTypeface(AndroidUtilities.bold());
            this.N1.setSingleLine(true);
            this.N1.setMaxLines(1);
            this.N1.setGravity(17);
            this.K1.addView(this.N1, w7.w5.e(-1, -1, 51));
            this.N1.setOnClickListener(new ef(this, 13));
            org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(getParentActivity(), this.f37251ea);
            this.T1 = ia0Var;
            ia0Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.ge));
            this.T1.setTextSize(1, 13.3f);
            this.T1.setDisablePaddingsOffset(true);
            this.T1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.il));
            this.T1.setGravity(17);
            this.T1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.M0.addView(this.T1, w7.w5.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.M0.h(8, this.T1);
            this.M0.g(this.T1);
            TextView textView3 = new TextView(getParentActivity());
            this.L1 = textView3;
            int i11 = org.telegram.ui.ActionBar.h6.f20638he;
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
            textView4.setBackground(org.telegram.ui.ActionBar.h6.X(dp3, getThemedColor(i11) & 436207615, dp4, dp4, dp4, dp4));
            this.K1.addView(this.L1, w7.w5.e(-1, -1, 51));
            this.L1.setOnClickListener(new ef(this, 14));
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
            this.O1.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i11) & 436207615, 3, -1));
            this.M0.addView(this.O1, w7.w5.n(-1, 48));
            this.M0.h(4, this.O1);
            this.M0.g(this.O1);
            this.O1.setOnClickListener(new ef(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.U1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.U1.setContentDescription(LocaleController.getString(R.string.Close));
            this.U1.setBackground(org.telegram.ui.ActionBar.h6.N(getThemedColor(org.telegram.ui.ActionBar.h6.f20650i6), 0, 0));
            this.U1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20567de), PorterDuff.Mode.MULTIPLY));
            this.U1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.addView(this.U1, w7.w5.a(34.0f, 0.0f, 5.0f, 5.0f, 0.0f, 34, 53));
            this.U1.setOnClickListener(new ef(this, 16));
        }
    }

    public final vn R8() {
        if (this.f37373oc == null) {
            this.f37373oc = new vn(this);
        }
        return this.f37373oc;
    }

    public final boolean R9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.f6 f6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.f6 animation;
        boolean z10;
        org.telegram.ui.Cells.u1 messageCell;
        boolean z11;
        if (this.f37478x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.c50 c50Var = this.f37428t2;
            ArrayList<MessageObject> arrayList = null;
            if (c50Var != null && c50Var.getTag() != null && (messageCell = this.f37428t2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                f6Var = photoImage2.getAnimation();
                if (f6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f37478x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f37486x8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                f6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f37478x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f37478x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = u1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f37478x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f37478x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f37486x8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f37478x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    f6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                f6Var = animation;
                            }
                        }
                    }
                    i10++;
                }
            }
            if (messageObject != null && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                m9(true);
                if (messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                    MediaController mediaController = MediaController.getInstance();
                    if (playMessage) {
                        arrayList = U7(messageObject, false);
                    }
                    mediaController.setVoiceMessagesPlaylist(arrayList, false);
                    return playMessage;
                }
                SharedConfig.setNoSoundHintShowed(true);
                messageObject.audioProgress = f6Var.n();
                messageObject.audioProgressMs = f6Var.o();
                f6Var.stop();
                if (PhotoViewer.L1(messageObject)) {
                    PhotoViewer.f33701b9.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ra(org.telegram.ui.Cells.u1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Ra(org.telegram.ui.Cells.u1):void");
    }

    public final void Rb(boolean z10) {
        if (z10) {
            if (this.Cb == null) {
                qe qeVar = new qe(this, 11);
                this.Cb = qeVar;
                AndroidUtilities.runOnUIThread(qeVar, 100L);
                return;
            }
            return;
        }
        qe qeVar2 = this.Cb;
        if (qeVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(qeVar2);
        }
        this.Cb = null;
        this.Bb = false;
        Bc(true);
    }

    public final void Rc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        uj ujVar = this.f37190a1;
        if (ujVar == null) {
            return;
        }
        int i10 = this.R3;
        if (i10 == 8 && (chat2 = this.f37241e) != null) {
            if (this.T3) {
                String i11 = ng.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f37241e;
                ujVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f37232d4 > 0L ? 1 : (this.f37232d4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.f37241e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f37241e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f37241e;
                        }
                        this.f37190a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        uj ujVar2 = this.f37190a1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f37241e;
                        ujVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f37232d4));
                    this.f37190a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f37232d4));
                    if (chat7 == null) {
                        chat7 = this.f37241e;
                    }
                    this.f37190a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                uj ujVar3 = this.f37190a1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f37241e.title));
                TLRPC.Chat chat8 = this.f37241e;
                ujVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            ujVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.Q3)) {
                this.f37190a1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.Q3)) {
                this.f37190a1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f37190a1.setTitle(this.Q3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.P3.title)) {
                this.f37190a1.setTitle(this.P3.title);
            } else {
                this.f37190a1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j3 = this.f37232d4;
                if (j3 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j3));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j3));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f37190a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f37190a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f37190a1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f37190a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f37190a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f37190a1.setTitle("");
                }
            } else if (K9() && !UserObject.isBotForum(this.f37253f)) {
                if (this.f37281h4) {
                    Wc();
                } else if (this.f37270g4) {
                    if (this.X3.hasReplies()) {
                        this.f37190a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f37190a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f37190a1.setTitle(LocaleController.formatPluralString("Replies", this.X3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f37253f)) {
                this.f37190a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f37253f)) {
                this.f37190a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.R3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f37253f)) {
                        this.f37190a1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f37190a1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f37190a1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", L8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f37241e;
                    if (chat9 != null) {
                        uj ujVar4 = this.f37190a1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f37241e;
                        ujVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f37253f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f37190a1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f37253f.f19949id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f37253f.phone)) {
                                    uj ujVar5 = this.f37190a1;
                                    String g10 = org.telegram.messenger.am.g(new StringBuilder("+"), this.f37253f.phone, hf.b.c());
                                    TLRPC.User user4 = this.f37253f;
                                    ujVar5.h(g10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f37253f), this.f37253f.emoji_status, z10);
                                } else {
                                    uj ujVar6 = this.f37190a1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f37253f)));
                                    TLRPC.User user5 = this.f37253f;
                                    ujVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f37253f), this.f37253f.emoji_status, z10);
                                }
                            } else {
                                uj ujVar7 = this.f37190a1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f37253f)));
                                TLRPC.User user6 = this.f37253f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f37253f);
                                if (!MessagesController.isSupportUser(this.f37253f)) {
                                    emojiStatus = this.f37253f.emoji_status;
                                }
                                ujVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f37190a1.getTitleTextView().getText());
        Tc(false);
    }

    public final void S6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f37492y1 == null && ChatObject.isMegagroup(this.f37241e) && (chatFull = getMessagesController().getChatFull(this.f37241e.f19802id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            wk wkVar = this.O0;
            if (wkVar == null || wkVar.getVisibility() != 0) {
                org.telegram.ui.Components.d50 d50Var = org.telegram.ui.Components.d50.f25243n;
                if (d50Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j3 = groupStickerSetById.documents.get(0).f19808id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        d50Var.b();
                        ci.d4 d4Var = new ci.d4(getParentActivity(), 3);
                        this.f37492y1 = d4Var;
                        d4Var.i();
                        this.f37492y1.p(true);
                        ci.d4 d4Var2 = this.f37492y1;
                        d4Var2.K = Layout.Alignment.ALIGN_CENTER;
                        d4Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(j3, this.f37492y1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f37492y1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ci.d4 d4Var3 = this.f37492y1;
                        d4Var3.h = ci.d4.a(d4Var3.getText(), this.f37492y1.getTextPaint());
                        ci.d4 d4Var4 = this.f37492y1;
                        d4Var4.d = -1L;
                        d4Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new wg(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void S7() {
        int i10;
        if (this.R1 == null && getParentActivity() != null) {
            if (this.f37480x2 == null) {
                N7();
            }
            org.telegram.ui.Components.h41 h41Var = new org.telegram.ui.Components.h41(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.R1 = h41Var;
            h41Var.O = new qe(this, 5);
            dh.e o9 = eh.b.o(this.f37251ea);
            ah.c cVar = this.J;
            h41Var.setSideMenuBackgroundDrawable(cVar.c(h41Var, o9, false));
            org.telegram.ui.Components.h41 h41Var2 = this.R1;
            h41Var2.setTopMenuBackgroundDrawable(cVar.c(h41Var2, eh.b.o(this.f37251ea), false));
            this.R1.setCurrentTopic(d());
            this.R1.setOnNewTopicSelected(new qe(this, 6));
            this.R1.setOnTopicSelected(new ff(this, 0));
            this.R1.setOnDialogSelected(new ff(this, 1));
            int indexOfChild = this.X0.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.X0.addView(this.R1, i10, w7.w5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.R1.o();
            kk kkVar = this.I1;
            if (kkVar != null) {
                kkVar.bringToFront();
            }
        }
    }

    public final long S8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f37241e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f37241e)) {
            return 0L;
        }
        long j3 = this.f37232d4;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.p5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f37356n5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j3;
    }

    public final void S9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null) {
            return;
        }
        long j3 = messageObject.messageOwner.action.channel_id;
        if (b5Var.getFragmentStack().size() > 0) {
            m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            m2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (indexOf > 0 && !(m2Var instanceof eo) && !(m2Var instanceof ProfileActivity) && this.f37241e.creator) {
            int size = b5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) b5Var2.getFragmentStack().get(indexOf);
                if (m2Var2 instanceof eo) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new eo(sc.v.f(j3, "chat_id")));
                    m2Var2.removeSelfFromStack();
                } else if (m2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new ProfileActivity(sc.v.f(j3, "chat_id"), null));
                    m2Var2.removeSelfFromStack();
                } else if (m2Var2 instanceof xo) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new xo(sc.v.f(j3, "chat_id")));
                    m2Var2.removeSelfFromStack();
                } else if (m2Var2 instanceof wr) {
                    if (((wr) m2Var2).f43621e1 == 0) {
                        Bundle arguments = m2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) b5Var2).c(indexOf, new wr(arguments));
                    }
                    m2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(this, m2Var, messageObject, b5Var2, 5));
        }
        AndroidUtilities.runOnUIThread(new pe(this, j3, 1), 1000L);
    }

    public final void Sa() {
        org.telegram.ui.Components.gd0 i10;
        bo boVar = this.f37251ea;
        if (boVar != null) {
            Drawable d = boVar.d();
            if (this.fragmentView != null) {
                d = this.X0.getBackgroundImage();
            }
            if (d instanceof ho) {
                d = ((ho) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.gd0) {
                ((org.telegram.ui.Components.gd0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.d5) && (i10 = ((org.telegram.ui.ActionBar.d5) themedDrawable).i()) != null) {
                i10.x(false);
            }
        }
    }

    public final void Sb(boolean z10) {
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
                spannableString.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(this);
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
                    org.telegram.ui.Components.sc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new rf(this, z10, 0)), spannableString), i12);
                    M.f30540j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Sc() {
        Tc(false);
    }

    public final void T6() {
        ArrayList arrayList;
        int i10;
        if (this.Qa) {
            int i11 = -1;
            int i12 = 0;
            long j3 = 0;
            while (true) {
                arrayList = this.f37444u6;
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
                        Collections.sort(arrayList2, new lf(3));
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

    public final void T7() {
        if (this.y3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f37251ea);
            this.y3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.X0.addView(this.y3, w7.w5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
    }

    public final int T8() {
        return this.X0.getBackgroundSizeY();
    }

    public final void T9(boolean z10) {
        int i10;
        if (this.f37478x0 != null) {
            ArrayList arrayList = this.f37444u6;
            if (!arrayList.isEmpty() && !this.f37474wa.f42003n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f37502z0.h1(i10, 0);
                this.f37478x0.B0();
            }
        }
    }

    public final void Ta() {
        boolean z10;
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        wk wkVar;
        sk skVar = this.Y;
        if (skVar != null && skVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.Y4 && skVar != null && (wkVar = this.O0) != null && wkVar.getVisibility() != 0) {
            messageObject = this.f37356n5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.f37342m5) {
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
        long E7 = E7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.T5, E7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j10 = this.T5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f37342m5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        tn tnVar = this.f37330l5;
        MessageSuggestionParams messageSuggestionParams = this.f37271g5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        sk skVar2 = this.Y;
        if (skVar2 != null) {
            j3 = skVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.saveDraft(j10, E7, charSequence2, entities, message, tnVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void Tb(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f37270g4 && this.f37253f == null) {
                if (this.f37300ib == null) {
                    this.f37300ib = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f37300ib.booleanValue()) {
                    this.f37287hb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.O5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f37287hb) {
                    return;
                }
                this.f37287hb = z10;
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
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new bj(this, 3)).start();
                return;
            }
            this.f37287hb = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Tc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.s0 s0Var;
        if (this.f37190a1 != null) {
            int i10 = this.R3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.T5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f37241e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f37253f)) {
                    if (!UserObject.isReplyUser(this.f37253f) && ((!K9() || this.f37281h4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f37241e;
                    if (chat != null) {
                        drawable = this.f37190a1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f37253f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f37190a1.c(DialogObject.getBotVerificationIcon(this.f37253f));
                        }
                    }
                }
                this.f37190a1.j(drawable, mutate);
                if (!z10 && (s0Var = this.f37243e1) != null) {
                    if (isDialogMuted) {
                        if (s0Var.f21252m != 8) {
                            s0Var.f21252m = 8;
                            View view = s0Var.f21249j;
                            if (view instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view).getRightIcon().setVisibility(s0Var.f21252m);
                            }
                        }
                        this.f37243e1.d(LocaleController.getString(R.string.Unmute));
                        this.f37243e1.b(R.drawable.msg_mute);
                    } else {
                        if (s0Var.f21252m != 0) {
                            s0Var.f21252m = 0;
                            View view2 = s0Var.f21249j;
                            if (view2 instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view2).getRightIcon().setVisibility(s0Var.f21252m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.T5, d())) {
                            this.f37243e1.d(LocaleController.getString(R.string.Mute));
                            this.f37243e1.b(R.drawable.msg_unmute);
                        } else {
                            this.f37243e1.d(LocaleController.getString(R.string.Mute));
                            this.f37243e1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.hp hpVar = this.f37290i1;
                if (hpVar != null) {
                    hpVar.d(this.T5, d(), null);
                }
            }
        }
    }

    public final void U6(boolean z10) {
        gg.n1 n1Var;
        if (this.O3 == 2 && (n1Var = this.M3) != null) {
            String str = this.f37441u3;
            ci.rc rcVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f10744x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(rcVar);
                ai.w8 w8Var = n1Var.f10745y;
                if (w8Var != null && w8Var.I != 0) {
                    ConnectionsManager.getInstance(w8Var.f893c).cancelRequest(w8Var.I, true);
                    w8Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f10744x = str;
                    n1Var.f10745y = new ai.w8(n1Var.f10741r, str2, trim);
                    if (z10) {
                        rcVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(rcVar, 1000L);
                    }
                }
                ai.w8 w8Var2 = n1Var.f10745y;
                if (w8Var2 != null && w8Var2.J > 0) {
                    n1Var.l();
                }
            }
        }
    }

    public final ArrayList U7(MessageObject messageObject, boolean z10) {
        ArrayList k10 = org.telegram.messenger.v0.k(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f37444u6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.L6 || messageObject.getDialogId() == this.L6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    k10.add(messageObject2);
                }
            }
        }
        return k10;
    }

    public final float U8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.X0.getBackgroundTranslationY()) - ((1.0f - this.f37487x9) * this.f37422s9);
    }

    public final boolean U9() {
        sk skVar = this.Y;
        boolean z10 = skVar.f23772z2;
        if (z10) {
            skVar.u1();
            this.D3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Ua() {
        org.telegram.ui.Cells.u1 u1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f37478x0.getChildCount(); i11++) {
            View childAt = this.f37478x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int min = Math.min(u1Var2.getBottom(), this.f37478x0.getHeight()) - Math.max(0, u1Var2.getTop());
                if (min > i10) {
                    u1Var = u1Var2;
                    i10 = min;
                }
            }
        }
        if (u1Var != null) {
            dk dkVar = this.f37502z0;
            this.f37478x0.getClass();
            dkVar.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) this.f37422s9), false);
        }
    }

    public final void Ub() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ve(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20141a);
    }

    public final void Uc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Uc(boolean):void");
    }

    public final void V6() {
        this.S.d();
        Ac();
        kc();
        p7();
        m7();
        r7();
        q7();
        u7();
        u9();
        boolean z10 = true;
        if (this.v.f45760s == 1) {
            z10 = false;
        }
        if (this.Wa != z10) {
            this.Wa = z10;
            checkSystemBarColors();
        }
    }

    public final void V7(final int i10, final int i11, final boolean z10) {
        this.A0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f37444u6;
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
        ak akVar = this.f37478x0;
        if (akVar != null) {
            akVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Tb(true);
        }
        qm qmVar = this.A0;
        qmVar.L = true;
        qmVar.O(true);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                eo eoVar = eo.this;
                MessagesController messagesController = eoVar.getMessagesController();
                long j10 = eoVar.T5;
                if (ChatObject.isChannel(eoVar.f37241e)) {
                    j3 = eoVar.T5;
                } else {
                    j3 = 0;
                }
                messagesController.deleteMessagesRange(j10, j3, i10, i11, z10, new wg(eoVar, 18));
            }
        }, new vf(this, 28));
    }

    public final float V8() {
        org.telegram.ui.Components.h41 h41Var = this.R1;
        if (h41Var != null) {
            return h41Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Va(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Va(org.telegram.messenger.MessageObject):void");
    }

    public final void Vb() {
        String str;
        if (this.Gb != null) {
            return;
        }
        if (this.f37356n5 != null) {
            str = getMessagesController().getFullName(this.f37356n5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new ve(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(this, 18));
        a2Var.setOnDismissListener(new ue(this, 8));
        this.Gb = alertDialog$Builder.o();
    }

    public final void Vc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.s0 s0Var = this.f37426t0;
        if (s0Var != null) {
            TLRPC.Chat chat = this.f37241e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f37220c4) && (tL_forumTopic = this.f37220c4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s0Var.e(i10);
        }
    }

    public final void W6() {
        TLRPC.Chat chat;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                qa("");
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                db(null, user);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j10))) != null) {
            qa("");
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            db(chat, null);
        }
    }

    public final void W7(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.u1 u1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i10;
        String str2;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.s80 I = org.telegram.ui.Components.s80.I(this, u1Var);
        org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0(getParentActivity(), this.f37251ea);
        I.f30467p = new we(mn0Var, 0);
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
            xe xeVar = new xe(this, str, characterStyle, messageObject, u1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            u1Var2 = u1Var;
            I.c(i13, string, xeVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            u1Var2 = u1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new ye(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new ye(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new ze(this, messageObject2, 0), false);
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
        I.c(i14, LocaleController.getString(i10), new ai.t4(this, str, messageObject2, startsWith, 10), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new ye(this, str, 2), false);
        }
        mn0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            mn0Var.f(u1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.a71) {
            String url = ((org.telegram.ui.Components.a71) characterStyle2).getURL();
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
            mn0Var.f(u1Var2, characterStyle2, spannableString2, false);
        } else {
            mn0Var.f(u1Var2, characterStyle2, null, false);
        }
        showDialog(mn0Var);
    }

    public final int W8() {
        return (int) (V8() * AndroidUtilities.dp(71.0f));
    }

    public final void Wa(long j3) {
        dk dkVar;
        MessageObject messageObject;
        int Q8;
        int abs;
        ak akVar = this.f37478x0;
        int i10 = -1;
        if (akVar != null && (dkVar = this.f37502z0) != null && dkVar.f47886y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = akVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f37478x0.getChildAt(childCount);
                this.f37478x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j3 && (abs = Math.abs((Q8 = Q8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = Q8;
                    i12 = abs;
                }
            }
            this.f37358n7 = i10;
            this.f37369o7 = i11;
            return;
        }
        this.f37358n7 = -1;
    }

    public final void Wb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.c50 c50Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((c50Var = this.f37339m2) != null && c50Var.getVisibility() == 0)) {
                this.f37339m2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f37339m2.f(view, true);
                }
            }
        }
    }

    public final void Wc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        uj ujVar = this.f37190a1;
        if (ujVar != null && (tL_forumTopic = this.f37220c4) != null) {
            ujVar.setTitle(tL_forumTopic.title);
        }
        Xc();
    }

    public final void X6() {
        MessageObject messageObject;
        if (!this.D4 && (messageObject = this.J7) != null) {
            if (this.f37444u6.indexOf(messageObject) >= 0) {
                this.E4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.C4 != null) {
        } else {
            vf vfVar = new vf(this, 20);
            this.C4 = vfVar;
            AndroidUtilities.runOnUIThread(vfVar);
        }
    }

    public final void X7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.u1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.X7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1):void");
    }

    public final int X8(int i10) {
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

    public final void X9() {
        M6(this.P0, 5, true);
        M6(this.Y, 1, false);
        M6(this.R2, 4, true);
        M6(this.O0, 3, false);
        M6(this.R, 2, false);
        float f7 = this.f37476wc.f16087e;
        j6.l lVar = this.Bc;
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 1.0f - ((float[]) lVar.f14059b)[5], 1.0f);
        jh.c cVar = this.P0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(b10);
        }
        sk skVar = this.Y;
        if (skVar != null) {
            skVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        vk vkVar = this.R2;
        if (vkVar != null) {
            vkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        wk wkVar = this.O0;
        if (wkVar != null) {
            wkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        vk vkVar2 = this.R;
        if (vkVar2 != null) {
            vkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        hh.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - b10) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        wk wkVar2 = this.O0;
        me.b bVar = this.f37450uc;
        if (wkVar2 != null) {
            wkVar2.setTotalVisibilityFactor((1.0f - bVar.f16087e) * ((float[]) lVar.f14059b)[3]);
        }
        aq aqVar = this.P9;
        if (aqVar != null) {
            float f10 = bVar.f16087e;
            if (aqVar.S != f10) {
                aqVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        t7();
    }

    public final void Xa() {
        int i10;
        int i11;
        ak akVar = this.f37478x0;
        if (akVar != null && this.f37502z0 != null) {
            for (int childCount = akVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f37478x0.getChildAt(childCount);
                this.f37478x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i10 = Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f37502z0.h1(i11, i10);
        }
    }

    public final void Xb(MessageSuggestionParams messageSuggestionParams) {
        if (this.p5 == null) {
            return;
        }
        new yh.c0(getParentActivity(), this.currentAccount, this.T5, messageSuggestionParams, this, getResourceProvider(), 0, new gf(this, 0)).show();
    }

    public final void Xc() {
        uj ujVar;
        uj ujVar2;
        if (UserObject.isBotForum(this.f37253f) && (ujVar2 = this.f37190a1) != null) {
            ujVar2.getAvatarImageView().setVisibility(0);
            this.f37190a1.b();
        } else if (this.f37220c4 != null && (ujVar = this.f37190a1) != null) {
            ujVar.getAvatarImageView().setVisibility(0);
            ng.d.p(this.f37190a1.getAvatarImageView(), this.f37220c4, true, true, this.f37251ea);
        }
    }

    public final void Y6(boolean z10) {
        if (this.f37356n5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f37444u6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f37356n5.getId() && messageObject.getDialogId() == this.f37356n5.getDialogId()) {
                        this.f37356n5 = messageObject;
                        tn tnVar = this.f37330l5;
                        if (tnVar != null) {
                            tnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f37259f5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f37356n5;
                                MessageObject.GroupedMessages groupedMessages = this.f37306j5;
                                if (groupedMessages == null) {
                                    groupedMessages = D8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.T5, this.f37330l5);
                            }
                            m8();
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

    public final void Y7(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, String str) {
        dj P9 = P9(u1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(hf.b.d(str, false));
        wa waVar = new wa(this, u1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                waVar.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new r1(this, tL_contact, waVar, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = hf.b.d(str, false);
        P9.f16869b = new nf(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ea(this, P9, waVar, 3)), 0);
        P9.d();
    }

    public final int Y8(int i10) {
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

    public final void Y9(boolean z10, boolean z11) {
        if (this.D3) {
            AndroidUtilities.runOnUIThread(new qe(this, 20), 200L);
            if (z11) {
                this.D3 = false;
            }
        }
        if (z10 && !this.Pa) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int Ya(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        MessageObject messageObject2;
        if (!TextUtils.isEmpty(this.P7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages D8 = D8(messageObject.getGroupId());
                org.telegram.ui.Cells.u1 u1Var2 = this.f37334l9;
                if (u1Var2 != null && (textLayoutBlocks2 = u1Var2.f23236ye) != null && D8 != null && (messageObject2 = D8.captionMessage) != null) {
                    i10 = u1Var2.f23222xe;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (u1Var2 != null) {
                        u1Var2.f23222xe = 0;
                        u1Var2.f23236ye = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.f37334l9) != null && (textLayoutBlocks = u1Var.f22914c4) != null) {
                i10 = (int) u1Var.f23108q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var3 = this.f37334l9;
                if (u1Var3 != null && u1Var3.f23150t1) {
                    i10 = u1Var3.f23050m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var4 = this.f37334l9;
            if (u1Var4 != null) {
                u1Var4.f23222xe = 0;
                u1Var4.f23236ye = null;
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
                    if (C9()) {
                        f7 = 0.7f;
                    } else {
                        f7 = 0.5f;
                    }
                    if (lineTop <= f10 * f7) {
                        return 0;
                    }
                    float f12 = AndroidUtilities.displaySize.y;
                    if (C9()) {
                        f11 = 0.7f;
                    }
                    return (int) (lineTop - (f12 * f11));
                }
            }
            return 0;
        }
        org.telegram.ui.Cells.u1 u1Var5 = this.f37334l9;
        if (u1Var5 != null) {
            u1Var5.f23222xe = 0;
            u1Var5.f23236ye = null;
        }
        return 0;
    }

    public final void Yb(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f37298i9 && this.f37310j9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f37298i9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f37286h9 == null) {
                        vl vlVar = new vl(getParentActivity(), this.f37251ea, this);
                        this.f37286h9 = vlVar;
                        this.X0.addView(vlVar, w7.w5.a(56.0f, 8.0f, 0.0f, 8.0f, 8.0f, -2, 83));
                    }
                    this.f37286h9.c();
                }
            }
        }
    }

    public final void Yc() {
        int i10;
        org.telegram.ui.ActionBar.s0 s0Var = this.f37327l0;
        if (s0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        s0Var.e(i10);
    }

    public final void Z6() {
        wk wkVar;
        vk vkVar;
        vk vkVar2;
        sk skVar = this.Y;
        if (skVar != null && skVar.f23627b4) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f37241e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((wkVar = this.O0) == null || wkVar.getVisibility() != 0) && (((vkVar = this.R) == null || vkVar.getVisibility() != 0) && ((vkVar2 = this.R2) == null || vkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void Z7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.Z7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final long Z8() {
        return this.f37232d4;
    }

    public final void Z9() {
        this.D4 = true;
        xm xmVar = this.f37225c9;
        AndroidUtilities.cancelRunOnUIThread(xmVar.f21624f0);
        xmVar.f21650z = false;
        qe qeVar = new qe(this, 8);
        int i10 = this.D7;
        if (i10 != 0) {
            bb(i10, 0, false, this.C7, true, 0, null, null, qeVar);
            return;
        }
        int i11 = this.B7;
        if (i11 > 0) {
            bb(i11, 0, true, this.C7, true, 0, null, null, qeVar);
            return;
        }
        ab(!this.cb, qeVar);
        this.cb = false;
        if (!this.H4.isEmpty()) {
            this.O4 = true;
            this.N4 = ((Integer) this.H4.get(0)).intValue();
        }
    }

    public final void Za() {
        ab(false, null);
    }

    public final void Zb(boolean z10, boolean z11) {
        sk skVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f37415s2 != null) && this.R3 == 0 && (skVar = this.Y) != null && skVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f37415s2 == null) {
                    wm wmVar = this.X0;
                    int indexOfChild = wmVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(9, getParentActivity(), this.f37251ea, false);
                        this.f37415s2 = c50Var;
                        wmVar.addView(c50Var, indexOfChild + 1, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f37415s2.b(true);
                    return;
                }
                if (this.Y.f23645e2) {
                    org.telegram.ui.Components.c50 c50Var2 = this.f37415s2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    c50Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f37415s2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f37415s2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Zc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        ak akVar = this.f37478x0;
        if (akVar != null) {
            if (!this.D4 && this.J7 != null) {
                int childCount = akVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f37478x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.J7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f37444u6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.J7) + this.A0.J;
                                i11 = Q8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f37478x0.getChildCount();
            sk skVar = this.Y;
            if (skVar != null) {
                skVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f37478x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                    MessageObject messageObject3 = u1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        u1Var.X3(messageObject3, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        qm qmVar = this.A0;
                        this.f37478x0.getClass();
                        qmVar.Q(RecyclerView.R(u1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f37502z0.h1(i10, i11);
            }
        }
    }

    public long a() {
        return this.T5;
    }

    public final boolean a7(boolean z10, boolean z11) {
        sk skVar = this.Y;
        if (skVar == null || !skVar.w0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f37251ea);
            if (this.Y.f23631c1) {
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ai.k(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20141a);
            return true;
        }
        return true;
    }

    public final void a8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.a8(int, java.lang.Object[]):void");
    }

    public final float a9(float f7) {
        eo eoVar = this.f37238da;
        if (eoVar == null) {
            eoVar = this;
        }
        org.telegram.ui.Components.hh hhVar = eoVar.M0;
        if (hhVar == null) {
            return 0.0f;
        }
        return hhVar.c(f7);
    }

    public final void ab(boolean z10, qe qeVar) {
        ArrayList arrayList;
        int i10;
        if (this.f37478x0.V1) {
            return;
        }
        this.N4 = 0;
        this.f37396qb = 0;
        this.O4 = false;
        this.W8.f(0);
        if (this.E6[0] && this.H7 == 0 && this.f37445u7 == 0) {
            this.f37303j1.d(false);
            if (this.f37502z0.I0() == 0) {
                this.f37275g9 = false;
                zc();
                Ma();
                ad(false);
                return;
            }
            this.A0.T();
            qn qnVar = this.Ma;
            qnVar.f41365a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f37444u6;
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
            zk zkVar = this.W8;
            qnVar.f41366b = i11;
            qnVar.d = 0;
            boolean z11 = !z10;
            qnVar.f41367c = z11;
            zkVar.d(i11, 0, z11, true);
            this.f37275g9 = false;
            zc();
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = this.f37384pb;
        if (a2Var != null) {
            a2Var.dismiss();
        }
        Bc(false);
        if (qeVar != null) {
            qeVar.run();
        } else {
            Qa();
            org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, this.f37251ea);
            this.f37384pb = a2Var2;
            a2Var2.setOnCancelListener(this.f37347ma);
            this.f37384pb.q(1000L);
        }
        this.Y8 = this.V5;
        this.f37197a9 = false;
        this.Z8 = 0;
        this.f37211b9 = false;
        ArrayList arrayList2 = this.f37283h6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.V5));
        AndroidUtilities.runOnUIThread(new vf(this, 12), 0L);
    }

    public final boolean ac(MessageObject messageObject) {
        if (this.R3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void ad(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.ad(boolean):void");
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
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.T5, this.f37356n5, this.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = H8();
        of2.payStars = j3;
        of2.monoForumPeer = S8();
        of2.suggestionParams = this.f37271g5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.R3 == 0) {
            T9(false);
        }
        if (i10 == 0 || i10 == 1) {
            B6();
        }
        if (this.f37391q5) {
            this.Q5 = true;
        }
    }

    public final void b7() {
        if (!this.Sb) {
            this.Sb = true;
            if (!this.Tb && this.R3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f37452v1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f37452v1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f37465w1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f37465w1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    c7();
                }
            }
        }
    }

    public final void b8(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.b8(int, java.lang.Object[]):void");
    }

    public final float b9(org.telegram.ui.Components.d41 d41Var) {
        float f7;
        org.telegram.ui.Components.h41 h41Var = this.R1;
        if (h41Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j3 = h41Var.j(d41Var);
            if (d41Var == org.telegram.ui.Components.d41.f25239b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * j3;
        }
        return 0.0f;
    }

    public final void ba(long j3, String str, boolean z10) {
        ca();
        ai.h4 h4Var = this.J1;
        if (h4Var != null) {
            h4Var.R1(j3, str, z10, false);
        }
    }

    public final void bb(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void bc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            zg.t tVar = this.Y9;
            if (tVar != null && tVar.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            if (this.f37302j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21060n0) {
                    kVar.i(true);
                    this.Y.g1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ii.e2 e2Var = new ii.e2(richMessage);
                e2Var.J = this;
                e2Var.f12382r = messageObject;
                presentFragment(e2Var);
                return;
            }
            this.I1.getAdapter().f10672f0 = false;
            this.Y.setVisibility(0);
            Cb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            lc(false);
            if (!z10) {
                Q6();
            }
            if (z10) {
                this.f37271g5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.X0(false, false, true);
            Cc(0, true);
            ad(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.R3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.T5);
                tL_messages_getMessageEditData.f19894id = messageObject.getId();
                this.f37367o5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new te(this, 3));
                return;
            }
            sk skVar = this.Y;
            org.telegram.ui.Components.af afVar = skVar.F1;
            if (afVar != null) {
                afVar.setEnabled(true);
                skVar.F1.h(false);
            }
        }
    }

    @Override
    public final boolean c() {
        if (this.R3 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        org.telegram.ui.Cells.u1 u1Var;
        ci.d4 d4Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        ci.d4 d4Var2 = this.f37479x1;
        if (d4Var2 != null && !d4Var2.V && !this.Vb && this.Sb && !this.yc.f16088f && System.currentTimeMillis() - this.Ub > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f37478x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f37478x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        u1Var = (org.telegram.ui.Cells.u1) childAt;
                        zg.o0 o0Var = u1Var.N;
                        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !o0Var.v.isEmpty()) {
                            u1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + o0Var.d;
                            if (f7 >= AndroidUtilities.dp(240.0f) && f7 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    u1Var = null;
                    break;
                }
            }
            if (u1Var != null) {
                zg.o0 o0Var2 = u1Var.N;
                this.Vb = true;
                u1Var.getLocationInWindow(iArr);
                this.f37479x1.setTranslationY(((iArr[1] - d4Var.getTop()) - AndroidUtilities.dp(120.0f)) + o0Var2.d);
                this.f37479x1.m(0.0f, (((zg.l0) o0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + o0Var2.f54848c);
                this.f37479x1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new qe(this, 19));
            AndroidUtilities.runOnUIThread(new qe(this, 19), 2000L);
        }
    }

    public final void c8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.c8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages c9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f37484x6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ca() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            sk skVar = this.Y;
            if (skVar == null || TextUtils.isEmpty(skVar.getSlowModeTimer())) {
                sk skVar2 = this.Y;
                if (skVar2 != null && skVar2.L5.f16088f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H7();
                ai.h4 h4Var = this.J1;
                if (!z10 && this.R3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                h4Var.U1 = z11;
                h4Var.f24354j0.f0();
                TLRPC.Chat chat = this.f37241e;
                if ((chat == null || this.f37271g5 == null) && !z10 && this.R3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f37241e.slowmode_enabled) {
                        this.J1.N1(10, true);
                    } else {
                        this.J1.N1(-1, true);
                    }
                } else {
                    this.J1.N1(1, true);
                }
                ai.h4 h4Var2 = this.J1;
                h4Var2.V0 = true;
                h4Var2.A1.setVisibility(0);
                h4Var2.T0 = 0;
                h4Var2.F = false;
                h4Var2.G = false;
                h4Var2.f24351i0 = true;
                h4Var2.J = null;
                org.telegram.ui.ActionBar.u0 u0Var = h4Var2.f24366n1;
                if (u0Var != null) {
                    h4Var2.f24362m1.setTranslationY(0.0f);
                    u0Var.setVisibility(8);
                }
                this.J1.t1();
                this.J1.o1().setText(this.Y.getFieldText());
                ai.h4 h4Var3 = this.J1;
                h4Var3.f24377r = this.f37251ea;
                showDialog(h4Var3);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ne neVar;
        if ((this.R3 != 5 || (!this.f37444u6.isEmpty() && this.f37232d4 != 0)) && !this.yc.f16088f && this.f37360n9) {
            sk skVar = this.Y;
            if (!skVar.F2) {
                if (!skVar.f23631c1 || (neVar = skVar.f23644e1) == null || neVar.getVisibility() != 0) {
                    if ((!skVar.k0() || !skVar.f23685l0.v) && !org.telegram.ui.ActionBar.m2.hasSheets(skVar.P2) && this.N9 == 0.0f) {
                        uh.i iVar = this.X9;
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

    public final void cb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.cb(java.lang.CharSequence, boolean):void");
    }

    public final void cc() {
        org.telegram.ui.Components.k10 k10Var = this.f37346m9;
        if (k10Var != null && !k10Var.f27716c) {
            k10Var.c(false);
            try {
                this.f37346m9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f37281h4 && (i10 = this.R3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f37232d4;
    }

    public final void d7(boolean z10) {
        int i10;
        if (this.f37502z0 != null && !this.f37391q5 && !this.A0.L && !this.f7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f37478x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f37478x0.getChildAt(i14));
                if (R != -1) {
                    if (i13 == -1 || R < i13) {
                        i13 = R;
                    }
                    if (i12 == -1 || R > i12) {
                        i12 = R;
                    }
                    i11++;
                }
            }
            qm qmVar = this.A0;
            if (qmVar.N) {
                int i15 = qmVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = qmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.R3 == 7) {
                if ((h - i13) - i11 <= i16 && !this.G6 && !this.C6[0]) {
                    this.G6 = true;
                    this.f37283h6.add(Integer.valueOf(this.V5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f37441u3;
                    int i17 = this.classGuid;
                    int i18 = this.O3;
                    int i19 = this.V5;
                    this.V5 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.hf(this, h, i13, i11, i16, 1));
        }
    }

    public final void d8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.d8(int, java.lang.Object[]):void");
    }

    public final void d9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f37454v3;
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
        boolean z11 = this.Qa;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j3, j10, i14, i10, this.f37232d4, this.f37365o3, this.f37377p3, this.f37389q3);
        Pb(false);
    }

    public final void da() {
        ut.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        H7();
        this.J1.f24354j0.f0();
        this.J1.N1(1, false);
        ai.h4 h4Var = this.J1;
        h4Var.X1 = true;
        h4Var.k1(null);
        this.J1.t1();
        ai.h4 h4Var2 = this.J1;
        h4Var2.f24377r = this.f37251ea;
        if (this.visibleDialog != null) {
            h4Var2.show();
        } else {
            showDialog(h4Var2);
        }
    }

    public final void db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f37365o3 = user;
        this.f37377p3 = chat;
        if (this.f37302j0 != null && this.I1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f37365o3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f37354n3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.D(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.h6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f37302j0.setSearchFieldCaption(spannableString);
                    this.I1.getAdapter().U(null, 0, null, false, true);
                    this.f37302j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f37302j0;
                    u0Var.f21329r = null;
                    ci.g2 g2Var = u0Var.f21314e;
                    if (g2Var != null) {
                        g2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f37429t3 = "";
                    mediaDataController.searchMessagesInChat("", this.T5, this.L6, this.classGuid, 0, this.f37232d4, this.f37365o3, this.f37377p3, this.f37389q3);
                }
            }
        }
    }

    public final void dc() {
        long j3;
        qe qeVar = this.U7;
        if (qeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qeVar);
        }
        qe qeVar2 = new qe(this, 18);
        this.U7 = qeVar2;
        if (this.P7 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(qeVar2, j3);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j3;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        uj ujVar;
        sk skVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.uu editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.dz0 dz0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        sk skVar2;
        eo eoVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            eoVar.f8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            ak akVar = eoVar.f37478x0;
            if (akVar != null) {
                akVar.f1();
            }
            org.telegram.ui.Components.zi ziVar = eoVar.M9;
            if (ziVar != null) {
                ziVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == eoVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        eoVar.finishFragment();
                        b.b(eoVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ai.h4 h4Var = eoVar.J1;
                if (h4Var != null && h4Var.isShowing()) {
                    eoVar.J1.dismiss(true);
                }
                if (z11 && (skVar2 = eoVar.Y) != null && skVar2.u0()) {
                    eoVar.Y.n0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f19822id = stickerSet2.f19829id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = eoVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.dz0) && (tL_messages_stickerSet = (dz0Var = (org.telegram.ui.Components.dz0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f19829id == stickerSet2.f19829id) {
                            dz0Var.E0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.zc zcVar = new org.telegram.ui.Components.zc(dz0Var.container, eoVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.sc r10 = zcVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f30540j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.dz0 dz0Var2 = new org.telegram.ui.Components.dz0(eoVar.getParentActivity(), eoVar, tL_inputStickerSetID, null, eoVar.Y, eoVar.f37251ea);
                            final boolean z15 = z12;
                            eoVar = this;
                            dz0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    eo.T0(eo.this, objArr, dz0Var2, z15, stickerSet2);
                                }
                            });
                            eoVar.showDialog(dz0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                ak akVar2 = eoVar.f37478x0;
                if (akVar2 != null) {
                    akVar2.f1();
                }
                TextView textView = eoVar.Q2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.h5 h5Var = eoVar.D2[i13];
                    if (h5Var != null) {
                        h5Var.invalidate();
                    }
                }
                kk kkVar = eoVar.I1;
                if (kkVar != null) {
                    kkVar.getListView().f1();
                }
                ai.w0 w0Var = eoVar.L3;
                if (w0Var != null) {
                    w0Var.f1();
                }
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                sk skVar3 = eoVar.Y;
                if (skVar3 != null && (editField = skVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ai.q4[] q4VarArr = eoVar.E2;
                ai.q4 q4Var = q4VarArr[0];
                if (q4Var != null) {
                    q4Var.invalidate();
                }
                ai.q4 q4Var2 = q4VarArr[1];
                if (q4Var2 != null) {
                    q4Var2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (eoVar.Z7 != null && (chat = eoVar.f37241e) != null && chat.f19802id == l4.longValue()) {
                    eoVar.Z7.online_count = ((Integer) objArr[1]).intValue();
                    uj ujVar2 = eoVar.f37190a1;
                    if (ujVar2 != null) {
                        ujVar2.m();
                        eoVar.f37190a1.o(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == eoVar.T5 && (skVar = eoVar.Y) != null) {
                    skVar.T1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                sk skVar4 = eoVar.Y;
                if (skVar4 != null) {
                    skVar4.U1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (eoVar.f37241e != null) {
                        TLRPC.Chat chat2 = eoVar.getMessagesController().getChat(Long.valueOf(eoVar.f37241e.f19802id));
                        if (chat2 != null) {
                            eoVar.f37241e = chat2;
                        }
                    } else if (eoVar.f37253f != null && (user = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.f37253f.f19949id))) != null) {
                        eoVar.f37253f = user;
                    }
                    eoVar.Rc(true);
                }
                if (!eoVar.K9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (eoVar.f37241e != null && (ujVar = eoVar.f37190a1) != null) {
                        ujVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    eoVar.p();
                    eoVar.ad(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && eoVar.f37241e != null) {
                    eoVar.D9();
                    TLRPC.Chat chat3 = eoVar.getMessagesController().getChat(Long.valueOf(eoVar.f37241e.f19802id));
                    if (chat3 != null) {
                        eoVar.f37241e = chat3;
                        eoVar.D9();
                        z10 = !eoVar.K9();
                        eoVar.lc(false);
                        sk skVar5 = eoVar.Y;
                        if (skVar5 != null) {
                            skVar5.d1(eoVar.currentAccount, eoVar.T5);
                        }
                        FlagSecureReason flagSecureReason = eoVar.E3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                uj ujVar3 = eoVar.f37190a1;
                if (ujVar3 != null && z10) {
                    ujVar3.o(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    eoVar.Uc(true);
                }
                org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37277h0;
                if (u0Var != null) {
                    if (ChatObject.isChannel(eoVar.f37241e) && !ChatObject.isMonoForum(eoVar.f37241e)) {
                        long j10 = eoVar.f37241e.linked_monoforum_id;
                        if (j10 != 0 && ChatObject.canManageMonoForum(eoVar.currentAccount, -j10)) {
                            z13 = true;
                        }
                    }
                    u0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!eoVar.Pa) {
                    if (longValue == eoVar.T5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = eoVar.R3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !eoVar.isPaused && LaunchActivity.U() == eoVar && eoVar.f37259f5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                eoVar.oa(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            eoVar.Da(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(eoVar.f37241e) && !eoVar.f37241e.megagroup && (chatFull = eoVar.Z7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                eoVar.f37457v6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        eoVar.z7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                eoVar.N9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                eoVar.w6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == eoVar.T5) {
                        eoVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (b5Var = eoVar.parentLayout) != null && b5Var.getFragmentStack().size() > 1) {
                    eoVar.finishFragment();
                } else {
                    eoVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == eoVar.a() && (booleanValue || eoVar.parentLayout.getLastFragment() != eoVar)) {
                    if (eoVar.parentLayout.getLastFragment() == eoVar) {
                        eoVar.finishFragment();
                    } else {
                        eoVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = eoVar.f37368o6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = eoVar.f37241e;
                    if (chat4 != null && chat4.f19802id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (eoVar.f37391q5) {
                            di diVar = eoVar.f37355n4;
                            if (diVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(diVar);
                                eoVar.f37355n4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            di diVar2 = new di(eoVar, messageObject2, intValue3);
                            eoVar.f37355n4 = diVar2;
                            AndroidUtilities.runOnUIThread(diVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = eoVar.f37241e;
                    if (chat5 != null && chat5.f19802id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = eoVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(eoVar.f37241e, eoVar.getMessagesController().getChatFull(eoVar.f37241e.f19802id)));
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
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && eoVar.T5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = eoVar.f37232d4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = eoVar.f37318k4;
                            ArrayList arrayList2 = eoVar.f37444u6;
                            if (intValue4 > i19) {
                                eoVar.f37318k4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= eoVar.f37318k4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        qm qmVar = eoVar.A0;
                                        if (qmVar != null) {
                                            qmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > eoVar.l4) {
                                eoVar.l4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= eoVar.l4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        qm qmVar2 = eoVar.A0;
                                        if (qmVar2 != null) {
                                            qmVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        eoVar.a8(i10, objArr);
        eoVar.b8(i10, objArr);
        eoVar.c8(i10, objArr);
        eoVar.d8(i10, objArr);
        eoVar.e8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ai.h4 h4Var = this.J1;
        if (h4Var != null && this.visibleDialog == h4Var) {
            h4Var.f24354j0.a0(false);
            this.J1.dismissInternal();
            this.J1.f24354j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J1 && dialog != this.f37212ba && !(dialog instanceof ei.k3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f37407r8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f37407r8 = true;
            org.telegram.ui.Components.g5.r0(getParentActivity(), this.currentAccount, new qe(this, 10), true, this.f37251ea);
        }
    }

    public final void e8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.e8(int, java.lang.Object[]):void");
    }

    public final void e9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.e9():void");
    }

    public final void ea(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.u1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.ea(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.u1, org.telegram.messenger.MessageObject):void");
    }

    public final void eb(View view, MessageObject messageObject, org.telegram.ui.Components.nl0 nl0Var, View view2, float f7, float f10, zg.n0 n0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        yh.w3 w3Var;
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
            if (n0Var != null && n0Var.f54837a) {
                D7(true);
                if (view == null) {
                    a0Var = t8(messageObject.getId(), true);
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
                    long j3 = -yh.h5.b(messageObject).f52860a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                        org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    yh.m5 m5Var = yh.n5.y(this.currentAccount, false).B;
                    if (m5Var != null) {
                        m5Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j10 = this.T5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    yh.h8 h8Var = new yh.h8(parentActivity, i15, j10, this, messageObject, arrayList2, z14, false, 0L, this.f37251ea);
                    messageObject.getId();
                    h8Var.U = this;
                    h8Var.V = a0Var;
                    h8Var.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -yh.h5.b(messageObject).f52860a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                yh.m5 d02 = yh.n5.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f37397qc == null) {
                        this.f37397qc = new yh.w3(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        w3Var = null;
                    } else {
                        if (this.f37397qc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f37397qc);
                            layoutContainer.addView(this.f37397qc, w7.w5.d(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f37397qc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f37397qc.bringToFront();
                        }
                        w3Var = this.f37397qc;
                    }
                    w3Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f53104o = w3Var;
                    w3Var.I = false;
                    w3Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    w3Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.u1) {
                        i12 = ((org.telegram.ui.Cells.u1) a0Var).V;
                    } else {
                        i12 = 0;
                    }
                    w3Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            zg.n0 n0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new rg.y0((org.telegram.ui.ActionBar.m2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(n0Var) && (chat = this.f37241e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f37241e, 26)) {
                org.telegram.messenger.v0.q(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.zc.a0(this), R.raw.e_hand_2, 36);
            } else {
                zg.j0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(n0Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.i iVar = this.f37484x6;
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
                    org.telegram.ui.Cells.a0 t82 = t8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && t82 != null && n0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j12 = n0Var.f54842g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(n0Var.f54841f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.s5.f(this.currentAccount, j12);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.sc r10 = org.telegram.ui.Components.zc.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f30540j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (nl0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        zg.j0.d(this, nl0Var, t82, view2, f7, f10, n0Var, i19, i10);
                    }
                }
                if (selectReaction && n0Var != null && (str = n0Var.f54841f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<zg.n0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    n0Var2 = n0Var;
                }
                aj ajVar = new aj(this, z13, z10, i18, selectReaction, nl0Var, f7, f10, n0Var, messageObject);
                this.f37227cc = ajVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, n0Var2, z11, z12, this, ajVar);
                if (z10 || z13) {
                    uc(messageObject, true);
                    this.f37227cc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f37227cc, 50L);
                }
            }
        }
    }

    public final void ec() {
        AndroidUtilities.forEachViews((RecyclerView) this.f37478x0, (Utilities.Callback<View>) new ai.j3(4, this, y9()));
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        sk skVar = this.Y;
        if (skVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.T5, (int) d());
            me.b bVar = skVar.K5;
            gi.a aVar = skVar.I0;
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
            if (z10 && bVar.f16087e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((me.b) aVar.f10893c).a(z12, z13);
            aVar.setClickable(z12);
            aVar.setEnabled(z12);
            if (bVar.f16088f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            skVar.f23756w5 = streamingSendButtonState;
            if (z14) {
                skVar.L(z10);
            }
        }
    }

    public final void f8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.f8(java.lang.Object[]):void");
    }

    public final boolean f9() {
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

    public final void fa(long j3, final MessageObject messageObject, int i10, final long j10, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f19802id + " msg_id = " + i13);
        }
        this.f37301ic = 0;
        this.f37313jc = false;
        this.f37337lc = null;
        this.f37349mc = null;
        ak akVar = this.f37478x0;
        if (akVar != null) {
            akVar.f1();
        }
        if (this.f37288hc != -1) {
            getConnectionsManager().cancelRequest(this.f37288hc, false);
        }
        if (this.gc != -1) {
            getConnectionsManager().cancelRequest(this.gc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f37301ic = i13;
        this.f37313jc = false;
        this.f37326kc = System.currentTimeMillis();
        ak akVar2 = this.f37478x0;
        if (akVar2 != null) {
            akVar2.f1();
        }
        final int i14 = this.ec + 1;
        this.ec = i14;
        this.gc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final eo eoVar = eo.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j11 = j10;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new nh(1, eoVar, new Runnable(i15, i16, j11, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f41330b;
                    public final int f41331c;
                    public final TLObject d;
                    public final int f41332e;
                    public final MessageObject f41333f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f41334n;
                    public final MessageObject f41335r;

                    {
                        this.d = tLObject;
                        this.f41332e = i17;
                        this.f41333f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f41334n = chat2;
                        this.f41335r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final eo eoVar2 = eo.this;
                        if (this.f41330b != eoVar2.ec) {
                            return;
                        }
                        eoVar2.gc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            eoVar2.f37337lc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            eoVar2.getMessagesController().putUsers(eoVar2.f37337lc.users, false);
                            eoVar2.getMessagesController().putChats(eoVar2.f37337lc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = eoVar2.f37337lc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < eoVar2.f37337lc.messages.size(); i19++) {
                                TLRPC.Message message = eoVar2.f37337lc.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f41331c;
                        final int i21 = this.f41332e;
                        final MessageObject messageObject5 = this.f41333f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f41334n;
                        final MessageObject messageObject6 = this.f41335r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = eoVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f19823id;
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
                            final int i22 = eoVar2.f37265fc + 1;
                            eoVar2.f37265fc = i22;
                            eoVar2.f37288hc = eoVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new wh(eo.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        eoVar2.Ca(eoVar2.f37337lc, eoVar2.f37349mc, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.gc, this.classGuid);
    }

    public final void fb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f19808id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.T5, this.f37356n5, this.X3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = H8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        B6();
    }

    public final void fc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.T5, d())) {
            if (z10) {
                getNotificationsController().muteDialog(this.T5, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.e3 E = org.telegram.ui.Components.g5.E(this.T5, d(), this, this.f37251ea);
            E.setCalcMandatoryInsets(C9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.T5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.zc.z(this, 4, 0, this.f37251ea).j();
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.m1 m1Var = this.Q8;
        if (m1Var != null) {
            m1Var.f21146e = false;
            D7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f37241e;
    }

    public final void g7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.g7():void");
    }

    public final void g8(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && i7()) {
            boolean z11 = false;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i12);
                    if (sendingMediaInfo.inlineResult == null && sendingMediaInfo.videoEditedInfo == null) {
                        break;
                    }
                    i12++;
                } else if (!TextUtils.isEmpty(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption)) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.T5, this.f37356n5, this.X3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = H8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.T5, this.f37356n5, this.X3, null, this.f37330l5, z10, i10, 0, H8(), 0L, S8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
                i13 = i11 + 1;
                z11 = false;
            }
            if (!arrayList2.isEmpty()) {
                o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f37356n5, this.X3, null, this.f37330l5, false, true, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f37271g5);
                B6();
                if (i10 != 0) {
                    if (this.S3 == -1) {
                        this.S3 = 0;
                    }
                    this.S3 = arrayList.size() + this.S3;
                    Ic(true);
                }
            }
        }
    }

    public final boolean g9() {
        xm xmVar = this.f37225c9;
        if (xmVar != null && xmVar.x()) {
            return true;
        }
        return false;
    }

    public final void ga(boolean z10) {
        String string;
        if (!D9() && !f9()) {
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
            Bundle e7 = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
            e7.putInt("messagesCount", this.f37222c6);
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            e7.putBoolean("canSelectTopics", true);
            vy vyVar = new vy(e7);
            vyVar.C2 = this;
            presentFragment(vyVar);
            return;
        }
        if (D9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f37241e) && !this.f37241e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f37316k2 == null) {
                wm wmVar = this.X0;
                int indexOfChild = wmVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(7, getParentActivity(), null, true);
                    this.f37316k2 = c50Var;
                    wmVar.addView(c50Var, indexOfChild + 1, w7.w5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 51));
                    this.f37316k2.setAlpha(0.0f);
                    this.f37316k2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f37316k2.setText(string);
            this.f37316k2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f37328l2 == null) {
            wm wmVar2 = this.X0;
            int indexOfChild2 = wmVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.c50 c50Var2 = new org.telegram.ui.Components.c50(getParentActivity(), 9);
            this.f37328l2 = c50Var2;
            wmVar2.addView(c50Var2, indexOfChild2 + 1, w7.w5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 51));
            this.f37328l2.setAlpha(0.0f);
            this.f37328l2.setVisibility(4);
        }
        this.f37328l2.setText(string);
        this.f37328l2.f(this.P0.getForwardButton(), true);
    }

    public final void gb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j3) {
        long j10;
        String str;
        kk kkVar = this.I1;
        if (kkVar == null) {
            return;
        }
        TLRPC.User user = kkVar.getAdapter().f10692w0;
        if (user != null) {
            j10 = user.f19949id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f19800id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.I1.getAdapter().f10692w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.T5, this.f37356n5, this.X3, null, this.f37330l5, z10, i10, 0, H8(), j3, S8());
        this.Y.setFieldText("");
        j9(false);
        getMediaDataController().increaseInlineRating(j10);
    }

    public final void gc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.sc scVar = this.A3;
        if (scVar != null) {
            scVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f37233d5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.Q4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.T5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.Q4 - 1), Boolean.valueOf(this.S4));
        this.A3 = org.telegram.ui.Components.zc.B(this, false, new ai.d9(this, arrayList2, arrayList, i10, 13), new ze(this, messageObject, 7), this.f37251ea).j();
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return org.telegram.ui.ActionBar.x4.f21456a;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f21472c;
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
            ArrayList arrayList = this.f37444u6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + F8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f37251ea;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        int i11;
        int i12;
        if (this.e7) {
            return null;
        }
        if (this.f37198aa) {
            this.f37198aa = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Qd));
        if (!F9()) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894v8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.h6.f20947y8;
            arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20965z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20839s8));
        uj ujVar = this.f37190a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ujVar != null ? ujVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        uj ujVar2 = this.f37190a1;
        org.telegram.ui.ActionBar.h5 titleTextView = ujVar2 != null ? ujVar2.getTitleTextView() : null;
        int i14 = org.telegram.ui.ActionBar.h6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(titleTextView, 8, null, null, null, null, i14));
        uj ujVar3 = this.f37190a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ujVar3 != null ? ujVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f20538c2, org.telegram.ui.ActionBar.h6.f20555d2}, org.telegram.ui.ActionBar.h6.f20783pa));
        uj ujVar4 = this.f37190a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ujVar4 != null ? ujVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 67108864, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, i15));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.h6.f20947y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 512, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.h6.f20912w8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.h6.f20931x8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.h6.f20965z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37203b1, 4, null, null, null, null, i16));
        uj ujVar5 = this.f37190a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ujVar5 != null ? ujVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20685k4}, null, org.telegram.ui.ActionBar.h6.f20767oc));
        uj ujVar6 = this.f37190a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ujVar6 != null ? ujVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.l4}, null, org.telegram.ui.ActionBar.h6.f20785pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f20812r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20652i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20670j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20689k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20707l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20726m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20746n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20764o8));
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.d5 d5Var3 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.d5 d5Var4 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.d5 d5Var5 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.d5 d5Var6 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{d5Var, d5Var2}, null, org.telegram.ui.ActionBar.h6.f20822ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.h6.f20565dc));
        if (d5Var != null) {
            Drawable[] k10 = d5Var.k();
            int i17 = org.telegram.ui.ActionBar.h6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, d5Var2.k(), null, i17));
            Drawable[] k11 = d5Var3.k();
            int i18 = org.telegram.ui.ActionBar.h6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, d5Var4.k(), null, i18));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Aa));
        if (this.f37251ea.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Fa));
        }
        ak akVar = this.f37478x0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = d5Var5;
        drawableArr[i10] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(akVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.h6.Ba));
        ak akVar2 = this.f37478x0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = d5Var5;
        drawableArr2[i10] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(akVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.h6.f20528bc));
        ak akVar3 = this.f37478x0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i19 = org.telegram.ui.ActionBar.h6.f20656ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(akVar3, 4, clsArr3, themedPaint, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.h6.f20674jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20908w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.h6.f20693kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20711lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20730mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20601fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 2, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f20636hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.h6.f20628h3};
        int i20 = org.telegram.ui.ActionBar.h6.f20694kd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr3, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20804qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20824rc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f20843sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20861tc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20500a4, org.telegram.ui.ActionBar.h6.f20520b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.f20969zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20540c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20557d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20613g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i21 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr4, null, i21));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.h6.f20629h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i22 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr5, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f20819r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f20802qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.f20518b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20666j4}, null, org.telegram.ui.ActionBar.h6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, eVar, org.telegram.ui.ActionBar.h6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.J2, null, null, org.telegram.ui.ActionBar.h6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.K2, null, null, org.telegram.ui.ActionBar.h6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.T1, null, null, org.telegram.ui.ActionBar.h6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.h6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.h6.f20916wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Rc));
        int i23 = org.telegram.ui.ActionBar.h6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i23));
        int i24 = org.telegram.ui.ActionBar.h6.f20507ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20564db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20583eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20509ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20600fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20529bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20619gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20566dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20635hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20584ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20655ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20602fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20620gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20673jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20692kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20637hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20657id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20803qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20675jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20823rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20749nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20842sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20768od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20712ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20731md));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20766ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20784pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20805qd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20710lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20729mb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20860tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20844sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20879ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20862td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20896vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20881ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20915wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20917wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20950yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20935xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20898vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20968zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20934xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20951yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20970zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.U1, null, null, org.telegram.ui.ActionBar.h6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.V1, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.W1, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20658ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20880uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20676je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20897vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f20825re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f20845se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20787pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.h6.f20806qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20582ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20599fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ga));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.h6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.h6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.h6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.h6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.h6.Ra));
        if (this.f37251ea.h(false)) {
            i11 = 2;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.h6.f20812r0, null, org.telegram.ui.ActionBar.h6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f20904w0, null, null, org.telegram.ui.ActionBar.h6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.B0[0], org.telegram.ui.ActionBar.h6.B0[1], org.telegram.ui.ActionBar.h6.D0}, null, null, org.telegram.ui.ActionBar.h6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.C0[0], org.telegram.ui.ActionBar.h6.C0[1], org.telegram.ui.ActionBar.h6.E0}, null, null, org.telegram.ui.ActionBar.h6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20498a1}, null, org.telegram.ui.ActionBar.h6.f20505a9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20610g1, org.telegram.ui.ActionBar.h6.f20626h1}, null, org.telegram.ui.ActionBar.h6.f20671j9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.F0[1], null, null, org.telegram.ui.ActionBar.h6.f20653i9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.G0, null, null, org.telegram.ui.ActionBar.h6.f20727m9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20690k9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.o9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.h6.H0, null, null, org.telegram.ui.ActionBar.h6.f20782p9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.I0, null, null, org.telegram.ui.ActionBar.h6.f20801q9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.T0}, null, org.telegram.ui.ActionBar.h6.f20877u9));
            i11 = 2;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.V0, org.telegram.ui.ActionBar.h6.W0}, null, org.telegram.ui.ActionBar.h6.v9));
        }
        kk kkVar = this.I1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i25 = org.telegram.ui.ActionBar.h6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kkVar, 0, null, themedPaint2, null, null, i25));
        kk kkVar2 = this.I1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.h6.f20647i3};
        int i26 = org.telegram.ui.ActionBar.h6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kkVar2, 0, null, null, drawableArr10, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.j3}, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20647i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20647i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20647i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        int i27 = org.telegram.ui.ActionBar.h6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i27));
        int i28 = org.telegram.ui.ActionBar.h6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i28));
        int i29 = org.telegram.ui.ActionBar.h6.f20650i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        int i30 = org.telegram.ui.ActionBar.h6.jf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i27));
        int i31 = org.telegram.ui.ActionBar.h6.f20531bf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20510ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.h6.f20530be));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.h6.f20696kf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20751nf));
        sk skVar = this.Y;
        int i32 = org.telegram.ui.ActionBar.h6.f20733mf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f20769of));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20549cf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20511af));
        int i33 = i11;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20604ff));
        sk skVar2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar2 != null ? skVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.He));
        sk skVar3 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar3 != null ? skVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ke));
        sk skVar4 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar4 != null ? skVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Le));
        sk skVar5 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar5 != null ? skVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Me));
        sk skVar6 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar6 != null ? skVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oe));
        sk skVar7 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar7 != null ? skVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Pe));
        sk skVar8 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar8 != null ? skVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Re));
        sk skVar9 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar9 != null ? skVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Se));
        sk skVar10 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar10 != null ? skVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.We));
        sk skVar11 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar11 != null ? skVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ne));
        sk skVar12 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar12 != null ? skVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Je));
        sk skVar13 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar13 != null ? skVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ue));
        sk skVar14 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(skVar14 != null ? skVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.d00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qe));
        sk skVar15 = this.Y;
        if (skVar15 != null) {
            org.telegram.ui.Components.c61 trendingStickersAlert = skVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, new Drawable[]{this.Y.getStickersArrowDrawable()}, null, i28));
        }
        int i34 = 0;
        while (i34 < i33) {
            View view = i34 == 0 ? this.y3 : this.f37505z3;
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
            int i35 = org.telegram.ui.ActionBar.h6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i35));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.h6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i35));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i36));
            i34++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f20893v7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f20911w7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f20875u7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f20857t7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f20930x7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f20946y7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37504z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20585ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37504z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20559d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20603fe));
        for (int i37 = 0; i37 < i33; i37++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20603fe));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.D2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20603fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.ge));
        ImageView imageView = this.J2;
        int i38 = org.telegram.ui.ActionBar.h6.f20567de;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L2, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U1, 8, null, null, null, null, i38));
        TextView textView = this.L1;
        int i39 = org.telegram.ui.ActionBar.h6.f20638he;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f20799q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H1, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20899ve));
        ImageView imageView2 = this.S2;
        int i40 = org.telegram.ui.ActionBar.h6.f20936xe;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i40));
        ImageView imageView3 = this.S2;
        int i41 = org.telegram.ui.ActionBar.h6.f20965z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView3, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 8, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20971ze));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20864tf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sh));
        org.telegram.ui.Components.xo xoVar = this.Y0;
        int i42 = org.telegram.ui.ActionBar.h6.f20656ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(xoVar, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37204b2, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37374p0, 2048, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37478x0, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        ci.r6 r6Var = this.Q;
        int i43 = org.telegram.ui.ActionBar.h6.f20711lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r6Var, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37204b2, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y0, 536870912, null, null, null, null, i43));
        if (this.I1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ce));
            int i44 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"nameTextView"}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A6));
            Drawable[] drawableArr11 = new Drawable[3];
            drawableArr11[0] = org.telegram.ui.ActionBar.h6.f20722m4;
            drawableArr11[1] = org.telegram.ui.ActionBar.h6.f20742n4;
            drawableArr11[i33] = org.telegram.ui.ActionBar.h6.f20760o4;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, drawableArr11, null, org.telegram.ui.ActionBar.h6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20963z6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20657id));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20675jd));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        }
        org.telegram.ui.Components.c50 c50Var = this.f37244e2;
        int i45 = org.telegram.ui.ActionBar.h6.f20807qf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(c50Var, 32, null, null, null, null, i45));
        org.telegram.ui.Components.c50 c50Var2 = this.f37244e2;
        int i46 = org.telegram.ui.ActionBar.h6.f20788pf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(c50Var2, 4, null, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37428t2, 4, new Class[]{org.telegram.ui.Components.c50.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37428t2, 8, new Class[]{org.telegram.ui.Components.c50.class}, new String[]{"imageView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37428t2, 4, new Class[]{org.telegram.ui.Components.c50.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37440u2, 4, new Class[]{org.telegram.ui.Components.c50.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37440u2, 4, new Class[]{org.telegram.ui.Components.c50.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i43));
        int i47 = org.telegram.ui.ActionBar.h6.f20654ia;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20672ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20691ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20709la));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20728ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20748na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20765oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.R4}, null, org.telegram.ui.ActionBar.h6.f20563da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20630h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20649i5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20798q5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20687k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20883uf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20900vf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20513ah));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20533bh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20551ch));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20570dh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20587eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20606fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20660ih));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20678jh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20698kh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20623gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20641hh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20503a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Dj));
        int i48 = org.telegram.ui.ActionBar.h6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.xf));
        sk skVar16 = this.Y;
        if (skVar16 == null || skVar16.m0 == null) {
            i12 = 0;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f9492c, 4, new Class[]{ei.a0.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            i12 = 0;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f9492c, 4, new Class[]{ei.a0.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.h6.f20945y6));
        }
        wh.d dVar = this.f37263fa;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i49 = i12;
        while (i49 < size) {
            Object obj = arrayList.get(i49);
            i49++;
            ((org.telegram.ui.ActionBar.j6) obj).f21029o = this.f37251ea;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f37251ea.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint G = this.f37251ea.G(str);
        if (G != null) {
            return G;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    public final boolean h7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            Wb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void h8(View view) {
        i8(view, false);
    }

    public final void h9() {
        org.telegram.ui.Components.uu editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.u()) {
                this.Bc.i(5, false, true);
                this.actionBar.t();
            } else {
                return;
            }
        }
        this.f37194a6 = 0;
        this.f37234d6 = 0;
        this.f37208b6 = 0;
        this.f37260f6 = 0;
        this.f37272g6 = 0;
        this.f37248e6 = 0;
        sk skVar = this.Y;
        if (skVar != null && (editField = skVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        xm xmVar = this.f37225c9;
        if (xmVar != null) {
            xmVar.f(true);
            SparseArray sparseArray = this.f37225c9.f22424p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        vl vlVar = this.f37286h9;
        if (vlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vlVar.H);
            vlVar.a();
        }
        sk skVar2 = this.Y;
        if (skVar2 != null) {
            skVar2.f23617a0 = false;
        }
        this.f37298i9 = false;
        if (this.f37213bb != null) {
            p9();
        }
    }

    public final void ha(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f37259f5;
        if (messagePreviewParams != null && this.Fa == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.G5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f37356n5;
                if (messageObject2 == this.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f37330l5, this.p5);
            }
            if (!this.f37259f5.isEmpty()) {
                this.f37252eb = this.Y.f23772z2;
                Context context = this.X0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f37259f5;
                TLRPC.User user = this.f37253f;
                TLRPC.Chat chat = this.f37241e;
                int i12 = this.currentAccount;
                bo boVar = this.f37251ea;
                tn tnVar = this.f37330l5;
                if (tnVar != null && tnVar.f42246f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nl nlVar = new nl(this, context, this, this.A8, messagePreviewParams2, user, chat, i12, boVar, i10, z10);
                this.Fa = nlVar;
                this.f37259f5.attach(nlVar);
                TLRPC.ChatFull chatFull = this.Z7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.ha) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.ha.peers.get(0).peer;
                }
                this.Fa.setSendAsPeer(peer);
                g7();
                this.X0.addView(this.Fa);
                if (this.f37252eb) {
                    sk skVar = this.Y;
                    skVar.T0 = true;
                    org.telegram.ui.Components.ig igVar = skVar.U0;
                    if (igVar != null) {
                        igVar.v(true);
                    }
                    this.Y.u1();
                    this.D3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void hb(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        long j10;
        if (i7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.effect_id = j3;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f37271g5;
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
                of3.sendMessageChatArguments = H8();
                of3.effect_id = j10;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = S8();
                of3.suggestionParams = this.f37271g5;
                getSendMessagesHelper().sendMessage(of3);
                j10 = 0;
            }
            B6();
        }
    }

    public final void hc() {
        boolean F9 = F9();
        SparseArray[] sparseArrayArr = this.W5;
        if (!F9) {
            if (this.actionBar.u() && this.f37203b1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f37203b1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.X3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f37241e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f37253f;
    }

    public final boolean i7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void i8(View view, boolean z10) {
        boolean z11;
        sb(view);
        if (view != this.f37303j1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j8(z10, z11, 0.2f);
    }

    public final void i9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.zc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Ja(this.f37233d5);
            La(this.f37233d5);
            return;
        }
        showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) this, 3, true));
    }

    public final void ia(String str, boolean z10) {
        boolean z11;
        pk pkVar;
        boolean z12;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                P7();
                ci.d4 d4Var = this.f37452v1;
                if (d4Var != null && d4Var.V) {
                    d4Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ci.d4 d4Var2 = this.f37465w1;
                if (d4Var2 != null && d4Var2.V) {
                    d4Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new ye(this, str, 5), 200L);
                    return;
                }
                this.f37441u3 = str;
                this.f37429t3 = str;
                boolean contains = str.contains("@");
                U6(true);
                if (!this.actionBar.f21060n0) {
                    this.f37514zc.a(true, true);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f37277h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f37242e0;
                    if (xVar != null) {
                        xVar.f(8);
                    }
                    is isVar = this.f37228d0;
                    if (isVar != null) {
                        isVar.b(false);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f37289i0;
                    if (xVar2 != null) {
                        xVar2.f(8);
                    }
                    if ((this.f37232d4 == 0 || (i10 = this.R3) == 3 || i10 == 8) && (u0Var = this.f37302j0) != null) {
                        u0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
                    if (u0Var3 != null && this.K9) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar3 = this.f37351n0;
                    if (xVar3 != null && this.L9) {
                        xVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.f37314k0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    this.f37362o0 = true;
                    Jc(0, 0, -1);
                    lc(false);
                }
                dl dlVar = this.f37363o1;
                if (dlVar != null) {
                    if (dlVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        dlVar.g(false);
                    }
                }
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.f37241e) || !ChatObject.isPublic(this.f37241e) || this.f37441u3 == null)) {
                    this.f37400r1 = 0;
                } else {
                    this.f37400r1 = 2;
                }
                this.W4 = false;
                if (this.O3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ci.h1 h1Var = this.f37387q1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f37302j0;
                if (u0Var5 != null) {
                    this.f37240dc = true;
                    u0Var5.z(false);
                    this.f37240dc = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = this.f37302j0;
                if (u0Var6 != null) {
                    u0Var6.setSearchFieldCaption(null);
                    this.f37302j0.H(str, false);
                    this.f37302j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f37429t3, this.T5, this.L6, this.classGuid, 0, this.f37232d4, false, this.f37365o3, this.f37377p3, false, this.f37389q3);
                Cc(0, true);
                this.f37230d2.e(true, true);
                Pb(true);
                pk pkVar2 = this.f37375p1;
                if (pkVar2 != null) {
                    pkVar2.b(!contains);
                    Lc();
                }
                if ((contains || z10) && this.f37441u3 != null && (pkVar = this.f37375p1) != null) {
                    int currentPosition = pkVar.f28256a.getCurrentPosition();
                    int i11 = this.f37400r1;
                    if (currentPosition != i11) {
                        this.f37375p1.f28256a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f37441u3);
                this.f37427t1.f32649f.N(true);
                View currentView = this.f37387q1.getCurrentView();
                if (currentView instanceof go) {
                    ((go) currentView).f38105a.Nc(this.f37441u3);
                }
            }
        }
    }

    public final void ib(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f37356n5, this.X3, null, this.f37330l5, z11, true, null, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f37271g5);
            B6();
            sk skVar = this.Y;
            if (skVar != null) {
                skVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ic(true);
        }
    }

    public final void ic() {
        wm wmVar = this.X0;
        if (wmVar != null && this.f37226ca == null) {
            if (this.f37251ea.f36219n == null || wmVar.getBackgroundImage() == null) {
                if (this.X0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.X0.V(org.telegram.ui.ActionBar.h6.s0());
                }
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (F9()) {
            org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.d0(org.telegram.ui.ActionBar.h6.f20912w8);
            } else {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20912w8, true);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.h6.I.q();
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
        if ((this.R3 != 5 || (!this.f37444u6.isEmpty() && this.f37232d4 != 0)) && !this.yc.f16088f && this.f37360n9) {
            nl nlVar = this.Fa;
            if (nlVar == null || !nlVar.f33331s) {
                uh.i iVar = this.X9;
                if (iVar == null || !iVar.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void j7(Runnable runnable, zf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            r1 r1Var = new r1(this, aVar, runnable, 20);
            yh.n5 x10 = yh.n5.x(this.currentAccount, aVar.f54665a);
            if (!x10.f53137e) {
                x10.q(true, true, r1Var);
                return;
            } else {
                r1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void j8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        jh.h hVar;
        org.telegram.ui.Cells.u1 u1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.J8;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
            u1Var2.setInvalidatesParent(z12);
            if (z12) {
                Ra(u1Var2);
            }
        }
        this.X0.invalidate();
        this.f37478x0.invalidate();
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
            ValueAnimator valueAnimator = this.f37214bc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.I8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.mn0.d(new ff(this, 3));
            }
        } else {
            float f11 = this.H8;
            this.L8 = f11 / max;
            this.I8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new pg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f37303j1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.P8.playTogether(arrayList);
        this.P8.setInterpolator(org.telegram.ui.Components.js.h);
        this.P8.setDuration(320L);
        View view2 = this.J8;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            u1Var = (org.telegram.ui.Cells.u1) view2;
        } else {
            u1Var = null;
        }
        this.P8.addListener(new androidx.fragment.app.g(this, z12, u1Var, 3));
        if (this.J8 != null && this.K8 <= 0.0f) {
            sb(null);
        }
        this.P8.start();
    }

    public final void j9(boolean z10) {
        Db(false, null, null, false, z10);
    }

    public final boolean ja(String str, org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, int i10, int i11) {
        ei.w4 w4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f37241e == null || str == null || this.R3 != 0) {
            return false;
        }
        if (u1Var != null && (characterStyle != null || i11 != 1)) {
            w4Var = new ei.w4(this, i10, i11, characterStyle, u1Var);
        } else {
            w4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f37241e) != null) {
                try {
                    if (Kc == null) {
                        Kc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Lc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Kc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f37241e, matcher.group(2))) {
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
                                    if (ChatObject.isForum(this.f37241e) && i12 != d()) {
                                        return false;
                                    }
                                    this.f37433t7 = true;
                                    if (this.R3 == 2) {
                                        this.V8.O0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f37497y7 = W;
                                    if (W >= 0) {
                                        this.f37509z7 = parseInt;
                                    }
                                    bb(parseInt, i10, true, 0, false, 0, num, g10, w4Var);
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
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f37241e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f37274g8 = queryParameter2;
                                    R6(true);
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
                    if (ChatObject.hasPublicLink(this.f37241e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.R3 == 2) {
                            this.V8.O0(intValue3);
                            finishFragment();
                            return true;
                        }
                        bb(intValue3, i10, true, 0, false, 0, null, null, w4Var);
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
                    if (parseLong != this.f37241e.f19802id || parseInt3 == 0) {
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
                        if (ChatObject.isForum(this.f37241e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f37220c4;
                            if (tL_forumTopic != null && tL_forumTopic.f19854id == findTopic.f19854id) {
                                return true;
                            }
                            return false;
                        }
                        this.f37433t7 = true;
                        if (this.R3 == 2) {
                            this.V8.O0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        bb(parseInt3, i10, true, 0, false, 0, num2, g11, w4Var);
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
            long j3 = this.f37241e.f19802id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                fa(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f37433t7 = true;
            if (this.R3 == 2) {
                this.V8.O0(intValue9);
                finishFragment();
                return true;
            }
            bb(intValue9, i10, true, 0, false, 0, null, null, w4Var);
            return true;
        }
    }

    public final ze jb(MessageObject messageObject, boolean z10) {
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
        return new ze(this, messageObject, 1);
    }

    public final void jc() {
        TLRPC.User user;
        boolean z10;
        if (this.f37277h0 != null && (user = this.f37253f) != null && this.h == null && user.bot) {
            a0.i iVar = this.f37236d8;
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
                this.f37277h0.K(30);
            } else {
                this.f37277h0.r(30);
            }
            if (z10) {
                this.f37277h0.K(31);
            } else {
                this.f37277h0.r(31);
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2 = null;
        o8(str, null);
        if (i7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.invert_media = z11;
                of2.payStars = j10;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f37271g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.T5, false, false, true, 0, 0, null, -1, j10, S8(), this.f37271g5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.T5, this.f37356n5, this.X3, null, this.f37330l5, this.p5, z10, i10, 0, null, H8(), j3, z11, j10, S8(), this.f37271g5);
            B6();
        }
    }

    public final void k7() {
        if (this.f37505z3 != null) {
            return;
        }
        ol olVar = new ol(this, getParentActivity(), this, this.f37251ea);
        this.f37505z3 = olVar;
        this.X0.addView(olVar, 17, w7.w5.a(-2.0f, 8.0f, 8.0f, 8.0f, 0.0f, -1, 51));
    }

    public final void k8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void k9(boolean z10) {
        if (this.X2.getTag() != null && !this.f37231d3) {
            if (!this.j3 || this.f37257f3) {
                this.X2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f37269g3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f37269g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 0.0f));
                    this.f37269g3.addListener(new bj(this, 6));
                    this.f37269g3.setStartDelay(this.f37191a3);
                    this.f37269g3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f37269g3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f37269g3 = null;
                    }
                    this.X2.setAlpha(0.0f);
                }
                this.f37191a3 = 500;
            }
        }
    }

    public final void ka(MessageObject messageObject) {
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
            presentFragment(new eo(bundle));
        }
    }

    public final void kb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.kb(int, android.net.Uri, boolean):void");
    }

    public final void kc() {
        if (this.R1 == null) {
            return;
        }
        this.R1.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        o8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.T5, this.f37356n5, this.X3, null, this.f37330l5, true, false, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, H8(), 0L, false, j3, S8(), this.f37271g5);
        B6();
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ic(true);
        }
    }

    public final void l7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.Hb > 1000) {
            z10 = true;
        }
        wg wgVar = this.Ib;
        AndroidUtilities.cancelRunOnUIThread(wgVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        AndroidUtilities.runOnUIThread(wgVar, j3);
    }

    public final void l8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.p5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void l9(boolean z10) {
        if (this.Y2.getTag() != null && !this.f37245e3) {
            if (!this.f37317k3 || this.f37257f3) {
                this.Y2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37292i3, 0.0f);
                    this.f37280h3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f37280h3.addUpdateListener(new se(this, 1));
                    this.f37280h3.addListener(new bj(this, 8));
                    this.f37280h3.setStartDelay(this.f37191a3);
                    this.f37280h3.start();
                } else {
                    ValueAnimator valueAnimator = this.f37280h3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f37280h3 = null;
                    }
                    this.f37292i3 = 0.0f;
                    pc();
                }
                this.f37191a3 = 500;
            }
        }
    }

    public final void la(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f37253f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f37253f.f19949id) {
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
            presentFragment(new eo(bundle));
        }
    }

    public final void lb(MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages c92 = c9(messageObject);
        boolean z12 = false;
        if (c92 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < c92.messages.size()) {
                    if (this.W5[i10].indexOfKey(c92.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    c92 = null;
                    break;
                }
            }
        }
        if (c92 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1Var.setDrawSelectionBackground(z11);
        if (c92 == null) {
            z12 = true;
        }
        u1Var.L3(true, z12, z10);
    }

    public final void lc(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.lc(boolean):void");
    }

    @Override
    public final boolean m() {
        return this.f37408r9;
    }

    public final void m7() {
        int b92 = (int) (b9(org.telegram.ui.Components.d41.f25240c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(b92);
        int b10 = w7.n.b(AndroidUtilities.dp(36.0f) + (this.X0.getMeasuredHeight() - b92), 0, this.X0.getMeasuredHeight());
        int measuredWidth = this.X0.getMeasuredWidth();
        Rect rect = Pc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Aa, this.f37478x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f37478x0.getMeasuredHeight() - this.Ba) - b92));
    }

    public final void m8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f37271g5;
        if (messageSuggestionParams != null) {
            Hb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.G5;
        if (webPage != null) {
            Ib(true, webPage, false);
            return;
        }
        tn tnVar = this.f37330l5;
        if (tnVar != null) {
            Gb(this.f37356n5, tnVar);
            return;
        }
        MessageObject messageObject = this.f37356n5;
        if (messageObject != null && messageObject != this.X3) {
            Fb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f37259f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Eb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null) {
            Cb(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Ib(false, null, true);
        }
    }

    public final void m9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.c50 c50Var = this.f37339m2;
            if (c50Var != null) {
                c50Var.b(true);
            }
            nj njVar = this.f37268g2;
            if (njVar != null) {
                njVar.b(true);
            }
            org.telegram.ui.Components.c50 c50Var2 = this.f37291i2;
            if (c50Var2 != null) {
                c50Var2.b(true);
            }
        }
        org.telegram.ui.Components.c50 c50Var3 = this.f37328l2;
        if (c50Var3 != null) {
            c50Var3.b(true);
        }
        org.telegram.ui.Components.c50 c50Var4 = this.f37316k2;
        if (c50Var4 != null) {
            c50Var4.b(true);
        }
        org.telegram.ui.Components.c50 c50Var5 = this.f37428t2;
        if (c50Var5 != null) {
            c50Var5.b(true);
        }
        org.telegram.ui.Components.c50 c50Var6 = this.f37440u2;
        if (c50Var6 != null) {
            c50Var6.b(true);
        }
        org.telegram.ui.Components.c50 c50Var7 = this.f37353n2;
        if (c50Var7 != null) {
            c50Var7.b(true);
        }
        org.telegram.ui.Components.c50 c50Var8 = this.f37364o2;
        if (c50Var8 != null) {
            c50Var8.b(true);
        }
        org.telegram.ui.Components.iq iqVar = this.f37453v2;
        if (iqVar != null) {
            iqVar.a();
        }
        ci.d4 d4Var = this.J0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.L0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        ci.d4 d4Var3 = this.K0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
    }

    public final void ma(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        long j3;
        long j10;
        org.telegram.ui.Components.f6 animation;
        Bitmap m10;
        if (u1Var == null) {
            int childCount = this.f37478x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f37478x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var2.getMessageObject().equals(messageObject)) {
                        u1Var = u1Var2;
                        break;
                    }
                }
                i10++;
            }
        }
        if (messageObject.isVideo()) {
            jb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f37251ea);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (u1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = u1Var.getPhotoImage().getAnimation()) != null && this.f37472w8 != null && this.f37434t8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f37472w8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.R3;
        xl xlVar = this.Ga;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f37444u6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().b2(arrayList, arrayList.indexOf(messageObject), this.T5, 0L, d(), xlVar);
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
            t12.d2(messageObject, this, j3, j10, j11, xlVar);
        }
        m9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void mb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f37251ea != null && this.f37226ca == null) {
            fg.b c10 = fg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.T5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.b4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.b4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.b4 b4Var = theme;
                bo boVar = this.f37251ea;
                TLRPC.WallPaper wallPaper = boVar.h;
                if (this.P5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boVar.i(b4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new ve(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.T5);
            bo boVar2 = this.f37251ea;
            org.telegram.ui.ActionBar.b4 b4Var2 = boVar2.f36218f;
            if (this.P5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boVar2.i(b4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void mc() {
        lc(false);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        if (i10 == 0) {
            X9();
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
            X9();
            v7();
            qh.c cVar = this.Cc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.f37476wc.f16087e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                me.b bVar = this.xc;
                float f11 = 1.0f - bVar.f16087e;
                this.M0.setAlpha(f11);
                org.telegram.ui.Components.hh hhVar = this.M0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                hhVar.setVisibility(i12);
                float f12 = 1.0f - bVar.f16087e;
                org.telegram.ui.Components.h41 h41Var = this.R1;
                if (h41Var != null) {
                    h41Var.setAlpha(f12);
                    org.telegram.ui.Components.h41 h41Var2 = this.R1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    h41Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                ai.f0 f0Var = this.K3;
                me.b bVar2 = this.yc;
                if (f0Var != null) {
                    float f13 = bVar2.f16087e;
                    f0Var.setAlpha(f13);
                    ai.f0 f0Var2 = this.K3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    f0Var2.setVisibility(i15);
                }
                if (bVar2.f16087e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jh.f fVar = this.X;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar.setVisibility(i11);
                o7();
                if (bVar2.f16087e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ak akVar = this.f37478x0;
                if (z11) {
                    i13 = 0;
                }
                akVar.setVisibility(i13);
                v7();
                y7();
                x7();
                v9(1);
            } else if (i10 == 5) {
                n7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                s7();
            }
        }
    }

    public final void n7() {
        int i10;
        if (this.f37190a1 != null) {
            float actionModeFactor = (1.0f - this.f37514zc.f16087e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f37190a1.setScaleX(lerp);
            this.f37190a1.setScaleY(lerp);
            this.f37190a1.setAlpha(actionModeFactor);
            uj ujVar = this.f37190a1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ujVar.setVisibility(i10);
        }
    }

    public final void n9() {
        ValueAnimator valueAnimator = this.f37276gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.Z2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.Z2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.Z2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new qf(this, w0Var2, 1));
            ofFloat.addListener(new ai.z(13, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f37276gb = ofFloat;
            ofFloat.start();
        }
    }

    public final void na(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i10;
        if (getParentActivity() != null && (b5Var = this.parentLayout) != null && b5Var.getLastFragment() == this && !this.H4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f37241e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f19802id);
            } else {
                bundle.putLong("user_id", this.f37253f.f19949id);
            }
            bundle.putInt("chatMode", 2);
            eo eoVar = new eo(bundle);
            eoVar.H4 = new ArrayList(this.H4);
            eoVar.J4 = new HashMap(this.J4);
            int size = this.H4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.H4.get(i11);
                MessageObject messageObject = (MessageObject) this.J4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f37368o6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    eoVar.J4.put(num, messageObject);
                    eoVar.Dc();
                }
            }
            eoVar.P4 = this.P4;
            if (this.f37281h4) {
                i10 = this.H4.size();
            } else {
                i10 = this.Q4;
            }
            eoVar.Q4 = i10;
            eoVar.S4 = this.S4;
            eoVar.f37196a8 = this.f37196a8;
            eoVar.Z7 = this.Z7;
            eoVar.V8 = new sl(this, eoVar);
            if (z10) {
                presentFragmentAsPreview(eoVar);
                g7();
                return;
            }
            presentFragment(eoVar, false);
        }
    }

    public final void nb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                nb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f37478x0 && view != this.X0) {
            view.setEnabled(z10);
        }
    }

    public final void nc() {
        int i10;
        org.telegram.ui.Components.wb wbVar;
        el elVar;
        sk skVar;
        if (this.D9 && this.f37478x0 != null) {
            float f7 = 0.0f;
            if (this.f37383pa <= 0 || this.Ea != 0.0f) {
                float a92 = a9(AndroidUtilities.dp(7.0f));
                dl dlVar = this.f37363o1;
                if (dlVar != null) {
                    i10 = AndroidUtilities.dp(dlVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float E8 = (E8() * AndroidUtilities.dp(43.0f)) + a92 + i10;
                float f10 = this.f37422s9;
                this.f37435t9 = E8;
                this.f37422s9 = b9(org.telegram.ui.Components.d41.f25238a) + AndroidUtilities.dp(4.0f) + this.v9 + E8;
                if (this.actionBar.getVisibility() == 0 || this.f37238da != null) {
                    this.f37422s9 += this.actionBar.getMeasuredHeight();
                }
                this.f37447u9 = 0;
                this.f37422s9 = this.f37422s9 + this.Aa + this.f37473w9;
                if (this.Ea != 0.0f && (skVar = this.Y) != null && skVar.getVisibility() == 0) {
                    float f11 = this.f37422s9;
                    float measuredHeight = this.Ea * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f37422s9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.Z2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f37478x0.getTranslationY() + this.f37422s9) + this.A9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f37422s9;
                    float f13 = this.A9;
                    this.f37422s9 = f12 + f13;
                    this.f37447u9 = (int) (this.f37447u9 + f13);
                }
                jk jkVar = this.X2;
                if (jkVar != null) {
                    jkVar.setTranslationY((((this.f37478x0.getTranslationY() - f7) + this.f37422s9) + this.f37499y9) - AndroidUtilities.dp(4.0f));
                }
                pc();
                ak akVar = this.f37478x0;
                if (akVar != null && this.f37502z0 != null && this.A0 != null) {
                    int paddingTop = akVar.getPaddingTop();
                    int paddingBottom = this.f37478x0.getPaddingBottom();
                    q7();
                    if (this.f37478x0.getPaddingTop() != paddingTop || this.f37478x0.getPaddingBottom() != paddingBottom) {
                        w9();
                        v9(2);
                    }
                    this.f37478x0.setTopGlowOffset((int) ((this.f37422s9 - this.f37447u9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f37422s9) {
                        int childCount = this.f37478x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f37478x0.getChildAt(i11);
                            this.f37478x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.f37422s9;
                                if (childAt.getTop() > f14) {
                                    this.f37478x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!K9() && !this.D4 && this.J7 != null && this.f37478x0 != null && ((elVar = this.P1) == null || elVar.getVisibility() != 0)) {
                        this.f37478x0.scrollBy(0, (int) (f10 - this.f37422s9));
                    }
                }
                this.D9 = false;
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30532w;
                if (scVar != null && (wbVar = scVar.f30536e) != null) {
                    wbVar.updatePosition();
                }
                q7();
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.R3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((m2Var instanceof eo) && ((eo) m2Var).C9()) {
                return false;
            }
        }
        return this.H6;
    }

    @Override
    public final org.telegram.ui.Components.wo o() {
        return this.f37190a1;
    }

    public final void o7() {
        boolean z10;
        ci.h1 h1Var;
        if (this.f37238da != null) {
            return;
        }
        int i10 = 0;
        if (this.yc.f16087e >= 1.0f && ((h1Var = this.f37387q1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ci.bb bbVar = this.X0.L;
        if (!z10) {
            i10 = 4;
        }
        bbVar.setVisibility(i10);
    }

    public final void o8(CharSequence charSequence, ArrayList arrayList) {
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
                sk skVar = this.Y;
                if (skVar != null) {
                    this.p5.editingMessage = skVar.getFieldText();
                    MessageObject messageObject3 = this.p5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.p5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final boolean o9(boolean z10) {
        pl plVar;
        pl plVar2 = this.f37480x2;
        if (plVar2 == null || plVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.hh hhVar = this.M0;
        if (hhVar != null && (plVar = this.f37480x2) != null) {
            hhVar.i(plVar, false, z10);
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
                this.f37480x2.setTag(1);
                return true;
            }
        }
    }

    public final void oa(int i10, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f19810id);
            } else {
                TLRPC.Chat chat = this.f37241e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f19802id);
                } else {
                    bundle.putLong("user_id", this.f37253f.f19949id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            eo eoVar = new eo(bundle);
            if (this.f37281h4) {
                ng.d.a(eoVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            eoVar.V8 = new wj(this);
            presentFragment(eoVar, false);
        }
    }

    public final void ob(boolean z10) {
        pb(z10, false, true);
    }

    public final void oc(boolean z10) {
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
            iVar = this.f37484x6;
            arrayList = this.f37444u6;
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
                    groupedMessages2.reversed = this.Qa;
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
                Collections.sort(groupedMessages3.messages, new lf(0));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f37389q3 != null && TextUtils.isEmpty(this.f37429t3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f37389q3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
        Collections.sort(this.A0.P, new lf(1));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.A0.P.size()) {
            MessageObject messageObject8 = (MessageObject) this.A0.P.get(i19);
            if (this.Qa && messageObject8 != null && i19 == 0) {
                Ha(messageObject8, i19);
                i19++;
            }
            if (!this.Qa && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ha(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.Ya.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.v0.j(messageObject8.dateKeyInt, this.Ya);
            }
            arrayList4.add(messageObject8);
            if (this.Qa && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ha(messageObject8, i19);
                i19++;
            }
            if (!this.Qa && i19 >= this.A0.P.size() - 1) {
                Ha(messageObject8, this.A0.P.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.A0.O = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.A0.T();
            this.A0.O(true);
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.G6 || !arrayList.isEmpty() || this.A0.f41351w >= 0) {
                z11 = false;
            }
            Tb(z11);
            if (this.f37478x0 != null) {
                J7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.G6 || !arrayList.isEmpty() || this.A0.f41351w >= 0)) {
                    this.f37478x0.setEmptyView(this.Q0);
                    ak akVar = this.f37478x0;
                    akVar.K0(akVar.v1());
                    return;
                }
                this.Q0.setVisibility(8);
                this.f37478x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        ai.h4 h4Var;
        org.telegram.ui.Components.no noVar;
        String str;
        ai.h4 h4Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (h4Var2 = this.J1) != null) {
                    org.telegram.ui.Components.si siVar = h4Var2.B0;
                    if (siVar instanceof ii.r) {
                        ii.r rVar = (ii.r) siVar;
                        if (intent != null && intent.getData() != null) {
                            ii.x3 x3Var = rVar.f12645r;
                            Uri data = intent.getData();
                            if (data == null) {
                                x3Var.getClass();
                                return;
                            } else if (x3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new gg.w1(13, x3Var, data));
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
                        ai.h4 h4Var3 = this.J1;
                        if (h4Var3 != null) {
                            org.telegram.ui.Components.si siVar2 = h4Var3.B0;
                            if (siVar2 instanceof ii.r) {
                                ii.r rVar2 = (ii.r) siVar2;
                                if (intent.getData() != null) {
                                    rVar2.f12645r.f2(intent.getData());
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
                                xb();
                            }
                            if (this.f37391q5) {
                                this.f37421s8 = str;
                            } else {
                                ta(null, str);
                            }
                        } else if (this.p5 == null && this.R3 == 1) {
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.T5, new o(7, this, data2), this.f37251ea);
                        } else {
                            o8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.T5, this.f37356n5, this.X3, this.f37330l5, null, null, null, null, 0, this.p5, true, 0, this.R3, H8());
                        }
                        B6();
                        return;
                    }
                    xb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        xb();
                        return;
                    }
                    if (this.p5 == null && this.R3 == 1) {
                        if (intent.getData() != null) {
                            ai.h4 h4Var4 = this.J1;
                            if (h4Var4 != null) {
                                h4Var4.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.f5(this) {
                                public final eo f41616b;

                                {
                                    this.f41616b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            eo eoVar = this.f41616b;
                                            eoVar.o8(null, null);
                                            eoVar.kb(i12, intent.getData(), z10);
                                            eoVar.B6();
                                            return;
                                        default:
                                            eo eoVar2 = this.f41616b;
                                            eoVar2.o8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                eoVar2.kb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            eoVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f37251ea);
                            return;
                        } else if (intent.getClipData() != null) {
                            ai.h4 h4Var5 = this.J1;
                            if (h4Var5 != null) {
                                h4Var5.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.f5(this) {
                                public final eo f41616b;

                                {
                                    this.f41616b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            eo eoVar = this.f41616b;
                                            eoVar.o8(null, null);
                                            eoVar.kb(i12, intent.getData(), z10);
                                            eoVar.B6();
                                            return;
                                        default:
                                            eo eoVar2 = this.f41616b;
                                            eoVar2.o8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                eoVar2.kb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            eoVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f37251ea);
                            return;
                        } else {
                            xb();
                        }
                    } else {
                        o8(null, null);
                        if (intent.getData() != null) {
                            kb(0, intent.getData(), true);
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                kb(0, clipData.getItemAt(i12).getUri(), true);
                            }
                        } else {
                            xb();
                        }
                    }
                    ai.h4 h4Var6 = this.J1;
                    if (h4Var6 != null) {
                        h4Var6.dismiss();
                    }
                    B6();
                    return;
                } else if (i10 == 28 && (h4Var = this.J1) != null && (noVar = h4Var.m0) != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = noVar.f30573a;
                    if (noVar.f28894k1 != -1 && noVar.f28892j1 != null) {
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
                            org.telegram.messenger.am.q(R.string.UnsupportedAttachment, new org.telegram.ui.Components.zc(noVar.f30574b.container, c6Var), c6Var);
                            return;
                        }
                        noVar.h0(noVar.f28894k1, new rh.c(uri));
                        org.telegram.ui.Components.un unVar = noVar.f28892j1;
                        if (unVar != null) {
                            unVar.dismiss(true);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            H7();
            ai.h4 h4Var7 = this.J1;
            if (h4Var7 != null) {
                h4Var7.f24354j0.g0(i10, intent, this.V7);
            }
            this.V7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.b70 b70Var;
        org.telegram.ui.ActionBar.a2 a2Var;
        org.telegram.ui.Components.uf ufVar;
        org.telegram.ui.Components.sf sfVar;
        xm xmVar;
        zg.s sVar;
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30532w;
        if (scVar != null) {
            org.telegram.ui.Components.wb wbVar = scVar.f30536e;
            if (wbVar instanceof org.telegram.ui.Components.dc) {
                if (z10) {
                    ((org.telegram.ui.Components.dc) wbVar).f();
                    scVar.b();
                    return false;
                }
                return false;
            }
        }
        n51 n51Var = this.Z9;
        if (n51Var != null && !n51Var.f40219b0) {
            if (z10) {
                n51Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            zg.t tVar = this.Y9;
            if (tVar != null && (sVar = tVar.f54887b) != null && sVar.getReactionsWindow() != null) {
                if (z10) {
                    tVar.f54887b.e();
                    return false;
                }
            } else if (ut.q().E) {
                if (z10) {
                    ut.q().o();
                    return false;
                }
            } else {
                nl nlVar = this.Fa;
                if (nlVar != null && nlVar.f33331s) {
                    if (z10) {
                        nlVar.a(true);
                        return false;
                    }
                } else if (this.yc.f16088f) {
                    if (z10) {
                        Pb(false);
                        return false;
                    }
                } else if (this.Q8 != null) {
                    if (z10) {
                        D7(true);
                        return false;
                    }
                } else if (!a7(z10, false)) {
                    if (g9()) {
                        if (z10 && (xmVar = this.f37225c9) != null && xmVar.x()) {
                            this.f37225c9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.u()) {
                            if (z10) {
                                C7(false);
                                return false;
                            }
                        } else {
                            sk skVar = this.Y;
                            if (skVar != null && skVar.u0()) {
                                if (z10) {
                                    this.Y.n0(true);
                                    return false;
                                }
                            } else {
                                sk skVar2 = this.Y;
                                if (skVar2 != null && skVar2.v()) {
                                    if (z10) {
                                        sk skVar3 = this.Y;
                                        ei.c0 c0Var = skVar3.f23685l0;
                                        if (c0Var != null) {
                                            c0Var.setOpened(false);
                                        }
                                        if (!skVar3.k0() && (sfVar = skVar3.m0) != null) {
                                            sfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    sk skVar4 = this.Y;
                                    if (skVar4 == null || (ufVar = skVar4.E0) == null || !ufVar.closeCreationLinkDialog(z10)) {
                                        if (this.R3 == 6 && (a2Var = hg.w.d) != null && a2Var.isShowing()) {
                                            if (z10) {
                                                hg.w.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f37241e) && !this.T3 && this.R1 != null && d() != 0) {
                                            if (z10) {
                                                this.R1.m(0L, this.f37380p7);
                                                return false;
                                            }
                                        } else if (this.R3 == 5 && !"hello".equalsIgnoreCase(this.Q3) && !"away".equalsIgnoreCase(this.Q3) && (this.f37444u6.isEmpty() || this.f37232d4 == 0)) {
                                            if (z10) {
                                                Ub();
                                                return false;
                                            }
                                        } else if (this.R3 == 6 && this.Y.w()) {
                                            if (z10) {
                                                Ab(new vf(this, 18));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21060n0) {
                                                if (z10) {
                                                    kVar2.i(true);
                                                    return false;
                                                }
                                            } else if (this.f37476wc.f16088f) {
                                                if (z10) {
                                                    xa();
                                                }
                                            } else {
                                                if (z10 && (b70Var = this.f37205b3) != null) {
                                                    b70Var.a(false);
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
        p9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f37444u6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f37241e)))) {
                    org.telegram.ui.Components.o41.u(messageObject, false);
                }
            }
        }
        this.F3 = false;
        q9();
        ArrayList arrayList2 = org.telegram.ui.Components.o41.Q;
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
        if (this.f37252eb) {
            sk skVar = this.Y;
            if (skVar != null) {
                skVar.K0();
                sk skVar2 = this.Y;
                skVar2.T0 = false;
                org.telegram.ui.Components.ig igVar = skVar2.U0;
                if (igVar != null) {
                    igVar.v(false);
                }
            }
            this.f37252eb = false;
        }
        if (this.f37452v1 != null) {
            AndroidUtilities.runOnUIThread(new qe(this, 1), 600L);
        }
        if (this.f37403r4 && !this.f37417s4) {
            this.f37417s4 = true;
            org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f30540j = 5000;
            M.v = new qe(this, 2);
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
        uj ujVar = this.f37190a1;
        if (ujVar != null) {
            ujVar.getViewTreeObserver().addOnPreDrawListener(new ii(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        D7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.D1() || !PhotoViewer.t1().R1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f37251ea);
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
                    if (t12.f2(playingMessageObject, null, null, null, null, null, null, 0, this.Ga, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.t1().l4 = this;
                    }
                    m9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.D1() && PhotoViewer.t1().f33803l2) {
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
        al alVar = this.W9;
        float f7 = 0.0f;
        if (z10 && this.R9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (m2Var instanceof eo) {
                this.D4 = true;
                eo eoVar = (eo) m2Var;
                eoVar.T9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.X0.setSkipBackgroundDrawing(true);
                this.f37190a1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f37190a1.getAvatarImageView().setAlpha(0.0f);
                this.f37190a1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.S9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                sk skVar = this.Y;
                if (skVar != null) {
                    skVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                vk vkVar = this.R;
                if (vkVar != null) {
                    vkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                sk skVar2 = this.Y;
                if (skVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = skVar2.getMeasuredHeight();
                }
                vk vkVar2 = this.R;
                if (vkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = vkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                sk skVar3 = eoVar.Y;
                if (skVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = skVar3.getMeasuredHeight();
                }
                vk vkVar3 = this.R;
                if (vkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = vkVar3.getMeasuredHeight();
                }
                this.O9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ai.x(9, this, eoVar));
                nc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.V9 = animatorSet;
                animatorSet.addListener(new ci.x5(this, eoVar, runnable));
                this.V9.setDuration(300L);
                this.V9.setInterpolator(org.telegram.ui.Components.js.f27627f);
                this.V9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(alVar, 200L);
                return this.V9;
            }
        }
        if (this.f37311ja && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (m2Var2 instanceof hg1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                m2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f37335la = f7;
                ofFloat.addUpdateListener(new hj(0, this));
                this.f37324ka = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                wm wmVar = this.X0;
                if (wmVar != null) {
                    wmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V9 = animatorSet2;
                animatorSet2.addListener(new ij(this, z10, runnable));
                this.V9.setDuration(150L);
                this.V9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(alVar, 200L);
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
        org.telegram.ui.ActionBar.a2 a2Var = this.N;
        if (a2Var != null && dialog == a2Var) {
            getMessagesController().deleteDialog(this.T5, 0);
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.zv0 zv0Var;
        super.onFragmentDestroy();
        hh.e eVar = this.N3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f11495w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                hh.d dVar = (hh.d) longSparseArray.valueAt(i10);
                if (dVar.f11482i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        sk skVar = this.Y;
        if (skVar != null) {
            skVar.D0();
        }
        uj ujVar = this.f37190a1;
        if (ujVar != null && (zv0Var = ujVar.f32502c0) != null) {
            zv0Var.b(ujVar.G);
        }
        kk kkVar = this.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            this.I1.getAdapter().P();
        }
        ai.h4 h4Var = this.J1;
        if (h4Var != null) {
            h4Var.dismissInternal();
        }
        ut q6 = ut.q();
        if (q6.f42578l == this.f37323k9) {
            q6.W = null;
            q6.f42565a0 = null;
            q6.Y = null;
            q6.f42578l = null;
            q6.f42569c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.F9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.G9);
        getNotificationCenter().onAnimationFinish(this.H9);
        getNotificationCenter().onAnimationFinish(this.I9);
        q9();
        qe qeVar = this.L5;
        if (qeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qeVar);
            this.L5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f37361na);
        MessagesController messagesController = getMessagesController();
        long j3 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j3, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.Sa;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Sa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.R3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.T5), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f37253f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.E3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f37253f != null) {
            getMessagesController().cancelLoadFullUser(this.f37253f.f19949id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ai.h4 h4Var2 = this.J1;
        if (h4Var2 != null) {
            h4Var2.y1();
            this.J1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f37241e)) {
            getMessagesController().startShortPoll(this.f37241e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.Z7.linked_chat_id)), this.classGuid, true);
            }
        }
        xm xmVar = this.f37225c9;
        if (xmVar != null) {
            xmVar.f(false);
        }
        ck ckVar = this.f37491y0;
        if (ckVar != null) {
            ckVar.N();
        }
        bl blVar = this.f37474wa;
        if (blVar != null) {
            blVar.b();
        }
        this.f37212ba = null;
        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Oc ? 1 : 0);
            org.telegram.ui.ActionBar.b5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.p9) parentLayout2.getPulledDialogs().get(i11)).f29448b > indexOf) {
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
        o11 o11Var = this.f37224c8;
        if (o11Var != null) {
            o11Var.b(true);
            this.f37224c8 = null;
        }
        yh.w3 w3Var = this.f37397qc;
        if (w3Var != null) {
            w3Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f37397qc);
            this.f37397qc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f37325kb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f37472w8, null, null, false);
        }
        yh.w3 w3Var = this.f37397qc;
        if (w3Var != null) {
            w3Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f37397qc);
            this.f37397qc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ai.h4 h4Var;
        org.telegram.ui.Components.zl zlVar;
        ai.h4 h4Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.aj ajVar;
        sk skVar = this.Y;
        boolean z12 = false;
        if (skVar != null && i10 == 2 && skVar.L3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(skVar.Q).sendCurrentLocation(skVar.K3, skVar.L3);
            }
            skVar.L3 = null;
            skVar.K3 = null;
        }
        kk kkVar = this.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            gg.j1 adapter = this.I1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f10692w0;
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
            ai.h4 h4Var3 = this.J1;
            if (h4Var3 != null) {
                h4Var3.f24354j0.Y();
            }
            org.telegram.ui.Components.eq eqVar = this.f37212ba;
            if (eqVar != null && (ajVar = eqVar.Y) != null) {
                ajVar.f24354j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (h4Var = this.J1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                h4Var.G1();
            } else if (i10 == 30 && (zlVar = h4Var.f24368o0) != null && h4Var.B0 == zlVar && h4Var.isShowing()) {
                h4Var.f24368o0.b0();
            }
        } else if ((i10 == 17 || i10 == 18) && (h4Var2 = this.J1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = h4Var2.f24354j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.J1.f24354j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f37251ea);
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new ai(this));
                org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(2);
        } else if (((i10 != 101 && i10 != 102) || this.f37253f == null) && (i10 != 103 || this.f37241e == null)) {
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
                    org.telegram.ui.Components.voip.g2.l(this.f37241e, null, this.Y7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f37253f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f37196a8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f37253f.f19949id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        sk skVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.y9[] y9VarArr;
        ai.f0 f0Var;
        super.onResume();
        g7();
        this.E9 = System.currentTimeMillis();
        if (this.f37408r9 && getSendMessagesHelper().getImportingHistory(this.T5) != null) {
            org.telegram.ui.Components.r50 r50Var = new org.telegram.ui.Components.r50(getParentActivity(), null, this, this.f37251ea);
            r50Var.setOnHideListener(new ue(this, 0));
            showDialog(r50Var);
            this.f37408r9 = false;
        }
        K6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        Z6();
        ai.h4 h4Var = this.J1;
        if (h4Var != null) {
            h4Var.B1();
        }
        wm wmVar = this.X0;
        boolean z12 = true;
        if (wmVar != null) {
            org.telegram.ui.Components.x91 x91Var = wmVar.v;
            if (x91Var != null) {
                x91Var.c(true);
            }
            wmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new qe(this, 23), 1000L);
        }
        b9 b9Var = new b9(this, 2);
        this.Zb = b9Var;
        setBulletinDelegate(b9Var);
        J6(false);
        TLRPC.PhotoSize photoSize = this.f37469w5;
        if (photoSize != null && (f0Var = this.f37189a0) != null) {
            ((org.telegram.ui.Components.ip[]) f0Var.f931b)[0].f27256f.k(ImageLocation.getForObject(photoSize, this.f37495y5), "50_50", ImageLocation.getForObject(this.f37483x5, this.f37495y5), "50_50_b", this.f37443u5, null, this.f37356n5, this.f37456v5);
        }
        if (this.C5 != null && (y9VarArr = this.B2) != null) {
            y9VarArr[0].k(ImageLocation.getForObject(this.C5, this.E5), "50_50", ImageLocation.getForObject(this.D5, this.E5), "50_50_b", this.f37507z5, null, (MessageObject) this.J4.get(Integer.valueOf(this.L4)), this.A5);
            y9VarArr[0].setHasBlur(this.B5);
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
                if (this.f37478x0 != null) {
                    int i10 = this.T7;
                    if (i10 == -9000) {
                        i10 = P8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f37502z0.i1(this.f37444u6.indexOf(this.K7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f37502z0.i1(this.f37444u6.indexOf(this.K7) + this.A0.J, i10, z11);
                }
            } else {
                T9(false);
            }
            this.S5 = false;
            this.Q5 = false;
            this.K7 = null;
        }
        this.f37391q5 = false;
        this.f37404r5 = false;
        d7(false);
        if (this.f37418s5) {
            this.f37418s5 = false;
            qm qmVar = this.A0;
            if (qmVar != null) {
                qmVar.O(false);
            }
        }
        uj ujVar = this.f37190a1;
        if (ujVar != null) {
            ujVar.getViewTreeObserver().addOnPreDrawListener(new ii(this, 0));
        }
        D6(false, false);
        if (this.Y != null && this.R3 == 0 && this.f37299ia != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.T5 && (arrayList2 = this.f37299ia.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new t80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f37299ia.entities;
            }
            CharSequence r10 = ChatActivityEnterView.r(arrayList, this.f37299ia.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (r10 != null && r10.length() > 0 && r10.charAt(0) == '@') {
                r10 = TextUtils.concat(" ", r10);
            }
            this.Y.h1(r10, true);
            this.f37299ia = null;
        }
        wk wkVar = this.O0;
        if (wkVar != null && wkVar.getVisibility() != 0 && !this.actionBar.f21060n0 && this.R3 != 7 && !org.telegram.ui.ActionBar.m2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        sk skVar2 = this.Y;
        if (skVar2 != null) {
            skVar2.G0();
        }
        if (this.f37253f != null) {
            this.f37381p8 = System.currentTimeMillis();
            this.f37393q8 = 0L;
        }
        if (this.f37421s8 != null) {
            AndroidUtilities.runOnUIThread(new qe(this, 3));
        }
        if (this.f37478x0 != null && ((skVar = this.Y) == null || !skVar.s0())) {
            this.f37478x0.setOnItemLongClickListener(this.Ka);
            this.f37478x0.setOnItemClickListener(this.La);
            this.f37478x0.setLongClickable(true);
        }
        org.telegram.ui.Components.v61.h = false;
        TLRPC.User user = this.f37253f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.v61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.Z7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.Z7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.v61.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                if (chatFull.bot_info.isEmpty() || (chat = this.f37241e) == null || !chat.megagroup) {
                    z12 = false;
                }
                org.telegram.ui.Components.v61.h = z12;
            }
        }
        Rc(false);
        Mb();
        if (this.N9 != 0.0f) {
            this.N9 = 0.0f;
            this.f37478x0.invalidate();
        }
        this.E3.attach();
        yh.w3 w3Var = this.f37397qc;
        if (w3Var != null) {
            w3Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.ud udVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.O5) {
                this.O5 = true;
                yc();
            }
            iArr = this.F9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.N5 = false;
            if (!z11) {
                this.P5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f37253f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            sk skVar = this.Y;
            if (skVar != null && (udVar = skVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(udVar);
                skVar.S1 = null;
            }
        }
        g7();
        this.F9 = getNotificationCenter().setAnimationInProgress(this.F9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f37281h4) {
            if (this.f37253f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f37253f.f19949id));
                if (user != null) {
                    this.f37253f = user;
                } else {
                    return;
                }
            } else if (this.f37241e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f37241e.f19802id));
                if (chat != null) {
                    this.f37241e = chat;
                } else {
                    return;
                }
            }
            uj ujVar = this.f37190a1;
            if (ujVar != null) {
                ujVar.b();
            }
        }
    }

    public final void p7() {
        float f7;
        org.telegram.ui.Components.sf sfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + b9(org.telegram.ui.Components.d41.f25240c) + this.v.d();
        sk skVar = this.Y;
        if (skVar != null && (sfVar = skVar.m0) != null) {
            sfVar.setTranslationY(-inputBubbleHeight);
        }
        kk kkVar = this.I1;
        if (kkVar != null) {
            if (kkVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            kkVar.setTranslationY(f7);
        }
    }

    public final void p8(boolean z10) {
        TLRPC.Chat chat = this.f37241e;
        if (chat != null && this.Z7 != null && !ChatObject.isNotInChat(chat) && !this.f37241e.creator) {
            TLRPC.ChatFull chatFull = this.Z7;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f37398r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f37398r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.Z7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.Z7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f37398r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f37398r == 0) {
                getMessagesController().checkChatInviter(this.f37241e.f19802id, false);
            }
        }
    }

    public final void p9() {
        il ilVar = this.f37213bb;
        if (ilVar == null) {
            return;
        }
        this.f37213bb = null;
        ilVar.e();
        if (ilVar.getReactionsWindow() != null && ilVar.getReactionsWindow().f54673a != null) {
            ilVar.getReactionsWindow().f54673a.animate().alpha(0.0f).setDuration(180L).start();
        }
        ilVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new nh(8, this, ilVar)).setDuration(180L).start();
    }

    public final void pa(TLRPC.Chat chat) {
        boolean z10;
        ci.d4 d4Var = this.f37452v1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.d4 d4Var2 = this.f37465w1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new nh(2, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21060n0) {
            this.f37514zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f37277h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f37242e0;
            if (xVar != null) {
                xVar.f(8);
            }
            is isVar = this.f37228d0;
            if (isVar != null) {
                isVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f37289i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f37302j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f37351n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f37314k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f37362o0 = true;
            Jc(0, 0, -1);
            lc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f37302j0;
        if (u0Var5 != null) {
            this.f37240dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f37240dc = false;
        }
        db(chat, null);
        Cc(0, true);
    }

    public final void pb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.pb(boolean, boolean, boolean):void");
    }

    public final void pc() {
        int i10;
        ik ikVar = this.Y2;
        if (ikVar == null) {
            return;
        }
        ikVar.setTranslationX(W8() / 2.0f);
        this.Y2.setTranslationY((((this.f37478x0.getTranslationY() + this.f37422s9) + this.f37511z9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f37511z9, -this.Y2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.Y2.setAlpha(this.f37292i3 * clamp);
        ik ikVar2 = this.Y2;
        if (this.f37292i3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ikVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.Y2.setScaleX(lerp);
        this.Y2.setScaleY(lerp);
    }

    public final void q7() {
        float d;
        if (this.f37478x0 != null) {
            if (this.Pa && this.f37238da == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + b9(org.telegram.ui.Components.d41.f25240c) + AndroidUtilities.dp(16.0f) + this.Ba + this.f37425sc;
            }
            int i10 = (int) this.f37422s9;
            org.telegram.ui.Components.h41 h41Var = this.R1;
            if (h41Var != null) {
                h41Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            hh.g gVar = this.f37464w0;
            boolean z10 = this.f37478x0.V1;
            RecyclerView recyclerView = gVar.f11509a;
            int i11 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ai.p8(gVar, i12, 9));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            hh.e eVar = this.N3;
            if (eVar != null) {
                RectF rectF = eVar.f11488b;
                rectF.set(b9(org.telegram.ui.Components.d41.f25239b), i10 - this.G, 0.0f, d - this.Ba);
                eVar.f11489c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void q8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.q8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void q9() {
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.sc scVar = this.A3;
        if (scVar != null) {
            scVar.c(0L, false);
        }
        ol olVar = this.f37505z3;
        if (olVar != null) {
            olVar.e(0, true);
        }
    }

    public final void qa(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ci.d4 d4Var = this.f37452v1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.d4 d4Var2 = this.f37465w1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ye(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21060n0) {
            this.f37514zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f37277h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f37242e0;
            if (xVar != null) {
                xVar.f(8);
            }
            is isVar = this.f37228d0;
            if (isVar != null) {
                isVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f37289i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            if ((this.f37232d4 == 0 || (i11 = this.R3) == 3 || i11 == 8) && (u0Var = this.f37302j0) != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f37351n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f37314k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f37362o0 = true;
            Jc(0, 0, -1);
            lc(false);
        }
        if ((this.f37232d4 == 0 || this.f37281h4 || (i10 = this.R3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f37253f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W4 = z11;
            org.telegram.ui.ActionBar.u0 u0Var5 = this.f37302j0;
            if (u0Var5 != null) {
                u0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f37302j0;
        if (u0Var6 != null) {
            u0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f37429t3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.T5, this.L6, this.classGuid, 0, this.f37232d4, false, this.f37365o3, this.f37377p3, !TextUtils.isEmpty(str), this.f37389q3);
        Cc(0, true);
    }

    public final void qb(int i10, int i11, String str) {
        this.L7 = i10;
        this.N7 = true;
        this.O7 = 0L;
        this.P7 = str;
        this.S7 = i11;
        this.M7 = true;
    }

    public final void qc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f37196a8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f37196a8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != null) {
            if (z10 && this.T0 == null) {
                yi yiVar = new yi(getParentActivity(), getResourceProvider(), this);
                this.T0 = yiVar;
                w7.y5.b(yiVar, 0.02f, 1.2f);
                this.T0.setOnClickListener(new ef(this, 12));
            }
            yi yiVar2 = this.T0;
            if (yiVar2 != null) {
                if (!z10) {
                    yiVar2.setVisibility(8);
                    return;
                }
                yiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f37196a8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f37196a8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f37253f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        l11 l11Var = new l11(formatString.substring(indexOf, indexOf2));
                        if (l11Var.f39624c != -1) {
                            l11Var.f39624c = -1;
                            l11Var.invalidateSelf();
                        }
                        l11Var.a(503316480);
                        l11Var.setBounds(0, 0, l11Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(l11Var), indexOf, indexOf2, 33);
                    }
                }
                this.T0.setCustomText(spannableStringBuilder);
                this.T0.setOverrideTextMaxWidth(ci.d4.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.T0.getParent() != null && (!z10 || this.T0.getParent() != this.R0)) {
                    ((ViewGroup) this.T0.getParent()).removeView(this.T0);
                }
                if (z10) {
                    ViewParent parent = this.T0.getParent();
                    LinearLayout linearLayout = this.R0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.T0, w7.w5.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j3) {
        if (photoEntry == null) {
            return;
        }
        this.f37462vc.a(false, true);
        MessageObject messageObject = this.p5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.p5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f37271g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.p5.messageOwner.suggested_post);
            }
            if (!yh.n5.U(this.currentAccount, messageSuggestionParams.amount)) {
                Xb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            vf vfVar = new vf(this, 26);
            this.f37392q7 = vfVar;
            AndroidUtilities.runOnUIThread(vfVar, 3000L);
        }
        o8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.g5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                eo eoVar = eo.this;
                MessageObject messageObject2 = eoVar.p5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = eoVar.f37271g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(eoVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(eoVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, eoVar.T5, eoVar.p5, eoVar.X3, null, eoVar.f37330l5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, eoVar.H8(), photoEntry2.effectId, l4.longValue(), eoVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, eoVar.T5, eoVar.p5, eoVar.X3, null, eoVar.f37330l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, eoVar.H8(), photoEntry2.effectId, l4.longValue(), eoVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, eoVar.T5, eoVar.p5, eoVar.X3, null, eoVar.f37330l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, eoVar.H8(), photoEntry2.effectId, l4.longValue(), eoVar.S8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(eoVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, eoVar.T5, eoVar.f37356n5, eoVar.X3, null, eoVar.f37330l5, photoEntry2.entities, photoEntry2.ttl, eoVar.p5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, eoVar.H8(), photoEntry2.effectId, l4.longValue(), eoVar.S8(), eoVar.f37271g5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, eoVar.T5, eoVar.f37356n5, eoVar.X3, null, eoVar.f37330l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, eoVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, eoVar.H8(), photoEntry2.effectId, l4.longValue(), eoVar.S8(), eoVar.f37271g5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, eoVar.T5, eoVar.f37356n5, eoVar.X3, null, eoVar.f37330l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, eoVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, eoVar.H8(), photoEntry2.effectId, l4.longValue(), eoVar.S8(), eoVar.f37271g5);
                }
                eoVar.B6();
            }
        }, j3);
    }

    public final void r7() {
        FrameLayout frameLayout = this.Q0;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int r8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.f37444u6;
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
                    int i17 = 0;
                    int i18 = -1;
                    int i19 = -1;
                    int i20 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    while (i17 < arrayList7.size()) {
                        int intValue2 = ((Integer) arrayList7.get(i17)).intValue();
                        int i24 = i16;
                        if (intValue2 >= indexOf && (i19 == -1 || i19 > intValue2)) {
                            i21 = ((Integer) arrayList6.get(i17)).intValue();
                            i20 = ((Integer) arrayList8.get(i17)).intValue();
                            i19 = intValue2;
                        }
                        if (intValue2 <= indexOf && (i18 == -1 || i18 < intValue2)) {
                            i22 = ((Integer) arrayList6.get(i17)).intValue();
                            i23 = ((Integer) arrayList8.get(i17)).intValue();
                            i18 = intValue2;
                        }
                        i17++;
                        i16 = i24;
                    }
                    i11 = i16;
                    int i25 = -1;
                    if (i19 != -1) {
                        if (Math.abs(i19 - indexOf) > this.Jb + 1 && Math.abs(i20 - i11) > this.Jb + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i18 == i25 || (Math.abs(i18 - indexOf) > this.Jb + 1 && Math.abs(i23 - i11) > this.Jb + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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

    public final void r9() {
        boolean z10;
        Jc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f37429t3, this.T5, this.L6, this.classGuid, 0, this.f37232d4, this.f37365o3, this.f37377p3, this.f37389q3);
        if (TextUtils.isEmpty(this.f37429t3) && this.f37389q3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f37416s3 = z10;
        this.f37362o0 = z10;
        lc(false);
        Mc();
    }

    public final void ra(TLRPC.User user) {
        boolean z10;
        ci.d4 d4Var = this.f37452v1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.d4 d4Var2 = this.f37465w1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ug(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21060n0) {
            this.f37514zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f37277h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f37242e0;
            if (xVar != null) {
                xVar.f(8);
            }
            is isVar = this.f37228d0;
            if (isVar != null) {
                isVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f37289i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f37302j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f37351n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f37314k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f37362o0 = true;
            Jc(0, 0, -1);
            lc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f37302j0;
        if (u0Var5 != null) {
            this.f37240dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f37240dc = false;
        }
        db(null, user);
        Cc(0, true);
    }

    public final void rb(long j3) {
        this.f37232d4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19823id = (int) j3;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void rc() {
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
        if (ChatObject.isMonoForum(this.f37241e)) {
            if (this.f37241e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f37241e.f19802id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f37241e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j10 = this.f37241e.send_paid_messages_stars;
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f19802id), LocaleController.formatNumber(j10, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f19802id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(yh.p7.S0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.S0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final eo f39478b;

                    {
                        this.f39478b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                eo.c0(j10, this.f39478b);
                                return;
                            default:
                                eo.o1(j10, this.f39478b);
                                return;
                        }
                    }
                });
                return;
            }
            this.S0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f37196a8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.bp bpVar = this.S0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                bpVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.T5))), LocaleController.getString(R.string.MessagePremiumUnlock), new ai.e2(7));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.bp bpVar2 = this.S0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bpVar2.c(z10, false, AndroidUtilities.replaceTags(yh.p7.S0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.T5), LocaleController.formatNumber(this.f37196a8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final eo f39478b;

                    {
                        this.f39478b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                eo.c0(j3, this.f39478b);
                                return;
                            default:
                                eo.o1(j3, this.f39478b);
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
    public final void restoreSelfArgs(Bundle bundle) {
        this.V7 = bundle.getString("path");
    }

    public final void s7() {
        int i10;
        float f7 = this.Ac.f16087e;
        org.telegram.ui.Components.x40 x40Var = this.f37427t1;
        int i11 = 8;
        if (x40Var != null) {
            x40Var.setAlpha(f7);
            org.telegram.ui.Components.x40 x40Var2 = this.f37427t1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x40Var2.setVisibility(i10);
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

    public final void s9() {
        this.X0.invalidate();
        Iterator it = this.f37490y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void sa(long j3) {
        int i10 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f37190a1.e(true, false);
            } else if (getMessagesController().isCommunity(j3)) {
                showDialog(new fi.k0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new eo(bundle));
                }
            }
        } else if (j3 != getUserConfig().getClientUserId()) {
            if (j3 == a()) {
                this.f37190a1.e(true, false);
                return;
            }
            Bundle f7 = sc.v.f(j3, "user_id");
            if (this.h != null && j3 == this.f37253f.f19949id) {
                f7.putLong("dialog_id", this.T5);
            }
            ProfileActivity profileActivity = new ProfileActivity(f7, null);
            TLRPC.User user = this.f37253f;
            if (user != null && user.f19949id == j3) {
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

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        vf vfVar = this.f37395qa;
        if (vfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vfVar);
        }
        sk skVar = this.Y;
        if (skVar != null && this.X0 != null && skVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f21186f) {
            this.f37383pa = this.X0.getKeyboardHeight();
        } else {
            this.f37383pa = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.V7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(View view) {
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

    public final void sc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.sc(boolean):void");
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.y p5 = kVar.p();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            p5.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.f2 f2Var;
        float f7;
        float f10;
        sk skVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f37253f != null && this.f37351n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f37253f.f19949id);
            if (userFull != null && userFull.phone_calls_available) {
                this.L9 = !this.inPreviewMode;
                this.f37351n0.f(0);
            } else {
                this.L9 = false;
                this.f37351n0.f(8);
            }
        }
        uj ujVar = this.f37190a1;
        float f12 = 0.0f;
        if (ujVar != null) {
            ujVar.setOccupyStatusBar(!z10);
            uj ujVar2 = this.f37190a1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            ujVar2.setLayoutParams(w7.w5.a(-1.0f, f11, 0.0f, 52.0f, 0.0f, -2, 51));
        }
        sk skVar2 = this.Y;
        if (skVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            skVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.uz0 uz0Var = this.f37229d1;
        if (uz0Var != null) {
            if (this.Z4 && !z10 && ((skVar = this.Y) == null || !skVar.f23627b4)) {
                i11 = 0;
            }
            uz0Var.setVisibility(i11);
        }
        kk kkVar = this.I1;
        if (kkVar != null) {
            ViewPropertyAnimator animate = kkVar.animate();
            if (!this.Y.f23627b4 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.js.f27627f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                f2Var = new org.telegram.ui.ActionBar.f2(false);
            } else {
                f2Var = null;
            }
            kVar.setBackButtonDrawable(f2Var);
            org.telegram.ui.ActionBar.u0 u0Var = this.f37277h0;
            if (u0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.x xVar = this.f37242e0;
            if (xVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                xVar.f21436i = f12;
                org.telegram.ui.ActionBar.u0 u0Var2 = xVar.f21440m;
                if (u0Var2 != null) {
                    u0Var2.setAlpha(f12);
                }
            }
        }
        ak akVar = this.f37478x0;
        if (akVar != null) {
            int childCount = akVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f37478x0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.u1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f37331l6 - 1;
                        this.f37331l6 = i13;
                        if (i13 <= 0) {
                            this.f37331l6 = 0;
                            this.f37343m6 = true;
                            Ob(false);
                        } else {
                            this.f37303j1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f37241e)) {
                            j3 = this.f37241e.f19802id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j3, this.T5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        u1Var.setHighlighted(false);
                        u1Var.O3();
                    }
                }
            }
            this.f37478x0.setItemAnimator(null);
        }
        lc(false);
        Oc();
        mk mkVar = this.X1;
        if (mkVar != null) {
            if (!z10 && !this.Pa) {
                z12 = true;
            } else {
                z12 = false;
            }
            mkVar.setEnabled(z12);
        }
        mk mkVar2 = this.Z1;
        if (mkVar2 != null) {
            if (!z10 && !this.Pa) {
                z11 = true;
            } else {
                z11 = false;
            }
            mkVar2.setEnabled(z11);
        }
        pl plVar = this.f37480x2;
        if (plVar != null) {
            plVar.setEnabled(!isInPreviewMode());
        }
        wm wmVar = this.X0;
        if (wmVar != null) {
            wmVar.setOccupyStatusBar((this.inBubbleMode || this.Pa || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        if (this.X0 == null) {
            return;
        }
        this.f37425sc = F6(false);
        this.f37437tc = F6(true);
        this.S.setInputBubbleHeight(this.f37425sc);
        Ac();
        kc();
        p7();
        m7();
        r7();
        q7();
    }

    public final org.telegram.ui.Cells.a0 t8(int i10, boolean z10) {
        MessageObject messageObject;
        ak akVar = this.f37478x0;
        if (akVar != null) {
            int childCount = akVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f37478x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f37422s9 - this.f37447u9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f37478x0.getMeasuredHeight() - this.Ba) {
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

    public final void t9() {
        if (!this.D9) {
            this.D9 = true;
            wm wmVar = this.X0;
            if (wmVar != null) {
                wmVar.invalidate();
            }
            ak akVar = this.f37478x0;
            if (akVar != null) {
                akVar.invalidate();
            }
        }
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(b9(org.telegram.ui.Components.d41.f25240c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        y7();
    }

    public final void ta(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f37251ea);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().R1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().g2(arrayList, 0, 0, false, new yl(this, createVideoThumbnail, arrayList), this);
            return;
        }
        o8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.T5, this.f37356n5, this.X3, null, this.f37330l5, null, 0, this.p5, true, 0, 0, false, false, null, H8(), 0L, 0L, S8(), this.f37271g5);
        B6();
    }

    public final void tb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f37220c4 = tL_forumTopic;
        this.f37192a4 = arrayList;
        MessageObject messageObject = (MessageObject) hg.c.h(1, arrayList);
        this.X3 = messageObject;
        this.f37356n5 = messageObject;
        this.f37318k4 = i11;
        this.l4 = i12;
        this.f37341m4 = Math.max(1, i11);
        this.f37232d4 = this.X3.getId();
        this.f37246e4 = i10;
        this.f37258f4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37281h4 = z10;
        MessageObject messageObject2 = this.f37356n5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37270g4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Dc();
        Uc(false);
        lc(false);
    }

    public final void tc() {
        MessageObject messageObject;
        if (this.f37253f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                ak akVar = this.f37478x0;
                if (akVar != null) {
                    int childCount = akVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f37478x0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f37381p8, this.f37393q8, this.f37253f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f34268h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f37253f, null, null, messageObject2.getId());
            }
        }
    }

    public final void u7() {
        int i10;
        eo eoVar = this.f37238da;
        if (eoVar != null) {
            eoVar.u7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) a9(AndroidUtilities.dp(7.0f)));
        dl dlVar = this.f37363o1;
        if (dlVar != null) {
            i10 = AndroidUtilities.dp(dlVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(E8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.d());
        ai.w0 w0Var = this.L3;
        if (w0Var != null) {
            w0Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.x40 x40Var = this.f37427t1;
        if (x40Var != null) {
            x40Var.f32648e.setPadding(0, dp2, 0, dp3);
            x40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        ai.f0 f0Var = this.K3;
        if (f0Var != null) {
            jh.f fVar = (jh.f) f0Var.f931b;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.m10 m10Var = this.f37218c2;
        if (m10Var != null) {
            m10Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.gy0 gy0Var = this.f37230d2;
        if (gy0Var != null) {
            gy0Var.f26554a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.w0 u8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f37478x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f37478x0.getChildCount(); i10++) {
                View childAt = this.f37478x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (org.telegram.ui.Wallet.l0.F(w0Var.getMessageObject(), wallettransaction)) {
                        return w0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f37444u6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.l0.F((MessageObject) arrayList.get(i11), wallettransaction)) {
                    this.f37478x0.B0();
                    this.f37502z0.h1(this.A0.J + i11, 0);
                    return null;
                } else {
                    i11++;
                }
            }
        }
        return null;
    }

    public final void u9() {
        boolean z10;
        Rect rect;
        if (this.X0 != null) {
            if (this.Ua <= 0 && this.Va <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            vj vjVar = this.v;
            float c10 = vjVar.c();
            me.m mVar = vjVar.f45754b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f16115a) - AndroidUtilities.dp(29.0f));
            wm wmVar = this.X0;
            ci.bb bbVar = wmVar.L;
            Rect rect2 = this.Gc;
            if (bbVar != null) {
                rect2.set(0, 0, wmVar.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                this.X0.L.setClipBounds(rect2);
            }
            if (this.f37478x0 != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f37478x0.getTop());
                ak akVar = this.f37478x0;
                if (akVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                akVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(vjVar.v, vjVar.c() * mVar.f16115a) - AndroidUtilities.dp(29.0f))));
                jh.f fVar = this.X;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void ua() {
        this.O5 = true;
        this.fragmentBeginToShow = true;
        this.V9 = null;
        this.X0.invalidate();
        this.X0.setSkipBackgroundDrawing(false);
        this.S9 = false;
        this.fragmentView.setAlpha(1.0f);
        this.f37190a1.setTranslationY(0.0f);
        this.f37190a1.getAvatarImageView().setScaleX(1.0f);
        this.f37190a1.getAvatarImageView().setScaleY(1.0f);
        this.f37190a1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void ub() {
        AndroidUtilities.shakeViewSpring(this.f37478x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        sk skVar = this.Y;
        for (int i10 = 0; i10 < skVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(skVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void uc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new ci.x0(this, messageObject, z10, 11));
    }

    @Override
    public final boolean v() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void v6(MessageObject messageObject, Integer num) {
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

    public final void v7() {
        int i10;
        float f7 = (1.0f - this.yc.f16087e) * (1.0f - this.f37476wc.f16087e);
        this.f37303j1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f37303j1.setAlpha(f7);
        jh.h hVar = this.f37303j1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final void v8() {
        if (this.f37321k7) {
            return;
        }
        this.f37321k7 = true;
        getMessagesController().checkSensitive(this, this.T5, new qe(this, 24), new vf(this, 18));
    }

    public final void v9(int i10) {
        eo eoVar = this.f37238da;
        if (eoVar != null) {
            eoVar.v9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            yf.b0 b0Var = this.Dc;
            if (b0Var.f52341c == 0) {
                b0Var.invalidate();
            }
            b0Var.f52341c = i10 | b0Var.f52341c;
        }
    }

    public final void va(long j3, boolean z10) {
        if (this.R1 != null && UserObject.isBotForum(this.f37253f)) {
            this.R1.setAllTopicsHidden(true);
        }
        this.M5.put(j3, 1);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 0, new ci.o9(this, j3, z10, 5), new pe(this, j3, 2));
        this.A0.O(false);
    }

    public final void vb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f37251ea);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        a2Var.R = string;
        TLRPC.User user = this.f37253f;
        if (user != null) {
            if (user.bot) {
                a2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g10 = org.telegram.messenger.am.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, hf.b.c());
                TLRPC.User user2 = this.f37253f;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            a2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new gg.c2(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(a2Var);
    }

    public final void vc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f37484x6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                ck ckVar = this.f37491y0;
                if (ckVar != null) {
                    ckVar.V(groupedMessages);
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
            MessageObject messageObject3 = (MessageObject) this.f37368o6[0].get(messageObject.getId());
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
                    qm qmVar = this.A0;
                    qmVar.m(qmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f37444u6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                qm qmVar2 = this.A0;
                qmVar2.m(qmVar2.J + indexOf2);
            }
        }
    }

    @Override
    public final boolean w(final org.telegram.ui.vy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.hg1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.w(org.telegram.ui.vy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.hg1):boolean");
    }

    public final void w6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.w6():void");
    }

    public final void w7() {
        eo eoVar = this.f37238da;
        if (eoVar != null) {
            eoVar.w7();
        }
        float a92 = a9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.R1 != null) {
            a92 += b9(org.telegram.ui.Components.d41.f25238a);
        }
        if (this.f37363o1 != null) {
            a92 += AndroidUtilities.dp(35.0f) * this.f37363o1.E;
        }
        this.X.setFadeZoneTop((int) ((E8() * AndroidUtilities.dp(43.0f)) + a92));
    }

    public final boolean w8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f37478x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f37478x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (currentMessagesGroup = ((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f37444u6.indexOf((MessageObject) hg.c.h(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        qm qmVar = this.A0;
                        qmVar.q(indexOf + qmVar.J, currentMessagesGroup.messages.size());
                        this.f37478x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            hg.c.y(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(z10));
        return false;
    }

    public final void w9() {
        this.f37409ra = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean wa() {
        if (this.H4.size() != 1 || this.Y3 == null || ((Integer) this.H4.get(0)).intValue() != this.Y3.getId()) {
            return false;
        }
        return true;
    }

    public final boolean wb() {
        if (A9() && this.f37356n5 == null && this.p5 == null) {
            if (this.R3 != 8 && A9() && this.f37241e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f37241e.f19802id, 1L);
                if (this.R3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f37241e, findTopic)) {
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

    public final void wc() {
        org.telegram.ui.ActionBar.m1 m1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        ak akVar = this.f37478x0;
        kk kkVar = this.I1;
        if ((kkVar != null && kkVar.I) || ((m1Var = this.Q8) != null && m1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        akVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void x6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.i iVar = this.f37470w6;
            ArrayList arrayList = (ArrayList) iVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.v0.j(pollId, iVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void x7() {
        if (this.M0 != null) {
            this.M0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - E8()) * (1.0f - this.yc.f16087e) * W8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final void x8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j3) {
        boolean z13;
        if (!arrayList.isEmpty() && i7()) {
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
                qm qmVar = this.A0;
                if (qmVar != null) {
                    qmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.T5, z10, z11, z12, i10, 0, this.X3, -1, j3, S8(), this.f37271g5);
            org.telegram.ui.Components.g5.s0(sendMessage, this, this.f37251ea);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new vf(this, 25));
            }
        }
    }

    public final void x9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f37253f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f37444u6.isEmpty();
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

    public final void xa() {
        org.telegram.ui.Cells.u1 u1Var;
        this.f37476wc.a(false, true);
        qh.c cVar = this.Cc;
        if (cVar != null && (u1Var = cVar.f46605n) != null && u1Var.getDelegate() != null) {
            cVar.f46605n.getDelegate().K1(cVar.f46605n, false);
        }
        sk skVar = this.Y;
        if (skVar != null) {
            skVar.X0(true, true, false);
            this.Y.f23763x5 = null;
        }
    }

    public final void xb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.zc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f37251ea).j();
    }

    public final void xc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    public final void y6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.q9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f37241e, this.f37253f, null, this.T5, this.f37460va, this.f37448ua);
    }

    public final void y7() {
        float f7 = this.f37473w9;
        dl dlVar = this.f37363o1;
        if (dlVar != null) {
            dlVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f37363o1.E;
        }
        pk pkVar = this.f37375p1;
        if (pkVar != null) {
            pkVar.setTranslationY(f7);
        }
        float E8 = (E8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.h41 h41Var = this.R1;
        org.telegram.ui.Components.d41 d41Var = org.telegram.ui.Components.d41.f25238a;
        if (h41Var != null) {
            h41Var.setSideMenuBackgroundMarginTop((E8() * a9(AndroidUtilities.dp(7.0f))) + E8);
            float b92 = b9(d41Var);
            float b10 = yf.e0.b(this.yc.f16087e);
            float E82 = E8();
            E8 += yf.e0.b(Math.min(w7.n.a(yf.e0.b(b10), 0.0f, 1.0f), w7.n.a(yf.e0.b(E82), 0.0f, 1.0f))) * b92;
        }
        org.telegram.ui.Components.hh hhVar = this.M0;
        if (hhVar != null) {
            hhVar.setTranslationY((E8 - AndroidUtilities.dp(5.0f)) - (E8() * b9(d41Var)));
        }
    }

    public final int y8() {
        return this.R3;
    }

    public final boolean y9() {
        if (this.R1 != null && this.f37232d4 == 0) {
            return true;
        }
        return false;
    }

    public final void ya(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        if (this.f37476wc.f16088f && (cVar = this.Cc) != null && cVar.f46605n == u1Var) {
            Editable text = cVar.f46600a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(u1Var.getMessageObject(), text, this.Cc.getAttachedMedia());
                xa();
                return;
            }
            AndroidUtilities.shakeView(this.Cc.f46600a);
        }
    }

    public final void yb(org.telegram.ui.Cells.u1 u1Var) {
        if (getParentActivity() != null && u1Var != null && u1Var.f23087ob != null && u1Var.getPrimaryMessageObject() != null && u1Var.getPrimaryMessageObject().messageOwner != null && u1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Xa) {
                this.Xa = true;
                if (this.f37503z1 != null) {
                    return;
                }
                ci.d4 d4Var = new ci.d4(getParentActivity(), 3);
                d4Var.p(true);
                d4Var.K = Layout.Alignment.ALIGN_NORMAL;
                d4Var.d = -1L;
                d4Var.T = true;
                d4Var.f4907e = true;
                d4Var.i();
                d4Var.q(8.0f);
                this.f37503z1 = d4Var;
                d4Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ci.d4 d4Var2 = this.f37503z1;
                d4Var2.h = ci.d4.a(d4Var2.getText(), this.f37503z1.getTextPaint());
                this.X0.addView(this.f37503z1, w7.w5.a(120.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
                this.X0.post(new org.telegram.ui.ActionBar.f6(25, this, u1Var));
            }
        }
    }

    public final void yc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eo.yc():void");
    }

    @Override
    public final org.telegram.ui.Components.yw0 z() {
        return this.X0;
    }

    public final void z6(MessageObject messageObject, boolean z10) {
        A6(messageObject, z10, true);
    }

    public final void z7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.f37457v6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.i iVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f37444u6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.T5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f37368o6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j3 = this.f37241e.f19802id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j3, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f37484x6.f(messageObject.getGroupId());
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
                        int indexOf2 = arrayList.indexOf((MessageObject) hg.c.h(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            qm qmVar = this.A0;
                            if (!qmVar.N) {
                                qmVar.q(indexOf2 + qmVar.J, groupedMessages2.messages.size());
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

    public final r0.k1 z8(r0.k1 k1Var) {
        ai.h4 h4Var;
        r0.a1 w0Var;
        if (k1Var != null && (h4Var = this.J1) != null) {
            if (h4Var.isShowing() || this.J1.f24399x0) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    w0Var = new r0.z0(k1Var);
                } else if (i10 >= 30) {
                    w0Var = new r0.y0(k1Var);
                } else if (i10 >= 29) {
                    w0Var = new r0.x0(k1Var);
                } else {
                    w0Var = new r0.w0(k1Var);
                }
                w0Var.c(8, i0.b.f11573e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void za(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        zg.n0 d = zg.n0.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            messageObject = ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        eb(a0Var, messageObject2, null, null, f7, f10, d, false, false, false, false);
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
                MessageObject messageObject3 = (MessageObject) this.f37368o6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f37389q3 != null) {
                oc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.f37389q3)) {
            MessageObject.GroupedMessages c92 = c9(messageObject2);
            if (c92 != null) {
                for (int i10 = 0; i10 < c92.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(c92.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            gg.n1 n1Var = this.M3;
            if (n1Var != null) {
                n1Var.l();
            }
            oc(true);
        }
    }

    public final void zb(boolean z10, boolean z11) {
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
                    yk ykVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ykVar, property, 0.1f);
                    yk ykVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ykVar2, property2, 0.1f);
                    yk ykVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ykVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
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
            yk ykVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ykVar4.setVisibility(i11);
            org.telegram.ui.Components.ia0 ia0Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            ia0Var.setVisibility(i12);
            yk ykVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            ykVar5.setScaleX(f11);
            org.telegram.ui.Components.ia0 ia0Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            ia0Var2.setScaleX(f12);
            yk ykVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            ykVar6.setScaleY(f13);
            org.telegram.ui.Components.ia0 ia0Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            ia0Var3.setScaleY(f16);
            yk ykVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ykVar7.setAlpha(f14);
            org.telegram.ui.Components.ia0 ia0Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            ia0Var4.setAlpha(f15);
        }
    }

    public final void zc() {
        boolean z10;
        boolean z11;
        if (this.f37303j1 == null) {
            return;
        }
        if (this.f37275g9 && !g9() && !this.Y.y0() && !this.Pa && (!this.f37416s3 || getMediaDataController().searchResultMessages.isEmpty())) {
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
            this.f37315k1 = false;
        } else {
            this.B7 = 0;
            this.f37307j6 = 0;
            z11 = true;
        }
        this.f37303j1.e(1, z10, z11);
    }

    @Override
    public final void O() {
    }

    public void aa(boolean z10) {
    }
}
