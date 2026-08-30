package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class c60 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, xd.b {
    public static c60 A3;
    public static boolean B3;
    public static boolean C3;
    public static boolean D3;
    public static volatile DispatchQueue E3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean F3;
    public final ArrayList A0;
    public p20 A1;
    public final w30 A2;
    public final Paint B;
    public final ArrayList B0;
    public org.telegram.ui.Components.t30 B1;
    public LinearLayout B2;
    public final g40 C;
    public final ArrayList C0;
    public int C1;
    public boolean C2;
    public final f40 D;
    public final ArrayList D0;
    public boolean D1;
    public final org.telegram.ui.Components.gj0 D2;
    public final d40 E;
    public final ArrayList E0;
    public boolean E1;
    public int E2;
    public final ImageView F;
    public int F0;
    public final Paint F1;
    public boolean F2;
    public final ImageView G;
    public final org.telegram.ui.Components.gj0 G0;
    public final Paint G1;
    public final View G2;
    public org.telegram.ui.Components.pk0 H;
    public final org.telegram.ui.Components.gj0 H0;
    public final b60[] H1;
    public final View H2;
    public final h50 I;
    public boolean I0;
    public float I1;
    public GradientDrawable I2;
    public final org.telegram.ui.Components.k6 J;
    public final org.telegram.ui.Components.u9 J0;
    public b60 J1;
    public final int[] J2;
    public final o30 K;
    public final org.telegram.ui.Components.u9 K0;
    public b60 K1;
    public final s30 K2;
    public final z40 L;
    public float L0;
    public long L1;
    public boolean L2;
    public final w50 M;
    public float M0;
    public float M1;
    public boolean M2;
    public final j50 N;
    public float N0;
    public float N1;
    public RenderNode N2;
    public final m40 O;
    public RadialGradient O0;
    public boolean O1;
    public float O2;
    public final TextView P;
    public final Matrix P0;
    public boolean P1;
    public boolean P2;
    public final k40 Q;
    public final Paint Q0;
    public int Q1;
    public final String[] Q2;
    public final org.telegram.ui.ActionBar.k5 R;
    public final r50 R0;
    public float R1;
    public ObjectAnimator R2;
    public final i50 S;
    public float S0;
    public int S1;
    public ObjectAnimator S2;
    public final org.telegram.ui.ActionBar.k5 T;
    public float T0;
    public boolean T1;
    public final s40 T2;
    public final q50 U;
    public ValueAnimator U0;
    public final int[] U1;
    public org.telegram.ui.Cells.e4 U2;
    public final org.telegram.ui.Components.oz V;
    public TLRPC.InputPeer V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.l V2;
    public final ImageReceiver W;
    public TLRPC.Chat W0;
    public final ArrayList W1;
    public org.telegram.ui.Components.voip.t W2;
    public int X;
    public ChatObject.Call X0;
    public final v30 X1;
    public org.telegram.ui.Components.s20 X2;
    public final ImageView Y;
    public final boolean Y0;
    public final a40 Y1;
    public boolean Y2;
    public final yg.h Z;
    public final String Z0;
    public final n40 Z1;
    public boolean Z2;
    public final int f33098a0;
    public final x50 f33099a1;
    public float a2;
    public int f33100a3;
    public final x30 f33101b;
    public final RadialProgressView f33102b0;
    public final n30 f33103b1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f33104b2;
    public AnimatorSet f33105b3;
    public final c30 f33106c;
    public final Drawable f33107c0;
    public final p30 f33108c1;
    public boolean f33109c2;
    public d50 c3;
    public final AccountInstance d;
    public final View f33110d0;
    public final Paint f33111d1;
    public boolean f33112d2;
    public int f33113d3;
    public final i30 e;
    public AnimatorSet f33114e0;
    public ValueAnimator f33115e1;
    public org.telegram.ui.Components.w40 f33116e2;
    public int f33117e3;
    public final org.telegram.ui.Components.voip.v2 f33118f;
    public LaunchActivity f33119f0;
    public float f33120f1;
    public k50 f33121f2;
    public int f33122f3;
    public final UndoView[] f33123g0;
    public final LinearLayout f33124g1;
    public Boolean f33125g2;
    public int f33126g3;
    public final org.telegram.ui.Components.voip.v2 h;
    public final org.telegram.ui.Cells.k f33127h0;
    public final org.telegram.ui.ActionBar.w0 f33128h1;
    public int f33129h2;
    public int f33130h3;
    public boolean f33131i0;
    public final org.telegram.ui.ActionBar.w0 f33132i1;
    public boolean f33133i2;
    public int f33134i3;
    public org.telegram.ui.Components.k40 f33135j0;
    public final org.telegram.ui.ActionBar.w0 f33136j1;
    public final r30 f33137j2;
    public int f33138j3;
    public org.telegram.ui.Components.k40 f33139k0;
    public final org.telegram.ui.ActionBar.g1 f33140k1;
    public final org.telegram.ui.Components.sl0 f33141k2;
    public int f33142k3;
    public int f33143l0;
    public final org.telegram.ui.ActionBar.g1 l1;
    public final i60 f33144l2;
    public int f33145l3;
    public n50 m0;
    public final org.telegram.ui.ActionBar.g1 f33146m1;
    public final org.telegram.ui.Components.t20 f33147m2;
    public int f33148m3;
    public final org.telegram.ui.Components.voip.v2 f33149n;
    public final ArrayList f33150n0;
    public final org.telegram.ui.ActionBar.g1 f33151n1;
    public ViewTreeObserver.OnPreDrawListener f33152n2;
    public int f33153n3;
    public y40 f33154o0;
    public final org.telegram.ui.ActionBar.g1 f33155o1;
    public final org.telegram.ui.Components.voip.h f33156o2;
    public int f33157o3;
    public boolean f33158p0;
    public final org.telegram.ui.ActionBar.g1 f33159p1;
    public boolean f33160p2;
    public int f33161p3;
    public long f33162q0;
    public final org.telegram.ui.ActionBar.g1 f33163q1;
    public final ArrayList f33164q2;
    public int f33165q3;
    public final org.telegram.ui.Components.voip.v2 f33166r;
    public boolean f33167r0;
    public final org.telegram.ui.ActionBar.g1 f33168r1;
    public boolean f33169r2;
    public int f33170r3;
    public final org.telegram.ui.Components.voip.v2 f33171s;
    public final RectF f33172s0;
    public final org.telegram.ui.ActionBar.g1 f33173s1;
    public final p20 f33174s2;
    public int f33175s3;
    public boolean f33176t0;
    public final org.telegram.ui.ActionBar.g1 f33177t1;
    public final m30 f33178t2;
    public final e50 f33179t3;
    public boolean f33180u0;
    public final org.telegram.ui.ActionBar.g1 f33181u1;
    public final org.telegram.ui.Components.mc f33182u2;
    public Boolean f33183u3;
    public final org.telegram.ui.Components.voip.v2 v;
    public float f33184v0;
    public final org.telegram.ui.ActionBar.g1 f33185v1;
    public final p20 f33186v2;
    public Integer f33187v3;
    public final org.telegram.ui.Components.voip.v2 f33188w;
    public p40 f33189w0;
    public final LinearLayout f33190w1;
    public boolean f33191w2;
    public final xd.a f33192w3;
    public final j30 f33193x;
    public TLRPC.Peer f33194x0;
    public final TextView f33195x1;
    public final z5 f33196x2;
    public final xd.a f33197x3;
    public final ImageView f33198y;
    public TLObject f33199y0;
    public final a60 f33200y1;
    public final LongSparseIntArray f33201y2;
    public final xd.c f33202y3;
    public final Paint f33203z0;
    public final ch.i f33204z1;
    public final y30 f33205z2;
    public final xd.a f33206z3;

    public c60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z4, String str) {
        super(launchActivity, null, true, true);
        String string;
        int i10;
        c60 c60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.B = new Paint(1);
        this.f33123g0 = new UndoView[2];
        this.f33150n0 = new ArrayList();
        this.f33172s0 = new RectF();
        this.f33203z0 = new Paint(1);
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.f33204z1 = new ch.i(new p20(this, 8));
        this.C1 = 0;
        this.D1 = false;
        this.F1 = new Paint(7);
        this.G1 = new Paint(7);
        this.H1 = new b60[8];
        this.I1 = 1.0f;
        this.T1 = true;
        this.U1 = new int[4];
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.f33156o2 = new org.telegram.ui.Components.voip.h();
        this.f33164q2 = new ArrayList();
        this.f33174s2 = new p20(this, 0);
        this.f33178t2 = new m30(this);
        this.f33182u2 = new org.telegram.ui.Components.mc(20);
        this.f33186v2 = new p20(this, 1);
        this.f33191w2 = false;
        this.f33196x2 = new z5(this, 6);
        this.f33201y2 = new LongSparseIntArray();
        this.J2 = new int[2];
        this.M2 = true;
        this.Q2 = new String[2];
        this.f33100a3 = -1;
        this.f33179t3 = new e50(this);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
        this.f33192w3 = new xd.a(2, this, nrVar, 350L);
        this.f33197x3 = new xd.a(3, this, nrVar, 220L, true);
        this.f33202y3 = new xd.c(4, this, nrVar, 350L);
        this.f33206z3 = new xd.a(5, this, nrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.X0 = call;
        this.V0 = inputPeer;
        this.W0 = chat;
        this.Z0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.Y0 = z4;
        this.resourcesProvider = new nh.i0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f33098a0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        D3 = false;
        C3 = false;
        F3 = false;
        setDelegate(new h40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.T2 = new s40(this);
        setOnDismissListener(new s20(this, 0));
        setDimBehindAlpha(75);
        w50 w50Var = new w50(this, launchActivity);
        this.M = w50Var;
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(true);
        int i11 = org.telegram.ui.ActionBar.j6.f20149qg;
        ppVar.b(org.telegram.ui.ActionBar.j6.u0(i11));
        ppVar.d();
        z40 z40Var = new z40(this, launchActivity, ppVar);
        this.L = z40Var;
        z40Var.setSubtitle("");
        z40Var.getSubtitleTextView().setVisibility(0);
        z40Var.l();
        z40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(z40Var.getAdditionalSubtitleTextView(), this.f33169r2, 1.0f, false);
        z40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20059lg;
        z40Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        z40Var.setBackButtonImage(R.drawable.ic_ab_back);
        z40Var.setOccupyStatusBar(false);
        z40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.j6.f19987hg;
        z40Var.C(org.telegram.ui.ActionBar.j6.u0(i13), false);
        z40Var.B(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f20300z8), false);
        z40Var.setTitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        z40Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        z40Var.setActionBarMenuOnItemClick(new g50(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f33194x0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f33194x0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f33194x0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f33194x0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new m20(this, 3);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.f33107c0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i14 = R.raw.voip_filled;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(i14, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.G0 = gj0Var;
        int i15 = R.raw.hand_2;
        this.H0 = new org.telegram.ui.Components.gj0(i15, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        h50 h50Var = new h50(this, launchActivity);
        this.I = h50Var;
        this.containerView = h50Var;
        h50Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.W = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.R = k5Var;
            k5Var.setGravity(17);
            k5Var.setTextColor(-1);
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.setTextSize(18);
            k5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(k5Var, k7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            i50 i50Var = new i50(this, launchActivity);
            this.S = i50Var;
            i50Var.setGravity(17);
            i50Var.setTextColor(-1);
            i50Var.setTypeface(AndroidUtilities.bold());
            i50Var.setTextSize(60);
            this.containerView.addView(i50Var, k7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.T = k5Var2;
            k5Var2.setGravity(17);
            k5Var2.setTextColor(-1);
            k5Var2.setTypeface(AndroidUtilities.bold());
            k5Var2.setTextSize(18);
            this.containerView.addView(k5Var2, k7.b6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            r50 r50Var = new r50(this, launchActivity);
            this.R0 = r50Var;
            this.containerView.addView(r50Var, k7.b6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        j50 j50Var = new j50(this, launchActivity);
        this.N = j50Var;
        j50Var.setClipToPadding(false);
        j50Var.setClipChildren(false);
        q50 q50Var = new q50(this);
        this.U = q50Var;
        q50Var.f5773o = nrVar;
        q50Var.d = 350L;
        q50Var.f5837c = 350L;
        q50Var.e = 350L;
        q50Var.S();
        j50Var.setItemAnimator(q50Var);
        j50Var.setOnScrollListener(new b30(this));
        j50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(C3 ? 6 : 2, j50Var);
        this.V = ozVar;
        j50Var.setLayoutManager(ozVar);
        c30 c30Var = new c30(this);
        this.f33106c = c30Var;
        ozVar.z1(c30Var);
        j50Var.i(new d30(this));
        ozVar.C1();
        this.containerView.addView(j50Var, k7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        j50Var.setAdapter(w50Var);
        j50Var.setTopBottomSelectorRadius(13);
        j50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f19933eg));
        j50Var.setOnItemClickListener(new d7(this, launchActivity, call, 14));
        j50Var.setOnItemLongClickListener(new m20(this, 4));
        if (r1()) {
            a60 a60Var = new a60(this, getContext());
            this.f33200y1 = a60Var;
            this.containerView.addView(a60Var, k7.b6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(launchActivity);
        this.f33141k2 = sl0Var;
        this.containerView.addView(sl0Var, k7.b6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        i60 i60Var = new i60(call, this.currentAccount, this);
        this.f33144l2 = i60Var;
        sl0Var.setAdapter(i60Var);
        f2.w wVar = new f2.w(6, false);
        sl0Var.setLayoutManager(wVar);
        wVar.z1(new f30(this));
        sl0Var.setOnItemClickListener(new org.telegram.ui.Components.il0(this) {
            public final c60 f36776b;

            {
                this.f36776b = this;
            }

            @Override
            public final void f(int i17, View view) {
                switch (r2) {
                    case 0:
                        c60 c60Var2 = this.f36776b;
                        c60Var2.getClass();
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
                        if (s20Var.getVideoParticipant() == null) {
                            c60Var2.e1(new ChatObject.VideoParticipant(s20Var.getParticipant(), false, false));
                            return;
                        } else {
                            c60Var2.e1(s20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        c60 c60Var3 = this.f36776b;
                        c60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            c60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        f2.l lVar = new f2.l();
        lVar.S();
        lVar.f5773o = nrVar;
        lVar.d = 350L;
        lVar.f5837c = 350L;
        lVar.e = 350L;
        sl0Var.setItemAnimator(new g30(this));
        sl0Var.setOnScrollListener(new h30(this));
        i60Var.H(sl0Var, false, false);
        sl0Var.setVisibility(8);
        i30 i30Var = new i30(this, launchActivity);
        this.e = i30Var;
        int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.P0 = new Matrix();
        this.O0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.Q0 = paint;
        paint.setShader(this.O0);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(9);
        this.J0 = u9Var;
        org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(12);
        this.K0 = u9Var2;
        u9Var.f29131a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        u9Var.f29132b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        u9Var.b();
        u9Var2.f29131a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        u9Var2.f29132b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        u9Var2.b();
        int i17 = org.telegram.ui.ActionBar.j6.Ig;
        u9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i17), 38));
        u9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i17), 76));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f33166r = v2Var;
        v2Var.setCheckable(true);
        v2Var.setTextSize(12);
        i30Var.a(v2Var);
        v2Var.setOnClickListener(new n20(this, 7));
        org.telegram.ui.Components.voip.v2 v2Var2 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f33149n = v2Var2;
        v2Var2.setCheckable(true);
        v2Var2.setTextSize(12);
        v2Var2.d(false, false);
        v2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        v2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.v2 v2Var3 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f33118f = v2Var3;
        v2Var3.setCheckable(true);
        v2Var3.setTextSize(12);
        v2Var3.d(false, false);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(launchActivity);
        v2Var3.addView(jj0Var, k7.b6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        int i18 = R.raw.camera_flip;
        org.telegram.ui.Components.gj0 gj0Var2 = new org.telegram.ui.Components.gj0(i18, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.D2 = gj0Var2;
        jj0Var.setAnimation(gj0Var2);
        v2Var3.setOnClickListener(new n20(this, 10));
        i30Var.a(v2Var3);
        org.telegram.ui.Components.voip.v2 v2Var4 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.h = v2Var4;
        v2Var4.setCheckable(true);
        v2Var4.setTextSize(12);
        v2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.Y = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i19 = R.drawable.filled_sound_on;
        this.X = i19;
        imageView.setImageResource(i19);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        v2Var4.addView(imageView, k7.b6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        v2Var4.setOnClickListener(new n20(this, 11));
        i30Var.a(v2Var4);
        i30Var.a(v2Var2);
        org.telegram.ui.Components.voip.v2 v2Var5 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f33171s = v2Var5;
        v2Var5.setTextSize(12);
        v2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        v2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final c60 f37906b;

            {
                this.f37906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        c60.o(this.f37906b, launchActivity);
                        return;
                    default:
                        c60 c60Var2 = this.f37906b;
                        c60Var2.X1.e();
                        ChatObject.Call call2 = c60Var2.X0;
                        if (call2 != null && !call2.isScheduled()) {
                            c60Var2.I1();
                            c60.t1(launchActivity, new p20(c60Var2, 5), false, false);
                            return;
                        }
                        c60Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.v2 v2Var6 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.v = v2Var6;
        v2Var6.setCheckable(true);
        v2Var6.b(true, false);
        v2Var6.setTextSize(12);
        v2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        j30 j30Var = new j30(this, launchActivity);
        this.f33193x = j30Var;
        j30Var.setAnimation(gj0Var);
        j30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.v2 v2Var7 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f33188w = v2Var7;
        v2Var7.setDrawBackground(false);
        v2Var7.setTextSize(12);
        v2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        v2Var7.addView(j30Var, k7.b6.e(50, 50, 49));
        i30Var.a(v2Var7);
        v2Var7.setOnClickListener(new l30(this));
        i30Var.a(v2Var6);
        i30Var.a(v2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f33198y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        v2Var7.addView(imageView2, k7.b6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.X0 != null && r1() && !this.X0.isScheduled()) {
            imageView2.setVisibility(0);
            j30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f33102b0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Og));
        z40Var.setAlpha(0.0f);
        z40Var.getBackButton().setScaleX(0.9f);
        z40Var.getBackButton().setScaleY(0.9f);
        z40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        z40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        z40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        z40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i13));
        this.f33128h1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new m20(this, 0));
        int i20 = org.telegram.ui.ActionBar.j6.f20004ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i20), 6));
        w0Var.setOnClickListener(new n20(this, 0));
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i13), false);
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i13), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i13));
        this.f33132i1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i20), 6));
        w0Var2.setOnClickListener(new n20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i13));
        this.f33136j1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i20), 6));
        w0Var3.setOnClickListener(new n20(this, 2));
        n30 n30Var = new n30(this, launchActivity, launchActivity);
        this.f33103b1 = n30Var;
        o30 o30Var = new o30(launchActivity);
        this.K = o30Var;
        o30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f33111d1 = paint2;
        paint2.setColor(-12761513);
        p30 p30Var = new p30(this, getContext());
        this.f33108c1 = p30Var;
        p30Var.setTextColor(getThemedColor(i13));
        p30Var.setTextSize(1, 11.0f);
        p30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        p30Var.setMaxLines(1);
        p30Var.setGravity(17);
        p30Var.setTypeface(AndroidUtilities.bold());
        p30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        p30Var.setTag(-1);
        if (!r1()) {
            p30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f33124g1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(n30Var, k7.b6.l(1.0f, 0, -2));
        linearLayout.addView(p30Var, k7.b6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(o30Var, k7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, k7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(z40Var, k7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f33190w1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, k7.b6.n(48, 48));
        linearLayout2.addView(w0Var2, k7.b6.n(48, 48));
        linearLayout2.addView(w0Var, k7.b6.n(48, 48));
        this.containerView.addView(linearLayout2, k7.b6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f33110d0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.V5));
        this.containerView.addView(view, k7.b6.c(1.0f, -1));
        for (int i21 = 0; i21 < 2; i21++) {
            this.f33123g0[i21] = new q30(this, launchActivity);
            this.f33123g0[i21].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f33123g0[i21].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f33123g0[i21], k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f33127h0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f33128h1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f33128h1.setShowSubmenuByMove(false);
        int i22 = org.telegram.ui.ActionBar.j6.f19933eg;
        kVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.u0(i22), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.f20660j0);
        this.f33168r1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.f20660j0);
        this.f33173s1 = d10;
        d10.j(false, true);
        int i23 = org.telegram.ui.ActionBar.j6.f20254wg;
        d.setCheckColor(i23);
        d.c(org.telegram.ui.ActionBar.j6.u0(i23), org.telegram.ui.ActionBar.j6.u0(i23));
        d10.setCheckColor(i23);
        d10.c(org.telegram.ui.ActionBar.j6.u0(i23), org.telegram.ui.ActionBar.j6.u0(i23));
        Paint paint3 = new Paint(1);
        int i24 = org.telegram.ui.ActionBar.j6.f19987hg;
        paint3.setColor(org.telegram.ui.ActionBar.j6.u0(i24));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.f20660j0);
        this.f33146m1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.f20660j0);
        this.f33151n1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f33128h1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f19970gg), -16777216));
        this.f33195x1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.f33099a1, LocaleController.getString(ChatObject.isChannelOrGiga(this.W0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.f20660j0);
        this.l1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.f33099a1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.f20660j0);
        this.f33155o1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.f33128h1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f33140k1 = e;
        x50 x50Var = new x50();
        this.f33099a1 = x50Var;
        org.telegram.ui.ActionBar.g1 e6 = this.f33128h1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f33163q1 = e6;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f33128h1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, x50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.f20660j0);
        this.f33159p1 = d15;
        x50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e10 = this.f33128h1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f33181u1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e11 = this.f33128h1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f33185v1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.f33128h1;
        int i25 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i24;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.W0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i24;
        }
        org.telegram.ui.ActionBar.g1 e12 = w0Var11.e(4, i25, string);
        this.f33177t1 = e12;
        this.f33128h1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.u0(i22));
        this.f33128h1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        int i26 = org.telegram.ui.ActionBar.j6.f20235vg;
        e12.c(org.telegram.ui.ActionBar.j6.u0(i26), org.telegram.ui.ActionBar.j6.u0(i26));
        e.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        e6.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        if (this.X0 != null) {
            l1();
        }
        if (o1()) {
            this.m0 = new n50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.m0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.L.getTitleTextView().setOnClickListener(new n20(this, 3));
        r30 r30Var = new r30(this, launchActivity);
        this.f33137j2 = r30Var;
        s30 s30Var = new s30(this);
        this.K2 = s30Var;
        r30Var.setClipToPadding(false);
        s30Var.S();
        s30Var.f5773o = org.telegram.ui.Components.nr.f27346f;
        s30Var.d = 350L;
        s30Var.f5837c = 350L;
        s30Var.e = 350L;
        r30Var.setItemAnimator(s30Var);
        r30Var.setOnScrollListener(new t30(this));
        r30Var.setClipChildren(false);
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        r30Var.setLayoutManager(i0Var);
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(call, this.currentAccount, this);
        this.f33147m2 = t20Var;
        r30Var.setAdapter(t20Var);
        t20Var.F(r30Var, false);
        r30Var.setOnItemClickListener(new org.telegram.ui.Components.il0(this) {
            public final c60 f36776b;

            {
                this.f36776b = this;
            }

            @Override
            public final void f(int i172, View view2) {
                switch (r2) {
                    case 0:
                        c60 c60Var2 = this.f36776b;
                        c60Var2.getClass();
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view2;
                        if (s20Var.getVideoParticipant() == null) {
                            c60Var2.e1(new ChatObject.VideoParticipant(s20Var.getParticipant(), false, false));
                            return;
                        } else {
                            c60Var2.e1(s20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        c60 c60Var3 = this.f36776b;
                        c60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            c60Var3.e1(lVar2.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        r30Var.setOnItemLongClickListener(new m20(this, 1));
        r30Var.setVisibility(8);
        r30Var.i(new u30());
        v30 v30Var = new v30(this, launchActivity, this.N, r30Var, this.V1, this.X0, this);
        this.X1 = v30Var;
        v30Var.setClipChildren(false);
        t20Var.E(this.V1, v30Var);
        if (this.f33141k2 != null) {
            this.f33144l2.G(this.V1, v30Var);
        }
        w30 w30Var = new w30(this, launchActivity);
        this.A2 = w30Var;
        x30 x30Var = new x30(this, launchActivity, this.L, this.N, w30Var);
        this.f33101b = x30Var;
        x30Var.setImagesLayerNum(Integer.MAX_VALUE);
        x30Var.setInvalidateWithParent(true);
        w30Var.setProfileGalleryView(x30Var);
        y30 y30Var = new y30(this, launchActivity);
        this.f33205z2 = y30Var;
        y30Var.setVisibility(8);
        x30Var.setVisibility(0);
        x30Var.b(new z30(this));
        a40 a40Var = new a40(this, launchActivity);
        this.Y1 = a40Var;
        this.containerView.addView(v30Var);
        v30Var.addView(r30Var, k7.b6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.G2 = view2;
        int[] iArr = this.J2;
        iArr[0] = this.S1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.J2);
        this.I2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, k7.b6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.H2 = view3;
        view3.setBackgroundColor(this.J2[0]);
        this.containerView.addView(view3, k7.b6.e(-1, 0, 83));
        yg.h hVar = new yg.h(launchActivity);
        this.Z = hVar;
        hVar.setDelegate(new b40(this));
        hVar.setClickCellDelegate(new c40(this));
        if (this.X0 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.X0.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(launchActivity, false, true, true);
        this.J = k6Var;
        k6Var.setGravity(17);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(-1);
        k6Var.b(0.4f, 320L, org.telegram.ui.Components.nr.h);
        k6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        d40 d40Var = new d40(this, launchActivity, this.I, LaunchActivity.R(), this.resourcesProvider);
        this.E = d40Var;
        d40Var.G = true;
        d40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f33098a0)});
        d40Var.getEditText().setLinkTextColor(-11683585);
        d40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        d40Var.getEditText().addTextChangedListener(new e40(this));
        d40Var.s();
        f40 f40Var = new f40(this, launchActivity);
        this.D = f40Var;
        this.containerView.addView(f40Var, k7.b6.c(-1.0f, -1));
        g40 g40Var = new g40(launchActivity);
        this.C = g40Var;
        g40Var.addView(d40Var, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        g40Var.addView(k6Var, k7.b6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        k6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(g40Var, k7.b6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.G = imageView3;
        int i27 = org.telegram.ui.ActionBar.j6.f19996i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i27), 1, -1));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19943f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new n20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.F = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i27), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new n20(this, 5));
        g40Var.addView(imageView3, k7.b6.e(48, 48, 85));
        g40Var.addView(imageView4, k7.b6.e(48, 48, 85));
        this.containerView.addView(a40Var);
        y30Var.addView(x30Var, k7.b6.c(-1.0f, -1));
        y30Var.addView(w30Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(y30Var, k7.b6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.M.l();
        if (D3) {
            this.f33144l2.I(this.f33141k2, false);
        }
        this.F0 = this.M.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.P = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.W0) && (chat2 = this.W0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, k7.b6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0(launchActivity);
            wc0Var.setTextColor(-1);
            wc0Var.setSelectorColor(-9598483);
            wc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            wc0Var.setItemCount(5);
            i40 i40Var = new i40(launchActivity);
            i40Var.setItemCount(5);
            i40Var.setTextColor(-1);
            i40Var.setSelectorColor(-9598483);
            i40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            j40 j40Var = new j40(launchActivity);
            j40Var.setItemCount(5);
            j40Var.setTextColor(-1);
            j40Var.setSelectorColor(-9598483);
            j40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            k40 k40Var = new k40(launchActivity);
            this.Q = k40Var;
            k40Var.setLines(1);
            k40Var.setSingleLine(true);
            k40Var.setEllipsize(TextUtils.TruncateAt.END);
            k40Var.setGravity(17);
            k40Var.setTextColor(-1);
            k40Var.setTypeface(AndroidUtilities.bold());
            k40Var.setTextSize(1, 14.0f);
            this.containerView.addView(k40Var, k7.b6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            k40Var.setOnClickListener(new org.telegram.messenger.video.f(this, wc0Var, i40Var, j40Var, chat, accountInstance, inputPeer2, 1));
            m40 m40Var = new m40(launchActivity, wc0Var, i40Var, j40Var);
            this.O = m40Var;
            m40Var.setWeightSum(1.0f);
            m40Var.setOrientation(0);
            this.containerView.addView(m40Var, k7.b6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i28 = calendar.get(1);
            int i29 = calendar.get(6);
            m40Var.addView(wc0Var, k7.b6.l(0.5f, 0, 270));
            wc0Var.setMinValue(0);
            wc0Var.setMaxValue(365);
            wc0Var.setWrapSelectorWheel(false);
            wc0Var.setFormatter(new gg.c(currentTimeMillis, calendar, i28, 1));
            a1.d dVar = new a1.d(this, wc0Var, i40Var, j40Var, 12);
            c60Var = this;
            wc0Var.setOnValueChangedListener(dVar);
            i40Var.setMinValue(0);
            i40Var.setMaxValue(23);
            m40Var.addView(i40Var, k7.b6.l(0.2f, 0, 270));
            i40Var.setFormatter(new org.telegram.ui.Components.kh0(22));
            i40Var.setOnValueChangedListener(dVar);
            j40Var.setMinValue(0);
            j40Var.setMaxValue(59);
            j40Var.setValue(0);
            j40Var.setFormatter(new org.telegram.ui.Components.kh0(23));
            m40Var.addView(j40Var, k7.b6.l(0.3f, 0, 270));
            j40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i30 = calendar.get(6);
            int i31 = calendar.get(12);
            int i32 = calendar.get(11);
            wc0Var.setValue(i29 != i30 ? 1 : 0);
            j40Var.setValue(i31);
            i40Var.setValue(i32);
            org.telegram.ui.Components.z4.g(k40Var, textView, 0L, 604800L, 2, wc0Var, i40Var, j40Var);
        } else {
            c60Var = this;
        }
        n40 n40Var = new n40(c60Var, (ViewGroup) c60Var.getWindow().getDecorView(), c60Var.containerView);
        c60Var.Z1 = n40Var;
        n40Var.E = new o40(c60Var);
        x30Var.setPinchToZoomHelper(n40Var);
        c60Var.f33149n.setOnClickListener(new View.OnClickListener(c60Var) {
            public final c60 f37906b;

            {
                this.f37906b = c60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        c60.o(this.f37906b, launchActivity);
                        return;
                    default:
                        c60 c60Var2 = this.f37906b;
                        c60Var2.X1.e();
                        ChatObject.Call call2 = c60Var2.X0;
                        if (call2 != null && !call2.isScheduled()) {
                            c60Var2.I1();
                            c60.t1(launchActivity, new p20(c60Var2, 5), false, false);
                            return;
                        }
                        c60Var2.dismiss();
                        return;
                }
            }
        });
        c60Var.L1(false);
        c60Var.I1();
        c60Var.M1(false);
        c60Var.N1(false, false);
        c60Var.B1(0.0f);
        c60Var.O1();
        c60Var.containerView.addView(new FrameLayout(launchActivity), k7.b6.e(-1, 200, 87));
        c60Var.v.setOnClickListener(new n20(c60Var, 6));
        c60Var.T0();
        k7.d6.a(c60Var.f33149n);
        k7.d6.a(c60Var.f33166r);
        k7.d6.a(c60Var.f33118f);
        k7.d6.a(c60Var.h);
        k7.d6.a(c60Var.f33188w);
        k7.d6.a(c60Var.f33171s);
        k7.d6.a(c60Var.v);
        r0.j0.m(c60Var.containerView, new m20(c60Var, 2));
    }

    public static r0.m1 A(c60 c60Var, r0.m1 m1Var) {
        int keyboardHeight;
        r0.j1 j1Var = m1Var.f43130a;
        i0.b f10 = j1Var.f(647);
        i0.b f11 = j1Var.f(8);
        d40 d40Var = c60Var.E;
        if (!d40Var.K && !d40Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = d40Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = c60Var.Y1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (d40Var.getEmojiView() != null) {
            d40Var.getEmojiView().setBottomInset(f10.d);
        }
        if (c60Var.P2) {
            ViewGroup viewGroup = c60Var.containerView;
            int i10 = c60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = c60Var.containerView;
            int i11 = c60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f10.f7213a + i11, f10.f7214b, i11 + f10.f7215c, f10.d);
        }
        c60Var.containerView.requestLayout();
        if (max == 0 && !d40Var.K && !d40Var.e && !d40Var.L) {
            d40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.pk0 pk0Var = c60Var.H;
            if (pk0Var == null) {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                pk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.pk0 pk0Var2 = new org.telegram.ui.Components.pk0(1, c60Var.currentAccount, c60Var.getContext(), R, c60Var.resourcesProvider);
                    c60Var.H = pk0Var2;
                    pk0Var2.setDelegate(new f50(c60Var));
                    c60Var.containerView.addView(c60Var.H, k7.b6.e(-2, 52, 81));
                    c60Var.H.p(null, null, false);
                    c60Var.D.bringToFront();
                    c60Var.C.bringToFront();
                    pk0Var = c60Var.H;
                }
            }
            c60Var.H = pk0Var;
        }
        d40Var.G(f11.d, false);
        c60Var.f33204z1.i(m1Var);
        return r0.m1.f43129b;
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(c60 c60Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z4;
        TLRPC.GroupCall groupCall;
        d2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = c60Var.getContext();
            int i10 = c60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.f6 f6Var = c60Var.resourcesProvider;
            ChatObject.Call call = c60Var.X0;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z4 = true;
            } else {
                z4 = false;
            }
            l9.o0(context, i10, inputGroupCall, str, f6Var, false, z4);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.qc(c60Var.topBulletinContainer, new nh.i0()).d0(tL_error, false);
        }
    }

    public static void B0(c60 c60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (c60Var.f33139k0 == null) {
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(c60Var.getContext(), 8);
            c60Var.f33139k0 = k40Var;
            k40Var.setAlpha(0.0f);
            c60Var.f33139k0.setVisibility(4);
            c60Var.f33139k0.setShowingDuration(4000L);
            c60Var.containerView.addView(c60Var.f33139k0, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            c60Var.f33139k0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            c60Var.f33139k0.d();
        }
        c60Var.f33139k0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        c60Var.f33139k0.f(c60Var.f33188w, true);
    }

    public static void C(c60 c60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        f2.l1 K;
        r30 r30Var = c60Var.f33137j2;
        v30 v30Var = c60Var.X1;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = c60Var.X0.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!v30Var.f29713b) {
                    if (c60Var.f33158p0) {
                        arrayList = c60Var.A0;
                    } else {
                        arrayList = c60Var.X0.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = c60Var.N.K(indexOf + c60Var.M.d)) != null) {
                        View view = K.f5785a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == c60Var.U2 && !c60Var.f33133i2) {
                                c60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < r30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(s20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            s20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                v30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void D(c60 c60Var) {
        Editable text = c60Var.E.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(c60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        c60Var.A1(tL_textWithEntities);
    }

    public static void F0(c60 c60Var) {
        ChatObject.Call call = c60Var.X0;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = c60Var.X0.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(c60Var.X0.call.join_muted);
            ConnectionsManager connectionsManager = c60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new y20(c60Var, 1));
        }
    }

    public static void G0(c60 c60Var, boolean z4) {
        if (c60Var.X0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = c60Var.X0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z4);
        c60Var.f33183u3 = Boolean.valueOf(z4);
        c60Var.H1(true);
        ConnectionsManager connectionsManager = c60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new y20(c60Var, 0));
    }

    public static void H0(c60 c60Var) {
        boolean z4;
        int i10;
        if (c60Var.r1()) {
            v30 v30Var = c60Var.X1;
            if (!v30Var.S && v30Var.f29713b && (C3 == c60Var.q1() || AndroidUtilities.isTablet())) {
                z4 = false;
            } else {
                z4 = true;
            }
            Boolean bool = c60Var.f33125g2;
            if (bool != null && z4 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = c60Var.containerView.getSystemUiVisibility();
            if (z4) {
                i10 = systemUiVisibility & (-7);
                c60Var.getWindow().clearFlags(1024);
                c60Var.setHideSystemVerticalInsets(false);
            } else {
                c60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                c60Var.getWindow().addFlags(1024);
            }
            c60Var.containerView.setSystemUiVisibility(i10);
            c60Var.f33125g2 = Boolean.valueOf(z4);
            c60Var.P2 = !z4;
            c60Var.containerView.requestApplyInsets();
            return;
        }
        c60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(c60 c60Var) {
        j50 j50Var = c60Var.N;
        for (int i10 = 0; i10 < j50Var.getChildCount(); i10++) {
            View childAt = j50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(c60 c60Var) {
        boolean z4;
        Integer num;
        boolean z10;
        float f10;
        float f11;
        float dp;
        float dp2;
        float dp3;
        float f12;
        float f13;
        float f14;
        boolean z11;
        View childAt;
        z40 z40Var = c60Var.L;
        j50 j50Var = c60Var.N;
        int childCount = j50Var.getChildCount();
        float f15 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(j50Var.getChildAt(i10)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = j50Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        float dp4 = f15 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z4 && z40Var.getTag() == null) || (!z4 && z40Var.getTag() != null)) {
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            z40Var.setTag(num);
            AnimatorSet animatorSet = c60Var.f33114e0;
            if (animatorSet != null) {
                animatorSet.cancel();
                c60Var.f33114e0 = null;
            }
            if (z40Var.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            c60Var.setUseLightStatusBar(z10);
            ViewPropertyAnimator animate = z40Var.getBackButton().animate();
            float f16 = 0.9f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z4) {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
            duration.setInterpolator(nrVar).start();
            ViewPropertyAnimator animate2 = z40Var.getTitleTextView().animate();
            if (z4) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(nrVar).start();
            ObjectAnimator objectAnimator = c60Var.R2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                c60Var.R2.cancel();
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = z40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = z40Var.getSubtitleTextView().getTranslationY();
            if (z4) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            c60Var.R2 = ofFloat;
            ofFloat.setDuration(300L);
            c60Var.R2.setInterpolator(nrVar);
            c60Var.R2.addListener(new org.telegram.ui.Components.l00(21, c60Var, z4));
            c60Var.R2.start();
            ObjectAnimator objectAnimator2 = c60Var.S2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.k5 additionalSubtitleTextView = z40Var.getAdditionalSubtitleTextView();
            if (z4) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            c60Var.S2 = ofFloat2;
            ofFloat2.setDuration(300L);
            c60Var.S2.setInterpolator(nrVar);
            c60Var.S2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            c60Var.f33114e0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = c60Var.f33114e0;
            Property property2 = View.ALPHA;
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z40Var, property2, f12);
            o30 o30Var = c60Var.K;
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o30Var, property2, f13);
            View view = c60Var.f33110d0;
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            c60Var.f33114e0.addListener(new x40(c60Var, 1));
            c60Var.f33114e0.start();
            ImageView imageView = c60Var.X1.v;
            if (z4 && !C3) {
                z11 = false;
            } else {
                z11 = true;
            }
            imageView.setClickable(z11);
        }
        if (c60Var.f33184v0 != dp4) {
            c60Var.E1(dp4);
        }
    }

    public static void N(c60 c60Var, org.telegram.ui.Components.voip.l lVar, boolean z4) {
        if (!c60Var.isDismissed()) {
            if (z4 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(c60Var.V1, c60Var.X1, lVar, null, null, lVar.getParticipant(), c60Var.X0, c60Var));
            } else if (!z4 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(c60 c60Var, int i10, int[] iArr) {
        if (c60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20305zg, false), c60Var.R1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20041kg, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), c60Var.R1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20291yg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20305zg, false), c60Var.R1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Cg, false), c60Var.R1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20042kh, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20060lh, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20077mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ng, false), c60Var.R1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20041kg, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false), c60Var.R1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20005ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20042kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z4, String str) {
        if (A3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    A3 = new c60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f19184id, false), chat, inputPeer, z4, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        A3 = new c60(launchActivity, accountInstance, call, chat2, null, z4, str);
                    } else {
                        return;
                    }
                }
                A3.f33119f0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(19));
            }
        }
    }

    public static String f1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioRoutingHeadset);
            } else {
                return LocaleController.getString(R.string.VoipAudioRoutingPhone);
            }
        }
        return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
    }

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth);
        } else if (i10 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioSwitchedToHeadset);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToPhone);
        } else {
            return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
        }
    }

    public static void m(c60 c60Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(declineconferencecallinvite, new w20(c60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(c60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = c60Var.X0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            c60Var.X0.invitedUsersMap.remove(l10);
            c60Var.X0.invitedUsersMessageIds.remove(l10);
            c60Var.O0(true);
        }
    }

    public static void n(c60 c60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = c60Var.d;
        ArrayList arrayList = c60Var.C0;
        w50 w50Var = c60Var.M;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            c60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            c60Var.F1((org.telegram.ui.Cells.e4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l10 = null;
            boolean z4 = true;
            if (view instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (v3Var.getUser() != null) {
                    if (c60Var.o1()) {
                        int i11 = i10 - w50Var.f39333n;
                        if (i11 >= 0 && i11 < c60Var.X0.shadyJoinParticipants.size()) {
                            l10 = c60Var.X0.shadyJoinParticipants.get(i10 - w50Var.f39333n);
                        } else {
                            int i12 = i10 - w50Var.f39335s;
                            if (i12 >= 0 && i12 < c60Var.X0.shadyLeftParticipants.size()) {
                                l10 = c60Var.X0.shadyLeftParticipants.get(i10 - w50Var.f39335s);
                            } else {
                                int i13 = i10 - w50Var.f39332f;
                                if (c60Var.f33158p0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < c60Var.X0.invitedUsers.size()) {
                                    l10 = c60Var.X0.invitedUsers.get(i13);
                                }
                                z4 = false;
                            }
                        }
                        if (!z4 && (invitedUser = c60Var.X0.invitedUsersMessageIds.get(l10)) != null) {
                            org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(c60Var.container, c60Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(c60Var) {
                                public final c60 f38827b;

                                {
                                    this.f38827b = c60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            c60.r(this.f38827b, invitedUser, l10);
                                            return;
                                        default:
                                            c60.m(this.f38827b, invitedUser, l10);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(c60Var) {
                                public final c60 f38827b;

                                {
                                    this.f38827b = c60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            c60.r(this.f38827b, invitedUser, l10);
                                            return;
                                        default:
                                            c60.m(this.f38827b, invitedUser, l10);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), c60Var.f33203z0.getColor()));
                            F.f27489s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    c60Var.f33119f0.K0(c60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f19331id);
                    if (v3Var.f22493a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    c60Var.f33119f0.p0(new ProfileActivity(bundle, null));
                    c60Var.dismiss();
                }
            } else if (i10 == w50Var.f39336w) {
                if (ChatObject.isChannel(c60Var.W0) && (chat = c60Var.W0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    c60Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(c60Var.i1());
                if (chatFull != null) {
                    c60Var.f33176t0 = false;
                    Context context = c60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = c60Var.W0;
                    ChatObject.Call call2 = c60Var.X0;
                    org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    c60Var.B1 = t30Var;
                    t30Var.setOnDismissListener(new s20(c60Var, 2));
                    org.telegram.ui.Components.t30 t30Var2 = c60Var.B1;
                    t30Var2.f28881d0 = new e30(c60Var);
                    t30Var2.show();
                }
            } else if (i10 == w50Var.f39337x) {
                ChatObject.Call call3 = c60Var.X0;
                if (call3 != null && call3.call != null) {
                    gg.v2 v2Var = new gg.v2(activity, c60Var.currentAccount, null, 4, new nh.i0());
                    ChatObject.Call call4 = c60Var.X0;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new n8(4)).collect(Collectors.toSet());
                    }
                    v2Var.f6800z0.addAll(collection);
                    v2Var.h0(false, true);
                    v2Var.f6798x0 = new p20(c60Var, 3);
                    v2Var.h0(false, true);
                    v2Var.A0 = new dh.v(19, c60Var, call);
                    v2Var.show();
                }
            } else if (i10 == w50Var.f39338y) {
                c60Var.v1();
            }
        }
    }

    public static void o(c60 c60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = c60Var.f33119f0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            c60Var.f33119f0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z4 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                c60Var.f33123g0[0].e(1, false);
                if (c60Var.f33189w0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z4 = true;
                    }
                    p40 p40Var = new p40(c60Var, activity, z4);
                    c60Var.f33189w0 = p40Var;
                    p40Var.setBottomPadding(c60Var.containerView.getPaddingBottom());
                    c60Var.container.addView(c60Var.f33189w0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            c60Var.N1(true, false);
            c60Var.M1(false);
            c60Var.X0.sortParticipants();
            c60Var.O0(true);
            c60Var.e.requestLayout();
        }
    }

    public static void p(c60 c60Var, float f10, float f11, float f12, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c60Var.a2 = floatValue;
        c60Var.X1.f29727n = floatValue;
        float f13 = (floatValue * 1.0f) + ((1.0f - floatValue) * f10);
        y30 y30Var = c60Var.f33205z2;
        y30Var.setScaleX(f13);
        y30Var.setScaleY(f13);
        y30Var.setTranslationX((1.0f - c60Var.a2) * f11);
        y30Var.setTranslationY((1.0f - c60Var.a2) * f12);
        if (!c60Var.f33112d2) {
            c60Var.T2.setAlpha((int) (c60Var.a2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = c60Var.W2;
        if (tVar != null) {
            tVar.f29919a.setRoundCorners((1.0f - c60Var.a2) * AndroidUtilities.dp(8.0f));
        }
        y30Var.invalidate();
        c60Var.containerView.invalidate();
        x30 x30Var = c60Var.f33101b;
        int i11 = (int) ((1.0f - c60Var.a2) * i10);
        x30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(c60 c60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = c60Var.X0;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                c60Var.X0.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = c60Var.X0.call;
                tL_inputGroupCall.f19201id = groupCall2.f19194id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(c60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new x20(c60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            c60Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                c60Var.N1(true, true);
            }
        }
    }

    public static void r(c60 c60Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(declineconferencecallinvite, new w20(c60Var, 1));
        ChatObject.Call call = c60Var.X0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            c60Var.O0(true);
        }
    }

    public static void s(c60 c60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(c60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(c60 c60Var) {
        c60Var.Y0();
        c60Var.V0();
        c60Var.U0();
        c60Var.C.setTranslationY((-c60Var.f33204z1.c()) + c60Var.containerView.getPaddingBottom());
        c60Var.D.invalidate();
        c60Var.Z0();
        c60Var.containerView.invalidate();
    }

    public static void t1(Context context, Runnable runnable, boolean z4, boolean z10) {
        int dp;
        int dp2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            ChatObject.Call call = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z10 && ChatObject.canManageCalls(chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                if (sharedInstance.isConference()) {
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    if (z4) {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                    } else {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.j6.f20166rg;
                        int i11 = org.telegram.ui.ActionBar.j6.f20131pg;
                        int i12 = org.telegram.ui.ActionBar.j6.f20094ng;
                        checkBoxSquare.f22980s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f22981w = i12;
                        checkBoxSquare.invalidate();
                    }
                    z1VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
                    } else if (ChatObject.isChannelOrGiga(chat)) {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
                    } else {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
                    }
                    org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
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
                    z1Var2.setPadding(dp, 0, dp2, 0);
                    f10.addView(z1VarArr[0], k7.b6.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new q20(z1VarArr, 0));
                }
                alertDialog$Builder.n(f10);
                alertDialog$Builder.f19503a.F = org.telegram.ui.ActionBar.j6.f20131pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new d9.c(call, z1VarArr, selfId, runnable));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z4) {
                    alertDialog$Builder.f19503a.M0 = false;
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                if (z4) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        d2Var.getWindow().setType(2038);
                    } else {
                        d2Var.getWindow().setType(2003);
                    }
                    d2Var.getWindow().clearFlags(2);
                }
                if (!z4) {
                    d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20217ug, false));
                }
                d2Var.show();
                if (!z4) {
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20235vg, false));
                    }
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(c60 c60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(c60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(c60 c60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(c60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new i5.v(c60Var, updates, j10, 26));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new ih(c60Var, hashSet, call, str, 29));
        }
    }

    public static void w(c60 c60Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(c60Var.currentAccount).getUser(l10));
            getrequirementstocontact.f19389id.add(MessagesController.getInstance(c60Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.jy0 jy0Var = new org.telegram.ui.Components.jy0(c60Var, arrayList, arrayList2, arrayList3, str, 5);
        if (UserConfig.getInstance(c60Var.currentAccount).isPremium()) {
            jy0Var.run();
        } else {
            ConnectionsManager.getInstance(c60Var.currentAccount).sendRequest(getrequirementstocontact, new ba(arrayList, arrayList2, jy0Var, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z4, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z4 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i10).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i11 = 0; i11 < call.sortedParticipants.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void x(c60 c60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(34, c60Var.currentAccount, U.getContext(), U, new nh.i0());
        v0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        v0Var.show();
    }

    public static void y(c60 c60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            d2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        d2VarArr[0] = null;
        if (z4 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            c60Var.x1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.z4.f0(c60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.p2) c60Var.f33119f0.O().getFragmentStack().get(c60Var.f33119f0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.E.setText("");
        ChatObject.Call call = this.X0;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.X0;
            long j11 = call2.call.f19194id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j10 = DialogObject.getPeerDialogId(peer);
            } else {
                j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j10, tL_textWithEntities, j11, inputGroupCall);
        }
    }

    public final void B1(float f10) {
        float f11;
        int i10;
        int i11;
        this.R1 = f10;
        v30 v30Var = this.X1;
        if (v30Var == null) {
            f11 = 0.0f;
        } else {
            f11 = v30Var.f29715c;
        }
        float max = Math.max(f10, f11);
        int i12 = org.telegram.ui.ActionBar.j6.f20022jg;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.f19970gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i13, false), f10, 1.0f);
        this.S1 = offsetColor;
        this.K.setBackgroundColor(offsetColor);
        this.f33128h1.B(-14472653);
        this.f33107c0.setColorFilter(new PorterDuffColorFilter(this.S1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20041kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20198tg, false), f10, 1.0f);
        n50 n50Var = this.m0;
        if (n50Var != null) {
            n50Var.f36456j = offsetColor2;
            eg.h0 h0Var = n50Var.f36454g;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
        this.f33203z0.setColor(offsetColor2);
        this.B.setColor(offsetColor2);
        this.C.invalidate();
        j50 j50Var = this.N;
        j50Var.setGlowColor(offsetColor2);
        int i14 = this.C1;
        if (i14 == 3 || p1(i14)) {
            this.f33188w.invalidate();
        }
        View view = this.G2;
        if (view != null) {
            int i15 = this.S1;
            int[] iArr = this.J2;
            iArr[0] = i15;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.I2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.I2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.H2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Eg, false), f10, 1.0f);
        this.f33171s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20059lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20112og, false), f10, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20076mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20166rg, false), f10, 1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int childCount = j50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = j50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(v02, v02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z4 = childAt instanceof org.telegram.ui.Cells.e4;
                z40 z40Var = this.L;
                if (z4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (z40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.j6.f20166rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20076mg;
                    }
                    e4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (z40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.j6.f20166rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20076mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        j50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f10) {
        j50 j50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        f2.l1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.M0 = min;
        this.N0 = (min - this.L0) / 265.0f;
        ChatObject.Call call = this.X0;
        if (call != null && (j50Var = this.N) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.f33194x0))) != null) {
            v30 v30Var = this.X1;
            if (!v30Var.f29713b) {
                if (this.f33158p0) {
                    arrayList = this.A0;
                } else {
                    arrayList = this.X0.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = j50Var.K(indexOf + this.M.d)) != null) {
                    View view = K.f5785a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.U2 && !this.f33133i2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    r30 r30Var = this.f33137j2;
                    if (i10 >= r30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(s20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        s20Var.setAmplitude(f10 * 15.0f);
                    }
                    i10++;
                }
            }
            v30Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f33113d3 = i10;
        this.f33117e3 = i11;
        this.f33122f3 = i12;
        this.f33126g3 = i13;
        this.f33130h3 = i14;
        this.f33134i3 = i15;
        this.f33138j3 = i16;
        this.f33142k3 = i17;
        this.f33145l3 = i18;
        this.f33148m3 = i19;
        this.f33153n3 = i20;
        this.f33157o3 = i21;
        this.f33161p3 = i22;
        this.f33165q3 = i23;
        this.f33170r3 = i24;
        this.f33175s3 = i25;
    }

    public final void E1(float f10) {
        j50 j50Var;
        int dp;
        int i10;
        float f11;
        this.f33184v0 = f10;
        this.N.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) j50Var.getLayoutParams()).topMargin));
        float dp2 = f10 - AndroidUtilities.dp(74.0f);
        r50 r50Var = this.R0;
        v30 v30Var = this.X1;
        p30 p30Var = this.f33108c1;
        n30 n30Var = this.f33103b1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f11) * min);
            if (r50Var != null) {
                r50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.R1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f12 = 1.0f - ((0.1f * min) * 1.2f);
            n30Var.setScaleX(Math.max(0.9f, f12));
            n30Var.setScaleY(Math.max(0.9f, f12));
            float f13 = 1.0f - (min * 1.2f);
            n30Var.setAlpha((1.0f - v30Var.f29715c) * Math.max(0.0f, f13));
            p30Var.setScaleX(Math.max(0.9f, f12));
            p30Var.setScaleY(Math.max(0.9f, f12));
            p30Var.setAlpha((1.0f - v30Var.f29715c) * Math.max(0.0f, f13));
        } else {
            n30Var.setScaleX(1.0f);
            n30Var.setScaleY(1.0f);
            n30Var.setAlpha(1.0f - v30Var.f29715c);
            p30Var.setScaleX(1.0f);
            p30Var.setScaleY(1.0f);
            p30Var.setAlpha(1.0f - v30Var.f29715c);
            if (this.R1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f14 = i10;
        this.f33190w1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(53.0f)) - f14));
        this.f33124g1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
        if (r50Var != null) {
            r50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(37.0f)));
        }
        m40 m40Var = this.O;
        if (m40Var != null) {
            m40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.F1(android.view.View):boolean");
    }

    public final void G1(View view) {
        if (this.f33135j0 == null) {
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(8, getContext(), null, true);
            this.f33135j0 = k40Var;
            k40Var.setAlpha(0.0f);
            this.f33135j0.setVisibility(4);
            this.f33135j0.setShowingDuration(3000L);
            this.containerView.addView(this.f33135j0, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.W0)) {
                this.f33135j0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.f33135j0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.f33135j0.d();
        }
        this.f33135j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.f33135j0.f(view, true);
    }

    public final void H1(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ChatObject.Call call = this.X0;
        org.telegram.ui.Components.voip.v2 v2Var = this.v;
        org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
        org.telegram.ui.Components.voip.v2 v2Var3 = this.f33166r;
        org.telegram.ui.Components.voip.v2 v2Var4 = this.f33118f;
        org.telegram.ui.Components.voip.v2 v2Var5 = this.f33149n;
        org.telegram.ui.Components.voip.v2 v2Var6 = this.f33171s;
        org.telegram.ui.Components.voip.v2 v2Var7 = this.f33188w;
        boolean z18 = true;
        i30 i30Var = this.e;
        boolean z19 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.f33194x0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean bool = this.f33183u3;
            if (bool != null) {
                z14 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.X0.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (((!z13 && this.X0.canRecordVideo()) || z12) && !r1()) {
                z15 = true;
            } else {
                z19 = true;
                z15 = false;
            }
            if (z12) {
                z16 = false;
                z17 = true;
            } else {
                z16 = !z13;
                z17 = false;
            }
            if (C3) {
                z16 = false;
                z17 = false;
            }
            i30Var.c(v2Var7, true, z4);
            i30Var.c(v2Var6, true, z4);
            i30Var.c(v2Var5, z15, z4);
            i30Var.c(v2Var4, z17, z4);
            i30Var.c(v2Var3, z19, z4);
            i30Var.c(v2Var2, z16, z4);
            i30Var.c(v2Var, z14, z4);
            return;
        }
        if (this.S0 > 0.1f) {
            z10 = true;
        } else {
            z10 = false;
        }
        i30Var.c(v2Var7, z10, z4);
        if (this.S0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        i30Var.c(v2Var6, z11, z4);
        if (this.S0 <= 0.1f) {
            z18 = false;
        }
        i30Var.c(v2Var3, z18, z4);
        i30Var.c(v2Var5, false, z4);
        i30Var.c(v2Var4, false, z4);
        i30Var.c(v2Var2, false, z4);
        i30Var.c(v2Var, false, z4);
    }

    public final void I1() {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        int i12;
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ChatObject.Call call2 = this.X0;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33128h1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33136j1;
        if (call2 == null || call2.isScheduled()) {
            this.f33132i1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.X0 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f33131i0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.W0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.W0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f33140k1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.W0) && ((chat3 = this.W0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.W0) && !ChatObject.canUserDoAdminAction(this.W0, 3))) && (!ChatObject.isChannel(this.W0) || (chat2 = this.W0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.X0;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f33185v1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f33181u1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            g1Var3.setVisibility(i13);
            if (this.X0.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            g1Var2.setVisibility(i14);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(MessageObject.getPeerId(this.f33194x0));
        ChatObject.Call call4 = this.X0;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f33151n1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(0);
        } else {
            g1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i10 = R.drawable.msg_noise_on;
        } else {
            i10 = R.drawable.msg_noise_off;
        }
        g1Var4.setIcon(i10);
        if (SharedConfig.noiseSupression) {
            i11 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i11 = R.string.VoipNoiseCancellationDisabled;
        }
        g1Var4.setSubtext(LocaleController.getString(i11));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f33177t1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.l1;
        boolean z11 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f33159p1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f33163q1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.X0.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.X0.canRecordVideo() && !this.X0.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z12 = this.X0.recording;
            x50 x50Var = this.f33099a1;
            x50Var.f39864f = z12;
            x50Var.d = 1.0f;
            x50Var.invalidateSelf();
            if (this.X0.recording) {
                if (this.A1 == null) {
                    p20 p20Var = new p20(this, 6);
                    this.A1 = p20Var;
                    AndroidUtilities.runOnUIThread(p20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                p20 p20Var2 = this.A1;
                if (p20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(p20Var2);
                    this.A1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            K1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z4 && ((this.X0.canRecordVideo() || z10) && !this.X0.isScheduled() && !r1())) {
                if (z10) {
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                    g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                }
            } else {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            }
            g1Var5.setVisibility(8);
            g1Var6.setVisibility(8);
            g1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f33155o1;
        if (Q02 && this.X0.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.X0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z11 = false;
        }
        w0Var.I(4, z11);
        if (r1() && !this.X0.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f33146m1.setVisibility(i12);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.f33195x1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f33127h0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.Y0) && !r1() && this.f33194x0 != null) {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.f33194x0);
            if (DialogObject.isUserDialog(peerId)) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            kVar.setObject(chat);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.W0;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && g1Var.getVisibility() == 8) {
            w0Var.setVisibility(8);
        } else {
            w0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f33124g1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f10)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f33190w1.getLayoutParams()).rightMargin = 0;
        this.L.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.X0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.X0;
        int i10 = currentTime - call.call.record_start_date;
        boolean z4 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f33159p1;
        if (z4) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f12 = 1.0f - this.f33192w3.e;
            i30 i30Var = this.e;
            i30Var.setAlpha(f12);
            this.X1.setProgressToHideUi(f10);
            this.f33137j2.invalidate();
            this.containerView.invalidate();
            i30Var.invalidate();
        }
        if (i10 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Y0();
            this.D.invalidate();
            this.E.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final void L1(boolean z4) {
        float interpolation;
        float f10;
        m40 m40Var = this.O;
        if ((m40Var == null || this.X0 != null) && this.U0 == null) {
            this.T0 = 1.0f;
            this.S0 = 1.0f;
            if (m40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z4) {
            m30 m30Var = this.f33178t2;
            AndroidUtilities.cancelRunOnUIThread(m30Var);
            m30Var.run();
            ChatObject.Call call = this.X0;
            j50 j50Var = this.N;
            if (call != null && !call.isScheduled()) {
                j50Var.setVisibility(0);
            } else {
                j50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.W0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f33177t1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f11 = this.S0;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.nr.f27346f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.T0 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
            this.T0 = nrVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * nrVar.getInterpolation(this.S0 / 0.6f);
            f10 = this.S0 / 0.6f;
        }
        H1(true);
        float f12 = 1.0f - f10;
        m40Var.setAlpha(f12);
        this.R.setAlpha(f10);
        this.T.setAlpha(f10);
        i50 i50Var = this.S;
        i50Var.setAlpha(f10);
        i50Var.setScaleX(interpolation);
        i50Var.setScaleY(interpolation);
        k40 k40Var = this.Q;
        k40Var.setScaleX(f12);
        k40Var.setScaleY(f12);
        k40Var.setAlpha(f12);
        this.P.setAlpha(f12);
        this.f33128h1.setAlpha(f10);
        if (f12 != 0.0f) {
            i10 = 0;
        }
        if (i10 != m40Var.getVisibility()) {
            m40Var.setVisibility(i10);
            k40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        org.telegram.ui.Components.voip.v2 v2Var = this.f33166r;
        if (v2Var != null && v2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            i30 i30Var = this.e;
            boolean z13 = false;
            if (sharedInstance != null && !r1()) {
                xg.b bVar = (xg.b) i30Var.f46981c.get(v2Var);
                if (bVar != null) {
                    bVar.d.a(true, z4);
                    v2Var.setEnabled(true);
                }
                if (!sharedInstance.isBluetoothOn() && !sharedInstance.isBluetoothWillOn()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11 && sharedInstance.isSpeakerphoneOn()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    v2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z4);
                } else if (z12) {
                    v2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z4);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    v2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z4);
                } else {
                    v2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z4);
                }
                v2Var.b(z12, z4);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.X != i10) {
                    this.X = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.Y, i10);
                }
                org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
                if (v2Var2.getVisibility() == 0) {
                    v2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z4);
                    if (h1() != 1) {
                        z13 = true;
                    }
                    v2Var2.b(z13, z4);
                    return;
                }
                return;
            }
            v2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z4);
            if (!ChatObject.isPublic(this.W0) && (!ChatObject.hasAdminRights(this.W0) || !ChatObject.canAddUsers(this.W0))) {
                z10 = false;
            } else {
                z10 = true;
            }
            xg.b bVar2 = (xg.b) i30Var.f46981c.get(v2Var);
            if (bVar2 != null) {
                bVar2.d.a(z10, z4);
                v2Var.setEnabled(z10);
            }
            v2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.O0(boolean):void");
    }

    public final void O1() {
        boolean z4;
        String str;
        float f10;
        float f11;
        a60 a60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        z40 z40Var = this.L;
        if (z40Var != null && this.X0 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.X0.currentSpeakingPeers.m(); i11++) {
                long j10 = this.X0.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    v30 v30Var = this.X1;
                    v30Var.getClass();
                    if (v30Var.f29739w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.f33201y2.get(j10, 0) != 1) {
                        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i10 < 2) {
                            int i12 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                            if (i12 > 0) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                            } else {
                                user = null;
                            }
                            if (i12 <= 0) {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i10 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0);
                                }
                            }
                        }
                        i10++;
                        if (i10 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i10 > 0) {
                String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
                int indexOf = pluralString.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                z40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = z40Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.X0.call.participants_count;
            w50 w50Var = this.M;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((w50Var.J.r1() || w50Var.I || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (a60Var = this.f33200y1) != null) {
                a60Var.setWatchersCount(this.X0.call.participants_count);
            }
            if (z4 != this.f33169r2) {
                this.f33169r2 = z4;
                z40Var.invalidate();
                float f12 = 0.0f;
                z40Var.getSubtitleTextView().setPivotX(0.0f);
                z40Var.getSubtitleTextView().setPivotY(z40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = z40Var.getSubtitleTextView().animate();
                if (this.f33169r2) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f33169r2) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f33169r2) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(z40Var.getAdditionalSubtitleTextView(), this.f33169r2);
            }
        }
    }

    public final int P0() {
        j50 j50Var = this.N;
        int childCount = j50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z4) {
        ChatObject.Call call = this.X0;
        n30 n30Var = this.f33103b1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.W0)) {
                n30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z4);
                return;
            } else {
                n30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z4);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        z40 z40Var = this.L;
        if (!isEmpty) {
            if (!this.X0.call.title.equals(z40Var.getTitle())) {
                if (z4) {
                    this.L.I(this.X0.call.title, true, 180L, null);
                    z40Var.getTitleTextView().setOnClickListener(new n20(this, 8));
                } else {
                    z40Var.setTitle(this.X0.call.title);
                }
                n30Var.b(this.X0.call.title, z4);
            }
        } else {
            TLRPC.Chat chat = this.W0;
            if (chat != null && !chat.title.equals(z40Var.getTitle())) {
                if (z4) {
                    this.L.I(this.W0.title, true, 180L, null);
                    z40Var.getTitleTextView().setOnClickListener(new n20(this, 9));
                } else {
                    z40Var.setTitle(this.W0.title);
                }
                if (ChatObject.isChannelOrGiga(this.W0)) {
                    if (r1()) {
                        n30Var.b(this.W0.title, z4);
                    } else {
                        n30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z4);
                    }
                } else {
                    n30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z4);
                }
            } else if (this.W0 == null) {
                z40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                n30Var.b(LocaleController.getString(R.string.ConferenceChat), z4);
            }
        }
        org.telegram.ui.ActionBar.k5 titleTextView = z40Var.getTitleTextView();
        if (this.X0.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new y50(titleTextView));
                TextView textView = n30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y50(textView), (Drawable) null);
                TextView nextTextView = n30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            n30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            n30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.X0;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.W0);
    }

    public final void Q1() {
        float f10;
        org.telegram.ui.Components.nb nbVar;
        boolean z4;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f11 = this.f33184v0 - dp;
            if (this.backgroundPaddingTop + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.backgroundPaddingTop) / dp2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            z40 z40Var = this.L;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), z40Var.getY() + (-this.topBulletinContainer.getTop()) + z40Var.getHeight(), f10));
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
            if (icVar != null && (nbVar = icVar.e) != null && nbVar.getParent() != null && nbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f10 > 0.5f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                nbVar.setTop(z4);
            }
        }
    }

    public final void R0() {
        if (this.O1) {
            this.O1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f33186v2);
        }
        if (this.P1) {
            this.P1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f33188w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.S0():void");
    }

    public final void T0() {
        this.C.setTranslationY((-this.f33204z1.c()) + this.containerView.getPaddingBottom());
        this.D.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f33192w3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f10 = this.f33204z1.f2607b.f46913a;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        g40 g40Var = this.C;
        g40Var.setAlpha(f10);
        f40 f40Var = this.D;
        f40Var.setAlpha(f10);
        if (g40Var.getVisibility() != i10) {
            g40Var.setVisibility(i10);
            f40Var.setVisibility(i10);
            if (i10 == 8) {
                d40 d40Var = this.E;
                if (d40Var.isFocused()) {
                    d40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.pk0 pk0Var = this.H;
        if (pk0Var != null) {
            float f10 = this.f33204z1.f2607b.f46913a * this.f33197x3.e;
            pk0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.H.getVisibility() != i10) {
                this.H.setVisibility(i10);
                if (i10 == 8) {
                    this.H.n();
                }
            }
            org.telegram.ui.Components.pk0 pk0Var2 = this.H;
            if (!pk0Var2.K0 && f10 == 1.0f) {
                pk0Var2.K0 = true;
            }
        }
    }

    public final void W0() {
        boolean z4 = D3;
        i30 i30Var = this.e;
        if (z4) {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = C3;
        xd.a aVar = this.f33192w3;
        if (z10) {
            i30Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            i30Var.setTranslationY(0.0f);
            return;
        }
        i30Var.setTranslationX(0.0f);
        i30Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z4 = D3;
        r30 r30Var = this.f33137j2;
        if (z4) {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = C3;
        xd.a aVar = this.f33192w3;
        if (z10) {
            r30Var.setTranslationX(aVar.e * AndroidUtilities.dp(94.0f));
            r30Var.setTranslationY(0.0f);
            return;
        }
        r30Var.setTranslationX(0.0f);
        r30Var.setTranslationY(aVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f10 = this.f33202y3.e;
        ch.i iVar = this.f33204z1;
        float f11 = -((iVar.c() - this.containerView.getPaddingBottom()) + f10 + (AndroidUtilities.dp(68.0f) * this.f33197x3.e) + AndroidUtilities.dp(10.0f));
        if (D3) {
            dp = (1.0f - this.f33206z3.e) * AndroidUtilities.dp(-91.0f);
        } else if (C3) {
            dp = 0.0f;
        } else {
            dp = ((this.f33192w3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.X1.f29715c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f11, iVar.f2607b.f46913a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f33184v0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        yg.h hVar = this.Z;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.H != null) {
            this.H.setTranslationY((-this.f33204z1.c()) + this.containerView.getPaddingBottom() + ((-this.f33197x3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        boolean z4;
        float f10 = this.f33197x3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView = this.G;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z10 = false;
        if (f10 > 0.9f) {
            z4 = true;
        } else {
            z4 = false;
        }
        imageView.setClickable(z4);
        float f11 = 1.0f - f10;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f11);
        ImageView imageView2 = this.F;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z10 = true;
        }
        imageView2.setClickable(z10);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.W2;
        if (tVar != null) {
            tVar.f29919a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.W2;
            tVar2.h = false;
            tVar2.j(false);
            this.W2.invalidate();
            this.X1.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.U2;
        if (e4Var != null && !this.Y2 && e4Var.getParent() != null) {
            this.containerView.removeView(this.U2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.U2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.U2.setAboutVisible(false);
            this.U2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.s20 s20Var = this.X2;
        if (s20Var != null) {
            s20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.U2 = null;
        this.V2 = null;
        this.X2 = null;
        this.W2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.X1.f29713b;
    }

    public final void d1(boolean z4) {
        if (!this.Z2 && this.f33109c2) {
            if (z4) {
                this.Z2 = true;
                y1(false, this.U2);
                return;
            }
            b1();
            this.containerView.removeView(this.f33104b2);
            this.f33104b2 = null;
            this.f33205z2.setVisibility(8);
            this.containerView.invalidate();
            this.f33109c2 = false;
            this.V.X = true;
            this.N.invalidate();
            this.Y1.setVisibility(8);
            if (this.f33158p0) {
                this.f33158p0 = false;
                O0(true);
            }
            S0();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i12;
        int i13;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i14;
        int i15;
        String string;
        boolean z4;
        ChatObject.VideoParticipant videoParticipant;
        boolean z10;
        VoIPService sharedInstance;
        int i16;
        int i17;
        int i18 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        j50 j50Var = this.N;
        int i19 = 0;
        if (i10 == i18) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.X0;
            if (call != null && call.call.f19194id == l10.longValue()) {
                ChatObject.Call call2 = this.X0;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j10 = this.f33162q0;
                AccountInstance accountInstance = this.d;
                if (j10 == 0 && (((i17 = this.C1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f33119f0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.Y0);
                        intent.putExtra("peerChannelId", this.V0.channel_id);
                        intent.putExtra("peerChatId", this.V0.chat_id);
                        intent.putExtra("peerUserId", this.V0.user_id);
                        intent.putExtra("hash", this.Z0);
                        intent.putExtra("peerAccessHash", this.V0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f33129h2);
                        this.f33119f0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f33162q0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new p20(this, 2), 3000L);
                }
                if (!this.f33167r0 && VoIPService.getSharedInstance() != null) {
                    this.X0.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = j50Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = j50Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                    }
                }
                if (this.U2 != null) {
                    this.f33158p0 = true;
                } else {
                    O0(true);
                }
                O1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.C1 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                N1(true, booleanValue);
                P1(true);
                if (z10 && ((i16 = this.C1) == 1 || i16 == 0)) {
                    k1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !r1()) {
                        if (!o1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                                if (allDialogs != null) {
                                    int size = allDialogs.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        TLRPC.Dialog dialog = allDialogs.get(i21);
                                        i21++;
                                        if (dialog.f19188id == longValue) {
                                            i19 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                                if (user != null) {
                                    if (this.X0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.W0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.X0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.W0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            v30 v30Var = this.X1;
            if (v30Var.f29713b && this.X0 != null) {
                boolean c3 = v30Var.c();
                ChatObject.Call call3 = this.X0;
                if (call3 != null && v30Var.f29713b && (videoParticipant = v30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c3 = true;
                }
                if (c3) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.f33150n0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.X0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && v30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i22++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            v30Var.setVisibleParticipant(true);
            O1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
        } else if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.W0)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.W0)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog$Builder N = org.telegram.ui.Components.z4.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new s20(this, 1));
                try {
                    N.o();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19185id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.f33194x0);
            ChatObject.Call call4 = this.X0;
            if (call4 != null && chatFull.f19185id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(j50Var);
                if (this.B2 != null) {
                    while (i19 < this.B2.getChildCount()) {
                        View childAt2 = this.B2.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = R.string.VoipAddDescription;
                            } else {
                                i14 = R.string.VoipEditDescription;
                            }
                            String string2 = LocaleController.getString(i14);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i15 = R.drawable.msg_addbio;
                            } else {
                                i15 = R.drawable.msg_info;
                            }
                            g1Var.g(string2, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = j50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                f2.l1 G = j50Var.G(j50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f5785a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                        if (e4Var.getParticipant() != null) {
                            e4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.f33194x0);
            if (this.X0 != null && peerId2 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.X0.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(j50Var);
                if (this.B2 != null) {
                    while (i19 < this.B2.getChildCount()) {
                        View childAt3 = this.B2.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = R.string.VoipAddBio;
                            } else {
                                i12 = R.string.VoipEditBio;
                            }
                            String string3 = LocaleController.getString(i12);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i13 = R.drawable.msg_addbio;
                            } else {
                                i13 = R.drawable.msg_info;
                            }
                            g1Var2.g(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(j50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(j50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            p40 p40Var = this.f33189w0;
            if (p40Var != null) {
                p40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            n50 n50Var = this.m0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            n50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f33119f0;
        launchActivity.X0.remove(this.f33174s2);
        this.f33119f0.setRequestedOrientation(-1);
        B3 = false;
        org.telegram.ui.Components.t30 t30Var = this.B1;
        if (t30Var != null) {
            t30Var.dismiss();
        }
        this.f33158p0 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        AccountInstance accountInstance = this.d;
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        v30 v30Var = this.X1;
        if (v30Var != null) {
            if (this.f33152n2 != null) {
                this.N.getViewTreeObserver().removeOnPreDrawListener(this.f33152n2);
                this.f33152n2 = null;
            }
            ArrayList arrayList = this.W1;
            arrayList.clear();
            ArrayList arrayList2 = this.V1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                v30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (v30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(v30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (A3 == this) {
            A3 = null;
        }
        B3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.a30.j(getContext());
        ChatObject.Call call = this.X0;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        if (this.f33119f0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f33119f0.getSystemService("audio");
            boolean z4 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z4 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z4);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView k12 = k1();
                if (z4) {
                    i10 = 42;
                } else {
                    i10 = 43;
                }
                k12.j(i10, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f33119f0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            v30 v30Var = this.X1;
            if (v30Var.f29732r != null) {
                return;
            }
            boolean z4 = D3;
            j50 j50Var = this.N;
            int i10 = 0;
            if (z4) {
                if (this.f33152n2 != null) {
                    j50Var.getViewTreeObserver().removeOnPreDrawListener(this.f33152n2);
                    this.f33152n2 = null;
                }
                ArrayList arrayList = new ArrayList();
                i60 i60Var = this.f33144l2;
                ArrayList arrayList2 = this.V1;
                ArrayList arrayList3 = this.W1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f29923c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.s20 s20Var = tVar.d;
                            if (s20Var != null) {
                                s20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f29947w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new q40(this, tVar));
                        }
                    }
                    this.M2 = false;
                    i60Var.H(this.f33141k2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f29947w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f29947w);
                            tVar2.b(false);
                            org.telegram.ui.Components.s20 s20Var2 = tVar2.d;
                            if (s20Var2 != null) {
                                s20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f29923c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new r40(this, tVar2));
                        }
                    }
                    this.M2 = true;
                    i60Var.f35032r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new g00(3, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = j50Var.getViewTreeObserver();
                t40 t40Var = new t40(this, videoParticipant, !v30Var.f29713b);
                this.f33152n2 = t40Var;
                viewTreeObserver.addOnPreDrawListener(t40Var);
                return;
            }
            if (this.f33152n2 != null) {
                j50Var.getViewTreeObserver().removeOnPreDrawListener(this.f33152n2);
                this.f33152n2 = null;
            }
            if (videoParticipant != null) {
                r30 r30Var = this.f33137j2;
                if (r30Var.getVisibility() != 0) {
                    r30Var.setVisibility(0);
                    org.telegram.ui.Components.t20 t20Var = this.f33147m2;
                    t20Var.G(r30Var, false);
                    this.f33158p0 = true;
                    if (!v30Var.f29713b) {
                        ArrayList arrayList4 = t20Var.e;
                        f2.i0 i0Var = (f2.i0) r30Var.getLayoutManager();
                        if (i0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    i0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = j50Var.getViewTreeObserver();
                    u40 u40Var = new u40(this, videoParticipant);
                    this.f33152n2 = u40Var;
                    viewTreeObserver2.addOnPreDrawListener(u40Var);
                    return;
                }
                v30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(r30Var);
            } else if (j50Var.getVisibility() != 0) {
                j50Var.setVisibility(0);
                O0(false);
                this.f33158p0 = true;
                ViewTreeObserver viewTreeObserver3 = j50Var.getViewTreeObserver();
                v40 v40Var = new v40(this);
                this.f33152n2 = v40Var;
                viewTreeObserver3.addOnPreDrawListener(v40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = j50Var.getViewTreeObserver();
                w40 w40Var = new w40(this);
                this.f33152n2 = w40Var;
                viewTreeObserver4.addOnPreDrawListener(w40Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.f33187v3;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute == 0) {
            return 1;
        }
        if (currentAudioRoute == 1) {
            return 0;
        }
        return 2;
    }

    public final long i1() {
        TLRPC.Chat chat = this.W0;
        if (chat == null) {
            return 0L;
        }
        return chat.f19184id;
    }

    public final void j1(boolean z4) {
        boolean z10;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
            String publicUsername = ChatObject.getPublicUsername(this.W0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = android.support.v4.media.a.p(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.W0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new lh.k7(this, chatFull, z4, 4));
                return;
            }
            u1(null, str, true, z4);
        } else if (this.X0 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.X0.getInputGroupCall();
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                exportgroupcallinvite.can_self_unmute = z10;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.m0(this, i10, z4, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!D3) {
            v30 v30Var = this.X1;
            if (v30Var.f29713b) {
                return v30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f33123g0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l1() {
        VoIPService sharedInstance;
        int i10;
        if (!this.f33167r0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f33167r0 = true;
            this.A0.addAll(this.X0.visibleParticipants);
            this.B0.addAll(this.f33150n0);
            this.C0.addAll(this.X0.invitedUsers);
            this.D0.addAll(this.X0.shadyJoinParticipants);
            this.E0.addAll(this.X0.shadyLeftParticipants);
            this.Q1 = sharedInstance.getCallState();
            if (this.X0 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.X0 = call;
                this.f33147m2.f28871c = call;
                this.X1.setGroupCall(call);
                this.f33144l2.f35029c = this.X0;
            }
            yg.h hVar = this.Z;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.X0.getInputGroupCall(false));
            }
            this.L.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.X0.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            i50 i50Var = this.S;
            if (i50Var != null && i50Var.getVisibility() == 0) {
                this.f33171s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.W0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f33177t1.setText(LocaleController.getString(i10));
                j50 j50Var = this.N;
                j50Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.f33132i1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i50Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var = this.R;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k5Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var2 = this.T;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(k5Var2, property2, 0.0f), ObjectAnimator.ofFloat(k5Var2, property3, 0.0f), ObjectAnimator.ofFloat(k5Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.nr.f27347g);
                animatorSet.addListener(new x40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j10, final boolean z4) {
        if (this.X0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.X0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f19331id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        c60 c60Var = c60.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                        if (tLObject != null) {
                            c60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.ci(c60Var, j11, d2VarArr2, user, 7));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new lh.j(c60Var, d2VarArr2, z4, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey(this, d2VarArr, sendRequest, 25), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f10;
        int dp = AndroidUtilities.dp(74.0f);
        float f11 = this.f33184v0 - dp;
        if (this.backgroundPaddingTop + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAudioSettingsChanged() {
        M1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        j50 j50Var = this.N;
        if (j50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(j50Var);
        }
        r30 r30Var = this.f33137j2;
        if (r30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(r30Var);
        }
        ArrayList arrayList = this.W1;
        arrayList.clear();
        arrayList.addAll(this.V1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        p40 p40Var = this.f33189w0;
        if (p40Var != null) {
            p40Var.b(false, false);
        } else if (this.f33109c2) {
            d1(true);
        } else if (this.X1.f29713b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        ArrayList arrayList = this.W1;
        arrayList.clear();
        arrayList.addAll(this.V1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        p40 p40Var = this.f33189w0;
        if (p40Var != null && VoIPService.getSharedInstance() != null) {
            p40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f33119f0;
        launchActivity.X0.add(this.f33174s2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        B3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.a30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.Q1 = i10;
        N1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public final boolean q1() {
        if (!r1() || this.X0.visibleVideoParticipants.isEmpty() || (this.X0.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.X0.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.X0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, boolean z4) {
        long j10;
        if (!this.f33176t0) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f33119f0.O().getFragmentStack().get(this.f33119f0.O().getFragmentStack().size() - 1);
            if (p2Var instanceof xn) {
                boolean P9 = ((xn) p2Var).P9();
                this.f33176t0 = true;
                this.f33180u0 = true;
                cg.u0 u0Var = new cg.u0(g3Var, editTextBoldCursor, z4, d2Var, 16);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(u0Var, j10);
                return;
            }
            this.f33176t0 = true;
            this.f33180u0 = true;
            if (g3Var != null) {
                g3Var.setFocusable(true);
            } else if (d2Var != null) {
                d2Var.k(true);
            }
            if (z4) {
                AndroidUtilities.runOnUIThread(new ch(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.g1.f29636a0.S) {
            org.telegram.ui.Components.voip.g1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.X0;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
            d2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.X0.call;
            tL_inputGroupCall.f19201id = groupCall.f19194id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ba(this, d2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        TLObject chat;
        int i11;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        TextView textView;
        VoIPService voIPService;
        int i17;
        int i18;
        String str3;
        String str4;
        int i19;
        int i20;
        int i21;
        int i22;
        EditText editText;
        int i23;
        int i24;
        int i25;
        int i26;
        float f10;
        int i27;
        int i28;
        int i29;
        int i30;
        int dp;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AccountInstance accountInstance = this.d;
            int i31 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i31 > 0) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
            }
            TLObject tLObject = chat;
            boolean z4 = true;
            if (i10 != 0 && i10 != 2 && i10 != 3) {
                if (i10 == 6) {
                    this.f33119f0.K0(this.currentAccount);
                    Bundle bundle = new Bundle();
                    if (i31 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.f33119f0.p0(new xn(bundle));
                    dismiss();
                } else if (i10 == 8) {
                    this.f33119f0.K0(this.currentAccount);
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f33119f0.O().getFragmentStack().get(this.f33119f0.O().getFragmentStack().size() - 1);
                    if ((p2Var instanceof xn) && ((xn) p2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i31 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.f33119f0.p0(new xn(bundle2));
                    dismiss();
                } else if (i10 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    J1(2, true);
                } else if (i10 == 9) {
                    org.telegram.ui.Components.w40 w40Var = this.f33116e2;
                    if (w40Var == null || !w40Var.h()) {
                        TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                        org.telegram.ui.Components.w40 w40Var2 = new org.telegram.ui.Components.w40(0, true, true);
                        this.f33116e2 = w40Var2;
                        w40Var2.E = true;
                        w40Var2.O = true;
                        w40Var2.D = true;
                        w40Var2.G = true;
                        w40Var2.P = true;
                        w40Var2.f30190a = this.f33119f0.O().getLastFragment();
                        org.telegram.ui.Components.w40 w40Var3 = this.f33116e2;
                        k50 k50Var = new k50(this, j10);
                        this.f33121f2 = k50Var;
                        w40Var3.f30191b = k50Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                        w40Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new p20(this, 9), new dg.e0(5), 0);
                    }
                } else if (i10 == 10) {
                    String str5 = groupCallParticipant.about;
                    Context context = getContext();
                    int i32 = this.currentAccount;
                    Pattern pattern = org.telegram.ui.Components.z4.f31230a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    if (i31 > 0) {
                        i24 = R.string.UserBio;
                    } else {
                        i24 = R.string.DescriptionPlaceholder;
                    }
                    String string = LocaleController.getString(i24);
                    final org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = string;
                    if (i31 > 0) {
                        i25 = R.string.VoipGroupBioEditAlertText;
                    } else {
                        i25 = R.string.DescriptionInfo;
                    }
                    d2Var.Q = LocaleController.getString(i25);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i31 < 0) {
                        i26 = i32;
                        f10 = 8.0f;
                        long j11 = -j10;
                        if (MessagesController.getInstance(i32).getChatFull(j11) == null) {
                            MessagesController.getInstance(i26).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                        }
                    } else {
                        i26 = i32;
                        f10 = 8.0f;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i33 = org.telegram.ui.ActionBar.j6.f19987hg;
                    editText2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i33, false));
                    if (i31 > 0) {
                        i27 = R.string.UserBio;
                    } else {
                        i27 = R.string.DescriptionPlaceholder;
                    }
                    editText2.setHint(LocaleController.getString(i27));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.j6.S(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i31 > 0) {
                        i28 = 70;
                    } else {
                        i28 = 255;
                    }
                    editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.k3(i28, context, numberTextView)});
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (LocaleController.isRTL) {
                        i29 = 3;
                    } else {
                        i29 = 5;
                    }
                    frameLayout.addView(numberTextView, k7.b6.d(20, 20.0f, i29, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (LocaleController.isRTL) {
                        i30 = AndroidUtilities.dp(24.0f);
                    } else {
                        i30 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(f10);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(24.0f);
                    }
                    editText2.setPadding(i30, dp2, dp, AndroidUtilities.dp(f10));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.hq(i28, numberTextView));
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                    editText2.setText(str5);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.n(frameLayout);
                    final k3.d dVar = new k3.d(editText2, i26, j10, 2);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), dVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    d2Var.K = new org.telegram.ui.Components.p1(editText2, 1);
                    frameLayout.addView(editText2, k7.b6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    AndroidUtilities.showKeyboard(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i34, KeyEvent keyEvent) {
                            if (i34 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                if (d2Var2.isShowing()) {
                                    dVar.i(d2Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20217ug, false));
                    d2Var.show();
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, i33, false));
                } else if (i10 == 11) {
                    Context context2 = getContext();
                    int i34 = this.currentAccount;
                    Pattern pattern2 = org.telegram.ui.Components.z4.f31230a;
                    if (DialogObject.isUserDialog(j10)) {
                        TLRPC.User user = MessagesController.getInstance(i34).getUser(Long.valueOf(j10));
                        str3 = user.first_name;
                        str4 = user.last_name;
                    } else {
                        str3 = MessagesController.getInstance(i34).getChat(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i31 > 0) {
                        i19 = R.string.VoipEditName;
                    } else {
                        i19 = R.string.VoipEditTitle;
                    }
                    String string2 = LocaleController.getString(i19);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                    d2Var2.O = string2;
                    LinearLayout f11 = org.telegram.messenger.y3.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i35 = org.telegram.ui.ActionBar.j6.f19987hg;
                    editText3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i20 = 5;
                    } else {
                        i20 = 3;
                    }
                    editText3.setGravity(i20);
                    editText3.setInputType(49152);
                    if (i31 > 0) {
                        i21 = 5;
                    } else {
                        i21 = 6;
                    }
                    editText3.setImeOptions(i21);
                    if (i31 > 0) {
                        i22 = R.string.FirstName;
                    } else {
                        i22 = R.string.VoipEditTitleHint;
                    }
                    editText3.setHint(LocaleController.getString(i22));
                    editText3.setBackground(org.telegram.ui.ActionBar.j6.S(context2));
                    editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    editText3.requestFocus();
                    if (i31 > 0) {
                        editText = new EditText(context2);
                        editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (LocaleController.isRTL) {
                            i23 = 5;
                        } else {
                            i23 = 3;
                        }
                        editText.setGravity(i23);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(LocaleController.getString(R.string.LastName));
                        editText.setBackground(org.telegram.ui.ActionBar.j6.S(context2));
                        editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    } else {
                        editText = null;
                    }
                    AndroidUtilities.showKeyboard(editText3);
                    f11.addView(editText3, k7.b6.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        f11.addView(editText, k7.b6.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.n(f11);
                    org.telegram.ui.ActionBar.c2 s1Var = new org.telegram.ui.Components.s1(editText3, j10, i34, editText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Save), s1Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    d2Var2.K = new gg.g(5, editText3, editText);
                    d2Var2.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20217ug, false));
                    d2Var2.show();
                    d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                    yd ydVar = new yd(1, d2Var2, s1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(ydVar);
                    } else {
                        editText3.setOnEditorActionListener(ydVar);
                    }
                } else if (i10 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    k1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        voIPService = sharedInstance;
                        i17 = 1;
                        voIPService.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        voIPService = sharedInstance;
                        i17 = 1;
                        voIPService.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    voIPService.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                    UndoView k12 = k1();
                    if (i10 == i17) {
                        i18 = 31;
                    } else {
                        i18 = 36;
                    }
                    k12.k(0L, i18, tLObject, null, null, null);
                }
            } else if (i10 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    k1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i36 = org.telegram.ui.ActionBar.j6.f20131pg;
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19503a;
                d2Var3.F = i36;
                TextView textView2 = new TextView(getContext());
                int i37 = org.telegram.ui.ActionBar.j6.f19987hg;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i37, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder3.n(frameLayout2);
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                z8Var.u(AndroidUtilities.dp(12.0f));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
                p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout2.addView(p9Var, k7.b6.d(40, 40.0f, i12 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                z8Var.j(this.currentAccount, tLObject);
                boolean z10 = tLObject instanceof TLRPC.User;
                if (z10) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    p9Var.e(user2, z8Var);
                    str = UserObject.getFirstName(user2);
                } else {
                    TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                    p9Var.e(chat2, z8Var);
                    str = chat2.title;
                }
                TextView textView3 = new TextView(getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i37, false));
                textView3.setTextSize(1, 20.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView3.setGravity(i13 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat3 = this.W0;
                if (chat3 != null) {
                    str2 = chat3.title;
                } else {
                    str2 = "";
                }
                if (i10 == 2) {
                    if (o1()) {
                        textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                        b.o(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                        if (ChatObject.isChannelOrGiga(this.W0)) {
                            b.o(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        } else {
                            b.o(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                    b.o(R.string.VoipGroupAddMemberText, new Object[]{str, str2}, textView2);
                }
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                int i38 = i14 | 48;
                int i39 = 76;
                if (z11) {
                    i15 = 21;
                } else {
                    i15 = 76;
                }
                float f12 = i15;
                if (!z11) {
                    i39 = 21;
                }
                frameLayout2.addView(textView3, k7.b6.d(-1, -2.0f, i38, f12, 11.0f, i39, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout2.addView(textView2, k7.b6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i10 == 2) {
                    alertDialog$Builder3.k(LocaleController.getString(R.string.VoipGroupUserRemove), new qs(10, this, tLObject));
                } else if (z10) {
                    alertDialog$Builder3.k(LocaleController.getString(R.string.VoipGroupAdd), new e3.f(this, (TLRPC.User) tLObject, j10, 7));
                }
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                d2Var3.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20217ug, false));
                d2Var3.show();
                if (i10 == 2 && (textView = (TextView) d2Var3.d(-1)) != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20235vg, false));
                }
            }
        }
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.e4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.y1(boolean, org.telegram.ui.Cells.e4):void");
    }

    public final void z1() {
        z5 z5Var = this.f33196x2;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (this.f33191w2 && this.R0 != null && VoIPService.getSharedInstance() != null && r1() && this.N != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(z5Var, 30L);
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
