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
public final class k60 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, le.d {
    public static k60 D3;
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
    public final i60 B1;
    public final LongSparseIntArray B2;
    public final le.e B3;
    public final Paint C0;
    public final ph.i C1;
    public final f40 C2;
    public final le.b C3;
    public final ArrayList D0;
    public x20 D1;
    public final d40 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.r30 E1;
    public LinearLayout E2;
    public final n40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final m40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.yi0 G2;
    public final k40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.yi0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.gk0 K;
    public final org.telegram.ui.Components.yi0 K0;
    public final j60[] K1;
    public final View K2;
    public final o50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.n6 M;
    public final org.telegram.ui.Components.z9 M0;
    public j60 M1;
    public final int[] M2;
    public final v30 N;
    public final org.telegram.ui.Components.z9 N0;
    public j60 N1;
    public final z30 N2;
    public final g50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final e60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final q50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final t40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final r40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.k5 U;
    public final z50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final p50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.k5 W;
    public float W0;
    public boolean W1;
    public final z40 W2;
    public final y50 X;
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
    public org.telegram.ui.Components.voip.u Z2;
    public int f35011a0;
    public ChatObject.Call f35012a1;
    public final c40 a2;
    public org.telegram.ui.Components.r20 f35013a3;
    public final e40 f35014b;
    public final ImageView f35015b0;
    public final boolean f35016b1;
    public final h40 f35017b2;
    public boolean f35018b3;
    public final j30 f35019c;
    public final lh.h f35020c0;
    public final String f35021c1;
    public final u40 f35022c2;
    public boolean f35023c3;
    public final AccountInstance d;
    public final int f35024d0;
    public final f60 f35025d1;
    public float f35026d2;
    public int f35027d3;
    public final p30 e;
    public final RadialProgressView f35028e0;
    public final u30 f35029e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f35030e2;
    public AnimatorSet f35031e3;
    public final org.telegram.ui.Components.voip.v2 f35032f;
    public final Drawable f35033f0;
    public final w30 f35034f1;
    public boolean f35035f2;
    public k50 f35036f3;
    public final View f35037g0;
    public final Paint f35038g1;
    public boolean f35039g2;
    public int f35040g3;
    public final org.telegram.ui.Components.voip.v2 h;
    public AnimatorSet f35041h0;
    public ValueAnimator f35042h1;
    public org.telegram.ui.Components.u40 f35043h2;
    public int f35044h3;
    public LaunchActivity f35045i0;
    public float f35046i1;
    public r50 f35047i2;
    public int f35048i3;
    public final UndoView[] f35049j0;
    public final LinearLayout f35050j1;
    public Boolean f35051j2;
    public int j3;
    public final org.telegram.ui.Cells.k f35052k0;
    public final org.telegram.ui.ActionBar.w0 f35053k1;
    public int f35054k2;
    public int f35055k3;
    public boolean f35056l0;
    public final org.telegram.ui.ActionBar.w0 l1;
    public boolean f35057l2;
    public int f35058l3;
    public org.telegram.ui.Components.i40 m0;
    public final org.telegram.ui.ActionBar.w0 f35059m1;
    public final y30 f35060m2;
    public int f35061m3;
    public final org.telegram.ui.Components.voip.v2 f35062n;
    public org.telegram.ui.Components.i40 f35063n0;
    public final org.telegram.ui.ActionBar.g1 f35064n1;
    public final org.telegram.ui.Components.ml0 f35065n2;
    public int f35066n3;
    public int f35067o0;
    public final org.telegram.ui.ActionBar.g1 f35068o1;
    public final q60 f35069o2;
    public int f35070o3;
    public v50 f35071p0;
    public final org.telegram.ui.ActionBar.g1 f35072p1;
    public final org.telegram.ui.Components.s20 f35073p2;
    public int f35074p3;
    public final ArrayList f35075q0;
    public final org.telegram.ui.ActionBar.g1 f35076q1;
    public ViewTreeObserver.OnPreDrawListener f35077q2;
    public int f35078q3;
    public final org.telegram.ui.Components.voip.v2 f35079r;
    public f50 f35080r0;
    public final org.telegram.ui.ActionBar.g1 f35081r1;
    public final org.telegram.ui.Components.voip.h f35082r2;
    public int f35083r3;
    public final org.telegram.ui.Components.voip.v2 f35084s;
    public boolean f35085s0;
    public final org.telegram.ui.ActionBar.g1 f35086s1;
    public boolean f35087s2;
    public int f35088s3;
    public long f35089t0;
    public final org.telegram.ui.ActionBar.g1 f35090t1;
    public final ArrayList f35091t2;
    public int f35092t3;
    public boolean f35093u0;
    public final org.telegram.ui.ActionBar.g1 f35094u1;
    public boolean f35095u2;
    public int f35096u3;
    public final org.telegram.ui.Components.voip.v2 v;
    public final RectF f35097v0;
    public final org.telegram.ui.ActionBar.g1 f35098v1;
    public final x20 f35099v2;
    public int f35100v3;
    public final org.telegram.ui.Components.voip.v2 f35101w;
    public boolean f35102w0;
    public final org.telegram.ui.ActionBar.g1 f35103w1;
    public final t30 f35104w2;
    public final l50 f35105w3;
    public final q30 f35106x;
    public boolean f35107x0;
    public final org.telegram.ui.ActionBar.g1 f35108x1;
    public final org.telegram.ui.Components.sh f35109x2;
    public Boolean f35110x3;
    public final ImageView f35111y;
    public float f35112y0;
    public final org.telegram.ui.ActionBar.g1 f35113y1;
    public final x20 f35114y2;
    public Integer y3;
    public w40 f35115z0;
    public final LinearLayout f35116z1;
    public boolean f35117z2;
    public final le.b f35118z3;

    public k60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, true, true);
        int i10;
        k60 k60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f35049j0 = new UndoView[2];
        this.f35075q0 = new ArrayList();
        this.f35097v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new ph.i(new x20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new j60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f35082r2 = new org.telegram.ui.Components.voip.h();
        this.f35091t2 = new ArrayList();
        this.f35099v2 = new x20(this, 0);
        this.f35104w2 = new t30(this);
        this.f35109x2 = new org.telegram.ui.Components.sh(17);
        this.f35114y2 = new x20(this, 1);
        this.f35117z2 = false;
        this.A2 = new w5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f35027d3 = -1;
        this.f35105w3 = new l50(this);
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
        this.f35118z3 = new le.b(2, this, qrVar, 350L);
        this.A3 = new le.b(3, this, qrVar, 220L, true);
        this.B3 = new le.e(4, this, qrVar, 350L);
        this.C3 = new le.b(5, this, qrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f35012a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f35021c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f35016b1 = z10;
        this.resourcesProvider = new ai.a1();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f35024d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new o40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new z40(this);
        setOnDismissListener(new b30(this, 0));
        setDimBehindAlpha(75);
        e60 e60Var = new e60(this, launchActivity);
        this.P = e60Var;
        org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(true);
        int i11 = org.telegram.ui.ActionBar.j6.f19109qg;
        rpVar.b(org.telegram.ui.ActionBar.j6.u0(i11));
        rpVar.d();
        g50 g50Var = new g50(this, launchActivity, rpVar);
        this.O = g50Var;
        g50Var.setSubtitle("");
        g50Var.getSubtitleTextView().setVisibility(0);
        g50Var.l();
        g50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(g50Var.getAdditionalSubtitleTextView(), this.f35095u2, 1.0f, false);
        g50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.j6.f19018lg;
        g50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        g50Var.setBackButtonImage(R.drawable.ic_ab_back);
        g50Var.setOccupyStatusBar(false);
        g50Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.j6.f18942hg;
        g50Var.B(org.telegram.ui.ActionBar.j6.u0(i13), false);
        g50Var.A(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f19265z8), false);
        g50Var.setTitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        g50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        g50Var.setActionBarMenuOnItemClick(new n50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new u20(this, 3);
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
        this.f35033f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = yi0Var;
        this.K0 = new org.telegram.ui.Components.yi0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        o50 o50Var = new o50(this, launchActivity);
        this.L = o50Var;
        this.containerView = o50Var;
        o50Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.U = k5Var;
            k5Var.setGravity(17);
            k5Var.setTextColor(-1);
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.setTextSize(18);
            k5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(k5Var, w7.x5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            p50 p50Var = new p50(this, launchActivity);
            this.V = p50Var;
            p50Var.setGravity(17);
            p50Var.setTextColor(-1);
            p50Var.setTypeface(AndroidUtilities.bold());
            p50Var.setTextSize(60);
            this.containerView.addView(p50Var, w7.x5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.W = k5Var2;
            k5Var2.setGravity(17);
            k5Var2.setTextColor(-1);
            k5Var2.setTypeface(AndroidUtilities.bold());
            k5Var2.setTextSize(18);
            this.containerView.addView(k5Var2, w7.x5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            z50 z50Var = new z50(this, launchActivity);
            this.U0 = z50Var;
            this.containerView.addView(z50Var, w7.x5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        q50 q50Var = new q50(this, launchActivity);
        this.Q = q50Var;
        q50Var.setClipToPadding(false);
        q50Var.setClipChildren(false);
        y50 y50Var = new y50(this);
        this.X = y50Var;
        y50Var.f42754o = qrVar;
        y50Var.d = 350L;
        y50Var.f42778c = 350L;
        y50Var.e = 350L;
        y50Var.S();
        q50Var.setItemAnimator(y50Var);
        q50Var.setOnScrollListener(new i30(this));
        q50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(F3 ? 6 : 2, q50Var);
        this.Y = ozVar;
        q50Var.setLayoutManager(ozVar);
        j30 j30Var = new j30(this);
        this.f35019c = j30Var;
        ozVar.z1(j30Var);
        q50Var.i(new k30(this));
        ozVar.C1();
        this.containerView.addView(q50Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        q50Var.setAdapter(e60Var);
        q50Var.setTopBottomSelectorRadius(13);
        q50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.eg));
        q50Var.setOnItemClickListener(new c7(this, launchActivity, call, 14));
        q50Var.setOnItemLongClickListener(new u20(this, 4));
        if (r1()) {
            i60 i60Var = new i60(this, getContext());
            this.B1 = i60Var;
            this.containerView.addView(i60Var, w7.x5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(launchActivity);
        this.f35065n2 = ml0Var;
        this.containerView.addView(ml0Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        q60 q60Var = new q60(call, this.currentAccount, this);
        this.f35069o2 = q60Var;
        ml0Var.setAdapter(q60Var);
        s4.s sVar = new s4.s(6, false);
        ml0Var.setLayoutManager(sVar);
        sVar.z1(new m30(this));
        ml0Var.setOnItemClickListener(new org.telegram.ui.Components.al0(this) {
            public final k60 f38559b;

            {
                this.f38559b = this;
            }

            @Override
            public final void d(int i15, View view) {
                switch (r2) {
                    case 0:
                        k60 k60Var2 = this.f38559b;
                        k60Var2.getClass();
                        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view;
                        if (r20Var.getVideoParticipant() == null) {
                            k60Var2.e1(new ChatObject.VideoParticipant(r20Var.getParticipant(), false, false));
                            return;
                        } else {
                            k60Var2.e1(r20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        k60 k60Var3 = this.f38559b;
                        k60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            k60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f42754o = qrVar;
        jVar.d = 350L;
        jVar.f42778c = 350L;
        jVar.e = 350L;
        ml0Var.setItemAnimator(new n30(this));
        ml0Var.setOnScrollListener(new o30(this));
        q60Var.H(ml0Var, false, false);
        ml0Var.setVisibility(8);
        p30 p30Var = new p30(this, launchActivity);
        this.e = p30Var;
        int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(9);
        this.M0 = z9Var;
        org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(12);
        this.N0 = z9Var2;
        z9Var.f30427a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        z9Var.f30428b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        z9Var.b();
        z9Var2.f30427a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        z9Var2.f30428b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        z9Var2.b();
        int i15 = org.telegram.ui.ActionBar.j6.Ig;
        z9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i15), 38));
        z9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i15), 76));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f35079r = v2Var;
        v2Var.setCheckable(true);
        v2Var.setTextSize(12);
        p30Var.a(v2Var);
        v2Var.setOnClickListener(new v20(this, 7));
        org.telegram.ui.Components.voip.v2 v2Var2 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f35062n = v2Var2;
        v2Var2.setCheckable(true);
        v2Var2.setTextSize(12);
        v2Var2.d(false, false);
        v2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        v2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.v2 v2Var3 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f35032f = v2Var3;
        v2Var3.setCheckable(true);
        v2Var3.setTextSize(12);
        v2Var3.d(false, false);
        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(launchActivity);
        v2Var3.addView(bj0Var, w7.x5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.yi0 yi0Var2 = new org.telegram.ui.Components.yi0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = yi0Var2;
        bj0Var.setAnimation(yi0Var2);
        v2Var3.setOnClickListener(new v20(this, 10));
        p30Var.a(v2Var3);
        org.telegram.ui.Components.voip.v2 v2Var4 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.h = v2Var4;
        v2Var4.setCheckable(true);
        v2Var4.setTextSize(12);
        v2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f35015b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f35011a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        v2Var4.addView(imageView, w7.x5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        v2Var4.setOnClickListener(new v20(this, 11));
        p30Var.a(v2Var4);
        p30Var.a(v2Var2);
        org.telegram.ui.Components.voip.v2 v2Var5 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f35084s = v2Var5;
        v2Var5.setTextSize(12);
        v2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        v2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final k60 f31699b;

            {
                this.f31699b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k60.o(this.f31699b, launchActivity);
                        return;
                    default:
                        k60 k60Var2 = this.f31699b;
                        k60Var2.a2.e();
                        ChatObject.Call call2 = k60Var2.f35012a1;
                        if (call2 != null && !call2.isScheduled()) {
                            k60Var2.I1();
                            k60.t1(launchActivity, new x20(k60Var2, 5), false, false);
                            return;
                        }
                        k60Var2.dismiss();
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
        q30 q30Var = new q30(this, launchActivity);
        this.f35106x = q30Var;
        q30Var.setAnimation(yi0Var);
        q30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.v2 v2Var7 = new org.telegram.ui.Components.voip.v2(launchActivity, 50.0f);
        this.f35101w = v2Var7;
        v2Var7.setDrawBackground(false);
        v2Var7.setTextSize(12);
        v2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        v2Var7.addView(q30Var, w7.x5.e(50, 50, 49));
        p30Var.a(v2Var7);
        v2Var7.setOnClickListener(new s30(this));
        p30Var.a(v2Var6);
        p30Var.a(v2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f35111y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        v2Var7.addView(imageView2, w7.x5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f35012a1 != null && r1() && !this.f35012a1.isScheduled()) {
            imageView2.setVisibility(0);
            q30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f35028e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Og));
        g50Var.setAlpha(0.0f);
        g50Var.getBackButton().setScaleX(0.9f);
        g50Var.getBackButton().setScaleY(0.9f);
        g50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        g50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        g50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        g50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.j6.u0(i10));
        this.f35053k1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new u20(this, 0));
        int i17 = org.telegram.ui.ActionBar.j6.f18961ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        w0Var.setOnClickListener(new v20(this, 0));
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i10), false);
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i10), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.j6.u0(i10));
        this.l1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        w0Var2.setOnClickListener(new v20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.j6.u0(i10));
        this.f35059m1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        w0Var3.setOnClickListener(new v20(this, 2));
        u30 u30Var = new u30(this, launchActivity, launchActivity);
        this.f35029e1 = u30Var;
        v30 v30Var = new v30(launchActivity);
        this.N = v30Var;
        v30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f35038g1 = paint2;
        paint2.setColor(-12761513);
        w30 w30Var = new w30(this, getContext());
        this.f35034f1 = w30Var;
        w30Var.setTextColor(getThemedColor(i10));
        w30Var.setTextSize(1, 11.0f);
        w30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        w30Var.setMaxLines(1);
        w30Var.setGravity(17);
        w30Var.setTypeface(AndroidUtilities.bold());
        w30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        w30Var.setTag(-1);
        if (!r1()) {
            w30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f35050j1 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(u30Var, w7.x5.l(1.0f, 0, -2));
        linearLayout.addView(w30Var, w7.x5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(v30Var, w7.x5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.x5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(g50Var, w7.x5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f35116z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, w7.x5.n(48, 48));
        linearLayout2.addView(w0Var2, w7.x5.n(48, 48));
        linearLayout2.addView(w0Var, w7.x5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.x5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f35037g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.V5));
        this.containerView.addView(view, w7.x5.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f35049j0[i18] = new x30(this, launchActivity);
            this.f35049j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f35049j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f35049j0[i18], w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f35052k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f35053k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f35053k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.j6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.u0(i19), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.m0);
        this.f35094u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.m0);
        this.f35098v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.j6.f19218wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.j6.u0(i20), org.telegram.ui.ActionBar.j6.u0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.j6.u0(i20), org.telegram.ui.ActionBar.j6.u0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.j6.f18942hg;
        paint3.setColor(org.telegram.ui.ActionBar.j6.u0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.m0);
        this.f35072p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.m0);
        this.f35076q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f35053k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f18925gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.f35025d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.m0);
        this.f35068o1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.f35025d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.m0);
        this.f35081r1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.f35053k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f35064n1 = e;
        f60 f60Var = new f60();
        this.f35025d1 = f60Var;
        org.telegram.ui.ActionBar.g1 e7 = this.f35053k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f35090t1 = e7;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f35053k1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, f60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.m0);
        this.f35086s1 = d15;
        f60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e10 = this.f35053k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f35108x1 = e10;
        org.telegram.ui.ActionBar.g1 e11 = this.f35053k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f35113y1 = e11;
        org.telegram.ui.ActionBar.g1 e12 = this.f35053k1.e(4, R.drawable.msg_cancel, LocaleController.getString(o1() ? R.string.VoipGroupEndConference : ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.f35103w1 = e12;
        this.f35053k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.u0(i19));
        this.f35053k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        e11.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d11.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d12.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        int i22 = org.telegram.ui.ActionBar.j6.f19201vg;
        e12.c(org.telegram.ui.ActionBar.j6.u0(i22), org.telegram.ui.ActionBar.j6.u0(i22));
        e.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d13.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d14.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        d15.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        e7.c(org.telegram.ui.ActionBar.j6.u0(i21), org.telegram.ui.ActionBar.j6.u0(i21));
        if (this.f35012a1 != null) {
            l1();
        }
        if (o1()) {
            this.f35071p0 = new v50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f35071p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.O.getTitleTextView().setOnClickListener(new v20(this, 3));
        y30 y30Var = new y30(this, launchActivity);
        this.f35060m2 = y30Var;
        z30 z30Var = new z30(this);
        this.N2 = z30Var;
        y30Var.setClipToPadding(false);
        z30Var.S();
        z30Var.f42754o = org.telegram.ui.Components.qr.f27380f;
        z30Var.d = 350L;
        z30Var.f42778c = 350L;
        z30Var.e = 350L;
        y30Var.setItemAnimator(z30Var);
        y30Var.setOnScrollListener(new a40(this));
        y30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        y30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(call, this.currentAccount, this);
        this.f35073p2 = s20Var;
        y30Var.setAdapter(s20Var);
        s20Var.F(y30Var, false);
        y30Var.setOnItemClickListener(new org.telegram.ui.Components.al0(this) {
            public final k60 f38559b;

            {
                this.f38559b = this;
            }

            @Override
            public final void d(int i152, View view2) {
                switch (r2) {
                    case 0:
                        k60 k60Var2 = this.f38559b;
                        k60Var2.getClass();
                        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view2;
                        if (r20Var.getVideoParticipant() == null) {
                            k60Var2.e1(new ChatObject.VideoParticipant(r20Var.getParticipant(), false, false));
                            return;
                        } else {
                            k60Var2.e1(r20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        k60 k60Var3 = this.f38559b;
                        k60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            k60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        y30Var.setOnItemLongClickListener(new u20(this, 1));
        y30Var.setVisibility(8);
        y30Var.i(new b40());
        c40 c40Var = new c40(this, launchActivity, this.Q, y30Var, this.Y1, this.f35012a1, this);
        this.a2 = c40Var;
        c40Var.setClipChildren(false);
        s20Var.E(this.Y1, c40Var);
        if (this.f35065n2 != null) {
            this.f35069o2.G(this.Y1, c40Var);
        }
        d40 d40Var = new d40(this, launchActivity);
        this.D2 = d40Var;
        e40 e40Var = new e40(this, launchActivity, this.O, this.Q, d40Var);
        this.f35014b = e40Var;
        e40Var.setImagesLayerNum(Integer.MAX_VALUE);
        e40Var.setInvalidateWithParent(true);
        d40Var.setProfileGalleryView(e40Var);
        f40 f40Var = new f40(this, launchActivity);
        this.C2 = f40Var;
        f40Var.setVisibility(8);
        e40Var.setVisibility(0);
        e40Var.b(new g40(this));
        h40 h40Var = new h40(this, launchActivity);
        this.f35017b2 = h40Var;
        this.containerView.addView(c40Var);
        c40Var.addView(y30Var, w7.x5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
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
        lh.h hVar = new lh.h(launchActivity);
        this.f35020c0 = hVar;
        hVar.setDelegate(new i40(this));
        hVar.setClickCellDelegate(new j40(this));
        if (this.f35012a1 != null) {
            hVar.D0(this.d.getCurrentAccount(), this.f35012a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(launchActivity, false, true, true);
        this.M = n6Var;
        n6Var.setGravity(17);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setTextColor(-1);
        n6Var.b(0.4f, 320L, org.telegram.ui.Components.qr.h);
        n6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        k40 k40Var = new k40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = k40Var;
        k40Var.J = true;
        k40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f35024d0)});
        k40Var.getEditText().setLinkTextColor(-11683585);
        k40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        k40Var.getEditText().addTextChangedListener(new l40(this));
        k40Var.s();
        m40 m40Var = new m40(this, launchActivity);
        this.G = m40Var;
        this.containerView.addView(m40Var, w7.x5.c(-1.0f, -1));
        n40 n40Var = new n40(launchActivity);
        this.F = n40Var;
        n40Var.addView(k40Var, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        n40Var.addView(n6Var, w7.x5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        n6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(n40Var, w7.x5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i23 = org.telegram.ui.ActionBar.j6.f18952i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i23), 1, -1));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new v20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i23), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19192v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new v20(this, 5));
        n40Var.addView(imageView3, w7.x5.e(48, 48, 85));
        n40Var.addView(imageView4, w7.x5.e(48, 48, 85));
        this.containerView.addView(h40Var);
        f40Var.addView(e40Var, w7.x5.c(-1.0f, -1));
        f40Var.addView(d40Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(f40Var, w7.x5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f35069o2.I(this.f35065n2, false);
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
            org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(launchActivity);
            uc0Var.setTextColor(-1);
            uc0Var.setSelectorColor(-9598483);
            uc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            uc0Var.setItemCount(5);
            p40 p40Var = new p40(launchActivity);
            p40Var.setItemCount(5);
            p40Var.setTextColor(-1);
            p40Var.setSelectorColor(-9598483);
            p40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            q40 q40Var = new q40(launchActivity);
            q40Var.setItemCount(5);
            q40Var.setTextColor(-1);
            q40Var.setSelectorColor(-9598483);
            q40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            r40 r40Var = new r40(launchActivity);
            this.T = r40Var;
            r40Var.setLines(1);
            r40Var.setSingleLine(true);
            r40Var.setEllipsize(TextUtils.TruncateAt.END);
            r40Var.setGravity(17);
            r40Var.setTextColor(-1);
            r40Var.setTypeface(AndroidUtilities.bold());
            r40Var.setTextSize(1, 14.0f);
            this.containerView.addView(r40Var, w7.x5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r40Var.setOnClickListener(new org.telegram.messenger.video.f(this, uc0Var, p40Var, q40Var, chat, accountInstance, inputPeer2, 1));
            t40 t40Var = new t40(launchActivity, uc0Var, p40Var, q40Var);
            this.R = t40Var;
            t40Var.setWeightSum(1.0f);
            t40Var.setOrientation(0);
            this.containerView.addView(t40Var, w7.x5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i24 = calendar.get(1);
            int i25 = calendar.get(6);
            t40Var.addView(uc0Var, w7.x5.l(0.5f, 0, 270));
            uc0Var.setMinValue(0);
            uc0Var.setMaxValue(365);
            uc0Var.setWrapSelectorWheel(false);
            uc0Var.setFormatter(new z20(currentTimeMillis, calendar, i24, 0));
            a1.d dVar = new a1.d(this, uc0Var, p40Var, q40Var, 11);
            k60Var = this;
            uc0Var.setOnValueChangedListener(dVar);
            p40Var.setMinValue(0);
            p40Var.setMaxValue(23);
            t40Var.addView(p40Var, w7.x5.l(0.2f, 0, 270));
            p40Var.setFormatter(new org.telegram.ui.Components.bn0(21));
            p40Var.setOnValueChangedListener(dVar);
            q40Var.setMinValue(0);
            q40Var.setMaxValue(59);
            q40Var.setValue(0);
            q40Var.setFormatter(new org.telegram.ui.Components.bn0(22));
            t40Var.addView(q40Var, w7.x5.l(0.3f, 0, 270));
            q40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i26 = calendar.get(6);
            int i27 = calendar.get(12);
            int i28 = calendar.get(11);
            uc0Var.setValue(i25 != i26 ? 1 : 0);
            q40Var.setValue(i27);
            p40Var.setValue(i28);
            org.telegram.ui.Components.c5.g(r40Var, textView, 0L, 604800L, 2, uc0Var, p40Var, q40Var);
        } else {
            k60Var = this;
        }
        u40 u40Var = new u40(k60Var, (ViewGroup) k60Var.getWindow().getDecorView(), k60Var.containerView);
        k60Var.f35022c2 = u40Var;
        u40Var.E = new v40(k60Var);
        e40Var.setPinchToZoomHelper(u40Var);
        k60Var.f35062n.setOnClickListener(new View.OnClickListener(k60Var) {
            public final k60 f31699b;

            {
                this.f31699b = k60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        k60.o(this.f31699b, launchActivity);
                        return;
                    default:
                        k60 k60Var2 = this.f31699b;
                        k60Var2.a2.e();
                        ChatObject.Call call2 = k60Var2.f35012a1;
                        if (call2 != null && !call2.isScheduled()) {
                            k60Var2.I1();
                            k60.t1(launchActivity, new x20(k60Var2, 5), false, false);
                            return;
                        }
                        k60Var2.dismiss();
                        return;
                }
            }
        });
        k60Var.L1(false);
        k60Var.I1();
        k60Var.M1(false);
        k60Var.N1(false, false);
        k60Var.B1(0.0f);
        k60Var.O1();
        k60Var.containerView.addView(new FrameLayout(launchActivity), w7.x5.e(-1, 200, 87));
        k60Var.v.setOnClickListener(new v20(k60Var, 6));
        k60Var.T0();
        w7.z5.a(k60Var.f35062n);
        w7.z5.a(k60Var.f35079r);
        w7.z5.a(k60Var.f35032f);
        w7.z5.a(k60Var.h);
        w7.z5.a(k60Var.f35101w);
        w7.z5.a(k60Var.f35084s);
        w7.z5.a(k60Var.v);
        r0.i0.m(k60Var.containerView, new u20(k60Var, 2));
    }

    public static void A(k60 k60Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = k60Var.getContext();
            int i10 = k60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.f6 f6Var = k60Var.resourcesProvider;
            ChatObject.Call call = k60Var.f35012a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            m9.o0(context, i10, inputGroupCall, str, f6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.vc(k60Var.topBulletinContainer, new ai.a1()).d0(tL_error, false);
        }
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(k60 k60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 L;
        y30 y30Var = k60Var.f35060m2;
        c40 c40Var = k60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = k60Var.f35012a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!c40Var.f29035b) {
                    if (k60Var.f35085s0) {
                        arrayList = k60Var.D0;
                    } else {
                        arrayList = k60Var.f35012a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (L = k60Var.Q.L(indexOf + k60Var.P.d)) != null) {
                        View view = L.f42697a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == k60Var.X2 && !k60Var.f35057l2) {
                                k60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < y30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) y30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(r20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            r20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                c40Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void B0(k60 k60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (k60Var.f35063n0 == null) {
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(k60Var.getContext(), 8);
            k60Var.f35063n0 = i40Var;
            i40Var.setAlpha(0.0f);
            k60Var.f35063n0.setVisibility(4);
            k60Var.f35063n0.setShowingDuration(4000L);
            k60Var.containerView.addView(k60Var.f35063n0, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            k60Var.f35063n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            k60Var.f35063n0.d();
        }
        k60Var.f35063n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        k60Var.f35063n0.f(k60Var.f35101w, true);
    }

    public static void E(k60 k60Var) {
        Editable text = k60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(k60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        k60Var.A1(tL_textWithEntities);
    }

    public static void F0(k60 k60Var) {
        ChatObject.Call call = k60Var.f35012a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = k60Var.f35012a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(k60Var.f35012a1.call.join_muted);
            ConnectionsManager connectionsManager = k60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new g30(k60Var, 1));
        }
    }

    public static void G0(k60 k60Var, boolean z10) {
        if (k60Var.f35012a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = k60Var.f35012a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        k60Var.f35110x3 = Boolean.valueOf(z10);
        k60Var.H1(true);
        ConnectionsManager connectionsManager = k60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new g30(k60Var, 0));
    }

    public static void H0(k60 k60Var) {
        boolean z10;
        int i10;
        if (k60Var.r1()) {
            c40 c40Var = k60Var.a2;
            if (!c40Var.V && c40Var.f29035b && (F3 == k60Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = k60Var.f35051j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = k60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                k60Var.getWindow().clearFlags(1024);
                k60Var.setHideSystemVerticalInsets(false);
            } else {
                k60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                k60Var.getWindow().addFlags(1024);
            }
            k60Var.containerView.setSystemUiVisibility(i10);
            k60Var.f35051j2 = Boolean.valueOf(z10);
            k60Var.S2 = !z10;
            k60Var.containerView.requestApplyInsets();
            return;
        }
        k60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(k60 k60Var) {
        q50 q50Var = k60Var.Q;
        for (int i10 = 0; i10 < q50Var.getChildCount(); i10++) {
            View childAt = q50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.S(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(k60 k60Var) {
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
        g50 g50Var = k60Var.O;
        q50 q50Var = k60Var.Q;
        int childCount = q50Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.S(q50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = q50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && g50Var.getTag() == null) || (!z10 && g50Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            g50Var.setTag(num);
            AnimatorSet animatorSet = k60Var.f35041h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                k60Var.f35041h0 = null;
            }
            if (g50Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            k60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = g50Var.getBackButton().animate();
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
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
            duration.setInterpolator(qrVar).start();
            ViewPropertyAnimator animate2 = g50Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(qrVar).start();
            ObjectAnimator objectAnimator = k60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                k60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = g50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = g50Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            k60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            k60Var.U2.setInterpolator(qrVar);
            k60Var.U2.addListener(new org.telegram.ui.Components.aa(29, k60Var, z10));
            k60Var.U2.start();
            ObjectAnimator objectAnimator2 = k60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.k5 additionalSubtitleTextView = g50Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            k60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            k60Var.V2.setInterpolator(qrVar);
            k60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            k60Var.f35041h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = k60Var.f35041h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g50Var, property2, f11);
            v30 v30Var = k60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v30Var, property2, f12);
            View view = k60Var.f35037g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            k60Var.f35041h0.addListener(new e50(k60Var, 1));
            k60Var.f35041h0.start();
            ImageView imageView = k60Var.a2.v;
            if (z10 && !F3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (k60Var.f35112y0 != dp4) {
            k60Var.E1(dp4);
        }
    }

    public static void N(k60 k60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!k60Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.u.c(k60Var.Y1, k60Var.a2, lVar, null, null, lVar.getParticipant(), k60Var.f35012a1, k60Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(k60 k60Var, int i10, int[] iArr) {
        if (k60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19273zg, false), k60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19000kg, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), k60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19254yg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19273zg, false), k60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19236xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Cg, false), k60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19001kh, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19019lh, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ng, false), k60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19000kg, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false), k60Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18962ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19001kh, false));
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
                    D3 = new k60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f18121id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new k60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f35045i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(16));
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

    public static void m(k60 k60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(k60Var.currentAccount).sendRequest(declineconferencecallinvite, new f30(k60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(k60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = k60Var.f35012a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            k60Var.f35012a1.invitedUsersMap.remove(l4);
            k60Var.f35012a1.invitedUsersMessageIds.remove(l4);
            k60Var.O0(true);
        }
    }

    public static void n(k60 k60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = k60Var.d;
        ArrayList arrayList = k60Var.F0;
        e60 e60Var = k60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            k60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.d4) {
            k60Var.F1((org.telegram.ui.Cells.d4) view);
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
                    if (k60Var.o1()) {
                        int i11 = i10 - e60Var.f33293n;
                        if (i11 >= 0 && i11 < k60Var.f35012a1.shadyJoinParticipants.size()) {
                            l4 = k60Var.f35012a1.shadyJoinParticipants.get(i10 - e60Var.f33293n);
                        } else {
                            int i12 = i10 - e60Var.f33295s;
                            if (i12 >= 0 && i12 < k60Var.f35012a1.shadyLeftParticipants.size()) {
                                l4 = k60Var.f35012a1.shadyLeftParticipants.get(i10 - e60Var.f33295s);
                            } else {
                                int i13 = i10 - e60Var.f33292f;
                                if (k60Var.f35085s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < k60Var.f35012a1.invitedUsers.size()) {
                                    l4 = k60Var.f35012a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = k60Var.f35012a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(k60Var.container, k60Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(k60Var) {
                                public final k60 f32988b;

                                {
                                    this.f32988b = k60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            k60.r(this.f32988b, invitedUser, l4);
                                            return;
                                        default:
                                            k60.m(this.f32988b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(k60Var) {
                                public final k60 f32988b;

                                {
                                    this.f32988b = k60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            k60.r(this.f32988b, invitedUser, l4);
                                            return;
                                        default:
                                            k60.m(this.f32988b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), k60Var.C0.getColor()));
                            F.f26384s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    k60Var.f35045i0.K0(k60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f18268id);
                    if (v3Var.f21474a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    k60Var.f35045i0.p0(new ProfileActivity(bundle, null));
                    k60Var.dismiss();
                }
            } else if (i10 == e60Var.f33296w) {
                if (ChatObject.isChannel(k60Var.Z0) && (chat = k60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    k60Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(k60Var.i1());
                if (chatFull != null) {
                    k60Var.f35102w0 = false;
                    Context context = k60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = k60Var.Z0;
                    ChatObject.Call call2 = k60Var.f35012a1;
                    org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    k60Var.E1 = r30Var;
                    r30Var.setOnDismissListener(new b30(k60Var, 2));
                    org.telegram.ui.Components.r30 r30Var2 = k60Var.E1;
                    r30Var2.f27515g0 = new l30(k60Var);
                    r30Var2.show();
                }
            } else if (i10 == e60Var.f33297x) {
                ChatObject.Call call3 = k60Var.f35012a1;
                if (call3 != null && call3.call != null) {
                    tg.n1 n1Var = new tg.n1(activity, k60Var.currentAccount, null, 4, new ai.a1());
                    ChatObject.Call call4 = k60Var.f35012a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new n8(4)).collect(Collectors.toSet());
                    }
                    n1Var.C0.addAll(collection);
                    n1Var.h0(false, true);
                    n1Var.A0 = new x20(k60Var, 3);
                    n1Var.h0(false, true);
                    n1Var.D0 = new ai.m0(14, k60Var, call);
                    n1Var.show();
                }
            } else if (i10 == e60Var.f33298y) {
                k60Var.v1();
            }
        }
    }

    public static void o(k60 k60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = k60Var.f35045i0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            k60Var.f35045i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                k60Var.f35049j0[0].e(1, false);
                if (k60Var.f35115z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    w40 w40Var = new w40(k60Var, activity, z10);
                    k60Var.f35115z0 = w40Var;
                    w40Var.setBottomPadding(k60Var.containerView.getPaddingBottom());
                    k60Var.container.addView(k60Var.f35115z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            k60Var.N1(true, false);
            k60Var.M1(false);
            k60Var.f35012a1.sortParticipants();
            k60Var.O0(true);
            k60Var.e.requestLayout();
        }
    }

    public static void p(k60 k60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k60Var.f35026d2 = floatValue;
        k60Var.a2.f29049n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        f40 f40Var = k60Var.C2;
        f40Var.setScaleX(f12);
        f40Var.setScaleY(f12);
        f40Var.setTranslationX((1.0f - k60Var.f35026d2) * f10);
        f40Var.setTranslationY((1.0f - k60Var.f35026d2) * f11);
        if (!k60Var.f35039g2) {
            k60Var.W2.setAlpha((int) (k60Var.f35026d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.u uVar = k60Var.Z2;
        if (uVar != null) {
            uVar.f29217a.setRoundCorners((1.0f - k60Var.f35026d2) * AndroidUtilities.dp(8.0f));
        }
        f40Var.invalidate();
        k60Var.containerView.invalidate();
        e40 e40Var = k60Var.f35014b;
        int i11 = (int) ((1.0f - k60Var.f35026d2) * i10);
        e40Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(k60 k60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = k60Var.f35012a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                k60Var.f35012a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = k60Var.f35012a1.call;
                tL_inputGroupCall.f18138id = groupCall2.f18131id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(k60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(k60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new ei.b1(k60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            k60Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                k60Var.N1(true, true);
            }
        }
    }

    public static void r(k60 k60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(k60Var.currentAccount).sendRequest(declineconferencecallinvite, new f30(k60Var, 1));
        ChatObject.Call call = k60Var.f35012a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            k60Var.O0(true);
        }
    }

    public static void s(k60 k60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(k60 k60Var) {
        k60Var.Y0();
        k60Var.V0();
        k60Var.U0();
        k60Var.F.setTranslationY((-k60Var.C1.c()) + k60Var.containerView.getPaddingBottom());
        k60Var.G.invalidate();
        k60Var.Z0();
        k60Var.containerView.invalidate();
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
                    alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    if (z10) {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18969j5, false));
                    } else {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18942hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.j6.f19128rg;
                        int i11 = org.telegram.ui.ActionBar.j6.f19091pg;
                        int i12 = org.telegram.ui.ActionBar.j6.f19054ng;
                        checkBoxSquare.f21997s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f21998w = i12;
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
                    z1VarArr[0].setOnClickListener(new y20(z1VarArr, 0));
                }
                alertDialog$Builder.n(f7);
                alertDialog$Builder.f18446a.I = org.telegram.ui.ActionBar.j6.f19091pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ci.z6(call, z1VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f18446a.P0 = false;
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        c2Var.getWindow().setType(2038);
                    } else {
                        c2Var.getWindow().setType(2003);
                    }
                    c2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    c2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184ug, false));
                }
                c2Var.show();
                if (!z10) {
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201vg, false));
                    }
                    c2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18942hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(k60 k60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(k60 k60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(k60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(k60Var, updates, j3, 25));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(k60Var, hashSet, call, str, 8));
        }
    }

    public static void w(k60 k60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(k60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f18327id.add(MessagesController.getInstance(k60Var.currentAccount).getInputUser(longValue));
        }
        ai.m3 m3Var = new ai.m3(k60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(k60Var.currentAccount).isPremium()) {
            m3Var.run();
        } else {
            ConnectionsManager.getInstance(k60Var.currentAccount).sendRequest(getrequirementstocontact, new ca(arrayList, arrayList2, m3Var, 13));
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

    public static void x(k60 k60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(34, k60Var.currentAccount, U.getContext(), U, new ai.a1());
        j0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static void y(k60 k60Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            k60Var.x1(null, j3, 3);
            return;
        }
        org.telegram.ui.Components.c5.f0(k60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) k60Var.f35045i0.O().getFragmentStack().get(k60Var.f35045i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.l1 z(k60 k60Var, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f41877a;
        i0.b f7 = i1Var.f(647);
        i0.b f10 = i1Var.f(8);
        k40 k40Var = k60Var.H;
        if (!k40Var.N && !k40Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = k40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = k60Var.f35017b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (k40Var.getEmojiView() != null) {
            k40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (k60Var.S2) {
            ViewGroup viewGroup = k60Var.containerView;
            int i10 = k60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = k60Var.containerView;
            int i11 = k60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f10591a + i11, f7.f10592b, i11 + f7.f10593c, f7.d);
        }
        k60Var.containerView.requestLayout();
        if (max == 0 && !k40Var.N && !k40Var.e && !k40Var.O) {
            k40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.gk0 gk0Var = k60Var.K;
            if (gk0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                gk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.gk0 gk0Var2 = new org.telegram.ui.Components.gk0(1, k60Var.currentAccount, k60Var.getContext(), R, k60Var.resourcesProvider);
                    k60Var.K = gk0Var2;
                    gk0Var2.setDelegate(new m50(k60Var));
                    k60Var.containerView.addView(k60Var.K, w7.x5.e(-2, 52, 81));
                    k60Var.K.p(null, null, false);
                    k60Var.G.bringToFront();
                    k60Var.F.bringToFront();
                    gk0Var = k60Var.K;
                }
            }
            k60Var.K = gk0Var;
        }
        k40Var.H(f10.d, false);
        k60Var.C1.i(l1Var);
        return r0.l1.f41876b;
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j3;
        this.H.setText("");
        ChatObject.Call call = this.f35012a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f35012a1;
            long j10 = call2.call.f18131id;
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
        c40 c40Var = this.a2;
        if (c40Var == null) {
            f10 = 0.0f;
        } else {
            f10 = c40Var.f29037c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.j6.f18980jg;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.f18925gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f35053k1.B(-14472653);
        this.f35033f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19000kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19165tg, false), f7, 1.0f);
        v50 v50Var = this.f35071p0;
        if (v50Var != null) {
            v50Var.f38294j = offsetColor2;
            u50 u50Var = v50Var.f38292g;
            if (u50Var != null) {
                u50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        q50 q50Var = this.Q;
        q50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f35101w.invalidate();
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
        this.f35084s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19018lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19073og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19037mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19128rg, false), f7, 1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int childCount = q50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = q50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(v02, v02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                g50 g50Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (g50Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.j6.f19128rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f19037mg;
                    }
                    d4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (g50Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.j6.f19128rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19037mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        q50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        q50 q50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 L;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f35012a1;
        if (call != null && (q50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            c40 c40Var = this.a2;
            if (!c40Var.f29035b) {
                if (this.f35085s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f35012a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (L = q50Var.L(indexOf + this.P.d)) != null) {
                    View view = L.f42697a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f35057l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    y30 y30Var = this.f35060m2;
                    if (i10 >= y30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) y30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(r20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        r20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            c40Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f35118z3.e;
            p30 p30Var = this.e;
            p30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f35060m2.invalidate();
            this.containerView.invalidate();
            p30Var.invalidate();
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
        this.f35040g3 = i10;
        this.f35044h3 = i11;
        this.f35048i3 = i12;
        this.j3 = i13;
        this.f35055k3 = i14;
        this.f35058l3 = i15;
        this.f35061m3 = i16;
        this.f35066n3 = i17;
        this.f35070o3 = i18;
        this.f35074p3 = i19;
        this.f35078q3 = i20;
        this.f35083r3 = i21;
        this.f35088s3 = i22;
        this.f35092t3 = i23;
        this.f35096u3 = i24;
        this.f35100v3 = i25;
    }

    public final void E1(float f7) {
        q50 q50Var;
        int dp;
        int i10;
        float f10;
        this.f35112y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) q50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        z50 z50Var = this.U0;
        c40 c40Var = this.a2;
        w30 w30Var = this.f35034f1;
        u30 u30Var = this.f35029e1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (z50Var != null) {
                z50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            u30Var.setScaleX(Math.max(0.9f, f11));
            u30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            u30Var.setAlpha((1.0f - c40Var.f29037c) * Math.max(0.0f, f12));
            w30Var.setScaleX(Math.max(0.9f, f11));
            w30Var.setScaleY(Math.max(0.9f, f11));
            w30Var.setAlpha((1.0f - c40Var.f29037c) * Math.max(0.0f, f12));
        } else {
            u30Var.setScaleX(1.0f);
            u30Var.setScaleY(1.0f);
            u30Var.setAlpha(1.0f - c40Var.f29037c);
            w30Var.setScaleX(1.0f);
            w30Var.setScaleY(1.0f);
            w30Var.setAlpha(1.0f - c40Var.f29037c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.f35116z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f35050j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (z50Var != null) {
            z50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        t40 t40Var = this.R;
        if (t40Var != null) {
            t40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.F1(android.view.View):boolean");
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
        ChatObject.Call call = this.f35012a1;
        org.telegram.ui.Components.voip.v2 v2Var = this.v;
        org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
        org.telegram.ui.Components.voip.v2 v2Var3 = this.f35079r;
        org.telegram.ui.Components.voip.v2 v2Var4 = this.f35032f;
        org.telegram.ui.Components.voip.v2 v2Var5 = this.f35062n;
        org.telegram.ui.Components.voip.v2 v2Var6 = this.f35084s;
        org.telegram.ui.Components.voip.v2 v2Var7 = this.f35101w;
        boolean z19 = true;
        p30 p30Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f35012a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f35110x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f35012a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f35012a1.canRecordVideo()) || z13) && !r1()) {
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
            p30Var.c(v2Var7, true, z10);
            p30Var.c(v2Var6, true, z10);
            p30Var.c(v2Var5, z16, z10);
            p30Var.c(v2Var4, z18, z10);
            p30Var.c(v2Var3, z20, z10);
            p30Var.c(v2Var2, z17, z10);
            p30Var.c(v2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        p30Var.c(v2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        p30Var.c(v2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        p30Var.c(v2Var3, z19, z10);
        p30Var.c(v2Var5, false, z10);
        p30Var.c(v2Var4, false, z10);
        p30Var.c(v2Var2, false, z10);
        p30Var.c(v2Var, false, z10);
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
        ChatObject.Call call2 = this.f35012a1;
        org.telegram.ui.ActionBar.w0 w0Var = this.f35053k1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f35059m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.f35012a1 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f35056l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f35064n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f35012a1;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f35113y1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f35108x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            g1Var3.setVisibility(i13);
            if (this.f35012a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            g1Var2.setVisibility(i14);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f35012a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f35012a1;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f35076q1;
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
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f35103w1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.f35068o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f35086s1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f35090t1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.f35012a1.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.f35012a1.canRecordVideo() && !this.f35012a1.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z13 = this.f35012a1.recording;
            f60 f60Var = this.f35025d1;
            f60Var.f33561f = z13;
            f60Var.d = 1.0f;
            f60Var.invalidateSelf();
            if (this.f35012a1.recording) {
                if (this.D1 == null) {
                    x20 x20Var = new x20(this, 6);
                    this.D1 = x20Var;
                    AndroidUtilities.runOnUIThread(x20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                x20 x20Var2 = this.D1;
                if (x20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x20Var2);
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
            if (!z10 && ((this.f35012a1.canRecordVideo() || z11) && !this.f35012a1.isScheduled() && !r1())) {
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
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f35081r1;
        if (Q02 && this.f35012a1.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f35012a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        w0Var.I(4, z12);
        if (r1() && !this.f35012a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f35072p1.setVisibility(i12);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f35052k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f35016b1) && !r1() && this.A0 != null) {
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
        LinearLayout linearLayout = this.f35050j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f35116z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.f35012a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f35012a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f35086s1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f7;
        t40 t40Var = this.R;
        if ((t40Var == null || this.f35012a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (t40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            t30 t30Var = this.f35104w2;
            AndroidUtilities.cancelRunOnUIThread(t30Var);
            t30Var.run();
            ChatObject.Call call = this.f35012a1;
            q50 q50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                q50Var.setVisibility(0);
            } else {
                q50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f35103w1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.qr.f27380f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
            this.W0 = qrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * qrVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f7;
        t40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        p50 p50Var = this.V;
        p50Var.setAlpha(f7);
        p50Var.setScaleX(interpolation);
        p50Var.setScaleY(interpolation);
        r40 r40Var = this.T;
        r40Var.setScaleX(f11);
        r40Var.setScaleY(f11);
        r40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f35053k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != t40Var.getVisibility()) {
            t40Var.setVisibility(i10);
            r40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.v2 v2Var = this.f35079r;
        if (v2Var != null && v2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            p30 p30Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                kh.a aVar = (kh.a) p30Var.f13651c.get(v2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    v2Var.setEnabled(true);
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
                    v2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    v2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    v2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    v2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                v2Var.b(z13, z10);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f35011a0 != i10) {
                    this.f35011a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f35015b0, i10);
                }
                org.telegram.ui.Components.voip.v2 v2Var2 = this.h;
                if (v2Var2.getVisibility() == 0) {
                    v2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
                        z14 = true;
                    }
                    v2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            v2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            kh.a aVar2 = (kh.a) p30Var.f13651c.get(v2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                v2Var.setEnabled(z11);
            }
            v2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        i60 i60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        g50 g50Var = this.O;
        if (g50Var != null && this.f35012a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f35012a1.currentSpeakingPeers.m(); i11++) {
                long j3 = this.f35012a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f35012a1.currentSpeakingPeers.f(j3);
                if (!groupCallParticipant.self) {
                    c40 c40Var = this.a2;
                    c40Var.getClass();
                    if (c40Var.f29061w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0);
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
                g50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = g50Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f35012a1.call.participants_count;
            e60 e60Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((e60Var.M.r1() || e60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (i60Var = this.B1) != null) {
                i60Var.setWatchersCount(this.f35012a1.call.participants_count);
            }
            if (z10 != this.f35095u2) {
                this.f35095u2 = z10;
                g50Var.invalidate();
                float f11 = 0.0f;
                g50Var.getSubtitleTextView().setPivotX(0.0f);
                g50Var.getSubtitleTextView().setPivotY(g50Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = g50Var.getSubtitleTextView().animate();
                if (this.f35095u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f35095u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f35095u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(g50Var.getAdditionalSubtitleTextView(), this.f35095u2);
            }
        }
    }

    public final int P0() {
        q50 q50Var = this.Q;
        int childCount = q50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = q50Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.f35012a1;
        u30 u30Var = this.f35029e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                u30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                u30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        g50 g50Var = this.O;
        if (!isEmpty) {
            if (!this.f35012a1.call.title.equals(g50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f35012a1.call.title, true, 180L, null);
                    g50Var.getTitleTextView().setOnClickListener(new v20(this, 8));
                } else {
                    g50Var.setTitle(this.f35012a1.call.title);
                }
                u30Var.b(this.f35012a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(g50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    g50Var.getTitleTextView().setOnClickListener(new v20(this, 9));
                } else {
                    g50Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        u30Var.b(this.Z0.title, z10);
                    } else {
                        u30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    u30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                g50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                u30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.k5 titleTextView = g50Var.getTitleTextView();
        if (this.f35012a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new g60(titleTextView));
                TextView textView = u30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new g60(textView), (Drawable) null);
                TextView nextTextView = u30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new g60(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            u30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            u30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f35012a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void Q1() {
        float f7;
        org.telegram.ui.Components.sb sbVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f35112y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            g50 g50Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), g50Var.getY() + (-this.topBulletinContainer.getTop()) + g50Var.getHeight(), f7));
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26695w;
            if (ocVar != null && (sbVar = ocVar.e) != null && sbVar.getParent() != null && sbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sbVar.setTop(z10);
            }
        }
    }

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f35114y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f35101w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f35118z3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f41088b.f14008a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        n40 n40Var = this.F;
        n40Var.setAlpha(f7);
        m40 m40Var = this.G;
        m40Var.setAlpha(f7);
        if (n40Var.getVisibility() != i10) {
            n40Var.setVisibility(i10);
            m40Var.setVisibility(i10);
            if (i10 == 8) {
                k40 k40Var = this.H;
                if (k40Var.isFocused()) {
                    k40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.gk0 gk0Var = this.K;
        if (gk0Var != null) {
            float f7 = this.C1.f41088b.f14008a * this.A3.e;
            gk0Var.setAlpha(f7);
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
            org.telegram.ui.Components.gk0 gk0Var2 = this.K;
            if (!gk0Var2.N0 && f7 == 1.0f) {
                gk0Var2.N0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = G3;
        p30 p30Var = this.e;
        if (z10) {
            p30Var.setTranslationX(0.0f);
            p30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.f35118z3;
        if (z11) {
            p30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            p30Var.setTranslationY(0.0f);
            return;
        }
        p30Var.setTranslationX(0.0f);
        p30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        y30 y30Var = this.f35060m2;
        if (z10) {
            y30Var.setTranslationX(0.0f);
            y30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.f35118z3;
        if (z11) {
            y30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            y30Var.setTranslationY(0.0f);
            return;
        }
        y30Var.setTranslationX(0.0f);
        y30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
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
            dp = ((this.f35118z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f29037c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f41088b.f14008a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f35112y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        lh.h hVar = this.f35020c0;
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
            uVar.f29217a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.u uVar2 = this.Z2;
            uVar2.h = false;
            uVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.f35018b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.r20 r20Var = this.f35013a3;
        if (r20Var != null) {
            r20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f35013a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f29035b;
    }

    public final void d1(boolean z10) {
        if (!this.f35023c3 && this.f35035f2) {
            if (z10) {
                this.f35023c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f35030e2);
            this.f35030e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f35035f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f35017b2.setVisibility(8);
            if (this.f35085s0) {
                this.f35085s0 = false;
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
        q50 q50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f35012a1;
            if (call != null && call.call.f18131id == l4.longValue()) {
                ChatObject.Call call2 = this.f35012a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j3 = this.f35089t0;
                AccountInstance accountInstance = this.d;
                if (j3 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f35045i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f35016b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f35021c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f35054k2);
                        this.f35045i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f35089t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new x20(this, 2), 3000L);
                }
                if (!this.f35093u0 && VoIPService.getSharedInstance() != null) {
                    this.f35012a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = q50Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = q50Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f35085s0 = true;
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
                                        if (dialog.f18125id == longValue) {
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
                                    if (this.f35012a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f35012a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            c40 c40Var = this.a2;
            if (c40Var.f29035b && this.f35012a1 != null) {
                boolean c10 = c40Var.c();
                ChatObject.Call call3 = this.f35012a1;
                if (call3 != null && c40Var.f29035b && (videoParticipant = c40Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.f35075q0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.f35012a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && c40Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            c40Var.setVisibleParticipant(true);
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
                AlertDialog$Builder N = org.telegram.ui.Components.c5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new b30(this, 1));
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
            if (chatFull.f18122id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f35012a1;
            if (call4 != null && chatFull.f18122id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(q50Var);
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
            int childCount2 = q50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.c1 H = q50Var.H(q50Var.getChildAt(i19));
                if (H != null) {
                    View view = H.f42697a;
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
            if (this.f35012a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f35012a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(q50Var);
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
            AndroidUtilities.updateVisibleRows(q50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(q50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            w40 w40Var = this.f35115z0;
            if (w40Var != null) {
                w40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            v50 v50Var = this.f35071p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            v50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f35045i0;
        launchActivity.f30829a1.remove(this.f35099v2);
        this.f35045i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.r30 r30Var = this.E1;
        if (r30Var != null) {
            r30Var.dismiss();
        }
        this.f35085s0 = true;
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
        c40 c40Var = this.a2;
        if (c40Var != null) {
            if (this.f35077q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f35077q2);
                this.f35077q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).f();
                c40Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (c40Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(c40Var);
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
        ChatObject.Call call = this.f35012a1;
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
        if (this.f35045i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f35045i0.getSystemService("audio");
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
            this.f35045i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            c40 c40Var = this.a2;
            if (c40Var.f29054r != null) {
                return;
            }
            boolean z10 = G3;
            q50 q50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f35077q2 != null) {
                    q50Var.getViewTreeObserver().removeOnPreDrawListener(this.f35077q2);
                    this.f35077q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                q60 q60Var = this.f35069o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = uVar.f29221c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.r20 r20Var = uVar.d;
                            if (r20Var != null) {
                                r20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = uVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(uVar.f29245w);
                            uVar.b(false);
                            uVar.animate().alpha(0.0f).setListener(new x40(this, uVar));
                        }
                    }
                    this.P2 = false;
                    q60Var.H(this.f35065n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) arrayList3.get(i12);
                        if (uVar2.e != null && ((videoParticipant2 = uVar2.f29245w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(uVar2.f29245w);
                            uVar2.b(false);
                            org.telegram.ui.Components.r20 r20Var2 = uVar2.d;
                            if (r20Var2 != null) {
                                r20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = uVar2.f29221c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            uVar2.animate().alpha(0.0f).setListener(new y40(this, uVar2));
                        }
                    }
                    this.P2 = true;
                    q60Var.f36815r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new mw(15, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = q50Var.getViewTreeObserver();
                a50 a50Var = new a50(this, videoParticipant, !c40Var.f29035b);
                this.f35077q2 = a50Var;
                viewTreeObserver.addOnPreDrawListener(a50Var);
                return;
            }
            if (this.f35077q2 != null) {
                q50Var.getViewTreeObserver().removeOnPreDrawListener(this.f35077q2);
                this.f35077q2 = null;
            }
            if (videoParticipant != null) {
                y30 y30Var = this.f35060m2;
                if (y30Var.getVisibility() != 0) {
                    y30Var.setVisibility(0);
                    org.telegram.ui.Components.s20 s20Var = this.f35073p2;
                    s20Var.G(y30Var, false);
                    this.f35085s0 = true;
                    if (!c40Var.f29035b) {
                        ArrayList arrayList4 = s20Var.e;
                        s4.c0 c0Var = (s4.c0) y30Var.getLayoutManager();
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
                    ViewTreeObserver viewTreeObserver2 = q50Var.getViewTreeObserver();
                    b50 b50Var = new b50(this, videoParticipant);
                    this.f35077q2 = b50Var;
                    viewTreeObserver2.addOnPreDrawListener(b50Var);
                    return;
                }
                c40Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(y30Var);
            } else if (q50Var.getVisibility() != 0) {
                q50Var.setVisibility(0);
                O0(false);
                this.f35085s0 = true;
                ViewTreeObserver viewTreeObserver3 = q50Var.getViewTreeObserver();
                c50 c50Var = new c50(this);
                this.f35077q2 = c50Var;
                viewTreeObserver3.addOnPreDrawListener(c50Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = q50Var.getViewTreeObserver();
                d50 d50Var = new d50(this);
                this.f35077q2 = d50Var;
                viewTreeObserver4.addOnPreDrawListener(d50Var);
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
        return chat.f18121id;
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
        } else if (this.f35012a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f35012a1.getInputGroupCall();
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
            c40 c40Var = this.a2;
            if (c40Var.f29035b) {
                return c40Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f35049j0;
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
        if (!this.f35093u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f35093u0 = true;
            this.D0.addAll(this.f35012a1.visibleParticipants);
            this.E0.addAll(this.f35075q0);
            this.F0.addAll(this.f35012a1.invitedUsers);
            this.G0.addAll(this.f35012a1.shadyJoinParticipants);
            this.H0.addAll(this.f35012a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f35012a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f35012a1 = call;
                this.f35073p2.f27750c = call;
                this.a2.setGroupCall(call);
                this.f35069o2.f36812c = this.f35012a1;
            }
            lh.h hVar = this.f35020c0;
            if (hVar != null) {
                hVar.D0(this.d.getCurrentAccount(), this.f35012a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f35012a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            p50 p50Var = this.V;
            if (p50Var != null && p50Var.getVisibility() == 0) {
                this.f35084s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f35103w1.setText(LocaleController.getString(i10));
                q50 q50Var = this.Q;
                q50Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.l1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(q50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(p50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p50Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k5Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(k5Var2, property2, 0.0f), ObjectAnimator.ofFloat(k5Var2, property3, 0.0f), ObjectAnimator.ofFloat(k5Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.qr.f27381g);
                animatorSet.addListener(new e50(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j3, final boolean z10) {
        if (this.f35012a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f35012a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f18268id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        k60 k60Var = k60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject != null) {
                            k60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k21(k60Var, j10, c2VarArr2, user, 2));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.h3(k60Var, c2VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wm(this, c2VarArr, sendRequest, 27), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f35112y0 - dp;
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
        q50 q50Var = this.Q;
        if (q50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(q50Var);
        }
        y30 y30Var = this.f35060m2;
        if (y30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(y30Var);
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
        w40 w40Var = this.f35115z0;
        if (w40Var != null) {
            w40Var.b(false, false);
        } else if (this.f35035f2) {
            d1(true);
        } else if (this.a2.f29035b) {
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
        w40 w40Var = this.f35115z0;
        if (w40Var != null && VoIPService.getSharedInstance() != null) {
            w40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f35045i0;
        launchActivity.f30829a1.add(this.f35099v2);
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
        if (!r1() || this.f35012a1.visibleVideoParticipants.isEmpty() || (this.f35012a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f35012a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f35012a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f35102w0) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f35045i0.O().getFragmentStack().get(this.f35045i0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof bo) {
                boolean P9 = ((bo) o2Var).P9();
                this.f35102w0 = true;
                this.f35107x0 = true;
                ai.s4 s4Var = new ai.s4(g3Var, editTextBoldCursor, z10, c2Var, 20);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(s4Var, j3);
                return;
            }
            this.f35102w0 = true;
            this.f35107x0 = true;
            if (g3Var != null) {
                g3Var.setFocusable(true);
            } else if (c2Var != null) {
                c2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new lh(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.j1.f28982d0.V) {
            org.telegram.ui.Components.voip.j1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f35012a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f35012a1.call;
            tL_inputGroupCall.f18138id = groupCall.f18131id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ca(this, c2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.x1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.d4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.y1(boolean, org.telegram.ui.Cells.d4):void");
    }

    public final void z1() {
        w5 w5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (this.f35117z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(w5Var, 30L);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
