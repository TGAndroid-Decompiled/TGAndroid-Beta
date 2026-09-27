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
public final class g60 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, le.e {
    public static g60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final y5 A2;
    public final le.c A3;
    public TLObject B0;
    public final e60 B1;
    public final LongSparseIntArray B2;
    public final le.f B3;
    public final Paint C0;
    public final ph.i C1;
    public final b40 C2;
    public final le.c C3;
    public final ArrayList D0;
    public t20 D1;
    public final z30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.u30 E1;
    public LinearLayout E2;
    public final j40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final i40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.kj0 G2;
    public final g40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.kj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.sk0 K;
    public final org.telegram.ui.Components.kj0 K0;
    public final f60[] K1;
    public final View K2;
    public final k50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.p6 M;
    public final org.telegram.ui.Components.ba M0;
    public f60 M1;
    public final int[] M2;
    public final r30 N;
    public final org.telegram.ui.Components.ba N0;
    public f60 N1;
    public final v30 N2;
    public final c50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final a60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final m50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final p40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final n40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.j5 U;
    public final v50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final l50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.j5 W;
    public float W0;
    public boolean W1;
    public final v40 W2;
    public final u50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.e4 X2;
    public final org.telegram.ui.Components.qz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.u Z2;
    public int f33725a0;
    public ChatObject.Call f33726a1;
    public final y30 a2;
    public org.telegram.ui.Components.u20 f33727a3;
    public final a40 f33728b;
    public final ImageView f33729b0;
    public final boolean f33730b1;
    public final d40 f33731b2;
    public boolean f33732b3;
    public final f30 f33733c;
    public final lh.h f33734c0;
    public final String f33735c1;
    public final q40 f33736c2;
    public boolean f33737c3;
    public final AccountInstance d;
    public final int f33738d0;
    public final b60 f33739d1;
    public float f33740d2;
    public int f33741d3;
    public final l30 e;
    public final RadialProgressView f33742e0;
    public final q30 f33743e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f33744e2;
    public AnimatorSet f33745e3;
    public final org.telegram.ui.Components.voip.w2 f33746f;
    public final Drawable f33747f0;
    public final s30 f33748f1;
    public boolean f33749f2;
    public g50 f33750f3;
    public final View f33751g0;
    public final Paint f33752g1;
    public boolean f33753g2;
    public int f33754g3;
    public final org.telegram.ui.Components.voip.w2 h;
    public AnimatorSet f33755h0;
    public ValueAnimator f33756h1;
    public org.telegram.ui.Components.x40 f33757h2;
    public int f33758h3;
    public LaunchActivity f33759i0;
    public float f33760i1;
    public n50 f33761i2;
    public int f33762i3;
    public final UndoView[] f33763j0;
    public final LinearLayout f33764j1;
    public Boolean f33765j2;
    public int j3;
    public final org.telegram.ui.Cells.k f33766k0;
    public final org.telegram.ui.ActionBar.w0 f33767k1;
    public int f33768k2;
    public int f33769k3;
    public boolean f33770l0;
    public final org.telegram.ui.ActionBar.w0 l1;
    public boolean f33771l2;
    public int f33772l3;
    public org.telegram.ui.Components.l40 m0;
    public final org.telegram.ui.ActionBar.w0 f33773m1;
    public final u30 f33774m2;
    public int f33775m3;
    public final org.telegram.ui.Components.voip.w2 f33776n;
    public org.telegram.ui.Components.l40 f33777n0;
    public final org.telegram.ui.ActionBar.g1 f33778n1;
    public final org.telegram.ui.Components.yl0 f33779n2;
    public int f33780n3;
    public int f33781o0;
    public final org.telegram.ui.ActionBar.g1 f33782o1;
    public final m60 f33783o2;
    public int f33784o3;
    public r50 f33785p0;
    public final org.telegram.ui.ActionBar.g1 f33786p1;
    public final org.telegram.ui.Components.v20 f33787p2;
    public int f33788p3;
    public final ArrayList f33789q0;
    public final org.telegram.ui.ActionBar.g1 f33790q1;
    public ViewTreeObserver.OnPreDrawListener f33791q2;
    public int f33792q3;
    public final org.telegram.ui.Components.voip.w2 f33793r;
    public b50 f33794r0;
    public final org.telegram.ui.ActionBar.g1 f33795r1;
    public final org.telegram.ui.Components.voip.h f33796r2;
    public int f33797r3;
    public final org.telegram.ui.Components.voip.w2 f33798s;
    public boolean f33799s0;
    public final org.telegram.ui.ActionBar.g1 f33800s1;
    public boolean f33801s2;
    public int f33802s3;
    public long f33803t0;
    public final org.telegram.ui.ActionBar.g1 f33804t1;
    public final ArrayList f33805t2;
    public int f33806t3;
    public boolean f33807u0;
    public final org.telegram.ui.ActionBar.g1 f33808u1;
    public boolean f33809u2;
    public int f33810u3;
    public final org.telegram.ui.Components.voip.w2 v;
    public final RectF f33811v0;
    public final org.telegram.ui.ActionBar.g1 f33812v1;
    public final t20 f33813v2;
    public int f33814v3;
    public final org.telegram.ui.Components.voip.w2 f33815w;
    public boolean f33816w0;
    public final org.telegram.ui.ActionBar.g1 f33817w1;
    public final p30 f33818w2;
    public final h50 f33819w3;
    public final m30 f33820x;
    public boolean f33821x0;
    public final org.telegram.ui.ActionBar.g1 f33822x1;
    public final org.telegram.ui.Components.th f33823x2;
    public Boolean f33824x3;
    public final ImageView f33825y;
    public float f33826y0;
    public final org.telegram.ui.ActionBar.g1 f33827y1;
    public final t20 f33828y2;
    public Integer y3;
    public s40 f33829z0;
    public final LinearLayout f33830z1;
    public boolean f33831z2;
    public final le.c f33832z3;

    public g60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.e6) null, true, true);
        String string;
        int i10;
        g60 g60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f33763j0 = new UndoView[2];
        this.f33789q0 = new ArrayList();
        this.f33811v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new ph.i(new t20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new f60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f33796r2 = new org.telegram.ui.Components.voip.h();
        this.f33805t2 = new ArrayList();
        this.f33813v2 = new t20(this, 0);
        this.f33818w2 = new p30(this);
        this.f33823x2 = new org.telegram.ui.Components.th(19);
        this.f33828y2 = new t20(this, 1);
        this.f33831z2 = false;
        this.A2 = new y5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f33741d3 = -1;
        this.f33819w3 = new h50(this);
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28359f;
        this.f33832z3 = new le.c(2, this, srVar, 350L);
        this.A3 = new le.c(3, this, srVar, 220L, true);
        this.B3 = new le.f(4, this, srVar, 350L);
        this.C3 = new le.c(5, this, srVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f33726a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f33735c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f33730b1 = z10;
        this.resourcesProvider = new ai.a1();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f33738d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new k40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new v40(this);
        setOnDismissListener(new x20(this, 0));
        setDimBehindAlpha(75);
        a60 a60Var = new a60(this, launchActivity);
        this.P = a60Var;
        org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(true);
        int i11 = org.telegram.ui.ActionBar.i6.f19306qg;
        tpVar.b(org.telegram.ui.ActionBar.i6.u0(i11));
        tpVar.d();
        c50 c50Var = new c50(this, launchActivity, tpVar);
        this.O = c50Var;
        c50Var.setSubtitle("");
        c50Var.getSubtitleTextView().setVisibility(0);
        c50Var.m();
        c50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(c50Var.getAdditionalSubtitleTextView(), this.f33809u2, 1.0f, false);
        c50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.i6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.i6.f19213lg;
        c50Var.setSubtitleColor(org.telegram.ui.ActionBar.i6.u0(i12));
        c50Var.setBackButtonImage(R.drawable.ic_ab_back);
        c50Var.setOccupyStatusBar(false);
        c50Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.i6.f19137hg;
        c50Var.E(org.telegram.ui.ActionBar.i6.u0(i13), false);
        c50Var.B(org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.f19463z8), false);
        c50Var.setTitleColor(org.telegram.ui.ActionBar.i6.u0(i13));
        c50Var.setSubtitleColor(org.telegram.ui.ActionBar.i6.u0(i12));
        c50Var.setActionBarMenuOnItemClick(new j50(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
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
        VoIPService.audioLevelsCallback = new q20(this, 3);
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
        this.f33747f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = kj0Var;
        this.K0 = new org.telegram.ui.Components.kj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        k50 k50Var = new k50(this, launchActivity);
        this.L = k50Var;
        this.containerView = k50Var;
        k50Var.setClipToPadding(false);
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
            this.containerView.addView(j5Var, w7.y5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            l50 l50Var = new l50(this, launchActivity);
            this.V = l50Var;
            l50Var.setGravity(17);
            l50Var.setTextColor(-1);
            l50Var.setTypeface(AndroidUtilities.bold());
            l50Var.setTextSize(60);
            this.containerView.addView(l50Var, w7.y5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.W = j5Var2;
            j5Var2.setGravity(17);
            j5Var2.setTextColor(-1);
            j5Var2.setTypeface(AndroidUtilities.bold());
            j5Var2.setTextSize(18);
            this.containerView.addView(j5Var2, w7.y5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            v50 v50Var = new v50(this, launchActivity);
            this.U0 = v50Var;
            this.containerView.addView(v50Var, w7.y5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        m50 m50Var = new m50(this, launchActivity);
        this.Q = m50Var;
        m50Var.setClipToPadding(false);
        m50Var.setClipChildren(false);
        u50 u50Var = new u50(this);
        this.X = u50Var;
        u50Var.f43062o = srVar;
        u50Var.d = 350L;
        u50Var.f43086c = 350L;
        u50Var.e = 350L;
        u50Var.S();
        m50Var.setItemAnimator(u50Var);
        m50Var.setOnScrollListener(new e30(this));
        m50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.qz qzVar = new org.telegram.ui.Components.qz(F3 ? 6 : 2, m50Var);
        this.Y = qzVar;
        m50Var.setLayoutManager(qzVar);
        f30 f30Var = new f30(this);
        this.f33733c = f30Var;
        qzVar.z1(f30Var);
        m50Var.i(new g30(this));
        qzVar.C1();
        this.containerView.addView(m50Var, w7.y5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        m50Var.setAdapter(a60Var);
        m50Var.setTopBottomSelectorRadius(13);
        m50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.eg));
        m50Var.setOnItemClickListener(new d7(this, launchActivity, call, 14));
        m50Var.setOnItemLongClickListener(new q20(this, 4));
        if (r1()) {
            e60 e60Var = new e60(this, getContext());
            this.B1 = e60Var;
            this.containerView.addView(e60Var, w7.y5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(launchActivity);
        this.f33779n2 = yl0Var;
        this.containerView.addView(yl0Var, w7.y5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        m60 m60Var = new m60(call, this.currentAccount, this);
        this.f33783o2 = m60Var;
        yl0Var.setAdapter(m60Var);
        s4.s sVar = new s4.s(6, false);
        yl0Var.setLayoutManager(sVar);
        sVar.z1(new i30(this));
        yl0Var.setOnItemClickListener(new org.telegram.ui.Components.ml0(this) {
            public final g60 f37274b;

            {
                this.f37274b = this;
            }

            @Override
            public final void d(int i15, View view) {
                switch (r2) {
                    case 0:
                        g60 g60Var2 = this.f37274b;
                        g60Var2.getClass();
                        org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) view;
                        if (u20Var.getVideoParticipant() == null) {
                            g60Var2.e1(new ChatObject.VideoParticipant(u20Var.getParticipant(), false, false));
                            return;
                        } else {
                            g60Var2.e1(u20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        g60 g60Var3 = this.f37274b;
                        g60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            g60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f43062o = srVar;
        jVar.d = 350L;
        jVar.f43086c = 350L;
        jVar.e = 350L;
        yl0Var.setItemAnimator(new j30(this));
        yl0Var.setOnScrollListener(new k30(this));
        m60Var.H(yl0Var, false, false);
        yl0Var.setVisibility(8);
        l30 l30Var = new l30(this, launchActivity);
        this.e = l30Var;
        int u02 = org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(9);
        this.M0 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12);
        this.N0 = baVar2;
        baVar.f22943a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.f22944b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.f22943a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.f22944b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i15 = org.telegram.ui.ActionBar.i6.Ig;
        baVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.u0(i15), 38));
        baVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.u0(i15), 76));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f33793r = w2Var;
        w2Var.setCheckable(true);
        w2Var.setTextSize(12);
        l30Var.a(w2Var);
        w2Var.setOnClickListener(new r20(this, 7));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f33776n = w2Var2;
        w2Var2.setCheckable(true);
        w2Var2.setTextSize(12);
        w2Var2.d(false, false);
        w2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        w2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f33746f = w2Var3;
        w2Var3.setCheckable(true);
        w2Var3.setTextSize(12);
        w2Var3.d(false, false);
        org.telegram.ui.Components.nj0 nj0Var = new org.telegram.ui.Components.nj0(launchActivity);
        w2Var3.addView(nj0Var, w7.y5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.kj0 kj0Var2 = new org.telegram.ui.Components.kj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = kj0Var2;
        nj0Var.setAnimation(kj0Var2);
        w2Var3.setOnClickListener(new r20(this, 10));
        l30Var.a(w2Var3);
        org.telegram.ui.Components.voip.w2 w2Var4 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.h = w2Var4;
        w2Var4.setCheckable(true);
        w2Var4.setTextSize(12);
        w2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f33729b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f33725a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        w2Var4.addView(imageView, w7.y5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        w2Var4.setOnClickListener(new r20(this, 11));
        l30Var.a(w2Var4);
        l30Var.a(w2Var2);
        org.telegram.ui.Components.voip.w2 w2Var5 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f33798s = w2Var5;
        w2Var5.setTextSize(12);
        w2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        w2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final g60 f38789b;

            {
                this.f38789b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g60.o(this.f38789b, launchActivity);
                        return;
                    default:
                        g60 g60Var2 = this.f38789b;
                        g60Var2.a2.e();
                        ChatObject.Call call2 = g60Var2.f33726a1;
                        if (call2 != null && !call2.isScheduled()) {
                            g60Var2.I1();
                            g60.t1(launchActivity, new t20(g60Var2, 5), false, false);
                            return;
                        }
                        g60Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var6 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.v = w2Var6;
        w2Var6.setCheckable(true);
        w2Var6.b(true, false);
        w2Var6.setTextSize(12);
        w2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        m30 m30Var = new m30(this, launchActivity);
        this.f33820x = m30Var;
        m30Var.setAnimation(kj0Var);
        m30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.w2 w2Var7 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f33815w = w2Var7;
        w2Var7.setDrawBackground(false);
        w2Var7.setTextSize(12);
        w2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        w2Var7.addView(m30Var, w7.y5.e(50, 50, 49));
        l30Var.a(w2Var7);
        w2Var7.setOnClickListener(new o30(this));
        l30Var.a(w2Var6);
        l30Var.a(w2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f33825y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        w2Var7.addView(imageView2, w7.y5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f33726a1 != null && r1() && !this.f33726a1.isScheduled()) {
            imageView2.setVisibility(0);
            m30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f33742e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.Og));
        c50Var.setAlpha(0.0f);
        c50Var.getBackButton().setScaleX(0.9f);
        c50Var.getBackButton().setScaleY(0.9f);
        c50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        c50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        c50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        c50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.i6.u0(i13));
        this.f33767k1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new q20(this, 0));
        int i17 = org.telegram.ui.ActionBar.i6.f19156ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.e0(org.telegram.ui.ActionBar.i6.u0(i17), 6));
        w0Var.setOnClickListener(new r20(this, 0));
        w0Var.G(org.telegram.ui.ActionBar.i6.u0(i13), false);
        w0Var.G(org.telegram.ui.ActionBar.i6.u0(i13), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.i6.u0(i13));
        this.l1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.i6.e0(org.telegram.ui.ActionBar.i6.u0(i17), 6));
        w0Var2.setOnClickListener(new r20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.i6.u0(i13));
        this.f33773m1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.e0(org.telegram.ui.ActionBar.i6.u0(i17), 6));
        w0Var3.setOnClickListener(new r20(this, 2));
        q30 q30Var = new q30(this, launchActivity, launchActivity);
        this.f33743e1 = q30Var;
        r30 r30Var = new r30(launchActivity);
        this.N = r30Var;
        r30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f33752g1 = paint2;
        paint2.setColor(-12761513);
        s30 s30Var = new s30(this, getContext());
        this.f33748f1 = s30Var;
        s30Var.setTextColor(getThemedColor(i13));
        s30Var.setTextSize(1, 11.0f);
        s30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        s30Var.setMaxLines(1);
        s30Var.setGravity(17);
        s30Var.setTypeface(AndroidUtilities.bold());
        s30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        s30Var.setTag(-1);
        if (!r1()) {
            s30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f33764j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(q30Var, w7.y5.l(1.0f, 0, -2));
        linearLayout.addView(s30Var, w7.y5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(r30Var, w7.y5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(c50Var, w7.y5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f33830z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, w7.y5.n(48, 48));
        linearLayout2.addView(w0Var2, w7.y5.n(48, 48));
        linearLayout2.addView(w0Var, w7.y5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.y5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f33751g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.V5));
        this.containerView.addView(view, w7.y5.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f33763j0[i18] = new t30(this, launchActivity);
            this.f33763j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f33763j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f33763j0[i18], w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f33766k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f33767k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f33767k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.i6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.u0(i19), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.m0);
        this.f33808u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.m0);
        this.f33812v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.i6.f19416wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.i6.u0(i20), org.telegram.ui.ActionBar.i6.u0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.i6.u0(i20), org.telegram.ui.ActionBar.i6.u0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.i6.f19137hg;
        paint3.setColor(org.telegram.ui.ActionBar.i6.u0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.m0);
        this.f33786p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.m0);
        this.f33790q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f33767k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.i6.u0(org.telegram.ui.ActionBar.i6.f19120gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.f33739d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.m0);
        this.f33782o1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.f33739d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.m0);
        this.f33795r1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.f33767k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f33778n1 = e;
        b60 b60Var = new b60();
        this.f33739d1 = b60Var;
        org.telegram.ui.ActionBar.g1 e7 = this.f33767k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f33804t1 = e7;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f33767k1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, b60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.m0);
        this.f33800s1 = d15;
        b60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e10 = this.f33767k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f33822x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e11 = this.f33767k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f33827y1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.f33767k1;
        int i22 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.g1 e12 = w0Var11.e(4, i22, string);
        this.f33817w1 = e12;
        this.f33767k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.i6.u0(i19));
        this.f33767k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        int i23 = org.telegram.ui.ActionBar.i6.f19399vg;
        e12.c(org.telegram.ui.ActionBar.i6.u0(i23), org.telegram.ui.ActionBar.i6.u0(i23));
        e.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        e7.c(org.telegram.ui.ActionBar.i6.u0(i10), org.telegram.ui.ActionBar.i6.u0(i10));
        if (this.f33726a1 != null) {
            l1();
        }
        if (o1()) {
            this.f33785p0 = new r50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f33785p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.O.getTitleTextView().setOnClickListener(new r20(this, 3));
        u30 u30Var = new u30(this, launchActivity);
        this.f33774m2 = u30Var;
        v30 v30Var = new v30(this);
        this.N2 = v30Var;
        u30Var.setClipToPadding(false);
        v30Var.S();
        v30Var.f43062o = org.telegram.ui.Components.sr.f28359f;
        v30Var.d = 350L;
        v30Var.f43086c = 350L;
        v30Var.e = 350L;
        u30Var.setItemAnimator(v30Var);
        u30Var.setOnScrollListener(new w30(this));
        u30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        u30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.v20 v20Var = new org.telegram.ui.Components.v20(call, this.currentAccount, this);
        this.f33787p2 = v20Var;
        u30Var.setAdapter(v20Var);
        v20Var.F(u30Var, false);
        u30Var.setOnItemClickListener(new org.telegram.ui.Components.ml0(this) {
            public final g60 f37274b;

            {
                this.f37274b = this;
            }

            @Override
            public final void d(int i152, View view2) {
                switch (r2) {
                    case 0:
                        g60 g60Var2 = this.f37274b;
                        g60Var2.getClass();
                        org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) view2;
                        if (u20Var.getVideoParticipant() == null) {
                            g60Var2.e1(new ChatObject.VideoParticipant(u20Var.getParticipant(), false, false));
                            return;
                        } else {
                            g60Var2.e1(u20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        g60 g60Var3 = this.f37274b;
                        g60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            g60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        u30Var.setOnItemLongClickListener(new q20(this, 1));
        u30Var.setVisibility(8);
        u30Var.i(new x30());
        y30 y30Var = new y30(this, launchActivity, this.Q, u30Var, this.Y1, this.f33726a1, this);
        this.a2 = y30Var;
        y30Var.setClipChildren(false);
        v20Var.E(this.Y1, y30Var);
        if (this.f33779n2 != null) {
            this.f33783o2.G(this.Y1, y30Var);
        }
        z30 z30Var = new z30(this, launchActivity);
        this.D2 = z30Var;
        a40 a40Var = new a40(this, launchActivity, this.O, this.Q, z30Var);
        this.f33728b = a40Var;
        a40Var.setImagesLayerNum(Integer.MAX_VALUE);
        a40Var.setInvalidateWithParent(true);
        z30Var.setProfileGalleryView(a40Var);
        b40 b40Var = new b40(this, launchActivity);
        this.C2 = b40Var;
        b40Var.setVisibility(8);
        a40Var.setVisibility(0);
        a40Var.b(new c40(this));
        d40 d40Var = new d40(this, launchActivity);
        this.f33731b2 = d40Var;
        this.containerView.addView(y30Var);
        y30Var.addView(u30Var, w7.y5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.y5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.y5.e(-1, 0, 83));
        lh.h hVar = new lh.h(launchActivity);
        this.f33734c0 = hVar;
        hVar.setDelegate(new e40(this));
        hVar.setClickCellDelegate(new f40(this));
        if (this.f33726a1 != null) {
            hVar.D0(this.d.getCurrentAccount(), this.f33726a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(launchActivity, false, true, true);
        this.M = p6Var;
        p6Var.setGravity(17);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTextColor(-1);
        p6Var.b(0.4f, 320L, org.telegram.ui.Components.sr.h);
        p6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        g40 g40Var = new g40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = g40Var;
        g40Var.J = true;
        g40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f33738d0)});
        g40Var.getEditText().setLinkTextColor(-11683585);
        g40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        g40Var.getEditText().addTextChangedListener(new h40(this));
        g40Var.s();
        i40 i40Var = new i40(this, launchActivity);
        this.G = i40Var;
        this.containerView.addView(i40Var, w7.y5.c(-1.0f, -1));
        j40 j40Var = new j40(launchActivity);
        this.F = j40Var;
        j40Var.addView(g40Var, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        j40Var.addView(p6Var, w7.y5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        p6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(j40Var, w7.y5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.i6.f19147i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i24), 1, -1));
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new r20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19390v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new r20(this, 5));
        j40Var.addView(imageView3, w7.y5.e(48, 48, 85));
        j40Var.addView(imageView4, w7.y5.e(48, 48, 85));
        this.containerView.addView(d40Var);
        b40Var.addView(a40Var, w7.y5.c(-1.0f, -1));
        b40Var.addView(z30Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(b40Var, w7.y5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f33783o2.I(this.f33779n2, false);
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
            this.containerView.addView(textView, w7.y5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.ed0 ed0Var = new org.telegram.ui.Components.ed0(launchActivity);
            ed0Var.setTextColor(-1);
            ed0Var.setSelectorColor(-9598483);
            ed0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ed0Var.setItemCount(5);
            l40 l40Var = new l40(launchActivity);
            l40Var.setItemCount(5);
            l40Var.setTextColor(-1);
            l40Var.setSelectorColor(-9598483);
            l40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            m40 m40Var = new m40(launchActivity);
            m40Var.setItemCount(5);
            m40Var.setTextColor(-1);
            m40Var.setSelectorColor(-9598483);
            m40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            n40 n40Var = new n40(launchActivity);
            this.T = n40Var;
            n40Var.setLines(1);
            n40Var.setSingleLine(true);
            n40Var.setEllipsize(TextUtils.TruncateAt.END);
            n40Var.setGravity(17);
            n40Var.setTextColor(-1);
            n40Var.setTypeface(AndroidUtilities.bold());
            n40Var.setTextSize(1, 14.0f);
            this.containerView.addView(n40Var, w7.y5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            n40Var.setOnClickListener(new org.telegram.messenger.video.f(this, ed0Var, l40Var, m40Var, chat, accountInstance, inputPeer2, 1));
            p40 p40Var = new p40(launchActivity, ed0Var, l40Var, m40Var);
            this.R = p40Var;
            p40Var.setWeightSum(1.0f);
            p40Var.setOrientation(0);
            this.containerView.addView(p40Var, w7.y5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            p40Var.addView(ed0Var, w7.y5.l(0.5f, 0, 270));
            ed0Var.setMinValue(0);
            ed0Var.setMaxValue(365);
            ed0Var.setWrapSelectorWheel(false);
            ed0Var.setFormatter(new v20(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, ed0Var, l40Var, m40Var, 11);
            g60Var = this;
            ed0Var.setOnValueChangedListener(dVar);
            l40Var.setMinValue(0);
            l40Var.setMaxValue(23);
            p40Var.addView(l40Var, w7.y5.l(0.2f, 0, 270));
            l40Var.setFormatter(new org.telegram.ui.Components.voip.e1(7));
            l40Var.setOnValueChangedListener(dVar);
            m40Var.setMinValue(0);
            m40Var.setMaxValue(59);
            m40Var.setValue(0);
            m40Var.setFormatter(new org.telegram.ui.Components.voip.e1(8));
            p40Var.addView(m40Var, w7.y5.l(0.3f, 0, 270));
            m40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            ed0Var.setValue(i26 != i27 ? 1 : 0);
            m40Var.setValue(i28);
            l40Var.setValue(i29);
            org.telegram.ui.Components.e5.g(n40Var, textView, 0L, 604800L, 2, ed0Var, l40Var, m40Var);
        } else {
            g60Var = this;
        }
        q40 q40Var = new q40(g60Var, (ViewGroup) g60Var.getWindow().getDecorView(), g60Var.containerView);
        g60Var.f33736c2 = q40Var;
        q40Var.E = new r40(g60Var);
        a40Var.setPinchToZoomHelper(q40Var);
        g60Var.f33776n.setOnClickListener(new View.OnClickListener(g60Var) {
            public final g60 f38789b;

            {
                this.f38789b = g60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        g60.o(this.f38789b, launchActivity);
                        return;
                    default:
                        g60 g60Var2 = this.f38789b;
                        g60Var2.a2.e();
                        ChatObject.Call call2 = g60Var2.f33726a1;
                        if (call2 != null && !call2.isScheduled()) {
                            g60Var2.I1();
                            g60.t1(launchActivity, new t20(g60Var2, 5), false, false);
                            return;
                        }
                        g60Var2.dismiss();
                        return;
                }
            }
        });
        g60Var.L1(false);
        g60Var.I1();
        g60Var.M1(false);
        g60Var.N1(false, false);
        g60Var.B1(0.0f);
        g60Var.O1();
        g60Var.containerView.addView(new FrameLayout(launchActivity), w7.y5.e(-1, 200, 87));
        g60Var.v.setOnClickListener(new r20(g60Var, 6));
        g60Var.T0();
        w7.a6.a(g60Var.f33776n);
        w7.a6.a(g60Var.f33793r);
        w7.a6.a(g60Var.f33746f);
        w7.a6.a(g60Var.h);
        w7.a6.a(g60Var.f33815w);
        w7.a6.a(g60Var.f33798s);
        w7.a6.a(g60Var.v);
        r0.i0.m(g60Var.containerView, new q20(g60Var, 2));
    }

    public static void A(g60 g60Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = g60Var.getContext();
            int i10 = g60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.e6 e6Var = g60Var.resourcesProvider;
            ChatObject.Call call = g60Var.f33726a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            n9.p0(context, i10, inputGroupCall, str, e6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.xc(g60Var.topBulletinContainer, new ai.a1()).d0(tL_error, false);
        }
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(g60 g60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 L;
        u30 u30Var = g60Var.f33774m2;
        y30 y30Var = g60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = g60Var.f33726a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!y30Var.f29404b) {
                    if (g60Var.f33799s0) {
                        arrayList = g60Var.D0;
                    } else {
                        arrayList = g60Var.f33726a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (L = g60Var.Q.L(indexOf + g60Var.P.d)) != null) {
                        View view = L.f43005a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == g60Var.X2 && !g60Var.f33771l2) {
                                g60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < u30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) u30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(u20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            u20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                y30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void B0(g60 g60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (g60Var.f33777n0 == null) {
            org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(g60Var.getContext(), 8);
            g60Var.f33777n0 = l40Var;
            l40Var.setAlpha(0.0f);
            g60Var.f33777n0.setVisibility(4);
            g60Var.f33777n0.setShowingDuration(4000L);
            g60Var.containerView.addView(g60Var.f33777n0, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            g60Var.f33777n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            g60Var.f33777n0.d();
        }
        g60Var.f33777n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        g60Var.f33777n0.f(g60Var.f33815w, true);
    }

    public static void E(g60 g60Var) {
        Editable text = g60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(g60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        g60Var.A1(tL_textWithEntities);
    }

    public static void F0(g60 g60Var) {
        ChatObject.Call call = g60Var.f33726a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = g60Var.f33726a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(g60Var.f33726a1.call.join_muted);
            ConnectionsManager connectionsManager = g60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new c30(g60Var, 1));
        }
    }

    public static void G0(g60 g60Var, boolean z10) {
        if (g60Var.f33726a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = g60Var.f33726a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        g60Var.f33824x3 = Boolean.valueOf(z10);
        g60Var.H1(true);
        ConnectionsManager connectionsManager = g60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new c30(g60Var, 0));
    }

    public static void H0(g60 g60Var) {
        boolean z10;
        int i10;
        if (g60Var.r1()) {
            y30 y30Var = g60Var.a2;
            if (!y30Var.V && y30Var.f29404b && (F3 == g60Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = g60Var.f33765j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = g60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                g60Var.getWindow().clearFlags(1024);
                g60Var.setHideSystemVerticalInsets(false);
            } else {
                g60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                g60Var.getWindow().addFlags(1024);
            }
            g60Var.containerView.setSystemUiVisibility(i10);
            g60Var.f33765j2 = Boolean.valueOf(z10);
            g60Var.S2 = !z10;
            g60Var.containerView.requestApplyInsets();
            return;
        }
        g60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(g60 g60Var) {
        m50 m50Var = g60Var.Q;
        for (int i10 = 0; i10 < m50Var.getChildCount(); i10++) {
            View childAt = m50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.S(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(g60 g60Var) {
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
        boolean z12;
        View childAt;
        c50 c50Var = g60Var.O;
        m50 m50Var = g60Var.Q;
        int childCount = m50Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.S(m50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = m50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && c50Var.getTag() == null) || (!z10 && c50Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            c50Var.setTag(num);
            AnimatorSet animatorSet = g60Var.f33755h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                g60Var.f33755h0 = null;
            }
            if (c50Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            g60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = c50Var.getBackButton().animate();
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
            org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28359f;
            duration.setInterpolator(srVar).start();
            ViewPropertyAnimator animate2 = c50Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(srVar).start();
            ObjectAnimator objectAnimator = g60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                g60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = c50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = c50Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            g60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            g60Var.U2.setInterpolator(srVar);
            g60Var.U2.addListener(new org.telegram.ui.Components.ca(29, g60Var, z10));
            g60Var.U2.start();
            ObjectAnimator objectAnimator2 = g60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.j5 additionalSubtitleTextView = c50Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            g60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            g60Var.V2.setInterpolator(srVar);
            g60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            g60Var.f33755h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = g60Var.f33755h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c50Var, property2, f11);
            r30 r30Var = g60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r30Var, property2, f12);
            View view = g60Var.f33751g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            g60Var.f33755h0.addListener(new a50(g60Var, 1));
            g60Var.f33755h0.start();
            ImageView imageView = g60Var.a2.v;
            if (z10 && !F3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (g60Var.f33826y0 != dp4) {
            g60Var.E1(dp4);
        }
    }

    public static void N(g60 g60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!g60Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.u.c(g60Var.Y1, g60Var.a2, lVar, null, null, lVar.getParticipant(), g60Var.f33726a1, g60Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(g60 g60Var, int i10, int[] iArr) {
        if (g60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.i6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Lg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19471zg, false), g60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19195kg, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false), g60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19452yg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19471zg, false), g60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19434xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Bg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Cg, false), g60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19196kh, false);
            iArr[1] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19214lh, false);
            iArr[2] = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19233mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.i6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Mg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ng, false), g60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19195kg, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false), g60Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19157ih, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19196kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Fg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Jg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new g60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f18329id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new g60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f33759i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(18));
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

    public static void m(g60 g60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(declineconferencecallinvite, new b30(g60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(g60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = g60Var.f33726a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            g60Var.f33726a1.invitedUsersMap.remove(l4);
            g60Var.f33726a1.invitedUsersMessageIds.remove(l4);
            g60Var.O0(true);
        }
    }

    public static void n(g60 g60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = g60Var.d;
        ArrayList arrayList = g60Var.F0;
        a60 a60Var = g60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            g60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            g60Var.F1((org.telegram.ui.Cells.e4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l4 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
                if (w3Var.getUser() != null) {
                    if (g60Var.o1()) {
                        int i11 = i10 - a60Var.f31974n;
                        if (i11 >= 0 && i11 < g60Var.f33726a1.shadyJoinParticipants.size()) {
                            l4 = g60Var.f33726a1.shadyJoinParticipants.get(i10 - a60Var.f31974n);
                        } else {
                            int i12 = i10 - a60Var.f31976s;
                            if (i12 >= 0 && i12 < g60Var.f33726a1.shadyLeftParticipants.size()) {
                                l4 = g60Var.f33726a1.shadyLeftParticipants.get(i10 - a60Var.f31976s);
                            } else {
                                int i13 = i10 - a60Var.f31973f;
                                if (g60Var.f33799s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < g60Var.f33726a1.invitedUsers.size()) {
                                    l4 = g60Var.f33726a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = g60Var.f33726a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.a80 F = org.telegram.ui.Components.a80.F(g60Var.container, g60Var.resourcesProvider, w3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(g60Var) {
                                public final g60 f40382b;

                                {
                                    this.f40382b = g60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            g60.r(this.f40382b, invitedUser, l4);
                                            return;
                                        default:
                                            g60.m(this.f40382b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(g60Var) {
                                public final g60 f40382b;

                                {
                                    this.f40382b = g60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            g60.r(this.f40382b, invitedUser, l4);
                                            return;
                                        default:
                                            g60.m(this.f40382b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), g60Var.C0.getColor()));
                            F.f22606s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    g60Var.f33759i0.K0(g60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", w3Var.getUser().f18476id);
                    if (w3Var.f21792a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    g60Var.f33759i0.p0(new ProfileActivity(bundle, null));
                    g60Var.dismiss();
                }
            } else if (i10 == a60Var.f31977w) {
                if (ChatObject.isChannel(g60Var.Z0) && (chat = g60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    g60Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(g60Var.i1());
                if (chatFull != null) {
                    g60Var.f33816w0 = false;
                    Context context = g60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = g60Var.Z0;
                    ChatObject.Call call2 = g60Var.f33726a1;
                    org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    g60Var.E1 = u30Var;
                    u30Var.setOnDismissListener(new x20(g60Var, 2));
                    org.telegram.ui.Components.u30 u30Var2 = g60Var.E1;
                    u30Var2.f28775g0 = new h30(g60Var);
                    u30Var2.show();
                }
            } else if (i10 == a60Var.f31978x) {
                ChatObject.Call call3 = g60Var.f33726a1;
                if (call3 != null && call3.call != null) {
                    tg.m1 m1Var = new tg.m1(activity, g60Var.currentAccount, null, 4, new ai.a1());
                    ChatObject.Call call4 = g60Var.f33726a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new n8(4)).collect(Collectors.toSet());
                    }
                    m1Var.C0.addAll(collection);
                    m1Var.h0(false, true);
                    m1Var.A0 = new t20(g60Var, 3);
                    m1Var.h0(false, true);
                    m1Var.D0 = new ai.m0(14, g60Var, call);
                    m1Var.show();
                }
            } else if (i10 == a60Var.f31979y) {
                g60Var.v1();
            }
        }
    }

    public static void o(g60 g60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = g60Var.f33759i0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            g60Var.f33759i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                g60Var.f33763j0[0].e(1, false);
                if (g60Var.f33829z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    s40 s40Var = new s40(g60Var, activity, z10);
                    g60Var.f33829z0 = s40Var;
                    s40Var.setBottomPadding(g60Var.containerView.getPaddingBottom());
                    g60Var.container.addView(g60Var.f33829z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            g60Var.N1(true, false);
            g60Var.M1(false);
            g60Var.f33726a1.sortParticipants();
            g60Var.O0(true);
            g60Var.e.requestLayout();
        }
    }

    public static void p(g60 g60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g60Var.f33740d2 = floatValue;
        g60Var.a2.f29418n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        b40 b40Var = g60Var.C2;
        b40Var.setScaleX(f12);
        b40Var.setScaleY(f12);
        b40Var.setTranslationX((1.0f - g60Var.f33740d2) * f10);
        b40Var.setTranslationY((1.0f - g60Var.f33740d2) * f11);
        if (!g60Var.f33753g2) {
            g60Var.W2.setAlpha((int) (g60Var.f33740d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.u uVar = g60Var.Z2;
        if (uVar != null) {
            uVar.f29585a.setRoundCorners((1.0f - g60Var.f33740d2) * AndroidUtilities.dp(8.0f));
        }
        b40Var.invalidate();
        g60Var.containerView.invalidate();
        a40 a40Var = g60Var.f33728b;
        int i11 = (int) ((1.0f - g60Var.f33740d2) * i10);
        a40Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(g60 g60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = g60Var.f33726a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                g60Var.f33726a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = g60Var.f33726a1.call;
                tL_inputGroupCall.f18346id = groupCall2.f18339id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(g60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new ei.b1(g60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            g60Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                g60Var.N1(true, true);
            }
        }
    }

    public static void r(g60 g60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(declineconferencecallinvite, new b30(g60Var, 1));
        ChatObject.Call call = g60Var.f33726a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            g60Var.O0(true);
        }
    }

    public static void s(g60 g60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(g60 g60Var) {
        g60Var.Y0();
        g60Var.V0();
        g60Var.U0();
        g60Var.F.setTranslationY((-g60Var.C1.c()) + g60Var.containerView.getPaddingBottom());
        g60Var.G.invalidate();
        g60Var.Z0();
        g60Var.containerView.invalidate();
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
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
                    a2VarArr[0] = a2Var;
                    a2Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
                    if (z10) {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19164j5, false));
                    } else {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19137hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.i6.f19326rg;
                        int i11 = org.telegram.ui.ActionBar.i6.f19287pg;
                        int i12 = org.telegram.ui.ActionBar.i6.f19249ng;
                        checkBoxSquare.f22212s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f22213w = i12;
                        checkBoxSquare.invalidate();
                    }
                    a2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
                    } else if (ChatObject.isChannelOrGiga(chat)) {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
                    } else {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
                    }
                    org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
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
                    f7.addView(a2VarArr[0], w7.y5.n(-1, -2));
                    a2VarArr[0].setOnClickListener(new u20(a2VarArr, 0));
                }
                alertDialog$Builder.n(f7);
                alertDialog$Builder.f18655a.I = org.telegram.ui.ActionBar.i6.f19287pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ci.y6(call, a2VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f18655a.P0 = false;
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        c2Var.getWindow().setType(2038);
                    } else {
                        c2Var.getWindow().setType(2003);
                    }
                    c2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    c2Var.i(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19382ug, false));
                }
                c2Var.show();
                if (!z10) {
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19399vg, false));
                    }
                    c2Var.o(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19137hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(g60 g60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(g60 g60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(g60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(g60Var, updates, j3, 24));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(g60Var, hashSet, call, str, 8));
        }
    }

    public static void w(g60 g60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(g60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f18534id.add(MessagesController.getInstance(g60Var.currentAccount).getInputUser(longValue));
        }
        ai.m3 m3Var = new ai.m3(g60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(g60Var.currentAccount).isPremium()) {
            m3Var.run();
        } else {
            ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(getrequirementstocontact, new da(arrayList, arrayList2, m3Var, 13));
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

    public static void x(g60 g60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(34, g60Var.currentAccount, U.getContext(), U, new ai.a1());
        j0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static void y(g60 g60Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            g60Var.x1(null, j3, 3);
            return;
        }
        org.telegram.ui.Components.e5.f0(g60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) g60Var.f33759i0.O().getFragmentStack().get(g60Var.f33759i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.l1 z(g60 g60Var, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f42185a;
        i0.b f7 = i1Var.f(647);
        i0.b f10 = i1Var.f(8);
        g40 g40Var = g60Var.H;
        if (!g40Var.N && !g40Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = g40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = g60Var.f33731b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (g40Var.getEmojiView() != null) {
            g40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (g60Var.S2) {
            ViewGroup viewGroup = g60Var.containerView;
            int i10 = g60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = g60Var.containerView;
            int i11 = g60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f10579a + i11, f7.f10580b, i11 + f7.f10581c, f7.d);
        }
        g60Var.containerView.requestLayout();
        if (max == 0 && !g40Var.N && !g40Var.e && !g40Var.O) {
            g40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.sk0 sk0Var = g60Var.K;
            if (sk0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                sk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.sk0 sk0Var2 = new org.telegram.ui.Components.sk0(1, g60Var.currentAccount, g60Var.getContext(), R, g60Var.resourcesProvider);
                    g60Var.K = sk0Var2;
                    sk0Var2.setDelegate(new i50(g60Var));
                    g60Var.containerView.addView(g60Var.K, w7.y5.e(-2, 52, 81));
                    g60Var.K.p(null, null, false);
                    g60Var.G.bringToFront();
                    g60Var.F.bringToFront();
                    sk0Var = g60Var.K;
                }
            }
            g60Var.K = sk0Var;
        }
        g40Var.H(f10.d, false);
        g60Var.C1.i(l1Var);
        return r0.l1.f42184b;
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j3;
        this.H.setText("");
        ChatObject.Call call = this.f33726a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f33726a1;
            long j10 = call2.call.f18339id;
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
        y30 y30Var = this.a2;
        if (y30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = y30Var.f29406c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.i6.f19175jg;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.i6.f19120gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.i6.w0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f33767k1.B(-14472653);
        this.f33747f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19195kg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19363tg, false), f7, 1.0f);
        r50 r50Var = this.f33785p0;
        if (r50Var != null) {
            r50Var.f37000j = offsetColor2;
            q50 q50Var = r50Var.f36998g;
            if (q50Var != null) {
                q50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        m50 m50Var = this.Q;
        m50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f33815w.invalidate();
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Dg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Eg, false), f7, 1.0f);
        this.f33798s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19213lg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19268og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19232mg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19326rg, false), f7, 1.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.resourcesProvider);
        int childCount = m50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = m50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (o1()) {
                    x3Var.a(v02, v02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                c50 c50Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (c50Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.i6.f19326rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.i6.f19232mg;
                    }
                    e4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    if (c50Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.i6.f19326rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f19232mg;
                    }
                    w3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        m50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        m50 m50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 L;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f33726a1;
        if (call != null && (m50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            y30 y30Var = this.a2;
            if (!y30Var.f29404b) {
                if (this.f33799s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f33726a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (L = m50Var.L(indexOf + this.P.d)) != null) {
                    View view = L.f43005a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f33771l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    u30 u30Var = this.f33774m2;
                    if (i10 >= u30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) u30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(u20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        u20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            y30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f33832z3.e;
            l30 l30Var = this.e;
            l30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f33774m2.invalidate();
            this.containerView.invalidate();
            l30Var.invalidate();
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

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f33754g3 = i10;
        this.f33758h3 = i11;
        this.f33762i3 = i12;
        this.j3 = i13;
        this.f33769k3 = i14;
        this.f33772l3 = i15;
        this.f33775m3 = i16;
        this.f33780n3 = i17;
        this.f33784o3 = i18;
        this.f33788p3 = i19;
        this.f33792q3 = i20;
        this.f33797r3 = i21;
        this.f33802s3 = i22;
        this.f33806t3 = i23;
        this.f33810u3 = i24;
        this.f33814v3 = i25;
    }

    public final void E1(float f7) {
        m50 m50Var;
        int dp;
        int i10;
        float f10;
        this.f33826y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) m50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        v50 v50Var = this.U0;
        y30 y30Var = this.a2;
        s30 s30Var = this.f33748f1;
        q30 q30Var = this.f33743e1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (v50Var != null) {
                v50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            q30Var.setScaleX(Math.max(0.9f, f11));
            q30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            q30Var.setAlpha((1.0f - y30Var.f29406c) * Math.max(0.0f, f12));
            s30Var.setScaleX(Math.max(0.9f, f11));
            s30Var.setScaleY(Math.max(0.9f, f11));
            s30Var.setAlpha((1.0f - y30Var.f29406c) * Math.max(0.0f, f12));
        } else {
            q30Var.setScaleX(1.0f);
            q30Var.setScaleY(1.0f);
            q30Var.setAlpha(1.0f - y30Var.f29406c);
            s30Var.setScaleX(1.0f);
            s30Var.setScaleY(1.0f);
            s30Var.setAlpha(1.0f - y30Var.f29406c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.f33830z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f33764j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (v50Var != null) {
            v50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        p40 p40Var = this.R;
        if (p40Var != null) {
            p40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.F1(android.view.View):boolean");
    }

    public final void G1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(8, getContext(), null, true);
            this.m0 = l40Var;
            l40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
        ChatObject.Call call = this.f33726a1;
        org.telegram.ui.Components.voip.w2 w2Var = this.v;
        org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
        org.telegram.ui.Components.voip.w2 w2Var3 = this.f33793r;
        org.telegram.ui.Components.voip.w2 w2Var4 = this.f33746f;
        org.telegram.ui.Components.voip.w2 w2Var5 = this.f33776n;
        org.telegram.ui.Components.voip.w2 w2Var6 = this.f33798s;
        org.telegram.ui.Components.voip.w2 w2Var7 = this.f33815w;
        boolean z19 = true;
        l30 l30Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33726a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f33824x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f33726a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f33726a1.canRecordVideo()) || z13) && !r1()) {
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
            l30Var.c(w2Var7, true, z10);
            l30Var.c(w2Var6, true, z10);
            l30Var.c(w2Var5, z16, z10);
            l30Var.c(w2Var4, z18, z10);
            l30Var.c(w2Var3, z20, z10);
            l30Var.c(w2Var2, z17, z10);
            l30Var.c(w2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        l30Var.c(w2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        l30Var.c(w2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        l30Var.c(w2Var3, z19, z10);
        l30Var.c(w2Var5, false, z10);
        l30Var.c(w2Var4, false, z10);
        l30Var.c(w2Var2, false, z10);
        l30Var.c(w2Var, false, z10);
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
        ChatObject.Call call2 = this.f33726a1;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33767k1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33773m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.f33726a1 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f33770l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f33778n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f33726a1;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f33827y1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f33822x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            g1Var3.setVisibility(i13);
            if (this.f33726a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            g1Var2.setVisibility(i14);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33726a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f33726a1;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f33790q1;
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
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f33817w1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.f33782o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f33800s1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f33804t1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.f33726a1.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.f33726a1.canRecordVideo() && !this.f33726a1.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z13 = this.f33726a1.recording;
            b60 b60Var = this.f33739d1;
            b60Var.f32248f = z13;
            b60Var.d = 1.0f;
            b60Var.invalidateSelf();
            if (this.f33726a1.recording) {
                if (this.D1 == null) {
                    t20 t20Var = new t20(this, 6);
                    this.D1 = t20Var;
                    AndroidUtilities.runOnUIThread(t20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                t20 t20Var2 = this.D1;
                if (t20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t20Var2);
                    this.D1 = null;
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
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.f33726a1.canRecordVideo() || z11) && !this.f33726a1.isScheduled() && !r1())) {
                if (z11) {
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
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f33795r1;
        if (Q02 && this.f33726a1.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f33726a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        w0Var.I(4, z12);
        if (r1() && !this.f33726a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f33786p1.setVisibility(i12);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f33766k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f33730b1) && !r1() && this.A0 != null) {
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
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && g1Var.getVisibility() == 8) {
            w0Var.setVisibility(8);
        } else {
            w0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f33764j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f33830z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.f33726a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f33726a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f33800s1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f7;
        p40 p40Var = this.R;
        if ((p40Var == null || this.f33726a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (p40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            p30 p30Var = this.f33818w2;
            AndroidUtilities.cancelRunOnUIThread(p30Var);
            p30Var.run();
            ChatObject.Call call = this.f33726a1;
            m50 m50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                m50Var.setVisibility(0);
            } else {
                m50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f33817w1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.sr.f28359f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28359f;
            this.W0 = srVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * srVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f7;
        p40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        l50 l50Var = this.V;
        l50Var.setAlpha(f7);
        l50Var.setScaleX(interpolation);
        l50Var.setScaleY(interpolation);
        n40 n40Var = this.T;
        n40Var.setScaleX(f11);
        n40Var.setScaleY(f11);
        n40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f33767k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != p40Var.getVisibility()) {
            p40Var.setVisibility(i10);
            n40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.w2 w2Var = this.f33793r;
        if (w2Var != null && w2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            l30 l30Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                kh.a aVar = (kh.a) l30Var.f13638c.get(w2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    w2Var.setEnabled(true);
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
                    w2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    w2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    w2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    w2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                w2Var.b(z13, z10);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f33725a0 != i10) {
                    this.f33725a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f33729b0, i10);
                }
                org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
                if (w2Var2.getVisibility() == 0) {
                    w2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
                        z14 = true;
                    }
                    w2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            w2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            kh.a aVar2 = (kh.a) l30Var.f13638c.get(w2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                w2Var.setEnabled(z11);
            }
            w2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        e60 e60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        c50 c50Var = this.O;
        if (c50Var != null && this.f33726a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f33726a1.currentSpeakingPeers.m(); i11++) {
                long j3 = this.f33726a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33726a1.currentSpeakingPeers.f(j3);
                if (!groupCallParticipant.self) {
                    y30 y30Var = this.a2;
                    y30Var.getClass();
                    if (y30Var.f29430w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.u51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.u51(AndroidUtilities.bold()), 0);
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
                c50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = c50Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f33726a1.call.participants_count;
            a60 a60Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((a60Var.M.r1() || a60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (e60Var = this.B1) != null) {
                e60Var.setWatchersCount(this.f33726a1.call.participants_count);
            }
            if (z10 != this.f33809u2) {
                this.f33809u2 = z10;
                c50Var.invalidate();
                float f11 = 0.0f;
                c50Var.getSubtitleTextView().setPivotX(0.0f);
                c50Var.getSubtitleTextView().setPivotY(c50Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = c50Var.getSubtitleTextView().animate();
                if (this.f33809u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f33809u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f33809u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(c50Var.getAdditionalSubtitleTextView(), this.f33809u2);
            }
        }
    }

    public final int P0() {
        m50 m50Var = this.Q;
        int childCount = m50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = m50Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.f33726a1;
        q30 q30Var = this.f33743e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                q30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                q30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        c50 c50Var = this.O;
        if (!isEmpty) {
            if (!this.f33726a1.call.title.equals(c50Var.getTitle())) {
                if (z10) {
                    this.O.K(this.f33726a1.call.title, true, 180L, null);
                    c50Var.getTitleTextView().setOnClickListener(new r20(this, 8));
                } else {
                    c50Var.setTitle(this.f33726a1.call.title);
                }
                q30Var.b(this.f33726a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(c50Var.getTitle())) {
                if (z10) {
                    this.O.K(this.Z0.title, true, 180L, null);
                    c50Var.getTitleTextView().setOnClickListener(new r20(this, 9));
                } else {
                    c50Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        q30Var.b(this.Z0.title, z10);
                    } else {
                        q30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    q30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                c50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                q30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.j5 titleTextView = c50Var.getTitleTextView();
        if (this.f33726a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new c60(titleTextView));
                TextView textView = q30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new c60(textView), (Drawable) null);
                TextView nextTextView = q30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new c60(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            q30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            q30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f33726a1;
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
            float f10 = this.f33826y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            c50 c50Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), c50Var.getY() + (-this.topBulletinContainer.getTop()) + c50Var.getHeight(), f7));
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
            if (qcVar != null && (ubVar = qcVar.e) != null && ubVar.getParent() != null && ubVar.getParent().getParent() == this.topBulletinContainer) {
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
            AndroidUtilities.cancelRunOnUIThread(this.f33828y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f33815w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f33832z3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f41338b.f14226a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        j40 j40Var = this.F;
        j40Var.setAlpha(f7);
        i40 i40Var = this.G;
        i40Var.setAlpha(f7);
        if (j40Var.getVisibility() != i10) {
            j40Var.setVisibility(i10);
            i40Var.setVisibility(i10);
            if (i10 == 8) {
                g40 g40Var = this.H;
                if (g40Var.isFocused()) {
                    g40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.sk0 sk0Var = this.K;
        if (sk0Var != null) {
            float f7 = this.C1.f41338b.f14226a * this.A3.e;
            sk0Var.setAlpha(f7);
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
            org.telegram.ui.Components.sk0 sk0Var2 = this.K;
            if (!sk0Var2.N0 && f7 == 1.0f) {
                sk0Var2.N0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = G3;
        l30 l30Var = this.e;
        if (z10) {
            l30Var.setTranslationX(0.0f);
            l30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.c cVar = this.f33832z3;
        if (z11) {
            l30Var.setTranslationX(cVar.e * AndroidUtilities.dp(94.0f));
            l30Var.setTranslationY(0.0f);
            return;
        }
        l30Var.setTranslationX(0.0f);
        l30Var.setTranslationY(cVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        u30 u30Var = this.f33774m2;
        if (z10) {
            u30Var.setTranslationX(0.0f);
            u30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.c cVar = this.f33832z3;
        if (z11) {
            u30Var.setTranslationX(cVar.e * AndroidUtilities.dp(94.0f));
            u30Var.setTranslationY(0.0f);
            return;
        }
        u30Var.setTranslationX(0.0f);
        u30Var.setTranslationY(cVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f7 = this.B3.e;
        ph.i iVar = this.C1;
        float f10 = -((iVar.c() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f33832z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f29406c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f41338b.f14226a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f33826y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        lh.h hVar = this.f33734c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        boolean z10;
        float f7 = this.A3.e;
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
        org.telegram.ui.Components.voip.u uVar = this.Z2;
        if (uVar != null) {
            uVar.f29585a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.u uVar2 = this.Z2;
            uVar2.h = false;
            uVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.X2;
        if (e4Var != null && !this.f33732b3 && e4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.X2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.u20 u20Var = this.f33727a3;
        if (u20Var != null) {
            u20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f33727a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f29404b;
    }

    public final void d1(boolean z10) {
        if (!this.f33737c3 && this.f33749f2) {
            if (z10) {
                this.f33737c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f33744e2);
            this.f33744e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f33749f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f33731b2.setVisibility(8);
            if (this.f33799s0) {
                this.f33799s0 = false;
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
        m50 m50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f33726a1;
            if (call != null && call.call.f18339id == l4.longValue()) {
                ChatObject.Call call2 = this.f33726a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j3 = this.f33803t0;
                AccountInstance accountInstance = this.d;
                if (j3 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f33759i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f33730b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f33735c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f33768k2);
                        this.f33759i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f33803t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new t20(this, 2), 3000L);
                }
                if (!this.f33807u0 && VoIPService.getSharedInstance() != null) {
                    this.f33726a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = m50Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = m50Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f33799s0 = true;
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
                                        if (dialog.f18333id == longValue) {
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
                                    if (this.f33726a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f33726a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            y30 y30Var = this.a2;
            if (y30Var.f29404b && this.f33726a1 != null) {
                boolean c10 = y30Var.c();
                ChatObject.Call call3 = this.f33726a1;
                if (call3 != null && y30Var.f29404b && (videoParticipant = y30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.f33789q0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.f33726a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && y30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            y30Var.setVisibleParticipant(true);
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
                N.j(new x20(this, 1));
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
            if (chatFull.f18330id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f33726a1;
            if (call4 != null && chatFull.f18330id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(m50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt2 = this.E2.getChildAt(i19);
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
            int childCount2 = m50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.c1 H = m50Var.H(m50Var.getChildAt(i19));
                if (H != null) {
                    View view = H.f43005a;
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
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.f33726a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33726a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(m50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt3 = this.E2.getChildAt(i19);
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
            AndroidUtilities.updateVisibleRows(m50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(m50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            s40 s40Var = this.f33829z0;
            if (s40Var != null) {
                s40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            r50 r50Var = this.f33785p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            r50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f33759i0;
        launchActivity.f31103a1.remove(this.f33813v2);
        this.f33759i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.u30 u30Var = this.E1;
        if (u30Var != null) {
            u30Var.dismiss();
        }
        this.f33799s0 = true;
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
        y30 y30Var = this.a2;
        if (y30Var != null) {
            if (this.f33791q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f33791q2);
                this.f33791q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).f();
                y30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (y30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(y30Var);
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
        org.telegram.ui.Components.c30.j(getContext());
        ChatObject.Call call = this.f33726a1;
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
        if (this.f33759i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f33759i0.getSystemService("audio");
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
            this.f33759i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            y30 y30Var = this.a2;
            if (y30Var.f29423r != null) {
                return;
            }
            boolean z10 = G3;
            m50 m50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f33791q2 != null) {
                    m50Var.getViewTreeObserver().removeOnPreDrawListener(this.f33791q2);
                    this.f33791q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                m60 m60Var = this.f33783o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = uVar.f29589c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.u20 u20Var = uVar.d;
                            if (u20Var != null) {
                                u20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = uVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(uVar.f29613w);
                            uVar.b(false);
                            uVar.animate().alpha(0.0f).setListener(new t40(this, uVar));
                        }
                    }
                    this.P2 = false;
                    m60Var.H(this.f33779n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) arrayList3.get(i12);
                        if (uVar2.e != null && ((videoParticipant2 = uVar2.f29613w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(uVar2.f29613w);
                            uVar2.b(false);
                            org.telegram.ui.Components.u20 u20Var2 = uVar2.d;
                            if (u20Var2 != null) {
                                u20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = uVar2.f29589c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            uVar2.animate().alpha(0.0f).setListener(new u40(this, uVar2));
                        }
                    }
                    this.P2 = true;
                    m60Var.f35527r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new tv(16, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = m50Var.getViewTreeObserver();
                w40 w40Var = new w40(this, videoParticipant, !y30Var.f29404b);
                this.f33791q2 = w40Var;
                viewTreeObserver.addOnPreDrawListener(w40Var);
                return;
            }
            if (this.f33791q2 != null) {
                m50Var.getViewTreeObserver().removeOnPreDrawListener(this.f33791q2);
                this.f33791q2 = null;
            }
            if (videoParticipant != null) {
                u30 u30Var = this.f33774m2;
                if (u30Var.getVisibility() != 0) {
                    u30Var.setVisibility(0);
                    org.telegram.ui.Components.v20 v20Var = this.f33787p2;
                    v20Var.G(u30Var, false);
                    this.f33799s0 = true;
                    if (!y30Var.f29404b) {
                        ArrayList arrayList4 = v20Var.e;
                        s4.c0 c0Var = (s4.c0) u30Var.getLayoutManager();
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
                    ViewTreeObserver viewTreeObserver2 = m50Var.getViewTreeObserver();
                    x40 x40Var = new x40(this, videoParticipant);
                    this.f33791q2 = x40Var;
                    viewTreeObserver2.addOnPreDrawListener(x40Var);
                    return;
                }
                y30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(u30Var);
            } else if (m50Var.getVisibility() != 0) {
                m50Var.setVisibility(0);
                O0(false);
                this.f33799s0 = true;
                ViewTreeObserver viewTreeObserver3 = m50Var.getViewTreeObserver();
                y40 y40Var = new y40(this);
                this.f33791q2 = y40Var;
                viewTreeObserver3.addOnPreDrawListener(y40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = m50Var.getViewTreeObserver();
                z40 z40Var = new z40(this);
                this.f33791q2 = z40Var;
                viewTreeObserver4.addOnPreDrawListener(z40Var);
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
        return chat.f18329id;
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
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.v1(this, chatFull, z10, 5));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.f33726a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f33726a1.getInputGroupCall();
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
            y30 y30Var = this.a2;
            if (y30Var.f29404b) {
                return y30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f33763j0;
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
        if (!this.f33807u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f33807u0 = true;
            this.D0.addAll(this.f33726a1.visibleParticipants);
            this.E0.addAll(this.f33789q0);
            this.F0.addAll(this.f33726a1.invitedUsers);
            this.G0.addAll(this.f33726a1.shadyJoinParticipants);
            this.H0.addAll(this.f33726a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f33726a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f33726a1 = call;
                this.f33787p2.f29015c = call;
                this.a2.setGroupCall(call);
                this.f33783o2.f35524c = this.f33726a1;
            }
            lh.h hVar = this.f33734c0;
            if (hVar != null) {
                hVar.D0(this.d.getCurrentAccount(), this.f33726a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f33726a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            l50 l50Var = this.V;
            if (l50Var != null && l50Var.getVisibility() == 0) {
                this.f33798s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f33817w1.setText(LocaleController.getString(i10));
                m50 m50Var = this.Q;
                m50Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.l1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l50Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j5Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(j5Var2, property2, 0.0f), ObjectAnimator.ofFloat(j5Var2, property3, 0.0f), ObjectAnimator.ofFloat(j5Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.sr.f28360g);
                animatorSet.addListener(new a50(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j3, final boolean z10) {
        if (this.f33726a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f33726a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f18476id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        g60 g60Var = g60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject != null) {
                            g60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y21(g60Var, j10, c2VarArr2, user, 2));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.h3(g60Var, c2VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ym(this, c2VarArr, sendRequest, 27), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f33826y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
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
        m50 m50Var = this.Q;
        if (m50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(m50Var);
        }
        u30 u30Var = this.f33774m2;
        if (u30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(u30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        s40 s40Var = this.f33829z0;
        if (s40Var != null) {
            s40Var.b(false, false);
        } else if (this.f33749f2) {
            d1(true);
        } else if (this.a2.f29404b) {
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
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
        s40 s40Var = this.f33829z0;
        if (s40Var != null && VoIPService.getSharedInstance() != null) {
            s40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f33759i0;
        launchActivity.f31103a1.add(this.f33813v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.c30.j(getContext());
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
        if (!r1() || this.f33726a1.visibleVideoParticipants.isEmpty() || (this.f33726a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f33726a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f33726a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f33816w0) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f33759i0.O().getFragmentStack().get(this.f33759i0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof xn) {
                boolean P9 = ((xn) o2Var).P9();
                this.f33816w0 = true;
                this.f33821x0 = true;
                ai.s4 s4Var = new ai.s4(g3Var, editTextBoldCursor, z10, c2Var, 21);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(s4Var, j3);
                return;
            }
            this.f33816w0 = true;
            this.f33821x0 = true;
            if (g3Var != null) {
                g3Var.setFocusable(true);
            } else if (c2Var != null) {
                c2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new oh(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.k1.f29363d0.V) {
            org.telegram.ui.Components.voip.k1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f33726a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f33726a1.call;
            tL_inputGroupCall.f18346id = groupCall.f18339id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new da(this, c2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.x1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.e4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.y1(boolean, org.telegram.ui.Cells.e4):void");
    }

    public final void z1() {
        y5 y5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(y5Var);
        if (this.f33831z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(y5Var, 30L);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
