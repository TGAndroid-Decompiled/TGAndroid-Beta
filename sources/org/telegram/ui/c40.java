package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.c40;
import org.telegram.ui.g20;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class c40 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is, VoIPService.StateListener, te.b {
    public static c40 C5;
    public static boolean D5;
    public static boolean E5;
    public static boolean F5;
    public static volatile org.telegram.messenger.q5 G5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public static boolean H5;
    public final l20 A1;
    public final ArrayList A2;
    public final a40 A3;
    public final LongSparseIntArray A4;
    public final te.c A5;
    public final j20 B1;
    public final ArrayList B2;
    public final rh.h B3;
    public final b20 B4;
    public final te.a B5;
    public final h20 C1;
    public final ArrayList C2;
    public s00 C3;
    public final z10 C4;
    public final ImageView D1;
    public int D2;
    public org.telegram.ui.Components.k20 D3;
    public LinearLayout D4;
    public final ImageView E1;
    public final org.telegram.ui.Components.ch0 E2;
    public int E3;
    public boolean E4;
    public org.telegram.ui.Components.mi0 F1;
    public final org.telegram.ui.Components.ch0 F2;
    public boolean F3;
    public final org.telegram.ui.Components.ch0 F4;
    public final i30 G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public final org.telegram.ui.Components.h6 H1;
    public final org.telegram.ui.Components.o9 H2;
    public final Paint H3;
    public boolean H4;
    public final r10 I1;
    public final org.telegram.ui.Components.o9 I2;
    public final Paint I3;
    public final View I4;
    public final a30 J1;
    public float J2;
    public final b40[] J3;
    public final View J4;
    public final w30 K1;
    public float K2;
    public float K3;
    public GradientDrawable K4;
    public final k30 L1;
    public float L2;
    public b40 L3;
    public final int[] L4;
    public final q20 M1;
    public RadialGradient M2;
    public b40 M3;
    public final v10 M4;
    public final TextView N1;
    public final Matrix N2;
    public long N3;
    public boolean N4;
    public final o20 O1;
    public final Paint O2;
    public float O3;
    public boolean O4;
    public final org.telegram.ui.ActionBar.j5 P1;
    public final r30 P2;
    public float P3;
    public RenderNode P4;
    public final j30 Q1;
    public float Q2;
    public boolean Q3;
    public float Q4;
    public final org.telegram.ui.ActionBar.j5 R1;
    public float R2;
    public boolean R3;
    public boolean R4;
    public final q30 S1;
    public ValueAnimator S2;
    public int S3;
    public final String[] S4;
    public final org.telegram.ui.Components.py T1;
    public TLRPC.InputPeer T2;
    public float T3;
    public ObjectAnimator T4;
    public final ImageReceiver U1;
    public TLRPC.Chat U2;
    public int U3;
    public ObjectAnimator U4;
    public int V1;
    public org.telegram.messenger.r3 V2;
    public boolean V3;
    public final v20 V4;
    public final ImageView W1;
    public final boolean W2;
    public final int[] W3;
    public org.telegram.ui.Cells.f4 W4;
    public final nh.h X1;
    public final String X2;
    public final ArrayList X3;
    public org.telegram.ui.Components.voip.r X4;
    public final int Y1;
    public final x30 Y2;
    public final ArrayList Y3;
    public org.telegram.ui.Components.voip.z Y4;
    public final RadialProgressView Z1;
    public final q10 Z2;
    public final y10 Z3;
    public org.telegram.ui.Components.k10 Z4;
    public final Drawable f45896a2;
    public final s10 f45897a3;
    public final d20 f45898a4;
    public boolean f45899a5;
    public final View f45900b2;
    public final Paint f45901b3;
    public final r20 f45902b4;
    public boolean f45903b5;
    public AnimatorSet f45904c2;
    public ValueAnimator f45905c3;
    public float f45906c4;
    public int f45907c5;
    public LaunchActivity d2;
    public float f45908d3;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f45909d4;
    public AnimatorSet f45910d5;
    public final UndoView[] f45911e2;
    public final LinearLayout f45912e3;
    public boolean f45913e4;
    public e30 f45914e5;
    public final org.telegram.ui.Cells.k f45915f2;
    public final org.telegram.ui.ActionBar.q0 f45916f3;
    public boolean f45917f4;
    public int f45918f5;
    public boolean f45919g2;
    public final org.telegram.ui.ActionBar.q0 f45920g3;
    public org.telegram.ui.Components.m30 f45921g4;
    public int f45922g5;
    public org.telegram.ui.Components.b30 f45923h2;
    public final org.telegram.ui.ActionBar.q0 f45924h3;
    public l30 f45925h4;
    public int f45926h5;
    public org.telegram.ui.Components.b30 f45927i2;
    public final org.telegram.ui.ActionBar.z0 f45928i3;
    public Boolean f45929i4;
    public int f45930i5;
    public int f45931j2;
    public final org.telegram.ui.ActionBar.z0 j3;
    public int f45932j4;
    public int f45933j5;
    public g.b f45934k2;
    public final org.telegram.ui.ActionBar.z0 f45935k3;
    public boolean f45936k4;
    public int f45937k5;
    public final ArrayList f45938l2;
    public final org.telegram.ui.ActionBar.z0 f45939l3;
    public final u10 f45940l4;
    public int f45941l5;
    public final a20 f45942m1;
    public y20 f45943m2;
    public final org.telegram.ui.ActionBar.z0 f45944m3;
    public final org.telegram.ui.Components.uj0 f45945m4;
    public int f45946m5;
    public final f10 n1;
    public boolean f45947n2;
    public final org.telegram.ui.Components.voip.r0 f45948n3;
    public final f40 f45949n4;
    public int f45950n5;
    public final org.telegram.messenger.c f45951o1;
    public long f45952o2;
    public final org.telegram.ui.Components.voip.t0 f45953o3;
    public final org.telegram.ui.Components.l10 o4;
    public int f45954o5;
    public final l10 f45955p1;
    public boolean f45956p2;
    public final ai.o2 f45957p3;
    public ViewTreeObserver.OnPreDrawListener f45958p4;
    public int f45959p5;
    public final org.telegram.ui.Components.voip.r2 f45960q1;
    public final RectF f45961q2;
    public final org.telegram.ui.ActionBar.z0 f45962q3;
    public final org.telegram.ui.Components.voip.n f45963q4;
    public int f45964q5;
    public final org.telegram.ui.Components.voip.r2 f45965r1;
    public boolean f45966r2;
    public final org.telegram.ui.ActionBar.z0 f45967r3;
    public boolean f45968r4;
    public int f45969r5;
    public final org.telegram.ui.Components.voip.r2 f45970s1;
    public boolean f45971s2;
    public final org.telegram.ui.ActionBar.z0 f45972s3;
    public final ArrayList f45973s4;
    public int s5;
    public final org.telegram.ui.Components.voip.r2 f45974t1;
    public float f45975t2;
    public final org.telegram.ui.ActionBar.z0 f45976t3;
    public boolean f45977t4;
    public int f45978t5;
    public final org.telegram.ui.Components.voip.r2 f45979u1;
    public t20 f45980u2;
    public final org.telegram.ui.ActionBar.z0 f45981u3;
    public final s00 f45982u4;
    public int f45983u5;
    public final org.telegram.ui.Components.voip.r2 f45984v1;
    public TLRPC.Peer f45985v2;
    public final org.telegram.ui.ActionBar.z0 f45986v3;
    public final p10 f45987v4;
    public final f30 f45988v5;
    public final org.telegram.ui.Components.voip.r2 f45989w1;
    public TLObject f45990w2;
    public final org.telegram.ui.ActionBar.z0 f45991w3;
    public final org.telegram.ui.Components.ih f45992w4;
    public Boolean f45993w5;
    public final m10 f45994x1;
    public final Paint f45995x2;
    public final org.telegram.ui.ActionBar.z0 f45996x3;
    public final s00 f45997x4;
    public Integer f45998x5;
    public final ImageView f45999y1;
    public final ArrayList f46000y2;
    public final LinearLayout f46001y3;
    public boolean f46002y4;
    public final te.a f46003y5;
    public final Paint f46004z1;
    public final ArrayList f46005z2;
    public final TextView f46006z3;
    public final m4 f46007z4;
    public final te.a f46008z5;

    public c40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.e6) null, true, true);
        final c40 c40Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f46004z1 = new Paint(1);
        this.f45911e2 = new UndoView[2];
        this.f45938l2 = new ArrayList();
        this.f45961q2 = new RectF();
        this.f45995x2 = new Paint(1);
        this.f46000y2 = new ArrayList();
        this.f46005z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.C2 = new ArrayList();
        this.B3 = new rh.h(new s00(this, 4));
        this.E3 = 0;
        this.F3 = false;
        this.H3 = new Paint(7);
        this.I3 = new Paint(7);
        this.J3 = new b40[8];
        this.K3 = 1.0f;
        this.V3 = true;
        this.W3 = new int[4];
        this.X3 = new ArrayList();
        this.Y3 = new ArrayList();
        this.f45963q4 = new org.telegram.ui.Components.voip.n();
        this.f45973s4 = new ArrayList();
        this.f45982u4 = new s00(this, 0);
        this.f45987v4 = new p10(this);
        this.f45992w4 = new org.telegram.ui.Components.ih(22);
        this.f45997x4 = new s00(this, 2);
        this.f46002y4 = false;
        this.f46007z4 = new m4(this, 7);
        this.A4 = new LongSparseIntArray();
        this.L4 = new int[2];
        this.O4 = true;
        this.S4 = new String[2];
        this.f45907c5 = -1;
        this.f45988v5 = new f30(this);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34420f;
        this.f46003y5 = new te.a(2, this, erVar, 350L);
        this.f46008z5 = new te.a(3, this, erVar, 220L, true);
        this.A5 = new te.c(4, this, erVar, 350L);
        this.B5 = new te.a(5, this, erVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.f45951o1 = cVar;
        this.V2 = r3Var;
        this.T2 = inputPeer;
        this.U2 = chat;
        this.X2 = str;
        this.f29679a = cVar.f22778a;
        this.W2 = z10;
        this.J0 = new fi.i0();
        this.Q0 = true;
        this.R0 = true;
        this.Y1 = org.telegram.messenger.np.s1(this.f29679a).f25448y7.f25869x.u();
        this.V = true;
        F5 = false;
        E5 = false;
        H5 = false;
        this.f29725z0 = new k20(this);
        this.f29714s = true;
        this.f29707n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f29719w = true;
        this.G0 = -1;
        this.V4 = new v20(this);
        setOnDismissListener(new y00(this, 0));
        z0();
        w30 w30Var = new w30(this, launchActivity);
        this.K1 = w30Var;
        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(true);
        int i7 = org.telegram.ui.ActionBar.j6.f28932hh;
        jpVar.b(org.telegram.ui.ActionBar.j6.v0(i7));
        jpVar.d();
        a30 a30Var = new a30(this, launchActivity, jpVar);
        this.J1 = a30Var;
        a30Var.setSubtitle("");
        a30Var.getSubtitleTextView().setVisibility(0);
        a30Var.q();
        a30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.V3(1.0f, a30Var.getAdditionalSubtitleTextView(), this.f45977t4, false);
        a30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.v0(i7));
        int i10 = org.telegram.ui.ActionBar.j6.f28842ch;
        org.telegram.ui.ActionBar.q6.l(a30Var, 6, i10, null);
        a30Var.setBackButtonImage(2131231240);
        a30Var.setOccupyStatusBar(false);
        a30Var.setAllowOverlayTitle(false);
        int i11 = org.telegram.ui.ActionBar.j6.Yg;
        org.telegram.ui.ActionBar.q6.l(a30Var, 1, i11, null);
        org.telegram.ui.ActionBar.q6.l(a30Var, 3, org.telegram.ui.ActionBar.j6.f29262z8, null);
        org.telegram.ui.ActionBar.q6.d(a30Var, i11);
        org.telegram.ui.ActionBar.q6.l(a30Var, 6, i10, null);
        a30Var.setActionBarMenuOnItemClick(new h30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f45985v2 = tL_peerUser;
            tL_peerUser.user_id = cVar.e().e();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f45985v2 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f45985v2 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f45985v2 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new t00(this, 2);
        cVar.c().c(this, org.telegram.messenger.ns.f25595w2);
        cVar.c().c(this, org.telegram.messenger.ns.M0);
        cVar.c().c(this, org.telegram.messenger.ns.T);
        cVar.c().c(this, org.telegram.messenger.ns.f25581u1);
        cVar.c().c(this, org.telegram.messenger.ns.B2);
        cVar.c().c(this, org.telegram.messenger.ns.E0);
        cVar.c().c(this, org.telegram.messenger.ns.f25516j0);
        cVar.c().c(this, org.telegram.messenger.ns.f25559r);
        cVar.c().c(this, org.telegram.messenger.ns.f25616z2);
        cVar.c().c(this, org.telegram.messenger.ns.f25609y2);
        cVar.c().c(this, org.telegram.messenger.ns.R3);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.N4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.D2);
        this.f45896a2 = launchActivity.getResources().getDrawable(2131232729).mutate();
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624345, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.E2 = ch0Var;
        this.F2 = new org.telegram.ui.Components.ch0(2131624045, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        i30 i30Var = new i30(this, launchActivity);
        this.G1 = i30Var;
        this.f29682b = i30Var;
        this.f29682b.setClipToPadding(false);
        this.f29682b.setFocusable(true);
        this.f29682b.setFocusableInTouchMode(true);
        this.f29682b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f29682b;
        int i12 = this.f29717u0;
        viewGroup.setPadding(i12, 0, i12, 0);
        this.f29682b.setKeepScreenOn(true);
        this.f29682b.setClipChildren(false);
        this.U1 = new ImageReceiver(this.f29682b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.P1 = j5Var;
            j5Var.setGravity(17);
            j5Var.setTextColor(-1);
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setTextSize(18);
            j5Var.k(org.telegram.messenger.hd.L0(2131743435));
            this.f29682b.addView(j5Var, c8.ja.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            j30 j30Var = new j30(this, launchActivity);
            this.Q1 = j30Var;
            j30Var.setGravity(17);
            j30Var.setTextColor(-1);
            j30Var.setTypeface(org.telegram.messenger.g0.o());
            j30Var.setTextSize(60);
            this.f29682b.addView(j30Var, c8.ja.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.R1 = j5Var2;
            j5Var2.setGravity(17);
            j5Var2.setTextColor(-1);
            j5Var2.setTypeface(org.telegram.messenger.g0.o());
            j5Var2.setTextSize(18);
            this.f29682b.addView(j5Var2, c8.ja.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (u1()) {
            r30 r30Var = new r30(this, launchActivity);
            this.P2 = r30Var;
            this.f29682b.addView(r30Var, c8.ja.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        k30 k30Var = new k30(this, launchActivity);
        this.L1 = k30Var;
        k30Var.setClipToPadding(false);
        k30Var.setClipChildren(false);
        q30 q30Var = new q30(this);
        this.S1 = q30Var;
        q30Var.f58586o = erVar;
        q30Var.d = 350L;
        q30Var.f58608c = 350L;
        q30Var.f58609e = 350L;
        q30Var.S();
        k30Var.setItemAnimator(q30Var);
        k30Var.setOnScrollListener(new e10(this));
        k30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.py pyVar = new org.telegram.ui.Components.py(E5 ? 6 : 2, k30Var);
        this.T1 = pyVar;
        k30Var.setLayoutManager(pyVar);
        f10 f10Var = new f10(this);
        this.n1 = f10Var;
        pyVar.z1(f10Var);
        k30Var.i(new g10(this));
        pyVar.C1();
        this.f29682b.addView(k30Var, c8.ja.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        k30Var.setAdapter(w30Var);
        k30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.q6.I(org.telegram.ui.ActionBar.j6.Vg, k30Var);
        k30Var.setOnItemClickListener(new a7(this, launchActivity, r3Var, 14));
        k30Var.setOnItemLongClickListener(new t00(this, 3));
        if (u1()) {
            a40 a40Var = new a40(this, getContext());
            this.A3 = a40Var;
            this.f29682b.addView(a40Var, c8.ja.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(launchActivity);
        this.f45945m4 = uj0Var;
        this.f29682b.addView(uj0Var, c8.ja.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        f40 f40Var = new f40(r3Var, this.f29679a, this);
        this.f45949n4 = f40Var;
        uj0Var.setAdapter(f40Var);
        v4.s sVar = new v4.s(6, false);
        uj0Var.setLayoutManager(sVar);
        sVar.z1(new i10(this));
        uj0Var.setOnItemClickListener(new org.telegram.ui.Components.gj0(this) {
            public final c40 f50816b;

            {
                this.f50816b = this;
            }

            @Override
            public final void b(int i13, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) view;
                        org.telegram.messenger.s3 videoParticipant = k10Var.getVideoParticipant();
                        c40 c40Var2 = this.f50816b;
                        if (videoParticipant == null) {
                            c40Var2.h1(new org.telegram.messenger.s3(k10Var.getParticipant(), false));
                            return;
                        } else {
                            c40Var2.h1(k10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f50816b;
                        c40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                        if (rVar.getParticipant() != null) {
                            c40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        v4.k kVar = new v4.k();
        kVar.S();
        kVar.f58586o = erVar;
        kVar.d = 350L;
        kVar.f58608c = 350L;
        kVar.f58609e = 350L;
        uj0Var.setItemAnimator(new j10(this));
        uj0Var.setOnScrollListener(new k10(this));
        f40Var.H(uj0Var, false, false);
        uj0Var.setVisibility(8);
        l10 l10Var = new l10(this, launchActivity);
        this.f45955p1 = l10Var;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.N2 = new Matrix();
        this.M2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.O2 = paint;
        paint.setShader(this.M2);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(9);
        this.H2 = o9Var;
        org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(12);
        this.I2 = o9Var2;
        o9Var.f37875a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        o9Var.f37876b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        o9Var.b();
        o9Var2.f37875a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        o9Var2.f37876b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        o9Var2.b();
        int i13 = org.telegram.ui.ActionBar.j6.f29271zh;
        o9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.v0(i13), 38));
        o9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.v0(i13), 76));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45974t1 = r2Var;
        r2Var.setCheckable(true);
        r2Var.setTextSize(12);
        l10Var.a(r2Var);
        r2Var.setOnClickListener(new q00(this, 7));
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45970s1 = r2Var2;
        r2Var2.setCheckable(true);
        r2Var2.setTextSize(12);
        r2Var2.d(false, false);
        r2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        r2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.hd.L0(2131743489), false, false);
        org.telegram.ui.Components.voip.r2 r2Var3 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45960q1 = r2Var3;
        r2Var3.setCheckable(true);
        r2Var3.setTextSize(12);
        r2Var3.d(false, false);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(launchActivity);
        r2Var3.addView(fh0Var, c8.ja.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.F4 = ch0Var2;
        fh0Var.setAnimation(ch0Var2);
        r2Var3.setOnClickListener(new q00(this, 10));
        l10Var.a(r2Var3);
        org.telegram.ui.Components.voip.r2 r2Var4 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45965r1 = r2Var4;
        r2Var4.setCheckable(true);
        r2Var4.setTextSize(12);
        r2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.W1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.V1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        r2Var4.addView(imageView, c8.ja.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        r2Var4.setOnClickListener(new q00(this, 11));
        l10Var.a(r2Var4);
        l10Var.a(r2Var2);
        org.telegram.ui.Components.voip.r2 r2Var5 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45979u1 = r2Var5;
        r2Var5.setTextSize(12);
        r2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f29176uh), 0.3f, false, org.telegram.messenger.hd.L0(2131743364), false, false);
        r2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final c40 f52342b;

            {
                this.f52342b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        c40 c40Var2 = this.f52342b;
                        LaunchActivity launchActivity2 = c40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            c40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                c40Var2.f45911e2[0].d(1, false);
                                if (c40Var2.f45980u2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    t20 t20Var = new t20(c40Var2, launchActivity, z11);
                                    c40Var2.f45980u2 = t20Var;
                                    t20Var.setBottomPadding(c40Var2.f29682b.getPaddingBottom());
                                    c40Var2.f29685c.addView(c40Var2.f45980u2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            c40Var2.V1(true, false);
                            c40Var2.U1(false);
                            c40Var2.V2.z();
                            c40Var2.Q0(true);
                            c40Var2.f45955p1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f52342b;
                        c40Var3.Z3.e();
                        org.telegram.messenger.r3 r3Var2 = c40Var3.V2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            c40Var3.O1();
                            c40.w1(launchActivity, new s00(c40Var3, 6), false, false);
                            return;
                        }
                        c40Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.r2 r2Var6 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45984v1 = r2Var6;
        r2Var6.setCheckable(true);
        r2Var6.b(true, false);
        r2Var6.setTextSize(12);
        r2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.hd.L0(2131743294), false, false);
        m10 m10Var = new m10(this, launchActivity);
        this.f45994x1 = m10Var;
        m10Var.setAnimation(ch0Var);
        m10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.r2 r2Var7 = new org.telegram.ui.Components.voip.r2(launchActivity, 50.0f);
        this.f45989w1 = r2Var7;
        r2Var7.setDrawBackground(false);
        r2Var7.setTextSize(12);
        r2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        r2Var7.addView(m10Var, c8.ja.e(50, 50, 49));
        l10Var.a(r2Var7);
        r2Var7.setOnClickListener(new o10(this));
        l10Var.a(r2Var6);
        l10Var.a(r2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f45999y1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232800);
        r2Var7.addView(imageView2, c8.ja.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.V2 != null && u1() && !this.V2.j()) {
            imageView2.setVisibility(0);
            m10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.Z1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fh));
        a30Var.setAlpha(0.0f);
        a30Var.getBackButton().setScaleX(0.9f);
        a30Var.getBackButton().setScaleY(0.9f);
        a30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        a30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        a30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        a30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.j6.v0(i11));
        this.f45916f3 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setIcon(2131231244);
        q0Var.setContentDescription(org.telegram.messenger.hd.L0(2131754839));
        q0Var.setSubMenuOpenSide(2);
        q0Var.setDelegate(new t00(this, 5));
        int i14 = org.telegram.ui.ActionBar.j6.Zg;
        org.telegram.ui.ActionBar.q6.R(q0Var, org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.v0(i14), 6), null, org.telegram.ui.ActionBar.q6.M(i14));
        q0Var.setOnClickListener(new q00(this, 12));
        q0Var.P(org.telegram.ui.ActionBar.j6.v0(i11), false);
        q0Var.P(org.telegram.ui.ActionBar.j6.v0(i11), true);
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.j6.v0(i11));
        this.f45920g3 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131232430);
        q0Var2.setContentDescription(org.telegram.messenger.hd.L0(2131754808));
        org.telegram.ui.ActionBar.q6.R(q0Var2, org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.v0(i14), 6), null, org.telegram.ui.ActionBar.q6.M(i14));
        q0Var2.setOnClickListener(new q00(this, 0));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.j6.v0(i11));
        this.f45924h3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        q0Var3.setIcon(2131232353);
        q0Var3.setContentDescription(org.telegram.messenger.hd.L0(2131754808));
        org.telegram.ui.ActionBar.q6.R(q0Var3, org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.v0(i14), 6), null, org.telegram.ui.ActionBar.q6.M(i14));
        q0Var3.setOnClickListener(new q00(this, 1));
        q10 q10Var = new q10(this, launchActivity, launchActivity);
        this.Z2 = q10Var;
        r10 r10Var = new r10(launchActivity);
        this.I1 = r10Var;
        r10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f45901b3 = paint2;
        paint2.setColor(-12761513);
        s10 s10Var = new s10(this, getContext());
        this.f45897a3 = s10Var;
        org.telegram.ui.ActionBar.q6.U(s10Var, i11, this.J0);
        s10Var.setTextSize(1, 11.0f);
        s10Var.setText(org.telegram.messenger.hd.L0(2131743474));
        s10Var.setMaxLines(1);
        s10Var.setGravity(17);
        s10Var.setTypeface(org.telegram.messenger.g0.o());
        s10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        s10Var.setTag(-1);
        if (!u1()) {
            s10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f45912e3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(q10Var, c8.ja.l(1.0f, 0, -2));
        linearLayout.addView(s10Var, c8.ja.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f29682b.addView(r10Var, c8.ja.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29682b.addView(linearLayout, c8.ja.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f29682b.addView(this.J1, c8.ja.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f46001y3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(q0Var3, c8.ja.o(48, 48));
        linearLayout2.addView(q0Var2, c8.ja.o(48, 48));
        linearLayout2.addView(q0Var, c8.ja.o(48, 48));
        this.f29682b.addView(linearLayout2, c8.ja.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f45900b2 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view, null);
        this.f29682b.addView(view, c8.ja.c(1.0f, -1));
        for (int i15 = 0; i15 < 2; i15++) {
            this.f45911e2[i15] = new t10(this, launchActivity);
            this.f45911e2[i15].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.f45911e2[i15].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f29682b.addView(this.f45911e2[i15], c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f45915f2 = kVar2;
        kVar2.setTag(2131296437, 240);
        this.f45916f3.h(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f45916f3.setShowSubmenuByMove(false);
        int i16 = org.telegram.ui.ActionBar.j6.Vg;
        org.telegram.ui.ActionBar.q6.R(kVar2, org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.v0(i16), 6, 6), null, org.telegram.ui.ActionBar.q6.M(i16));
        org.telegram.ui.ActionBar.q0 q0Var4 = this.f45916f3;
        org.telegram.ui.ActionBar.z0 d = q0Var4.d(1, 0, null, org.telegram.messenger.hd.L0(2131743401), true, true, q0Var4.f29513n0);
        this.f45976t3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.q0 q0Var5 = this.f45916f3;
        org.telegram.ui.ActionBar.z0 d2 = q0Var5.d(2, 0, null, org.telegram.messenger.hd.L0(2131743354), true, true, q0Var5.f29513n0);
        this.f45981u3 = d2;
        d2.m(false, true);
        int i17 = org.telegram.ui.ActionBar.j6.f29041nh;
        d.setCheckColor(i17);
        d.d(org.telegram.ui.ActionBar.j6.v0(i17), org.telegram.ui.ActionBar.j6.v0(i17));
        d2.setCheckColor(i17);
        d2.d(org.telegram.ui.ActionBar.j6.v0(i17), org.telegram.ui.ActionBar.j6.v0(i17));
        Paint paint3 = new Paint(1);
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.z0 f10 = this.f45916f3.f(null, org.telegram.messenger.hd.L0(2131743399), 10, true, 2131232431);
        this.f45935k3 = f10;
        f10.setItemHeight(56);
        org.telegram.ui.ActionBar.z0 f11 = this.f45916f3.f(null, org.telegram.messenger.hd.L0(2131743282), 11, true, 2131232262);
        this.f45939l3 = f11;
        f11.setItemHeight(56);
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(ai.o2.a());
        this.f45948n3 = r0Var;
        org.telegram.ui.ActionBar.z0 f12 = this.f45916f3.f(r0Var, "Live Captions", 14, false, 0);
        this.f45944m3 = f12;
        f12.setItemHeight(56);
        f12.setRightIcon(2131232361);
        f12.setSubtext(org.telegram.messenger.hd.L0(ai.o2.a() ? 2131743280 : 2131743281));
        f12.getRightIcon().setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.v0(i16), 1));
        int i18 = (org.telegram.messenger.hd.f24101a0 ? 3 : 5) | 16;
        ImageView rightIcon = f12.getRightIcon();
        boolean z11 = org.telegram.messenger.hd.f24101a0;
        rightIcon.setLayoutParams(c8.ja.d(40, 40.0f, i18, z11 ? 4.0f : 0.0f, 0.0f, z11 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(i0.a.f(0.3f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xg), -16777216));
        boolean z12 = org.telegram.messenger.hd.f24101a0;
        FrameLayout.LayoutParams d10 = c8.ja.d(-1, 28.0f, i18, z12 ? 52.0f : 0.0f, 0.0f, z12 ? 0.0f : 52.0f, 0.0f);
        d10.width = 1;
        view2.setLayoutParams(d10);
        f12.addView(view2);
        View[] viewArr = {f12.getTextView(), f12.getSubtextView()};
        for (int i19 = 0; i19 < 2; i19++) {
            View view3 = viewArr[i19];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.hd.f24101a0 ? org.telegram.messenger.g0.L(60.0f) : 0;
                layoutParams.rightMargin = org.telegram.messenger.hd.f24101a0 ? 0 : org.telegram.messenger.g0.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        this.f45944m3.getRightIcon().setContentDescription("Speech to Text settings");
        this.f45944m3.getRightIcon().setOnClickListener(new q00(this, 2));
        TextView b10 = this.f45916f3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xg), -16777216));
        this.f46006z3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.z0 f13 = this.f45916f3.f(this.Y2, org.telegram.messenger.hd.L0(org.telegram.messenger.t3.W(this.U2) ? 2131743485 : 2131743384), 6, true, 2131232117);
        this.j3 = f13;
        org.telegram.ui.ActionBar.z0 f14 = this.f45916f3.f(this.Y2, org.telegram.messenger.hd.L0(2131743385), 7, false, 2131232277);
        this.f45962q3 = f14;
        org.telegram.ui.ActionBar.z0 e10 = this.f45916f3.e(3, 2131232204, org.telegram.messenger.hd.L0(2131743337));
        this.f45928i3 = e10;
        x30 x30Var = new x30();
        this.Y2 = x30Var;
        org.telegram.ui.ActionBar.z0 e11 = this.f45916f3.e(9, 2131232353, org.telegram.messenger.hd.L0(2131743436));
        this.f45972s3 = e11;
        org.telegram.ui.ActionBar.z0 f15 = this.f45916f3.f(x30Var, org.telegram.messenger.hd.L0(2131743348), 5, true, 0);
        this.f45967r3 = f15;
        x30Var.a(f15.getImageView());
        org.telegram.ui.ActionBar.z0 e12 = this.f45916f3.e(12, 2131231895, org.telegram.messenger.hd.L0(2131743484));
        this.f45991w3 = e12;
        org.telegram.ui.ActionBar.z0 e13 = this.f45916f3.e(13, 2131230781, org.telegram.messenger.hd.L0(2131743486));
        this.f45996x3 = e13;
        org.telegram.ui.ActionBar.z0 e14 = this.f45916f3.e(4, 2131232088, org.telegram.messenger.hd.L0(r1() ? 2131743379 : org.telegram.messenger.t3.W(this.U2) ? 2131743481 : 2131743380));
        this.f45986v3 = e14;
        this.f45916f3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vg));
        this.f45916f3.getPopupLayout().setFitItems(true);
        int i20 = org.telegram.ui.ActionBar.j6.Yg;
        e12.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        e13.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        this.f45935k3.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        this.f45939l3.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        K1(this.f45944m3, org.telegram.ui.ActionBar.j6.v0(i20));
        int i21 = org.telegram.ui.ActionBar.j6.f29023mh;
        e14.d(org.telegram.ui.ActionBar.j6.v0(i21), org.telegram.ui.ActionBar.j6.v0(i21));
        e10.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        f13.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        f14.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        f15.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        e11.d(org.telegram.ui.ActionBar.j6.v0(i20), org.telegram.ui.ActionBar.j6.v0(i20));
        if (this.V2 != null) {
            o1();
        }
        if (r1()) {
            this.f45934k2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f45934k2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        X1(false);
        this.J1.getTitleTextView().setOnClickListener(new q00(this, 3));
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        u10 u10Var = new u10(this, launchActivity);
        this.f45940l4 = u10Var;
        v10 v10Var = new v10(this);
        this.M4 = v10Var;
        u10Var.setClipToPadding(false);
        v10Var.S();
        v10Var.f58586o = org.telegram.ui.Components.er.f34420f;
        v10Var.d = 350L;
        v10Var.f58608c = 350L;
        v10Var.f58609e = 350L;
        u10Var.setItemAnimator(v10Var);
        u10Var.setOnScrollListener(new w10(this));
        u10Var.setClipChildren(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        u10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.l10 l10Var2 = new org.telegram.ui.Components.l10(r3Var, this.f29679a, this);
        this.o4 = l10Var2;
        u10Var.setAdapter(l10Var2);
        l10Var2.F(u10Var, false);
        u10Var.setOnItemClickListener(new org.telegram.ui.Components.gj0(this) {
            public final c40 f50816b;

            {
                this.f50816b = this;
            }

            @Override
            public final void b(int i132, View view4) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) view4;
                        org.telegram.messenger.s3 videoParticipant = k10Var.getVideoParticipant();
                        c40 c40Var2 = this.f50816b;
                        if (videoParticipant == null) {
                            c40Var2.h1(new org.telegram.messenger.s3(k10Var.getParticipant(), false));
                            return;
                        } else {
                            c40Var2.h1(k10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f50816b;
                        c40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view4;
                        if (rVar.getParticipant() != null) {
                            c40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        u10Var.setOnItemLongClickListener(new t00(this, 0));
        u10Var.setVisibility(8);
        u10Var.i(new x10());
        y10 y10Var = new y10(this, launchActivity, this.L1, u10Var, this.X3, this.V2, this);
        this.Z3 = y10Var;
        y10Var.setClipChildren(false);
        l10Var2.E(this.X3, y10Var);
        if (this.f45945m4 != null) {
            this.f45949n4.G(this.X3, y10Var);
        }
        z10 z10Var = new z10(this, launchActivity);
        this.C4 = z10Var;
        a20 a20Var = new a20(this, launchActivity, this.J1, this.L1, z10Var);
        this.f45942m1 = a20Var;
        a20Var.setImagesLayerNum(Integer.MAX_VALUE);
        a20Var.setInvalidateWithParent(true);
        z10Var.setProfileGalleryView(a20Var);
        b20 b20Var = new b20(this, launchActivity);
        this.B4 = b20Var;
        b20Var.setVisibility(8);
        a20Var.setVisibility(0);
        a20Var.b(new c20(this));
        d20 d20Var = new d20(this, launchActivity);
        this.f45898a4 = d20Var;
        this.f29682b.addView(y10Var);
        y10Var.addView(u10Var, c8.ja.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f45955p1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.I4 = view4;
        int[] iArr = this.L4;
        iArr[0] = this.U3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.L4);
        this.K4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.f29682b.addView(view4, c8.ja.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.J4 = view5;
        view5.setBackgroundColor(this.L4[0]);
        this.f29682b.addView(view5, c8.ja.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.X1 = hVar;
        hVar.setDelegate(new e20(this));
        hVar.setClickCellDelegate(new f20(this));
        org.telegram.messenger.r3 r3Var2 = this.V2;
        if (r3Var2 != null) {
            hVar.D0(this.f45951o1.f22778a, r3Var2.g(false));
        }
        this.f29682b.addView(hVar, c8.ja.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.voip.t0 t0Var = new org.telegram.ui.Components.voip.t0(launchActivity);
        this.f45953o3 = t0Var;
        t0Var.setOnContentHeightChanged(new s00(this, 1));
        this.f29682b.addView(t0Var, c8.ja.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f45957p3 = new ai.o2(new g20(this));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(launchActivity, false, true, true);
        this.H1 = h6Var;
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTextColor(-1);
        h6Var.b(0.4f, 320L, org.telegram.ui.Components.er.h);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f29682b.addView(this.f45955p1);
        h20 h20Var = new h20(this, launchActivity, this.G1, LaunchActivity.Q(), this.J0);
        this.C1 = h20Var;
        h20Var.K = true;
        h20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Y1)});
        h20Var.getEditText().setLinkTextColor(-11683585);
        h20Var.setHint(org.telegram.messenger.hd.L0(2131743928));
        h20Var.getEditText().addTextChangedListener(new i20(this));
        h20Var.s();
        j20 j20Var = new j20(this, launchActivity);
        this.B1 = j20Var;
        this.f29682b.addView(j20Var, c8.ja.c(-1.0f, -1));
        l20 l20Var = new l20(launchActivity);
        this.A1 = l20Var;
        l20Var.addView(h20Var, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        l20Var.addView(h6Var, c8.ja.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        h6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f29682b.addView(l20Var, c8.ja.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.E1 = imageView3;
        int i22 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.Q(imageView3, org.telegram.ui.ActionBar.j6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i22), this.J0);
        int i23 = org.telegram.ui.ActionBar.j6.f28888f7;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView3, i23, e6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new q00(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.D1 = imageView4;
        org.telegram.ui.ActionBar.q6.Q(imageView4, org.telegram.ui.ActionBar.j6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i22), this.J0);
        org.telegram.ui.ActionBar.q6.s(imageView4, org.telegram.ui.ActionBar.j6.f29184v6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231460);
        imageView4.setOnClickListener(new q00(this, 5));
        l20Var.addView(imageView3, c8.ja.e(48, 48, 85));
        l20Var.addView(imageView4, c8.ja.e(48, 48, 85));
        this.f29682b.addView(d20Var);
        b20Var.addView(a20Var, c8.ja.c(-1.0f, -1));
        b20Var.addView(z10Var, c8.ja.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f29682b.addView(b20Var, c8.ja.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.K1.f();
        if (F5) {
            this.f45949n4.I(this.f45945m4, false);
        }
        this.D2 = this.K1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.N1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.U2) && (chat2 = this.U2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f29682b.addView(textView, c8.ja.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(launchActivity);
            ib0Var.setTextColor(-1);
            ib0Var.setSelectorColor(-9598483);
            ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            ib0Var.setItemCount(5);
            m20 m20Var = new m20(launchActivity);
            m20Var.setItemCount(5);
            m20Var.setTextColor(-1);
            m20Var.setSelectorColor(-9598483);
            m20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            n20 n20Var = new n20(launchActivity);
            n20Var.setItemCount(5);
            n20Var.setTextColor(-1);
            n20Var.setSelectorColor(-9598483);
            n20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            o20 o20Var = new o20(launchActivity);
            this.O1 = o20Var;
            o20Var.setLines(1);
            o20Var.setSingleLine(true);
            o20Var.setEllipsize(TextUtils.TruncateAt.END);
            o20Var.setGravity(17);
            o20Var.setTextColor(-1);
            o20Var.setTypeface(org.telegram.messenger.g0.o());
            o20Var.setTextSize(1, 14.0f);
            this.f29682b.addView(o20Var, c8.ja.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            o20Var.setOnClickListener(new org.telegram.messenger.video.g(this, ib0Var, m20Var, n20Var, chat, cVar, inputPeer2, 1));
            q20 q20Var = new q20(launchActivity, ib0Var, m20Var, n20Var);
            this.M1 = q20Var;
            q20Var.setWeightSum(1.0f);
            q20Var.setOrientation(0);
            this.f29682b.addView(q20Var, c8.ja.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i24 = calendar.get(1);
            int i25 = calendar.get(6);
            q20Var.addView(ib0Var, c8.ja.l(0.5f, 0, 270));
            ib0Var.setMinValue(0);
            ib0Var.setMaxValue(365);
            ib0Var.setWrapSelectorWheel(false);
            ib0Var.setFormatter(new v00(currentTimeMillis, calendar, i24, 0));
            a1.d dVar = new a1.d(this, ib0Var, m20Var, n20Var, 14);
            c40Var = this;
            ib0Var.setOnValueChangedListener(dVar);
            m20Var.setMinValue(0);
            m20Var.setMaxValue(23);
            q20Var.addView(m20Var, c8.ja.l(0.2f, 0, 270));
            m20Var.setFormatter(new org.telegram.ui.Components.rb0(25));
            m20Var.setOnValueChangedListener(dVar);
            n20Var.setMinValue(0);
            n20Var.setMaxValue(59);
            n20Var.setValue(0);
            n20Var.setFormatter(new org.telegram.ui.Components.rb0(26));
            q20Var.addView(n20Var, c8.ja.l(0.3f, 0, 270));
            n20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i26 = calendar.get(6);
            int i27 = calendar.get(12);
            int i28 = calendar.get(11);
            ib0Var.setValue(i25 != i26 ? 1 : 0);
            n20Var.setValue(i27);
            m20Var.setValue(i28);
            org.telegram.ui.Components.t4.g(o20Var, textView, 0L, 604800L, 2, ib0Var, m20Var, n20Var);
        } else {
            c40Var = this;
        }
        r20 r20Var = new r20(c40Var, (ViewGroup) c40Var.getWindow().getDecorView(), c40Var.f29682b);
        c40Var.f45902b4 = r20Var;
        r20Var.E = new s20(c40Var);
        a20Var.setPinchToZoomHelper(r20Var);
        c40Var.f45970s1.setOnClickListener(new View.OnClickListener(c40Var) {
            public final c40 f52342b;

            {
                this.f52342b = c40Var;
            }

            @Override
            public final void onClick(View view6) {
                switch (r3) {
                    case 0:
                        c40 c40Var2 = this.f52342b;
                        LaunchActivity launchActivity2 = c40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            c40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z112 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                c40Var2.f45911e2[0].d(1, false);
                                if (c40Var2.f45980u2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z112 = true;
                                    }
                                    t20 t20Var = new t20(c40Var2, launchActivity, z112);
                                    c40Var2.f45980u2 = t20Var;
                                    t20Var.setBottomPadding(c40Var2.f29682b.getPaddingBottom());
                                    c40Var2.f29685c.addView(c40Var2.f45980u2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            c40Var2.V1(true, false);
                            c40Var2.U1(false);
                            c40Var2.V2.z();
                            c40Var2.Q0(true);
                            c40Var2.f45955p1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        c40 c40Var3 = this.f52342b;
                        c40Var3.Z3.e();
                        org.telegram.messenger.r3 r3Var22 = c40Var3.V2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            c40Var3.O1();
                            c40.w1(launchActivity, new s00(c40Var3, 6), false, false);
                            return;
                        }
                        c40Var3.dismiss();
                        return;
                }
            }
        });
        c40Var.T1(false);
        c40Var.O1();
        c40Var.U1(false);
        c40Var.V1(false, false);
        c40Var.G1(0.0f);
        c40Var.W1();
        c40Var.f29682b.addView(new FrameLayout(launchActivity), c8.ja.e(-1, 200, 87));
        c40Var.f45984v1.setOnClickListener(new q00(c40Var, 6));
        c40Var.V0();
        c8.na.a(c40Var.f45970s1);
        c8.na.a(c40Var.f45974t1);
        c8.na.a(c40Var.f45960q1);
        c8.na.a(c40Var.f45965r1);
        c8.na.a(c40Var.f45989w1);
        c8.na.a(c40Var.f45979u1);
        c8.na.a(c40Var.f45984v1);
        r0.i0.l(c40Var.f29682b, new t00(c40Var, 1));
    }

    public static void B1(org.telegram.messenger.r3 r3Var, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f26211f;
            ArrayList arrayList2 = r3Var.f26210e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null) {
                r3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                r3Var.f26212g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.gj.B1(((org.telegram.messenger.s3) arrayList.get(i7)).f26393a.peer) == org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = r3Var.f26208b;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25588v2, new Object[0]);
    }

    public static void I0(final c40 c40Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z10;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = c40Var.f45951o1;
        ArrayList arrayList = c40Var.A2;
        w30 w30Var = c40Var.K1;
        if (view instanceof org.telegram.ui.Components.voip.r) {
            c40Var.h1(((org.telegram.ui.Components.voip.r) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.f4) {
            c40Var.L1((org.telegram.ui.Cells.f4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                if (y3Var.getUser() != null) {
                    if (c40Var.r1()) {
                        int i10 = i7 - w30Var.f52383n;
                        if (i10 >= 0 && i10 < c40Var.V2.f26217m.size()) {
                            l10 = (Long) c40Var.V2.f26217m.get(i7 - w30Var.f52383n);
                        } else {
                            int i11 = i7 - w30Var.f52385s;
                            if (i11 >= 0 && i11 < c40Var.V2.f26216l.size()) {
                                l10 = (Long) c40Var.V2.f26216l.get(i7 - w30Var.f52385s);
                            } else {
                                int i12 = i7 - w30Var.f52382f;
                                if (c40Var.f45947n2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                } else {
                                    if (i12 >= 0 && i12 < c40Var.V2.f26214j.size()) {
                                        l10 = (Long) c40Var.V2.f26214j.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                }
                                if (!z10 && (q3Var = (org.telegram.messenger.q3) c40Var.V2.f26215k.get(l10)) != null) {
                                    org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(c40Var.f29685c, c40Var.J0, y3Var);
                                    F.l(2131232130, org.telegram.messenger.hd.M0(2131749460, null), new Runnable(c40Var) {
                                        public final c40 f44909b;

                                        {
                                            this.f44909b = c40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f26052a;
                                                    final c40 c40Var2 = this.f44909b;
                                                    ConnectionsManager.getInstance(c40Var2.f29679a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var3 = c40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.np.s1(c40Var3.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = c40Var2.V2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f26053b = false;
                                                        r3Var2.f26215k.put(l10, q3Var2);
                                                        c40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f26052a;
                                                    final c40 c40Var3 = this.f44909b;
                                                    ConnectionsManager.getInstance(c40Var3.f29679a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var32 = c40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f26052a));
                                                    org.telegram.messenger.np.s1(c40Var3.f29679a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = c40Var3.V2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f26214j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        c40Var3.V2.f26218n.remove(l11);
                                                        c40Var3.V2.f26215k.remove(l11);
                                                        c40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, q3Var.a());
                                    F.c(2131232329, org.telegram.messenger.hd.M0(2131749471, null), new Runnable(c40Var) {
                                        public final c40 f44909b;

                                        {
                                            this.f44909b = c40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f26052a;
                                                    final c40 c40Var2 = this.f44909b;
                                                    ConnectionsManager.getInstance(c40Var2.f29679a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var32 = c40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = c40Var2.V2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f26053b = false;
                                                        r3Var2.f26215k.put(l10, q3Var2);
                                                        c40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f26052a;
                                                    final c40 c40Var3 = this.f44909b;
                                                    ConnectionsManager.getInstance(c40Var3.f29679a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var32 = c40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    c40 c40Var4 = c40Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        c40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f26052a));
                                                    org.telegram.messenger.np.s1(c40Var3.f29679a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = c40Var3.V2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f26214j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        c40Var3.V2.f26218n.remove(l11);
                                                        c40Var3.V2.f26215k.remove(l11);
                                                        c40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    F.W(org.telegram.ui.ActionBar.j6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), c40Var.f45995x2.getColor()));
                                    F.f37111s = 96;
                                    F.Z();
                                    return;
                                }
                                return;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            org.telegram.ui.Components.m60 F2 = org.telegram.ui.Components.m60.F(c40Var.f29685c, c40Var.J0, y3Var);
                            F2.l(2131232130, org.telegram.messenger.hd.M0(2131749460, null), new Runnable(c40Var) {
                                public final c40 f44909b;

                                {
                                    this.f44909b = c40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f26052a;
                                            final c40 c40Var2 = this.f44909b;
                                            ConnectionsManager.getInstance(c40Var2.f29679a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = c40Var2.V2;
                                            if (r3Var2 != null) {
                                                q3Var2.f26053b = false;
                                                r3Var2.f26215k.put(l10, q3Var2);
                                                c40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f26052a;
                                            final c40 c40Var3 = this.f44909b;
                                            ConnectionsManager.getInstance(c40Var3.f29679a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f26052a));
                                            org.telegram.messenger.np.s1(c40Var3.f29679a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = c40Var3.V2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f26214j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                c40Var3.V2.f26218n.remove(l11);
                                                c40Var3.V2.f26215k.remove(l11);
                                                c40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, q3Var.a());
                            F2.c(2131232329, org.telegram.messenger.hd.M0(2131749471, null), new Runnable(c40Var) {
                                public final c40 f44909b;

                                {
                                    this.f44909b = c40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f26052a;
                                            final c40 c40Var2 = this.f44909b;
                                            ConnectionsManager.getInstance(c40Var2.f29679a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = c40Var2.V2;
                                            if (r3Var2 != null) {
                                                q3Var2.f26053b = false;
                                                r3Var2.f26215k.put(l10, q3Var2);
                                                c40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f26052a;
                                            final c40 c40Var3 = this.f44909b;
                                            ConnectionsManager.getInstance(c40Var3.f29679a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var32 = c40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.np.s1(c40Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            c40 c40Var4 = c40Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.np.s1(c40Var4.f29679a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                c40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f26052a));
                                            org.telegram.messenger.np.s1(c40Var3.f29679a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = c40Var3.V2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f26214j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                c40Var3.V2.f26218n.remove(l11);
                                                c40Var3.V2.f26215k.remove(l11);
                                                c40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            F2.W(org.telegram.ui.ActionBar.j6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), c40Var.f45995x2.getColor()));
                            F2.f37111s = 96;
                            F2.Z();
                            return;
                        }
                        return;
                    }
                    c40Var.d2.O0(c40Var.f29679a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", y3Var.getUser().f28200id);
                    if (y3Var.f32056a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    c40Var.d2.t0(new ProfileActivity(bundle, null));
                    c40Var.dismiss();
                }
            } else if (i7 == w30Var.f52387x) {
                if (org.telegram.messenger.t3.T(c40Var.U2) && (chat = c40Var.U2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                    c40Var.m1(false);
                    return;
                }
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(cVar.f22778a).N0(c40Var.l1());
                if (N0 != null) {
                    c40Var.f45966r2 = false;
                    Context context = c40Var.getContext();
                    int i13 = cVar.f22778a;
                    TLRPC.Chat chat2 = c40Var.U2;
                    org.telegram.messenger.r3 r3Var2 = c40Var.V2;
                    org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20(context, i13, chat2, N0, r3Var2.d, r3Var2.f26218n);
                    c40Var.D3 = k20Var;
                    k20Var.setOnDismissListener(new y00(c40Var, 2));
                    org.telegram.ui.Components.k20 k20Var2 = c40Var.D3;
                    k20Var2.f36253b2 = new h10(c40Var);
                    k20Var2.show();
                }
            } else if (i7 == w30Var.f52388y) {
                org.telegram.messenger.r3 r3Var3 = c40Var.V2;
                if (r3Var3 != null && r3Var3.f26208b != null) {
                    wg.c1 c1Var = new wg.c1(activity, c40Var.f29679a, null, 4, new fi.i0());
                    org.telegram.messenger.r3 r3Var4 = c40Var.V2;
                    if (r3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(r3Var4.f26210e).map(new aa.l(12)).collect(Collectors.toSet());
                    }
                    c1Var.f59167y2.addAll(collection);
                    c1Var.o1(false, true);
                    c1Var.f59165w2 = new s00(c40Var, 5);
                    c1Var.o1(false, true);
                    c1Var.f59168z2 = new bi.e4(18, c40Var, r3Var);
                    c1Var.show();
                }
            } else if (i7 == w30Var.E) {
                c40Var.A1();
            }
        }
    }

    public static void J0(c40 c40Var, org.telegram.ui.Components.voip.r rVar, boolean z10) {
        if (!c40Var.J) {
            if (z10 && rVar.getRenderer() == null) {
                rVar.setRenderer(org.telegram.ui.Components.voip.z.c(c40Var.X3, c40Var.Z3, rVar, null, null, rVar.getParticipant(), c40Var.V2, c40Var));
            } else if (!z10 && rVar.getRenderer() != null) {
                rVar.getRenderer().setPrimaryView(null);
                rVar.setRenderer(null);
            }
        }
    }

    public static void K0(c40 c40Var, int i7, int[] iArr) {
        if (c40Var.u1()) {
            int i10 = org.telegram.ui.ActionBar.j6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.T3, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ch, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29099qh, false));
            iArr[2] = org.telegram.messenger.g0.S0(c40Var.T3, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28822bh, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ah, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.T3, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29080ph, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29099qh, false));
            iArr[2] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29060oh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29232xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.T3, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29137sh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29156th, false));
            iArr[2] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29119rh, false);
        } else if (s1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28823bi, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28843ci, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28860di, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(c40Var.T3, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Dh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Eh, false));
            iArr[2] = org.telegram.messenger.g0.S0(c40Var.T3, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28822bh, false), org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        }
        if (s1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28823bi, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29137sh, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29213wh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29251yh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ah, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29271zh, false));
        }
    }

    public static void K1(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        if (z0Var != null) {
            z0Var.d(i7, i7);
            if (z0Var.getRightIcon() != null) {
                z0Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static String L0() {
        String[] strArr = org.telegram.messenger.k6.f24645i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void M0(c40 c40Var) {
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        if (r3Var != null && r3Var.f26208b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.r3 r3Var2 = c40Var.V2;
            togglegroupcallsettings.call = r3Var2.g(r3Var2.f26207a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(c40Var.V2.f26208b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(c40Var.f45951o1.f22778a);
            org.telegram.messenger.p5 p5Var = Utilities.d;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new c10(c40Var, 1));
        }
    }

    public static void N0(c40 c40Var, boolean z10) {
        if (c40Var.V2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        togglegroupcallsettings.call = r3Var.g(r3Var.f26207a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        c40Var.f45993w5 = Boolean.valueOf(z10);
        c40Var.N1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(c40Var.f45951o1.f22778a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new c10(c40Var, 0));
    }

    public static int O0(c40 c40Var, int i7) {
        l10 l10Var = c40Var.f45955p1;
        org.telegram.ui.Components.voip.r g12 = c40Var.g1();
        if (g12 == null) {
            return Integer.MIN_VALUE;
        }
        int measuredHeight = ((l10Var.getMeasuredHeight() / 2) + l10Var.getTop()) - (c40Var.f45979u1.getMeasuredHeight() / 2);
        int measuredHeight2 = g12.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        return i5.c.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void P0(c40 c40Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f10;
        float f11;
        float L;
        float L2;
        float L3;
        float f12;
        float f13;
        float f14;
        View childAt;
        a30 a30Var = c40Var.J1;
        k30 k30Var = c40Var.L1;
        int childCount = k30Var.getChildCount();
        boolean z12 = false;
        float f15 = 2.1474836E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (RecyclerView.R(k30Var.getChildAt(i7)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = k30Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && a30Var.getTag() == null) || (!z10 && a30Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            a30Var.setTag(num);
            AnimatorSet animatorSet = c40Var.f45904c2;
            if (animatorSet != null) {
                animatorSet.cancel();
                c40Var.f45904c2 = null;
            }
            if (a30Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            c40Var.G0(z11);
            ViewPropertyAnimator animate = a30Var.getBackButton().animate();
            float f16 = 0.9f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z10) {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34420f;
            duration.setInterpolator(erVar).start();
            ViewPropertyAnimator animate2 = a30Var.getTitleTextView().animate();
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(erVar).start();
            ObjectAnimator objectAnimator = c40Var.T4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                c40Var.T4.cancel();
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = a30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = a30Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            c40Var.T4 = ofFloat;
            ofFloat.setDuration(300L);
            c40Var.T4.setInterpolator(erVar);
            c40Var.T4.addListener(new z20(0, c40Var, z10));
            c40Var.T4.start();
            ObjectAnimator objectAnimator2 = c40Var.U4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.j5 additionalSubtitleTextView = a30Var.getAdditionalSubtitleTextView();
            if (z10) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            c40Var.U4 = ofFloat2;
            ofFloat2.setDuration(300L);
            c40Var.U4.setInterpolator(erVar);
            c40Var.U4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            c40Var.f45904c2 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = c40Var.f45904c2;
            Property property2 = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a30Var, property2, f12);
            r10 r10Var = c40Var.I1;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r10Var, property2, f13);
            View view = c40Var.f45900b2;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            c40Var.f45904c2.addListener(new x20(c40Var, 1));
            c40Var.f45904c2.start();
            c40Var.Z3.f40751w.setClickable((!z10 || E5) ? true : true);
        }
        if (c40Var.f45975t2 != L4) {
            c40Var.J1(L4);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (C5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    C5 = new c40(launchActivity, cVar, org.telegram.messenger.np.s1(cVar.f22778a).g1(chat.f28051id, false, null), chat, inputPeer, z10, str);
                } else {
                    org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                    if (r3Var != null) {
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(cVar.f22778a).M0(Long.valueOf(r3Var.f26209c));
                        r3Var.b(true);
                        C5 = new c40(launchActivity, cVar, r3Var, M0, null, z10, str);
                    } else {
                        return;
                    }
                }
                C5.d2 = launchActivity;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(21));
            }
        }
    }

    public static String i1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return org.telegram.messenger.hd.M0(2131743503, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.hd.M0(2131743501, null);
            } else {
                return org.telegram.messenger.hd.M0(2131743500, null);
            }
        }
        return org.telegram.messenger.hd.M0(2131743499, null);
    }

    public static String j1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.hd.a0(null, null, 2131743497, str);
            }
            return org.telegram.messenger.hd.M0(2131743498, null);
        } else if (i7 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.hd.M0(2131743496, null);
            }
            return org.telegram.messenger.hd.M0(2131743495, null);
        } else {
            return org.telegram.messenger.hd.M0(2131743494, null);
        }
    }

    public static boolean s1(int i7) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f26208b.rtmp_stream) && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public static void w1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && org.telegram.messenger.t3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                if (isConference) {
                    t1Var.S = org.telegram.messenger.hd.M0(2131743468, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131743469, null);
                } else if (org.telegram.messenger.t3.W(chat)) {
                    t1Var.S = org.telegram.messenger.hd.M0(2131743471, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131743472, null);
                } else {
                    t1Var.S = org.telegram.messenger.hd.M0(2131743361, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131743362, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.f26208b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                    if (z10) {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false));
                    } else {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                        int i7 = org.telegram.ui.ActionBar.j6.f28950ih;
                        int i10 = org.telegram.ui.ActionBar.j6.f28915gh;
                        int i11 = org.telegram.ui.ActionBar.j6.f28878eh;
                        checkBoxSquare.f32457s = i7;
                        checkBoxSquare.f32458w = i10;
                        checkBoxSquare.f32459x = i11;
                        checkBoxSquare.invalidate();
                    }
                    c2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        c2VarArr[0].e(org.telegram.messenger.hd.M0(2131743470, null), "", false, false, false);
                    } else if (org.telegram.messenger.t3.W(chat)) {
                        c2VarArr[0].e(org.telegram.messenger.hd.M0(2131743473, null), "", false, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.hd.M0(2131743363, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                    if (org.telegram.messenger.hd.f24101a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.hd.f24101a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var2.setPadding(L, 0, L2, 0);
                    f10.addView(c2VarArr[0], c8.ja.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new z00(c2VarArr, 0));
                }
                alertDialog$Builder.o(f10);
                t1Var.J = org.telegram.ui.ActionBar.j6.f28915gh;
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743364, null), new bg.e0(r3Var, c2VarArr, selfId, runnable, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                if (z10) {
                    t1Var.Q0 = false;
                }
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        t1Var.getWindow().setType(2038);
                    } else {
                        t1Var.getWindow().setType(2003);
                    }
                    t1Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    t1Var.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29006lh, false));
                }
                t1Var.show();
                if (!z10) {
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29023mh, null);
                    }
                    t1Var.p(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yg, false));
                    return;
                }
                return;
            }
            B1(r3Var, false, selfId, runnable);
        }
    }

    public final void A1() {
        org.telegram.messenger.r3 r3Var = this.V2;
        if (r3Var != null && r3Var.f26208b != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.V2.f26208b;
            tL_inputGroupCall.f28068id = groupCall.f28061id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f29679a).sendRequest(exportgroupcallinvite, new z9(this, t1Var, exportgroupcallinvite, 12));
        }
    }

    public final void C1(TLRPC.GroupCallParticipant groupCallParticipant, final long j3, int i7) {
        TLObject M0;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        ?? r14;
        TextView textView;
        int i16;
        int i17;
        String str3;
        String str4;
        ?? r15;
        int i18;
        int i19;
        int i20;
        String str5;
        int i21;
        EditText editText;
        int i22;
        String str6;
        String M02;
        int i23;
        ?? r22;
        AlertDialog$Builder alertDialog$Builder;
        String M03;
        int i24;
        int i25;
        int i26;
        int L;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i27 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            org.telegram.messenger.c cVar = this.f45951o1;
            if (i27 > 0) {
                M0 = org.telegram.messenger.np.s1(cVar.f22778a).a2(Long.valueOf(j3));
            } else {
                M0 = org.telegram.messenger.np.s1(cVar.f22778a).M0(Long.valueOf(-j3));
            }
            TLObject tLObject = M0;
            boolean z10 = true;
            if (i7 != 0 && i7 != 2 && i7 != 3) {
                if (i7 == 6) {
                    this.d2.O0(this.f29679a);
                    Bundle bundle = new Bundle();
                    if (i27 > 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    this.d2.t0(new an(bundle));
                    dismiss();
                } else if (i7 == 8) {
                    this.d2.O0(this.f29679a);
                    org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d2.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
                    if ((e2Var instanceof an) && ((an) e2Var).a() == j3) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i27 > 0) {
                        bundle2.putLong("user_id", j3);
                    } else {
                        bundle2.putLong("chat_id", -j3);
                    }
                    this.d2.t0(new an(bundle2));
                    dismiss();
                } else if (i7 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    R1(2, true);
                } else if (i7 == 9) {
                    org.telegram.ui.Components.m30 m30Var = this.f45921g4;
                    if (m30Var == null || !m30Var.g()) {
                        TLRPC.User f10 = org.telegram.messenger.m10.i(cVar.f22778a).f();
                        org.telegram.ui.Components.m30 m30Var2 = new org.telegram.ui.Components.m30(0, true, true);
                        this.f45921g4 = m30Var2;
                        m30Var2.I = true;
                        m30Var2.S = true;
                        m30Var2.H = true;
                        m30Var2.K = true;
                        m30Var2.T = true;
                        m30Var2.f37040a = this.d2.M().getLastFragment();
                        org.telegram.ui.Components.m30 m30Var3 = this.f45921g4;
                        l30 l30Var = new l30(this, j3);
                        this.f45925h4 = l30Var;
                        m30Var3.f37041b = l30Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f10.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z10 = false;
                        }
                        m30Var3.n(z10, new s00(this, 9), new hi.f1(5), 0);
                    }
                } else if (i7 == 10) {
                    String str7 = groupCallParticipant.about;
                    Context context = getContext();
                    int i28 = this.f29679a;
                    Pattern pattern = org.telegram.ui.Components.t4.f39507a;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                    if (i27 > 0) {
                        str6 = null;
                        M02 = org.telegram.messenger.hd.M0(2131743765, null);
                    } else {
                        str6 = null;
                        M02 = org.telegram.messenger.hd.M0(2131751459, null);
                    }
                    String str8 = M02;
                    final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
                    t1Var.S = str8;
                    if (i27 > 0) {
                        i23 = 2131743396;
                    } else {
                        i23 = 2131751462;
                    }
                    t1Var.U = org.telegram.messenger.hd.M0(i23, str6);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i27 < 0) {
                        alertDialog$Builder = alertDialog$Builder2;
                        long j10 = -j3;
                        r22 = false;
                        if (org.telegram.messenger.np.s1(i28).N0(j10) == null) {
                            org.telegram.messenger.np.s1(i28).V2(ConnectionsManager.generateClassGuid(), j10, true);
                            r22 = false;
                        }
                    } else {
                        r22 = 0;
                        alertDialog$Builder = alertDialog$Builder2;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i29 = org.telegram.ui.ActionBar.j6.Yg;
                    org.telegram.ui.ActionBar.q6.U(editText2, i29, null);
                    if (i27 > 0) {
                        M03 = org.telegram.messenger.hd.M0(2131743765, null);
                    } else {
                        M03 = org.telegram.messenger.hd.M0(2131751459, null);
                    }
                    editText2.setHint(M03);
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.j6.U(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i27 > 0) {
                        i24 = 70;
                    } else {
                        i24 = 255;
                    }
                    org.telegram.ui.Components.k3 k3Var = new org.telegram.ui.Components.k3(i24, context, numberTextView);
                    InputFilter[] inputFilterArr = new InputFilter[1];
                    inputFilterArr[r22] = k3Var;
                    editText2.setFilters(inputFilterArr);
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B6, r22));
                    numberTextView.setImportantForAccessibility(2);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i25 = 3;
                    } else {
                        i25 = 5;
                    }
                    frameLayout.addView(numberTextView, c8.ja.d(20, 20.0f, i25, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (org.telegram.messenger.hd.f24101a0) {
                        i26 = org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i26 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    if (org.telegram.messenger.hd.f24101a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(24.0f);
                    }
                    editText2.setPadding(i26, L2, L, org.telegram.messenger.g0.L(8.0f));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.aq(i24, numberTextView));
                    org.telegram.messenger.g0.Y3(numberTextView, false, 0.0f, true, false);
                    editText2.setText(str7);
                    editText2.setSelection(editText2.getText().toString().length());
                    AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                    alertDialog$Builder3.o(frameLayout);
                    final c4.n nVar = new c4.n(j3, i28, editText2, 3);
                    alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131745946, null), nVar);
                    alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    t1Var.O = new org.telegram.ui.Components.g1(editText2, 1);
                    frameLayout.addView(editText2, c8.ja.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    org.telegram.messenger.g0.J3(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i30, KeyEvent keyEvent) {
                            if (i30 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                                if (t1Var2.isShowing()) {
                                    nVar.h(t1Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    t1Var.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29006lh, false));
                    t1Var.show();
                    t1Var.p(org.telegram.ui.ActionBar.j6.x0(null, i29, false));
                } else if (i7 == 11) {
                    Context context2 = getContext();
                    int i30 = this.f29679a;
                    Pattern pattern2 = org.telegram.ui.Components.t4.f39507a;
                    if (org.telegram.messenger.m5.E(j3)) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i30).a2(Long.valueOf(j3));
                        str3 = a22.first_name;
                        str4 = a22.last_name;
                    } else {
                        str3 = org.telegram.messenger.np.s1(i30).M0(Long.valueOf(-j3)).title;
                        str4 = null;
                    }
                    ?? alertDialog$Builder4 = new AlertDialog$Builder(context2);
                    if (i27 > 0) {
                        i18 = 2131743415;
                        r15 = 0;
                    } else {
                        r15 = 0;
                        i18 = 2131743414;
                    }
                    String M04 = org.telegram.messenger.hd.M0(i18, r15);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder4.f28392a;
                    t1Var2.S = M04;
                    LinearLayout f11 = org.telegram.messenger.k5.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i31 = org.telegram.ui.ActionBar.j6.Yg;
                    org.telegram.ui.ActionBar.q6.U(editText3, i31, r15);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i19 = 5;
                    } else {
                        i19 = 3;
                    }
                    editText3.setGravity(i19);
                    editText3.setInputType(49152);
                    if (i27 > 0) {
                        i20 = 5;
                    } else {
                        i20 = 6;
                    }
                    editText3.setImeOptions(i20);
                    if (i27 > 0) {
                        i21 = 2131750694;
                        str5 = null;
                    } else {
                        str5 = null;
                        i21 = 2131743413;
                    }
                    editText3.setHint(org.telegram.messenger.hd.M0(i21, str5));
                    editText3.setBackground(org.telegram.ui.ActionBar.j6.U(context2));
                    editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    editText3.requestFocus();
                    if (i27 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.q6.U(editText, i31, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (org.telegram.messenger.hd.f24101a0) {
                            i22 = 5;
                        } else {
                            i22 = 3;
                        }
                        editText.setGravity(i22);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(org.telegram.messenger.hd.M0(2131749032, null));
                        editText.setBackground(org.telegram.ui.ActionBar.j6.U(context2));
                        editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    } else {
                        editText = null;
                    }
                    org.telegram.messenger.g0.J3(editText3);
                    f11.addView(editText3, c8.ja.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        f11.addView(editText, c8.ja.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder4.o(f11);
                    ki.o1 o1Var = new ki.o1(editText3, j3, i30, editText);
                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131745946, null), o1Var);
                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    t1Var2.O = new di.a3(7, editText3, editText);
                    t1Var2.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29006lh, false));
                    t1Var2.show();
                    t1Var2.p(org.telegram.ui.ActionBar.j6.x0(null, i31, false));
                    ld ldVar = new ld(1, t1Var2, o1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(ldVar);
                    } else {
                        editText3.setOnEditorActionListener(ldVar);
                    }
                } else if (i7 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    n1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        i16 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        i16 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    sharedInstance.setParticipantVolume(groupCallParticipant, org.telegram.messenger.t3.H(groupCallParticipant));
                    UndoView n1 = n1();
                    if (i7 == i16) {
                        i17 = 31;
                    } else {
                        i17 = 36;
                    }
                    n1.k(0L, i17, tLObject, null, null, null);
                }
            } else if (i7 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    n1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                ?? alertDialog$Builder5 = new AlertDialog$Builder(getContext());
                int i32 = org.telegram.ui.ActionBar.j6.f28915gh;
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder5.f28392a;
                t1Var3.J = i32;
                TextView textView2 = new TextView(getContext());
                int i33 = org.telegram.ui.ActionBar.j6.Yg;
                org.telegram.ui.ActionBar.q6.U(textView2, i33, null);
                textView2.setTextSize(1, 16.0f);
                if (org.telegram.messenger.hd.f24101a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView2.setGravity(i10 | 48);
                ?? frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder5.o(frameLayout2);
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.u(org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getContext());
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                if (org.telegram.messenger.hd.f24101a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout2.addView(i9Var, c8.ja.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                t8Var.p(tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    i9Var.f(user, t8Var);
                    str = org.telegram.messenger.q10.j(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    i9Var.f(chat, t8Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.k5.m(textView3, i33, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (org.telegram.messenger.hd.f24101a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView3.setGravity(i12 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.U2;
                if (chat2 != null) {
                    str2 = chat2.title;
                } else {
                    str2 = "";
                }
                if (i7 == 2) {
                    if (r1()) {
                        textView3.setText(org.telegram.messenger.hd.M0(2131743421, null));
                        org.telegram.messenger.k5.q(null, null, 2131743422, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(org.telegram.messenger.hd.M0(2131743345, null));
                        if (org.telegram.messenger.t3.W(this.U2)) {
                            org.telegram.messenger.k5.q(null, null, 2131743464, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.k5.q(null, null, 2131743346, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(org.telegram.messenger.hd.M0(2131743402, null));
                    org.telegram.messenger.k5.q(null, null, 2131743403, new Object[]{str, str2}, textView2);
                }
                boolean z12 = org.telegram.messenger.hd.f24101a0;
                if (z12) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                int i34 = i13 | 48;
                int i35 = 76;
                if (z12) {
                    i14 = 21;
                } else {
                    i14 = 76;
                }
                float f12 = i14;
                if (!z12) {
                    i35 = 21;
                }
                frameLayout2.addView(textView3, c8.ja.d(-1, -2.0f, i34, f12, 11.0f, i35, 0.0f));
                if (org.telegram.messenger.hd.f24101a0) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout2.addView(textView2, c8.ja.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i7 == 2) {
                    r14 = 0;
                    alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131743311, null), new tr(9, this, tLObject));
                } else {
                    r14 = 0;
                    r14 = 0;
                    if (z11) {
                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131743404, null), new di.h(this, (TLRPC.User) tLObject, j3, 6));
                    }
                }
                alertDialog$Builder5.h(org.telegram.messenger.hd.M0(2131752589, r14), r14);
                t1Var3.j(org.telegram.ui.ActionBar.j6.x0(r14, org.telegram.ui.ActionBar.j6.f29006lh, false));
                t1Var3.show();
                if (i7 == 2 && (textView = (TextView) t1Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29023mh, r14);
                }
            }
        }
    }

    public final void D1(boolean r18, org.telegram.ui.Cells.f4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.D1(boolean, org.telegram.ui.Cells.f4):void");
    }

    public final void E1() {
        m4 m4Var = this.f46007z4;
        org.telegram.messenger.g0.r(m4Var);
        if (this.f46002y4 && this.P2 != null && VoIPService.getSharedInstance() != null && u1() && this.L1 != null && org.telegram.messenger.qc.e(512)) {
            org.telegram.messenger.g0.i3(m4Var, 30L);
        }
    }

    public final void F1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j3;
        this.C1.setText("");
        org.telegram.messenger.r3 r3Var = this.V2;
        if (r3Var != null && r3Var.f26208b != null && (g10 = r3Var.g(r3Var.f26207a)) != null) {
            org.telegram.messenger.r3 r3Var2 = this.V2;
            long j10 = r3Var2.f26208b.f28061id;
            TLRPC.Peer peer = r3Var2.J;
            if (peer != null) {
                j3 = org.telegram.messenger.m5.o(peer);
            } else {
                j3 = org.telegram.messenger.m10.i(this.f29679a).f24953n;
            }
            GroupCallMessagesController.getInstance(this.f29679a).sendCallMessage(j3, tL_textWithEntities, j10, g10);
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.f46003y5.f57081e;
            l10 l10Var = this.f45955p1;
            l10Var.setAlpha(f12);
            this.Z3.setProgressToHideUi(f10);
            this.f45940l4.invalidate();
            this.f29682b.invalidate();
            l10Var.invalidate();
        }
        if (i7 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.f29682b.invalidate();
        }
        if (i7 == 4) {
            a1();
            this.B1.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 5) {
            a1();
            this.f29682b.invalidate();
        }
    }

    public final void G1(float f10) {
        float f11;
        int i7;
        int i10;
        this.T3 = f10;
        y10 y10Var = this.Z3;
        if (y10Var == null) {
            f11 = 0.0f;
        } else {
            f11 = y10Var.f40726c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.j6.f28802ah;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Xg;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        this.U3 = S0;
        this.I1.setBackgroundColor(S0);
        this.f45916f3.I(-14472653);
        this.f45896a2.setColorFilter(new PorterDuffColorFilter(this.U3, PorterDuff.Mode.MULTIPLY));
        this.H0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, i11, false), org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28822bh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28988kh, false));
        g.b bVar = this.f45934k2;
        if (bVar != null) {
            bVar.f12614b = S02;
            rv rvVar = (rv) bVar.f12619i;
            if (rvVar != null) {
                rvVar.invalidate();
            }
        }
        this.f45995x2.setColor(S02);
        this.f46004z1.setColor(S02);
        this.A1.invalidate();
        k30 k30Var = this.L1;
        k30Var.setGlowColor(S02);
        int i13 = this.E3;
        if (i13 == 3 || s1(i13)) {
            this.f45989w1.invalidate();
        }
        View view = this.I4;
        if (view != null) {
            int i14 = this.U3;
            int[] iArr = this.L4;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.K4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.K4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.J4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29176uh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29194vh, false));
        this.f45979u1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28842ch, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28895fh, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28859dh, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28950ih, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0);
        int childCount = k30Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = k30Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                if (r1()) {
                    z3Var.a(w02, w02);
                } else {
                    z3Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.f4;
                a30 a30Var = this.J1;
                if (z10) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (a30Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.j6.f28950ih;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f28859dh;
                    }
                    f4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (a30Var.getTag() != null) {
                        i7 = org.telegram.ui.ActionBar.j6.f28950ih;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f28859dh;
                    }
                    y3Var.a(i7, S05);
                }
            }
        }
        this.f29682b.invalidate();
        k30Var.invalidate();
        this.f29685c.invalidate();
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void H1(float f10) {
        k30 k30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        v4.e1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.K2 = min;
        this.L2 = (min - this.J2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.V2;
        if (r3Var != null && (k30Var = this.L1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.gj.B1(this.f45985v2))) != null) {
            y10 y10Var = this.Z3;
            if (!y10Var.f40724b) {
                if (this.f45947n2) {
                    arrayList = this.f46000y2;
                } else {
                    arrayList = this.V2.f26212g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = k30Var.K(indexOf + this.K1.d)) != null) {
                    View view = K.f58535a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.W4 && !this.f45936k4) {
                            this.f29682b.invalidate();
                        }
                    }
                }
            } else {
                int i7 = 0;
                while (true) {
                    u10 u10Var = this.f45940l4;
                    if (i7 >= u10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) u10Var.getChildAt(i7);
                    if (org.telegram.messenger.gj.B1(k10Var.getParticipant().peer) == org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                        k10Var.setAmplitude(f10 * 15.0f);
                    }
                    i7++;
                }
            }
            y10Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    @Override
    public final boolean I() {
        return !this.Z3.f40724b;
    }

    public final void I1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f45918f5 = i7;
        this.f45922g5 = i10;
        this.f45926h5 = i11;
        this.f45930i5 = i12;
        this.f45933j5 = i13;
        this.f45937k5 = i14;
        this.f45941l5 = i15;
        this.f45946m5 = i16;
        this.f45950n5 = i17;
        this.f45954o5 = i18;
        this.f45959p5 = i19;
        this.f45964q5 = i20;
        this.f45969r5 = i21;
        this.s5 = i22;
        this.f45978t5 = i23;
        this.f45983u5 = i24;
    }

    public final void J1(float f10) {
        k30 k30Var;
        int L;
        int i7;
        float f11;
        this.f45975t2 = f10;
        this.L1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) k30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f29716t0 + L2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.f29716t0 + L2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        r30 r30Var = this.P2;
        y10 y10Var = this.Z3;
        s10 s10Var = this.f45897a3;
        q10 q10Var = this.Z2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L2) - this.f29716t0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((L - this.f29716t0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i7 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (r30Var != null) {
                r30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.T3) > 1.0E-4f) {
                G1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.y0.x(min, 0.1f, 1.2f, 1.0f);
            q10Var.setScaleX(Math.max(0.9f, x10));
            q10Var.setScaleY(Math.max(0.9f, x10));
            float f12 = 1.0f - (min * 1.2f);
            q10Var.setAlpha((1.0f - y10Var.f40726c) * Math.max(0.0f, f12));
            s10Var.setScaleX(Math.max(0.9f, x10));
            s10Var.setScaleY(Math.max(0.9f, x10));
            s10Var.setAlpha((1.0f - y10Var.f40726c) * Math.max(0.0f, f12));
        } else {
            q10Var.setScaleX(1.0f);
            q10Var.setScaleY(1.0f);
            q10Var.setAlpha(1.0f - y10Var.f40726c);
            s10Var.setScaleX(1.0f);
            s10Var.setScaleY(1.0f);
            s10Var.setAlpha(1.0f - y10Var.f40726c);
            if (this.T3 > 1.0E-4f) {
                G1(0.0f);
            }
            i7 = 0;
        }
        a1();
        float f13 = i7;
        this.f46001y3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f45912e3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (r30Var != null) {
            r30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        q20 q20Var = this.M1;
        if (q20Var != null) {
            q20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f29682b.invalidate();
        Y1();
    }

    @Override
    public final void L() {
        ArrayList arrayList = this.X3;
        ArrayList arrayList2 = this.Y3;
        y10 y10Var = this.Z3;
        if (y10Var != null) {
            if (this.f45958p4 != null) {
                this.L1.getViewTreeObserver().removeOnPreDrawListener(this.f45958p4);
                this.f45958p4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i7)).f();
                y10Var.removeView((View) arrayList2.get(i7));
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i7)).e();
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i7)).b(true);
            }
            arrayList.clear();
            if (y10Var.getParent() != null) {
                arrayList.clear();
                this.f29682b.removeView(y10Var);
            }
        }
        ai.o2 o2Var = this.f45957p3;
        if (o2Var.d) {
            o2Var.d = false;
            Thread thread = o2Var.f1425e;
            if (thread != null) {
                thread.interrupt();
                o2Var.f1425e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.L();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (C5 == this) {
            C5 = null;
        }
        D5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.s10.k(getContext());
        org.telegram.messenger.r3 r3Var = this.V2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.f26210e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            r3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final boolean L1(android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.L1(android.view.View):boolean");
    }

    public final void M1(View view) {
        if (this.f45923h2 == null) {
            org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(8, getContext(), null, true);
            this.f45923h2 = b30Var;
            b30Var.setAlpha(0.0f);
            this.f45923h2.setVisibility(4);
            this.f45923h2.setShowingDuration(3000L);
            this.f29682b.addView(this.f45923h2, c8.ja.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.U2)) {
                this.f45923h2.setText(org.telegram.messenger.hd.M0(2131743465, null));
            } else {
                this.f45923h2.setText(org.telegram.messenger.hd.M0(2131743347, null));
            }
            this.f45923h2.b();
        }
        this.f45923h2.setExtraTranslationY(-org.telegram.messenger.g0.f23603m);
        this.f45923h2.c(view);
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.messenger.r3 r3Var = this.V2;
        org.telegram.ui.Components.voip.r2 r2Var = this.f45984v1;
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f45965r1;
        org.telegram.ui.Components.voip.r2 r2Var3 = this.f45974t1;
        org.telegram.ui.Components.voip.r2 r2Var4 = this.f45960q1;
        org.telegram.ui.Components.voip.r2 r2Var5 = this.f45970s1;
        org.telegram.ui.Components.voip.r2 r2Var6 = this.f45979u1;
        org.telegram.ui.Components.voip.r2 r2Var7 = this.f45989w1;
        boolean z19 = true;
        l10 l10Var = this.f45955p1;
        boolean z20 = false;
        if (r3Var != null && !r3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.f45985v2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f45993w5;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.V2.f26208b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.V2.c()) || z13) && !u1()) {
                z16 = true;
            } else {
                z16 = false;
                z20 = true;
            }
            if (z13) {
                z18 = true;
                z17 = false;
            } else {
                z17 = !z14;
                z18 = false;
            }
            if (E5) {
                z17 = false;
                z18 = false;
            }
            l10Var.c(r2Var7, true, z10);
            l10Var.c(r2Var6, true, z10);
            l10Var.c(r2Var5, z16, z10);
            l10Var.c(r2Var4, z18, z10);
            l10Var.c(r2Var3, z20, z10);
            l10Var.c(r2Var2, z17, z10);
            l10Var.c(r2Var, z15, z10);
            return;
        }
        if (this.Q2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        l10Var.c(r2Var7, z11, z10);
        if (this.Q2 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        l10Var.c(r2Var6, z12, z10);
        if (this.Q2 <= 0.1f) {
            z19 = false;
        }
        l10Var.c(r2Var3, z19, z10);
        l10Var.c(r2Var5, false, z10);
        l10Var.c(r2Var4, false, z10);
        l10Var.c(r2Var2, false, z10);
        l10Var.c(r2Var, false, z10);
    }

    public final void O1() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        TLObject M0;
        org.telegram.messenger.r3 r3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.r3 r3Var2 = this.V2;
        org.telegram.ui.ActionBar.q0 q0Var = this.f45916f3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f45924h3;
        if (r3Var2 == null || r3Var2.j()) {
            this.f45920g3.setVisibility(4);
            q0Var2.setVisibility(8);
            if (this.V2 == null) {
                q0Var.setVisibility(8);
                return;
            }
        }
        if (this.f45919g2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f45951o1;
        int i15 = cVar.f22778a;
        int i16 = cVar.f22778a;
        TLRPC.Chat M02 = org.telegram.messenger.np.s1(i15).M0(Long.valueOf(l1()));
        if (M02 != null) {
            this.U2 = M02;
        }
        boolean y10 = org.telegram.messenger.t3.y(3, this.U2);
        org.telegram.ui.ActionBar.z0 z0Var = this.f45928i3;
        if (!y10 && (((org.telegram.messenger.t3.T(this.U2) && ((chat2 = this.U2) == null || !chat2.megagroup)) || (!org.telegram.messenger.t3.t0(this.U2) && !org.telegram.messenger.t3.y(3, this.U2))) && (!org.telegram.messenger.t3.T(this.U2) || (chat = this.U2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)))) {
            z0Var.setVisibility(8);
        } else {
            z0Var.setVisibility(0);
        }
        org.telegram.messenger.r3 r3Var3 = this.V2;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f45996x3;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f45991w3;
        if (r3Var3 != null && (groupCall2 = r3Var3.f26208b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            z0Var3.setVisibility(i13);
            if (this.V2.f26208b.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            z0Var2.setVisibility(i14);
        } else {
            z0Var3.setVisibility(8);
            z0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.gj.B1(this.f45985v2));
        org.telegram.messenger.r3 r3Var4 = this.V2;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f45939l3;
        if (r3Var4 != null && !r3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            z0Var4.setVisibility(0);
        } else {
            z0Var4.setVisibility(8);
        }
        if (org.telegram.messenger.gz.I0) {
            i7 = 2131232262;
        } else {
            i7 = 2131232261;
        }
        z0Var4.setIcon(i7);
        if (org.telegram.messenger.gz.I0) {
            i10 = 2131743280;
        } else {
            i10 = 2131743281;
        }
        z0Var4.setSubtext(org.telegram.messenger.hd.M0(i10, null));
        org.telegram.messenger.r3 r3Var5 = this.V2;
        if (r3Var5 != null && !r3Var5.j() && !u1() && DictationAsr.B()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f45944m3.setVisibility(i11);
        Q1(false);
        P1();
        boolean S0 = S0();
        org.telegram.ui.ActionBar.z0 z0Var5 = this.f45986v3;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.j3;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f45967r3;
        org.telegram.ui.ActionBar.z0 z0Var8 = this.f45972s3;
        if (S0) {
            z0Var5.setVisibility(0);
            z0Var6.setVisibility(0);
            if (u1()) {
                z0Var7.setVisibility(0);
                z0Var8.setVisibility(8);
            } else if (this.V2.j()) {
                z0Var7.setVisibility(8);
                z0Var8.setVisibility(8);
            } else {
                z0Var7.setVisibility(0);
            }
            if (r1()) {
                z0Var7.setVisibility(8);
                z0Var6.setVisibility(8);
            }
            if (this.V2.c() && !this.V2.j() && !u1()) {
                z0Var8.setVisibility(0);
            } else {
                z0Var8.setVisibility(8);
            }
            q0Var2.setVisibility(8);
            boolean z13 = this.V2.f26226w;
            x30 x30Var = this.Y2;
            x30Var.f53087f = z13;
            x30Var.d = 1.0f;
            x30Var.invalidateSelf();
            if (this.V2.f26226w) {
                if (this.C3 == null) {
                    s00 s00Var = new s00(this, 7);
                    this.C3 = s00Var;
                    org.telegram.messenger.g0.i3(s00Var, 1000L);
                }
                z0Var7.setText(org.telegram.messenger.hd.M0(2131743323, null));
            } else {
                s00 s00Var2 = this.C3;
                if (s00Var2 != null) {
                    org.telegram.messenger.g0.r(s00Var2);
                    this.C3 = null;
                }
                z0Var7.setText(org.telegram.messenger.hd.M0(2131743348, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z0Var8.j(org.telegram.messenger.hd.M0(2131743434, null), 2131232354, null);
            } else {
                z0Var8.j(org.telegram.messenger.hd.M0(2131743436, null), 2131232353, null);
            }
            S1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.V2.c() || z11) && !this.V2.j() && !u1())) {
                if (z11) {
                    q0Var2.setVisibility(8);
                    z0Var8.setVisibility(0);
                    z0Var8.j(org.telegram.messenger.hd.M0(2131743434, null), 2131232354, null);
                    z0Var8.setContentDescription(org.telegram.messenger.hd.M0(2131743434, null));
                } else {
                    z0Var8.j(org.telegram.messenger.hd.M0(2131743436, null), 2131232353, null);
                    z0Var8.setContentDescription(org.telegram.messenger.hd.M0(2131743436, null));
                    q0Var2.setVisibility(8);
                    z0Var8.setVisibility(0);
                }
            } else {
                q0Var2.setVisibility(8);
                z0Var8.setVisibility(8);
            }
            z0Var5.setVisibility(8);
            z0Var6.setVisibility(8);
            z0Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.z0 z0Var9 = this.f45962q3;
        if (S02 && this.V2.f26208b.can_change_join_muted && !r1()) {
            z0Var9.setVisibility(0);
        } else {
            z0Var9.setVisibility(8);
        }
        if (r1() && ((r3Var = this.V2) == null || (groupCall = r3Var.f26208b) == null || !groupCall.creator)) {
            z12 = false;
        } else {
            z12 = true;
        }
        q0Var.R(4, z12);
        if (u1() && !this.V2.j()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f45935k3.setVisibility(i12);
        int visibility = z0Var6.getVisibility();
        TextView textView = this.f46006z3;
        if (visibility != 0 && z0Var9.getVisibility() != 0 && z0Var.getVisibility() != 0 && z0Var8.getVisibility() != 0 && z0Var7.getVisibility() != 0 && z0Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f45915f2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.W2) && !u1() && this.f45985v2 != null) {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.gj.B1(this.f45985v2);
            if (org.telegram.messenger.m5.E(B1)) {
                M0 = org.telegram.messenger.np.s1(i16).a2(Long.valueOf(B1));
            } else {
                M0 = org.telegram.messenger.np.s1(i16).M0(Long.valueOf(-B1));
            }
            kVar.setObject(M0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.U2;
        if (chat3 != null && !org.telegram.messenger.t3.W(chat3) && u1() && z0Var.getVisibility() == 8) {
            q0Var.setVisibility(8);
        } else {
            q0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f45912e3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f46001y3.getLayoutParams()).rightMargin = 0;
        this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void P1() {
        boolean z10;
        long j3;
        String str;
        org.telegram.messenger.r3 r3Var;
        if (this.f45957p3 != null) {
            int i7 = 0;
            if (ai.o2.a() && (r3Var = this.V2) != null && !r3Var.j() && !u1() && C5 == this) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f45957p3.d) {
                final ai.o2 o2Var = this.f45957p3;
                Context context = getContext();
                int i10 = this.f45951o1.f22778a;
                TLRPC.Chat chat = this.U2;
                if (chat != null) {
                    j3 = -chat.f28051id;
                } else {
                    j3 = 0;
                }
                if (!o2Var.d) {
                    o2Var.d = true;
                    final android.support.v4.media.session.a0 P = DictationAsr.P(ai.t0.b(context, j3), false);
                    boolean v = DictationAsr.v();
                    o2Var.f1424c = v;
                    if (v) {
                        ExecutorService executorService = DictationLid.f42585a;
                        if (DictationAsr.v()) {
                            DictationLid.d(context);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("live captions: ");
                    sb2.append(P);
                    if (o2Var.f1424c) {
                        str = ", tinylid";
                    } else {
                        str = "";
                    }
                    r.b.t(sb2, str, "Dictation");
                    c40 c40Var = o2Var.f1422a.f47283a;
                    DictationAsr.V((ai.s) P.f1706b, new ai.t() {
                        @Override
                        public final void a(boolean z11) {
                            boolean z12;
                            o2 o2Var2 = o2.this;
                            android.support.v4.media.session.a0 a0Var = P;
                            if (!o2Var2.d) {
                                return;
                            }
                            g20 g20Var = o2Var2.f1422a;
                            if (z11) {
                                z12 = true;
                            } else {
                                z12 = true;
                            }
                            c40 c40Var2 = g20Var.f47283a;
                            if (z12) {
                                new cc(c40Var2.F, new fi.i0()).Q(2131624012, 36, "Live captions aren't available: the speech model couldn't be loaded.").k(c40Var2.q1());
                            }
                            if (!z11) {
                                o2Var2.d = false;
                                return;
                            }
                            NativeInstance.setIncomingAudioCapture(true);
                            Thread thread = new Thread(new a1.e(20, o2Var2, a0Var), "LiveCaptions");
                            o2Var2.f1425e = thread;
                            thread.start();
                        }
                    });
                }
            } else if (!z10 && this.f45957p3.d) {
                ai.o2 o2Var2 = this.f45957p3;
                if (o2Var2.d) {
                    o2Var2.d = false;
                    Thread thread = o2Var2.f1425e;
                    if (thread != null) {
                        thread.interrupt();
                        o2Var2.f1425e = null;
                    }
                    try {
                        NativeInstance.setIncomingAudioCapture(false);
                    } catch (Throwable unused) {
                    }
                }
                org.telegram.ui.Components.voip.t0 t0Var = this.f45953o3;
                t0Var.getClass();
                ArrayList arrayList = new ArrayList(t0Var.f40951a);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                    t0Var.f40951a.remove(s0Var);
                    t0Var.removeView(s0Var);
                }
            }
        }
    }

    public final void Q0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.Q0(boolean):void");
    }

    public final void Q1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.Q1(boolean):void");
    }

    public final int R0() {
        k30 k30Var = this.L1;
        int childCount = k30Var.getChildCount();
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i7 = Math.min(i7, childAt.getTop());
            }
        }
        return i7;
    }

    public final void R1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.R1(int, boolean):void");
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.r3 r3Var = this.V2;
            if (r3Var != null && (groupCall = r3Var.f26208b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, this.U2);
    }

    public final void S1() {
        if (this.V2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f45951o1.f22778a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.V2;
        int i7 = currentTime - r3Var.f26208b.record_start_date;
        boolean z10 = r3Var.f26226w;
        org.telegram.ui.ActionBar.z0 z0Var = this.f45967r3;
        if (z10) {
            z0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            z0Var.setSubtext(null);
        }
    }

    public final void T0() {
        if (this.Q3) {
            this.Q3 = false;
            org.telegram.messenger.g0.r(this.f45997x4);
        }
        if (this.R3) {
            this.R3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f45989w1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1(boolean z10) {
        float interpolation;
        float f10;
        q20 q20Var = this.M1;
        if ((q20Var == null || this.V2 != null) && this.S2 == null) {
            this.R2 = 1.0f;
            this.Q2 = 1.0f;
            if (q20Var == null) {
                return;
            }
        }
        int i7 = 4;
        if (!z10) {
            p10 p10Var = this.f45987v4;
            org.telegram.messenger.g0.r(p10Var);
            p10Var.run();
            org.telegram.messenger.r3 r3Var = this.V2;
            k30 k30Var = this.L1;
            if (r3Var != null && !r3Var.j()) {
                k30Var.setVisibility(0);
            } else {
                k30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.t3.W(this.U2);
            org.telegram.ui.ActionBar.z0 z0Var = this.f45986v3;
            if (W) {
                z0Var.setText(org.telegram.messenger.hd.M0(2131743488, null));
            } else {
                z0Var.setText(org.telegram.messenger.hd.M0(2131743395, null));
            }
        }
        float f11 = this.Q2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.er.f34420f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.R2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34420f;
            this.R2 = erVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * erVar.getInterpolation(this.Q2 / 0.6f);
            f10 = this.Q2 / 0.6f;
        }
        N1(true);
        float f12 = 1.0f - f10;
        q20Var.setAlpha(f12);
        this.P1.setAlpha(f10);
        this.R1.setAlpha(f10);
        j30 j30Var = this.Q1;
        j30Var.setAlpha(f10);
        j30Var.setScaleX(interpolation);
        j30Var.setScaleY(interpolation);
        o20 o20Var = this.O1;
        o20Var.setScaleX(f12);
        o20Var.setScaleY(f12);
        o20Var.setAlpha(f12);
        this.N1.setAlpha(f12);
        this.f45916f3.setAlpha(f10);
        if (f12 != 0.0f) {
            i7 = 0;
        }
        if (i7 != q20Var.getVisibility()) {
            q20Var.setVisibility(i7);
            o20Var.setVisibility(i7);
        }
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.U0():void");
    }

    public final void U1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        org.telegram.ui.Components.voip.r2 r2Var = this.f45974t1;
        if (r2Var != null && r2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            l10 l10Var = this.f45955p1;
            boolean z14 = false;
            if (sharedInstance != null && !u1()) {
                mh.a aVar = (mh.a) l10Var.f20642c.get(r2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    r2Var.setEnabled(true);
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
                    r2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743503, null), false, z10);
                } else if (z13) {
                    r2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.hd.M0(2131743239, null), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    r2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743501, null), false, z10);
                } else {
                    r2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743239, null), false, z10);
                }
                r2Var.b(z13, z10);
                k1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i7 = 2131231089;
                } else {
                    i7 = 2131231171;
                }
                if (this.V1 != i7) {
                    this.V1 = i7;
                    org.telegram.messenger.g0.Q3(this.W1, i7);
                }
                org.telegram.ui.Components.voip.r2 r2Var2 = this.f45965r1;
                if (r2Var2.getVisibility() == 0) {
                    r2Var2.c(0, -1, 0, 1.0f, true, i1(k1()), false, z10);
                    if (k1() != 1) {
                        z14 = true;
                    }
                    r2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            r2Var.c(2131232436, -1, 0, 0.3f, true, org.telegram.messenger.hd.M0(2131743437, null), false, z10);
            if (!org.telegram.messenger.t3.t0(this.U2) && (!org.telegram.messenger.t3.N(this.U2) || !org.telegram.messenger.t3.w(3, this.U2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            mh.a aVar2 = (mh.a) l10Var.f20642c.get(r2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                r2Var.setEnabled(z11);
            }
            r2Var.b(true, false);
        }
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    public final void V0() {
        this.A1.setTranslationY((-this.B3.d()) + this.f29682b.getPaddingBottom());
        this.B1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.f45955p1.setAlpha(1.0f - this.f46003y5.f57081e);
        W0();
        X0();
    }

    public final void V1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.V1(boolean, boolean):void");
    }

    public final void W0() {
        int i7;
        float f10 = this.B3.f56030b.f57107a;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        l20 l20Var = this.A1;
        l20Var.setAlpha(f10);
        j20 j20Var = this.B1;
        j20Var.setAlpha(f10);
        if (l20Var.getVisibility() != i7) {
            l20Var.setVisibility(i7);
            j20Var.setVisibility(i7);
            if (i7 == 8) {
                h20 h20Var = this.C1;
                if (h20Var.isFocused()) {
                    h20Var.clearFocus();
                }
            }
        }
    }

    public final void W1() {
        boolean z10;
        String str;
        float f10;
        float f11;
        a40 a40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        a30 a30Var = this.J1;
        if (a30Var != null && this.V2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i7 = 0;
            for (int i10 = 0; i10 < this.V2.P.m(); i10++) {
                long j3 = this.V2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.P.f(j3);
                if (!groupCallParticipant.self) {
                    y10 y10Var = this.Z3;
                    y10Var.getClass();
                    if (y10Var.f40753x.get(org.telegram.messenger.gj.B1(groupCallParticipant.peer)) <= 0 && this.A4.get(j3, 0) != 1) {
                        long B1 = org.telegram.messenger.gj.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i7 < 2) {
                            int i11 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(B1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(B1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i7 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.q10.j(user, true), new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), 0);
                                }
                            }
                        }
                        i7++;
                        if (i7 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i7 > 0) {
                String K0 = org.telegram.messenger.hd.K0(i7, "MembersAreSpeakingToast");
                int indexOf = K0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                a30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = a30Var.getSubtitleTextView();
            if (u1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.V2.f26208b.participants_count;
            w30 w30Var = this.K1;
            subtitleTextView.k(org.telegram.messenger.hd.G(i12 + ((w30Var.N.u1() || w30Var.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (u1() && (a40Var = this.A3) != null) {
                a40Var.setWatchersCount(this.V2.f26208b.participants_count);
            }
            if (z10 != this.f45977t4) {
                this.f45977t4 = z10;
                a30Var.invalidate();
                float f12 = 0.0f;
                a30Var.getSubtitleTextView().setPivotX(0.0f);
                a30Var.getSubtitleTextView().setPivotY(a30Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = a30Var.getSubtitleTextView().animate();
                if (this.f45977t4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f45977t4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f45977t4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.W3(a30Var.getAdditionalSubtitleTextView(), this.f45977t4);
            }
        }
    }

    public final void X0() {
        int i7;
        org.telegram.ui.Components.mi0 mi0Var = this.F1;
        if (mi0Var != null) {
            float f10 = this.B3.f56030b.f57107a * this.f46008z5.f57081e;
            mi0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (this.F1.getVisibility() != i7) {
                this.F1.setVisibility(i7);
                if (i7 == 8) {
                    this.F1.n();
                }
            }
            org.telegram.ui.Components.mi0 mi0Var2 = this.F1;
            if (!mi0Var2.O0 && f10 == 1.0f) {
                mi0Var2.O0 = true;
            }
        }
    }

    public final void X1(boolean z10) {
        org.telegram.messenger.r3 r3Var = this.V2;
        q10 q10Var = this.Z2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.U2)) {
                q10Var.b(org.telegram.messenger.hd.M0(2131743462, null), z10);
                return;
            } else {
                q10Var.b(org.telegram.messenger.hd.M0(2131743341, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.f26208b.title);
        a30 a30Var = this.J1;
        if (!isEmpty) {
            if (!this.V2.f26208b.title.equals(a30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.V2.f26208b.title, true, 180L, null);
                    a30Var.getTitleTextView().setOnClickListener(new q00(this, 8));
                } else {
                    a30Var.setTitle(this.V2.f26208b.title);
                }
                q10Var.b(this.V2.f26208b.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.U2;
            if (chat != null && !chat.title.equals(a30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.U2.title, true, 180L, null);
                    a30Var.getTitleTextView().setOnClickListener(new q00(this, 9));
                } else {
                    a30Var.setTitle(this.U2.title);
                }
                if (org.telegram.messenger.t3.W(this.U2)) {
                    if (u1()) {
                        q10Var.b(this.U2.title, z10);
                    } else {
                        q10Var.b(org.telegram.messenger.hd.M0(2131743447, null), z10);
                    }
                } else {
                    q10Var.b(org.telegram.messenger.hd.M0(2131743306, null), z10);
                }
            } else if (this.U2 == null) {
                a30Var.setTitle(org.telegram.messenger.hd.M0(2131751823, null));
                q10Var.b(org.telegram.messenger.hd.M0(2131751823, null), z10);
            }
        }
        org.telegram.ui.ActionBar.j5 titleTextView = a30Var.getTitleTextView();
        if (this.V2.f26226w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new y30(titleTextView));
                TextView textView = q10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y30(textView), (Drawable) null);
                TextView nextTextView = q10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new y30(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            q10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            q10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void Y0() {
        boolean z10 = F5;
        l10 l10Var = this.f45955p1;
        if (z10) {
            l10Var.setTranslationX(0.0f);
            l10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.f46003y5;
        if (z11) {
            l10Var.setTranslationX(aVar.f57081e * org.telegram.messenger.g0.L(94.0f));
            l10Var.setTranslationY(0.0f);
            return;
        }
        l10Var.setTranslationX(0.0f);
        l10Var.setTranslationY(aVar.f57081e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void Y1() {
        float f10;
        org.telegram.ui.Components.cb cbVar;
        boolean z10;
        if (this.F != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f45975t2 - L;
            if (this.f29716t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int L2 = (L - this.f29716t0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f29716t0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f29682b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            a30 a30Var = this.J1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), a30Var.getY() + (-this.F.getTop()) + a30Var.getHeight(), f10));
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41635w;
            if (xbVar != null && (cbVar = xbVar.f41639e) != null && cbVar.getParent() != null && cbVar.getParent().getParent() == this.F) {
                if (f10 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cbVar.setTop(z10);
            }
        }
    }

    public final void Z0() {
        boolean z10 = F5;
        u10 u10Var = this.f45940l4;
        if (z10) {
            u10Var.setTranslationX(0.0f);
            u10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.f46003y5;
        if (z11) {
            u10Var.setTranslationX(aVar.f57081e * org.telegram.messenger.g0.L(94.0f));
            u10Var.setTranslationY(0.0f);
            return;
        }
        u10Var.setTranslationX(0.0f);
        u10Var.setTranslationY(aVar.f57081e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void a1() {
        float L;
        int i7;
        float f10 = this.A5.f57087f;
        rh.h hVar = this.B3;
        float f11 = -((hVar.d() - this.f29682b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f46008z5.f57081e) + org.telegram.messenger.g0.L(10.0f));
        if (F5) {
            L = (1.0f - this.B5.f57081e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (E5) {
            L = 0.0f;
        } else {
            L = ((this.f46003y5.f57081e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.Z3.f40726c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f56030b.f57107a);
        float measuredHeight = ((this.f29682b.getMeasuredHeight() - this.f45975t2) + T1) - this.f29716t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        org.telegram.ui.Components.voip.t0 t0Var = this.f45953o3;
        if (t0Var != null) {
            i7 = t0Var.getContentHeight();
        } else {
            i7 = 0;
        }
        if (t0Var != null) {
            t0Var.setTranslationY(T1);
        }
        float f12 = i7;
        nh.h hVar2 = this.X1;
        hVar2.setTranslationY(T1 - f12);
        hVar2.setVisibleHeight((int) Math.max(0.0f, max - f12));
    }

    public final void b1() {
        if (this.F1 != null) {
            this.F1.setTranslationY((-this.B3.d()) + this.f29682b.getPaddingBottom() + ((-this.f46008z5.f57081e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        boolean z10;
        float f10 = this.f46008z5.f57081e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.E1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z11 = false;
        if (f10 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.D1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.z zVar = this.Y4;
        if (zVar != null) {
            zVar.f41078a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.z zVar2 = this.Y4;
            zVar2.h = false;
            zVar2.j(false);
            this.Y4.invalidate();
            this.Z3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.W4;
        if (f4Var != null && !this.f45899a5 && f4Var.getParent() != null) {
            this.f29682b.removeView(this.W4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.W4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.W4.setAboutVisible(false);
            this.W4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.k10 k10Var = this.Z4;
        if (k10Var != null) {
            k10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.W4 = null;
        this.X4 = null;
        this.Z4 = null;
        this.Y4 = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i11;
        int i12;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i13;
        int i14;
        String M0;
        boolean z10;
        org.telegram.messenger.s3 s3Var;
        boolean z11;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = org.telegram.messenger.ns.f25595w2;
        k30 k30Var = this.L1;
        String[] strArr = null;
        int i18 = 0;
        if (i7 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.V2;
            if (r3Var != null && r3Var.f26208b.f28061id == l10.longValue()) {
                org.telegram.messenger.r3 r3Var2 = this.V2;
                if (r3Var2.f26208b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f45952o2 > 0L ? 1 : (this.f45952o2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f45951o1;
                if (i19 == 0 && (((i16 = this.E3) == 7 || i16 == 5 || i16 == 6) && !r3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.d2, VoIPService.class);
                        intent.putExtra("chat_id", l1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.W2);
                        intent.putExtra("peerChannelId", this.T2.channel_id);
                        intent.putExtra("peerChatId", this.T2.chat_id);
                        intent.putExtra("peerUserId", this.T2.user_id);
                        intent.putExtra("hash", this.X2);
                        intent.putExtra("peerAccessHash", this.T2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f22778a);
                        intent.putExtra("scheduleDate", this.f45932j4);
                        this.d2.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f45952o2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new s00(this, 3), 3000L);
                }
                if (!this.f45956p2 && VoIPService.getSharedInstance() != null) {
                    this.V2.b(false);
                    o1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                O1();
                int childCount = k30Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = k30Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) childAt).a(true, false);
                    }
                }
                if (this.W4 != null) {
                    this.f45947n2 = true;
                } else {
                    Q0(true);
                }
                W1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.E3 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                V1(true, booleanValue);
                X1(true);
                if (z11 && ((i15 = this.E3) == 1 || i15 == 0)) {
                    n1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !u1()) {
                        if (!r1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = org.telegram.messenger.np.s1(cVar.f22778a).f25440y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f28055id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.np.s1(cVar.f22778a).a2(l11);
                                if (a22 != null) {
                                    if (this.V2.f26208b.participants_count < 250 || org.telegram.messenger.q10.w(a22) || a22.verified || i18 != 0) {
                                        n1().k(0L, 44, a22, this.U2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat M02 = org.telegram.messenger.np.s1(cVar.f22778a).M0(Long.valueOf(-longValue));
                            if (M02 != null) {
                                if (this.V2.f26208b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i18 != 0) {
                                    n1().k(0L, 44, M02, this.U2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25609y2) {
            y10 y10Var = this.Z3;
            if (y10Var.f40724b && this.V2 != null) {
                boolean c10 = y10Var.c();
                org.telegram.messenger.r3 r3Var3 = this.V2;
                if (r3Var3 != null && y10Var.f40724b && (s3Var = y10Var.f40729e) != null && r3Var3.d.f(org.telegram.messenger.gj.B1(s3Var.f26393a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f45938l2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i22);
                        if (this.V2.P.g(null, org.telegram.messenger.gj.B1(s3Var3.f26393a.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.f26393a;
                            if (!groupCallParticipant3.muted_by_you && y10Var.d != org.telegram.messenger.gj.B1(groupCallParticipant3.peer)) {
                                s3Var2 = s3Var3;
                            }
                        }
                        i22++;
                    }
                    if (s3Var2 != null) {
                        h1(s3Var2);
                    }
                }
            }
            y10Var.setVisibleParticipant(true);
            W1();
        } else if (i7 == org.telegram.messenger.ns.N4) {
            H1(((Float) objArr[0]).floatValue());
        } else if (i7 == org.telegram.messenger.ns.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.t3.W(this.U2)) {
                        M0 = org.telegram.messenger.hd.M0(2131743452, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131743319, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.hd.M0(2131751105, null) + "\n" + str;
                } else if (org.telegram.messenger.t3.W(this.U2)) {
                    M0 = org.telegram.messenger.hd.M0(2131743478, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131743370, null);
                }
                AlertDialog$Builder K = org.telegram.ui.Components.t4.K(getContext(), org.telegram.messenger.hd.M0(2131743306, null), M0);
                K.j(new y00(this, 1));
                try {
                    K.p();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28052id == l1()) {
                O1();
                V1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.gj.B1(this.f45985v2);
            org.telegram.messenger.r3 r3Var4 = this.V2;
            if (r3Var4 != null && chatFull.f28052id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                Q0(true);
                org.telegram.messenger.g0.a4(k30Var);
                if (this.D4 != null) {
                    while (i18 < this.D4.getChildCount()) {
                        View childAt2 = this.D4.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.z0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = 2131743506;
                            } else {
                                i13 = 2131743416;
                            }
                            String M03 = org.telegram.messenger.hd.M0(i13, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131232044;
                            } else {
                                i14 = 2131232186;
                            }
                            z0Var.j(M03, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25581u1) {
            if (((Long) objArr[0]).longValue() == l1()) {
                O1();
                V1(isShowing(), false);
            }
        } else if (i7 == org.telegram.messenger.ns.B2) {
            int childCount2 = k30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                v4.e1 G = k30Var.G(k30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f58535a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                        if (f4Var.getParticipant() != null) {
                            f4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i7 == org.telegram.messenger.ns.E0) {
            Long l12 = (Long) objArr[0];
            long B12 = org.telegram.messenger.gj.B1(this.f45985v2);
            if (this.V2 != null && B12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                Q0(true);
                org.telegram.messenger.g0.a4(k30Var);
                if (this.D4 != null) {
                    while (i18 < this.D4.getChildCount()) {
                        View childAt3 = this.D4.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.z0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = 2131743507;
                            } else {
                                i11 = 2131743417;
                            }
                            String M04 = org.telegram.messenger.hd.M0(i11, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131232044;
                            } else {
                                i12 = 2131232186;
                            }
                            z0Var2.j(M04, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25516j0) {
            Q0(true);
            org.telegram.messenger.g0.a4(k30Var);
        } else if (i7 == org.telegram.messenger.ns.f25559r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.np.D8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                Q0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.a4(k30Var);
            }
        } else if (i7 == org.telegram.messenger.ns.f25616z2) {
            t20 t20Var = this.f45980u2;
            if (t20Var != null) {
                t20Var.b(true, true);
            }
            O1();
        } else if (i7 == org.telegram.messenger.ns.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f45934k2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.d2;
        launchActivity.f42623a1.remove(this.f45982u4);
        this.d2.setRequestedOrientation(-1);
        D5 = false;
        org.telegram.ui.Components.k20 k20Var = this.D3;
        if (k20Var != null) {
            k20Var.dismiss();
        }
        this.f45947n2 = true;
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f45951o1;
        int i7 = cVar.f22778a;
        int i10 = cVar.f22778a;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.M0);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25595w2);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25581u1);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.B2);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.E0);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25516j0);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25616z2);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25609y2);
        org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.R3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.N4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        if (this.d2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.d2.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView n1 = n1();
                if (z10) {
                    i7 = 42;
                } else {
                    i7 = 43;
                }
                n1.j(i7, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z10) {
        if (!this.f45903b5 && this.f45913e4) {
            if (z10) {
                this.f45903b5 = true;
                D1(false, this.W4);
                return;
            }
            d1();
            this.f29682b.removeView(this.f45909d4);
            this.f45909d4 = null;
            this.B4.setVisibility(8);
            this.f29682b.invalidate();
            this.f45913e4 = false;
            this.T1.X = true;
            this.L1.invalidate();
            this.f45898a4.setVisibility(8);
            if (this.f45947n2) {
                this.f45947n2 = false;
                Q0(true);
            }
            U0();
        }
    }

    public final org.telegram.ui.Components.voip.r g1() {
        int i7 = 0;
        while (true) {
            k30 k30Var = this.L1;
            if (i7 < k30Var.getChildCount()) {
                View childAt = k30Var.getChildAt(i7);
                if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.r) && RecyclerView.R(childAt) >= 0) {
                    return (org.telegram.ui.Components.voip.r) childAt;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void h1(org.telegram.messenger.s3 s3Var) {
        org.telegram.messenger.s3 s3Var2;
        if (s3Var == null) {
            this.d2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            y10 y10Var = this.Z3;
            if (y10Var.f40744r != null) {
                return;
            }
            boolean z10 = F5;
            k30 k30Var = this.L1;
            int i7 = 0;
            if (z10) {
                if (this.f45958p4 != null) {
                    k30Var.getViewTreeObserver().removeOnPreDrawListener(this.f45958p4);
                    this.f45958p4 = null;
                }
                ArrayList arrayList = new ArrayList();
                f40 f40Var = this.f45949n4;
                ArrayList arrayList2 = this.X3;
                ArrayList arrayList3 = this.Y3;
                if (s3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.r rVar = zVar.f41082c;
                        if (rVar != null) {
                            rVar.setRenderer(null);
                            org.telegram.ui.Components.k10 k10Var = zVar.d;
                            if (k10Var != null) {
                                k10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar2 = zVar.f41085e;
                            if (rVar2 != null) {
                                rVar2.setRenderer(null);
                            }
                            arrayList.add(zVar.f41109x);
                            zVar.b(false);
                            zVar.animate().alpha(0.0f).setListener(new u20(this, zVar, 0));
                        }
                    }
                    this.O4 = false;
                    f40Var.H(this.f45945m4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) arrayList3.get(i11);
                        if (zVar2.f41085e != null && ((s3Var2 = zVar2.f41109x) == null || !s3Var2.equals(s3Var))) {
                            arrayList.add(zVar2.f41109x);
                            zVar2.b(false);
                            org.telegram.ui.Components.k10 k10Var2 = zVar2.d;
                            if (k10Var2 != null) {
                                k10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar3 = zVar2.f41082c;
                            if (rVar3 != null) {
                                rVar3.setRenderer(null);
                            }
                            zVar2.animate().alpha(0.0f).setListener(new u20(this, zVar2, 1));
                        }
                    }
                    this.O4 = true;
                    f40Var.f46996r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(24, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = k30Var.getViewTreeObserver();
                lh lhVar = new lh(this, s3Var, !y10Var.f40724b);
                this.f45958p4 = lhVar;
                viewTreeObserver.addOnPreDrawListener(lhVar);
                return;
            }
            if (this.f45958p4 != null) {
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this.f45958p4);
                this.f45958p4 = null;
            }
            if (s3Var != null) {
                u10 u10Var = this.f45940l4;
                if (u10Var.getVisibility() != 0) {
                    u10Var.setVisibility(0);
                    org.telegram.ui.Components.l10 l10Var = this.o4;
                    l10Var.G(u10Var, false);
                    this.f45947n2 = true;
                    if (!y10Var.f40724b) {
                        ArrayList arrayList4 = l10Var.f36695e;
                        v4.b0 b0Var = (v4.b0) u10Var.getLayoutManager();
                        if (b0Var != null) {
                            while (true) {
                                if (i7 >= arrayList4.size()) {
                                    break;
                                } else if (((org.telegram.messenger.s3) arrayList4.get(i7)).equals(s3Var)) {
                                    b0Var.h1(i7, org.telegram.messenger.g0.L(13.0f));
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = k30Var.getViewTreeObserver();
                    mw mwVar = new mw(1, this, s3Var);
                    this.f45958p4 = mwVar;
                    viewTreeObserver2.addOnPreDrawListener(mwVar);
                    return;
                }
                y10Var.j(s3Var);
                org.telegram.messenger.g0.a4(u10Var);
            } else if (k30Var.getVisibility() != 0) {
                k30Var.setVisibility(0);
                Q0(false);
                this.f45947n2 = true;
                ViewTreeObserver viewTreeObserver3 = k30Var.getViewTreeObserver();
                w20 w20Var = new w20(this, 0);
                this.f45958p4 = w20Var;
                viewTreeObserver3.addOnPreDrawListener(w20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = k30Var.getViewTreeObserver();
                w20 w20Var2 = new w20(this, 1);
                this.f45958p4 = w20Var2;
                viewTreeObserver4.addOnPreDrawListener(w20Var2);
            }
        }
    }

    public final int k1() {
        Integer num = this.f45998x5;
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

    public final long l1() {
        TLRPC.Chat chat = this.U2;
        if (chat == null) {
            return 0L;
        }
        return chat.f28051id;
    }

    @Override
    public final boolean m0() {
        D5 = true;
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.F2, new Object[0]);
        org.telegram.ui.Components.s10.k(getContext());
        return false;
    }

    public final void m1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f45951o1;
        int i7 = cVar.f22778a;
        int i10 = cVar.f22778a;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(l1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i10).N0(l1());
            String K = org.telegram.messenger.t3.K(this.U2, false);
            if (!TextUtils.isEmpty(K)) {
                str = org.telegram.ui.Cells.y0.m(org.telegram.messenger.np.s1(i10).V2, "/", K, new StringBuilder());
            } else if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.np.l1(this.U2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new di.l8(this, N0, z10, 6));
                return;
            }
            z1(null, str, true, z10);
        } else if (this.V2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.r3 r3Var = this.V2;
                exportgroupcallinvite.call = r3Var.g(r3Var.f26207a);
                if (i11 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.ad(this, i11, z10, 2));
            }
        }
    }

    public final UndoView n1() {
        if (!F5) {
            y10 y10Var = this.Z3;
            if (y10Var.f40724b) {
                return y10Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f45911e2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f29682b.removeView(undoViewArr[0]);
            this.f29682b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void o1() {
        VoIPService sharedInstance;
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f45956p2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f45956p2 = true;
            this.f46000y2.addAll(this.V2.f26212g);
            this.f46005z2.addAll(this.f45938l2);
            this.A2.addAll(this.V2.f26214j);
            this.B2.addAll(this.V2.f26217m);
            this.C2.addAll(this.V2.f26216l);
            this.S3 = sharedInstance.getCallState();
            if (this.V2 == null) {
                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                this.V2 = r3Var;
                this.o4.f36694c = r3Var;
                this.Z3.setGroupCall(r3Var);
                this.f45949n4.f46992c = this.V2;
            }
            nh.h hVar = this.X1;
            if (hVar != null) {
                hVar.D0(this.f45951o1.f22778a, this.V2.g(false));
            }
            this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.V2.f26210e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            j30 j30Var = this.Q1;
            if (j30Var != null && j30Var.getVisibility() == 0) {
                this.f45979u1.c(2131230918, -1, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29176uh, false), 0.3f, false, org.telegram.messenger.hd.M0(2131743364, null), false, true);
                U1(true);
                if (org.telegram.messenger.t3.W(this.U2)) {
                    i7 = 2131743481;
                } else {
                    i7 = 2131743380;
                }
                this.f45986v3.setText(org.telegram.messenger.hd.M0(i7, null));
                k30 k30Var = this.L1;
                k30Var.setVisibility(0);
                org.telegram.ui.ActionBar.q0 q0Var = this.f45920g3;
                q0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(j30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(j30Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var = this.P1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j5Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var2 = this.R1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(j5Var2, property2, 0.0f), ObjectAnimator.ofFloat(j5Var2, property3, 0.0f), ObjectAnimator.ofFloat(j5Var2, property, 0.0f), ObjectAnimator.ofFloat(q0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.er.f34421g);
                animatorSet.addListener(new x20(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        U1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            H1(0.0f);
        }
        k30 k30Var = this.L1;
        if (k30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.a4(k30Var);
        }
        u10 u10Var = this.f45940l4;
        if (u10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.a4(u10Var);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        t20 t20Var = this.f45980u2;
        if (t20Var != null) {
            t20Var.b(false, false);
        } else if (this.f45913e4) {
            f1(true);
        } else if (this.Z3.f40724b) {
            h1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
        }
        t20 t20Var = this.f45980u2;
        if (t20Var != null && VoIPService.getSharedInstance() != null) {
            t20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.d2;
        launchActivity.f42623a1.add(this.f45982u4);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        this.S3 = i7;
        V1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p1(final long j3, final boolean z10) {
        if (this.V2 != null) {
            org.telegram.messenger.c cVar = this.f45951o1;
            final TLRPC.User a22 = org.telegram.messenger.np.s1(cVar.f22778a).a2(Long.valueOf(j3));
            if (a22 != null) {
                final org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.V2;
                invitetogroupcall.call = r3Var.g(r3Var.f26207a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.f28200id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f22778a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        c40 c40Var = c40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.np.s1(c40Var.f45951o1.f22778a).O3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.h3(new di.f2(c40Var, j10, t1VarArr2, a22, 20));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new di.l(c40Var, t1VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Components.u11(this, t1VarArr, sendRequest, 3), 500L);
                }
            }
        }
    }

    public final boolean q1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f45975t2 - L;
        if (this.f29716t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f29716t0) / ((L - this.f29716t0) - org.telegram.messenger.g0.L(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.Z1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fh, false));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f45916f3;
            if (q0Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.Yg;
                q0Var.P(org.telegram.ui.ActionBar.j6.x0(null, i7, false), false);
                q0Var.P(org.telegram.ui.ActionBar.j6.x0(null, i7, false), true);
                q0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Vg, false));
            }
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yg, false);
            K1(this.f45991w3, x02);
            K1(this.f45996x3, x02);
            K1(this.f45935k3, x02);
            K1(this.f45939l3, x02);
            K1(this.f45944m3, x02);
            K1(this.f45986v3, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29023mh, false));
            K1(this.f45928i3, x02);
            K1(this.j3, x02);
            K1(this.f45962q3, x02);
            K1(this.f45967r3, x02);
            K1(this.f45972s3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        wi.n nVar;
        super.show();
        org.telegram.ui.Components.voip.k1 k1Var = org.telegram.ui.Components.voip.k1.f40710w;
        if (k1Var != null && (nVar = k1Var.f40711a) != null && nVar.e()) {
            org.telegram.ui.Components.voip.k1 k1Var2 = org.telegram.ui.Components.voip.k1.f40710w;
            if (k1Var2.f40711a != null) {
                org.telegram.ui.Components.voip.u0 u0Var = k1Var2.f40714e;
                k1Var2.f40714e = null;
                k1Var2.f40712b.f40634a = null;
                k1Var2.f40711a.a(new org.telegram.ui.Components.gh(12, k1Var2, u0Var));
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(17));
            }
        }
        P1();
    }

    public final boolean t1() {
        if (!u1() || this.V2.f26211f.isEmpty() || (((org.telegram.messenger.s3) this.V2.f26211f.get(0)).f26395c != 0.0f && ((org.telegram.messenger.s3) this.V2.f26211f.get(0)).f26395c < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean u1() {
        org.telegram.messenger.r3 r3Var = this.V2;
        if (r3Var != null && r3Var.f26208b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void v1(org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f45966r2) {
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d2.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
            if (e2Var instanceof an) {
                boolean sa2 = ((an) e2Var).sa();
                this.f45966r2 = true;
                this.f45971s2 = true;
                wn wnVar = new wn(u2Var, editTextBoldCursor, z10, t1Var, 7);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(wnVar, j3);
                return;
            }
            this.f45966r2 = true;
            this.f45971s2 = true;
            if (u2Var != null) {
                u2Var.A0(true);
            } else if (t1Var != null) {
                t1Var.l(true);
            }
            if (z10) {
                org.telegram.messenger.g0.i3(new og(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void x1() {
        H5 = true;
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(false);
        }
        i30 i30Var = this.G1;
        org.telegram.ui.Components.z61 z61Var = i30Var.f39423w;
        if (z61Var != null) {
            z61Var.c(false);
        }
        i30Var.G = true;
        this.C1.r();
    }

    public final void y1() {
        H5 = false;
        this.K1.f();
        u10 u10Var = this.f45940l4;
        if (u10Var.getVisibility() == 0) {
            this.o4.G(u10Var, false);
        }
        if (F5) {
            this.f45949n4.I(this.f45945m4, false);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
        }
        i30 i30Var = this.G1;
        org.telegram.ui.Components.z61 z61Var = i30Var.f39423w;
        if (z61Var != null) {
            z61Var.c(true);
        }
        i30Var.G = false;
        this.C1.s();
    }

    public final void z1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c40.z1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
