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
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class j60 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, le.d {
    public static j60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final w5 A2;
    public final le.b A3;
    public TLObject B0;
    public final h60 B1;
    public final LongSparseIntArray B2;
    public final le.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final d40 C2;
    public final le.b C3;
    public final ArrayList D0;
    public v20 D1;
    public final b40 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.r30 E1;
    public LinearLayout E2;
    public final l40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final k40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.xi0 G2;
    public final i40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.xi0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.fk0 K;
    public final org.telegram.ui.Components.xi0 K0;
    public final i60[] K1;
    public final View K2;
    public final n50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.q6 M;
    public final org.telegram.ui.Components.ca M0;
    public i60 M1;
    public final int[] M2;
    public final t30 N;
    public final org.telegram.ui.Components.ca N0;
    public i60 N1;
    public final x30 N2;
    public final f50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final d60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final p50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final r40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final p40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.j5 U;
    public final y50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final o50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.j5 W;
    public float W0;
    public boolean W1;
    public final x40 W2;
    public final x50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.oz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f37512a0;
    public ChatObject.Call f37513a1;
    public final a40 a2;
    public org.telegram.ui.Components.r20 f37514a3;
    public final c40 f37515b;
    public final ImageView f37516b0;
    public final boolean f37517b1;
    public final f40 f37518b2;
    public boolean f37519b3;
    public final h30 f37520c;
    public final mh.h f37521c0;
    public final String f37522c1;
    public final s40 f37523c2;
    public boolean f37524c3;
    public final AccountInstance d;
    public final int f37525d0;
    public final e60 f37526d1;
    public float f37527d2;
    public int f37528d3;
    public final n30 f37529e;
    public final RadialProgressView f37530e0;
    public final s30 f37531e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f37532e2;
    public AnimatorSet f37533e3;
    public final org.telegram.ui.Components.voip.t2 f37534f;
    public final Drawable f37535f0;
    public final u30 f37536f1;
    public boolean f37537f2;
    public j50 f37538f3;
    public final View f37539g0;
    public final Paint f37540g1;
    public boolean f37541g2;
    public int f37542g3;
    public final org.telegram.ui.Components.voip.t2 h;
    public AnimatorSet f37543h0;
    public ValueAnimator f37544h1;
    public org.telegram.ui.Components.u40 f37545h2;
    public int f37546h3;
    public LaunchActivity f37547i0;
    public float f37548i1;
    public q50 f37549i2;
    public int f37550i3;
    public final UndoView[] f37551j0;
    public final LinearLayout f37552j1;
    public Boolean f37553j2;
    public int j3;
    public final org.telegram.ui.Cells.k f37554k0;
    public final org.telegram.ui.ActionBar.v0 f37555k1;
    public int f37556k2;
    public int f37557k3;
    public boolean f37558l0;
    public final org.telegram.ui.ActionBar.v0 l1;
    public boolean f37559l2;
    public int f37560l3;
    public org.telegram.ui.Components.i40 m0;
    public final org.telegram.ui.ActionBar.v0 f37561m1;
    public final w30 f37562m2;
    public int f37563m3;
    public final org.telegram.ui.Components.voip.t2 f37564n;
    public org.telegram.ui.Components.i40 f37565n0;
    public final org.telegram.ui.ActionBar.f1 f37566n1;
    public final org.telegram.ui.Components.ll0 f37567n2;
    public int f37568n3;
    public int f37569o0;
    public final org.telegram.ui.ActionBar.f1 f37570o1;
    public final p60 f37571o2;
    public int f37572o3;
    public u50 f37573p0;
    public final org.telegram.ui.ActionBar.f1 f37574p1;
    public final org.telegram.ui.Components.s20 f37575p2;
    public int f37576p3;
    public final ArrayList f37577q0;
    public final org.telegram.ui.ActionBar.f1 f37578q1;
    public ViewTreeObserver.OnPreDrawListener f37579q2;
    public int f37580q3;
    public final org.telegram.ui.Components.voip.t2 f37581r;
    public d50 f37582r0;
    public final org.telegram.ui.ActionBar.f1 f37583r1;
    public final org.telegram.ui.Components.voip.h f37584r2;
    public int f37585r3;
    public final org.telegram.ui.Components.voip.t2 f37586s;
    public boolean f37587s0;
    public final org.telegram.ui.ActionBar.f1 f37588s1;
    public boolean f37589s2;
    public int f37590s3;
    public long f37591t0;
    public final org.telegram.ui.ActionBar.f1 f37592t1;
    public final ArrayList f37593t2;
    public int f37594t3;
    public boolean f37595u0;
    public final org.telegram.ui.ActionBar.f1 f37596u1;
    public boolean f37597u2;
    public int f37598u3;
    public final org.telegram.ui.Components.voip.t2 v;
    public final RectF f37599v0;
    public final org.telegram.ui.ActionBar.f1 f37600v1;
    public final v20 f37601v2;
    public int f37602v3;
    public final org.telegram.ui.Components.voip.t2 f37603w;
    public boolean f37604w0;
    public final org.telegram.ui.ActionBar.f1 f37605w1;
    public final r30 f37606w2;
    public final k50 f37607w3;
    public final o30 f37608x;
    public boolean f37609x0;
    public final org.telegram.ui.ActionBar.f1 f37610x1;
    public final org.telegram.ui.Components.ue f37611x2;
    public Boolean f37612x3;
    public final ImageView f37613y;
    public float f37614y0;
    public final org.telegram.ui.ActionBar.f1 f37615y1;
    public final v20 f37616y2;
    public Integer y3;
    public u40 f37617z0;
    public final LinearLayout f37618z1;
    public boolean f37619z2;
    public final le.b f37620z3;

    public j60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, true, true);
        int i10;
        j60 j60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f37551j0 = new UndoView[2];
        this.f37577q0 = new ArrayList();
        this.f37599v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new qh.i(new v20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new i60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f37584r2 = new org.telegram.ui.Components.voip.h();
        this.f37593t2 = new ArrayList();
        this.f37601v2 = new v20(this, 0);
        this.f37606w2 = new r30(this);
        this.f37611x2 = new org.telegram.ui.Components.ue(18);
        this.f37616y2 = new v20(this, 1);
        this.f37619z2 = false;
        this.A2 = new w5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f37528d3 = -1;
        this.f37607w3 = new k50(this);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29466f;
        this.f37620z3 = new le.b(2, this, prVar, 350L);
        this.A3 = new le.b(3, this, prVar, 220L, true);
        this.B3 = new le.e(4, this, prVar, 350L);
        this.C3 = new le.b(5, this, prVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f37513a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f37522c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f37517b1 = z10;
        this.resourcesProvider = new bi.s0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f37525d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new m40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new x40(this);
        setOnDismissListener(new z20(this, 0));
        setDimBehindAlpha(75);
        d60 d60Var = new d60(this, launchActivity);
        this.P = d60Var;
        org.telegram.ui.Components.qp qpVar = new org.telegram.ui.Components.qp(true);
        int i11 = org.telegram.ui.ActionBar.j6.f20907qg;
        qpVar.b(org.telegram.ui.ActionBar.j6.u0(i11));
        qpVar.d();
        f50 f50Var = new f50(this, launchActivity, qpVar);
        this.O = f50Var;
        f50Var.setSubtitle("");
        f50Var.getSubtitleTextView().setVisibility(0);
        f50Var.l();
        f50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(f50Var.getAdditionalSubtitleTextView(), this.f37597u2, 1.0f, false);
        f50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20819lg;
        f50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        f50Var.setBackButtonImage(R.drawable.ic_ab_back);
        f50Var.setOccupyStatusBar(false);
        f50Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.j6.f20743hg;
        f50Var.C(org.telegram.ui.ActionBar.j6.u0(i13), false);
        f50Var.B(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f21063z8), false);
        f50Var.setTitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        f50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        f50Var.setActionBarMenuOnItemClick(new m50(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser;
            i10 = i13;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else {
            i10 = i13;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.A0 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.A0 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.A0 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new s20(this, 3);
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
        this.f37535f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = xi0Var;
        this.K0 = new org.telegram.ui.Components.xi0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        n50 n50Var = new n50(this, launchActivity);
        this.L = n50Var;
        this.containerView = n50Var;
        n50Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.Z = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.U = j5Var;
            j5Var.setGravity(17);
            j5Var.setTextColor(-1);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setTextSize(18);
            j5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(j5Var, w7.x5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            o50 o50Var = new o50(this, launchActivity);
            this.V = o50Var;
            o50Var.setGravity(17);
            o50Var.setTextColor(-1);
            o50Var.setTypeface(AndroidUtilities.bold());
            o50Var.setTextSize(60);
            this.containerView.addView(o50Var, w7.x5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.W = j5Var2;
            j5Var2.setGravity(17);
            j5Var2.setTextColor(-1);
            j5Var2.setTypeface(AndroidUtilities.bold());
            j5Var2.setTextSize(18);
            this.containerView.addView(j5Var2, w7.x5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            y50 y50Var = new y50(this, launchActivity);
            this.U0 = y50Var;
            this.containerView.addView(y50Var, w7.x5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        p50 p50Var = new p50(this, launchActivity);
        this.Q = p50Var;
        p50Var.setClipToPadding(false);
        p50Var.setClipChildren(false);
        x50 x50Var = new x50(this);
        this.X = x50Var;
        x50Var.f45803o = prVar;
        x50Var.d = 350L;
        x50Var.f45828c = 350L;
        x50Var.f45829e = 350L;
        x50Var.S();
        p50Var.setItemAnimator(x50Var);
        p50Var.setOnScrollListener(new g30(this));
        p50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(F3 ? 6 : 2, p50Var);
        this.Y = ozVar;
        p50Var.setLayoutManager(ozVar);
        h30 h30Var = new h30(this);
        this.f37520c = h30Var;
        ozVar.z1(h30Var);
        p50Var.i(new i30(this));
        ozVar.C1();
        this.containerView.addView(p50Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        p50Var.setAdapter(d60Var);
        p50Var.setTopBottomSelectorRadius(13);
        p50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.eg));
        p50Var.setOnItemClickListener(new b7(this, launchActivity, call, 14));
        p50Var.setOnItemLongClickListener(new s20(this, 4));
        if (r1()) {
            h60 h60Var = new h60(this, getContext());
            this.B1 = h60Var;
            this.containerView.addView(h60Var, w7.x5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(launchActivity);
        this.f37567n2 = ll0Var;
        this.containerView.addView(ll0Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        p60 p60Var = new p60(call, this.currentAccount, this);
        this.f37571o2 = p60Var;
        ll0Var.setAdapter(p60Var);
        s4.s sVar = new s4.s(6, false);
        ll0Var.setLayoutManager(sVar);
        sVar.z1(new k30(this));
        ll0Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this) {
            public final j60 f40904b;

            {
                this.f40904b = this;
            }

            @Override
            public final void a(int i15, View view) {
                switch (r2) {
                    case 0:
                        j60 j60Var2 = this.f40904b;
                        j60Var2.getClass();
                        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view;
                        if (r20Var.getVideoParticipant() == null) {
                            j60Var2.e1(new ChatObject.VideoParticipant(r20Var.getParticipant(), false, false));
                            return;
                        } else {
                            j60Var2.e1(r20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        j60 j60Var3 = this.f40904b;
                        j60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            j60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f45803o = prVar;
        jVar.d = 350L;
        jVar.f45828c = 350L;
        jVar.f45829e = 350L;
        ll0Var.setItemAnimator(new l30(this));
        ll0Var.setOnScrollListener(new m30(this));
        p60Var.H(ll0Var, false, false);
        ll0Var.setVisibility(8);
        n30 n30Var = new n30(this, launchActivity);
        this.f37529e = n30Var;
        int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(9);
        this.M0 = caVar;
        org.telegram.ui.Components.ca caVar2 = new org.telegram.ui.Components.ca(12);
        this.N0 = caVar2;
        caVar.f24926a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        caVar.f24927b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        caVar.b();
        caVar2.f24926a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        caVar2.f24927b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        caVar2.b();
        int i15 = org.telegram.ui.ActionBar.j6.Ig;
        caVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i15), 38));
        caVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i15), 76));
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f37581r = t2Var;
        t2Var.setCheckable(true);
        t2Var.setTextSize(12);
        n30Var.a(t2Var);
        t2Var.setOnClickListener(new t20(this, 7));
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f37564n = t2Var2;
        t2Var2.setCheckable(true);
        t2Var2.setTextSize(12);
        t2Var2.d(false, false);
        t2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        t2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.t2 t2Var3 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f37534f = t2Var3;
        t2Var3.setCheckable(true);
        t2Var3.setTextSize(12);
        t2Var3.d(false, false);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(launchActivity);
        t2Var3.addView(aj0Var, w7.x5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = xi0Var2;
        aj0Var.setAnimation(xi0Var2);
        t2Var3.setOnClickListener(new t20(this, 10));
        n30Var.a(t2Var3);
        org.telegram.ui.Components.voip.t2 t2Var4 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.h = t2Var4;
        t2Var4.setCheckable(true);
        t2Var4.setTextSize(12);
        t2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f37516b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f37512a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        t2Var4.addView(imageView, w7.x5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        t2Var4.setOnClickListener(new t20(this, 11));
        n30Var.a(t2Var4);
        n30Var.a(t2Var2);
        org.telegram.ui.Components.voip.t2 t2Var5 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f37586s = t2Var5;
        t2Var5.setTextSize(12);
        t2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        t2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final j60 f42965b;

            {
                this.f42965b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j60.o(this.f42965b, launchActivity);
                        return;
                    default:
                        j60 j60Var2 = this.f42965b;
                        j60Var2.a2.e();
                        ChatObject.Call call2 = j60Var2.f37513a1;
                        if (call2 != null && !call2.isScheduled()) {
                            j60Var2.I1();
                            j60.t1(launchActivity, new v20(j60Var2, 5), false, false);
                            return;
                        }
                        j60Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.t2 t2Var6 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.v = t2Var6;
        t2Var6.setCheckable(true);
        t2Var6.b(true, false);
        t2Var6.setTextSize(12);
        t2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        o30 o30Var = new o30(this, launchActivity);
        this.f37608x = o30Var;
        o30Var.setAnimation(xi0Var);
        o30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.t2 t2Var7 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f37603w = t2Var7;
        t2Var7.setDrawBackground(false);
        t2Var7.setTextSize(12);
        t2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        t2Var7.addView(o30Var, w7.x5.e(50, 50, 49));
        n30Var.a(t2Var7);
        t2Var7.setOnClickListener(new q30(this));
        n30Var.a(t2Var6);
        n30Var.a(t2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f37613y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        t2Var7.addView(imageView2, w7.x5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f37513a1 != null && r1() && !this.f37513a1.isScheduled()) {
            imageView2.setVisibility(0);
            o30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f37530e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Og));
        f50Var.setAlpha(0.0f);
        f50Var.getBackButton().setScaleX(0.9f);
        f50Var.getBackButton().setScaleY(0.9f);
        f50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        f50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        f50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        f50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i10));
        this.f37555k1 = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setIcon(R.drawable.ic_ab_other);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var.setSubMenuOpenSide(2);
        v0Var.setDelegate(new s20(this, 0));
        int i17 = org.telegram.ui.ActionBar.j6.f20762ig;
        v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        v0Var.setOnClickListener(new t20(this, 0));
        v0Var.G(org.telegram.ui.ActionBar.j6.u0(i10), false);
        v0Var.G(org.telegram.ui.ActionBar.j6.u0(i10), true);
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i10));
        this.l1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.msg_voice_pip);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        v0Var2.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        v0Var2.setOnClickListener(new t20(this, 1));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i10));
        this.f37561m1 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        v0Var3.setIcon(R.drawable.msg_screencast);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        v0Var3.setOnClickListener(new t20(this, 2));
        s30 s30Var = new s30(this, launchActivity, launchActivity);
        this.f37531e1 = s30Var;
        t30 t30Var = new t30(launchActivity);
        this.N = t30Var;
        t30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f37540g1 = paint2;
        paint2.setColor(-12761513);
        u30 u30Var = new u30(this, getContext());
        this.f37536f1 = u30Var;
        u30Var.setTextColor(getThemedColor(i10));
        u30Var.setTextSize(1, 11.0f);
        u30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        u30Var.setMaxLines(1);
        u30Var.setGravity(17);
        u30Var.setTypeface(AndroidUtilities.bold());
        u30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        u30Var.setTag(-1);
        if (!r1()) {
            u30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f37552j1 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(s30Var, w7.x5.l(1.0f, 0, -2));
        linearLayout.addView(u30Var, w7.x5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(t30Var, w7.x5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.x5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(f50Var, w7.x5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f37618z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(v0Var3, w7.x5.n(48, 48));
        linearLayout2.addView(v0Var2, w7.x5.n(48, 48));
        linearLayout2.addView(v0Var, w7.x5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.x5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f37539g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.V5));
        this.containerView.addView(view, w7.x5.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f37551j0[i18] = new v30(this, launchActivity);
            this.f37551j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f37551j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f37551j0[i18], w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f37554k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f37555k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f37555k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.j6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.u0(i19), 6, 6));
        org.telegram.ui.ActionBar.v0 v0Var4 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d = v0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, v0Var4.m0);
        this.f37596u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.v0 v0Var5 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d10 = v0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, v0Var5.m0);
        this.f37600v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.j6.f21016wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.j6.u0(i20), org.telegram.ui.ActionBar.j6.u0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.j6.u0(i20), org.telegram.ui.ActionBar.j6.u0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.j6.f20743hg;
        paint3.setColor(org.telegram.ui.ActionBar.j6.u0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.v0 v0Var6 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d11 = v0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, v0Var6.m0);
        this.f37574p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.v0 v0Var7 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d12 = v0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, v0Var7.m0);
        this.f37578q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f37555k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f20726gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.v0 v0Var8 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d13 = v0Var8.d(6, R.drawable.msg_edit, this.f37526d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, v0Var8.m0);
        this.f37570o1 = d13;
        org.telegram.ui.ActionBar.v0 v0Var9 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d14 = v0Var9.d(7, R.drawable.msg_permissions, this.f37526d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, v0Var9.m0);
        this.f37583r1 = d14;
        org.telegram.ui.ActionBar.f1 e7 = this.f37555k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f37566n1 = e7;
        e60 e60Var = new e60();
        this.f37526d1 = e60Var;
        org.telegram.ui.ActionBar.f1 e10 = this.f37555k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f37592t1 = e10;
        org.telegram.ui.ActionBar.v0 v0Var10 = this.f37555k1;
        org.telegram.ui.ActionBar.f1 d15 = v0Var10.d(5, 0, e60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, v0Var10.m0);
        this.f37588s1 = d15;
        e60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.f1 e11 = this.f37555k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f37610x1 = e11;
        org.telegram.ui.ActionBar.f1 e12 = this.f37555k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f37615y1 = e12;
        org.telegram.ui.ActionBar.f1 e13 = this.f37555k1.e(4, R.drawable.msg_cancel, LocaleController.getString(o1() ? R.string.VoipGroupEndConference : ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.f37605w1 = e13;
        this.f37555k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.u0(i19));
        this.f37555k1.getPopupLayout().setFitItems(true);
        e11.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        e12.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d11.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d12.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        int i22 = org.telegram.ui.ActionBar.j6.f20999vg;
        e13.c(org.telegram.ui.ActionBar.j6.u0(i22), org.telegram.ui.ActionBar.j6.u0(i22));
        e7.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d13.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d14.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d15.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        e10.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        if (this.f37513a1 != null) {
            l1();
        }
        if (o1()) {
            this.f37573p0 = new u50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f37573p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.O.getTitleTextView().setOnClickListener(new t20(this, 3));
        w30 w30Var = new w30(this, launchActivity);
        this.f37562m2 = w30Var;
        x30 x30Var = new x30(this);
        this.N2 = x30Var;
        w30Var.setClipToPadding(false);
        x30Var.S();
        x30Var.f45803o = org.telegram.ui.Components.pr.f29466f;
        x30Var.d = 350L;
        x30Var.f45828c = 350L;
        x30Var.f45829e = 350L;
        w30Var.setItemAnimator(x30Var);
        w30Var.setOnScrollListener(new y30(this));
        w30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        w30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(call, this.currentAccount, this);
        this.f37575p2 = s20Var;
        w30Var.setAdapter(s20Var);
        s20Var.F(w30Var, false);
        w30Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this) {
            public final j60 f40904b;

            {
                this.f40904b = this;
            }

            @Override
            public final void a(int i152, View view2) {
                switch (r2) {
                    case 0:
                        j60 j60Var2 = this.f40904b;
                        j60Var2.getClass();
                        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view2;
                        if (r20Var.getVideoParticipant() == null) {
                            j60Var2.e1(new ChatObject.VideoParticipant(r20Var.getParticipant(), false, false));
                            return;
                        } else {
                            j60Var2.e1(r20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        j60 j60Var3 = this.f40904b;
                        j60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            j60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        w30Var.setOnItemLongClickListener(new s20(this, 1));
        w30Var.setVisibility(8);
        w30Var.i(new z30());
        a40 a40Var = new a40(this, launchActivity, this.Q, w30Var, this.Y1, this.f37513a1, this);
        this.a2 = a40Var;
        a40Var.setClipChildren(false);
        s20Var.E(this.Y1, a40Var);
        if (this.f37567n2 != null) {
            this.f37571o2.G(this.Y1, a40Var);
        }
        b40 b40Var = new b40(this, launchActivity);
        this.D2 = b40Var;
        c40 c40Var = new c40(this, launchActivity, this.O, this.Q, b40Var);
        this.f37515b = c40Var;
        c40Var.setImagesLayerNum(Integer.MAX_VALUE);
        c40Var.setInvalidateWithParent(true);
        b40Var.setProfileGalleryView(c40Var);
        d40 d40Var = new d40(this, launchActivity);
        this.C2 = d40Var;
        d40Var.setVisibility(8);
        c40Var.setVisibility(0);
        c40Var.b(new e40(this));
        f40 f40Var = new f40(this, launchActivity);
        this.f37518b2 = f40Var;
        this.containerView.addView(a40Var);
        a40Var.addView(w30Var, w7.x5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f37529e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.x5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.x5.e(-1, 0, 83));
        mh.h hVar = new mh.h(launchActivity);
        this.f37521c0 = hVar;
        hVar.setDelegate(new g40(this));
        hVar.setClickCellDelegate(new h40(this));
        if (this.f37513a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f37513a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(launchActivity, false, true, true);
        this.M = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, org.telegram.ui.Components.pr.h);
        q6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.f37529e);
        i40 i40Var = new i40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = i40Var;
        i40Var.J = true;
        i40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f37525d0)});
        i40Var.getEditText().setLinkTextColor(-11683585);
        i40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        i40Var.getEditText().addTextChangedListener(new j40(this));
        i40Var.s();
        k40 k40Var = new k40(this, launchActivity);
        this.G = k40Var;
        this.containerView.addView(k40Var, w7.x5.c(-1.0f, -1));
        l40 l40Var = new l40(launchActivity);
        this.F = l40Var;
        l40Var.addView(i40Var, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        l40Var.addView(q6Var, w7.x5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        q6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(l40Var, w7.x5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i23 = org.telegram.ui.ActionBar.j6.f20753i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i23), 1, -1));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new t20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i23), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20990v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new t20(this, 5));
        l40Var.addView(imageView3, w7.x5.e(48, 48, 85));
        l40Var.addView(imageView4, w7.x5.e(48, 48, 85));
        this.containerView.addView(f40Var);
        d40Var.addView(c40Var, w7.x5.c(-1.0f, -1));
        d40Var.addView(b40Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(d40Var, w7.x5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f37571o2.I(this.f37567n2, false);
        }
        this.I0 = this.P.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.S = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.Z0) && (chat2 = this.Z0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, w7.x5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(launchActivity);
            vc0Var.setTextColor(-1);
            vc0Var.setSelectorColor(-9598483);
            vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            vc0Var.setItemCount(5);
            n40 n40Var = new n40(launchActivity);
            n40Var.setItemCount(5);
            n40Var.setTextColor(-1);
            n40Var.setSelectorColor(-9598483);
            n40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            o40 o40Var = new o40(launchActivity);
            o40Var.setItemCount(5);
            o40Var.setTextColor(-1);
            o40Var.setSelectorColor(-9598483);
            o40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            p40 p40Var = new p40(launchActivity);
            this.T = p40Var;
            p40Var.setLines(1);
            p40Var.setSingleLine(true);
            p40Var.setEllipsize(TextUtils.TruncateAt.END);
            p40Var.setGravity(17);
            p40Var.setTextColor(-1);
            p40Var.setTypeface(AndroidUtilities.bold());
            p40Var.setTextSize(1, 14.0f);
            this.containerView.addView(p40Var, w7.x5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            p40Var.setOnClickListener(new org.telegram.messenger.video.f(this, vc0Var, n40Var, o40Var, chat, accountInstance, inputPeer2, 1));
            r40 r40Var = new r40(launchActivity, vc0Var, n40Var, o40Var);
            this.R = r40Var;
            r40Var.setWeightSum(1.0f);
            r40Var.setOrientation(0);
            this.containerView.addView(r40Var, w7.x5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i24 = calendar.get(1);
            int i25 = calendar.get(6);
            r40Var.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
            vc0Var.setMinValue(0);
            vc0Var.setMaxValue(365);
            vc0Var.setWrapSelectorWheel(false);
            vc0Var.setFormatter(new x20(currentTimeMillis, calendar, i24, 0));
            a1.d dVar = new a1.d(this, vc0Var, n40Var, o40Var, 11);
            j60Var = this;
            vc0Var.setOnValueChangedListener(dVar);
            n40Var.setMinValue(0);
            n40Var.setMaxValue(23);
            r40Var.addView(n40Var, w7.x5.l(0.2f, 0, 270));
            n40Var.setFormatter(new org.telegram.ui.Components.wo0(18));
            n40Var.setOnValueChangedListener(dVar);
            o40Var.setMinValue(0);
            o40Var.setMaxValue(59);
            o40Var.setValue(0);
            o40Var.setFormatter(new org.telegram.ui.Components.wo0(19));
            r40Var.addView(o40Var, w7.x5.l(0.3f, 0, 270));
            o40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i26 = calendar.get(6);
            int i27 = calendar.get(12);
            int i28 = calendar.get(11);
            vc0Var.setValue(i25 != i26 ? 1 : 0);
            o40Var.setValue(i27);
            n40Var.setValue(i28);
            org.telegram.ui.Components.e5.g(p40Var, textView, 0L, 604800L, 2, vc0Var, n40Var, o40Var);
        } else {
            j60Var = this;
        }
        s40 s40Var = new s40(j60Var, (ViewGroup) j60Var.getWindow().getDecorView(), j60Var.containerView);
        j60Var.f37523c2 = s40Var;
        s40Var.E = new t40(j60Var);
        c40Var.setPinchToZoomHelper(s40Var);
        j60Var.f37564n.setOnClickListener(new View.OnClickListener(j60Var) {
            public final j60 f42965b;

            {
                this.f42965b = j60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        j60.o(this.f42965b, launchActivity);
                        return;
                    default:
                        j60 j60Var2 = this.f42965b;
                        j60Var2.a2.e();
                        ChatObject.Call call2 = j60Var2.f37513a1;
                        if (call2 != null && !call2.isScheduled()) {
                            j60Var2.I1();
                            j60.t1(launchActivity, new v20(j60Var2, 5), false, false);
                            return;
                        }
                        j60Var2.dismiss();
                        return;
                }
            }
        });
        j60Var.L1(false);
        j60Var.I1();
        j60Var.M1(false);
        j60Var.N1(false, false);
        j60Var.B1(0.0f);
        j60Var.O1();
        j60Var.containerView.addView(new FrameLayout(launchActivity), w7.x5.e(-1, 200, 87));
        j60Var.v.setOnClickListener(new t20(j60Var, 6));
        j60Var.T0();
        w7.z5.a(j60Var.f37564n);
        w7.z5.a(j60Var.f37581r);
        w7.z5.a(j60Var.f37534f);
        w7.z5.a(j60Var.h);
        w7.z5.a(j60Var.f37603w);
        w7.z5.a(j60Var.f37586s);
        w7.z5.a(j60Var.v);
        r0.i0.m(j60Var.containerView, new s20(j60Var, 2));
    }

    public static r0.l1 A(j60 j60Var, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f44711a;
        i0.c f7 = i1Var.f(647);
        i0.c f10 = i1Var.f(8);
        i40 i40Var = j60Var.H;
        if (!i40Var.N && !i40Var.f26850e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = i40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = j60Var.f37518b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (i40Var.getEmojiView() != null) {
            i40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (j60Var.S2) {
            ViewGroup viewGroup = j60Var.containerView;
            int i10 = j60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = j60Var.containerView;
            int i11 = j60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f11425a + i11, f7.f11426b, i11 + f7.f11427c, f7.d);
        }
        j60Var.containerView.requestLayout();
        if (max == 0 && !i40Var.N && !i40Var.f26850e && !i40Var.O) {
            i40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.fk0 fk0Var = j60Var.K;
            if (fk0Var == null) {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                fk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.fk0 fk0Var2 = new org.telegram.ui.Components.fk0(1, j60Var.currentAccount, j60Var.getContext(), R, j60Var.resourcesProvider);
                    j60Var.K = fk0Var2;
                    fk0Var2.setDelegate(new l50(j60Var));
                    j60Var.containerView.addView(j60Var.K, w7.x5.e(-2, 52, 81));
                    j60Var.K.p(null, null, false);
                    j60Var.G.bringToFront();
                    j60Var.F.bringToFront();
                    fk0Var = j60Var.K;
                }
            }
            j60Var.K = fk0Var;
        }
        i40Var.H(f10.d, false);
        j60Var.C1.i(l1Var);
        return r0.l1.f44710b;
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(j60 j60Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = j60Var.getContext();
            int i10 = j60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.f6 f6Var = j60Var.resourcesProvider;
            ChatObject.Call call = j60Var.f37513a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            k9.o0(context, i10, inputGroupCall, str, f6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.yc(j60Var.topBulletinContainer, new bi.s0()).d0(tL_error, false);
        }
    }

    public static void B0(j60 j60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (j60Var.f37565n0 == null) {
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(j60Var.getContext(), 8);
            j60Var.f37565n0 = i40Var;
            i40Var.setAlpha(0.0f);
            j60Var.f37565n0.setVisibility(4);
            j60Var.f37565n0.setShowingDuration(4000L);
            j60Var.containerView.addView(j60Var.f37565n0, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            j60Var.f37565n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            j60Var.f37565n0.d();
        }
        j60Var.f37565n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        j60Var.f37565n0.f(j60Var.f37603w, true);
    }

    public static void C(j60 j60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 K;
        w30 w30Var = j60Var.f37562m2;
        a40 a40Var = j60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = j60Var.f37513a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!a40Var.f31597b) {
                    if (j60Var.f37587s0) {
                        arrayList = j60Var.D0;
                    } else {
                        arrayList = j60Var.f37513a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = j60Var.Q.K(indexOf + j60Var.P.d)) != null) {
                        View view = K.f45738a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == j60Var.X2 && !j60Var.f37559l2) {
                                j60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < w30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) w30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(r20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            r20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                a40Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void D(j60 j60Var) {
        Editable text = j60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(j60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        j60Var.A1(tL_textWithEntities);
    }

    public static void F0(j60 j60Var) {
        ChatObject.Call call = j60Var.f37513a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = j60Var.f37513a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(j60Var.f37513a1.call.join_muted);
            ConnectionsManager connectionsManager = j60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new e30(j60Var, 1));
        }
    }

    public static void G0(j60 j60Var, boolean z10) {
        if (j60Var.f37513a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = j60Var.f37513a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        j60Var.f37612x3 = Boolean.valueOf(z10);
        j60Var.H1(true);
        ConnectionsManager connectionsManager = j60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new e30(j60Var, 0));
    }

    public static void H0(j60 j60Var) {
        boolean z10;
        int i10;
        if (j60Var.r1()) {
            a40 a40Var = j60Var.a2;
            if (!a40Var.V && a40Var.f31597b && (F3 == j60Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = j60Var.f37553j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = j60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                j60Var.getWindow().clearFlags(1024);
                j60Var.setHideSystemVerticalInsets(false);
            } else {
                j60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                j60Var.getWindow().addFlags(1024);
            }
            j60Var.containerView.setSystemUiVisibility(i10);
            j60Var.f37553j2 = Boolean.valueOf(z10);
            j60Var.S2 = !z10;
            j60Var.containerView.requestApplyInsets();
            return;
        }
        j60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(j60 j60Var) {
        p50 p50Var = j60Var.Q;
        for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
            View childAt = p50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(j60 j60Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f7;
        float f10;
        float dp;
        float dp2;
        float dp3;
        float f11;
        float f12;
        float f13;
        View childAt;
        f50 f50Var = j60Var.O;
        p50 p50Var = j60Var.Q;
        int childCount = p50Var.getChildCount();
        boolean z12 = false;
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(p50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = p50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && f50Var.getTag() == null) || (!z10 && f50Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            f50Var.setTag(num);
            AnimatorSet animatorSet = j60Var.f37543h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                j60Var.f37543h0 = null;
            }
            if (f50Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            j60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = f50Var.getBackButton().animate();
            float f15 = 0.9f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f7);
            if (z10) {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f10).setDuration(300L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29466f;
            duration.setInterpolator(prVar).start();
            ViewPropertyAnimator animate2 = f50Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(prVar).start();
            ObjectAnimator objectAnimator = j60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                j60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = f50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = f50Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            j60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            j60Var.U2.setInterpolator(prVar);
            j60Var.U2.addListener(new e50(0, j60Var, z10));
            j60Var.U2.start();
            ObjectAnimator objectAnimator2 = j60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.j5 additionalSubtitleTextView = f50Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            j60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            j60Var.V2.setInterpolator(prVar);
            j60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            j60Var.f37543h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = j60Var.f37543h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f50Var, property2, f11);
            t30 t30Var = j60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t30Var, property2, f12);
            View view = j60Var.f37539g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            j60Var.f37543h0.addListener(new c50(j60Var, 1));
            j60Var.f37543h0.start();
            j60Var.a2.v.setClickable((!z10 || F3) ? true : true);
        }
        if (j60Var.f37614y0 != dp4) {
            j60Var.E1(dp4);
        }
    }

    public static void N(j60 j60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!j60Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(j60Var.Y1, j60Var.a2, lVar, null, null, lVar.getParticipant(), j60Var.f37513a1, j60Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(j60 j60Var, int i10, int[] iArr) {
        if (j60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21071zg, false), j60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20801kg, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), j60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21052yg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21071zg, false), j60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21034xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Cg, false), j60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20802kh, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20820lh, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20838mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ng, false), j60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20801kg, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false), j60Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20763ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20802kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new j60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f19869id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new j60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f37547i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(17));
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

    public static void m(j60 j60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(declineconferencecallinvite, new d30(j60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(j60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = j60Var.f37513a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            j60Var.f37513a1.invitedUsersMap.remove(l4);
            j60Var.f37513a1.invitedUsersMessageIds.remove(l4);
            j60Var.O0(true);
        }
    }

    public static void n(j60 j60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = j60Var.d;
        ArrayList arrayList = j60Var.F0;
        d60 d60Var = j60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            j60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.d4) {
            j60Var.F1((org.telegram.ui.Cells.d4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l4 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (v3Var.getUser() != null) {
                    if (j60Var.o1()) {
                        int i11 = i10 - d60Var.f35680n;
                        if (i11 >= 0 && i11 < j60Var.f37513a1.shadyJoinParticipants.size()) {
                            l4 = j60Var.f37513a1.shadyJoinParticipants.get(i10 - d60Var.f35680n);
                        } else {
                            int i12 = i10 - d60Var.f35682s;
                            if (i12 >= 0 && i12 < j60Var.f37513a1.shadyLeftParticipants.size()) {
                                l4 = j60Var.f37513a1.shadyLeftParticipants.get(i10 - d60Var.f35682s);
                            } else {
                                int i13 = i10 - d60Var.f35679f;
                                if (j60Var.f37587s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < j60Var.f37513a1.invitedUsers.size()) {
                                    l4 = j60Var.f37513a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = j60Var.f37513a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(j60Var.container, j60Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(j60Var) {
                                public final j60 f34622b;

                                {
                                    this.f34622b = j60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            j60.r(this.f34622b, invitedUser, l4);
                                            return;
                                        default:
                                            j60.m(this.f34622b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(j60Var) {
                                public final j60 f34622b;

                                {
                                    this.f34622b = j60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            j60.r(this.f34622b, invitedUser, l4);
                                            return;
                                        default:
                                            j60.m(this.f34622b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j60Var.C0.getColor()));
                            F.f28660s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    j60Var.f37547i0.K0(j60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f20016id);
                    if (v3Var.f23360a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    j60Var.f37547i0.p0(new ProfileActivity(bundle, null));
                    j60Var.dismiss();
                }
            } else if (i10 == d60Var.f35683w) {
                if (ChatObject.isChannel(j60Var.Z0) && (chat = j60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    j60Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j60Var.i1());
                if (chatFull != null) {
                    j60Var.f37604w0 = false;
                    Context context = j60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = j60Var.Z0;
                    ChatObject.Call call2 = j60Var.f37513a1;
                    org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    j60Var.E1 = r30Var;
                    r30Var.setOnDismissListener(new z20(j60Var, 2));
                    org.telegram.ui.Components.r30 r30Var2 = j60Var.E1;
                    r30Var2.f29917g0 = new j30(j60Var);
                    r30Var2.show();
                }
            } else if (i10 == d60Var.f35684x) {
                ChatObject.Call call3 = j60Var.f37513a1;
                if (call3 != null && call3.call != null) {
                    ug.n1 n1Var = new ug.n1(activity, j60Var.currentAccount, null, 4, new bi.s0());
                    ChatObject.Call call4 = j60Var.f37513a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new l8(4)).collect(Collectors.toSet());
                    }
                    n1Var.C0.addAll(collection);
                    n1Var.h0(false, true);
                    n1Var.A0 = new v20(j60Var, 3);
                    n1Var.h0(false, true);
                    n1Var.D0 = new bi.f0(14, j60Var, call);
                    n1Var.show();
                }
            } else if (i10 == d60Var.f35685y) {
                j60Var.v1();
            }
        }
    }

    public static void o(j60 j60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = j60Var.f37547i0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            j60Var.f37547i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                j60Var.f37551j0[0].e(1, false);
                if (j60Var.f37617z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    u40 u40Var = new u40(j60Var, activity, z10);
                    j60Var.f37617z0 = u40Var;
                    u40Var.setBottomPadding(j60Var.containerView.getPaddingBottom());
                    j60Var.container.addView(j60Var.f37617z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            j60Var.N1(true, false);
            j60Var.M1(false);
            j60Var.f37513a1.sortParticipants();
            j60Var.O0(true);
            j60Var.f37529e.requestLayout();
        }
    }

    public static void p(j60 j60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j60Var.f37527d2 = floatValue;
        j60Var.a2.f31612n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        d40 d40Var = j60Var.C2;
        d40Var.setScaleX(f12);
        d40Var.setScaleY(f12);
        d40Var.setTranslationX((1.0f - j60Var.f37527d2) * f10);
        d40Var.setTranslationY((1.0f - j60Var.f37527d2) * f11);
        if (!j60Var.f37541g2) {
            j60Var.W2.setAlpha((int) (j60Var.f37527d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = j60Var.Z2;
        if (tVar != null) {
            tVar.f31804a.setRoundCorners((1.0f - j60Var.f37527d2) * AndroidUtilities.dp(8.0f));
        }
        d40Var.invalidate();
        j60Var.containerView.invalidate();
        c40 c40Var = j60Var.f37515b;
        int i11 = (int) ((1.0f - j60Var.f37527d2) * i10);
        c40Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(j60 j60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = j60Var.f37513a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                j60Var.f37513a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = j60Var.f37513a1.call;
                tL_inputGroupCall.f19886id = groupCall2.f19879id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(j60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new fi.b1(j60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            j60Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                j60Var.N1(true, true);
            }
        }
    }

    public static void r(j60 j60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(declineconferencecallinvite, new d30(j60Var, 1));
        ChatObject.Call call = j60Var.f37513a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            j60Var.O0(true);
        }
    }

    public static void s(j60 j60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(j60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(j60 j60Var) {
        j60Var.Y0();
        j60Var.V0();
        j60Var.U0();
        j60Var.F.setTranslationY((-j60Var.C1.c()) + j60Var.containerView.getPaddingBottom());
        j60Var.G.invalidate();
        j60Var.Z0();
        j60Var.containerView.invalidate();
    }

    public static void t1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int dp;
        int dp2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            ChatObject.Call call = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && ChatObject.canManageCalls(chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                if (sharedInstance.isConference()) {
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    if (z10) {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
                    } else {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20743hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.j6.f20926rg;
                        int i11 = org.telegram.ui.ActionBar.j6.f20889pg;
                        int i12 = org.telegram.ui.ActionBar.j6.f20853ng;
                        checkBoxSquare.f23923s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f23924w = i12;
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
                    f7.addView(z1VarArr[0], w7.x5.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new w20(z1VarArr, 0));
                }
                alertDialog$Builder.n(f7);
                alertDialog$Builder.f20198a.I = org.telegram.ui.ActionBar.j6.f20889pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new di.y6(call, z1VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f20198a.P0 = false;
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        b2Var.getWindow().setType(2038);
                    } else {
                        b2Var.getWindow().setType(2003);
                    }
                    b2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    b2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20982ug, false));
                }
                b2Var.show();
                if (!z10) {
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20999vg, false));
                    }
                    b2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20743hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(j60 j60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(j60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(j60 j60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(j60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new a3.g0(j60Var, updates, j3, 25));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(j60Var, hashSet, call, str, 8));
        }
    }

    public static void w(j60 j60Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(j60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f20077id.add(MessagesController.getInstance(j60Var.currentAccount).getInputUser(longValue));
        }
        bi.z2 z2Var = new bi.z2(j60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(j60Var.currentAccount).isPremium()) {
            z2Var.run();
        } else {
            ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(getrequirementstocontact, new aa(arrayList, arrayList2, z2Var, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j3);
            if (groupCallParticipant != null) {
                call.participants.e(j3);
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

    public static void x(j60 j60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(34, j60Var.currentAccount, U.getContext(), U, new bi.s0());
        k0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        k0Var.show();
    }

    public static void y(j60 j60Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            j60Var.x1(null, j3, 3);
            return;
        }
        org.telegram.ui.Components.e5.f0(j60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.n2) j60Var.f37547i0.O().getFragmentStack().get(j60Var.f37547i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j3;
        this.H.setText("");
        ChatObject.Call call = this.f37513a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f37513a1;
            long j10 = call2.call.f19879id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j3 = DialogObject.getPeerDialogId(peer);
            } else {
                j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j3, tL_textWithEntities, j10, inputGroupCall);
        }
    }

    public final void B1(float f7) {
        float f10;
        int i10;
        int i11;
        this.U1 = f7;
        a40 a40Var = this.a2;
        if (a40Var == null) {
            f10 = 0.0f;
        } else {
            f10 = a40Var.f31599c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.j6.f20781jg;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.f20726gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f37555k1.B(-14472653);
        this.f37535f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20801kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20963tg, false), f7, 1.0f);
        u50 u50Var = this.f37573p0;
        if (u50Var != null) {
            u50Var.f40936j = offsetColor2;
            t50 t50Var = u50Var.f40934g;
            if (t50Var != null) {
                t50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        p50 p50Var = this.Q;
        p50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f37603w.invalidate();
        }
        View view = this.J2;
        if (view != null) {
            int i15 = this.V1;
            int[] iArr = this.M2;
            iArr[0] = i15;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.L2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.L2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.K2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Eg, false), f7, 1.0f);
        this.f37586s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20819lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20871og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20837mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20926rg, false), f7, 1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int childCount = p50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = p50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(v02, v02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                f50 f50Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (f50Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.j6.f20926rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20837mg;
                    }
                    d4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (f50Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.j6.f20926rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20837mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        p50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        p50 p50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f37513a1;
        if (call != null && (p50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            a40 a40Var = this.a2;
            if (!a40Var.f31597b) {
                if (this.f37587s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f37513a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = p50Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f45738a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f37559l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    w30 w30Var = this.f37562m2;
                    if (i10 >= w30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) w30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(r20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        r20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            a40Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f37542g3 = i10;
        this.f37546h3 = i11;
        this.f37550i3 = i12;
        this.j3 = i13;
        this.f37557k3 = i14;
        this.f37560l3 = i15;
        this.f37563m3 = i16;
        this.f37568n3 = i17;
        this.f37572o3 = i18;
        this.f37576p3 = i19;
        this.f37580q3 = i20;
        this.f37585r3 = i21;
        this.f37590s3 = i22;
        this.f37594t3 = i23;
        this.f37598u3 = i24;
        this.f37602v3 = i25;
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f37620z3.f15368e;
            n30 n30Var = this.f37529e;
            n30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f37562m2.invalidate();
            this.containerView.invalidate();
            n30Var.invalidate();
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
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final void E1(float f7) {
        p50 p50Var;
        int dp;
        int i10;
        float f10;
        this.f37614y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) p50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        y50 y50Var = this.U0;
        a40 a40Var = this.a2;
        u30 u30Var = this.f37536f1;
        s30 s30Var = this.f37531e1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (y50Var != null) {
                y50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            s30Var.setScaleX(Math.max(0.9f, f11));
            s30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            s30Var.setAlpha((1.0f - a40Var.f31599c) * Math.max(0.0f, f12));
            u30Var.setScaleX(Math.max(0.9f, f11));
            u30Var.setScaleY(Math.max(0.9f, f11));
            u30Var.setAlpha((1.0f - a40Var.f31599c) * Math.max(0.0f, f12));
        } else {
            s30Var.setScaleX(1.0f);
            s30Var.setScaleY(1.0f);
            s30Var.setAlpha(1.0f - a40Var.f31599c);
            u30Var.setScaleX(1.0f);
            u30Var.setScaleY(1.0f);
            u30Var.setAlpha(1.0f - a40Var.f31599c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.f37618z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f37552j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (y50Var != null) {
            y50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        r40 r40Var = this.R;
        if (r40Var != null) {
            r40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.F1(android.view.View):boolean");
    }

    public final void G1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(8, getContext(), null, true);
            this.m0 = i40Var;
            i40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                this.m0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.m0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.m0.d();
        }
        this.m0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.m0.f(view, true);
    }

    public final void H1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ChatObject.Call call = this.f37513a1;
        org.telegram.ui.Components.voip.t2 t2Var = this.v;
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
        org.telegram.ui.Components.voip.t2 t2Var3 = this.f37581r;
        org.telegram.ui.Components.voip.t2 t2Var4 = this.f37534f;
        org.telegram.ui.Components.voip.t2 t2Var5 = this.f37564n;
        org.telegram.ui.Components.voip.t2 t2Var6 = this.f37586s;
        org.telegram.ui.Components.voip.t2 t2Var7 = this.f37603w;
        boolean z19 = true;
        n30 n30Var = this.f37529e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37513a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f37612x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f37513a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f37513a1.canRecordVideo()) || z13) && !r1()) {
                z16 = true;
            } else {
                z20 = true;
                z16 = false;
            }
            if (z13) {
                z17 = false;
                z18 = true;
            } else {
                z17 = !z14;
                z18 = false;
            }
            if (F3) {
                z17 = false;
                z18 = false;
            }
            n30Var.c(t2Var7, true, z10);
            n30Var.c(t2Var6, true, z10);
            n30Var.c(t2Var5, z16, z10);
            n30Var.c(t2Var4, z18, z10);
            n30Var.c(t2Var3, z20, z10);
            n30Var.c(t2Var2, z17, z10);
            n30Var.c(t2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        n30Var.c(t2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        n30Var.c(t2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        n30Var.c(t2Var3, z19, z10);
        n30Var.c(t2Var5, false, z10);
        n30Var.c(t2Var4, false, z10);
        n30Var.c(t2Var2, false, z10);
        n30Var.c(t2Var, false, z10);
    }

    public final void I1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ChatObject.Call call2 = this.f37513a1;
        org.telegram.ui.ActionBar.v0 v0Var = this.f37555k1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f37561m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            v0Var2.setVisibility(8);
            if (this.f37513a1 == null) {
                v0Var.setVisibility(8);
                return;
            }
        }
        if (this.f37558l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.f1 f1Var = this.f37566n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            f1Var.setVisibility(8);
        } else {
            f1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f37513a1;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f37615y1;
        org.telegram.ui.ActionBar.f1 f1Var3 = this.f37610x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            f1Var3.setVisibility(i13);
            if (this.f37513a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            f1Var2.setVisibility(i14);
        } else {
            f1Var3.setVisibility(8);
            f1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37513a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f37513a1;
        org.telegram.ui.ActionBar.f1 f1Var4 = this.f37578q1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            f1Var4.setVisibility(0);
        } else {
            f1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i10 = R.drawable.msg_noise_on;
        } else {
            i10 = R.drawable.msg_noise_off;
        }
        f1Var4.setIcon(i10);
        if (SharedConfig.noiseSupression) {
            i11 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i11 = R.string.VoipNoiseCancellationDisabled;
        }
        f1Var4.setSubtext(LocaleController.getString(i11));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.f1 f1Var5 = this.f37605w1;
        org.telegram.ui.ActionBar.f1 f1Var6 = this.f37570o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.f1 f1Var7 = this.f37588s1;
        org.telegram.ui.ActionBar.f1 f1Var8 = this.f37592t1;
        if (Q0) {
            f1Var5.setVisibility(0);
            f1Var6.setVisibility(0);
            if (r1()) {
                f1Var7.setVisibility(0);
                f1Var8.setVisibility(8);
            } else if (this.f37513a1.isScheduled()) {
                f1Var7.setVisibility(8);
                f1Var8.setVisibility(8);
            } else {
                f1Var7.setVisibility(0);
            }
            if (o1()) {
                f1Var7.setVisibility(8);
                f1Var6.setVisibility(8);
            }
            if (this.f37513a1.canRecordVideo() && !this.f37513a1.isScheduled() && !r1()) {
                f1Var8.setVisibility(0);
            } else {
                f1Var8.setVisibility(8);
            }
            v0Var2.setVisibility(8);
            boolean z13 = this.f37513a1.recording;
            e60 e60Var = this.f37526d1;
            e60Var.f35948f = z13;
            e60Var.d = 1.0f;
            e60Var.invalidateSelf();
            if (this.f37513a1.recording) {
                if (this.D1 == null) {
                    v20 v20Var = new v20(this, 6);
                    this.D1 = v20Var;
                    AndroidUtilities.runOnUIThread(v20Var, 1000L);
                }
                f1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                v20 v20Var2 = this.D1;
                if (v20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(v20Var2);
                    this.D1 = null;
                }
                f1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            K1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.f37513a1.canRecordVideo() || z11) && !this.f37513a1.isScheduled() && !r1())) {
                if (z11) {
                    v0Var2.setVisibility(8);
                    f1Var8.setVisibility(0);
                    f1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    f1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    f1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                    f1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                    v0Var2.setVisibility(8);
                    f1Var8.setVisibility(0);
                }
            } else {
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(8);
            }
            f1Var5.setVisibility(8);
            f1Var6.setVisibility(8);
            f1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.f1 f1Var9 = this.f37583r1;
        if (Q02 && this.f37513a1.call.can_change_join_muted && !o1()) {
            f1Var9.setVisibility(0);
        } else {
            f1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f37513a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        v0Var.I(4, z12);
        if (r1() && !this.f37513a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f37574p1.setVisibility(i12);
        int visibility = f1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && f1Var9.getVisibility() != 0 && f1Var.getVisibility() != 0 && f1Var8.getVisibility() != 0 && f1Var7.getVisibility() != 0 && f1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f37554k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f37517b1) && !r1() && this.A0 != null) {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.A0);
            if (DialogObject.isUserDialog(peerId)) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            kVar.setObject(chat);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.Z0;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && f1Var.getVisibility() == 8) {
            v0Var.setVisibility(8);
        } else {
            v0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f37552j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f37618z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.f37513a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f37513a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.f1 f1Var = this.f37588s1;
        if (z10) {
            f1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            f1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f7;
        r40 r40Var = this.R;
        if ((r40Var == null || this.f37513a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (r40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            r30 r30Var = this.f37606w2;
            AndroidUtilities.cancelRunOnUIThread(r30Var);
            r30Var.run();
            ChatObject.Call call = this.f37513a1;
            p50 p50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                p50Var.setVisibility(0);
            } else {
                p50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.f1 f1Var = this.f37605w1;
            if (isChannelOrGiga) {
                f1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                f1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.pr.f29466f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29466f;
            this.W0 = prVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * prVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f7;
        r40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        o50 o50Var = this.V;
        o50Var.setAlpha(f7);
        o50Var.setScaleX(interpolation);
        o50Var.setScaleY(interpolation);
        p40 p40Var = this.T;
        p40Var.setScaleX(f11);
        p40Var.setScaleY(f11);
        p40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f37555k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != r40Var.getVisibility()) {
            r40Var.setVisibility(i10);
            p40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.t2 t2Var = this.f37581r;
        if (t2Var != null && t2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            n30 n30Var = this.f37529e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                lh.a aVar = (lh.a) n30Var.f15470c.get(t2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    t2Var.setEnabled(true);
                }
                if (!sharedInstance.isBluetoothOn() && !sharedInstance.isBluetoothWillOn()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && sharedInstance.isSpeakerphoneOn()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12) {
                    t2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    t2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    t2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    t2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                t2Var.b(z13, z10);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f37512a0 != i10) {
                    this.f37512a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f37516b0, i10);
                }
                org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
                if (t2Var2.getVisibility() == 0) {
                    t2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
                        z14 = true;
                    }
                    t2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            t2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            lh.a aVar2 = (lh.a) n30Var.f15470c.get(t2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                t2Var.setEnabled(z11);
            }
            t2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        h60 h60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        f50 f50Var = this.O;
        if (f50Var != null && this.f37513a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f37513a1.currentSpeakingPeers.m(); i11++) {
                long j3 = this.f37513a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37513a1.currentSpeakingPeers.f(j3);
                if (!groupCallParticipant.self) {
                    a40 a40Var = this.a2;
                    a40Var.getClass();
                    if (a40Var.f31624w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0);
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
                f50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = f50Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f37513a1.call.participants_count;
            d60 d60Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((d60Var.M.r1() || d60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (h60Var = this.B1) != null) {
                h60Var.setWatchersCount(this.f37513a1.call.participants_count);
            }
            if (z10 != this.f37597u2) {
                this.f37597u2 = z10;
                f50Var.invalidate();
                float f11 = 0.0f;
                f50Var.getSubtitleTextView().setPivotX(0.0f);
                f50Var.getSubtitleTextView().setPivotY(f50Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = f50Var.getSubtitleTextView().animate();
                if (this.f37597u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f37597u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f37597u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(f50Var.getAdditionalSubtitleTextView(), this.f37597u2);
            }
        }
    }

    public final int P0() {
        p50 p50Var = this.Q;
        int childCount = p50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = p50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.f37513a1;
        s30 s30Var = this.f37531e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                s30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                s30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        f50 f50Var = this.O;
        if (!isEmpty) {
            if (!this.f37513a1.call.title.equals(f50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f37513a1.call.title, true, 180L, null);
                    f50Var.getTitleTextView().setOnClickListener(new t20(this, 8));
                } else {
                    f50Var.setTitle(this.f37513a1.call.title);
                }
                s30Var.b(this.f37513a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(f50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    f50Var.getTitleTextView().setOnClickListener(new t20(this, 9));
                } else {
                    f50Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        s30Var.b(this.Z0.title, z10);
                    } else {
                        s30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    s30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                f50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                s30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.j5 titleTextView = f50Var.getTitleTextView();
        if (this.f37513a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new f60(titleTextView));
                TextView textView = s30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new f60(textView), (Drawable) null);
                TextView nextTextView = s30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new f60(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            s30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            s30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f37513a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void Q1() {
        float f7;
        org.telegram.ui.Components.ub ubVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f37614y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            f50 f50Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), f50Var.getY() + (-this.topBulletinContainer.getTop()) + f50Var.getHeight(), f7));
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29671w;
            if (qcVar != null && (ubVar = qcVar.f29675e) != null && ubVar.getParent() != null && ubVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ubVar.setTop(z10);
            }
        }
    }

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f37616y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f37603w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.f37529e.setAlpha(1.0f - this.f37620z3.f15368e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f44650b.f15396a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        l40 l40Var = this.F;
        l40Var.setAlpha(f7);
        k40 k40Var = this.G;
        k40Var.setAlpha(f7);
        if (l40Var.getVisibility() != i10) {
            l40Var.setVisibility(i10);
            k40Var.setVisibility(i10);
            if (i10 == 8) {
                i40 i40Var = this.H;
                if (i40Var.isFocused()) {
                    i40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.fk0 fk0Var = this.K;
        if (fk0Var != null) {
            float f7 = this.C1.f44650b.f15396a * this.A3.f15368e;
            fk0Var.setAlpha(f7);
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.fk0 fk0Var2 = this.K;
            if (!fk0Var2.N0 && f7 == 1.0f) {
                fk0Var2.N0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = G3;
        n30 n30Var = this.f37529e;
        if (z10) {
            n30Var.setTranslationX(0.0f);
            n30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.f37620z3;
        if (z11) {
            n30Var.setTranslationX(bVar.f15368e * AndroidUtilities.dp(94.0f));
            n30Var.setTranslationY(0.0f);
            return;
        }
        n30Var.setTranslationX(0.0f);
        n30Var.setTranslationY(bVar.f15368e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        w30 w30Var = this.f37562m2;
        if (z10) {
            w30Var.setTranslationX(0.0f);
            w30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.f37620z3;
        if (z11) {
            w30Var.setTranslationX(bVar.f15368e * AndroidUtilities.dp(94.0f));
            w30Var.setTranslationY(0.0f);
            return;
        }
        w30Var.setTranslationX(0.0f);
        w30Var.setTranslationY(bVar.f15368e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f7 = this.B3.f15376e;
        qh.i iVar = this.C1;
        float f10 = -((iVar.c() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.f15368e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.f15368e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f37620z3.f15368e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f31599c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f44650b.f15396a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f37614y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.f37521c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom() + ((-this.A3.f15368e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        boolean z10;
        float f7 = this.A3.f15368e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f7);
        ImageView imageView = this.J;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        boolean z11 = false;
        if (f7 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f10 = 1.0f - f7;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.I;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        if (f10 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.f31804a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.f37519b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.r20 r20Var = this.f37514a3;
        if (r20Var != null) {
            r20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f37514a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f31597b;
    }

    public final void d1(boolean z10) {
        if (!this.f37524c3 && this.f37537f2) {
            if (z10) {
                this.f37524c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f37532e2);
            this.f37532e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f37537f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f37518b2.setVisibility(8);
            if (this.f37587s0) {
                this.f37587s0 = false;
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
        boolean z10;
        ChatObject.VideoParticipant videoParticipant;
        boolean z11;
        VoIPService sharedInstance;
        int i16;
        int i17;
        int i18 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        p50 p50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f37513a1;
            if (call != null && call.call.f19879id == l4.longValue()) {
                ChatObject.Call call2 = this.f37513a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j3 = this.f37591t0;
                AccountInstance accountInstance = this.d;
                if (j3 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f37547i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f37517b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f37522c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f37556k2);
                        this.f37547i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f37591t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new v20(this, 2), 3000L);
                }
                if (!this.f37595u0 && VoIPService.getSharedInstance() != null) {
                    this.f37513a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = p50Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = p50Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f37587s0 = true;
                } else {
                    O0(true);
                }
                O1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.F1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                N1(true, booleanValue);
                P1(true);
                if (z11 && ((i16 = this.F1) == 1 || i16 == 0)) {
                    k1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l10 = (Long) objArr[3];
                    long longValue = l10.longValue();
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
                                        if (dialog.f19873id == longValue) {
                                            i19 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(l10);
                                if (user != null) {
                                    if (this.f37513a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f37513a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            a40 a40Var = this.a2;
            if (a40Var.f31597b && this.f37513a1 != null) {
                boolean c10 = a40Var.c();
                ChatObject.Call call3 = this.f37513a1;
                if (call3 != null && a40Var.f31597b && (videoParticipant = a40Var.f31602e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.f37577q0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.f37513a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && a40Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            a40Var.setVisibleParticipant(true);
            O1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
        } else if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.Z0)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.Z0)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog$Builder N = org.telegram.ui.Components.e5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new z20(this, 1));
                try {
                    N.o();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19870id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f37513a1;
            if (call4 != null && chatFull.f19870id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(p50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt2 = this.E2.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.f1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt2;
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
                            f1Var.g(string2, i15, null);
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
            int childCount2 = p50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.c1 G = p50Var.G(p50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f45738a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                        if (d4Var.getParticipant() != null) {
                            d4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.f37513a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37513a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(p50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt3 = this.E2.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.f1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) childAt3;
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
                            f1Var2.g(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(p50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(p50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            u40 u40Var = this.f37617z0;
            if (u40Var != null) {
                u40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            u50 u50Var = this.f37573p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            u50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f37547i0;
        launchActivity.f33424a1.remove(this.f37601v2);
        this.f37547i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.r30 r30Var = this.E1;
        if (r30Var != null) {
            r30Var.dismiss();
        }
        this.f37587s0 = true;
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
        a40 a40Var = this.a2;
        if (a40Var != null) {
            if (this.f37579q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f37579q2);
                this.f37579q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                a40Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (a40Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(a40Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (D3 == this) {
            D3 = null;
        }
        E3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.z20.j(getContext());
        ChatObject.Call call = this.f37513a1;
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
        if (this.f37547i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f37547i0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView k12 = k1();
                if (z10) {
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
            this.f37547i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            a40 a40Var = this.a2;
            if (a40Var.f31617r != null) {
                return;
            }
            boolean z10 = G3;
            p50 p50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f37579q2 != null) {
                    p50Var.getViewTreeObserver().removeOnPreDrawListener(this.f37579q2);
                    this.f37579q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                p60 p60Var = this.f37571o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f31808c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.r20 r20Var = tVar.d;
                            if (r20Var != null) {
                                r20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.f31811e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f31833w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new v40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    p60Var.H(this.f37567n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.f31811e != null && ((videoParticipant2 = tVar2.f31833w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f31833w);
                            tVar2.b(false);
                            org.telegram.ui.Components.r20 r20Var2 = tVar2.d;
                            if (r20Var2 != null) {
                                r20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f31808c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new w40(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    p60Var.f39414r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new yt(21, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = p50Var.getViewTreeObserver();
                y40 y40Var = new y40(this, videoParticipant, !a40Var.f31597b);
                this.f37579q2 = y40Var;
                viewTreeObserver.addOnPreDrawListener(y40Var);
                return;
            }
            if (this.f37579q2 != null) {
                p50Var.getViewTreeObserver().removeOnPreDrawListener(this.f37579q2);
                this.f37579q2 = null;
            }
            if (videoParticipant != null) {
                w30 w30Var = this.f37562m2;
                if (w30Var.getVisibility() != 0) {
                    w30Var.setVisibility(0);
                    org.telegram.ui.Components.s20 s20Var = this.f37575p2;
                    s20Var.G(w30Var, false);
                    this.f37587s0 = true;
                    if (!a40Var.f31597b) {
                        ArrayList arrayList4 = s20Var.f30171e;
                        s4.c0 c0Var = (s4.c0) w30Var.getLayoutManager();
                        if (c0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    c0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = p50Var.getViewTreeObserver();
                    z40 z40Var = new z40(this, videoParticipant);
                    this.f37579q2 = z40Var;
                    viewTreeObserver2.addOnPreDrawListener(z40Var);
                    return;
                }
                a40Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(w30Var);
            } else if (p50Var.getVisibility() != 0) {
                p50Var.setVisibility(0);
                O0(false);
                this.f37587s0 = true;
                ViewTreeObserver viewTreeObserver3 = p50Var.getViewTreeObserver();
                a50 a50Var = new a50(this);
                this.f37579q2 = a50Var;
                viewTreeObserver3.addOnPreDrawListener(a50Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = p50Var.getViewTreeObserver();
                b50 b50Var = new b50(this);
                this.f37579q2 = b50Var;
                viewTreeObserver4.addOnPreDrawListener(b50Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.y3;
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
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.f19869id;
    }

    public final void j1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
            String publicUsername = ChatObject.getPublicUsername(this.Z0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = a4.a.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new di.v1(this, chatFull, z10, 5));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.f37513a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f37513a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.m0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!G3) {
            a40 a40Var = this.a2;
            if (a40Var.f31597b) {
                return a40Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f37551j0;
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
        if (!this.f37595u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f37595u0 = true;
            this.D0.addAll(this.f37513a1.visibleParticipants);
            this.E0.addAll(this.f37577q0);
            this.F0.addAll(this.f37513a1.invitedUsers);
            this.G0.addAll(this.f37513a1.shadyJoinParticipants);
            this.H0.addAll(this.f37513a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f37513a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f37513a1 = call;
                this.f37575p2.f30170c = call;
                this.a2.setGroupCall(call);
                this.f37571o2.f39410c = this.f37513a1;
            }
            mh.h hVar = this.f37521c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f37513a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f37513a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            o50 o50Var = this.V;
            if (o50Var != null && o50Var.getVisibility() == 0) {
                this.f37586s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f37605w1.setText(LocaleController.getString(i10));
                p50 p50Var = this.Q;
                p50Var.setVisibility(0);
                org.telegram.ui.ActionBar.v0 v0Var = this.l1;
                v0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(p50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o50Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j5Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(j5Var2, property2, 0.0f), ObjectAnimator.ofFloat(j5Var2, property3, 0.0f), ObjectAnimator.ofFloat(j5Var2, property, 0.0f), ObjectAnimator.ofFloat(v0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(v0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(v0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.pr.f29467g);
                animatorSet.addListener(new c50(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j3, final boolean z10) {
        if (this.f37513a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f37513a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f20016id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        j60 j60Var = j60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                        if (tLObject != null) {
                            j60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i21(j60Var, j10, b2VarArr2, user, 2));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new bi.u2(j60Var, b2VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new dm(this, b2VarArr, sendRequest, 28), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f37614y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f7 = 0.0f;
        }
        if (f7 > 0.5f) {
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
        p50 p50Var = this.Q;
        if (p50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(p50Var);
        }
        w30 w30Var = this.f37562m2;
        if (w30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(w30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        u40 u40Var = this.f37617z0;
        if (u40Var != null) {
            u40Var.b(false, false);
        } else if (this.f37537f2) {
            d1(true);
        } else if (this.a2.f31597b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        u40 u40Var = this.f37617z0;
        if (u40Var != null && VoIPService.getSharedInstance() != null) {
            u40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f37547i0;
        launchActivity.f33424a1.add(this.f37601v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.z20.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        N1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean q1() {
        if (!r1() || this.f37513a1.visibleVideoParticipants.isEmpty() || (this.f37513a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f37513a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f37513a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f37604w0) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f37547i0.O().getFragmentStack().get(this.f37547i0.O().getFragmentStack().size() - 1);
            if (n2Var instanceof co) {
                boolean P9 = ((co) n2Var).P9();
                this.f37604w0 = true;
                this.f37609x0 = true;
                bi.e4 e4Var = new bi.e4(f3Var, editTextBoldCursor, z10, b2Var, 20);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(e4Var, j3);
                return;
            }
            this.f37604w0 = true;
            this.f37609x0 = true;
            if (f3Var != null) {
                f3Var.setFocusable(true);
            } else if (b2Var != null) {
                b2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new kh(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.f31516d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f37513a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f37513a1.call;
            tL_inputGroupCall.f19886id = groupCall.f19879id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new aa(this, b2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.x1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.d4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.y1(boolean, org.telegram.ui.Cells.d4):void");
    }

    public final void z1() {
        w5 w5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (this.f37619z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(w5Var, 30L);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
